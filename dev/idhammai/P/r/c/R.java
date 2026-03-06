/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_238
 *  net.minecraft.class_4587
 */
package dev.idhammai.P.r.c;

import dev.idhammai.P.A.S.K;
import java.awt.Color;
import net.minecraft.class_238;
import net.minecraft.class_4587;

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

