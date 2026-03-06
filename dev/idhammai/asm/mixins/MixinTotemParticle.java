/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_4002
 *  net.minecraft.class_638
 *  net.minecraft.class_734
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package dev.idhammai.asm.mixins;

import dev.idhammai.Frog;
import dev.idhammai.P.r.c.K;
import dev.idhammai.asm.mixins.MixinParticle;
import java.awt.Color;
import net.minecraft.class_4002;
import net.minecraft.class_638;
import net.minecraft.class_734;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_734.class})
public abstract class MixinTotemParticle
extends MixinParticle {
    @Inject(method={"<init>"}, at={@At(value="TAIL")})
    private void hookInit(class_638 class_6382, double d2, double d3, double d4, double d5, double d6, double d7, class_4002 class_40022, CallbackInfo callbackInfo) {
        K k2 = K.L(d5, d6, d7);
        Frog.EVENT_BUS.J(k2);
        if (k2.p()) {
            this.field_3852 = k2.c;
            this.field_3869 = k2.K;
            this.field_3850 = k2.X;
            Color color = k2.u;
            if (color != null) {
                this.method_3084((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f);
                this.method_3083((float)color.getAlpha() / 255.0f);
            }
        }
    }
}

