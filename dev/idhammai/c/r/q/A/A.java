/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_238
 *  net.minecraft.class_241
 *  net.minecraft.class_243
 *  net.minecraft.class_3532
 */
package dev.idhammai.c.r.q.A;

import dev.idhammai.Frog;
import dev.idhammai.P.A.A.h;
import dev.idhammai.P.A.L.e;
import dev.idhammai.P.A.L.g;
import dev.idhammai.P.A.L.l;
import dev.idhammai.P.A.Y.N;
import dev.idhammai.P.A.l.M;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.T;
import dev.idhammai.P.r.c.W;
import dev.idhammai.P.r.c.v;
import dev.idhammai.c.r.O.Y.B;
import dev.idhammai.c.r.O.Y.O;
import dev.idhammai.c.r.q.A.C;
import dev.idhammai.c.r.q.A.m;
import dev.idhammai.c.r.q.D.Q;
import dev.idhammai.c.r.q.D.f;
import dev.idhammai.c.r.q.i.a;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import dev.idhammai.p.J.U;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import net.minecraft.class_1268;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_241;
import net.minecraft.class_243;
import net.minecraft.class_3532;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class A
extends y {
    public static A P;
    private final B<m> f = this.S(new B<m>("Page", dev.idhammai.c.r.q.A.m.General).I("\u9875\u9762").X(dev.idhammai.c.r.q.A.m.General, "\u5e38\u89c4").X(dev.idhammai.c.r.q.A.m.Rotate, "\u65cb\u8f6c").X(dev.idhammai.c.r.q.A.m.Check, "\u68c0\u6d4b").X(dev.idhammai.c.r.q.A.m.GodMode, "\u4e0a\u5e1d\u6a21\u5f0f"));
    private final dev.idhammai.c.r.O.Y.W C = this.S(new dev.idhammai.c.r.O.Y.W("GodMode", true, this::lambda$new$0).k("\u4e0a\u5e1d\u6a21\u5f0f"));
    private final dev.idhammai.c.r.O.Y.l u = this.p(new dev.idhammai.c.r.O.Y.l("BreakTime", 2.0, 0.0, 3.0, this::lambda$new$1).D("\u7834\u574f\u65f6\u95f4"));
    private final dev.idhammai.c.r.O.Y.W R = this.S(new dev.idhammai.c.r.O.Y.W("FailedSkip", true, this::lambda$new$2).k("\u5931\u8d25\u8df3\u8fc7"));
    private final dev.idhammai.c.r.O.Y.l h = this.p(new dev.idhammai.c.r.O.Y.l("PlaceDelay", 50, 0, 500, this::lambda$new$3).D("\u653e\u7f6e\u5ef6\u8fdf"));
    private final dev.idhammai.c.r.O.Y.W l = this.S(new dev.idhammai.c.r.O.Y.W("MineDownward", false, this::lambda$new$4).k("\u5411\u4e0b\u6316\u6398"));
    private final dev.idhammai.c.r.O.Y.W I = this.S(new dev.idhammai.c.r.O.Y.W("Extend", true, this::lambda$new$5).k("\u6269\u5c55"));
    private final h m = new h();
    private final dev.idhammai.c.r.O.Y.l k = this.p(new dev.idhammai.c.r.O.Y.l("BlocksPer", 1, 1, 8, this::lambda$new$6).D("\u6bcftick\u65b9\u5757"));
    private final B<dev.idhammai.c.r.O.p.T> B = this.S(new B<dev.idhammai.c.r.O.p.T>("Timing", dev.idhammai.c.r.O.p.T.All, this::lambda$new$7).I("\u65f6\u673a").X(dev.idhammai.c.r.O.p.T.Pre, "\u524d").X(dev.idhammai.c.r.O.p.T.Post, "\u540e").X(dev.idhammai.c.r.O.p.T.All, "\u5168\u90e8"));
    private final dev.idhammai.c.r.O.Y.W g = this.S(new dev.idhammai.c.r.O.Y.W("PacketPlace", true, this::lambda$new$8).k("\u53d1\u5305\u653e\u7f6e"));
    private final dev.idhammai.c.r.O.Y.W U = this.S(new dev.idhammai.c.r.O.Y.W("Break", true, this::lambda$new$9).k("\u6253\u6c34\u6676").D());
    private final dev.idhammai.c.r.O.Y.W r = this.S(new dev.idhammai.c.r.O.Y.W("EatingPause", true, this::lambda$new$10).k("\u8fdb\u98df\u6682\u505c"));
    private final dev.idhammai.c.r.O.Y.W d = this.S(new dev.idhammai.c.r.O.Y.W("Center", true, this::lambda$new$11).k("\u81ea\u52a8\u5c45\u4e2d"));
    private final dev.idhammai.c.r.O.Y.W F = this.S(new dev.idhammai.c.r.O.Y.W("InventorySwap", true, this::lambda$new$12).k("\u80cc\u5305\u5207\u6362"));
    private final dev.idhammai.c.r.O.Y.W p = this.S(new dev.idhammai.c.r.O.Y.W("EnderChest", true, this::lambda$new$13).k("\u672b\u5f71\u7bb1\u8865\u4f4d"));
    private final dev.idhammai.c.r.O.Y.W E = this.S(new dev.idhammai.c.r.O.Y.W("Head", true, this::lambda$new$14).k("\u5934\u9876"));
    private final dev.idhammai.c.r.O.Y.W n = this.S(new dev.idhammai.c.r.O.Y.W("Feet", true, this::lambda$new$15).k("\u811a\u4e0b"));
    private final dev.idhammai.c.r.O.Y.W a = this.S(new dev.idhammai.c.r.O.Y.W("Chest", true, this::lambda$new$16).k("\u80f8\u53e3"));
    private final O D = this.n(new O("HeadKey", -1, this::lambda$new$17).E("\u5934\u9876\u6309\u952e"));
    private final dev.idhammai.c.r.O.Y.W s = this.S(new dev.idhammai.c.r.O.Y.W("InAir", true, this::lambda$new$18).k("\u7a7a\u4e2d\u4e5f\u542f\u7528"));
    private final dev.idhammai.c.r.O.Y.W t = this.S(new dev.idhammai.c.r.O.Y.W("DetectMining", false, this::lambda$new$19).k("\u68c0\u6d4b\u6316\u6398"));
    private final dev.idhammai.c.r.O.Y.W M = this.S(new dev.idhammai.c.r.O.Y.W("UsingPause", true, this::lambda$new$20).k("\u4f7f\u7528\u6682\u505c"));
    private final dev.idhammai.c.r.O.Y.W N = this.S(new dev.idhammai.c.r.O.Y.W("NoBlockDisable", true, this::lambda$new$21).k("\u65e0\u65b9\u5757\u5173\u95ed"));
    private final dev.idhammai.c.r.O.Y.W y = this.S(new dev.idhammai.c.r.O.Y.W("MoveDisable", true, this::lambda$new$22).k("\u79fb\u52a8\u5173\u95ed"));
    private final dev.idhammai.c.r.O.Y.W e = this.S(new dev.idhammai.c.r.O.Y.W("JumpDisable", true, this::lambda$new$23).k("\u8df3\u8dc3\u5173\u95ed"));
    private final dev.idhammai.c.r.O.Y.W Y = this.S(new dev.idhammai.c.r.O.Y.W("Rotate", true, this::lambda$new$24).k("\u8f6c\u5411"));
    private final dev.idhammai.c.r.O.Y.W b = this.S(new dev.idhammai.c.r.O.Y.W("YawStep", false, this::lambda$new$25).k("\u504f\u822a\u6b65\u8fdb").D());
    private final dev.idhammai.c.r.O.Y.W T = this.S(new dev.idhammai.c.r.O.Y.W("FallFlying", true, this::lambda$new$26).k("\u9798\u7fc5\u65f6"));
    private final dev.idhammai.c.r.O.Y.l J = this.p(new dev.idhammai.c.r.O.Y.l("Steps", 0.05, 0.0, 1.0, 0.01, this::lambda$new$27).D("\u6b65\u8fdb\u5f3a\u5ea6"));
    private final dev.idhammai.c.r.O.Y.W Q = this.S(new dev.idhammai.c.r.O.Y.W("OnlyLooking", true, this::lambda$new$28).k("\u4ec5\u770b\u5411").D());
    private final dev.idhammai.c.r.O.Y.l Z = this.p(new dev.idhammai.c.r.O.Y.l("Fov", 20.0, 0.0, 360.0, 0.1, this::lambda$new$29).D("\u89c6\u89d2"));
    private final dev.idhammai.c.r.O.Y.l G = this.p(new dev.idhammai.c.r.O.Y.l("Priority", 10, 0, 100, this::lambda$new$30).D("\u4f18\u5148\u7ea7"));
    public class_243 H = null;
    double X = 0.0;
    double c = 0.0;
    double V = 0.0;
    int L = 0;
    private boolean A = true;
    public static final List<class_2338> w;

    public A() {
        super("SelfTrap", dev.idhammai.c.r.w.Combat);
        this.L("\u81ea\u6211\u56f0\u4f4f");
        P = this;
        Frog.EVENT_BUS.S(new C(this));
    }

    public static boolean W(class_2338 class_23382) {
        return dev.idhammai.c.r.q.A.A.W.field_1724.method_5829().method_994(new class_238(class_23382));
    }

    public static class_241 h(class_243 class_2432, class_243 class_2433) {
        class_243 class_2434 = class_2433.method_1020(class_2432);
        return dev.idhammai.c.r.q.A.A.v(class_2434);
    }

    private static class_241 v(class_243 class_2432) {
        double d2 = class_2432.field_1352;
        double d3 = class_2432.field_1350;
        double d4 = Math.hypot(d2, d3);
        d3 = class_2432.field_1350;
        double d5 = class_2432.field_1352;
        double d6 = dev.idhammai.c.r.q.A.A.P(Math.toDegrees(Math.atan2(d3, d5)) - 90.0);
        double d7 = dev.idhammai.c.r.q.A.A.P(Math.toDegrees(-Math.atan2(class_2432.field_1351, d4)));
        return new class_241((float)d6, (float)d7);
    }

    @r
    public void Q(W w2) {
        if (this.H != null && this.Y.h() && this.T()) {
            w2.m(this.H, this.J.Z(), this.G.Z());
        }
    }

    private static double P(double d2) {
        double d3 = d2;
        if ((d3 %= 360.0) >= 180.0) {
            d3 -= 360.0;
        }
        if (d3 < -180.0) {
            d3 += 360.0;
        }
        return d3;
    }

    @Override
    public void H() {
        if (dev.idhammai.c.r.q.A.A.M()) {
            if (this.y.h() || this.e.h()) {
                this.p();
            }
            return;
        }
        this.X = dev.idhammai.c.r.q.A.A.W.field_1724.method_23317();
        this.c = dev.idhammai.c.r.q.A.A.W.field_1724.method_23318();
        this.V = dev.idhammai.c.r.q.A.A.W.field_1724.method_23321();
        this.A = true;
    }

    @r
    public void E(v v2) {
        if (dev.idhammai.c.r.q.A.A.M()) {
            return;
        }
        if (this.F.h() && !dev.idhammai.P.A.L.e.n()) {
            return;
        }
        if (this.B.x(dev.idhammai.c.r.O.p.T.Pre) && v2.C() || this.B.x(dev.idhammai.c.r.O.p.T.Post) && v2.a()) {
            return;
        }
        if (!this.m.m((long)this.h.e())) {
            return;
        }
        this.H = null;
        this.L = 0;
        if (!dev.idhammai.P.A.L.l.b() && !dev.idhammai.c.r.q.A.A.W.field_1690.field_1903.method_1434()) {
            this.X = dev.idhammai.c.r.q.A.A.W.field_1724.method_23317();
            this.c = dev.idhammai.c.r.q.A.A.W.field_1724.method_23318();
            this.V = dev.idhammai.c.r.q.A.A.W.field_1724.method_23321();
        }
        class_2338 class_23382 = dev.idhammai.P.A.L.e.H(true);
        double d2 = class_3532.method_15355((float)((float)dev.idhammai.c.r.q.A.A.W.field_1724.method_5649(this.X, this.c, this.V)));
        if (this.a() == -1) {
            if (this.N.h()) {
                this.p();
            }
            return;
        }
        if (this.y.h() && d2 > 1.0 || this.e.h() && dev.idhammai.c.r.q.A.A.W.field_1724.field_3913.field_3904) {
            this.p();
            return;
        }
        if (dev.idhammai.c.r.q.Q.W.b.p() && dev.idhammai.c.r.q.Q.W.b.m.h()) {
            return;
        }
        if (this.M.h() && dev.idhammai.c.r.q.A.A.W.field_1724.method_6115()) {
            return;
        }
        if (!this.s.h() && !dev.idhammai.c.r.q.A.A.W.field_1724.method_24828()) {
            return;
        }
        if (this.E.h()) {
            class_2248 class_22482 = dev.idhammai.P.A.l.M.x(class_23382.method_10084());
            if (class_22482 == class_2246.field_10540 || class_22482 == class_2246.field_9987) {
                this.s(class_23382.method_10086(2));
            } else {
                this.A(class_23382.method_10086(2));
            }
        }
        if (this.n.h()) {
            this.d(class_23382);
        }
        if (this.a.h()) {
            this.d(class_23382.method_10084());
        }
        w.clear();
    }

    private boolean T() {
        if (!this.T.h() && (dev.idhammai.c.r.q.A.A.W.field_1724.method_6128() || dev.idhammai.c.r.q.D.Q.F.p() && dev.idhammai.c.r.q.D.Q.F.z())) {
            return false;
        }
        return this.b.h() && !dev.idhammai.c.r.q.D.f.V.f();
    }

    @r(D=-1)
    public void S(T t2) {
        if (dev.idhammai.c.r.q.A.A.M() || !this.d.h() || dev.idhammai.c.r.q.A.A.W.field_1724.method_6128()) {
            return;
        }
        class_2338 class_23382 = dev.idhammai.P.A.L.e.H(true);
        if (dev.idhammai.c.r.q.A.A.W.field_1724.method_23317() - (double)class_23382.method_10263() - 0.5 <= 0.2 && dev.idhammai.c.r.q.A.A.W.field_1724.method_23317() - (double)class_23382.method_10263() - 0.5 >= -0.2 && dev.idhammai.c.r.q.A.A.W.field_1724.method_23321() - (double)class_23382.method_10260() - 0.5 <= 0.2 && dev.idhammai.c.r.q.A.A.W.field_1724.method_23321() - 0.5 - (double)class_23382.method_10260() >= -0.2) {
            if (this.A && (dev.idhammai.c.r.q.A.A.W.field_1724.method_24828() || dev.idhammai.P.A.L.l.b())) {
                t2.C(0.0);
                t2.p(0.0);
                this.A = false;
            }
        } else if (this.A) {
            class_243 class_2432 = dev.idhammai.P.A.L.e.H(true).method_46558();
            float f2 = dev.idhammai.c.r.q.A.A.h((class_243)dev.idhammai.c.r.q.A.A.W.field_1724.method_19538(), (class_243)class_2432).field_1343;
            float f3 = f2 / 180.0f * (float)Math.PI;
            double d2 = dev.idhammai.c.r.q.A.A.W.field_1724.method_19538().method_1022(new class_243(class_2432.field_1352, dev.idhammai.c.r.q.A.A.W.field_1724.method_23318(), class_2432.field_1350));
            double d3 = Math.min(0.2873, d2);
            double d4 = (double)(-((float)Math.sin(f3))) * d3;
            double d5 = (double)((float)Math.cos(f3)) * d3;
            t2.C(d4);
            t2.p(d5);
        }
    }

    private void d(class_2338 class_23382) {
        for (class_2350 class_23502 : class_2350.values()) {
            if (class_23502 == class_2350.field_11036) continue;
            class_2338 class_23383 = class_23382.method_10093(class_23502);
            if (this.C.h()) {
                for (U u2 : Frog.BREAK.q.values()) {
                    if (u2.Q() == null || this.R.h() && u2.F || !u2.T.equals((Object)class_23383)) continue;
                    if (!((double)u2.C.k() >= this.u.e() * 1000.0)) break;
                    w.add(class_23383);
                    break;
                }
            }
            if (dev.idhammai.P.A.l.M.x(class_23383) != null) {
                this.A(class_23383);
            } else if (dev.idhammai.P.A.l.M.c(class_23383)) {
                this.A(this.l(class_23383));
            }
            if (!dev.idhammai.c.r.q.A.A.W(class_23383) || !this.I.h()) continue;
            for (class_2350 class_23503 : class_2350.values()) {
                if (class_23503 == class_2350.field_11036) continue;
                class_2338 class_23384 = class_23383.method_10093(class_23503);
                if (this.C.h()) {
                    for (U u3 : Frog.BREAK.q.values()) {
                        if (u3.Q() == null || this.R.h() && u3.F || !u3.T.equals((Object)class_23384)) continue;
                        if (!((double)u3.C.k() >= this.u.e() * 1000.0)) break;
                        w.add(class_23384);
                        break;
                    }
                }
                if (dev.idhammai.c.r.q.A.A.W(class_23384)) {
                    for (class_2350 class_23504 : class_2350.values()) {
                        if (class_23504 == class_2350.field_11036) continue;
                        this.A(class_23384);
                        class_2338 class_23385 = class_23384.method_10093(class_23504);
                        this.A(dev.idhammai.P.A.l.M.x(class_23385) != null || !dev.idhammai.P.A.l.M.c(class_23385) ? class_23385 : this.l(class_23385));
                    }
                }
                this.A(dev.idhammai.P.A.l.M.x(class_23384) != null || !dev.idhammai.P.A.l.M.c(class_23384) ? class_23384 : this.l(class_23384));
            }
        }
    }

    private boolean v(class_243 class_2432) {
        if (!this.T()) {
            Frog.ROTATION.a(class_2432);
            return true;
        }
        this.H = class_2432;
        if (Frog.ROTATION.k(class_2432, this.Z.Z())) {
            return true;
        }
        return !this.Q.h();
    }

    private void s(class_2338 class_23382) {
        if (class_23382 == null) {
            return;
        }
        if (this.t.h() && Frog.BREAK.X(class_23382)) {
            return;
        }
        int n2 = this.a();
        if (n2 == -1) {
            return;
        }
        class_2350 class_23502 = class_2350.field_11033;
        class_243 class_2432 = new class_243((double)class_23382.method_10263() + 0.5 + (double)class_23502.method_10163().method_10263() * 0.5, (double)class_23382.method_10264() + 0.5 + (double)class_23502.method_10163().method_10264() * 0.5, (double)class_23382.method_10260() + 0.5 + (double)class_23502.method_10163().method_10260() * 0.5);
        if (!dev.idhammai.P.A.l.M.U(class_23382, true) || !w.contains(class_23382)) {
            return;
        }
        if (this.Y.h() && !this.v(class_2432)) {
            return;
        }
        if (this.U.h()) {
            dev.idhammai.P.A.Y.N.r(class_23382, this.Y.h(), this.r.h());
        } else if (dev.idhammai.P.A.l.M.r(class_23382, false)) {
            return;
        }
        int n3 = dev.idhammai.c.r.q.A.A.W.field_1724.method_31548().field_7545;
        this.P(n2);
        dev.idhammai.P.A.l.M.V.add(class_23382);
        if (dev.idhammai.P.A.l.M.q()) {
            dev.idhammai.P.A.l.M.r(class_23382, false, class_1268.field_5808, this.g.h());
        } else {
            dev.idhammai.P.A.l.M.K(class_23382.method_10093(class_23502), class_23502.method_10153(), false, class_1268.field_5808, this.g.h());
        }
        if (this.F.h()) {
            this.P(n2);
            dev.idhammai.P.A.L.e.t();
        } else {
            this.P(n3);
        }
        if (this.Y.h() && !this.T()) {
            Frog.ROTATION.M();
        }
        ++this.L;
        this.m.H();
    }

    private void A(class_2338 class_23382) {
        if (class_23382 == null) {
            return;
        }
        if (this.t.h() && Frog.BREAK.X(class_23382)) {
            return;
        }
        class_2338 class_23383 = dev.idhammai.P.A.L.e.H(true);
        if (this.l.h() && Objects.equals(dev.idhammai.c.r.q.i.a.q(), class_23383.method_10074()) && Objects.equals(dev.idhammai.c.r.q.i.a.q(), class_23382)) {
            return;
        }
        if (!((double)this.L < this.k.e())) {
            return;
        }
        int n2 = this.a();
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
        if (this.Y.h() && !this.v(class_2432)) {
            return;
        }
        if (this.U.h()) {
            dev.idhammai.P.A.Y.N.r(class_23382, this.Y.h(), this.r.h());
        } else if (dev.idhammai.P.A.l.M.r(class_23382, false)) {
            return;
        }
        int n3 = dev.idhammai.c.r.q.A.A.W.field_1724.method_31548().field_7545;
        this.P(n2);
        dev.idhammai.P.A.l.M.V.add(class_23382);
        if (dev.idhammai.P.A.l.M.q()) {
            dev.idhammai.P.A.l.M.r(class_23382, false, class_1268.field_5808, this.g.h());
        } else {
            dev.idhammai.P.A.l.M.K(class_23382.method_10093(class_23502), class_23502.method_10153(), false, class_1268.field_5808, this.g.h());
        }
        this.m.H();
        if (this.F.h()) {
            this.P(n2);
            dev.idhammai.P.A.L.e.t();
        } else {
            this.P(n3);
        }
        if (this.Y.h() && !this.T()) {
            Frog.ROTATION.M();
        }
        ++this.L;
    }

    private void P(int n2) {
        if (this.F.h()) {
            dev.idhammai.P.A.L.g.z(n2, dev.idhammai.c.r.q.A.A.W.field_1724.method_31548().field_7545);
        } else {
            dev.idhammai.P.A.L.g.j(n2);
        }
    }

    private int a() {
        if (this.F.h()) {
            if (dev.idhammai.P.A.L.g.H(class_2246.field_10540) != -1 || !this.p.h()) {
                return dev.idhammai.P.A.L.g.H(class_2246.field_10540);
            }
            return dev.idhammai.P.A.L.g.H(class_2246.field_10443);
        }
        if (dev.idhammai.P.A.L.g.L(class_2246.field_10540) != -1 || !this.p.h()) {
            return dev.idhammai.P.A.L.g.L(class_2246.field_10540);
        }
        return dev.idhammai.P.A.L.g.L(class_2246.field_10443);
    }

    public class_2338 l(class_2338 class_23382) {
        for (class_2350 class_23502 : class_2350.values()) {
            if (this.t.h() && Frog.BREAK.X(class_23382.method_10093(class_23502)) || !dev.idhammai.P.A.l.M.t(class_23382.method_10093(class_23502), class_23502.method_10153()) || !dev.idhammai.P.A.l.M.d(class_23382.method_10093(class_23502))) continue;
            return class_23382.method_10093(class_23502);
        }
        return null;
    }

    private boolean lambda$new$30() {
        return this.f.X() == dev.idhammai.c.r.q.A.m.Rotate && this.b.f();
    }

    private boolean lambda$new$29() {
        return this.Q.f() && this.f.X() == dev.idhammai.c.r.q.A.m.Rotate && this.b.f();
    }

    private boolean lambda$new$28() {
        return this.f.X() == dev.idhammai.c.r.q.A.m.Rotate && this.b.f();
    }

    private boolean lambda$new$27() {
        return this.f.X() == dev.idhammai.c.r.q.A.m.Rotate && this.b.f();
    }

    private boolean lambda$new$26() {
        return this.Y.f() && this.b.f() && this.f.X() == dev.idhammai.c.r.q.A.m.Rotate;
    }

    private boolean lambda$new$25() {
        return this.Y.f() && this.f.X() == dev.idhammai.c.r.q.A.m.Rotate;
    }

    private boolean lambda$new$24() {
        return this.f.X() == dev.idhammai.c.r.q.A.m.Rotate;
    }

    private boolean lambda$new$23() {
        return this.f.x(dev.idhammai.c.r.q.A.m.Check);
    }

    private boolean lambda$new$22() {
        return this.f.x(dev.idhammai.c.r.q.A.m.Check);
    }

    private boolean lambda$new$21() {
        return this.f.x(dev.idhammai.c.r.q.A.m.Check);
    }

    private boolean lambda$new$20() {
        return this.f.x(dev.idhammai.c.r.q.A.m.Check);
    }

    private boolean lambda$new$19() {
        return this.f.x(dev.idhammai.c.r.q.A.m.Check);
    }

    private boolean lambda$new$18() {
        return this.f.x(dev.idhammai.c.r.q.A.m.Check);
    }

    private boolean lambda$new$17() {
        return this.f.x(dev.idhammai.c.r.q.A.m.General);
    }

    private boolean lambda$new$16() {
        return this.f.x(dev.idhammai.c.r.q.A.m.General);
    }

    private boolean lambda$new$15() {
        return this.f.x(dev.idhammai.c.r.q.A.m.General);
    }

    private boolean lambda$new$14() {
        return this.f.x(dev.idhammai.c.r.q.A.m.General);
    }

    private boolean lambda$new$13() {
        return this.f.x(dev.idhammai.c.r.q.A.m.General);
    }

    private boolean lambda$new$12() {
        return this.f.x(dev.idhammai.c.r.q.A.m.General);
    }

    private boolean lambda$new$11() {
        return this.f.x(dev.idhammai.c.r.q.A.m.General);
    }

    private boolean lambda$new$10() {
        return this.f.x(dev.idhammai.c.r.q.A.m.General) && this.U.f();
    }

    private boolean lambda$new$9() {
        return this.f.x(dev.idhammai.c.r.q.A.m.General);
    }

    private boolean lambda$new$8() {
        return this.f.x(dev.idhammai.c.r.q.A.m.General);
    }

    private boolean lambda$new$7() {
        return this.f.x(dev.idhammai.c.r.q.A.m.General);
    }

    private boolean lambda$new$6() {
        return this.f.x(dev.idhammai.c.r.q.A.m.General);
    }

    private boolean lambda$new$5() {
        return this.f.x(dev.idhammai.c.r.q.A.m.General);
    }

    private boolean lambda$new$4() {
        return this.f.x(dev.idhammai.c.r.q.A.m.General);
    }

    private boolean lambda$new$3() {
        return this.f.x(dev.idhammai.c.r.q.A.m.General);
    }

    private boolean lambda$new$2() {
        return this.f.x(dev.idhammai.c.r.q.A.m.GodMode);
    }

    private boolean lambda$new$1() {
        return this.f.x(dev.idhammai.c.r.q.A.m.GodMode);
    }

    private boolean lambda$new$0() {
        return this.f.x(dev.idhammai.c.r.q.A.m.GodMode);
    }

    static {
        w = new ArrayList<class_2338>();
    }
}

