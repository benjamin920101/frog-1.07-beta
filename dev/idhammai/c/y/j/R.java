/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.gui.DrawContext
 */
package dev.idhammai.c.y.j;

import dev.idhammai.P.A.S.o;
import dev.idhammai.c.y.y.i;
import dev.idhammai.p.J.n;
import java.awt.Color;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;

public class R {
    public int K;
    public int U;
    public int S;
    public int d;
    public String W;
    public Runnable z;
    public boolean N;
    private float j = 0.0f;

    public R(int n2, int n3, int n4, int n5, String string, Runnable runnable) {
        this(n2, n3, n4, n5, string, runnable, true);
    }

    public R(int n2, int n3, int n4, int n5, String string, Runnable runnable, boolean bl) {
        this.K = n2;
        this.U = n3;
        this.S = n4;
        this.d = n5;
        this.W = string;
        this.z = runnable;
        this.N = bl;
    }

    public void u() {
        if (this.N && this.z != null) {
            this.z.run();
        }
    }

    public void l(class_332 class_3322, boolean bl, float f2, float f3) {
        i i2;
        if (f2 <= 0.0f) {
            return;
        }
        float f4 = bl && this.N ? 1.0f : 0.0f;
        this.j += (f4 - this.j) * 0.15f;
        float f5 = 0.8f + f2 * 0.2f;
        float f6 = (float)this.K + (float)this.S / 2.0f;
        float f7 = (float)this.U + (float)this.d / 2.0f;
        float f8 = f6 - (float)this.S / 2.0f * f5;
        float f9 = f7 - (float)this.d / 2.0f * f5;
        float f10 = (float)this.S * f5;
        float f11 = (float)this.d * f5;
        int n2 = this.N ? (int)(75.0f + this.j * 53.0f) : 50;
        n2 = Math.min(255, (int)((float)n2 * f2));
        o.j(class_3322.method_51448(), f8, f9, f10, f11, 4.0f * f5, new Color(0, 0, 0, n2));
        int n3 = this.N ? (int)(38.0f + this.j * 38.0f) : 25;
        n3 = Math.min(255, (int)((float)n3 * f2));
        o.d(class_3322.method_51448(), f8, f9, f10, f11, 4.0f * f5, new Color(255, 255, 255, n3), 4);
        int n4 = this.N ? Math.min(255, (int)(255.0f * f2)) : Math.min(255, (int)(128.0f * f2));
        Color color = new Color(255, 255, 255, n4);
        i i3 = i2 = n.r != null ? n.r : n.w;
        if (i2 != null) {
            float f12 = i2.b(this.W);
            float f13 = f8 + (f10 - f12) / 2.0f;
            float f14 = f9 + (f11 - i2.V()) / 2.0f;
            i2.H(class_3322.method_51448(), this.W, f13, f14, color.getRGB(), false);
        } else {
            int n5 = class_3322.method_51448() != null ? class_310.method_1551().field_1772.method_1727(this.W) : 0;
            int n6 = (int)(f8 + (f10 - (float)n5) / 2.0f);
            int n7 = (int)(f9 + (f11 - 8.0f) / 2.0f);
            class_3322.method_51433(class_310.method_1551().field_1772, this.W, n6, n7, color.getRGB(), false);
        }
    }
}

