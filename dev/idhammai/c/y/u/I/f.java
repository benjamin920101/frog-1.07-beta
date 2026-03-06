/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.y.u.I;

public final class f
extends Enum<f> {
    public static final /* enum */ f Module = new f();
    public static final /* enum */ f Hud = new f();
    private static final f[] b = f.g();

    public static f[] values() {
        return (f[])b.clone();
    }

    public static f valueOf(String string) {
        return Enum.valueOf(f.class, string);
    }

    private static f[] g() {
        return new f[]{Module, Hud};
    }
}

