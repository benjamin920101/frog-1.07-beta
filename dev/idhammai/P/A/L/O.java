/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.P.A.L;

import dev.idhammai.c.r.O.p.S;

class O {
    static final int[] y = new int[S.values().length];

    static {
        try {
            O.y[S.All.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            O.y[S.Client.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            O.y[S.Server.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

