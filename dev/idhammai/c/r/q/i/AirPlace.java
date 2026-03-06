/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.BlockItem
 *  net.minecraft.block.Blocks
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.hit.HitResult
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.client.util.math.MatrixStack
 */
package dev.idhammai.c.r.q.i;

import dev.idhammai.P.A.S.K;
import dev.idhammai.P.A.l.M;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.c.r.O.Y.A;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import java.awt.Color;
import net.minecraft.item.BlockItem;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.Box;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.client.util.math.MatrixStack;

public class Z
extends y {
    public static Z y;
    public final W l = this.S(new W("Module", true).k("\u542f\u7528\u529f\u80fd"));
    public final W U = this.S(new W("GrimBypass", false).k("Grim\u7ed5\u8fc7"));
    public final W n = this.S(new W("Crosshair", true).k("\u51c6\u661f\u653e\u7f6e").D());
    private final l e = this.p(new l("Range", 5.0, 0.0, 6.0, this.n::f).D("\u8303\u56f4"));
    private final A k = this.y(new A("Fill", new Color(255, 0, 0, 50), this.n::f).P("\u586b\u5145\u989c\u8272").t(true));
    private final A b = this.y(new A("Box", new Color(255, 0, 0, 100), this.n::f).P("\u8fb9\u6846\u989c\u8272").t(true));
    private class_3965 V;
    private int Z;

    public Z() {
        super("AirPlace", w.Player);
        this.L("\u7a7a\u6c14\u653e\u7f6e");
        y = this;
    }

    @r
    public void g(QO qO) {
        if (this.n.h()) {
            class_3965 class_39652;
            class_239 class_2392;
            if (this.Z > 0) {
                --this.Z;
            }
            class_3965 class_39653 = this.V = (class_2392 = W.method_1560().method_5745(this.e.e(), 0.0f, false)) instanceof class_3965 ? (class_39652 = (class_3965)class_2392) : null;
            if (this.V == null || !dev.idhammai.c.r.q.i.Z.W.field_1687.method_8320(this.V.method_17777()).method_26204().equals(class_2246.field_10124) || !(dev.idhammai.c.r.q.i.Z.W.field_1724.method_6047().method_7909() instanceof class_1747)) {
                return;
            }
            boolean bl = dev.idhammai.c.r.q.i.Z.W.field_1724.method_6047().method_7909() instanceof class_1747;
            if (dev.idhammai.c.r.q.i.Z.W.field_1690.field_1904.method_1434() && bl && this.Z <= 0) {
                M.V(this.V.method_17777(), false);
                this.Z = 2;
            }
        }
    }

    @Override
    public void h(class_4587 class_45872) {
        if (this.n.h()) {
            if (this.V == null || !dev.idhammai.c.r.q.i.Z.W.field_1687.method_8320(this.V.method_17777()).method_26204().equals(class_2246.field_10124) || !(dev.idhammai.c.r.q.i.Z.W.field_1724.method_6047().method_7909() instanceof class_1747)) {
                return;
            }
            K.W(class_45872, new class_238(this.V.method_17777()), this.k.P(), this.b.P(), this.b.i, this.k.i);
        }
    }
}

