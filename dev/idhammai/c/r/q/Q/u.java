/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.Q;

final class u
extends Enum<u> {
    public static final /* enum */ u Pearl = new u();
    private static final u[] q = u.Q();

    public static u[] values() {
        return (u[])q.clone();
    }

    public static u valueOf(String string) {
        return Enum.valueOf(u.class, string);
    }

    private static u[] Q() {
        return new u[]{Pearl};
    }
}

