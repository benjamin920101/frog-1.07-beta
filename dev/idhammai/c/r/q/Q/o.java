/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.Q;

public final class o
extends Enum<o> {
    public static final /* enum */ o HitboxDesync = new o();
    public static final /* enum */ o Clip = new o();
    public static final /* enum */ o NoPacket = new o();
    private static final o[] k = o.O();

    public static o[] values() {
        return (o[])k.clone();
    }

    public static o valueOf(String string) {
        return Enum.valueOf(o.class, string);
    }

    private static o[] O() {
        return new o[]{HitboxDesync, Clip, NoPacket};
    }
}

