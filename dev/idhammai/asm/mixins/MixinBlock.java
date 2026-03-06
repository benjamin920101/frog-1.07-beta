/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.ModifyReturnValue
 *  net.minecraft.class_1922
 *  net.minecraft.class_1935
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2680
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package dev.idhammai.asm.mixins;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import dev.idhammai.c.r.q.D.z;
import dev.idhammai.c.r.q.n.U;
import net.minecraft.class_1922;
import net.minecraft.class_1935;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2680;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_2248.class})
public abstract class MixinBlock
implements class_1935 {
    @Inject(at={@At(value="HEAD")}, method={"getVelocityMultiplier()F"}, cancellable=true)
    private void onGetVelocityMultiplier(CallbackInfoReturnable<Float> callbackInfoReturnable) {
        if (z.f.K() && callbackInfoReturnable.getReturnValueF() < 1.0f) {
            callbackInfoReturnable.setReturnValue((Object)Float.valueOf(1.0f));
        }
    }

    @ModifyReturnValue(method={"shouldDrawSide"}, at={@At(value="RETURN")})
    private static boolean onShouldDrawSide(boolean bl, class_2680 class_26802, class_1922 class_19222, class_2338 class_23382, class_2350 class_23502, class_2338 class_23383) {
        U u2 = U.l;
        if (u2.p()) {
            return u2.r(class_26802, class_19222, class_23382, class_23502, bl);
        }
        return bl;
    }
}

