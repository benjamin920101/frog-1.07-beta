/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.n;

import dev.idhammai.P.A.A.A;
import dev.idhammai.P.A.A.m;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.v;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;

public class M
extends y {
    public static M Z;
    public final W k = this.S(new W("NoFirstPerson", true).k("\u7981\u7528\u7b2c\u4e00\u4eba\u79f0"));
    public final l p = this.p(new l("FirstPersonSpeed", 0.6, 0.0, 1.0, 0.01).D("\u7b2c\u4e00\u4eba\u79f0\u901f\u5ea6"));
    public final l l = this.p(new l("Speed", 0.3, 0.0, 1.0, 0.01).D("\u901f\u5ea6"));
    private double B;
    private double J;
    private double P;
    private double r;
    private double U;
    private double D;

    public M() {
        super("MotionCamera", w.Render);
        Z = this;
        this.L("\u8fd0\u52a8\u76f8\u673a");
    }

    public boolean z() {
        return this.p() && (!this.k.h() || !M.W.field_1690.method_31044().method_31034());
    }

    @Override
    public void H() {
        if (M.M()) {
            return;
        }
        this.B = M.W.field_1724.method_23317();
        this.J = M.W.field_1724.method_23318() + (double)M.W.field_1724.method_18381(M.W.field_1724.method_18376());
        this.P = M.W.field_1724.method_23321();
        this.r = this.B;
        this.U = this.J;
        this.D = this.P;
    }

    @r
    public void m(v v2) {
        if (v2.a() || M.M()) {
            return;
        }
        this.r = this.B;
        this.U = this.J;
        this.D = this.P;
        double d2 = M.W.field_1690.method_31044().method_31034() ? this.p.e() : this.l.e();
        this.B = m.N(this.B, M.W.field_1724.method_23317(), d2);
        this.J = m.N(this.J, M.W.field_1724.method_23318() + (double)M.W.field_1724.method_18381(M.W.field_1724.method_18376()), d2);
        this.P = m.N(this.P, M.W.field_1724.method_23321(), d2);
    }

    public double f() {
        return A.Z(this.r, this.B, W.method_60646().method_60637(true));
    }

    public double Z() {
        return A.Z(this.U, this.J, W.method_60646().method_60637(true));
    }

    public double v() {
        return A.Z(this.D, this.P, W.method_60646().method_60637(true));
    }
}

