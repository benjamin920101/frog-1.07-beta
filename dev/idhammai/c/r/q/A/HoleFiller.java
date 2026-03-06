/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.block.Blocks
 *  net.minecraft.util.math.BlockPos
 */
package dev.idhammai.c.r.q.A;

import dev.idhammai.Frog;
import dev.idhammai.P.A.A.h;
import dev.idhammai.P.A.A.p;
import dev.idhammai.P.A.L.e;
import dev.idhammai.P.A.L.g;
import dev.idhammai.P.A.Y.N;
import dev.idhammai.P.A.l.M;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import java.util.stream.Stream;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;

public class x
extends y {
    public static x J;
    public final l C = this.p(new l("PlaceDelay", 50, 0, 500).D("\u653e\u7f6e\u5ef6\u8fdf").P("ms"));
    public final W g = this.S(new W("InAirPause", true).k("\u7a7a\u4e2d\u6682\u505c"));
    private final h c = new h();
    private final l h = this.p(new l("BlocksPer", 1, 1, 8).D("\u6bcftick\u65b9\u5757"));
    private final l k = this.p(new l("PlaceRange", 5.0, 0.0, 8.0).D("\u653e\u7f6e\u8303\u56f4").P("m"));
    private final l M = this.p(new l("EnemyRange", 6.0, 0.0, 8.0).D("\u654c\u4eba\u8303\u56f4").P("m"));
    private final l F = this.p(new l("HoleRange", 2.0, 0.0, 8.0).D("\u5751\u4f4d\u8303\u56f4").P("m"));
    private final l d = this.p(new l("SelfRange", 2.0, 0.0, 8.0).D("\u81ea\u8eab\u4fdd\u62a4\u8303\u56f4").P("m"));
    private final l G = this.p(new l("Predict", 1, 1, 8).D("\u9884\u6d4btick").P("tick"));
    private final W V = this.S(new W("DetectMining", false).k("\u68c0\u6d4b\u6316\u6398"));
    private final W f = this.S(new W("Rotate", true).k("\u8f6c\u5411"));
    private final W e = this.S(new W("PacketPlace", true).k("\u53d1\u5305\u653e\u7f6e"));
    private final W n = this.S(new W("Break", true).k("\u6253\u6c34\u6676").D());
    private final W m = this.S(new W("EatingPause", true, this.n::f).k("\u8fdb\u98df\u6682\u505c"));
    private final W T = this.S(new W("UsingPause", true).k("\u4f7f\u7528\u6682\u505c"));
    private final W K = this.S(new W("InventorySwap", true).k("\u80cc\u5305\u5207\u6362"));
    private final W y = this.S(new W("Web", true).k("\u4f18\u5148\u86db\u7f51"));
    int D = 0;

    public x() {
        super("HoleFiller", w.Combat);
        this.L("\u81ea\u52a8\u586b\u5751");
        J = this;
    }

    @r
    public void U(QO qO) {
        if (!this.c.m((long)this.C.e())) {
            return;
        }
        if (this.K.h() && !dev.idhammai.P.A.L.e.n()) {
            return;
        }
        this.D = 0;
        if (this.S() == -1) {
            return;
        }
        if (dev.idhammai.c.r.q.Q.W.b.p() && dev.idhammai.c.r.q.Q.W.b.m.h()) {
            return;
        }
        if (this.T.h() && x.W.field_1724.method_6115()) {
            return;
        }
        if (this.g.h() && !x.W.field_1724.method_24828()) {
            return;
        }
        N.c(this.M.e()).stream().flatMap(this::lambda$onUpdate$0).filter(this::lambda$onUpdate$1).distinct().forEach(this::Q);
    }

    private void Q(class_2338 class_23382) {
        if (class_23382 == null) {
            return;
        }
        if (this.V.h() && Frog.BREAK.X(class_23382)) {
            return;
        }
        if (!((double)this.D < this.h.e())) {
            return;
        }
        int n2 = this.S();
        if (n2 == -1) {
            return;
        }
        if (!dev.idhammai.P.A.l.M.A(class_23382, this.k.e(), true)) {
            return;
        }
        if (this.n.h()) {
            N.r(class_23382, this.f.h(), this.m.h());
        } else if (dev.idhammai.P.A.l.M.r(class_23382, false)) {
            return;
        }
        int n3 = x.W.field_1724.method_31548().field_7545;
        this.d(n2);
        dev.idhammai.P.A.l.M.R(class_23382, this.f.h(), this.e.h());
        if (this.K.h()) {
            this.d(n2);
            dev.idhammai.P.A.L.e.t();
        } else {
            this.d(n3);
        }
        ++this.D;
        this.c.H();
    }

    private void d(int n2) {
        if (this.K.h()) {
            dev.idhammai.P.A.L.g.z(n2, x.W.field_1724.method_31548().field_7545);
        } else {
            dev.idhammai.P.A.L.g.j(n2);
        }
    }

    private int S() {
        if (this.K.h()) {
            if (this.y.h() && dev.idhammai.P.A.L.g.H(class_2246.field_10343) != -1) {
                return dev.idhammai.P.A.L.g.H(class_2246.field_10343);
            }
            return dev.idhammai.P.A.L.g.H(class_2246.field_10540);
        }
        if (this.y.h() && dev.idhammai.P.A.L.g.L(class_2246.field_10343) != -1) {
            return dev.idhammai.P.A.L.g.L(class_2246.field_10343);
        }
        return dev.idhammai.P.A.L.g.L(class_2246.field_10540);
    }

    private boolean lambda$onUpdate$1(class_2338 class_23382) {
        return class_23382.method_46558().method_1022(x.W.field_1724.method_19538()) > this.d.e() && (Frog.HOLE.v(class_23382, true, true, false) || Frog.HOLE.N(class_23382));
    }

    private Stream lambda$onUpdate$0(class_1657 class_16572) {
        return dev.idhammai.P.A.l.M.U(this.F.Z(), p.g(class_16572, this.G.V())).stream();
    }
}

