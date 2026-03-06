/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_238
 */
package dev.idhammai.c.r.q.D;

import dev.idhammai.P.A.L.e;
import dev.idhammai.P.A.l.M;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.G;
import dev.idhammai.P.r.c.T;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import net.minecraft.class_1297;
import net.minecraft.class_238;

public class i
extends y {
    public static i M;
    private final W L = this.S(new W("Legit", true).k("\u5408\u6cd5\u6a21\u5f0f"));
    private final W m = this.S(new W("OnlyInsideBlock", false).k("\u4ec5\u5361\u5899\u751f\u6548"));

    public i() {
        super("SafeWalk", w.Movement);
        this.L("\u8fb9\u7f18\u884c\u8d70");
        M = this;
    }

    @r(D=-200)
    public void n(G g2) {
        if (i.W.field_1724.method_24828() && this.L.h() && this.c()) {
            if (this.a(0.3, -1.0, 0.0)) {
                i.W.field_1724.field_3913.field_3903 = true;
            } else if (this.a(0.0, -1.0, 0.3)) {
                i.W.field_1724.field_3913.field_3903 = true;
            } else if (this.a(0.3, -1.0, 0.3)) {
                i.W.field_1724.field_3913.field_3903 = true;
            } else if (this.a(-0.3, -1.0, 0.0)) {
                i.W.field_1724.field_3913.field_3903 = true;
            } else if (this.a(0.0, -1.0, -0.3)) {
                i.W.field_1724.field_3913.field_3903 = true;
            } else if (this.a(-0.3, -1.0, -0.3)) {
                i.W.field_1724.field_3913.field_3903 = true;
            }
        }
    }

    @r(D=-100)
    public void a(T t2) {
        if (i.W.field_1724.method_24828() && !this.L.h() && this.c()) {
            double d2 = t2.Z();
            double d3 = t2.G();
            double d4 = t2.w();
            double d5 = 0.05;
            while (d2 != 0.0 && this.a(d2, -1.0, 0.0)) {
                if (d2 < d5 && d2 >= -d5) {
                    d2 = 0.0;
                    continue;
                }
                if (d2 > 0.0) {
                    d2 -= d5;
                    continue;
                }
                d2 += d5;
            }
            while (d4 != 0.0 && this.a(0.0, -1.0, d4)) {
                if (d4 < d5 && d4 >= -d5) {
                    d4 = 0.0;
                    continue;
                }
                if (d4 > 0.0) {
                    d4 -= d5;
                    continue;
                }
                d4 += d5;
            }
            while (d2 != 0.0 && d4 != 0.0 && this.a(d2, -1.0, d4)) {
                double d6;
                double d7 = d2 < d5 && d2 >= -d5 ? 0.0 : (d6 = (d2 = d2 > 0.0 ? d2 - d5 : d2 + d5));
                if (d4 < d5 && d4 >= -d5) {
                    d4 = 0.0;
                    continue;
                }
                if (d4 > 0.0) {
                    d4 -= d5;
                    continue;
                }
                d4 += d5;
            }
            t2.C(d2);
            t2.Z(d3);
            t2.p(d4);
        }
    }

    public boolean c() {
        return !this.m.h() || e.j();
    }

    public boolean a(double d2, double d3, double d4) {
        class_238 class_2383 = i.W.field_1724.method_5829();
        class_238 class_2384 = new class_238(class_2383.field_1323, class_2383.field_1322, class_2383.field_1324, class_2383.field_1320, class_2383.field_1322 + 0.5, class_2383.field_1324);
        return !dev.idhammai.P.A.l.M.d((class_1297)i.W.field_1724, class_2384.method_989(d2, d3, d4));
    }
}

