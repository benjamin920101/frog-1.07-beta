/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1304
 *  net.minecraft.class_1657
 *  net.minecraft.class_1713
 *  net.minecraft.class_1738
 *  net.minecraft.class_1770
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_1890
 *  net.minecraft.class_1893
 *  net.minecraft.class_2596
 *  net.minecraft.class_2838
 *  net.minecraft.class_2886
 *  net.minecraft.class_6880
 *  net.minecraft.class_9304
 */
package dev.idhammai.c.r.q.i;

import dev.idhammai.Frog;
import dev.idhammai.P.A.L.e;
import dev.idhammai.P.A.L.g;
import dev.idhammai.P.A.L.l;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.q.D.Q;
import dev.idhammai.c.r.q.i.B;
import dev.idhammai.c.r.q.i.n;
import dev.idhammai.c.r.q.i.p;
import dev.idhammai.c.r.q.i.t;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.class_1268;
import net.minecraft.class_1304;
import net.minecraft.class_1657;
import net.minecraft.class_1713;
import net.minecraft.class_1738;
import net.minecraft.class_1770;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1890;
import net.minecraft.class_1893;
import net.minecraft.class_2596;
import net.minecraft.class_2838;
import net.minecraft.class_2886;
import net.minecraft.class_6880;
import net.minecraft.class_9304;

public class E
extends y {
    public static E c;
    private final dev.idhammai.c.r.O.Y.B<t> D = this.S(new dev.idhammai.c.r.O.Y.B<t>("Head", t.Protection).I("\u5934\u76d4\u4f18\u5148").X(t.Blast, "\u7206\u70b8\u4fdd\u62a4").X(t.Protection, "\u4fdd\u62a4"));
    private final dev.idhammai.c.r.O.Y.B<t> e = this.S(new dev.idhammai.c.r.O.Y.B<t>("Body", t.Protection).I("\u80f8\u7532\u4f18\u5148").X(t.Blast, "\u7206\u70b8\u4fdd\u62a4").X(t.Protection, "\u4fdd\u62a4"));
    private final dev.idhammai.c.r.O.Y.B<t> I = this.S(new dev.idhammai.c.r.O.Y.B<t>("Tights", t.Protection).I("\u62a4\u817f\u4f18\u5148").X(t.Blast, "\u7206\u70b8\u4fdd\u62a4").X(t.Protection, "\u4fdd\u62a4"));
    private final dev.idhammai.c.r.O.Y.B<t> Y = this.S(new dev.idhammai.c.r.O.Y.B<t>("Feet", t.Protection).I("\u9774\u5b50\u4f18\u5148").X(t.Blast, "\u7206\u70b8\u4fdd\u62a4").X(t.Protection, "\u4fdd\u62a4"));
    private final W K = this.S(new W("IgnoreCurse", true).k("\u5ffd\u7565\u7ed1\u5b9a\u8bc5\u5492"));
    private final W A = this.S(new W("NoMove", false).k("\u79fb\u52a8\u65f6\u6682\u505c"));
    private final dev.idhammai.c.r.O.Y.l Z = this.p(new dev.idhammai.c.r.O.Y.l("Delay", 3.0, 0.0, 10.0, 1.0).D("\u5ef6\u8fdf"));
    private final W f = this.S(new W("AutoElytra", true).k("\u81ea\u52a8\u9798\u7fc5"));
    private final dev.idhammai.c.r.O.Y.B<p> T = this.S(new dev.idhammai.c.r.O.Y.B<p>("HotbarSwap", p.Swap).I("\u5feb\u6377\u680f\u66ff\u6362").X(p.Swap, "\u4ea4\u6362").X(p.Switch, "\u5207\u6362"));
    private final dev.idhammai.c.r.O.Y.B<n> V = this.S(new dev.idhammai.c.r.O.Y.B<n>("InventorySwap", n.ClickSlot).I("\u80cc\u5305\u66ff\u6362").X(n.ClickSlot, "\u70b9\u51fb\u69fd\u4f4d").X(n.Pick, "\u5feb\u6377\u62ff\u53d6"));
    private int l = 0;

    public E() {
        super("AutoArmor", w.Player);
        this.L("\u81ea\u52a8\u7a7f\u7532");
        c = this;
    }

    @r
    public void p(QO qO) {
        if (!dev.idhammai.P.A.L.e.n()) {
            return;
        }
        if (E.W.field_1724.field_7498 != E.W.field_1724.field_7512) {
            return;
        }
        if (dev.idhammai.P.A.L.l.b() && this.A.h()) {
            return;
        }
        if (this.l > 0) {
            --this.l;
            return;
        }
        this.l = this.Z.V();
        HashMap<class_1304, int[]> hashMap = new HashMap<class_1304, int[]>(4);
        hashMap.put(class_1304.field_6166, new int[]{36, this.t(E.W.field_1724.method_31548().method_5438(36)), -1, -1});
        hashMap.put(class_1304.field_6172, new int[]{37, this.t(E.W.field_1724.method_31548().method_5438(37)), -1, -1});
        hashMap.put(class_1304.field_6174, new int[]{38, this.t(E.W.field_1724.method_31548().method_5438(38)), -1, -1});
        hashMap.put(class_1304.field_6169, new int[]{39, this.t(E.W.field_1724.method_31548().method_5438(39)), -1, -1});
        for (int i2 = 0; i2 < 36; ++i2) {
            if (!(E.W.field_1724.method_31548().method_5438(i2).method_7909() instanceof class_1738) && E.W.field_1724.method_31548().method_5438(i2).method_7909() != class_1802.field_8833 || E.W.field_1724.method_31548().method_5438(i2).method_7909() == class_1802.field_8833 && (Q.F.W() && this.f.h() || Q.F.p() && Q.F.H.h())) continue;
            int n2 = this.t(E.W.field_1724.method_31548().method_5438(i2));
            class_1304 class_13042 = E.W.field_1724.method_31548().method_5438(i2).method_7909() instanceof class_1770 ? class_1304.field_6174 : ((class_1738)E.W.field_1724.method_31548().method_5438(i2).method_7909()).method_7685();
            for (Map.Entry entry : hashMap.entrySet()) {
                if (this.f.h() && Q.F.p() && entry.getKey() == class_1304.field_6174) {
                    if (!E.W.field_1724.method_31548().method_5438(38).method_7960() && E.W.field_1724.method_31548().method_5438(38).method_7909() instanceof class_1770 && class_1770.method_7804((class_1799)E.W.field_1724.method_31548().method_5438(38)) || ((int[])entry.getValue())[2] != -1 && !E.W.field_1724.method_31548().method_5438(((int[])entry.getValue())[2]).method_7960() && E.W.field_1724.method_31548().method_5438(((int[])entry.getValue())[2]).method_7909() instanceof class_1770 && class_1770.method_7804((class_1799)E.W.field_1724.method_31548().method_5438(((int[])entry.getValue())[2])) || E.W.field_1724.method_31548().method_5438(i2).method_7960() || !(E.W.field_1724.method_31548().method_5438(i2).method_7909() instanceof class_1770) || !class_1770.method_7804((class_1799)E.W.field_1724.method_31548().method_5438(i2))) continue;
                    ((int[])entry.getValue())[2] = i2;
                    continue;
                }
                if (n2 <= 0 || entry.getKey() != class_13042 || n2 <= ((int[])entry.getValue())[1] || n2 <= ((int[])entry.getValue())[3]) continue;
                ((int[])entry.getValue())[2] = i2;
                ((int[])entry.getValue())[3] = n2;
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (((int[])entry.getValue())[2] == -1) continue;
            if (((int[])entry.getValue())[2] < 9) {
                switch (this.T.X().ordinal()) {
                    case 0: {
                        int n3 = 44 - ((int[])entry.getValue())[0];
                        E.W.field_1761.method_2906(E.W.field_1724.field_7512.field_7763, n3, ((int[])entry.getValue())[2], class_1713.field_7791, (class_1657)E.W.field_1724);
                        dev.idhammai.P.A.L.e.t();
                        break;
                    }
                    case 1: {
                        int n4 = E.W.field_1724.method_31548().field_7545;
                        g.j(((int[])entry.getValue())[2]);
                        E.n(E::lambda$onUpdate$0);
                        g.j(n4);
                    }
                }
            } else if (E.W.field_1724.field_7498 == E.W.field_1724.field_7512) {
                int n5 = 44 - ((int[])entry.getValue())[0];
                int n6 = ((int[])entry.getValue())[2];
                switch (this.V.X().ordinal()) {
                    case 1: {
                        W.method_1562().method_52787((class_2596)new class_2838(n6));
                        E.n(E::lambda$onUpdate$1);
                        W.method_1562().method_52787((class_2596)new class_2838(n6));
                        break;
                    }
                    case 0: {
                        E.W.field_1761.method_2906(E.W.field_1724.field_7512.field_7763, n6, 0, class_1713.field_7790, (class_1657)E.W.field_1724);
                        E.W.field_1761.method_2906(E.W.field_1724.field_7512.field_7763, n5, 0, class_1713.field_7790, (class_1657)E.W.field_1724);
                        if (((int[])entry.getValue())[1] == -1) break;
                        E.W.field_1761.method_2906(E.W.field_1724.field_7512.field_7763, n6, 0, class_1713.field_7790, (class_1657)E.W.field_1724);
                    }
                }
                dev.idhammai.P.A.L.e.t();
            }
            return;
        }
    }

    private int t(class_1799 class_17992) {
        if (class_17992.method_7909() instanceof class_1738 || class_17992.method_7909() == class_1802.field_8833) {
            class_1304 class_13042;
            int n2 = 0;
            class_1792 class_17922 = class_17992.method_7909();
            if (class_17922 instanceof class_1738) {
                class_1738 class_17382 = (class_1738)class_17922;
                class_13042 = class_17382.method_7685();
            } else {
                class_13042 = class_1304.field_48824;
            }
            if (class_17992.method_7909() instanceof class_1770) {
                if (!class_1770.method_7804((class_1799)class_17992)) {
                    return 0;
                }
                n2 = 1;
            }
            int n3 = 1;
            int n4 = 1;
            switch (B.j[class_13042.ordinal()]) {
                case 1: {
                    if (this.D.x(t.Protection)) {
                        n4 *= 2;
                        break;
                    }
                    n3 *= 2;
                    break;
                }
                case 2: {
                    if (this.e.x(t.Protection)) {
                        n4 *= 2;
                        break;
                    }
                    n3 *= 2;
                    break;
                }
                case 3: {
                    if (this.I.x(t.Protection)) {
                        n4 *= 2;
                        break;
                    }
                    n3 *= 2;
                    break;
                }
                case 4: {
                    if (this.Y.x(t.Protection)) {
                        n4 *= 2;
                        break;
                    }
                    n3 *= 2;
                }
            }
            if (class_17992.method_7942()) {
                class_9304 class_93042 = class_1890.method_57532((class_1799)class_17992);
                if (class_93042.method_57534().contains(E.W.field_1687.method_30349().method_30530(class_1893.field_9111.method_58273()).method_40264(class_1893.field_9111).get())) {
                    n2 += class_93042.method_57536((class_6880)E.W.field_1687.method_30349().method_30530(class_1893.field_9111.method_58273()).method_40264(class_1893.field_9111).get()) * n4;
                }
                if (class_93042.method_57534().contains(E.W.field_1687.method_30349().method_30530(class_1893.field_9107.method_58273()).method_40264(class_1893.field_9107).get())) {
                    n2 += class_93042.method_57536((class_6880)E.W.field_1687.method_30349().method_30530(class_1893.field_9107.method_58273()).method_40264(class_1893.field_9107).get()) * n3;
                }
                if (class_93042.method_57534().contains(E.W.field_1687.method_30349().method_30530(class_1893.field_9107.method_58273()).method_40264(class_1893.field_9113).get()) && this.K.h()) {
                    n2 = -999;
                }
            }
            return (class_17992.method_7909() instanceof class_1738 ? ((class_1738)class_17992.method_7909()).method_7687() : 0) + n2;
        }
        if (!class_17992.method_7960()) {
            return 0;
        }
        return -1;
    }

    private static class_2596 lambda$onUpdate$1(int n2) {
        return new class_2886(class_1268.field_5808, n2, Frog.ROTATION.X(), Frog.ROTATION.F());
    }

    private static class_2596 lambda$onUpdate$0(int n2) {
        return new class_2886(class_1268.field_5808, n2, Frog.ROTATION.X(), Frog.ROTATION.F());
    }
}

