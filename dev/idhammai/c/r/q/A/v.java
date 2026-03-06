/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.A;

public final class v
extends Enum<v> {
    public static final /* enum */ v UpdatedNCP = new v();
    public static final /* enum */ v Strict = new v();
    public static final /* enum */ v NCP = new v();
    public static final /* enum */ v OldNCP = new v();
    public static final /* enum */ v Hypixel2K22 = new v();
    public static final /* enum */ v Packet = new v();
    public static final /* enum */ v Ground = new v();
    public static final /* enum */ v BBTT = new v();
    private static final v[] X = v.Q();

    public static v[] values() {
        return (v[])X.clone();
    }

    public static v valueOf(String string) {
        return Enum.valueOf(v.class, string);
    }

    private static v[] Q() {
        return new v[]{UpdatedNCP, Strict, NCP, OldNCP, Hypixel2K22, Packet, Ground, BBTT};
    }
}

