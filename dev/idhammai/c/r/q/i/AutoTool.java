/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.sound.SoundInstance
 *  net.minecraft.entity.projectile.FishingBobberEntity
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.enchantment.EnchantmentHelper
 *  net.minecraft.enchantment.Enchantments
 *  net.minecraft.block.AirBlock
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.hit.HitResult
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.registry.entry.RegistryEntry
 */
package dev.idhammai.c.r.q.i;

import dev.idhammai.P.A.A.A;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.P.r.c.t;
import dev.idhammai.asm.accessors.IMinecraftClient;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import java.awt.event.KeyEvent;
import net.minecraft.client.sound.SoundInstance;
import net.minecraft.entity.projectile.FishingBobberEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.block.AirBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.registry.entry.RegistryEntry;

public class m
extends y {
    private final W X = this.S(new W("Mine", true).k("\u81ea\u52a8\u5207\u5de5\u5177"));
    private final W J = this.S(new W("Fish", true).k("\u81ea\u52a8\u9493\u9c7c").D());
    private final W a = this.S(new W("AutoCast", true, this.J::f).k("\u81ea\u52a8\u629b\u7aff"));
    private final l s = this.p(new l("TicksAutoCast", 10, 0, 60, this.J::f).D("\u629b\u7aff\u5ef6\u8fdf"));
    private final l h = this.p(new l("TicksCatch", 6, 0, 60, this.J::f).D("\u6536\u7aff\u5ef6\u8fdf"));
    private final l H = this.p(new l("TicksThrow", 14, 0, 60, this.J::f).D("\u518d\u629b\u5ef6\u8fdf"));
    private final W p = this.S(new W("SplashDetection", false, this.J::f).k("\u6c34\u82b1\u68c0\u6d4b"));
    private final l P = this.p(new l("DetectionRange", 10, 0, 60, this.J::f).D("\u68c0\u6d4b\u8303\u56f4"));
    private boolean U;
    private int R;
    private int c;
    private int b;
    private boolean V;
    private int j;

    public m() {
        super("AutoTool", w.Player);
        this.L("\u81ea\u52a8\u5de5\u5177");
    }

    @r
    public void X(QO qO) {
        this.V();
        this.q();
    }

    public void q() {
        if (!this.X.h()) {
            return;
        }
        class_239 class_2392 = m.W.field_1765;
        if (!(class_2392 instanceof class_3965)) {
            return;
        }
        class_3965 class_39652 = (class_3965)class_2392;
        class_2338 class_23382 = class_39652.method_17777();
        if (m.W.field_1687.method_22347(class_23382)) {
            return;
        }
        int n2 = m.V(class_23382);
        if (n2 != -1 && m.W.field_1690.field_1886.method_1434()) {
            m.W.field_1724.method_31548().field_7545 = n2;
        }
    }

    @Override
    public void H() {
        this.U = false;
        this.V = false;
        this.j = 0;
    }

    @r
    private void W(t t2) {
        if (m.M()) {
            return;
        }
        if (!this.J.h()) {
            return;
        }
        class_1113 class_11132 = t2.L;
        class_1536 class_15362 = m.W.field_1724.field_7513;
        if (class_15362 == null) {
            return;
        }
        if (class_11132.method_4775().method_12832().equals("entity.fishing_bobber.splash") && (!this.p.h() || A.f(class_15362.method_23317(), class_15362.method_23318(), class_15362.method_23321(), class_11132.method_4784(), class_11132.method_4779(), class_11132.method_4778()) <= this.P.e())) {
            this.U = true;
            this.R = this.h.V();
            this.c = 0;
        }
    }

    public void V() {
        if (!this.J.h()) {
            return;
        }
        if (this.j <= 0) {
            this.j = 30;
            if (this.a.h() && !this.U && !this.V && m.W.field_1724.field_7513 == null && m.W.field_1724.method_6047().method_7909() == class_1802.field_8378) {
                this.b = 0;
                this.V = true;
            }
        } else {
            --this.j;
        }
        if (this.V) {
            ++this.b;
            if ((double)this.b > this.s.e()) {
                this.V = false;
                ((IMinecraftClient)W).invokeDoItemUse();
            }
        }
        if (this.U && this.R <= 0) {
            if (this.c == 0) {
                ((IMinecraftClient)W).invokeDoItemUse();
                this.R = this.H.V();
                this.c = 1;
            } else if (this.c == 1) {
                ((IMinecraftClient)W).invokeDoItemUse();
                this.U = false;
            }
        }
        --this.R;
    }

    @r
    private void R(KeyEvent keyEvent) {
        if (m.W.field_1690.field_1904.method_1434()) {
            this.U = false;
        }
    }

    public static int V(class_2338 class_23382) {
        int n2 = -1;
        float f2 = 1.0f;
        for (int i2 = 0; i2 < 9; ++i2) {
            class_1799 class_17992 = m.W.field_1724.method_31548().method_5438(i2);
            if (class_17992 == class_1799.field_8037) continue;
            float f3 = class_1890.method_8225((class_6880)((class_6880)m.W.field_1687.method_30349().method_30530(class_1893.field_9131.method_58273()).method_40264(class_1893.field_9131).get()), (class_1799)class_17992);
            float f4 = class_17992.method_7924(m.W.field_1687.method_8320(class_23382));
            if (m.W.field_1687.method_8320(class_23382).method_26204() instanceof class_2189) {
                return -1;
            }
            if (!(f3 + f4 > f2)) continue;
            f2 = f3 + f4;
            n2 = i2;
        }
        return n2;
    }
}

