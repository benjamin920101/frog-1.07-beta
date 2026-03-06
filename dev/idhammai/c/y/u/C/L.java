/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.util.StringHelper
 */
package dev.idhammai.c.y.u.C;

import dev.idhammai.Frog;
import dev.idhammai.P.A.A.S;
import dev.idhammai.P.A.A.k;
import dev.idhammai.P.A.S.o;
import dev.idhammai.c.r.q.N.I;
import dev.idhammai.c.r.q.N.P;
import dev.idhammai.c.y.u.A.e;
import dev.idhammai.c.y.u.C.K;
import dev.idhammai.c.y.u.I.c;
import dev.idhammai.c.y.u.I.f;
import dev.idhammai.c.y.u.I.t;
import dev.idhammai.p.J.n;
import java.awt.Color;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.util.StringHelper;

public final class L {
    private final t M;
    private String n = "";
    private boolean I;
    private final k W = new k();
    private float i;
    private float H;
    private float e;
    private float D;
    private float F;
    private float w;
    private float X;
    private float Z;
    private final k U = new k();
    private final k v = new k();

    public L(t t2) {
        this.M = t2;
    }

    public void p(class_332 class_3322, int n2, int n3, float f2, float f3, c c2, boolean bl, P p2) {
        int n4;
        float f4;
        float f5;
        float f6;
        boolean bl2;
        Object object;
        int n5;
        boolean bl3;
        if (p2 == null) {
            return;
        }
        float f7 = (float)class_3322.method_51421() / 2.0f;
        float f8 = (float)class_3322.method_51443() / 2.0f;
        class_3322.method_51448().method_22903();
        class_3322.method_51448().method_46416(f7, f8 + f3, 0.0f);
        class_3322.method_51448().method_22905(f2, f2, 1.0f);
        class_3322.method_51448().method_46416(-f7, -f8, 0.0f);
        this.C(c2, class_3322.method_51421(), class_3322.method_51443());
        float f9 = f2 <= 1.0E-4f ? 1.0E-4f : f2;
        float f10 = ((float)n2 - f7) / f9 + f7;
        float f11 = ((float)n3 - (f8 + f3)) / f9 + f8;
        boolean bl4 = f10 >= this.i && f10 <= this.i + this.e && f11 >= this.H && f11 <= this.H + this.D;
        boolean bl5 = this.M.B() == f.Module;
        boolean bl6 = bl5 && bl4;
        boolean bl7 = bl3 = bl5 && this.I;
        double d2 = this.W.g(bl3 ? 1.0 : (bl6 ? 0.6 : 0.0), 120L, S.CubicInOut);
        boolean bl8 = bl && Frog.SHADER != null && Frog.SHADER.s();
        Color color = p2.G.P();
        Color color2 = p2.pH.P();
        Color color3 = dev.idhammai.P.A.S.f.y(color, bl5 ? 175 : 140);
        Color color4 = dev.idhammai.P.A.S.f.y(color, 215);
        Color color5 = dev.idhammai.P.A.S.f.y(color2, 220);
        double d3 = Math.min(1.0, d2 / 0.6);
        Color color6 = bl3 ? dev.idhammai.P.A.S.f.U(color4, color5, d2) : dev.idhammai.P.A.S.f.U(color3, color4, d3);
        int n6 = Math.max(0, Math.min(255, color6.getAlpha() + 12));
        int n7 = Math.max(0, Math.min(255, color6.getAlpha() - 10));
        Color color7 = new Color(color6.getRed(), color6.getGreen(), color6.getBlue(), n6);
        Color color8 = new Color(color6.getRed(), color6.getGreen(), color6.getBlue(), n7);
        o.z(class_3322.method_51448(), this.i, this.H, this.e, this.D, 6.0f, color7, color7, color8, color8);
        int n8 = n5 = bl5 ? (int)Math.round(55.0 + 145.0 * d2) : 40;
        if (bl8) {
            object = new Color(255, 255, 255, Math.max(0, Math.min(255, n5)));
            Frog.SHADER.u(() -> this.lambda$render$0(class_3322, (Color)object));
        } else {
            double d4 = (double)this.H / 10.0;
            Color color9 = p2.q(d4);
            Color color10 = dev.idhammai.P.A.S.f.y(color9, Math.max(0, Math.min(255, n5)));
            o.J(class_3322.method_51448(), this.i, this.H, this.e, this.D, 6.0f, 1.0f, color10, color10, color10, color10);
        }
        object = "S";
        float f12 = dev.idhammai.p.J.n.g != null ? dev.idhammai.p.J.n.g.b((String)object) : 0.0f;
        float f13 = this.i + 7.0f;
        float f14 = this.H + (this.D - (dev.idhammai.p.J.n.g != null ? dev.idhammai.p.J.n.g.V() : (float)this.M.T())) / 2.0f;
        int n9 = bl5 ? (int)Math.round(120.0 + 100.0 * d2) : 110;
        int n10 = dev.idhammai.P.A.S.f.y(p2.ps.P(), Math.max(0, Math.min(255, n9))).getRGB();
        if (dev.idhammai.p.J.n.g != null) {
            dev.idhammai.p.J.n.g.X(class_3322.method_51448(), (String)object, f13, f14, n10);
        }
        boolean bl9 = bl5 && this.n != null && !this.n.isEmpty();
        float f15 = this.D - 6.0f;
        float f16 = this.i + this.e - f15 - 4.0f;
        float f17 = this.H + (this.D - f15) / 2.0f;
        boolean bl10 = bl2 = bl9 && f10 >= f16 && f10 <= f16 + f15 && f11 >= f17 && f11 <= f17 + f15;
        if (bl9) {
            Object object2;
            int n11;
            int n12 = n11 = bl2 ? 190 : 135;
            if (bl && Frog.SHADER != null && Frog.SHADER.s()) {
                object2 = new Color(255, 255, 255, Math.max(0, Math.min(255, n11)));
                Frog.SHADER.u(() -> L.lambda$render$1(class_3322, f16, f17, f15, (Color)object2));
            } else {
                object2 = dev.idhammai.P.A.S.f.y(p2.G.P(), n11);
                o.j(class_3322.method_51448(), f16, f17, f15, f15, f15 / 2.0f, (Color)object2);
            }
            object2 = "x";
            f6 = this.M.F((String)object2);
            f5 = f16 + (f15 - f6) / 2.0f;
            f4 = this.M.K(f17, f15);
            n4 = dev.idhammai.P.A.S.f.y(p2.ps.P(), bl2 ? 235 : 190).getRGB();
            dev.idhammai.P.A.S.n.h(class_3322, (String)object2, f5, f4, n4, dev.idhammai.p.J.n.s(), true);
        }
        float f18 = 7.0f + f12 + 6.0f;
        float f19 = 6.0f + (bl9 ? f15 + 4.0f : 0.0f);
        f6 = this.i + f18;
        f5 = this.H + (this.D - (float)this.M.T()) / 2.0f;
        f4 = this.e - f18 - f19;
        n4 = this.n == null || this.n.isEmpty() ? 1 : 0;
        boolean bl11 = dev.idhammai.c.r.q.N.I.Q != null && dev.idhammai.c.r.q.N.I.Q.C.h();
        String string = bl11 ? "\u641c\u7d22..." : "Search...";
        String string2 = n4 != 0 ? string : this.n;
        String string3 = this.S(string2, f4);
        int n13 = !bl5 ? dev.idhammai.P.A.S.f.y(p2.w.P(), n4 != 0 ? 140 : 200).getRGB() : (n4 != 0 && !bl3 ? dev.idhammai.P.A.S.f.y(p2.w.P(), 150).getRGB() : p2.ps.P().getRGB());
        dev.idhammai.P.A.S.n.h(class_3322, string3, f6, f5, n13, dev.idhammai.p.J.n.s(), true);
        if (bl3 && System.currentTimeMillis() % 1000L > 500L) {
            float f20 = f6 + (float)this.M.F(string3) + 1.0f;
            float f21 = this.H + 4.0f;
            float f22 = this.D - 8.0f;
            if (!bl9 || f20 + 2.0f < f16) {
                if (bl && Frog.SHADER != null && Frog.SHADER.s()) {
                    int n14 = 230;
                    Frog.SHADER.u(() -> L.lambda$render$2(class_3322, f20, f21, f22, n14));
                } else {
                    o.F(class_3322.method_51448(), f20, f21, 1.0f, f22, dev.idhammai.P.A.S.f.y(p2.ps.P(), 230).getRGB());
                }
            }
        }
        class_3322.method_51448().method_22909();
    }

    public boolean l(double d2, double d3, int n2, c c2, int n3, int n4) {
        boolean bl;
        if (this.M.B() != f.Module) {
            return false;
        }
        float f2 = (float)P.M().pO;
        float f3 = f2 <= 1.0E-4f ? 1.0E-4f : f2;
        float f4 = (float)n3 / 2.0f;
        float f5 = (float)n4 / 2.0f;
        float f6 = (1.0f - f2) * 20.0f;
        float f7 = ((float)d2 - f4) / f3 + f4;
        float f8 = ((float)d3 - (f5 + f6)) / f3 + f5;
        this.C(c2, n3, n4);
        boolean bl2 = f7 >= this.i && f7 <= this.i + this.e && f8 >= this.H && f8 <= this.H + this.D;
        boolean bl3 = this.n != null && !this.n.isEmpty();
        float f9 = this.D - 6.0f;
        float f10 = this.i + this.e - f9 - 4.0f;
        float f11 = this.H + (this.D - f9) / 2.0f;
        boolean bl4 = bl = bl3 && f7 >= f10 && f7 <= f10 + f9 && f8 >= f11 && f8 <= f11 + f9;
        if (n2 == 0) {
            if (bl2) {
                if (bl) {
                    this.n = "";
                    this.l();
                    this.I = true;
                    return true;
                }
                this.I = true;
                return true;
            }
            this.I = false;
        } else if (n2 == 1 && bl2) {
            this.n = "";
            this.l();
            return true;
        }
        return false;
    }

    public boolean c(int n2) {
        if (!this.I || this.M.B() != f.Module) {
            return false;
        }
        if (n2 == 256) {
            this.I = false;
            return true;
        }
        if (n2 == 257 || n2 == 335) {
            this.I = false;
            return true;
        }
        if (n2 == 259) {
            if (this.n.length() > 0) {
                this.n = this.n.substring(0, this.n.length() - 1);
                this.l();
            }
            return true;
        }
        return false;
    }

    public boolean f(char c2) {
        if (!this.I || this.M.B() != f.Module) {
            return false;
        }
        if (!class_3544.method_57175((char)c2)) {
            return false;
        }
        this.n = this.n + c2;
        if (this.n.length() > 32) {
            this.n = this.n.substring(0, 32);
        }
        this.l();
        return true;
    }

    public void r() {
        this.F = 0.0f;
        this.w = 0.0f;
        this.X = 0.0f;
        this.Z = 0.0f;
        this.U.a = 0.0;
        this.U.h = 0.0;
        this.v.a = 0.0;
        this.v.h = 0.0;
    }

    public void u(float f2, float f3) {
        this.F += f2;
        this.w += f3;
    }

    public void E() {
        P p2 = P.M();
        if (p2 == null) {
            this.X = this.F;
            this.Z = this.w;
            return;
        }
        boolean bl = p2.V.h();
        long l2 = Math.max(1, p2.Q.V());
        S s2 = p2.r.X();
        this.X = dev.idhammai.c.y.u.A.e.M(this.U, this.F, l2, s2, bl);
        this.Z = dev.idhammai.c.y.u.A.e.M(this.v, this.w, l2, s2, bl);
    }

    public float o() {
        return this.Z;
    }

    public void m(boolean bl) {
        this.I = bl;
    }

    private void l() {
        if (this.M.B() != f.Module) {
            return;
        }
        String string = (this.n == null ? "" : this.n).toLowerCase();
        for (K k2 : this.M.n()) {
            k2.h(string);
        }
    }

    private void C(c c2, int n2, int n3) {
        this.E();
        this.e = 160.0f;
        this.D = 18.0f;
        float f2 = (float)n3 / 6.0f;
        float f3 = c2 != null ? c2.G(f.Module) : 0.0f;
        float f4 = c2 != null ? c2.x() : 0.0f;
        this.i = (float)n2 / 2.0f - this.e / 2.0f + f3 + this.X;
        this.H = f2 - this.D - 10.0f + f4 + this.Z;
    }

    private String S(String string, float f2) {
        if (string == null) {
            return "";
        }
        if (f2 <= 0.0f) {
            return "";
        }
        if ((float)this.M.F(string) <= f2) {
            return string;
        }
        String string2 = string;
        while (string2.length() > 0 && (float)this.M.F(string2) > f2) {
            string2 = string2.substring(1);
        }
        return string2;
    }

    private static void lambda$render$2(class_332 class_3322, float f2, float f3, float f4, int n2) {
        o.F(class_3322.method_51448(), f2, f3, 1.0f, f4, dev.idhammai.P.A.S.f.k(Color.WHITE.getRGB(), n2));
    }

    private static void lambda$render$1(class_332 class_3322, float f2, float f3, float f4, Color color) {
        o.j(class_3322.method_51448(), f2, f3, f4, f4, f4 / 2.0f, color);
    }

    private void lambda$render$0(class_332 class_3322, Color color) {
        o.J(class_3322.method_51448(), this.i, this.H, this.e, this.D, 6.0f, 1.0f, color, color, color, color);
    }
}

