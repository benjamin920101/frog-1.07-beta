/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.render.DimensionEffects
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package dev.idhammai.asm.mixins;

import dev.idhammai.c.r.q.n.J;
import java.awt.Color;
import net.minecraft.client.render.DimensionEffects;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_5294.class})
public class MixinDimensionEffects {
    @Inject(method={"getFogColorOverride"}, at={@At(value="HEAD")}, cancellable=true)
    private void hookGetFogColorOverride(float f2, float f3, CallbackInfoReturnable<float[]> callbackInfoReturnable) {
        if (J.d.p() && J.d.s.i) {
            Color color = J.d.s.P();
            callbackInfoReturnable.setReturnValue((Object)new float[]{(float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, 1.0f});
        }
    }
}

