/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.util.InputUtil
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.lwjgl.glfw.GLFW
 */
package dev.idhammai.c.y.u.K;

import dev.idhammai.Frog;
import dev.idhammai.P.A.A.S;
import dev.idhammai.P.A.A.k;
import dev.idhammai.P.A.J;
import dev.idhammai.P.A.S.o;
import dev.idhammai.c.Q;
import dev.idhammai.c.r.T;
import dev.idhammai.c.r.q.N.I;
import dev.idhammai.c.r.q.N.P;
import dev.idhammai.c.r.q.N.z.H;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import dev.idhammai.c.y.u.C.K;
import dev.idhammai.c.y.u.I.c;
import dev.idhammai.c.y.u.I.f;
import dev.idhammai.c.y.u.I.t;
import dev.idhammai.c.y.u.K.O;
import dev.idhammai.p.J.n;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.InputUtil;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.lwjgl.glfw.GLFW;

public final class X {
    private final t J;
    private K v;
    private boolean S;
    private float W;
    private float L;
    private T z;
    private int U;
    private int b;
    private boolean g;
    private int E;
    private int R;
    private int Z;
    private int s;
    private final ArrayList<T> Y = new ArrayList();
    private boolean t;
    private int V;
    private int M;
    private final ArrayList<O> j = new ArrayList();
    private final k a = new k();
    private final k o = new k();
    private T F;
    private boolean m;
    private final ArrayList<T> X = new ArrayList();
    private boolean p;
    private int G;
    private int K;
    private final k B = new k();
    private final k f = new k();

    public X(t t2) {
        this.J = t2;
    }

    public void w() {
        this.J();
    }

    public void z() {
        this.S = false;
    }

    public void x(double d2) {
        if (dev.idhammai.P.A.J.W == null || dev.idhammai.P.A.J.W.method_22683() == null) {
            return;
        }
        if (this.v == null) {
            return;
        }
        if (!this.S) {
            return;
        }
        if (class_3675.method_15987((long)dev.idhammai.P.A.J.W.method_22683().method_4490(), (int)340)) {
            if (d2 < 0.0) {
                this.W -= 15.0f;
            } else if (d2 > 0.0) {
                this.W += 15.0f;
            }
        } else if (d2 < 0.0) {
            this.L -= 15.0f;
        } else if (d2 > 0.0) {
            this.L += 15.0f;
        }
    }

    public void F(int n2, int n3, int n4) {
        if (n4 == 0) {
            ArrayList<T> arrayList = new ArrayList<T>();
            if (this.t) {
                for (O object : this.j) {
                    if (object.f == null) continue;
                    arrayList.add(object.f);
                }
            } else if (this.z != null) {
                arrayList.add(this.z);
            }
            this.z = null;
            this.t = false;
            this.j.clear();
            T.e(false);
            for (T t2 : arrayList) {
                t2.J();
            }
        }
        if (this.v != null) {
            this.v.T(n2, n3, n4);
        }
    }

    public void v(int n2) {
        if (n2 == 256) {
            if (this.p) {
                this.T();
                return;
            }
            if (!this.Y.isEmpty()) {
                this.E();
                return;
            }
        }
        if (!this.Y.isEmpty()) {
            if (n2 == 71) {
                this.W();
                return;
            }
            if (n2 == 72) {
                this.l();
                return;
            }
            if (n2 == 86) {
                this.a();
                return;
            }
            if (n2 == 76) {
                this.B();
                return;
            }
            if (n2 == 84) {
                this.Z();
                return;
            }
        }
        if (this.v != null) {
            this.v.Y(n2);
        }
    }

    public void A(char c2, int n2) {
        if (this.v != null) {
            this.v.K(c2, n2);
        }
    }

    public void d(class_332 class_3322, int n2, int n3, float f2, c c2) {
        boolean bl;
        P p2 = P.M();
        if (p2 == null) {
            return;
        }
        boolean bl2 = bl = this.J.B() == dev.idhammai.c.y.u.I.f.Hud;
        if (bl) {
            this.X(n2, n3);
            this.P(n2, n3);
        }
        float f3 = c2.X(dev.idhammai.c.y.u.I.f.Hud);
        float f4 = c2.p == 0.0f ? (float)c2.M : (float)c2.M / c2.p;
        float f5 = Math.max(8.0f, (f4 - (float)c2.o) / 2.0f);
        float f6 = f5 + 10.0f;
        float f7 = (float)c2.Q + 10.0f;
        if (this.v == null) {
            return;
        }
        this.v.i(c2.f, c2.Z);
        this.v.e(f3);
        if (!this.S) {
            this.W = f6;
            this.L = f7;
            this.v.p((int)this.W);
            this.v.r((int)this.L);
            this.S = true;
        }
        if (this.v.B) {
            this.W = (float)this.v.t() - f3 - c2.f;
            this.L = (float)this.v.M() - c2.Z;
        } else {
            this.v.p((int)this.W);
            this.v.r((int)this.L);
        }
        class_3322.method_51448().method_22903();
        class_3322.method_51448().method_46416(0.0f, 0.0f, 800.0f);
        this.v.K(class_3322, n2, n3, f2);
        class_3322.method_51448().method_22909();
        if (bl) {
            class_3322.method_51448().method_22903();
            class_3322.method_51448().method_46416(0.0f, 0.0f, 900.0f);
            if (P.M().pM.X() == dev.idhammai.c.r.q.N.S.Shader && Frog.SHADER != null && Frog.SHADER.s()) {
                Matrix4f matrix4f = new Matrix4f((Matrix4fc)class_3322.method_51448().method_23760().method_23761());
                Frog.SHADER.Q(() -> this.lambda$render$0(class_3322, matrix4f, c2, n2, n3));
            } else {
                this.w(class_3322, c2, n2, n3);
                this.L(class_3322, c2, n2, n3);
            }
            class_3322.method_51448().method_22909();
        }
    }

    public boolean M(int n2, int n3, int n4, c c2) {
        if (dev.idhammai.P.A.J.W == null || dev.idhammai.P.A.J.W.method_22683() == null) {
            return false;
        }
        P p2 = P.M();
        if (p2 == null) {
            return false;
        }
        float f2 = c2.l(n2);
        float f3 = c2.D(n3);
        if (this.F() && this.j(n2, n3, n4, c2)) {
            return true;
        }
        if (this.Y.size() >= 2 && n4 == 0 && this.s(f2, f3, c2)) {
            this.t(c2);
            return true;
        }
        if (this.v != null && this.v.X(n2, n3)) {
            this.v.U(n2, n3, n4);
            return true;
        }
        if (n4 == 0) {
            if (this.W(n2, n3)) {
                return true;
            }
            this.i(n2, n3);
            return true;
        }
        if (n4 == 1 && this.Y.size() >= 2) {
            this.t(c2);
            return true;
        }
        return false;
    }

    private void J() {
        ArrayList<Q> arrayList = new ArrayList<Q>();
        for (y y2 : Frog.MODULE.h()) {
            if (!this.l(y2)) continue;
            arrayList.add(y2);
        }
        arrayList.sort(Comparator.comparingInt(X::L).thenComparingInt(X::a).thenComparing(Q::o));
        this.v = new K("HUD", w.Client, 100, 100, true);
        for (y y2 : arrayList) {
            this.v.f(new dev.idhammai.c.y.R.V.T(y2));
        }
    }

    private static int L(Q q2) {
        String string = q2.o();
        if (string.equals("HUDSetting") || string.equals("ArrayList") || string.equals("Coords") || string.equals("Info") || string.equals("WaterMark") || string.equals("Armor")) {
            return 0;
        }
        if (string.startsWith("Items")) {
            return 2;
        }
        return 1;
    }

    private static int a(Q q2) {
        return switch (q2.o()) {
            case "HUDSetting" -> -1;
            case "ArrayList" -> 0;
            case "Coords" -> 1;
            case "Info" -> 2;
            case "WaterMark" -> 3;
            case "Armor" -> 4;
            case "TextRadar" -> 5;
            default -> 999;
        };
    }

    private boolean l(y y2) {
        return y2 instanceof T || y2 instanceof H;
    }

    private boolean W(int n2, int n3) {
        if (this.v == null) {
            return false;
        }
        for (dev.idhammai.c.y.R.V.T t2 : this.v.n()) {
            T t3;
            y y2 = t2.Z();
            if (!(y2 instanceof T) || !(t3 = (T)y2).p() || !t3.T(n2, n3)) continue;
            if (!this.Y.isEmpty() && this.Y.contains(t3)) {
                this.U(n2, n3);
                return true;
            }
            this.t = false;
            this.j.clear();
            this.z = t3;
            this.U = n2 - t3.Z();
            this.b = n3 - t3.t();
            return true;
        }
        return false;
    }

    private void X(int n2, int n3) {
        if (!this.t && this.z == null) {
            return;
        }
        if (dev.idhammai.P.A.J.W == null || dev.idhammai.P.A.J.W.method_22683() == null) {
            this.z = null;
            this.t = false;
            this.j.clear();
            return;
        }
        long l2 = dev.idhammai.P.A.J.W.method_22683().method_4490();
        if (GLFW.glfwGetMouseButton((long)l2, (int)0) != 1) {
            this.z = null;
            this.t = false;
            this.j.clear();
            return;
        }
        if (this.t) {
            int n4 = n2 - this.V;
            int n5 = n3 - this.M;
            T.e(true);
            for (O o2 : this.j) {
                o2.f.P(o2.i + n4, o2.c + n5);
            }
            T.e(false);
            return;
        }
        int n6 = n2 - this.U;
        int n7 = n3 - this.b;
        T.e(true);
        this.z.P(n6, n7);
        T.e(false);
    }

    private void i(int n2, int n3) {
        this.T();
        this.g = true;
        this.E = n2;
        this.R = n3;
        this.Z = n2;
        this.s = n3;
        this.Y.clear();
        this.t = false;
        this.j.clear();
        this.z = null;
        if (this.v != null) {
            this.v.B = false;
        }
    }

    private void P(int n2, int n3) {
        if (!this.g) {
            return;
        }
        this.Z = n2;
        this.s = n3;
        if (dev.idhammai.P.A.J.W == null || dev.idhammai.P.A.J.W.method_22683() == null) {
            this.u();
            return;
        }
        long l2 = dev.idhammai.P.A.J.W.method_22683().method_4490();
        if (GLFW.glfwGetMouseButton((long)l2, (int)0) != 1) {
            this.u();
        }
    }

    private void U(int n2, int n3) {
        this.T();
        this.t = true;
        this.V = n2;
        this.M = n3;
        this.j.clear();
        for (T t2 : this.Y) {
            if (!t2.p()) continue;
            this.j.add(new O(t2, t2.Z(), t2.t()));
        }
        this.z = null;
        if (this.v != null) {
            this.v.B = false;
        }
    }

    private void u() {
        if (!this.g) {
            return;
        }
        this.g = false;
        int n2 = this.E;
        int n3 = this.R;
        int n4 = this.Z;
        int n5 = this.s;
        this.Y.clear();
        for (y y2 : Frog.MODULE.h()) {
            T t2;
            if (!(y2 instanceof T) || !(t2 = (T)y2).p() || !t2.T(n2, n3, n4, n5)) continue;
            this.Y.add(t2);
        }
    }

    private void E() {
        this.g = false;
        this.Y.clear();
        this.T();
    }

    public void k(class_332 class_3322, boolean bl) {
        float f2;
        float f3;
        double d2;
        boolean bl2;
        int n2;
        int n3;
        int n4;
        int n5;
        float f4;
        P p2 = P.M();
        if (p2 == null) {
            return;
        }
        for (y object : Frog.MODULE.h()) {
            T t2;
            if (!(object instanceof T) || (f4 = (t2 = (T)object).m(bl)) <= 0.01f) continue;
            n5 = t2.g();
            n4 = t2.U();
            if (n5 <= 0 || n4 <= 0) continue;
            int n6 = t2.Z();
            int n7 = t2.t();
            float f5 = n6;
            float f6 = n7;
            float color = n5;
            float color4 = n4;
            n3 = Math.max(0, Math.min(255, Math.round(120.0f * f4)));
            n2 = Math.max(0, Math.min(255, Math.round(30.0f * f4)));
            Color n17 = dev.idhammai.P.A.S.f.y(p2.pH.P(), n3);
            Color n18 = dev.idhammai.P.A.S.f.y(p2.G.P(), n2);
            this.k(class_3322, f5, f6, color, color4, n18, n17);
        }
        boolean bl3 = bl2 = this.t || this.z != null;
        if (bl2) {
            if (this.t) {
                this.m = true;
                this.F = null;
                this.X.clear();
                for (O o2 : this.j) {
                    if (o2.f == null) continue;
                    this.X.add(o2.f);
                }
            } else {
                this.m = false;
                this.F = this.z;
                this.X.clear();
            }
        }
        if ((f4 = (float)(d2 = this.a.g(bl2 ? 1.0 : 0.0, 140L, dev.idhammai.P.A.A.S.CubicInOut))) > 0.01f) {
            n5 = Math.max(0, Math.min(255, (int)Math.round(60.0 * (double)f4)));
            n4 = Math.max(0, Math.min(255, (int)Math.round(220.0 * (double)f4)));
            Color color = dev.idhammai.P.A.S.f.y(p2.G.P(), n5);
            Color color2 = dev.idhammai.P.A.S.f.y(p2.pH.P(), n4);
            if (bl2 ? this.t : this.m) {
                Object object = var12_23 = bl2 ? null : this.X;
                if (bl2) {
                    for (O o3 : this.j) {
                        T t3 = o3.f;
                        if (t3 == null || !t3.p()) continue;
                        n3 = t3.g();
                        n2 = t3.U();
                        if (n3 <= 0 || n2 <= 0) continue;
                        int n8 = t3.Z();
                        int n9 = t3.t();
                        var20_54 = n8;
                        var21_56 = n9;
                        f3 = n3;
                        f2 = n2;
                        this.k(class_3322, var20_54, var21_56, f3, f2, color, color2);
                    }
                } else {
                    Iterator<Object> iterator = var12_23.iterator();
                    while (iterator.hasNext()) {
                        T t4 = (T)iterator.next();
                        if (t4 == null || !t4.p()) continue;
                        int n10 = t4.g();
                        n3 = t4.U();
                        if (n10 <= 0 || n3 <= 0) continue;
                        n2 = t4.Z();
                        int n11 = t4.t();
                        float f7 = n2;
                        var20_54 = n11;
                        var21_56 = n10;
                        f3 = n3;
                        this.k(class_3322, f7, var20_54, var21_56, f3, color, color2);
                    }
                }
            } else {
                Object object = var12_23 = bl2 ? this.z : this.F;
                if (var12_23 != null && ((y)var12_23).p()) {
                    int n12 = ((T)var12_23).g();
                    int n13 = ((T)var12_23).U();
                    if (n12 > 0 && n13 > 0) {
                        int n14 = ((T)var12_23).Z();
                        n3 = ((T)var12_23).t();
                        float f8 = n14;
                        float f9 = n3;
                        float f10 = n12;
                        var20_54 = n13;
                        this.k(class_3322, f8, f9, f10, var20_54, color, color2);
                    }
                }
            }
        } else if (!bl2) {
            this.F = null;
            this.X.clear();
            this.m = false;
        }
        n5 = !this.Y.isEmpty() ? 1 : 0;
        double d3 = this.o.g(n5 != 0 ? 1.0 : 0.0, 140L, dev.idhammai.P.A.A.S.CubicInOut);
        float f11 = (float)d3;
        if (f11 > 0.01f) {
            int n15 = Math.max(0, Math.min(255, (int)Math.round(60.0 * (double)f11)));
            int n16 = Math.max(0, Math.min(255, (int)Math.round(220.0 * (double)f11)));
            Color color = dev.idhammai.P.A.S.f.y(p2.G.P(), n15);
            Color color3 = dev.idhammai.P.A.S.f.y(p2.pH.P(), n16);
            for (T t5 : this.Y) {
                int n17 = t5.g();
                int n18 = t5.U();
                if (n17 <= 0 || n18 <= 0) continue;
                int n19 = t5.Z();
                int n20 = t5.t();
                f3 = n19;
                f2 = n20;
                float f12 = n17;
                float f13 = n18;
                this.k(class_3322, f3, f2, f12, f13, color, color3);
            }
        }
    }

    private void w(class_332 class_3322, c c2, int n2, int n3) {
        float f2;
        double d2;
        float f3;
        float f4;
        float f5;
        int n4;
        boolean bl;
        P p2 = P.M();
        if (p2 == null) {
            return;
        }
        boolean bl2 = n.s();
        boolean bl3 = n.w();
        boolean bl4 = I.Q != null && I.Q.C.h();
        boolean bl5 = !this.Y.isEmpty();
        boolean bl6 = bl = this.Y.size() >= 2;
        if (this.g) {
            int n5 = this.E;
            int n6 = this.R;
            int n7 = this.Z;
            n4 = this.s;
            float f6 = Math.min(c2.l(n5), c2.l(n7));
            float f7 = Math.min(c2.D(n6), c2.D(n4));
            f5 = Math.abs(c2.l(n7) - c2.l(n5));
            f4 = Math.abs(c2.D(n4) - c2.D(n6));
            Color color = dev.idhammai.P.A.S.f.y(p2.pH.P(), 36);
            Color color2 = dev.idhammai.P.A.S.f.y(p2.pH.P(), 170);
            this.k(class_3322, f6, f7, f5, f4, color, color2);
        }
        if ((f3 = (float)(d2 = this.B.g(bl5 ? 1.0 : 0.0, 160L, dev.idhammai.P.A.A.S.CubicInOut))) < 0.01f && !bl5) {
            return;
        }
        n4 = Integer.MAX_VALUE;
        int n8 = Integer.MAX_VALUE;
        for (T t2 : this.Y) {
            int n9 = t2.g();
            int n10 = t2.U();
            if (n9 <= 0 || n10 <= 0) continue;
            int n11 = t2.Z();
            int n12 = t2.t();
            n4 = Math.min(n4, n11);
            n8 = Math.min(n8, n12);
        }
        if (n4 == Integer.MAX_VALUE) {
            return;
        }
        if (!bl) {
            return;
        }
        String string = bl4 ? "\u5e03\u5c40" : "Layout";
        f5 = bl2 ? n.w.b(string) : dev.idhammai.P.A.S.n.H(string);
        f4 = bl2 ? n.w.V() : dev.idhammai.P.A.S.n.Y();
        float f8 = 4.0f;
        float f9 = f5 + f8 * 2.0f;
        float f10 = f4 + 4.0f;
        float f11 = c2.l(n4);
        float f12 = c2.D(n8) - f10 - 2.0f;
        float f13 = f2 = c2.p == 0.0f ? (float)c2.a : ((float)c2.a - c2.K) / c2.p;
        if (f12 < 1.0f) {
            f12 = 1.0f;
        }
        if (f12 + f10 > f2 - 1.0f) {
            f12 = f2 - f10 - 1.0f;
        }
        float f14 = 0.85f + 0.15f * f3;
        float f15 = f11 + f9 / 2.0f;
        float f16 = f12 + f10 / 2.0f;
        class_3322.method_51448().method_22903();
        class_3322.method_51448().method_46416(f15, f16, 0.0f);
        class_3322.method_51448().method_22905(f14, f14, 1.0f);
        class_3322.method_51448().method_46416(-f15, -f16, 0.0f);
        int n13 = Math.max(0, Math.min(255, (int)Math.round(240.0 * (double)f3)));
        int n14 = Math.max(0, Math.min(255, (int)Math.round(200.0 * (double)f3)));
        Color color = dev.idhammai.P.A.S.f.y(p2.G.P(), n13);
        Color color3 = dev.idhammai.P.A.S.f.y(p2.pH.P(), n14);
        dev.idhammai.P.A.S.o.q(class_3322.method_51448(), f11, f12, f9, f10, color, color3);
        int n15 = Math.max(0, Math.min(255, (int)Math.round((double)p2.ps.P().getAlpha() * (double)f3)));
        int n16 = dev.idhammai.P.A.S.f.y(p2.ps.P(), n15).getRGB();
        dev.idhammai.P.A.S.n.h(class_3322, string, f11 + f8, f12 + 2.0f, n16, bl2, bl3);
        class_3322.method_51448().method_22909();
    }

    private void t(c c2) {
        float f2;
        this.p = true;
        if (this.Y.size() < 2) {
            this.G = 0;
            this.K = 0;
            return;
        }
        boolean bl = n.s();
        boolean bl2 = I.Q != null && I.Q.C.h();
        int n2 = Integer.MAX_VALUE;
        int n3 = Integer.MAX_VALUE;
        for (T t2 : this.Y) {
            int n4 = t2.g();
            int n5 = t2.U();
            if (n4 <= 0 || n5 <= 0) continue;
            n2 = Math.min(n2, t2.Z());
            n3 = Math.min(n3, t2.t());
        }
        if (n2 == Integer.MAX_VALUE) {
            this.G = 0;
            this.K = 0;
            return;
        }
        String string = bl2 ? "\u5e03\u5c40" : "Layout";
        float f3 = bl ? n.w.b(string) : dev.idhammai.P.A.S.n.H(string);
        float f4 = bl ? n.w.V() : dev.idhammai.P.A.S.n.Y();
        float f5 = 4.0f;
        float f6 = f3 + f5 * 2.0f;
        float f7 = f4 + 4.0f;
        float f8 = c2.l(n2);
        float f9 = c2.D(n3) - f7 - 2.0f;
        float f10 = f2 = c2.p == 0.0f ? (float)c2.a : ((float)c2.a - c2.K) / c2.p;
        if (f9 < 1.0f) {
            f9 = 1.0f;
        }
        if (f9 + f7 > f2 - 1.0f) {
            f9 = f2 - f7 - 1.0f;
        }
        float f11 = f8 + f6;
        float f12 = f9;
        this.G = Math.round(c2.p == 0.0f ? f11 : f11 * c2.p);
        this.K = Math.round(c2.p == 0.0f ? f12 : f12 * c2.p + c2.K);
    }

    private void T() {
        this.p = false;
    }

    private boolean s(float f2, float f3, c c2) {
        float f4;
        if (this.Y.size() < 2) {
            return false;
        }
        boolean bl = n.s();
        boolean bl2 = I.Q != null && I.Q.C.h();
        int n2 = Integer.MAX_VALUE;
        int n3 = Integer.MAX_VALUE;
        for (T t2 : this.Y) {
            int n4 = t2.g();
            int n5 = t2.U();
            if (n4 <= 0 || n5 <= 0) continue;
            n2 = Math.min(n2, t2.Z());
            n3 = Math.min(n3, t2.t());
        }
        if (n2 == Integer.MAX_VALUE) {
            return false;
        }
        String string = bl2 ? "\u5e03\u5c40" : "Layout";
        float f5 = bl ? n.w.b(string) : dev.idhammai.P.A.S.n.H(string);
        float f6 = bl ? n.w.V() : dev.idhammai.P.A.S.n.Y();
        float f7 = 4.0f;
        float f8 = f5 + f7 * 2.0f;
        float f9 = f6 + 4.0f;
        float f10 = c2.l(n2);
        float f11 = c2.D(n3) - f9 - 2.0f;
        float f12 = f4 = c2.p == 0.0f ? (float)c2.a : ((float)c2.a - c2.K) / c2.p;
        if (f11 < 1.0f) {
            f11 = 1.0f;
        }
        if (f11 + f9 > f4 - 1.0f) {
            f11 = f4 - f9 - 1.0f;
        }
        return f2 >= f10 && f2 <= f10 + f8 && f3 >= f11 && f3 <= f11 + f9;
    }

    private String[] n(boolean bl) {
        if (bl) {
            return new String[]{"\u7f51\u683c (G)", "\u6c34\u5e73 (H)", "\u5782\u76f4 (V)"};
        }
        return new String[]{"Grid (G)", "Horizontal (H)", "Vertical (V)"};
    }

    private boolean F() {
        if (!this.p && this.Y.size() < 2) {
            return false;
        }
        double d2 = this.f.g(this.p ? 1.0 : 0.0, 160L, dev.idhammai.P.A.A.S.CubicInOut);
        return d2 > 0.01;
    }

    private boolean j(int n2, int n3, int n4, c c2) {
        boolean bl;
        float f2;
        double d2 = this.f.g(this.p ? 1.0 : 0.0, 160L, dev.idhammai.P.A.A.S.CubicInOut);
        if (d2 <= 0.01 || this.Y.size() < 2) {
            return false;
        }
        P p2 = P.M();
        if (p2 == null) {
            this.T();
            return false;
        }
        boolean bl2 = n.s();
        boolean bl3 = n.w();
        boolean bl4 = I.Q != null && I.Q.C.h();
        String[] stringArray = this.n(bl4);
        float f3 = c2.l(n2);
        float f4 = c2.D(n3);
        float f5 = c2.l(this.G);
        float f6 = c2.D(this.K);
        float f7 = bl2 ? n.w.V() : dev.idhammai.P.A.S.n.Y();
        float f8 = f7 + 6.0f;
        float f9 = 6.0f;
        float f10 = 0.0f;
        for (String string : stringArray) {
            float f11 = f2 = bl2 ? n.w.b(string) : dev.idhammai.P.A.S.n.H(string);
            if (!(f2 > f10)) continue;
            f10 = f2;
        }
        float f12 = f10 + f9 * 2.0f;
        float f13 = f8 * (float)stringArray.length + f9 * 2.0f;
        float f14 = (float)d2;
        float f15 = 0.85f + 0.15f * f14;
        f2 = f12 * f15;
        float f16 = f13 * f15;
        boolean bl5 = bl = f3 >= f5 && f3 <= f5 + f2 && f4 >= f6 && f4 <= f6 + f16;
        if (!bl) {
            if (n4 == 0) {
                this.T();
                return false;
            }
            this.T();
            return true;
        }
        if (n4 != 0) {
            return true;
        }
        float f17 = (f3 - f5) / Math.max(1.0E-4f, f15);
        float f18 = (f4 - f6) / Math.max(1.0E-4f, f15);
        int n5 = (int)Math.floor((f18 - f9) / f8);
        if (n5 < 0 || n5 >= stringArray.length) {
            return true;
        }
        if (n5 == 0) {
            this.W();
        } else if (n5 == 1) {
            this.l();
        } else if (n5 == 2) {
            this.a();
        }
        this.T();
        return true;
    }

    private void L(class_332 class_3322, c c2, int n2, int n3) {
        float f2;
        float f3;
        double d2 = this.f.g(this.p ? 1.0 : 0.0, 160L, dev.idhammai.P.A.A.S.CubicInOut);
        float f4 = (float)d2;
        if (f4 <= 0.01f || this.Y.size() < 2) {
            return;
        }
        P p2 = P.M();
        if (p2 == null) {
            this.T();
            return;
        }
        boolean bl = n.s();
        boolean bl2 = n.w();
        boolean bl3 = I.Q != null && I.Q.C.h();
        String[] stringArray = this.n(bl3);
        float f5 = c2.l(this.G);
        float f6 = c2.D(this.K);
        float f7 = bl ? n.w.V() : dev.idhammai.P.A.S.n.Y();
        float f8 = f7 + 6.0f;
        float f9 = 6.0f;
        float f10 = 0.0f;
        for (String string : stringArray) {
            float f11 = f3 = bl ? n.w.b(string) : dev.idhammai.P.A.S.n.H(string);
            if (!(f3 > f10)) continue;
            f10 = f3;
        }
        float f12 = f10 + f9 * 2.0f;
        float f13 = f8 * (float)stringArray.length + f9 * 2.0f;
        float f14 = c2.p == 0.0f ? (float)c2.M : (float)c2.M / c2.p;
        float f15 = f2 = c2.p == 0.0f ? (float)c2.a : ((float)c2.a - c2.K) / c2.p;
        if (f5 + f12 > f14 - 2.0f) {
            f5 = f14 - f12 - 2.0f;
        }
        if (f6 + f13 > f2 - 2.0f) {
            f6 = f2 - f13 - 2.0f;
        }
        if (f5 < 2.0f) {
            f5 = 2.0f;
        }
        if (f6 < 2.0f) {
            f6 = 2.0f;
        }
        f3 = f5 + f12 / 2.0f;
        float f16 = f6 + f13 / 2.0f;
        float f17 = 0.85f + 0.15f * f4;
        class_3322.method_51448().method_22903();
        class_3322.method_51448().method_46416(f3, f16, 0.0f);
        class_3322.method_51448().method_22905(f17, f17, 1.0f);
        class_3322.method_51448().method_46416(-f3, -f16, 0.0f);
        int n4 = Math.max(0, Math.min(255, (int)Math.round(245.0 * (double)f4)));
        int n5 = Math.max(0, Math.min(255, (int)Math.round(210.0 * (double)f4)));
        Color color = dev.idhammai.P.A.S.f.y(p2.G.P(), n4);
        Color color2 = dev.idhammai.P.A.S.f.y(p2.pH.P(), n5);
        dev.idhammai.P.A.S.o.q(class_3322.method_51448(), f5, f6, f12, f13, color, color2);
        float f18 = c2.l(n2);
        float f19 = c2.D(n3);
        float f20 = f5 + (f18 - f5) / Math.max(1.0E-4f, f17);
        float f21 = f6 + (f19 - f6) / Math.max(1.0E-4f, f17);
        int n6 = Math.max(0, Math.min(255, (int)Math.round((double)p2.ps.P().getAlpha() * (double)f4)));
        int n7 = dev.idhammai.P.A.S.f.y(p2.ps.P(), n6).getRGB();
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            boolean bl4;
            float f22 = f6 + f9 + (float)i2 * f8;
            boolean bl5 = bl4 = f20 >= f5 && f20 <= f5 + f12 && f21 >= f22 && f21 <= f22 + f8;
            if (bl4) {
                dev.idhammai.P.A.S.o.D(class_3322.method_51448(), f5 + 1.0f, f22, f12 - 2.0f, f8, dev.idhammai.P.A.S.f.y(p2.pH.P(), Math.max(0, Math.min(255, (int)Math.round(160.0 * (double)f4)))));
            }
            dev.idhammai.P.A.S.n.h(class_3322, stringArray[i2], f5 + f9, f22 + 2.0f, n7, bl, bl2);
        }
        class_3322.method_51448().method_22909();
    }

    private void W() {
        if (this.Y.isEmpty()) {
            return;
        }
        this.Y.sort(Comparator.comparingInt(T::t).thenComparingInt(T::Z));
        int n2 = Integer.MAX_VALUE;
        int n3 = Integer.MAX_VALUE;
        int n4 = 0;
        int n5 = 0;
        for (T t2 : this.Y) {
            n2 = Math.min(n2, t2.Z());
            n3 = Math.min(n3, t2.t());
            n4 = Math.max(n4, Math.max(1, t2.g()));
            n5 = Math.max(n5, Math.max(1, t2.U()));
        }
        int n6 = 2;
        int n7 = n4 + n6;
        int n8 = n5 + n6;
        int n9 = this.Y.size();
        int n10 = (int)Math.ceil(Math.sqrt(n9));
        n10 = Math.max(1, n10);
        for (int i2 = 0; i2 < n9; ++i2) {
            int n11 = i2 % n10;
            int n12 = i2 / n10;
            int n13 = n2 + n11 * n7;
            int n14 = n3 + n12 * n8;
            this.Y.get(i2).P(n13, n14);
        }
    }

    private void l() {
        if (this.Y.isEmpty()) {
            return;
        }
        this.Y.sort(Comparator.comparingInt(T::Z));
        int n2 = Integer.MAX_VALUE;
        for (T t2 : this.Y) {
            n2 = Math.min(n2, t2.t());
        }
        int n3 = 2;
        int n4 = this.Y.get(0).Z();
        for (T t3 : this.Y) {
            t3.P(n4, n2);
            int n5 = Math.max(1, t3.g());
            n4 += n5 + n3;
        }
    }

    private void a() {
        if (this.Y.isEmpty()) {
            return;
        }
        this.Y.sort(Comparator.comparingInt(T::t));
        int n2 = Integer.MAX_VALUE;
        for (T t2 : this.Y) {
            n2 = Math.min(n2, t2.Z());
        }
        int n3 = 2;
        int n4 = this.Y.get(0).t();
        for (T t3 : this.Y) {
            t3.P(n2, n4);
            int n5 = Math.max(1, t3.U());
            n4 += n5 + n3;
        }
    }

    private void B() {
        if (this.Y.isEmpty()) {
            return;
        }
        int n2 = Integer.MAX_VALUE;
        for (T t2 : this.Y) {
            n2 = Math.min(n2, t2.Z());
        }
        for (T t2 : this.Y) {
            t2.P(n2, t2.t());
        }
    }

    private void Z() {
        if (this.Y.isEmpty()) {
            return;
        }
        int n2 = Integer.MAX_VALUE;
        for (T t2 : this.Y) {
            n2 = Math.min(n2, t2.t());
        }
        for (T t2 : this.Y) {
            t2.P(t2.Z(), n2);
        }
    }

    private void k(class_332 class_3322, float f2, float f3, float f4, float f5, Color color, Color color2) {
        dev.idhammai.P.A.S.o.D(class_3322.method_51448(), f2, f3, f4, f5, color);
    }

    private void lambda$render$0(class_332 class_3322, Matrix4f matrix4f, c c2, int n2, int n3) {
        class_3322.method_51448().method_22903();
        class_3322.method_51448().method_23760().method_23761().set((Matrix4fc)matrix4f);
        this.w(class_3322, c2, n2, n3);
        this.L(class_3322, c2, n2, n3);
        class_3322.method_51448().method_22909();
    }
}

