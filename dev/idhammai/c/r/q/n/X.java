/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2338
 *  net.minecraft.class_238
 *  net.minecraft.class_4587
 */
package dev.idhammai.c.r.q.n;

import dev.idhammai.P.A.A.d;
import dev.idhammai.P.A.J;
import dev.idhammai.P.A.S.K;
import dev.idhammai.P.A.S.f;
import dev.idhammai.c.r.q.n.h;
import dev.idhammai.c.r.q.n.y;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_4587;

public class X {
    public final d y;
    public final class_2338 d;
    public final dev.idhammai.P.A.A.h n;
    public boolean c;
    final h X;

    public X(h h2, class_2338 class_23382) {
        this.X = h2;
        this.y = new d((long)h2.w.e());
        this.d = class_23382;
        this.n = new dev.idhammai.P.A.A.h();
        this.c = true;
    }

    public boolean t(class_4587 class_45872) {
        double d2;
        if (this.c) {
            if (this.X.d.h() || !J.W.field_1687.method_22347(this.d)) {
                this.c = false;
            } else {
                if (!this.n.S(this.X.s.e())) {
                    this.y.e();
                    class_238 class_2383 = new class_238(this.d);
                    if (this.X.u.i) {
                        K.F(class_45872, class_2383, this.X.u.P());
                    }
                    if (this.X.e.i) {
                        K.N(class_45872, class_2383, this.X.e.P());
                    }
                }
                return false;
            }
        }
        if ((d2 = this.y.M(this.X.Z.X())) == 1.0) {
            return true;
        }
        double d3 = this.X.E.X() == dev.idhammai.c.r.q.n.y.Fade || this.X.E.X() == dev.idhammai.c.r.q.n.y.All ? 1.0 - d2 : 1.0;
        double d4 = this.X.E.X() == dev.idhammai.c.r.q.n.y.Shrink || this.X.E.X() == dev.idhammai.c.r.q.n.y.All ? d2 : 0.0;
        class_238 class_2384 = new class_238(this.d).method_1009(-d4 * 0.5, -d4 * 0.5, -d4 * 0.5);
        if (this.X.h.i) {
            K.F(class_45872, class_2384, f.y(this.X.h.P(), (int)((double)this.X.h.P().getAlpha() * d3)));
        }
        if (this.X.M.i) {
            K.N(class_45872, class_2384, f.y(this.X.M.P(), (int)((double)this.X.M.P().getAlpha() * d3)));
        }
        return false;
    }
}

