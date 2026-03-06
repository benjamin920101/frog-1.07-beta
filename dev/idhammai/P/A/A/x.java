/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.P.A.A;

import dev.idhammai.P.A.A.S;

final class x
extends S {
    @Override
    public double T(double d2) {
        return d2 < 0.5 ? Math.pow(2.0 * d2, 2.0) * (7.189819 * d2 - 2.5949095) / 2.0 : (Math.pow(2.0 * d2 - 2.0, 2.0) * (3.5949095 * (d2 * 2.0 - 2.0) + 2.5949095) + 2.0) / 2.0;
    }
}

