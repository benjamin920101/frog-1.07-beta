/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.A;

final class r
extends Enum<r> {
    public static final /* enum */ r General = new r();
    public static final /* enum */ r Base = new r();
    public static final /* enum */ r Misc = new r();
    public static final /* enum */ r Rotation = new r();
    public static final /* enum */ r Check = new r();
    public static final /* enum */ r Calc = new r();
    public static final /* enum */ r Render = new r();
    private static final r[] x = r.y();

    public static r[] values() {
        return (r[])x.clone();
    }

    public static r valueOf(String string) {
        return Enum.valueOf(r.class, string);
    }

    private static r[] y() {
        return new r[]{General, Base, Misc, Rotation, Check, Calc, Render};
    }
}

