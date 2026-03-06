/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.i;

public final class p
extends Enum<p> {
    public static final /* enum */ p Swap = new p();
    public static final /* enum */ p Switch = new p();
    private static final p[] l = p.E();

    public static p[] values() {
        return (p[])l.clone();
    }

    public static p valueOf(String string) {
        return Enum.valueOf(p.class, string);
    }

    private static p[] E() {
        return new p[]{Swap, Switch};
    }
}

