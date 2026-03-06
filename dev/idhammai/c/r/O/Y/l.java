/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.O.Y;

import dev.idhammai.c.r.O.v;
import java.util.function.BooleanSupplier;

public class l
extends v {
    private final double O;
    private final double o;
    private final double V;
    private final double Z;
    private double f;
    private String m = "";
    private Runnable K = null;
    private boolean j = false;

    public l(String string, double d2, double d3, double d4, double d5) {
        super(string);
        this.f = d2;
        this.O = d2;
        this.o = d3;
        this.V = d4;
        this.Z = d5;
    }

    public l(String string, double d2, double d3, double d4) {
        this(string, d2, d3, d4, 0.1);
    }

    public l(String string, int n2, int n3, int n4) {
        this(string, (double)n2, (double)n3, (double)n4, 1.0);
    }

    public l(String string, double d2, double d3, double d4, double d5, BooleanSupplier booleanSupplier) {
        super(string, booleanSupplier);
        this.f = d2;
        this.O = d2;
        this.o = d3;
        this.V = d4;
        this.Z = d5;
    }

    public l(String string, double d2, double d3, double d4, BooleanSupplier booleanSupplier) {
        this(string, d2, d3, d4, 0.1, booleanSupplier);
    }

    public l(String string, int n2, int n3, int n4, BooleanSupplier booleanSupplier) {
        this(string, n2, n3, n4, 1.0, booleanSupplier);
    }

    public l D(String string) {
        super.V(string);
        return this;
    }

    public double o() {
        return this.O;
    }

    public double e() {
        return this.f;
    }

    public float Z() {
        return (float)this.f;
    }

    public int V() {
        return (int)this.f;
    }

    public void d(double d2) {
        this.f = (double)Math.round(d2 / this.h()) * this.h();
        if (this.j) {
            this.K.run();
        }
    }

    public double B() {
        return this.o;
    }

    public double X() {
        return this.V;
    }

    public double h() {
        return this.Z;
    }

    public double u() {
        return this.X() - this.B();
    }

    public String i() {
        return this.m;
    }

    public l P(String string) {
        this.m = string;
        return this;
    }

    public l i(Runnable runnable) {
        this.K = runnable;
        this.j = true;
        return this;
    }
}

