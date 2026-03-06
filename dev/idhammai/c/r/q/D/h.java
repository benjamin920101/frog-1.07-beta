/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.D;

public final class h
extends Enum<h> {
    public static final /* enum */ h Forward = new h();
    public static final /* enum */ h Path = new h();
    private static final h[] c = h.V();

    public static h[] values() {
        return (h[])c.clone();
    }

    public static h valueOf(String string) {
        return Enum.valueOf(h.class, string);
    }

    private static h[] V() {
        return new h[]{Forward, Path};
    }
}

