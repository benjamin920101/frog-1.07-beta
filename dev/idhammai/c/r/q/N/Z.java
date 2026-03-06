/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.N;

public final class Z
extends Enum<Z> {
    public static final /* enum */ Z Radial = new Z();
    private static final Z[] R = Z.r();

    public static Z[] values() {
        return (Z[])R.clone();
    }

    public static Z valueOf(String string) {
        return Enum.valueOf(Z.class, string);
    }

    private static Z[] r() {
        return new Z[]{Radial};
    }
}

