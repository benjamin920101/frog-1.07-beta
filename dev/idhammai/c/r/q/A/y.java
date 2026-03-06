/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.A;

public final class y
extends Enum<y> {
    public static final /* enum */ y General = new y();
    public static final /* enum */ y Interact = new y();
    public static final /* enum */ y Predict = new y();
    public static final /* enum */ y Rotate = new y();
    public static final /* enum */ y Assist = new y();
    public static final /* enum */ y Render = new y();
    private static final y[] h = y.y();

    public static y[] values() {
        return (y[])h.clone();
    }

    public static y valueOf(String string) {
        return Enum.valueOf(y.class, string);
    }

    private static y[] y() {
        return new y[]{General, Interact, Predict, Rotate, Assist, Render};
    }
}

