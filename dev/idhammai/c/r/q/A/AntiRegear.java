/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.block.ShulkerBoxBlock
 *  net.minecraft.block.entity.BlockEntity
 *  net.minecraft.block.entity.ShulkerBoxBlockEntity
 *  net.minecraft.util.math.MathHelper
 */
package dev.idhammai.c.r.q.A;

import dev.idhammai.P.A.l.M;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.P;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.q.A.n;
import dev.idhammai.c.r.q.i.a;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.ShulkerBoxBlockEntity;
import net.minecraft.util.math.MathHelper;

public class Q
extends y {
    public static Q X;
    public final List<class_2338> m = new ArrayList<class_2338>();
    private final l b = this.p(new l("SafeRange", 2.0, 0.0, 8.0, 0.1).D("\u5b89\u5168\u8303\u56f4"));
    private final l B = this.p(new l("Range", 5.0, 0.0, 8.0, 0.1).D("\u68c0\u6d4b\u8303\u56f4"));
    private final W E = this.S(new W("CheckSelf", true).k("\u68c0\u67e5\u81ea\u5df1"));

    public Q() {
        super("AntiRegear", w.Combat);
        this.L("\u53cd\u8865\u7ed9");
        X = this;
    }

    @r
    public void J(QO qO) {
        if (a.q() != null && Q.W.field_1687.method_8320(a.q()).method_26204() instanceof class_2480) {
            return;
        }
        this.m.removeIf(Q::lambda$onUpdate$0);
        if (this.S() != null) {
            a.D5.d(this.S().method_11016());
        }
    }

    @r
    public void D(P p2) {
        if (p2.A instanceof class_2480) {
            this.m.add(p2.C);
        }
    }

    private class_2627 S() {
        for (class_2586 class_25862 : M.p()) {
            class_2627 class_26272;
            if (!(class_25862 instanceof class_2627) || (double)class_3532.method_15355((float)((float)Q.W.field_1724.method_5707((class_26272 = (class_2627)class_25862).method_11016().method_46558()))) <= this.b.e() || this.E.h() && (this.m.contains(class_26272.method_11016()) || class_26272.method_11016().equals((Object)n.G.C) && !n.G.N.m(100L)) || !((double)class_3532.method_15355((float)((float)Q.W.field_1724.method_5707(class_26272.method_11016().method_46558()))) <= this.B.e())) continue;
            return class_26272;
        }
        return null;
    }

    private static boolean lambda$onUpdate$0(class_2338 class_23382) {
        return !(Q.W.field_1687.method_8320(class_23382).method_26204() instanceof class_2480);
    }
}

