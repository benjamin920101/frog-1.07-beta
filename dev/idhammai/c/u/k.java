/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.u;

import dev.idhammai.Frog;
import dev.idhammai.P.A.J;
import dev.idhammai.p.J.S;
import java.util.List;
import java.util.Objects;

public abstract class k
implements J {
    protected final String N;
    protected final String K;

    public k(String string, String string2) {
        this.N = Objects.requireNonNull(string);
        this.K = Objects.requireNonNull(string2);
    }

    public String W() {
        return this.N;
    }

    public String t() {
        return this.K;
    }

    public abstract void h(String[] var1);

    public abstract String[] l(int var1, List<String> var2);

    public void F() {
        this.y("\u00a74Parameter error \u00a7r" + Frog.getPrefix() + this.W() + " \u00a77" + this.t());
    }

    public void y(String string) {
        S.z(string);
    }
}

