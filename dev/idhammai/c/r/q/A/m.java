/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.A;

public final class m
extends Enum<m> {
    public static final /* enum */ m General = new m();
    public static final /* enum */ m Rotate = new m();
    public static final /* enum */ m Check = new m();
    public static final /* enum */ m GodMode = new m();
    private static final m[] c = m.I();

    public static m[] values() {
        return (m[])c.clone();
    }

    public static m valueOf(String string) {
        return Enum.valueOf(m.class, string);
    }

    private static m[] I() {
        return new m[]{General, Rotate, Check, GodMode};
    }
}

