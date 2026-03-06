/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1294
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_1531
 *  net.minecraft.class_1690
 *  net.minecraft.class_238
 *  net.minecraft.class_241
 *  net.minecraft.class_243
 *  net.minecraft.class_2596
 *  net.minecraft.class_2664
 *  net.minecraft.class_2708
 *  net.minecraft.class_2743
 */
package dev.idhammai.c.r.q.D;

import dev.idhammai.Frog;
import dev.idhammai.P.A.A.h;
import dev.idhammai.P.A.A.k;
import dev.idhammai.P.A.l.M;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.P.r.c.i;
import dev.idhammai.c.r.O.Y.B;
import dev.idhammai.c.r.O.Y.O;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.q.D.F;
import dev.idhammai.c.r.q.D.T;
import dev.idhammai.c.r.q.D.l;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1531;
import net.minecraft.class_1690;
import net.minecraft.class_238;
import net.minecraft.class_241;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2664;
import net.minecraft.class_2708;
import net.minecraft.class_2743;

public class e
extends y {
    public static e t;
    private final B<T> n = this.S(new B<T>("Mode", dev.idhammai.c.r.q.D.T.Strafe).I("\u6a21\u5f0f").X(dev.idhammai.c.r.q.D.T.Strafe, "\u57fa\u7840\u52a0\u901f").X(dev.idhammai.c.r.q.D.T.StrafeStrict, "\u4e25\u683c\u52a0\u901f").X(dev.idhammai.c.r.q.D.T.Grim, "Grim"));
    public final dev.idhammai.c.r.O.Y.l b = this.p(new dev.idhammai.c.r.O.Y.l("CollideSpeed", 0.08, 0.0, 0.08, 0.01, this::lambda$new$0).D("\u78b0\u649e\u52a0\u901f"));
    private final W hk = this.S(new W("Strict", true, this::lambda$new$1).k("\u4e25\u683c\u68c0\u6d4b"));
    private final W F = this.S(new W("BoatLongJump", true, this::lambda$new$2).k("\u8239\u8df3\u52a0\u901f"));
    public final dev.idhammai.c.r.O.Y.l Q = this.p(new dev.idhammai.c.r.O.Y.l("BoatExpand", 0.2, 0.0, 1.0, 0.01, this::lambda$new$3).D("\u8239\u5224\u5b9a\u6269\u5c55"));
    public final dev.idhammai.c.r.O.Y.l ha = this.p(new dev.idhammai.c.r.O.Y.l("BoatSpeed", 0.2, -2.0, 2.0, 0.01, this::lambda$new$4).D("\u8239\u8df3\u901f\u5ea6"));
    public final dev.idhammai.c.r.O.Y.l B = this.p(new dev.idhammai.c.r.O.Y.l("BoatJump", 0.2, 0.0, 2.0, 0.01, this::lambda$new$5).D("\u8239\u8df3\u4e0a\u5347"));
    private final W l = this.S(new W("InWater", false, this::lambda$new$6).k("\u6c34\u4e2d\u751f\u6548"));
    private final W hI = this.S(new W("InBlock", false, this::lambda$new$7).k("\u5361\u65b9\u5757\u751f\u6548"));
    private final W A = this.S(new W("AirStop", false, this::lambda$new$8).k("\u7a7a\u4e2d\u505c\u901f"));
    private final W m = this.S(new W("Jump", true, this::lambda$new$9).k("\u81ea\u52a8\u8df3\u8dc3"));
    private final W K = this.S(new W("Slowness", false, this::lambda$new$10).k("\u8003\u8651\u7f13\u6162"));
    private final dev.idhammai.c.r.O.Y.l f = this.p(new dev.idhammai.c.r.O.Y.l("LagTime", 500.0, 0.0, 1000.0, 1.0, this::lambda$new$11).D("\u56de\u62c9\u4fdd\u62a4"));
    private final dev.idhammai.c.r.O.Y.l h4 = this.p(new dev.idhammai.c.r.O.Y.l("H-Factor", 1.0, 0.0, 5.0, 0.01, this::lambda$new$12).D("\u6c34\u5e73\u500d\u7387"));
    private final dev.idhammai.c.r.O.Y.l R = this.p(new dev.idhammai.c.r.O.Y.l("V-Factor", 1.0, 0.0, 5.0, 0.01, this::lambda$new$13).D("\u5782\u76f4\u500d\u7387"));
    private final dev.idhammai.c.r.O.Y.l a = this.p(new dev.idhammai.c.r.O.Y.l("Speed", 0.2873, 0.0, 1.0, 1.0E-4, this::lambda$new$14).D("\u57fa\u7840\u901f\u5ea6"));
    private final W D = this.S(new W("ExplosionsBoost", false, this::lambda$new$15).k("\u7206\u70b8\u52a0\u901f").D());
    private final dev.idhammai.c.r.O.Y.l M = this.p(new dev.idhammai.c.r.O.Y.l("CoolDown", 1000.0, 0.0, 5000.0, 1.0, this.D::f).D("\u7206\u70b8\u51b7\u5374"));
    private final W N = this.S(new W("VelocityBoost", true, this::lambda$new$16).k("\u51fb\u9000\u52a0\u901f").D());
    private final dev.idhammai.c.r.O.Y.l hB = this.p(new dev.idhammai.c.r.O.Y.l("CoolDown", 1000.0, 0.0, 5000.0, 1.0, this.N::f).D("\u51fb\u9000\u51b7\u5374"));
    private final W p = this.S(new W("XinBoost", false, this::lambda$new$17).k("\u946b\u52a0\u901f").D());
    private final O g = this.n(new O("XinBoostKey", -1, this.p::f).E("\u946b\u52a0\u901f\u6309\u952e"));
    private final dev.idhammai.c.r.O.Y.l j = this.p(new dev.idhammai.c.r.O.Y.l("XinSpeed", 0.65, 0.0, 1.0, 1.0E-4, this.p::f).D("\u946b\u52a0\u901f\u901f\u5ea6"));
    private final dev.idhammai.c.r.O.Y.l G = this.p(new dev.idhammai.c.r.O.Y.l("RecoverTime", 5.0, 0.0, 10.0, 0.1, this.p::f).D("\u6062\u590d\u65f6\u95f4").P("s"));
    private final dev.idhammai.c.r.O.Y.l s = this.p(new dev.idhammai.c.r.O.Y.l("RechargeDelay", 1.0, 0.0, 5.0, 0.1, this.p::f).D("\u6062\u590d\u5ef6\u8fdf").P("s"));
    private final dev.idhammai.c.r.O.Y.l C = this.p(new dev.idhammai.c.r.O.Y.l("CoolDown", 4.0, 0.0, 10.0, 0.1, this.p::f).D("\u51b7\u5374\u65f6\u95f4").P("s"));
    private final dev.idhammai.c.r.O.Y.l U = this.p(new dev.idhammai.c.r.O.Y.l("ActiveTime", 2.5, 0.0, 10.0, 0.1, this.p::f).D("\u6301\u7eed\u65f6\u95f4").P("s"));
    private final dev.idhammai.c.r.O.Y.l E = this.p(new dev.idhammai.c.r.O.Y.l("MinUse", 0.3, 0.0, 1.0, 0.01, this.p::f).D("\u6700\u5c0f\u6d88\u8017"));
    private final W c = this.S(new W("Fov", true).k("FOV\u7279\u6548").D());
    public final dev.idhammai.c.r.O.Y.l e = this.p(new dev.idhammai.c.r.O.Y.l("Offset", 10.0, -30.0, 30.0, 1.0, this.c::f).D("FOV\u504f\u79fb"));
    private final dev.idhammai.c.r.O.Y.l H = this.p(new dev.idhammai.c.r.O.Y.l("AnimTime", 300, 0, 1000, this.c::f).D("FOV\u52a8\u753b\u65f6\u957f"));
    private final k ht = new k();
    public double d;
    public static boolean X;
    private final h k = new h();
    private final h hY = new h();
    private final h h7 = new h();
    private final h L = new h();
    private boolean P;
    private double T;
    private double r;
    private int h;
    private int Z = 4;
    private int w;
    private double I;
    private double V;
    private boolean J;
    private boolean Y = false;
    private double y = 0.0;
    private double hA = -1.0;
    private long u = 0L;

    public e() {
        super("Speed", dev.idhammai.c.r.w.Movement);
        this.L("\u52a0\u901f");
        t = this;
        Frog.EVENT_BUS.S(new F(this));
    }

    @Override
    public String I() {
        return this.n.X().name();
    }

    @Override
    public void H() {
        if (dev.idhammai.c.r.q.D.e.W.field_1724 != null) {
            this.T = dev.idhammai.P.A.L.l.K(false);
            this.r = dev.idhammai.P.A.L.l.y();
        }
        this.w = 4;
        this.Y = false;
        this.y = 1.0;
        this.hA = -1.0;
        this.L.H();
        this.g.d(true);
    }

    @r(D=100)
    public void Q(i i2) {
        if (dev.idhammai.P.A.R.F.D()) {
            return;
        }
        if (this.n.x(dev.idhammai.c.r.q.D.T.Strafe)) {
            class_2596<?> class_25962 = i2.L();
            if (class_25962 instanceof class_2743) {
                class_2743 class_27432 = (class_2743)class_25962;
                if (dev.idhammai.c.r.q.D.e.W.field_1724 != null && class_27432.method_11818() == dev.idhammai.c.r.q.D.e.W.field_1724.method_5628() && this.N.h()) {
                    double d2 = Math.sqrt(class_27432.method_11815() * class_27432.method_11815() + class_27432.method_11819() * class_27432.method_11819());
                    double d3 = this.I = this.k.m(this.hB.V()) ? d2 : d2 - this.I;
                    if (this.I > 0.0) {
                        this.k.H();
                        this.T += this.I * this.h4.e();
                        this.r += this.I * this.h4.e();
                        if (dev.idhammai.P.A.L.l.R() > 0.0 && this.R.e() != 0.0) {
                            dev.idhammai.P.A.L.l.d(dev.idhammai.P.A.L.l.R() * this.R.e());
                        }
                    }
                }
            } else {
                class_2596<?> class_25963 = i2.L();
                if (class_25963 instanceof class_2664) {
                    class_2664 class_26642 = (class_2664)class_25963;
                    if (this.D.h()) {
                        class_243 class_2432 = new class_243(class_26642.method_11475(), class_26642.method_11477(), class_26642.method_11478());
                        if (dev.idhammai.c.r.q.D.e.W.field_1724.method_19538().method_1022(class_2432) < 15.0) {
                            double d4 = Math.sqrt(class_26642.method_11472() * class_26642.method_11472() + class_26642.method_11474() * class_26642.method_11474());
                            double d5 = this.V = this.hY.m(this.M.V()) ? d4 : d4 - this.V;
                            if (this.V > 0.0) {
                                this.hY.H();
                                this.T += this.V * this.h4.e();
                                this.r += this.V * this.h4.e();
                                if (dev.idhammai.P.A.L.l.R() > 0.0) {
                                    dev.idhammai.P.A.L.l.d(dev.idhammai.P.A.L.l.R() * this.R.e());
                                }
                            }
                        }
                    }
                }
            }
        }
        if (i2.L() instanceof class_2708) {
            this.h7.H();
            this.c();
        }
    }

    @r
    public void j(dev.idhammai.P.r.c.y y2) {
        if (dev.idhammai.c.r.q.D.e.M()) {
            return;
        }
        double d2 = dev.idhammai.c.r.q.D.e.W.field_1724.method_23317() - dev.idhammai.c.r.q.D.e.W.field_1724.field_6014;
        double d3 = dev.idhammai.c.r.q.D.e.W.field_1724.method_23321() - dev.idhammai.c.r.q.D.e.W.field_1724.field_5969;
        this.r = Math.sqrt(d2 * d2 + d3 * d3);
    }

    @r
    public void W(QO qO) {
        if (this.n.x(dev.idhammai.c.r.q.D.T.Grim)) {
            if (!dev.idhammai.P.A.L.l.b()) {
                return;
            }
            int n2 = 0;
            class_238 class_2383 = this.hk.h() ? dev.idhammai.c.r.q.D.e.W.field_1724.method_5829() : dev.idhammai.c.r.q.D.e.W.field_1724.method_5829().method_1014(1.0);
            for (class_1297 class_12972 : Frog.THREAD.z()) {
                class_238 class_2384 = class_12972.method_5829();
                if (this.F.h() && dev.idhammai.c.r.q.D.e.W.field_1724.method_24828() && class_12972 instanceof class_1690 && class_2383.method_994(class_2384.method_1014(this.Q.e()))) {
                    double d2 = Math.toRadians(dev.idhammai.c.r.q.D.l.U(dev.idhammai.c.r.q.D.e.W.field_1724.method_36454()));
                    double d3 = this.ha.e();
                    dev.idhammai.c.r.q.D.e.W.field_1724.method_18800(-Math.sin(d2) * d3, this.B.e(), Math.cos(d2) * d3);
                    return;
                }
                if (!class_2383.method_994(class_2384) || !this.V(class_12972)) continue;
                ++n2;
            }
            double d4 = Math.toRadians(dev.idhammai.c.r.q.D.l.U(dev.idhammai.c.r.q.D.e.W.field_1724.method_36454()));
            double d5 = this.b.e() * (double)n2;
            dev.idhammai.c.r.q.D.e.W.field_1724.method_5762(-Math.sin(d4) * d5, 0.0, Math.cos(d4) * d5);
        }
    }

    private boolean V(class_1297 class_12972) {
        return class_12972 != dev.idhammai.c.r.q.D.e.W.field_1724 && class_12972 instanceof class_1309 && !(class_12972 instanceof class_1531);
    }

    @r
    public void U(dev.idhammai.P.r.c.T t2) {
        double d2;
        if (!dev.idhammai.P.A.L.l.b() && this.A.h() && !this.n.x(dev.idhammai.c.r.q.D.T.Grim)) {
            dev.idhammai.P.A.L.l.U(0.0);
            dev.idhammai.P.A.L.l.Q(0.0);
        }
        if (!this.l.h() && (dev.idhammai.c.r.q.D.e.W.field_1724.method_5869() || dev.idhammai.c.r.q.D.e.W.field_1724.method_5799() || dev.idhammai.c.r.q.D.e.W.field_1724.method_5771()) || dev.idhammai.c.r.q.D.e.W.field_1724.method_3144() || dev.idhammai.c.r.q.D.e.W.field_1724.method_21754() || !this.hI.h() && dev.idhammai.P.A.L.e.j() || dev.idhammai.c.r.q.D.e.W.field_1724.method_31549().field_7479 || dev.idhammai.c.r.q.D.e.W.field_1724.method_6128() || !dev.idhammai.P.A.L.l.b()) {
            this.c();
            this.P = true;
            return;
        }
        if (this.n.x(dev.idhammai.c.r.q.D.T.Strafe)) {
            double d3;
            double d4;
            if (this.p.h()) {
                d4 = (double)this.L.G() / 1000.0;
                this.L.H();
                boolean bl = this.g.G();
                boolean bl2 = false;
                if (this.hA != -1.0) {
                    d3 = this.hA - this.y;
                    if (d3 < this.E.e()) {
                        bl2 = true;
                    } else if (!bl) {
                        this.hA = -1.0;
                    }
                } else if (bl) {
                    if (this.y < this.E.e()) {
                        bl = false;
                    } else if (System.currentTimeMillis() - this.u < (long)(this.C.e() * 1000.0)) {
                        bl = false;
                    }
                }
                if (bl || bl2) {
                    if (bl && this.hA == -1.0) {
                        this.hA = this.y;
                    }
                    d3 = d4 / Math.max(0.1, this.U.e());
                    this.y -= d3;
                    this.u = System.currentTimeMillis();
                    if (this.y < 0.0) {
                        this.y = 0.0;
                        this.hA = -1.0;
                    }
                    this.Y = this.y > 0.0;
                } else {
                    this.hA = -1.0;
                    if (System.currentTimeMillis() - this.u >= (long)(this.s.e() * 1000.0)) {
                        d3 = d4 / Math.max(0.1, this.G.e());
                        this.y += d3;
                        if (this.y > 1.0) {
                            this.y = 1.0;
                        }
                    }
                    this.Y = false;
                }
            } else {
                this.Y = false;
            }
            if (this.P) {
                this.P = false;
                return;
            }
            if (!this.h7.m(this.f.V())) {
                return;
            }
            double d5 = d4 = this.p.h() && this.Y ? this.j.e() : this.a.e();
            if (this.w == 1) {
                this.T = 1.35 * dev.idhammai.P.A.L.l.I(this.K.h(), d4) - 0.01;
            } else if (this.w == 2 && dev.idhammai.c.r.q.D.e.W.field_1724.method_24828() && (dev.idhammai.c.r.q.D.e.W.field_1690.field_1903.method_1434() || this.m.h())) {
                double d6 = 0.3999 + dev.idhammai.P.A.L.l.I();
                dev.idhammai.P.A.L.l.d(d6);
                t2.Z(d6);
                this.T *= this.J ? 1.6835 : 1.395;
            } else if (this.w == 3) {
                this.T = this.r - 0.66 * (this.r - dev.idhammai.P.A.L.l.I(this.K.h(), d4));
                this.J = !this.J;
            } else {
                if ((dev.idhammai.P.A.l.M.d(null, dev.idhammai.c.r.q.D.e.W.field_1724.method_5829().method_989(0.0, dev.idhammai.P.A.L.l.R(), 0.0)) || dev.idhammai.c.r.q.D.e.W.field_1724.field_34927) && this.w > 0) {
                    this.w = 1;
                }
                this.T = this.r - this.r / 159.0;
            }
            this.T = Math.min(this.T, 10.0);
            this.T = Math.max(this.T, dev.idhammai.P.A.L.l.I(this.K.h(), d4));
            double d7 = dev.idhammai.c.r.q.D.e.W.field_1724.field_3913.field_3905;
            d3 = dev.idhammai.c.r.q.D.e.W.field_1724.field_3913.field_3907;
            double d8 = dev.idhammai.c.r.q.D.e.W.field_1724.method_36454();
            if (d7 == 0.0 && d3 == 0.0) {
                t2.C(0.0);
                t2.p(0.0);
            } else if (d7 != 0.0 && d3 != 0.0) {
                d7 *= Math.sin(0.7853981633974483);
                d3 *= Math.cos(0.7853981633974483);
            }
            t2.C((d7 * this.T * -Math.sin(Math.toRadians(d8)) + d3 * this.T * Math.cos(Math.toRadians(d8))) * 0.99);
            t2.p((d7 * this.T * Math.cos(Math.toRadians(d8)) - d3 * this.T * -Math.sin(Math.toRadians(d8))) * 0.99);
            ++this.w;
            return;
        }
        double d9 = 1.0;
        double d10 = 1.0;
        if (dev.idhammai.c.r.q.D.e.W.field_1724.method_6059(class_1294.field_5904)) {
            d2 = dev.idhammai.c.r.q.D.e.W.field_1724.method_6112(class_1294.field_5904).method_5578();
            d9 = 1.0 + 0.2 * (d2 + 1.0);
        }
        if (dev.idhammai.c.r.q.D.e.W.field_1724.method_6059(class_1294.field_5909)) {
            d2 = dev.idhammai.c.r.q.D.e.W.field_1724.method_6112(class_1294.field_5909).method_5578();
            d10 = 1.0 + 0.2 * (d2 + 1.0);
        }
        double d11 = (double)0.2873f * d9 / d10;
        float f2 = 0.0f;
        if (dev.idhammai.c.r.q.D.e.W.field_1724.method_6059(class_1294.field_5913)) {
            f2 += (float)(dev.idhammai.c.r.q.D.e.W.field_1724.method_6112(class_1294.field_5913).method_5578() + 1) * 0.1f;
        }
        if (this.n.X() == dev.idhammai.c.r.q.D.T.StrafeStrict) {
            if (!this.h7.m(this.f.V())) {
                return;
            }
            if (this.Z == 1) {
                this.T = (double)1.35f * d11 - (double)0.01f;
            } else if (this.Z == 2) {
                if (dev.idhammai.c.r.q.D.e.W.field_1724.field_3913.field_3904 || !dev.idhammai.c.r.q.D.e.W.field_1724.method_24828()) {
                    return;
                }
                float f3 = 0.39999995f + f2;
                t2.Z(f3);
                dev.idhammai.P.A.L.l.d(f3);
                this.T *= 2.149;
            } else if (this.Z == 3) {
                double d12 = 0.66 * (this.r - d11);
                this.T = this.r - d12;
            } else {
                if ((!dev.idhammai.c.r.q.D.e.W.field_1687.method_8587((class_1297)dev.idhammai.c.r.q.D.e.W.field_1724, dev.idhammai.c.r.q.D.e.W.field_1724.method_5829().method_989(0.0, dev.idhammai.c.r.q.D.e.W.field_1724.method_18798().method_10214(), 0.0)) || dev.idhammai.c.r.q.D.e.W.field_1724.field_5992) && this.Z > 0) {
                    this.Z = 1;
                }
                this.T = this.r - this.r / 159.0;
            }
            ++this.h;
            this.T = Math.max(this.T, d11);
            double d13 = 0.465 * d9 / d10;
            double d14 = 0.44 * d9 / d10;
            this.T = Math.min(this.T, this.h > 25 ? d13 : d14);
            if (this.h > 50) {
                this.h = 0;
            }
            class_241 class_2412 = this.z((float)this.T);
            t2.C(class_2412.field_1343);
            t2.p(class_2412.field_1342);
            ++this.Z;
        }
    }

    public class_241 z(float f2) {
        float f3 = dev.idhammai.c.r.q.D.e.W.field_1724.field_3913.field_3905;
        float f4 = dev.idhammai.c.r.q.D.e.W.field_1724.field_3913.field_3907;
        float f5 = dev.idhammai.c.r.q.D.e.W.field_1724.field_5982 + (dev.idhammai.c.r.q.D.e.W.field_1724.method_36454() - dev.idhammai.c.r.q.D.e.W.field_1724.field_5982) * W.method_60646().method_60637(true);
        if (f3 == 0.0f && f4 == 0.0f) {
            return class_241.field_1340;
        }
        if (f3 != 0.0f) {
            if (f4 >= 1.0f) {
                f5 += f3 > 0.0f ? -45.0f : 45.0f;
                f4 = 0.0f;
            } else if (f4 <= -1.0f) {
                f5 += f3 > 0.0f ? 45.0f : -45.0f;
                f4 = 0.0f;
            }
            if (f3 > 0.0f) {
                f3 = 1.0f;
            } else if (f3 < 0.0f) {
                f3 = -1.0f;
            }
        }
        float f6 = (float)Math.cos(Math.toRadians(f5));
        float f7 = (float)(-Math.sin(Math.toRadians(f5)));
        return new class_241(f3 * f2 * f7 + f4 * f2 * f6, f3 * f2 * f6 - f4 * f2 * f7);
    }

    public void c() {
        this.Z = 4;
        this.h = 0;
        this.T = 0.0;
        this.r = 0.0;
    }

    private boolean lambda$new$17() {
        return this.n.x(dev.idhammai.c.r.q.D.T.Strafe);
    }

    private boolean lambda$new$16() {
        return this.n.x(dev.idhammai.c.r.q.D.T.Strafe);
    }

    private boolean lambda$new$15() {
        return this.n.x(dev.idhammai.c.r.q.D.T.Strafe);
    }

    private boolean lambda$new$14() {
        return this.n.x(dev.idhammai.c.r.q.D.T.Strafe);
    }

    private boolean lambda$new$13() {
        return this.n.x(dev.idhammai.c.r.q.D.T.Strafe);
    }

    private boolean lambda$new$12() {
        return this.n.x(dev.idhammai.c.r.q.D.T.Strafe);
    }

    private boolean lambda$new$11() {
        return !this.n.x(dev.idhammai.c.r.q.D.T.Grim);
    }

    private boolean lambda$new$10() {
        return this.n.x(dev.idhammai.c.r.q.D.T.Strafe);
    }

    private boolean lambda$new$9() {
        return this.n.x(dev.idhammai.c.r.q.D.T.Strafe);
    }

    private boolean lambda$new$8() {
        return !this.n.x(dev.idhammai.c.r.q.D.T.Grim);
    }

    private boolean lambda$new$7() {
        return !this.n.x(dev.idhammai.c.r.q.D.T.Grim);
    }

    private boolean lambda$new$6() {
        return !this.n.x(dev.idhammai.c.r.q.D.T.Grim);
    }

    private boolean lambda$new$5() {
        return this.n.x(dev.idhammai.c.r.q.D.T.Grim);
    }

    private boolean lambda$new$4() {
        return this.n.x(dev.idhammai.c.r.q.D.T.Grim);
    }

    private boolean lambda$new$3() {
        return this.n.x(dev.idhammai.c.r.q.D.T.Grim);
    }

    private boolean lambda$new$2() {
        return this.n.x(dev.idhammai.c.r.q.D.T.Grim);
    }

    private boolean lambda$new$1() {
        return this.n.x(dev.idhammai.c.r.q.D.T.Grim);
    }

    private boolean lambda$new$0() {
        return this.n.x(dev.idhammai.c.r.q.D.T.Grim);
    }
}

