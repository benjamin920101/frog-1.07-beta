/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.screen.slot.SlotActionType
 *  net.minecraft.item.ItemStack
 */
package dev.idhammai.c.r.q.i;

import dev.idhammai.P.A.A.h;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.c.r.O.Y.B;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.q.i.A;
import dev.idhammai.c.r.q.i.R;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.item.ItemStack;

public class k
extends y {
    private final B<A> H = this.S(new B<A>("Mode", A.QuickMove).I("\u6a21\u5f0f").X(A.QuickMove, "\u5feb\u901f\u79fb\u52a8").X(A.ClickSlot, "\u70b9\u51fb\u69fd\u4f4d"));
    private final l N = this.p(new l("Delay", 2.0, 0.0, 5.0, 0.01).D("\u8865\u5145\u5ef6\u8fdf").P("s"));
    private final l l = this.p(new l("Min", 50, 1, 100).D("\u6700\u5c0f\u9608\u503c")).P("%");
    private final l Y = this.p(new l("ForceDelay", 0.2, 0.0, 4.0, 0.01).D("\u5f3a\u5236\u5ef6\u8fdf").P("s"));
    private final l L = this.p(new l("ForceMin", 16, 1, 100).D("\u5f3a\u5236\u9608\u503c")).P("%");
    private final h e = new h();

    public k() {
        super("Replenish", w.Player);
        this.L("\u7269\u54c1\u680f\u8865\u5145");
    }

    @r
    public void V(QO qO) {
        for (int i2 = 0; i2 < 9; ++i2) {
            if (!this.H(i2)) continue;
            this.e.H();
            return;
        }
    }

    private boolean H(int n2) {
        class_1799 class_17992 = k.W.field_1724.method_31548().method_5438(n2);
        if (class_17992.method_7960()) {
            return false;
        }
        if (!class_17992.method_7946()) {
            return false;
        }
        int n3 = (int)((double)class_17992.method_7947() / (double)class_17992.method_7914() * 100.0);
        if ((double)n3 > this.l.e()) {
            return false;
        }
        for (int i2 = 9; i2 < 36; ++i2) {
            class_1799 class_17993 = k.W.field_1724.method_31548().method_5438(i2);
            if (class_17993.method_7960() || !R.M(class_17992, class_17993)) continue;
            if ((float)n3 > this.L.Z() ? !this.e.r(this.N.e()) : !this.e.r(this.Y.e())) {
                return false;
            }
            switch (this.H.X().ordinal()) {
                case 0: {
                    k.W.field_1761.method_2906(k.W.field_1724.field_7498.field_7763, i2, 0, class_1713.field_7794, (class_1657)k.W.field_1724);
                    break;
                }
                case 1: {
                    k.W.field_1761.method_2906(k.W.field_1724.field_7498.field_7763, i2, 0, class_1713.field_7790, (class_1657)k.W.field_1724);
                    k.W.field_1761.method_2906(k.W.field_1724.field_7498.field_7763, n2 + 36, 0, class_1713.field_7790, (class_1657)k.W.field_1724);
                    k.W.field_1761.method_2906(k.W.field_1724.field_7498.field_7763, i2, 0, class_1713.field_7790, (class_1657)k.W.field_1724);
                }
            }
            return true;
        }
        return false;
    }
}

