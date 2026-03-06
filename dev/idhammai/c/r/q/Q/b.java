/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.Q;

final class b
extends Enum<b> {
    public static final /* enum */ b Strong = new b();
    public static final /* enum */ b Fast = new b();
    public static final /* enum */ b Strict = new b();
    public static final /* enum */ b Phobos = new b();
    private static final b[] G = b.t();

    public static b[] values() {
        return (b[])G.clone();
    }

    public static b valueOf(String string) {
        return Enum.valueOf(b.class, string);
    }

    private static b[] t() {
        return new b[]{Strong, Fast, Strict, Phobos};
    }
}

