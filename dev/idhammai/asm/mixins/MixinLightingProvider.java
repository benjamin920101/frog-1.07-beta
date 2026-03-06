/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.world.chunk.light.LightingProvider
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package dev.idhammai.asm.mixins;

import dev.idhammai.c.r.q.n.N;
import net.minecraft.util.math.BlockPos;
import net.minecraft.client.MinecraftClient;
import net.minecraft.world.chunk.light.LightingProvider;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_3568.class})
public class MixinLightingProvider {
    private boolean shouldBlockLightUpdates() {
        if (N.Q == null) {
            return false;
        }
        if (!N.Q.p() || !N.Q.n.h()) {
            return false;
        }
        class_310 class_3102 = class_310.method_1551();
        return class_3102 != null && class_3102.method_18854();
    }

    @Inject(at={@At(value="HEAD")}, method={"checkBlock"}, cancellable=true)
    public void checkBlock(class_2338 class_23382, CallbackInfo callbackInfo) {
        if (this.shouldBlockLightUpdates()) {
            callbackInfo.cancel();
        }
    }

    @Inject(at={@At(value="HEAD")}, method={"doLightUpdates"}, cancellable=true)
    public void doLightUpdates(CallbackInfoReturnable<Integer> callbackInfoReturnable) {
        if (this.shouldBlockLightUpdates()) {
            callbackInfoReturnable.setReturnValue((Object)0);
            callbackInfoReturnable.cancel();
        }
    }
}

