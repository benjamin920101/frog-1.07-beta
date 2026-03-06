/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.x;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class k
extends Record {
    private final double nr;
    private final double nl;
    private final double na;
    private final float PO;
    private final float pl;

    private k(double d2, double d3, double d4, float f2, float f3) {
        this.nr = d2;
        this.nl = d3;
        this.na = d4;
        this.PO = f2;
        this.pl = f3;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{k.class, "nr;nl;na;PO;pl", "nr", "nl", "na", "PO", "pl"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{k.class, "nr;nl;na;PO;pl", "nr", "nl", "na", "PO", "pl"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{k.class, "nr;nl;na;PO;pl", "nr", "nl", "na", "PO", "pl"}, this, object);
    }

    public double Nr() {
        return this.nr;
    }

    public double Nl() {
        return this.nl;
    }

    public double Na() {
        return this.na;
    }

    public float PO() {
        return this.PO;
    }

    public float Pl() {
        return this.pl;
    }
}

