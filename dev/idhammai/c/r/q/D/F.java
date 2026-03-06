/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.D;

import dev.idhammai.P.A.A.S;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.R;
import dev.idhammai.c.r.q.D.e;

public class F {
    final e u;

    public F(e e2) {
        this.u = e2;
    }

    @r
    public void P(R r2) {
        if (this.u.p() && this.u.c.h()) {
            this.u.d = this.u.ht.g(this.u.e.e(), this.u.H.V(), S.CubicInOut);
            e.X = true;
        } else if (e.X) {
            this.u.d = this.u.ht.g(0.0, this.u.H.V(), S.CubicInOut);
            if (Math.abs(this.u.d) < 0.01) {
                this.u.d = 0.0;
                e.X = false;
            }
        }
    }
}

