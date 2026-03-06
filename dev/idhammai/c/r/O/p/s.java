/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.O.p;

public final class s
extends Enum<s> {
    public static final /* enum */ s Tick = new s();
    public static final /* enum */ s Force = new s();
    public static final /* enum */ s None = new s();
    private static final /* synthetic */ s[] j;

    public static s[] values() {
        return (s[])j.clone();
    }

    public static s valueOf(String string) {
        return Enum.valueOf(s.class, string);
    }

    private static /* synthetic */ s[] n() {
        return new s[]{Tick, Force, None};
    }

    static {
        j = s.n();
    }
}

