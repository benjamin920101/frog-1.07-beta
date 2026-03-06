/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.P.r.c;

import dev.idhammai.P.r.L;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class V
extends L {
    private static final V R = new V();
    private float V;
    private boolean O;

    private V() {
    }

    public static V T() {
        dev.idhammai.P.r.c.V.R.V = 1.0f;
        dev.idhammai.P.r.c.V.R.O = false;
        R.G(false);
        return R;
    }

    public float T() {
        return this.V;
    }

    public void K(float f2) {
        this.O = true;
        this.V = f2;
    }

    public boolean I() {
        return this.O;
    }
}

