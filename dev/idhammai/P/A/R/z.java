/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.P.A.R;

public final class z
extends Enum<z> {
    public static final /* enum */ z Legacy = new z();
    public static final /* enum */ z New = new z();
    private static final z[] R = z.O();

    public static z[] values() {
        return (z[])R.clone();
    }

    public static z valueOf(String string) {
        return Enum.valueOf(z.class, string);
    }

    private static z[] O() {
        return new z[]{Legacy, New};
    }
}

