/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.ExperienceOrbEntity
 *  net.minecraft.entity.decoration.ItemFrameEntity
 *  net.minecraft.entity.ItemEntity
 *  net.minecraft.entity.projectile.ArrowEntity
 *  net.minecraft.entity.projectile.thrown.ExperienceBottleEntity
 *  net.minecraft.item.Items
 *  net.minecraft.block.Blocks
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket
 *  net.minecraft.block.ScaffoldingBlock
 */
package dev.idhammai.c.r.q.A;

import dev.idhammai.Frog;
import dev.idhammai.P.A.A.A;
import dev.idhammai.P.A.A.h;
import dev.idhammai.P.A.L.e;
import dev.idhammai.P.A.L.g;
import dev.idhammai.P.A.Y.N;
import dev.idhammai.P.A.l.M;
import dev.idhammai.P.A.l.k;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.q.A.Y;
import dev.idhammai.c.r.q.N.x;
import dev.idhammai.c.r.q.Q.W;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import net.minecraft.util.Hand;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ExperienceOrbEntity;
import net.minecraft.entity.decoration.ItemFrameEntity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.projectile.thrown.ExperienceBottleEntity;
import net.minecraft.item.Items;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;
import net.minecraft.block.ScaffoldingBlock;

public class Z
extends y {
    private final l a = this.p(new l("PlaceRange", 4, 0, 8).D("\u653e\u7f6e\u8303\u56f4"));
    private final dev.idhammai.c.r.O.Y.W M = this.S(new dev.idhammai.c.r.O.Y.W("Ladder", true).k("\u68af\u5b50").D());
    private final dev.idhammai.c.r.O.Y.W V = this.S(new dev.idhammai.c.r.O.Y.W("OnlyHard", true, this.M::f).k("\u4ec5\u786c\u65b9\u5757"));
    private final dev.idhammai.c.r.O.Y.W B = this.S(new dev.idhammai.c.r.O.Y.W("ItemFrame", true).k("\u5c55\u793a\u6846").D());
    private final dev.idhammai.c.r.O.Y.W t = this.S(new dev.idhammai.c.r.O.Y.W("Fill", false, this.B::f).k("\u586b\u5145"));
    private final dev.idhammai.c.r.O.Y.W Y = this.S(new dev.idhammai.c.r.O.Y.W("Scaffolding", true).k("\u811a\u624b\u67b6"));
    private final dev.idhammai.c.r.O.Y.W U = this.S(new dev.idhammai.c.r.O.Y.W("Rotate", true).k("\u8f6c\u5411"));
    private final dev.idhammai.c.r.O.Y.W h = this.S(new dev.idhammai.c.r.O.Y.W("EatingPause", true).k("\u8fdb\u98df\u6682\u505c"));
    private final dev.idhammai.c.r.O.Y.W u = this.S(new dev.idhammai.c.r.O.Y.W("CollideSkip", true).k("\u78b0\u649e\u8df3\u8fc7"));
    private final dev.idhammai.c.r.O.Y.W l = this.S(new dev.idhammai.c.r.O.Y.W("CrawlingSkip", true).k("\u8db4\u4e0b\u8df3\u8fc7"));
    private final dev.idhammai.c.r.O.Y.W k = this.S(new dev.idhammai.c.r.O.Y.W("InAirSkip", false).k("\u7a7a\u4e2d\u8df3\u8fc7"));
    private final l J = this.p(new l("TargetRange", 5.0, 0.0, 7.0, 0.1).D("\u76ee\u6807\u8303\u56f4"));
    private final l d = this.p(new l("Delay", 100.0, 0.0, 2000.0, 1.0).D("\u95f4\u9694"));
    private final dev.idhammai.c.r.O.Y.W N = this.S(new dev.idhammai.c.r.O.Y.W("InventorySwap", true).k("\u80cc\u5305\u5207\u6362"));
    private final h Z = new h();

    public Z() {
        super("AntiPhase", w.Combat);
        this.L("\u53cd\u7a7f\u5899");
    }

    @r
    public void y(QO qO) {
        if (this.h.h() && dev.idhammai.c.r.q.A.Z.W.field_1724.method_6115()) {
            return;
        }
        if (W.b.p() && W.b.m.h()) {
            return;
        }
        for (class_1297 class_12972 : dev.idhammai.P.A.Y.N.c(this.J.e())) {
            class_2350 class_23502;
            class_243 class_2432;
            class_2350 class_23503;
            class_1533 class_15332;
            class_2338 class_23382;
            int n2;
            if (this.l.h() && class_12972.method_20448() || this.k.h() && !class_12972.method_24828() || this.u.h() && dev.idhammai.P.A.l.M.d(class_12972, class_12972.method_5829()) || !this.Z.m(this.d.V())) continue;
            if (this.Y.h() && dev.idhammai.P.A.l.M.c(class_12972.method_24515()) && (n2 = this.f()) != -1) {
                class_23382 = class_12972.method_24515();
                class_15332 = null;
                class_23503 = dev.idhammai.P.A.l.M.H(class_23382, 6.0);
                if (class_23503 != null || (class_15332 = this.i(class_23382.method_10074())) != null && dev.idhammai.P.A.l.M.x(class_23382.method_10074()) instanceof class_3736 && !dev.idhammai.c.r.q.A.Z.W.field_1724.method_5715() || dev.idhammai.c.r.q.A.Z.W.field_1724.method_5715() && (class_15332 = this.I(class_23382.method_10074())) != null && dev.idhammai.P.A.l.M.x(class_23382.method_10074()) instanceof class_3736) {
                    class_2432 = class_23503 != null ? class_23382.method_10093(class_23503).method_46558().method_1031((double)class_23503.method_10153().method_10163().method_10263() * 0.5, (double)class_23503.method_10153().method_10163().method_10264() * 0.5, (double)class_23503.method_10153().method_10163().method_10260() * 0.5) : class_23382.method_10074().method_46558().method_1031((double)class_15332.method_10163().method_10263() * 0.5, (double)class_15332.method_10163().method_10264() * 0.5, (double)class_15332.method_10163().method_10260() * 0.5);
                    double d2 = dev.idhammai.c.r.q.A.Z.W.field_1724.method_33571().method_1022(class_2432);
                    if (d2 <= this.a.e()) {
                        int n3 = dev.idhammai.c.r.q.A.Z.W.field_1724.method_31548().field_7545;
                        this.g(n2);
                        if (dev.idhammai.P.A.l.M.x(class_23382.method_10074()) instanceof class_3736 && class_15332 != null) {
                            dev.idhammai.P.A.l.M.T(class_23382.method_10074(), (class_2350)class_15332, this.U.h());
                        } else {
                            dev.idhammai.P.A.l.M.i(class_23382, this.U.h());
                        }
                        this.Z.H();
                        if (this.N.h()) {
                            this.g(n2);
                            e.t();
                        } else {
                            this.g(n3);
                        }
                    }
                }
            }
            if (this.B.h() && dev.idhammai.c.r.q.A.Z.W.field_1687.method_22347(class_12972.method_24515())) {
                int n4;
                class_15332 = this.Y(new class_238(class_12972.method_24515()));
                if (class_15332 == null && (n4 = this.M()) != -1) {
                    class_23503 = class_12972.method_24515().method_10074();
                    double d3 = dev.idhammai.c.r.q.A.Z.W.field_1724.method_33571().method_1022(class_23503.method_61082().method_1031(0.0, 1.0, 0.0));
                    if (d3 <= this.a.e() && dev.idhammai.P.A.l.M.t((class_2338)class_23503, class_2350.field_11036) && !dev.idhammai.P.A.l.M.c((class_2338)class_23503) && dev.idhammai.P.A.l.M.M((class_2338)class_23503)) {
                        int n5 = dev.idhammai.c.r.q.A.Z.W.field_1724.method_31548().field_7545;
                        this.g(n4);
                        dev.idhammai.P.A.l.M.T((class_2338)class_23503, class_2350.field_11036, this.U.h());
                        this.Z.H();
                        if (this.N.h()) {
                            this.g(n4);
                            e.t();
                        } else {
                            this.g(n5);
                        }
                    }
                }
                if (this.t.h() && class_15332 != null && class_15332.method_6940().method_7960()) {
                    int n6;
                    class_2432 = A.r(dev.idhammai.c.r.q.A.Z.W.field_1724.method_33571(), class_15332.method_5829());
                    if (dev.idhammai.c.r.q.A.Z.W.field_1724.method_33571().method_1022(class_2432) <= x.y.k.e() && (n6 = this.E()) != -1) {
                        int n7 = dev.idhammai.c.r.q.A.Z.W.field_1724.method_31548().field_7545;
                        this.g(n6);
                        if (this.U.h()) {
                            Frog.ROTATION.G(class_2432);
                        }
                        dev.idhammai.c.r.q.A.Z.W.field_1724.field_3944.method_52787((class_2596)class_2824.method_34207((class_1297)class_15332, (boolean)dev.idhammai.c.r.q.A.Z.W.field_1724.method_5715(), (class_1268)class_1268.field_5808));
                        this.Z.H();
                        if (this.N.h()) {
                            this.g(n6);
                            e.t();
                        } else {
                            this.g(n7);
                        }
                        if (this.U.h()) {
                            Frog.ROTATION.M();
                        }
                    }
                }
            }
            if (!this.M.h() || (n2 = this.l()) == -1 || !dev.idhammai.P.A.l.M.c(class_12972.method_24515()) || (class_23502 = this.m(class_12972.method_19538())) == null) continue;
            class_23382 = class_12972.method_24515().method_10093(class_23502);
            double d4 = dev.idhammai.c.r.q.A.Z.W.field_1724.method_33571().method_1022(class_23382.method_46558().method_1031((double)class_23502.method_10153().method_10163().method_10263() * 0.5, (double)class_23502.method_10153().method_10163().method_10264() * 0.5, (double)class_23502.method_10153().method_10163().method_10260() * 0.5));
            if (!(d4 <= this.a.e())) continue;
            dev.idhammai.P.A.l.M.V.add(class_12972.method_24515());
            int n8 = dev.idhammai.c.r.q.A.Z.W.field_1724.method_31548().field_7545;
            this.g(n2);
            dev.idhammai.P.A.l.M.T(class_23382, class_23502.method_10153(), this.U.h());
            this.Z.H();
            if (this.N.h()) {
                this.g(n2);
                e.t();
                continue;
            }
            this.g(n8);
        }
    }

    private class_2350 I(class_2338 class_23382) {
        if (dev.idhammai.P.A.l.M.t(class_23382, class_2350.field_11036)) {
            return class_2350.field_11036;
        }
        return null;
    }

    private class_2350 i(class_2338 class_23382) {
        for (class_2350 class_23502 : class_2350.values()) {
            if (class_23502 == class_2350.field_11036 || !dev.idhammai.P.A.l.M.t(class_23382, class_23502)) continue;
            return class_23502;
        }
        return null;
    }

    private class_1533 Y(class_238 class_2383) {
        for (class_1297 class_12972 : dev.idhammai.P.A.l.M.c(class_2383)) {
            if (!(class_12972 instanceof class_1533)) continue;
            class_1533 class_15332 = (class_1533)class_12972;
            if (class_12972.method_58149() != class_2350.field_11036) continue;
            return class_15332;
        }
        return null;
    }

    private static class_238 c(class_2350 class_23502, class_2338 class_23382) {
        class_238 class_2383 = null;
        double d2 = 0.1875;
        double d3 = (double)class_23502.method_10148() * 0.5 + (double)class_23382.method_10263() + 0.5;
        double d4 = class_23382.method_10264();
        double d5 = (double)class_23502.method_10165() * 0.5 + (double)class_23382.method_10260() + 0.5;
        switch (dev.idhammai.c.r.q.A.Y.N[class_23502.ordinal()]) {
            case 1: {
                class_2383 = new class_238(d3, d4, d5, d3 + d2, d4 + 1.0, d5 + 1.0);
                break;
            }
            case 2: {
                class_2383 = new class_238(d3, d4, d5, d3 - d2, d4 + 1.0, d5 + 1.0);
                break;
            }
            case 3: {
                class_2383 = new class_238(d3, d4, d5, d3 + 1.0, d4 + 1.0, d5 + d2);
                break;
            }
            case 4: {
                class_2383 = new class_238(d3, d4, d5, d3 + 1.0, d4 + 1.0, d5 - d2);
            }
        }
        return class_2383;
    }

    private void g(int n2) {
        if (this.N.h()) {
            g.z(n2, dev.idhammai.c.r.q.A.Z.W.field_1724.method_31548().field_7545);
        } else {
            g.j(n2);
        }
    }

    private int u() {
        if (this.N.h()) {
            return g.a(class_1802.field_8884);
        }
        return g.E(class_1802.field_8884);
    }

    private int E() {
        if (this.N.h()) {
            return g.a(class_1802.field_8281);
        }
        return g.E(class_1802.field_8281);
    }

    private int M() {
        if (this.N.h()) {
            return g.a(class_1802.field_8143);
        }
        return g.E(class_1802.field_8143);
    }

    private int l() {
        if (this.N.h()) {
            return g.H(class_2246.field_9983);
        }
        return g.L(class_2246.field_9983);
    }

    private int f() {
        if (this.N.h()) {
            return g.H(class_2246.field_16492);
        }
        return g.L(class_2246.field_16492);
    }

    private class_2350 m(class_243 class_2432) {
        k k2 = new k(class_2432);
        class_243 class_2433 = k2.method_61082();
        float f2 = 0.4f;
        double d2 = Double.MAX_VALUE;
        class_2350 class_23502 = null;
        for (class_2350 class_23503 : class_2350.values()) {
            class_243 class_2434;
            double d3;
            class_2338 class_23382;
            if (class_23503 == class_2350.field_11036 || class_23503 == class_2350.field_11033 || !dev.idhammai.P.A.l.M.t(class_23382 = k2.method_10093(class_23503), class_23503.method_10153()) || (this.V.h() ? !Frog.HOLE.O(class_23382) : dev.idhammai.P.A.l.M.c(class_23382) || !dev.idhammai.P.A.l.M.M(class_23382))) continue;
            class_238 class_2383 = dev.idhammai.c.r.q.A.Z.c(class_23503, k2);
            if (class_2383 == null || dev.idhammai.c.r.q.A.Z.U(class_2383) || !((d3 = (class_2434 = class_2433.method_1031((double)((float)class_23503.method_10148() * f2), 0.0, (double)((float)class_23503.method_10165() * f2))).method_1022(class_2432)) < d2)) continue;
            d2 = d3;
            class_23502 = class_23503;
        }
        return class_23502;
    }

    public static boolean U(class_238 class_2383) {
        for (class_1297 class_12972 : dev.idhammai.P.A.l.M.c(class_2383)) {
            if (!class_12972.method_5805() || class_12972 instanceof class_1542 || class_12972 instanceof class_1303 || class_12972 instanceof class_1683 || class_12972 instanceof class_1667 || class_12972 instanceof class_1533) continue;
            return true;
        }
        return false;
    }
}

