/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_243
 *  net.minecraft.class_2561
 *  net.minecraft.class_332
 *  net.minecraft.class_437
 */
package dev.idhammai.c.y.u.I;

import com.mojang.blaze3d.systems.RenderSystem;
import dev.idhammai.Frog;
import dev.idhammai.P.A.A.S;
import dev.idhammai.P.A.A.k;
import dev.idhammai.P.A.A.m;
import dev.idhammai.P.A.J;
import dev.idhammai.c.r.T;
import dev.idhammai.c.r.q.N.B;
import dev.idhammai.c.r.q.N.P;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import dev.idhammai.c.y.R.C;
import dev.idhammai.c.y.u.C.G;
import dev.idhammai.c.y.u.C.K;
import dev.idhammai.c.y.u.C.L;
import dev.idhammai.c.y.u.C.Q;
import dev.idhammai.c.y.u.C.q;
import dev.idhammai.c.y.u.C.r;
import dev.idhammai.c.y.u.I.I;
import dev.idhammai.c.y.u.I.N;
import dev.idhammai.c.y.u.I.Y;
import dev.idhammai.c.y.u.I.c;
import dev.idhammai.c.y.u.I.f;
import dev.idhammai.c.y.u.K.X;
import dev.idhammai.c.y.u.m.l;
import dev.idhammai.p.J.n;
import dev.idhammai.p.R;
import java.awt.Color;
import java.util.ArrayList;
import java.util.function.Consumer;
import net.minecraft.class_243;
import net.minecraft.class_2561;
import net.minecraft.class_332;
import net.minecraft.class_437;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class t
extends class_437 {
    private static t K = new t();
    private final ArrayList<K> p = new ArrayList();
    private float C;
    private float N;
    private float s;
    private float E;
    private float j;
    private boolean P = false;
    private int F = -1;
    private int B = -1;
    private final dev.idhammai.c.y.u.x.t l = new dev.idhammai.c.y.u.x.t();
    private final G a = new G(this);
    private f m = f.Module;
    private final k G = new k();
    private final dev.idhammai.c.y.u.K.t D = new dev.idhammai.c.y.u.K.t(this);
    private final Q J = new Q(this);
    private final X H = new X(this);
    private c Y;
    private final l L = new l(this);
    private final L y = new L(this);
    private final r W = new r(this);
    private float A = 1.0f;

    public t() {
        super((class_2561)class_2561.method_43470((String)"Frog"));
        this.W();
        this.a();
    }

    public static t a() {
        if (K == null) {
            K = new t();
        }
        return K;
    }

    public f B() {
        return this.m;
    }

    public float x() {
        return this.A;
    }

    public void I(R r2) {
        this.W.l(r2);
    }

    private void W() {
        K = this;
    }

    private void a() {
        this.a.d();
        this.a.F(new q(f.Module, "Module", "\u6a21\u5757"));
        this.a.F(new q(f.Hud, "HUD", "HUD"));
        this.D.C();
        this.H.w();
    }

    private void D(class_332 class_3322, float f2, float f3, boolean bl) {
        for (y y2 : Frog.MODULE.h()) {
            T t2;
            float f4;
            if (!(y2 instanceof T) || (f4 = (t2 = (T)y2).m(bl)) <= 0.01f) continue;
            try {
                RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)(f3 * f4));
                y2.C(class_3322, f2);
            }
            catch (Exception exception) {
                exception.printStackTrace();
                if (dev.idhammai.c.r.q.N.I.Q == null || !dev.idhammai.c.r.q.N.I.Q.M.h()) continue;
                dev.idhammai.p.J.S.z("\u00a74An error has occurred (" + y2.o() + " [onRender2D]) Message: [" + exception.getMessage() + "]");
            }
        }
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)f3);
    }

    public void Z() {
        this.y.r();
    }

    public void I(float f2, float f3) {
        this.y.u(f2, f3);
    }

    protected void method_25426() {
        super.method_25426();
        if (dev.idhammai.c.r.q.N.P.M().P.h()) {
            boolean bl = dev.idhammai.c.r.q.N.I.Q != null && dev.idhammai.c.r.q.N.I.Q.C.h();
            String string = bl ? "\u8b66\u544a" : "Warning";
            String string2 = bl ? "\u6b64\u5ba2\u6237\u7aef\u662f\u514d\u8d39\u7684\u3002\u5982\u679c\u4f60\u662f\u4ed8\u8d39\u8d2d\u4e70\u7684,\u90a3\u4e48\u4f60\u88ab\u9a97\u4e86! QQ\u7fa4:1079753208" : "This client is free. If you paid for it, you have been scammed! QQ group: 1079753208.";
            String string3 = bl ? "\u6211\u660e\u767d\u4e86" : "I Understand";
            this.z(string, string2, t::lambda$init$0, null, string3, null);
        }
    }

    public void method_25394(class_332 class_3322, int n2, int n3, float f2) {
        boolean bl;
        this.m();
        this.A(class_3322, n2, n3);
        N n4 = this.c(class_3322, n2, n3);
        this.Y = n4.S;
        this.A = n4.c;
        dev.idhammai.c.y.R.C.A = class_3322;
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)n4.j);
        this.R(class_3322, dev.idhammai.c.r.q.N.P.M());
        boolean bl2 = bl = this.m == f.Hud;
        if (dev.idhammai.P.A.J.W != null && dev.idhammai.P.A.J.W.field_1755 == this) {
            this.D(class_3322, f2, n4.j, bl);
        }
        float f3 = n4.V == 0.0f ? n4.G : n4.G / n4.V;
        this.p.forEach(arg_0 -> t.lambda$render$1(f3, arg_0));
        P p2 = dev.idhammai.c.r.q.N.P.M();
        try (I i2 = new I(n4.I);){
            this.y(class_3322, n2, n3, n4, p2);
            this.w(class_3322, n2, n3, f2, n4);
            this.f(class_3322, n4);
        }
        this.W(class_3322, n2, n3, n4);
        this.l(class_3322, n2, n3);
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    public boolean method_25402(double d2, double d3, int n2) {
        Object object;
        if (this.L.q((int)d2, (int)d3, n2)) {
            return true;
        }
        if (this.W.y()) {
            return this.W.z(d2, d3, n2);
        }
        if (n2 == 0 && (object = this.a.U((int)d2, (int)d3)) != null) {
            this.a((f)((Object)object));
            return true;
        }
        if (this.y.l(d2, d3, n2, this.Y, this.field_22789, this.field_22790)) {
            return true;
        }
        if (this.m == f.Module) {
            object = this.Y;
            if (object != null && this.J.l((int)d2, (int)d3, n2, (c)object)) {
                return true;
            }
            this.D.z((int)d2, (int)d3, n2);
            return super.method_25402(d2, d3, n2);
        }
        object = this.Y;
        if (object == null) {
            return super.method_25402(d2, d3, n2);
        }
        if (this.m == f.Hud && this.H.M((int)d2, (int)d3, n2, (c)object)) {
            return true;
        }
        return super.method_25402(d2, d3, n2);
    }

    public boolean method_25406(double d2, double d3, int n2) {
        if (this.W.y()) {
            this.W.m(d2, d3, n2);
            return true;
        }
        if (this.m == f.Module) {
            c c2 = this.Y;
            if (c2 != null) {
                int n3 = (int)c2.l((int)d2);
                int n4 = (int)c2.D((int)d3);
                this.J.w(n3, n4, n2);
            }
            this.D.N((int)d2, (int)d3, n2);
        } else if (this.m == f.Hud) {
            c c3 = this.Y;
            int n5 = c3 != null ? (int)c3.l((int)d2) : (int)d2;
            int n6 = c3 != null ? (int)c3.D((int)d3) : (int)d3;
            this.H.F(n5, n6, n2);
        }
        return super.method_25406(d2, d3, n2);
    }

    public boolean method_25401(double d2, double d3, double d4, double d5) {
        if (this.W.y()) {
            this.W.y(d2, d3, d5);
            return true;
        }
        if (this.m == f.Module) {
            c c2 = this.Y;
            if (c2 != null && this.J.y(d5, (int)d2, (int)d3, c2)) {
                return true;
            }
            this.D.L(d5);
        } else if (this.m == f.Hud) {
            this.H.x(d5);
        }
        return super.method_25401(d2, d3, d4, d5);
    }

    public boolean method_25404(int n2, int n3, int n4) {
        if (this.L.w(n2)) {
            return true;
        }
        if (this.W.y()) {
            return this.W.C(n2);
        }
        if (this.y.c(n2)) {
            return true;
        }
        if (this.m == f.Module) {
            this.D.I(n2);
            return super.method_25404(n2, n3, n4);
        }
        if (this.m == f.Hud) {
            this.H.v(n2);
            return super.method_25404(n2, n3, n4);
        }
        return super.method_25404(n2, n3, n4);
    }

    public boolean method_25400(char c2, int n2) {
        if (this.L.M(c2)) {
            return true;
        }
        if (this.W.y()) {
            return this.W.d(c2, n2);
        }
        if (this.y.f(c2)) {
            return true;
        }
        if (this.m == f.Module) {
            this.D.W(c2, n2);
            return super.method_25400(c2, n2);
        }
        if (this.m == f.Hud) {
            this.H.A(c2, n2);
            return super.method_25400(c2, n2);
        }
        return super.method_25400(c2, n2);
    }

    public void K(String string, String string2, Runnable runnable) {
        this.L.W(string, string2, runnable);
    }

    public void z(String string, String string2, Runnable runnable, Runnable runnable2, String string3, String string4) {
        this.L.L(string, string2, runnable, runnable2, string3, string4);
    }

    public void h(String string, String string2, String string3, Consumer<String> consumer, Runnable runnable, String string4, String string5) {
        this.L.b(string, string2, string3, consumer, runnable, string4, string5);
    }

    public boolean method_25421() {
        return false;
    }

    public final ArrayList<K> n() {
        return this.p;
    }

    public Q j() {
        return this.J;
    }

    public L z() {
        return this.y;
    }

    public int k() {
        return -dev.idhammai.c.r.q.N.P.M().pG.V() - 6;
    }

    private void a(f f2) {
        this.V(f2, true);
    }

    private void V(f f2, boolean bl) {
        if (f2 == null) {
            return;
        }
        if (f2 != f.Module) {
            this.y.m(false);
        }
        this.m = f2;
        for (K k2 : this.p) {
            k2.B = false;
        }
        if (f2 == f.Hud && bl) {
            this.H.z();
        }
    }

    public int T() {
        if (n.s()) {
            return (int)n.w.V();
        }
        return 9;
    }

    public int F(String string) {
        if (n.s()) {
            return (int)n.w.b(string);
        }
        return dev.idhammai.P.A.J.W != null ? dev.idhammai.P.A.J.W.field_1772.method_1727(string) : 0;
    }

    public float K(float f2, float f3) {
        return f2 + (f3 - (float)this.T()) / 2.0f + (float)dev.idhammai.c.r.q.N.P.M().pG.V();
    }

    private N c(class_332 class_3322, int n2, int n3) {
        float f2;
        float f3 = f2 = (float)dev.idhammai.c.r.q.N.P.M().pO;
        float f4 = (1.0f - f2) * 20.0f;
        int n4 = class_3322.method_51421();
        int n5 = dev.idhammai.c.r.q.N.P.M() != null ? dev.idhammai.c.r.q.N.P.M().pI.V() : 101;
        int n6 = dev.idhammai.c.r.q.N.P.M() != null ? dev.idhammai.c.r.q.N.P.M().a.V() : 93;
        int n7 = Math.max(n5, n6);
        int n8 = this.p.size();
        int n9 = n8 > 0 ? n8 * n7 + (n8 - 1) : n4;
        int n10 = Math.max(n4, n9 + 32);
        double d2 = -((double)this.m.ordinal() * (double)n10);
        float f5 = (float)this.G.g(d2, 420L, S.SineOut);
        P p2 = dev.idhammai.c.r.q.N.P.M();
        boolean bl = p2 != null && p2.pM.X() == dev.idhammai.c.r.q.N.S.Shader;
        float f6 = this.C + this.s;
        float f7 = this.N + this.E;
        int n11 = Integer.MAX_VALUE;
        int n12 = Integer.MAX_VALUE;
        int n13 = Integer.MIN_VALUE;
        int n14 = Integer.MIN_VALUE;
        for (K k2 : this.p) {
            n11 = Math.min(n11, k2.t());
            n12 = Math.min(n12, k2.M());
            n13 = Math.max(n13, k2.t() + k2.k());
            n14 = Math.max(n14, k2.M() + k2.R());
        }
        int n15 = 16;
        int n16 = Math.max(8, n11 - n15);
        int n17 = Math.max(6, n12 - n15);
        int n18 = Math.min(class_3322.method_51421() - n16 - 8, n13 - n11 + n15 * 2);
        int n19 = Math.min(class_3322.method_51443() - n17 - 6, n14 - n12 + n15 * 2 + 24);
        boolean bl2 = n2 >= n16 && n2 <= n16 + n18 && n3 >= n17 && n3 <= n17 + n19;
        int n20 = bl2 ? (int)Math.round(242.25) : (int)Math.round(226.95000000000002);
        float f8 = f3 == 0.0f ? f5 : f5 / f3;
        c c2 = new c(f3, f4, f8, n10, n16, n17, n18, n19, f6, f7, class_3322.method_51421(), class_3322.method_51443());
        float f9 = this.W.y();
        float f10 = 1.0f - f9;
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        float f11 = Math.max(0.001f, f10);
        int n21 = this.T() + 6;
        float f12 = -((float)(n21 + 40) * (1.0f - f2));
        float f13 = f4 + f12;
        float f14 = (float)class_3322.method_51421() / 2.0f;
        float f15 = f3 * f11;
        float f16 = f15 <= 1.0E-4f ? 1.0E-4f : f15;
        return new N(f2, f3, f4, f5, bl, n10, n16, n17, n18, n19, f6, f7, f10, f11, class_3322.method_51421(), class_3322.method_51443(), c2, f16, f13, f14, n20);
    }

    private void R(class_332 class_3322, P p2) {
        if (p2 != null && this.m != f.Hud) {
            if (p2.E.X() == dev.idhammai.c.r.q.N.B.Blur && Frog.SHADER != null) {
                float f2 = p2.m.Z();
                Frog.SHADER.r(f2, (float)p2.pO);
            } else if (p2.E.X() == dev.idhammai.c.r.q.N.B.Shader && Frog.SHADER != null) {
                float f3 = p2.m.Z();
                Frog.SHADER.r(f3, (float)p2.pO);
                Frog.SHADER.V((float)p2.pO);
            } else if (p2.E.X() == dev.idhammai.c.r.q.N.B.Rain2 && Frog.SHADER != null) {
                float f4 = p2.m.Z();
                Frog.SHADER.r(f4, (float)p2.pO);
                Frog.SHADER.T((float)p2.pO);
            }
        }
        this.l.U(class_3322, p2);
    }

    private void m() {
        int n2;
        int n3;
        if (dev.idhammai.P.A.J.W != null && dev.idhammai.P.A.J.W.method_22683() != null) {
            n3 = dev.idhammai.P.A.J.W.method_22683().method_4486();
            n2 = dev.idhammai.P.A.J.W.method_22683().method_4502();
            if (n3 != this.F || n2 != this.B) {
                this.P = false;
                this.F = n3;
                this.B = n2;
                this.H.z();
            }
        }
        if (!this.P && dev.idhammai.P.A.J.W != null && dev.idhammai.P.A.J.W.method_22683() != null) {
            n3 = dev.idhammai.c.r.q.N.P.M() != null ? dev.idhammai.c.r.q.N.P.M().pI.V() : 101;
            n2 = dev.idhammai.c.r.q.N.P.M() != null ? dev.idhammai.c.r.q.N.P.M().a.V() : 93;
            int n4 = Math.max(n3, n2);
            int n5 = n4 + 1;
            int n6 = this.p.size();
            if (n6 > 0) {
                int n7 = dev.idhammai.P.A.J.W.method_22683().method_4486();
                int n8 = dev.idhammai.P.A.J.W.method_22683().method_4502();
                int n9 = n6 + 1;
                int n10 = n9 * n4 + (n9 - 1);
                int n11 = Math.round(((float)n7 - (float)n10) / 2.0f);
                int n12 = Math.round((float)n8 / 6.0f);
                int n13 = Math.round(((float)n4 - (float)n2) / 2.0f);
                int n14 = Math.max(0, Math.min(n6, w.Client.ordinal() + 1));
                int n15 = n11 + n13;
                this.Z();
                for (int i2 = 0; i2 < this.p.size(); ++i2) {
                    K k2 = this.p.get(i2);
                    int n16 = i2 >= n14 ? i2 + 1 : i2;
                    k2.p(n15 + n16 * n5);
                    k2.r(n12);
                }
                this.J.h(n15 + n14 * n5, n12);
            }
            this.P = true;
        }
    }

    private void A(class_332 class_3322, int n2, int n3) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        boolean bl = false;
        for (K k2 : this.p) {
            if (!k2.B) continue;
            bl = true;
            break;
        }
        float f9 = 0.0f;
        float f10 = 0.0f;
        if (dev.idhammai.c.r.q.N.P.M().c.h() && !bl) {
            f8 = dev.idhammai.c.r.q.N.P.M().pB.Z() * (float)dev.idhammai.c.r.q.N.P.M().pO;
            f7 = (float)class_3322.method_51421() / 2.0f;
            f6 = (float)class_3322.method_51443() / 2.0f;
            f5 = f7 <= 0.0f ? 0.0f : ((float)n2 - f7) / f7;
            float f11 = f6 <= 0.0f ? 0.0f : ((float)n3 - f6) / f6;
            f5 = Math.max(-1.0f, Math.min(1.0f, f5));
            f11 = Math.max(-1.0f, Math.min(1.0f, f11));
            f9 = f5 * f8;
            f10 = f11 * f8;
        }
        if ((f8 = dev.idhammai.c.r.q.N.P.M().p_.Z()) <= 0.0f) {
            this.C = f9;
            this.N = f10;
        } else {
            f7 = dev.idhammai.P.A.A.m.J() * f8;
            if (f7 < 0.0f) {
                f7 = 0.0f;
            }
            if (f7 > 0.35f) {
                f7 = 0.35f;
            }
            this.C += (f9 - this.C) * f7;
            this.N += (f10 - this.N) * f7;
        }
        f7 = 0.0f;
        f6 = 0.0f;
        f5 = 0.0f;
        if (dev.idhammai.c.r.q.N.P.M().pl.h() && !bl && dev.idhammai.P.A.J.W.field_1724 != null) {
            float f12;
            class_243 class_2432 = dev.idhammai.P.A.J.W.field_1724.method_18798();
            f4 = (float)Math.sqrt(class_2432.field_1352 * class_2432.field_1352 + class_2432.field_1350 * class_2432.field_1350);
            f3 = f4 > 0.003f ? Math.min(1.0f, f4 * 18.0f) : 0.0f;
            float f13 = dev.idhammai.P.A.A.m.J();
            if (f3 > 0.0f) {
                f12 = dev.idhammai.c.r.q.N.P.M().l.Z();
                this.j += f13 * f12 * (0.4f + 0.6f * f3);
            }
            f12 = dev.idhammai.c.r.q.N.P.M().Z.Z() * f3 * (float)dev.idhammai.c.r.q.N.P.M().pO;
            f5 = dev.idhammai.c.r.q.N.P.M().p6.Z() * (float)dev.idhammai.c.r.q.N.P.M().pO;
            f7 = (float)Math.sin(this.j) * f12;
            f6 = (float)Math.cos(this.j * 2.0f) * f12 * 0.35f;
            f7 = Math.max(-f5, Math.min(f5, f7));
            f6 = Math.max(-f5, Math.min(f5, f6));
        }
        if ((f2 = dev.idhammai.c.r.q.N.P.M().T.Z()) <= 0.0f) {
            this.s = f7;
            this.E = f6;
        } else {
            f4 = dev.idhammai.P.A.A.m.J() * f2;
            if (f4 < 0.0f) {
                f4 = 0.0f;
            }
            if (f4 > 0.35f) {
                f4 = 0.35f;
            }
            this.s += (f7 - this.s) * f4;
            this.E += (f6 - this.E) * f4;
        }
        if (f5 > 0.0f) {
            this.s = Math.max(-f5, Math.min(f5, this.s));
            this.E = Math.max(-f5, Math.min(f5, this.E));
        }
        f4 = this.C + this.s;
        f3 = this.N + this.E;
        this.p.forEach(arg_0 -> t.lambda$updateMotionOffsets$2(f4, f3, arg_0));
    }

    private void y(class_332 class_3322, int n2, int n3, N n4, P p2) {
        float f2 = n4.j * n4.B;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        this.a.J(f2);
        boolean bl3 = this.W.y();
        if (!bl3 && p2 != null && p2.B.h()) {
            String string;
            class_3322.method_51448().method_22903();
            class_3322.method_51448().method_46416(n4.G, 0.0f, 0.0f);
            boolean bl2 = n.s();
            boolean bl = n.w();
            float f3 = bl2 ? n.w.V() : dev.idhammai.P.A.S.n.Y();
            float f4 = 6.0f;
            int n5 = 5;
            float f5 = (float)class_3322.method_51443() - f4 - f3 * (float)n5;
            int n6 = 6;
            int n7 = Math.round(f5);
            boolean bl4 = dev.idhammai.c.r.q.N.I.Q != null && dev.idhammai.c.r.q.N.I.Q.C.h();
            String string2 = bl4 ? "\u5de6\u952e\u62d6\u52a8\u5217 \u53f3\u952e\u5c55\u5f00/\u6298\u53e0" : "LMB drag, RMB expand/collapse";
            String string3 = bl4 ? "\u6eda\u8f6e\u662f\u4e0a\u4e0b\u79fb\u52a8 SHIFT+\u6eda\u8f6e\u662f\u5de6\u53f3\u79fb\u52a8" : "Scroll up/down, SHIFT+scroll left/right";
            String string4 = bl4 ? "SHIFT+\u5de6\u952e \u5feb\u6377\u952e\u6309\u94ae \u5207\u6362\u529f\u80fd(\u6309\u4f4f/\u677e\u5f00)\u89e6\u53d1" : "SHIFT+LMB: toggle hold/release";
            String string5 = bl4 ? "\u529f\u80fd\u5feb\u6377\u952e\u8bbe\u7f6e Delete \u6e05\u9664\u5feb\u6377\u952e" : "BindSetting clear key: Delete";
            String string6 = string = bl4 ? "\u6587\u672c\u8bbe\u7f6e \u53f3\u952e\u7f16\u8f91" : "RMB on String setting: edit";
            if (n4.I) {
                int n8 = dev.idhammai.P.A.S.f.y(Color.BLACK, n4.s).getRGB();
                dev.idhammai.P.A.S.n.t(class_3322, string2, n6 + 1, n7 + 1, n8, bl2, false);
                int n9 = (int)((float)n7 + f3);
                dev.idhammai.P.A.S.n.t(class_3322, string3, n6 + 1, n9 + 1, n8, bl2, false);
                int n10 = (int)((float)n7 + f3 * 2.0f);
                dev.idhammai.P.A.S.n.t(class_3322, string4, n6 + 1, n10 + 1, n8, bl2, false);
                int n11 = (int)((float)n7 + f3 * 3.0f);
                dev.idhammai.P.A.S.n.t(class_3322, string5, n6 + 1, n11 + 1, n8, bl2, false);
                int n12 = (int)((float)n7 + f3 * 4.0f);
                dev.idhammai.P.A.S.n.t(class_3322, string, n6 + 1, n12 + 1, n8, bl2, false);
                int n13 = dev.idhammai.P.A.S.f.y(Color.WHITE, n4.s).getRGB();
                Frog.SHADER.u(() -> t.lambda$renderTopBarAndSearch$3(class_3322, string2, n6, n7, n13, bl2, string3, f3, string4, string5, string));
            } else {
                double d2 = (double)n7 / 10.0;
                Color color = p2.q(d2);
                int n14 = dev.idhammai.P.A.S.f.y(color, n4.s).getRGB();
                dev.idhammai.P.A.S.n.h(class_3322, string2, n6, n7, n14, bl2, bl);
                int n15 = (int)((float)n7 + f3);
                double d3 = (double)n15 / 10.0;
                Color color2 = p2.q(d3);
                int n16 = dev.idhammai.P.A.S.f.y(color2, n4.s).getRGB();
                dev.idhammai.P.A.S.n.h(class_3322, string3, n6, n15, n16, bl2, bl);
                int n17 = (int)((float)n7 + f3 * 2.0f);
                double d4 = (double)n17 / 10.0;
                Color color3 = p2.q(d4);
                int n18 = dev.idhammai.P.A.S.f.y(color3, n4.s).getRGB();
                dev.idhammai.P.A.S.n.h(class_3322, string4, n6, n17, n18, bl2, bl);
                int n19 = (int)((float)n7 + f3 * 3.0f);
                double d5 = (double)n19 / 10.0;
                Color color4 = p2.q(d5);
                int n20 = dev.idhammai.P.A.S.f.y(color4, n4.s).getRGB();
                dev.idhammai.P.A.S.n.h(class_3322, string5, n6, n19, n20, bl2, bl);
                int n21 = (int)((float)n7 + f3 * 4.0f);
                double d6 = (double)n21 / 10.0;
                Color color5 = p2.q(d6);
                int n22 = dev.idhammai.P.A.S.f.y(color5, n4.s).getRGB();
                dev.idhammai.P.A.S.n.h(class_3322, string, n6, n21, n22, bl2, bl);
            }
            class_3322.method_51448().method_22909();
        }
        int n23 = Math.round(((float)n2 - n4.b) / n4.y + n4.b);
        int n24 = Math.round(((float)n3 - n4.u) / n4.y);
        if (n4.B > 0.01f) {
            RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)(n4.j * n4.B));
            try (Y y2 = new Y(class_3322);){
                class_3322.method_51448().method_46416(n4.b, n4.u, 0.0f);
                class_3322.method_51448().method_22905(n4.y, n4.y, 1.0f);
                class_3322.method_51448().method_46416(-n4.b, 0.0f, 0.0f);
                this.a.B(class_3322, n23, n24);
            }
            this.y.p(class_3322, n2, n3, n4.y, n4.E, n4.S, n4.I, p2);
            RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)n4.j);
        }
    }

    private void w(class_332 class_3322, int n2, int n3, float f2, N n4) {
        try (Y y2 = new Y(class_3322);){
            class_3322.method_51448().method_46416((float)n4.Z + (float)n4.t / 2.0f, (float)n4.W + (float)n4.n / 2.0f + n4.E, 0.0f);
            class_3322.method_51448().method_22905(n4.V, n4.V, 1.0f);
            class_3322.method_51448().method_46416(-((float)n4.Z + (float)n4.t / 2.0f), -((float)n4.W + (float)n4.n / 2.0f), 0.0f);
        }
        float f3 = (float)class_3322.method_51421() / 2.0f;
        float f4 = (float)class_3322.method_51443() / 2.0f;
        float f5 = n4.V * n4.c;
        if (f5 <= 1.0E-4f) {
            f5 = 1.0E-4f;
        }
        try (Y y3 = new Y(class_3322);){
            class_3322.method_51448().method_46416(0.0f, 0.0f, 1000.0f);
            class_3322.method_51448().method_46416(f3, f4 + n4.E, 0.0f);
            class_3322.method_51448().method_22905(f5, f5, 1.0f);
            class_3322.method_51448().method_46416(-f3, -f4, 0.0f);
            if (n4.B > 0.01f) {
                RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)(n4.j * n4.B));
                this.D.y(class_3322, n2, n3, f2);
                if (this.m == f.Module) {
                    this.J.H(class_3322, n2, n3, f2, n4.S);
                }
                this.H.d(class_3322, n2, n3, f2, n4.S);
                RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)n4.j);
            }
        }
    }

    private void f(class_332 class_3322, N n2) {
        if (n2.B > 0.01f) {
            RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)(n2.j * n2.B));
            try (Y y2 = new Y(class_3322);){
                class_3322.method_51448().method_46416(0.0f, 0.0f, 1500.0f);
                this.H.k(class_3322, this.m == f.Hud);
            }
            RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)n2.j);
        }
    }

    private void W(class_332 class_3322, int n2, int n3, N n4) {
        if (this.W.y()) {
            float f2 = (float)class_3322.method_51421() / 2.0f;
            float f3 = (float)class_3322.method_51443() / 2.0f;
            try (Y y2 = new Y(class_3322);){
                class_3322.method_51448().method_46416(0.0f, 0.0f, 1900.0f);
                class_3322.method_51448().method_46416(f2, f3 + n4.E, 0.0f);
                class_3322.method_51448().method_22905(n4.V, n4.V, 1.0f);
                class_3322.method_51448().method_46416(-f2, -f3, 0.0f);
                this.W.z(class_3322, n2, n3);
            }
        }
    }

    private void l(class_332 class_3322, int n2, int n3) {
        try (Y y2 = new Y(class_3322);){
            class_3322.method_51448().method_46416(0.0f, 0.0f, 2000.0f);
            this.L.c(class_3322, n2, n3);
        }
    }

    private static void lambda$renderTopBarAndSearch$3(class_332 class_3322, String string, int n2, int n3, int n4, boolean bl, String string2, float f2, String string3, String string4, String string5) {
        dev.idhammai.P.A.S.n.t(class_3322, string, n2, n3, n4, bl, false);
        dev.idhammai.P.A.S.n.t(class_3322, string2, n2, (int)((float)n3 + f2), n4, bl, false);
        dev.idhammai.P.A.S.n.t(class_3322, string3, n2, (int)((float)n3 + f2 * 2.0f), n4, bl, false);
        dev.idhammai.P.A.S.n.t(class_3322, string4, n2, (int)((float)n3 + f2 * 3.0f), n4, bl, false);
        dev.idhammai.P.A.S.n.t(class_3322, string5, n2, (int)((float)n3 + f2 * 4.0f), n4, bl, false);
    }

    private static void lambda$updateMotionOffsets$2(float f2, float f3, K k2) {
        k2.i(f2, f3);
    }

    private static void lambda$render$1(float f2, K k2) {
        k2.e(f2);
    }

    private static void lambda$init$0() {
        dev.idhammai.c.r.q.N.P.M().P.x(false);
        Frog.save();
    }
}

