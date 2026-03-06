/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.ExperienceOrbEntity
 *  net.minecraft.entity.decoration.EndCrystalEntity
 *  net.minecraft.entity.ItemEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.entity.projectile.ArrowEntity
 *  net.minecraft.entity.projectile.thrown.ExperienceBottleEntity
 *  net.minecraft.block.Blocks
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket$PositionAndOnGround
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket$LookAndOnGround
 *  net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket
 *  net.minecraft.sound.SoundEvents
 *  net.minecraft.sound.SoundCategory
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.hit.BlockHitResult
 */
package dev.idhammai.c.r.q.A;

import dev.idhammai.Frog;
import dev.idhammai.P.A.A.h;
import dev.idhammai.P.A.L.e;
import dev.idhammai.P.A.L.g;
import dev.idhammai.P.A.Y.N;
import dev.idhammai.P.A.l.M;
import dev.idhammai.P.A.l.k;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.v;
import dev.idhammai.c.r.O.Y.B;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.q.A.E;
import dev.idhammai.c.r.q.N.x;
import dev.idhammai.c.r.q.Q.W;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import dev.idhammai.p.J.G;
import dev.idhammai.p.J.S;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.util.Hand;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ExperienceOrbEntity;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.projectile.thrown.ExperienceBottleEntity;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket;
import net.minecraft.sound.SoundEvents;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.hit.BlockHitResult;

public class T
extends y {
    public static T U;
    private final B<dev.idhammai.c.r.q.A.w> s = this.S(new B<dev.idhammai.c.r.q.A.w>("RotateMode", dev.idhammai.c.r.q.A.w.Bypass).I("\u8f6c\u5411\u6a21\u5f0f").X(dev.idhammai.c.r.q.A.w.Bypass, "\u7ed5\u8fc7").X(dev.idhammai.c.r.q.A.w.Normal, "\u666e\u901a").X(dev.idhammai.c.r.q.A.w.None, "\u65e0"));
    private final B<E> c = this.S(new B<E>("LagMode", E.TrollHack).I("\u56de\u5f39\u6a21\u5f0f").X(E.Smart, "\u667a\u80fd").X(E.Invalid, "\u65e0\u6548\u5305").X(E.TrollHack, "TrollHack").X(E.ToVoid, "\u865a\u7a7a").X(E.ToVoid2, "\u865a\u7a7a2").X(E.Normal, "\u666e\u901a").X(E.Rotation, "\u65cb\u8f6c").X(E.Fly, "\u98de\u884c").X(E.Glide, "\u6ed1\u7fd4"));
    private final B<E> w = this.S(new B<E>("MoveLagMode", E.Smart).I("\u4e0a\u65b9\u56de\u5f39").X(E.Smart, "\u667a\u80fd").X(E.Invalid, "\u65e0\u6548\u5305").X(E.TrollHack, "TrollHack").X(E.ToVoid, "\u865a\u7a7a").X(E.ToVoid2, "\u865a\u7a7a2").X(E.Normal, "\u666e\u901a").X(E.Rotation, "\u65cb\u8f6c").X(E.Fly, "\u98de\u884c").X(E.Glide, "\u6ed1\u7fd4"));
    private final List<class_2338> L = new ArrayList<class_2338>();
    private final h A = new h();
    private final h Z = new h();
    private final dev.idhammai.c.r.O.Y.W N = this.S(new dev.idhammai.c.r.O.Y.W("Disable", true).k("\u653e\u7f6e\u540e\u5173\u95ed"));
    private final dev.idhammai.c.r.O.Y.W p = this.S(new dev.idhammai.c.r.O.Y.W("JumpDisable", true, this::lambda$new$0).k("\u8df3\u8dc3\u5173\u95ed"));
    private final l Y = this.p(new l("Delay", 500, 0, 1000, this::lambda$new$1).D("\u89e6\u53d1\u5ef6\u8fdf"));
    private final l H = this.p(new l("WebTime", 0, 0, 500).D("\u86db\u7f51\u7b49\u5f85"));
    private final dev.idhammai.c.r.O.Y.W d = this.S(new dev.idhammai.c.r.O.Y.W("EnderChest", true).k("\u672b\u5f71\u7bb1\u66ff\u4ee3"));
    private final dev.idhammai.c.r.O.Y.W K = this.S(new dev.idhammai.c.r.O.Y.W("AntiLag", false).k("\u9632\u5361\u811a\u4e0b"));
    private final dev.idhammai.c.r.O.Y.W y = this.S(new dev.idhammai.c.r.O.Y.W("SingleBlock", false).k("\u5355\u65b9\u5757"));
    private final dev.idhammai.c.r.O.Y.W G = this.S(new dev.idhammai.c.r.O.Y.W("DetectMining", false).k("\u68c0\u6d4b\u6316\u6398"));
    private final dev.idhammai.c.r.O.Y.W M = this.S(new dev.idhammai.c.r.O.Y.W("HeadFill", false).k("\u5934\u9876\u586b\u5145"));
    private final dev.idhammai.c.r.O.Y.W m = this.S(new dev.idhammai.c.r.O.Y.W("UsingPause", false).k("\u4f7f\u7528\u6682\u505c"));
    private final dev.idhammai.c.r.O.Y.W a = this.S(new dev.idhammai.c.r.O.Y.W("Down", true).k("\u4e0b\u65b9\u8865\u4f4d"));
    private final dev.idhammai.c.r.O.Y.W n = this.S(new dev.idhammai.c.r.O.Y.W("NoSelfPos", false).k("\u4e0d\u653e\u81ea\u8eab"));
    private final dev.idhammai.c.r.O.Y.W V = this.S(new dev.idhammai.c.r.O.Y.W("PacketPlace", true).k("\u53d1\u5305\u653e\u7f6e"));
    private final dev.idhammai.c.r.O.Y.W X = this.S(new dev.idhammai.c.r.O.Y.W("Sound", true).k("\u653e\u7f6e\u97f3\u6548"));
    private final l t = this.p(new l("BlocksPer", 4.0, 1.0, 4.0, 1.0).D("\u6bcftick\u65b9\u5757"));
    private final dev.idhammai.c.r.O.Y.W f = this.S(new dev.idhammai.c.r.O.Y.W("Break", true).k("\u6253\u6c34\u6676"));
    private final dev.idhammai.c.r.O.Y.W J = this.S(new dev.idhammai.c.r.O.Y.W("Wait", true, this.N::h).k("\u7b49\u5f85\u53ef\u653e"));
    private final dev.idhammai.c.r.O.Y.W j = this.S(new dev.idhammai.c.r.O.Y.W("FakeMove", true).k("\u5047\u4f4d\u79fb").D());
    private final dev.idhammai.c.r.O.Y.W k = this.S(new dev.idhammai.c.r.O.Y.W("AllowCenter", true, this.j::f).k("\u5141\u8bb8\u5c45\u4e2d"));
    private final l F = this.p(new l("PreCorrect", 0.25, 0.0, 1.0, 0.001, this.j::f).D("\u9884\u4fee\u6b63"));
    private final l R = this.p(new l("MoveDis", 0.25, 0.0, 1.0, 0.001, this.j::f).D("\u4f4d\u79fb\u6b65\u957f1"));
    private final l u = this.p(new l("MoveDis2", 0.25, 0.0, 1.0, 0.001, this.j::f).D("\u4f4d\u79fb\u6b65\u957f2"));
    private final l I = this.p(new l("Correct", 0.25, 0.0, 1.0, 0.001, this.j::f).D("\u672b\u6bb5\u4fee\u6b63"));
    private final l B = this.p(new l("YOffset", 0.01, 0.0, 1.0, 0.001, this.j::f).D("Y\u504f\u79fb"));
    private final dev.idhammai.c.r.O.Y.W C = this.S(new dev.idhammai.c.r.O.Y.W("InventorySwap", true).k("\u80cc\u5305\u5207\u6362"));
    private final l e = this.p(new l("SmartXZ", 3.0, 0.0, 10.0, 0.1, this::lambda$new$2).D("\u667a\u80fdXZ"));
    private final l D = this.p(new l("SmartUp", 3.0, 0.0, 10.0, 0.1, this::lambda$new$3).D("\u667a\u80fd\u4e0a\u9650"));
    private final l l = this.p(new l("SmartDown", 3.0, 0.0, 10.0, 0.1, this::lambda$new$4).D("\u667a\u80fd\u4e0b\u9650"));
    private final l h = this.p(new l("SmartDistance", 2.0, 0.0, 10.0, 0.1, this::lambda$new$5).D("\u667a\u80fd\u6700\u5c0f\u8ddd\u79bb"));
    private int r = 0;
    private class_243 Q;

    public T() {
        super("Burrow", dev.idhammai.c.r.w.Combat);
        this.L("\u5361\u9ed1\u66dc\u77f3");
        U = this;
    }

    @r
    public void v(v v2) {
        if (this.C.h() && !dev.idhammai.P.A.L.e.n()) {
            return;
        }
        if (v2.C()) {
            Object object;
            boolean bl;
            boolean bl2;
            if (!this.N.h() && this.p.h() && T.W.field_1724.field_3913.field_3904) {
                this.p();
                return;
            }
            if (Frog.PLAYER.n((class_1657)T.W.field_1724)) {
                this.Z.H();
                return;
            }
            if (this.m.h() && T.W.field_1724.method_6115()) {
                return;
            }
            if (!this.Z.S(this.H.e())) {
                return;
            }
            if (!this.N.h() && !this.A.S(this.Y.e())) {
                return;
            }
            if (!T.W.field_1724.method_24828()) {
                return;
            }
            if (this.K.h() && !dev.idhammai.P.A.l.M.d((class_1297)T.W.field_1724, new class_238(dev.idhammai.P.A.L.e.H(true).method_10074()))) {
                return;
            }
            if (this.y.h() && dev.idhammai.P.A.L.e.j()) {
                if (this.N.h()) {
                    this.p();
                }
                return;
            }
            if (W.b.p() && W.b.m.h()) {
                return;
            }
            int n2 = T.W.field_1724.method_31548().field_7545;
            int n3 = this.L();
            if (n3 == -1) {
                dev.idhammai.p.J.S.u("\u00a74No block found.", this.hashCode() - 1);
                this.p();
                return;
            }
            this.r = 0;
            this.L.clear();
            double d2 = this.y.h() ? 0.0 : x.o();
            k k2 = new k(T.W.field_1724.method_23317() + d2, T.W.field_1724.method_23318() + 0.5, T.W.field_1724.method_23321() + d2);
            k k3 = new k(T.W.field_1724.method_23317() - d2, T.W.field_1724.method_23318() + 0.5, T.W.field_1724.method_23321() + d2);
            k k4 = new k(T.W.field_1724.method_23317() + d2, T.W.field_1724.method_23318() + 0.5, T.W.field_1724.method_23321() - d2);
            k k5 = new k(T.W.field_1724.method_23317() - d2, T.W.field_1724.method_23318() + 0.5, T.W.field_1724.method_23321() - d2);
            k k6 = new k(T.W.field_1724.method_23317() + d2, T.W.field_1724.method_23318() + 1.5, T.W.field_1724.method_23321() + d2);
            k k7 = new k(T.W.field_1724.method_23317() - d2, T.W.field_1724.method_23318() + 1.5, T.W.field_1724.method_23321() + d2);
            k k8 = new k(T.W.field_1724.method_23317() + d2, T.W.field_1724.method_23318() + 1.5, T.W.field_1724.method_23321() - d2);
            k k9 = new k(T.W.field_1724.method_23317() - d2, T.W.field_1724.method_23318() + 1.5, T.W.field_1724.method_23321() - d2);
            k k10 = new k(T.W.field_1724.method_23317() + d2, T.W.field_1724.method_23318() - 1.0, T.W.field_1724.method_23321() + d2);
            k k11 = new k(T.W.field_1724.method_23317() - d2, T.W.field_1724.method_23318() - 1.0, T.W.field_1724.method_23321() + d2);
            k k12 = new k(T.W.field_1724.method_23317() + d2, T.W.field_1724.method_23318() - 1.0, T.W.field_1724.method_23321() - d2);
            k k13 = new k(T.W.field_1724.method_23317() - d2, T.W.field_1724.method_23318() - 1.0, T.W.field_1724.method_23321() - d2);
            class_2338 class_23382 = dev.idhammai.P.A.L.e.H(true);
            boolean bl3 = false;
            if (!(this.E(k2) || this.E(k3) || this.E(k4) || this.E(k5))) {
                boolean bl4 = !this.M.h() || !this.E(k6) && !this.E(k7) && !this.E(k8) && !this.E(k9);
                bl2 = !this.a.h() || !this.E(k10) && !this.E(k11) && !this.E(k12) && !this.E(k13);
                bl = bl2;
                if (bl4) {
                    if (bl2) {
                        if (!this.J.h() && this.N.h()) {
                            this.p();
                        }
                        return;
                    }
                } else {
                    bl3 = true;
                }
            }
            bl2 = false;
            class_2338 class_23383 = dev.idhammai.P.A.L.e.H(true).method_10086(2);
            bl = this.s.X() == dev.idhammai.c.r.q.A.w.Normal;
            dev.idhammai.P.A.Y.N.r(k2, bl, false);
            dev.idhammai.P.A.Y.N.r(k3, bl, false);
            dev.idhammai.P.A.Y.N.r(k4, bl, false);
            dev.idhammai.P.A.Y.N.r(k5, bl, false);
            if (bl3 || T.W.field_1724.method_20448() || this.I(class_23383) || this.I(class_23383.method_10069(1, 0, 0)) || this.I(class_23383.method_10069(-1, 0, 0)) || this.I(class_23383.method_10069(0, 0, 1)) || this.I(class_23383.method_10069(0, 0, -1)) || this.I(class_23383.method_10069(1, 0, -1)) || this.I(class_23383.method_10069(-1, 0, -1)) || this.I(class_23383.method_10069(1, 0, 1)) || this.I(class_23383.method_10069(-1, 0, 1))) {
                bl2 = true;
                if (!this.j.h()) {
                    if (!this.J.h() && this.N.h()) {
                        this.p();
                    }
                    return;
                }
                if (!this.Q()) {
                    return;
                }
            } else {
                W.method_1562().method_52787((class_2596)new class_2828.class_2829(T.W.field_1724.method_23317(), T.W.field_1724.method_23318() + 0.4199999868869781, T.W.field_1724.method_23321(), false));
                W.method_1562().method_52787((class_2596)new class_2828.class_2829(T.W.field_1724.method_23317(), T.W.field_1724.method_23318() + 0.7531999805212017, T.W.field_1724.method_23321(), false));
                W.method_1562().method_52787((class_2596)new class_2828.class_2829(T.W.field_1724.method_23317(), T.W.field_1724.method_23318() + 0.9999957640154541, T.W.field_1724.method_23321(), false));
                W.method_1562().method_52787((class_2596)new class_2828.class_2829(T.W.field_1724.method_23317(), T.W.field_1724.method_23318() + 1.1661092609382138, T.W.field_1724.method_23321(), false));
                this.Q = new class_243(T.W.field_1724.method_23317(), T.W.field_1724.method_23318() + 1.1661092609382138, T.W.field_1724.method_23321());
            }
            this.A.H();
            this.t(n3);
            if (this.s.X() == dev.idhammai.c.r.q.A.w.Bypass) {
                if (bl2) {
                    object = dev.idhammai.p.J.G.b(this.Q.method_1031(0.0, (double)T.W.field_1724.method_18381(T.W.field_1724.method_18376()), 0.0), T.W.field_1724.method_19538());
                    Frog.ROTATION.o(object[0], object[1]);
                } else {
                    Frog.ROTATION.o(Frog.ROTATION.Q, 90.0f);
                }
            }
            this.K(class_23382, bl);
            this.K(k2, bl);
            this.K(k3, bl);
            this.K(k4, bl);
            this.K(k5, bl);
            if (this.a.h()) {
                this.K(k10, bl);
                this.K(k11, bl);
                this.K(k12, bl);
                this.K(k13, bl);
            }
            if (this.M.h() && bl2) {
                this.K(k6, bl);
                this.K(k7, bl);
                this.K(k8, bl);
                this.K(k9, bl);
            }
            if (this.C.h()) {
                this.t(n3);
                dev.idhammai.P.A.L.e.t();
            } else {
                this.t(n2);
            }
            switch ((bl2 ? this.w.X() : this.c.X()).ordinal()) {
                case 0: {
                    double d3;
                    object = new ArrayList();
                    for (d3 = T.W.field_1724.method_19538().method_10216() - this.e.e(); d3 < T.W.field_1724.method_19538().method_10216() + this.e.e(); d3 += 1.0) {
                        for (double d4 = T.W.field_1724.method_19538().method_10215() - this.e.e(); d4 < T.W.field_1724.method_19538().method_10215() + this.e.e(); d4 += 1.0) {
                            for (double d5 = T.W.field_1724.method_19538().method_10214() - this.l.e(); d5 < T.W.field_1724.method_19538().method_10214() + this.D.e(); d5 += 1.0) {
                                ((ArrayList)object).add(new k(d3, d5, d4));
                            }
                        }
                    }
                    d3 = 0.0;
                    class_2338 class_23384 = null;
                    Iterator iterator = ((ArrayList)object).iterator();
                    while (iterator.hasNext()) {
                        class_2338 class_23385 = (class_2338)iterator.next();
                        if (!this.Q(class_23385) || (double)class_3532.method_15355((float)((float)T.W.field_1724.method_5707(class_23385.method_46558().method_1031(0.0, -0.5, 0.0)))) < this.h.e() || class_23384 != null && !(T.W.field_1724.method_5707(class_23385.method_46558()) < d3)) continue;
                        class_23384 = class_23385;
                        d3 = T.W.field_1724.method_5707(class_23385.method_46558());
                    }
                    if (class_23384 == null) break;
                    W.method_1562().method_52787((class_2596)new class_2828.class_2829((double)class_23384.method_10263() + 0.5, (double)class_23384.method_10264(), (double)class_23384.method_10260() + 0.5, false));
                    break;
                }
                case 1: {
                    for (int i2 = 0; i2 < 20; ++i2) {
                        W.method_1562().method_52787((class_2596)new class_2828.class_2829(T.W.field_1724.method_23317(), T.W.field_1724.method_23318() + 1337.0, T.W.field_1724.method_23321(), false));
                    }
                    break;
                }
                case 7: {
                    W.method_1562().method_52787((class_2596)new class_2828.class_2829(T.W.field_1724.method_23317(), T.W.field_1724.method_23318() + 1.16610926093821, T.W.field_1724.method_23321(), false));
                    W.method_1562().method_52787((class_2596)new class_2828.class_2829(T.W.field_1724.method_23317(), T.W.field_1724.method_23318() + 1.170005801788139, T.W.field_1724.method_23321(), false));
                    W.method_1562().method_52787((class_2596)new class_2828.class_2829(T.W.field_1724.method_23317(), T.W.field_1724.method_23318() + 1.2426308013947485, T.W.field_1724.method_23321(), false));
                    W.method_1562().method_52787((class_2596)new class_2828.class_2829(T.W.field_1724.method_23317(), T.W.field_1724.method_23318() + 2.3400880035762786, T.W.field_1724.method_23321(), false));
                    W.method_1562().method_52787((class_2596)new class_2828.class_2829(T.W.field_1724.method_23317(), T.W.field_1724.method_23318() + 2.640088003576279, T.W.field_1724.method_23321(), false));
                    break;
                }
                case 8: {
                    W.method_1562().method_52787((class_2596)new class_2828.class_2829(T.W.field_1724.method_23317(), T.W.field_1724.method_23318() + 1.1001, T.W.field_1724.method_23321(), false));
                    W.method_1562().method_52787((class_2596)new class_2828.class_2829(T.W.field_1724.method_23317(), T.W.field_1724.method_23318() + 1.0605, T.W.field_1724.method_23321(), false));
                    W.method_1562().method_52787((class_2596)new class_2828.class_2829(T.W.field_1724.method_23317(), T.W.field_1724.method_23318() + 1.0802, T.W.field_1724.method_23321(), false));
                    W.method_1562().method_52787((class_2596)new class_2828.class_2829(T.W.field_1724.method_23317(), T.W.field_1724.method_23318() + 1.1127, T.W.field_1724.method_23321(), false));
                    break;
                }
                case 2: {
                    W.method_1562().method_52787((class_2596)new class_2828.class_2829(T.W.field_1724.method_23317(), T.W.field_1724.method_23318() + 2.3400880035762786, T.W.field_1724.method_23321(), false));
                    break;
                }
                case 5: {
                    W.method_1562().method_52787((class_2596)new class_2828.class_2829(T.W.field_1724.method_23317(), T.W.field_1724.method_23318() + 1.9, T.W.field_1724.method_23321(), false));
                    break;
                }
                case 3: {
                    W.method_1562().method_52787((class_2596)new class_2828.class_2829(T.W.field_1724.method_23317(), -70.0, T.W.field_1724.method_23321(), false));
                    break;
                }
                case 4: {
                    W.method_1562().method_52787((class_2596)new class_2828.class_2829(T.W.field_1724.method_23317(), -7.0, T.W.field_1724.method_23321(), false));
                    break;
                }
                case 6: {
                    W.method_1562().method_52787((class_2596)new class_2828.class_2831(-180.0f, -90.0f, false));
                    W.method_1562().method_52787((class_2596)new class_2828.class_2831(180.0f, 90.0f, false));
                }
            }
            if (this.N.h()) {
                this.p();
            }
        }
    }

    private boolean Q() {
        double[] dArray = new double[]{1.0, 0.0, -1.0};
        ArrayList<k> arrayList = new ArrayList<k>();
        class_2338 class_23382 = T.W.field_1724.method_24515();
        for (double d2 : dArray) {
            for (double d3 : dArray) {
                arrayList.add(new k(T.W.field_1724.method_23317() + d2, T.W.field_1724.method_23318(), T.W.field_1724.method_23321() + d3));
            }
        }
        Object object = arrayList.iterator();
        while (object.hasNext()) {
            class_2338 class_23383 = (class_2338)object.next();
            if (!this.X(class_23383) || dev.idhammai.P.A.l.M.c(class_23383) || this.M.h() && dev.idhammai.P.A.l.M.c(class_23383.method_10084())) continue;
            this.F(class_23383);
            return true;
        }
        ArrayList<class_2338> arrayList2 = new ArrayList<class_2338>();
        for (class_2338 class_23384 : arrayList) {
            if (class_23382.equals((Object)class_23384) || !this.X(class_23384) || !this.Q(class_23384)) continue;
            arrayList2.add(class_23384);
        }
        if (!arrayList2.isEmpty()) {
            double d4 = 10.0;
            class_2338 class_23385 = null;
            Object object2 = arrayList2.iterator();
            while (object2.hasNext()) {
                class_2338 class_23386 = (class_2338)object2.next();
                double d5 = T.W.field_1724.method_19538().method_1022(class_23386.method_46558().method_1031(0.0, -0.5, 0.0));
                if (!(d5 < d4) && class_23385 != null) continue;
                class_23385 = class_23386;
                d4 = d5;
            }
            this.F(class_23385);
            return true;
        }
        for (class_2338 class_23387 : arrayList) {
            if (class_23382.equals((Object)class_23387) || !this.X(class_23387)) continue;
            arrayList2.add(class_23387);
        }
        if (!arrayList2.isEmpty()) {
            double d6 = 10.0;
            class_2338 class_23388 = null;
            for (class_2338 class_23389 : arrayList2) {
                double d7 = T.W.field_1724.method_19538().method_1022(class_23389.method_46558().method_1031(0.0, -0.5, 0.0));
                if (!(d7 < d6) && class_23388 != null) continue;
                class_23388 = class_23389;
                d6 = d7;
            }
            this.F(class_23388);
            return true;
        }
        if (!this.k.h()) {
            return false;
        }
        arrayList.clear();
        arrayList.add(new k(T.W.field_1724.method_23317() + 1.0, T.W.field_1724.method_23318(), T.W.field_1724.method_23321()));
        arrayList.add(new k(T.W.field_1724.method_23317() - 1.0, T.W.field_1724.method_23318(), T.W.field_1724.method_23321()));
        arrayList.add(new k(T.W.field_1724.method_23317(), T.W.field_1724.method_23318(), T.W.field_1724.method_23321() - 1.0));
        arrayList.add(new k(T.W.field_1724.method_23317(), T.W.field_1724.method_23318(), T.W.field_1724.method_23321() + 1.0));
        for (class_2338 class_233810 : arrayList) {
            if (!this.Q(class_233810)) continue;
            this.F(class_233810);
            return true;
        }
        if (!this.J.h() && this.N.h()) {
            this.p();
        }
        return false;
    }

    private void K(class_2338 class_23382, boolean bl) {
        if (this.E(class_23382) && !this.L.contains(class_23382) && this.r < this.t.V()) {
            class_2350 class_23502;
            this.L.add(class_23382);
            if (dev.idhammai.P.A.l.M.q()) {
                ++this.r;
                dev.idhammai.P.A.l.M.V.add(class_23382);
                if (this.X.h()) {
                    T.W.field_1687.method_8396((class_1657)T.W.field_1724, class_23382, class_3417.field_14574, class_3419.field_15245, 1.0f, 0.8f);
                }
                this.I(class_23382, class_2350.field_11033, bl, class_1268.field_5808, this.V.h());
            }
            if ((class_23502 = dev.idhammai.P.A.l.M.x(class_23382)) == null) {
                return;
            }
            ++this.r;
            dev.idhammai.P.A.l.M.V.add(class_23382);
            if (this.X.h()) {
                T.W.field_1687.method_8396((class_1657)T.W.field_1724, class_23382, class_3417.field_14574, class_3419.field_15245, 1.0f, 0.8f);
            }
            this.I(class_23382.method_10093(class_23502), class_23502.method_10153(), bl, class_1268.field_5808, this.V.h());
        }
    }

    public void I(class_2338 class_23382, class_2350 class_23502, boolean bl, class_1268 class_12682, boolean bl2) {
        Object object;
        class_243 class_2432 = new class_243((double)class_23382.method_10263() + 0.5 + (double)class_23502.method_10163().method_10263() * 0.5, (double)class_23382.method_10264() + 0.5 + (double)class_23502.method_10163().method_10264() * 0.5, (double)class_23382.method_10260() + 0.5 + (double)class_23502.method_10163().method_10260() * 0.5);
        if (bl) {
            object = dev.idhammai.p.J.G.b(this.Q.method_1031(0.0, (double)T.W.field_1724.method_18381(T.W.field_1724.method_18376()), 0.0), class_2432);
            Frog.ROTATION.o((float)object[0], (float)object[1]);
        }
        dev.idhammai.P.A.L.e.g(class_12682, x.y.H.X());
        object = new class_3965(class_2432, class_23502, class_23382, false);
        if (bl2) {
            dev.idhammai.c.r.y.n(arg_0 -> T.lambda$clickBlock$6(class_12682, (class_3965)object, arg_0));
        } else {
            T.W.field_1761.method_2896(T.W.field_1724, class_12682, object);
        }
        if (bl) {
            Frog.ROTATION.M();
        }
    }

    private void t(int n2) {
        if (this.C.h()) {
            g.z(n2, T.W.field_1724.method_31548().field_7545);
        } else {
            g.j(n2);
        }
    }

    private void F(class_2338 class_23382) {
        double d2;
        double d3;
        double d4 = (double)class_23382.method_10263() + 0.5;
        double d5 = (double)class_23382.method_10260() + 0.5;
        double d6 = T.W.field_1724.method_23317();
        double d7 = T.W.field_1724.method_23321();
        double d8 = T.W.field_1724.method_23318() + this.B.e();
        double d9 = Math.abs(d6 - d4);
        double d10 = Math.abs(d7 - d5);
        double d11 = this.F.e();
        if (d11 > 0.0) {
            if (d9 >= d11) {
                d6 = d6 > d4 ? (d6 = d6 - d11) : (d6 = d6 + d11);
                T.W.field_1724.field_3944.method_52787((class_2596)new class_2828.class_2829(d6, d8, d7, false));
            }
            if (d10 >= d11) {
                d7 = d7 > d5 ? (d7 = d7 - d11) : (d7 = d7 + d11);
                T.W.field_1724.field_3944.method_52787((class_2596)new class_2828.class_2829(d6, d8, d7, false));
            }
        }
        d9 = Math.abs(d6 - d4);
        d10 = Math.abs(d7 - d5);
        d11 = this.R.e();
        if (d11 > 0.0) {
            while (d9 > d11) {
                d6 = d6 > d4 ? (d6 = d6 - d11) : (d6 = d6 + d11);
                T.W.field_1724.field_3944.method_52787((class_2596)new class_2828.class_2829(d6, d8, d7, false));
                d9 = Math.abs(d6 - d4);
            }
            while (d10 > d11) {
                d7 = d7 > d5 ? (d7 = d7 - d11) : (d7 = d7 + d11);
                T.W.field_1724.field_3944.method_52787((class_2596)new class_2828.class_2829(d6, d8, d7, false));
                d10 = Math.abs(d7 - d5);
            }
        }
        d11 = this.u.e();
        if (d3 > 0.0) {
            while (d9 > d11) {
                d6 = d6 > d4 ? (d6 = d6 - d11) : (d6 = d6 + d11);
                T.W.field_1724.field_3944.method_52787((class_2596)new class_2828.class_2829(d6, d8, d7, false));
                d9 = Math.abs(d6 - d4);
            }
            while (d10 > d11) {
                d7 = d7 > d5 ? (d7 = d7 - d11) : (d7 = d7 + d11);
                T.W.field_1724.field_3944.method_52787((class_2596)new class_2828.class_2829(d6, d8, d7, false));
                d10 = Math.abs(d7 - d5);
            }
        }
        d11 = this.I.e();
        if (d2 > 0.0) {
            if (d9 >= d11) {
                d6 = d6 > d4 ? (d6 = d6 - d11) : (d6 = d6 + d11);
                T.W.field_1724.field_3944.method_52787((class_2596)new class_2828.class_2829(d6, d8, d7, false));
            }
            if (d10 >= d11) {
                d7 = d7 > d5 ? (d7 = d7 - d11) : (d7 = d7 + d11);
                T.W.field_1724.field_3944.method_52787((class_2596)new class_2828.class_2829(d6, d8, d7, false));
            }
        }
        this.Q = new class_243(d6, d8, d7);
    }

    private boolean Q(class_2338 class_23382) {
        return T.W.field_1687.method_22347(class_23382) && T.W.field_1687.method_22347(class_23382.method_10084());
    }

    private boolean E(class_2338 class_23382) {
        if (this.n.h() && class_23382.equals((Object)dev.idhammai.P.A.L.e.H(true))) {
            return false;
        }
        if (!dev.idhammai.P.A.l.M.q() && dev.idhammai.P.A.l.M.x(class_23382) == null) {
            return false;
        }
        if (!dev.idhammai.P.A.l.M.c(class_23382)) {
            return false;
        }
        if (this.G.h() && Frog.BREAK.X(class_23382)) {
            return false;
        }
        return !this.g(class_23382);
    }

    private boolean g(class_2338 class_23382) {
        for (class_1297 class_12972 : dev.idhammai.P.A.l.M.c(new class_238(class_23382))) {
            if (class_12972 == T.W.field_1724 || !class_12972.method_5805() || class_12972 instanceof class_1542 || class_12972 instanceof class_1303 || class_12972 instanceof class_1683 || class_12972 instanceof class_1667 || class_12972 instanceof class_1511 && this.f.h()) continue;
            return true;
        }
        return false;
    }

    private boolean X(class_2338 class_23382) {
        return T.W.field_1724.method_5829().method_994(new class_238(class_23382));
    }

    private boolean I(class_2338 class_23382) {
        return (dev.idhammai.P.A.l.M.d((class_1297)T.W.field_1724, new class_238(class_23382)) || dev.idhammai.P.A.l.M.x(class_23382) == class_2246.field_10343) && this.X(class_23382.method_10087(2));
    }

    private int L() {
        if (this.C.h()) {
            if (g.H(class_2246.field_10540) != -1 || !this.d.h()) {
                return g.H(class_2246.field_10540);
            }
            return g.H(class_2246.field_10443);
        }
        if (g.L(class_2246.field_10540) != -1 || !this.d.h()) {
            return g.L(class_2246.field_10540);
        }
        return g.L(class_2246.field_10443);
    }

    private static class_2596 lambda$clickBlock$6(class_1268 class_12682, class_3965 class_39652, int n2) {
        return new class_2885(class_12682, class_39652, n2);
    }

    private boolean lambda$new$5() {
        return this.c.X() == E.Smart || this.w.X() == E.Smart;
    }

    private boolean lambda$new$4() {
        return this.c.X() == E.Smart || this.w.X() == E.Smart;
    }

    private boolean lambda$new$3() {
        return this.c.X() == E.Smart || this.w.X() == E.Smart;
    }

    private boolean lambda$new$2() {
        return this.c.X() == E.Smart || this.w.X() == E.Smart;
    }

    private boolean lambda$new$1() {
        return !this.N.h();
    }

    private boolean lambda$new$0() {
        return !this.N.h();
    }
}

