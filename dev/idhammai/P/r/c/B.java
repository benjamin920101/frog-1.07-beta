/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 */
package dev.idhammai.P.r.c;

import dev.idhammai.P.r.L;
import net.minecraft.entity.Entity;

public class B
extends L {
    private static final B P = new B();
    private class_1297 u;
    private double g;
    private double s;

    private B() {
    }

    public static B I(class_1297 class_12972, double d2, double d3) {
        B.P.u = class_12972;
        B.P.g = d2;
        B.P.s = d3;
        P.G(false);
        return P;
    }

    public class_1297 d() {
        return this.u;
    }

    public double n() {
        return this.g;
    }

    public double G() {
        return this.s;
    }
}

