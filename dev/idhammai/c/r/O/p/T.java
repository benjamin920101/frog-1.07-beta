/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.O.p;

public final class T
extends Enum<T> {
    public static final /* enum */ T All = new T();
    public static final /* enum */ T Pre = new T();
    public static final /* enum */ T Post = new T();
    private static final /* synthetic */ T[] L;

    public static T[] values() {
        return (T[])L.clone();
    }

    public static T valueOf(String string) {
        return Enum.valueOf(T.class, string);
    }

    private static /* synthetic */ T[] X() {
        return new T[]{All, Pre, Post};
    }

    static {
        L = T.X();
    }
}

