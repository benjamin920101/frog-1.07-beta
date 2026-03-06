/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_4763
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package dev.idhammai.asm.mixins;

import dev.idhammai.c.r.q.n.J;
import java.awt.Color;
import net.minecraft.class_4763;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_4763.class})
public class MixinBiomeEffects {
    @Inject(method={"getSkyColor"}, at={@At(value="HEAD")}, cancellable=true)
    private void hookGetSkyColor(CallbackInfoReturnable<Integer> callbackInfoReturnable) {
        if (J.d.p() && J.d.h.i) {
            Color color = J.d.h.P();
            callbackInfoReturnable.setReturnValue((Object)color.getRGB());
        }
    }
}

