/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.P.A.A;

import dev.idhammai.Frog;
import dev.idhammai.P.A.A.A;
import dev.idhammai.P.A.J;

public class m
implements J {
    public static float J() {
        return Frog.FPS.B() > 5 ? 1.0f / (float)Frog.FPS.B() : 0.016f;
    }

    public static float v(float f2, float f3, float f4) {
        float f5 = A.p(m.J() * f4, 0.0f, 1.0f);
        return (1.0f - f5) * f2 + f5 * f3;
    }

    public static double N(double d2, double d3, double d4) {
        if (d4 >= 1.0) {
            return d3;
        }
        if (d4 == 0.0) {
            return d2;
        }
        boolean bl = d3 > d2;
        double d5 = Math.max(d3, d2) - Math.min(d3, d2);
        if (Math.abs(d5) <= 0.001) {
            return d3;
        }
        double d6 = d5 * d4;
        return d2 + (bl ? d6 : -d6);
    }
}

