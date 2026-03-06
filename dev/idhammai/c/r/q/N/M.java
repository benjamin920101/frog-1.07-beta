/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.N;

public final class M
extends Enum<M> {
    public static final /* enum */ M Smoke = new M();
    public static final /* enum */ M Snow = new M();
    public static final /* enum */ M Rainbow = new M();
    public static final /* enum */ M Water = new M();
    private static final M[] y = M.s();

    public static M[] values() {
        return (M[])y.clone();
    }

    public static M valueOf(String string) {
        return Enum.valueOf(M.class, string);
    }

    private static M[] s() {
        return new M[]{Smoke, Snow, Rainbow, Water};
    }
}

