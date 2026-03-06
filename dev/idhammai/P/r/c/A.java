/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.P.r.c;

public class A {
    private static final A v = new A();
    private float B;
    private float e;
    private boolean P;

    private A() {
    }

    public static A x(float f2, float f3) {
        A.v.B = f2;
        A.v.e = f3;
        A.v.P = false;
        return v;
    }

    public float v() {
        return this.B;
    }

    public void F(float f2) {
        this.P = true;
        this.K(f2);
    }

    public float t() {
        return this.e;
    }

    public void p(float f2) {
        this.P = true;
        this.Z(f2);
    }

    public boolean X() {
        return this.P;
    }

    public void g(float f2, float f3) {
        this.F(f2);
        this.p(f3);
    }

    public void K(float f2) {
        this.B = f2;
    }

    public void Z(float f2) {
        this.e = f2;
    }
}

