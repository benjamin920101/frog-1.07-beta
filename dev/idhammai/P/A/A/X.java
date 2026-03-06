/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.P.A.A;

import dev.idhammai.P.A.A.S;

final class X
extends S {
    @Override
    public double T(double d2) {
        return d2 < 0.5 ? (1.0 - Math.sqrt(1.0 - Math.pow(2.0 * d2, 2.0))) / 2.0 : (Math.sqrt(1.0 - Math.pow(-2.0 * d2 + 2.0, 2.0)) + 1.0) / 2.0;
    }
}

