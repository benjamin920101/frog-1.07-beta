/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.D;

import dev.idhammai.P.A.L.l;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.G;
import dev.idhammai.P.r.c.T;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;

public class p
extends y {
    public static p c;
    public final dev.idhammai.c.r.O.Y.l t = this.p(new dev.idhammai.c.r.O.Y.l("Speed", 0.2, 0.0, 1.0, 0.01).D("\u6c34\u5e73\u901f\u5ea6"));
    public final dev.idhammai.c.r.O.Y.l K = this.p(new dev.idhammai.c.r.O.Y.l("DownFactor", 0.0, 0.0, 1.0, 1.0E-6).D("\u81ea\u7136\u4e0b\u6c89"));
    private final dev.idhammai.c.r.O.Y.l a = this.p(new dev.idhammai.c.r.O.Y.l("DownSpeed", 0.2, 0.0, 1.0, 0.01).D("\u6f5c\u884c\u4e0b\u6c89\u901f\u5ea6"));
    private final dev.idhammai.c.r.O.Y.l C = this.p(new dev.idhammai.c.r.O.Y.l("UpSpeed", 0.2, 0.0, 1.0, 0.01).D("\u4e0a\u6d6e\u901f\u5ea6"));
    private T E;

    public p() {
        super("FastSwim", w.Movement);
        this.L("\u5feb\u901f\u6e38\u6cf3");
        c = this;
    }

    @r
    public void g(G g2) {
        if (p.W.field_1724.method_52535()) {
            p.W.field_1724.field_3913.field_3903 = false;
        }
    }

    @r
    public void I(T t2) {
        if (p.M()) {
            return;
        }
        if (p.W.field_1724.method_52535()) {
            this.E = t2;
            if (!p.W.field_1690.field_1832.method_1434() || !p.W.field_1724.field_3913.field_3904) {
                if (p.W.field_1690.field_1832.method_1434()) {
                    this.a(-this.a.e());
                } else if (p.W.field_1724.field_3913.field_3904) {
                    this.a(this.C.e());
                } else {
                    this.a(-this.K.e());
                }
            } else {
                this.a(0.0);
            }
            double[] dArray = l.h(this.t.e());
            this.s(dArray[0]);
            this.v(dArray[1]);
        }
    }

    private void s(double d2) {
        this.E.C(d2);
        l.U(d2);
    }

    private void a(double d2) {
        this.E.Z(d2);
        l.d(d2);
    }

    private void v(double d2) {
        this.E.p(d2);
        l.Q(d2);
    }
}

