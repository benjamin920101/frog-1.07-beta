/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_4587
 *  net.minecraft.class_5498
 */
package dev.idhammai.c.r.q.n;

import dev.idhammai.P.A.A.S;
import dev.idhammai.c.r.O.Y.B;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import net.minecraft.class_4587;
import net.minecraft.class_5498;

public class d
extends y {
    public static d c;
    public final l g = this.p(new l("Distance", 4.0, 1.0, 20.0).D("\u8ddd\u79bb"));
    public final l Q = this.p(new l("AnimationTime", 200, 0, 1000).D("\u52a8\u753b\u65f6\u95f4"));
    private final B<S> G = this.S(new B<S>("Ease", dev.idhammai.P.A.A.S.CubicInOut).I("\u7f13\u52a8"));
    final dev.idhammai.P.A.A.d C = new dev.idhammai.P.A.A.d(300L);
    private final W l = this.S(new W("NoFront", false).k("\u7981\u7528\u524d\u89c6"));
    boolean n = false;

    public d() {
        super("CameraClip", w.Render);
        this.L("\u6444\u50cf\u673a\u7a7f\u5899");
        c = this;
    }

    @Override
    public void h(class_4587 class_45872) {
        if (d.W.field_1690.method_31044() == class_5498.field_26666 && this.l.h()) {
            d.W.field_1690.method_31043(class_5498.field_26664);
        }
        this.C.S(this.Q.V());
        if (d.W.field_1690.method_31044() == class_5498.field_26664) {
            if (!this.n) {
                this.n = true;
                this.C.e();
            }
        } else if (this.n) {
            this.n = false;
            this.C.e();
        }
    }

    public double I() {
        double d2 = d.W.field_1690.method_31044() == class_5498.field_26664 ? 1.0 - this.C.M(this.G.X()) : this.C.M(this.G.X());
        return this.g.e() * d2 - 1.0 + 1.0;
    }
}

