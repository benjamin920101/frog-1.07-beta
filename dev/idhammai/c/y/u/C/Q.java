/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.DrawContext
 */
package dev.idhammai.c.y.u.C;

import dev.idhammai.Frog;
import dev.idhammai.P.A.A.k;
import dev.idhammai.P.A.S.o;
import dev.idhammai.c.r.q.N.I;
import dev.idhammai.c.r.q.N.J;
import dev.idhammai.c.r.q.N.P;
import dev.idhammai.c.y.R.C;
import dev.idhammai.c.y.u.A.e;
import dev.idhammai.c.y.u.C.E;
import dev.idhammai.c.y.u.C.K;
import dev.idhammai.c.y.u.C.M;
import dev.idhammai.c.y.u.C.O;
import dev.idhammai.c.y.u.C.S;
import dev.idhammai.c.y.u.C.z;
import dev.idhammai.c.y.u.I.c;
import dev.idhammai.c.y.u.I.f;
import dev.idhammai.c.y.u.I.t;
import dev.idhammai.p.J.n;
import java.awt.Color;
import java.util.ArrayList;
import net.minecraft.client.gui.DrawContext;

public final class Q {
    private final t H;
    private final ArrayList<String> z = new ArrayList();
    private float j;
    private String R;
    private String W;
    private boolean M;
    private float t;
    private float U;
    private float K;
    private float o;
    private final k I = new k();
    private final k O = new k();
    private boolean y;
    private float i;
    private float L;
    private boolean F = true;
    private final k S = new k();

    public Q(t t2) {
        this.H = t2;
    }

    public void h(float f2, float f3) {
        this.y = false;
        if (!this.M) {
            this.M = true;
            this.t = f2;
            this.U = f3;
            this.K = f2;
            this.o = f3;
            this.I.a = f2;
            this.I.h = f2;
            this.O.a = f3;
            this.O.h = f3;
            return;
        }
        this.t = f2;
        this.U = f3;
    }

    public boolean M() {
        return this.M;
    }

    public float j() {
        return this.t;
    }

    public float d() {
        return this.U;
    }

    public void H(class_332 class_3322, int n2, int n3, float f2, c c2) {
        boolean bl;
        int n4;
        boolean bl2;
        boolean bl3;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        P p2 = P.M();
        if (p2 == null) {
            return;
        }
        this.P(n2, n3, c2);
        this.l();
        if (this.R != null && !this.z.contains(this.R)) {
            this.R = null;
        }
        if (this.R == null && !this.z.isEmpty()) {
            this.R = this.z.get(0);
        }
        E e2 = this.l(c2, p2);
        float f12 = c2.l(n2);
        float f13 = c2.D(n3);
        boolean bl4 = n.s();
        boolean bl5 = n.w();
        boolean bl6 = dev.idhammai.c.r.q.N.I.Q != null && dev.idhammai.c.r.q.N.I.Q.C.h();
        String string = bl6 ? "\u914d\u7f6e" : "Configs";
        double d2 = e.K(this.S, this.F, p2, 200L, 200L, dev.idhammai.P.A.A.S.CubicInOut, dev.idhammai.P.A.A.S.CubicInOut);
        float f14 = e2.A + e2.K + (e2.N - e2.K) * (float)d2;
        if (d2 > 0.01 && f14 > e2.A + e2.K) {
            Color color;
            f11 = e2.b;
            f10 = e2.A + e2.K;
            f9 = e2.p;
            f8 = f14 - f10;
            f7 = Math.min(3.0f, f8 / 2.0f);
            double d3 = (double)e2.A / 10.0;
            if (p2.p8.i) {
                color = dev.idhammai.P.A.S.f.y(p2.p8.P(), p2.pJ.V());
                dev.idhammai.P.A.S.o.i(class_3322.method_51448(), f11, f10, f9, f8, 0.0f, 0.0f, f7, f7, 0.0f, color, color, color, color);
            } else if (p2.p7.X() != J.Transparent) {
                color = p2.G.P();
                dev.idhammai.P.A.S.o.i(class_3322.method_51448(), f11, f10, f9, f8, 0.0f, 0.0f, f7, f7, 0.0f, color, color, color, color);
            }
            if (p2.p8.i || p2.p7.X() == J.Transparent) {
                if (p2.pM.X() == dev.idhammai.c.r.q.N.S.Shader) {
                    Frog.SHADER.u(() -> Q.lambda$render$0(p2, class_3322, f11, f10, f9, f8, f7));
                } else {
                    color = dev.idhammai.P.A.S.f.y(p2.b(d3), p2.p4.V());
                    dev.idhammai.P.A.S.o.i(class_3322.method_51448(), f11, f10, f9, f8, 0.0f, 0.0f, f7, f7, 1.0f, color, color, color, color);
                }
            }
            if (p2.s.h()) {
                float f15 = f10;
                float f16 = f10 + f8;
                double d4 = 0.25;
                f6 = f11 + 0.2f;
                f5 = f11 + f9;
                int n5 = p2.C.V();
                if (p2.pM.X() == dev.idhammai.c.r.q.N.S.Shader) {
                    var31_34 = 1.0f;
                    Frog.SHADER.u(() -> Q.lambda$render$1(class_3322, f6, f15, var31_34, f16, n5, f5));
                } else {
                    var31_34 = 2.0f;
                    for (f4 = f15; f4 < f16; f4 += var31_34) {
                        float f17 = Math.min(f4 + var31_34, f16);
                        int n6 = dev.idhammai.P.A.S.f.k(p2.b((double)f4 * d4).getRGB(), n5);
                        dev.idhammai.P.A.S.o.i(class_3322.method_51448(), f6, f17, f6, f4, n6);
                        dev.idhammai.P.A.S.o.i(class_3322.method_51448(), f5, f17, f5, f4, n6);
                    }
                }
                int n7 = dev.idhammai.P.A.S.f.k(p2.b((double)f16 * d4).getRGB(), n5);
                dev.idhammai.P.A.S.o.i(class_3322.method_51448(), f11, f16, f11 + f9, f16, n7);
            }
        }
        dev.idhammai.c.y.u.C.K.m(class_3322, e2.l, e2.A, e2.o, e2.K, (double)e2.A / 10.0);
        dev.idhammai.c.y.u.C.K.H(class_3322, "d", string, e2.l, e2.A, e2.K, p2.ps.P().getRGB());
        if (d2 <= 0.01 || f14 <= e2.A + e2.K) {
            return;
        }
        f11 = c2.p == 0.0f ? 1.0f : c2.p;
        f10 = dev.idhammai.c.y.u.I.t.a() != null ? dev.idhammai.c.y.u.I.t.a().x() : 1.0f;
        f9 = f11 * f10;
        f8 = (float)class_3322.method_51421() / 2.0f;
        f7 = (float)class_3322.method_51443() / 2.0f;
        int n8 = Math.round(f8 + (e2.b - f8) * f9);
        int n9 = Math.round(f7 + (e2.A + e2.K - f7) * f9 + c2.K);
        int n10 = Math.round(f8 + (e2.b + e2.p - f8) * f9);
        int n11 = Math.round(f7 + (f14 - f7) * f9 + c2.K);
        class_3322.method_44379(n8, n9, n10, n11);
        if (Frog.SHADER != null && Frog.SHADER.s()) {
            Frog.SHADER.k(n8, n9, n10, n11);
        }
        float f18 = 2.0f;
        float f19 = Math.min(e2.z + e2.Z, f14);
        if (f19 > e2.z) {
            f6 = f19 - e2.z;
            if (p2.p8.i) {
                dev.idhammai.P.A.S.o.D(class_3322.method_51448(), e2.I, e2.z, e2.P, f6, dev.idhammai.P.A.S.f.y(p2.p8.P(), p2.pJ.V()));
            } else if (p2.p7.X() != J.Transparent) {
                dev.idhammai.P.A.S.o.y(class_3322.method_51448(), e2.I, e2.z, e2.I + e2.P, e2.z + f6, p2.G.P().getRGB());
            }
        }
        if ((f5 = f19 - f18) < (f6 = e2.z + f18)) {
            f5 = f6;
        }
        float f20 = Math.max(0.0f, f5 - f6);
        float f21 = (float)this.z.size() * e2.O;
        f4 = Math.max(0.0f, f21 - f20);
        if (this.j > f4) {
            this.j = f4;
        }
        for (int i2 = 0; i2 < this.z.size(); ++i2) {
            String string2 = this.z.get(i2);
            f3 = f6 + (float)i2 * e2.O - this.j;
            float f22 = e2.O - 0.5f;
            if (f3 + f22 < f6 || f3 > f5) continue;
            bl3 = f12 >= e2.I && f12 <= e2.I + e2.P && f13 >= f3 && f13 <= f3 + f22;
            boolean bl7 = bl2 = this.R != null && string2 != null && string2.equalsIgnoreCase(this.R);
            if (bl2) {
                n4 = dev.idhammai.P.A.S.f.y(p2.pH.P(), 140).getRGB();
                dev.idhammai.P.A.S.o.y(class_3322.method_51448(), e2.I, f3, e2.I + e2.P, f3 + f22, n4);
            } else if (bl3) {
                n4 = dev.idhammai.P.A.S.f.y(p2.pH.P(), 90).getRGB();
                dev.idhammai.P.A.S.o.y(class_3322.method_51448(), e2.I, f3, e2.I + e2.P, f3 + f22, n4);
            }
            n4 = bl3 || bl2 ? p2.ps.P().getRGB() : p2.w.P().getRGB();
            float f23 = this.H.K(f3, f22);
            dev.idhammai.P.A.S.n.h(class_3322, string2, e2.I + 6.0f, f23, n4, bl4, bl5);
            boolean bl8 = bl = this.W != null && string2 != null && string2.equalsIgnoreCase(this.W);
            if (!bl) continue;
            float f24 = e2.I + e2.P - 8.0f;
            float f25 = f3 + f22 / 2.0f;
            dev.idhammai.P.A.S.o.Q(class_3322.method_51448(), f24, f25, 2.2f, new Color(p2.ps.P().getRGB()), 24);
        }
        if (this.z.isEmpty() && f20 > 0.0f) {
            String string3 = bl6 ? "\u6682\u65e0\u914d\u7f6e" : "No configs";
            float f26 = e2.I + (e2.P - (float)this.H.F(string3)) / 2.0f;
            f3 = this.H.K(f6, f20);
            int n12 = dev.idhammai.P.A.S.f.y(p2.w.P(), 160).getRGB();
            dev.idhammai.P.A.S.n.h(class_3322, string3, f26, f3, n12, bl4, bl5);
        }
        String string4 = bl6 ? "\u5e94\u7528" : "Apply";
        String string5 = bl6 ? "\u4fdd\u5b58" : "Save";
        String string6 = bl6 ? "\u521b\u5efa" : "Create";
        String string7 = bl6 ? "\u5220\u9664" : "Delete";
        bl3 = this.R != null && !this.R.isEmpty();
        bl2 = true;
        n4 = 1;
        boolean bl9 = e2.S + e2.Q <= f14;
        boolean bl10 = bl = e2.r + e2.Q <= f14;
        if (bl9) {
            int n13 = bl3 ? (f12 >= e2.E && f12 <= e2.E + e2.c && f13 >= e2.S && f13 <= e2.S + e2.Q ? p2.pH.P().getRGB() : p2.G.P().getRGB()) : dev.idhammai.P.A.S.f.y(p2.G.P(), 120).getRGB();
            dev.idhammai.P.A.S.o.y(class_3322.method_51448(), e2.E, e2.S, e2.E + e2.c, e2.S + e2.Q, n13);
            dev.idhammai.P.A.S.n.h(class_3322, string4, e2.E + 6.0f, this.H.K(e2.S, e2.Q), p2.ps.P().getRGB(), bl4, bl5);
            int n14 = n4 != 0 ? (f12 >= e2.D && f12 <= e2.D + e2.c && f13 >= e2.S && f13 <= e2.S + e2.Q ? p2.pH.P().getRGB() : p2.G.P().getRGB()) : dev.idhammai.P.A.S.f.y(p2.G.P(), 120).getRGB();
            dev.idhammai.P.A.S.o.y(class_3322.method_51448(), e2.D, e2.S, e2.D + e2.c, e2.S + e2.Q, n14);
            dev.idhammai.P.A.S.n.h(class_3322, string5, e2.D + 6.0f, this.H.K(e2.S, e2.Q), p2.ps.P().getRGB(), bl4, bl5);
        }
        if (bl) {
            int n15 = bl2 ? (f12 >= e2.m && f12 <= e2.m + e2.c && f13 >= e2.r && f13 <= e2.r + e2.Q ? p2.pH.P().getRGB() : p2.G.P().getRGB()) : dev.idhammai.P.A.S.f.y(p2.G.P(), 120).getRGB();
            dev.idhammai.P.A.S.o.y(class_3322.method_51448(), e2.m, e2.r, e2.m + e2.c, e2.r + e2.Q, n15);
            dev.idhammai.P.A.S.n.h(class_3322, string6, e2.m + 6.0f, this.H.K(e2.r, e2.Q), p2.ps.P().getRGB(), bl4, bl5);
            int n16 = bl3 ? (f12 >= e2.y && f12 <= e2.y + e2.c && f13 >= e2.r && f13 <= e2.r + e2.Q ? p2.pH.P().getRGB() : p2.G.P().getRGB()) : dev.idhammai.P.A.S.f.y(p2.G.P(), 120).getRGB();
            dev.idhammai.P.A.S.o.y(class_3322.method_51448(), e2.y, e2.r, e2.y + e2.c, e2.r + e2.Q, n16);
            dev.idhammai.P.A.S.n.h(class_3322, string7, e2.y + 6.0f, this.H.K(e2.r, e2.Q), p2.ps.P().getRGB(), bl4, bl5);
        }
        if (Frog.SHADER != null && Frog.SHADER.s()) {
            Frog.SHADER.E();
        }
        class_3322.method_44380();
    }

    public boolean l(int n2, int n3, int n4, c c2) {
        int n5;
        if (dev.idhammai.P.A.J.W == null || dev.idhammai.P.A.J.W.method_22683() == null) {
            return false;
        }
        P p2 = P.M();
        if (p2 == null) {
            return false;
        }
        E e2 = this.l(c2, p2);
        float f2 = c2.l(n2);
        float f3 = c2.D(n3);
        if (n4 == 1) {
            if (f2 >= e2.l && f2 <= e2.l + e2.o && f3 >= e2.A && f3 <= e2.A + e2.K) {
                this.F = !this.F;
                C.L();
                return true;
            }
            return false;
        }
        if (n4 != 0) {
            return false;
        }
        if (f2 >= e2.l && f2 <= e2.l + e2.o && f3 >= e2.A && f3 <= e2.A + e2.K) {
            this.y = true;
            this.t = this.K;
            this.U = this.o;
            this.K = this.t;
            this.o = this.U;
            this.I.a = this.t;
            this.I.h = this.t;
            this.O.a = this.U;
            this.O.h = this.U;
            int n6 = (int)c2.G(f.Module);
            int n7 = (int)c2.x();
            this.i = this.t - (float)(n2 - n6);
            this.L = this.U - (float)(n3 - n7);
            dev.idhammai.c.y.u.I.t.a().n().forEach(Q::lambda$mouseClicked$2);
            return true;
        }
        if (!this.F) {
            return false;
        }
        boolean bl = false;
        this.l();
        float f4 = 2.0f;
        float f5 = e2.z + f4;
        float f6 = e2.z + e2.Z - f4;
        float f7 = e2.O - 0.5f;
        if (f2 >= e2.I && f2 <= e2.I + e2.P && f3 >= f5 && f3 <= f6) {
            for (n5 = 0; n5 < this.z.size(); ++n5) {
                String string = this.z.get(n5);
                float f8 = f5 + (float)n5 * e2.O - this.j;
                if (!(f3 >= f8) || !(f3 <= f8 + f7)) continue;
                this.R = string;
                bl = true;
                break;
            }
        }
        n5 = this.R != null && !this.R.isEmpty() ? 1 : 0;
        boolean bl2 = true;
        if (f2 >= e2.m && f2 <= e2.m + e2.c && f3 >= e2.r && f3 <= e2.r + e2.Q) {
            boolean bl3 = dev.idhammai.c.r.q.N.I.Q != null && dev.idhammai.c.r.q.N.I.Q.C.h();
            String string = bl3 ? "\u521b\u5efa\u914d\u7f6e" : "Create Config";
            String string2 = bl3 ? "\u8bf7\u8f93\u5165\u914d\u7f6e\u540d\u79f0" : "Enter config name";
            String string3 = bl3 ? "\u521b\u5efa" : "Create";
            String string4 = bl3 ? "\u53d6\u6d88" : "Cancel";
            this.H.h(string, string2, "", this::lambda$mouseClicked$3, null, string3, string4);
            return true;
        }
        if (f2 >= e2.D && f2 <= e2.D + e2.c && f3 >= e2.S && f3 <= e2.S + e2.Q && bl2) {
            if (n5 != 0) {
                String string = this.H(this.R);
                if (string != null) {
                    System.currentTimeMillis();
                    this.R = string;
                }
                return true;
            }
            boolean bl4 = dev.idhammai.c.r.q.N.I.Q != null && dev.idhammai.c.r.q.N.I.Q.C.h();
            String string = bl4 ? "\u4fdd\u5b58\u914d\u7f6e" : "Save Config";
            String string5 = bl4 ? "\u8bf7\u8f93\u5165\u914d\u7f6e\u540d\u79f0" : "Enter config name";
            String string6 = bl4 ? "\u4fdd\u5b58" : "Save";
            String string7 = bl4 ? "\u53d6\u6d88" : "Cancel";
            this.H.h(string, string5, "", this::lambda$mouseClicked$4, null, string6, string7);
            return true;
        }
        if (f2 >= e2.E && f2 <= e2.E + e2.c && f3 >= e2.S && f3 <= e2.S + e2.Q && n5 != 0) {
            boolean bl5;
            String string = this.R;
            boolean bl6 = dev.idhammai.c.r.q.N.I.Q != null && dev.idhammai.c.r.q.N.I.Q.C.h();
            String string8 = this.W;
            boolean bl7 = bl5 = string8 != null && !string8.isEmpty() && !string8.equalsIgnoreCase(string);
            if (bl5) {
                String string9 = bl6 ? "\u4fdd\u5b58\u5f53\u524d\u914d\u7f6e" : "Save Current Config";
                String string10 = bl6 ? "\u4fdd\u5b58\u5f53\u524d\u914d\u7f6e: " + string8 + " \u5e76\u5e94\u7528: " + string + " ?" : "Save current config: " + string8 + " and apply: " + string + " ?";
                String string11 = bl6 ? "\u4fdd\u5b58\u5e76\u5e94\u7528" : "Save & Apply";
                String string12 = bl6 ? "\u4e0d\u4fdd\u5b58" : "Don't Save";
                this.H.z(string9, string10, new z(this, string8, string), new M(this, string), string11, string12);
            } else {
                String string13 = bl6 ? "\u786e\u8ba4\u5e94\u7528" : "Confirm Apply";
                String string14 = bl6 ? "\u5e94\u7528\u914d\u7f6e: " + string : "Apply config: " + string;
                this.H.K(string13, string14, new S(this, string));
            }
            return true;
        }
        if (f2 >= e2.y && f2 <= e2.y + e2.c && f3 >= e2.r && f3 <= e2.r + e2.Q && n5 != 0) {
            String string = this.R;
            boolean bl8 = dev.idhammai.c.r.q.N.I.Q != null && dev.idhammai.c.r.q.N.I.Q.C.h();
            String string15 = bl8 ? "\u786e\u8ba4\u5220\u9664" : "Confirm Delete";
            String string16 = bl8 ? "\u786e\u5b9a\u5220\u9664\u914d\u7f6e: " + string + " ?" : "Delete config: " + string + " ?";
            this.H.K(string15, string16, new O(this, string));
            return true;
        }
        return bl;
    }

    public boolean y(double d2, int n2, int n3, c c2) {
        if (dev.idhammai.P.A.J.W == null || dev.idhammai.P.A.J.W.method_22683() == null) {
            return false;
        }
        if (!this.F) {
            return false;
        }
        P p2 = P.M();
        if (p2 == null) {
            return false;
        }
        E e2 = this.l(c2, p2);
        float f2 = c2.l(n2);
        float f3 = c2.D(n3);
        if (!(f2 >= e2.I && f2 <= e2.I + e2.P && f3 >= e2.z && f3 <= e2.z + e2.Z)) {
            return false;
        }
        this.l();
        float f4 = Math.max(0.0f, e2.Z - 4.0f);
        float f5 = (float)this.z.size() * e2.O;
        float f6 = Math.max(0.0f, f5 - f4);
        float f7 = this.j + (float)(-d2) * 18.0f;
        if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        if (f7 > f6) {
            f7 = f6;
        }
        this.j = f7;
        return true;
    }

    public void w(int n2, int n3, int n4) {
        if (n4 == 0) {
            this.y = false;
        }
    }

    private E l(c c2, P p2) {
        float f2;
        float f3;
        int n2 = p2.pI.V();
        int n3 = p2.a.V();
        int n4 = p2.L.V();
        float f4 = c2.X(f.Module);
        float f5 = c2.p == 0.0f ? (float)c2.M : (float)c2.M / c2.p;
        float f6 = Math.max(8.0f, (f5 - (float)c2.o) / 2.0f);
        float f7 = f6 + (float)c2.o - (f3 = (float)n3) - 10.0f;
        if (f7 < (f2 = f6 + 8.0f)) {
            f7 = f2;
        }
        float f8 = (float)c2.Q + 10.0f;
        float f9 = p2.pj.V();
        float f10 = f7;
        float f11 = f8;
        if (!this.M) {
            this.t = f7;
            this.U = f8;
            this.K = f7;
            this.o = f8;
            this.M = true;
        } else {
            f10 = this.K;
            f11 = this.o;
        }
        f10 += c2.G(f.Module);
        f11 += c2.x();
        f10 = (int)f10;
        f11 = (int)f11;
        float f12 = f11 + f9;
        float f13 = 2.0f;
        float f14 = f10 + f13;
        float f15 = f3 - f13 * 2.0f;
        if (f15 < 10.0f) {
            f14 = f10;
            f15 = f3;
        }
        float f16 = f12;
        int n5 = Math.max(1, this.z.size());
        float f17 = (float)n4 - 0.5f;
        float f18 = c2.p == 0.0f ? (float)c2.a : ((float)c2.a - c2.K) / c2.p;
        float f19 = f18 - 1.0f - f11 - f9 - (6.0f + f17 + 4.0f + f17 + 6.0f);
        float f20 = 2.0f;
        float f21 = f20 * 2.0f;
        int n6 = Math.max(1, (int)Math.floor((f19 - f21) / (float)n4));
        int n7 = Math.min(n5, n6);
        float f22 = (float)n4 * (float)n7 + f21;
        float f23 = 0.0f;
        float f24 = f16 + f22;
        float f25 = 6.0f;
        float f26 = 4.0f;
        float f27 = f14 + f26;
        float f28 = f15 - f26 * 2.0f;
        if (f28 < 10.0f) {
            f27 = f14;
            f28 = f15;
        }
        float f29 = (f28 - f25) / 2.0f;
        float f30 = f27;
        float f31 = f27 + f29 + f25;
        float f32 = f27;
        float f33 = f27 + f29 + f25;
        float f34 = f16 + f22 + 6.0f;
        float f35 = f34 + f17 + 4.0f;
        float f36 = f35 + f17 + 6.0f - f11;
        float f37 = n2;
        float f38 = f10 + (f3 - f37) / 2.0f;
        return new E(f10, f11, f3, f36, f38, f37, f9, f12, f14, f16, f15, f22, f24, f23, f29, f17, f25, f34, f35, n4, f30, f31, f32, f33);
    }

    private void P(int n2, int n3, c c2) {
        P p2;
        if (this.y) {
            int n4 = (int)c2.G(f.Module);
            int bl = (int)c2.x();
            this.t = this.i + (float)n2 - (float)n4;
            this.U = this.L + (float)n3 - (float)bl;
            this.K = this.t;
            this.o = this.U;
        }
        if ((p2 = P.M()) == null) {
            this.K = this.t;
            this.o = this.U;
            e.F(this.I, this.t);
            e.F(this.O, this.U);
            return;
        }
        boolean bl = p2.V.h() && !this.y;
        long l2 = Math.max(1, p2.Q.V());
        dev.idhammai.P.A.A.S s2 = p2.r.X();
        this.K = e.M(this.I, this.t, l2, s2, bl);
        this.o = e.M(this.O, this.U, l2, s2, bl);
    }

    private void l() {
        this.z.clear();
        this.z.addAll(dev.idhammai.p.J.z.Z());
    }

    private String R(String string) {
        return dev.idhammai.p.J.z.M(string);
    }

    private String g(String string) {
        String string2 = dev.idhammai.p.J.z.y(string);
        this.l();
        return string2;
    }

    private void V(String string) {
        dev.idhammai.p.J.z.e(string);
        this.l();
    }

    private String H(String string) {
        String string2 = dev.idhammai.p.J.z.j(string);
        this.l();
        return string2;
    }

    private void W(String string) {
        if (dev.idhammai.p.J.z.O(string)) {
            this.W = string;
        }
    }

    private void lambda$mouseClicked$4(String string) {
        String string2 = this.R(string);
        if (string2 == null || string2.isEmpty()) {
            return;
        }
        String string3 = this.H(string2);
        if (string3 != null) {
            System.currentTimeMillis();
            this.R = string3;
        }
    }

    private void lambda$mouseClicked$3(String string) {
        String string2 = this.R(string);
        if (string2 == null || string2.isEmpty()) {
            return;
        }
        String string3 = this.g(string2);
        if (string3 != null) {
            this.R = string3;
        }
    }

    private static void lambda$mouseClicked$2(K k2) {
        if (k2.B) {
            k2.B = false;
        }
    }

    private static void lambda$render$1(class_332 class_3322, float f2, float f3, float f4, float f5, int n2, float f6) {
        dev.idhammai.P.A.S.o.K(class_3322.method_51448(), f2, f3, f4, f5 - f3, n2);
        dev.idhammai.P.A.S.o.K(class_3322.method_51448(), f6 - f4, f3, f4, f5 - f3, n2);
    }

    private static void lambda$render$0(P p2, class_332 class_3322, float f2, float f3, float f4, float f5, float f6) {
        int n2 = p2.p4.V();
        Color color = new Color(255, 255, 255, n2);
        dev.idhammai.P.A.S.o.i(class_3322.method_51448(), f2, f3, f4, f5, 0.0f, 0.0f, f6, f6, 1.0f, color, color, color, color);
    }
}

