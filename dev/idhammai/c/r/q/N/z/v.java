/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.N.z;

public final class v
extends Enum<v> {
    public static final /* enum */ v General = new v();
    public static final /* enum */ v Element = new v();
    public static final /* enum */ v Color = new v();
    private static final v[] O = v.v();

    public static v[] values() {
        return (v[])O.clone();
    }

    public static v valueOf(String string) {
        return Enum.valueOf(v.class, string);
    }

    private static v[] v() {
        return new v[]{General, Element, Color};
    }
}

