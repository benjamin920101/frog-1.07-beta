/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.D;

import dev.idhammai.P.A.J;
import dev.idhammai.P.A.L.e;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.v;
import dev.idhammai.c.r.q.D.Q;
import dev.idhammai.c.r.y;

public class b {
    boolean T;
    final Q O;

    public b(Q q2) {
        this.O = q2;
    }

    @r
    public void d(v v2) {
        if (y.M() || v2.C()) {
            return;
        }
        if (this.O.j.h() && !e.n()) {
            return;
        }
        if (J.W.field_1755 == null) {
            if (this.O.P.G()) {
                if (!(this.T || !this.O.k.m(this.O.E.V()) || J.W.field_1724.method_6115() && this.O.Qd.h() || !this.O.z())) {
                    this.O.M();
                    this.O.k.H();
                }
                this.T = true;
            } else {
                this.T = false;
            }
        } else {
            this.T = false;
        }
    }
}

