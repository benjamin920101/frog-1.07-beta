/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.N;

public final class O
extends Enum<O> {
    public static final /* enum */ O Mio = new O();
    public static final /* enum */ O Debug = new O();
    public static final /* enum */ O Lowercase = new O();
    public static final /* enum */ O Normal = new O();
    public static final /* enum */ O Future = new O();
    public static final /* enum */ O Earth = new O();
    public static final /* enum */ O Moon = new O();
    public static final /* enum */ O Melon = new O();
    public static final /* enum */ O Chinese = new O();
    public static final /* enum */ O None = new O();
    private static final O[] Y = O.L();

    public static O[] values() {
        return (O[])Y.clone();
    }

    public static O valueOf(String string) {
        return Enum.valueOf(O.class, string);
    }

    private static O[] L() {
        return new O[]{Mio, Debug, Lowercase, Normal, Future, Earth, Moon, Melon, Chinese, None};
    }
}

