/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.P.r.c;

import dev.idhammai.P.r.L;

public class r
extends L {
    private static final r V = new r();
    private boolean x;

    private r() {
    }

    public static r w() {
        r.V.x = false;
        V.G(false);
        return V;
    }

    public boolean I() {
        return this.x;
    }

    public void o(boolean bl) {
        this.x = bl;
    }
}

