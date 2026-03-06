/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.P.A.A;

import dev.idhammai.P.A.A.S;

final class t
extends S {
    @Override
    public double T(double d2) {
        double d3 = 1.70158;
        double d4 = d3 + 1.0;
        return 1.0 + d4 * Math.pow(d2 - 1.0, 3.0) + d3 * Math.pow(d2 - 1.0, 2.0);
    }
}

