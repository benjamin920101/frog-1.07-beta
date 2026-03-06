/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.render.model.BakedModel
 *  net.minecraft.item.ItemStack
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.client.render.VertexConsumer
 *  net.minecraft.client.render.VertexConsumerProvider
 *  net.minecraft.client.render.model.json.ModelTransformationMode
 *  net.minecraft.client.render.item.ItemRenderer
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyVariable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package dev.idhammai.asm.mixins;

import dev.idhammai.P.A.S.X;
import dev.idhammai.c.r.q.n.N;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.item.ItemStack;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.render.item.ItemRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_918.class})
public class MixinItemRenderer {
    @Unique
    private final X flattenedModel = new X();
    @Unique
    private class_811 renderMode;

    @Inject(method={"renderItem*"}, at={@At(value="HEAD")})
    private void getRenderType(class_1799 class_17992, class_811 class_8112, boolean bl, class_4587 class_45872, class_4597 class_45972, int n2, int n3, class_1087 class_10872, CallbackInfo callbackInfo) {
        this.renderMode = class_8112;
    }

    @ModifyVariable(method={"renderBakedItemModel"}, at=@At(value="HEAD"), index=1, argsOnly=true, require=0)
    private class_1087 replaceItemModelClass(class_1087 class_10872, class_1087 class_10873, class_1799 class_17992, int n2, int n3, class_4587 class_45872, class_4588 class_45882) {
        if (N.Q.p() && N.Q.A.h() && !N.Q.w.h() && !class_17992.method_7960() && !class_10872.method_4712() && this.renderMode == class_811.field_4318) {
            this.flattenedModel.t(class_10872);
            return this.flattenedModel;
        }
        return class_10872;
    }
}

