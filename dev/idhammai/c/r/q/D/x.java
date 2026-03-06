/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.D;

import dev.idhammai.P.A.A.h;
import dev.idhammai.P.A.L.l;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.G;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;

public class x
extends y {
    public static x N;
    private final dev.idhammai.c.r.O.Y.l w = this.p(new dev.idhammai.c.r.O.Y.l("Speed", 2.5, 0.1, 10.0).D("\u6c34\u5e73\u901f\u5ea6"));
    private final dev.idhammai.c.r.O.Y.l c = this.p(new dev.idhammai.c.r.O.Y.l("VerticalSpeed", 1.0, 0.1, 5.0).D("\u5782\u76f4\u901f\u5ea6"));
    private final W Y = this.S(new W("AntiKick", true).k("\u9632\u8e22").D());
    private final W t = this.S(new W("Up", true, this.Y::f).k("\u9632\u8e22\u56de\u62ac"));
    private final W T = this.S(new W("AllowSneak", false).k("\u5141\u8bb8\u6f5c\u884c\u952e"));
    private final h B = new h();
    private final h I = new h();

    public x() {
        super("Fly", dev.idhammai.c.r.w.Movement);
        this.L("\u98de\u884c");
        N = this;
    }

    @Override
    public void F() {
        this.B.H();
        this.I.H();
    }

    @Override
    public void H() {
        if (x.M()) {
            return;
        }
        this.B.H();
        this.I.H();
    }

    @r
    public void Z(QO qO) {
        if (this.B.m(3900L) && this.Y.h() && !x.W.field_1724.method_24828()) {
            l.d(-0.04);
            this.B.H();
        } else if (this.I.m(4000L) && this.Y.h() && !x.W.field_1724.method_24828() && this.t.h()) {
            l.d(0.04);
            this.I.H();
        } else {
            l.d(0.0);
            if (x.W.field_1690.field_1903.method_1434()) {
                l.d(this.c.e());
            } else if (x.W.field_1690.field_1832.method_1434()) {
                l.d(-this.c.e());
            }
        }
        double[] dArray = l.h(this.w.Z());
        l.U(dArray[0]);
        l.Q(dArray[1]);
    }

    @r(D=-100)
    public void j(G g2) {
        if (!this.T.h()) {
            x.W.field_1724.field_3913.field_3903 = false;
        }
    }
}

