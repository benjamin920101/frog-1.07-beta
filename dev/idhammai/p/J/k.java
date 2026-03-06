/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.p.J;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class k
extends Record {
    private final int y;
    private final double f;

    public k(int n2, double d2) {
        this.y = n2;
        this.f = d2;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{k.class, "y;f", "y", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{k.class, "y;f", "y", "f"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{k.class, "y;f", "y", "f"}, this, object);
    }

    public int Y() {
        return this.y;
    }

    public double F() {
        return this.f;
    }
}

