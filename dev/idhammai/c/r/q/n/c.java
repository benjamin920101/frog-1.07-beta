/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.n;

import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.R;
import dev.idhammai.c.r.q.n.t;

public class c {
    final t b;

    public c(t t2) {
        this.b = t2;
    }

    @r
    public void V(R r2) {
        if (this.b.p()) {
            this.b.V = this.b.r.g(this.b.k.e(), this.b.a.V(), this.b.D.X());
            t.w = true;
        } else if (t.w) {
            this.b.V = this.b.r.g(0.0, this.b.a.V(), this.b.D.X());
            if ((int)this.b.V == 0) {
                t.w = false;
            }
        }
    }
}

