/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_243
 *  net.minecraft.class_2596
 *  net.minecraft.class_2828
 *  net.minecraft.class_2828$class_2830
 *  net.minecraft.class_2828$class_2831
 *  net.minecraft.class_3532
 */
package dev.idhammai.p.J;

import dev.idhammai.Frog;
import dev.idhammai.P.A.A.h;
import dev.idhammai.P.A.J;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.A;
import dev.idhammai.P.r.c.D;
import dev.idhammai.P.r.c.F;
import dev.idhammai.P.r.c.H;
import dev.idhammai.P.r.c.M;
import dev.idhammai.P.r.c.Q;
import dev.idhammai.P.r.c.S;
import dev.idhammai.P.r.c.W;
import dev.idhammai.P.r.c.e;
import dev.idhammai.P.r.c.q;
import dev.idhammai.P.r.c.u;
import dev.idhammai.asm.accessors.IClientPlayerEntity;
import dev.idhammai.c.r.O.p.s;
import dev.idhammai.c.r.q.D.w;
import dev.idhammai.c.r.q.N.I;
import dev.idhammai.c.r.q.N.x;
import dev.idhammai.c.r.q.i.c;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2828;
import net.minecraft.class_3532;

public class G
implements J {
    public static final h I = new h();
    public static class_243 F = null;
    public static boolean r = false;
    private static float U;
    private static float z;
    private static float O;
    private static float a;
    private static float D;
    private static float d;
    public float E;
    public float C;
    public float Q;
    public float g;
    public float G;
    public float M;
    public class_243 A;
    private int e;
    public static float n;
    public static float j;
    private float c;
    private float x;

    public G() {
        Frog.EVENT_BUS.S(this);
    }

    @r
    public void r(q q2) {
        if (dev.idhammai.c.r.q.N.x.y.R.h() && dev.idhammai.p.J.G.W.field_1724 != null) {
            if (q2.a()) {
                this.o(dev.idhammai.p.J.G.W.field_1724.method_36454(), dev.idhammai.p.J.G.W.field_1724.method_36455());
            } else {
                this.M();
            }
        }
    }

    @r
    public void R(u u2) {
        if (dev.idhammai.c.r.q.N.x.y.R.h() && dev.idhammai.p.J.G.W.field_1724 != null) {
            if (u2.a()) {
                this.o(dev.idhammai.p.J.G.W.field_1724.method_36454(), dev.idhammai.p.J.G.W.field_1724.method_36455());
            } else {
                this.M();
            }
        }
    }

    @r
    public void h(M m2) {
        if (dev.idhammai.c.r.q.N.x.y.R.h() && dev.idhammai.p.J.G.W.field_1724 != null) {
            if (m2.a()) {
                this.o(dev.idhammai.p.J.G.W.field_1724.method_36454(), dev.idhammai.p.J.G.W.field_1724.method_36455());
            } else {
                this.M();
            }
        }
    }

    public void M() {
        if (dev.idhammai.c.r.q.N.x.y.M.x(s.Force)) {
            W.method_1562().method_52787((class_2596)new class_2828.class_2830(dev.idhammai.p.J.G.W.field_1724.method_23317(), dev.idhammai.p.J.G.W.field_1724.method_23318(), dev.idhammai.p.J.G.W.field_1724.method_23321(), this.Q, this.g, dev.idhammai.p.J.G.W.field_1724.method_24828()));
        } else if (dev.idhammai.c.r.q.N.x.y.M.x(s.Tick)) {
            r = true;
        }
    }

    public void a(class_243 class_2432) {
        this.o(class_2432);
        this.G(class_2432);
    }

    public void n(class_2338 class_23382, class_2350 class_23502) {
        class_243 class_2432 = class_23382.method_46558().method_1019(new class_243((double)class_23502.method_10163().method_10263() * 0.5, (double)class_23502.method_10163().method_10264() * 0.5, (double)class_23502.method_10163().method_10260() * 0.5));
        this.a(class_2432);
    }

    public void o(float f2, float f3) {
        this.n(f2, f3, true);
        if (dev.idhammai.c.r.q.N.x.y.D.h()) {
            W.method_1562().method_52787((class_2596)new class_2828.class_2830(dev.idhammai.p.J.G.W.field_1724.method_23317(), dev.idhammai.p.J.G.W.field_1724.method_23318(), dev.idhammai.p.J.G.W.field_1724.method_23321(), f2, f3, dev.idhammai.p.J.G.W.field_1724.method_24828()));
        } else {
            W.method_1562().method_52787((class_2596)new class_2828.class_2831(f2, f3, dev.idhammai.p.J.G.W.field_1724.method_24828()));
        }
    }

    public void G(class_243 class_2432) {
        float[] fArray = dev.idhammai.p.J.G.X(class_2432);
        this.o(fArray[0], fArray[1]);
    }

    public void o(class_243 class_2432) {
        I.H();
        F = class_2432;
    }

    public boolean k(class_243 class_2432, float f2) {
        float[] fArray = dev.idhammai.p.J.G.b(this.A != null ? this.A : new class_243(dev.idhammai.p.J.G.W.field_1724.method_23317(), dev.idhammai.p.J.G.W.field_1724.method_23318() + (double)dev.idhammai.p.J.G.W.field_1724.method_18381(dev.idhammai.p.J.G.W.field_1724.method_18376()), dev.idhammai.p.J.G.W.field_1724.method_23321()), class_2432);
        return this.A(fArray[0], fArray[1], f2);
    }

    public boolean A(float f2, float f3, float f4) {
        float f5;
        float f6;
        float f7 = class_3532.method_15356((float)f2, (float)this.Q);
        return f7 * f7 + f6 * (f5 = Math.abs(f3 - this.g)) <= f4 * f4;
    }

    @r
    public void D(Q q2) {
        if (dev.idhammai.p.J.G.W.field_1724 == null) {
            return;
        }
        this.A = new class_243(dev.idhammai.p.J.G.W.field_1724.method_23317(), dev.idhammai.p.J.G.W.field_1724.method_23318() + (double)dev.idhammai.p.J.G.W.field_1724.method_18381(dev.idhammai.p.J.G.W.field_1724.method_18376()), dev.idhammai.p.J.G.W.field_1724.method_23321());
    }

    @r
    public void s(H h2) {
        if (dev.idhammai.c.r.q.N.x.y.y() && !dev.idhammai.P.A.R.F.D()) {
            h2.h(this.E);
            h2.v(this.C);
        } else {
            A a2 = dev.idhammai.P.r.c.A.x(h2.q(), h2.l());
            Frog.EVENT_BUS.J(a2);
            h2.h(a2.v());
            h2.v(a2.t());
        }
    }

    @r(D=999)
    public void V(Q q2) {
        if (dev.idhammai.p.J.G.W.field_1724 == null) {
            return;
        }
        if (dev.idhammai.c.r.q.N.x.y.y() && !dev.idhammai.P.A.R.F.D()) {
            A a2 = dev.idhammai.P.r.c.A.x(dev.idhammai.p.J.G.W.field_1724.method_36454(), dev.idhammai.p.J.G.W.field_1724.method_36455());
            Frog.EVENT_BUS.J(a2);
            this.E = a2.v();
            this.C = a2.t();
            n = this.E;
            j = this.C;
        }
    }

    @r(D=-200)
    public void D(A a2) {
        W w2 = W.K();
        Frog.EVENT_BUS.J(w2);
        if (w2.m()) {
            float[] fArray = this.V(new float[]{w2.A(), w2.k()}, w2.e());
            a2.F(fArray[0]);
            a2.p(fArray[1]);
        } else if (w2.f() != null) {
            float[] fArray = this.l(w2.f(), w2.e());
            a2.F(fArray[0]);
            a2.p(fArray[1]);
        } else if (!a2.X() && dev.idhammai.c.r.q.N.x.y.I.h() && F != null && !I.m((long)(dev.idhammai.c.r.q.N.x.y.s.e() * 1000.0))) {
            float[] fArray = this.l(F, dev.idhammai.c.r.q.N.x.y.g.Z());
            a2.F(fArray[0]);
            a2.p(fArray[1]);
        }
    }

    @r
    public void Z(dev.idhammai.P.r.c.s s2) {
        if (!dev.idhammai.c.r.q.N.x.y.y()) {
            return;
        }
        if (dev.idhammai.P.A.R.F.D()) {
            return;
        }
        if (dev.idhammai.p.J.G.W.field_1724.method_3144()) {
            return;
        }
        if (s2.a()) {
            this.c = dev.idhammai.p.J.G.W.field_1724.method_36454();
            this.x = dev.idhammai.p.J.G.W.field_1724.method_36455();
            dev.idhammai.p.J.G.W.field_1724.method_36456(n);
            dev.idhammai.p.J.G.W.field_1724.method_36457(j);
        } else {
            dev.idhammai.p.J.G.W.field_1724.method_36456(this.c);
            dev.idhammai.p.J.G.W.field_1724.method_36457(this.x);
        }
    }

    @r
    public void h(D d2) {
        if (!dev.idhammai.c.r.q.N.x.y.y()) {
            return;
        }
        if (dev.idhammai.P.A.R.F.D()) {
            return;
        }
        if (dev.idhammai.p.J.G.W.field_1724.method_3144()) {
            return;
        }
        if (d2.a()) {
            this.c = dev.idhammai.p.J.G.W.field_1724.method_36454();
            this.x = dev.idhammai.p.J.G.W.field_1724.method_36455();
            dev.idhammai.p.J.G.W.field_1724.method_36456(n);
            dev.idhammai.p.J.G.W.field_1724.method_36457(j);
        } else {
            dev.idhammai.p.J.G.W.field_1724.method_36456(this.c);
            dev.idhammai.p.J.G.W.field_1724.method_36457(this.x);
        }
    }

    @r
    public void h(e e2) {
        if (!dev.idhammai.c.r.q.N.x.y.y()) {
            return;
        }
        if (dev.idhammai.P.A.R.F.D()) {
            return;
        }
        if (e2.J == dev.idhammai.p.J.G.W.field_1724) {
            e2.r = n;
            e2.W = j;
            e2.L();
        }
    }

    @r(D=-999)
    public void M(dev.idhammai.P.r.c.G g2) {
        if (!dev.idhammai.c.r.q.N.x.y.y()) {
            return;
        }
        if (dev.idhammai.P.A.R.F.D()) {
            return;
        }
        if (w.H.p()) {
            return;
        }
        if (dev.idhammai.p.J.G.W.field_1724.method_3144() || dev.idhammai.c.r.q.i.c.L.p()) {
            return;
        }
        float f2 = dev.idhammai.p.J.G.W.field_1724.field_3913.field_3905;
        float f3 = dev.idhammai.p.J.G.W.field_1724.field_3913.field_3907;
        float f4 = (dev.idhammai.p.J.G.W.field_1724.method_36454() - n) * ((float)Math.PI / 180);
        float f5 = class_3532.method_15362((float)f4);
        float f6 = class_3532.method_15374((float)f4);
        dev.idhammai.p.J.G.W.field_1724.field_3913.field_3907 = Math.round(f3 * f5 - f2 * f6);
        dev.idhammai.p.J.G.W.field_1724.field_3913.field_3905 = Math.round(f2 * f5 + f3 * f6);
    }

    public float[] l(class_243 class_2432, float f2) {
        float f3;
        float f4 = dev.idhammai.c.r.q.N.x.y.r.h() ? this.X() : this.Q;
        float f5 = dev.idhammai.c.r.q.N.x.y.r.h() ? this.F() : this.g;
        float f6 = class_3532.method_15393((float)((float)class_3532.method_15338((double)(Math.toDegrees(Math.atan2(class_2432.field_1350 - dev.idhammai.p.J.G.W.field_1724.method_23321(), class_2432.field_1352 - dev.idhammai.p.J.G.W.field_1724.method_23317())) - 90.0)) - f4));
        float f7 = (float)(-Math.toDegrees(Math.atan2(class_2432.field_1351 - (dev.idhammai.p.J.G.W.field_1724.method_19538().field_1351 + (double)dev.idhammai.p.J.G.W.field_1724.method_18381(dev.idhammai.p.J.G.W.field_1724.method_18376())), Math.sqrt(Math.pow(class_2432.field_1352 - dev.idhammai.p.J.G.W.field_1724.method_23317(), 2.0) + Math.pow(class_2432.field_1350 - dev.idhammai.p.J.G.W.field_1724.method_23321(), 2.0))))) - f5;
        if (dev.idhammai.c.r.q.N.x.y.Z.h()) {
            f3 = (float)Math.toRadians(27 * (dev.idhammai.p.J.G.W.field_1724.field_6012 % 30));
            f6 = (float)((double)f6 + Math.sin(f3) * 3.0) + dev.idhammai.P.A.A.A.t(-1.0f, 1.0f);
            f7 += dev.idhammai.P.A.A.A.t(-0.6f, 0.6f);
        }
        if (f6 > 180.0f) {
            f6 -= 180.0f;
        }
        f3 = 180.0f * f2;
        float f8 = class_3532.method_15363((float)class_3532.method_15379((float)f6), (float)(-f3), (float)f3);
        float f9 = class_3532.method_15363((float)f7, (float)-45.0f, (float)45.0f);
        float f10 = f4 + (f6 > 0.0f ? f8 : -f8);
        float f11 = class_3532.method_15363((float)(f5 + f9), (float)-90.0f, (float)90.0f);
        return new float[]{f10, f11};
    }

    public float[] V(float[] fArray, float f2) {
        float f3;
        float f4 = dev.idhammai.c.r.q.N.x.y.r.h() ? this.X() : this.Q;
        float f5 = dev.idhammai.c.r.q.N.x.y.r.h() ? this.F() : this.g;
        float f6 = class_3532.method_15393((float)(fArray[0] - f4));
        float f7 = fArray[1] - f5;
        if (dev.idhammai.c.r.q.N.x.y.Z.h()) {
            f3 = (float)Math.toRadians(27 * (dev.idhammai.p.J.G.W.field_1724.field_6012 % 30));
            f6 = (float)((double)f6 + Math.sin(f3) * 3.0) + dev.idhammai.P.A.A.A.t(-1.0f, 1.0f);
            f7 += dev.idhammai.P.A.A.A.t(-0.6f, 0.6f);
        }
        if (f6 > 180.0f) {
            f6 -= 180.0f;
        }
        f3 = 180.0f * f2;
        float f8 = 90.0f * f2;
        float f9 = class_3532.method_15363((float)class_3532.method_15379((float)f6), (float)(-f3), (float)f3);
        float f10 = class_3532.method_15363((float)f7, (float)(-f8), (float)f8);
        float f11 = f4 + (f6 > 0.0f ? f9 : -f9);
        float f12 = class_3532.method_15363((float)(f5 + f10), (float)-90.0f, (float)90.0f);
        return new float[]{f11, f12};
    }

    @r(D=-999)
    public void L(S s2) {
        class_2828 class_28282;
        if (dev.idhammai.p.J.G.W.field_1724 == null) {
            return;
        }
        class_2596<?> class_25962 = s2.L();
        if (class_25962 instanceof class_2828 && (class_28282 = (class_2828)class_25962).method_36172()) {
            this.Z(class_28282.method_12271(this.X()));
            this.T(class_28282.method_12270(this.F()));
            this.n(this.X(), this.F(), dev.idhammai.c.r.q.N.I.Q.T.h());
        }
    }

    @r
    public void y(F f2) {
        if (f2.C()) {
            this.n(this.X(), this.F(), false);
        }
    }

    public void n(float f2, float f3, boolean bl) {
        if (dev.idhammai.p.J.G.W.field_1724 == null) {
            return;
        }
        if (dev.idhammai.p.J.G.W.field_1724.field_6012 == this.e && !bl) {
            return;
        }
        this.e = dev.idhammai.p.J.G.W.field_1724.field_6012;
        O = U;
        a = z;
        z = this.a(f2, a);
        D = d;
        d = f2;
        U = f3;
    }

    private float a(float f2, float f3) {
        float f4;
        float f5;
        double d2;
        double d3;
        float f6 = f3;
        double d4 = dev.idhammai.p.J.G.W.field_1724.method_23317() - dev.idhammai.p.J.G.W.field_1724.field_6014;
        if (d4 * d4 + d3 * (d2 = dev.idhammai.p.J.G.W.field_1724.method_23321() - dev.idhammai.p.J.G.W.field_1724.field_5969) > 0.002500000176951289) {
            f5 = (float)class_3532.method_15349((double)d2, (double)d4) * 57.295776f - 90.0f;
            float f7 = class_3532.method_15379((float)(class_3532.method_15393((float)f2) - f5));
            float f8 = f6 = 95.0f < f7 && f7 < 265.0f ? f5 - 180.0f : f5;
        }
        if (dev.idhammai.p.J.G.W.field_1724.field_6251 > 0.0f) {
            f6 = f2;
        }
        f6 = f3 + class_3532.method_15393((float)(f6 - f3)) * 0.3f;
        f5 = class_3532.method_15393((float)(f2 - f6));
        if (f4 < -75.0f) {
            f5 = -75.0f;
        } else if (f5 >= 75.0f) {
            f5 = 75.0f;
        }
        f6 = f2 - f5;
        if (f5 * f5 > 2500.0f) {
            f6 += f5 * 0.2f;
        }
        return f6;
    }

    public static float[] b(class_243 class_2432, class_243 class_2433) {
        double d2 = class_2433.field_1352 - class_2432.field_1352;
        double d3 = class_2433.field_1351 - class_2432.field_1351;
        double d4 = class_2433.field_1350 - class_2432.field_1350;
        double d5 = Math.sqrt(d2 * d2 + d4 * d4);
        float f2 = (float)Math.toDegrees(Math.atan2(d4, d2)) - 90.0f;
        float f3 = (float)(-Math.toDegrees(Math.atan2(d3, d5)));
        return new float[]{class_3532.method_15393((float)f2), class_3532.method_15393((float)f3)};
    }

    public static float[] X(class_243 class_2432) {
        class_243 class_2433 = dev.idhammai.p.J.G.W.field_1724.method_33571();
        return dev.idhammai.p.J.G.b(class_2433, class_2432);
    }

    public static float L() {
        return U;
    }

    public static float r() {
        return d;
    }

    public static float e() {
        return z;
    }

    public static float c() {
        return O;
    }

    public static float t() {
        return D;
    }

    public static float p() {
        return a;
    }

    public float X() {
        return this.G;
    }

    public void Z(float f2) {
        this.G = f2;
        if (dev.idhammai.c.r.q.N.x.y.t.h() && Frog.SERVER.l.r(0.15)) {
            ((IClientPlayerEntity)dev.idhammai.p.J.G.W.field_1724).setLastYaw(f2);
        }
    }

    public float F() {
        return this.M;
    }

    public void T(float f2) {
        this.M = f2;
        if (dev.idhammai.c.r.q.N.x.y.t.h() && Frog.SERVER.l.r(0.15)) {
            ((IClientPlayerEntity)dev.idhammai.p.J.G.W.field_1724).setLastPitch(f2);
        }
    }
}

