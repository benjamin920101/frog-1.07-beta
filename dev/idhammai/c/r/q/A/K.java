/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.A;

public final class K
extends Enum<K> {
    public static final /* enum */ K Mace = new K();
    public static final /* enum */ K Axe = new K();
    public static final /* enum */ K Sword = new K();
    private static final K[] i = K.J();

    public static K[] values() {
        return (K[])i.clone();
    }

    public static K valueOf(String string) {
        return Enum.valueOf(K.class, string);
    }

    private static K[] J() {
        return new K[]{Mace, Axe, Sword};
    }
}

