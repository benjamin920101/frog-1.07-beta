/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.A;

public final class g
extends Enum<g> {
    public static final /* enum */ g Vanilla = new g();
    public static final /* enum */ g Delay = new g();
    private static final g[] h = g.X();

    public static g[] values() {
        return (g[])h.clone();
    }

    public static g valueOf(String string) {
        return Enum.valueOf(g.class, string);
    }

    private static g[] X() {
        return new g[]{Vanilla, Delay};
    }
}

