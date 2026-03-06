/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.block.Blocks
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket
 *  net.minecraft.util.hit.BlockHitResult
 */
package dev.idhammai.c.r.q.A;

import dev.idhammai.Frog;
import dev.idhammai.P.A.A.p;
import dev.idhammai.P.A.L.e;
import dev.idhammai.P.A.L.g;
import dev.idhammai.P.A.Y.N;
import dev.idhammai.P.A.l.M;
import dev.idhammai.P.A.l.k;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.W;
import dev.idhammai.P.r.c.v;
import dev.idhammai.c.r.O.Y.B;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.O.p.T;
import dev.idhammai.c.r.q.A.O;
import dev.idhammai.c.r.q.A.h;
import dev.idhammai.c.r.q.D.Q;
import dev.idhammai.c.r.q.D.f;
import dev.idhammai.c.r.q.N.x;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import java.util.ArrayList;
import net.minecraft.util.Hand;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket;
import net.minecraft.util.hit.BlockHitResult;

public class J
extends y {
    public static J R;
    public static boolean I;
    public static boolean s;
    public final B<h> K = this.S(new B<h>("Page", dev.idhammai.c.r.q.A.h.General).I("\u9875\u9762").X(dev.idhammai.c.r.q.A.h.General, "\u5e38\u89c4").X(dev.idhammai.c.r.q.A.h.Rotate, "\u65cb\u8f6c"));
    public final l t = this.p(new l("PlaceDelay", 50, 0, 500, this::lambda$new$0).D("\u653e\u7f6e\u5ef6\u8fdf"));
    public final l w = this.p(new l("BlocksPer", 2, 1, 10, this::lambda$new$1).D("\u6bcftick\u65b9\u5757"));
    public final l k = this.p(new l("PredictTicks", 2.0, 0.0, 50.0, 1.0, this::lambda$new$2).D("\u9884\u6d4btick"));
    public final l h = this.p(new l("MaxWebs", 2.0, 1.0, 8.0, 1.0, this::lambda$new$3).D("\u6700\u5927\u86db\u7f51\u6570"));
    public final l p = this.p(new l("Offset", 0.25, 0.0, 0.3, 0.01, this::lambda$new$4).D("\u504f\u79fb"));
    public final l A = this.p(new l("PlaceRange", 5.0, 0.0, 6.0, 0.1, this::lambda$new$5).D("\u653e\u7f6e\u8303\u56f4"));
    public final l Q = this.p(new l("TargetRange", 8.0, 0.0, 8.0, 0.1, this::lambda$new$6).D("\u76ee\u6807\u8303\u56f4"));
    final ArrayList<class_2338> C = new ArrayList();
    private final dev.idhammai.c.r.O.Y.W j = this.S(new dev.idhammai.c.r.O.Y.W("PreferAnchor", true, this::lambda$new$7).k("\u4f18\u5148\u951a\u70b9"));
    private final dev.idhammai.c.r.O.Y.W c = this.S(new dev.idhammai.c.r.O.Y.W("DetectMining", true, this::lambda$new$8).k("\u68c0\u6d4b\u6316\u6398"));
    private final B<T> N = this.S(new B<T>("Timing", T.All, this::lambda$new$9).I("\u65f6\u673a").X(T.Pre, "\u524d").X(T.Post, "\u540e").X(T.All, "\u5168\u90e8"));
    private final dev.idhammai.c.r.O.Y.W g = this.S(new dev.idhammai.c.r.O.Y.W("Feet", true, this::lambda$new$10).k("\u811a\u4e0b"));
    private final dev.idhammai.c.r.O.Y.W a = this.S(new dev.idhammai.c.r.O.Y.W("FeetExtend", true, this::lambda$new$11).k("\u811a\u4e0b\u6269\u5c55"));
    private final dev.idhammai.c.r.O.Y.W X = this.S(new dev.idhammai.c.r.O.Y.W("Face", true, this::lambda$new$12).k("\u8138\u90e8"));
    private final dev.idhammai.c.r.O.Y.W H = this.S(new dev.idhammai.c.r.O.Y.W("Down", true, this::lambda$new$13).k("\u4e0b\u65b9"));
    private final dev.idhammai.c.r.O.Y.W u = this.S(new dev.idhammai.c.r.O.Y.W("InventorySwap", true, this::lambda$new$14).k("\u80cc\u5305\u5207\u6362"));
    private final dev.idhammai.c.r.O.Y.W b = this.S(new dev.idhammai.c.r.O.Y.W("UsingPause", true, this::lambda$new$15).k("\u4f7f\u7528\u6682\u505c"));
    private final dev.idhammai.c.r.O.Y.W r = this.S(new dev.idhammai.c.r.O.Y.W("Rotate", true, this::lambda$new$16).k("\u8f6c\u5411").D());
    private final dev.idhammai.c.r.O.Y.W U = this.S(new dev.idhammai.c.r.O.Y.W("YawStep", false, this::lambda$new$17).k("\u504f\u822a\u6b65\u8fdb").D());
    private final dev.idhammai.c.r.O.Y.W D = this.S(new dev.idhammai.c.r.O.Y.W("FallFlying", true, this::lambda$new$18).k("\u9798\u7fc5\u65f6"));
    private final l E = this.p(new l("Steps", 0.3, 0.1, 1.0, 0.01, this::lambda$new$19).D("\u6b65\u8fdb\u5f3a\u5ea6"));
    private final dev.idhammai.c.r.O.Y.W y = this.S(new dev.idhammai.c.r.O.Y.W("OnlyLooking", true, this::lambda$new$20).k("\u4ec5\u770b\u5411"));
    private final l m = this.p(new l("Fov", 20.0, 0.0, 360.0, 0.1, this::lambda$new$21).D("\u89c6\u89d2"));
    private final l F = this.p(new l("Priority", 10, 0, 100, this::lambda$new$22).D("\u4f18\u5148\u7ea7"));
    private final dev.idhammai.P.A.A.h G = new dev.idhammai.P.A.A.h();
    public class_243 d = null;
    int Z = 0;

    public J() {
        super("AutoWeb", dev.idhammai.c.r.w.Combat);
        this.L("\u8718\u86db\u7f51\u5149\u73af");
        R = this;
    }

    @Override
    public String I() {
        if (this.C.isEmpty()) {
            return null;
        }
        return "Working";
    }

    private boolean S() {
        if (!this.D.h() && (J.W.field_1724.method_6128() || dev.idhammai.c.r.q.D.Q.F.p() && dev.idhammai.c.r.q.D.Q.F.z())) {
            return false;
        }
        return this.U.h() && !f.V.f();
    }

    @r
    public void W(W w2) {
        if (this.r.h() && this.S() && this.d != null) {
            w2.m(this.d, this.E.Z(), this.F.Z());
        }
    }

    @r
    public void Y(v v2) {
        if (J.M()) {
            return;
        }
        if (this.N.x(T.Pre) && v2.C() || this.N.x(T.Post) && v2.a()) {
            return;
        }
        if (I) {
            s = true;
        }
        this.s();
        s = false;
    }

    @Override
    public void L() {
        I = false;
    }

    private void s() {
        if (!this.G.m(this.t.V())) {
            return;
        }
        if (this.u.h() && !e.n()) {
            return;
        }
        this.C.clear();
        this.Z = 0;
        this.d = null;
        if (this.j.h() && O.c.GD != null) {
            return;
        }
        if (this.D() == -1) {
            return;
        }
        if (dev.idhammai.c.r.q.Q.W.b.p() && dev.idhammai.c.r.q.Q.W.b.m.h()) {
            return;
        }
        if (this.b.h() && J.W.field_1724.method_6115()) {
            return;
        }
        block0: for (class_1657 class_16572 : dev.idhammai.P.A.Y.N.c(this.Q.e())) {
            class_243 class_2432 = this.k.e() > 0.0 ? dev.idhammai.P.A.A.p.g(class_16572, this.k.V()) : class_16572.method_19538();
            int n2 = 0;
            if (this.g.h() && this.Q(new k(class_2432.method_10216(), class_2432.method_10214(), class_2432.method_10215()))) {
                ++n2;
            }
            if (this.H.h()) {
                this.Q(new k(class_2432.method_10216(), class_2432.method_10214() - 0.8, class_2432.method_10215()));
            }
            ArrayList<k> arrayList = new ArrayList<k>();
            for (float f2 : new float[]{0.0f, this.p.Z(), -this.p.Z()}) {
                for (float f3 : new float[]{0.0f, this.p.Z(), -this.p.Z()}) {
                    for (float f4 : new float[]{0.0f, 1.0f, -1.0f}) {
                        k k2 = new k(class_2432.method_10216() + (double)f2, class_2432.method_10214() + (double)f4, class_2432.method_10215() + (double)f3);
                        if (arrayList.contains((Object)k2)) continue;
                        arrayList.add(k2);
                        if (!this.U(k2, class_16572) || J.W.field_1687.method_8320((class_2338)k2).method_26204() != class_2246.field_10343 || Frog.BREAK.X(k2)) continue;
                        ++n2;
                    }
                }
            }
            if ((float)n2 >= this.h.Z() && !s) continue;
            boolean bl = false;
            if (this.a.h()) {
                block4: for (float f5 : new float[]{0.0f, this.p.Z(), -this.p.Z()}) {
                    for (float f6 : new float[]{0.0f, this.p.Z(), -this.p.Z()}) {
                        k k3 = new k(class_2432.method_10216() + (double)f5, class_2432.method_10214(), class_2432.method_10215() + (double)f6);
                        if (!this.U(k3, class_16572) || !this.Q(k3) || !((float)(++n2) >= this.h.Z())) continue;
                        bl = true;
                        break block4;
                    }
                }
            }
            if (bl || !this.X.h()) continue;
            for (float f7 : new float[]{0.0f, this.p.Z(), -this.p.Z()}) {
                for (float f8 : new float[]{0.0f, this.p.Z(), -this.p.Z()}) {
                    k k4 = new k(class_2432.method_10216() + (double)f7, class_2432.method_10214() + 1.1, class_2432.method_10215() + (double)f8);
                    if (this.U(k4, class_16572) && this.Q(k4) && (float)(++n2) >= this.h.Z()) continue block0;
                }
            }
        }
    }

    private boolean U(class_2338 class_23382, class_1657 class_16572) {
        return new class_238(class_23382).method_994(class_16572.method_5829());
    }

    private boolean Q(class_2338 class_23382) {
        if (this.C.contains(class_23382)) {
            return false;
        }
        this.C.add(class_23382);
        if (this.Z >= this.w.V()) {
            return false;
        }
        if (this.D() == -1) {
            return false;
        }
        if (this.c.h() && Frog.BREAK.X(class_23382)) {
            return false;
        }
        if (M.H(class_23382, this.A.e()) != null && (J.W.field_1687.method_22347(class_23382) || s && M.x(class_23382) == class_2246.field_10343) && class_23382.method_10264() < 320) {
            int n2 = J.W.field_1724.method_31548().field_7545;
            int n3 = this.D();
            if (!this.K(class_23382, this.r.h(), n3)) {
                return false;
            }
            M.V.add(class_23382);
            ++this.Z;
            if (this.u.h()) {
                this.e(n3);
                e.t();
            } else {
                this.e(n2);
            }
            I = false;
            this.G.H();
            return true;
        }
        return false;
    }

    public boolean K(class_2338 class_23382, boolean bl, int n2) {
        class_2350 class_23502 = M.x(class_23382);
        if (class_23502 == null) {
            if (M.q()) {
                return this.C(class_23382, class_2350.field_11033, bl, n2);
            }
            return false;
        }
        return this.C(class_23382.method_10093(class_23502), class_23502.method_10153(), bl, n2);
    }

    public boolean C(class_2338 class_23382, class_2350 class_23502, boolean bl, int n2) {
        class_243 class_2432 = new class_243((double)class_23382.method_10263() + 0.5 + (double)class_23502.method_10163().method_10263() * 0.5, (double)class_23382.method_10264() + 0.5 + (double)class_23502.method_10163().method_10264() * 0.5, (double)class_23382.method_10260() + 0.5 + (double)class_23502.method_10163().method_10260() * 0.5);
        if (bl && !this.k(class_2432)) {
            return false;
        }
        this.e(n2);
        e.g(class_1268.field_5808, x.y.H.X());
        class_3965 class_39652 = new class_3965(class_2432, class_23502, class_23382, false);
        dev.idhammai.c.r.y.n(arg_0 -> J.lambda$clickBlock$23(class_39652, arg_0));
        if (bl && !this.S()) {
            Frog.ROTATION.M();
        }
        return true;
    }

    private boolean k(class_243 class_2432) {
        if (!this.S()) {
            Frog.ROTATION.a(class_2432);
            return true;
        }
        this.d = class_2432;
        if (Frog.ROTATION.k(class_2432, this.m.Z())) {
            return true;
        }
        return !this.y.h();
    }

    private void e(int n2) {
        if (this.u.h()) {
            dev.idhammai.P.A.L.g.z(n2, J.W.field_1724.method_31548().field_7545);
        } else {
            dev.idhammai.P.A.L.g.j(n2);
        }
    }

    private int D() {
        if (this.u.h()) {
            return dev.idhammai.P.A.L.g.H(class_2246.field_10343);
        }
        return dev.idhammai.P.A.L.g.L(class_2246.field_10343);
    }

    private static class_2596 lambda$clickBlock$23(class_3965 class_39652, int n2) {
        return new class_2885(class_1268.field_5808, class_39652, n2);
    }

    private boolean lambda$new$22() {
        return this.r.f() && this.U.f() && this.K.X() == dev.idhammai.c.r.q.A.h.Rotate;
    }

    private boolean lambda$new$21() {
        return this.r.f() && this.U.f() && this.y.h() && this.K.X() == dev.idhammai.c.r.q.A.h.Rotate;
    }

    private boolean lambda$new$20() {
        return this.r.f() && this.U.f() && this.K.X() == dev.idhammai.c.r.q.A.h.Rotate;
    }

    private boolean lambda$new$19() {
        return this.r.f() && this.U.f() && this.K.X() == dev.idhammai.c.r.q.A.h.Rotate;
    }

    private boolean lambda$new$18() {
        return this.r.f() && this.U.f() && this.K.X() == dev.idhammai.c.r.q.A.h.Rotate;
    }

    private boolean lambda$new$17() {
        return this.r.f() && this.K.X() == dev.idhammai.c.r.q.A.h.Rotate;
    }

    private boolean lambda$new$16() {
        return this.K.X() == dev.idhammai.c.r.q.A.h.Rotate;
    }

    private boolean lambda$new$15() {
        return this.K.X() == dev.idhammai.c.r.q.A.h.General;
    }

    private boolean lambda$new$14() {
        return this.K.X() == dev.idhammai.c.r.q.A.h.General;
    }

    private boolean lambda$new$13() {
        return this.K.X() == dev.idhammai.c.r.q.A.h.General;
    }

    private boolean lambda$new$12() {
        return this.K.X() == dev.idhammai.c.r.q.A.h.General;
    }

    private boolean lambda$new$11() {
        return this.K.X() == dev.idhammai.c.r.q.A.h.General;
    }

    private boolean lambda$new$10() {
        return this.K.X() == dev.idhammai.c.r.q.A.h.General;
    }

    private boolean lambda$new$9() {
        return this.K.X() == dev.idhammai.c.r.q.A.h.General;
    }

    private boolean lambda$new$8() {
        return this.K.X() == dev.idhammai.c.r.q.A.h.General;
    }

    private boolean lambda$new$7() {
        return this.K.X() == dev.idhammai.c.r.q.A.h.General;
    }

    private boolean lambda$new$6() {
        return this.K.X() == dev.idhammai.c.r.q.A.h.General;
    }

    private boolean lambda$new$5() {
        return this.K.X() == dev.idhammai.c.r.q.A.h.General;
    }

    private boolean lambda$new$4() {
        return this.K.X() == dev.idhammai.c.r.q.A.h.General;
    }

    private boolean lambda$new$3() {
        return this.K.X() == dev.idhammai.c.r.q.A.h.General;
    }

    private boolean lambda$new$2() {
        return this.K.X() == dev.idhammai.c.r.q.A.h.General;
    }

    private boolean lambda$new$1() {
        return this.K.X() == dev.idhammai.c.r.q.A.h.General;
    }

    private boolean lambda$new$0() {
        return this.K.X() == dev.idhammai.c.r.q.A.h.General;
    }

    static {
        I = false;
        s = false;
    }
}

