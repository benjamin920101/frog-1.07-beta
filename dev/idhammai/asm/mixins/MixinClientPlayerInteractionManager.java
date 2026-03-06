/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1269
 *  net.minecraft.class_1657
 *  net.minecraft.class_1799
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_3965
 *  net.minecraft.class_636
 *  net.minecraft.class_746
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Constant
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyConstant
 *  org.spongepowered.asm.mixin.injection.ModifyVariable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package dev.idhammai.asm.mixins;

import dev.idhammai.Frog;
import dev.idhammai.P.r.c.q;
import dev.idhammai.P.r.c.u;
import dev.idhammai.P.r.c.z;
import dev.idhammai.c.r.q.i.e;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_3965;
import net.minecraft.class_636;
import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_636.class})
public class MixinClientPlayerInteractionManager {
    @Shadow
    private class_1799 field_3718;

    @ModifyVariable(method={"isCurrentlyBreaking"}, at=@At(value="STORE"))
    private class_1799 stack(class_1799 class_17992) {
        return e.V.R() ? this.field_3718 : class_17992;
    }

    @ModifyConstant(method={"updateBlockBreakingProgress"}, constant={@Constant(intValue=5)})
    private int MiningCooldownFix(int n2) {
        return e.V.E() ? 0 : n2;
    }

    @Inject(method={"interactItem"}, at={@At(value="HEAD")}, cancellable=true)
    private void hookInteractItem(class_1657 class_16572, class_1268 class_12682, CallbackInfoReturnable<class_1269> callbackInfoReturnable) {
        q q2 = q.o(class_12682);
        Frog.EVENT_BUS.J(q2);
        if (q2.p()) {
            callbackInfoReturnable.setReturnValue((Object)class_1269.field_5811);
        }
    }

    @Inject(method={"interactItem"}, at={@At(value="RETURN")})
    private void hookInteractItemReturn(class_1657 class_16572, class_1268 class_12682, CallbackInfoReturnable<class_1269> callbackInfoReturnable) {
        Frog.EVENT_BUS.J(q.L(class_12682));
    }

    @Inject(method={"interactBlock"}, at={@At(value="HEAD")}, cancellable=true)
    private void hookInteractBlock(class_746 class_7462, class_1268 class_12682, class_3965 class_39652, CallbackInfoReturnable<class_1269> callbackInfoReturnable) {
        u u2 = u.D(class_12682);
        Frog.EVENT_BUS.J(u2);
        if (u2.p()) {
            callbackInfoReturnable.setReturnValue((Object)class_1269.field_5811);
        }
    }

    @Inject(method={"interactBlock"}, at={@At(value="RETURN")})
    private void hookInteractBlockReturn(class_746 class_7462, class_1268 class_12682, class_3965 class_39652, CallbackInfoReturnable<class_1269> callbackInfoReturnable) {
        Frog.EVENT_BUS.J(u.O(class_12682));
    }

    @Inject(method={"cancelBlockBreaking"}, at={@At(value="HEAD")}, cancellable=true)
    private void hookCancelBlockBreaking(CallbackInfo callbackInfo) {
        if (e.V.w()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"attackBlock"}, at={@At(value="HEAD")}, cancellable=true)
    private void onAttackBlock(class_2338 class_23382, class_2350 class_23502, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        z z2 = z.E(class_23382, class_23502);
        Frog.EVENT_BUS.J(z2);
        if (z2.p()) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }
}

