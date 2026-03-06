/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.D;

public final class Y
extends Enum<Y> {
    public static final /* enum */ Y PressKey = new Y();
    public static final /* enum */ Y Legit = new Y();
    public static final /* enum */ Y Rage = new Y();
    public static final /* enum */ Y Rotation = new Y();
    private static final Y[] r = Y.p();

    public static Y[] values() {
        return (Y[])r.clone();
    }

    public static Y valueOf(String string) {
        return Enum.valueOf(Y.class, string);
    }

    private static Y[] p() {
        return new Y[]{PressKey, Legit, Rage, Rotation};
    }
}

