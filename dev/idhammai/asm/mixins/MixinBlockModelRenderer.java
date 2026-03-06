/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.render.model.BakedModel
 *  net.minecraft.world.BlockRenderView
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.block.BlockState
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.client.render.VertexConsumer
 *  net.minecraft.util.math.random.Random
 *  net.minecraft.client.render.block.BlockModelRenderer
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package dev.idhammai.asm.mixins;

import dev.idhammai.c.r.q.n.U;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.world.BlockRenderView;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.BlockState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.util.math.random.Random;
import net.minecraft.client.render.block.BlockModelRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_778.class})
public abstract class MixinBlockModelRenderer {
    @Inject(method={"renderSmooth", "renderFlat"}, at={@At(value="HEAD")}, cancellable=true)
    private void onRenderSmooth(class_1920 class_19202, class_1087 class_10872, class_2680 class_26802, class_2338 class_23382, class_4587 class_45872, class_4588 class_45882, boolean bl, class_5819 class_58192, long l2, int n2, CallbackInfo callbackInfo) {
        if (U.M(class_26802)) {
            callbackInfo.cancel();
        }
    }
}

