/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.A;

public final class h
extends Enum<h> {
    public static final /* enum */ h General = new h();
    public static final /* enum */ h Rotate = new h();
    private static final h[] L = h.m();

    public static h[] values() {
        return (h[])L.clone();
    }

    public static h valueOf(String string) {
        return Enum.valueOf(h.class, string);
    }

    private static h[] m() {
        return new h[]{General, Rotate};
    }
}

