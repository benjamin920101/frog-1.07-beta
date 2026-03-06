/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.N;

public final class C
extends Enum<C> {
    public static final /* enum */ C General = new C();
    public static final /* enum */ C Rotation = new C();
    public static final /* enum */ C Misc = new C();
    public static final /* enum */ C Predict = new C();
    private static final C[] S = C.O();

    public static C[] values() {
        return (C[])S.clone();
    }

    public static C valueOf(String string) {
        return Enum.valueOf(C.class, string);
    }

    private static C[] O() {
        return new C[]{General, Rotation, Misc, Predict};
    }
}

