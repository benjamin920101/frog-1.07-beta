/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2246
 *  net.minecraft.class_2338
 */
package dev.idhammai.c.r.q.A;

import dev.idhammai.Frog;
import dev.idhammai.P.A.l.M;
import dev.idhammai.P.A.l.k;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.c.r.O.Y.B;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.q.A.u;
import dev.idhammai.c.r.q.i.a;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import net.minecraft.class_2246;
import net.minecraft.class_2338;

public class e
extends y {
    public static e u;
    final double[] X = new double[]{0.0, 0.3, -0.3};
    private final B<u> p = this.S(new B<u>("While", dev.idhammai.c.r.q.A.u.Crawling).I("\u89e6\u53d1\u65f6\u673a").X(dev.idhammai.c.r.q.A.u.Crawling, "\u8db4\u4e0b\u65f6").X(dev.idhammai.c.r.q.A.u.Mining, "\u6316\u6398\u65f6").X(dev.idhammai.c.r.q.A.u.Always, "\u59cb\u7ec8"));
    private final W a = this.S(new W("Web", true).k("\u86db\u7f51"));
    public boolean k = false;

    public e() {
        super("AntiCrawl", w.Combat);
        this.L("\u53cd\u8db4\u4e0b");
        u = this;
    }

    @r
    public void Y(QO qO) {
        this.k = false;
        if (e.W.field_1724.method_6128()) {
            return;
        }
        if (this.p.x(dev.idhammai.c.r.q.A.u.Always) && M.x(e.W.field_1724.method_24515()) != class_2246.field_9987 || e.W.field_1724.method_20448() || this.p.x(dev.idhammai.c.r.q.A.u.Mining) && Frog.BREAK.X(e.W.field_1724.method_24515())) {
            for (double d2 : this.X) {
                for (double d3 : this.X) {
                    k k2;
                    k k3 = new k(e.W.field_1724.method_23317() + d2, e.W.field_1724.method_23318() + 1.2, e.W.field_1724.method_23321() + d3);
                    if (this.d(k3)) {
                        dev.idhammai.c.r.q.i.a.D5.d(k3);
                        this.k = true;
                        return;
                    }
                    if (!this.a.h() || e.W.field_1687.method_8320((class_2338)(k2 = new k(e.W.field_1724.method_23317() + d2, e.W.field_1724.method_23318(), e.W.field_1724.method_23321() + d3))).method_26204() != class_2246.field_10343 || !this.d(k2)) continue;
                    dev.idhammai.c.r.q.i.a.D5.d(k2);
                    this.k = true;
                    return;
                }
            }
        }
    }

    private boolean d(class_2338 class_23382) {
        return (M.S(class_23382) != null || class_23382.equals((Object)dev.idhammai.c.r.q.i.a.q())) && !dev.idhammai.c.r.q.i.a.e(class_23382) && !e.W.field_1687.method_22347(class_23382);
    }
}

