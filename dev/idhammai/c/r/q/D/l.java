/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1294
 *  net.minecraft.class_1657
 *  net.minecraft.class_2708
 *  net.minecraft.class_3532
 */
package dev.idhammai.c.r.q.D;

import dev.idhammai.Frog;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.A;
import dev.idhammai.P.r.c.F;
import dev.idhammai.P.r.c.Q;
import dev.idhammai.P.r.c.i;
import dev.idhammai.c.r.O.Y.B;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.q.D.Y;
import dev.idhammai.c.r.q.N.x;
import dev.idhammai.c.r.q.i.c;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import net.minecraft.class_1294;
import net.minecraft.class_1657;
import net.minecraft.class_2708;
import net.minecraft.class_3532;

public class l
extends y {
    public static l c;
    public final B<Y> Z = this.S(new B<Y>("Mode", Y.Legit).I("\u6a21\u5f0f").X(Y.PressKey, "\u6309\u952e").X(Y.Legit, "\u5408\u6cd5").X(Y.Rage, "\u72c2\u66b4").X(Y.Rotation, "\u8f6c\u5411"));
    public final W p = this.S(new W("InWaterPause", true).k("\u6c34\u4e2d\u6682\u505c"));
    public final W Q = this.S(new W("InWebPause", true).k("\u8718\u86db\u7f51\u6682\u505c"));
    public final W G = this.S(new W("SneakingPause", false).k("\u6f5c\u884c\u6682\u505c"));
    public final W h = this.S(new W("BlindnessPause", false).k("\u5931\u660e\u6682\u505c"));
    public final W N = this.S(new W("UsingPause", false).k("\u4f7f\u7528\u7269\u54c1\u6682\u505c"));
    public final W H = this.S(new W("LagPause", true).k("\u56de\u62c9\u6682\u505c"));
    boolean K = false;

    public l() {
        super("Sprint", "Permanently keeps player in sprinting mode.", w.Movement);
        this.L("\u5f3a\u5236\u75be\u8dd1");
        c = this;
    }

    public static float U(float f2) {
        if (l.W.field_1690.field_1894.method_1434() && !l.W.field_1690.field_1881.method_1434()) {
            if (l.W.field_1690.field_1913.method_1434() && !l.W.field_1690.field_1849.method_1434()) {
                f2 -= 45.0f;
            } else if (l.W.field_1690.field_1849.method_1434() && !l.W.field_1690.field_1913.method_1434()) {
                f2 += 45.0f;
            }
        } else if (l.W.field_1690.field_1881.method_1434() && !l.W.field_1690.field_1894.method_1434()) {
            f2 += 180.0f;
            if (l.W.field_1690.field_1913.method_1434() && !l.W.field_1690.field_1849.method_1434()) {
                f2 += 45.0f;
            } else if (l.W.field_1690.field_1849.method_1434() && !l.W.field_1690.field_1913.method_1434()) {
                f2 -= 45.0f;
            }
        } else if (l.W.field_1690.field_1913.method_1434() && !l.W.field_1690.field_1849.method_1434()) {
            f2 -= 90.0f;
        } else if (l.W.field_1690.field_1849.method_1434() && !l.W.field_1690.field_1913.method_1434()) {
            f2 += 90.0f;
        }
        return class_3532.method_15393((float)f2);
    }

    @Override
    public String I() {
        return this.Z.X().name();
    }

    @r
    public void O(i i2) {
        if (this.H.h() && i2.L() instanceof class_2708) {
            this.K = true;
        }
    }

    public boolean O() {
        return this.p.h() && l.W.field_1724.method_52535();
    }

    @r
    public void d(Q q2) {
        if (dev.idhammai.P.A.R.F.o()) {
            return;
        }
        if (this.O()) {
            return;
        }
        if (this.Z.X() == Y.PressKey) {
            l.W.field_1690.field_1867.method_23481(true);
        } else {
            l.W.field_1724.method_5728(this.L());
        }
    }

    @r
    public void p(F f2) {
        if (f2.C()) {
            this.K = false;
        }
    }

    @r
    public void v(dev.idhammai.P.r.c.r r2) {
        if (dev.idhammai.P.A.R.F.o() || this.Z.x(Y.PressKey)) {
            return;
        }
        if (this.O()) {
            return;
        }
        r2.L();
        r2.o(this.L());
    }

    private boolean L() {
        if (!(l.W.field_1724.method_7344().method_7586() <= 6 && !l.W.field_1724.method_7337() || !dev.idhammai.P.A.L.l.b() || this.K || l.W.field_1724.method_5715() && this.G.h() || Frog.PLAYER.n((class_1657)l.W.field_1724) && this.Q.h() || l.W.field_1724.method_6115() && this.N.h() || l.W.field_1724.method_3144() || l.W.field_1724.method_6059(class_1294.field_5919) && this.h.h())) {
            switch (this.Z.X().ordinal()) {
                case 1: {
                    if (x.y.y()) {
                        return l.W.field_1724.field_3913.field_3905 > 0.0f;
                    }
                    return dev.idhammai.c.r.q.D.w.H.p() || l.W.field_1690.field_1894.method_1434() && class_3532.method_15356((float)l.W.field_1724.method_36454(), (float)Frog.ROTATION.Q) < 40.0f;
                }
                case 3: {
                    if (x.y.y()) {
                        return l.W.field_1724.field_3913.field_3905 > 0.0f;
                    }
                    return dev.idhammai.c.r.q.D.w.H.p() || class_3532.method_15356((float)l.U(l.W.field_1724.method_36454()), (float)Frog.ROTATION.Q) < 40.0f;
                }
                case 2: {
                    return true;
                }
            }
        }
        return false;
    }

    @r(D=-100)
    public void J(A a2) {
        if (dev.idhammai.P.A.R.F.o()) {
            return;
        }
        if (!((l.W.field_1724.method_7344().method_7586() <= 6 && !l.W.field_1724.method_7337() || !dev.idhammai.P.A.L.l.b() || dev.idhammai.c.r.q.i.c.L.p() || l.W.field_1724.method_6128() || Frog.PLAYER.n((class_1657)l.W.field_1724) && this.Q.h() || l.W.field_1724.method_5715() && this.G.h() || l.W.field_1724.method_3144() || l.W.field_1724.method_6115() && this.N.h() || l.W.field_1724.method_52535() || !dev.idhammai.c.r.q.i.c.L.W() || l.W.field_1724.method_6059(class_1294.field_5919)) && this.h.h() || !this.Z.x(Y.Rotation) || a2.X())) {
            a2.F(l.U(l.W.field_1724.method_36454()));
        }
    }
}

