/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2338
 */
package dev.idhammai.c.r.q.x;

import dev.idhammai.P.A.A.h;
import java.awt.Color;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.class_2338;

final class b
extends Record {
    private final String g3;
    private final class_2338 w1;
    private final Color aT;
    private final h dG;

    private b(String string, class_2338 class_23382, Color color, h h2) {
        this.g3 = string;
        this.w1 = class_23382;
        this.aT = color;
        this.dG = h2;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "g3;w1;aT;dG", "g3", "w1", "aT", "dG"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "g3;w1;aT;dG", "g3", "w1", "aT", "dG"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "g3;w1;aT;dG", "g3", "w1", "aT", "dG"}, this, object);
    }

    public String G3() {
        return this.g3;
    }

    public class_2338 w1() {
        return this.w1;
    }

    public Color aT() {
        return this.aT;
    }

    public h dG() {
        return this.dG;
    }
}

