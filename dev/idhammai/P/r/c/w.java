/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 */
package dev.idhammai.P.r.c;

import dev.idhammai.P.r.L;
import net.minecraft.entity.Entity;

public class w
extends L {
    private static final w E = new w();
    private class_1297 H;
    private double J;
    private double O;
    private double X;
    private boolean w;

    private w() {
    }

    public static w K(class_1297 class_12972, double d2, double d3, double d4, boolean bl) {
        dev.idhammai.P.r.c.w.E.H = class_12972;
        dev.idhammai.P.r.c.w.E.J = d2;
        dev.idhammai.P.r.c.w.E.O = d3;
        dev.idhammai.P.r.c.w.E.X = d4;
        dev.idhammai.P.r.c.w.E.w = bl;
        E.G(false);
        return E;
    }

    public double n() {
        return this.J;
    }

    public double t() {
        return this.O;
    }

    public double V() {
        return this.X;
    }

    public void g(double d2) {
        this.J = d2;
    }

    public void r(double d2) {
        this.O = d2;
    }

    public void N(double d2) {
        this.X = d2;
    }

    public class_1297 W() {
        return this.H;
    }

    public void d(class_1297 class_12972) {
        this.H = class_12972;
    }

    public boolean J() {
        return this.w;
    }
}

