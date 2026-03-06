/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.y.u.I;

import dev.idhammai.c.y.u.I.f;

public final class c {
    public final float p;
    public final float K;
    public final float s;
    public final int E;
    public final int S;
    public final int Q;
    public final int o;
    public final int L;
    public final float f;
    public final float Z;
    public final int M;
    public final int a;

    public c(float f2, float f3, float f4, int n2, int n3, int n4, int n5, int n6, float f5, float f6, int n7, int n8) {
        this.p = f2;
        this.K = f3;
        this.s = f4;
        this.E = n2;
        this.S = n3;
        this.Q = n4;
        this.o = n5;
        this.L = n6;
        this.f = f5;
        this.Z = f6;
        this.M = n7;
        this.a = n8;
    }

    public float l(int n2) {
        return this.p == 0.0f ? (float)n2 : (float)n2 / this.p;
    }

    public float D(int n2) {
        return this.p == 0.0f ? (float)n2 : ((float)n2 - this.K) / this.p;
    }

    public float L() {
        return this.p == 0.0f ? (float)this.E : (float)this.E / this.p;
    }

    public float X(f f2) {
        return this.s + (float)f2.ordinal() * this.L();
    }

    public float G(f f2) {
        return this.X(f2) + this.f;
    }

    public float x() {
        return this.Z;
    }
}

