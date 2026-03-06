/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.Vec3d
 */
package dev.idhammai.P.r.c;

import net.minecraft.util.math.Vec3d;

public class W {
    private static final W U = new W();
    public float i;
    private class_243 d;
    private float v;
    private float w;
    private boolean D;
    private float P;

    private W() {
    }

    public static W K() {
        W.U.i = 0.0f;
        W.U.d = null;
        W.U.v = 0.0f;
        W.U.w = 0.0f;
        W.U.D = false;
        W.U.P = 0.0f;
        return U;
    }

    public class_243 f() {
        return this.d;
    }

    public float e() {
        return this.P;
    }

    public boolean m() {
        return this.D;
    }

    public float A() {
        return this.v;
    }

    public float k() {
        return this.w;
    }

    public void m(class_243 class_2432, float f2, float f3) {
        if (f3 >= this.i) {
            this.D = false;
            this.i = f3;
            this.d = class_2432;
            this.P = f2;
        }
    }

    public void D(float f2, float f3, float f4, float f5) {
        if (f5 >= this.i) {
            this.D = true;
            this.i = f5;
            this.v = f2;
            this.w = f3;
            this.P = f4;
        }
    }
}

