/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.y.u.C;

import dev.idhammai.c.y.u.C.Q;

class O
implements Runnable {
    final String I;
    final Q v;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    O(Q q2, String string) {
        this.v = q2;
        this.I = string;
    }

    @Override
    public void run() {
        this.v.V(this.I);
        String string = this.v.R = this.v.z.isEmpty() ? null : this.v.z.get(0);
        if (this.I != null && this.I.equalsIgnoreCase(this.v.W)) {
            this.v.W = null;
        }
    }
}

