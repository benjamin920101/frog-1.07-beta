/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.BlockItem
 *  net.minecraft.item.ItemStack
 *  net.minecraft.block.ShulkerBoxBlock
 *  net.minecraft.client.font.TextRenderer
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.util.math.MatrixStack
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package dev.idhammai.asm.mixins;

import dev.idhammai.c.r.q.x.D;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.math.MatrixStack;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_332.class})
public class MixinDrawContext {
    @Unique
    private static final class_1799[] ITEMS = new class_1799[27];
    @Final
    @Shadow
    private class_4587 field_44657;

    @Inject(method={"drawItemInSlot(Lnet/minecraft/client/font/TextRenderer;Lnet/minecraft/item/ItemStack;IILjava/lang/String;)V"}, at={@At(value="TAIL")})
    public void onDrawItem(class_327 class_3272, class_1799 class_17992, int n2, int n3, String string, CallbackInfo callbackInfo) {
        if (D.M.p() && D.M.Y.h() && class_17992.method_7909() instanceof class_1747 && ((class_1747)class_17992.method_7909()).method_7711() instanceof class_2480) {
            D.P(class_17992, ITEMS);
            for (class_1799 class_17993 : ITEMS) {
                if (class_17993.method_7960()) continue;
                this.field_44657.method_22903();
                this.field_44657.method_22905(0.5f, 0.5f, 1.0f);
                this.method_51427(class_17993, n2 * 2 + 20, n3 * 2 + 20);
                this.field_44657.method_22909();
                return;
            }
        }
    }

    @Shadow
    public void method_51427(class_1799 class_17992, int n2, int n3) {
    }
}

