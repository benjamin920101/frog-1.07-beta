/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.Vec3d
 */
package dev.idhammai.P.A.R;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.util.math.Vec3d;

public final class n
extends Record {
    private final double w;
    private final double m;
    private final double j;

    public n(double d2, double d3, double d4) {
        this.w = d2;
        this.m = d3;
        this.j = d4;
    }

    public n T(double d2, double d3, double d4) {
        return new n(this.w + d2, this.m + d3, this.j + d4);
    }

    public n R() {
        return new n(Math.floor(this.w), Math.floor(this.m), Math.floor(this.j));
    }

    public double b(n n2) {
        return Math.pow(n2.w - this.w, 2.0) + Math.pow(n2.m - this.m, 2.0) + Math.pow(n2.j - this.j, 2.0);
    }

    public n N(n n2) {
        return this.T(n2.w(), n2.M(), n2.j());
    }

    public class_243 S() {
        return new class_243(this.w, this.m, this.j);
    }

    @Override
    public String toString() {
        return "[" + this.w + ";" + this.m + ";" + this.j + "]";
    }

    @Override
    public boolean equals(Object object) {
        double d2;
        double d3;
        if (!(object instanceof n)) {
            return false;
        }
        n n2 = (n)object;
        try {
            d2 = d3 = n2.w();
        }
        catch (Throwable throwable) {
            throw new MatchException(throwable.toString(), throwable);
        }
        double d4 = d3 = n2.M();
        double d5 = d3 = n2.j();
        if (this.w != d2) {
            return false;
        }
        if (this.m != d4) {
            return false;
        }
        return this.j == d5;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{n.class, "w;m;j", "w", "m", "j"}, this);
    }

    public double w() {
        return this.w;
    }

    public double M() {
        return this.m;
    }

    public double j() {
        return this.j;
    }
}

