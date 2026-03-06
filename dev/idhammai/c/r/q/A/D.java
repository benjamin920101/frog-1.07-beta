/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.A;

public final class D
extends Enum<D> {
    public static final /* enum */ D General = new D();
    public static final /* enum */ D Target = new D();
    public static final /* enum */ D Check = new D();
    private static final D[] v = D.j();

    public static D[] values() {
        return (D[])v.clone();
    }

    public static D valueOf(String string) {
        return Enum.valueOf(D.class, string);
    }

    private static D[] j() {
        return new D[]{General, Target, Check};
    }
}

