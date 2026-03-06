/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.A;

public final class B
extends Enum<B> {
    public static final /* enum */ B General = new B();
    public static final /* enum */ B Rotate = new B();
    public static final /* enum */ B Target = new B();
    public static final /* enum */ B Render = new B();
    private static final B[] A = B.z();

    public static B[] values() {
        return (B[])A.clone();
    }

    public static B valueOf(String string) {
        return Enum.valueOf(B.class, string);
    }

    private static B[] z() {
        return new B[]{General, Rotate, Target, Render};
    }
}

