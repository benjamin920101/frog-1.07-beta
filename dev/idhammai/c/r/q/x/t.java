/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.x;

import dev.idhammai.P.A.A.h;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.O.Y.v;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;

public class t
extends y {
    public static t w;
    public final l L = this.p(new l("AfterLoginTime", 3.0, 0.0, 10.0, 0.1).D("\u767b\u5f55\u540e\u5ef6\u8fdf").P("s"));
    final v Z = this.E(new v("Password", "123456").c("\u5bc6\u7801"));
    final v I = this.E(new v("ServerIP", "2b2t.xin").c("\u670d\u52a1\u5668\u5173\u952e\u8bcd"));
    private final h g = new h();
    private boolean D = false;

    public t() {
        super("AutoLogin", dev.idhammai.c.r.w.Misc);
        this.L("\u81ea\u52a8\u767b\u5f55");
        w = this;
    }

    @r
    public void B(QO qO) {
        if (this.D && this.g.r(this.L.e())) {
            if (W.method_1542()) {
                this.D = false;
                return;
            }
            if (!this.I.q().isEmpty() && W.method_1558() != null && !t.W.method_1558().field_3761.contains(this.I.q())) {
                this.D = false;
                return;
            }
            W.method_1562().method_45730("login " + this.Z.q());
            this.D = false;
        }
    }

    @Override
    public void F() {
        this.D = true;
        this.g.H();
    }
}

