/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2338
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 */
package dev.idhammai.c.r.q.A;

import dev.idhammai.P.A.A.m;
import dev.idhammai.P.A.S.f;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.R;
import dev.idhammai.c.r.q.A.O;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;

public class l {
    final O m;

    public l(O o2) {
        this.m = o2;
    }

    @r
    public void e(R r2) {
        class_2338 class_23382 = O.c.GD;
        if (class_23382 != null) {
            this.m.Gh.H();
            O.d = class_23382.method_46558();
        }
        if (O.d == null) {
            return;
        }
        double d2 = this.m.GS.e() >= 1.0 ? (this.m.Gh.m((long)(this.m.GL.e() * 1000.0)) ? 0.0 : 0.5) : (this.m.GR = dev.idhammai.P.A.A.m.N(this.m.GR, this.m.Gh.m((long)(this.m.GL.e() * 1000.0)) ? 0.0 : 0.5, this.m.GS.e() / 10.0));
        if (this.m.GR == 0.0) {
            O.Gg = null;
            return;
        }
        class_243 class_2432 = O.Gg = O.Gg == null || this.m.Gc.e() >= 1.0 ? O.d : new class_243(dev.idhammai.P.A.A.m.N(O.Gg.field_1352, O.d.field_1352, this.m.Gc.e() / 10.0), dev.idhammai.P.A.A.m.N(O.Gg.field_1351, O.d.field_1351, this.m.Gc.e() / 10.0), dev.idhammai.P.A.A.m.N(O.Gg.field_1350, O.d.field_1350, this.m.Gc.e() / 10.0));
        if (this.m.Gs.h()) {
            class_238 class_2383 = new class_238(O.Gg, O.Gg);
            class_238 class_2384 = class_2383 = this.m.G2.h() ? class_2383.method_1014(this.m.GR) : class_2383.method_1014(0.5);
            if (this.m.B.i) {
                r2.g(class_2383, f.y(this.m.B.P(), (int)((double)this.m.B.P().getAlpha() * this.m.GR * 2.0)));
            }
            if (this.m.Gl.i) {
                r2.z(class_2383, f.y(this.m.Gl.P(), (int)((double)this.m.Gl.P().getAlpha() * this.m.GR * 2.0)));
            }
        }
    }
}

