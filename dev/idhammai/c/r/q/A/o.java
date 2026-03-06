/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.A;

public final class o
extends Enum<o> {
    public static final /* enum */ o Fill = new o();
    public static final /* enum */ o Box = new o();
    public static final /* enum */ o Jello = new o();
    public static final /* enum */ o ThunderHack = new o();
    public static final /* enum */ o None = new o();
    private static final o[] q = o.f();

    public static o[] values() {
        return (o[])q.clone();
    }

    public static o valueOf(String string) {
        return Enum.valueOf(o.class, string);
    }

    private static o[] f() {
        return new o[]{Fill, Box, Jello, ThunderHack, None};
    }
}

