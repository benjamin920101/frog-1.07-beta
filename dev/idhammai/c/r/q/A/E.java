/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.A;

final class E
extends Enum<E> {
    public static final /* enum */ E Smart = new E();
    public static final /* enum */ E Invalid = new E();
    public static final /* enum */ E TrollHack = new E();
    public static final /* enum */ E ToVoid = new E();
    public static final /* enum */ E ToVoid2 = new E();
    public static final /* enum */ E Normal = new E();
    public static final /* enum */ E Rotation = new E();
    public static final /* enum */ E Fly = new E();
    public static final /* enum */ E Glide = new E();
    private static final E[] O = E.e();

    public static E[] values() {
        return (E[])O.clone();
    }

    public static E valueOf(String string) {
        return Enum.valueOf(E.class, string);
    }

    private static E[] e() {
        return new E[]{Smart, Invalid, TrollHack, ToVoid, ToVoid2, Normal, Rotation, Fly, Glide};
    }
}

