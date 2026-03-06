/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.Box
 *  net.minecraft.client.util.math.MatrixStack
 */
package dev.idhammai.P.r.c;

import dev.idhammai.P.A.S.K;
import java.awt.Color;
import net.minecraft.util.math.Box;
import net.minecraft.client.util.math.MatrixStack;

public class R {
    private static final R a = new R();
    public class_4587 m;
    public float h;

    public static R K(class_4587 class_45872, float f2) {
        R.a.m = class_45872;
        R.a.h = f2;
        return a;
    }

    public void z(class_238 class_2383, Color color) {
        K.N(this.m, class_2383, color);
    }

    public void g(class_238 class_2383, Color color) {
        K.F(this.m, class_2383, color);
    }
}

