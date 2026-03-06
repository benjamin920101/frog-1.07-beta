/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.y.u.I;

import dev.idhammai.Frog;
import dev.idhammai.c.r.q.N.P;

final class I
implements AutoCloseable {
    private final boolean s;

    I(boolean bl) {
        boolean bl2 = this.s = bl && Frog.SHADER != null;
        if (this.s) {
            Frog.SHADER.n(P.M().q());
        }
    }

    @Override
    public void close() {
        if (this.s) {
            Frog.SHADER.v();
        }
    }
}

