/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1922
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_238
 *  net.minecraft.class_2680
 *  net.minecraft.class_4587
 */
package dev.idhammai.c.r.q.n;

import dev.idhammai.P.A.S.K;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.c.r.O.Y.A;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_1922;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_2680;
import net.minecraft.class_4587;

public class Y
extends y {
    public static Y r;
    private final l A = this.p(new l("Distance", 0.1, 0.0, 1.0, 0.1).D("\u76f4\u5411\u8ddd\u79bb"));
    private final l F = this.p(new l("BevelDistance", 0.2, 0.0, 1.0, 0.1).D("\u659c\u5411\u8ddd\u79bb"));
    private final A m = this.y(new A("SafeFill", new Color(0, 255, 0, 50)).P("\u5b89\u5168\u586b\u5145").t(true));
    private final A E = this.y(new A("SafeBox", new Color(0, 255, 0, 100)).P("\u5b89\u5168\u65b9\u6846").t(true));
    private final A J = this.y(new A("SemiSafeFill", new Color(244, 255, 0, 50)).P("\u534a\u5b89\u5168\u586b\u5145").t(true));
    private final A y = this.y(new A("SemiSafeBox", new Color(244, 255, 0, 100)).P("\u534a\u5b89\u5168\u65b9\u6846").t(true));
    private final A t = this.y(new A("UnsafeFill", new Color(148, 0, 0, 50)).P("\u4e0d\u5b89\u5168\u586b\u5145").t(true));
    private final A a = this.y(new A("UnsafeBox", new Color(148, 0, 0, 100)).P("\u4e0d\u5b89\u5168\u65b9\u6846").t(true));
    List<class_2338> w = new ArrayList<class_2338>();
    List<class_2338> p = new ArrayList<class_2338>();
    List<class_2338> V = new ArrayList<class_2338>();
    int[] M = new int[]{1, 0, -1};

    public Y() {
        super("PhaseESP", dev.idhammai.c.r.w.Render);
        this.L("\u7a7f\u5899\u663e\u793a");
        r = this;
    }

    @r
    public void k(QO qO) {
        this.w.clear();
        this.p.clear();
        this.V.clear();
        for (int n2 : this.M) {
            for (int n3 : this.M) {
                class_2248 class_22482;
                double d2;
                class_2338 class_23382 = Y.W.field_1724.method_24515().method_10069(n2, 0, n3);
                double d3 = Y.W.field_1724.method_19538().method_1022(class_23382.method_61082());
                double d4 = d2 = n2 != 0 && n3 != 0 ? this.F.e() + 1.0 : this.A.e() + 0.8;
                if (!(d3 <= d2)) continue;
                class_2680 class_26802 = Y.W.field_1687.method_8320(class_23382);
                class_2338 class_23383 = class_23382.method_10074();
                if (class_26802.method_26204() == class_2246.field_9987) {
                    class_22482 = Y.W.field_1687.method_8320(class_23383).method_26204();
                    if (class_22482 == class_2246.field_9987) {
                        this.w.add(class_23382);
                        continue;
                    }
                    this.V.add(class_23382);
                    continue;
                }
                if (!class_26802.method_26234((class_1922)Y.W.field_1687, class_23382)) continue;
                class_22482 = Y.W.field_1687.method_8320(class_23383).method_26204();
                if (class_22482 == class_2246.field_9987) {
                    this.p.add(class_23382);
                    continue;
                }
                this.V.add(class_23382);
            }
        }
    }

    @Override
    public void h(class_4587 class_45872) {
        this.O(class_45872, this.w, this.m, this.E);
        this.O(class_45872, this.V, this.t, this.a);
        this.O(class_45872, this.p, this.J, this.y);
    }

    private void O(class_4587 class_45872, List<class_2338> list, A a2, A a3) {
        for (class_2338 class_23382 : list) {
            class_238 class_2383 = new class_238((double)class_23382.method_10263(), (double)class_23382.method_10264(), (double)class_23382.method_10260(), (double)(class_23382.method_10263() + 1), (double)class_23382.method_10264(), (double)(class_23382.method_10260() + 1));
            if (a2.i) {
                K.F(class_45872, class_2383, a2.P());
            }
            if (!a3.i) continue;
            K.N(class_45872, class_2383, a3.P());
        }
    }
}

