/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.pipeline.BlockRenderer
 *  net.minecraft.client.render.model.BakedModel
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.block.BlockState
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.At$Shift
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package dev.idhammai.asm.mixins.sodium;

import dev.idhammai.c.r.q.n.U;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.pipeline.BlockRenderer;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={BlockRenderer.class})
public abstract class SodiumBlockRendererMixin {
    @Inject(method={"renderModel"}, at={@At(value="INVOKE", target="Lnet/caffeinemc/mods/sodium/client/model/color/ColorProviderRegistry;getColorProvider(Lnet/minecraft/block/Block;)Lnet/caffeinemc/mods/sodium/client/model/color/ColorProvider;", shift=At.Shift.AFTER)}, cancellable=true)
    private void onRenderModel(class_1087 class_10872, class_2680 class_26802, class_2338 class_23382, class_2338 class_23383, CallbackInfo callbackInfo) {
        if (U.M(class_26802)) {
            callbackInfo.cancel();
        }
    }
}

