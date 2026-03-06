/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r;

import dev.idhammai.c.r.B;
import dev.idhammai.c.r.K;
import dev.idhammai.c.r.R;
import dev.idhammai.c.r.U;
import dev.idhammai.c.r.X;
import dev.idhammai.c.r.h;
import dev.idhammai.c.r.q.N.I;
import dev.idhammai.c.r.u;

public abstract sealed class w
extends Enum<w>
permits U, B, u, X, h, K, R {
    public static final /* enum */ w Combat = new U();
    public static final /* enum */ w Misc = new B();
    public static final /* enum */ w Render = new u();
    public static final /* enum */ w Movement = new X();
    public static final /* enum */ w Player = new h();
    public static final /* enum */ w Exploit = new K();
    public static final /* enum */ w Client = new R();
    private static final w[] y = w.K();

    public static w[] values() {
        return (w[])y.clone();
    }

    public static w valueOf(String string) {
        return Enum.valueOf(w.class, string);
    }

    public abstract String v();

    public String D() {
        if (I.Q != null && I.Q.C.h()) {
            switch (this.ordinal()) {
                case 0: {
                    return "\u6218\u6597\u7c7b";
                }
                case 1: {
                    return "\u6742\u9879";
                }
                case 2: {
                    return "\u6e32\u67d3\u7c7b";
                }
                case 3: {
                    return "\u79fb\u52a8\u7c7b";
                }
                case 4: {
                    return "\u73a9\u5bb6\u7c7b";
                }
                case 5: {
                    return "\u6f0f\u6d1e\u7c7b";
                }
                case 6: {
                    return "\u5ba2\u6237\u7aef\u7c7b";
                }
            }
        }
        return this.name();
    }

    private static w[] K() {
        return new w[]{Combat, Misc, Render, Movement, Player, Exploit, Client};
    }
}

