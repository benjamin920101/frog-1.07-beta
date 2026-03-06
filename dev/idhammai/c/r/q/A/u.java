/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.A;

final class u
extends Enum<u> {
    public static final /* enum */ u Crawling = new u();
    public static final /* enum */ u Mining = new u();
    public static final /* enum */ u Always = new u();
    private static final u[] A = u.W();

    public static u[] values() {
        return (u[])A.clone();
    }

    public static u valueOf(String string) {
        return Enum.valueOf(u.class, string);
    }

    private static u[] W() {
        return new u[]{Crawling, Mining, Always};
    }
}

