/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.Q;

final class L
extends Enum<L> {
    public static final /* enum */ L Random = new L();
    public static final /* enum */ L Switch = new L();
    public static final /* enum */ L Sync = new L();
    private static final L[] G = L.b();

    public static L[] values() {
        return (L[])G.clone();
    }

    public static L valueOf(String string) {
        return Enum.valueOf(L.class, string);
    }

    private static L[] b() {
        return new L[]{Random, Switch, Sync};
    }
}

