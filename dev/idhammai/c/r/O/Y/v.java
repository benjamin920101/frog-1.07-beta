/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.O.Y;

import java.util.function.BooleanSupplier;

public class v
extends dev.idhammai.c.r.O.v {
    private final String P;
    private String c;
    private Runnable J = null;
    private boolean Z = false;

    public v(String string, String string2) {
        super(string);
        this.c = string2;
        this.P = string2;
    }

    public v(String string, String string2, BooleanSupplier booleanSupplier) {
        super(string, booleanSupplier);
        this.c = string2;
        this.P = string2;
    }

    public v c(String string) {
        super.V(string);
        return this;
    }

    public String q() {
        return this.c;
    }

    public void z(String string) {
        this.c = string;
        if (this.Z) {
            this.J.run();
        }
    }

    public v X(Runnable runnable) {
        this.J = runnable;
        this.Z = true;
        return this;
    }

    public String w() {
        return this.P;
    }
}

