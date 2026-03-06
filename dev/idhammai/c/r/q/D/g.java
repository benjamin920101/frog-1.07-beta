/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.D;

public final class g
extends Enum<g> {
    public static final /* enum */ g Setback = new g();
    public static final /* enum */ g Fast = new g();
    public static final /* enum */ g Factor = new g();
    public static final /* enum */ g Slow = new g();
    public static final /* enum */ g Increment = new g();
    public static final /* enum */ g Compatibility = new g();
    private static final g[] f = g.L();

    public static g[] values() {
        return (g[])f.clone();
    }

    public static g valueOf(String string) {
        return Enum.valueOf(g.class, string);
    }

    private static g[] L() {
        return new g[]{Setback, Fast, Factor, Slow, Increment, Compatibility};
    }
}

