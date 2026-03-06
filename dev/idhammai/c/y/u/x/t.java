/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.util.math.MatrixStack
 */
package dev.idhammai.c.y.u.x;

import dev.idhammai.P.A.A.m;
import dev.idhammai.P.A.S.o;
import dev.idhammai.c.r.q.N.P;
import dev.idhammai.c.r.q.N.l;
import dev.idhammai.c.y.u.x.B;
import dev.idhammai.p.J.n;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.math.MatrixStack;

public final class t {
    private final Random y = new Random();
    private final ArrayList<B> k = new ArrayList();

    public void U(class_332 class_3322, P p2) {
        if (p2 == null || !p2.M.h()) {
            if (!this.k.isEmpty()) {
                this.k.clear();
            }
            return;
        }
        float f2 = (float)p2.pO;
        if (f2 <= 0.01f) {
            return;
        }
        int n2 = class_3322.method_51421();
        int n3 = class_3322.method_51443();
        int n4 = Math.max(0, p2.U.V());
        while (this.k.size() < n4) {
            this.k.add(this.s(n2, n3, true));
        }
        while (this.k.size() > n4) {
            this.k.remove(this.k.size() - 1);
        }
        float f3 = m.J();
        if (f3 <= 0.0f) {
            f3 = 0.016f;
        }
        float f4 = p2.D.Z();
        float f5 = p2.Y.Z();
        float f6 = p2.K.Z();
        int n5 = (int)Math.round((double)p2.A.V() * (double)f2);
        n5 = Math.max(0, Math.min(255, n5));
        Color color = new Color(255, 255, 255, n5);
        for (int i2 = 0; i2 < this.k.size(); ++i2) {
            B b2 = this.k.get(i2);
            b2.H += f4 * b2.C * f3;
            b2.l += f6 * f3 + (float)Math.sin(b2.H * 0.02f + b2.D) * b2.P * f3;
            float f7 = Math.max(0.3f, f5 * b2.g);
            if (b2.H > (float)n3 + f7 + 2.0f || b2.l < -10.0f || b2.l > (float)n2 + 10.0f) {
                this.k.set(i2, this.s(n2, n3, false));
                continue;
            }
            if (p2.pw.X() == l.Circle) {
                o.Q(class_3322.method_51448(), b2.l, b2.H, f7, color, 16);
                continue;
            }
            if (n.g != null) {
                String string = "Z";
                float f8 = n.g.V();
                float f9 = n.g.b(string);
                float f10 = f7 * 2.0f;
                float f11 = f8 > 0.0f ? f10 / f8 : 1.0f;
                class_4587 class_45872 = class_3322.method_51448();
                class_45872.method_22903();
                class_45872.method_46416(b2.l, b2.H, 0.0f);
                class_45872.method_22905(f11, f11, 1.0f);
                n.g.X(class_45872, string, -f9 / 2.0f, -f8 / 2.0f, color.getRGB());
                class_45872.method_22909();
                continue;
            }
            this.J(class_3322.method_51448(), b2.l, b2.H, f7, color.getRGB(), b2.D + b2.H * 0.01f);
        }
    }

    private void J(class_4587 class_45872, float f2, float f3, float f4, int n2, float f5) {
        float f6 = f4 * 0.45f;
        float f7 = 0.65f;
        for (int i2 = 0; i2 < 3; ++i2) {
            double d2 = (double)f5 + (double)i2 * 1.0471975511965976;
            float f8 = (float)Math.cos(d2) * f4;
            float f9 = (float)Math.sin(d2) * f4;
            o.i(class_45872, f2 - f8, f3 - f9, f2 + f8, f3 + f9, n2);
            float f10 = f2 + f8 * f7;
            float f11 = f3 + f9 * f7;
            o.i(class_45872, f10, f11, f10 + (float)Math.cos(d2 + 0.5235987755982988) * f6, f11 + (float)Math.sin(d2 + 0.5235987755982988) * f6, n2);
            o.i(class_45872, f10, f11, f10 + (float)Math.cos(d2 - 0.5235987755982988) * f6, f11 + (float)Math.sin(d2 - 0.5235987755982988) * f6, n2);
            double d3 = d2 + Math.PI;
            float f12 = f2 - f8 * f7;
            float f13 = f3 - f9 * f7;
            o.i(class_45872, f12, f13, f12 + (float)Math.cos(d3 + 0.5235987755982988) * f6, f13 + (float)Math.sin(d3 + 0.5235987755982988) * f6, n2);
            o.i(class_45872, f12, f13, f12 + (float)Math.cos(d3 - 0.5235987755982988) * f6, f13 + (float)Math.sin(d3 - 0.5235987755982988) * f6, n2);
        }
    }

    private B s(int n2, int n3, boolean bl) {
        float f2 = this.y.nextInt(Math.max(1, n2));
        float f3 = bl ? (float)this.y.nextInt(Math.max(1, n3)) : -5.0f - this.y.nextFloat() * 20.0f;
        float f4 = this.y.nextFloat() * ((float)Math.PI * 2);
        float f5 = 10.0f + this.y.nextFloat() * 40.0f;
        float f6 = 0.55f + this.y.nextFloat() * 1.05f;
        float f7 = 0.6f + this.y.nextFloat() * 1.2f;
        return new B(f2, f3, f4, f5, f6, f7);
    }
}

