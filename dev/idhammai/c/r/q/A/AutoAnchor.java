/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.block.Blocks
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.util.hit.HitResult$Type
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket$Action
 *  net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket
 *  net.minecraft.world.RaycastContext
 *  net.minecraft.world.RaycastContext$FluidHandling
 *  net.minecraft.world.RaycastContext$ShapeType
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.client.util.math.MatrixStack
 */
package dev.idhammai.c.r.q.A;

import dev.idhammai.Frog;
import dev.idhammai.P.A.A.h;
import dev.idhammai.P.A.L.e;
import dev.idhammai.P.A.L.g;
import dev.idhammai.P.A.N.s;
import dev.idhammai.P.A.Y.N;
import dev.idhammai.P.A.l.M;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.v;
import dev.idhammai.c.r.O.Y.A;
import dev.idhammai.c.r.O.Y.B;
import dev.idhammai.c.r.O.p.S;
import dev.idhammai.c.r.O.p.T;
import dev.idhammai.c.r.q.A.R;
import dev.idhammai.c.r.q.A.i;
import dev.idhammai.c.r.q.A.l;
import dev.idhammai.c.r.q.A.o;
import dev.idhammai.c.r.q.A.y;
import dev.idhammai.c.r.q.D.Q;
import dev.idhammai.c.r.q.D.f;
import dev.idhammai.c.r.q.Q.W;
import dev.idhammai.c.r.q.i.Z;
import dev.idhammai.c.r.w;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.util.Hand;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket;
import net.minecraft.world.RaycastContext;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.client.util.math.MatrixStack;

public class O
extends dev.idhammai.c.r.y {
    public static O c;
    static class_243 d;
    static class_243 Gg;
    public final B<y> V = this.S(new B<y>("Page", dev.idhammai.c.r.q.A.y.General).I("\u9875\u9762").X(dev.idhammai.c.r.q.A.y.General, "\u5e38\u89c4").X(dev.idhammai.c.r.q.A.y.Interact, "\u4ea4\u4e92").X(dev.idhammai.c.r.q.A.y.Predict, "\u9884\u6d4b").X(dev.idhammai.c.r.q.A.y.Rotate, "\u65cb\u8f6c").X(dev.idhammai.c.r.q.A.y.Assist, "\u8f85\u52a9").X(dev.idhammai.c.r.q.A.y.Render, "\u6e32\u67d3"));
    public final dev.idhammai.c.r.O.Y.l j = this.p(new dev.idhammai.c.r.O.Y.l("Range", 5.0, 0.0, 6.0, 0.1, this::lambda$new$0).D("\u653e\u7f6e\u8303\u56f4").P("m"));
    public final dev.idhammai.c.r.O.Y.l l = this.p(new dev.idhammai.c.r.O.Y.l("TargetRange", 8.0, 0.1, 12.0, 0.1, this::lambda$new$1).D("\u76ee\u6807\u8303\u56f4").P("m"));
    public final dev.idhammai.c.r.O.Y.l GJ = this.p(new dev.idhammai.c.r.O.Y.l("Min", 4.0, 0.0, 36.0, 0.1, this::lambda$new$2).D("\u6700\u5c0f\u4f24\u5bb3").P("dmg"));
    public final dev.idhammai.c.r.O.Y.l GC = this.p(new dev.idhammai.c.r.O.Y.l("ExplosionMin", 4.0, 0.0, 36.0, 0.1, this::lambda$new$3).D("\u5f15\u7206\u6700\u4f4e\u4f24\u5bb3").P("dmg"));
    public final dev.idhammai.c.r.O.Y.l U = this.p(new dev.idhammai.c.r.O.Y.l("ForceHead", 7.0, 0.0, 36.0, 0.1, this::lambda$new$4).D("\u5f3a\u5236\u70b8\u5934").P("dmg"));
    private final dev.idhammai.c.r.O.Y.l t = this.p(new dev.idhammai.c.r.O.Y.l("SelfPredict", 4, 0, 10, this::lambda$new$5).D("\u81ea\u8eab\u9884\u6d4b").P("ticks"));
    private final dev.idhammai.c.r.O.Y.l Gq = this.p(new dev.idhammai.c.r.O.Y.l("Predict", 4, 0, 10, this::lambda$new$6).D("\u76ee\u6807\u9884\u6d4b").P("ticks"));
    private final dev.idhammai.c.r.O.Y.l Gt = this.p(new dev.idhammai.c.r.O.Y.l("Simulation", 5.0, 0.0, 20.0, 1.0, this::lambda$new$7).D("\u6a21\u62df\u65f6\u957f"));
    private final dev.idhammai.c.r.O.Y.l g = this.p(new dev.idhammai.c.r.O.Y.l("MaxMotionY", 0.34, 0.0, 2.0, 0.01, this::lambda$new$8).D("\u6700\u5927Y\u901f\u5ea6"));
    private final dev.idhammai.c.r.O.Y.W Z = this.S(new dev.idhammai.c.r.O.Y.W("Step", false, this::lambda$new$9).k("\u53f0\u9636"));
    private final dev.idhammai.c.r.O.Y.W GQ = this.S(new dev.idhammai.c.r.O.Y.W("DoubleStep", false, this::lambda$new$10).k("\u4e8c\u6bb5\u53f0\u9636"));
    private final dev.idhammai.c.r.O.Y.W Gv = this.S(new dev.idhammai.c.r.O.Y.W("Jump", false, this::lambda$new$11).k("\u8df3\u8dc3"));
    private final dev.idhammai.c.r.O.Y.W k = this.S(new dev.idhammai.c.r.O.Y.W("InBlockPause", true, this::lambda$new$12).k("\u5361\u65b9\u5757\u6682\u505c"));
    final ArrayList<class_2338> G0 = new ArrayList();
    private final dev.idhammai.c.r.O.Y.W C = this.S(new dev.idhammai.c.r.O.Y.W("Assist", true, this::lambda$new$13).k("\u8f85\u52a9\u653e\u7f6e"));
    private final dev.idhammai.c.r.O.Y.W r = this.S(new dev.idhammai.c.r.O.Y.W("Obsidian", true, this::lambda$new$14).k("\u9ed1\u66dc\u77f3\u8f85\u52a9"));
    private final dev.idhammai.c.r.O.Y.W b = this.S(new dev.idhammai.c.r.O.Y.W("DetectMining", false, this::lambda$new$15).k("\u68c0\u6d4b\u6316\u6398"));
    private final dev.idhammai.c.r.O.Y.l GH = this.p(new dev.idhammai.c.r.O.Y.l("AssistRange", 5.0, 0.0, 6.0, 0.1, this::lambda$new$16).D("\u8f85\u52a9\u8303\u56f4").P("m"));
    private final dev.idhammai.c.r.O.Y.l n = this.p(new dev.idhammai.c.r.O.Y.l("AssistDamage", 6.0, 0.0, 36.0, 0.1, this::lambda$new$17).D("\u8f85\u52a9\u4f24\u5bb3").P("h"));
    private final dev.idhammai.c.r.O.Y.l s = this.p(new dev.idhammai.c.r.O.Y.l("AssistDelay", 0.1, 0.0, 1.0, 0.01, this::lambda$new$18).D("\u8f85\u52a9\u5ef6\u8fdf").P("s"));
    private final dev.idhammai.c.r.O.Y.W GY = this.S(new dev.idhammai.c.r.O.Y.W("PreferCrystal", false, this::lambda$new$19).k("\u4f18\u5148\u6c34\u6676"));
    private final dev.idhammai.c.r.O.Y.W P = this.S(new dev.idhammai.c.r.O.Y.W("Thread", false, this::lambda$new$20).k("\u7ebf\u7a0b\u8ba1\u7b97"));
    private final dev.idhammai.c.r.O.Y.W f = this.S(new dev.idhammai.c.r.O.Y.W("LessCPU", true, this::lambda$new$21).k("\u4f4e\u5360\u7528"));
    private final dev.idhammai.c.r.O.Y.W D = this.S(new dev.idhammai.c.r.O.Y.W("InventorySwap", true, this::lambda$new$22).k("\u80cc\u5305\u5207\u6362"));
    private final dev.idhammai.c.r.O.Y.W Gm = this.S(new dev.idhammai.c.r.O.Y.W("BreakCrystal", true, this::lambda$new$23).k("\u6253\u6c34\u6676").D());
    private final dev.idhammai.c.r.O.Y.W GF = this.S(new dev.idhammai.c.r.O.Y.W("Spam", true, this::lambda$new$24).k("\u8fde\u70b8").D());
    private final dev.idhammai.c.r.O.Y.W K = this.S(new dev.idhammai.c.r.O.Y.W("OnlyMining", true, this::lambda$new$25).k("\u4ec5\u6316\u6398\u65f6"));
    private final dev.idhammai.c.r.O.Y.W G5 = this.S(new dev.idhammai.c.r.O.Y.W("Fast", true, this::lambda$new$26).k("\u5feb\u901f\u653e\u7f6e").D());
    private final dev.idhammai.c.r.O.Y.W Q = this.S(new dev.idhammai.c.r.O.Y.W("WhenSpamming", true, this::lambda$new$27).k("\u8fde\u70b8\u65f6"));
    private final dev.idhammai.c.r.O.Y.W m = this.S(new dev.idhammai.c.r.O.Y.W("UsingPause", true, this::lambda$new$28).k("\u4f7f\u7528\u6682\u505c"));
    private final B<S> X = this.S(new B<S>("Swing", dev.idhammai.c.r.O.p.S.All, this::lambda$new$29).I("\u6325\u624b").X(dev.idhammai.c.r.O.p.S.All, "\u53cc\u624b").X(dev.idhammai.c.r.O.p.S.Client, "\u5ba2\u6237\u7aef").X(dev.idhammai.c.r.O.p.S.Server, "\u670d\u52a1\u7aef").X(dev.idhammai.c.r.O.p.S.None, "\u65e0"));
    private final B<T> G3 = this.S(new B<T>("Timing", dev.idhammai.c.r.O.p.T.All, this::lambda$new$30).I("\u65f6\u673a").X(dev.idhammai.c.r.O.p.T.Pre, "\u524d").X(dev.idhammai.c.r.O.p.T.Post, "\u540e").X(dev.idhammai.c.r.O.p.T.All, "\u5168\u90e8"));
    private final dev.idhammai.c.r.O.Y.l E = this.p(new dev.idhammai.c.r.O.Y.l("PlaceDelay", 100.0, 0.0, 500.0, 1.0, this::lambda$new$31).D("\u653e\u7f6e\u5ef6\u8fdf").P("ms"));
    private final dev.idhammai.c.r.O.Y.l a = this.p(new dev.idhammai.c.r.O.Y.l("FillDelay", 100.0, 0.0, 500.0, 1.0, this::lambda$new$32).D("\u586b\u5145\u5ef6\u8fdf").P("ms"));
    private final dev.idhammai.c.r.O.Y.l h = this.p(new dev.idhammai.c.r.O.Y.l("BreakDelay", 100.0, 0.0, 500.0, 1.0, this::lambda$new$33).D("\u7834\u574f\u5ef6\u8fdf").P("ms"));
    private final dev.idhammai.c.r.O.Y.l Y = this.p(new dev.idhammai.c.r.O.Y.l("SpamDelay", 200.0, 0.0, 1000.0, 1.0, this::lambda$new$34).D("\u8fde\u70b8\u5ef6\u8fdf").P("ms"));
    private final dev.idhammai.c.r.O.Y.l Ge = this.p(new dev.idhammai.c.r.O.Y.l("UpdateDelay", 200.0, 0.0, 1000.0, 1.0, this::lambda$new$35).D("\u5237\u65b0\u5ef6\u8fdf").P("ms"));
    private final dev.idhammai.c.r.O.Y.W GE = this.S(new dev.idhammai.c.r.O.Y.W("Rotate", true, this::lambda$new$36).k("\u8f6c\u5411").D());
    private final dev.idhammai.c.r.O.Y.W N = this.S(new dev.idhammai.c.r.O.Y.W("YawStep", true, this::lambda$new$37).k("\u504f\u822a\u6b65\u8fdb").D());
    private final dev.idhammai.c.r.O.Y.W u = this.S(new dev.idhammai.c.r.O.Y.W("FallFlying", true, this::lambda$new$38).k("\u9798\u7fc5\u65f6"));
    private final dev.idhammai.c.r.O.Y.l A = this.p(new dev.idhammai.c.r.O.Y.l("Steps", 0.05, 0.0, 1.0, 0.01, this::lambda$new$39).D("\u6b65\u8fdb\u5f3a\u5ea6"));
    private final dev.idhammai.c.r.O.Y.W Gi = this.S(new dev.idhammai.c.r.O.Y.W("OnlyLooking", true, this::lambda$new$40).k("\u4ec5\u770b\u5411"));
    private final dev.idhammai.c.r.O.Y.l M = this.p(new dev.idhammai.c.r.O.Y.l("Fov", 20.0, 0.0, 360.0, 0.1, this::lambda$new$41).D("\u89c6\u89d2"));
    private final dev.idhammai.c.r.O.Y.l R = this.p(new dev.idhammai.c.r.O.Y.l("Priority", 10, 0, 100, this::lambda$new$42).D("\u4f18\u5148\u7ea7"));
    private final dev.idhammai.c.r.O.Y.W y = this.S(new dev.idhammai.c.r.O.Y.W("NoSuicide", true, this::lambda$new$43).k("\u9632\u81ea\u6740"));
    private final dev.idhammai.c.r.O.Y.W T = this.S(new dev.idhammai.c.r.O.Y.W("Smart", true, this::lambda$new$44).k("\u667a\u80fd"));
    private final dev.idhammai.c.r.O.Y.W H = this.S(new dev.idhammai.c.r.O.Y.W("TerrainIgnore", true, this::lambda$new$45).k("\u5730\u5f62\u5ffd\u7565"));
    private final dev.idhammai.c.r.O.Y.l J = this.p(new dev.idhammai.c.r.O.Y.l("Prefer", 7.0, 0.0, 36.0, 0.1, this::lambda$new$46).D("\u4f18\u5148\u4f24\u5bb3").P("dmg"));
    private final dev.idhammai.c.r.O.Y.l GK = this.p(new dev.idhammai.c.r.O.Y.l("MaxSelf", 8.0, 0.0, 36.0, 0.1, this::lambda$new$47).D("\u6700\u5927\u81ea\u4f24").P("dmg"));
    private final B<o> Gd = this.S(new B<o>("TargetESP", o.Jello, this::lambda$new$48).I("\u76ee\u6807\u7279\u6548").X(o.Fill, "\u586b\u5145").X(o.Box, "\u65b9\u6846").X(o.Jello, "\u679c\u51bb").X(o.ThunderHack, "\u96f7\u9706").X(o.None, "\u65e0"));
    private final A GU = this.y(new A("TargetColor", new Color(255, 255, 255, 250), this::lambda$new$49).P("\u76ee\u6807\u989c\u8272"));
    private final A G = this.y(new A("TargetOutlineColor", new Color(255, 255, 255, 250), this::lambda$new$50).P("\u76ee\u6807\u63cf\u8fb9"));
    private final dev.idhammai.c.r.O.Y.W Gs = this.S(new dev.idhammai.c.r.O.Y.W("Render", true, this::lambda$new$51).k("\u6e32\u67d3"));
    private final dev.idhammai.c.r.O.Y.W G2 = this.S(new dev.idhammai.c.r.O.Y.W("Shrink", true, this::lambda$new$52).k("\u6536\u7f29"));
    private final A Gl = this.y(new A("Box", new Color(255, 255, 255, 255), this::lambda$new$53).P("\u65b9\u6846").t(true));
    private final A B = this.y(new A("Fill", new Color(255, 255, 255, 100), this::lambda$new$54).P("\u586b\u5145").t(true));
    private final dev.idhammai.c.r.O.Y.l Gc = this.p(new dev.idhammai.c.r.O.Y.l("SliderSpeed", 0.2, 0.0, 1.0, 0.01, this::lambda$new$55).D("\u6ed1\u52a8\u901f\u5ea6"));
    private final dev.idhammai.c.r.O.Y.l GL = this.p(new dev.idhammai.c.r.O.Y.l("StartFade", 0.3, 0.0, 2.0, 0.01, this::lambda$new$56).D("\u5f00\u59cb\u6de1\u51fa").P("s"));
    private final dev.idhammai.c.r.O.Y.l GS = this.p(new dev.idhammai.c.r.O.Y.l("FadeSpeed", 0.2, 0.01, 1.0, 0.01, this::lambda$new$57).D("\u6de1\u51fa\u901f\u5ea6"));
    private final h F = new h();
    private final h p = new h();
    private final h Gh = new h();
    private final h e = new h();
    public class_243 L = null;
    public class_1657 GP;
    public class_2338 GD;
    public class_2338 GZ;
    public double I;
    double GR = 0.0;
    class_2338 w;

    public O() {
        super("AutoAnchor", dev.idhammai.c.r.w.Combat);
        this.L("\u91cd\u751f\u951a\u5149\u73af");
        c = this;
        Frog.EVENT_BUS.S(new l(this));
    }

    public static boolean a(class_243 class_2432, class_243 class_2433) {
        class_3965 class_39652 = O.W.field_1687.method_17742(new class_3959(class_2432, class_2433, class_3959.class_3960.field_17558, class_3959.class_242.field_1348, (class_1297)O.W.field_1724));
        return class_39652 == null || class_39652.method_17783() == class_239.class_240.field_1333;
    }

    @Override
    public String I() {
        if (this.GP != null && this.GD != null) {
            return this.GP.method_5477().getString();
        }
        return null;
    }

    @Override
    public void h(class_4587 class_45872) {
        if (this.GP != null && this.GD != null) {
            dev.idhammai.c.r.q.A.R.L(class_45872, W.method_60646().method_60637(true), (class_1297)this.GP, this.GU.P(), this.G.P(), this.Gd.X());
        }
    }

    @r
    public void E(dev.idhammai.P.r.c.W w2) {
        if (this.GD != null && this.GE.h() && this.U() && this.L != null) {
            w2.m(this.L, this.A.Z(), this.R.Z());
        }
    }

    @Override
    public void L() {
        this.GZ = null;
        this.GD = null;
    }

    public void f() {
        if (this.W() || O.M()) {
            return;
        }
        if (this.P.h()) {
            if (W.b.p() && W.b.m.h()) {
                this.GD = null;
                return;
            }
            if (i.X6.p() && i.X6.h != null && this.GY.h()) {
                this.GD = null;
                return;
            }
            int n2 = this.D.h() ? dev.idhammai.P.A.L.g.H(class_2246.field_23152) : dev.idhammai.P.A.L.g.L(class_2246.field_23152);
            int n3 = this.D.h() ? dev.idhammai.P.A.L.g.H(class_2246.field_10171) : dev.idhammai.P.A.L.g.L(class_2246.field_10171);
            int n4 = this.D.h() ? n2 : dev.idhammai.P.A.L.g.f();
            int n5 = n4;
            if (n2 == -1) {
                this.GD = null;
                return;
            }
            if (n3 == -1) {
                this.GD = null;
                return;
            }
            if (n4 == -1) {
                this.GD = null;
                return;
            }
            if (O.W.field_1724.method_5715()) {
                this.GD = null;
                return;
            }
            if (this.m.h() && O.W.field_1724.method_6115()) {
                this.GD = null;
                return;
            }
            this.g();
        }
    }

    private boolean U() {
        if (!this.u.h() && (O.W.field_1724.method_6128() || dev.idhammai.c.r.q.D.Q.F.p() && dev.idhammai.c.r.q.D.Q.F.z())) {
            return false;
        }
        return this.N.h() && !dev.idhammai.c.r.q.D.f.V.f();
    }

    @r
    public void v(v v2) {
        class_2338 class_23382;
        if (O.M()) {
            return;
        }
        if (this.G3.x(dev.idhammai.c.r.O.p.T.Pre) && v2.C() || this.G3.x(dev.idhammai.c.r.O.p.T.Post) && v2.a()) {
            return;
        }
        int n2 = this.D.h() ? dev.idhammai.P.A.L.g.H(class_2246.field_23152) : dev.idhammai.P.A.L.g.L(class_2246.field_23152);
        int n3 = this.D.h() ? dev.idhammai.P.A.L.g.H(class_2246.field_10171) : dev.idhammai.P.A.L.g.L(class_2246.field_10171);
        int n4 = this.D.h() ? n2 : dev.idhammai.P.A.L.g.f();
        int n5 = O.W.field_1724.method_31548().field_7545;
        if (W.b.p() && W.b.m.h()) {
            this.GD = null;
            return;
        }
        if (i.X6.p() && i.X6.h != null) {
            this.GD = null;
            return;
        }
        if (n2 == -1) {
            this.GD = null;
            return;
        }
        if (n3 == -1) {
            this.GD = null;
            return;
        }
        if (n4 == -1) {
            this.GD = null;
            return;
        }
        if (O.W.field_1724.method_5715()) {
            this.GD = null;
            return;
        }
        if (this.m.h() && O.W.field_1724.method_6115()) {
            this.GD = null;
            return;
        }
        if (this.D.h() && !dev.idhammai.P.A.L.e.n()) {
            return;
        }
        if (this.C.h()) {
            this.s();
        }
        if (!this.P.h()) {
            this.g();
        }
        if ((class_23382 = this.GD) != null) {
            if (this.Gm.h()) {
                dev.idhammai.P.A.Y.N.r(new class_2338((class_2382)class_23382), this.GE.h(), false);
            }
            boolean bl = this.GF.h() && (!this.K.h() || Frog.BREAK.X(class_23382));
            boolean bl2 = bl;
            if (bl) {
                if (!this.F.m((long)this.Y.Z())) {
                    return;
                }
                this.F.H();
                if (dev.idhammai.P.A.l.M.A(class_23382, this.j.e(), this.Gm.h())) {
                    this.G(class_23382, this.GE.h(), n2);
                }
                if (!this.G0.contains(class_23382)) {
                    this.F.H();
                    this.w(class_23382, dev.idhammai.P.A.l.M.e(class_23382), this.GE.h(), n3);
                    this.G0.add(class_23382);
                }
                this.G0.remove(class_23382);
                this.w(class_23382, dev.idhammai.P.A.l.M.e(class_23382), this.GE.h(), n4);
                if (this.G5.h() && this.Q.h()) {
                    if (this.U() && this.Gi.h()) {
                        class_2350 class_23502 = dev.idhammai.P.A.l.M.e(class_23382);
                        class_243 class_2432 = new class_243((double)class_23382.method_10263() + 0.5 + (double)class_23502.method_10163().method_10263() * 0.5, (double)class_23382.method_10264() + 0.5 + (double)class_23502.method_10163().method_10264() * 0.5, (double)class_23382.method_10260() + 0.5 + (double)class_23502.method_10163().method_10260() * 0.5);
                        if (Frog.ROTATION.k(class_2432, this.M.Z())) {
                            dev.idhammai.P.A.Y.N.y = class_23382;
                            dev.idhammai.P.A.Y.N.Z = class_2246.field_10124.method_9564();
                            this.G(class_23382, this.GE.h(), n2);
                            dev.idhammai.P.A.Y.N.y = null;
                        }
                    } else {
                        dev.idhammai.P.A.Y.N.y = class_23382;
                        dev.idhammai.P.A.Y.N.Z = class_2246.field_10124.method_9564();
                        this.G(class_23382, this.GE.h(), n2);
                        dev.idhammai.P.A.Y.N.y = null;
                    }
                }
            } else if (dev.idhammai.P.A.l.M.A(class_23382, this.j.e(), this.Gm.h())) {
                if (!this.F.m((long)this.E.Z())) {
                    return;
                }
                this.F.H();
                this.G(class_23382, this.GE.h(), n2);
            } else if (dev.idhammai.P.A.l.M.x(class_23382) == class_2246.field_23152) {
                if (!this.G0.contains(class_23382)) {
                    if (!this.F.m((long)this.a.Z())) {
                        return;
                    }
                    this.F.H();
                    this.w(class_23382, dev.idhammai.P.A.l.M.e(class_23382), this.GE.h(), n3);
                    this.G0.add(class_23382);
                } else {
                    if (!this.F.m((long)this.h.Z())) {
                        return;
                    }
                    this.F.H();
                    this.G0.remove(class_23382);
                    this.w(class_23382, dev.idhammai.P.A.l.M.e(class_23382), this.GE.h(), n4);
                    if (this.G5.h()) {
                        if (this.U() && this.Gi.h()) {
                            class_2350 class_23503 = dev.idhammai.P.A.l.M.e(class_23382);
                            class_243 class_2433 = new class_243((double)class_23382.method_10263() + 0.5 + (double)class_23503.method_10163().method_10263() * 0.5, (double)class_23382.method_10264() + 0.5 + (double)class_23503.method_10163().method_10264() * 0.5, (double)class_23382.method_10260() + 0.5 + (double)class_23503.method_10163().method_10260() * 0.5);
                            if (Frog.ROTATION.k(class_2433, this.M.Z())) {
                                dev.idhammai.P.A.Y.N.y = class_23382;
                                dev.idhammai.P.A.Y.N.Z = class_2246.field_10124.method_9564();
                                this.G(class_23382, this.GE.h(), n2);
                                dev.idhammai.P.A.Y.N.y = null;
                            }
                        } else {
                            dev.idhammai.P.A.Y.N.y = class_23382;
                            dev.idhammai.P.A.Y.N.Z = class_2246.field_10124.method_9564();
                            this.G(class_23382, this.GE.h(), n2);
                            dev.idhammai.P.A.Y.N.y = null;
                        }
                    }
                }
            }
            if (!this.D.h()) {
                this.b(n5);
            }
        }
    }

    private void g() {
        if (O.M()) {
            return;
        }
        if (this.p.m((long)this.Ge.Z())) {
            double d2;
            this.p.H();
            s s2 = new s((class_1657)O.W.field_1724, this.g.e(), this.t.V(), this.Gt.V(), this.Z.h(), this.GQ.h(), this.Gv.h(), this.k.h());
            this.GZ = null;
            double d3 = this.GJ.e();
            double d4 = this.GC.e();
            boolean bl = false;
            List<class_1657> list = dev.idhammai.P.A.Y.N.c(this.l.e());
            ArrayList<s> arrayList = new ArrayList<s>();
            for (class_1657 object : list) {
                arrayList.add(new s(object, this.g.e(), this.Gq.V(), this.Gt.V(), this.Z.h(), this.GQ.h(), this.Gv.h(), this.k.h()));
            }
            for (s s3 : arrayList) {
                double d5;
                class_2338 class_23382 = dev.idhammai.P.A.L.e.d((class_1297)s3.M, true).method_10086(2);
                if (!dev.idhammai.P.A.l.M.A(class_23382, this.j.e(), this.Gm.h()) && (dev.idhammai.P.A.l.M.x(class_23382) != class_2246.field_23152 || dev.idhammai.P.A.l.M.S(class_23382) == null) || (d5 = this.E(class_23382, s2.M, s2.A)) > this.GK.e() || this.y.h() && d5 > (double)(O.W.field_1724.method_6032() + O.W.field_1724.method_6067()) || !((d2 = this.E(class_23382, s3.M, s3.A)) > (double)this.U.Z()) || this.T.h() && d5 > d2) continue;
                this.I = d2;
                this.GP = s3.M;
                this.GZ = class_23382;
                break;
            }
            if (this.GZ == null) {
                for (class_2338 class_23383 : dev.idhammai.P.A.l.M.U(this.j.Z() + 1.0f, O.W.field_1724.method_33571())) {
                    for (s s4 : arrayList) {
                        double d6;
                        double d7;
                        boolean bl2;
                        if (this.f.h()) {
                            dev.idhammai.P.A.Y.N.y = class_23383;
                            dev.idhammai.P.A.Y.N.Z = class_2246.field_10124.method_9564();
                            bl2 = !O.a(class_23383.method_46558(), s4.A.method_19538());
                            dev.idhammai.P.A.Y.N.y = null;
                            if (bl2) continue;
                        }
                        if (dev.idhammai.P.A.l.M.x(class_23383) != class_2246.field_23152) {
                            double d8;
                            if (bl || !dev.idhammai.P.A.l.M.A(class_23383, this.j.e(), this.Gm.h())) continue;
                            dev.idhammai.P.A.Y.N.y = class_23383;
                            dev.idhammai.P.A.Y.N.Z = class_2246.field_10540.method_9564();
                            bl2 = dev.idhammai.P.A.l.M.S(class_23383) == null;
                            dev.idhammai.P.A.Y.N.y = null;
                            if (bl2) continue;
                            d2 = this.E(class_23383, s4.M, s4.A);
                            if (!(d8 >= d3) || i.X6.h != null && !i.X6.W() && !((double)i.X6.At < d2) || (d7 = this.E(class_23383, s2.M, s2.A)) > this.GK.e() || this.y.h() && d7 > (double)(O.W.field_1724.method_6032() + O.W.field_1724.method_6067()) || this.T.h() && d7 > d2) continue;
                            this.I = d2;
                            this.GP = s4.M;
                            d3 = d2;
                            this.GZ = class_23383;
                            continue;
                        }
                        d7 = this.E(class_23383, s4.M, s4.A);
                        if (dev.idhammai.P.A.l.M.S(class_23383) == null || !(d7 >= d4)) continue;
                        if (d7 >= this.J.e()) {
                            bl = true;
                        }
                        if (!bl && d7 < d3 || i.X6.h != null && !i.X6.W() && !((double)i.X6.At < d7) || (d6 = this.E(class_23383, s2.M, s2.A)) > this.GK.e() || this.y.h() && d6 > (double)(O.W.field_1724.method_6032() + O.W.field_1724.method_6067()) || this.T.h() && d6 > d7) continue;
                        this.I = d7;
                        this.GP = s4.M;
                        d4 = d7;
                        this.GZ = class_23383;
                    }
                }
            }
        }
        this.GD = this.GZ;
    }

    public double E(class_2338 class_23382, class_1657 class_16572, class_1657 class_16573) {
        if (this.H.h()) {
            dev.idhammai.P.A.Y.N.z = true;
        }
        double d2 = dev.idhammai.P.A.A.w.Z(class_23382, (class_1309)class_16572, (class_1309)class_16573);
        dev.idhammai.P.A.Y.N.z = false;
        return d2;
    }

    public void G(class_2338 class_23382, boolean bl, int n2) {
        if (dev.idhammai.P.A.l.M.q()) {
            this.r(class_23382, bl, n2);
            return;
        }
        class_2350 class_23502 = dev.idhammai.P.A.l.M.x(class_23382);
        if (class_23502 == null) {
            return;
        }
        this.w(class_23382.method_10093(class_23502), class_23502.method_10153(), bl, n2);
    }

    public void w(class_2338 class_23382, class_2350 class_23502, boolean bl, int n2) {
        if (class_23382 == null) {
            return;
        }
        class_243 class_2432 = new class_243((double)class_23382.method_10263() + 0.5 + (double)class_23502.method_10163().method_10263() * 0.5, (double)class_23382.method_10264() + 0.5 + (double)class_23502.method_10163().method_10264() * 0.5, (double)class_23382.method_10260() + 0.5 + (double)class_23502.method_10163().method_10260() * 0.5);
        if (bl && !this.K(class_2432)) {
            return;
        }
        this.b(n2);
        dev.idhammai.P.A.L.e.g(class_1268.field_5808, this.X.X());
        class_3965 class_39652 = new class_3965(class_2432, class_23502, class_23382, false);
        dev.idhammai.c.r.y.n(arg_0 -> O.lambda$clickBlock$58(class_39652, arg_0));
        if (this.D.h()) {
            this.b(n2);
        }
        if (bl && !this.U()) {
            Frog.ROTATION.M();
        }
    }

    public void r(class_2338 class_23382, boolean bl, int n2) {
        if (class_23382 == null) {
            return;
        }
        class_2350 class_23502 = dev.idhammai.P.A.l.M.e(class_23382);
        class_243 class_2432 = new class_243((double)class_23382.method_10263() + 0.5 + (double)class_23502.method_10163().method_10263() * 0.5, (double)class_23382.method_10264() + 0.5 + (double)class_23502.method_10163().method_10264() * 0.5, (double)class_23382.method_10260() + 0.5 + (double)class_23502.method_10163().method_10260() * 0.5);
        if (bl && !this.K(class_2432)) {
            return;
        }
        this.b(n2);
        boolean bl2 = dev.idhammai.c.r.q.i.Z.y.U.h();
        if (bl2) {
            W.method_1562().method_52787((class_2596)new class_2846(class_2846.class_2847.field_12969, new class_2338(0, 0, 0), class_2350.field_11033));
        }
        dev.idhammai.P.A.L.e.g(class_1268.field_5808, this.X.X());
        class_3965 class_39652 = new class_3965(class_2432, class_23502, class_23382, false);
        dev.idhammai.c.r.y.n(arg_0 -> O.lambda$airPlace$59(bl2, class_39652, arg_0));
        if (bl2) {
            W.method_1562().method_52787((class_2596)new class_2846(class_2846.class_2847.field_12969, new class_2338(0, 0, 0), class_2350.field_11033));
        }
        if (this.D.h()) {
            this.b(n2);
        }
        if (bl && !this.U()) {
            Frog.ROTATION.M();
        }
    }

    private void b(int n2) {
        if (this.D.h()) {
            dev.idhammai.P.A.L.g.z(n2, O.W.field_1724.method_31548().field_7545);
        } else {
            dev.idhammai.P.A.L.g.j(n2);
        }
    }

    public boolean K(class_243 class_2432) {
        if (!this.U()) {
            Frog.ROTATION.a(class_2432);
            return true;
        }
        this.L = class_2432;
        if (Frog.ROTATION.k(class_2432, this.M.Z())) {
            return true;
        }
        return !this.Gi.h();
    }

    public void s() {
        class_2338 class_23382;
        this.w = null;
        int n2 = this.D.h() ? dev.idhammai.P.A.L.g.H(class_2246.field_23152) : dev.idhammai.P.A.L.g.L(class_2246.field_23152);
        int n3 = this.D.h() ? dev.idhammai.P.A.L.g.H(class_2246.field_10171) : dev.idhammai.P.A.L.g.L(class_2246.field_10171);
        int n4 = O.W.field_1724.method_31548().field_7545;
        if (n2 == -1) {
            return;
        }
        if (this.r.h()) {
            n2 = this.D.h() ? dev.idhammai.P.A.L.g.H(class_2246.field_10540) : dev.idhammai.P.A.L.g.L(class_2246.field_10540);
            int n5 = n2;
            if (n2 == -1) {
                return;
            }
        }
        if (n3 == -1) {
            return;
        }
        if (O.W.field_1724.method_5715()) {
            return;
        }
        if (this.m.h() && O.W.field_1724.method_6115()) {
            return;
        }
        if (W.b.p() && W.b.m.h()) {
            return;
        }
        if (!this.e.m((long)(this.s.Z() * 1000.0f))) {
            return;
        }
        this.e.H();
        ArrayList<s> arrayList = new ArrayList<s>();
        for (class_1657 class_16572 : dev.idhammai.P.A.Y.N.c(this.GH.e())) {
            arrayList.add(new s(class_16572, this.g.e(), this.Gq.V(), this.Gt.V(), this.Z.h(), this.GQ.h(), this.Gv.h(), this.k.h()));
        }
        double d2 = this.n.e();
        for (s s2 : arrayList) {
            class_2338 class_23383 = dev.idhammai.P.A.L.e.d((class_1297)s2.M, true).method_10086(2);
            if (O.W.field_1687.method_8320(class_23383).method_26204() == class_2246.field_23152) {
                return;
            }
            if (dev.idhammai.P.A.l.M.U(class_23383, false)) {
                double d3;
                double d4 = this.E(class_23383, s2.M, s2.A);
                if (d3 >= d2) {
                    d2 = d4;
                    this.w = class_23383;
                }
            }
            for (class_2350 class_23502 : class_2350.values()) {
                double d5;
                if (class_23502 == class_2350.field_11036 || class_23502 == class_2350.field_11033 || !dev.idhammai.P.A.l.M.U(class_23383.method_10093(class_23502), false) || !((d5 = this.E(class_23383.method_10093(class_23502), s2.M, s2.A)) >= d2)) continue;
                d2 = d5;
                this.w = class_23383.method_10093(class_23502);
            }
        }
        if (this.w != null && dev.idhammai.P.A.l.M.H(this.w, this.j.e()) == null && (class_23382 = this.i(this.w)) != null) {
            this.b(n2);
            dev.idhammai.P.A.l.M.i(class_23382, this.GE.h());
            if (this.D.h()) {
                this.b(n2);
            } else {
                this.b(n4);
            }
        }
    }

    public class_2338 i(class_2338 class_23382) {
        for (class_2350 class_23502 : class_2350.values()) {
            if (this.b.h() && Frog.BREAK.X(class_23382.method_10093(class_23502)) || !dev.idhammai.P.A.l.M.t(class_23382.method_10093(class_23502), class_23502.method_10153()) || !dev.idhammai.P.A.l.M.d(class_23382.method_10093(class_23502))) continue;
            return class_23382.method_10093(class_23502);
        }
        return null;
    }

    private static class_2596 lambda$airPlace$59(boolean bl, class_3965 class_39652, int n2) {
        return new class_2885(bl ? class_1268.field_5810 : class_1268.field_5808, class_39652, n2);
    }

    private static class_2596 lambda$clickBlock$58(class_3965 class_39652, int n2) {
        return new class_2885(class_1268.field_5808, class_39652, n2);
    }

    private boolean lambda$new$57() {
        return this.V.X() == dev.idhammai.c.r.q.A.y.Render && this.Gs.h();
    }

    private boolean lambda$new$56() {
        return this.V.X() == dev.idhammai.c.r.q.A.y.Render && this.Gs.h();
    }

    private boolean lambda$new$55() {
        return this.V.X() == dev.idhammai.c.r.q.A.y.Render && this.Gs.h();
    }

    private boolean lambda$new$54() {
        return this.V.X() == dev.idhammai.c.r.q.A.y.Render && this.Gs.h();
    }

    private boolean lambda$new$53() {
        return this.V.X() == dev.idhammai.c.r.q.A.y.Render && this.Gs.h();
    }

    private boolean lambda$new$52() {
        return this.V.X() == dev.idhammai.c.r.q.A.y.Render && this.Gs.h();
    }

    private boolean lambda$new$51() {
        return this.V.X() == dev.idhammai.c.r.q.A.y.Render;
    }

    private boolean lambda$new$50() {
        return this.V.X() == dev.idhammai.c.r.q.A.y.Render;
    }

    private boolean lambda$new$49() {
        return this.V.X() == dev.idhammai.c.r.q.A.y.Render;
    }

    private boolean lambda$new$48() {
        return this.V.X() == dev.idhammai.c.r.q.A.y.Render;
    }

    private boolean lambda$new$47() {
        return this.V.X() == dev.idhammai.c.r.q.A.y.Interact;
    }

    private boolean lambda$new$46() {
        return this.V.X() == dev.idhammai.c.r.q.A.y.Interact;
    }

    private boolean lambda$new$45() {
        return this.V.X() == dev.idhammai.c.r.q.A.y.Interact;
    }

    private boolean lambda$new$44() {
        return this.V.X() == dev.idhammai.c.r.q.A.y.Interact;
    }

    private boolean lambda$new$43() {
        return this.V.X() == dev.idhammai.c.r.q.A.y.Interact;
    }

    private boolean lambda$new$42() {
        return this.GE.f() && this.N.f() && this.V.X() == dev.idhammai.c.r.q.A.y.Rotate;
    }

    private boolean lambda$new$41() {
        return this.GE.f() && this.N.f() && this.Gi.h() && this.V.X() == dev.idhammai.c.r.q.A.y.Rotate;
    }

    private boolean lambda$new$40() {
        return this.GE.f() && this.N.f() && this.V.X() == dev.idhammai.c.r.q.A.y.Rotate;
    }

    private boolean lambda$new$39() {
        return this.GE.f() && this.N.f() && this.V.X() == dev.idhammai.c.r.q.A.y.Rotate;
    }

    private boolean lambda$new$38() {
        return this.GE.f() && this.N.f() && this.V.X() == dev.idhammai.c.r.q.A.y.Rotate;
    }

    private boolean lambda$new$37() {
        return this.GE.f() && this.V.X() == dev.idhammai.c.r.q.A.y.Rotate;
    }

    private boolean lambda$new$36() {
        return this.V.X() == dev.idhammai.c.r.q.A.y.Rotate;
    }

    private boolean lambda$new$35() {
        return this.V.X() == dev.idhammai.c.r.q.A.y.General;
    }

    private boolean lambda$new$34() {
        return this.V.X() == dev.idhammai.c.r.q.A.y.General;
    }

    private boolean lambda$new$33() {
        return this.V.X() == dev.idhammai.c.r.q.A.y.General;
    }

    private boolean lambda$new$32() {
        return this.V.X() == dev.idhammai.c.r.q.A.y.General;
    }

    private boolean lambda$new$31() {
        return this.V.X() == dev.idhammai.c.r.q.A.y.General;
    }

    private boolean lambda$new$30() {
        return this.V.X() == dev.idhammai.c.r.q.A.y.General;
    }

    private boolean lambda$new$29() {
        return this.V.X() == dev.idhammai.c.r.q.A.y.General;
    }

    private boolean lambda$new$28() {
        return this.V.X() == dev.idhammai.c.r.q.A.y.General;
    }

    private boolean lambda$new$27() {
        return this.V.X() == dev.idhammai.c.r.q.A.y.General && this.G5.f();
    }

    private boolean lambda$new$26() {
        return this.V.X() == dev.idhammai.c.r.q.A.y.General;
    }

    private boolean lambda$new$25() {
        return this.V.X() == dev.idhammai.c.r.q.A.y.General && this.GF.f();
    }

    private boolean lambda$new$24() {
        return this.V.X() == dev.idhammai.c.r.q.A.y.General;
    }

    private boolean lambda$new$23() {
        return this.V.X() == dev.idhammai.c.r.q.A.y.General;
    }

    private boolean lambda$new$22() {
        return this.V.X() == dev.idhammai.c.r.q.A.y.General;
    }

    private boolean lambda$new$21() {
        return this.V.X() == dev.idhammai.c.r.q.A.y.General;
    }

    private boolean lambda$new$20() {
        return this.V.X() == dev.idhammai.c.r.q.A.y.General;
    }

    private boolean lambda$new$19() {
        return this.V.X() == dev.idhammai.c.r.q.A.y.General;
    }

    private boolean lambda$new$18() {
        return this.V.X() == dev.idhammai.c.r.q.A.y.Assist;
    }

    private boolean lambda$new$17() {
        return this.V.X() == dev.idhammai.c.r.q.A.y.Assist;
    }

    private boolean lambda$new$16() {
        return this.V.X() == dev.idhammai.c.r.q.A.y.Assist;
    }

    private boolean lambda$new$15() {
        return this.V.X() == dev.idhammai.c.r.q.A.y.Assist;
    }

    private boolean lambda$new$14() {
        return this.V.X() == dev.idhammai.c.r.q.A.y.Assist;
    }

    private boolean lambda$new$13() {
        return this.V.X() == dev.idhammai.c.r.q.A.y.Assist;
    }

    private boolean lambda$new$12() {
        return this.V.X() == dev.idhammai.c.r.q.A.y.Predict;
    }

    private boolean lambda$new$11() {
        return this.V.X() == dev.idhammai.c.r.q.A.y.Predict;
    }

    private boolean lambda$new$10() {
        return this.V.X() == dev.idhammai.c.r.q.A.y.Predict;
    }

    private boolean lambda$new$9() {
        return this.V.X() == dev.idhammai.c.r.q.A.y.Predict;
    }

    private boolean lambda$new$8() {
        return this.V.X() == dev.idhammai.c.r.q.A.y.Predict;
    }

    private boolean lambda$new$7() {
        return this.V.X() == dev.idhammai.c.r.q.A.y.Predict;
    }

    private boolean lambda$new$6() {
        return this.V.X() == dev.idhammai.c.r.q.A.y.Predict;
    }

    private boolean lambda$new$5() {
        return this.V.X() == dev.idhammai.c.r.q.A.y.Predict;
    }

    private boolean lambda$new$4() {
        return this.V.X() == dev.idhammai.c.r.q.A.y.Interact;
    }

    private boolean lambda$new$3() {
        return this.V.X() == dev.idhammai.c.r.q.A.y.Interact;
    }

    private boolean lambda$new$2() {
        return this.V.X() == dev.idhammai.c.r.q.A.y.Interact;
    }

    private boolean lambda$new$1() {
        return this.V.X() == dev.idhammai.c.r.q.A.y.General;
    }

    private boolean lambda$new$0() {
        return this.V.X() == dev.idhammai.c.r.q.A.y.General;
    }
}

