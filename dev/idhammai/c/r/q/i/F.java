/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.i;

final class F
extends Enum<F> {
    public static final /* enum */ F Whitelist = new F();
    public static final /* enum */ F Blacklist = new F();
    private static final F[] X = F.t();

    public static F[] values() {
        return (F[])X.clone();
    }

    public static F valueOf(String string) {
        return Enum.valueOf(F.class, string);
    }

    private static F[] t() {
        return new F[]{Whitelist, Blacklist};
    }
}

