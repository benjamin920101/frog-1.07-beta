/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.n;

final class p
extends Enum<p> {
    public static final /* enum */ p ThreeD = new p();
    public static final /* enum */ p TwoD = new p();
    private static final p[] J = p.y();

    public static p[] values() {
        return (p[])J.clone();
    }

    public static p valueOf(String string) {
        return Enum.valueOf(p.class, string);
    }

    private static p[] y() {
        return new p[]{ThreeD, TwoD};
    }
}

