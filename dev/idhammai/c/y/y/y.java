/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.y.y;

import dev.idhammai.c.y.y.f;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class y
extends Record {
    private final float z;
    private final float u;
    private final float h;
    private final float t;
    private final float c;
    private final f p;

    y(float f2, float f3, float f4, float f5, float f6, f f7) {
        this.z = f2;
        this.u = f3;
        this.h = f4;
        this.t = f5;
        this.c = f6;
        this.p = f7;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{y.class, "z;u;h;t;c;p", "z", "u", "h", "t", "c", "p"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{y.class, "z;u;h;t;c;p", "z", "u", "h", "t", "c", "p"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{y.class, "z;u;h;t;c;p", "z", "u", "h", "t", "c", "p"}, this, object);
    }

    public float Z() {
        return this.z;
    }

    public float U() {
        return this.u;
    }

    public float h() {
        return this.h;
    }

    public float T() {
        return this.t;
    }

    public float c() {
        return this.c;
    }

    public f p() {
        return this.p;
    }
}

