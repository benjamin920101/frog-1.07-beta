/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.A;

final class X
extends Enum<X> {
    public static final /* enum */ X DISTANCE = new X();
    public static final /* enum */ X HEALTH = new X();
    private static final X[] n = X.E();

    public static X[] values() {
        return (X[])n.clone();
    }

    public static X valueOf(String string) {
        return Enum.valueOf(X.class, string);
    }

    private static X[] E() {
        return new X[]{DISTANCE, HEALTH};
    }
}

