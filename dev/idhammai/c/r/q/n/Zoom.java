/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.n;

import dev.idhammai.Frog;
import dev.idhammai.P.A.A.S;
import dev.idhammai.P.A.A.k;
import dev.idhammai.c.r.O.Y.B;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.q.n.c;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;

public class t
extends y {
    public static t d;
    public static boolean w;
    public final B<S> D = this.S(new B<S>("Ease", dev.idhammai.P.A.A.S.CubicInOut).I("\u7f13\u52a8"));
    final l k = this.p(new l("ZoomFov", 60.0, 0.0, 130.0, 1.0).D("\u7f29\u653e\u89c6\u89d2"));
    final k r = new k();
    private final l a = this.p(new l("AnimTime", 300, 0, 1000).D("\u52a8\u753b\u65f6\u95f4"));
    public double V;

    public t() {
        super("Zoom", dev.idhammai.c.r.w.Render);
        this.L("\u653e\u5927");
        d = this;
        Frog.EVENT_BUS.S(new c(this));
    }

    @Override
    public void H() {
        if (t.M()) {
            this.p();
        }
    }

    static {
        w = false;
    }
}

