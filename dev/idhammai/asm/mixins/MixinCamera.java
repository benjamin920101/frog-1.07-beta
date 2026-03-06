/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.world.BlockView
 *  net.minecraft.client.render.Camera
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyArgs
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 *  org.spongepowered.asm.mixin.injection.invoke.arg.Args
 */
package dev.idhammai.asm.mixins;

import dev.idhammai.c.r.q.i.O;
import dev.idhammai.c.r.q.i.c;
import dev.idhammai.c.r.q.n.M;
import dev.idhammai.c.r.q.n.d;
import net.minecraft.entity.Entity;
import net.minecraft.world.BlockView;
import net.minecraft.client.render.Camera;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(value={class_4184.class})
public abstract class MixinCamera {
    @Shadow
    private boolean field_18719;

    @Shadow
    protected abstract float method_19318(float var1);

    @ModifyArgs(method={"update"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/render/Camera;moveBy(FFF)V", ordinal=0))
    private void modifyCameraDistance(Args args) {
        if (d.c.p()) {
            args.set(0, (Object)Float.valueOf(-this.method_19318((float)d.c.I())));
        }
    }

    @Inject(method={"clipToSpace"}, at={@At(value="HEAD")}, cancellable=true)
    private void onClipToSpace(float f2, CallbackInfoReturnable<Float> callbackInfoReturnable) {
        if (d.c.p()) {
            callbackInfoReturnable.setReturnValue((Object)Float.valueOf((float)d.c.I()));
        }
    }

    @Inject(method={"update"}, at={@At(value="TAIL")})
    private void updateHook(class_1922 class_19222, class_1297 class_12972, boolean bl, boolean bl2, float f2, CallbackInfo callbackInfo) {
        if (c.L.p()) {
            this.field_18719 = true;
        }
    }

    @ModifyArgs(method={"update"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/render/Camera;setRotation(FF)V"))
    private void setRotationHook(Args args) {
        if (c.L.p()) {
            args.setAll(new Object[]{Float.valueOf(c.L.h()), Float.valueOf(c.L.k())});
        } else if (O.K.p()) {
            args.setAll(new Object[]{Float.valueOf(O.K.I()), Float.valueOf(O.K.p())});
        }
    }

    @ModifyArgs(method={"update"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/render/Camera;setPos(DDD)V"))
    private void setPosHook(Args args) {
        if (c.L.p()) {
            args.setAll(new Object[]{c.L.Y(), c.L.R(), c.L.z()});
        } else if (M.Z.z()) {
            args.setAll(new Object[]{M.Z.f(), M.Z.Z(), M.Z.v()});
        }
    }
}

