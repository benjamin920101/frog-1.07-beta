/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.D;

public final class r
extends Enum<r> {
    public static final /* enum */ r Vanilla = new r();
    public static final /* enum */ r NCP = new r();
    public static final /* enum */ r Grim = new r();
    public static final /* enum */ r GrimPacket = new r();
    public static final /* enum */ r Drop = new r();
    public static final /* enum */ r None = new r();
    private static final r[] J = r.g();

    public static r[] values() {
        return (r[])J.clone();
    }

    public static r valueOf(String string) {
        return Enum.valueOf(r.class, string);
    }

    private static r[] g() {
        return new r[]{Vanilla, NCP, Grim, GrimPacket, Drop, None};
    }
}

