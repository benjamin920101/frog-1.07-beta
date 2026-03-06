/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.D;

import dev.idhammai.P.A.L.e;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.T;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;

public class O
extends y {
    public static O d;
    private final l J = this.p(new l("Speed", 10.0, 0.0, 20.0, 1.0).D("\u5e38\u89c4\u901f\u5ea6").P("%"));
    private final l F = this.p(new l("AnchorSpeed", 3.0, 0.0, 20.0, 1.0).D("\u951a\u70b9\u901f\u5ea6").P("%"));

    public O() {
        super("BlockStrafe", w.Movement);
        this.L("\u65b9\u5757\u7075\u6d3b\u79fb\u52a8");
        d = this;
    }

    @r
    public void M(T t2) {
        if (!e.j()) {
            return;
        }
        double d2 = dev.idhammai.c.r.q.A.O.c.GD == null ? this.J.e() : this.F.e();
        double d3 = 0.002873 * d2;
        double d4 = O.W.field_1724.field_3913.field_3905;
        double d5 = O.W.field_1724.field_3913.field_3907;
        double d6 = O.W.field_1724.method_36454();
        if (d4 == 0.0 && d5 == 0.0) {
            t2.C(0.0);
            t2.p(0.0);
            return;
        }
        if (d4 != 0.0 && d5 != 0.0) {
            d4 *= Math.sin(0.7853981633974483);
            d5 *= Math.cos(0.7853981633974483);
        }
        t2.C(d4 * d3 * -Math.sin(Math.toRadians(d6)) + d5 * d3 * Math.cos(Math.toRadians(d6)));
        t2.p(d4 * d3 * Math.cos(Math.toRadians(d6)) - d5 * d3 * -Math.sin(Math.toRadians(d6)));
    }
}

