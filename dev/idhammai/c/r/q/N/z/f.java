/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_1935
 *  net.minecraft.class_2960
 *  net.minecraft.class_332
 *  net.minecraft.class_437
 *  net.minecraft.class_7923
 */
package dev.idhammai.c.r.q.N.z;

import dev.idhammai.Frog;
import dev.idhammai.P.A.L.g;
import dev.idhammai.P.A.S.o;
import dev.idhammai.c.r.O.Y.A;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.T;
import dev.idhammai.c.r.q.N.P;
import dev.idhammai.c.r.q.N.z.H;
import dev.idhammai.c.r.y;
import dev.idhammai.c.y.u.I.t;
import dev.idhammai.p.J.n;
import java.awt.Color;
import java.util.ArrayList;
import java.util.function.IntSupplier;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1935;
import net.minecraft.class_2960;
import net.minecraft.class_332;
import net.minecraft.class_437;
import net.minecraft.class_7923;

public class f
extends T {
    private final class_1799 K;
    private final IntSupplier B;
    private final boolean R;
    private final W a;
    private final l j;
    private final W N;
    public final A b;
    public final W m;
    public final l c;

    public f(String string, String string2, class_1792 class_17922, int n2, int n3) {
        this(string, string2, class_17922, n2, n3, () -> f.lambda$new$0(class_17922));
    }

    public f(String string, String string2, class_1792 class_17922, int n2, int n3, IntSupplier intSupplier) {
        super(string, string2, n2, n3);
        this.K = new class_1799((class_1935)class_17922);
        this.B = intSupplier;
        this.R = false;
        this.a = null;
        this.j = null;
        this.N = null;
        this.b = this.y(new A("Background", new Color(0, 0, 0, 50)).P("\u80cc\u666f\u989c\u8272"));
        this.m = this.S(new W("Blur", false).k("\u80cc\u666f\u6a21\u7cca"));
        this.c = this.p(new l("BlurStrength", 8.0, 1.0, 20.0, 0.5, this.m::f).D("\u6a21\u7cca\u5f3a\u5ea6"));
    }

    public f(String string, String string2, int n2, int n3) {
        super(string, string2, n2, n3);
        this.K = new class_1799((class_1935)class_1802.field_8162);
        this.B = null;
        this.R = true;
        this.a = this.S(new W("Edit", false).k("\u7f16\u8f91\u5217\u8868").M(this::c));
        this.j = this.p(new l("PerRow", 8, 1, 20).D("\u6bcf\u884c\u6570\u91cf"));
        this.N = this.S(new W("ShowZero", true).k("\u663e\u793a\u96f6\u6570\u91cf"));
        this.b = this.y(new A("Background", new Color(0, 0, 0, 50)).P("\u80cc\u666f\u989c\u8272"));
        this.m = this.S(new W("Blur", false).k("\u80cc\u666f\u6a21\u7cca"));
        this.c = this.p(new l("BlurStrength", 8.0, 1.0, 20.0, 0.5, this.m::f).D("\u6a21\u7cca\u5f3a\u5ea6"));
    }

    private void c() {
        this.a.J(false);
        if (!f.M()) {
            Object object = f.W.field_1755;
            if (object instanceof t) {
                t t2 = (t)((Object)object);
                t2.I(Frog.HUD_ITEM);
                return;
            }
            t t3 = dev.idhammai.c.y.u.I.t.a();
            t3.I(Frog.HUD_ITEM);
            object = P.M();
            if (object != null && !((y)object).p()) {
                ((y)object).C();
            } else if (f.W.field_1755 != t3) {
                W.method_1507((class_437)t3);
            }
        }
    }

    private class_1792 u(String string) {
        class_2960 class_29602;
        String string2 = string.replace("block.minecraft.", "").replace("item.minecraft.", "");
        try {
            class_29602 = string2.contains(":") ? class_2960.method_60654((String)string2) : class_2960.method_60655((String)"minecraft", (String)string2);
        }
        catch (Exception exception) {
            return null;
        }
        class_1792 class_17922 = (class_1792)class_7923.field_41178.method_10223(class_29602);
        return class_17922 == class_1802.field_8162 ? null : class_17922;
    }

    @Override
    public void C(class_332 class_3322, float f2) {
        int n2;
        if (!this.R) {
            int n3 = this.B.getAsInt();
            if (n3 <= 0) {
                this.l();
                return;
            }
            this.K.method_7939(n3);
            int n4 = this.B(16);
            int n5 = this.I(16);
            this.w(n4, n5, 16, 16);
            if (this.m.h()) {
                Frog.BLUR.d(this.c.Z(), n4, n5, 16.0f, 16.0f, 4.0f, 4.0f);
            }
            o.j(class_3322.method_51448(), n4, n5, 16.0f, 16.0f, 4.0f, this.b.P());
            class_3322.method_51427(this.K, n4, n5);
            if (H.v()) {
                String string = String.valueOf(n3);
                int n6 = n4 + 16 - (int)Math.ceil(dev.idhammai.p.J.n.w.b(string));
                int n7 = n5 + 16 - (int)Math.ceil(dev.idhammai.p.J.n.w.V());
                class_3322.method_51448().method_22903();
                class_3322.method_51448().method_46416(0.0f, 0.0f, 200.0f);
                dev.idhammai.p.J.n.w.H(class_3322.method_51448(), string, n6 + 1, n7 + 1, -1, H.j());
                class_3322.method_51448().method_22909();
            } else {
                class_3322.method_51431(f.W.field_1772, this.K, n4, n5);
            }
            return;
        }
        ArrayList<class_1799> arrayList = new ArrayList<class_1799>();
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        for (String string : Frog.HUD_ITEM.O()) {
            class_1792 class_17922 = this.u(string);
            if (class_17922 == null || (n2 = g.z(class_17922)) <= 0 && !this.N.h()) continue;
            class_1799 class_17992 = new class_1799((class_1935)class_17922);
            class_17992.method_7939(Math.max(1, n2));
            arrayList.add(class_17992);
            arrayList2.add(n2);
        }
        if (arrayList.isEmpty()) {
            this.l();
            return;
        }
        int n8 = Math.max(1, this.j.V());
        int n9 = (arrayList.size() + n8 - 1) / n8;
        int n10 = Math.min(n8, arrayList.size());
        n2 = n10 * 18;
        int n11 = n9 * 18;
        int n12 = this.B(n2);
        int n13 = this.I(n11);
        this.w(n12, n13, n2, n11);
        if (this.m.h()) {
            Frog.BLUR.d(this.c.Z(), n12, n13, n2, n11, 4.0f, 4.0f);
        }
        o.j(class_3322.method_51448(), n12, n13, n2, n11, 4.0f, this.b.P());
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            int n14 = i2 / n8;
            int n15 = i2 % n8;
            int n16 = n12 + n15 * 18;
            int n17 = n13 + n14 * 18;
            class_1799 class_17993 = (class_1799)arrayList.get(i2);
            int n18 = (Integer)arrayList2.get(i2);
            if (H.v()) {
                class_3322.method_51427(class_17993, n16, n17);
                String string = String.valueOf(n18);
                int n19 = n16 + 16 - (int)Math.ceil(dev.idhammai.p.J.n.w.b(string));
                int n20 = n17 + 16 - (int)Math.ceil(dev.idhammai.p.J.n.w.V());
                class_3322.method_51448().method_22903();
                class_3322.method_51448().method_46416(0.0f, 0.0f, 200.0f);
                dev.idhammai.p.J.n.w.H(class_3322.method_51448(), string, n19 + 1, n20 + 1, -1, H.j());
                class_3322.method_51448().method_22909();
                continue;
            }
            class_3322.method_51431(f.W.field_1772, class_17993, n16, n17);
        }
    }

    private static int lambda$new$0(class_1792 class_17922) {
        return g.z(class_17922);
    }
}

