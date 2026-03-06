/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.A;

final class j
extends Enum<j> {
    public static final /* enum */ j Obsidian = new j();
    public static final /* enum */ j Anchor = new j();
    public static final /* enum */ j Web = new j();
    public static final /* enum */ j Concrete = new j();
    private static final j[] Y = j.u();

    public static j[] values() {
        return (j[])Y.clone();
    }

    public static j valueOf(String string) {
        return Enum.valueOf(j.class, string);
    }

    private static j[] u() {
        return new j[]{Obsidian, Anchor, Web, Concrete};
    }
}

