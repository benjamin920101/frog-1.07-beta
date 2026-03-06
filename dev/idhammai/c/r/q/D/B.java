/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.D;

import dev.idhammai.P.A.R.F;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.c.r.q.D.h;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;

public class B
extends y {
    public static B E;
    private final dev.idhammai.c.r.O.Y.B<h> M = this.S(new dev.idhammai.c.r.O.Y.B<h>("Mode", h.Forward).I("\u6a21\u5f0f").X(h.Forward, "\u524d\u8fdb").X(h.Path, "\u8def\u5f84"));
    boolean V = false;

    public B() {
        super("AutoWalk", w.Movement);
        this.L("\u81ea\u52a8\u524d\u8fdb");
        E = this;
    }

    @Override
    public void H() {
        this.V = false;
    }

    @Override
    public void W() {
        this.p();
    }

    @r
    public void k(QO qO) {
        if (this.M.x(h.Forward)) {
            B.W.field_1690.field_1894.method_23481(true);
        } else if (this.M.x(h.Path)) {
            if (!this.V) {
                F.f();
                this.V = true;
            } else if (!F.D()) {
                this.p();
            }
        }
    }

    @Override
    public void L() {
        F.g();
    }

    public boolean u() {
        return this.p() && this.M.x(h.Forward);
    }
}

