/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.N;

import dev.idhammai.c.r.O.Y.B;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.O.p.G;
import dev.idhammai.c.r.O.p.S;
import dev.idhammai.c.r.O.p.s;
import dev.idhammai.c.r.q.D.u;
import dev.idhammai.c.r.q.N.C;
import dev.idhammai.c.r.q.N.X;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class x
extends y {
    public static x y;
    public final B<C> m = this.S(new B<C>("Page", dev.idhammai.c.r.q.N.C.General).I("\u9875\u9762").X(dev.idhammai.c.r.q.N.C.General, "\u5e38\u89c4").X(dev.idhammai.c.r.q.N.C.Rotation, "\u8f6c\u5411").X(dev.idhammai.c.r.q.N.C.Misc, "\u6742\u9879").X(dev.idhammai.c.r.q.N.C.Predict, "\u9884\u6d4b"));
    public final W d = this.S(new W("TrueAttackCD", false, this::lambda$new$0).k("\u771f\u5b9e\u653b\u51fb\u51b7\u5374"));
    public final W j = this.S(new W("MultiPlace", true, this::lambda$new$1).k("\u591a\u91cd\u653e\u7f6e"));
    public final W Y = this.S(new W("PacketPlace", true, this::lambda$new$2).k("\u53d1\u5305\u653e\u7f6e"));
    public final W h = this.S(new W("AttackRotation", false, this::lambda$new$3).k("\u653b\u51fb\u8f6c\u5411"));
    public final W Q = this.S(new W("PickSwap", false, this::lambda$new$4).k("\u5feb\u6377\u62ff\u53d6\u7ed5\u8fc7"));
    public final W a = this.S(new W("PriorHotbar", false, this::lambda$new$5).k("\u4f18\u5148\u5feb\u6377\u680f"));
    public final l k = this.p(new l("InteractEntityRange", 3.0, 0.0, 8.0, 0.1, this::lambda$new$6).D("\u4ea4\u4e92\u5b9e\u4f53\u8ddd\u79bb"));
    public final l A = this.p(new l("HitBoxSize", 0.6, 0.0, 1.0, 0.01, this::lambda$new$7).D("\u547d\u4e2d\u7bb1\u5927\u5c0f"));
    public final l p = this.p(new l("BreakDelay", 0.2, 0.0, 1.0, 0.01, this::lambda$new$8).D("\u7834\u574f\u5ef6\u8fdf").P("s"));
    public final W X = this.S(new W("NoBadSlot", false, this::lambda$new$9).k("\u7981\u6b62\u574f\u69fd\u4f4d"));
    public final B<G> w = this.S(new B<G>("Placement", dev.idhammai.c.r.O.p.G.Vanilla, this::lambda$new$10).I("\u653e\u7f6e\u6a21\u5f0f"));
    public final W L = this.S(new W("UPDirectionLimit", true, this::lambda$new$11).k("\u9650\u5236\u5411\u4e0a\u65b9\u5411"));
    public final B<S> H = this.S(new B<S>("InteractSwing", dev.idhammai.c.r.O.p.S.All, this::lambda$new$12).I("\u4ea4\u4e92\u6325\u624b"));
    public final B<S> f = this.S(new B<S>("AttackSwing", dev.idhammai.c.r.O.p.S.All, this::lambda$new$13).I("\u653b\u51fb\u6325\u624b"));
    public final W D = this.S(new W("GrimRotation", false, this::lambda$new$14).k("Grim\u8f6c\u5411"));
    public final B<s> M = this.S(new B<s>("SnapBack", dev.idhammai.c.r.O.p.s.None, this::lambda$new$15).I("\u56de\u6b63\u65b9\u5f0f"));
    public final W I = this.S(new W("Look", true, this::lambda$new$16).k("\u671d\u5411\u76ee\u6807"));
    public final l s = this.p(new l("LookTime", 0.5, 0.0, 1.0, 0.01, this::lambda$new$17).D("\u8f6c\u5411\u65f6\u957f"));
    public final W Z = this.S(new W("Random", true, this::lambda$new$18).k("\u968f\u673a\u5316"));
    public final l g = this.p(new l("Steps", 0.6, 0.0, 1.0, 0.01, this::lambda$new$19).D("\u6b65\u8fdb"));
    public final W r = this.S(new W("ServerSide", false, this::lambda$new$20).k("\u670d\u52a1\u7aef\u8f6c\u5411"));
    public final W U = this.S(new W("FullPackets", false, this::lambda$new$21).k("\u5b8c\u6574\u5305").D());
    public final W E = this.S(new W("AlwaysSend", false, this::lambda$new$22).k("\u59cb\u7ec8\u53d1\u9001"));
    public final W t = this.S(new W("ForceSync", true, this::lambda$new$23).k("\u5f3a\u5236\u540c\u6b65"));
    public final W R = this.S(new W("InteractRotation", false, this::lambda$new$24).k("\u4ea4\u4e92\u8f6c\u5411"));
    public final W e = this.S(new W("DetectDouble", true, this::lambda$new$25).k("\u68c0\u6d4b\u53cc\u6316"));
    public final l C = this.p(new l("DoubleTimeout", 2.0, 0.0, 3.0, 0.1, this::lambda$new$26).D("\u53cc\u6316\u8d85\u65f6").P("*"));
    public final l n = this.p(new l("MinTimeout", 2.0, 0.0, 10.0, 0.1, this::lambda$new$27).D("\u6700\u5c0f\u8d85\u65f6").P("s"));
    public final l u = this.p(new l("BreakFailed", 1.5, 0.0, 3.0, 0.1, this::lambda$new$28).D("\u7834\u574f\u5931\u8d25\u9608\u503c").P("*"));
    public final W J = this.S(new W("IgnoreArmorStand", false, this::lambda$new$29).k("\u5ffd\u7565\u76d4\u7532\u67b6"));
    public final W b = this.S(new W("CloseScreen", false, this::lambda$new$30).k("\u81ea\u52a8\u5173\u754c\u9762"));
    public final B<X> K = this.S(new B<X>("Motion", dev.idhammai.c.r.q.N.X.Position, this::lambda$new$31).I("\u9884\u6d4b\u65b9\u5f0f").X(dev.idhammai.c.r.q.N.X.Velocity, "\u901f\u5ea6").X(dev.idhammai.c.r.q.N.X.Position, "\u4f4d\u7f6e"));
    public final l P = this.p(new l("Predict", 4, 0, 10, this::lambda$new$32).D("\u9884\u6d4bTick").P("ticks"));
    public final l G = this.p(new l("Simulation", 5.0, 0.0, 20.0, 1.0, this::lambda$new$33).D("\u6a21\u62df\u957f\u5ea6"));
    public final l l = this.p(new l("MaxMotionY", 0.34, 0.0, 2.0, 0.01, this::lambda$new$34).D("\u6700\u5927Y\u901f\u5ea6"));
    public final W T = this.S(new W("Step", false, this::lambda$new$35).k("\u6b65\u8fdb"));
    public final W N = this.S(new W("DoubleStep", false, this::lambda$new$36).k("\u53cc\u6b65\u8fdb"));
    public final W B = this.S(new W("Jump", false, this::lambda$new$37).k("\u8df3\u8dc3"));
    public final W V = this.S(new W("InBlockPause", true, this::lambda$new$38).k("\u5361\u65b9\u5757\u6682\u505c"));

    public x() {
        super("AntiCheat", dev.idhammai.c.r.w.Client);
        this.L("\u53cd\u4f5c\u5f0a\u9009\u9879");
        y = this;
    }

    public boolean y() {
        return dev.idhammai.c.r.q.D.u.r.p();
    }

    public static double o() {
        if (y != null) {
            return x.y.A.e() / 2.0;
        }
        return 0.3;
    }

    @Override
    public void C() {
        this.S = true;
    }

    @Override
    public void p() {
        this.S = true;
    }

    @Override
    public boolean p() {
        return true;
    }

    private boolean lambda$new$38() {
        return this.m.X() == dev.idhammai.c.r.q.N.C.Predict;
    }

    private boolean lambda$new$37() {
        return this.m.X() == dev.idhammai.c.r.q.N.C.Predict;
    }

    private boolean lambda$new$36() {
        return this.m.X() == dev.idhammai.c.r.q.N.C.Predict;
    }

    private boolean lambda$new$35() {
        return this.m.X() == dev.idhammai.c.r.q.N.C.Predict;
    }

    private boolean lambda$new$34() {
        return this.m.X() == dev.idhammai.c.r.q.N.C.Predict;
    }

    private boolean lambda$new$33() {
        return this.m.X() == dev.idhammai.c.r.q.N.C.Predict;
    }

    private boolean lambda$new$32() {
        return this.m.X() == dev.idhammai.c.r.q.N.C.Predict;
    }

    private boolean lambda$new$31() {
        return this.m.X() == dev.idhammai.c.r.q.N.C.Predict;
    }

    private boolean lambda$new$30() {
        return this.m.x(dev.idhammai.c.r.q.N.C.Misc);
    }

    private boolean lambda$new$29() {
        return this.m.x(dev.idhammai.c.r.q.N.C.Misc);
    }

    private boolean lambda$new$28() {
        return this.m.x(dev.idhammai.c.r.q.N.C.Misc);
    }

    private boolean lambda$new$27() {
        return this.m.x(dev.idhammai.c.r.q.N.C.Misc);
    }

    private boolean lambda$new$26() {
        return this.m.x(dev.idhammai.c.r.q.N.C.Misc);
    }

    private boolean lambda$new$25() {
        return this.m.x(dev.idhammai.c.r.q.N.C.Misc);
    }

    private boolean lambda$new$24() {
        return this.m.x(dev.idhammai.c.r.q.N.C.Rotation);
    }

    private boolean lambda$new$23() {
        return this.m.x(dev.idhammai.c.r.q.N.C.Rotation);
    }

    private boolean lambda$new$22() {
        return this.m.x(dev.idhammai.c.r.q.N.C.Rotation) && this.U.f();
    }

    private boolean lambda$new$21() {
        return this.m.x(dev.idhammai.c.r.q.N.C.Rotation);
    }

    private boolean lambda$new$20() {
        return this.m.x(dev.idhammai.c.r.q.N.C.Rotation);
    }

    private boolean lambda$new$19() {
        return this.m.x(dev.idhammai.c.r.q.N.C.Rotation);
    }

    private boolean lambda$new$18() {
        return this.m.x(dev.idhammai.c.r.q.N.C.Rotation);
    }

    private boolean lambda$new$17() {
        return this.m.x(dev.idhammai.c.r.q.N.C.Rotation);
    }

    private boolean lambda$new$16() {
        return this.m.x(dev.idhammai.c.r.q.N.C.Rotation);
    }

    private boolean lambda$new$15() {
        return this.m.x(dev.idhammai.c.r.q.N.C.Rotation);
    }

    private boolean lambda$new$14() {
        return this.m.x(dev.idhammai.c.r.q.N.C.Rotation);
    }

    private boolean lambda$new$13() {
        return this.m.x(dev.idhammai.c.r.q.N.C.General);
    }

    private boolean lambda$new$12() {
        return this.m.x(dev.idhammai.c.r.q.N.C.General);
    }

    private boolean lambda$new$11() {
        return this.m.x(dev.idhammai.c.r.q.N.C.General) && this.w.x(dev.idhammai.c.r.O.p.G.NCP);
    }

    private boolean lambda$new$10() {
        return this.m.x(dev.idhammai.c.r.q.N.C.General);
    }

    private boolean lambda$new$9() {
        return this.m.x(dev.idhammai.c.r.q.N.C.General);
    }

    private boolean lambda$new$8() {
        return this.m.x(dev.idhammai.c.r.q.N.C.General);
    }

    private boolean lambda$new$7() {
        return this.m.x(dev.idhammai.c.r.q.N.C.General);
    }

    private boolean lambda$new$6() {
        return this.m.x(dev.idhammai.c.r.q.N.C.General);
    }

    private boolean lambda$new$5() {
        return this.m.x(dev.idhammai.c.r.q.N.C.General);
    }

    private boolean lambda$new$4() {
        return this.m.x(dev.idhammai.c.r.q.N.C.General);
    }

    private boolean lambda$new$3() {
        return this.m.x(dev.idhammai.c.r.q.N.C.General);
    }

    private boolean lambda$new$2() {
        return this.m.x(dev.idhammai.c.r.q.N.C.General);
    }

    private boolean lambda$new$1() {
        return this.m.x(dev.idhammai.c.r.q.N.C.General);
    }

    private boolean lambda$new$0() {
        return this.m.x(dev.idhammai.c.r.q.N.C.General);
    }
}

