/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.D;

public final class R
extends Enum<R> {
    public static final /* enum */ R Control = new R();
    public static final /* enum */ R Boost = new R();
    public static final /* enum */ R Bounce = new R();
    public static final /* enum */ R Freeze = new R();
    public static final /* enum */ R None = new R();
    public static final /* enum */ R Rotation = new R();
    public static final /* enum */ R Pitch = new R();
    private static final R[] J = R.N();

    public static R[] values() {
        return (R[])J.clone();
    }

    public static R valueOf(String string) {
        return Enum.valueOf(R.class, string);
    }

    private static R[] N() {
        return new R[]{Control, Boost, Bounce, Freeze, None, Rotation, Pitch};
    }
}

