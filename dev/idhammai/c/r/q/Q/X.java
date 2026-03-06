/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_1802
 *  net.minecraft.class_243
 *  net.minecraft.class_2596
 *  net.minecraft.class_2828$class_2829
 *  net.minecraft.class_2828$class_2830
 *  net.minecraft.class_2846
 *  net.minecraft.class_2846$class_2847
 *  net.minecraft.class_2848
 *  net.minecraft.class_2848$class_2849
 *  net.minecraft.class_742
 */
package dev.idhammai.c.r.q.Q;

import dev.idhammai.Frog;
import dev.idhammai.P.A.A.h;
import dev.idhammai.P.A.A.p;
import dev.idhammai.P.A.Y.N;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.A;
import dev.idhammai.P.r.c.J;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.c.r.O.Y.B;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.q.Q.b;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import dev.idhammai.p.J.G;
import java.util.Random;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1802;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2828;
import net.minecraft.class_2846;
import net.minecraft.class_2848;
import net.minecraft.class_742;

public class X
extends y {
    public static boolean j = false;
    private final B<b> T = this.S(new B<b>("Exploit", b.Strong).I("\u6f0f\u6d1e\u6a21\u5f0f").X(b.Strong, "\u5f3a\u529b").X(b.Fast, "\u5feb\u901f").X(b.Strict, "\u4e25\u683c").X(b.Phobos, "Phobos"));
    private final Random c = new Random();
    private final h t = new h();
    private final W N = this.S(new W("Aimbot", true).k("\u81ea\u52a8\u7784\u51c6"));
    private final l a = this.p(new l("PredictTicks", 3.0, 0.0, 10.0, 0.1).D("\u9884\u6d4btick"));
    private final W U = this.S(new W("Rotation", false).k("\u65cb\u8f6c\u53d1\u5305"));
    private final l J = this.p(new l("Spoofs", 50.0, 0.0, 200.0, 1.0).D("\u53d1\u5305\u6b21\u6570"));
    private final W H = this.S(new W("Minimize", false).k("\u6700\u5c0f\u4f4d\u79fb"));
    private final l w = this.p(new l("Delay", 5.0, 0.0, 10.0).D("\u89e6\u53d1\u95f4\u9694").P("s"));
    private final l R = this.p(new l("ActiveTime", (double)0.4f, 0.0, 3.0, 0.01).D("\u62c9\u5f13\u65f6\u957f").P("s"));
    private final W r = this.S(new W("Message", true).k("\u63d0\u793a\u6d88\u606f"));
    private final h Y = new h();
    boolean y = false;

    public X() {
        super("BowBomb", "exploit", dev.idhammai.c.r.w.Exploit);
        this.L("\u5f13\u6f0f\u6d1e");
    }

    @r
    public void i(A a2) {
        if (!X.W.field_1724.method_6115() || X.W.field_1724.method_6030().method_7909() != class_1802.field_8102 || !this.N.h()) {
            return;
        }
        class_1657 class_16572 = this.r();
        if (class_16572 == null) {
            return;
        }
        class_243 class_2432 = p.g(class_16572, this.a.V()).method_1031(0.0, (double)class_16572.method_18381(class_16572.method_18376()), 0.0);
        float[] fArray = G.X(class_2432);
        a2.g(fArray[0], fArray[1]);
    }

    private class_1657 r() {
        class_742 class_7422 = null;
        double d2 = 100000.0;
        for (class_742 class_7423 : Frog.THREAD.v()) {
            if (Math.abs(class_7423.method_23318() - X.W.field_1724.method_23318()) > 4.0 || !dev.idhammai.P.A.Y.N.y((class_1297)class_7423, d2)) continue;
            class_7422 = class_7423;
            d2 = X.W.field_1724.method_5739((class_1297)class_7423);
        }
        return class_7422;
    }

    @r
    public void B(QO qO) {
        if (!X.W.field_1724.method_6115() || X.W.field_1724.method_6030().method_7909() != class_1802.field_8102) {
            this.Y.H();
            this.y = false;
        } else {
            this.y = true;
        }
    }

    @Override
    public void L() {
        j = false;
    }

    @r
    protected void h(J j2) {
        class_2846 class_28462;
        if (X.M() || !this.t.m((long)(this.w.e() * 1000.0)) || !this.Y.m((long)(this.R.e() * 1000.0)) || !this.y) {
            return;
        }
        class_2596<?> class_25962 = j2.L();
        if (class_25962 instanceof class_2846 && (class_28462 = (class_2846)class_25962).method_12363() == class_2846.class_2847.field_12974) {
            int n2;
            j = true;
            if (this.r.h()) {
                this.y("\u00a7eBowBomb trigger.");
            }
            W.method_1562().method_52787((class_2596)new class_2848((class_1297)X.W.field_1724, class_2848.class_2849.field_12981));
            if (this.T.X() == b.Fast) {
                for (n2 = 0; n2 < this.E(); ++n2) {
                    this.L(X.W.field_1724.method_23317(), this.H.h() ? X.W.field_1724.method_23318() : X.W.field_1724.method_23318() - 1.0E-10, X.W.field_1724.method_23321(), true);
                    this.L(X.W.field_1724.method_23317(), X.W.field_1724.method_23318() + 1.0E-10, X.W.field_1724.method_23321(), false);
                }
            }
            if (this.T.X() == b.Strong) {
                for (n2 = 0; n2 < this.E(); ++n2) {
                    this.L(X.W.field_1724.method_23317(), X.W.field_1724.method_23318() + 1.0E-10, X.W.field_1724.method_23321(), false);
                    this.L(X.W.field_1724.method_23317(), this.H.h() ? X.W.field_1724.method_23318() : X.W.field_1724.method_23318() - 1.0E-10, X.W.field_1724.method_23321(), true);
                }
            }
            if (this.T.X() == b.Phobos) {
                for (n2 = 0; n2 < this.E(); ++n2) {
                    this.L(X.W.field_1724.method_23317(), X.W.field_1724.method_23318() + 1.3E-13, X.W.field_1724.method_23321(), true);
                    this.L(X.W.field_1724.method_23317(), X.W.field_1724.method_23318() + 2.7E-13, X.W.field_1724.method_23321(), false);
                }
            }
            if (this.T.X() == b.Strict) {
                double[] dArray = new double[]{100.0 * -Math.sin(Math.toRadians(X.W.field_1724.method_36454())), 100.0 * Math.cos(Math.toRadians(X.W.field_1724.method_36454()))};
                for (int i2 = 0; i2 < this.E(); ++i2) {
                    if (this.c.nextBoolean()) {
                        this.L(X.W.field_1724.method_23317() - dArray[0], X.W.field_1724.method_23318(), X.W.field_1724.method_23321() - dArray[1], false);
                        continue;
                    }
                    this.L(X.W.field_1724.method_23317() + dArray[0], X.W.field_1724.method_23318(), X.W.field_1724.method_23321() + dArray[1], true);
                }
            }
            j = false;
            this.t.H();
        }
    }

    private void L(double d2, double d3, double d4, boolean bl) {
        if (this.U.h()) {
            W.method_1562().method_52787((class_2596)new class_2828.class_2830(d2, d3, d4, X.W.field_1724.method_36454(), X.W.field_1724.method_36455(), bl));
        } else {
            W.method_1562().method_52787((class_2596)new class_2828.class_2829(d2, d3, d4, bl));
        }
    }

    private int E() {
        return this.J.V();
    }
}

