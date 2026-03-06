/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.P.A.A;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class h {
    private long D = -1L;

    public h() {
        this.H();
    }

    public void H() {
        this.D = System.currentTimeMillis();
    }

    public long k() {
        return System.currentTimeMillis() - this.D;
    }

    public long G() {
        return this.k();
    }

    public boolean r(double d2) {
        return this.m((long)d2 * 1000L);
    }

    public boolean S(double d2) {
        return this.m((long)d2);
    }

    public void m(long l2) {
        this.D = System.currentTimeMillis() - l2;
    }

    public boolean m(long l2) {
        return System.currentTimeMillis() - this.D >= l2;
    }
}

