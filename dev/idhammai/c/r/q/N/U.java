/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.N;

public final class U
extends Enum<U> {
    public static final /* enum */ U Down = new U();
    public static final /* enum */ U Up = new U();
    private static final U[] K = U.J();

    public static U[] values() {
        return (U[])K.clone();
    }

    public static U valueOf(String string) {
        return Enum.valueOf(U.class, string);
    }

    private static U[] J() {
        return new U[]{Down, Up};
    }
}

