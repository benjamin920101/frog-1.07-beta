/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.Vec3d
 */
package dev.idhammai.P.A.A;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.util.math.Vec3d;

public final class i
extends Record {
    private final class_243 v;
    private final class_243 a;

    public i(class_243 class_2432, class_243 class_2433) {
        this.v = class_2432;
        this.a = class_2433;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{i.class, "v;a", "v", "a"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{i.class, "v;a", "v", "a"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{i.class, "v;a", "v", "a"}, this, object);
    }

    public class_243 V() {
        return this.v;
    }

    public class_243 A() {
        return this.a;
    }
}

