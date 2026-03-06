/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.A;

public final class b
extends Enum<b> {
    public static final /* enum */ b Single = new b();
    public static final /* enum */ b Multi = new b();
    private static final b[] F = b.C();

    public static b[] values() {
        return (b[])F.clone();
    }

    public static b valueOf(String string) {
        return Enum.valueOf(b.class, string);
    }

    private static b[] C() {
        return new b[]{Single, Multi};
    }
}

