/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2338
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_4587
 */
package dev.idhammai.c.r.q.A;

import dev.idhammai.P.A.A.m;
import dev.idhammai.P.A.S.K;
import dev.idhammai.P.A.S.f;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.R;
import dev.idhammai.c.r.q.A.i;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_4587;

class S {
    final i q;

    private S(i i2) {
        this.q = i2;
    }

    @r
    public void R(R r2) {
        class_2338 class_23382 = this.q.AS.h() && this.q.h != null ? this.q.Au : this.q.h;
        class_2338 class_23383 = class_23382;
        if (class_23382 != null) {
            this.q.Xl = class_23382.method_10074().method_46558();
        }
        if (this.q.Xl == null) {
            return;
        }
        double d2 = this.q.F.e() >= 1.0 ? (this.q.A_.m((long)(this.q.AP.e() * 1000.0)) ? 0.0 : 0.5) : (this.q.AA = m.N(this.q.AA, this.q.A_.m((long)(this.q.AP.e() * 1000.0)) ? 0.0 : 0.5, this.q.F.e() / 10.0));
        if (this.q.AA == 0.0) {
            this.q.P = null;
            return;
        }
        class_243 class_2432 = this.q.P = this.q.P == null || this.q.AG.e() >= 1.0 ? this.q.Xl : new class_243(m.N(this.q.P.field_1352, this.q.Xl.field_1352, this.q.AG.e() / 10.0), m.N(this.q.P.field_1351, this.q.Xl.field_1351, this.q.AG.e() / 10.0), m.N(this.q.P.field_1350, this.q.Xl.field_1350, this.q.AG.e() / 10.0));
        if (this.q.A4.h()) {
            class_238 class_2383 = new class_238(this.q.P, this.q.P);
            class_2383 = this.q.R.h() ? class_2383.method_1014(this.q.AA) : class_2383.method_1014(0.5);
            class_4587 class_45872 = r2.m;
            if (this.q.Aq.i) {
                K.F(class_45872, class_2383, f.y(this.q.Aq.P(), (int)((double)this.q.Aq.P().getAlpha() * this.q.AA * 2.0)));
            }
            if (this.q.V.i) {
                K.Y(class_45872, class_2383, f.y(this.q.V.P(), (int)((double)this.q.V.P().getAlpha() * this.q.AA * 2.0)), this.q.XU.Z());
            }
        }
        if (this.q.A8.i && this.q.At > 0.0f && !this.q.A_.m((long)(this.q.AP.e() * 1000.0))) {
            K.x(this.q.AR.format(this.q.At), this.q.P, this.q.A8.P());
        }
    }
}

