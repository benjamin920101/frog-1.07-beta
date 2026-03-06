/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.D;

public final class s
extends Enum<s> {
    public static final /* enum */ s Plain = new s();
    public static final /* enum */ s Grim = new s();
    public static final /* enum */ s Wall = new s();
    public static final /* enum */ s None = new s();
    private static final s[] z = s.o();

    public static s[] values() {
        return (s[])z.clone();
    }

    public static s valueOf(String string) {
        return Enum.valueOf(s.class, string);
    }

    private static s[] o() {
        return new s[]{Plain, Grim, Wall, None};
    }
}

