/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.N;

public final class e
extends Enum<e> {
    public static final /* enum */ e Preset = new e();
    public static final /* enum */ e Custom = new e();
    private static final e[] H = e.M();

    public static e[] values() {
        return (e[])H.clone();
    }

    public static e valueOf(String string) {
        return Enum.valueOf(e.class, string);
    }

    private static e[] M() {
        return new e[]{Preset, Custom};
    }
}

