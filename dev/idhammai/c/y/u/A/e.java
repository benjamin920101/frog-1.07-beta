/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.y.u.A;

import dev.idhammai.P.A.A.S;
import dev.idhammai.P.A.A.k;
import dev.idhammai.c.r.q.N.P;

public final class e {
    private e() {
    }

    public static float M(k k2, float f2, long l2, S s2, boolean bl) {
        if (!bl) {
            e.F(k2, f2);
            return f2;
        }
        return (float)k2.g(f2, l2, s2);
    }

    public static void F(k k2, float f2) {
        k2.a = f2;
        k2.h = f2;
    }

    public static double v(k k2, boolean bl, P p2, long l2, long l3, S s2, S s3) {
        S s4;
        long l4 = bl ? l2 : l3;
        S s5 = s4 = bl ? s2 : s3;
        if (p2 != null) {
            l4 = bl ? p2.pS.V() : p2.pK.V();
            S s6 = s4 = bl ? p2.pr.X() : p2.pm.X();
        }
        if (l4 <= 0L) {
            l4 = 1L;
        }
        if (s4 == null) {
            s4 = S.CubicInOut;
        }
        return k2.g(bl ? 1.0 : 0.0, l4, s4);
    }

    public static double K(k k2, boolean bl, P p2, long l2, long l3, S s2, S s3) {
        if (p2 == null || !p2.pD.h()) {
            return bl ? 1.0 : 0.0;
        }
        return e.v(k2, bl, p2, l2, l3, s2, s3);
    }
}

