/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.P.A.A;

import dev.idhammai.P.A.A.S;
import dev.idhammai.P.A.A.d;

public class k {
    private final d u = new d(0L);
    public double a = 0.0;
    public double h = 0.0;

    public double g(double d2, long l2, S s2) {
        if (d2 != this.h) {
            this.a += (this.h - this.a) * this.u.M(s2);
            this.h = d2;
            this.u.e();
        }
        this.u.S(l2);
        return this.a + (this.h - this.a) * this.u.M(s2);
    }
}

