/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Blocks
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket$Action
 */
package dev.idhammai.c.r.q.x;

import dev.idhammai.Frog;
import dev.idhammai.P.A.l.M;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.q.i.a;
import dev.idhammai.c.r.q.n.h;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;

public class q
extends y {
    private final l Z = this.p(new l("Range", 4.0, 0.0, 8.0, 0.1).D("\u8303\u56f4"));
    private final W n = this.S(new W("Down", false).k("\u4f18\u5148\u5411\u4e0b"));
    private final W L = this.S(new W("Sand", false).k("\u6c99\u5b50\u6a21\u5f0f"));
    private final l y = this.p(new l("Breaks", 10, 0, 20, this.L::h).D("\u6bcf\u6b21\u7834\u574f"));

    public q() {
        super("Nuker", w.Misc);
        this.L("\u8303\u56f4\u6316\u6398");
    }

    @r
    public void m(QO qO) {
        if (a.q() != null && !q.W.field_1687.method_22347(a.q())) {
            return;
        }
        if (this.L.h()) {
            if (!q.W.field_1724.method_24828()) {
                return;
            }
            int n2 = 0;
            for (class_2338 class_23382 : M.U(this.Z.Z(), q.W.field_1724.method_33571())) {
                class_2350 class_23502;
                if (class_2246.field_10102 != q.W.field_1687.method_8320(class_23382).method_26204() && class_2246.field_10534 != q.W.field_1687.method_8320(class_23382).method_26204() || (class_23502 = M.S(class_23382)) == null) continue;
                h.k.H(class_23382);
                Frog.ROTATION.G(class_23382.method_46558());
                q.n(arg_0 -> q.lambda$onUpdate$0(class_23382, class_23502, arg_0));
                q.n(arg_0 -> q.lambda$onUpdate$1(class_23382, class_23502, arg_0));
                q.n(arg_0 -> q.lambda$onUpdate$2(class_23382, class_23502, arg_0));
                Frog.ROTATION.M();
                if (!((double)(++n2) >= this.y.e())) continue;
                return;
            }
        } else {
            class_2338 class_23383 = this.U();
            if (class_23383 != null) {
                a.D5.d(class_23383);
            }
        }
    }

    private class_2338 U() {
        class_2338 class_23382 = null;
        for (class_2338 class_23383 : M.U(this.Z.Z(), q.W.field_1724.method_33571())) {
            if (q.W.field_1687.method_22347(class_23383) || a.e(class_23383) || M.S(class_23383) == null) continue;
            if ((double)class_23383.method_10264() < q.W.field_1724.method_23318()) {
                if (class_23382 != null || !this.n.h()) continue;
                class_23382 = class_23383;
                continue;
            }
            return class_23383;
        }
        return class_23382;
    }

    private static class_2596 lambda$onUpdate$2(class_2338 class_23382, class_2350 class_23502, int n2) {
        return new class_2846(class_2846.class_2847.field_12973, class_23382, class_23502, n2);
    }

    private static class_2596 lambda$onUpdate$1(class_2338 class_23382, class_2350 class_23502, int n2) {
        return new class_2846(class_2846.class_2847.field_12968, class_23382, class_23502, n2);
    }

    private static class_2596 lambda$onUpdate$0(class_2338 class_23382, class_2350 class_23502, int n2) {
        return new class_2846(class_2846.class_2847.field_12973, class_23382, class_23502, n2);
    }
}

