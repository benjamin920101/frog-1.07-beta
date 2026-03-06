/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.DrawContext
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 */
package dev.idhammai.c.y.u.C;

import dev.idhammai.Frog;
import dev.idhammai.P.A.A.S;
import dev.idhammai.P.A.A.k;
import dev.idhammai.P.A.S.f;
import dev.idhammai.P.A.S.o;
import dev.idhammai.c.r.q.N.F;
import dev.idhammai.c.r.q.N.J;
import dev.idhammai.c.r.q.N.P;
import dev.idhammai.c.r.w;
import dev.idhammai.c.y.R.C;
import dev.idhammai.c.y.R.V.O;
import dev.idhammai.c.y.R.V.T;
import dev.idhammai.c.y.u.A.e;
import dev.idhammai.c.y.u.I.t;
import dev.idhammai.p.J.n;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.gui.DrawContext;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class K {
    private final List<T> U = new ArrayList<T>();
    private final String n;
    private final w L;
    public boolean B;
    protected class_332 w;
    private int S;
    private int F;
    private float t;
    private float g;
    private float G;
    private float R;
    private float i;
    private final k N = new k();
    private final k k = new k();
    private final k c = new k();
    private float d = 0.0f;
    private int Q;
    private int h;
    private int m;
    private int V;
    private boolean j;
    private boolean M = false;

    private static float m() {
        P p2 = P.M();
        if (p2 == null) {
            return 1.0f;
        }
        float f2 = (float)p2.pO;
        float f3 = dev.idhammai.c.y.u.I.t.a() != null ? dev.idhammai.c.y.u.I.t.a().x() : 1.0f;
        return f2 * f3;
    }

    private static float y() {
        P p2 = P.M();
        if (p2 == null) {
            return 0.0f;
        }
        float f2 = (float)p2.pO;
        return (1.0f - f2) * 20.0f;
    }

    private static int y(int n2) {
        float f2 = K.m();
        if (dev.idhammai.P.A.J.W == null || dev.idhammai.P.A.J.W.method_22683() == null) {
            return Math.round((float)n2 * f2);
        }
        float f3 = (float)dev.idhammai.P.A.J.W.method_22683().method_4486() / 2.0f;
        return Math.round(f3 + ((float)n2 - f3) * f2);
    }

    private static int U(int n2) {
        float f2 = K.m();
        float f3 = K.y();
        if (dev.idhammai.P.A.J.W == null || dev.idhammai.P.A.J.W.method_22683() == null) {
            return Math.round((float)n2 * f2 + f3);
        }
        float f4 = (float)dev.idhammai.P.A.J.W.method_22683().method_4502() / 2.0f;
        return Math.round(f4 + ((float)n2 - f4) * f2 + f3);
    }

    public K(String string, w w2, int n2, int n3, boolean bl) {
        this.n = string;
        this.L = w2;
        this.p(n2);
        this.r(n3);
        this.t = this.S;
        this.g = this.F;
        if (P.M() != null) {
            this.M(P.M().a.V());
            this.J(P.M().pj.V() + 5);
        } else {
            this.M(93);
            this.J(18);
        }
        this.j = bl;
        this.S();
    }

    public String r() {
        return this.n;
    }

    public void h(String string) {
        if (string == null || string.isEmpty()) {
            for (T t2 : this.U) {
                t2.q(false);
            }
            return;
        }
        String string2 = string.toLowerCase();
        for (T t3 : this.U) {
            boolean bl = t3.o().toLowerCase().contains(string2);
            if (!bl) {
                for (C c2 : t3.v()) {
                    if (!c2.o().toLowerCase().contains(string2)) continue;
                    bl = true;
                    break;
                }
            }
            t3.q(!bl);
        }
    }

    public void S() {
    }

    private void N(int n2, int n3) {
        if (!this.B) {
            return;
        }
        int n4 = (int)(this.G + this.i);
        int n5 = (int)this.R;
        this.S = this.Q + n2 - n4;
        this.F = this.h + n3 - n5;
        this.t = this.S;
        this.g = this.F;
    }

    private void a() {
        P p2 = P.M();
        if (p2 == null) {
            this.t = this.S;
            this.g = this.F;
            e.F(this.N, this.S);
            e.F(this.k, this.F);
            return;
        }
        boolean bl = p2.V.h() && !this.B;
        long l2 = Math.max(1, p2.Q.V());
        S s2 = p2.r.X();
        this.t = e.M(this.N, this.S, l2, s2, bl);
        this.g = e.M(this.k, this.F, l2, s2, bl);
    }

    protected double t() {
        return (double)this.M() / 10.0;
    }

    public static void m(class_332 class_3322, float f2, float f3, float f4, float f5, double d2) {
        P p2 = P.M();
        if (p2 == null) {
            return;
        }
        int n2 = p2.C.V();
        float f6 = 6.0f;
        if (p2.pM.X() == dev.idhammai.c.r.q.N.S.Shader) {
            Frog.SHADER.u(() -> K.lambda$drawClickGuiHeader$0(class_3322, f2, f3, f4, f5, f6, p2, d2, n2));
        } else {
            Color color = f.y(p2.b(d2), n2);
            o.z(class_3322.method_51448(), f2, f3, f4, f5, f6, color);
        }
    }

    public static void a(class_332 class_3322, String string, double d2, double d3, int n2) {
        boolean bl = dev.idhammai.p.J.n.w();
        class_332 class_3323 = class_3322;
        if (P.M() != null && P.M().pM.X() == dev.idhammai.c.r.q.N.S.Shader && Frog.SHADER != null && Frog.SHADER.s()) {
            int[] nArray = Frog.SHADER.h();
            Matrix4f matrix4f = class_3323 != null ? new Matrix4f((Matrix4fc)class_3323.method_51448().method_23760().method_23761()) : null;
            Frog.SHADER.Q(() -> K.lambda$drawClickGuiText$1(class_3323, matrix4f, nArray, string, d2, d3, n2, bl));
            return;
        }
        if (dev.idhammai.p.J.n.s()) {
            dev.idhammai.p.J.n.w.H(class_3323.method_51448(), string, (int)d2, (int)d3, n2, bl);
        } else {
            class_3323.method_51433(dev.idhammai.P.A.J.W.field_1772, string, (int)d2, (int)d3, n2, bl);
        }
    }

    public static void H(class_332 class_3322, String string, String string2, float f2, float f3, float f4, int n2) {
        float f5 = f3 + (f4 - dev.idhammai.p.J.n.g.V()) / 2.0f;
        dev.idhammai.p.J.n.g.X(class_3322.method_51448(), string, f2 + 6.0f, f5, n2);
        float f6 = dev.idhammai.p.J.n.s() ? dev.idhammai.p.J.n.w.V() : 9.0f;
        boolean bl = false;
        float f7 = f3 + (f4 - f6) / 2.0f + (float)bl;
        float f8 = f2 + 20.0f;
        if (P.M() != null && P.M().pn.X() == dev.idhammai.c.r.q.N.F.Center) {
            float f9 = dev.idhammai.p.J.n.s() ? dev.idhammai.p.J.n.w.b(string2) : (float)dev.idhammai.P.A.J.W.field_1772.method_1727(string2);
            f8 = f2 + (float)P.M().pI.V() / 2.0f - f9 / 2.0f;
        }
        K.a(class_3322, string2, f8, f7, n2);
    }

    public void K(class_332 class_3322, int n2, int n3, float f2) {
        int n4;
        float f3;
        float f4;
        float f5;
        float f6;
        this.w = class_3322;
        this.N(n2, n3);
        this.a();
        int n5 = this.t();
        int n6 = this.M();
        float f7 = Math.max(0.0f, this.D() - 2.0f);
        P p2 = P.M();
        double d2 = e.K(this.c, this.j, p2, 200L, 1000L, dev.idhammai.P.A.A.S.CubicInOut, dev.idhammai.P.A.A.S.Bounce);
        this.d = f6 = (float)((double)f7 * d2);
        boolean bl = f6 > 0.5f;
        int n7 = P.M().pI.V();
        float f8 = (float)n5 + ((float)this.m - (float)n7) / 2.0f;
        float f9 = n6;
        float f10 = n7;
        float f11 = (float)this.V - 5.0f;
        double d3 = this.t();
        K.m(class_3322, f8, f9, f10, f11, d3);
        if (bl) {
            Color color;
            f5 = n5;
            float f12 = (float)n6 + (float)this.V - 5.0f;
            float f13 = this.m;
            float f14 = (float)(n6 + this.V) + f6 - ((float)n6 + (float)this.V - 5.0f);
            float f15 = 3.0f;
            if (P.M().p8.i) {
                color = f.y(P.M().p8.P(), P.M().pJ.V());
                o.i(class_3322.method_51448(), f5, f12, f13, f14, 0.0f, 0.0f, f15, f15, 0.0f, color, color, color, color);
            }
            if (P.M().p8.i || P.M().p7.X() == J.Transparent) {
                if (P.M().pM.X() == dev.idhammai.c.r.q.N.S.Shader) {
                    Frog.SHADER.u(() -> K.lambda$drawScreen$2(class_3322, f5, f12, f13, f14, f15));
                } else {
                    color = f.y(P.M().b(d3), P.M().p4.V());
                    o.i(class_3322.method_51448(), f5, f12, f13, f14, 0.0f, 0.0f, f15, f15, 1.0f, color, color, color, color);
                }
            }
            if (P.M().s.h()) {
                float f16 = (float)n6 + (float)this.V - 5.0f;
                float f17 = (float)(n6 + this.V) + f6;
                double d4 = 0.25;
                f4 = (float)n5 + 0.2f;
                float f18 = n5 + this.m;
                int n8 = P.M().C.V();
                if (P.M().pM.X() == dev.idhammai.c.r.q.N.S.Shader) {
                    var32_39 = 1.0f;
                    Frog.SHADER.u(() -> K.lambda$drawScreen$3(class_3322, f4, f16, var32_39, f17, n8, f18));
                } else {
                    var32_39 = 2.0f;
                    for (float f19 = f16; f19 < f17; f19 += var32_39) {
                        f3 = Math.min(f19 + var32_39, f17);
                        n4 = f.k(P.M().b((double)f19 * d4).getRGB(), n8);
                        o.i(class_3322.method_51448(), f4, f3, f4, f19, n4);
                        o.i(class_3322.method_51448(), f18, f3, f18, f19, n4);
                    }
                }
                int n9 = f.k(P.M().b((double)f17 * d4).getRGB(), n8);
                o.i(class_3322.method_51448(), n5, f17, n5 + this.m, f17, n9);
            }
        }
        f5 = f11;
        K.H(class_3322, this.L.v(), this.L.D(), f8, f9, f5, O.g);
        if (bl) {
            int n10 = n5 - 1;
            int n11 = (int)((float)n6 + (float)this.V - 6.0f);
            int n12 = n5 + this.m + 1;
            int n13 = (int)Math.round((double)(n6 + this.V) + (double)f6) + 1;
            int n14 = K.y(n10);
            int n15 = K.U(n11);
            int n16 = K.y(n12);
            int n17 = K.U(n13);
            class_3322.method_44379(n14, n15, n16, n17);
            if (Frog.SHADER != null && Frog.SHADER.s()) {
                Frog.SHADER.k(n14, n15, n16, n17);
            }
            f4 = (float)(this.M() + this.R()) - 3.0f;
            for (T t2 : this.n()) {
                float f20 = (float)t2.o();
                int n18 = t2.Q();
                float f21 = n18 <= 0 ? (t2.q() ? 0.0f : 1.0f) : (f3 = Math.max(0.0f, Math.min(1.0f, f20 / (float)n18)));
                if (t2.q() && f20 <= 0.01f) {
                    t2.m = 0.0;
                    continue;
                }
                t2.S((float)n5 + 2.0f, f4);
                t2.A(this.k() - 4);
                if (!t2.q() || f20 > 0.01f) {
                    if (t2.m > 0.0 || t2.s) {
                        n4 = (int)t2.W() - 1;
                        int n19 = (int)t2.C() - 1;
                        int n20 = (int)(t2.W() + (float)t2.S() + 1.0f);
                        int n21 = (int)((double)(f4 + (float)t2.Q() + 1.5f) + t2.m) + 1;
                        int n22 = K.y(n4);
                        int n23 = K.U(n19);
                        int n24 = K.y(n20);
                        int n25 = K.U(n21);
                        class_3322.method_44379(n22, n23, n24, n25);
                        if (Frog.SHADER != null && Frog.SHADER.s()) {
                            Frog.SHADER.k(n22, n23, n24, n25);
                        }
                        t2.B(class_3322, n2, n3, f2);
                        class_3322.method_44380();
                        if (Frog.SHADER != null && Frog.SHADER.s()) {
                            Frog.SHADER.E();
                        }
                    } else {
                        t2.B(class_3322, n2, n3, f2);
                    }
                }
                f4 += f20 + 1.5f * f3 + (float)t2.m * f3;
            }
            class_3322.method_44380();
            if (Frog.SHADER != null && Frog.SHADER.s()) {
                Frog.SHADER.E();
            }
        }
    }

    public void U(int n2, int n3, int n4) {
        if (n4 == 0 && this.e(n2, n3)) {
            this.p((int)this.t);
            this.r((int)this.g);
            this.t = this.S;
            this.g = this.F;
            this.N.a = this.S;
            this.N.h = this.S;
            this.k.a = this.F;
            this.k.h = this.F;
            int n5 = (int)(this.G + this.i);
            int n6 = (int)this.R;
            this.Q = this.S - (n2 - n5);
            this.h = this.F - (n3 - n6);
            dev.idhammai.c.y.u.I.t.a().n().forEach(K::lambda$mouseClicked$4);
            this.B = true;
            return;
        }
        if (n4 == 1 && this.e(n2, n3)) {
            this.j = !this.j;
            C.L();
            return;
        }
        if (!this.j) {
            return;
        }
        this.n().forEach(arg_0 -> K.lambda$mouseClicked$5(n2, n3, n4, arg_0));
    }

    public void T(int n2, int n3, int n4) {
        if (n4 == 0) {
            this.B = false;
        }
        if (!this.j) {
            return;
        }
        this.n().forEach(arg_0 -> K.lambda$mouseReleased$6(n2, n3, n4, arg_0));
    }

    public void K(char c2, int n2) {
        if (!this.j) {
            return;
        }
        this.n().forEach(arg_0 -> K.lambda$onKeyTyped$7(c2, n2, arg_0));
    }

    public void Y(int n2) {
        if (!this.j) {
            return;
        }
        this.n().forEach(arg_0 -> K.lambda$onKeyPressed$8(n2, arg_0));
    }

    public void f(T t2) {
        this.U.add(t2);
    }

    public int t() {
        return (int)(this.t + this.G + this.i);
    }

    public int Q() {
        return this.S;
    }

    public void p(int n2) {
        this.S = n2;
    }

    public int M() {
        return (int)(this.g + this.R);
    }

    public int a() {
        return this.F;
    }

    public void r(int n2) {
        this.F = n2;
    }

    public int k() {
        return this.m;
    }

    public void M(int n2) {
        this.m = n2;
    }

    public int R() {
        return this.V;
    }

    public void J(int n2) {
        this.V = n2;
    }

    public boolean H() {
        return this.M;
    }

    public void G(boolean bl) {
        this.M = bl;
    }

    public boolean c() {
        return this.j;
    }

    public final List<T> n() {
        return this.U;
    }

    public void i(float f2, float f3) {
        this.G = f2;
        this.R = f3;
    }

    public void e(float f2) {
        this.i = f2;
    }

    public boolean e(int n2, int n3) {
        int n4 = P.M().pI.V();
        int n5 = Math.round((float)this.t() + ((float)this.k() - (float)n4) / 2.0f);
        int n6 = this.M();
        int n7 = n4;
        int n8 = this.R() - 5;
        return n2 >= n5 && n2 <= n5 + n7 && n3 >= n6 && n3 <= n6 + n8;
    }

    public boolean X(int n2, int n3) {
        if (this.e(n2, n3)) {
            return true;
        }
        if (!this.j) {
            return false;
        }
        float f2 = this.d;
        int n4 = this.M() + this.R() - 5;
        return n2 >= this.t() && n2 <= this.t() + this.k() && (float)n3 >= (float)n4 && (float)n3 <= (float)n4 + f2;
    }

    private float D() {
        float f2 = 0.0f;
        for (T t2 : this.n()) {
            double d2 = t2.o();
            if (t2.q() && d2 <= 0.01) {
                t2.m = 0.0;
                continue;
            }
            t2.E();
            double d3 = t2.P.g(t2.s ? 1.0 : 0.0, 200L, dev.idhammai.P.A.A.S.CubicInOut);
            t2.m = t2.H() * d3;
            int n2 = t2.Q();
            double d4 = n2 <= 0 ? (t2.q() ? 0.0 : 1.0) : Math.max(0.0, Math.min(1.0, d2 / (double)n2));
            f2 += (float)d2 + 1.5f * (float)d4 + (float)(t2.m * d4);
        }
        return f2;
    }

    protected void x(String string, double d2, double d3, Color color) {
        this.A(string, d2, d3, color.hashCode());
    }

    protected void A(String string, double d2, double d3, int n2) {
        K.a(this.w, string, d2, d3, n2);
    }

    private static void lambda$onKeyPressed$8(int n2, T t2) {
        if (!t2.q()) {
            t2.l(n2);
        }
    }

    private static void lambda$onKeyTyped$7(char c2, int n2, T t2) {
        if (!t2.q()) {
            t2.G(c2, n2);
        }
    }

    private static void lambda$mouseReleased$6(int n2, int n3, int n4, T t2) {
        if (!t2.q()) {
            t2.H(n2, n3, n4);
        }
    }

    private static void lambda$mouseClicked$5(int n2, int n3, int n4, T t2) {
        if (!t2.q()) {
            t2.d(n2, n3, n4);
        }
    }

    private static void lambda$mouseClicked$4(K k2) {
        if (k2.B) {
            k2.B = false;
        }
    }

    private static void lambda$drawScreen$3(class_332 class_3322, float f2, float f3, float f4, float f5, int n2, float f6) {
        o.K(class_3322.method_51448(), f2, f3, f4, f5 - f3, n2);
        o.K(class_3322.method_51448(), f6 - f4, f3, f4, f5 - f3, n2);
    }

    private static void lambda$drawScreen$2(class_332 class_3322, float f2, float f3, float f4, float f5, float f6) {
        int n2 = P.M().p4.V();
        o.i(class_3322.method_51448(), f2, f3, f4, f5, 0.0f, 0.0f, f6, f6, 1.0f, new Color(255, 255, 255, n2), new Color(255, 255, 255, n2), new Color(255, 255, 255, n2), new Color(255, 255, 255, n2));
    }

    private static void lambda$drawClickGuiText$1(class_332 class_3322, Matrix4f matrix4f, int[] nArray, String string, double d2, double d3, int n2, boolean bl) {
        if (class_3322 == null) {
            return;
        }
        class_3322.method_51448().method_22903();
        if (matrix4f != null) {
            class_3322.method_51448().method_23760().method_23761().set((Matrix4fc)matrix4f);
        }
        if (nArray != null) {
            class_3322.method_44379(nArray[0], nArray[1], nArray[2], nArray[3]);
        }
        if (dev.idhammai.p.J.n.s()) {
            dev.idhammai.p.J.n.w.H(class_3322.method_51448(), string, (int)d2, (int)d3, n2, bl);
        } else {
            class_3322.method_51433(dev.idhammai.P.A.J.W.field_1772, string, (int)d2, (int)d3, n2, bl);
        }
        if (nArray != null) {
            class_3322.method_44380();
        }
        class_3322.method_51448().method_22909();
    }

    private static void lambda$drawClickGuiHeader$0(class_332 class_3322, float f2, float f3, float f4, float f5, float f6, P p2, double d2, int n2) {
        o.z(class_3322.method_51448(), f2, f3, f4, f5, f6, f.y(p2.b(d2), n2));
    }
}

