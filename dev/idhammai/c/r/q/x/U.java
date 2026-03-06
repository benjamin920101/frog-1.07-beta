/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.x;

final class U
extends Enum<U> {
    public static final /* enum */ U Vanilla = new U();
    public static final /* enum */ U Packet = new U();
    private static final U[] Q = U.Z();

    public static U[] values() {
        return (U[])Q.clone();
    }

    public static U valueOf(String string) {
        return Enum.valueOf(U.class, string);
    }

    private static U[] Z() {
        return new U[]{Vanilla, Packet};
    }
}

