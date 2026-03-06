/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.client.gui.DrawContext
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 */
package dev.idhammai.c.y.u.C;

import com.mojang.blaze3d.systems.RenderSystem;
import dev.idhammai.Frog;
import dev.idhammai.P.A.A.m;
import dev.idhammai.P.A.J;
import dev.idhammai.P.A.S.o;
import dev.idhammai.c.r.q.N.I;
import dev.idhammai.c.r.q.N.P;
import dev.idhammai.c.r.q.N.S;
import dev.idhammai.c.y.u.C.K;
import dev.idhammai.c.y.u.C.q;
import dev.idhammai.c.y.u.I.f;
import dev.idhammai.c.y.u.I.t;
import dev.idhammai.p.J.n;
import java.awt.Color;
import java.util.ArrayList;
import net.minecraft.client.gui.DrawContext;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

public final class G {
    private final t L;
    private final ArrayList<q> s = new ArrayList();
    private float o;
    private float n;
    private boolean J;
    private float c;
    private boolean v;
    private float k = 1.0f;

    public G(t t2) {
        this.L = t2;
    }

    public void d() {
        this.s.clear();
    }

    public void F(q q2) {
        this.s.add(q2);
    }

    public void J(float f2) {
        this.k = f2;
    }

    public void B(class_332 class_3322, int n2, int n3) {
        float f2;
        Object object;
        int n4;
        if (dev.idhammai.P.A.J.W == null || dev.idhammai.P.A.J.W.method_22683() == null) {
            return;
        }
        P p2 = P.M();
        if (p2 == null) {
            return;
        }
        boolean bl = I.Q != null && I.Q.C.h();
        this.X(dev.idhammai.P.A.J.W.method_22683().method_4486(), bl);
        boolean bl2 = dev.idhammai.p.J.n.s();
        boolean bl3 = dev.idhammai.p.J.n.w();
        q q2 = null;
        f f3 = this.L.B();
        for (q q3 : this.s) {
            if (f3 != q3.T) continue;
            q2 = q3;
            break;
        }
        if (q2 == null) {
            return;
        }
        float f4 = m.J();
        if (f4 <= 0.0f) {
            f4 = 0.016f;
        }
        this.L.z().E();
        float f5 = (float)q2.a - 0.5f;
        float f6 = f5 + 2.0f;
        boolean bl4 = false;
        if (f3 == f.Module) {
            int n5 = Integer.MAX_VALUE;
            for (K k2 : this.L.n()) {
                n5 = Math.min(n5, k2.a());
            }
            if (n5 != Integer.MAX_VALUE && (float)n5 < f6) {
                bl4 = true;
            } else if (this.L.j().M() && this.L.j().d() < f6) {
                bl4 = true;
            } else {
                float f7 = (float)dev.idhammai.P.A.J.W.method_22683().method_4502() / 6.0f;
                float f8 = f7 - 18.0f - 10.0f + this.L.z().o();
                if (f8 < f6) {
                    bl4 = true;
                }
            }
        }
        float f9 = bl4 ? -((float)q2.a + 2.0f) : 0.0f;
        float f10 = f4 * 14.0f;
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 0.35f) {
            f10 = 0.35f;
        }
        if (!this.v) {
            this.c = f9;
            this.v = true;
        } else {
            this.c += (f9 - this.c) * f10;
        }
        float f11 = f4 * 18.0f;
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        if (f11 > 0.35f) {
            f11 = 0.35f;
        }
        float f12 = q2.N;
        float f13 = q2.h;
        if (!this.J) {
            this.o = f12;
            this.n = f13;
            this.J = true;
        } else {
            this.o += (f12 - this.o) * f11;
            this.n += (f13 - this.n) * f11;
        }
        int n6 = p2.G.P().getRGB();
        boolean bl5 = p2.pM.X() == S.Shader && Frog.SHADER != null && Frog.SHADER.s();
        float f14 = 6.0f;
        float f15 = this.o;
        float f16 = this.o + this.n;
        int n7 = this.s.size() - 1;
        Color color = new Color(n6, true);
        int n8 = color.getAlpha();
        int n9 = Math.max(0, Math.min(255, Math.round((float)n8 * this.k)));
        Color color2 = new Color(color.getRed(), color.getGreen(), color.getBlue(), n9);
        for (n4 = 0; n4 < this.s.size(); ++n4) {
            float f17;
            boolean bl6;
            object = this.s.get(n4);
            float f18 = ((q)object).N;
            float f19 = ((q)object).N + ((q)object).h;
            float f20 = (float)((q)object).O + this.c;
            float f21 = (float)((q)object).a - 0.5f;
            boolean bl7 = n4 == 0;
            boolean bl8 = bl6 = n4 == n7;
            if (bl5) {
                f2 = Math.min(f19, f15);
                f17 = Math.max(f18, f16);
                float f22 = f18;
                float f23 = f20;
                float f24 = f19;
                float f25 = f21;
                boolean bl9 = bl7;
                boolean bl10 = bl6;
                Matrix4f matrix4f = new Matrix4f((Matrix4fc)class_3322.method_51448().method_23760().method_23761());
                Frog.SHADER.Q(() -> G.lambda$render$0(class_3322, matrix4f, f2, f22, bl9, f14, bl10, f24, f23, f25, color2, f17));
                continue;
            }
            f2 = bl7 ? f14 : 0.0f;
            f17 = bl6 ? f14 : 0.0f;
            dev.idhammai.P.A.S.o.i(class_3322.method_51448(), f18, f20, f19 - f18, f21, 0.0f, 0.0f, f17, f2, 0.0f, color, color, color, color);
        }
        n4 = p2.pa.V();
        object = () -> this.lambda$render$1(f14, p2, n4, class_3322);
        if (p2.pM.X() == S.Shader) {
            Frog.SHADER.u((Runnable)object);
        } else {
            object.run();
        }
        for (q q4 : this.s) {
            boolean bl11 = f3 == q4.T;
            int n10 = bl11 ? p2.ps.P().getRGB() : p2.w.P().getRGB();
            float f26 = this.L.K((float)q4.O + this.c, (float)q4.a - 0.5f);
            String string = q4.M(bl);
            f2 = (float)q4.N + ((float)q4.h - (float)this.L.F(string)) / 2.0f;
            dev.idhammai.P.A.S.n.h(class_3322, string, f2, f26, n10, bl2, bl3);
        }
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    public f U(int n2, int n3) {
        if (dev.idhammai.P.A.J.W == null || dev.idhammai.P.A.J.W.method_22683() == null) {
            return null;
        }
        boolean bl = I.Q != null && I.Q.C.h();
        this.X(dev.idhammai.P.A.J.W.method_22683().method_4486(), bl);
        for (q q2 : this.s) {
            float f2 = (float)q2.O + this.c;
            if (n2 < q2.N || n2 > q2.N + q2.h || !((float)n3 >= f2) || !((float)n3 <= f2 + (float)q2.a)) continue;
            return q2.T;
        }
        return null;
    }

    private void X(int n2, boolean bl) {
        int n3;
        Object object;
        int n4;
        int n5 = 0;
        int n6 = 8;
        int n7 = 0;
        int n8 = this.L.T() + 6;
        int n9 = 0;
        for (n4 = 0; n4 < this.s.size(); ++n4) {
            q q2 = this.s.get(n4);
            object = q2.M(bl);
            int n10 = this.L.F((String)object) + n6 * 2;
            n9 = Math.max(n9, n10);
            q2.a = n8;
            q2.O = n7;
        }
        n4 = this.s.isEmpty() ? 0 : n9 * this.s.size() + n5 * (this.s.size() - 1);
        for (n3 = 0; n3 < this.s.size(); ++n3) {
            object = this.s.get(n3);
            ((q)object).h = n9;
        }
        n3 = Math.round(((float)n2 - (float)n4) / 2.0f);
        for (int i2 = 0; i2 < this.s.size(); ++i2) {
            q q3 = this.s.get(i2);
            q3.N = n3;
            n3 += q3.h + n5;
        }
    }

    private void lambda$render$1(float f2, P p2, int n2, class_332 class_3322) {
        for (int i2 = 0; i2 < this.s.size(); ++i2) {
            Color color;
            float f3;
            q q2 = this.s.get(i2);
            float f4 = q2.N;
            float f5 = q2.N + q2.h;
            float f6 = (float)q2.O + this.c;
            float f7 = (float)q2.a - 0.5f;
            float f8 = this.o;
            float f9 = this.o + this.n;
            float f10 = Math.max(f4, f8);
            float f11 = Math.min(f5, f9);
            if (!(f11 > f10)) continue;
            float f12 = f10;
            float f13 = f11 - f10;
            boolean bl = i2 == 0;
            boolean bl2 = i2 == this.s.size() - 1;
            float f14 = bl ? f2 : 0.0f;
            float f15 = bl2 ? f2 : 0.0f;
            float f16 = Math.abs(f12 - f4) < 0.1f ? f14 : f2;
            float f17 = f3 = Math.abs(f12 + f13 - f5) < 0.1f ? f15 : f2;
            if (p2.pM.X() == S.Shader) {
                color = new Color(255, 255, 255, Math.max(0, Math.min(255, n2)));
                dev.idhammai.P.A.S.o.i(class_3322.method_51448(), f12, f6, f13, f7, 0.0f, 0.0f, f3, f16, 0.0f, color, color, color, color);
                continue;
            }
            color = p2.q((double)f6 * 0.25);
            Color color2 = dev.idhammai.P.A.S.f.y(color, n2);
            dev.idhammai.P.A.S.o.i(class_3322.method_51448(), f12, f6, f13, f7, 0.0f, 0.0f, f3, f16, 0.0f, color2, color2, color2, color2);
        }
    }

    private static void lambda$render$0(class_332 class_3322, Matrix4f matrix4f, float f2, float f3, boolean bl, float f4, boolean bl2, float f5, float f6, float f7, Color color, float f8) {
        float f9;
        float f10;
        class_3322.method_51448().method_22903();
        class_3322.method_51448().method_23760().method_23761().set((Matrix4fc)matrix4f);
        float f11 = f2 - f3;
        if (f11 > 0.0f) {
            f10 = bl ? f4 : 0.0f;
            f9 = bl2 && Math.abs(f2 - f5) <= 0.001f ? f4 : 0.0f;
            dev.idhammai.P.A.S.o.i(class_3322.method_51448(), f3, f6, f11, f7, 0.0f, 0.0f, f9, f10, 0.0f, color, color, color, color);
        }
        if ((f10 = f5 - f8) > 0.0f) {
            f9 = bl2 ? f4 : 0.0f;
            dev.idhammai.P.A.S.o.i(class_3322.method_51448(), f8, f6, f10, f7, 0.0f, 0.0f, f9, 0.0f, 0.0f, color, color, color, color);
        }
        class_3322.method_51448().method_22909();
    }
}

