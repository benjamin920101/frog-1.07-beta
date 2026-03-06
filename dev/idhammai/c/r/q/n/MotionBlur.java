/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.n;

import dev.idhammai.Frog;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.c.r.O.Y.B;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.q.n.m;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;

public class l
extends y {
    public final dev.idhammai.c.r.O.Y.l a = this.p(new dev.idhammai.c.r.O.Y.l("Strength", 1.0, 0.0, 10.0, 0.1).D("\u5f3a\u5ea6"));
    public final W Q = this.S(new W("Scaling", true).k("\u5237\u65b0\u7387\u7f29\u653e"));
    public final B<m> b = this.S(new B<m>("Algorithm", m.Centered).I("\u7b97\u6cd5"));
    public final W E = this.S(new W("Depth", true).k("\u6df1\u5ea6\u6a21\u7cca"));

    public l() {
        super("MotionBlur", "Applies motion blur to the screen", w.Render);
        this.L("\u52a8\u6001\u6a21\u7cca");
        this.b.X(m.Standard, "\u6807\u51c6");
        this.b.X(m.Centered, "\u4e2d\u5fc3");
    }

    @r
    public void G(QO qO) {
        if (Frog.MOTION_BLUR == null) {
            return;
        }
        Frog.MOTION_BLUR.a = this.p();
        Frog.MOTION_BLUR.K = this.a.Z();
        Frog.MOTION_BLUR.I = this.Q.h();
        Frog.MOTION_BLUR.i = this.b.X().ordinal();
        Frog.MOTION_BLUR.x = this.E.h();
    }

    @Override
    public void L() {
        if (Frog.MOTION_BLUR != null) {
            Frog.MOTION_BLUR.a = false;
        }
    }

    @Override
    public void H() {
        if (Frog.MOTION_BLUR != null) {
            Frog.MOTION_BLUR.a = true;
        }
    }
}

