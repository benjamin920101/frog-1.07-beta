/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.A;

public final class c
extends Enum<c> {
    public static final /* enum */ c None = new c();
    public static final /* enum */ c Totem = new c();
    public static final /* enum */ c Crystal = new c();
    public static final /* enum */ c Gapple = new c();
    public static final /* enum */ c Shield = new c();
    public static final /* enum */ c Chorus = new c();
    private static final c[] P = c.c();

    public static c[] values() {
        return (c[])P.clone();
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    private static c[] c() {
        return new c[]{None, Totem, Crystal, Gapple, Shield, Chorus};
    }
}

