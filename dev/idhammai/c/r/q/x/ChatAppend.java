/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.x;

import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.X;
import dev.idhammai.c.r.O.Y.v;
import dev.idhammai.c.r.q.x.s;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;

public class e
extends y {
    public static e p;
    private final v K = this.E(new v("Text", "Frog").c("\u540e\u7f00\u6587\u672c"));

    public e() {
        super("ChatAppend", w.Misc);
        this.L("\u6d88\u606f\u540e\u7f00");
        p = this;
    }

    @r
    public void E(X x2) {
        if (e.M() || x2.p() || s.E) {
            return;
        }
        String string = x2.p;
        if (string.startsWith("/") || string.startsWith("!") || string.startsWith("$") || string.startsWith("#") || string.endsWith(this.K.q())) {
            return;
        }
        String string2 = this.K.q();
        x2.p = string + " " + string2;
    }
}

