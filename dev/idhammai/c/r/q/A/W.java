/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_1810
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2374
 */
package dev.idhammai.c.r.q.A;

import dev.idhammai.P.A.Y.N;
import dev.idhammai.P.A.l.M;
import dev.idhammai.P.A.l.k;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.q.A.V;
import dev.idhammai.c.r.q.A.e;
import dev.idhammai.c.r.q.i.a;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1810;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2374;

public class W
extends y {
    public static W Z;
    public final l V = this.p(new l("TargetRange", 6.0, 0.0, 8.0, 0.1).D("\u76ee\u6807\u8303\u56f4").P("m"));
    public final l A = this.p(new l("Range", 6.0, 0.0, 8.0, 0.1).D("\u7834\u574f\u8303\u56f4").P("m"));
    private final dev.idhammai.c.r.O.Y.W m = this.S(new dev.idhammai.c.r.O.Y.W("Burrow", true).k("\u81ea\u57cb\u4f4d"));
    private final dev.idhammai.c.r.O.Y.W j = this.S(new dev.idhammai.c.r.O.Y.W("Head", true).k("\u5934\u9876"));
    private final dev.idhammai.c.r.O.Y.W F = this.S(new dev.idhammai.c.r.O.Y.W("Face", true).k("\u8d34\u8138"));
    private final dev.idhammai.c.r.O.Y.W h = this.S(new dev.idhammai.c.r.O.Y.W("Down", false).k("\u4e0b\u65b9"));
    private final dev.idhammai.c.r.O.Y.W P = this.S(new dev.idhammai.c.r.O.Y.W("Surround", true).k("\u5305\u56f4\u4f4d"));
    private final dev.idhammai.c.r.O.Y.W g = this.S(new dev.idhammai.c.r.O.Y.W("CevPause", true).k("Cev\u6682\u505c"));
    private final dev.idhammai.c.r.O.Y.W s = this.S(new dev.idhammai.c.r.O.Y.W("ForceDouble", false).k("\u5f3a\u5236\u53cc\u6316"));
    public static final List<class_2248> N;

    public W() {
        super("Breaker", w.Combat);
        this.L("\u81ea\u52a8\u6316\u6398");
        Z = this;
    }

    @r
    public void N(QO qO) {
        if (dev.idhammai.c.r.q.A.V.r.p() && this.g.h()) {
            return;
        }
        if (e.u.k) {
            return;
        }
        if (dev.idhammai.c.r.q.Q.W.b.p() && dev.idhammai.c.r.q.Q.W.b.m.h()) {
            return;
        }
        class_1657 class_16572 = dev.idhammai.P.A.Y.N.h(this.V.e());
        if (class_16572 == null) {
            return;
        }
        this.j(class_16572);
    }

    private void j(class_1657 class_16572) {
        class_2338 class_23382 = dev.idhammai.P.A.L.e.d((class_1297)class_16572, true);
        if (a.q() != null && !a.q().equals((Object)a.DA) && a.DA != null && !W.W.field_1687.method_22347(a.DA) && this.s.h()) {
            return;
        }
        double[] dArray = new double[]{-0.8, 0.3, 1.1};
        double[] dArray2 = new double[]{0.3, -0.3};
        for (class_1657 object2 : dev.idhammai.P.A.Y.N.c(this.V.e())) {
            for (double d2 : dArray) {
                for (double d3 : dArray2) {
                    for (double k4 : dArray2) {
                        k k2 = new k(object2.method_23317() + d3, object2.method_23318() + d2, object2.method_23321() + k4);
                        if (!this.c(k2) || !k2.equals(a.q())) continue;
                        return;
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        if (this.h.h()) {
            arrayList.add(Float.valueOf(-0.8f));
        }
        if (this.j.h()) {
            arrayList.add(Float.valueOf(2.3f));
        }
        if (this.m.h()) {
            arrayList.add(Float.valueOf(0.3f));
        }
        if (this.F.h()) {
            arrayList.add(Float.valueOf(1.1f));
        }
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            double iterator2 = ((Float)iterator.next()).floatValue();
            for (double d4 : dArray2) {
                k k3 = new k(class_16572.method_23317() + d4, class_16572.method_23318() + iterator2, class_16572.method_23321() + d4);
                if (!this.c(k3)) continue;
                a.D5.d(k3);
                return;
            }
        }
        Iterator iterator3 = arrayList.iterator();
        while (iterator3.hasNext()) {
            double arrayList2 = ((Float)iterator3.next()).floatValue();
            for (double d5 : dArray2) {
                for (double d6 : dArray2) {
                    k k4 = new k(class_16572.method_23317() + d6, class_16572.method_23318() + arrayList2, class_16572.method_23321() + d5);
                    if (!this.c(k4)) continue;
                    a.D5.d(k4);
                    return;
                }
            }
        }
        if (this.P.h()) {
            for (class_2350 class_23502 : class_2350.values()) {
                if (class_23502 == class_2350.field_11036 || class_23502 == class_2350.field_11033 || Math.sqrt(W.W.field_1724.method_33571().method_1025(class_23382.method_10093(class_23502).method_46558())) > this.A.e() || !W.W.field_1687.method_22347(class_23382.method_10093(class_23502)) && !class_23382.method_10093(class_23502).equals((Object)a.q()) || !this.i(class_23382.method_10093(class_23502), false) || class_23382.method_10093(class_23502).equals((Object)a.DA)) continue;
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            for (class_2350 class_23504 : class_2350.values()) {
                if (class_23504 == class_2350.field_11036 || class_23504 == class_2350.field_11033 || Math.sqrt(W.W.field_1724.method_33571().method_1025(class_23382.method_10093(class_23504).method_46558())) > this.A.e() || !this.c(class_23382.method_10093(class_23504)) || !this.i(class_23382.method_10093(class_23504), true) || this.S(class_23382.method_10093(class_23504))) continue;
                arrayList2.add(class_23382.method_10093(class_23504));
            }
            if (!arrayList2.isEmpty()) {
                a.D5.d(arrayList2.stream().min(Comparator.comparingDouble(W::lambda$doBreak$0)).get());
            } else {
                for (class_2350 class_23503 : class_2350.values()) {
                    if (class_23503 == class_2350.field_11036 || class_23503 == class_2350.field_11033 || Math.sqrt(W.W.field_1724.method_33571().method_1025(class_23382.method_10093(class_23503).method_46558())) > this.A.e() || !this.c(class_23382.method_10093(class_23503)) || !this.i(class_23382.method_10093(class_23503), false)) continue;
                    arrayList2.add(class_23382.method_10093(class_23503));
                }
                if (!arrayList2.isEmpty()) {
                    a.D5.d(arrayList2.stream().min(Comparator.comparingDouble(W::lambda$doBreak$1)).get());
                }
            }
        }
    }

    private boolean S(class_2338 class_23382) {
        for (class_2350 class_23502 : class_2350.values()) {
            class_2338 class_23383;
            if (class_23502 == class_2350.field_11036 || class_23502 == class_2350.field_11033 || !(class_23383 = dev.idhammai.P.A.L.e.H(true)).method_10093(class_23502).equals((Object)class_23382)) continue;
            return true;
        }
        return false;
    }

    public boolean i(class_2338 class_23382, boolean bl) {
        class_2338 class_23383 = class_23382.method_10074();
        class_2338 class_23384 = class_23383.method_10084();
        return (M.x(class_23383) == class_2246.field_9987 || M.x(class_23383) == class_2246.field_10540 || !bl) && M.k(class_23384, true, true) && M.k(class_23384.method_10084(), true, true);
    }

    private boolean a(class_2338 class_23382) {
        return W.W.field_1724.method_33571().method_1022(class_23382.method_46558()) <= a.D5.D1.e() && N.contains(M.x(class_23382)) && M.S(class_23382) != null;
    }

    private boolean c(class_2338 class_23382) {
        return this.a(class_23382) && (M.S(class_23382) != null || class_23382.equals((Object)a.q())) && (!class_23382.equals((Object)a.DA) || !(W.W.field_1724.method_6047().method_7909() instanceof class_1810) && !a.D5.L.h() && !a.D5.DP.h());
    }

    private static double lambda$doBreak$1(class_2338 class_23382) {
        return class_23382.method_19770((class_2374)W.W.field_1724.method_33571());
    }

    private static double lambda$doBreak$0(class_2338 class_23382) {
        return class_23382.method_19770((class_2374)W.W.field_1724.method_33571());
    }

    static {
        N = Arrays.asList(class_2246.field_10540, class_2246.field_10443, class_2246.field_22108, class_2246.field_22423, class_2246.field_23152, class_2246.field_22109, class_2246.field_10535);
    }
}

