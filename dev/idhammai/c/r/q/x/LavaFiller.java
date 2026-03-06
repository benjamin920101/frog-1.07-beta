/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Blocks
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.fluid.LavaFluid$Still
 */
package dev.idhammai.c.r.q.x;

import dev.idhammai.Frog;
import dev.idhammai.P.A.A.h;
import dev.idhammai.P.A.L.e;
import dev.idhammai.P.A.L.g;
import dev.idhammai.P.A.l.M;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.fluid.LavaFluid;

public class u
extends y {
    public final l B = this.p(new l("PlaceDelay", 50, 0, 500).D("\u653e\u7f6e\u5ef6\u8fdf").P("ms"));
    private final W f = this.S(new W("InventorySwap", true).k("\u80cc\u5305\u5207\u6362"));
    private final l F = this.p(new l("Range", 5.0, 0.0, 8.0, 0.1).D("\u8303\u56f4"));
    private final l M = this.p(new l("BlocksPer", 1, 1, 8).D("\u6bcf\u6b21\u653e\u7f6e"));
    private final W U = this.S(new W("DetectMining", false).k("\u68c0\u6d4b\u6316\u6398"));
    private final W s = this.S(new W("UsingPause", true).k("\u4f7f\u7528\u6682\u505c"));
    private final W m = this.S(new W("Rotate", true).k("\u8f6c\u5411"));
    private final W a = this.S(new W("PacketPlace", true).k("\u53d1\u5305\u653e\u7f6e"));
    private final h j = new h();
    int I = 0;

    public u() {
        super("LavaFiller", w.Misc);
        this.L("\u81ea\u52a8\u586b\u5ca9\u6d46");
    }

    @r
    public void t(QO qO) {
        if (!this.j.m((long)this.B.e())) {
            return;
        }
        if (this.f.h() && !e.n()) {
            return;
        }
        this.I = 0;
        if (this.H() == -1) {
            return;
        }
        if (this.s.h() && u.W.field_1724.method_6115()) {
            return;
        }
        for (class_2338 class_23382 : dev.idhammai.P.A.l.M.I(this.F.Z())) {
            if (u.W.field_1687.method_8320(class_23382).method_26204() != class_2246.field_10164 || !(u.W.field_1687.method_8320(class_23382).method_26227().method_15772() instanceof class_3616.class_3618)) continue;
            this.A(class_23382);
        }
    }

    private void A(class_2338 class_23382) {
        if (class_23382 == null) {
            return;
        }
        if (this.U.h() && Frog.BREAK.X(class_23382)) {
            return;
        }
        if (!((double)this.I < this.M.e())) {
            return;
        }
        int n2 = this.H();
        if (n2 == -1) {
            return;
        }
        if (!dev.idhammai.P.A.l.M.A(class_23382, this.F.e(), false)) {
            return;
        }
        int n3 = u.W.field_1724.method_31548().field_7545;
        this.o(n2);
        dev.idhammai.P.A.l.M.R(class_23382, this.m.h(), this.a.h());
        if (this.f.h()) {
            this.o(n2);
            e.t();
        } else {
            this.o(n3);
        }
        ++this.I;
        this.j.H();
    }

    private void o(int n2) {
        if (this.f.h()) {
            g.z(n2, u.W.field_1724.method_31548().field_7545);
        } else {
            g.j(n2);
        }
    }

    private int H() {
        if (this.f.h()) {
            return g.H(class_2246.field_10540);
        }
        return g.L(class_2246.field_10540);
    }
}

