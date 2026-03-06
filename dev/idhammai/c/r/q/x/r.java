/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1657
 *  net.minecraft.class_1713
 *  net.minecraft.class_1714
 *  net.minecraft.class_1748
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_2246
 *  net.minecraft.class_2338
 *  net.minecraft.class_3532
 *  net.minecraft.class_516
 *  net.minecraft.class_7225$class_7874
 *  net.minecraft.class_8786
 */
package dev.idhammai.c.r.q.x;

import dev.idhammai.P.A.L.g;
import dev.idhammai.P.A.l.M;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import net.minecraft.class_1657;
import net.minecraft.class_1713;
import net.minecraft.class_1714;
import net.minecraft.class_1748;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_3532;
import net.minecraft.class_516;
import net.minecraft.class_7225;
import net.minecraft.class_8786;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class r
extends y {
    public static r t;
    private final W F = this.S(new W("Rotate", false).k("\u653e\u7f6e\u8f6c\u5411"));
    private final l I = this.p(new l("Range", 5, 0, 8).D("\u641c\u7d22\u8303\u56f4"));
    private final W s = this.S(new W("Disable", true).k("\u5b8c\u6210\u540e\u5173\u95ed"));

    public r() {
        super("BedCrafter", w.Misc);
        this.L("\u81ea\u52a8\u5236\u4f5c\u5e8a");
        t = this;
    }

    public static int Y() {
        int n2 = 0;
        for (int i2 = 0; i2 < 36; ++i2) {
            class_1799 class_17992 = r.W.field_1724.method_31548().method_5438(i2);
            if (!class_17992.method_7960()) continue;
            ++n2;
        }
        return n2;
    }

    @dev.idhammai.P.r.K.r
    public void d(QO qO) {
        if (r.Y() == 0) {
            if (r.W.field_1724.field_7512 instanceof class_1714) {
                r.W.field_1724.method_7346();
            }
            if (this.s.h()) {
                this.p();
            }
            return;
        }
        if (r.W.field_1724.field_7512 instanceof class_1714) {
            boolean bl = false;
            block0: for (class_516 class_5162 : r.W.field_1724.method_3130().method_1393()) {
                for (class_8786 class_87862 : class_5162.method_2648(true)) {
                    if (!(class_87862.comp_1933().method_8110((class_7225.class_7874)r.W.field_1687.method_30349()).method_7909() instanceof class_1748)) continue;
                    for (int i2 = 0; i2 < r.Y(); ++i2) {
                        bl = true;
                        r.W.field_1761.method_2912(r.W.field_1724.field_7512.field_7763, class_87862, false);
                        r.W.field_1761.method_2906(r.W.field_1724.field_7512.field_7763, 0, 1, class_1713.field_7794, (class_1657)r.W.field_1724);
                    }
                    continue block0;
                }
            }
            if (!bl) {
                if (r.W.field_1724.field_7512 instanceof class_1714) {
                    r.W.field_1724.method_7346();
                }
                if (this.s.h()) {
                    this.p();
                }
            }
        } else {
            this.Y();
        }
    }

    private void Y() {
        class_2338 class_23382 = null;
        double d2 = 100.0;
        boolean bl = true;
        for (class_2338 class_23383 : M.I(this.I.Z())) {
            if (r.W.field_1687.method_8320(class_23383).method_26204() == class_2246.field_9980 && M.S(class_23383) != null) {
                bl = false;
                class_23382 = class_23383;
                break;
            }
            if (!M.d(class_23383) || class_23382 != null && !((double)class_3532.method_15355((float)((float)r.W.field_1724.method_5707(class_23383.method_46558()))) < d2)) continue;
            class_23382 = class_23383;
            d2 = class_3532.method_15355((float)((float)r.W.field_1724.method_5707(class_23383.method_46558())));
        }
        if (class_23382 != null) {
            if (!bl) {
                M.T(class_23382, M.e(class_23382), this.F.h());
            } else {
                if (g.E(class_1802.field_8465) == -1) {
                    return;
                }
                int n2 = r.W.field_1724.method_31548().field_7545;
                g.j(g.E(class_1802.field_8465));
                M.i(class_23382, this.F.h());
                g.j(n2);
            }
        }
    }
}

