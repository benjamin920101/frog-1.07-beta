/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  org.apache.commons.io.IOUtils
 */
package dev.idhammai.p.J;

import com.google.common.base.Splitter;
import dev.idhammai.Frog;
import dev.idhammai.P.A.J;
import dev.idhammai.c.r.O.Y.A;
import dev.idhammai.c.r.O.Y.B;
import dev.idhammai.c.r.O.Y.O;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.O.Y.v;
import dev.idhammai.c.r.q.N.P;
import dev.idhammai.c.r.q.N.j;
import dev.idhammai.c.r.y;
import dev.idhammai.c.y.u.I.t;
import dev.idhammai.p.R;
import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import org.apache.commons.io.IOUtils;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class z
extends R {
    public static File a = dev.idhammai.p.J.z.C("options.txt");
    private final Hashtable<String, String> z = new Hashtable();

    public void Q() {
        this.z.clear();
        Splitter splitter = Splitter.on((char)':');
        try {
            if (a.exists()) {
                List list = IOUtils.readLines((InputStream)new FileInputStream(a), (Charset)StandardCharsets.UTF_8);
                Iterator object = list.iterator();
                while (object.hasNext()) {
                    String bl = (String)object.next();
                    try {
                        Iterator iterator = splitter.limit(2).split((CharSequence)bl).iterator();
                        this.z.put((String)iterator.next(), (String)iterator.next());
                    }
                    catch (Exception exception) {
                        System.out.println("Skipping bad option: " + bl);
                    }
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
            System.out.println("[Frog Client] Failed to load settings");
        }
        for (y y2 : Frog.MODULE.h()) {
            for (dev.idhammai.c.r.O.v v2 : y2.F()) {
                dev.idhammai.c.r.O.v v3;
                String string = y2.o() + "_" + v2.e();
                Objects.requireNonNull(v2);
                if (v2 instanceof W) {
                    v3 = (W)v2;
                    ((W)v3).J(Frog.CONFIG.H(string, ((W)v3).z()));
                    continue;
                }
                if (v2 instanceof l) {
                    v3 = (l)v2;
                    ((l)v3).d(Frog.CONFIG.b(string, (float)((l)v3).o()));
                    continue;
                }
                if (v2 instanceof O) {
                    v3 = (O)v2;
                    ((O)v3).N(Frog.CONFIG.l(string, ((O)v3).B()));
                    ((O)v3).d(Frog.CONFIG.l(string + "_hold"));
                    continue;
                }
                if (v2 instanceof B) {
                    String string2;
                    v3 = (B)v2;
                    String string3 = Frog.CONFIG.e(string);
                    if (y2 instanceof P && "Background".equals(v2.e()) && string3 == null && Frog.CONFIG.e(string2 = y2.o() + "_Blur") != null) {
                        string3 = Frog.CONFIG.H(string2, true) ? "Blur" : "None";
                    }
                    ((B)v3).c(string3);
                    continue;
                }
                if (v2 instanceof A) {
                    v3 = (A)v2;
                    ((A)v3).a(new Color(Frog.CONFIG.l(string, ((A)v3).g().getRGB()), true));
                    boolean bl = Frog.CONFIG.e(string + "Rainbow") != null ? Frog.CONFIG.H(string + "Rainbow", ((A)v3).d()) : Frog.CONFIG.H(string + "Sync", ((A)v3).d());
                    ((A)v3).A(bl);
                    if (!((A)v3).b) continue;
                    ((A)v3).i = Frog.CONFIG.H(string + "Boolean", ((A)v3).q());
                    continue;
                }
                if (!(v2 instanceof v)) continue;
                v3 = (v)v2;
                ((v)v3).z(Frog.CONFIG.i(string, ((v)v3).w()));
            }
            boolean bl = Frog.CONFIG.H(y2.o() + "_state", y2.o().equals("Info") || y2.o().equals("Fonts"));
            if (y2 instanceof P && !bl && J.W != null && J.W.field_1755 instanceof t) {
                bl = true;
            }
            y2.p(bl);
        }
    }

    public void f() {
        this.Q();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void x() {
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(new OutputStreamWriter((OutputStream)new FileOutputStream(a), StandardCharsets.UTF_8));
            for (y y2 : Frog.MODULE.h()) {
                for (dev.idhammai.c.r.O.v v2 : y2.F()) {
                    dev.idhammai.c.r.O.v v3;
                    String string = y2.o() + "_" + v2.e();
                    Objects.requireNonNull(v2);
                    if (v2 instanceof W) {
                        v3 = (W)v2;
                        printWriter.println(string + ":" + ((W)v3).h());
                        continue;
                    }
                    if (v2 instanceof l) {
                        v3 = (l)v2;
                        printWriter.println(string + ":" + ((l)v3).e());
                        continue;
                    }
                    if (v2 instanceof O) {
                        v3 = (O)v2;
                        printWriter.println(string + ":" + ((O)v3).R());
                        printWriter.println(string + "_hold:" + ((O)v3).B());
                        continue;
                    }
                    if (v2 instanceof B) {
                        v3 = (B)v2;
                        printWriter.println(string + ":" + ((Enum)((B)v3).X()).name());
                        continue;
                    }
                    if (v2 instanceof A) {
                        v3 = (A)v2;
                        printWriter.println(string + ":" + ((A)v3).P().getRGB());
                        printWriter.println(string + "Rainbow:" + ((A)v3).Z);
                        if (!((A)v3).b) continue;
                        printWriter.println(string + "Boolean:" + ((A)v3).i);
                        continue;
                    }
                    if (!(v2 instanceof v)) continue;
                    v3 = (v)v2;
                    printWriter.println(string + ":" + ((v)v3).q());
                }
                printWriter.println(y2.o() + "_state:" + y2.p());
            }
            IOUtils.closeQuietly((Writer)printWriter);
            IOUtils.closeQuietly((Writer)printWriter);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            System.out.println("[Frog Client] Failed to save settings");
        }
        finally {
            IOUtils.closeQuietly(printWriter);
        }
    }

    public static File u() {
        File file = dev.idhammai.p.J.z.d();
        File file2 = new File(file, "cfg");
        if (!file2.exists()) {
            file2.mkdirs();
        }
        return file2;
    }

    public static File J(String string) {
        if (string == null || string.isEmpty()) {
            return null;
        }
        File file = dev.idhammai.p.J.z.u();
        return new File(file, string + ".cfg");
    }

    public static ArrayList<String> Z() {
        ArrayList<String> arrayList = new ArrayList<String>();
        File file = dev.idhammai.p.J.z.u();
        if (file == null) {
            return arrayList;
        }
        File[] fileArray = file.listFiles();
        if (fileArray == null) {
            return arrayList;
        }
        Object object = fileArray;
        int n2 = ((File[])object).length;
        for (int i2 = 0; i2 < n2; ++i2) {
            String string;
            String string2;
            String string3;
            File file2 = object[i2];
            if (file2 == null || !file2.isFile() || (string3 = file2.getName()) == null || !(string2 = string3.toLowerCase()).endsWith(".cfg") || (string = string3.substring(0, string3.length() - 4)).isEmpty()) continue;
            arrayList.add(string);
        }
        if (arrayList.isEmpty() && (object = dev.idhammai.p.J.z.y("default")) != null && !((String)object).isEmpty()) {
            arrayList.add((String)object);
        }
        arrayList.sort(String::compareToIgnoreCase);
        return arrayList;
    }

    public static String M(String string) {
        if (string == null) {
            return "";
        }
        String string2 = string.trim();
        if (string2.isEmpty()) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = 0; i2 < string2.length(); ++i2) {
            char c2 = string2.charAt(i2);
            if (Character.isLetterOrDigit(c2) || c2 == '_' || c2 == '-' || c2 == ' ') {
                stringBuilder.append(c2);
                continue;
            }
            stringBuilder.append('_');
        }
        String string3 = stringBuilder.toString().trim();
        if (string3.length() > 32) {
            string3 = string3.substring(0, 32);
        }
        return string3;
    }

    public static String t(String string) {
        String string2 = dev.idhammai.p.J.z.M(string);
        if (string2.isEmpty()) {
            return "";
        }
        File file = dev.idhammai.p.J.z.J(string2);
        if (file != null && !file.exists()) {
            return string2;
        }
        for (int i2 = 1; i2 < 1000; ++i2) {
            String string3 = string2 + "_" + i2;
            File file2 = dev.idhammai.p.J.z.J(string3);
            if (file2 == null || file2.exists()) continue;
            return string3;
        }
        return string2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void G(File file) {
        if (file == null) {
            return;
        }
        try (PrintWriter printWriter = null;){
            printWriter = new PrintWriter(new OutputStreamWriter((OutputStream)new FileOutputStream(file), StandardCharsets.UTF_8));
            for (y y2 : Frog.MODULE.h()) {
                for (dev.idhammai.c.r.O.v v2 : y2.F()) {
                    dev.idhammai.c.r.O.v v3;
                    String string = y2.o() + "_" + v2.e();
                    if (v2 instanceof W) {
                        v3 = (W)v2;
                        printWriter.println(string + ":" + ((W)v3).z());
                        continue;
                    }
                    if (v2 instanceof l) {
                        v3 = (l)v2;
                        printWriter.println(string + ":" + ((l)v3).o());
                        continue;
                    }
                    if (v2 instanceof O) {
                        v3 = (O)v2;
                        printWriter.println(string + ":" + ((O)v3).B());
                        printWriter.println(string + "_hold:false");
                        continue;
                    }
                    if (v2 instanceof B) {
                        v3 = (B)v2;
                        Object t2 = ((B)v3).H();
                        printWriter.println(string + ":" + ((Enum)t2).name());
                        continue;
                    }
                    if (v2 instanceof A) {
                        v3 = (A)v2;
                        printWriter.println(string + ":" + ((A)v3).g().getRGB());
                        printWriter.println(string + "Rainbow:" + ((A)v3).d());
                        if (!((A)v3).b) continue;
                        printWriter.println(string + "Boolean:" + ((A)v3).q());
                        continue;
                    }
                    if (!(v2 instanceof v)) continue;
                    v3 = (v)v2;
                    printWriter.println(string + ":" + ((v)v3).w());
                }
                printWriter.println(y2.o() + "_state:" + (y2.o().equals("Info") || y2.o().equals("Fonts")));
            }
        }
    }

    public static String y(String string) {
        String string2 = dev.idhammai.p.J.z.M(string);
        if (string2.isEmpty()) {
            return null;
        }
        String string3 = dev.idhammai.p.J.z.t(string2);
        File file = dev.idhammai.p.J.z.J(string3);
        if (file == null) {
            return null;
        }
        dev.idhammai.p.J.z.G(file);
        return string3;
    }

    public static String v(String string, String string2) {
        if (string == null || string.isEmpty()) {
            return null;
        }
        File file = dev.idhammai.p.J.z.J(string);
        if (file == null || !file.exists()) {
            return null;
        }
        String string3 = dev.idhammai.p.J.z.M(string2);
        if (string3.isEmpty()) {
            string3 = dev.idhammai.p.J.z.M(string);
        }
        if (string3.isEmpty()) {
            return null;
        }
        LocalDate localDate = LocalDate.now();
        String string4 = string3 + "_" + localDate.getYear() + "_" + localDate.getMonthValue() + "_" + localDate.getDayOfMonth();
        String string5 = null;
        for (int i2 = 1; i2 < 100000; ++i2) {
            String string6 = string4 + "_[" + i2 + "]";
            File file2 = dev.idhammai.p.J.z.J(string6);
            if (file2 == null || file2.exists()) continue;
            string5 = string6;
            break;
        }
        if (string5 == null) {
            return null;
        }
        File file3 = dev.idhammai.p.J.z.J(string5);
        if (file3 == null) {
            return null;
        }
        try {
            Files.copy(file.toPath(), file3.toPath(), StandardCopyOption.REPLACE_EXISTING);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
        return string5;
    }

    public static void e(String string) {
        File file = dev.idhammai.p.J.z.J(string);
        if (file == null || !file.exists()) {
            return;
        }
        try {
            file.delete();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String j(String string) {
        String string2 = dev.idhammai.p.J.z.M(string);
        if (string2.isEmpty()) {
            return null;
        }
        dev.idhammai.p.J.z.u();
        try {
            a = R.C("cfg" + File.separator + string2 + ".cfg");
            Frog.save();
            String string3 = string2;
            return string3;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            String string4 = null;
            return string4;
        }
        finally {
            a = R.C("options.txt");
        }
    }

    public static boolean O(String string) {
        if (string == null || string.isEmpty()) {
            return false;
        }
        try {
            a = R.C("cfg" + File.separator + string + ".cfg");
            Frog.CONFIG = new z();
            Frog.CONFIG.Q();
            boolean bl = true;
            return bl;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            boolean bl = false;
            return bl;
        }
        finally {
            a = R.C("options.txt");
            Frog.save();
            if (j.G != null) {
                j.G.Y();
            }
        }
    }

    public int l(String string, int n2) {
        String string2 = this.z.get(string);
        if (string2 == null || !this.G(string2)) {
            return n2;
        }
        return Integer.parseInt(string2);
    }

    public float b(String string, float f2) {
        String string2 = this.z.get(string);
        if (string2 == null || !this.t(string2)) {
            return f2;
        }
        return Float.parseFloat(string2);
    }

    public boolean l(String string) {
        String string2 = this.z.get(string);
        return Boolean.parseBoolean(string2);
    }

    public boolean H(String string, boolean bl) {
        if (this.z.get(string) != null) {
            String string2 = this.z.get(string);
            return Boolean.parseBoolean(string2);
        }
        return bl;
    }

    public String e(String string) {
        return this.z.get(string);
    }

    public String i(String string, String string2) {
        if (this.z.get(string) == null) {
            return string2;
        }
        return this.z.get(string);
    }

    public boolean G(String string) {
        Pattern pattern = Pattern.compile("^[-+]?[\\d]*$");
        return pattern.matcher(string).matches();
    }

    public boolean t(String string) {
        String string2 = "^[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?$";
        return string.matches(string2);
    }
}

