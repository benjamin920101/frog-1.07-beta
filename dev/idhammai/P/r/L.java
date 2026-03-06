/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.P.r;

import dev.idhammai.P.r.O;

public class L {
    public O C;
    private boolean D = false;

    public L() {
        this(O.Pre);
    }

    public L(O o2) {
        this.C = o2;
    }

    public void L() {
        this.G(true);
    }

    public boolean p() {
        return this.D;
    }

    public void G(boolean bl) {
        this.D = bl;
    }

    public boolean C() {
        return this.C == O.Post;
    }

    public boolean a() {
        return this.C == O.Pre;
    }
}

