/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1297
 *  net.minecraft.class_1511
 *  net.minecraft.class_1533
 *  net.minecraft.class_1534
 *  net.minecraft.class_1802
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_238
 *  net.minecraft.class_2399
 *  net.minecraft.class_243
 *  net.minecraft.class_2596
 *  net.minecraft.class_2846
 *  net.minecraft.class_2846$class_2847
 *  net.minecraft.class_2886
 *  net.minecraft.class_3532
 *  net.minecraft.class_3736
 */
package dev.idhammai.c.r.q.Q;

import dev.idhammai.Frog;
import dev.idhammai.P.A.L.e;
import dev.idhammai.P.A.L.g;
import dev.idhammai.P.A.Y.N;
import dev.idhammai.P.A.l.M;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.v;
import dev.idhammai.c.r.O.Y.B;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.O.p.T;
import dev.idhammai.c.r.q.D.Q;
import dev.idhammai.c.r.q.D.f;
import dev.idhammai.c.r.q.Q.W;
import dev.idhammai.c.r.q.Q.u;
import dev.idhammai.c.r.q.i.a;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import dev.idhammai.p.J.G;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1511;
import net.minecraft.class_1533;
import net.minecraft.class_1534;
import net.minecraft.class_1802;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_2399;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2846;
import net.minecraft.class_2886;
import net.minecraft.class_3532;
import net.minecraft.class_3736;

public class t
extends y {
    public static t V;
    private final B<u> K = this.S(new B<u>("Mode", dev.idhammai.c.r.q.Q.u.Pearl).I("\u6a21\u5f0f").X(dev.idhammai.c.r.q.Q.u.Pearl, "\u73cd\u73e0"));
    public final dev.idhammai.c.r.O.Y.W u = this.S(new dev.idhammai.c.r.O.Y.W("OnEnable", true).k("\u542f\u7528\u5373\u89e6\u53d1"));
    public final dev.idhammai.c.r.O.Y.W p = this.S(new dev.idhammai.c.r.O.Y.W("OnlyGround", true).k("\u4ec5\u5730\u9762"));
    private final dev.idhammai.c.r.O.Y.W d = this.S(new dev.idhammai.c.r.O.Y.W("Break", true).k("\u7834\u574f\u963b\u6321").D());
    private final dev.idhammai.c.r.O.Y.W Q = this.S(new dev.idhammai.c.r.O.Y.W("Scaffolding", true, this.d::f).k("\u811a\u624b\u67b6"));
    private final dev.idhammai.c.r.O.Y.W U = this.S(new dev.idhammai.c.r.O.Y.W("PacketMine", false, this.d::f).k("\u53d1\u5305\u6316\u6398"));
    private final dev.idhammai.c.r.O.Y.W M = this.S(new dev.idhammai.c.r.O.Y.W("Crystal", true, this.d::f).k("\u6c34\u6676"));
    private final dev.idhammai.c.r.O.Y.W T = this.S(new dev.idhammai.c.r.O.Y.W("ItemFrame", true, this.d::f).k("\u7269\u54c1\u5c55\u793a\u6846"));
    private final dev.idhammai.c.r.O.Y.W a = this.S(new dev.idhammai.c.r.O.Y.W("Paint", true, this.d::f).k("\u753b"));
    private final dev.idhammai.c.r.O.Y.W J = this.S(new dev.idhammai.c.r.O.Y.W("Rotate", true, this.d::f).k("\u8f6c\u5411"));
    public final dev.idhammai.c.r.O.Y.W E = this.S(new dev.idhammai.c.r.O.Y.W("Correct", true).k("\u89d2\u5ea6\u4fee\u6b63"));
    public final dev.idhammai.c.r.O.Y.W w = this.S(new dev.idhammai.c.r.O.Y.W("DynamicPitch", true, this.E::h).k("\u52a8\u6001\u4fef\u4ef0").D());
    private final l B = this.p(new l("Factor", 0.5, 0.0, 1.0, 0.01, this::lambda$new$0).D("\u4fee\u6b63\u7cfb\u6570"));
    private final dev.idhammai.c.r.O.Y.W m = this.S(new dev.idhammai.c.r.O.Y.W("OnlyHard", false, this::lambda$new$1).k("\u4ec5\u786c\u5224\u5b9a"));
    public final l G = this.p(new l("Pitch", 88, 0, 90, this::lambda$new$2).D("\u4fef\u4ef0"));
    private final B<T> s = this.S(new B<T>("Timing", dev.idhammai.c.r.O.p.T.All).I("\u65f6\u673a").X(dev.idhammai.c.r.O.p.T.Pre, "\u524d").X(dev.idhammai.c.r.O.p.T.Post, "\u540e").X(dev.idhammai.c.r.O.p.T.All, "\u5168\u90e8"));
    private final dev.idhammai.c.r.O.Y.W F = this.S(new dev.idhammai.c.r.O.Y.W("YawStep", false).k("\u504f\u822a\u6b65\u8fdb").D());
    private final dev.idhammai.c.r.O.Y.W b = this.S(new dev.idhammai.c.r.O.Y.W("FallFlying", true, this.F::f).k("\u9798\u7fc5\u65f6"));
    private final l k = this.p(new l("Steps", 0.05, 0.0, 1.0, 0.01, this.F::f).D("\u6b65\u8fdb\u5f3a\u5ea6"));
    private final l c = this.p(new l("Fov", 20.0, 0.0, 360.0, 0.1, this.F::f).D("\u89c6\u89d2"));
    private final l A = this.p(new l("Priority", 100, 0, 100, this.F::f).D("\u4f18\u5148\u7ea7"));
    private final dev.idhammai.c.r.O.Y.W g = this.S(new dev.idhammai.c.r.O.Y.W("Sync", true, this.F::f).k("\u540c\u6b65"));
    public class_243 L = null;
    class_243 Y;

    public t() {
        super("Phase", dev.idhammai.c.r.w.Exploit);
        this.L("\u73cd\u73e0\u7a7f\u5899");
        V = this;
    }

    @r
    public void z(dev.idhammai.P.r.c.W w2) {
        if (this.L != null) {
            w2.m(this.L, this.k.Z(), this.A.Z());
        }
    }

    private boolean r(class_243 class_2432) {
        this.L = class_2432;
        return Frog.ROTATION.k(class_2432, this.c.Z());
    }

    private void r() {
        this.Y = new class_243(t.W.field_1724.method_23317() + class_3532.method_15350((double)(this.s(t.W.field_1724.method_23317(), Math.floor(t.W.field_1724.method_23317()) + 0.241, Math.floor(t.W.field_1724.method_23317()) + 0.759) - t.W.field_1724.method_23317()), (double)-0.2, (double)0.2), t.W.field_1724.method_23318() - 0.5, t.W.field_1724.method_23321() + class_3532.method_15350((double)(this.s(t.W.field_1724.method_23321(), Math.floor(t.W.field_1724.method_23321()) + 0.241, Math.floor(t.W.field_1724.method_23321()) + 0.759) - t.W.field_1724.method_23321()), (double)-0.2, (double)0.2));
    }

    @r
    public void R(v v2) {
        if (t.M()) {
            return;
        }
        if (this.s.x(dev.idhammai.c.r.O.p.T.Pre) && v2.C() || this.s.x(dev.idhammai.c.r.O.p.T.Post) && v2.a()) {
            return;
        }
        if (dev.idhammai.c.r.q.i.u.j.b.h() && !e.n()) {
            return;
        }
        if (W.b.p() && W.b.m.h()) {
            return;
        }
        if (this.p.h() && !t.W.field_1724.method_24828() && !(dev.idhammai.P.A.l.M.x(t.W.field_1724.method_24515()) instanceof class_2399)) {
            return;
        }
        if (this.d.h()) {
            if (this.Q.h()) {
                class_2338 class_23382 = e.H(true);
                class_2338 class_23383 = class_23382.method_10084();
                if (dev.idhammai.P.A.l.M.x(class_23382) instanceof class_3736) {
                    this.b(class_23382);
                    return;
                }
                if (dev.idhammai.P.A.l.M.x(class_23383) instanceof class_3736) {
                    this.b(class_23383);
                    return;
                }
            }
            for (class_1297 class_12972 : Frog.THREAD.z()) {
                if (class_12972 instanceof class_1511 && this.M.h()) {
                    if (class_12972.method_23318() >= t.W.field_1724.method_23318() || !class_12972.method_5829().method_994(t.W.field_1724.method_5829())) continue;
                    N.P(class_12972, this.J.h());
                    continue;
                }
                if (this.T.h() && class_12972 instanceof class_1533) {
                    class_1533 class_15332 = (class_1533)class_12972;
                    if (!class_12972.method_5829().method_994(new class_238(t.W.field_1724.method_24515()))) continue;
                    if (!class_15332.method_6940().method_7960()) {
                        N.P(class_12972, this.J.h());
                    }
                    N.P(class_12972, this.J.h());
                    continue;
                }
                if (!this.a.h() || !(class_12972 instanceof class_1534) || !class_12972.method_5829().method_994(new class_238(t.W.field_1724.method_24515()))) continue;
                N.P(class_12972, this.J.h());
            }
        }
        if (!this.e()) {
            f.V.p.H();
            dev.idhammai.c.r.q.i.u.j.r(this.Y(), this.M());
        } else {
            this.r();
            if (!this.r(this.Y)) {
                return;
            }
            f.V.p.H();
            if (this.g.h()) {
                dev.idhammai.c.r.q.i.u.j.r(this.Y(), this.M());
            } else {
                this.v();
            }
        }
        this.p();
    }

    private boolean e() {
        if (!this.b.h() && (t.W.field_1724.method_6128() || dev.idhammai.c.r.q.D.Q.F.p() && dev.idhammai.c.r.q.D.Q.F.z())) {
            return false;
        }
        return this.F.h() && !f.V.f();
    }

    private void b(class_2338 class_23382) {
        t.n(arg_0 -> t.lambda$mineBlock$3(class_23382, arg_0));
        t.n(arg_0 -> t.lambda$mineBlock$4(class_23382, arg_0));
        if (this.U.h()) {
            dev.idhammai.c.r.q.i.a.D5.d(class_23382);
        }
    }

    private class_243 z() {
        class_2338 class_23382 = t.W.field_1724.method_24515();
        class_243 class_2432 = t.W.field_1724.method_19538();
        class_243 class_2433 = t.W.field_1724.method_24515().method_61082();
        float f2 = this.B.Z();
        class_243 class_2434 = class_2433;
        double d2 = Double.MAX_VALUE;
        int[] nArray = new int[]{1, -1};
        for (int n2 : nArray) {
            for (int n3 : nArray) {
                class_243 class_2435;
                double d3;
                if ((this.m.h() || t.W.field_1687.method_22347(class_23382.method_10069(n2, 0, 0)) && t.W.field_1687.method_22347(class_23382.method_10069(0, 0, n3)) && t.W.field_1687.method_22347(class_23382.method_10069(n2, 0, n3))) && !Frog.HOLE.O(class_23382.method_10069(n2, 0, 0)) && !Frog.HOLE.O(class_23382.method_10069(0, 0, n3)) && !Frog.HOLE.O(class_23382.method_10069(n2, 0, n3)) || !((d3 = (class_2435 = class_2433.method_1031((double)((float)n2 * f2), 0.0, (double)((float)n3 * f2))).method_1022(class_2432)) < d2)) continue;
                d2 = d3;
                class_2434 = class_2435;
            }
        }
        return class_2434;
    }

    private float Y() {
        if (this.E.h()) {
            class_243 class_2432;
            if (this.w.h() && (class_2432 = this.z()) != null) {
                return dev.idhammai.p.J.G.X(class_2432)[0];
            }
            return class_3532.method_15393((float)(dev.idhammai.p.J.G.X(t.W.field_1724.method_24515().method_46558())[0] - 180.0f));
        }
        return t.W.field_1724.method_36454();
    }

    private float M() {
        class_243 class_2432;
        if (this.E.h() && this.w.h() && (class_2432 = this.z()) != null) {
            return dev.idhammai.p.J.G.X(class_2432)[1];
        }
        return this.G.Z();
    }

    public void v() {
        int n2;
        dev.idhammai.c.r.q.i.u.B = true;
        if (t.W.field_1724.method_6047().method_7909() == class_1802.field_8634) {
            t.n(t::lambda$throwPearl$5);
            e.g(class_1268.field_5808, dev.idhammai.c.r.q.i.u.j.r.X());
        } else if (dev.idhammai.c.r.q.i.u.j.b.h() && (n2 = dev.idhammai.P.A.L.g.C(class_1802.field_8634)) != -1) {
            dev.idhammai.P.A.L.g.z(n2, t.W.field_1724.method_31548().field_7545);
            t.n(t::lambda$throwPearl$6);
            e.g(class_1268.field_5808, dev.idhammai.c.r.q.i.u.j.r.X());
            dev.idhammai.P.A.L.g.z(n2, t.W.field_1724.method_31548().field_7545);
            e.t();
        } else {
            n2 = dev.idhammai.P.A.L.g.E(class_1802.field_8634);
            if (n2 != -1) {
                int n3 = t.W.field_1724.method_31548().field_7545;
                dev.idhammai.P.A.L.g.j(n2);
                t.n(t::lambda$throwPearl$7);
                e.g(class_1268.field_5808, dev.idhammai.c.r.q.i.u.j.r.X());
                dev.idhammai.P.A.L.g.j(n3);
            }
        }
        dev.idhammai.c.r.q.i.u.B = false;
    }

    @Override
    public void H() {
        if (t.M()) {
            this.p();
            return;
        }
        if (dev.idhammai.c.r.q.i.u.j.b.h()) {
            if (dev.idhammai.P.A.L.g.C(class_1802.field_8634) == -1) {
                this.p();
                return;
            }
        } else if (dev.idhammai.P.A.L.g.E(class_1802.field_8634) == -1) {
            this.p();
            return;
        }
        if (!this.u.h()) {
            return;
        }
        if (this.p.h() && !t.W.field_1724.method_24828() && !(dev.idhammai.P.A.l.M.x(t.W.field_1724.method_24515()) instanceof class_2399)) {
            return;
        }
        if (this.d.h()) {
            if (this.Q.h()) {
                class_2338 class_23382 = e.H(true);
                class_2338 class_23383 = class_23382.method_10084();
                if (dev.idhammai.P.A.l.M.x(class_23382) instanceof class_3736) {
                    this.b(class_23382);
                    return;
                }
                if (dev.idhammai.P.A.l.M.x(class_23383) instanceof class_3736) {
                    this.b(class_23383);
                    return;
                }
            }
            for (class_1297 class_12972 : Frog.THREAD.z()) {
                if (class_12972 instanceof class_1511 && this.M.h()) {
                    if (class_12972.method_23318() >= t.W.field_1724.method_23318() || !class_12972.method_5829().method_994(t.W.field_1724.method_5829())) continue;
                    N.P(class_12972, this.J.h());
                    continue;
                }
                if (this.T.h() && class_12972 instanceof class_1533) {
                    class_1533 class_15332 = (class_1533)class_12972;
                    if (!class_12972.method_5829().method_994(new class_238(t.W.field_1724.method_24515()))) continue;
                    if (!class_15332.method_6940().method_7960()) {
                        N.P(class_12972, this.J.h());
                    }
                    N.P(class_12972, this.J.h());
                    continue;
                }
                if (!this.a.h() || !(class_12972 instanceof class_1534) || !class_12972.method_5829().method_994(new class_238(t.W.field_1724.method_24515()))) continue;
                N.P(class_12972, this.J.h());
            }
        }
        this.L = null;
        this.r();
        if (this.e()) {
            return;
        }
        if (dev.idhammai.c.r.q.i.u.j.b.h() && !e.n()) {
            return;
        }
        if (W.b.p() && W.b.m.h()) {
            return;
        }
        f.V.p.H();
        dev.idhammai.c.r.q.i.u.j.r(this.Y(), this.M());
        this.p();
    }

    private double s(double d2, double d3, double d4) {
        double d5 = d4 - d2;
        double d6 = d2 - d3;
        if (d5 > d6) {
            return d3;
        }
        return d4;
    }

    private static class_2596 lambda$throwPearl$7(int n2) {
        return new class_2886(class_1268.field_5808, n2, Frog.ROTATION.X(), Frog.ROTATION.F());
    }

    private static class_2596 lambda$throwPearl$6(int n2) {
        return new class_2886(class_1268.field_5808, n2, Frog.ROTATION.X(), Frog.ROTATION.F());
    }

    private static class_2596 lambda$throwPearl$5(int n2) {
        return new class_2886(class_1268.field_5808, n2, Frog.ROTATION.X(), Frog.ROTATION.F());
    }

    private static class_2596 lambda$mineBlock$4(class_2338 class_23382, int n2) {
        return new class_2846(class_2846.class_2847.field_12973, class_23382, class_2350.field_11036, n2);
    }

    private static class_2596 lambda$mineBlock$3(class_2338 class_23382, int n2) {
        return new class_2846(class_2846.class_2847.field_12968, class_23382, class_2350.field_11036, n2);
    }

    private boolean lambda$new$2() {
        return !this.w.h() || !this.E.h();
    }

    private boolean lambda$new$1() {
        return this.w.f() && this.E.h();
    }

    private boolean lambda$new$0() {
        return this.w.f() && this.E.h();
    }
}

