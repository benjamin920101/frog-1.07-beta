/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.Q;

public final class d
extends Enum<d> {
    public static final /* enum */ d Vanilla = new d();
    public static final /* enum */ d NCP = new d();
    public static final /* enum */ d Swap = new d();
    private static final d[] p = d.Q();

    public static d[] values() {
        return (d[])p.clone();
    }

    public static d valueOf(String string) {
        return Enum.valueOf(d.class, string);
    }

    private static d[] Q() {
        return new d[]{Vanilla, NCP, Swap};
    }
}

