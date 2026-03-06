/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.N;

public final class S
extends Enum<S> {
    public static final /* enum */ S Custom = new S();
    public static final /* enum */ S Pulse = new S();
    public static final /* enum */ S Rainbow = new S();
    public static final /* enum */ S Shader = new S();
    private static final S[] l = S.d();

    public static S[] values() {
        return (S[])l.clone();
    }

    public static S valueOf(String string) {
        return Enum.valueOf(S.class, string);
    }

    private static S[] d() {
        return new S[]{Custom, Pulse, Rainbow, Shader};
    }
}

