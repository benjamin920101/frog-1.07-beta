/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1291
 *  net.minecraft.class_1293
 *  net.minecraft.class_1657
 *  net.minecraft.class_1713
 *  net.minecraft.class_1747
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_1844
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2596
 *  net.minecraft.class_2838
 *  net.minecraft.class_2868
 *  net.minecraft.class_9334
 */
package dev.idhammai.P.A.L;

import dev.idhammai.P.A.J;
import dev.idhammai.P.A.L.e;
import dev.idhammai.P.A.l.M;
import dev.idhammai.c.r.q.N.x;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.class_1291;
import net.minecraft.class_1293;
import net.minecraft.class_1657;
import net.minecraft.class_1713;
import net.minecraft.class_1747;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1844;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2596;
import net.minecraft.class_2838;
import net.minecraft.class_2868;
import net.minecraft.class_9334;

public class g
implements J {
    static int z = -1;
    static int c = -1;

    public static void z(int n2, int n3) {
        if (n2 == z) {
            g.j(c);
            z = -1;
            c = -1;
            return;
        }
        if (n2 - 36 == n3) {
            return;
        }
        if (!e.n()) {
            return;
        }
        if (x.y.Q.h()) {
            if (n2 - 36 >= 0) {
                z = n2;
                c = n3;
                g.j(n2 - 36);
                return;
            }
            W.method_1562().method_52787((class_2596)new class_2838(n2));
        } else {
            g.W.field_1761.method_2906(g.W.field_1724.field_7512.field_7763, n2, n3, class_1713.field_7791, (class_1657)g.W.field_1724);
            g.W.field_1724.method_31548().method_7381();
        }
    }

    public static void j(int n2) {
        g.W.field_1724.method_31548().field_7545 = n2;
        W.method_1562().method_52787((class_2596)new class_2868(n2));
    }

    public static int E(class_1792 class_17922) {
        for (int i2 = 0; i2 < 9; ++i2) {
            class_1792 class_17923 = g.W.field_1724.method_31548().method_5438(i2).method_7909();
            if (class_1792.method_7880((class_1792)class_17923) != class_1792.method_7880((class_1792)class_17922)) continue;
            return i2;
        }
        return -1;
    }

    public static int T() {
        for (int i2 = 0; i2 < 9; ++i2) {
            if (!g.W.field_1724.method_31548().method_5438(i2).method_57353().method_57832(class_9334.field_50075)) continue;
            return i2;
        }
        return -1;
    }

    public static int F(class_1291 class_12912) {
        int n2 = 0;
        for (int i2 = 35; i2 >= 0; --i2) {
            class_1799 class_17992 = g.W.field_1724.method_31548().method_5438(i2);
            if (class_1792.method_7880((class_1792)class_17992.method_7909()) != class_1792.method_7880((class_1792)class_1802.field_8436)) continue;
            class_1844 class_18442 = (class_1844)class_17992.method_57825(class_9334.field_49651, (Object)class_1844.field_49274);
            for (class_1293 class_12932 : class_18442.method_57397()) {
                if (class_12932.method_5579().comp_349() != class_12912) continue;
                n2 += class_17992.method_7947();
            }
        }
        return n2;
    }

    public static int A(Class<?> clazz) {
        int n2 = 0;
        for (Map.Entry<Integer, class_1799> entry : g.A().entrySet()) {
            if (!(entry.getValue().method_7909() instanceof class_1747) || !clazz.isInstance(((class_1747)entry.getValue().method_7909()).method_7711())) continue;
            n2 += entry.getValue().method_7947();
        }
        return n2;
    }

    public static int z(class_1792 class_17922) {
        int n2 = 0;
        for (Map.Entry<Integer, class_1799> entry : g.A().entrySet()) {
            if (entry.getValue().method_7909() != class_17922) continue;
            n2 += entry.getValue().method_7947();
        }
        if (g.W.field_1724.method_6079().method_7909() == class_17922) {
            n2 += g.W.field_1724.method_6079().method_7947();
        }
        return n2;
    }

    public static int K(Class<?> clazz) {
        for (int i2 = 0; i2 < 9; ++i2) {
            class_1799 class_17992 = g.W.field_1724.method_31548().method_5438(i2);
            if (class_17992 == class_1799.field_8037) continue;
            if (clazz.isInstance(class_17992.method_7909())) {
                return i2;
            }
            if (!(class_17992.method_7909() instanceof class_1747) || !clazz.isInstance(((class_1747)class_17992.method_7909()).method_7711())) continue;
            return i2;
        }
        return -1;
    }

    public static int J(Class<?> clazz) {
        if (x.y.a.h()) {
            for (int i2 = 0; i2 < 36; ++i2) {
                class_1799 class_17992 = g.W.field_1724.method_31548().method_5438(i2);
                if (class_17992 == class_1799.field_8037) continue;
                if (clazz.isInstance(class_17992.method_7909())) {
                    return i2 < 9 ? i2 + 36 : i2;
                }
                if (!(class_17992.method_7909() instanceof class_1747) || !clazz.isInstance(((class_1747)class_17992.method_7909()).method_7711())) continue;
                return i2 < 9 ? i2 + 36 : i2;
            }
        } else {
            for (int i3 = 35; i3 >= 0; --i3) {
                class_1799 class_17993 = g.W.field_1724.method_31548().method_5438(i3);
                if (class_17993 == class_1799.field_8037) continue;
                if (clazz.isInstance(class_17993.method_7909())) {
                    return i3 < 9 ? i3 + 36 : i3;
                }
                if (!(class_17993.method_7909() instanceof class_1747) || !clazz.isInstance(((class_1747)class_17993.method_7909()).method_7711())) continue;
                return i3 < 9 ? i3 + 36 : i3;
            }
        }
        return -1;
    }

    public static int L(class_2248 class_22482) {
        for (int i2 = 0; i2 < 9; ++i2) {
            class_1799 class_17992 = g.W.field_1724.method_31548().method_5438(i2);
            if (class_17992 == class_1799.field_8037 || !(class_17992.method_7909() instanceof class_1747) || ((class_1747)class_17992.method_7909()).method_7711() != class_22482) continue;
            return i2;
        }
        return -1;
    }

    public static int f() {
        for (int i2 = 0; i2 < 9; ++i2) {
            class_1799 class_17992 = g.W.field_1724.method_31548().method_5438(i2);
            if (class_17992.method_7909() instanceof class_1747) continue;
            return i2;
        }
        return -1;
    }

    public static int k() {
        for (int i2 = 0; i2 < 9; ++i2) {
            class_1799 class_17992 = g.W.field_1724.method_31548().method_5438(i2);
            if (!(class_17992.method_7909() instanceof class_1747) || M.x(class_2248.method_9503((class_1792)class_17992.method_7909())) || ((class_1747)class_17992.method_7909()).method_7711() == class_2246.field_10343) continue;
            return i2;
        }
        return -1;
    }

    public static int H(class_2248 class_22482) {
        return g.a(class_22482.method_8389());
    }

    public static int a(class_1792 class_17922) {
        if (x.y.a.h()) {
            return g.C(class_17922.method_8389());
        }
        for (int i2 = 35; i2 >= 0; --i2) {
            class_1799 class_17992 = g.W.field_1724.method_31548().method_5438(i2);
            if (class_17992.method_7909() != class_17922) continue;
            return i2 < 9 ? i2 + 36 : i2;
        }
        return -1;
    }

    public static int C(class_1792 class_17922) {
        for (int i2 = 0; i2 < 36; ++i2) {
            class_1799 class_17992 = g.W.field_1724.method_31548().method_5438(i2);
            if (class_17992.method_7909() != class_17922) continue;
            return i2 < 9 ? i2 + 36 : i2;
        }
        return -1;
    }

    public static Map<Integer, class_1799> A() {
        HashMap<Integer, class_1799> hashMap = new HashMap<Integer, class_1799>();
        for (int i2 = 0; i2 <= 35; ++i2) {
            hashMap.put(i2, g.W.field_1724.method_31548().method_5438(i2));
        }
        return hashMap;
    }
}

