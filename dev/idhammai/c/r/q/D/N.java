/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.D;

public final class N
extends Enum<N> {
    public static final /* enum */ N Off = new N();
    public static final /* enum */ N Semi = new N();
    public static final /* enum */ N Full = new N();
    private static final N[] H = N.x();

    public static N[] values() {
        return (N[])H.clone();
    }

    public static N valueOf(String string) {
        return Enum.valueOf(N.class, string);
    }

    private static N[] x() {
        return new N[]{Off, Semi, Full};
    }
}

