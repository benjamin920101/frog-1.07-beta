/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.mob.MobEntity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.passive.AnimalEntity
 *  net.minecraft.entity.mob.SlimeEntity
 *  net.minecraft.entity.passive.VillagerEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket$InteractType
 *  net.minecraft.network.packet.c2s.play.HandSwingC2SPacket
 *  net.minecraft.entity.passive.WanderingTraderEntity
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.entity.attribute.EntityAttributes
 */
package dev.idhammai.c.r.q.A;

import dev.idhammai.Frog;
import dev.idhammai.P.A.A.h;
import dev.idhammai.P.A.L.e;
import dev.idhammai.P.A.S.K;
import dev.idhammai.P.A.S.f;
import dev.idhammai.P.A.S.k;
import dev.idhammai.P.A.Y.N;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.J;
import dev.idhammai.P.r.c.v;
import dev.idhammai.asm.accessors.IEntity;
import dev.idhammai.asm.accessors.ILivingEntity;
import dev.idhammai.c.r.O.Y.A;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.O.p.S;
import dev.idhammai.c.r.O.p.T;
import dev.idhammai.c.r.q.A.B;
import dev.idhammai.c.r.q.A.I;
import dev.idhammai.c.r.q.A.X;
import dev.idhammai.c.r.q.A.g;
import dev.idhammai.c.r.q.A.o;
import dev.idhammai.c.r.q.D.Q;
import dev.idhammai.c.r.q.Q.W;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import java.awt.Color;
import net.minecraft.util.Hand;
import net.minecraft.entity.Entity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.mob.SlimeEntity;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;
import net.minecraft.network.packet.c2s.play.HandSwingC2SPacket;
import net.minecraft.entity.passive.WanderingTraderEntity;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.attribute.EntityAttributes;

public class R
extends y {
    public static R T;
    public static class_1297 g;
    public final dev.idhammai.c.r.O.Y.B<B> D = this.S(new dev.idhammai.c.r.O.Y.B<B>("Page", dev.idhammai.c.r.q.A.B.General).I("\u9875\u9762").X(dev.idhammai.c.r.q.A.B.General, "\u5e38\u89c4").X(dev.idhammai.c.r.q.A.B.Target, "\u76ee\u6807").X(dev.idhammai.c.r.q.A.B.Render, "\u6e32\u67d3").X(dev.idhammai.c.r.q.A.B.Rotate, "\u65cb\u8f6c"));
    public final l f = this.p(new l("Range", 6.0, (double)0.1f, 7.0, this::lambda$new$0).D("\u653b\u51fb\u8303\u56f4"));
    private final l Z = this.p(new l("TargetRange", 8.0, (double)0.1f, 14.0, this::lambda$new$1).D("\u7d22\u654c\u8303\u56f4"));
    private final dev.idhammai.c.r.O.Y.B<g> E = this.S(new dev.idhammai.c.r.O.Y.B<g>("CooldownMode", dev.idhammai.c.r.q.A.g.Delay, this::lambda$new$2).I("\u51b7\u5374\u6a21\u5f0f").X(dev.idhammai.c.r.q.A.g.Delay, "\u5ef6\u8fdf").X(dev.idhammai.c.r.q.A.g.Vanilla, "\u539f\u7248"));
    private final dev.idhammai.c.r.O.Y.W M = this.S(new dev.idhammai.c.r.O.Y.W("Reset", true, this::lambda$new$3).k("\u91cd\u7f6e\u51b7\u5374"));
    private final dev.idhammai.c.r.O.Y.B<S> h = this.S(new dev.idhammai.c.r.O.Y.B<S>("Swing", dev.idhammai.c.r.O.p.S.All, this::lambda$new$4).I("\u6325\u624b").X(dev.idhammai.c.r.O.p.S.All, "\u53cc\u624b").X(dev.idhammai.c.r.O.p.S.Client, "\u5ba2\u6237\u7aef").X(dev.idhammai.c.r.O.p.S.Server, "\u670d\u52a1\u7aef").X(dev.idhammai.c.r.O.p.S.None, "\u65e0"));
    private final l V = this.p(new l("HurtTime", 10.0, 0.0, 10.0, 1.0, this::lambda$new$5).D("\u53d7\u51fb\u65f6\u95f4"));
    private final l s = this.p(new l("Cooldown", 1.1f, 0.0, 1.2f, 0.01, this::lambda$new$6).D("\u51b7\u5374\u9608\u503c"));
    private final l B = this.p(new l("WallRange", 6.0, (double)0.1f, 7.0, this::lambda$new$7).D("\u9694\u5899\u8303\u56f4"));
    private final dev.idhammai.c.r.O.Y.W d = this.S(new dev.idhammai.c.r.O.Y.W("WhileUsing", true, this::lambda$new$8).k("\u4f7f\u7528\u65f6\u653b\u51fb"));
    private final dev.idhammai.c.r.O.Y.W p = this.S(new dev.idhammai.c.r.O.Y.W("WeaponOnly", true, this::lambda$new$9).k("\u4ec5\u6b66\u5668"));
    private final dev.idhammai.c.r.O.Y.B<T> a = this.S(new dev.idhammai.c.r.O.Y.B<T>("Timing", dev.idhammai.c.r.O.p.T.All, this::lambda$new$10).I("\u65f6\u673a").X(dev.idhammai.c.r.O.p.T.Pre, "\u524d").X(dev.idhammai.c.r.O.p.T.Post, "\u540e").X(dev.idhammai.c.r.O.p.T.All, "\u5168\u90e8"));
    private final dev.idhammai.c.r.O.Y.W Y = this.S(new dev.idhammai.c.r.O.Y.W("Players", true, this::lambda$new$11).k("\u73a9\u5bb6").D());
    private final dev.idhammai.c.r.O.Y.W L = this.S(new dev.idhammai.c.r.O.Y.W("ArmorLow", true, this::lambda$new$12).k("\u4f4e\u7532\u4f18\u5148"));
    private final dev.idhammai.c.r.O.Y.W K = this.S(new dev.idhammai.c.r.O.Y.W("Mobs", true, this::lambda$new$13).k("\u602a\u7269"));
    private final dev.idhammai.c.r.O.Y.W u = this.S(new dev.idhammai.c.r.O.Y.W("Animals", true, this::lambda$new$14).k("\u52a8\u7269"));
    private final dev.idhammai.c.r.O.Y.W e = this.S(new dev.idhammai.c.r.O.Y.W("Villagers", true, this::lambda$new$15).k("\u6751\u6c11"));
    private final dev.idhammai.c.r.O.Y.W j = this.S(new dev.idhammai.c.r.O.Y.W("Slimes", true, this::lambda$new$16).k("\u53f2\u83b1\u59c6"));
    private final dev.idhammai.c.r.O.Y.B<X> c = this.S(new dev.idhammai.c.r.O.Y.B<X>("Filter", dev.idhammai.c.r.q.A.X.DISTANCE, this::lambda$new$17).I("\u7b5b\u9009"));
    private final dev.idhammai.c.r.O.Y.B<o> R = this.S(new dev.idhammai.c.r.O.Y.B<o>("TargetESP", o.Fill, this::lambda$new$18).I("\u76ee\u6807\u7279\u6548").X(o.Fill, "\u586b\u5145").X(o.Box, "\u65b9\u6846").X(o.Jello, "\u679c\u51bb").X(o.ThunderHack, "\u96f7\u9706").X(o.None, "\u65e0"));
    private final l P = this.p(new l("AnimationTime", 200.0, 0.0, 2000.0, 1.0, this::lambda$new$19).D("\u52a8\u753b\u65f6\u95f4"));
    private final dev.idhammai.c.r.O.Y.B<dev.idhammai.P.A.A.S> m = this.S(new dev.idhammai.c.r.O.Y.B<dev.idhammai.P.A.A.S>("Ease", dev.idhammai.P.A.A.S.CubicInOut, this::lambda$new$20).I("\u7f13\u52a8"));
    private final A U = this.y(new A("Color", new Color(255, 255, 255, 50), this::lambda$new$21).P("\u989c\u8272"));
    private final A C = this.y(new A("OutlineColor", new Color(255, 255, 255, 50), this::lambda$new$22).P("\u63cf\u8fb9\u989c\u8272"));
    private final A r = this.y(new A("HitColor", new Color(255, 255, 255, 150), this::lambda$new$23).P("\u53d7\u51fb\u989c\u8272"));
    private final A G = this.y(new A("HitOutlineColor", new Color(255, 255, 255, 150), this::lambda$new$24).P("\u53d7\u51fb\u63cf\u8fb9"));
    private final dev.idhammai.P.A.A.k k = new dev.idhammai.P.A.A.k();
    private final dev.idhammai.c.r.O.Y.W A = this.S(new dev.idhammai.c.r.O.Y.W("Rotate", true, this::lambda$new$25).k("\u8f6c\u5411"));
    private final dev.idhammai.c.r.O.Y.W N = this.S(new dev.idhammai.c.r.O.Y.W("YawStep", false, this::lambda$new$26).k("\u504f\u822a\u6b65\u8fdb").D());
    private final dev.idhammai.c.r.O.Y.W n = this.S(new dev.idhammai.c.r.O.Y.W("FallFlying", true, this::lambda$new$27).k("\u9798\u7fc5\u65f6"));
    private final l w = this.p(new l("Steps", 0.05, 0.0, 1.0, 0.01, this::lambda$new$28).D("\u6b65\u8fdb\u5f3a\u5ea6"));
    private final dev.idhammai.c.r.O.Y.W J = this.S(new dev.idhammai.c.r.O.Y.W("OnlyLooking", true, this::lambda$new$29).k("\u4ec5\u770b\u5411"));
    private final l X = this.p(new l("Fov", 20.0, 0.0, 360.0, 0.1, this::lambda$new$30).D("\u89c6\u89d2"));
    private final l H = this.p(new l("Priority", 10, 0, 100, this::lambda$new$31).D("\u4f18\u5148\u7ea7"));
    private final h l = new h();
    public class_243 b = null;

    public R() {
        super("Aura", dev.idhammai.c.r.w.Combat);
        this.L("\u6740\u622e\u5149\u73af");
        T = this;
    }

    public static void L(class_4587 class_45872, float f2, class_1297 class_12972, Color color, Color color2, o o2) {
        switch (o2.ordinal()) {
            case 1: {
                dev.idhammai.P.A.S.K.W(class_45872, ((IEntity)class_12972).getDimensions().method_30757(new class_243(dev.idhammai.P.A.A.A.Z(class_12972.field_6038, class_12972.method_23317(), f2), dev.idhammai.P.A.A.A.Z(class_12972.field_5971, class_12972.method_23318(), f2), dev.idhammai.P.A.A.A.Z(class_12972.field_5989, class_12972.method_23321(), f2))).method_1009(0.0, 0.1, 0.0), color, color2, true, true);
                break;
            }
            case 0: {
                dev.idhammai.P.A.S.K.W(class_45872, ((IEntity)class_12972).getDimensions().method_30757(new class_243(dev.idhammai.P.A.A.A.Z(class_12972.field_6038, class_12972.method_23317(), f2), dev.idhammai.P.A.A.A.Z(class_12972.field_5971, class_12972.method_23318(), f2), dev.idhammai.P.A.A.A.Z(class_12972.field_5989, class_12972.method_23321(), f2))).method_1009(0.0, 0.1, 0.0), color, color2, false, true);
                break;
            }
            case 2: {
                dev.idhammai.P.A.S.k.Z(class_45872, class_12972, color);
                break;
            }
            case 3: {
                dev.idhammai.P.A.S.K.t(class_45872, g, color);
            }
        }
    }

    public static float S() {
        return (float)(1.0 / dev.idhammai.c.r.q.A.R.W.field_1724.method_45325(class_5134.field_23723) * 20.0);
    }

    @Override
    public void h(class_4587 class_45872) {
        if (g != null) {
            this.k(class_45872, W.method_60646().method_60637(true), g, this.R.X());
        }
    }

    public void k(class_4587 class_45872, float f2, class_1297 class_12972, o o2) {
        switch (o2.ordinal()) {
            case 1: {
                dev.idhammai.P.A.S.K.W(class_45872, ((IEntity)class_12972).getDimensions().method_30757(new class_243(dev.idhammai.P.A.A.A.Z(class_12972.field_6038, class_12972.method_23317(), f2), dev.idhammai.P.A.A.A.Z(class_12972.field_5971, class_12972.method_23318(), f2), dev.idhammai.P.A.A.A.Z(class_12972.field_5989, class_12972.method_23321(), f2))).method_1009(0.0, 0.1, 0.0), dev.idhammai.P.A.S.f.U(this.U.P(), this.r.P(), this.k.g(0.0, this.P.V(), this.m.X())), dev.idhammai.P.A.S.f.U(this.C.P(), this.G.P(), this.k.g(0.0, this.P.V(), this.m.X())), true, true);
                break;
            }
            case 0: {
                dev.idhammai.P.A.S.K.W(class_45872, ((IEntity)class_12972).getDimensions().method_30757(new class_243(dev.idhammai.P.A.A.A.Z(class_12972.field_6038, class_12972.method_23317(), f2), dev.idhammai.P.A.A.A.Z(class_12972.field_5971, class_12972.method_23318(), f2), dev.idhammai.P.A.A.A.Z(class_12972.field_5989, class_12972.method_23321(), f2))).method_1009(0.0, 0.1, 0.0), dev.idhammai.P.A.S.f.U(this.U.P(), this.r.P(), this.k.g(0.0, this.P.V(), this.m.X())), dev.idhammai.P.A.S.f.U(this.C.P(), this.G.P(), this.k.g(0.0, this.P.V(), this.m.X())), false, true);
                break;
            }
            case 2: {
                dev.idhammai.P.A.S.k.Z(class_45872, class_12972, this.U.P());
                break;
            }
            case 3: {
                dev.idhammai.P.A.S.K.t(class_45872, g, this.U.P());
            }
        }
    }

    @Override
    public String I() {
        return g == null ? null : g.method_5477().getString();
    }

    @r
    public void m(v v2) {
        if (dev.idhammai.c.r.q.A.R.M()) {
            return;
        }
        if (this.a.x(dev.idhammai.c.r.O.p.T.Pre) && v2.C() || this.a.x(dev.idhammai.c.r.O.p.T.Post) && v2.a()) {
            return;
        }
        if (this.p.h() && !dev.idhammai.P.A.L.e.G((class_1657)dev.idhammai.c.r.q.A.R.W.field_1724)) {
            g = null;
            return;
        }
        g = this.Z(this.f.Z());
        if (g == null) {
            g = this.Z(this.Z.Z());
            return;
        }
        this.s();
    }

    @r
    public void Y(dev.idhammai.P.r.c.W w2) {
        if (g != null && this.A.h() && this.y()) {
            this.b = this.b(g);
            w2.m(this.b, this.w.Z(), this.H.Z());
        }
    }

    @r
    public void H(J j2) {
        class_2596<?> class_25962;
        if (this.M.h() && ((class_25962 = j2.L()) instanceof class_2879 || class_25962 instanceof class_2824 && I.a((class_2824)class_25962) == class_2824.class_5907.field_29172)) {
            this.l.H();
        }
    }

    private boolean z() {
        if (W.b.p() && W.b.m.h()) {
            return false;
        }
        int n2 = (int)(this.l.k() / 50L);
        if (this.E.X() == dev.idhammai.c.r.q.A.g.Vanilla) {
            n2 = ((ILivingEntity)dev.idhammai.c.r.q.A.R.W.field_1724).getLastAttackedTicks();
        }
        if (!((double)Math.max((float)(n2 = (int)((float)n2 * Frog.SERVER.T())) / dev.idhammai.c.r.q.A.R.S(), 0.0f) >= this.s.e())) {
            return false;
        }
        class_1297 class_12972 = g;
        if (class_12972 instanceof class_1309) {
            class_1309 class_13092 = (class_1309)class_12972;
            if ((double)class_13092.field_6235 > this.V.e()) {
                return false;
            }
        }
        return this.d.h() || !dev.idhammai.c.r.q.A.R.W.field_1724.method_6115();
    }

    private void s() {
        class_243 class_2432;
        if (!this.z()) {
            return;
        }
        if (this.A.h() && !this.X(class_2432 = this.b(g))) {
            return;
        }
        this.k.h = 1.0;
        this.k.a = 1.0;
        W.method_1562().method_52787((class_2596)class_2824.method_34206((class_1297)g, (boolean)dev.idhammai.c.r.q.A.R.W.field_1724.method_5715()));
        dev.idhammai.c.r.q.A.R.W.field_1724.method_7350();
        dev.idhammai.P.A.L.e.g(class_1268.field_5808, this.h.X());
        this.l.H();
        if (this.A.h() && !this.y()) {
            Frog.ROTATION.M();
        }
    }

    private class_243 b(class_1297 class_12972) {
        return dev.idhammai.P.A.A.A.r(dev.idhammai.c.r.q.A.R.W.field_1724.method_33571(), class_12972.method_5829());
    }

    private boolean y() {
        if (!this.n.h() && (dev.idhammai.c.r.q.A.R.W.field_1724.method_6128() || Q.F.p() && Q.F.z())) {
            return false;
        }
        return this.N.h() && !dev.idhammai.c.r.q.D.f.V.f();
    }

    public boolean X(class_243 class_2432) {
        if (!this.y()) {
            Frog.ROTATION.a(class_2432);
            return true;
        }
        this.b = class_2432;
        if (Frog.ROTATION.k(class_2432, this.X.Z())) {
            return true;
        }
        return !this.J.h();
    }

    public class_1297 Z(double d2) {
        class_1297 class_12972 = null;
        double d3 = d2;
        double d4 = 36.0;
        for (class_1297 class_12973 : Frog.THREAD.z()) {
            if (!this.Y(class_12973)) continue;
            class_243 class_2432 = this.b(class_12973);
            if (dev.idhammai.c.r.q.A.R.W.field_1724.method_33571().method_1022(class_2432) > d2 || !dev.idhammai.c.r.q.A.R.W.field_1724.method_6057(class_12973) && dev.idhammai.c.r.q.A.R.W.field_1724.method_33571().method_1022(class_2432) > this.B.e() || !dev.idhammai.P.A.Y.N.D(class_12973)) continue;
            if (class_12972 == null) {
                class_12972 = class_12973;
                d3 = dev.idhammai.c.r.q.A.R.W.field_1724.method_33571().method_1022(class_2432);
                d4 = dev.idhammai.P.A.L.e.T(class_12973);
                continue;
            }
            if (this.L.h() && class_12973 instanceof class_1657 && dev.idhammai.P.A.L.e.s((class_1657)class_12973, 10)) {
                class_12972 = class_12973;
                break;
            }
            if (this.c.X() == dev.idhammai.c.r.q.A.X.HEALTH && (double)dev.idhammai.P.A.L.e.T(class_12973) < d4) {
                class_12972 = class_12973;
                d4 = dev.idhammai.P.A.L.e.T(class_12973);
                continue;
            }
            if (this.c.X() != dev.idhammai.c.r.q.A.X.DISTANCE || !(dev.idhammai.c.r.q.A.R.W.field_1724.method_33571().method_1022(class_2432) < d3)) continue;
            class_12972 = class_12973;
            d3 = dev.idhammai.c.r.q.A.R.W.field_1724.method_33571().method_1022(class_2432);
        }
        return class_12972;
    }

    private boolean Y(class_1297 class_12972) {
        if (class_12972 instanceof class_1621) {
            return this.j.h();
        }
        if (class_12972 instanceof class_1657) {
            return this.Y.h();
        }
        if (class_12972 instanceof class_1646 || class_12972 instanceof class_3989) {
            return this.e.h();
        }
        if (class_12972 instanceof class_1429) {
            return this.u.h();
        }
        if (class_12972 instanceof class_1308) {
            return this.K.h();
        }
        return false;
    }

    private boolean lambda$new$31() {
        return this.D.X() == dev.idhammai.c.r.q.A.B.Rotate && this.N.f();
    }

    private boolean lambda$new$30() {
        return this.J.h() && this.D.X() == dev.idhammai.c.r.q.A.B.Rotate && this.N.f();
    }

    private boolean lambda$new$29() {
        return this.D.X() == dev.idhammai.c.r.q.A.B.Rotate && this.N.f();
    }

    private boolean lambda$new$28() {
        return this.D.X() == dev.idhammai.c.r.q.A.B.Rotate && this.N.f();
    }

    private boolean lambda$new$27() {
        return this.A.f() && this.N.f() && this.D.X() == dev.idhammai.c.r.q.A.B.Rotate;
    }

    private boolean lambda$new$26() {
        return this.A.f() && this.D.X() == dev.idhammai.c.r.q.A.B.Rotate;
    }

    private boolean lambda$new$25() {
        return this.D.X() == dev.idhammai.c.r.q.A.B.Rotate;
    }

    private boolean lambda$new$24() {
        return this.D.X() == dev.idhammai.c.r.q.A.B.Render;
    }

    private boolean lambda$new$23() {
        return this.D.X() == dev.idhammai.c.r.q.A.B.Render;
    }

    private boolean lambda$new$22() {
        return this.D.X() == dev.idhammai.c.r.q.A.B.Render;
    }

    private boolean lambda$new$21() {
        return this.D.X() == dev.idhammai.c.r.q.A.B.Render;
    }

    private boolean lambda$new$20() {
        return this.D.X() == dev.idhammai.c.r.q.A.B.Render;
    }

    private boolean lambda$new$19() {
        return this.D.X() == dev.idhammai.c.r.q.A.B.Render;
    }

    private boolean lambda$new$18() {
        return this.D.X() == dev.idhammai.c.r.q.A.B.Render;
    }

    private boolean lambda$new$17() {
        return this.D.X() == dev.idhammai.c.r.q.A.B.Target;
    }

    private boolean lambda$new$16() {
        return this.D.X() == dev.idhammai.c.r.q.A.B.Target;
    }

    private boolean lambda$new$15() {
        return this.D.X() == dev.idhammai.c.r.q.A.B.Target;
    }

    private boolean lambda$new$14() {
        return this.D.X() == dev.idhammai.c.r.q.A.B.Target;
    }

    private boolean lambda$new$13() {
        return this.D.X() == dev.idhammai.c.r.q.A.B.Target;
    }

    private boolean lambda$new$12() {
        return this.D.X() == dev.idhammai.c.r.q.A.B.Target && this.Y.f();
    }

    private boolean lambda$new$11() {
        return this.D.X() == dev.idhammai.c.r.q.A.B.Target;
    }

    private boolean lambda$new$10() {
        return this.D.X() == dev.idhammai.c.r.q.A.B.General;
    }

    private boolean lambda$new$9() {
        return this.D.X() == dev.idhammai.c.r.q.A.B.General;
    }

    private boolean lambda$new$8() {
        return this.D.X() == dev.idhammai.c.r.q.A.B.General;
    }

    private boolean lambda$new$7() {
        return this.D.X() == dev.idhammai.c.r.q.A.B.General;
    }

    private boolean lambda$new$6() {
        return this.D.X() == dev.idhammai.c.r.q.A.B.General;
    }

    private boolean lambda$new$5() {
        return this.D.X() == dev.idhammai.c.r.q.A.B.General;
    }

    private boolean lambda$new$4() {
        return this.D.X() == dev.idhammai.c.r.q.A.B.General;
    }

    private boolean lambda$new$3() {
        return this.D.X() == dev.idhammai.c.r.q.A.B.General && this.E.x(dev.idhammai.c.r.q.A.g.Delay);
    }

    private boolean lambda$new$2() {
        return this.D.X() == dev.idhammai.c.r.q.A.B.General;
    }

    private boolean lambda$new$1() {
        return this.D.X() == dev.idhammai.c.r.q.A.B.General;
    }

    private boolean lambda$new$0() {
        return this.D.X() == dev.idhammai.c.r.q.A.B.General;
    }
}

