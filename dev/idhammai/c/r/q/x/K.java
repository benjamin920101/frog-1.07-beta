/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.x;

public final class K
extends Enum<K> {
    public static final /* enum */ K Bot = new K();
    public static final /* enum */ K Custom = new K();
    public static final /* enum */ K AutoSex = new K();
    private static final K[] x = K.x();

    public static K[] values() {
        return (K[])x.clone();
    }

    public static K valueOf(String string) {
        return Enum.valueOf(K.class, string);
    }

    private static K[] x() {
        return new K[]{Bot, Custom, AutoSex};
    }
}

