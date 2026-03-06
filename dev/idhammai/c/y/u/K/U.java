/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.y.u.K;

import dev.idhammai.Frog;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import dev.idhammai.c.y.R.V.T;
import dev.idhammai.c.y.u.C.K;
import dev.idhammai.c.y.u.K.t;

class U
extends K {
    final w y;
    final t T;

    U(t t2, String string, w w2, int n2, int n3, boolean bl, w w3) {
        this.T = t2;
        this.y = w3;
        super(string, w2, n2, n3, bl);
    }

    @Override
    public void S() {
        for (y y2 : Frog.MODULE.h()) {
            if (!y2.a().equals((Object)this.y) || this.T.z(y2)) continue;
            this.f(new T(y2));
        }
    }
}

