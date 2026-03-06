/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.effect.StatusEffects
 */
package dev.idhammai.c.r.q.D;

import dev.idhammai.P.A.L.l;
import dev.idhammai.P.A.R.F;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.T;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.q.D.e;
import dev.idhammai.c.r.q.D.x;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import java.util.Objects;
import net.minecraft.entity.effect.StatusEffects;

public class P
extends y {
    public static P w;
    private final W d = this.S(new W("AirStop", true).k("\u7a7a\u4e2d\u505c\u901f"));
    private final W l = this.S(new W("SlowCheck", true).k("\u51cf\u901f\u68c0\u6d4b"));

    public P() {
        super("Strafe", "Modifies sprinting", dev.idhammai.c.r.w.Movement);
        this.L("\u7075\u6d3b\u79fb\u52a8");
        w = this;
    }

    @r
    public void w(T t2) {
        if (F.D()) {
            return;
        }
        if (P.W.field_1724.method_5715() || x.N.p() || dev.idhammai.c.r.q.D.w.H.p() || e.t.p() || P.W.field_1724.method_6128() || dev.idhammai.P.A.L.e.j() || P.W.field_1724.method_5771() || P.W.field_1724.method_5799() || P.W.field_1724.method_31549().field_7479) {
            return;
        }
        if (!dev.idhammai.P.A.L.l.b()) {
            if (this.d.h()) {
                dev.idhammai.P.A.L.l.U(0.0);
                dev.idhammai.P.A.L.l.Q(0.0);
            }
            return;
        }
        double[] dArray = dev.idhammai.P.A.L.l.h(this.V());
        t2.C(dArray[0]);
        t2.p(dArray[1]);
    }

    public double V() {
        double d2 = 0.2873;
        if (!(!P.W.field_1724.method_6059(class_1294.field_5904) || this.l.h() && P.W.field_1724.method_6059(class_1294.field_5909))) {
            d2 *= 1.0 + 0.2 * (double)(Objects.requireNonNull(P.W.field_1724.method_6112(class_1294.field_5904)).method_5578() + 1);
        }
        return d2;
    }
}

