/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.i;

public final class g
extends Enum<g> {
    public static final /* enum */ g Packet = new g();
    public static final /* enum */ g Grim = new g();
    private static final g[] L = g.j();

    public static g[] values() {
        return (g[])L.clone();
    }

    public static g valueOf(String string) {
        return Enum.valueOf(g.class, string);
    }

    private static g[] j() {
        return new g[]{Packet, Grim};
    }
}

