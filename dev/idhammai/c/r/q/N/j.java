/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.N;

import dev.idhammai.c.r.O.Y.B;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.O.Y.v;
import dev.idhammai.c.r.q.N.N;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import dev.idhammai.p.J.n;

public class j
extends y {
    public static j G;
    public final v m = this.E(new v("Font", "default").c("\u4e3b\u5b57\u4f53").X(this::Y));
    public final v T = this.E(new v("Alternate", "msyh").c("\u5907\u7528\u5b57\u4f53").X(this::Y));
    public final B<N> d = this.S(new B<N>("Style", N.PLAIN).I("\u5b57\u91cd\u6837\u5f0f").X(N.PLAIN, "\u5e38\u89c4").X(N.BOLD, "\u7c97\u4f53").X(N.ITALIC, "\u659c\u4f53").w(this::Y));
    public final l h = this.p(new l("Size", 8.0, 1.0, 15.0, 1.0).D("\u5b57\u53f7").i(this::Y));
    public final l U = this.p(new l("Shift", 0.0, -10.0, 10.0, 1.0).D("\u5b57\u8ddd\u504f\u79fb").i(this::Y));
    public final l V = this.p(new l("Translate", 0.0, -10.0, 10.0, 1.0).D("\u5782\u76f4\u504f\u79fb").i(this::Y));
    public final W X = this.S(new W("Shadow", true).k("\u5b57\u4f53\u9634\u5f71"));

    public j() {
        super("Fonts", w.Client);
        this.L("\u5b57\u4f53");
        G = this;
    }

    @Override
    public void H() {
        this.Y();
    }

    @Override
    public void L() {
        n.L();
    }

    public void Y() {
        if (!this.p()) {
            return;
        }
        try {
            if (this.m.q().equals("default")) {
                if (this.T.q().equals("null")) {
                    n.w = n.m(this.h.V(), this.m.q(), this.d.X().s());
                    n.E = n.m(6.0f, this.m.q(), this.d.X().s());
                    n.t = n.m(this.h.V() * 2, this.m.q(), this.d.X().s());
                } else {
                    n.w = n.E((float)this.h.V(), this.m.q(), this.d.X().s(), this.T.q());
                    n.E = n.E(6.0f, this.m.q(), this.d.X().s(), this.T.q());
                    n.t = n.E((float)(this.h.V() * 2), this.m.q(), this.d.X().s(), this.T.q());
                }
            } else if (this.T.q().equals("null")) {
                n.w = n.o(this.h.V(), this.m.q(), this.d.X().s());
                n.E = n.o(6, this.m.q(), this.d.X().s());
                n.t = n.o(this.h.V() * 2, this.m.q(), this.d.X().s());
            } else {
                n.w = n.E(this.h.V(), this.m.q(), this.d.X().s(), this.T.q());
                n.E = n.E(6, this.m.q(), this.d.X().s(), this.T.q());
                n.t = n.E(this.h.V() * 2, this.m.q(), this.d.X().s(), this.T.q());
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

