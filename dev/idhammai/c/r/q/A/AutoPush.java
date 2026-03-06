/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.Block
 *  net.minecraft.block.FacingBlock
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.block.PistonBlock
 *  net.minecraft.block.BlockState
 *  net.minecraft.state.property.Property
 */
package dev.idhammai.c.r.q.A;

import dev.idhammai.Frog;
import dev.idhammai.P.A.A.A;
import dev.idhammai.P.A.A.h;
import dev.idhammai.P.A.L.e;
import dev.idhammai.P.A.L.g;
import dev.idhammai.P.A.Y.N;
import dev.idhammai.P.A.l.M;
import dev.idhammai.P.A.l.k;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.q.A.i;
import dev.idhammai.c.r.q.N.I;
import dev.idhammai.c.r.q.Q.W;
import dev.idhammai.c.r.q.i.a;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import dev.idhammai.p.J.G;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.block.FacingBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.block.PistonBlock;
import net.minecraft.block.BlockState;
import net.minecraft.state.property.Property;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class P
extends y {
    public static P Z;
    private final dev.idhammai.c.r.O.Y.W J = this.S(new dev.idhammai.c.r.O.Y.W("Torch", false).k("\u706b\u628a"));
    private final dev.idhammai.c.r.O.Y.W l = this.S(new dev.idhammai.c.r.O.Y.W("Rotation", true).k("\u8f6c\u5411"));
    private final dev.idhammai.c.r.O.Y.W m = this.S(new dev.idhammai.c.r.O.Y.W("YawDeceive", true).k("\u504f\u822a\u6b3a\u9a97"));
    private final dev.idhammai.c.r.O.Y.W Q = this.S(new dev.idhammai.c.r.O.Y.W("PistonPacket", false).k("\u6d3b\u585e\u53d1\u5305"));
    private final dev.idhammai.c.r.O.Y.W U = this.S(new dev.idhammai.c.r.O.Y.W("PowerPacket", true).k("\u4f9b\u80fd\u53d1\u5305"));
    private final dev.idhammai.c.r.O.Y.W F = this.S(new dev.idhammai.c.r.O.Y.W("EatingPause", true).k("\u8fdb\u98df\u6682\u505c"));
    private final dev.idhammai.c.r.O.Y.W a = this.S(new dev.idhammai.c.r.O.Y.W("Mine", true).k("\u6316\u6398"));
    private final dev.idhammai.c.r.O.Y.W b = this.S(new dev.idhammai.c.r.O.Y.W("AllowWeb", true).k("\u5141\u8bb8\u86db\u7f51"));
    private final l A = this.p(new l("Delay", 100, 0, 1000).D("\u95f4\u9694"));
    private final dev.idhammai.c.r.O.Y.W p = this.S(new dev.idhammai.c.r.O.Y.W("SelfGround", true).k("\u81ea\u8eab\u843d\u5730"));
    private final dev.idhammai.c.r.O.Y.W y = this.S(new dev.idhammai.c.r.O.Y.W("OnlyGround", false).k("\u4ec5\u5730\u9762"));
    private final dev.idhammai.c.r.O.Y.W H = this.S(new dev.idhammai.c.r.O.Y.W("AutoDisable", true).k("\u81ea\u52a8\u5173\u95ed"));
    private final l L = this.p(new l("Range", 5.0, 0.0, 6.0).D("\u76ee\u6807\u8303\u56f4"));
    private final l G = this.p(new l("PlaceRange", 5.0, 0.0, 6.0).D("\u653e\u7f6e\u8303\u56f4"));
    private final l N = this.p(new l("SurroundCheck", 2, 0, 4).D("\u5305\u56f4\u68c0\u67e5"));
    private final dev.idhammai.c.r.O.Y.W Y = this.S(new dev.idhammai.c.r.O.Y.W("InventorySwap", true).k("\u80cc\u5305\u5207\u6362"));
    private final h R = new h();

    public P() {
        super("AutoPush", w.Combat);
        this.L("\u6d3b\u585e\u63a8\u4eba");
        Z = this;
    }

    public static void v(class_2350 class_23502) {
        if (class_23502 == class_2350.field_11034) {
            Frog.ROTATION.o(-90.0f, 5.0f);
        } else if (class_23502 == class_2350.field_11039) {
            Frog.ROTATION.o(90.0f, 5.0f);
        } else if (class_23502 == class_2350.field_11043) {
            Frog.ROTATION.o(180.0f, 5.0f);
        } else if (class_23502 == class_2350.field_11035) {
            Frog.ROTATION.o(0.0f, 5.0f);
        }
    }

    @Override
    public void H() {
        i.X6.XP.H();
    }

    boolean G(class_2338 class_23382, class_1297 class_12972) {
        return new class_238(class_23382).method_994(class_12972.method_5829());
    }

    @r
    public void N(QO qO) {
        if (!this.R.S(this.A.e())) {
            return;
        }
        if (this.p.h() && !P.W.field_1724.method_24828()) {
            return;
        }
        if (this.L(this.U()) == -1 || this.B(class_2665.class) == -1) {
            if (this.H.h()) {
                this.p();
            }
            return;
        }
        if (this.F.h() && P.W.field_1724.method_6115()) {
            return;
        }
        if (W.b.p() && W.b.m.h()) {
            return;
        }
        for (class_1657 class_16572 : dev.idhammai.P.A.Y.N.c(this.L.e())) {
            class_2338 class_23382;
            k k2;
            float f2;
            int n2;
            if (!this.C(class_16572).booleanValue()) continue;
            float[] fArray = new float[]{-0.25f, 0.0f, 0.25f};
            for (float f3 : fArray) {
                float[] fArray2 = fArray;
                int n3 = fArray2.length;
                for (n2 = 0; n2 < n3; ++n2) {
                    f2 = fArray2[n2];
                    k2 = new k(class_16572.method_23317() + (double)f3, class_16572.method_23318() + 0.5, class_16572.method_23321() + (double)f2);
                    for (class_2350 class_23502 : class_2350.values()) {
                        if (class_23502 == class_2350.field_11036 || class_23502 == class_2350.field_11033 || !this.G(class_23382 = k2.method_10093(class_23502), (class_1297)class_16572) || !P.W.field_1687.method_39454((class_1297)class_16572, new class_238(class_23382))) continue;
                        if (this.g(k2.method_10093(class_23502.method_10153()), class_23502)) {
                            this.R.H();
                            return;
                        }
                        if (!this.g(k2.method_10093(class_23502.method_10153()).method_10084(), class_23502)) continue;
                        this.R.H();
                        return;
                    }
                }
            }
            if (!P.W.field_1687.method_39454((class_1297)class_16572, new class_238((class_2338)new k(class_16572.method_23317(), class_16572.method_23318() + 2.5, class_16572.method_23321())))) {
                for (class_2350 class_23503 : class_2350.values()) {
                    if (class_23503 == class_2350.field_11036 || class_23503 == class_2350.field_11033) continue;
                    class_2338 class_23383 = e.Y((class_1297)class_16572).method_10093(class_23503);
                    class_238 class_2383 = class_16572.method_5829().method_997(new class_243((double)class_23503.method_10148(), (double)class_23503.method_10164(), (double)class_23503.method_10165()));
                    if (this.W(class_23383.method_10084()) == class_2246.field_10379 || P.W.field_1687.method_39454((class_1297)class_16572, class_2383.method_989(0.0, 1.0, 0.0)) || this.G(class_23383, (class_1297)class_16572)) continue;
                    if (this.g(e.Y((class_1297)class_16572).method_10093(class_23503.method_10153()).method_10084(), class_23503)) {
                        this.R.H();
                        return;
                    }
                    if (!this.g(e.Y((class_1297)class_16572).method_10093(class_23503.method_10153()), class_23503)) continue;
                    this.R.H();
                    return;
                }
            }
            for (float f4 : fArray) {
                float[] fArray3 = fArray;
                int n4 = fArray3.length;
                for (n2 = 0; n2 < n4; ++n2) {
                    f2 = fArray3[n2];
                    k2 = new k(class_16572.method_23317() + (double)f4, class_16572.method_23318() + 0.5, class_16572.method_23321() + (double)f2);
                    for (class_2350 class_23502 : class_2350.values()) {
                        if (class_23502 == class_2350.field_11036 || class_23502 == class_2350.field_11033 || !this.G(class_23382 = k2.method_10093(class_23502), (class_1297)class_16572)) continue;
                        if (this.g(k2.method_10093(class_23502.method_10153()).method_10084(), class_23502)) {
                            this.R.H();
                            return;
                        }
                        if (!this.g(k2.method_10093(class_23502.method_10153()), class_23502)) continue;
                        this.R.H();
                        return;
                    }
                }
            }
        }
    }

    private boolean g(class_2338 class_23382, class_2350 class_23502) {
        class_2680 class_26802;
        if (!P.W.field_1687.method_22347(class_23382.method_10093(class_23502))) {
            return false;
        }
        if (this.P(class_23382, class_23502) && this.W(class_23382) && M.U(class_23382, false)) {
            boolean bl = false;
            if (M.H(class_23382, this.G.e()) != null) {
                dev.idhammai.P.A.Y.N.y = class_23382;
                dev.idhammai.P.A.Y.N.Z = class_2246.field_10560.method_9564();
                for (class_2350 class_23503 : class_2350.values()) {
                    if (this.W(class_23382.method_10093(class_23503)) != this.U()) continue;
                    bl = true;
                    break;
                }
                for (class_2350 class_23503 : class_2350.values()) {
                    if (bl) break;
                    if (!M.c(class_23382.method_10093(class_23503), this.G.e())) continue;
                    bl = true;
                }
                dev.idhammai.P.A.Y.N.y = null;
                if (bl) {
                    class_2350 class_23503;
                    var7_11 = this.B(class_2665.class);
                    class_23503 = M.x(class_23382);
                    if (class_23503 != null) {
                        if (this.l.h()) {
                            Frog.ROTATION.n(class_23382.method_10093(class_23503), class_23503.method_10153());
                        }
                        if (this.m.h()) {
                            P.v(class_23502.method_10153());
                        }
                        int n2 = P.W.field_1724.method_31548().field_7545;
                        this.R(var7_11);
                        M.R(class_23382, false, this.Q.h());
                        if (this.Y.h()) {
                            this.R(var7_11);
                            e.t();
                        } else {
                            this.R(n2);
                        }
                        if (this.l.h() && this.m.h()) {
                            Frog.ROTATION.n(class_23382.method_10093(class_23503), class_23503.method_10153());
                        }
                        if (this.l.h()) {
                            Frog.ROTATION.M();
                        }
                        for (class_2350 class_23504 : class_2350.values()) {
                            if (this.W(class_23382.method_10093(class_23504)) != this.U()) continue;
                            if (this.a.h()) {
                                dev.idhammai.c.r.q.i.a.D5.d(class_23382.method_10093(class_23504));
                            }
                            if (this.H.h()) {
                                this.p();
                            }
                            return true;
                        }
                        for (class_2350 class_23504 : class_2350.values()) {
                            if (class_23504 == class_2350.field_11036 && this.J.h() || !M.c(class_23382.method_10093(class_23504), this.G.e())) continue;
                            int n3 = P.W.field_1724.method_31548().field_7545;
                            int n4 = this.L(this.U());
                            this.R(n4);
                            M.R(class_23382.method_10093(class_23504), this.l.h(), this.U.h());
                            if (this.Y.h()) {
                                this.R(n4);
                                e.t();
                            } else {
                                this.R(n3);
                            }
                            if (this.a.h()) {
                                dev.idhammai.c.r.q.i.a.D5.d(class_23382.method_10093(class_23504));
                            }
                            return true;
                        }
                        return true;
                    }
                }
            } else {
                class_2350 class_23505 = null;
                for (class_2350 class_23506 : class_2350.values()) {
                    if (class_23506 == class_2350.field_11036 && this.J.h()) continue;
                    if (class_23505 != null) break;
                    dev.idhammai.P.A.Y.N.y = class_23382.method_10093(class_23506);
                    dev.idhammai.P.A.Y.N.Z = this.U().method_9564();
                    if (M.x(class_23382) != null) {
                        class_23505 = class_23506;
                    }
                    dev.idhammai.P.A.Y.N.y = null;
                    if (class_23505 == null || M.d(class_23382.method_10093(class_23505))) continue;
                    class_23505 = null;
                }
                if (class_23505 != null) {
                    class_2350 class_23506;
                    int n5 = P.W.field_1724.method_31548().field_7545;
                    var7_11 = this.L(this.U());
                    this.R(var7_11);
                    M.R(class_23382.method_10093(class_23505), this.l.h(), this.U.h());
                    if (this.Y.h()) {
                        this.R(var7_11);
                        e.t();
                    } else {
                        this.R(n5);
                    }
                    dev.idhammai.P.A.Y.N.y = class_23382.method_10093(class_23505);
                    dev.idhammai.P.A.Y.N.Z = this.U().method_9564();
                    int n6 = this.B(class_2665.class);
                    class_23506 = M.x(class_23382);
                    if (class_23506 != null) {
                        if (this.l.h()) {
                            Frog.ROTATION.n(class_23382.method_10093(class_23506), class_23506.method_10153());
                        }
                        if (this.m.h()) {
                            P.v(class_23502.method_10153());
                        }
                        int n7 = P.W.field_1724.method_31548().field_7545;
                        this.R(n6);
                        M.R(class_23382, false, this.Q.h());
                        if (this.Y.h()) {
                            this.R(n6);
                            e.t();
                        } else {
                            this.R(n7);
                        }
                        if (this.l.h() && this.m.h()) {
                            Frog.ROTATION.n(class_23382.method_10093(class_23506), class_23506.method_10153());
                        }
                        if (this.l.h()) {
                            Frog.ROTATION.M();
                        }
                    }
                    dev.idhammai.P.A.Y.N.y = null;
                    return true;
                }
            }
        }
        if ((class_26802 = P.W.field_1687.method_8320(class_23382)).method_26204() instanceof class_2665 && this.v(class_23382).method_11654((class_2769)class_2318.field_10927) == class_23502) {
            for (class_2350 class_23507 : class_2350.values()) {
                if (this.W(class_23382.method_10093(class_23507)) != this.U()) continue;
                if (this.H.h()) {
                    this.p();
                    return true;
                }
                return false;
            }
            for (class_2350 class_23508 : class_2350.values()) {
                if (class_23508 == class_2350.field_11036 && this.J.h() || !M.c(class_23382.method_10093(class_23508), this.G.e())) continue;
                int n8 = P.W.field_1724.method_31548().field_7545;
                int n9 = this.L(this.U());
                this.R(n9);
                M.R(class_23382.method_10093(class_23508), this.l.h(), this.U.h());
                if (this.Y.h()) {
                    this.R(n9);
                    e.t();
                } else {
                    this.R(n8);
                }
                return true;
            }
        }
        return false;
    }

    private boolean W(class_2338 class_23382) {
        if (I.Q.s.h()) {
            class_2350 class_23502 = dev.idhammai.P.A.A.A.T(class_23382, (class_1309)P.W.field_1724);
            return class_23502 != class_2350.field_11036 && class_23502 != class_2350.field_11033;
        }
        return true;
    }

    private boolean P(class_2338 class_23382, class_2350 class_23502) {
        if (this.m.h()) {
            return true;
        }
        class_2350 class_23503 = M.x(class_23382);
        if (class_23503 == null) {
            return false;
        }
        class_243 class_2432 = new class_243((double)class_23382.method_10263() + 0.5 + (double)class_23503.method_10163().method_10263() * 0.5, (double)class_23382.method_10264() + 0.5 + (double)class_23503.method_10163().method_10264() * 0.5, (double)class_23382.method_10260() + 0.5 + (double)class_23503.method_10163().method_10260() * 0.5);
        float[] fArray = dev.idhammai.p.J.G.X(class_2432);
        return dev.idhammai.P.A.A.A.e(fArray[0], fArray[1]).method_10153() == class_23502;
    }

    private void R(int n2) {
        if (this.Y.h()) {
            g.z(n2, P.W.field_1724.method_31548().field_7545);
        } else {
            g.j(n2);
        }
    }

    public int L(class_2248 class_22482) {
        if (this.Y.h()) {
            return g.H(class_22482);
        }
        return g.L(class_22482);
    }

    public int B(Class<?> clazz) {
        if (this.Y.h()) {
            return g.J(clazz);
        }
        return g.K(clazz);
    }

    private Boolean C(class_1657 class_16572) {
        if (this.y.h() && !class_16572.method_24828()) {
            return false;
        }
        if (!this.b.h() && Frog.PLAYER.n(class_16572)) {
            return false;
        }
        float[] fArray = new float[]{-0.25f, 0.0f, 0.25f};
        int n2 = 0;
        if (P.W.field_1687.method_39454((class_1297)class_16572, new class_238((class_2338)new k(class_16572.method_23317() + 1.0, class_16572.method_23318() + 0.5, class_16572.method_23321())))) {
            ++n2;
        }
        if (P.W.field_1687.method_39454((class_1297)class_16572, new class_238((class_2338)new k(class_16572.method_23317() - 1.0, class_16572.method_23318() + 0.5, class_16572.method_23321())))) {
            ++n2;
        }
        if (P.W.field_1687.method_39454((class_1297)class_16572, new class_238((class_2338)new k(class_16572.method_23317(), class_16572.method_23318() + 0.5, class_16572.method_23321() + 1.0)))) {
            ++n2;
        }
        if (P.W.field_1687.method_39454((class_1297)class_16572, new class_238((class_2338)new k(class_16572.method_23317(), class_16572.method_23318() + 0.5, class_16572.method_23321() - 1.0)))) {
            ++n2;
        }
        for (float f4 : fArray) {
            for (float f2 : fArray) {
                k k2 = new k(class_16572.method_23317() + (double)f4, class_16572.method_23318() + 0.5, class_16572.method_23321() + (double)f2);
                for (class_2350 class_23502 : class_2350.values()) {
                    class_2338 class_23382;
                    if (class_23502 == class_2350.field_11036 || class_23502 == class_2350.field_11033 || !this.G(class_23382 = k2.method_10093(class_23502), (class_1297)class_16572)) continue;
                    if (P.W.field_1687.method_39454((class_1297)class_16572, new class_238(class_23382))) {
                        return true;
                    }
                    if (!((double)n2 > this.N.e() - 1.0)) continue;
                    return true;
                }
            }
        }
        if (!P.W.field_1687.method_39454((class_1297)class_16572, new class_238((class_2338)new k(class_16572.method_23317(), class_16572.method_23318() + 2.5, class_16572.method_23321())))) {
            for (class_2350 class_23503 : class_2350.values()) {
                if (class_23503 == class_2350.field_11036 || class_23503 == class_2350.field_11033) continue;
                class_2338 class_23383 = e.Y((class_1297)class_16572).method_10093(class_23503);
                class_238 class_2383 = class_16572.method_5829().method_997(new class_243((double)class_23503.method_10148(), (double)class_23503.method_10164(), (double)class_23503.method_10165()));
                if (this.W(class_23383.method_10084()) == class_2246.field_10379 || P.W.field_1687.method_39454((class_1297)class_16572, class_2383.method_989(0.0, 1.0, 0.0)) || this.G(class_23383, (class_1297)class_16572) || !P.W.field_1687.method_39454((class_1297)class_16572, new class_238((class_2338)new k(class_16572.method_23317(), class_16572.method_23318() + 0.5, class_16572.method_23321())))) continue;
                return true;
            }
        }
        return (double)n2 > this.N.e() - 1.0 || Frog.HOLE.O(new k(class_16572.method_23317(), class_16572.method_23318() + 0.5, class_16572.method_23321()));
    }

    private class_2248 W(class_2338 class_23382) {
        return P.W.field_1687.method_8320(class_23382).method_26204();
    }

    private class_2248 U() {
        if (this.J.h()) {
            return class_2246.field_10523;
        }
        return class_2246.field_10002;
    }

    private class_2680 v(class_2338 class_23382) {
        return P.W.field_1687.method_8320(class_23382);
    }
}

