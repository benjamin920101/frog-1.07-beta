/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1511
 *  net.minecraft.class_2246
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_238
 */
package dev.idhammai.c.r.q.A;

import dev.idhammai.Frog;
import dev.idhammai.P.A.A.h;
import dev.idhammai.P.A.L.e;
import dev.idhammai.P.A.L.g;
import dev.idhammai.P.A.Y.N;
import dev.idhammai.P.A.l.M;
import dev.idhammai.P.A.l.k;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.c.r.O.Y.B;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.q.A.A;
import dev.idhammai.c.r.q.A.D;
import dev.idhammai.c.r.q.A.i;
import dev.idhammai.c.r.q.A.q;
import dev.idhammai.c.r.q.N.x;
import dev.idhammai.c.r.q.Q.W;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_1511;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class U
extends y {
    public static U a;
    private final B<D> k = this.S(new B<D>("Page", dev.idhammai.c.r.q.A.D.General).I("\u9875\u9762").X(dev.idhammai.c.r.q.A.D.General, "\u5e38\u89c4").X(dev.idhammai.c.r.q.A.D.Target, "\u76ee\u6807").X(dev.idhammai.c.r.q.A.D.Check, "\u68c0\u6d4b"));
    final List<class_2338> C = new ArrayList<class_2338>();
    final List<class_2338> F = new ArrayList<class_2338>();
    final List<class_2338> A = new ArrayList<class_2338>();
    private final h L = new h();
    private final l K = this.p(new l("PlaceDelay", 50, 0, 500, this::lambda$new$0).D("\u653e\u7f6e\u5ef6\u8fdf"));
    private final l V = this.p(new l("BlocksPer", 1, 1, 8, this::lambda$new$1).D("\u6bcftick\u65b9\u5757"));
    private final dev.idhammai.c.r.O.Y.W M = this.S(new dev.idhammai.c.r.O.Y.W("Rotate", true, this::lambda$new$2).k("\u8f6c\u5411"));
    private final dev.idhammai.c.r.O.Y.W B = this.S(new dev.idhammai.c.r.O.Y.W("Break", true, this::lambda$new$3).k("\u6253\u6c34\u6676"));
    private final dev.idhammai.c.r.O.Y.W f = this.S(new dev.idhammai.c.r.O.Y.W("InventorySwap", true, this::lambda$new$4).k("\u80cc\u5305\u5207\u6362"));
    private final dev.idhammai.c.r.O.Y.W Z = this.S(new dev.idhammai.c.r.O.Y.W("BevelCev", true, this::lambda$new$5).k("\u659c\u89d2\u9632Cev"));
    private final dev.idhammai.c.r.O.Y.W G = this.S(new dev.idhammai.c.r.O.Y.W("Burrow", true, this::lambda$new$6).k("\u81ea\u57cb\u4fdd\u62a4"));
    private final dev.idhammai.c.r.O.Y.W u = this.S(new dev.idhammai.c.r.O.Y.W("Face", true, this::lambda$new$7).k("\u8138\u90e8\u4fdd\u62a4").D());
    private final dev.idhammai.c.r.O.Y.W t = this.S(new dev.idhammai.c.r.O.Y.W("FaceUp", false, this::lambda$new$8).k("\u8138\u90e8\u4e0a\u65b9"));
    private final dev.idhammai.c.r.O.Y.W Q = this.S(new dev.idhammai.c.r.O.Y.W("Feet", true, this::lambda$new$9).k("\u811a\u4e0b\u4fdd\u62a4").D());
    private final dev.idhammai.c.r.O.Y.W P = this.S(new dev.idhammai.c.r.O.Y.W("Extend", false, this::lambda$new$10).k("\u6269\u5c55\u4fdd\u62a4"));
    private final dev.idhammai.c.r.O.Y.W y = this.S(new dev.idhammai.c.r.O.Y.W("OnlySurround", true, this::lambda$new$11).k("\u4ec5\u5305\u56f4\u542f\u7528"));
    private final dev.idhammai.c.r.O.Y.W d = this.S(new dev.idhammai.c.r.O.Y.W("InAirPause", false, this::lambda$new$12).k("\u7a7a\u4e2d\u6682\u505c"));
    private final dev.idhammai.c.r.O.Y.W E = this.S(new dev.idhammai.c.r.O.Y.W("DetectMining", true, this::lambda$new$13).k("\u68c0\u6d4b\u6316\u6398"));
    private final dev.idhammai.c.r.O.Y.W r = this.S(new dev.idhammai.c.r.O.Y.W("EatingPause", true, this::lambda$new$14).k("\u8fdb\u98df\u6682\u505c"));
    private int Y = 0;
    private class_2338 D;

    public U() {
        super("Blocker", w.Combat);
        this.L("\u6c34\u6676\u963b\u6321");
        a = this;
    }

    @r
    public void h(QO qO) {
        class_2338 class_23382;
        class_2350[] class_2350Array;
        int n2;
        class_2338 class_23383;
        this.A.clear();
        if (this.f.h() && !e.n()) {
            return;
        }
        if (W.b.p() && W.b.m.h()) {
            return;
        }
        if (!this.L.S(this.K.e())) {
            return;
        }
        if (this.r.h() && U.W.field_1724.method_6115()) {
            return;
        }
        this.Y = 0;
        if (this.D != null && !this.D.equals((Object)e.H(true))) {
            this.C.clear();
            this.F.clear();
        }
        this.D = e.H(true);
        double[] dArray = new double[]{x.o(), -x.o(), 0.0};
        if (this.Z.h()) {
            for (class_2350 class_23502 : class_2350.values()) {
                if (class_23502 == class_2350.field_11033 || this.m(this.D.method_10093(class_23502).method_10084()) || !this.E(class_23383 = this.D.method_10093(class_23502).method_10086(2)) || this.C.contains(class_23383)) continue;
                this.C.add(class_23383);
            }
        }
        if (this.u.h() && (!this.y.h() || q.y.p() || dev.idhammai.c.r.q.A.A.P.p())) {
            for (double d2 : dArray) {
                for (double d3 : dArray) {
                    class_2350[] class_2350Array2 = class_2350.values();
                    int n3 = class_2350Array2.length;
                    for (n2 = 0; n2 < n3; ++n2) {
                        class_2350 class_23503 = class_2350Array2[n2];
                        for (int i2 = 0; i2 < 3; ++i2) {
                            class_2350Array = new k(U.W.field_1724.method_23317() + d2, U.W.field_1724.method_23318() + 0.5, U.W.field_1724.method_23321() + d3).method_10079(class_23503, 1).method_10084();
                            class_2338 class_23384 = new k(U.W.field_1724.method_23317() + d2, U.W.field_1724.method_23318() + 0.5, U.W.field_1724.method_23321() + d3).method_10079(class_23503, i2).method_10084();
                            if (!this.E(class_23384) || this.C.contains(class_23384) || Frog.HOLE.O((class_2338)class_2350Array)) continue;
                            this.C.add(class_23384);
                        }
                    }
                }
            }
            if (this.t.h()) {
                for (class_2350 class_23504 : class_2350.values()) {
                    if (class_23504 == class_2350.field_11033 || this.m(this.D.method_10093(class_23504).method_10084()) || !this.E(class_23383 = this.D.method_10093(class_23504).method_10086(2)) || this.C.contains(class_23383)) continue;
                    this.C.add(class_23383);
                }
            }
        }
        if (this.S() == -1) {
            return;
        }
        this.C.removeIf(U::lambda$onUpdate$15);
        if (this.G.h()) {
            for (double d4 : dArray) {
                for (double d3 : dArray) {
                    k k2 = new k(U.W.field_1724.method_23317() + d4, U.W.field_1724.method_23318(), U.W.field_1724.method_23321() + d3);
                    if (this.m(k2) || !Frog.BREAK.X(k2)) continue;
                    class_2350[] class_2350Array3 = class_2350.values();
                    n2 = class_2350Array3.length;
                    for (int i3 = 0; i3 < n2; ++i3) {
                        class_2350 class_23505 = class_2350Array3[i3];
                        if (class_23505 == class_2350.field_11033 || class_23505 == class_2350.field_11036) continue;
                        class_2350Array = k2.method_10093(class_23505);
                        if (this.E.h() && Frog.BREAK.X((class_2338)class_2350Array)) continue;
                        if (this.B.h()) {
                            N.r((class_2338)class_2350Array, this.M.h(), false);
                        }
                        if (!dev.idhammai.P.A.l.M.A((class_2338)class_2350Array, 6.0, this.B.h())) continue;
                        this.F.add((class_2338)class_2350Array);
                    }
                }
            }
        }
        if (this.Q.h() && (!this.y.h() || q.y.p() || dev.idhammai.c.r.q.A.A.P.p())) {
            for (double d5 : dArray) {
                for (double d3 : dArray) {
                    class_2350[] class_2350Array4 = class_2350.values();
                    int n4 = class_2350Array4.length;
                    for (n2 = 0; n2 < n4; ++n2) {
                        class_2350 class_23506 = class_2350Array4[n2];
                        class_2338 class_23385 = new k(U.W.field_1724.method_23317() + d5, U.W.field_1724.method_23318() + 0.5, U.W.field_1724.method_23321() + d3).method_10093(class_23506);
                        if (this.m(class_23385) || !Frog.BREAK.X(class_23385)) continue;
                        for (class_2350 class_23507 : class_2350.values()) {
                            class_23382 = class_23385.method_10093(class_23507);
                            if (this.E.h() && Frog.BREAK.X(class_23382)) continue;
                            if (this.B.h()) {
                                N.r(class_23382, this.M.h(), false);
                            }
                            if (dev.idhammai.P.A.l.M.A(class_23382, 6.0, this.B.h())) {
                                this.F.add(class_23382);
                                continue;
                            }
                            if (!dev.idhammai.P.A.l.M.c(class_23382) || dev.idhammai.P.A.l.M.r(class_23382, true) || this.a(class_23382) == null) continue;
                            this.F.add(this.a(class_23382));
                        }
                    }
                }
            }
        }
        if (this.Q.h() && this.P.h() && (!this.y.h() || q.y.p() || dev.idhammai.c.r.q.A.A.P.p())) {
            for (double d6 : dArray) {
                for (double d3 : dArray) {
                    for (class_2350 class_23508 : class_2350.values()) {
                        class_2338 class_23386;
                        if (class_23508 == class_2350.field_11036 || class_23508 == class_2350.field_11033 || this.m(class_23386 = new k(U.W.field_1724.method_23317() + d6, U.W.field_1724.method_23318() + 0.5, U.W.field_1724.method_23321() + d3).method_10093(class_23508))) continue;
                        for (class_2350 class_23507 : class_2350.values()) {
                            if (class_23507 == class_2350.field_11036 || class_23507 == class_2350.field_11033 || !i.X6.q(class_23382 = class_23386.method_10093(class_23507), true, true) || this.E.h() && Frog.BREAK.X(class_23382)) continue;
                            if (this.B.h()) {
                                N.r(class_23382, this.M.h(), false);
                            }
                            if (!dev.idhammai.P.A.l.M.A(class_23382, 6.0, this.B.h())) continue;
                            this.F.add(class_23382);
                        }
                    }
                }
            }
        }
        this.F.removeIf(U::lambda$onUpdate$16);
        if (this.d.h() && !U.W.field_1724.method_24828()) {
            return;
        }
        if (this.F.isEmpty()) {
            return;
        }
        int n5 = U.W.field_1724.method_31548().field_7545;
        int n6 = this.S();
        if (n6 == -1) {
            return;
        }
        this.o(n6);
        for (class_2338 class_23387 : this.F) {
            if (!dev.idhammai.P.A.l.M.A(class_23387, 6.0, this.B.h())) continue;
            this.H(class_23387);
        }
        if (this.f.h()) {
            this.o(n6);
            e.t();
        } else {
            this.o(n5);
        }
    }

    public class_2338 a(class_2338 class_23382) {
        for (class_2350 class_23502 : class_2350.values()) {
            if (class_23502 == class_2350.field_11036 || this.E.h() && Frog.BREAK.X(class_23382.method_10093(class_23502)) || !dev.idhammai.P.A.l.M.t(class_23382.method_10093(class_23502), class_23502.method_10153()) || !dev.idhammai.P.A.l.M.c(class_23382.method_10093(class_23502), 6.0)) continue;
            return class_23382.method_10093(class_23502);
        }
        return null;
    }

    private boolean E(class_2338 class_23382) {
        return dev.idhammai.P.A.l.M.U(new class_238(class_23382)).stream().anyMatch(arg_0 -> U.lambda$crystalHere$17(class_23382, arg_0));
    }

    private boolean m(class_2338 class_23382) {
        return U.W.field_1687.method_8320(class_23382).method_26204() == class_2246.field_9987;
    }

    private void H(class_2338 class_23382) {
        if (this.A.contains(class_23382)) {
            return;
        }
        this.A.add(class_23382);
        if (!((double)this.Y < this.V.e())) {
            return;
        }
        dev.idhammai.P.A.l.M.i(class_23382, this.M.h());
        this.L.H();
        ++this.Y;
    }

    private void E(class_2338 class_23382) {
        if (this.A.contains(class_23382)) {
            return;
        }
        this.A.add(class_23382);
        if (!((double)this.Y < this.V.e())) {
            return;
        }
        if (this.E.h() && Frog.BREAK.X(class_23382)) {
            return;
        }
        int n2 = U.W.field_1724.method_31548().field_7545;
        int n3 = this.S();
        if (n3 == -1) {
            return;
        }
        this.o(n3);
        dev.idhammai.P.A.l.M.i(class_23382, this.M.h());
        this.L.H();
        if (this.f.h()) {
            this.o(n3);
            e.t();
        } else {
            this.o(n2);
        }
        ++this.Y;
    }

    private void o(int n2) {
        if (this.f.h()) {
            g.z(n2, U.W.field_1724.method_31548().field_7545);
        } else {
            g.j(n2);
        }
    }

    private int S() {
        if (this.f.h()) {
            return g.H(class_2246.field_10540);
        }
        return g.L(class_2246.field_10540);
    }

    private static boolean lambda$crystalHere$17(class_2338 class_23382, class_1511 class_15112) {
        return class_15112.method_24515().equals((Object)class_23382);
    }

    private static boolean lambda$onUpdate$16(class_2338 class_23382) {
        return !dev.idhammai.P.A.l.M.U(class_23382, true);
    }

    private static boolean lambda$onUpdate$15(class_2338 class_23382) {
        return !dev.idhammai.P.A.l.M.U(class_23382, true);
    }

    private boolean lambda$new$14() {
        return this.k.X() == dev.idhammai.c.r.q.A.D.Check;
    }

    private boolean lambda$new$13() {
        return this.k.X() == dev.idhammai.c.r.q.A.D.Check;
    }

    private boolean lambda$new$12() {
        return this.k.X() == dev.idhammai.c.r.q.A.D.Check;
    }

    private boolean lambda$new$11() {
        return this.k.X() == dev.idhammai.c.r.q.A.D.Target && this.Q.f();
    }

    private boolean lambda$new$10() {
        return this.k.X() == dev.idhammai.c.r.q.A.D.Target && this.Q.f();
    }

    private boolean lambda$new$9() {
        return this.k.X() == dev.idhammai.c.r.q.A.D.Target;
    }

    private boolean lambda$new$8() {
        return this.k.X() == dev.idhammai.c.r.q.A.D.Target && this.u.f();
    }

    private boolean lambda$new$7() {
        return this.k.X() == dev.idhammai.c.r.q.A.D.Target;
    }

    private boolean lambda$new$6() {
        return this.k.X() == dev.idhammai.c.r.q.A.D.Target;
    }

    private boolean lambda$new$5() {
        return this.k.X() == dev.idhammai.c.r.q.A.D.Target;
    }

    private boolean lambda$new$4() {
        return this.k.X() == dev.idhammai.c.r.q.A.D.General;
    }

    private boolean lambda$new$3() {
        return this.k.X() == dev.idhammai.c.r.q.A.D.General;
    }

    private boolean lambda$new$2() {
        return this.k.X() == dev.idhammai.c.r.q.A.D.General;
    }

    private boolean lambda$new$1() {
        return this.k.X() == dev.idhammai.c.r.q.A.D.General;
    }

    private boolean lambda$new$0() {
        return this.k.X() == dev.idhammai.c.r.q.A.D.General;
    }
}

