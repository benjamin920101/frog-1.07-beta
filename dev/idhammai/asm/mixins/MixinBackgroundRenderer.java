/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.entity.effect.StatusEffect
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.client.render.Camera
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.registry.entry.RegistryEntry
 *  net.minecraft.client.render.BackgroundRenderer
 *  net.minecraft.client.render.BackgroundRenderer$FogType
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.Redirect
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package dev.idhammai.asm.mixins;

import com.mojang.blaze3d.systems.RenderSystem;
import dev.idhammai.c.r.q.n.J;
import dev.idhammai.c.r.q.n.N;
import dev.idhammai.c.r.q.n.U;
import java.awt.Color;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.client.render.Camera;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.client.render.BackgroundRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_758.class})
public class MixinBackgroundRenderer {
    @Redirect(method={"render"}, at=@At(value="INVOKE", target="Lnet/minecraft/entity/LivingEntity;hasStatusEffect(Lnet/minecraft/registry/entry/RegistryEntry;)Z", ordinal=0, remap=false), require=0)
    private static boolean nightVisionHook(class_1309 class_13092, class_6880<class_1291> class_68802) {
        if (J.d.p() && J.d.e.h()) {
            return true;
        }
        return class_13092.method_6059(class_68802);
    }

    @Inject(method={"applyFog"}, at={@At(value="TAIL")})
    private static void onApplyFog(class_4184 class_41842, class_758.class_4596 class_45962, float f2, boolean bl, float f3, CallbackInfo callbackInfo) {
        if (J.d.p()) {
            if (J.d.u.i) {
                RenderSystem.setShaderFogColor((float)((float)J.d.u.P().getRed() / 255.0f), (float)((float)J.d.u.P().getGreen() / 255.0f), (float)((float)J.d.u.P().getBlue() / 255.0f), (float)((float)J.d.u.P().getAlpha() / 255.0f));
            }
            if (J.d.A.h()) {
                RenderSystem.setShaderFogStart((float)J.d.b.Z());
                RenderSystem.setShaderFogEnd((float)J.d.E.Z());
            }
        }
        if ((N.Q.p() && N.Q.U.h() || U.l.p()) && class_45962 == class_758.class_4596.field_20946) {
            RenderSystem.setShaderFogStart((float)(f2 * 4.0f));
            RenderSystem.setShaderFogEnd((float)(f2 * 4.25f));
        }
    }

    @Inject(method={"render"}, at={@At(value="HEAD")}, cancellable=true)
    private static void hookRender(class_4184 class_41842, float f2, class_638 class_6382, int n2, float f3, CallbackInfo callbackInfo) {
        if (J.d.p() && J.d.s.i) {
            Color color = J.d.s.P();
            callbackInfo.cancel();
            RenderSystem.clearColor((float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)0.0f);
        }
    }

    @Inject(method={"getFogModifier(Lnet/minecraft/entity/Entity;F)Lnet/minecraft/client/render/BackgroundRenderer$StatusEffectFogModifier;"}, at={@At(value="HEAD")}, cancellable=true)
    private static void onGetFogModifier(class_1297 class_12972, float f2, CallbackInfoReturnable<Object> callbackInfoReturnable) {
        if (N.Q.p() && N.Q.t.h()) {
            callbackInfoReturnable.setReturnValue(null);
        }
    }
}

