/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1937
 *  net.minecraft.class_2246
 *  net.minecraft.class_2338
 *  net.minecraft.class_2680
 *  net.minecraft.class_2818
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package dev.idhammai.asm.mixins;

import dev.idhammai.Frog;
import dev.idhammai.P.A.J;
import dev.idhammai.P.A.Y.N;
import dev.idhammai.c.r.q.A.A;
import dev.idhammai.c.r.q.N.I;
import dev.idhammai.c.r.q.i.e;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2818;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_1937.class})
public abstract class MixinWorld {
    @Inject(method={"getBlockState"}, at={@At(value="HEAD")}, cancellable=true)
    public void blockStateHook(class_2338 class_23382, CallbackInfoReturnable<class_2680> callbackInfoReturnable) {
        if (J.W.field_1687 != null && J.W.field_1687.method_24794(class_23382)) {
            if (A.w.contains(class_23382)) {
                callbackInfoReturnable.setReturnValue((Object)class_2246.field_10124.method_9564());
                return;
            }
            if (!I.Q.D.h()) {
                class_2818 class_28182;
                class_2680 class_26802;
                boolean bl = N.z;
                class_2338 class_23383 = N.y;
                class_2680 class_26803 = N.Z;
                if (bl || class_23383 != null) {
                    class_2818 class_28183 = J.W.field_1687.method_8497(class_23382.method_10263() >> 4, class_23382.method_10260() >> 4);
                    class_2680 class_26804 = class_28183.method_8320(class_23382);
                    if (class_23383 != null && class_26803 != null && class_23382.equals((Object)class_23383)) {
                        callbackInfoReturnable.setReturnValue((Object)class_26803);
                        return;
                    }
                    if (bl) {
                        if (Frog.HOLE.i(class_26804.method_26204())) {
                            return;
                        }
                        callbackInfoReturnable.setReturnValue((Object)class_2246.field_10124.method_9564());
                    }
                } else if (e.V.t && (class_26802 = (class_28182 = J.W.field_1687.method_8497(class_23382.method_10263() >> 4, class_23382.method_10260() >> 4)).method_8320(class_23382)).method_26204() == class_2246.field_9987) {
                    callbackInfoReturnable.setReturnValue((Object)class_2246.field_10124.method_9564());
                }
            }
        }
    }
}

