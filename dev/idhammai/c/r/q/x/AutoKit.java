/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.x;

import dev.idhammai.P.A.A.h;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.N;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.c.r.O.Y.v;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;

public class F
extends y {
    public static F V;
    final v E = this.E(new v("Command", "kit 1").c("\u5957\u88c5\u547d\u4ee4"));
    boolean r = false;
    final h U = new h();

    public F() {
        super("AutoKit", w.Misc);
        this.L("\u81ea\u52a8\u914d\u88c5\u547d\u4ee4");
        V = this;
    }

    @Override
    public void F() {
        this.r = true;
        this.U.H();
    }

    @r
    public void a(N n2) {
        if (n2.s() == F.W.field_1724) {
            this.r = true;
            this.U.H();
        }
    }

    @r
    public void g(QO qO) {
        if (this.r && this.U.r(2.0)) {
            this.r = false;
            F.W.field_1724.field_3944.method_45731(this.E.q());
        }
    }
}

