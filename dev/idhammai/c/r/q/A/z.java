/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1294
 *  net.minecraft.class_1511
 *  net.minecraft.class_1829
 *  net.minecraft.class_2596
 *  net.minecraft.class_2824
 *  net.minecraft.class_2824$class_5907
 */
package dev.idhammai.c.r.q.A;

import dev.idhammai.P.A.A.h;
import dev.idhammai.P.A.L.e;
import dev.idhammai.P.A.L.g;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.J;
import dev.idhammai.c.r.O.Y.B;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.q.A.G;
import dev.idhammai.c.r.q.A.I;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import net.minecraft.class_1294;
import net.minecraft.class_1511;
import net.minecraft.class_1829;
import net.minecraft.class_2596;
import net.minecraft.class_2824;

public class z
extends y {
    private final B<G> L = this.S(new B<G>("SwapMode", G.Inventory).I("\u5207\u6362\u6a21\u5f0f").X(G.Normal, "\u666e\u901a").X(G.Silent, "\u9759\u9ed8").X(G.Inventory, "\u80cc\u5305"));
    private final l k = this.p(new l("Delay", 100, 0, 500).D("\u95f4\u9694").P("ms"));
    private final W w = this.S(new W("OnlyCrystal", true).k("\u4ec5\u6c34\u6676"));
    private final h R = new h();
    boolean U = false;
    private class_2824 m = null;

    public z() {
        super("AntiWeak", dev.idhammai.c.r.w.Combat);
        this.L("\u53cd\u865a\u5f31");
    }

    @Override
    public String I() {
        return this.L.X().name();
    }

    @r(D=200)
    public void i(J j2) {
        class_2824 class_28242;
        if (dev.idhammai.c.r.q.A.z.M()) {
            return;
        }
        if (j2.p()) {
            return;
        }
        if (this.U) {
            return;
        }
        if (dev.idhammai.c.r.q.A.z.W.field_1724.method_6112(class_1294.field_5911) == null) {
            return;
        }
        if (dev.idhammai.c.r.q.A.z.W.field_1724.method_6047().method_7909() instanceof class_1829) {
            return;
        }
        if (!this.R.S(this.k.e())) {
            return;
        }
        class_2596<?> class_25962 = j2.L();
        if (class_25962 instanceof class_2824 && I.a(class_28242 = (class_2824)class_25962) == class_2824.class_5907.field_29172) {
            if (this.w.h() && !(I.K(class_28242) instanceof class_1511)) {
                return;
            }
            this.m = class_28242;
            this.R.H();
            this.U = true;
            this.y();
            this.U = false;
            j2.L();
        }
    }

    private void y() {
        int n2;
        if (this.m == null) {
            return;
        }
        int n3 = n2 = this.L.X() != G.Inventory ? g.K(class_1829.class) : g.J(class_1829.class);
        if (n2 == -1) {
            return;
        }
        int n4 = dev.idhammai.c.r.q.A.z.W.field_1724.method_31548().field_7545;
        if (this.L.X() != G.Inventory) {
            g.j(n2);
        } else {
            g.z(n2, dev.idhammai.c.r.q.A.z.W.field_1724.method_31548().field_7545);
        }
        W.method_1562().method_52787((class_2596)this.m);
        if (this.L.X() != G.Inventory) {
            if (this.L.X() != G.Normal) {
                g.j(n4);
            }
        } else {
            g.z(n2, dev.idhammai.c.r.q.A.z.W.field_1724.method_31548().field_7545);
            e.t();
        }
    }
}

