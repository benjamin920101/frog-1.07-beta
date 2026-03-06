/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.inventory.Inventory
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.screen.GenericContainerScreenHandler
 *  net.minecraft.item.ItemStack
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.EnderChestBlock
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.collection.DefaultedList
 *  net.minecraft.util.math.Box
 *  net.minecraft.client.gui.screen.Screen
 *  net.minecraft.client.gui.screen.ingame.GenericContainerScreen
 *  net.minecraft.entity.attribute.EntityAttributes
 */
package dev.idhammai.p.J;

import dev.idhammai.Frog;
import dev.idhammai.P.A.J;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.b;
import dev.idhammai.P.r.c.f;
import dev.idhammai.c.r.y;
import dev.idhammai.p.J.k;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import net.minecraft.inventory.Inventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Blocks;
import net.minecraft.block.EnderChestBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.Box;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.GenericContainerScreen;
import net.minecraft.entity.attribute.EntityAttributes;

public class F
implements J {
    public static class_437 S;
    public final class_2371<class_1799> L = class_2371.method_10213((int)27, (Object)class_1799.field_8037);
    public final Map<class_1657, k> m = new ConcurrentHashMap<class_1657, k>();
    public final CopyOnWriteArrayList<class_1657> U = new CopyOnWriteArrayList();
    public boolean r = false;
    private int y;

    public F() {
        Frog.EVENT_BUS.S(this);
    }

    @r
    public void R(dev.idhammai.P.r.c.k k2) {
        this.U.clear();
        this.m.clear();
        this.L.clear();
        this.r = false;
    }

    @r
    private void V(f f2) {
        if (f2.O.method_26204() instanceof class_2336 && this.y == 0) {
            this.y = 1;
        }
    }

    @r
    private void p(b b2) {
        if (this.y == 1 && b2.q instanceof class_476) {
            this.y = 2;
            return;
        }
        if (this.y == 0) {
            return;
        }
        if (!(F.W.field_1755 instanceof class_476)) {
            return;
        }
        class_1707 class_17072 = (class_1707)((class_476)F.W.field_1755).method_17577();
        if (class_17072 == null) {
            return;
        }
        class_1263 class_12632 = class_17072.method_7629();
        for (int i2 = 0; i2 < 27; ++i2) {
            this.L.set(i2, (Object)class_12632.method_5438(i2));
        }
        this.r = true;
        this.y = 0;
    }

    public void y() {
        if (dev.idhammai.c.r.y.M()) {
            return;
        }
        if (S != null && F.W.field_1755 == null) {
            W.method_1507(S);
            S = null;
        }
        this.U.clear();
        for (class_1657 class_16572 : Frog.THREAD.v()) {
            this.m.put(class_16572, new k(class_16572.method_6096(), class_16572.method_45325(class_5134.field_23725)));
            this.t(class_16572);
        }
    }

    public boolean n(class_1657 class_16572) {
        return this.U.contains(class_16572);
    }

    private void t(class_1657 class_16572) {
        for (float f2 : new float[]{0.0f, 0.3f, -0.3f}) {
            for (float f3 : new float[]{0.0f, 0.3f, -0.3f}) {
                for (int n2 : new int[]{-1, 0, 1, 2}) {
                    class_2338 class_23382 = new dev.idhammai.P.A.l.k(class_16572.method_23317() + (double)f2, class_16572.method_23318(), class_16572.method_23321() + (double)f3).method_10086(n2);
                    if (!new class_238(class_23382).method_994(class_16572.method_5829()) || F.W.field_1687.method_8320(class_23382).method_26204() != class_2246.field_10343) continue;
                    this.U.add(class_16572);
                    return;
                }
            }
        }
    }
}

