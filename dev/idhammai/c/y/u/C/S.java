/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.y.u.C;

import dev.idhammai.c.y.u.C.Q;

class S
implements Runnable {
    final String O;
    final Q i;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    S(Q q2, String string) {
        this.i = q2;
        this.O = string;
    }

    @Override
    public void run() {
        this.i.W(this.O);
    }
}

