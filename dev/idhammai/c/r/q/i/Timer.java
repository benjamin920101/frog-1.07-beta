/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket
 *  net.minecraft.client.font.TextRenderer
 *  net.minecraft.client.gui.DrawContext
 */
package dev.idhammai.c.r.q.i;

import dev.idhammai.Frog;
import dev.idhammai.P.A.A.S;
import dev.idhammai.P.A.A.d;
import dev.idhammai.P.A.A.h;
import dev.idhammai.P.A.L.e;
import dev.idhammai.P.A.L.l;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.P.r.c.i;
import dev.idhammai.c.r.O.Y.A;
import dev.idhammai.c.r.O.Y.B;
import dev.idhammai.c.r.O.Y.O;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import java.awt.Color;
import java.text.DecimalFormat;
import java.util.Objects;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;

public class W
extends y {
    public static W N;
    public final dev.idhammai.c.r.O.Y.l E = this.p(new dev.idhammai.c.r.O.Y.l("Speed", 1.0, 0.1, 5.0, 0.01).D("\u5e38\u89c4\u901f\u5ea6"));
    public final O l = this.n(new O("HoldKey", -1).E("\u6309\u4f4f\u52a0\u901f\u952e"));
    public final dev.idhammai.c.r.O.Y.l U = this.p(new dev.idhammai.c.r.O.Y.l("OnKey", 1.0, 0.1, 10.0, 0.01).D("\u6309\u952e\u500d\u7387"));
    final DecimalFormat X = new DecimalFormat("0.0");
    private final dev.idhammai.c.r.O.Y.W c = this.S(new dev.idhammai.c.r.O.Y.W("TickShift", true).k("TickShift").D());
    private final dev.idhammai.c.r.O.Y.l I = this.p(new dev.idhammai.c.r.O.Y.l("ShiftTimer", 2.0, 1.0, 10.0, 0.1, this.c::f).D("\u51b2\u523a\u8ba1\u65f6"));
    private final dev.idhammai.c.r.O.Y.l F = this.p(new dev.idhammai.c.r.O.Y.l("Charge", 2000.0, 1.0, 10000.0, 50.0, this.c::f).D("\u5145\u80fd\u4e0a\u9650").P("ms"));
    private final dev.idhammai.c.r.O.Y.l B = this.p(new dev.idhammai.c.r.O.Y.l("MinCharge", 500.0, 1.0, 10000.0, 50.0, this.c::f).D("\u6700\u5c0f\u5145\u80fd").P("ms"));
    private final dev.idhammai.c.r.O.Y.W k = this.S(new dev.idhammai.c.r.O.Y.W("Smooth", true, this.c::f).k("\u5e73\u6ed1\u91ca\u653e").D());
    private final B<S> b = this.S(new B<S>("Ease", dev.idhammai.P.A.A.S.CubicInOut, this::lambda$new$0).I("\u7f13\u52a8\u7c7b\u578b"));
    private final dev.idhammai.c.r.O.Y.W g = this.S(new dev.idhammai.c.r.O.Y.W("Reset", true, this.c::f).k("\u505c\u6b62\u65f6\u91cd\u7f6e"));
    private final dev.idhammai.c.r.O.Y.W Z = this.S(new dev.idhammai.c.r.O.Y.W("Indicator", true, this.c::f).k("\u5145\u80fd\u6307\u793a").D());
    private final A L = this.y(new A("Completed", new Color(0, 255, 0), this::lambda$new$1).P("\u5b8c\u6210\u989c\u8272"));
    private final A j = this.y(new A("Charging", new Color(255, 0, 0), this::lambda$new$2).P("\u5145\u80fd\u989c\u8272"));
    private final dev.idhammai.c.r.O.Y.l t = this.p(new dev.idhammai.c.r.O.Y.l("YOffset", 0.0, -200.0, 200.0, 1.0, this::lambda$new$3).D("\u6307\u793a\u504f\u79fb"));
    private final h h = new h();
    private final h w = new h();
    private final d n = new d(500L);
    long f = 0L;
    boolean K = false;

    public W() {
        super("Timer", dev.idhammai.c.r.w.Player);
        this.L("\u65f6\u95f4\u52a0\u901f");
        N = this;
    }

    @Override
    public void L() {
        Frog.TIMER.g();
    }

    @r
    public void T(QO qO) {
        Frog.TIMER.O();
    }

    @Override
    public void H() {
        Frog.TIMER.g();
    }

    @Override
    public void C(class_332 class_3322, float f2) {
        double d2;
        if (!this.c.h()) {
            return;
        }
        this.h.m(Math.min(Math.max(0L, this.h.k()), (long)this.F.V()));
        if (dev.idhammai.P.A.L.l.b() && !e.j()) {
            if (!this.K) {
                if (this.h.S(this.B.e())) {
                    this.w.H();
                    this.f = this.h.k();
                } else {
                    this.f = 0L;
                }
                this.K = true;
            }
            this.h.H();
            if (this.w.m(this.f)) {
                Frog.TIMER.g();
            } else if (this.k.h()) {
                d2 = (double)Frog.TIMER.L() + (1.0 - this.n.M(this.b.X())) * (double)(this.I.Z() - 1.0f) * ((double)this.f / this.F.e());
                Frog.TIMER.s((float)Math.max((double)Frog.TIMER.L(), d2));
            } else {
                Frog.TIMER.s(this.I.Z());
            }
        } else {
            if (this.K) {
                Frog.TIMER.g();
                if (this.g.h()) {
                    this.h.H();
                } else {
                    this.h.m(Math.max(this.f - this.w.k(), 0L));
                }
                this.K = false;
            }
            this.n.S(this.h.k());
            this.n.e();
        }
        if (this.Z.h()) {
            d2 = this.K ? (double)Math.max(this.f - this.w.k(), 0L) : (double)this.h.k();
            boolean bl = this.K && d2 > 0.0 || d2 >= (double)this.B.V();
            double d3 = this.F.e();
            String string = this.X.format(d2 / d3 * 100.0) + "%";
            class_327 class_3272 = W.W.field_1772;
            int n2 = W.method_22683().method_4486() / 2 - W.W.field_1772.method_1727(string) / 2;
            int n3 = W.method_22683().method_4502() / 2;
            Objects.requireNonNull(W.W.field_1772);
            class_3322.method_51433(class_3272, string, n2, n3 + 9 - this.t.V(), bl ? this.L.P().getRGB() : this.j.P().getRGB(), true);
        }
    }

    @Override
    public String I() {
        if (!this.c.h()) {
            return null;
        }
        double d2 = this.K ? (double)Math.max(this.f - this.w.k(), 0L) : (double)this.h.k();
        double d3 = this.F.e();
        double d4 = Math.min(d2 / d3 * 100.0, 100.0);
        return this.X.format(d4) + "%";
    }

    @r
    public void H(i i2) {
        if (i2.L() instanceof class_2708) {
            this.f = 0L;
        }
    }

    private boolean lambda$new$3() {
        return this.Z.f() && this.c.f();
    }

    private boolean lambda$new$2() {
        return this.Z.f() && this.c.f();
    }

    private boolean lambda$new$1() {
        return this.Z.f() && this.c.f();
    }

    private boolean lambda$new$0() {
        return this.k.f() && this.c.f();
    }
}

