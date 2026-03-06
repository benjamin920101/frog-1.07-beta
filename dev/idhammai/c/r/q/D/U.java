/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.D;

final class U
extends Enum<U> {
    public static final /* enum */ U None = new U();
    public static final /* enum */ U NCP = new U();
    public static final /* enum */ U NCP2 = new U();
    public static final /* enum */ U Grim = new U();
    public static final /* enum */ U Delay = new U();
    private static final U[] f = U.C();

    public static U[] values() {
        return (U[])f.clone();
    }

    public static U valueOf(String string) {
        return Enum.valueOf(U.class, string);
    }

    private static U[] C() {
        return new U[]{None, NCP, NCP2, Grim, Delay};
    }
}

