/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.P.r;

public final class O
extends Enum<O> {
    public static final /* enum */ O Pre = new O();
    public static final /* enum */ O Post = new O();
    private static final O[] g = O.b();

    public static O[] values() {
        return (O[])g.clone();
    }

    public static O valueOf(String string) {
        return Enum.valueOf(O.class, string);
    }

    private static O[] b() {
        return new O[]{Pre, Post};
    }
}

