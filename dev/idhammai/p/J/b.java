/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.p.J;

import dev.idhammai.c.r.q.i.W;

public class b {
    public float Q = 1.0f;
    public float O;

    public void s(float f2) {
        if (f2 < 0.1f) {
            f2 = 0.1f;
        }
        this.Q = f2;
    }

    public void g() {
        this.O = this.Q = this.L();
    }

    public void O() {
        if (this.O != this.L()) {
            this.g();
        }
    }

    public float N() {
        return this.Q;
    }

    public float L() {
        return W.N.p() ? (W.N.l.G() ? W.N.U.Z() : W.N.E.Z()) : 1.0f;
    }
}

