/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_4587
 */
package dev.idhammai.c.r.q.i;

import dev.idhammai.P.A.L.l;
import dev.idhammai.P.A.R.F;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.A;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import dev.idhammai.p.J.G;
import net.minecraft.class_4587;

public class c
extends y {
    public static c L;
    private final dev.idhammai.c.r.O.Y.l j = this.p(new dev.idhammai.c.r.O.Y.l("HSpeed", 1.0, 0.0, 3.0).D("\u6c34\u5e73\u901f\u5ea6"));
    private final dev.idhammai.c.r.O.Y.l r = this.p(new dev.idhammai.c.r.O.Y.l("VSpeed", 0.42, 0.0, 3.0).D("\u5782\u76f4\u901f\u5ea6"));
    private final W u = this.S(new W("Rotate", true).k("\u81ea\u52a8\u671d\u5411"));
    private float D;
    private float F;
    private float y;
    private float M;
    private double n;
    private double w;
    private double H;
    private double J;
    private double l;
    private double g;
    private float s;
    private float t;

    public c() {
        super("Freecam", dev.idhammai.c.r.w.Player);
        this.L("\u81ea\u7531\u76f8\u673a");
        L = this;
    }

    @Override
    public void H() {
        if (c.M()) {
            this.p();
            return;
        }
        this.s = this.C();
        this.t = this.A();
        this.F = this.A();
        this.D = this.C();
        this.M = this.F;
        this.y = this.D;
        this.n = c.W.field_1724.method_23317();
        this.w = c.W.field_1724.method_23318() + (double)c.W.field_1724.method_18381(c.W.field_1724.method_18376());
        this.H = c.W.field_1724.method_23321();
        this.J = this.n;
        this.l = this.w;
        this.g = this.H;
    }

    @r
    public void T(QO qO) {
        Object[] objectArray;
        if (this.u.h() && c.W.field_1765 != null && c.W.field_1765.method_17784() != null) {
            objectArray = G.X(c.W.field_1765.method_17784());
            this.s = (float)objectArray[0];
            this.t = (float)objectArray[1];
        }
        if (dev.idhammai.P.A.R.F.o()) {
            objectArray = dev.idhammai.P.A.L.l.h(this.j.e());
            this.J = this.n;
            this.l = this.w;
            this.g = this.H;
            this.n += objectArray[0];
            this.H += objectArray[1];
            if (c.W.field_1690.field_1903.method_1434()) {
                this.w += this.r.e();
            }
            if (c.W.field_1690.field_1832.method_1434()) {
                this.w -= this.r.e();
            }
        }
    }

    @r(D=200)
    public void B(A a2) {
        if (dev.idhammai.P.A.R.F.o()) {
            return;
        }
        if (a2.X()) {
            return;
        }
        a2.K(this.s);
        a2.Z(this.t);
    }

    @Override
    public void h(class_4587 class_45872) {
        this.y = this.D;
        this.M = this.F;
        this.D = this.C();
        this.F = this.A();
    }

    private float C() {
        return c.W.field_1724.method_36454();
    }

    private float A() {
        return c.W.field_1724.method_36455();
    }

    @r
    public void J(dev.idhammai.P.r.c.G g2) {
        if (c.W.field_1724 == null) {
            return;
        }
        double[] dArray = dev.idhammai.P.A.L.l.h(this.j.e());
        this.J = this.n;
        this.l = this.w;
        this.g = this.H;
        this.n += dArray[0];
        this.H += dArray[1];
        if (c.W.field_1690.field_1903.method_1434()) {
            this.w += this.r.e();
        }
        if (c.W.field_1690.field_1832.method_1434()) {
            this.w -= this.r.e();
        }
        c.W.field_1724.field_3913.field_3905 = 0.0f;
        c.W.field_1724.field_3913.field_3907 = 0.0f;
        c.W.field_1724.field_3913.field_3904 = false;
        c.W.field_1724.field_3913.field_3903 = false;
    }

    public float h() {
        return dev.idhammai.P.A.A.A.S(this.y, this.D, W.method_60646().method_60637(true));
    }

    public float k() {
        return dev.idhammai.P.A.A.A.S(this.M, this.F, W.method_60646().method_60637(true));
    }

    public double Y() {
        return dev.idhammai.P.A.A.A.Z(this.J, this.n, W.method_60646().method_60637(true));
    }

    public double R() {
        return dev.idhammai.P.A.A.A.Z(this.l, this.w, W.method_60646().method_60637(true));
    }

    public double z() {
        return dev.idhammai.P.A.A.A.Z(this.g, this.H, W.method_60646().method_60637(true));
    }
}

