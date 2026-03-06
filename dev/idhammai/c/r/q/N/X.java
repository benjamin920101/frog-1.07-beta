/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.N;

public final class X
extends Enum<X> {
    public static final /* enum */ X Velocity = new X();
    public static final /* enum */ X Position = new X();
    private static final X[] U = X.I();

    public static X[] values() {
        return (X[])U.clone();
    }

    public static X valueOf(String string) {
        return Enum.valueOf(X.class, string);
    }

    private static X[] I() {
        return new X[]{Velocity, Position};
    }
}

