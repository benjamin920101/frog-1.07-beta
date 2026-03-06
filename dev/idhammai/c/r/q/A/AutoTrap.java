/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.ElytraItem
 *  net.minecraft.item.ItemStack
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.ConcretePowderBlock
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.math.MathHelper
 */
package dev.idhammai.c.r.q.A;

import dev.idhammai.Frog;
import dev.idhammai.P.A.A.h;
import dev.idhammai.P.A.A.p;
import dev.idhammai.P.A.L.e;
import dev.idhammai.P.A.L.g;
import dev.idhammai.P.A.Y.N;
import dev.idhammai.P.A.l.M;
import dev.idhammai.P.A.l.k;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.c.r.O.Y.B;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.q.A.b;
import dev.idhammai.c.r.q.A.j;
import dev.idhammai.c.r.q.Q.W;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import java.util.ArrayList;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ElytraItem;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Blocks;
import net.minecraft.block.ConcretePowderBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.MathHelper;

public class L
extends y {
    public static L J;
    public final l U = this.p(new l("Delay", 100, 0, 500).D("\u95f4\u9694").P("ms"));
    private final B<b> X = this.S(new B<b>("TargetMode", dev.idhammai.c.r.q.A.b.Single).I("\u76ee\u6807\u6a21\u5f0f").X(dev.idhammai.c.r.q.A.b.Single, "\u5355\u76ee\u6807").X(dev.idhammai.c.r.q.A.b.Multi, "\u591a\u76ee\u6807"));
    private final B<j> k = this.S(new B<j>("BlockForHead", dev.idhammai.c.r.q.A.j.Anchor).I("\u5934\u90e8\u65b9\u5757").X(dev.idhammai.c.r.q.A.j.Obsidian, "\u9ed1\u66dc\u77f3").X(dev.idhammai.c.r.q.A.j.Anchor, "\u91cd\u751f\u951a").X(dev.idhammai.c.r.q.A.j.Web, "\u86db\u7f51").X(dev.idhammai.c.r.q.A.j.Concrete, "\u6df7\u51dd\u571f"));
    final ArrayList<class_2338> c = new ArrayList();
    final ArrayList<class_2338> Z = new ArrayList();
    private final h g = new h();
    private final l P = this.p(new l("PlaceRange", 4.0, 1.0, 6.0).D("\u653e\u7f6e\u8303\u56f4").P("m"));
    private final l E = this.p(new l("BlocksPer", 1, 1, 8).D("\u6bcftick\u65b9\u5757"));
    public final l M = this.p(new l("PredictTicks", 2.0, 0.0, 50.0, 1.0).D("\u9884\u6d4btick"));
    private final dev.idhammai.c.r.O.Y.W r = this.S(new dev.idhammai.c.r.O.Y.W("Rotate", true).k("\u8f6c\u5411"));
    private final dev.idhammai.c.r.O.Y.W T = this.S(new dev.idhammai.c.r.O.Y.W("AutoDisable", true).k("\u81ea\u52a8\u5173\u95ed"));
    private final l w = this.p(new l("Range", 5.0, 1.0, 8.0).D("\u76ee\u6807\u8303\u56f4").P("m"));
    private final dev.idhammai.c.r.O.Y.W K = this.S(new dev.idhammai.c.r.O.Y.W("DetectMining", false).k("\u68c0\u6d4b\u6316\u6398"));
    private final dev.idhammai.c.r.O.Y.W l = this.S(new dev.idhammai.c.r.O.Y.W("Helper", true).k("\u8f85\u52a9\u653e\u7f6e"));
    private final dev.idhammai.c.r.O.Y.W h = this.S(new dev.idhammai.c.r.O.Y.W("InventorySwap", true).k("\u80cc\u5305\u5207\u6362"));
    private final dev.idhammai.c.r.O.Y.W u = this.S(new dev.idhammai.c.r.O.Y.W("OnlyCrawling", false).k("\u4ec5\u8db4\u4e0b"));
    private final dev.idhammai.c.r.O.Y.W L = this.S(new dev.idhammai.c.r.O.Y.W("CheckElytra", false).k("\u68c0\u6d4b\u9798\u7fc5"));
    private final dev.idhammai.c.r.O.Y.W d = this.S(new dev.idhammai.c.r.O.Y.W("Extend", true).k("\u6269\u5c55"));
    private final dev.idhammai.c.r.O.Y.W R = this.S(new dev.idhammai.c.r.O.Y.W("AntiStep", false).k("\u53cd\u8e29\u5934"));
    private final dev.idhammai.c.r.O.Y.W m = this.S(new dev.idhammai.c.r.O.Y.W("OnlyBreak", false, this.R::h).k("\u4ec5\u7834\u574f\u65f6"));
    private final dev.idhammai.c.r.O.Y.W p = this.S(new dev.idhammai.c.r.O.Y.W("Head", true).k("\u5934\u9876"));
    private final dev.idhammai.c.r.O.Y.W f = this.S(new dev.idhammai.c.r.O.Y.W("HeadExtend", true).k("\u5934\u9876\u6269\u5c55"));
    private final dev.idhammai.c.r.O.Y.W n = this.S(new dev.idhammai.c.r.O.Y.W("ChestUp", true).k("\u80f8\u53e3\u4e0a\u65b9"));
    private final dev.idhammai.c.r.O.Y.W A = this.S(new dev.idhammai.c.r.O.Y.W("OnlyBreaking", false, this.n::h).k("\u4ec5\u7834\u574f\u4e2d"));
    private final dev.idhammai.c.r.O.Y.W G = this.S(new dev.idhammai.c.r.O.Y.W("Chest", true).k("\u80f8\u53e3"));
    private final dev.idhammai.c.r.O.Y.W b = this.S(new dev.idhammai.c.r.O.Y.W("OnlyGround", false, this.G::h).k("\u4ec5\u5730\u9762"));
    private final dev.idhammai.c.r.O.Y.W Q = this.S(new dev.idhammai.c.r.O.Y.W("IgnoreCrawling", false, this.G::h).k("\u5ffd\u7565\u8db4\u4e0b"));
    private final dev.idhammai.c.r.O.Y.W Y = this.S(new dev.idhammai.c.r.O.Y.W("Legs", false).k("\u817f\u90e8"));
    private final dev.idhammai.c.r.O.Y.W j = this.S(new dev.idhammai.c.r.O.Y.W("LegAnchor", true).k("\u817f\u90e8\u951a"));
    private final dev.idhammai.c.r.O.Y.W y = this.S(new dev.idhammai.c.r.O.Y.W("Down", false).k("\u4e0b\u65b9"));
    private final dev.idhammai.c.r.O.Y.W H = this.S(new dev.idhammai.c.r.O.Y.W("OnlyHole", false).k("\u4ec5\u5751\u5185"));
    private final dev.idhammai.c.r.O.Y.W B = this.S(new dev.idhammai.c.r.O.Y.W("Break", true).k("\u6253\u6c34\u6676"));
    private final dev.idhammai.c.r.O.Y.W N = this.S(new dev.idhammai.c.r.O.Y.W("UsingPause", true).k("\u4f7f\u7528\u6682\u505c"));
    private final dev.idhammai.c.r.O.Y.W a = this.S(new dev.idhammai.c.r.O.Y.W("SelfGround", true).k("\u81ea\u8eab\u843d\u5730"));
    public class_1657 F;
    int s = 0;

    public L() {
        super("AutoTrap", dev.idhammai.c.r.w.Combat);
        this.L("\u81ea\u52a8\u56f0\u4f4f");
        J = this;
    }

    @r
    public void I(QO qO) {
        this.c.clear();
        this.Z.clear();
        this.s = 0;
        this.F = null;
        if (this.a.h() && !dev.idhammai.c.r.q.A.L.W.field_1724.method_24828()) {
            return;
        }
        if (this.h.h() && !e.n()) {
            return;
        }
        if (W.b.p() && W.b.m.h()) {
            return;
        }
        if (this.N.h() && dev.idhammai.c.r.q.A.L.W.field_1724.method_6115()) {
            return;
        }
        if (!this.g.m((long)this.U.e())) {
            return;
        }
        if (this.X.X() == dev.idhammai.c.r.q.A.b.Single) {
            this.F = dev.idhammai.P.A.Y.N.h(this.w.e());
            if (this.F == null) {
                if (this.T.h()) {
                    this.p();
                }
                return;
            }
            this.R(this.F);
        } else if (this.X.X() == dev.idhammai.c.r.q.A.b.Multi) {
            boolean bl = false;
            for (class_1657 class_16572 : dev.idhammai.P.A.Y.N.c(this.w.e())) {
                bl = true;
                this.F = class_16572;
                this.R(this.F);
            }
            if (!bl) {
                if (this.T.h()) {
                    this.p();
                }
                this.F = null;
            }
        }
    }

    private void R(class_1657 class_16572) {
        if (this.H.h() && !Frog.HOLE.D(e.Y((class_1297)class_16572))) {
            return;
        }
        if (this.u.h() && !class_16572.method_20448() && (!this.L.h() || !(((class_1799)class_16572.method_31548().field_7548.get(2)).method_7909() instanceof class_1770) || dev.idhammai.c.r.q.A.L.W.field_1724.method_23318() < class_16572.method_23318() + 1.0 && !class_16572.method_6128())) {
            return;
        }
        class_243 class_2432 = this.M.e() > 0.0 ? dev.idhammai.P.A.A.p.g(class_16572, this.M.V()) : class_16572.method_19538();
        this.e(class_16572, new k(class_2432.method_10216(), class_2432.method_10214(), class_2432.method_10215()));
    }

    private void e(class_1657 class_16572, class_2338 class_23382) {
        class_2338 class_23383;
        class_2338 class_23384;
        int n2;
        Object[] objectArray;
        int n3;
        if (class_23382 == null) {
            return;
        }
        if (this.c.contains(class_23382)) {
            return;
        }
        this.c.add(class_23382);
        int n4 = class_16572.method_20448() ? 1 : 2;
        int n5 = n3 = class_16572.method_20448() ? 0 : 1;
        if (this.Y.h()) {
            objectArray = class_2350.values();
            int n6 = objectArray.length;
            for (n2 = 0; n2 < n6; ++n2) {
                class_2350 class_23502 = objectArray[n2];
                if (class_23502 == class_2350.field_11033 || class_23502 == class_2350.field_11036) continue;
                class_2338 class_23385 = class_23382.method_10093(class_23502);
                this.i(class_23385, this.j.h(), false, false);
                if (dev.idhammai.P.A.l.M.x(class_23385) != null || !dev.idhammai.P.A.l.M.U(class_23385, this.B.h()) || this.T(class_23385) == null) continue;
                this.i(this.T(class_23385));
            }
        }
        if (this.f.h()) {
            Object[] objectArray2 = objectArray = (Object[])new int[]{1, 0, -1};
            n2 = objectArray2.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                class_2350 class_23503 = objectArray2[i2];
                class_23384 = objectArray;
                int n7 = ((class_2350[])class_23384).length;
                for (int i3 = 0; i3 < n7; ++i3) {
                    class_2350 class_23504 = class_23384[i3];
                    class_23383 = class_23382.method_10069((int)class_23504, 0, (int)class_23503);
                    if (!this.j(new class_2338((class_2382)class_23383))) continue;
                    this.i(class_23383.method_10086(n4), this.k.X() == dev.idhammai.c.r.q.A.j.Anchor, this.k.X() == dev.idhammai.c.r.q.A.j.Concrete, this.k.X() == dev.idhammai.c.r.q.A.j.Web);
                }
            }
        }
        if (this.p.h() && dev.idhammai.P.A.l.M.U(class_23382.method_10086(n4), this.B.h())) {
            if (dev.idhammai.P.A.l.M.x(class_23382.method_10086(n4)) == null) {
                boolean bl = this.l.h();
                if (this.T(class_23382.method_10086(n4)) != null) {
                    this.i(this.T(class_23382.method_10086(n4)));
                    bl = false;
                }
                if (bl) {
                    class_2350[] class_2350Array = class_2350.values();
                    int n8 = class_2350Array.length;
                    for (n2 = 0; n2 < n8; ++n2) {
                        class_2350 class_23505 = class_2350Array[n2];
                        if (class_23505 == class_2350.field_11033 || class_23505 == class_2350.field_11036) continue;
                        class_23384 = class_23382.method_10093(class_23505).method_10086(n3);
                        if (!dev.idhammai.P.A.l.M.t(class_23382.method_10093(class_23505).method_10084(), class_23505.method_10153()) || !dev.idhammai.P.A.l.M.U(class_23384.method_10086(n3), this.B.h()) || !dev.idhammai.P.A.l.M.A(class_23384, this.P.e(), this.B.h())) continue;
                        this.i(class_23384);
                        bl = false;
                        break;
                    }
                    if (bl) {
                        class_2350Array = class_2350.values();
                        n8 = class_2350Array.length;
                        for (n2 = 0; n2 < n8; ++n2) {
                            class_2350 class_23506 = class_2350Array[n2];
                            if (class_23506 == class_2350.field_11033 || class_23506 == class_2350.field_11036) continue;
                            class_23384 = class_23382.method_10093(class_23506).method_10086(n3);
                            if (!dev.idhammai.P.A.l.M.t(class_23382.method_10093(class_23506).method_10084(), class_23506.method_10153()) || !dev.idhammai.P.A.l.M.U(class_23384.method_10086(n3), this.B.h()) || dev.idhammai.P.A.l.M.x(class_23384) != null || !dev.idhammai.P.A.l.M.U(class_23384, this.B.h()) || this.T(class_23384) == null) continue;
                            this.i(this.T(class_23384));
                            bl = false;
                            break;
                        }
                        if (bl) {
                            class_2350Array = class_2350.values();
                            n8 = class_2350Array.length;
                            for (n2 = 0; n2 < n8; ++n2) {
                                class_2350 class_23507 = class_2350Array[n2];
                                if (class_23507 == class_2350.field_11033 || class_23507 == class_2350.field_11036) continue;
                                class_23384 = class_23382.method_10093(class_23507).method_10086(n3);
                                if (!dev.idhammai.P.A.l.M.t(class_23382.method_10093(class_23507).method_10084(), class_23507.method_10153()) || !dev.idhammai.P.A.l.M.U(class_23384.method_10086(n3), this.B.h()) || dev.idhammai.P.A.l.M.x(class_23384) != null || !dev.idhammai.P.A.l.M.U(class_23384, this.B.h()) || this.T(class_23384) == null || dev.idhammai.P.A.l.M.x(class_23384.method_10074()) != null || !dev.idhammai.P.A.l.M.U(class_23384.method_10074(), this.B.h()) || this.T(class_23384.method_10074()) == null) continue;
                                this.i(this.T(class_23384.method_10074()));
                                break;
                            }
                        }
                    }
                }
            }
            this.i(class_23382.method_10086(n4), this.k.X() == dev.idhammai.c.r.q.A.j.Anchor, this.k.X() == dev.idhammai.c.r.q.A.j.Concrete, this.k.X() == dev.idhammai.c.r.q.A.j.Web);
        }
        if (this.R.h() && (Frog.BREAK.X(class_23382.method_10086(n4)) || !this.m.h())) {
            if (dev.idhammai.P.A.l.M.x(class_23382.method_10086(3)) == null && dev.idhammai.P.A.l.M.U(class_23382.method_10086(3), this.B.h()) && this.p(class_23382.method_10086(3), class_2350.field_11033) != null) {
                this.i(this.T(class_23382.method_10086(3)));
            }
            this.i(class_23382.method_10086(3));
        }
        if (this.y.h()) {
            class_2338 class_23386 = class_23382.method_10074();
            this.i(class_23386);
            if (dev.idhammai.P.A.l.M.x(class_23386) == null && dev.idhammai.P.A.l.M.U(class_23386, this.B.h()) && this.T(class_23386) != null) {
                this.i(this.T(class_23386));
            }
        }
        if (this.n.h()) {
            for (class_2350 class_23508 : class_2350.values()) {
                if (class_23508 == class_2350.field_11033 || class_23508 == class_2350.field_11036) continue;
                class_2338 class_23387 = class_23382.method_10093(class_23508).method_10086(n4);
                if (this.A.h() && !Frog.BREAK.X(class_23382.method_10086(n4))) continue;
                this.i(class_23387);
                if (dev.idhammai.P.A.l.M.x(class_23387) != null || !dev.idhammai.P.A.l.M.U(class_23387, this.B.h())) continue;
                if (this.T(class_23387) != null) {
                    this.i(this.T(class_23387));
                    continue;
                }
                if (dev.idhammai.P.A.l.M.x(class_23387.method_10074()) != null || !dev.idhammai.P.A.l.M.U(class_23387.method_10074(), this.B.h()) || this.T(class_23387.method_10074()) == null) continue;
                this.i(this.T(class_23387.method_10074()));
            }
        }
        if (!(!this.G.h() || this.b.h() && !this.F.method_24828() || this.Q.h() && this.F.method_20448())) {
            for (class_2350 class_23509 : class_2350.values()) {
                if (class_23509 == class_2350.field_11033 || class_23509 == class_2350.field_11036) continue;
                class_2338 class_23388 = class_23382.method_10093(class_23509).method_10086(n3);
                this.i(class_23388);
                if (dev.idhammai.P.A.l.M.x(class_23388) != null || !dev.idhammai.P.A.l.M.U(class_23388, this.B.h())) continue;
                if (this.T(class_23388) != null) {
                    this.i(this.T(class_23388));
                    continue;
                }
                if (dev.idhammai.P.A.l.M.x(class_23388.method_10074()) != null || !dev.idhammai.P.A.l.M.U(class_23388.method_10074(), this.B.h()) || this.T(class_23388.method_10074()) == null) continue;
                this.i(this.T(class_23388.method_10074()));
            }
        }
        if (this.d.h()) {
            for (int n9 : new int[]{1, 0, -1}) {
                for (int i3 : new int[]{1, 0, -1}) {
                    class_23383 = class_23382.method_10069(n9, 0, i3);
                    if (!this.j(new class_2338((class_2382)class_23383))) continue;
                    this.e(class_16572, class_23383);
                }
            }
        }
    }

    @Override
    public String I() {
        if (this.F != null) {
            return this.F.method_5477().getString();
        }
        return null;
    }

    public class_2338 T(class_2338 class_23382) {
        if (!this.l.h()) {
            return null;
        }
        for (class_2350 class_23502 : class_2350.values()) {
            if (this.K.h() && Frog.BREAK.X(class_23382.method_10093(class_23502)) || !dev.idhammai.P.A.l.M.t(class_23382.method_10093(class_23502), class_23502.method_10153()) || !dev.idhammai.P.A.l.M.A(class_23382.method_10093(class_23502), this.P.e(), this.B.h())) continue;
            return class_23382.method_10093(class_23502);
        }
        return null;
    }

    public class_2338 p(class_2338 class_23382, class_2350 class_23502) {
        if (!this.l.h()) {
            return null;
        }
        for (class_2350 class_23503 : class_2350.values()) {
            if (class_23503 == class_23502 || this.K.h() && Frog.BREAK.X(class_23382.method_10093(class_23503)) || !dev.idhammai.P.A.l.M.t(class_23382.method_10093(class_23503), class_23503.method_10153()) || !dev.idhammai.P.A.l.M.A(class_23382.method_10093(class_23503), this.P.e(), this.B.h())) continue;
            return class_23382.method_10093(class_23503);
        }
        return null;
    }

    private boolean j(class_2338 class_23382) {
        if (dev.idhammai.c.r.q.A.L.W.field_1724.method_5829().method_994(new class_238(class_23382))) {
            return false;
        }
        for (class_1297 class_12972 : Frog.THREAD.v()) {
            if (!class_12972.method_5829().method_994(new class_238(class_23382)) || !class_12972.method_5805()) continue;
            return true;
        }
        return false;
    }

    private void i(class_2338 class_23382, boolean bl, boolean bl2, boolean bl3) {
        int n2;
        if (this.Z.contains(class_23382)) {
            return;
        }
        if (Frog.BREAK.X(class_23382)) {
            return;
        }
        if (!dev.idhammai.P.A.l.M.A(class_23382, 6.0, this.B.h())) {
            return;
        }
        if (!((double)this.s < this.E.e())) {
            return;
        }
        if ((double)class_3532.method_15355((float)((float)dev.idhammai.c.r.q.A.L.W.field_1724.method_33571().method_1025(class_23382.method_46558()))) > this.P.e()) {
            return;
        }
        int n3 = dev.idhammai.c.r.q.A.L.W.field_1724.method_31548().field_7545;
        if (bl2) {
            n2 = this.H();
        } else if (bl3) {
            n2 = this.x() != -1 ? this.x() : this.v();
        } else {
            int n4 = n2 = bl && this.L() != -1 ? this.L() : this.v();
        }
        if (n2 == -1) {
            return;
        }
        this.Z.add(class_23382);
        dev.idhammai.P.A.Y.N.r(class_23382, this.r.h(), this.N.h());
        this.e(n2);
        dev.idhammai.P.A.l.M.i(class_23382, this.r.h());
        if (this.h.h()) {
            this.e(n2);
            e.t();
        } else {
            this.e(n3);
        }
        this.g.H();
        ++this.s;
    }

    private void i(class_2338 class_23382) {
        if (class_23382 == null) {
            return;
        }
        if (this.Z.contains(class_23382)) {
            return;
        }
        if (Frog.BREAK.X(class_23382)) {
            return;
        }
        if (!dev.idhammai.P.A.l.M.A(class_23382, 6.0, this.B.h())) {
            return;
        }
        if (!((double)this.s < this.E.e())) {
            return;
        }
        if ((double)class_3532.method_15355((float)((float)dev.idhammai.c.r.q.A.L.W.field_1724.method_33571().method_1025(class_23382.method_46558()))) > this.P.e()) {
            return;
        }
        int n2 = dev.idhammai.c.r.q.A.L.W.field_1724.method_31548().field_7545;
        int n3 = this.v();
        if (n3 == -1) {
            return;
        }
        dev.idhammai.P.A.l.M.V.add(class_23382);
        this.Z.add(class_23382);
        dev.idhammai.P.A.Y.N.r(class_23382, this.r.h(), this.N.h());
        this.e(n3);
        dev.idhammai.P.A.l.M.i(class_23382, this.r.h());
        if (this.h.h()) {
            this.e(n3);
            e.t();
        } else {
            this.e(n2);
        }
        this.g.H();
        ++this.s;
    }

    private void e(int n2) {
        if (this.h.h()) {
            dev.idhammai.P.A.L.g.z(n2, dev.idhammai.c.r.q.A.L.W.field_1724.method_31548().field_7545);
        } else {
            dev.idhammai.P.A.L.g.j(n2);
        }
    }

    private int v() {
        if (this.h.h()) {
            return dev.idhammai.P.A.L.g.H(class_2246.field_10540);
        }
        return dev.idhammai.P.A.L.g.L(class_2246.field_10540);
    }

    private int H() {
        if (this.h.h()) {
            return dev.idhammai.P.A.L.g.J(class_2292.class);
        }
        return dev.idhammai.P.A.L.g.K(class_2292.class);
    }

    private int x() {
        if (this.h.h()) {
            return dev.idhammai.P.A.L.g.H(class_2246.field_10343);
        }
        return dev.idhammai.P.A.L.g.L(class_2246.field_10343);
    }

    private int L() {
        if (this.h.h()) {
            return dev.idhammai.P.A.L.g.H(class_2246.field_23152);
        }
        return dev.idhammai.P.A.L.g.L(class_2246.field_23152);
    }
}

