/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1703
 *  net.minecraft.class_1735
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_2561
 *  net.minecraft.class_332
 *  net.minecraft.class_3936
 *  net.minecraft.class_437
 *  net.minecraft.class_465
 *  org.jetbrains.annotations.Nullable
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package dev.idhammai.asm.mixins;

import dev.idhammai.Frog;
import dev.idhammai.P.A.J;
import dev.idhammai.c.r.q.x.D;
import net.minecraft.class_1703;
import net.minecraft.class_1735;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2561;
import net.minecraft.class_332;
import net.minecraft.class_3936;
import net.minecraft.class_437;
import net.minecraft.class_465;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_465.class})
public abstract class MixinHandledScreen<T extends class_1703>
extends class_437
implements class_3936<T> {
    @Unique
    private static final class_1799[] ITEMS = new class_1799[27];
    @Shadow
    @Nullable
    protected class_1735 field_2787;
    @Shadow
    protected int field_2776;
    @Shadow
    protected int field_2800;

    protected MixinHandledScreen(class_2561 class_25612) {
        super(class_25612);
    }

    @Inject(method={"mouseClicked"}, at={@At(value="HEAD")}, cancellable=true)
    private void mouseClicked(double d2, double d3, int n2, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        class_1799 class_17992;
        if (n2 == 2 && this.field_2787 != null && !this.field_2787.method_7677().method_7960() && J.W.field_1724.field_7512.method_34255().method_7960() && D.M.p() && (D.g(class_17992 = this.field_2787.method_7677()) || class_17992.method_7909() == class_1802.field_8466 && Frog.PLAYER.r)) {
            callbackInfoReturnable.setReturnValue((Object)D.q(this.field_2787.method_7677(), ITEMS, false));
        }
    }

    @Inject(method={"render"}, at={@At(value="RETURN")})
    private void onRender(class_332 class_3322, int n2, int n3, float f2, CallbackInfo callbackInfo) {
        if (D.M.p() && D.M.c.h() && this.field_2787 != null && !this.field_2787.method_7677().method_7960() && this.field_22787.field_1724.field_7498.method_34255().method_7960() && (D.g(this.field_2787.method_7677()) || this.field_2787.method_7677().method_7909() == class_1802.field_8466 && Frog.PLAYER.r)) {
            D.i(class_3322, n2, n3, this.field_2787.method_7677());
        }
    }

    @Shadow
    public abstract void method_25420(class_332 var1, int var2, int var3, float var4);
}

