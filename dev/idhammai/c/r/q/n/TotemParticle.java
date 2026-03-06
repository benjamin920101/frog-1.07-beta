/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.n;

import dev.idhammai.P.A.S.f;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.K;
import dev.idhammai.c.r.O.Y.A;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import java.awt.Color;
import java.util.Random;

public class a
extends y {
    public static a Q;
    public final l d = this.p(new l("VelocityXZ", 100.0, 0.0, 500.0, 1.0).D("\u6c34\u5e73\u901f\u5ea6").P("%"));
    public final l U = this.p(new l("VelocityY", 100.0, 0.0, 500.0, 1.0).D("\u5782\u76f4\u901f\u5ea6").P("%"));
    final Random a = new Random();
    private final A g = this.y(new A("Color", new Color(255, 255, 255, 255)).P("\u989c\u82721"));
    private final A f = this.y(new A("Color2", new Color(0, 0, 0, 255)).P("\u989c\u82722"));

    public a() {
        super("TotemParticle", w.Render);
        this.L("\u81ea\u5b9a\u4e49\u56fe\u817e\u7c92\u5b50");
        Q = this;
    }

    @r
    public void z(K k2) {
        k2.L();
        k2.X *= this.d.e() / 100.0;
        k2.c *= this.d.e() / 100.0;
        k2.K *= this.U.e() / 100.0;
        k2.u = dev.idhammai.P.A.S.f.U(this.g.P(), this.f.P(), this.a.nextDouble());
    }
}

