/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.P.A.R;

import dev.idhammai.P.A.R.n;
import java.util.ArrayList;

public class c {
    private n A;
    private c P;
    private ArrayList<n> c;
    private double d;
    private double U;
    private double K;

    public c(n n2, c c2, ArrayList<n> arrayList, double d2, double d3, double d4) {
        this.A = n2;
        this.P = c2;
        this.c = arrayList;
        this.d = d2;
        this.U = d3;
        this.K = d4;
    }

    public n x() {
        return this.A;
    }

    public void l(n n2) {
        this.A = n2;
    }

    public c X() {
        return this.P;
    }

    public void W(c c2) {
        this.P = c2;
    }

    public ArrayList<n> z() {
        return this.c;
    }

    public void w(ArrayList<n> arrayList) {
        this.c = arrayList;
    }

    public double b() {
        return this.d;
    }

    public void h(double d2) {
        this.d = d2;
    }

    public double D() {
        return this.U;
    }

    public void d(double d2) {
        this.U = d2;
    }

    public double z() {
        return this.K;
    }

    public void H(double d2) {
        this.K = d2;
    }
}

