/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_332
 *  net.minecraft.class_3675
 */
package dev.idhammai.c.y.u.K;

import dev.idhammai.P.A.J;
import dev.idhammai.c.Q;
import dev.idhammai.c.r.T;
import dev.idhammai.c.r.q.N.P;
import dev.idhammai.c.r.q.N.z.H;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import dev.idhammai.c.y.u.C.K;
import dev.idhammai.c.y.u.K.U;
import java.util.ArrayList;
import java.util.Comparator;
import net.minecraft.class_332;
import net.minecraft.class_3675;

public final class t {
    private final dev.idhammai.c.y.u.I.t A;

    public t(dev.idhammai.c.y.u.I.t t2) {
        this.A = t2;
    }

    public void C() {
        int n2;
        int n3;
        int n4;
        ArrayList<K> arrayList = this.A.n();
        arrayList.clear();
        this.A.Z();
        int n5 = P.M() != null ? P.M().pI.V() : 101;
        int n6 = P.M() != null ? P.M().a.V() : 93;
        int n7 = Math.max(n5, n6);
        int n8 = n7 + 1;
        int n9 = w.values().length;
        int n10 = 10;
        int n11 = 4;
        if (J.W != null && J.W.method_22683() != null) {
            n4 = J.W.method_22683().method_4486();
            n3 = J.W.method_22683().method_4502();
            n2 = n9 + 1;
            int n12 = n2 * n7 + (n2 - 1);
            n10 = Math.round(((float)n4 - (float)n12) / 2.0f);
            n11 = Math.round((float)n3 / 6.0f);
        }
        n4 = Math.round(((float)n7 - (float)n6) / 2.0f);
        n3 = Math.max(0, Math.min(n9, w.Client.ordinal() + 1));
        n2 = n10 + n4;
        w[] wArray = w.values();
        for (int i2 = 0; i2 < wArray.length; ++i2) {
            w w2 = wArray[i2];
            int n13 = i2 >= n3 ? i2 + 1 : i2;
            int n14 = n2 + n13 * n8;
            arrayList.add(new U(this, w2.D(), w2, n14, n11, true, w2));
        }
        this.A.j().h(n2 + n3 * n8, n11);
        arrayList.forEach(t::lambda$load$0);
    }

    public void y(class_332 class_3322, int n2, int n3, float f2) {
        this.A.n().forEach(arg_0 -> t.lambda$render$1(class_3322, n2, n3, f2, arg_0));
    }

    public void z(int n2, int n3, int n4) {
        this.A.n().forEach(arg_0 -> t.lambda$mouseClicked$2(n2, n3, n4, arg_0));
    }

    public void N(int n2, int n3, int n4) {
        this.A.n().forEach(arg_0 -> t.lambda$mouseReleased$3(n2, n3, n4, arg_0));
    }

    public void I(int n2) {
        this.A.n().forEach(arg_0 -> t.lambda$keyPressed$4(n2, arg_0));
    }

    public void W(char c2, int n2) {
        this.A.n().forEach(arg_0 -> t.lambda$charTyped$5(c2, n2, arg_0));
    }

    public void L(double d2) {
        if (J.W == null || J.W.method_22683() == null) {
            return;
        }
        if (class_3675.method_15987((long)J.W.method_22683().method_4490(), (int)340)) {
            if (d2 < 0.0) {
                this.A.n().forEach(t::lambda$mouseScrolled$6);
            } else if (d2 > 0.0) {
                this.A.n().forEach(t::lambda$mouseScrolled$7);
            }
            if (d2 != 0.0) {
                float f2 = d2 < 0.0 ? -15.0f : 15.0f;
                this.A.I(f2, 0.0f);
                if (this.A.j().M()) {
                    this.A.j().h(this.A.j().j() + f2, this.A.j().d());
                }
            }
            return;
        }
        if (d2 < 0.0) {
            this.A.n().forEach(t::lambda$mouseScrolled$8);
            this.A.I(0.0f, -15.0f);
            if (this.A.j().M()) {
                this.A.j().h(this.A.j().j(), this.A.j().d() - 15.0f);
            }
        } else if (d2 > 0.0) {
            this.A.n().forEach(t::lambda$mouseScrolled$9);
            this.A.I(0.0f, 15.0f);
            if (this.A.j().M()) {
                this.A.j().h(this.A.j().j(), this.A.j().d() + 15.0f);
            }
        }
    }

    private boolean z(y y2) {
        return y2 instanceof T || y2 instanceof H;
    }

    private static void lambda$mouseScrolled$9(K k2) {
        k2.r(k2.a() + 15);
    }

    private static void lambda$mouseScrolled$8(K k2) {
        k2.r(k2.a() - 15);
    }

    private static void lambda$mouseScrolled$7(K k2) {
        k2.p(k2.Q() + 15);
    }

    private static void lambda$mouseScrolled$6(K k2) {
        k2.p(k2.Q() - 15);
    }

    private static void lambda$charTyped$5(char c2, int n2, K k2) {
        k2.K(c2, n2);
    }

    private static void lambda$keyPressed$4(int n2, K k2) {
        k2.Y(n2);
    }

    private static void lambda$mouseReleased$3(int n2, int n3, int n4, K k2) {
        k2.T(n2, n3, n4);
    }

    private static void lambda$mouseClicked$2(int n2, int n3, int n4, K k2) {
        k2.U(n2, n3, n4);
    }

    private static void lambda$render$1(class_332 class_3322, int n2, int n3, float f2, K k2) {
        k2.K(class_3322, n2, n3, f2);
    }

    private static void lambda$load$0(K k2) {
        k2.n().sort(Comparator.comparing(Q::o));
    }
}

