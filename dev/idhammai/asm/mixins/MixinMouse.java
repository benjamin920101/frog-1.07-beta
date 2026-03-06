/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.option.KeyBinding
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.Mouse
 *  net.minecraft.client.util.InputUtil
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package dev.idhammai.asm.mixins;

import dev.idhammai.Frog;
import dev.idhammai.P.V.J;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.Mouse;
import net.minecraft.client.util.InputUtil;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_312.class})
public class MixinMouse
implements J {
    @Shadow
    private boolean field_1783;
    @Final
    @Shadow
    private class_310 field_1779;
    @Shadow
    private double field_1795;
    @Shadow
    private double field_1794;

    @Inject(method={"onMouseButton"}, at={@At(value="HEAD")})
    private void onMouse(long l2, int n2, int n3, int n4, CallbackInfo callbackInfo) {
        int n5 = -(n2 + 2);
        if (n3 == 1) {
            Frog.MODULE.e(n5);
        }
        if (n3 == 0) {
            Frog.MODULE.C(n5);
        }
    }

    @Override
    public void frogClient$lock() {
        if (this.field_1779.method_1569() && !this.field_1783) {
            if (!class_310.field_1703) {
                class_304.method_1424();
            }
            this.field_1783 = true;
            this.field_1795 = (double)this.field_1779.method_22683().method_4480() / 2.0;
            this.field_1794 = (double)this.field_1779.method_22683().method_4507() / 2.0;
            class_3675.method_15984((long)this.field_1779.method_22683().method_4490(), (int)212995, (double)this.field_1795, (double)this.field_1794);
        }
    }
}

