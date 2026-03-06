/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.N;

public final class W
extends Enum<W> {
    public static final /* enum */ W Custom = new W();
    public static final /* enum */ W Rainbow = new W();
    private static final W[] S = W.E();

    public static W[] values() {
        return (W[])S.clone();
    }

    public static W valueOf(String string) {
        return Enum.valueOf(W.class, string);
    }

    private static W[] E() {
        return new W[]{Custom, Rainbow};
    }
}

