/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.decoration.EndCrystalEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.Item
 *  net.minecraft.item.Items
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.Block
 *  net.minecraft.block.FacingBlock
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Box
 *  net.minecraft.block.PistonBlock
 *  net.minecraft.state.property.Property
 *  net.minecraft.util.math.MathHelper
 */
package dev.idhammai.c.r.q.A;

import dev.idhammai.Frog;
import dev.idhammai.P.A.A.h;
import dev.idhammai.P.A.L.e;
import dev.idhammai.P.A.L.g;
import dev.idhammai.P.A.L.l;
import dev.idhammai.P.A.Y.N;
import dev.idhammai.P.A.l.M;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.q.A.P;
import dev.idhammai.c.r.q.A.i;
import dev.idhammai.c.r.q.N.I;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import net.minecraft.entity.Entity;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.block.FacingBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Box;
import net.minecraft.block.PistonBlock;
import net.minecraft.state.property.Property;
import net.minecraft.util.math.MathHelper;

public class k
extends y {
    public static k a;
    private final W A = this.S(new W("Rotate", false).k("\u8f6c\u5411"));
    private final W R = this.S(new W("PistonPacket", false).k("\u6d3b\u585e\u53d1\u5305"));
    private final W X = this.S(new W("NoEating", true).k("\u8fdb\u98df\u6682\u505c"));
    private final W C = this.S(new W("EatingBreak", false).k("\u8fdb\u98df\u65f6\u7834\u574f"));
    private final dev.idhammai.c.r.O.Y.l n = this.p(new dev.idhammai.c.r.O.Y.l("PlaceRange", 5.0, 1.0, 8.0).D("\u653e\u7f6e\u8303\u56f4"));
    private final dev.idhammai.c.r.O.Y.l U = this.p(new dev.idhammai.c.r.O.Y.l("Range", 4.0, 1.0, 8.0).D("\u76ee\u6807\u8303\u56f4"));
    private final W t = this.S(new W("Fire", true).k("\u70b9\u706b"));
    private final W N = this.S(new W("Switch", false).k("\u5207\u6362\u4f4d\u7f6e"));
    private final W p = this.S(new W("SelfGround", true).k("\u81ea\u8eab\u843d\u5730"));
    private final W G = this.S(new W("MovingPause", true).k("\u79fb\u52a8\u6682\u505c"));
    private final dev.idhammai.c.r.O.Y.l c = this.p(new dev.idhammai.c.r.O.Y.l("PlaceDelay", 100, 0, 500).D("\u653e\u7f6e\u5ef6\u8fdf"));
    private final dev.idhammai.c.r.O.Y.l u = this.p(new dev.idhammai.c.r.O.Y.l("PosUpdateDelay", 500, 0, 1000).D("\u4f4d\u7f6e\u5237\u65b0\u5ef6\u8fdf"));
    private final dev.idhammai.c.r.O.Y.l H = this.p(new dev.idhammai.c.r.O.Y.l("Stage", 4, 1, 10).D("\u603b\u9636\u6bb5"));
    private final dev.idhammai.c.r.O.Y.l K = this.p(new dev.idhammai.c.r.O.Y.l("PistonStage", 1, 1, 10).D("\u6d3b\u585e\u9636\u6bb5"));
    private final dev.idhammai.c.r.O.Y.l B = this.p(new dev.idhammai.c.r.O.Y.l("PistonMaxStage", 1, 1, 10).D("\u6d3b\u585e\u6700\u5927\u9636\u6bb5"));
    private final dev.idhammai.c.r.O.Y.l P = this.p(new dev.idhammai.c.r.O.Y.l("PowerStage", 3, 1, 10).D("\u4f9b\u80fd\u9636\u6bb5"));
    private final dev.idhammai.c.r.O.Y.l E = this.p(new dev.idhammai.c.r.O.Y.l("PowerMaxStage", 3, 1, 10).D("\u4f9b\u80fd\u6700\u5927\u9636\u6bb5"));
    private final dev.idhammai.c.r.O.Y.l s = this.p(new dev.idhammai.c.r.O.Y.l("CrystalStage", 4, 1, 10).D("\u6c34\u6676\u9636\u6bb5"));
    private final dev.idhammai.c.r.O.Y.l Y = this.p(new dev.idhammai.c.r.O.Y.l("CrystalMaxStage", 4, 1, 10).D("\u6c34\u6676\u6700\u5927\u9636\u6bb5"));
    private final dev.idhammai.c.r.O.Y.l f = this.p(new dev.idhammai.c.r.O.Y.l("FireStage", 2, 1, 10).D("\u70b9\u706b\u9636\u6bb5"));
    private final dev.idhammai.c.r.O.Y.l e = this.p(new dev.idhammai.c.r.O.Y.l("FireMaxStage", 2, 1, 10).D("\u70b9\u706b\u6700\u5927\u9636\u6bb5"));
    private final W I = this.S(new W("InventorySwap", true).k("\u80cc\u5305\u5207\u6362"));
    private final W Z = this.S(new W("Debug", false).k("\u8c03\u8bd5"));
    private final h y = new h();
    private final h d = new h();
    public class_2338 L = null;
    public class_2338 r = null;
    public class_2350 l = null;
    public double h = 100.0;
    public boolean V = false;
    public int F = 1;
    private class_1657 b = null;
    private boolean g = false;

    public k() {
        super("PistonCrystal", w.Combat);
        this.L("\u6d3b\u585e\u6c34\u6676");
        a = this;
    }

    private static boolean o(class_2338 class_23382) {
        if (M.c(class_23382.method_10074())) {
            return false;
        }
        if (!k.W.field_1687.method_22347(class_23382)) {
            return false;
        }
        if (!M.M(class_23382.method_10093(class_2350.field_11033))) {
            return false;
        }
        return M.t(class_23382.method_10074(), class_2350.field_11036);
    }

    public void T() {
        if (this.K.e() > this.H.e()) {
            this.K.d(this.H.e());
        }
        if (this.f.e() > this.H.e()) {
            this.f.d(this.H.e());
        }
        if (this.P.e() > this.H.e()) {
            this.P.d(this.H.e());
        }
        if (this.s.e() > this.H.e()) {
            this.s.d(this.H.e());
        }
        if (this.B.e() > this.H.e()) {
            this.B.d(this.H.e());
        }
        if (this.e.e() > this.H.e()) {
            this.e.d(this.H.e());
        }
        if (this.E.e() > this.H.e()) {
            this.E.d(this.H.e());
        }
        if (this.Y.e() > this.H.e()) {
            this.Y.d(this.H.e());
        }
        if (this.Y.e() < this.s.e()) {
            this.s.d(this.Y.e());
        }
        if (this.E.e() < this.P.e()) {
            this.P.d(this.E.e());
        }
        if (this.B.e() < this.K.e()) {
            this.K.d(this.B.e());
        }
        if (this.e.e() < this.f.e()) {
            this.f.d(this.e.e());
        }
    }

    @r
    public void Y(QO qO) {
        this.T();
        this.b = dev.idhammai.P.A.Y.N.h(this.U.e());
        if (this.b == null) {
            return;
        }
        if (this.X.h() && k.W.field_1724.method_6115()) {
            return;
        }
        if (this.d(this.G.h(), !k.W.field_1724.method_24828(), this.p.h())) {
            return;
        }
        class_2338 class_23382 = dev.idhammai.P.A.L.e.d((class_1297)this.b, true);
        if (!k.W.field_1724.method_6115() || this.C.h()) {
            if (this.v(class_23382.method_10086(0))) {
                dev.idhammai.P.A.Y.N.r(class_23382.method_10086(0), this.A.h(), true);
            }
            if (this.v(class_23382.method_10086(1))) {
                dev.idhammai.P.A.Y.N.r(class_23382.method_10086(1), this.A.h(), true);
            }
            if (this.v(class_23382.method_10086(2))) {
                dev.idhammai.P.A.Y.N.r(class_23382.method_10086(2), this.A.h(), true);
            }
        }
        if (this.L != null && k.W.field_1687.method_8320(this.L).method_26204() instanceof class_2665) {
            this.g = true;
        } else if (this.g) {
            this.g = false;
            this.d.H();
            this.L = null;
        }
        if (this.d.S(this.u.V())) {
            this.F = 0;
            this.h = 100.0;
            this.V = false;
            this.c(class_23382.method_10086(2));
            this.c(class_23382.method_10084());
        }
        if (!this.y.S(this.c.V())) {
            return;
        }
        if (this.V && this.L != null) {
            this.y.H();
            if (this.Z.h()) {
                this.y("[Debug] PistonPos:" + String.valueOf(this.L) + " Facing:" + String.valueOf(this.l) + " CrystalPos:" + String.valueOf(this.r.method_10093(this.l)));
            }
            this.U(this.L, this.l, this.r);
        }
    }

    public boolean d(boolean bl, boolean bl2, boolean bl3) {
        if (dev.idhammai.P.A.L.l.b() && bl) {
            return true;
        }
        if (bl2 && bl3) {
            return true;
        }
        if (this.w(class_2246.field_10002) == -1) {
            return true;
        }
        if (this.j(class_2665.class) == -1) {
            return true;
        }
        return this.w(class_1802.field_8301) == -1;
    }

    private boolean v(class_2338 class_23382) {
        for (class_1297 class_12972 : M.c(new class_238(class_23382))) {
            float f2;
            if (!(class_12972 instanceof class_1511) || !((f2 = i.X6.R(class_12972.method_19538(), this.b, this.b)) > 7.0f)) continue;
            return true;
        }
        return false;
    }

    private boolean g(class_2338 class_23382) {
        for (class_1297 class_12972 : M.c(new class_238(class_23382))) {
            if (!(class_12972 instanceof class_1511) || !dev.idhammai.P.A.L.e.Y(class_12972).equals((Object)class_23382)) continue;
            return true;
        }
        return false;
    }

    @Override
    public String I() {
        if (this.b != null) {
            return this.b.method_5477().getString();
        }
        return null;
    }

    private void c(class_2338 class_23382) {
        for (class_2350 class_23502 : class_2350.values()) {
            if (class_23502 == class_2350.field_11033 || class_23502 == class_2350.field_11036) continue;
            this.z(class_23382, class_23502);
        }
    }

    private void z(class_2338 class_23382, class_2350 class_23502) {
        if (!M.k(class_23382.method_10093(class_23502)) && !this.g(class_23382.method_10093(class_23502))) {
            return;
        }
        this.s(class_23382.method_10079(class_23502, 3), class_23502, class_23382);
        this.s(class_23382.method_10079(class_23502, 3).method_10084(), class_23502, class_23382);
        int n2 = class_23382.method_10093(class_23502).method_10263() - class_23382.method_10263();
        int n3 = class_23382.method_10093(class_23502).method_10260() - class_23382.method_10260();
        this.s(class_23382.method_10079(class_23502, 3).method_10069(n3, 0, n2), class_23502, class_23382);
        this.s(class_23382.method_10079(class_23502, 3).method_10069(-n3, 0, -n2), class_23502, class_23382);
        this.s(class_23382.method_10079(class_23502, 3).method_10069(n3, 1, n2), class_23502, class_23382);
        this.s(class_23382.method_10079(class_23502, 3).method_10069(-n3, 1, -n2), class_23502, class_23382);
        this.s(class_23382.method_10079(class_23502, 2), class_23502, class_23382);
        this.s(class_23382.method_10079(class_23502, 2).method_10084(), class_23502, class_23382);
        this.s(class_23382.method_10079(class_23502, 2).method_10069(n3, 0, n2), class_23502, class_23382);
        this.s(class_23382.method_10079(class_23502, 2).method_10069(-n3, 0, -n2), class_23502, class_23382);
        this.s(class_23382.method_10079(class_23502, 2).method_10069(n3, 1, n2), class_23502, class_23382);
        this.s(class_23382.method_10079(class_23502, 2).method_10069(-n3, 1, -n2), class_23502, class_23382);
    }

    private void s(class_2338 class_23382, class_2350 class_23502, class_2338 class_23383) {
        if (this.N.h() && this.L != null && this.L.equals((Object)class_23382) && k.W.field_1687.method_22347(this.L)) {
            return;
        }
        if (!M.c(class_23382, this.n.e()) && !(this.Q(class_23382) instanceof class_2665)) {
            return;
        }
        if (this.j(class_2665.class) == -1) {
            return;
        }
        if (dev.idhammai.c.r.q.N.I.Q.s.h() && !(this.Q(class_23382) instanceof class_2665) && (k.W.field_1724.method_23318() - (double)class_23382.method_10264() <= -2.0 || k.W.field_1724.method_23318() - (double)class_23382.method_10264() >= 3.0) && M.H((double)class_23382.method_10263() + 0.5, (double)class_23382.method_10260() + 0.5) < 2.6) {
            return;
        }
        if (!k.W.field_1687.method_22347(class_23382.method_10079(class_23502, -1)) || k.W.field_1687.method_8320(class_23382.method_10079(class_23502, -1)).method_26204() == class_2246.field_10036 || this.Q(class_23382.method_10093(class_23502.method_10153())) == class_2246.field_10008 && !this.g(class_23382.method_10093(class_23502.method_10153()))) {
            return;
        }
        if (!M.c(class_23382, this.n.e()) && !this.C(class_23382, class_23502)) {
            return;
        }
        if (!((double)class_3532.method_15355((float)((float)k.W.field_1724.method_33571().method_1025(class_23382.method_46558()))) < this.h) && this.L != null) {
            return;
        }
        this.L = class_23382;
        this.r = class_23383;
        this.l = class_23502;
        this.h = class_3532.method_15355((float)((float)k.W.field_1724.method_33571().method_1025(class_23382.method_46558())));
        this.V = true;
        this.d.H();
    }

    private void U(class_2338 class_23382, class_2350 class_23502, class_2338 class_23383) {
        if ((double)this.F >= this.H.e()) {
            this.F = 0;
        }
        ++this.F;
        if (k.W.field_1687.method_22347(class_23382)) {
            if (M.d(class_23382)) {
                if ((double)this.F >= this.K.e() && (double)this.F <= this.B.e()) {
                    class_2350 class_23503 = M.x(class_23382);
                    if (class_23503 == null) {
                        return;
                    }
                    int n2 = k.W.field_1724.method_31548().field_7545;
                    dev.idhammai.c.r.q.A.P.v(class_23502);
                    int n3 = this.j(class_2665.class);
                    this.v(n3);
                    M.R(class_23382, false, this.R.h());
                    if (this.I.h()) {
                        this.v(n3);
                        dev.idhammai.P.A.L.e.t();
                    } else {
                        this.v(n2);
                    }
                    class_2338 class_23384 = class_23382.method_10093(class_23503);
                    class_2350 class_23504 = class_23503.method_10153();
                    if (this.A.h()) {
                        Frog.ROTATION.n(class_23384, class_23504);
                    }
                }
            } else {
                return;
            }
        }
        if ((double)this.F >= this.P.e() && (double)this.F <= this.E.e()) {
            this.Y(class_23382, class_23502, class_23383.method_10093(class_23502));
        }
        if ((double)this.F >= this.s.e() && (double)this.F <= this.Y.e()) {
            this.A(class_23383, class_23502);
        }
        if ((double)this.F >= this.f.e() && (double)this.F <= this.e.e()) {
            this.V(class_23383, class_23502);
        }
    }

    private void A(class_2338 class_23382, class_2350 class_23502) {
        if (!M.k(class_23382.method_10093(class_23502))) {
            return;
        }
        int n2 = this.w(class_1802.field_8301);
        if (n2 == -1) {
            return;
        }
        int n3 = k.W.field_1724.method_31548().field_7545;
        this.v(n2);
        M.E(class_23382.method_10093(class_23502), true);
        if (this.I.h()) {
            this.v(n2);
            dev.idhammai.P.A.L.e.t();
        } else {
            this.v(n3);
        }
    }

    private boolean C(class_2338 class_23382, class_2350 class_23502) {
        if (!(k.W.field_1687.method_8320(class_23382).method_26204() instanceof class_2665)) {
            return false;
        }
        if (((class_2350)k.W.field_1687.method_8320(class_23382).method_11654((class_2769)class_2318.field_10927)).method_10153() != class_23502) {
            return false;
        }
        return k.W.field_1687.method_22347(class_23382.method_10079(class_23502, -1)) || this.Q(class_23382.method_10079(class_23502, -1)) == class_2246.field_10036 || this.Q(class_23382.method_10093(class_23502.method_10153())) == class_2246.field_10008;
    }

    private void V(class_2338 class_23382, class_2350 class_23502) {
        if (!this.t.h()) {
            return;
        }
        int n2 = this.w(class_1802.field_8884);
        if (n2 == -1) {
            return;
        }
        int n3 = k.W.field_1724.method_31548().field_7545;
        int[] nArray = new int[]{0, class_23502.method_10165(), -class_23502.method_10165()};
        int[] nArray2 = new int[]{0, 1};
        int[] nArray3 = new int[]{0, class_23502.method_10148(), -class_23502.method_10148()};
        for (int n4 : nArray) {
            for (int n5 : nArray2) {
                for (int n6 : nArray3) {
                    if (this.Q(class_23382.method_10069(n4, n5, n6)) != class_2246.field_10036) continue;
                    return;
                }
            }
        }
        for (int n4 : nArray) {
            for (int n5 : nArray2) {
                for (int n6 : nArray3) {
                    if (!k.o(class_23382.method_10069(n4, n5, n6))) continue;
                    this.v(n2);
                    this.a(class_23382.method_10069(n4, n5, n6));
                    if (this.I.h()) {
                        this.v(n2);
                        dev.idhammai.P.A.L.e.t();
                    } else {
                        this.v(n3);
                    }
                    return;
                }
            }
        }
    }

    public void a(class_2338 class_23382) {
        class_2338 class_23383 = class_23382.method_10093(class_2350.field_11033);
        M.T(class_23383, class_2350.field_11036, this.A.h());
    }

    private void Y(class_2338 class_23382, class_2350 class_23502, class_2338 class_23383) {
        if (!k.W.field_1687.method_22347(class_23382.method_10079(class_23502, -1)) && this.Q(class_23382.method_10079(class_23502, -1)) != class_2246.field_10036 && this.Q(class_23382.method_10093(class_23502.method_10153())) != class_2246.field_10008) {
            return;
        }
        for (class_2350 class_2350Array : class_2350.values()) {
            if (this.Q(class_23382.method_10093(class_2350Array)) != class_2246.field_10002) continue;
            return;
        }
        int n2 = this.w(class_2246.field_10002);
        if (n2 == -1) {
            return;
        }
        int n3 = k.W.field_1724.method_31548().field_7545;
        class_2350 class_23503 = M.a(class_23382, class_23502);
        if (class_23503 != null && class_23503 != class_23502.method_10153() && M.c(class_23382.method_10093(class_23503), this.n.e()) && !class_23382.method_10093(class_23503).equals((Object)class_23383)) {
            this.v(n2);
            M.i(class_23382.method_10093(class_23503), this.A.h());
            if (this.I.h()) {
                this.v(n2);
                dev.idhammai.P.A.L.e.t();
            } else {
                this.v(n3);
            }
            return;
        }
        for (class_2350 class_23504 : class_2350.values()) {
            if (!M.c(class_23382.method_10093(class_23504), this.n.e()) || class_23382.method_10093(class_23504).equals((Object)class_23383) || class_23504 == class_23502.method_10153()) continue;
            this.v(n2);
            M.i(class_23382.method_10093(class_23504), this.A.h());
            if (this.I.h()) {
                this.v(n2);
                dev.idhammai.P.A.L.e.t();
            } else {
                this.v(n3);
            }
            return;
        }
    }

    private void v(int n2) {
        if (this.I.h()) {
            dev.idhammai.P.A.L.g.z(n2, k.W.field_1724.method_31548().field_7545);
        } else {
            dev.idhammai.P.A.L.g.j(n2);
        }
    }

    public int w(class_1792 class_17922) {
        if (this.I.h()) {
            return dev.idhammai.P.A.L.g.a(class_17922);
        }
        return dev.idhammai.P.A.L.g.E(class_17922);
    }

    public int w(class_2248 class_22482) {
        if (this.I.h()) {
            return dev.idhammai.P.A.L.g.H(class_22482);
        }
        return dev.idhammai.P.A.L.g.L(class_22482);
    }

    public int j(Class<?> clazz) {
        if (this.I.h()) {
            return dev.idhammai.P.A.L.g.J(clazz);
        }
        return dev.idhammai.P.A.L.g.K(clazz);
    }

    private class_2248 Q(class_2338 class_23382) {
        return k.W.field_1687.method_8320(class_23382).method_26204();
    }
}

