/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.i;

public final class n
extends Enum<n> {
    public static final /* enum */ n ClickSlot = new n();
    public static final /* enum */ n Pick = new n();
    private static final n[] B = n.n();

    public static n[] values() {
        return (n[])B.clone();
    }

    public static n valueOf(String string) {
        return Enum.valueOf(n.class, string);
    }

    private static n[] n() {
        return new n[]{ClickSlot, Pick};
    }
}

