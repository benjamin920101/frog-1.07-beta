/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.render.model.BakedModel
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.ItemEntity
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.client.render.VertexConsumerProvider
 *  net.minecraft.client.render.OverlayTexture
 *  net.minecraft.client.render.entity.EntityRendererFactory$Context
 *  net.minecraft.util.math.random.Random
 *  net.minecraft.client.render.model.json.ModelTransformationMode
 *  net.minecraft.client.render.entity.EntityRenderer
 *  net.minecraft.client.render.entity.ItemEntityRenderer
 *  net.minecraft.client.render.item.ItemRenderer
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package dev.idhammai.asm.mixins;

import dev.idhammai.c.r.q.n.N;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.math.random.Random;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.ItemEntityRenderer;
import net.minecraft.client.render.item.ItemRenderer;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_916.class})
public abstract class MixinItemEntityRenderer
extends class_897<class_1542> {
    @Final
    @Shadow
    private class_918 field_4726;
    @Final
    @Shadow
    private class_5819 field_4725;

    protected MixinItemEntityRenderer(class_5617.class_5618 class_56182) {
        super(class_56182);
    }

    @Unique
    private static int getRenderedAmount(class_1799 class_17992) {
        int n2 = class_17992.method_7947();
        if (n2 <= 1) {
            return 1;
        }
        if (n2 <= 16) {
            return 2;
        }
        if (n2 <= 32) {
            return 3;
        }
        return n2 <= 48 ? 4 : 5;
    }

    @Inject(method={"render*"}, at={@At(value="HEAD")}, cancellable=true)
    public void render(class_1542 class_15422, float f2, float f3, class_4587 class_45872, class_4597 class_45972, int n2, CallbackInfo callbackInfo) {
        float f4;
        float f5;
        if (!N.Q.p() || !N.Q.A.h()) {
            return;
        }
        class_45872.method_22903();
        class_1799 class_17992 = class_15422.method_6983();
        long l2 = class_17992.method_7960() ? 187L : (long)(class_1792.method_7880((class_1792)class_17992.method_7909()) + class_17992.method_7919());
        this.field_4725.method_43052(l2);
        class_1087 class_10872 = this.field_4726.method_4019(class_17992, class_15422.method_37908(), null, class_15422.method_5628());
        boolean bl = class_10872.method_4712();
        this.field_4673 = N.Q.V.h() ? 0.15f : 0.0f;
        float f6 = class_3532.method_15374((float)(((float)class_15422.method_6985() + f3) / 10.0f + class_15422.field_7203)) * 0.1f + 0.1f;
        float f7 = class_10872.method_4709().method_3503((class_811)class_811.field_4318).field_4285.y();
        class_45872.method_46416(0.0f, f6 + 0.25f * f7, 0.0f);
        class_45872.method_22907(this.field_4676.method_24197());
        float f8 = class_10872.method_4709().field_4303.field_4285.x();
        float f9 = class_10872.method_4709().field_4303.field_4285.y();
        float f10 = class_10872.method_4709().field_4303.field_4285.z();
        int n3 = MixinItemEntityRenderer.getRenderedAmount(class_17992);
        if (!bl) {
            float f11 = -0.0f * (float)(n3 - 1) * 0.5f * f8;
            f5 = -0.0f * (float)(n3 - 1) * 0.5f * f9;
            f4 = -0.09375f * (float)(n3 - 1) * 0.5f * f10;
            class_45872.method_46416(f11, f5, f4);
        }
        for (int i2 = 0; i2 < n3; ++i2) {
            class_45872.method_22903();
            if (i2 > 0) {
                if (bl) {
                    f5 = (this.field_4725.method_43057() * 2.0f - 1.0f) * 0.15f;
                    f4 = (this.field_4725.method_43057() * 2.0f - 1.0f) * 0.15f;
                    float f12 = (this.field_4725.method_43057() * 2.0f - 1.0f) * 0.15f;
                    class_45872.method_46416(f5, f4, f12);
                } else {
                    f5 = (this.field_4725.method_43057() * 2.0f - 1.0f) * 0.15f * 0.5f;
                    f4 = (this.field_4725.method_43057() * 2.0f - 1.0f) * 0.15f * 0.5f;
                    class_45872.method_46416(f5, f4, 0.0f);
                }
            }
            this.field_4726.method_23179(class_17992, class_811.field_4318, false, class_45872, class_45972, n2, class_4608.field_21444, class_10872);
            class_45872.method_22909();
            if (bl) continue;
            class_45872.method_46416(0.0f * f8, 0.0f * f9, 0.0425f * f10);
        }
        class_45872.method_22909();
        super.method_3936((class_1297)class_15422, f2, f3, class_45872, class_45972, n2);
        callbackInfo.cancel();
    }
}

