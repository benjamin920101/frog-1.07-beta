/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.N;

public final class J
extends Enum<J> {
    public static final /* enum */ J Dark = new J();
    public static final /* enum */ J Transparent = new J();
    private static final J[] p = J.S();

    public static J[] values() {
        return (J[])p.clone();
    }

    public static J valueOf(String string) {
        return Enum.valueOf(J.class, string);
    }

    private static J[] S() {
        return new J[]{Dark, Transparent};
    }
}

