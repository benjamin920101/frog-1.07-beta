/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.y.u.C;

import dev.idhammai.c.y.u.I.f;

public final class q {
    public final f T;
    public final String l;
    public final String s;
    public int N;
    public int O;
    public int h;
    public int a;

    public q(f f2, String string, String string2) {
        this.T = f2;
        this.l = string;
        this.s = string2;
    }

    public String M(boolean bl) {
        if (bl) {
            return this.s == null ? this.l : this.s;
        }
        return this.l;
    }
}

