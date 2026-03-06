/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.A;

final class p
extends Enum<p> {
    public static final /* enum */ p None = new p();
    public static final /* enum */ p Stack = new p();
    public static final /* enum */ p QuickMove = new p();
    private static final p[] Z = p.c();

    public static p[] values() {
        return (p[])Z.clone();
    }

    public static p valueOf(String string) {
        return Enum.valueOf(p.class, string);
    }

    private static p[] c() {
        return new p[]{None, Stack, QuickMove};
    }
}

