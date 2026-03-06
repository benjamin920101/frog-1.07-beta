/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.N.z;

import dev.idhammai.Frog;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.O;
import dev.idhammai.c.r.q.N.z.F;
import dev.idhammai.c.r.q.N.z.W;
import dev.idhammai.c.r.y;

class L {
    final W i;

    private L(W w2) {
        this.i = w2;
    }

    @r
    public void B(O o2) {
        for (y y2 : Frog.MODULE.h()) {
            this.i.c.add(new F(y2));
        }
        Frog.EVENT_BUS.f(this);
    }
}

