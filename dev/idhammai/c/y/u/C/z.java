/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.y.u.C;

import dev.idhammai.c.y.u.C.Q;

class z
implements Runnable {
    final String G;
    final String F;
    final Q j;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    z(Q q2, String string, String string2) {
        this.j = q2;
        this.G = string;
        this.F = string2;
    }

    @Override
    public void run() {
        String string = this.j.H(this.G);
        if (string != null) {
            System.currentTimeMillis();
        }
        this.j.W(this.F);
    }
}

