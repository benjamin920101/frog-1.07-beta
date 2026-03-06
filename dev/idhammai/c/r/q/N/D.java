/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.N;

public final class D
extends Enum<D> {
    public static final /* enum */ D PlusMinus = new D();
    public static final /* enum */ D Chevron = new D();
    public static final /* enum */ D Gear = new D();
    private static final D[] i = D.C();

    public static D[] values() {
        return (D[])i.clone();
    }

    public static D valueOf(String string) {
        return Enum.valueOf(D.class, string);
    }

    private static D[] C() {
        return new D[]{PlusMinus, Chevron, Gear};
    }
}

