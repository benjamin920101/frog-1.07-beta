/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.P.r.c;

import dev.idhammai.P.r.L;

public class T
extends L {
    private static final T P = new T();
    public boolean i;
    private double I;
    private double e;
    private double N;

    private T() {
    }

    public static T N(double d2, double d3, double d4) {
        T.P.i = false;
        T.P.I = d2;
        T.P.e = d3;
        T.P.N = d4;
        P.G(false);
        return P;
    }

    public double Z() {
        return this.I;
    }

    public void C(double d2) {
        this.i = true;
        this.I = d2;
    }

    public double G() {
        return this.e;
    }

    public void Z(double d2) {
        this.i = true;
        this.e = d2;
    }

    public double w() {
        return this.N;
    }

    public void p(double d2) {
        this.i = true;
        this.N = d2;
    }
}

