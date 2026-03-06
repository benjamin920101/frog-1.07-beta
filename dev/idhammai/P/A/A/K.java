/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.P.A.A;

import dev.idhammai.P.A.A.S;

final class K
extends S {
    @Override
    public double T(double d2) {
        if (d2 < 0.36363636363636365) {
            return 7.5625 * d2 * d2;
        }
        if (d2 < 0.7272727272727273) {
            return 7.5625 * (d2 -= 0.5454545454545454) * d2 + 0.75;
        }
        if (d2 < 0.9090909090909091) {
            return 7.5625 * (d2 -= 0.8181818181818182) * d2 + 0.9375;
        }
        return 7.5625 * (d2 -= 0.9545454545454546) * d2 + 0.984375;
    }
}

