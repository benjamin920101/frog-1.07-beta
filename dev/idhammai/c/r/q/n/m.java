/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.n;

public final class m
extends Enum<m> {
    public static final /* enum */ m Standard = new m();
    public static final /* enum */ m Centered = new m();
    private static final m[] G = m.w();

    public static m[] values() {
        return (m[])G.clone();
    }

    public static m valueOf(String string) {
        return Enum.valueOf(m.class, string);
    }

    private static m[] w() {
        return new m[]{Standard, Centered};
    }
}

