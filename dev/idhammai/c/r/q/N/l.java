/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.N;

public final class l
extends Enum<l> {
    public static final /* enum */ l Snowflake = new l();
    public static final /* enum */ l Circle = new l();
    private static final l[] m = l.s();

    public static l[] values() {
        return (l[])m.clone();
    }

    public static l valueOf(String string) {
        return Enum.valueOf(l.class, string);
    }

    private static l[] s() {
        return new l[]{Snowflake, Circle};
    }
}

