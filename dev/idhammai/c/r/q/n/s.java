/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.n;

final class s
extends Enum<s> {
    public static final /* enum */ s Shader = new s();
    public static final /* enum */ s Target = new s();
    public static final /* enum */ s Color = new s();
    private static final s[] W = s.N();

    public static s[] values() {
        return (s[])W.clone();
    }

    public static s valueOf(String string) {
        return Enum.valueOf(s.class, string);
    }

    private static s[] N() {
        return new s[]{Shader, Target, Color};
    }
}

