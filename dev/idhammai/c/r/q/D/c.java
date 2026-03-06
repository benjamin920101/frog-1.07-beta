/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.D;

public final class c
extends Enum<c> {
    public static final /* enum */ c Vanilla = new c();
    public static final /* enum */ c OldNCP = new c();
    public static final /* enum */ c NCP = new c();
    private static final c[] y = c.w();

    public static c[] values() {
        return (c[])y.clone();
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    private static c[] w() {
        return new c[]{Vanilla, OldNCP, NCP};
    }
}

