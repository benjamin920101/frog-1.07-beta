/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_2246
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_238
 *  net.minecraft.class_241
 *  net.minecraft.class_243
 *  net.minecraft.class_3532
 *  net.minecraft.class_742
 */
package dev.idhammai.c.r.q.A;

import dev.idhammai.Frog;
import dev.idhammai.P.A.A.h;
import dev.idhammai.P.A.L.e;
import dev.idhammai.P.A.L.g;
import dev.idhammai.P.A.L.l;
import dev.idhammai.P.A.Y.N;
import dev.idhammai.P.A.l.M;
import dev.idhammai.P.A.l.k;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.T;
import dev.idhammai.P.r.c.W;
import dev.idhammai.P.r.c.v;
import dev.idhammai.c.r.O.Y.B;
import dev.idhammai.c.r.q.A.s;
import dev.idhammai.c.r.q.D.Q;
import dev.idhammai.c.r.q.D.f;
import dev.idhammai.c.r.q.i.a;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import dev.idhammai.p.J.S;
import java.util.Objects;
import net.minecraft.class_1268;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_241;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_742;

public class q
extends y {
    public static q y;
    public final B<s> G = this.S(new B<s>("Page", dev.idhammai.c.r.q.A.s.General).I("\u9875\u9762").X(dev.idhammai.c.r.q.A.s.General, "\u5e38\u89c4").X(dev.idhammai.c.r.q.A.s.Rotate, "\u65cb\u8f6c").X(dev.idhammai.c.r.q.A.s.Check, "\u68c0\u6d4b"));
    public final dev.idhammai.c.r.O.Y.l g = this.p(new dev.idhammai.c.r.O.Y.l("PlaceDelay", 50, 0, 500, this::lambda$new$0).D("\u653e\u7f6e\u5ef6\u8fdf"));
    private final dev.idhammai.c.r.O.Y.W P = this.S(new dev.idhammai.c.r.O.Y.W("MineDownward", false, this::lambda$new$1).k("\u5411\u4e0b\u6316\u6398"));
    public final dev.idhammai.c.r.O.Y.W I = this.S(new dev.idhammai.c.r.O.Y.W("Extend", true, this::lambda$new$2).k("\u6269\u5c55")).D();
    public final dev.idhammai.c.r.O.Y.W V = this.S(new dev.idhammai.c.r.O.Y.W("OnlySelf", false, this::lambda$new$3).k("\u4ec5\u81ea\u5df1"));
    public final dev.idhammai.c.r.O.Y.W E = this.S(new dev.idhammai.c.r.O.Y.W("InAir", true, this::lambda$new$4).k("\u7a7a\u4e2d\u4e5f\u542f\u7528"));
    private final h K = new h();
    private final dev.idhammai.c.r.O.Y.l b = this.p(new dev.idhammai.c.r.O.Y.l("BlocksPer", 1, 1, 8, this::lambda$new$5).D("\u6bcftick\u65b9\u5757"));
    private final dev.idhammai.c.r.O.Y.W D = this.S(new dev.idhammai.c.r.O.Y.W("PacketPlace", true, this::lambda$new$6).k("\u53d1\u5305\u653e\u7f6e"));
    private final B<dev.idhammai.c.r.O.p.T> n = this.S(new B<dev.idhammai.c.r.O.p.T>("Timing", dev.idhammai.c.r.O.p.T.All, this::lambda$new$7).I("\u65f6\u673a").X(dev.idhammai.c.r.O.p.T.Pre, "\u524d").X(dev.idhammai.c.r.O.p.T.Post, "\u540e").X(dev.idhammai.c.r.O.p.T.All, "\u5168\u90e8"));
    private final dev.idhammai.c.r.O.Y.W C = this.S(new dev.idhammai.c.r.O.Y.W("Break", true, this::lambda$new$8).k("\u6253\u6c34\u6676").D());
    private final dev.idhammai.c.r.O.Y.W s = this.S(new dev.idhammai.c.r.O.Y.W("EatingPause", true, this::lambda$new$9).k("\u8fdb\u98df\u6682\u505c"));
    private final dev.idhammai.c.r.O.Y.W f = this.S(new dev.idhammai.c.r.O.Y.W("Center", true, this::lambda$new$10).k("\u81ea\u52a8\u5c45\u4e2d"));
    private final dev.idhammai.c.r.O.Y.W c = this.S(new dev.idhammai.c.r.O.Y.W("InventorySwap", true, this::lambda$new$11).k("\u80cc\u5305\u5207\u6362"));
    private final dev.idhammai.c.r.O.Y.W J = this.S(new dev.idhammai.c.r.O.Y.W("EnderChest", true, this::lambda$new$12).k("\u672b\u5f71\u7bb1\u8865\u4f4d"));
    private final dev.idhammai.c.r.O.Y.W A = this.S(new dev.idhammai.c.r.O.Y.W("Rotate", true, this::lambda$new$13).k("\u8f6c\u5411"));
    private final dev.idhammai.c.r.O.Y.W T = this.S(new dev.idhammai.c.r.O.Y.W("YawStep", false, this::lambda$new$14).k("\u504f\u822a\u6b65\u8fdb").D());
    private final dev.idhammai.c.r.O.Y.W U = this.S(new dev.idhammai.c.r.O.Y.W("FallFlying", true, this::lambda$new$15).k("\u9798\u7fc5\u65f6"));
    private final dev.idhammai.c.r.O.Y.l R = this.p(new dev.idhammai.c.r.O.Y.l("Steps", 0.05, 0.0, 1.0, 0.01, this::lambda$new$16).D("\u6b65\u8fdb\u5f3a\u5ea6"));
    private final dev.idhammai.c.r.O.Y.W k = this.S(new dev.idhammai.c.r.O.Y.W("OnlyLooking", true, this::lambda$new$17).k("\u4ec5\u770b\u5411").D());
    private final dev.idhammai.c.r.O.Y.l w = this.p(new dev.idhammai.c.r.O.Y.l("Fov", 20.0, 0.0, 360.0, 0.1, this::lambda$new$18).D("\u89c6\u89d2"));
    private final dev.idhammai.c.r.O.Y.l m = this.p(new dev.idhammai.c.r.O.Y.l("Priority", 10, 0, 100, this::lambda$new$19).D("\u4f18\u5148\u7ea7"));
    private final dev.idhammai.c.r.O.Y.W u = this.S(new dev.idhammai.c.r.O.Y.W("DetectMining", false, this::lambda$new$20).k("\u68c0\u6d4b\u6316\u6398"));
    private final dev.idhammai.c.r.O.Y.W Z = this.S(new dev.idhammai.c.r.O.Y.W("UsingPause", true, this::lambda$new$21).k("\u4f7f\u7528\u6682\u505c"));
    private final dev.idhammai.c.r.O.Y.W j = this.S(new dev.idhammai.c.r.O.Y.W("MoveDisable", true, this::lambda$new$22).k("\u79fb\u52a8\u5173\u95ed"));
    private final dev.idhammai.c.r.O.Y.W e = this.S(new dev.idhammai.c.r.O.Y.W("JumpDisable", true, this::lambda$new$23).k("\u8df3\u8dc3\u5173\u95ed"));
    public class_243 Q = null;
    double l = 0.0;
    double B = 0.0;
    double d = 0.0;
    int Y = 0;
    private boolean M = true;

    public q() {
        super("Surround", "Surrounds you with Obsidian", dev.idhammai.c.r.w.Combat);
        this.L("\u56f4\u811a");
        y = this;
    }

    public static boolean E(class_2338 class_23382) {
        return q.W.field_1724.method_5829().method_994(new class_238(class_23382));
    }

    public static boolean r(class_2338 class_23382) {
        for (class_742 class_7422 : Frog.THREAD.v()) {
            if (!class_7422.method_5829().method_994(new class_238(class_23382))) continue;
            return true;
        }
        return false;
    }

    public static class_241 v(class_243 class_2432, class_243 class_2433) {
        class_243 class_2434 = class_2433.method_1020(class_2432);
        return q.O(class_2434);
    }

    private static class_241 O(class_243 class_2432) {
        double d2 = class_2432.field_1352;
        double d3 = class_2432.field_1350;
        double d4 = Math.hypot(d2, d3);
        d3 = class_2432.field_1350;
        double d5 = class_2432.field_1352;
        double d6 = q.i(Math.toDegrees(Math.atan2(d3, d5)) - 90.0);
        double d7 = q.i(Math.toDegrees(-Math.atan2(class_2432.field_1351, d4)));
        return new class_241((float)d6, (float)d7);
    }

    private static double i(double d2) {
        double d3 = d2;
        if ((d3 %= 360.0) >= 180.0) {
            d3 -= 360.0;
        }
        if (d3 < -180.0) {
            d3 += 360.0;
        }
        return d3;
    }

    @r
    public void y(W w2) {
        if (this.Q != null && this.A.h() && this.e()) {
            w2.m(this.Q, this.R.Z(), this.m.Z());
        }
    }

    @r
    public void o(v v2) {
        if (q.M()) {
            return;
        }
        if (this.c.h() && !dev.idhammai.P.A.L.e.n()) {
            return;
        }
        if (this.n.x(dev.idhammai.c.r.O.p.T.Pre) && v2.C() || this.n.x(dev.idhammai.c.r.O.p.T.Post) && v2.a()) {
            return;
        }
        if (!this.K.m((long)this.g.e())) {
            return;
        }
        this.Q = null;
        this.Y = 0;
        if (!dev.idhammai.P.A.L.l.b() && !q.W.field_1690.field_1903.method_1434()) {
            this.l = q.W.field_1724.method_23317();
            this.B = q.W.field_1724.method_23318();
            this.d = q.W.field_1724.method_23321();
        }
        double d2 = class_3532.method_15355((float)((float)q.W.field_1724.method_5649(this.l, this.B, this.d)));
        if (this.i() == -1) {
            dev.idhammai.p.J.S.u("\u00a74No block found", this.hashCode() - 1);
            this.p();
            return;
        }
        if (this.j.h() && d2 > 1.0 || this.e.h() && q.W.field_1724.field_3913.field_3904) {
            this.p();
            return;
        }
        if (dev.idhammai.c.r.q.Q.W.b.p() && dev.idhammai.c.r.q.Q.W.b.m.h()) {
            return;
        }
        if (this.Z.h() && q.W.field_1724.method_6115()) {
            return;
        }
        if (!this.E.h() && !q.W.field_1724.method_24828()) {
            return;
        }
        this.X(new k(q.W.field_1724.method_23317(), q.W.field_1724.method_23318(), q.W.field_1724.method_23321()));
        this.X(new k(q.W.field_1724.method_23317(), q.W.field_1724.method_23318() + 0.8, q.W.field_1724.method_23321()));
    }

    public void X(class_2338 class_23382) {
        for (class_2350 class_23502 : class_2350.values()) {
            if (class_23502 == class_2350.field_11036) continue;
            class_2338 class_23383 = class_23382.method_10093(class_23502);
            if (dev.idhammai.P.A.l.M.x(class_23383) != null) {
                this.B(class_23383);
            } else if (dev.idhammai.P.A.l.M.c(class_23383)) {
                this.B(this.K(class_23383));
            }
            if (!q.E(class_23383) && (this.V.h() || !q.r(class_23383)) || !this.I.h()) continue;
            for (class_2350 class_23503 : class_2350.values()) {
                if (class_23503 == class_2350.field_11036) continue;
                class_2338 class_23384 = class_23383.method_10093(class_23503);
                if (q.E(class_23384) || !this.V.h() && q.r(class_23384)) {
                    for (class_2350 class_23504 : class_2350.values()) {
                        if (class_23504 == class_2350.field_11036) continue;
                        this.B(class_23384);
                        class_2338 class_23385 = class_23384.method_10093(class_23504);
                        this.B(dev.idhammai.P.A.l.M.x(class_23385) != null || !dev.idhammai.P.A.l.M.c(class_23385) ? class_23385 : this.K(class_23385));
                    }
                }
                this.B(dev.idhammai.P.A.l.M.x(class_23384) != null || !dev.idhammai.P.A.l.M.c(class_23384) ? class_23384 : this.K(class_23384));
            }
        }
    }

    @Override
    public void H() {
        if (q.M()) {
            if (this.j.h() || this.e.h()) {
                this.p();
            }
            return;
        }
        this.l = q.W.field_1724.method_23317();
        this.B = q.W.field_1724.method_23318();
        this.d = q.W.field_1724.method_23321();
        this.M = true;
    }

    private boolean e() {
        if (!this.U.h() && (q.W.field_1724.method_6128() || dev.idhammai.c.r.q.D.Q.F.p() && dev.idhammai.c.r.q.D.Q.F.z())) {
            return false;
        }
        return this.T.h() && !dev.idhammai.c.r.q.D.f.V.f();
    }

    @r(D=-1)
    public void y(T t2) {
        if (q.M() || !this.f.h() || q.W.field_1724.method_6128()) {
            return;
        }
        class_2338 class_23382 = dev.idhammai.P.A.L.e.H(true);
        if (q.W.field_1724.method_23317() - (double)class_23382.method_10263() - 0.5 <= 0.2 && q.W.field_1724.method_23317() - (double)class_23382.method_10263() - 0.5 >= -0.2 && q.W.field_1724.method_23321() - (double)class_23382.method_10260() - 0.5 <= 0.2 && q.W.field_1724.method_23321() - 0.5 - (double)class_23382.method_10260() >= -0.2) {
            if (this.M && (q.W.field_1724.method_24828() || dev.idhammai.P.A.L.l.b())) {
                t2.C(0.0);
                t2.p(0.0);
                this.M = false;
            }
        } else if (this.M) {
            class_243 class_2432 = dev.idhammai.P.A.L.e.H(true).method_46558();
            float f2 = q.v((class_243)q.W.field_1724.method_19538(), (class_243)class_2432).field_1343;
            float f3 = f2 / 180.0f * (float)Math.PI;
            double d2 = q.W.field_1724.method_19538().method_1022(new class_243(class_2432.field_1352, q.W.field_1724.method_23318(), class_2432.field_1350));
            double d3 = Math.min(0.2873, d2);
            double d4 = (double)(-((float)Math.sin(f3))) * d3;
            double d5 = (double)((float)Math.cos(f3)) * d3;
            t2.C(d4);
            t2.p(d5);
        }
    }

    private void B(class_2338 class_23382) {
        if (class_23382 == null) {
            return;
        }
        if (this.u.h() && Frog.BREAK.X(class_23382)) {
            return;
        }
        if (!((double)this.Y < this.b.e())) {
            return;
        }
        class_2338 class_23383 = dev.idhammai.P.A.L.e.H(true);
        if (this.P.h() && Objects.equals(a.q(), class_23383.method_10074()) && Objects.equals(a.q(), class_23382)) {
            return;
        }
        int n2 = this.i();
        if (n2 == -1) {
            return;
        }
        class_2350 class_23502 = dev.idhammai.P.A.l.M.x(class_23382);
        if (class_23502 == null) {
            return;
        }
        class_243 class_2432 = new class_243((double)class_23382.method_10263() + 0.5 + (double)class_23502.method_10163().method_10263() * 0.5, (double)class_23382.method_10264() + 0.5 + (double)class_23502.method_10163().method_10264() * 0.5, (double)class_23382.method_10260() + 0.5 + (double)class_23502.method_10163().method_10260() * 0.5);
        if (!dev.idhammai.P.A.l.M.A(class_23382, 6.0, true)) {
            return;
        }
        if (this.A.h() && !this.X(class_2432)) {
            return;
        }
        if (this.C.h()) {
            N.r(class_23382, this.A.h(), this.s.h());
        } else if (dev.idhammai.P.A.l.M.r(class_23382, false)) {
            return;
        }
        int n3 = q.W.field_1724.method_31548().field_7545;
        this.M(n2);
        dev.idhammai.P.A.l.M.V.add(class_23382);
        if (dev.idhammai.P.A.l.M.q()) {
            dev.idhammai.P.A.l.M.r(class_23382, false, class_1268.field_5808, this.D.h());
        } else {
            dev.idhammai.P.A.l.M.K(class_23382.method_10093(class_23502), class_23502.method_10153(), false, class_1268.field_5808, this.D.h());
        }
        this.K.H();
        if (this.c.h()) {
            this.M(n2);
            dev.idhammai.P.A.L.e.t();
        } else {
            this.M(n3);
        }
        if (this.A.h() && !this.e()) {
            Frog.ROTATION.M();
        }
        ++this.Y;
    }

    private boolean X(class_243 class_2432) {
        if (!this.e()) {
            Frog.ROTATION.a(class_2432);
            return true;
        }
        this.Q = class_2432;
        if (Frog.ROTATION.k(class_2432, this.w.Z())) {
            return true;
        }
        return !this.k.h();
    }

    private void M(int n2) {
        if (this.c.h()) {
            dev.idhammai.P.A.L.g.z(n2, q.W.field_1724.method_31548().field_7545);
        } else {
            dev.idhammai.P.A.L.g.j(n2);
        }
    }

    private int i() {
        if (this.c.h()) {
            if (dev.idhammai.P.A.L.g.H(class_2246.field_10540) != -1 || !this.J.h()) {
                return dev.idhammai.P.A.L.g.H(class_2246.field_10540);
            }
            return dev.idhammai.P.A.L.g.H(class_2246.field_10443);
        }
        if (dev.idhammai.P.A.L.g.L(class_2246.field_10540) != -1 || !this.J.h()) {
            return dev.idhammai.P.A.L.g.L(class_2246.field_10540);
        }
        return dev.idhammai.P.A.L.g.L(class_2246.field_10443);
    }

    public class_2338 K(class_2338 class_23382) {
        for (class_2350 class_23502 : class_2350.values()) {
            if (this.u.h() && Frog.BREAK.X(class_23382.method_10093(class_23502)) || !dev.idhammai.P.A.l.M.t(class_23382.method_10093(class_23502), class_23502.method_10153()) || !dev.idhammai.P.A.l.M.d(class_23382.method_10093(class_23502))) continue;
            return class_23382.method_10093(class_23502);
        }
        return null;
    }

    private boolean lambda$new$23() {
        return this.G.x(dev.idhammai.c.r.q.A.s.Check);
    }

    private boolean lambda$new$22() {
        return this.G.x(dev.idhammai.c.r.q.A.s.Check);
    }

    private boolean lambda$new$21() {
        return this.G.x(dev.idhammai.c.r.q.A.s.Check);
    }

    private boolean lambda$new$20() {
        return this.G.x(dev.idhammai.c.r.q.A.s.Check);
    }

    private boolean lambda$new$19() {
        return this.G.X() == dev.idhammai.c.r.q.A.s.Rotate && this.T.f();
    }

    private boolean lambda$new$18() {
        return this.k.f() && this.G.X() == dev.idhammai.c.r.q.A.s.Rotate && this.T.f();
    }

    private boolean lambda$new$17() {
        return this.G.X() == dev.idhammai.c.r.q.A.s.Rotate && this.T.f();
    }

    private boolean lambda$new$16() {
        return this.G.X() == dev.idhammai.c.r.q.A.s.Rotate && this.T.f();
    }

    private boolean lambda$new$15() {
        return this.A.f() && this.T.f() && this.G.X() == dev.idhammai.c.r.q.A.s.Rotate;
    }

    private boolean lambda$new$14() {
        return this.A.f() && this.G.X() == dev.idhammai.c.r.q.A.s.Rotate;
    }

    private boolean lambda$new$13() {
        return this.G.X() == dev.idhammai.c.r.q.A.s.Rotate;
    }

    private boolean lambda$new$12() {
        return this.G.x(dev.idhammai.c.r.q.A.s.General);
    }

    private boolean lambda$new$11() {
        return this.G.x(dev.idhammai.c.r.q.A.s.General);
    }

    private boolean lambda$new$10() {
        return this.G.x(dev.idhammai.c.r.q.A.s.General);
    }

    private boolean lambda$new$9() {
        return this.G.x(dev.idhammai.c.r.q.A.s.General) && this.C.f();
    }

    private boolean lambda$new$8() {
        return this.G.x(dev.idhammai.c.r.q.A.s.General);
    }

    private boolean lambda$new$7() {
        return this.G.x(dev.idhammai.c.r.q.A.s.General);
    }

    private boolean lambda$new$6() {
        return this.G.x(dev.idhammai.c.r.q.A.s.General);
    }

    private boolean lambda$new$5() {
        return this.G.x(dev.idhammai.c.r.q.A.s.General);
    }

    private boolean lambda$new$4() {
        return this.G.x(dev.idhammai.c.r.q.A.s.Check);
    }

    private boolean lambda$new$3() {
        return this.G.x(dev.idhammai.c.r.q.A.s.General) && this.I.f();
    }

    private boolean lambda$new$2() {
        return this.G.x(dev.idhammai.c.r.q.A.s.General);
    }

    private boolean lambda$new$1() {
        return this.G.x(dev.idhammai.c.r.q.A.s.General);
    }

    private boolean lambda$new$0() {
        return this.G.x(dev.idhammai.c.r.q.A.s.General);
    }
}

