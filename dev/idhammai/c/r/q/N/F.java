/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.N;

public final class F
extends Enum<F> {
    public static final /* enum */ F Left = new F();
    public static final /* enum */ F Center = new F();
    private static final F[] p = F.B();

    public static F[] values() {
        return (F[])p.clone();
    }

    public static F valueOf(String string) {
        return Enum.valueOf(F.class, string);
    }

    private static F[] B() {
        return new F[]{Left, Center};
    }
}

