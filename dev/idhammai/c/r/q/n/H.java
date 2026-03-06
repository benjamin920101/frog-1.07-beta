/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.n;

public final class H
extends Enum<H> {
    public static final /* enum */ H None = new H();
    public static final /* enum */ H Air = new H();
    public static final /* enum */ H Normal = new H();
    public static final /* enum */ H Bedrock = new H();
    private static final H[] Z = H.l();

    public static H[] values() {
        return (H[])Z.clone();
    }

    public static H valueOf(String string) {
        return Enum.valueOf(H.class, string);
    }

    private static H[] l() {
        return new H[]{None, Air, Normal, Bedrock};
    }
}

