/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.N;

public final class B
extends Enum<B> {
    public static final /* enum */ B None = new B();
    public static final /* enum */ B Blur = new B();
    public static final /* enum */ B Shader = new B();
    public static final /* enum */ B Rain2 = new B();
    private static final B[] q = B.E();

    public static B[] values() {
        return (B[])q.clone();
    }

    public static B valueOf(String string) {
        return Enum.valueOf(B.class, string);
    }

    private static B[] E() {
        return new B[]{None, Blur, Shader, Rain2};
    }
}

