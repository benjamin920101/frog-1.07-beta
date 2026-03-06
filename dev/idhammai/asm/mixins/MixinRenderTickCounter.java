/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.render.RenderTickCounter$Dynamic
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package dev.idhammai.asm.mixins;

import dev.idhammai.Frog;
import dev.idhammai.P.r.c.V;
import net.minecraft.client.render.RenderTickCounter;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_9779.class_9781.class})
public class MixinRenderTickCounter {
    @Shadow
    private float field_51958;
    @Shadow
    private float field_51959;
    @Shadow
    private long field_51962;
    @Final
    @Shadow
    private float field_51964;

    @Inject(method={"beginRenderTick(J)I"}, at={@At(value="HEAD")}, cancellable=true)
    private void beginRenderTickHook(long l2, CallbackInfoReturnable<Integer> callbackInfoReturnable) {
        V v2 = V.T();
        Frog.EVENT_BUS.J(v2);
        if (!v2.p()) {
            float f2;
            float f3 = f2 = v2.I() ? v2.T() : Frog.TIMER.N();
            if (f2 == 1.0f) {
                return;
            }
            this.field_51958 = (float)(l2 - this.field_51962) / this.field_51964 * f2;
            this.field_51962 = l2;
            this.field_51959 += this.field_51958;
            int n2 = (int)this.field_51959;
            this.field_51959 -= (float)n2;
            callbackInfoReturnable.setReturnValue((Object)n2);
        }
    }
}

