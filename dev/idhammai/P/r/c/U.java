/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1309
 */
package dev.idhammai.P.r.c;

import net.minecraft.class_1309;

public class U {
    private static final U W = new U();
    private class_1309 J;
    private double C;
    private double x;
    private double p;
    private float E;
    private float a;
    private long j;

    private U() {
    }

    public static U z(class_1309 class_13092, double d2, double d3, double d4, float f2, float f3, long l2) {
        U.W.J = class_13092;
        U.W.C = d2;
        U.W.x = d3;
        U.W.p = d4;
        U.W.E = f2;
        U.W.a = f3;
        U.W.j = l2;
        return W;
    }

    public double q() {
        return this.C;
    }

    public double K() {
        return this.x;
    }

    public double B() {
        return this.p;
    }

    public class_1309 R() {
        return this.J;
    }

    public float y() {
        return this.E;
    }

    public float P() {
        return this.a;
    }

    public long v() {
        return this.j;
    }
}

