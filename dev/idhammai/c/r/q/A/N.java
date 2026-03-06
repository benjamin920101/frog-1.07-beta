/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.A;

final class N
extends Enum<N> {
    public static final /* enum */ N None = new N();
    public static final /* enum */ N Normal = new N();
    public static final /* enum */ N Silent = new N();
    public static final /* enum */ N Inventory = new N();
    private static final N[] y = N.D();

    public static N[] values() {
        return (N[])y.clone();
    }

    public static N valueOf(String string) {
        return Enum.valueOf(N.class, string);
    }

    private static N[] D() {
        return new N[]{None, Normal, Silent, Inventory};
    }
}

