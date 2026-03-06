/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.N;

import dev.idhammai.c.r.q.N.m;
import dev.idhammai.c.r.q.N.q;
import dev.idhammai.c.r.q.N.u;

public abstract sealed class N
extends Enum<N>
permits u, m, q {
    public static final /* enum */ N PLAIN = new u();
    public static final /* enum */ N BOLD = new m();
    public static final /* enum */ N ITALIC = new q();
    private static final N[] Y = N.N();

    public static N[] values() {
        return (N[])Y.clone();
    }

    public static N valueOf(String string) {
        return Enum.valueOf(N.class, string);
    }

    public abstract int s();

    private static N[] N() {
        return new N[]{PLAIN, BOLD, ITALIC};
    }
}

