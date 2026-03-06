/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.A;

final class w
extends Enum<w> {
    public static final /* enum */ w Bypass = new w();
    public static final /* enum */ w Normal = new w();
    public static final /* enum */ w None = new w();
    private static final w[] s = w.M();

    public static w[] values() {
        return (w[])s.clone();
    }

    public static w valueOf(String string) {
        return Enum.valueOf(w.class, string);
    }

    private static w[] M() {
        return new w[]{Bypass, Normal, None};
    }
}

