/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.p.J;

public final class u
extends Enum<u> {
    public static final /* enum */ u Smoke = new u();
    public static final /* enum */ u Snow = new u();
    public static final /* enum */ u Rainbow = new u();
    public static final /* enum */ u Water = new u();
    private static final u[] F = u.p();

    public static u[] values() {
        return (u[])F.clone();
    }

    public static u valueOf(String string) {
        return Enum.valueOf(u.class, string);
    }

    private static u[] p() {
        return new u[]{Smoke, Snow, Rainbow, Water};
    }
}

