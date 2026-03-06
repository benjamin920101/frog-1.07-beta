/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.ItemEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.block.entity.BlockEntity
 *  net.minecraft.block.entity.ChestBlockEntity
 *  net.minecraft.block.entity.EnderChestBlockEntity
 *  net.minecraft.block.entity.ShulkerBoxBlockEntity
 *  net.minecraft.client.util.math.MatrixStack
 */
package dev.idhammai.c.r.q.n;

import dev.idhammai.Frog;
import dev.idhammai.P.A.S.K;
import dev.idhammai.P.A.l.M;
import dev.idhammai.c.r.O.Y.A;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import java.awt.Color;
import java.util.ArrayList;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.block.entity.EnderChestBlockEntity;
import net.minecraft.block.entity.ShulkerBoxBlockEntity;
import net.minecraft.client.util.math.MatrixStack;

public class W
extends y {
    private final A F = this.y(new A("Item", new Color(255, 255, 255, 100)).P("\u6389\u843d\u7269").t(true));
    private final A n = this.y(new A("Player", new Color(255, 255, 255, 100)).P("\u73a9\u5bb6").t(true));
    private final A b = this.y(new A("Chest", new Color(255, 255, 255, 100)).P("\u7bb1\u5b50").t(false));
    private final A R = this.y(new A("EnderChest", new Color(255, 100, 255, 100)).P("\u672b\u5f71\u7bb1").t(false));
    private final A T = this.y(new A("ShulkerBox", new Color(15, 255, 255, 100)).P("\u6f5c\u5f71\u76d2").t(false));

    public W() {
        super("Tracers", w.Render);
        this.L("\u8ffd\u8e2a\u8005");
    }

    @Override
    public void h(class_4587 class_45872) {
        class_1297 class_129722;
        W.W.field_1690.method_42448().method_41748((Object)false);
        if (this.F.i || this.n.i) {
            for (class_1297 class_129722 : Frog.THREAD.z()) {
                if (class_129722 instanceof class_1542 && this.F.i) {
                    this.X(class_129722.method_19538(), this.F.P());
                    continue;
                }
                if (!(class_129722 instanceof class_1657) || !this.n.i || class_129722 == W.W.field_1724) continue;
                this.X(class_129722.method_19538(), this.n.P());
            }
        }
        ArrayList<class_2586> arrayList = M.p();
        class_129722 = arrayList.iterator();
        while (class_129722.hasNext()) {
            class_2586 class_25862 = (class_2586)class_129722.next();
            if (class_25862 instanceof class_2595 && this.b.i) {
                this.X(class_25862.method_11016().method_46558(), this.b.P());
                continue;
            }
            if (class_25862 instanceof class_2611 && this.R.i) {
                this.X(class_25862.method_11016().method_46558(), this.R.P());
                continue;
            }
            if (!(class_25862 instanceof class_2627) || !this.T.i) continue;
            this.X(class_25862.method_11016().method_46558(), this.T.P());
        }
    }

    private void X(class_243 class_2432, Color color) {
        K.I(class_2432, W.W.field_1773.method_19418().method_19326().method_1019(class_243.method_1030((float)W.W.field_1724.method_5695(W.method_60646().method_60637(true)), (float)W.W.field_1724.method_5705(W.method_60646().method_60637(true))).method_1021(0.2)), color);
    }
}

