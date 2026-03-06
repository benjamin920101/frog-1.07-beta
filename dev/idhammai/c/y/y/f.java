/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.y.y;

import dev.idhammai.c.y.y.W;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class f
extends Record {
    private final int d;
    private final int r;
    private final int KL;
    private final int o;
    private final char s;
    private final W q;

    f(int n2, int n3, int n4, int n5, char c2, W w2) {
        this.d = n2;
        this.r = n3;
        this.KL = n4;
        this.o = n5;
        this.s = c2;
        this.q = w2;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{f.class, "d;r;KL;o;s;q", "d", "r", "KL", "o", "s", "q"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{f.class, "d;r;KL;o;s;q", "d", "r", "KL", "o", "s", "q"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{f.class, "d;r;KL;o;s;q", "d", "r", "KL", "o", "s", "q"}, this, object);
    }

    public int D() {
        return this.d;
    }

    public int R() {
        return this.r;
    }

    public int KL() {
        return this.KL;
    }

    public int O() {
        return this.o;
    }

    public char S() {
        return this.s;
    }

    public W q() {
        return this.q;
    }
}

