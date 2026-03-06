/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.P.A.A;

import dev.idhammai.P.A.A.S;

public class d {
    public long R;
    private long P;

    public d(long l2) {
        this.R = l2;
        this.e();
    }

    public void e() {
        this.P = System.currentTimeMillis();
    }

    public boolean z() {
        return this.m() >= this.R;
    }

    protected long m() {
        return System.currentTimeMillis() - this.P;
    }

    public void S(long l2) {
        this.R = l2;
    }

    public double t() {
        return this.z() ? 1.0 : (double)this.m() / (double)this.R;
    }

    public double b() {
        return 1.0 - (1.0 - this.t()) * (1.0 - this.t());
    }

    public double M(S s2) {
        return s2.T(this.t());
    }
}

