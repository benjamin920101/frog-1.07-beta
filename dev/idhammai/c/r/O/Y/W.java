/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.O.Y;

import dev.idhammai.c.r.O.v;
import java.util.function.BooleanSupplier;

public class W
extends v {
    private final boolean E;
    private boolean P;
    private boolean A = false;
    private boolean n = false;
    private Runnable V = null;
    private boolean Y = false;

    public W(String string, boolean bl) {
        super(string);
        this.E = bl;
        this.P = bl;
    }

    public W(String string, boolean bl, BooleanSupplier booleanSupplier) {
        super(string, booleanSupplier);
        this.E = bl;
        this.P = bl;
    }

    public W k(String string) {
        super.V(string);
        return this;
    }

    public boolean h() {
        return this.P;
    }

    public void x(boolean bl) {
        this.P = bl;
        if (this.Y) {
            this.V.run();
        }
    }

    public void J(boolean bl) {
        this.P = bl;
    }

    public boolean f() {
        if (this.A) {
            return this.n;
        }
        return true;
    }

    public void r(boolean bl) {
        this.n = bl;
    }

    public boolean y() {
        return this.A;
    }

    public W D() {
        this.A = true;
        return this;
    }

    public W M(Runnable runnable) {
        this.V = runnable;
        this.Y = true;
        return this;
    }

    public boolean z() {
        return this.E;
    }
}

