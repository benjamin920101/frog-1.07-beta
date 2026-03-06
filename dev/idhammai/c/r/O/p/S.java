/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.O.p;

public final class S
extends Enum<S> {
    public static final /* enum */ S All = new S();
    public static final /* enum */ S Client = new S();
    public static final /* enum */ S Server = new S();
    public static final /* enum */ S None = new S();
    private static final /* synthetic */ S[] o;

    public static S[] values() {
        return (S[])o.clone();
    }

    public static S valueOf(String string) {
        return Enum.valueOf(S.class, string);
    }

    private static /* synthetic */ S[] Y() {
        return new S[]{All, Client, Server, None};
    }

    static {
        o = S.Y();
    }
}

