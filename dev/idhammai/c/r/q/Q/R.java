/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.Q;

public final class R
extends Enum<R> {
    public static final /* enum */ R INTERACT = new R();
    public static final /* enum */ R ATTACK = new R();
    public static final /* enum */ R INTERACT_AT = new R();
    private static final R[] x = R.Y();

    public static R[] values() {
        return (R[])x.clone();
    }

    public static R valueOf(String string) {
        return Enum.valueOf(R.class, string);
    }

    private static R[] Y() {
        return new R[]{INTERACT, ATTACK, INTERACT_AT};
    }
}

