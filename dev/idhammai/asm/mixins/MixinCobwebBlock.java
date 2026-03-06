/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1937
 *  net.minecraft.class_2338
 *  net.minecraft.class_243
 *  net.minecraft.class_2560
 *  net.minecraft.class_2680
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package dev.idhammai.asm.mixins;

import dev.idhammai.P.A.J;
import dev.idhammai.c.r.q.D.Z;
import dev.idhammai.c.r.q.D.t;
import net.minecraft.class_1297;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_2560;
import net.minecraft.class_2680;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_2560.class})
public class MixinCobwebBlock {
    @Inject(at={@At(value="HEAD")}, method={"onEntityCollision"}, cancellable=true)
    private void onGetVelocityMultiplier(class_2680 class_26802, class_1937 class_19372, class_2338 class_23382, class_1297 class_12972, CallbackInfo callbackInfo) {
        if (Z.F.p() && (J.W.field_1690.field_1832.method_1434() || !Z.F.w.h())) {
            if (Z.F.r.x(t.Ignore)) {
                callbackInfo.cancel();
                class_12972.method_38785();
            } else if (Z.F.r.x(t.Custom)) {
                callbackInfo.cancel();
                class_12972.method_5844(class_26802, new class_243(Z.F.V.e() / 100.0, Z.F.t.e() / 100.0, Z.F.V.e() / 100.0));
            }
        }
    }
}

