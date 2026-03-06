/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.O.Y;

import dev.idhammai.c.r.O.v;
import java.util.function.BooleanSupplier;

public class T
extends v {
    private boolean O = false;
    private boolean a = false;

    public T(String string) {
        super(string);
    }

    public T(String string, BooleanSupplier booleanSupplier) {
        super(string, booleanSupplier);
    }

    public T T(String string) {
        super.V(string);
        return this;
    }

    public boolean h() {
        if (this.O) {
            return this.a;
        }
        return true;
    }

    public void q(boolean bl) {
        this.a = bl;
    }

    public boolean F() {
        return this.O;
    }

    public T x() {
        this.O = true;
        return this;
    }
}

