/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.util.InputUtil
 *  net.minecraft.util.math.RotationAxis
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 */
package dev.idhammai.c.y.R.V;

import dev.idhammai.Frog;
import dev.idhammai.P.A.A.S;
import dev.idhammai.P.A.A.k;
import dev.idhammai.P.A.S.f;
import dev.idhammai.P.A.S.o;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.q.N.P;
import dev.idhammai.c.y.R.V.O;
import dev.idhammai.c.y.R.V.T;
import dev.idhammai.c.y.u.C.K;
import dev.idhammai.c.y.u.I.t;
import java.awt.Color;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.InputUtil;
import net.minecraft.util.math.RotationAxis;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

public class v
extends O {
    private final W M;
    private final k s = new k();
    private final k S = new k();

    public v(W w2) {
        super(w2.e());
        double d2;
        double d3;
        this.M = w2;
        this.s.a = d3 = w2.h() ? 1.0 : 0.0;
        this.s.h = d3;
        this.S.a = d2 = w2.f() ? 1.0 : 0.0;
        this.S.h = d2;
    }

    @Override
    public void B(class_332 class_3322, int n2, int n3, float f2) {
        boolean bl;
        float f3;
        float f4;
        float f5;
        int n4;
        Object object;
        boolean bl2;
        boolean bl3 = this.l(n2, n3);
        double d2 = this.s.g(this.m() ? 1.0 : 0.0, 160L, dev.idhammai.P.A.A.S.CubicInOut);
        double d3 = this.G();
        int n5 = bl3 ? P.M().pq.V() : P.M().pa.V();
        float f6 = (float)this.u + 7.0f;
        float f7 = (float)this.a - 0.5f;
        float f8 = this.M(this.E, (float)this.a - 0.5f);
        boolean bl4 = bl2 = bl3 && class_3675.method_15987((long)W.method_22683().method_4490(), (int)340);
        int n6 = bl2 ? g : (this.m() ? g : R);
        this.q(bl2 ? "Reset Default" : this.M.Q(), this.p + 2.3f, f8, n6);
        float f9 = 2.0f;
        float f10 = Math.max(8.0f, f7 - 6.0f);
        float f11 = f10 * 1.5f;
        float f12 = this.E + (f7 - f10) / 2.0f;
        if (this.M.y()) {
            object = ">";
            int n7 = this.n((String)object);
            n4 = this.W();
            float f13 = this.p + f6 - (float)n7 - 3.0f;
            float f14 = 4.0f;
            f5 = f13 - f14 - f11;
            double d4 = this.S.g(this.M.f() ? 1.0 : 0.0, 160L, dev.idhammai.P.A.A.S.CubicInOut);
            f4 = (float)(90.0 * d4);
            f3 = f13 + (float)n7 / 2.0f;
            float f15 = f8 + (float)n4 / 2.0f;
            class_3322.method_51448().method_22903();
            class_3322.method_51448().method_46416(f3, f15, 0.0f);
            class_3322.method_51448().method_22907(class_7833.field_40718.rotationDegrees(f4));
            this.q((String)object, -((float)n7) / 2.0f, -((float)n4) / 2.0f, n6);
            class_3322.method_51448().method_22909();
        } else {
            f5 = this.p + f6 - f11 - f9;
        }
        object = P.M().b(d3);
        Color color = new Color(((Color)object).getRed(), ((Color)object).getGreen(), ((Color)object).getBlue(), n5);
        n4 = bl3 ? 200 : 160;
        Color color2 = new Color(80, 80, 80, n4);
        Color color3 = f.U(color2, color, d2);
        float f16 = f10 / 2.0f;
        if (P.M().pM.X() == dev.idhammai.c.r.q.N.S.Shader && this.m()) {
            Frog.SHADER.u(() -> v.lambda$drawScreen$0(class_3322, f5, f12, f11, f10, f16, color3));
        } else {
            o.j(class_3322.method_51448(), f5, f12, f11, f10, f16, color3);
        }
        float f17 = Math.max(1.0f, f16 - 1.5f);
        f4 = f5 + f16 + (float)((double)(f11 - f10) * d2);
        f3 = f12 + f16;
        Color color4 = f.y(P.M().ps.P(), 230);
        boolean bl5 = bl = P.M().pM.X() == dev.idhammai.c.r.q.N.S.Shader && Frog.SHADER != null && Frog.SHADER.s();
        if (bl) {
            int[] nArray = Frog.SHADER.h();
            Matrix4f matrix4f = new Matrix4f((Matrix4fc)class_3322.method_51448().method_23760().method_23761());
            Frog.SHADER.Q(() -> v.lambda$drawScreen$1(class_3322, matrix4f, nArray, f4, f3, f17, color4));
        } else {
            o.Q(class_3322.method_51448(), f4, f3, f17, color4, 64);
        }
    }

    @Override
    public void E() {
        this.q(!this.M.D());
    }

    @Override
    public void d(int n2, int n3, int n4) {
        if (n4 == 0 && this.l(n2, n3) && class_3675.method_15987((long)W.method_22683().method_4490(), (int)340)) {
            if (this.M.y()) {
                boolean bl = false;
                for (K k2 : dev.idhammai.c.y.u.I.t.a().n()) {
                    for (T t2 : k2.n()) {
                        if (!t2.Z().F().contains(this.M)) continue;
                        t2.s(this.M);
                        bl = true;
                        break;
                    }
                    if (!bl) continue;
                }
            }
            this.M.x(this.M.z());
            v.L();
            return;
        }
        super.d(n2, n3, n4);
        if (n4 == 1 && this.l(n2, n3)) {
            v.L();
            this.M.r(!this.M.f());
        }
    }

    @Override
    public void T() {
        this.M.x(!this.M.h());
    }

    @Override
    public boolean m() {
        return this.M.h();
    }

    private static void lambda$drawScreen$1(class_332 class_3322, Matrix4f matrix4f, int[] nArray, float f2, float f3, float f4, Color color) {
        class_3322.method_51448().method_22903();
        class_3322.method_51448().method_23760().method_23761().set((Matrix4fc)matrix4f);
        if (nArray != null) {
            class_3322.method_44379(nArray[0], nArray[1], nArray[2], nArray[3]);
        }
        o.Q(class_3322.method_51448(), f2, f3, f4, color, 64);
        if (nArray != null) {
            class_3322.method_44380();
        }
        class_3322.method_51448().method_22909();
    }

    private static void lambda$drawScreen$0(class_332 class_3322, float f2, float f3, float f4, float f5, float f6, Color color) {
        o.j(class_3322.method_51448(), f2, f3, f4, f5, f6, color);
    }
}

