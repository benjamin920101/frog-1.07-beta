/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.p.J;

import dev.idhammai.p.J.u;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class a
extends Record {
    private final Runnable e;
    private final u g;

    public a(Runnable runnable, u u2) {
        this.e = runnable;
        this.g = u2;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "e;g", "e", "g"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "e;g", "e", "g"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "e;g", "e", "g"}, this, object);
    }

    public Runnable E() {
        return this.e;
    }

    public u g() {
        return this.g;
    }
}

