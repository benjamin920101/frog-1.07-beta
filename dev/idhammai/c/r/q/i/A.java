/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.i;

public final class A
extends Enum<A> {
    public static final /* enum */ A QuickMove = new A();
    public static final /* enum */ A ClickSlot = new A();
    private static final A[] R = A.Q();

    public static A[] values() {
        return (A[])R.clone();
    }

    public static A valueOf(String string) {
        return Enum.valueOf(A.class, string);
    }

    private static A[] Q() {
        return new A[]{QuickMove, ClickSlot};
    }
}

