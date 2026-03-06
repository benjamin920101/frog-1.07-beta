/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.A;

public final class F
extends Enum<F> {
    public static final /* enum */ F Box = new F();
    public static final /* enum */ F Fill = new F();
    public static final /* enum */ F Jello = new F();
    public static final /* enum */ F ThunderHack = new F();
    public static final /* enum */ F None = new F();
    private static final F[] B = F.s();

    public static F[] values() {
        return (F[])B.clone();
    }

    public static F valueOf(String string) {
        return Enum.valueOf(F.class, string);
    }

    private static F[] s() {
        return new F[]{Box, Fill, Jello, ThunderHack, None};
    }
}

