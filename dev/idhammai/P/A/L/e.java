/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_1743
 *  net.minecraft.class_1799
 *  net.minecraft.class_1829
 *  net.minecraft.class_1835
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_239$class_240
 *  net.minecraft.class_243
 *  net.minecraft.class_2596
 *  net.minecraft.class_2815
 *  net.minecraft.class_2879
 *  net.minecraft.class_3959
 *  net.minecraft.class_3959$class_242
 *  net.minecraft.class_3959$class_3960
 *  net.minecraft.class_3965
 *  net.minecraft.class_408
 *  net.minecraft.class_429
 *  net.minecraft.class_433
 *  net.minecraft.class_4667
 *  net.minecraft.class_490
 *  net.minecraft.class_9362
 */
package dev.idhammai.P.A.L;

import dev.idhammai.P.A.J;
import dev.idhammai.P.A.l.M;
import dev.idhammai.P.A.l.k;
import dev.idhammai.c.r.O.p.S;
import dev.idhammai.c.r.q.N.x;
import dev.idhammai.c.y.f;
import dev.idhammai.c.y.u.I.t;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1743;
import net.minecraft.class_1799;
import net.minecraft.class_1829;
import net.minecraft.class_1835;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2815;
import net.minecraft.class_2879;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_408;
import net.minecraft.class_429;
import net.minecraft.class_433;
import net.minecraft.class_4667;
import net.minecraft.class_490;
import net.minecraft.class_9362;

public class e
implements J {
    public static boolean n() {
        return e.W.field_1755 == null || e.W.field_1755 instanceof class_4667 || e.W.field_1755 instanceof class_429 || e.W.field_1755 instanceof f || e.W.field_1755 instanceof class_408 || e.W.field_1755 instanceof class_490 || e.W.field_1755 instanceof t || e.W.field_1755 instanceof class_433;
    }

    public static boolean G(class_1657 class_16572) {
        return class_16572.method_6047().method_7909() instanceof class_1829 || class_16572.method_6047().method_7909() instanceof class_1743 || class_16572.method_6047().method_7909() instanceof class_9362 || class_16572.method_6047().method_7909() instanceof class_1835;
    }

    public static boolean K(class_1657 class_16572) {
        return M.d((class_1297)class_16572, class_16572.method_5829());
    }

    public static boolean j() {
        return e.K((class_1657)e.W.field_1724);
    }

    public static int a(class_1799 class_17992) {
        if (class_17992.method_7919() == class_17992.method_7936()) {
            return 100;
        }
        return (int)((double)(class_17992.method_7936() - class_17992.method_7919()) / Math.max(0.1, (double)class_17992.method_7936()) * 100.0);
    }

    public static boolean s(class_1657 class_16572, int n2) {
        for (class_1799 class_17992 : class_16572.method_5661()) {
            if (class_17992 == null || class_17992.method_7960()) {
                return true;
            }
            if (e.a(class_17992) >= n2) continue;
            return true;
        }
        return false;
    }

    public static float T(class_1297 class_12972) {
        if (class_12972.method_5709()) {
            class_1309 class_13092 = (class_1309)class_12972;
            return class_13092.method_6032() + class_13092.method_6067();
        }
        return 0.0f;
    }

    public static class_2338 Y(class_1297 class_12972) {
        return new k(class_12972.method_19538());
    }

    public static class_2338 H(boolean bl) {
        return new k(e.W.field_1724.method_19538(), bl);
    }

    public static class_2338 d(class_1297 class_12972, boolean bl) {
        return new k(class_12972.method_19538(), bl);
    }

    public static boolean R(class_2338 class_23382, class_2350 class_23502) {
        class_243 class_2432 = class_23382.method_46558().method_1031((double)class_23502.method_10163().method_10263() * 0.5, (double)class_23502.method_10163().method_10264() * 0.5, (double)class_23502.method_10163().method_10260() * 0.5);
        class_3965 class_39652 = e.W.field_1687.method_17742(new class_3959(e.W.field_1724.method_33571(), class_2432, class_3959.class_3960.field_17558, class_3959.class_242.field_1348, (class_1297)e.W.field_1724));
        return class_39652 == null || class_39652.method_17783() == class_239.class_240.field_1333;
    }

    public static void g(class_1268 class_12682, S s2) {
        switch (s2) {
            case All: {
                e.W.field_1724.method_6104(class_12682);
                break;
            }
            case Client: {
                e.W.field_1724.method_23667(class_12682, false);
                break;
            }
            case Server: {
                W.method_1562().method_52787((class_2596)new class_2879(class_12682));
            }
        }
    }

    public static void t() {
        if (x.y.b.h()) {
            W.method_1562().method_52787((class_2596)new class_2815(e.W.field_1724.field_7512.field_7763));
        }
    }
}

