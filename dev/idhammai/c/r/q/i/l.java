/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.i;

final class l
extends Enum<l> {
    public static final /* enum */ l Center = new l();
    public static final /* enum */ l Grow = new l();
    public static final /* enum */ l Up = new l();
    public static final /* enum */ l Down = new l();
    public static final /* enum */ l Oscillation = new l();
    public static final /* enum */ l None = new l();
    private static final l[] n = l.h();

    public static l[] values() {
        return (l[])n.clone();
    }

    public static l valueOf(String string) {
        return Enum.valueOf(l.class, string);
    }

    private static l[] h() {
        return new l[]{Center, Grow, Up, Down, Oscillation, None};
    }
}

