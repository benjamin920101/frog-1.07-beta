/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.D;

public final class q
extends Enum<q> {
    public static final /* enum */ q Glitch = new q();
    public static final /* enum */ q Teleport = new q();
    public static final /* enum */ q Jump = new q();
    private static final q[] I = q.H();

    public static q[] values() {
        return (q[])I.clone();
    }

    public static q valueOf(String string) {
        return Enum.valueOf(q.class, string);
    }

    private static q[] H() {
        return new q[]{Glitch, Teleport, Jump};
    }
}

