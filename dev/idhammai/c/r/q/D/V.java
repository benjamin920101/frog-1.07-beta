/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_4587
 *  org.lwjgl.opengl.GL11
 */
package dev.idhammai.c.r.q.D;

import dev.idhammai.Frog;
import dev.idhammai.P.A.A.h;
import dev.idhammai.P.A.A.m;
import dev.idhammai.P.A.L.g;
import dev.idhammai.P.A.L.l;
import dev.idhammai.P.A.S.K;
import dev.idhammai.P.A.l.M;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.P.r.c.T;
import dev.idhammai.P.r.c.W;
import dev.idhammai.c.r.O.Y.A;
import dev.idhammai.c.r.q.D.Q;
import dev.idhammai.c.r.q.D.f;
import dev.idhammai.c.r.q.D.i;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import java.awt.Color;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_4587;
import org.lwjgl.opengl.GL11;

public class V
extends y {
    private static class_243 U;
    public final dev.idhammai.c.r.O.Y.l f = this.p(new dev.idhammai.c.r.O.Y.l("KeepRotate", 1000.0, 0.0, 3000.0, 10.0).D("\u4fdd\u6301\u8f6c\u5411"));
    private final dev.idhammai.c.r.O.Y.W V = this.S(new dev.idhammai.c.r.O.Y.W("Tower", true).k("\u539f\u5730\u642d\u9ad8"));
    private final dev.idhammai.c.r.O.Y.W n = this.S(new dev.idhammai.c.r.O.Y.W("PacketPlace", false).k("\u53d1\u5305\u653e\u7f6e"));
    private final dev.idhammai.c.r.O.Y.W K = this.S(new dev.idhammai.c.r.O.Y.W("SafeWalk", false).k("\u5b89\u5168\u884c\u8d70"));
    private final dev.idhammai.c.r.O.Y.W j = this.S(new dev.idhammai.c.r.O.Y.W("Rotate", true).k("\u8f6c\u5411").D());
    private final dev.idhammai.c.r.O.Y.W y = this.S(new dev.idhammai.c.r.O.Y.W("YawStep", false, this::lambda$new$0).k("\u5206\u6b65\u8f6c\u5411").D());
    private final dev.idhammai.c.r.O.Y.W G = this.S(new dev.idhammai.c.r.O.Y.W("FallFlying", true, this::lambda$new$1).k("\u9798\u7fc5\u65f6\u542f\u7528"));
    private final dev.idhammai.c.r.O.Y.l h = this.p(new dev.idhammai.c.r.O.Y.l("Steps", 0.05, 0.0, 1.0, 0.01, this::lambda$new$2).D("\u6b65\u8fdb"));
    private final dev.idhammai.c.r.O.Y.W A = this.S(new dev.idhammai.c.r.O.Y.W("OnlyLooking", true, this::lambda$new$3).k("\u4ec5\u89c6\u89d2\u5185").D());
    private final dev.idhammai.c.r.O.Y.l R = this.p(new dev.idhammai.c.r.O.Y.l("Fov", 20.0, 0.0, 360.0, 0.1, this::lambda$new$4).D("\u89c6\u89d2\u8303\u56f4"));
    private final dev.idhammai.c.r.O.Y.l J = this.p(new dev.idhammai.c.r.O.Y.l("Priority", 10, 0, 100, this::lambda$new$5).D("\u8f6c\u5411\u4f18\u5148\u7ea7"));
    private final dev.idhammai.c.r.O.Y.W E = this.S(new dev.idhammai.c.r.O.Y.W("Render", true).k("\u6e32\u67d3").D());
    public final A e = this.y(new A("Color", new Color(255, 255, 255, 100), this.E::f).P("\u586b\u5145\u989c\u8272"));
    public final A d = this.y(new A("OutlineColor", new Color(255, 255, 255, 100), this.E::f).P("\u8fb9\u6846\u989c\u8272"));
    public final dev.idhammai.c.r.O.Y.l C = this.p(new dev.idhammai.c.r.O.Y.l("SliderSpeed", 0.2, 0.01, 1.0, 0.01, this.E::f).D("\u52a8\u753b\u901f\u5ea6"));
    private final dev.idhammai.c.r.O.Y.W u = this.S(new dev.idhammai.c.r.O.Y.W("ESP", true, this.E::f).k("\u5149\u5708"));
    private final dev.idhammai.c.r.O.Y.W l = this.S(new dev.idhammai.c.r.O.Y.W("Fill", true, this.E::f).k("\u586b\u5145"));
    private final dev.idhammai.c.r.O.Y.W D = this.S(new dev.idhammai.c.r.O.Y.W("Box", true, this.E::f).k("\u8fb9\u6846"));
    private final h L = new h();
    private final h m = new h();
    private class_243 H;
    private class_2338 p;

    public V() {
        super("Scaffold", w.Movement);
        this.L("\u81ea\u52a8\u642d\u8def");
    }

    @r(D=-100)
    public void V(T t2) {
        if (!this.K.h()) {
            return;
        }
        i.M.a(t2);
    }

    @r
    public void a(W w2) {
        if (this.j.h() && !this.L.m(this.f.V()) && this.H != null) {
            w2.m(this.H, this.h.Z(), this.J.Z());
        }
    }

    @Override
    public void H() {
        U = null;
        this.p = null;
    }

    @Override
    public void h(class_4587 class_45872) {
        if (this.E.h()) {
            if (this.u.h()) {
                GL11.glEnable((int)3042);
                double d2 = 0.01;
                for (double d3 = 0.0; d3 < 0.8; d3 += d2) {
                    dev.idhammai.c.r.q.D.w.T(class_45872, dev.idhammai.P.A.S.f.y(this.e.P(), (int)Math.min((double)(this.e.P().getAlpha() * 2) / (0.8 / d2), 255.0)), d3, new class_243(dev.idhammai.P.A.A.A.Z(dev.idhammai.c.r.q.D.V.W.field_1724.field_6038, dev.idhammai.c.r.q.D.V.W.field_1724.method_23317(), W.method_60646().method_60637(true)), dev.idhammai.P.A.A.A.Z(dev.idhammai.c.r.q.D.V.W.field_1724.field_5971, dev.idhammai.c.r.q.D.V.W.field_1724.method_23318(), W.method_60646().method_60637(true)), dev.idhammai.P.A.A.A.Z(dev.idhammai.c.r.q.D.V.W.field_1724.field_5989, dev.idhammai.c.r.q.D.V.W.field_1724.method_23321(), W.method_60646().method_60637(true))), 5);
                }
                GL11.glDisable((int)3042);
            }
            if (this.p != null) {
                class_243 class_2432 = this.p.method_46558();
                U = U == null ? class_2432 : new class_243(dev.idhammai.P.A.A.m.N(U.method_10216(), class_2432.field_1352, this.C.e()), dev.idhammai.P.A.A.m.N(U.method_10214(), class_2432.field_1351, this.C.e()), dev.idhammai.P.A.A.m.N(U.method_10215(), class_2432.field_1350, this.C.e()));
                dev.idhammai.P.A.S.K.W(class_45872, new class_238(U.method_1031(0.5, 0.5, 0.5), U.method_1031(-0.5, -0.5, -0.5)), dev.idhammai.P.A.S.f.y(this.e.P(), this.e.P().getAlpha()), dev.idhammai.P.A.S.f.y(this.d.P(), this.d.P().getAlpha()), this.D.h(), this.l.h());
            }
        }
    }

    @r
    public void p(QO qO) {
        int n2 = g.k();
        if (n2 == -1) {
            return;
        }
        class_2338 class_23382 = dev.idhammai.c.r.q.D.V.W.field_1724.method_24515().method_10074();
        if (M.U(class_23382, false)) {
            int n3 = dev.idhammai.c.r.q.D.V.W.field_1724.method_31548().field_7545;
            if (M.x(class_23382) == null) {
                double d2 = 1000.0;
                class_2338 class_23383 = null;
                for (class_2350 class_23502 : class_2350.values()) {
                    if (class_23502 == class_2350.field_11036 || !M.d(class_23382.method_10093(class_23502)) || class_23383 != null && !(dev.idhammai.c.r.q.D.V.W.field_1724.method_5707(class_23382.method_10093(class_23502).method_46558()) < d2)) continue;
                    class_23383 = class_23382.method_10093(class_23502);
                    d2 = dev.idhammai.c.r.q.D.V.W.field_1724.method_5707(class_23382.method_10093(class_23502).method_46558());
                }
                if (class_23383 != null) {
                    class_23382 = class_23383;
                } else {
                    return;
                }
            }
            if (this.j.h()) {
                class_2350 class_23503 = M.x(class_23382);
                this.H = class_23382.method_10093(class_23503).method_46558().method_1031((double)class_23503.method_10153().method_10163().method_10263() * 0.5, (double)class_23503.method_10153().method_10163().method_10264() * 0.5, (double)class_23503.method_10153().method_10163().method_10260() * 0.5);
                this.L.H();
                if (!this.J(this.H)) {
                    return;
                }
            }
            g.j(n2);
            M.R(class_23382, false, this.n.h());
            g.j(n3);
            if (this.j.h()) {
                Frog.ROTATION.M();
            }
            this.p = class_23382;
            if (this.V.h() && dev.idhammai.c.r.q.D.V.W.field_1690.field_1903.method_1434() && !dev.idhammai.P.A.L.l.b()) {
                dev.idhammai.P.A.L.l.d(0.42);
                dev.idhammai.P.A.L.l.U(0.0);
                dev.idhammai.P.A.L.l.Q(0.0);
                if (this.m.m(1500L)) {
                    dev.idhammai.P.A.L.l.d(-0.28);
                    this.m.H();
                }
            } else {
                this.m.H();
            }
        }
    }

    private boolean q() {
        if (!this.G.h() && (dev.idhammai.c.r.q.D.V.W.field_1724.method_6128() || Q.F.p() && Q.F.z())) {
            return false;
        }
        return this.y.h() && !dev.idhammai.c.r.q.D.f.V.f();
    }

    private boolean J(class_243 class_2432) {
        if (!this.q()) {
            Frog.ROTATION.a(class_2432);
            return true;
        }
        if (Frog.ROTATION.k(class_2432, this.R.Z())) {
            return true;
        }
        return !this.A.h();
    }

    private boolean lambda$new$5() {
        return this.j.f() && this.y.f();
    }

    private boolean lambda$new$4() {
        return this.A.f() && this.j.f() && this.y.f();
    }

    private boolean lambda$new$3() {
        return this.j.f() && this.y.f();
    }

    private boolean lambda$new$2() {
        return this.j.f() && this.y.f();
    }

    private boolean lambda$new$1() {
        return this.j.f() && this.y.f() && this.j.f();
    }

    private boolean lambda$new$0() {
        return this.j.f() && this.j.f();
    }
}

