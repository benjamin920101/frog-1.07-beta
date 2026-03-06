/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1291
 *  net.minecraft.class_1293
 *  net.minecraft.class_1294
 *  net.minecraft.class_1657
 *  net.minecraft.class_1713
 *  net.minecraft.class_1738
 *  net.minecraft.class_1747
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_1844
 *  net.minecraft.class_2244
 *  net.minecraft.class_2246
 *  net.minecraft.class_2399
 *  net.minecraft.class_2480
 *  net.minecraft.class_2665
 *  net.minecraft.class_437
 *  net.minecraft.class_9334
 *  org.apache.commons.io.IOUtils
 */
package dev.idhammai.c.r.q.i;

import dev.idhammai.Frog;
import dev.idhammai.P.A.A.h;
import dev.idhammai.P.A.L.e;
import dev.idhammai.P.A.L.g;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.c.r.O.Y.B;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.O.Y.v;
import dev.idhammai.c.r.q.N.P;
import dev.idhammai.c.r.q.i.F;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import dev.idhammai.c.y.u.I.t;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.class_1291;
import net.minecraft.class_1293;
import net.minecraft.class_1294;
import net.minecraft.class_1657;
import net.minecraft.class_1713;
import net.minecraft.class_1738;
import net.minecraft.class_1747;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1844;
import net.minecraft.class_2244;
import net.minecraft.class_2246;
import net.minecraft.class_2399;
import net.minecraft.class_2480;
import net.minecraft.class_2665;
import net.minecraft.class_437;
import net.minecraft.class_9334;
import org.apache.commons.io.IOUtils;

public class R
extends y {
    public static R u;
    final int[] g = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private final l c = this.p(new l("TasksPerTick", 2, 1, 20).D("\u6bcfTick\u4efb\u52a1\u6570"));
    private final l M = this.p(new l("Delay", 0.1, 0.0, 5.0, 0.01).D("\u5ef6\u8fdf").P("s"));
    private final W Q = this.S(new W("Stack", true).k("\u81ea\u52a8\u5806\u53e0"));
    private final B<F> a = this.S(new B<F>("TrashMode", F.Whitelist).I("\u5783\u573e\u6a21\u5f0f").X(F.Whitelist, "\u767d\u540d\u5355").X(F.Blacklist, "\u9ed1\u540d\u5355"));
    private final W L = this.S(new W("EditTrash", false).k("\u7f16\u8f91\u5783\u573e\u5217\u8868").M(this::Q));
    private final W X = this.S(new W("Sort", true).k("\u81ea\u52a8\u6574\u7406"));
    private final W K = this.S(new W("Kit", false).k("\u6309Kit\u6574\u7406").M(this::H));
    private final v y = this.E(new v("KitName", "kit1").c("Kit\u540d\u79f0"));
    private final W b = this.S(new W("Drop", true).k("\u81ea\u52a8\u4e22\u5f03").D());
    private final W e = this.S(new W("Trash", true, this.b::f).k("\u4e22\u5f03\u5783\u573e"));
    private final W j = this.S(new W("Rename", true, this.b::f).k("\u4e22\u5f03\u6539\u540d\u7269\u54c1"));
    private final W f = this.S(new W("KitExceed", true, this.b::f).k("\u4e22\u5f03\u8d85\u51faKit"));
    private final W d = this.S(new W("Exceed", true, this.b::f).k("\u4e22\u5f03\u8d85\u989d\u7269\u54c1"));
    private final l Z = this.p(new l("Crystal", 4, 0, 12, this::lambda$new$0).D("\u6c34\u6676\u4fdd\u7559"));
    private final l r = this.p(new l("Exp", 4, 0, 12, this::lambda$new$1).D("\u7ecf\u9a8c\u74f6\u4fdd\u7559"));
    private final l p = this.p(new l("Totem", 6, 0, 36, this::lambda$new$2).D("\u56fe\u817e\u4fdd\u7559"));
    private final l T = this.p(new l("EGapple", 2, 0, 12, this::lambda$new$3).D("\u9644\u9b54\u91d1\u82f9\u679c\u4fdd\u7559"));
    private final l N = this.p(new l("Gapple", 2, 0, 12, this::lambda$new$4).D("\u91d1\u82f9\u679c\u4fdd\u7559"));
    private final l U = this.p(new l("Obsidian", 1, 0, 12, this::lambda$new$5).D("\u9ed1\u66dc\u77f3\u4fdd\u7559"));
    private final l J = this.p(new l("Web", 1, 0, 12, this::lambda$new$6).D("\u8718\u86db\u7f51\u4fdd\u7559"));
    private final l E = this.p(new l("Glowstone", 1, 0, 12, this::lambda$new$7).D("\u8367\u77f3\u4fdd\u7559"));
    private final l Y = this.p(new l("Anchor", 1, 0, 12, this::lambda$new$8).D("\u91cd\u751f\u951a\u4fdd\u7559"));
    private final l k = this.p(new l("Pearl", 1, 0, 8, this::lambda$new$9).D("\u73cd\u73e0\u4fdd\u7559"));
    private final l n = this.p(new l("Piston", 1, 0, 12, this::lambda$new$10).D("\u6d3b\u585e\u4fdd\u7559"));
    private final l P = this.p(new l("RedStone", 1, 0, 12, this::lambda$new$11).D("\u7ea2\u77f3\u5757\u4fdd\u7559"));
    private final l D = this.p(new l("Ladder", 2, 0, 12, this::lambda$new$12).D("\u68af\u5b50\u4fdd\u7559"));
    private final l l = this.p(new l("Bed", 4, 0, 12, this::lambda$new$13).D("\u5e8a\u4fdd\u7559"));
    private final l h = this.p(new l("Speed", 1, 0, 8, this::lambda$new$14).D("\u901f\u5ea6\u836f\u6c34\u4fdd\u7559"));
    private final l s = this.p(new l("Resistance", 1, 0, 8, this::lambda$new$15).D("\u6297\u6027\u836f\u6c34\u4fdd\u7559"));
    private final l R = this.p(new l("Strength", 1, 0, 8, this::lambda$new$16).D("\u529b\u91cf\u836f\u6c34\u4fdd\u7559"));
    private final h B = new h();
    private final Map<Integer, String> m = new ConcurrentHashMap<Integer, String>();

    public R() {
        super("Sorter", w.Player);
        this.L("\u80cc\u5305\u6574\u7406");
        u = this;
    }

    @Override
    public void H() {
        if (dev.idhammai.c.r.q.i.R.M()) {
            return;
        }
        Frog.THREAD.w(this::lambda$onEnable$17);
    }

    public static int V(class_1792 class_17922) {
        int n2 = 0;
        for (Map.Entry<Integer, class_1799> entry : dev.idhammai.P.A.L.g.A().entrySet()) {
            if (entry.getValue().method_7909() != class_17922) continue;
            ++n2;
        }
        if (dev.idhammai.c.r.q.i.R.W.field_1724.method_6079().method_7909() == class_17922) {
            ++n2;
        }
        return n2;
    }

    public static int t(Class<?> clazz) {
        int n2 = 0;
        for (Map.Entry<Integer, class_1799> entry : dev.idhammai.P.A.L.g.A().entrySet()) {
            if (!(entry.getValue().method_7909() instanceof class_1747) || !clazz.isInstance(((class_1747)entry.getValue().method_7909()).method_7711())) continue;
            ++n2;
        }
        return n2;
    }

    private void Q() {
        this.L.J(false);
        if (!dev.idhammai.c.r.q.i.R.M()) {
            Object object = dev.idhammai.c.r.q.i.R.W.field_1755;
            if (object instanceof t) {
                t t2 = (t)((Object)object);
                t2.I(Frog.CLEANER);
                return;
            }
            t t3 = t.a();
            t3.I(Frog.CLEANER);
            object = dev.idhammai.c.r.q.N.P.M();
            if (object != null && !((y)object).p()) {
                ((y)object).C();
            } else {
                W.method_1507((class_437)t3);
            }
        }
    }

    @r
    public void B(QO qO) {
        if (!this.B.r(this.M.e())) {
            return;
        }
        if (!dev.idhammai.P.A.L.e.n()) {
            return;
        }
        if (this.d.h()) {
            this.E();
        }
        int n2 = 0;
        while ((double)n2 < this.c.e()) {
            this.c();
            ++n2;
        }
    }

    private void c() {
        Object object;
        int n2;
        class_1799 class_17992;
        int n3;
        if (this.b.h()) {
            for (n3 = 35; n3 >= 0; --n3) {
                class_17992 = dev.idhammai.c.r.q.i.R.W.field_1724.method_31548().method_5438(n3);
                if (class_17992.method_7960() || !this.B(class_17992)) continue;
                this.B.H();
                dev.idhammai.c.r.q.i.R.W.field_1761.method_2906(dev.idhammai.c.r.q.i.R.W.field_1724.field_7512.field_7763, n3 < 9 ? n3 + 36 : n3, 1, class_1713.field_7795, (class_1657)dev.idhammai.c.r.q.i.R.W.field_1724);
                return;
            }
        }
        if (this.Q.h()) {
            for (n3 = 35; n3 >= 9; --n3) {
                class_17992 = dev.idhammai.c.r.q.i.R.W.field_1724.method_31548().method_5438(n3);
                if (class_17992.method_7960() || !class_17992.method_7946() || class_17992.method_7947() == class_17992.method_7914()) continue;
                for (n2 = 0; n2 < 36; ++n2) {
                    if (n3 == n2 || (object = dev.idhammai.c.r.q.i.R.W.field_1724.method_31548().method_5438(n2)).method_7947() == object.method_7914() || !dev.idhammai.c.r.q.i.R.M(class_17992, (class_1799)object)) continue;
                    dev.idhammai.c.r.q.i.R.W.field_1761.method_2906(dev.idhammai.c.r.q.i.R.W.field_1724.field_7498.field_7763, n3, 0, class_1713.field_7790, (class_1657)dev.idhammai.c.r.q.i.R.W.field_1724);
                    dev.idhammai.c.r.q.i.R.W.field_1761.method_2906(dev.idhammai.c.r.q.i.R.W.field_1724.field_7498.field_7763, n2 < 9 ? n2 + 36 : n2, 0, class_1713.field_7790, (class_1657)dev.idhammai.c.r.q.i.R.W.field_1724);
                    dev.idhammai.c.r.q.i.R.W.field_1761.method_2906(dev.idhammai.c.r.q.i.R.W.field_1724.field_7498.field_7763, n3, 0, class_1713.field_7790, (class_1657)dev.idhammai.c.r.q.i.R.W.field_1724);
                    this.B.H();
                    return;
                }
            }
        }
        if (this.b.h()) {
            for (n3 = 35; n3 >= 0; --n3) {
                class_17992 = dev.idhammai.c.r.q.i.R.W.field_1724.method_31548().method_5438(n3);
                if (class_17992.method_7960() || !this.d.h() || !this.i(class_17992, false)) continue;
                this.B.H();
                dev.idhammai.c.r.q.i.R.W.field_1761.method_2906(dev.idhammai.c.r.q.i.R.W.field_1724.field_7512.field_7763, n3 < 9 ? n3 + 36 : n3, 1, class_1713.field_7795, (class_1657)dev.idhammai.c.r.q.i.R.W.field_1724);
                return;
            }
        }
        if (this.X.h()) {
            if (this.K.h()) {
                for (n3 = 0; n3 < 36; ++n3) {
                    if (!this.m.containsKey(n3)) continue;
                    String string = this.m.get(n3);
                    object = dev.idhammai.c.r.q.i.R.W.field_1724.method_31548().method_5438(n3).method_7909().method_7876();
                    if (((String)object).equals(string)) continue;
                    for (var5_10 = 0; var5_10 < 36; ++var5_10) {
                        String string2;
                        var7_15 = this.m.get(var5_10);
                        class_1799 class_17993 = dev.idhammai.c.r.q.i.R.W.field_1724.method_31548().method_5438(var5_10);
                        if (class_17993.method_7960() || (string2 = class_17993.method_7909().method_7876()).equals(var7_15) || !string2.equals(string)) continue;
                        dev.idhammai.c.r.q.i.R.W.field_1761.method_2906(dev.idhammai.c.r.q.i.R.W.field_1724.field_7498.field_7763, n3 < 9 ? n3 + 36 : n3, 0, class_1713.field_7790, (class_1657)dev.idhammai.c.r.q.i.R.W.field_1724);
                        dev.idhammai.c.r.q.i.R.W.field_1761.method_2906(dev.idhammai.c.r.q.i.R.W.field_1724.field_7498.field_7763, var5_10 < 9 ? var5_10 + 36 : var5_10, 0, class_1713.field_7790, (class_1657)dev.idhammai.c.r.q.i.R.W.field_1724);
                        dev.idhammai.c.r.q.i.R.W.field_1761.method_2906(dev.idhammai.c.r.q.i.R.W.field_1724.field_7498.field_7763, n3 < 9 ? n3 + 36 : n3, 0, class_1713.field_7790, (class_1657)dev.idhammai.c.r.q.i.R.W.field_1724);
                        this.B.H();
                        return;
                    }
                }
            } else {
                for (n3 = 9; n3 < 36; ++n3) {
                    int n4 = class_1792.method_7880((class_1792)dev.idhammai.c.r.q.i.R.W.field_1724.method_31548().method_5438(n3).method_7909());
                    if (dev.idhammai.c.r.q.i.R.W.field_1724.method_31548().method_5438(n3).method_7960()) {
                        n4 = 114514;
                    }
                    if ((n2 = this.V(n3, n4)) >= n4) continue;
                    for (var5_10 = 35; var5_10 > n3; --var5_10) {
                        int n5;
                        var7_15 = dev.idhammai.c.r.q.i.R.W.field_1724.method_31548().method_5438(var5_10);
                        if (var7_15.method_7960() || (n5 = class_1792.method_7880((class_1792)var7_15.method_7909())) != n2) continue;
                        dev.idhammai.c.r.q.i.R.W.field_1761.method_2906(dev.idhammai.c.r.q.i.R.W.field_1724.field_7498.field_7763, n3, 0, class_1713.field_7790, (class_1657)dev.idhammai.c.r.q.i.R.W.field_1724);
                        dev.idhammai.c.r.q.i.R.W.field_1761.method_2906(dev.idhammai.c.r.q.i.R.W.field_1724.field_7498.field_7763, var5_10, 0, class_1713.field_7790, (class_1657)dev.idhammai.c.r.q.i.R.W.field_1724);
                        dev.idhammai.c.r.q.i.R.W.field_1761.method_2906(dev.idhammai.c.r.q.i.R.W.field_1724.field_7498.field_7763, n3, 0, class_1713.field_7790, (class_1657)dev.idhammai.c.r.q.i.R.W.field_1724);
                        this.B.H();
                        return;
                    }
                }
            }
        }
        if (this.b.h() && this.f.h()) {
            for (n3 = 35; n3 >= 0; --n3) {
                class_1747 class_17472;
                class_1792 class_17922;
                if (!this.m.containsKey(n3)) continue;
                class_1799 class_17994 = dev.idhammai.c.r.q.i.R.W.field_1724.method_31548().method_5438(n3);
                if (this.d.h() && !this.i(class_17994, true) || class_17994.method_7960() || class_17994.method_7909() instanceof class_1738 || (class_17922 = class_17994.method_7909()) instanceof class_1747 && (class_17472 = (class_1747)class_17922).method_7711() instanceof class_2480 || class_17994.method_7909().method_7876().equals(this.m.get(n3))) continue;
                this.B.H();
                dev.idhammai.c.r.q.i.R.W.field_1761.method_2906(dev.idhammai.c.r.q.i.R.W.field_1724.field_7512.field_7763, n3 < 9 ? n3 + 36 : n3, 1, class_1713.field_7795, (class_1657)dev.idhammai.c.r.q.i.R.W.field_1724);
                return;
            }
        }
    }

    private boolean B(class_1799 class_17992) {
        boolean bl;
        class_1747 class_17472;
        class_1792 class_17922 = class_17992.method_7909();
        if (this.e.h() && (!(class_17922 instanceof class_1747) || !((class_17472 = (class_1747)class_17922).method_7711() instanceof class_2480)) && (!(bl = Frog.CLEANER.T(class_17922.method_7876())) && this.a.x(F.Whitelist) || bl && this.a.x(F.Blacklist))) {
            return true;
        }
        if (this.j.h()) {
            return class_17992.method_7946() && !class_17992.method_7964().getString().equals(class_17922.method_7848().getString());
        }
        return false;
    }

    private boolean i(class_1799 class_17992, boolean bl) {
        if (class_17992.method_7909().equals(class_1802.field_8301)) {
            if ((double)this.g[0] > this.Z.e()) {
                this.g[0] = this.g[0] - 1;
                return true;
            }
            return false;
        }
        if (class_17992.method_7909().equals(class_1802.field_8287)) {
            if ((double)this.g[1] > this.r.e()) {
                this.g[1] = this.g[1] - 1;
                return true;
            }
            return false;
        }
        if (class_17992.method_7909().equals(class_1802.field_8288)) {
            if ((double)this.g[2] > this.p.e()) {
                this.g[2] = this.g[2] - 1;
                return true;
            }
            return false;
        }
        if (class_17992.method_7909().equals(class_1802.field_8367)) {
            if ((double)this.g[3] > this.T.e()) {
                this.g[3] = this.g[3] - 1;
                return true;
            }
            return false;
        }
        if (class_17992.method_7909().equals(class_2246.field_10540.method_8389())) {
            if ((double)this.g[4] > this.U.e()) {
                this.g[4] = this.g[4] - 1;
                return true;
            }
            return false;
        }
        if (class_17992.method_7909().equals(class_2246.field_10343.method_8389())) {
            if ((double)this.g[5] > this.J.e()) {
                this.g[5] = this.g[5] - 1;
                return true;
            }
            return false;
        }
        if (class_17992.method_7909().equals(class_2246.field_10171.method_8389())) {
            if ((double)this.g[6] > this.E.e()) {
                this.g[6] = this.g[6] - 1;
                return true;
            }
            return false;
        }
        if (class_17992.method_7909().equals(class_2246.field_23152.method_8389())) {
            if ((double)this.g[7] > this.Y.e()) {
                this.g[7] = this.g[7] - 1;
                return true;
            }
            return false;
        }
        if (class_17992.method_7909().equals(class_1802.field_8634)) {
            if ((double)this.g[8] > this.k.e()) {
                this.g[8] = this.g[8] - 1;
                return true;
            }
            return false;
        }
        if (class_17992.method_7909() instanceof class_1747 && ((class_1747)class_17992.method_7909()).method_7711() instanceof class_2665) {
            if ((double)this.g[9] > this.n.e()) {
                this.g[9] = this.g[9] - 1;
                return true;
            }
            return false;
        }
        if (class_17992.method_7909().equals(class_2246.field_10002.method_8389())) {
            if ((double)this.g[10] > this.P.e()) {
                this.g[10] = this.g[10] - 1;
                return true;
            }
            return false;
        }
        if (class_17992.method_7909() instanceof class_1747 && ((class_1747)class_17992.method_7909()).method_7711() instanceof class_2244) {
            if ((double)this.g[11] > this.l.e()) {
                this.g[11] = this.g[11] - 1;
                return true;
            }
            return false;
        }
        if (class_1792.method_7880((class_1792)class_17992.method_7909()) == class_1792.method_7880((class_1792)class_1802.field_8436)) {
            class_1844 class_18442 = (class_1844)class_17992.method_57825(class_9334.field_49651, (Object)class_1844.field_49274);
            for (class_1293 class_12932 : class_18442.method_57397()) {
                if (class_12932.method_5579().comp_349() == class_1294.field_5904.comp_349()) {
                    if ((double)this.g[12] > this.h.e()) {
                        this.g[12] = this.g[12] - 1;
                        return true;
                    }
                    return false;
                }
                if (class_12932.method_5579().comp_349() == class_1294.field_5907.comp_349()) {
                    if ((double)this.g[13] > this.s.e()) {
                        this.g[13] = this.g[13] - 1;
                        return true;
                    }
                    return false;
                }
                if (class_12932.method_5579().comp_349() != class_1294.field_5910.comp_349()) continue;
                if ((double)this.g[16] > this.R.e()) {
                    this.g[16] = this.g[16] - 1;
                    return true;
                }
                return false;
            }
        }
        if (class_17992.method_7909().equals(class_1802.field_8463) && (double)this.g[14] > this.N.e()) {
            this.g[14] = this.g[14] - 1;
            return true;
        }
        if (class_17992.method_7909() instanceof class_1747 && ((class_1747)class_17992.method_7909()).method_7711() instanceof class_2399 && (double)this.g[15] > this.D.e()) {
            this.g[15] = this.g[15] - 1;
            return true;
        }
        return bl;
    }

    private void E() {
        this.g[0] = dev.idhammai.c.r.q.i.R.V(class_1802.field_8301);
        this.g[1] = dev.idhammai.c.r.q.i.R.V(class_1802.field_8287);
        this.g[2] = dev.idhammai.c.r.q.i.R.V(class_1802.field_8288);
        this.g[3] = dev.idhammai.c.r.q.i.R.V(class_1802.field_8367);
        this.g[4] = dev.idhammai.c.r.q.i.R.V(class_1802.field_8281);
        this.g[5] = dev.idhammai.c.r.q.i.R.V(class_1802.field_8786);
        this.g[6] = dev.idhammai.c.r.q.i.R.V(class_1802.field_8801);
        this.g[7] = dev.idhammai.c.r.q.i.R.V(class_1802.field_23141);
        this.g[8] = dev.idhammai.c.r.q.i.R.V(class_1802.field_8634);
        this.g[9] = dev.idhammai.c.r.q.i.R.V(class_1802.field_8249) - dev.idhammai.c.r.q.i.R.V(class_1802.field_8105);
        this.g[10] = dev.idhammai.c.r.q.i.R.V(class_1802.field_8793);
        this.g[11] = dev.idhammai.c.r.q.i.R.t(class_2244.class);
        this.g[12] = dev.idhammai.P.A.L.g.F((class_1291)class_1294.field_5904.comp_349());
        this.g[13] = dev.idhammai.P.A.L.g.F((class_1291)class_1294.field_5907.comp_349());
        this.g[14] = dev.idhammai.c.r.q.i.R.V(class_1802.field_8463);
        this.g[15] = dev.idhammai.c.r.q.i.R.t(class_2399.class);
        this.g[16] = dev.idhammai.P.A.L.g.F((class_1291)class_1294.field_5910.comp_349());
    }

    private int V(int n2, int n3) {
        int n4 = n3;
        for (int i2 = n2 + 1; i2 < 36; ++i2) {
            int n5;
            class_1799 class_17992 = dev.idhammai.c.r.q.i.R.W.field_1724.method_31548().method_5438(i2);
            if (class_17992.method_7960() || (n5 = class_1792.method_7880((class_1792)class_17992.method_7909())) >= n4) continue;
            n4 = n5;
        }
        return n4;
    }

    public static boolean M(class_1799 class_17992, class_1799 class_17993) {
        return class_1799.method_31577((class_1799)class_17992, (class_1799)class_17993);
    }

    private void lambda$onEnable$17() {
        this.m.clear();
        try {
            File file = dev.idhammai.p.R.C(this.y.q() + ".kit");
            if (!file.exists()) {
                return;
            }
            List list = IOUtils.readLines((InputStream)new FileInputStream(file), (Charset)StandardCharsets.UTF_8);
            for (String string : list) {
                String[] stringArray = string.split(":");
                if (stringArray.length != 2) {
                    return;
                }
                this.m.put(Integer.valueOf(stringArray[0]), stringArray[1]);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private boolean lambda$new$16() {
        return this.b.f() && this.d.f();
    }

    private boolean lambda$new$15() {
        return this.b.f() && this.d.f();
    }

    private boolean lambda$new$14() {
        return this.b.f() && this.d.f();
    }

    private boolean lambda$new$13() {
        return this.b.f() && this.d.f();
    }

    private boolean lambda$new$12() {
        return this.b.f() && this.d.f();
    }

    private boolean lambda$new$11() {
        return this.b.f() && this.d.f();
    }

    private boolean lambda$new$10() {
        return this.b.f() && this.d.f();
    }

    private boolean lambda$new$9() {
        return this.b.f() && this.d.f();
    }

    private boolean lambda$new$8() {
        return this.b.f() && this.d.f();
    }

    private boolean lambda$new$7() {
        return this.b.f() && this.d.f();
    }

    private boolean lambda$new$6() {
        return this.b.f() && this.d.f();
    }

    private boolean lambda$new$5() {
        return this.b.f() && this.d.f();
    }

    private boolean lambda$new$4() {
        return this.b.f() && this.d.f();
    }

    private boolean lambda$new$3() {
        return this.b.f() && this.d.f();
    }

    private boolean lambda$new$2() {
        return this.b.f() && this.d.f();
    }

    private boolean lambda$new$1() {
        return this.b.f() && this.d.f();
    }

    private boolean lambda$new$0() {
        return this.b.f() && this.d.f();
    }
}

