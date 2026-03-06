/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.D;

public final class T
extends Enum<T> {
    public static final /* enum */ T Strafe = new T();
    public static final /* enum */ T StrafeStrict = new T();
    public static final /* enum */ T Grim = new T();
    private static final T[] v = T.S();

    public static T[] values() {
        return (T[])v.clone();
    }

    public static T valueOf(String string) {
        return Enum.valueOf(T.class, string);
    }

    private static T[] S() {
        return new T[]{Strafe, StrafeStrict, Grim};
    }
}

