/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.A;

public final class s
extends Enum<s> {
    public static final /* enum */ s General = new s();
    public static final /* enum */ s Rotate = new s();
    public static final /* enum */ s Check = new s();
    private static final s[] s = dev.idhammai.c.r.q.A.s.c();

    public static s[] values() {
        return (s[])s.clone();
    }

    public static s valueOf(String string) {
        return Enum.valueOf(s.class, string);
    }

    private static s[] c() {
        return new s[]{General, Rotate, Check};
    }
}

