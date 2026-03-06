/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r;

public final class D
extends Enum<D> {
    public static final /* enum */ D LeftTop = new D(false, false);
    public static final /* enum */ D RightTop = new D(true, false);
    public static final /* enum */ D LeftBottom = new D(false, true);
    public static final /* enum */ D RightBottom = new D(true, true);
    private final boolean x;
    private final boolean J;
    private static final D[] P = D.q();

    public static D[] values() {
        return (D[])P.clone();
    }

    public static D valueOf(String string) {
        return Enum.valueOf(D.class, string);
    }

    private D(boolean bl, boolean bl2) {
        this.x = bl;
        this.J = bl2;
    }

    public boolean i() {
        return this.x;
    }

    public boolean f() {
        return this.J;
    }

    private static D[] q() {
        return new D[]{LeftTop, RightTop, LeftBottom, RightBottom};
    }
}

