/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1657
 *  net.minecraft.class_2596
 *  net.minecraft.class_2828$class_2829
 *  net.minecraft.class_5134
 */
package dev.idhammai.c.r.q.D;

import dev.idhammai.Frog;
import dev.idhammai.P.A.L.e;
import dev.idhammai.P.A.L.l;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.F;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.c.r.O.Y.B;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.q.A.A;
import dev.idhammai.c.r.q.A.q;
import dev.idhammai.c.r.q.D.c;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import net.minecraft.class_1657;
import net.minecraft.class_2596;
import net.minecraft.class_2828;
import net.minecraft.class_5134;

public class G
extends y {
    private final B<c> c = this.S(new B<c>("Mode", dev.idhammai.c.r.q.D.c.Vanilla).I("\u6a21\u5f0f").X(dev.idhammai.c.r.q.D.c.Vanilla, "\u539f\u7248").X(dev.idhammai.c.r.q.D.c.OldNCP, "\u65e7NCP").X(dev.idhammai.c.r.q.D.c.NCP, "NCP"));
    private final dev.idhammai.c.r.O.Y.l P = this.p(new dev.idhammai.c.r.O.Y.l("Height", 1.0, 0.0, 5.0, 0.5).D("\u9ad8\u5ea6"));
    private final W a = this.S(new W("Timer", true, this::lambda$new$0).k("\u8ba1\u65f6"));
    private final W Y = this.S(new W("Fast", true, this::lambda$new$1).k("\u5feb\u901f"));
    private final W w = this.S(new W("OnlyMoving", true).k("\u4ec5\u79fb\u52a8\u65f6\u751f\u6548"));
    private final W j = this.S(new W("SurroundPause", true).k("\u73af\u7ed5\u6682\u505c"));
    private final W B = this.S(new W("InWebPause", true).k("\u86db\u7f51\u6682\u505c"));
    private final W G = this.S(new W("InBlockPause", true).k("\u5361\u65b9\u5757\u6682\u505c"));
    private final W V = this.S(new W("SneakingPause", true).k("\u6f5c\u884c\u6682\u505c"));
    private final W K = this.S(new W("PathingPause", true).k("\u5bfb\u8def\u6682\u505c"));
    boolean T;
    int y = 0;

    public G() {
        super("Step", "Steps up blocks.", dev.idhammai.c.r.w.Movement);
        this.L("\u6b65\u884c\u8f85\u52a9");
    }

    public static void q(float f2) {
        dev.idhammai.c.r.q.D.G.W.field_1724.method_5996(class_5134.field_47761).method_6192((double)f2);
    }

    @Override
    public void L() {
        if (dev.idhammai.c.r.q.D.G.M()) {
            return;
        }
        dev.idhammai.c.r.q.D.G.q(0.6f);
        Frog.TIMER.g();
    }

    @Override
    public String I() {
        return this.c.X().name();
    }

    @r
    public void A(QO qO) {
        if (this.K.h() && dev.idhammai.P.A.R.F.D() || this.V.h() && dev.idhammai.c.r.q.D.G.W.field_1724.method_5715() || this.G.h() && e.j() || dev.idhammai.c.r.q.D.G.W.field_1724.method_5771() || dev.idhammai.c.r.q.D.G.W.field_1724.method_5799() || this.B.h() && Frog.PLAYER.n((class_1657)dev.idhammai.c.r.q.D.G.W.field_1724) || !dev.idhammai.c.r.q.D.G.W.field_1724.method_24828() || this.w.h() && !l.b() || this.j.h() && (q.y.p() || A.P.p())) {
            dev.idhammai.c.r.q.D.G.q(0.6f);
            return;
        }
        dev.idhammai.c.r.q.D.G.q(this.P.Z());
    }

    @r
    public void c(F f2) {
        if (f2.C()) {
            --this.y;
            return;
        }
        if (this.T && this.y <= 0) {
            Frog.TIMER.g();
            this.T = false;
        }
        boolean bl = this.c.X() == dev.idhammai.c.r.q.D.c.NCP;
        boolean bl2 = bl;
        if (this.c.X().equals((Object)dev.idhammai.c.r.q.D.c.OldNCP) || bl) {
            double d2 = dev.idhammai.c.r.q.D.G.W.field_1724.method_23318() - dev.idhammai.c.r.q.D.G.W.field_1724.field_6036;
            if (d2 <= 0.75 || d2 > this.P.e()) {
                return;
            }
            double[] dArray = this.b(d2);
            if (dArray != null && dArray.length > 1) {
                if (this.a.h()) {
                    Frog.TIMER.s((float)this.A(d2));
                    this.T = true;
                    this.y = 2;
                }
                for (double d3 : dArray) {
                    W.method_1562().method_52787((class_2596)new class_2828.class_2829(dev.idhammai.c.r.q.D.G.W.field_1724.field_6014, dev.idhammai.c.r.q.D.G.W.field_1724.field_6036 + d3, dev.idhammai.c.r.q.D.G.W.field_1724.field_5969, false));
                }
            }
        }
    }

    public double A(double d2) {
        if (d2 > 0.6 && d2 <= 1.0) {
            if (!this.Y.h() && this.c.X() == dev.idhammai.c.r.q.D.c.NCP) {
                return 0.3333333333333333;
            }
            return 0.5;
        }
        double[] dArray = this.b(d2);
        if (dArray == null) {
            return 1.0;
        }
        return 1.0 / (double)dArray.length;
    }

    public double[] b(double d2) {
        boolean bl = this.c.X() == dev.idhammai.c.r.q.D.c.NCP;
        boolean bl2 = bl;
        if (d2 == 0.75) {
            if (bl) {
                return new double[]{0.42, 0.753, 0.75};
            }
            return new double[]{0.42, 0.753};
        }
        if (d2 == 0.8125) {
            if (bl) {
                return new double[]{0.39, 0.7, 0.8125};
            }
            return new double[]{0.39, 0.7};
        }
        if (d2 == 0.875) {
            if (bl) {
                return new double[]{0.39, 0.7, 0.875};
            }
            return new double[]{0.39, 0.7};
        }
        if (d2 == 1.0) {
            if (bl) {
                return new double[]{0.42, 0.753, 1.0};
            }
            return new double[]{0.42, 0.753};
        }
        if (d2 == 1.5) {
            return new double[]{0.42, 0.75, 1.0, 1.16, 1.23, 1.2};
        }
        if (d2 == 2.0) {
            return new double[]{0.42, 0.78, 0.63, 0.51, 0.9, 1.21, 1.45, 1.43};
        }
        if (d2 == 2.5) {
            return new double[]{0.425, 0.821, 0.699, 0.599, 1.022, 1.372, 1.652, 1.869, 2.019, 1.907};
        }
        return null;
    }

    private boolean lambda$new$1() {
        return this.c.X() == dev.idhammai.c.r.q.D.c.NCP && this.a.h();
    }

    private boolean lambda$new$0() {
        return this.c.X() == dev.idhammai.c.r.q.D.c.OldNCP || this.c.X() == dev.idhammai.c.r.q.D.c.NCP;
    }
}

