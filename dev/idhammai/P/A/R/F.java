/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 */
package dev.idhammai.P.A.R;

import dev.idhammai.P.A.J;
import dev.idhammai.c.r.q.N.t;
import net.minecraft.class_2248;
import net.minecraft.class_2338;

public class F
implements J {
    public static boolean q;

    public static void d(class_2338 class_23382) {
        if (q) {
            t.y(class_23382);
        }
    }

    public static void f() {
        if (q) {
            t.w();
        }
    }

    public static void q(class_2248 class_22482) {
        if (q) {
            t.z(class_22482);
        }
    }

    public static boolean o() {
        if (q) {
            return t.K();
        }
        return false;
    }

    public static void g() {
        if (q) {
            t.Z();
        }
    }

    public static boolean D() {
        if (q) {
            return t.k();
        }
        return false;
    }

    static {
        Package[] packageArray;
        for (Package package_ : packageArray = Package.getPackages()) {
            if (!package_.getName().contains("baritone.api")) continue;
            q = true;
            break;
        }
    }
}

