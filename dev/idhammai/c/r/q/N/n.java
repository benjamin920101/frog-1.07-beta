/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.N;

public final class n
extends Enum<n> {
    public static final /* enum */ n iOS = new n();
    public static final /* enum */ n Classic = new n();
    private static final n[] j = n.h();

    public static n[] values() {
        return (n[])j.clone();
    }

    public static n valueOf(String string) {
        return Enum.valueOf(n.class, string);
    }

    private static n[] h() {
        return new n[]{iOS, Classic};
    }
}

