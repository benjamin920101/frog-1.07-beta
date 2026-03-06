/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1536
 *  net.minecraft.class_1937
 *  net.minecraft.class_2246
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2350$class_2352
 *  net.minecraft.class_238
 *  net.minecraft.class_2596
 *  net.minecraft.class_2663
 *  net.minecraft.class_2708
 *  net.minecraft.class_2828$class_2830
 *  net.minecraft.class_2846
 *  net.minecraft.class_2846$class_2847
 */
package dev.idhammai.c.r.q.D;

import dev.idhammai.Frog;
import dev.idhammai.P.A.A.h;
import dev.idhammai.P.A.L.e;
import dev.idhammai.P.A.L.l;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.A;
import dev.idhammai.P.r.c.F;
import dev.idhammai.P.r.c.i;
import dev.idhammai.c.r.O.Y.B;
import dev.idhammai.c.r.q.D.s;
import dev.idhammai.c.r.q.Q.W;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import net.minecraft.class_1297;
import net.minecraft.class_1536;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_2596;
import net.minecraft.class_2663;
import net.minecraft.class_2708;
import net.minecraft.class_2828;
import net.minecraft.class_2846;

public class f
extends y {
    public static f V;
    private final B<s> g = this.S(new B<s>("Mode", dev.idhammai.c.r.q.D.s.Plain).I("\u6a21\u5f0f").X(dev.idhammai.c.r.q.D.s.Plain, "\u666e\u901a").X(dev.idhammai.c.r.q.D.s.Grim, "Grim").X(dev.idhammai.c.r.q.D.s.Wall, "\u7a7f\u5899").X(dev.idhammai.c.r.q.D.s.None, "\u65e0"));
    private final dev.idhammai.c.r.O.Y.l a = this.p(new dev.idhammai.c.r.O.Y.l("LagPause", 50, 0, 500, this::lambda$new$0).D("\u56de\u62c9\u6682\u505c"));
    public final dev.idhammai.c.r.O.Y.W T = this.S(new dev.idhammai.c.r.O.Y.W("IgnorePearlLag", true, this::lambda$new$1).k("\u5ffd\u7565\u73cd\u73e0\u56de\u62c9").D());
    private final dev.idhammai.c.r.O.Y.l Q = this.p(new dev.idhammai.c.r.O.Y.l("PhaseTime", 250, 0, 1000, this::lambda$new$2).D("\u7a7f\u5899\u65f6\u95f4"));
    public final dev.idhammai.c.r.O.Y.W u = this.S(new dev.idhammai.c.r.O.Y.W("NoRotation", false, this::lambda$new$3).k("\u9501\u5b9a\u65cb\u8f6c"));
    public final dev.idhammai.c.r.O.Y.W J = this.S(new dev.idhammai.c.r.O.Y.W("FlagInWall", false, this::lambda$new$4).k("\u5899\u5185\u53d1\u5305").D());
    public final dev.idhammai.c.r.O.Y.W K = this.S(new dev.idhammai.c.r.O.Y.W("WhilePushOut", false, this::lambda$new$5).k("\u63a8\u79bb\u65b9\u5757\u65f6\u751f\u6548"));
    public final dev.idhammai.c.r.O.Y.W f = this.S(new dev.idhammai.c.r.O.Y.W("Static", false, this::lambda$new$6).k("\u9759\u6b62\u89e6\u53d1"));
    public final dev.idhammai.c.r.O.Y.W Y = this.S(new dev.idhammai.c.r.O.Y.W("CancelAll", false, this::lambda$new$7).k("\u5168\u90e8\u53d6\u6d88"));
    private final dev.idhammai.c.r.O.Y.l R = this.p(new dev.idhammai.c.r.O.Y.l("Horizontal", 0.0, 0.0, 100.0, 1.0, this::lambda$new$8).D("\u6c34\u5e73\u6bd4\u4f8b"));
    private final dev.idhammai.c.r.O.Y.l y = this.p(new dev.idhammai.c.r.O.Y.l("Vertical", 0.0, 0.0, 100.0, 1.0, this::lambda$new$9).D("\u5782\u76f4\u6bd4\u4f8b"));
    public final dev.idhammai.c.r.O.Y.W j = this.S(new dev.idhammai.c.r.O.Y.W("WhileLiquid", false).k("\u6db2\u4f53\u4e2d\u751f\u6548"));
    public final dev.idhammai.c.r.O.Y.W h = this.S(new dev.idhammai.c.r.O.Y.W("FallFlying", false).k("\u9798\u7fc5\u65f6\u751f\u6548"));
    public final dev.idhammai.c.r.O.Y.W r = this.S(new dev.idhammai.c.r.O.Y.W("NoClimb", false).k("\u65e0\u6500\u722c\u63a8\u529b"));
    public final dev.idhammai.c.r.O.Y.W H = this.S(new dev.idhammai.c.r.O.Y.W("NoWaterPush", false).k("\u65e0\u6c34\u6d41\u63a8\u529b"));
    public final dev.idhammai.c.r.O.Y.W F = this.S(new dev.idhammai.c.r.O.Y.W("NoEntityPush", true).k("\u65e0\u5b9e\u4f53\u63a8\u529b"));
    public final dev.idhammai.c.r.O.Y.W D = this.S(new dev.idhammai.c.r.O.Y.W("NoBlockPush", true).k("\u65e0\u65b9\u5757\u63a8\u529b"));
    public final dev.idhammai.c.r.O.Y.W B = this.S(new dev.idhammai.c.r.O.Y.W("NoFishBob", true).k("\u65e0\u9c7c\u94a9\u62c9\u626f"));
    public final h p = new h();
    private final h N = new h();
    private boolean s;
    static boolean P;

    public f() {
        super("Velocity", w.Movement);
        this.L("\u53cd\u51fb\u9000");
        V = this;
    }

    @Override
    public String I() {
        if (this.g.x(dev.idhammai.c.r.q.D.s.None)) {
            return null;
        }
        return this.g.X().name() + ", " + (String)(this.Y.h() ? "Cancel" : this.R.V() + "%, " + this.y.V() + "%");
    }

    @r
    public void i(A a2) {
        if (this.f()) {
            a2.g(Frog.ROTATION.Q, 89.0f);
        }
    }

    public boolean f() {
        return this.p() && (this.g.x(dev.idhammai.c.r.q.D.s.Grim) || this.g.x(dev.idhammai.c.r.q.D.s.Wall)) && e.j() && this.u.h();
    }

    @r
    public void V(dev.idhammai.P.r.c.w w2) {
        if (dev.idhammai.c.r.q.D.f.M()) {
            return;
        }
        if (w2.W() != dev.idhammai.c.r.q.D.f.W.field_1724) {
            return;
        }
        if (this.g.x(dev.idhammai.c.r.q.D.s.None)) {
            return;
        }
        if (dev.idhammai.c.r.q.D.f.W.field_1724.method_52535() && !this.j.h()) {
            return;
        }
        if (dev.idhammai.c.r.q.D.f.W.field_1724.method_6128() && !this.h.h()) {
            return;
        }
        switch (this.g.X().ordinal()) {
            case 1: {
                if (!this.N.S(this.a.e())) {
                    return;
                }
                if (e.j() || this.r() != null || this.f.h() && l.j()) {
                    if (w2.n() == 0.0 && w2.V() == 0.0) break;
                    this.s = true;
                    break;
                }
                return;
            }
            case 2: {
                if (!this.N.S(this.a.e())) {
                    return;
                }
                if (e.j()) {
                    if (w2.n() == 0.0 && w2.V() == 0.0) break;
                    this.s = true;
                    break;
                }
                return;
            }
        }
        if (this.Y.h()) {
            w2.L();
        } else {
            double d2 = (double)this.R.V() / 100.0;
            double d3 = (double)this.y.V() / 100.0;
            w2.g(w2.n() * d2);
            w2.N(w2.V() * d2);
            w2.r(w2.t() * d3);
        }
    }

    @r
    public void V(i i2) {
        class_1536 class_15362;
        class_1297 class_12972;
        class_2663 class_26632;
        if (i2.L() instanceof class_2708 && (!this.T.h() || this.p.m(this.Q.V()))) {
            this.N.H();
        }
        if (dev.idhammai.c.r.q.D.f.M()) {
            return;
        }
        if (dev.idhammai.c.r.q.D.f.W.field_1724.method_52535() && !this.j.h()) {
            return;
        }
        if (this.B.h() && i2.L() instanceof class_2663 && (class_26632 = (class_2663)i2.L()).method_11470() == 31 && (class_12972 = class_26632.method_11469((class_1937)dev.idhammai.c.r.q.D.f.W.field_1687)) instanceof class_1536 && (class_15362 = (class_1536)class_12972).method_26957() == dev.idhammai.c.r.q.D.f.W.field_1724) {
            i2.G(true);
        }
    }

    @r
    public void b(F f2) {
        if (dev.idhammai.c.r.q.D.f.M()) {
            return;
        }
        if (f2.C() || dev.idhammai.c.r.q.D.f.W.field_1724.method_52535() && !this.j.h()) {
            return;
        }
        if (this.J.h()) {
            P = false;
            dev.idhammai.c.r.q.D.f.n(dev.idhammai.c.r.q.D.f.W.field_1724.method_23317() - (double)dev.idhammai.c.r.q.D.f.W.field_1724.method_17681() * 0.35, dev.idhammai.c.r.q.D.f.W.field_1724.method_23321() + (double)dev.idhammai.c.r.q.D.f.W.field_1724.method_17681() * 0.35);
            dev.idhammai.c.r.q.D.f.n(dev.idhammai.c.r.q.D.f.W.field_1724.method_23317() - (double)dev.idhammai.c.r.q.D.f.W.field_1724.method_17681() * 0.35, dev.idhammai.c.r.q.D.f.W.field_1724.method_23321() - (double)dev.idhammai.c.r.q.D.f.W.field_1724.method_17681() * 0.35);
            dev.idhammai.c.r.q.D.f.n(dev.idhammai.c.r.q.D.f.W.field_1724.method_23317() + (double)dev.idhammai.c.r.q.D.f.W.field_1724.method_17681() * 0.35, dev.idhammai.c.r.q.D.f.W.field_1724.method_23321() - (double)dev.idhammai.c.r.q.D.f.W.field_1724.method_17681() * 0.35);
            dev.idhammai.c.r.q.D.f.n(dev.idhammai.c.r.q.D.f.W.field_1724.method_23317() + (double)dev.idhammai.c.r.q.D.f.W.field_1724.method_17681() * 0.35, dev.idhammai.c.r.q.D.f.W.field_1724.method_23321() + (double)dev.idhammai.c.r.q.D.f.W.field_1724.method_17681() * 0.35);
        }
        if (W.b.p() && W.b.m.h()) {
            return;
        }
        if (this.s) {
            if (this.N.S(this.a.e()) && (this.J.h() && (!P || this.K.h()) || !e.j())) {
                W.method_1562().method_52787((class_2596)new class_2828.class_2830(dev.idhammai.c.r.q.D.f.W.field_1724.method_23317(), dev.idhammai.c.r.q.D.f.W.field_1724.method_23318(), dev.idhammai.c.r.q.D.f.W.field_1724.method_23321(), Frog.ROTATION.Q, Frog.ROTATION.g, dev.idhammai.c.r.q.D.f.W.field_1724.method_24828()));
                class_2338 class_23382 = this.r();
                if (class_23382 != null) {
                    W.method_1562().method_52787((class_2596)new class_2846(class_2846.class_2847.field_12973, class_23382, dev.idhammai.c.r.q.D.f.W.field_1724.method_5735().method_10153()));
                }
            }
            this.s = false;
        }
    }

    public class_2338 r() {
        if (dev.idhammai.c.r.q.D.f.W.field_1687.method_8320(dev.idhammai.c.r.q.D.f.W.field_1724.method_24515().method_10074()).method_26204() == class_2246.field_10540) {
            return dev.idhammai.c.r.q.D.f.W.field_1724.method_24515().method_10074();
        }
        return null;
    }

    private static void n(double d2, double d3) {
        class_2338 class_23382 = class_2338.method_49637((double)d2, (double)dev.idhammai.c.r.q.D.f.W.field_1724.method_23318(), (double)d3);
        if (dev.idhammai.c.r.q.D.f.j(class_23382)) {
            double d4 = d2 - (double)class_23382.method_10263();
            double d5 = d3 - (double)class_23382.method_10260();
            class_2350 class_23502 = null;
            double d6 = Double.MAX_VALUE;
            class_2350[] class_2350Array = new class_2350[]{class_2350.field_11039, class_2350.field_11034, class_2350.field_11043, class_2350.field_11035};
            for (class_2350 class_23503 : class_2350Array) {
                double d7 = class_23503.method_10166().method_10172(d4, 0.0, d5);
                double d8 = class_23503.method_10171() == class_2350.class_2352.field_11056 ? 1.0 - d7 : d7;
                double d9 = d8;
                if (!(d8 < d6) || dev.idhammai.c.r.q.D.f.j(class_23382.method_10093(class_23503))) continue;
                d6 = d8;
                class_23502 = class_23503;
            }
            if (class_23502 != null) {
                P = true;
            }
        }
    }

    private static boolean j(class_2338 class_23382) {
        class_238 class_2383 = dev.idhammai.c.r.q.D.f.W.field_1724.method_5829();
        class_238 class_2384 = new class_238((double)class_23382.method_10263(), class_2383.field_1322, (double)class_23382.method_10260(), (double)class_23382.method_10263() + 1.0, class_2383.field_1325, (double)class_23382.method_10260() + 1.0).method_1011(1.0E-7);
        return dev.idhammai.c.r.q.D.f.W.field_1724.method_37908().method_39454((class_1297)dev.idhammai.c.r.q.D.f.W.field_1724, class_2384);
    }

    private boolean lambda$new$9() {
        return !this.g.x(dev.idhammai.c.r.q.D.s.None) && !this.Y.h();
    }

    private boolean lambda$new$8() {
        return !this.g.x(dev.idhammai.c.r.q.D.s.None) && !this.Y.h();
    }

    private boolean lambda$new$7() {
        return !this.g.x(dev.idhammai.c.r.q.D.s.None);
    }

    private boolean lambda$new$6() {
        return this.g.x(dev.idhammai.c.r.q.D.s.Grim);
    }

    private boolean lambda$new$5() {
        return (this.g.x(dev.idhammai.c.r.q.D.s.Grim) || this.g.x(dev.idhammai.c.r.q.D.s.Wall)) && this.J.f();
    }

    private boolean lambda$new$4() {
        return this.g.x(dev.idhammai.c.r.q.D.s.Grim) || this.g.x(dev.idhammai.c.r.q.D.s.Wall);
    }

    private boolean lambda$new$3() {
        return this.g.x(dev.idhammai.c.r.q.D.s.Grim) || this.g.x(dev.idhammai.c.r.q.D.s.Wall);
    }

    private boolean lambda$new$2() {
        return (this.g.x(dev.idhammai.c.r.q.D.s.Grim) || this.g.x(dev.idhammai.c.r.q.D.s.Wall)) && this.T.f();
    }

    private boolean lambda$new$1() {
        return this.g.x(dev.idhammai.c.r.q.D.s.Grim) || this.g.x(dev.idhammai.c.r.q.D.s.Wall);
    }

    private boolean lambda$new$0() {
        return this.g.x(dev.idhammai.c.r.q.D.s.Grim) || this.g.x(dev.idhammai.c.r.q.D.s.Wall);
    }

    static {
        P = false;
    }
}

