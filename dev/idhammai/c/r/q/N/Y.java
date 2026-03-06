/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.N;

import dev.idhammai.P.A.J;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.L;
import dev.idhammai.c.r.q.N.P;
import dev.idhammai.c.y.u.I.t;

public class Y {
    final P U;

    public Y(P p2) {
        this.U = p2;
    }

    @r(D=-99999)
    public void S(L l2) {
        if (this.U.p.h()) {
            if (this.U.pO > 0.0 || this.U.p()) {
                this.U.pO = this.U.pf.g(this.U.p() ? 1.0 : 0.0, this.U.pZ.V(), this.U.pP.X());
            }
            if (this.U.pO > 0.0 && !(J.W.field_1755 instanceof t)) {
                l2.a.method_51448().method_22903();
                l2.a.method_51448().method_46416(0.0f, 0.0f, 5000.0f);
                t.a().method_25394(l2.a, 0, 0, l2.S);
                l2.a.method_51448().method_22909();
            }
        } else {
            this.U.pO = 1.0;
        }
    }
}

