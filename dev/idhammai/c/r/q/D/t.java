/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.D;

public final class t
extends Enum<t> {
    public static final /* enum */ t Vanilla = new t();
    public static final /* enum */ t Strict = new t();
    public static final /* enum */ t Custom = new t();
    public static final /* enum */ t Ignore = new t();
    private static final t[] q = t.N();

    public static t[] values() {
        return (t[])q.clone();
    }

    public static t valueOf(String string) {
        return Enum.valueOf(t.class, string);
    }

    private static t[] N() {
        return new t[]{Vanilla, Strict, Custom, Ignore};
    }
}

