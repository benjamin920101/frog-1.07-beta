/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.P.r.c;

public class H {
    public static final H B = new H();
    private float h;
    private float C;

    private H() {
    }

    public static H x(float f2, float f3) {
        H.B.h = f2;
        H.B.C = f3;
        return B;
    }

    public float q() {
        return this.h;
    }

    public void h(float f2) {
        this.h = f2;
    }

    public float l() {
        return this.C;
    }

    public void v(float f2) {
        this.C = f2;
    }
}

