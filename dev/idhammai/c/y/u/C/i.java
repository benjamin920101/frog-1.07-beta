/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1792
 */
package dev.idhammai.c.y.u.C;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.class_1792;

final class i
extends Record {
    private final float k;
    private final float x;
    private final class_1792 n;
    private final String b;

    private i(float f2, float f3, class_1792 class_17922, String string) {
        this.k = f2;
        this.x = f3;
        this.n = class_17922;
        this.b = string;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{i.class, "k;x;n;b", "k", "x", "n", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{i.class, "k;x;n;b", "k", "x", "n", "b"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{i.class, "k;x;n;b", "k", "x", "n", "b"}, this, object);
    }

    public float k() {
        return this.k;
    }

    public float x() {
        return this.x;
    }

    public class_1792 N() {
        return this.n;
    }

    public String B() {
        return this.b;
    }
}

