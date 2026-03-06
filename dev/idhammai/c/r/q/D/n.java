/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.D;

final class n
extends Enum<n> {
    public static final /* enum */ n Fast = new n();
    public static final /* enum */ n None = new n();
    private static final n[] J = n.n();

    public static n[] values() {
        return (n[])J.clone();
    }

    public static n valueOf(String string) {
        return Enum.valueOf(n.class, string);
    }

    private static n[] n() {
        return new n[]{Fast, None};
    }
}

