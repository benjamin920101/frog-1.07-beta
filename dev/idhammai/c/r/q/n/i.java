/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.n;

public final class i
extends Enum<i> {
    public static final /* enum */ i None = new i();
    public static final /* enum */ i Air = new i();
    public static final /* enum */ i Normal = new i();
    public static final /* enum */ i Bedrock = new i();
    private static final i[] X = i.v();

    public static i[] values() {
        return (i[])X.clone();
    }

    public static i valueOf(String string) {
        return Enum.valueOf(i.class, string);
    }

    private static i[] v() {
        return new i[]{None, Air, Normal, Bedrock};
    }
}

