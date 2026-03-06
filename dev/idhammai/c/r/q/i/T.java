/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.i;

public final class T
extends Enum<T> {
    public static final /* enum */ T General = new T();
    public static final /* enum */ T Check = new T();
    public static final /* enum */ T Place = new T();
    public static final /* enum */ T Rotation = new T();
    public static final /* enum */ T Render = new T();
    private static final T[] o = T.z();

    public static T[] values() {
        return (T[])o.clone();
    }

    public static T valueOf(String string) {
        return Enum.valueOf(T.class, string);
    }

    private static T[] z() {
        return new T[]{General, Check, Place, Rotation, Render};
    }
}

