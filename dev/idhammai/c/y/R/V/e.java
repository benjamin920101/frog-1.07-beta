/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.y.R.V;

import dev.idhammai.c.r.q.N.D;

class e {
    static final int[] J = new int[D.values().length];

    static {
        try {
            e.J[D.PlusMinus.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            e.J[D.Chevron.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            e.J[D.Gear.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

