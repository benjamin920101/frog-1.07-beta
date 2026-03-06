#!/usr/bin/env bash
# rename_from_super_v5.sh
# Smart replacement: updates class references but preserves package names
# Usage:
#   bash ./rename_from_super_v5.sh [--dir dev] [--use-git] [--dry-run]

set -euo pipefail

TARGET_DIR="dev"
USE_GIT=false
DRY_RUN=false

while [ $# -gt 0 ]; do
  case "$1" in
    --dir) TARGET_DIR="$2"; shift 2;;
    --use-git) USE_GIT=true; shift;;
    --dry-run) DRY_RUN=true; shift;;
    *) echo "Unknown option: $1" >&2; exit 2;;
  esac
done

if ! command -v perl >/dev/null 2>&1; then
  echo "perl is required. Install perl and retry." >&2
  exit 1
fi

if [ ! -d "$TARGET_DIR" ]; then
  echo "Target directory '$TARGET_DIR' not found." >&2
  exit 1
fi

if $USE_GIT && ! command -v git >/dev/null 2>&1; then
  echo "--use-git specified but git not found. Install git or omit --use-git." >&2
  exit 1
fi

echo "Scanning for .java files with super(\"NAME\") pattern..."
echo

# 用於記錄操作計劃
TMP_PLAN="$(mktemp)"
trap 'rm -f "$TMP_PLAN"' EXIT

TOTAL_FILES=0
RENAME_COUNT=0

# 找到所有 .java 文件並逐個處理
while IFS= read -r -d '' filepath; do
  TOTAL_FILES=$((TOTAL_FILES + 1))
  
  filename="$(basename "$filepath")"
  class="${filename%.java}"
  dirpath="$(dirname "$filepath")"
  
  # 提取該文件中的 super("...") 名稱
  newname="$(perl -0777 -ne '
    # 移除註解
    s{//.*$}{}mg;
    s{/\*.*?\*/}{}sg;
    
    # 匹配 super("string")
    if (/super\s*\(\s*"([^"]+)"/s) { 
      print $1; 
      exit; 
    }
  ' "$filepath" || true)"
  
  # 如果找到新名稱且與當前類名不同
  if [ -n "$newname" ] && [ "$newname" != "$class" ]; then
    newpath="$dirpath/$newname.java"
    
    # 檢查目標文件是否已存在
    if [ -e "$newpath" ] && [ "$filepath" != "$newpath" ]; then
      echo "⚠️  SKIP: $filepath"
      echo "    -> $newpath (target already exists)"
      echo
      continue
    fi
    
    # 記錄到計劃中：filepath|oldname|newname
    printf '%s|%s|%s\n' "$filepath" "$class" "$newname" >> "$TMP_PLAN"
    RENAME_COUNT=$((RENAME_COUNT + 1))
    
    echo "✓ $filepath"
    echo "  Class: $class -> $newname"
    echo
  fi
done < <(find "$TARGET_DIR" -type f -name '*.java' -print0)

echo "────────────────────────────────────"
echo "Scanned: $TOTAL_FILES files"
echo "To rename: $RENAME_COUNT files"
echo "────────────────────────────────────"

if [ $RENAME_COUNT -eq 0 ]; then
  echo "No files need renaming."
  exit 0
fi

if $DRY_RUN; then
  echo
  echo "DRY-RUN MODE - No changes will be made"
  echo
  echo "The following operations would be performed:"
  echo
  echo "STEP 1: Smart replacement in all .java files"
  echo "  Will replace:"
  while IFS='|' read -r filepath oldname newname; do
    echo "    - Class declarations: 'class $oldname' -> 'class $newname'"
    echo "    - Import last segment: 'import ....$oldname;' -> 'import ....$newname;'"
    echo "    - Type references: '$oldname var' -> '$newname var'"
    echo "    - Constructors: 'new $oldname()' -> 'new $newname()'"
    echo "    - And other valid class references"
    echo
  done < "$TMP_PLAN"
  
  echo "STEP 2: Rename files"
  while IFS='|' read -r filepath oldname newname; do
    dirpath="$(dirname "$filepath")"
    newpath="$dirpath/$newname.java"
    echo "  $filepath -> $newpath"
  done < "$TMP_PLAN"
  
  echo
  echo "Dry-run complete."
  exit 0
fi

# 非 dry-run 模式：要求確認
echo
echo "This will:"
echo "  1. Smart replace class references in ALL .java files"
echo "  2. Rename $RENAME_COUNT .java files"
echo
read -p "Continue? (yes/no): " -r
echo

if [[ ! $REPLY =~ ^[Yy][Ee][Ss]$ ]]; then
  echo "Aborted."
  exit 0
fi

echo "════════════════════════════════════"
echo "STEP 1: Smart replacement in all files..."
echo "════════════════════════════════════"
echo

# 先在所有文件中智能替換類名引用
while IFS='|' read -r filepath oldname newname; do
  echo "Processing: $oldname -> $newname"
  
  # 使用 Perl 進行智能替換
  find "$TARGET_DIR" -type f -name '*.java' -print0 | while IFS= read -r -d '' f; do
    perl -i -0777 -pe '
      my $old = quotemeta($ARGV[0]);
      my $new = $ARGV[1];
      
      # 1. Class declaration: public class OldName -> public class NewName
      s/(class\s+)$old\b/$1$new/g;
      
      # 2. Interface declaration: interface OldName -> interface NewName
      s/(interface\s+)$old\b/$1$new/g;
      
      # 3. Enum declaration: enum OldName -> enum NewName
      s/(enum\s+)$old\b/$1$new/g;
      
      # 4. Import statement (last segment only): import ...OldName; -> import ...NewName;
      s/(import\s+[\w.]+\.)$old\s*;/$1$new;/g;
      
      # 5. Constructor: new OldName( -> new NewName(
      s/(new\s+)$old\s*\(/$1$new(/g;
      
      # 6. Type declarations: OldName var = -> NewName var =
      #    But NOT in middle of package path (no dot before)
      s/(?<![\w.])$old\b(?=\s+\w+\s*[=;,)])/$new/g;
      
      # 7. Generic type parameters: List<OldName> -> List<NewName>
      s/(<\s*)$old\b/$1$new/g;
      
      # 8. Extends/implements: extends OldName -> extends NewName
      s/(extends\s+)$old\b/$1$new/g;
      s/(implements\s+)$old\b/$1$new/g;
      
      # 9. instanceof: obj instanceof OldName -> obj instanceof NewName
      s/(instanceof\s+)$old\b/$1$new/g;
      
      # 10. Cast: (OldName) expr -> (NewName) expr
      s/\(\s*$old\s*\)/($new)/g;
      
      # 11. Static method calls: OldName.method -> NewName.method
      #     But only if followed by dot and method name (not part of package)
      s/(?<![\w.])$old\.(?=\w+\()/$new./g;
      
      # 12. Annotation with class: @SomeAnnotation(OldName.class)
      s/\b$old\.class\b/$new.class/g;
      
    ' -- "$oldname" "$newname" "$f" 2>/dev/null || true
  done
  
  echo "  ✓ Replaced in all files"
done < "$TMP_PLAN"

echo
echo "════════════════════════════════════"
echo "STEP 2: Renaming files..."
echo "════════════════════════════════════"
echo

# 然後重命名文件
SUCCESS=0
FAILED=0

while IFS='|' read -r filepath oldname newname; do
  dirpath="$(dirname "$filepath")"
  newpath="$dirpath/$newname.java"
  
  # 檢查文件是否還存在
  if [ ! -e "$filepath" ]; then
    echo "⚠️  $filepath (already renamed or not found)"
    continue
  fi
  
  echo "Renaming: $(basename "$filepath") -> $(basename "$newpath")"
  
  # 重命名文件
  if $USE_GIT && git rev-parse --is-inside-work-tree >/dev/null 2>&1; then
    if git mv "$filepath" "$newpath" 2>/dev/null; then
      echo "  ✓ Success (git mv)"
      SUCCESS=$((SUCCESS + 1))
    else
      if mv "$filepath" "$newpath" 2>/dev/null; then
        echo "  ✓ Success (mv)"
        SUCCESS=$((SUCCESS + 1))
      else
        echo "  ✗ Failed" >&2
        FAILED=$((FAILED + 1))
      fi
    fi
  else
    if mv "$filepath" "$newpath" 2>/dev/null; then
      echo "  ✓ Success"
      SUCCESS=$((SUCCESS + 1))
    else
      echo "  ✗ Failed" >&2
      FAILED=$((FAILED + 1))
    fi
  fi
done < "$TMP_PLAN"

echo
echo "════════════════════════════════════"
echo "Results:"
echo "  Renamed: $SUCCESS files"
echo "  Failed: $FAILED files"
echo "════════════════════════════════════"

if [ $SUCCESS -gt 0 ]; then
  echo
  echo "✓ Done! Smart replacement completed."
  if $USE_GIT && git rev-parse --is-inside-work-tree >/dev/null 2>&1; then
    echo
    echo "Review changes:"
    echo "  git status"
    echo "  git diff"
  fi
fi

exit 0
