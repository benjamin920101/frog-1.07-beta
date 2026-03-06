/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.n;

final class y
extends Enum<y> {
    public static final /* enum */ y Fade = new y();
    public static final /* enum */ y Shrink = new y();
    public static final /* enum */ y All = new y();
    private static final y[] W = y.n();

    public static y[] values() {
        return (y[])W.clone();
    }

    public static y valueOf(String string) {
        return Enum.valueOf(y.class, string);
    }

    private static y[] n() {
        return new y[]{Fade, Shrink, All};
    }
}

