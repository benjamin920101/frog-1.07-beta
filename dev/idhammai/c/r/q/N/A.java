/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.N;

public final class A
extends Enum<A> {
    public static final /* enum */ A Game = new A();
    public static final /* enum */ A Gui = new A();
    public static final /* enum */ A Misc = new A();
    public static final /* enum */ A Notification = new A();
    public static final /* enum */ A ChatHud = new A();
    private static final A[] F = A.T();

    public static A[] values() {
        return (A[])F.clone();
    }

    public static A valueOf(String string) {
        return Enum.valueOf(A.class, string);
    }

    private static A[] T() {
        return new A[]{Game, Gui, Misc, Notification, ChatHud};
    }
}

