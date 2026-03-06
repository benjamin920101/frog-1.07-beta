/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1291
 *  net.minecraft.class_1293
 *  net.minecraft.class_1294
 *  net.minecraft.class_1657
 *  net.minecraft.class_1703
 *  net.minecraft.class_1713
 *  net.minecraft.class_1733
 *  net.minecraft.class_1735
 *  net.minecraft.class_1747
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_1844
 *  net.minecraft.class_2244
 *  net.minecraft.class_2246
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2480
 *  net.minecraft.class_2665
 *  net.minecraft.class_3532
 *  net.minecraft.class_495
 *  net.minecraft.class_9334
 */
package dev.idhammai.c.r.q.A;

import dev.idhammai.P.A.A.h;
import dev.idhammai.P.A.L.g;
import dev.idhammai.P.A.l.M;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.c.r.O.Y.O;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.q.A.Q;
import dev.idhammai.c.r.q.A.p;
import dev.idhammai.c.r.q.i.a;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_1291;
import net.minecraft.class_1293;
import net.minecraft.class_1294;
import net.minecraft.class_1657;
import net.minecraft.class_1703;
import net.minecraft.class_1713;
import net.minecraft.class_1733;
import net.minecraft.class_1735;
import net.minecraft.class_1747;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1844;
import net.minecraft.class_2244;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2480;
import net.minecraft.class_2665;
import net.minecraft.class_3532;
import net.minecraft.class_495;
import net.minecraft.class_9334;

public class n
extends y {
    public static n G;
    public final W s = this.S(new W("Rotate", true).k("\u8f6c\u5411"));
    public final h N = new h();
    final int[] Y = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private final W f = this.S(new W("AutoDisable", true).k("\u81ea\u52a8\u5173\u95ed"));
    private final l P = this.p(new l("DisableTime", 500, 0, 1000).D("\u5173\u95ed\u5ef6\u65f6"));
    private final W I = this.S(new W("Place", true).k("\u81ea\u52a8\u653e\u7f6e"));
    private final W E = this.S(new W("InventorySwap", true).k("\u80cc\u5305\u5207\u6362"));
    private final W Z = this.S(new W("PerferOpen", true).k("\u4f18\u5148\u5f00\u76d2"));
    private final W p = this.S(new W("Open", true).k("\u81ea\u52a8\u6253\u5f00"));
    private final l l = this.p(new l("MaxRange", 4.0, 0.0, 6.0, 0.1).D("\u6700\u5927\u8303\u56f4"));
    private final l y = this.p(new l("MinRange", 1.0, 0.0, 3.0, 0.1).D("\u6700\u5c0f\u8303\u56f4"));
    private final W R = this.S(new W("Mine", true).k("\u81ea\u52a8\u6316\u6398"));
    private final W r = this.S(new W("Take", true).k("\u81ea\u52a8\u62ff\u53d6"));
    private final W F = this.S(new W("Smart", true, this.r::h).k("\u667a\u80fd\u62ff\u53d6").D());
    private final W Q = this.S(new W("ForceQuickMove", true, this::lambda$new$0).k("\u5f3a\u5236\u5feb\u6377\u53d6"));
    private final l D = this.p(new l("Crystal", 256, 0, 512, this::lambda$new$1).D("\u6c34\u6676\u6570\u91cf"));
    private final l X = this.p(new l("Exp", 256, 0, 512, this::lambda$new$2).D("\u7ecf\u9a8c\u74f6\u6570\u91cf"));
    private final l M = this.p(new l("Totem", 6, 0, 36, this::lambda$new$3).D("\u56fe\u817e\u6570\u91cf"));
    private final l d = this.p(new l("Gapple", 128, 0, 512, this::lambda$new$4).D("\u91d1\u82f9\u679c\u6570\u91cf"));
    private final l A = this.p(new l("Obsidian", 64, 0, 512, this::lambda$new$5).D("\u9ed1\u66dc\u77f3\u6570\u91cf"));
    private final l U = this.p(new l("Web", 64, 0, 512, this::lambda$new$6).D("\u86db\u7f51\u6570\u91cf"));
    private final l m = this.p(new l("Glowstone", 128, 0, 512, this::lambda$new$7).D("\u8367\u77f3\u6570\u91cf"));
    private final l L = this.p(new l("Anchor", 128, 0, 512, this::lambda$new$8).D("\u91cd\u751f\u951a\u6570\u91cf"));
    private final l b = this.p(new l("Pearl", 16, 0, 64, this::lambda$new$9).D("\u73cd\u73e0\u6570\u91cf"));
    private final l c = this.p(new l("Piston", 64, 0, 512, this::lambda$new$10).D("\u6d3b\u585e\u6570\u91cf"));
    private final l j = this.p(new l("RedStone", 64, 0, 512, this::lambda$new$11).D("\u7ea2\u77f3\u6570\u91cf"));
    private final l V = this.p(new l("Bed", 256, 0, 512, this::lambda$new$12).D("\u5e8a\u6570\u91cf"));
    private final l g = this.p(new l("Speed", 1, 0, 8, this::lambda$new$13).D("\u901f\u5ea6\u836f\u6c34\u6570\u91cf"));
    private final l k = this.p(new l("Resistance", 1, 0, 8, this::lambda$new$14).D("\u6297\u6027\u836f\u6c34\u6570\u91cf"));
    private final l B = this.p(new l("Strength", 1, 0, 8, this::lambda$new$15).D("\u529b\u91cf\u836f\u6c34\u6570\u91cf"));
    private final O n = this.n(new O("PlaceKey", -1).E("\u653e\u7f6e\u6309\u952e"));
    private final h J = new h();
    private final List<class_2338> K = new ArrayList<class_2338>();
    public class_2338 C = null;
    private class_2338 w;
    private boolean h = false;
    private boolean a = false;

    public n() {
        super("AutoRegear", dev.idhammai.c.r.w.Combat);
        this.L("\u81ea\u52a8\u8865\u7ed9");
        G = this;
    }

    public int E() {
        if (this.E.h()) {
            for (int i2 = 0; i2 < 36; ++i2) {
                class_1747 class_17472;
                class_1792 class_17922;
                class_1799 class_17992 = dev.idhammai.c.r.q.A.n.W.field_1724.method_31548().method_5438(i2);
                if (class_17992.method_7960() || !((class_17922 = class_17992.method_7909()) instanceof class_1747) || !((class_17472 = (class_1747)class_17922).method_7711() instanceof class_2480)) continue;
                return i2 < 9 ? i2 + 36 : i2;
            }
            return -1;
        }
        return dev.idhammai.P.A.L.g.K(class_2480.class);
    }

    @Override
    public void H() {
        this.h = false;
        this.w = null;
        this.N.H();
        this.C = null;
        if (dev.idhammai.c.r.q.A.n.M()) {
            return;
        }
        if (!this.I.h()) {
            return;
        }
        this.w();
    }

    private void w() {
        int n2 = dev.idhammai.c.r.q.A.n.W.field_1724.method_31548().field_7545;
        double d2 = 100.0;
        class_2338 class_23382 = null;
        for (class_2338 class_23383 : dev.idhammai.P.A.l.M.I((float)this.l.e())) {
            if (!dev.idhammai.c.r.q.A.n.W.field_1687.method_22347(class_23383.method_10084())) continue;
            if (this.Z.h() && dev.idhammai.c.r.q.A.n.W.field_1687.method_8320(class_23383).method_26204() instanceof class_2480) {
                return;
            }
            if ((double)class_3532.method_15355((float)((float)dev.idhammai.c.r.q.A.n.W.field_1724.method_5707(class_23383.method_46558()))) < this.y.e() || !dev.idhammai.P.A.l.M.U(class_23383, false) || !dev.idhammai.P.A.l.M.t(class_23383.method_10093(class_2350.field_11033), class_2350.field_11036) || !dev.idhammai.P.A.l.M.M(class_23383.method_10093(class_2350.field_11033)) || class_23382 != null && !((double)class_3532.method_15355((float)((float)dev.idhammai.c.r.q.A.n.W.field_1724.method_5707(class_23383.method_46558()))) < d2)) continue;
            d2 = class_3532.method_15355((float)((float)dev.idhammai.c.r.q.A.n.W.field_1724.method_5707(class_23383.method_46558())));
            class_23382 = class_23383;
        }
        if (class_23382 != null) {
            if (this.E() == -1) {
                this.y("\u00a74No shulkerbox found.");
                return;
            }
            if (this.E.h()) {
                int n3 = this.E();
                dev.idhammai.P.A.L.g.z(n3, n2);
                this.N(class_23382);
                this.C = class_23382;
                dev.idhammai.P.A.L.g.z(n3, n2);
            } else {
                dev.idhammai.P.A.L.g.j(this.E());
                this.N(class_23382);
                this.C = class_23382;
                dev.idhammai.P.A.L.g.j(n2);
            }
            this.J.H();
        } else {
            this.y("\u00a74No place position found.");
        }
    }

    private void z() {
        this.Y[0] = (int)(this.D.e() - (double)dev.idhammai.P.A.L.g.z(class_1802.field_8301));
        this.Y[1] = (int)(this.X.e() - (double)dev.idhammai.P.A.L.g.z(class_1802.field_8287));
        this.Y[2] = (int)(this.M.e() - (double)dev.idhammai.P.A.L.g.z(class_1802.field_8288));
        this.Y[3] = (int)(this.d.e() - (double)dev.idhammai.P.A.L.g.z(class_1802.field_8367));
        this.Y[4] = (int)(this.A.e() - (double)dev.idhammai.P.A.L.g.z(class_2246.field_10540.method_8389()));
        this.Y[5] = (int)(this.U.e() - (double)dev.idhammai.P.A.L.g.z(class_2246.field_10343.method_8389()));
        this.Y[6] = (int)(this.m.e() - (double)dev.idhammai.P.A.L.g.z(class_2246.field_10171.method_8389()));
        this.Y[7] = (int)(this.L.e() - (double)dev.idhammai.P.A.L.g.z(class_2246.field_23152.method_8389()));
        this.Y[8] = (int)(this.b.e() - (double)dev.idhammai.P.A.L.g.z(class_1802.field_8634));
        this.Y[9] = (int)(this.c.e() - (double)dev.idhammai.P.A.L.g.z(class_2246.field_10560.method_8389()) - (double)dev.idhammai.P.A.L.g.z(class_2246.field_10615.method_8389()));
        this.Y[10] = (int)(this.j.e() - (double)dev.idhammai.P.A.L.g.z(class_2246.field_10002.method_8389()));
        this.Y[11] = (int)(this.V.e() - (double)dev.idhammai.P.A.L.g.A(class_2244.class));
        this.Y[12] = (int)(this.g.e() - (double)dev.idhammai.P.A.L.g.F((class_1291)class_1294.field_5904.comp_349()));
        this.Y[13] = (int)(this.k.e() - (double)dev.idhammai.P.A.L.g.F((class_1291)class_1294.field_5907.comp_349()));
        this.Y[14] = (int)(this.B.e() - (double)dev.idhammai.P.A.L.g.F((class_1291)class_1294.field_5910.comp_349()));
    }

    @Override
    public void L() {
        this.h = false;
        if (this.R.h() && this.C != null) {
            dev.idhammai.c.r.q.i.a.D5.d(this.C);
        }
    }

    @r
    public void M(QO qO) {
        if (this.F.h()) {
            this.z();
        }
        if (this.n.G() && dev.idhammai.c.r.q.A.n.W.field_1755 == null) {
            if (!this.a) {
                this.h = false;
                this.w = null;
                this.N.H();
                this.C = null;
                this.w();
            }
            this.a = true;
        } else {
            this.a = false;
        }
        this.K.removeIf(n::lambda$onUpdate$16);
        if (!(dev.idhammai.c.r.q.A.n.W.field_1755 instanceof class_495)) {
            if (this.h) {
                this.h = false;
                if (this.f.h()) {
                    this.N();
                }
                if (this.R.h() && this.w != null) {
                    if (dev.idhammai.c.r.q.A.n.W.field_1687.method_8320(this.w).method_26204() instanceof class_2480) {
                        dev.idhammai.c.r.q.i.a.D5.d(this.w);
                    } else {
                        this.w = null;
                    }
                }
                return;
            }
            if (this.p.h()) {
                if (this.C != null && (double)class_3532.method_15355((float)((float)dev.idhammai.c.r.q.A.n.W.field_1724.method_5707(this.C.method_46558()))) <= this.l.e() && dev.idhammai.c.r.q.A.n.W.field_1687.method_22347(this.C.method_10084()) && (!this.J.m(500L) || dev.idhammai.c.r.q.A.n.W.field_1687.method_8320(this.C).method_26204() instanceof class_2480)) {
                    if (dev.idhammai.c.r.q.A.n.W.field_1687.method_8320(this.C).method_26204() instanceof class_2480) {
                        this.w = this.C;
                        dev.idhammai.P.A.l.M.T(this.C, dev.idhammai.P.A.l.M.e(this.C), this.s.h());
                    }
                } else {
                    boolean bl = false;
                    for (class_2338 class_23382 : dev.idhammai.P.A.l.M.I((float)this.l.e())) {
                        if (this.K.contains(class_23382) || !dev.idhammai.c.r.q.A.n.W.field_1687.method_22347(class_23382.method_10084()) && !dev.idhammai.P.A.l.M.c(class_23382.method_10084()) || !(dev.idhammai.c.r.q.A.n.W.field_1687.method_8320(class_23382).method_26204() instanceof class_2480)) continue;
                        this.w = class_23382;
                        dev.idhammai.P.A.l.M.T(class_23382, dev.idhammai.P.A.l.M.e(class_23382), this.s.h());
                        bl = true;
                        break;
                    }
                    if (!bl && this.f.h()) {
                        this.N();
                    }
                }
            } else if (!this.r.h() && this.f.h()) {
                this.N();
            }
            return;
        }
        this.h = true;
        if (this.w != null) {
            this.K.add(this.w);
        }
        if (!this.r.h()) {
            if (this.f.h()) {
                this.N();
            }
            return;
        }
        boolean bl = false;
        class_1703 class_17032 = dev.idhammai.c.r.q.A.n.W.field_1724.field_7512;
        if (class_17032 instanceof class_1733) {
            class_1733 class_17332 = (class_1733)class_17032;
            block1: for (class_1735 class_17352 : class_17332.field_7761) {
                if (class_17352.field_7874 >= 27 || class_17352.method_7677().method_7960()) continue;
                p p2 = this.t(class_17352.method_7677());
                if (!this.F.h() || p2 == dev.idhammai.c.r.q.A.p.QuickMove || p2 == dev.idhammai.c.r.q.A.p.Stack && this.Q.h()) {
                    dev.idhammai.c.r.q.A.n.W.field_1761.method_2906(class_17332.field_7763, class_17352.field_7874, 0, class_1713.field_7794, (class_1657)dev.idhammai.c.r.q.A.n.W.field_1724);
                    bl = true;
                    continue;
                }
                if (p2 != dev.idhammai.c.r.q.A.p.Stack) continue;
                for (int i2 = 0; i2 < 36; ++i2) {
                    class_1799 class_17992 = dev.idhammai.c.r.q.A.n.W.field_1724.method_31548().method_5438(i2);
                    if (class_17992.method_7960() || !class_17992.method_7946() || class_17992.method_7909() != class_17352.method_7677().method_7909() || class_17992.method_7947() >= class_17992.method_7914()) continue;
                    int n2 = (i2 < 9 ? i2 + 36 : i2) + 18;
                    dev.idhammai.c.r.q.A.n.W.field_1761.method_2906(class_17332.field_7763, class_17352.field_7874, 0, class_1713.field_7790, (class_1657)dev.idhammai.c.r.q.A.n.W.field_1724);
                    dev.idhammai.c.r.q.A.n.W.field_1761.method_2906(class_17332.field_7763, n2, 0, class_1713.field_7790, (class_1657)dev.idhammai.c.r.q.A.n.W.field_1724);
                    dev.idhammai.c.r.q.A.n.W.field_1761.method_2906(class_17332.field_7763, class_17352.field_7874, 0, class_1713.field_7790, (class_1657)dev.idhammai.c.r.q.A.n.W.field_1724);
                    bl = true;
                    continue block1;
                }
            }
        }
        if (this.f.h() && !bl) {
            this.N();
        }
    }

    private void N() {
        if (this.N.m(this.P.V())) {
            this.p();
        }
    }

    private p t(class_1799 class_17992) {
        if (class_17992.method_7909().equals(class_1802.field_8301) && this.Y[0] > 0) {
            this.Y[0] = this.Y[0] - class_17992.method_7947();
            if (this.Y[0] < 0) {
                return dev.idhammai.c.r.q.A.p.Stack;
            }
            return dev.idhammai.c.r.q.A.p.QuickMove;
        }
        if (class_17992.method_7909().equals(class_1802.field_8287) && this.Y[1] > 0) {
            this.Y[1] = this.Y[1] - class_17992.method_7947();
            if (this.Y[1] < 0) {
                return dev.idhammai.c.r.q.A.p.Stack;
            }
            return dev.idhammai.c.r.q.A.p.QuickMove;
        }
        if (class_17992.method_7909().equals(class_1802.field_8288) && this.Y[2] > 0) {
            this.Y[2] = this.Y[2] - class_17992.method_7947();
            if (this.Y[2] < 0) {
                return dev.idhammai.c.r.q.A.p.Stack;
            }
            return dev.idhammai.c.r.q.A.p.QuickMove;
        }
        if (class_17992.method_7909().equals(class_1802.field_8367) && this.Y[3] > 0) {
            this.Y[3] = this.Y[3] - class_17992.method_7947();
            if (this.Y[3] < 0) {
                return dev.idhammai.c.r.q.A.p.Stack;
            }
            return dev.idhammai.c.r.q.A.p.QuickMove;
        }
        if (class_17992.method_7909().equals(class_2246.field_10540.method_8389()) && this.Y[4] > 0) {
            this.Y[4] = this.Y[4] - class_17992.method_7947();
            if (this.Y[4] < 0) {
                return dev.idhammai.c.r.q.A.p.Stack;
            }
            return dev.idhammai.c.r.q.A.p.QuickMove;
        }
        if (class_17992.method_7909().equals(class_2246.field_10343.method_8389()) && this.Y[5] > 0) {
            this.Y[5] = this.Y[5] - class_17992.method_7947();
            if (this.Y[5] < 0) {
                return dev.idhammai.c.r.q.A.p.Stack;
            }
            return dev.idhammai.c.r.q.A.p.QuickMove;
        }
        if (class_17992.method_7909().equals(class_2246.field_10171.method_8389()) && this.Y[6] > 0) {
            this.Y[6] = this.Y[6] - class_17992.method_7947();
            if (this.Y[6] < 0) {
                return dev.idhammai.c.r.q.A.p.Stack;
            }
            return dev.idhammai.c.r.q.A.p.QuickMove;
        }
        if (class_17992.method_7909().equals(class_2246.field_23152.method_8389()) && this.Y[7] > 0) {
            this.Y[7] = this.Y[7] - class_17992.method_7947();
            if (this.Y[7] < 0) {
                return dev.idhammai.c.r.q.A.p.Stack;
            }
            return dev.idhammai.c.r.q.A.p.QuickMove;
        }
        if (class_17992.method_7909().equals(class_1802.field_8634) && this.Y[8] > 0) {
            this.Y[8] = this.Y[8] - class_17992.method_7947();
            if (this.Y[8] < 0) {
                return dev.idhammai.c.r.q.A.p.Stack;
            }
            return dev.idhammai.c.r.q.A.p.QuickMove;
        }
        if (class_17992.method_7909() instanceof class_1747 && ((class_1747)class_17992.method_7909()).method_7711() instanceof class_2665 && this.Y[9] > 0) {
            this.Y[9] = this.Y[9] - class_17992.method_7947();
            if (this.Y[9] < 0) {
                return dev.idhammai.c.r.q.A.p.Stack;
            }
            return dev.idhammai.c.r.q.A.p.QuickMove;
        }
        if (class_17992.method_7909().equals(class_2246.field_10002.method_8389()) && this.Y[10] > 0) {
            this.Y[10] = this.Y[10] - class_17992.method_7947();
            if (this.Y[10] < 0) {
                return dev.idhammai.c.r.q.A.p.Stack;
            }
            return dev.idhammai.c.r.q.A.p.QuickMove;
        }
        if (class_17992.method_7909() instanceof class_1747 && ((class_1747)class_17992.method_7909()).method_7711() instanceof class_2244 && this.Y[11] > 0) {
            this.Y[11] = this.Y[11] - class_17992.method_7947();
            if (this.Y[11] < 0) {
                return dev.idhammai.c.r.q.A.p.Stack;
            }
            return dev.idhammai.c.r.q.A.p.QuickMove;
        }
        if (class_1792.method_7880((class_1792)class_17992.method_7909()) == class_1792.method_7880((class_1792)class_1802.field_8436)) {
            class_1844 class_18442 = (class_1844)class_17992.method_57825(class_9334.field_49651, (Object)class_1844.field_49274);
            for (class_1293 class_12932 : class_18442.method_57397()) {
                if (class_12932.method_5579().comp_349() == class_1294.field_5904.comp_349()) {
                    if (this.Y[12] <= 0) continue;
                    this.Y[12] = this.Y[12] - class_17992.method_7947();
                    if (this.Y[12] < 0) {
                        return dev.idhammai.c.r.q.A.p.Stack;
                    }
                    return dev.idhammai.c.r.q.A.p.QuickMove;
                }
                if (class_12932.method_5579().comp_349() == class_1294.field_5907.comp_349()) {
                    if (this.Y[13] <= 0) continue;
                    this.Y[13] = this.Y[13] - class_17992.method_7947();
                    if (this.Y[13] < 0) {
                        return dev.idhammai.c.r.q.A.p.Stack;
                    }
                    return dev.idhammai.c.r.q.A.p.QuickMove;
                }
                if (class_12932.method_5579().comp_349() != class_1294.field_5910.comp_349() || this.Y[14] <= 0) continue;
                this.Y[14] = this.Y[14] - class_17992.method_7947();
                if (this.Y[14] < 0) {
                    return dev.idhammai.c.r.q.A.p.Stack;
                }
                return dev.idhammai.c.r.q.A.p.QuickMove;
            }
        }
        return dev.idhammai.c.r.q.A.p.None;
    }

    private void N(class_2338 class_23382) {
        dev.idhammai.c.r.q.A.Q.X.m.add(class_23382);
        dev.idhammai.P.A.l.M.T(class_23382.method_10093(class_2350.field_11033), class_2350.field_11036, this.s.h());
    }

    private static boolean lambda$onUpdate$16(class_2338 class_23382) {
        return !(dev.idhammai.c.r.q.A.n.W.field_1687.method_8320(class_23382).method_26204() instanceof class_2480);
    }

    private boolean lambda$new$15() {
        return this.r.h() && this.F.f();
    }

    private boolean lambda$new$14() {
        return this.r.h() && this.F.f();
    }

    private boolean lambda$new$13() {
        return this.r.h() && this.F.f();
    }

    private boolean lambda$new$12() {
        return this.r.h() && this.F.f();
    }

    private boolean lambda$new$11() {
        return this.r.h() && this.F.f();
    }

    private boolean lambda$new$10() {
        return this.r.h() && this.F.f();
    }

    private boolean lambda$new$9() {
        return this.r.h() && this.F.f();
    }

    private boolean lambda$new$8() {
        return this.r.h() && this.F.f();
    }

    private boolean lambda$new$7() {
        return this.r.h() && this.F.f();
    }

    private boolean lambda$new$6() {
        return this.r.h() && this.F.f();
    }

    private boolean lambda$new$5() {
        return this.r.h() && this.F.f();
    }

    private boolean lambda$new$4() {
        return this.r.h() && this.F.f();
    }

    private boolean lambda$new$3() {
        return this.r.h() && this.F.f();
    }

    private boolean lambda$new$2() {
        return this.r.h() && this.F.f();
    }

    private boolean lambda$new$1() {
        return this.r.h() && this.F.f();
    }

    private boolean lambda$new$0() {
        return this.r.h() && this.F.f();
    }
}

