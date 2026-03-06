/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.A;

public final class H
extends Enum<H> {
    public static final /* enum */ H ClickSlot = new H();
    public static final /* enum */ H OffhandSwap = new H();
    public static final /* enum */ H Pick = new H();
    private static final H[] R = H.f();

    public static H[] values() {
        return (H[])R.clone();
    }

    public static H valueOf(String string) {
        return Enum.valueOf(H.class, string);
    }

    private static H[] f() {
        return new H[]{ClickSlot, OffhandSwap, Pick};
    }
}

