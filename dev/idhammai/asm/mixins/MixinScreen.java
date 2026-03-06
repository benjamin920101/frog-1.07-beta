/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 *  net.minecraft.class_332
 *  net.minecraft.class_437
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package dev.idhammai.asm.mixins;

import dev.idhammai.Frog;
import dev.idhammai.c.y.j.w;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_437;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_437.class})
public class MixinScreen {
    @Inject(method={"renderBackground"}, at={@At(value="HEAD")}, cancellable=true)
    private void frogShaderBackground(class_332 class_3322, int n2, int n3, float f2, CallbackInfo callbackInfo) {
        if (class_310.method_1551().field_1687 == null && Frog.SHADER != null) {
            Frog.SHADER.J();
            callbackInfo.cancel();
        }
    }

    @Inject(method={"render"}, at={@At(value="HEAD")})
    private void applyTransitionScale(class_332 class_3322, int n2, int n3, float f2, CallbackInfo callbackInfo) {
        if (w.f()) {
            float f3 = w.e();
            float f4 = 1.1f - 0.1f * f3;
            int n4 = class_310.method_1551().method_22683().method_4486();
            int n5 = class_310.method_1551().method_22683().method_4502();
            class_3322.method_51448().method_22903();
            class_3322.method_51448().method_46416((float)n4 / 2.0f, (float)n5 / 2.0f, 0.0f);
            class_3322.method_51448().method_22905(f4, f4, 1.0f);
            class_3322.method_51448().method_46416((float)(-n4) / 2.0f, (float)(-n5) / 2.0f, 0.0f);
        }
    }

    @Inject(method={"render"}, at={@At(value="RETURN")})
    private void renderTransitionOverlay(class_332 class_3322, int n2, int n3, float f2, CallbackInfo callbackInfo) {
        if (w.f()) {
            class_3322.method_51448().method_22909();
        }
        w.R(class_3322);
    }
}

