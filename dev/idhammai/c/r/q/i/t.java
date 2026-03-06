/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.i;

final class t
extends Enum<t> {
    public static final /* enum */ t Blast = new t();
    public static final /* enum */ t Protection = new t();
    private static final t[] h = t.N();

    public static t[] values() {
        return (t[])h.clone();
    }

    public static t valueOf(String string) {
        return Enum.valueOf(t.class, string);
    }

    private static t[] N() {
        return new t[]{Blast, Protection};
    }
}

