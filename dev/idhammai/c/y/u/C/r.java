/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_1074
 *  net.minecraft.class_1792
 *  net.minecraft.class_2248
 *  net.minecraft.class_332
 *  net.minecraft.class_3544
 *  net.minecraft.class_3675
 *  net.minecraft.class_757
 *  net.minecraft.class_7923
 */
package dev.idhammai.c.y.u.C;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import dev.idhammai.Frog;
import dev.idhammai.P.A.A.A;
import dev.idhammai.P.A.A.S;
import dev.idhammai.P.A.A.k;
import dev.idhammai.P.A.A.m;
import dev.idhammai.P.A.S.f;
import dev.idhammai.P.A.S.o;
import dev.idhammai.c.r.q.N.I;
import dev.idhammai.c.r.q.N.J;
import dev.idhammai.c.r.q.N.P;
import dev.idhammai.c.y.R.V.O;
import dev.idhammai.c.y.u.C.K;
import dev.idhammai.c.y.u.C.i;
import dev.idhammai.c.y.u.I.t;
import dev.idhammai.p.J.B;
import dev.idhammai.p.J.D;
import dev.idhammai.p.J.V;
import dev.idhammai.p.J.n;
import dev.idhammai.p.J.x;
import dev.idhammai.p.R;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Objects;
import net.minecraft.class_1074;
import net.minecraft.class_1792;
import net.minecraft.class_2248;
import net.minecraft.class_332;
import net.minecraft.class_3544;
import net.minecraft.class_3675;
import net.minecraft.class_757;
import net.minecraft.class_7923;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class r {
    private final t i;
    private boolean H;
    private R n;
    private boolean P = true;
    private float z;
    private float E;
    private float Z;
    private float t;
    private float S;
    private float C;
    private float s;
    private float Q;
    private boolean A;
    private float e;
    private float I;
    private float N;
    private float m;
    private boolean r;
    private float D;
    private float J;
    private float R = 240.0f;
    private float Y = 320.0f;
    private String O = "";
    private boolean K;
    private final k X = new k();
    private final k F = new k();
    private float f;
    private float W;
    private float v;
    private float c;
    private final ArrayList<i> x = new ArrayList();
    private final ArrayList<i> T = new ArrayList();

    public r(t t2) {
        this.i = t2;
    }

    public boolean y() {
        if (this.n == null && !this.H) {
            return false;
        }
        return this.J() > 0.01;
    }

    public float y() {
        if (this.n == null && !this.H) {
            return 0.0f;
        }
        return (float)this.J();
    }

    public void l(R r2) {
        this.H = true;
        this.n = r2;
        this.P = true;
        this.O = "";
        this.K = false;
        this.P();
        this.F();
        this.R();
        this.A = false;
    }

    public void X() {
        this.H = false;
        this.K = false;
    }

    public void z(class_332 class_3322, int n2, int n3) {
        float f2;
        boolean bl;
        float f3;
        int n4;
        int n5;
        float f4;
        float f5;
        Color color;
        if (this.n == null) {
            return;
        }
        float f6 = (float)this.J();
        if (f6 <= 0.01f) {
            if (!this.H) {
                this.n = null;
            }
            return;
        }
        P p2 = dev.idhammai.c.r.q.N.P.M();
        boolean bl2 = dev.idhammai.p.J.n.w();
        int n6 = class_3322.method_51421();
        int n7 = class_3322.method_51443();
        this.R = Math.min(280.0f, (float)n6 - 30.0f);
        this.Y = Math.min(360.0f, (float)n7 - 30.0f);
        this.D = ((float)n6 - this.R) / 2.0f;
        this.J = ((float)n7 - this.Y) / 2.0f;
        this.N = dev.idhammai.P.A.A.m.v(this.N, this.I, 12.0f);
        if (p2 == null) {
            return;
        }
        float f7 = this.D + this.R / 2.0f;
        float f8 = this.J + this.Y / 2.0f;
        float f9 = f6;
        class_3322.method_51448().method_22903();
        class_3322.method_51448().method_46416(f7, f8, 0.0f);
        class_3322.method_51448().method_22905(f9, f9, 1.0f);
        class_3322.method_51448().method_46416(-f7, -f8, 0.0f);
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)f6);
        float f10 = p2.pj.V();
        double d2 = (double)this.J / 10.0;
        float f11 = this.D;
        float f12 = this.J;
        float f13 = this.R;
        dev.idhammai.c.y.u.C.K.m(class_3322, f11, f12, f13, f10, d2);
        dev.idhammai.c.y.u.C.K.H(class_3322, "H", dev.idhammai.c.y.u.C.r.g(this.n), f11, f12, f10, dev.idhammai.c.y.R.V.O.g);
        float f14 = this.D;
        float f15 = this.J + f10;
        float f16 = this.R;
        float f17 = this.Y - f10;
        float f18 = 6.0f;
        if (p2.p8.i) {
            color = dev.idhammai.P.A.S.f.y(p2.p8.P(), p2.pJ.V());
            o.i(class_3322.method_51448(), f14, f15, f16, f17, 0.0f, 0.0f, f18, f18, 0.0f, color, color, color, color);
        }
        if (p2.p8.i || p2.p7.X() == dev.idhammai.c.r.q.N.J.Transparent) {
            if (p2.pM.X() == dev.idhammai.c.r.q.N.S.Shader && Frog.SHADER != null) {
                Frog.SHADER.u(() -> r.lambda$render$0(p2, class_3322, f14, f15, f16, f17, f18));
            } else {
                color = dev.idhammai.P.A.S.f.y(p2.b(d2), p2.p4.V());
                o.i(class_3322.method_51448(), f14, f15, f16, f17, 0.0f, 0.0f, f18, f18, 1.0f, color, color, color, color);
            }
        }
        if (p2.s.h()) {
            float f19 = f15;
            f5 = this.J + this.Y;
            double d3 = 0.25;
            float f20 = f14 + 0.2f;
            f4 = f14 + f16;
            int n8 = p2.C.V();
            if (p2.pM.X() == dev.idhammai.c.r.q.N.S.Shader && Frog.SHADER != null) {
                var30_33 = 1.0f;
                Frog.SHADER.u(() -> r.lambda$render$1(class_3322, f20, f19, var30_33, f5, n8, f4));
            } else {
                var30_33 = 2.0f;
                for (float f21 = f19; f21 < f5; f21 += var30_33) {
                    float f22 = Math.min(f21 + var30_33, f5);
                    n5 = dev.idhammai.P.A.S.f.k(p2.b((double)f21 * d3).getRGB(), n8);
                    o.i(class_3322.method_51448(), f20, f22, f20, f21, n5);
                    o.i(class_3322.method_51448(), f4, f22, f4, f21, n5);
                }
            }
            n4 = dev.idhammai.P.A.S.f.k(p2.b((double)f5 * d3).getRGB(), n8);
            o.i(class_3322.method_51448(), f14, f5, f14 + f16, f5, n4);
        }
        float f23 = Math.max(8.0f, f10 - 6.0f);
        f5 = f11 + f13 - f23 - 4.0f;
        float f24 = f12 + (f10 - f23) / 2.0f;
        boolean bl3 = o.n(n2, n3, f5, f24, f23, f23);
        String string = ".";
        f4 = f5 + (f23 - dev.idhammai.p.J.n.g.b(string)) / 2.0f;
        float f25 = f24 + (f23 - dev.idhammai.p.J.n.g.V()) / 2.0f;
        n4 = dev.idhammai.P.A.S.f.y(p2.ps.P(), bl3 ? 255 : 220).getRGB();
        dev.idhammai.p.J.n.g.X(class_3322.method_51448(), string, f4, f25, n4);
        this.V();
        this.s();
        this.s(class_3322, n2, n3, p2, bl2);
        RenderSystem.setShader(class_757::method_34540);
        boolean bl4 = o.n(n2, n3, this.z, this.Z, this.t, this.C);
        boolean bl5 = o.n(n2, n3, this.E, this.Z, this.S, this.C);
        n5 = p2 != null ? p2.G.P().getRGB() : new Color(30, 30, 30, 236).getRGB();
        int n9 = p2 != null ? p2.pH.P().getRGB() : new Color(50, 50, 50, 200).getRGB();
        int n10 = p2 != null ? p2.w.P().getRGB() : new Color(220, 220, 220).getRGB();
        int n11 = p2 != null ? p2.ps.P().getRGB() : -1;
        float f26 = Math.min(6.0f, this.C / 2.0f);
        o.i(class_3322.method_51448(), this.z, this.Z, this.t, this.C, f26, 0.0f, 0.0f, f26, 0.0f, new Color(bl4 ? n9 : n5, true), new Color(bl4 ? n9 : n5, true), new Color(bl4 ? n9 : n5, true), new Color(bl4 ? n9 : n5, true));
        o.i(class_3322.method_51448(), this.E, this.Z, this.S, this.C, 0.0f, f26, f26, 0.0f, 0.0f, new Color(bl5 ? n9 : n5, true), new Color(bl5 ? n9 : n5, true), new Color(bl5 ? n9 : n5, true), new Color(bl5 ? n9 : n5, true));
        float f27 = this.P ? this.z : this.E;
        float f28 = this.P ? this.t : this.S;
        float f29 = dev.idhammai.P.A.A.m.J();
        if (f29 <= 0.0f) {
            f29 = 0.016f;
        }
        if ((f3 = f29 * 18.0f) < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > 0.35f) {
            f3 = 0.35f;
        }
        if (!this.A) {
            this.s = f27;
            this.Q = f28;
            this.A = true;
        } else {
            this.s += (f27 - this.s) * f3;
            this.Q += (f28 - this.Q) * f3;
        }
        boolean bl6 = bl = this.P ? bl4 : bl5;
        int n12 = p2 != null ? (bl ? p2.pq.V() : p2.pa.V()) : 200;
        float f30 = this.E - this.z;
        float f31 = f30 <= 1.0E-4f ? (this.P ? 0.0f : 1.0f) : (f2 = (this.s - this.z) / f30);
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        float f32 = f26 * (1.0f - f2);
        float f33 = f26 * f2;
        if (p2 != null && p2.pM.X() == dev.idhammai.c.r.q.N.S.Shader && Frog.SHADER != null) {
            var48_55 = new Color(255, 255, 255, n12);
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            RenderSystem.disableDepthTest();
            Frog.SHADER.u(() -> this.lambda$render$2(class_3322, f32, f33, var48_55));
        } else {
            var48_55 = p2 != null ? p2.q((double)this.Z * 0.25) : new Color(0, 120, 212);
            Color color2 = dev.idhammai.P.A.S.f.y(var48_55, n12);
            o.i(class_3322.method_51448(), this.s, this.Z, this.Q, this.C, f32, f33, f33, f32, 0.0f, color2, color2, color2, color2);
        }
        int n13 = this.P || bl4 ? n11 : n10;
        int n14 = !this.P || bl5 ? n11 : n10;
        float f34 = this.Z + (this.C - dev.idhammai.p.J.n.E.V()) / 2.0f;
        String string2 = dev.idhammai.c.y.u.C.r.D();
        String string3 = dev.idhammai.c.y.u.C.r.I();
        dev.idhammai.p.J.n.E.H(class_3322.method_51448(), string2, this.z + (this.t - dev.idhammai.p.J.n.E.b(string2)) / 2.0f, f34, n13, bl2);
        dev.idhammai.p.J.n.E.H(class_3322.method_51448(), string3, this.E + (this.S - dev.idhammai.p.J.n.E.b(string3)) / 2.0f, f34, n14, bl2);
        if (!this.P && this.x.isEmpty()) {
            dev.idhammai.p.J.n.w.y(class_3322.method_51448(), dev.idhammai.c.y.u.C.r.h(), this.D + this.R / 2.0f, this.J + this.Y / 2.0f, new Color(0xBDBDBD).getRGB());
        }
        float f35 = this.C();
        float f36 = 16.0f;
        float f37 = f35 * 0.3f;
        float f38 = f35 * 0.3f;
        float f39 = Math.max(8.0f, f35 * 0.5f);
        float f40 = 6.0f;
        float f41 = f35 * 0.25f + f40;
        int n15 = Math.round(f7 + (this.D - f7) * f9);
        int n16 = Math.round(f8 + (this.e - f8) * f9);
        int n17 = Math.round(f7 + (this.D + this.R - f7) * f9);
        int n18 = Math.round(f8 + (this.J + this.Y - 1.0f - f8) * f9);
        class_3322.method_44379(n15, n16, n17, n18);
        for (i i2 : this.P ? this.T : this.x) {
            int n19;
            float f42 = i2.x + this.e + this.l();
            if (f42 > this.J + this.Y || f42 + f35 < this.J) continue;
            class_3322.method_51448().method_22903();
            class_3322.method_51448().method_46416(this.D + f37, f42 + (f35 - f36) / 2.0f, 0.0f);
            class_3322.method_51427(i2.N().method_7854(), 0, 0);
            class_3322.method_51448().method_22909();
            float f43 = f42 + (f35 - dev.idhammai.p.J.n.w.V()) / 2.0f;
            float f44 = this.D + f37 + f36 + f38;
            String string4 = dev.idhammai.c.y.u.C.r.y(this.n) ? class_1074.method_4662((String)i2.B(), (Object[])new Object[0]) : i2.N().method_7848().getString();
            dev.idhammai.P.A.S.n.h(class_3322, string4, f44, f43, new Color(0xBDBDBD).getRGB(), true, bl2);
            float f45 = this.D + this.R - f41 - f39;
            float f46 = f42 + (f35 - f39) / 2.0f;
            boolean bl7 = o.n(n2, n3, f45, f46, f39, f39);
            float f47 = Math.min(4.0f, f39 / 3.0f);
            int n20 = n19 = bl7 ? p2.pq.V() : p2.pa.V();
            if (n19 < 0) {
                n19 = 0;
            }
            if (n19 > 255) {
                n19 = 255;
            }
            if (p2.pM.X() == dev.idhammai.c.r.q.N.S.Shader && Frog.SHADER != null) {
                var75_85 = new Color(255, 255, 255, n19);
                RenderSystem.enableBlend();
                RenderSystem.defaultBlendFunc();
                RenderSystem.disableDepthTest();
                float f48 = f45;
                float f49 = f46;
                float f50 = f39;
                float f51 = f39;
                float f52 = f47;
                Color color3 = var75_85;
                Frog.SHADER.u(() -> r.lambda$render$3(class_3322, f48, f49, f50, f51, f52, color3));
            } else {
                var75_85 = bl7 ? new Color(-981828998, true) : new Color(-984131753, true);
                o.j(class_3322.method_51448(), f45, f46, f39, f39, f47, var75_85);
            }
            boolean bl8 = this.x.stream().anyMatch(arg_0 -> r.lambda$render$4(i2, arg_0));
            if (this.P && !bl8) {
                dev.idhammai.P.A.S.n.h(class_3322, "+", f45 + (f39 - dev.idhammai.p.J.n.w.b("+")) / 2.0f + 1.0f, f46 + (f39 - dev.idhammai.p.J.n.w.V()) / 2.0f, -1, true, bl2);
                continue;
            }
            dev.idhammai.P.A.S.n.h(class_3322, "-", f45 + (f39 - dev.idhammai.p.J.n.w.b("-")) / 2.0f, f46 + (f39 - dev.idhammai.p.J.n.w.V()) / 2.0f, -1, true, bl2);
        }
        this.B((float)(this.P ? this.T : this.x).size() * f35);
        class_3322.method_44380();
        this.p(class_3322, n2, n3, p2, f10);
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        class_3322.method_51448().method_22909();
    }

    public boolean z(double d2, double d3, int n2) {
        boolean bl;
        float f2;
        if (!this.H || this.n == null) {
            return false;
        }
        P p2 = dev.idhammai.c.r.q.N.P.M();
        if (p2 == null) {
            return false;
        }
        float f3 = p2.pj.V();
        float f4 = Math.max(8.0f, f3 - 6.0f);
        float f5 = this.D + this.R - f4 - 4.0f;
        if (o.n(d2, d3, f5, f2 = this.J + (f3 - f4) / 2.0f, f4, f4)) {
            this.X();
            return true;
        }
        this.V();
        this.s();
        boolean bl2 = d2 >= (double)this.f && d2 <= (double)(this.f + this.v) && d3 >= (double)this.W && d3 <= (double)(this.W + this.c);
        boolean bl3 = this.O != null && !this.O.isEmpty();
        float f6 = this.c - 6.0f;
        float f7 = this.f + this.v - f6 - 4.0f;
        float f8 = this.W + (this.c - f6) / 2.0f;
        boolean bl4 = bl = bl3 && d2 >= (double)f7 && d2 <= (double)(f7 + f6) && d3 >= (double)f8 && d3 <= (double)(f8 + f6);
        if (n2 == 0) {
            if (bl2) {
                if (bl) {
                    this.O = "";
                    this.R();
                    this.K = true;
                    return true;
                }
                this.K = true;
                return true;
            }
            this.K = false;
        } else if (n2 == 1 && bl2) {
            this.O = "";
            this.R();
            return true;
        }
        if (o.n(d2, d3, this.z, this.Z, this.t, this.C)) {
            this.P = true;
            this.P();
            return true;
        }
        if (o.n(d2, d3, this.E, this.Z, this.S, this.C)) {
            this.P = false;
            this.P();
            return true;
        }
        float f9 = this.e;
        float f10 = this.n(f3);
        float f11 = this.i();
        float f12 = this.D + this.R - f11;
        if (o.n(d2, d3, f12, f9, f11, f10)) {
            this.r = true;
            float f13 = this.Y(f10);
            float f14 = ((float)d3 - f9) / f10;
            this.I = -(f14 * f13);
            this.I = dev.idhammai.P.A.A.A.p(this.I, -f13, 0.0f);
            return true;
        }
        float f15 = this.C();
        float f16 = Math.max(8.0f, f15 * 0.5f);
        float f17 = f15 * 0.25f + 6.0f;
        ArrayList arrayList = Lists.newArrayList(this.P ? this.T : this.x);
        for (i i2 : arrayList) {
            R r2;
            R r3;
            float f18 = i2.x + this.e + this.l();
            if (f18 + f15 > this.J + this.Y) continue;
            String string = i2.B().replace("item.minecraft.", "").replace("block.minecraft.", "");
            float f19 = this.D + this.R - f17 - f16;
            float f20 = f18 + (f15 - f16) / 2.0f;
            if (!o.n(d2, d3, f19, f20, f16, f16)) continue;
            boolean bl5 = this.x.stream().anyMatch(arg_0 -> r.lambda$mouseClicked$5(i2, arg_0));
            if (this.P && !bl5) {
                r3 = this.n;
                if (r3 instanceof B) {
                    r2 = (B)r3;
                    if (((B)r2).d(string)) continue;
                    ((B)r2).R(string);
                    this.F();
                    continue;
                }
                r3 = this.n;
                if (r3 instanceof x) {
                    r2 = (x)r3;
                    if (((x)r2).T(string)) continue;
                    ((x)r2).E(string);
                    this.F();
                    continue;
                }
                r3 = this.n;
                if (r3 instanceof dev.idhammai.p.J.P) {
                    r2 = (dev.idhammai.p.J.P)r3;
                    if (((dev.idhammai.p.J.P)r2).J(string)) continue;
                    ((dev.idhammai.p.J.P)r2).u(string);
                    this.F();
                    continue;
                }
                r3 = this.n;
                if (r3 instanceof D) {
                    r2 = (D)r3;
                    if (((D)r2).M(string)) continue;
                    ((D)r2).F(string);
                    this.F();
                    continue;
                }
                r3 = this.n;
                if (!(r3 instanceof V) || ((V)(r2 = (V)r3)).E(string)) continue;
                ((V)r2).h(string);
                this.F();
                continue;
            }
            R r4 = this.n;
            if (r4 instanceof B) {
                r2 = (B)r4;
                ((B)r2).d(string);
            } else {
                r4 = this.n;
                if (r4 instanceof x) {
                    r3 = (x)r4;
                    ((x)r3).Y(string);
                } else {
                    r4 = this.n;
                    if (r4 instanceof dev.idhammai.p.J.P) {
                        dev.idhammai.p.J.P p3 = (dev.idhammai.p.J.P)r4;
                        p3.D(string);
                    } else {
                        r4 = this.n;
                        if (r4 instanceof D) {
                            D d4 = (D)r4;
                            d4.q(string);
                        } else {
                            r4 = this.n;
                            if (r4 instanceof V) {
                                V v2 = (V)r4;
                                v2.z(string);
                            }
                        }
                    }
                }
            }
            this.F();
        }
        return true;
    }

    public boolean m(double d2, double d3, int n2) {
        if (!this.H || this.n == null) {
            return false;
        }
        this.r = false;
        return true;
    }

    public boolean y(double d2, double d3, double d4) {
        if (!this.H || this.n == null) {
            return false;
        }
        if (!o.n(d2, d3, this.D, this.J, this.R, this.Y)) {
            return false;
        }
        float f2 = dev.idhammai.c.r.q.N.P.M() != null ? (float)dev.idhammai.c.r.q.N.P.M().pj.V() : 14.0f;
        float f3 = this.n(f2);
        float f4 = this.Y(f3);
        this.I += (float)(d4 * 16.0);
        this.I = dev.idhammai.P.A.A.A.p(this.I, -f4, 0.0f);
        return true;
    }

    public boolean C(int n2) {
        if (!this.H || this.n == null) {
            return false;
        }
        if (n2 == 256) {
            if (this.K) {
                this.K = false;
                return true;
            }
            this.X();
            return true;
        }
        if (n2 == 70 && dev.idhammai.P.A.J.W != null && dev.idhammai.P.A.J.W.method_22683() != null && (class_3675.method_15987((long)dev.idhammai.P.A.J.W.method_22683().method_4490(), (int)341) || class_3675.method_15987((long)dev.idhammai.P.A.J.W.method_22683().method_4490(), (int)345))) {
            this.K = true;
            return true;
        }
        if (!this.K) {
            return true;
        }
        if (n2 == 257 || n2 == 335) {
            this.K = false;
            return true;
        }
        if (n2 == 259) {
            if (this.O.length() > 0) {
                this.O = this.O.substring(0, this.O.length() - 1);
                this.R();
            }
            return true;
        }
        return true;
    }

    public boolean d(char c2, int n2) {
        if (!this.H || this.n == null) {
            return false;
        }
        if (this.K && class_3544.method_57175((char)c2)) {
            this.O = this.O + c2;
            if (this.O.length() > 32) {
                this.O = this.O.substring(0, 32);
            }
            this.R();
            return true;
        }
        return false;
    }

    private float l() {
        return this.N;
    }

    private void P() {
        this.N = 0.0f;
        this.I = 0.0f;
    }

    private void B(float f2) {
        this.m = f2;
    }

    private float Y(float f2) {
        return Math.max(0.0f, this.m - f2);
    }

    private float n(float f2) {
        float f3 = this.J + this.Y - 1.0f;
        return Math.max(1.0f, f3 - this.e);
    }

    private float i() {
        return 6.0f;
    }

    private void p(class_332 class_3322, int n2, int n3, P p2, float f2) {
        int n4;
        int n5;
        float f3 = this.e;
        float f4 = this.n(f2);
        float f5 = this.i();
        float f6 = this.D + this.R - f5;
        float f7 = Math.max(1.0f, this.m);
        float f8 = f4 / f7;
        float f9 = Math.min(f4, f4 * f8);
        float f10 = f3 - this.I * f8;
        float f11 = f3 + f4 - f9;
        if (f10 < f3) {
            f10 = f3;
        }
        if (f10 > f11) {
            f10 = f11;
        }
        boolean bl = o.n(n2, n3, f6, f3, f5, f4);
        boolean bl2 = o.n(n2, n3, f6, f10, f5, f9);
        float f12 = Math.min(6.0f, f5 / 2.0f);
        Color color = p2.G.P();
        int n6 = bl ? 140 : 110;
        Color color2 = dev.idhammai.P.A.S.f.y(color, n6);
        int n7 = Math.max(0, Math.min(255, color2.getAlpha() + 12));
        int n8 = Math.max(0, Math.min(255, color2.getAlpha() - 10));
        Color color3 = new Color(color2.getRed(), color2.getGreen(), color2.getBlue(), n7);
        Color color4 = new Color(color2.getRed(), color2.getGreen(), color2.getBlue(), n8);
        o.z(class_3322.method_51448(), f6, f3, f5, f4, f12, color3, color3, color4, color4);
        int n9 = n5 = bl ? 150 : 90;
        if (p2.pM.X() == dev.idhammai.c.r.q.N.S.Shader && Frog.SHADER != null) {
            Color color5 = new Color(255, 255, 255, Math.max(0, Math.min(255, n5)));
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            RenderSystem.disableDepthTest();
            Frog.SHADER.u(() -> r.lambda$drawScrollBar$6(class_3322, f6, f3, f5, f4, f12, color5));
        } else {
            double d2 = (double)f3 / 10.0;
            Color color6 = p2.q(d2);
            Color color7 = dev.idhammai.P.A.S.f.y(color6, Math.max(0, Math.min(255, n5)));
            o.J(class_3322.method_51448(), f6, f3, f5, f4, f12, 1.0f, color7, color7, color7, color7);
        }
        int n10 = n4 = bl2 || this.r ? p2.pq.V() : p2.pa.V();
        if (n4 < 0) {
            n4 = 0;
        }
        if (n4 > 255) {
            n4 = 255;
        }
        if (p2.pM.X() == dev.idhammai.c.r.q.N.S.Shader && Frog.SHADER != null) {
            var27_34 = new Color(255, 255, 255, n4);
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            RenderSystem.disableDepthTest();
            float f13 = f6;
            float f14 = f10;
            float f15 = f5;
            float f16 = f9;
            float f17 = f12;
            Color color8 = var27_34;
            Frog.SHADER.u(() -> r.lambda$drawScrollBar$7(class_3322, f13, f14, f15, f16, f17, color8));
        } else {
            var27_34 = dev.idhammai.P.A.S.f.y(p2.q((double)f10 * 0.25), n4);
            o.j(class_3322.method_51448(), f6, f10, f5, f9, f12, var27_34);
        }
        if (this.r) {
            float f18 = ((float)n3 - f3) / f4;
            float f19 = this.Y(f4);
            this.I = -(f18 * f19);
            this.I = dev.idhammai.P.A.A.A.p(this.I, -f19, 0.0f);
        }
    }

    private float C() {
        float f2 = 16.0f;
        float f3 = dev.idhammai.p.J.n.w.V();
        return Math.max(f2, f3) + Math.max(4.0f, f3 * 0.4f);
    }

    private void s() {
        float f2;
        float f3;
        P p2 = dev.idhammai.c.r.q.N.P.M();
        float f4 = p2 != null ? (float)p2.pj.V() : 14.0f;
        float f5 = f4 * 0.6f;
        float f6 = this.D + this.R - f5;
        float f7 = Math.max(0.0f, f6 - (f3 = this.E + this.S + (f2 = Math.max(4.0f, f4 * 0.25f))));
        float f8 = Math.min(this.R * 0.35f, f7);
        float f9 = Math.max(60.0f, f8);
        if (f9 > f7) {
            f9 = f7;
        }
        float f10 = Math.max(16.0f, this.C);
        this.v = f9;
        this.c = f10;
        this.f = f6 - f9;
        this.W = this.Z + (this.C - f10) / 2.0f;
    }

    private void s(class_332 class_3322, int n2, int n3, P p2, boolean bl) {
        int n4;
        float f2;
        float f3;
        float f4;
        boolean bl2;
        Object object;
        boolean bl3;
        boolean bl4 = bl3 = (float)n2 >= this.f && (float)n2 <= this.f + this.v && (float)n3 >= this.W && (float)n3 <= this.W + this.c;
        boolean bl5 = this.K;
        double d2 = this.X.g(bl5 ? 1.0 : (bl4 ? 0.6 : 0.0), 120L, dev.idhammai.P.A.A.S.CubicInOut);
        Color color = p2.G.P();
        Color color2 = p2.pH.P();
        Color color3 = dev.idhammai.P.A.S.f.y(color, 175);
        Color color4 = dev.idhammai.P.A.S.f.y(color, 215);
        Color color5 = dev.idhammai.P.A.S.f.y(color2, 220);
        double d3 = Math.min(1.0, d2 / 0.6);
        Color color6 = bl5 ? dev.idhammai.P.A.S.f.U(color4, color5, d2) : dev.idhammai.P.A.S.f.U(color3, color4, d3);
        int n5 = Math.max(0, Math.min(255, color6.getAlpha() + 12));
        int n6 = Math.max(0, Math.min(255, color6.getAlpha() - 10));
        Color color7 = new Color(color6.getRed(), color6.getGreen(), color6.getBlue(), n5);
        Color color8 = new Color(color6.getRed(), color6.getGreen(), color6.getBlue(), n6);
        float f5 = Math.min(6.0f, this.c / 2.0f);
        o.z(class_3322.method_51448(), this.f, this.W, this.v, this.c, f5, color7, color7, color8, color8);
        int n7 = (int)Math.round(55.0 + 145.0 * d2);
        if (p2.pM.X() == dev.idhammai.c.r.q.N.S.Shader && Frog.SHADER != null) {
            object = new Color(255, 255, 255, Math.max(0, Math.min(255, n7)));
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            RenderSystem.disableDepthTest();
            Frog.SHADER.u(() -> this.lambda$drawSearchField$8(class_3322, f5, (Color)object));
        } else {
            double d4 = (double)this.W / 10.0;
            Color color9 = p2.q(d4);
            Color color10 = dev.idhammai.P.A.S.f.y(color9, Math.max(0, Math.min(255, n7)));
            o.J(class_3322.method_51448(), this.f, this.W, this.v, this.c, f5, 1.0f, color10, color10, color10, color10);
        }
        object = "S";
        float f6 = dev.idhammai.p.J.n.g != null ? dev.idhammai.p.J.n.g.b((String)object) : 0.0f;
        float f7 = this.f + 7.0f;
        float f8 = this.W + (this.c - (dev.idhammai.p.J.n.g != null ? dev.idhammai.p.J.n.g.V() : (float)this.i.T())) / 2.0f;
        int n8 = (int)Math.round(120.0 + 100.0 * d2);
        int n9 = dev.idhammai.P.A.S.f.y(p2.ps.P(), Math.max(0, Math.min(255, n8))).getRGB();
        if (dev.idhammai.p.J.n.g != null) {
            dev.idhammai.p.J.n.g.X(class_3322.method_51448(), (String)object, f7, f8, n9);
        }
        boolean bl6 = this.O != null && !this.O.isEmpty();
        float f9 = this.c - 6.0f;
        float f10 = this.f + this.v - f9 - 4.0f;
        float f11 = this.W + (this.c - f9) / 2.0f;
        boolean bl7 = bl2 = bl6 && (float)n2 >= f10 && (float)n2 <= f10 + f9 && (float)n3 >= f11 && (float)n3 <= f11 + f9;
        if (bl6) {
            Object object2;
            int n10;
            int n11 = n10 = bl2 ? 190 : 135;
            if (p2.pM.X() == dev.idhammai.c.r.q.N.S.Shader && Frog.SHADER != null) {
                object2 = new Color(255, 255, 255, Math.max(0, Math.min(255, n10)));
                Frog.SHADER.u(() -> r.lambda$drawSearchField$9(class_3322, f10, f11, f9, (Color)object2));
            } else {
                object2 = dev.idhammai.P.A.S.f.y(p2.G.P(), n10);
                o.j(class_3322.method_51448(), f10, f11, f9, f9, f9 / 2.0f, (Color)object2);
            }
            object2 = "x";
            f4 = this.i.F((String)object2);
            f3 = f10 + (f9 - f4) / 2.0f;
            f2 = this.i.K(f11, f9);
            n4 = dev.idhammai.P.A.S.f.y(p2.ps.P(), bl2 ? 235 : 190).getRGB();
            dev.idhammai.P.A.S.n.h(class_3322, (String)object2, f3, f2, n4, dev.idhammai.p.J.n.s(), true);
        }
        float f12 = 7.0f + f6 + 6.0f;
        float f13 = 6.0f + (bl6 ? f9 + 4.0f : 0.0f);
        f4 = this.f + f12;
        f3 = this.W + (this.c - (float)this.i.T()) / 2.0f;
        f2 = this.v - f12 - f13;
        n4 = this.O == null || this.O.isEmpty() ? 1 : 0;
        String string = dev.idhammai.c.y.u.C.r.b() ? "\u641c\u7d22..." : "Search...";
        String string2 = n4 != 0 ? string : this.O;
        String string3 = this.i(string2, f2);
        int n12 = n4 != 0 && !bl5 ? dev.idhammai.P.A.S.f.y(p2.w.P(), 150).getRGB() : p2.ps.P().getRGB();
        dev.idhammai.P.A.S.n.h(class_3322, string3, f4, f3, n12, dev.idhammai.p.J.n.s(), bl);
        if (bl5 && System.currentTimeMillis() % 1000L > 500L) {
            float f14 = f4 + (float)this.i.F(string3) + 1.0f;
            float f15 = this.W + 4.0f;
            float f16 = this.c - 8.0f;
            if (!bl6 || f14 + 2.0f < f10) {
                if (p2.pM.X() == dev.idhammai.c.r.q.N.S.Shader && Frog.SHADER != null) {
                    int n13 = 230;
                    Frog.SHADER.u(() -> r.lambda$drawSearchField$10(class_3322, f14, f15, f16, n13));
                } else {
                    o.F(class_3322.method_51448(), f14, f15, 1.0f, f16, dev.idhammai.P.A.S.f.y(p2.ps.P(), 230).getRGB());
                }
            }
        }
    }

    private String i(String string, float f2) {
        if (string == null) {
            return "";
        }
        if (f2 <= 0.0f) {
            return "";
        }
        if ((float)this.i.F(string) <= f2) {
            return string;
        }
        String string2 = string;
        while (string2.length() > 0 && (float)this.i.F(string2) > f2) {
            string2 = string2.substring(1);
        }
        return string2;
    }

    private void V() {
        float f2;
        P p2 = dev.idhammai.c.r.q.N.P.M();
        float f3 = p2 != null ? (float)p2.pj.V() : 14.0f;
        float f4 = 0.0f;
        float f5 = Math.max(2.0f, f3 * 0.25f);
        float f6 = f2 = dev.idhammai.p.J.n.E.V();
        float f7 = f2 * 2.5f;
        this.C = Math.max(7.0f, f3 * 0.8f);
        this.Z = this.J + f3 + f5;
        String string = dev.idhammai.c.y.u.C.r.D();
        String string2 = dev.idhammai.c.y.u.C.r.I();
        this.t = Math.max(f7, dev.idhammai.p.J.n.E.b(string) + f6);
        this.S = Math.max(f7, dev.idhammai.p.J.n.E.b(string2) + f6);
        float f8 = f3 * 0.6f;
        this.z = this.D + f8;
        this.E = this.z + this.t + f4;
        this.e = this.Z + this.C + f5;
    }

    private void F() {
        this.x.clear();
        float f2 = this.C();
        int n2 = 0;
        Object object2 = this.n;
        if (object2 instanceof V) {
            V v2 = (V)object2;
            for (class_2248 class_22482 : class_7923.field_41175) {
                String string = class_22482.method_9539();
                if (!v2.E(string)) continue;
                this.x.add(new i(n2, (float)n2 * f2, class_22482.method_8389(), string));
                ++n2;
            }
            return;
        }
        object2 = this.n;
        if (object2 instanceof D) {
            D d2 = (D)object2;
            for (class_2248 class_22483 : class_7923.field_41175) {
                String string = class_22483.method_9539();
                if (!d2.M(string)) continue;
                this.x.add(new i(n2, (float)n2 * f2, class_22483.method_8389(), string));
                ++n2;
            }
            return;
        }
        for (Object object2 : class_7923.field_41178) {
            R r2;
            R r3 = this.n;
            if (r3 instanceof B) {
                r2 = (B)r3;
                if (!((B)r2).d(object2.method_7876())) continue;
                this.x.add(new i(n2, (float)n2 * f2, object2.method_8389(), object2.method_7876()));
                ++n2;
                continue;
            }
            r3 = this.n;
            if (r3 instanceof x) {
                r2 = (x)r3;
                if (!((x)r2).T(object2.method_7876())) continue;
                this.x.add(new i(n2, (float)n2 * f2, object2.method_8389(), object2.method_7876()));
                ++n2;
                continue;
            }
            r3 = this.n;
            if (!(r3 instanceof dev.idhammai.p.J.P) || !((dev.idhammai.p.J.P)(r2 = (dev.idhammai.p.J.P)r3)).J(object2.method_7876())) continue;
            this.x.add(new i(n2, (float)n2 * f2, object2.method_8389(), object2.method_7876()));
            ++n2;
        }
    }

    private void R() {
        this.T.clear();
        this.P();
        float f2 = this.C();
        int n2 = 0;
        String string = this.O == null ? "" : this.O;
        String string2 = string.toLowerCase();
        if (dev.idhammai.c.y.u.C.r.y(this.n)) {
            for (class_2248 class_22482 : class_7923.field_41175) {
                String string3 = class_22482.method_9539();
                if (!string.isEmpty() && !string3.contains(string) && !class_1074.method_4662((String)string3, (Object[])new Object[0]).toLowerCase().contains(string2)) continue;
                this.T.add(new i(n2, (float)n2 * f2, class_22482.method_8389(), string3));
                ++n2;
            }
            return;
        }
        for (class_1792 class_17922 : class_7923.field_41178) {
            String string4 = class_17922.method_7876();
            if (!string.isEmpty() && !string4.contains(string) && !class_17922.method_7848().getString().toLowerCase().contains(string2)) continue;
            this.T.add(new i(n2, (float)n2 * f2, class_17922, string4));
            ++n2;
        }
    }

    private static boolean y(R r2) {
        return r2 instanceof V || r2 instanceof D;
    }

    private static boolean b() {
        return dev.idhammai.c.r.q.N.I.Q != null && dev.idhammai.c.r.q.N.I.Q.C.h();
    }

    private static String g(R r2) {
        boolean bl = dev.idhammai.c.y.u.C.r.y(r2);
        String string = dev.idhammai.c.y.u.C.r.b() ? (bl ? "\u65b9\u5757" : "\u7269\u54c1") : (bl ? "Blocks" : "Items");
        String string2 = dev.idhammai.c.y.u.C.r.a(r2);
        if (string2.isEmpty()) {
            return string;
        }
        return string2 + " " + string;
    }

    private static String a(R r2) {
        if (r2 == null) {
            return "";
        }
        boolean bl = dev.idhammai.c.y.u.C.r.b();
        if (r2 instanceof V) {
            return bl ? "\u77ff\u7269\u900f\u89c6" : "Xray";
        }
        if (r2 instanceof D) {
            return bl ? "\u900f\u89c6" : "BlockESP";
        }
        if (r2 instanceof B) {
            return bl ? "\u4ea4\u6613" : "Trade";
        }
        if (r2 instanceof x) {
            return bl ? "\u6e05\u7406" : "Cleaner";
        }
        if (r2 instanceof dev.idhammai.p.J.P) {
            return bl ? "HUD" : "HUD";
        }
        return "";
    }

    private static String l() {
        return dev.idhammai.c.y.u.C.r.b() ? "\u641c\u7d22" : "Search";
    }

    private static String D() {
        return dev.idhammai.c.y.u.C.r.b() ? "\u5168\u90e8" : "All";
    }

    private static String I() {
        return dev.idhammai.c.y.u.C.r.b() ? "\u5df2\u9009" : "Selected";
    }

    private static String h() {
        return dev.idhammai.c.y.u.C.r.b() ? "\u8fd9\u91cc\u8fd8\u6ca1\u6709\u5185\u5bb9" : "It's empty here yet";
    }

    private double J() {
        S s2;
        P p2 = dev.idhammai.c.r.q.N.P.M();
        if (p2 == null || !p2.J.h()) {
            return this.H ? 1.0 : 0.0;
        }
        long l2 = this.H ? (long)p2.pE.V() : (long)p2.p0.V();
        S s3 = s2 = this.H ? p2.pb.X() : p2.h.X();
        if (l2 <= 0L) {
            l2 = 1L;
        }
        if (s2 == null) {
            s2 = dev.idhammai.P.A.A.S.CubicInOut;
        }
        return this.F.g(this.H ? 1.0 : 0.0, l2, s2);
    }

    private static void lambda$drawSearchField$10(class_332 class_3322, float f2, float f3, float f4, int n2) {
        o.F(class_3322.method_51448(), f2, f3, 1.0f, f4, dev.idhammai.P.A.S.f.k(Color.WHITE.getRGB(), n2));
    }

    private static void lambda$drawSearchField$9(class_332 class_3322, float f2, float f3, float f4, Color color) {
        o.j(class_3322.method_51448(), f2, f3, f4, f4, f4 / 2.0f, color);
    }

    private void lambda$drawSearchField$8(class_332 class_3322, float f2, Color color) {
        o.J(class_3322.method_51448(), this.f, this.W, this.v, this.c, f2, 1.0f, color, color, color, color);
    }

    private static void lambda$drawScrollBar$7(class_332 class_3322, float f2, float f3, float f4, float f5, float f6, Color color) {
        o.z(class_3322.method_51448(), f2, f3, f4, f5, f6, color, color, color, color);
    }

    private static void lambda$drawScrollBar$6(class_332 class_3322, float f2, float f3, float f4, float f5, float f6, Color color) {
        o.J(class_3322.method_51448(), f2, f3, f4, f5, f6, 1.0f, color, color, color, color);
    }

    private static boolean lambda$mouseClicked$5(i i2, i i3) {
        return Objects.equals(i3.B(), i2.b);
    }

    private static boolean lambda$render$4(i i2, i i3) {
        return Objects.equals(i3.b, i2.b);
    }

    private static void lambda$render$3(class_332 class_3322, float f2, float f3, float f4, float f5, float f6, Color color) {
        o.j(class_3322.method_51448(), f2, f3, f4, f5, f6, color);
    }

    private void lambda$render$2(class_332 class_3322, float f2, float f3, Color color) {
        o.i(class_3322.method_51448(), this.s, this.Z, this.Q, this.C, f2, f3, f3, f2, 0.0f, color, color, color, color);
    }

    private static void lambda$render$1(class_332 class_3322, float f2, float f3, float f4, float f5, int n2, float f6) {
        o.K(class_3322.method_51448(), f2, f3, f4, f5 - f3, n2);
        o.K(class_3322.method_51448(), f6 - f4, f3, f4, f5 - f3, n2);
    }

    private static void lambda$render$0(P p2, class_332 class_3322, float f2, float f3, float f4, float f5, float f6) {
        int n2 = p2.p4.V();
        o.i(class_3322.method_51448(), f2, f3, f4, f5, 0.0f, 0.0f, f6, f6, 1.0f, new Color(255, 255, 255, n2), new Color(255, 255, 255, n2), new Color(255, 255, 255, n2), new Color(255, 255, 255, n2));
    }
}

