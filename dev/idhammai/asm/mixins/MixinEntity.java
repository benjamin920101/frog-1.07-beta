/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_310
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

import dev.idhammai.Frog;
import dev.idhammai.P.A.J;
import dev.idhammai.P.r.c.B;
import dev.idhammai.P.r.c.r;
import dev.idhammai.c.r.q.D.f;
import dev.idhammai.c.r.q.n.F;
import dev.idhammai.c.r.q.n.N;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(value={class_1297.class})
public abstract class MixinEntity {
    @Shadow
    private static final int field_29976 = 3;

    @Inject(method={"changeLookDirection"}, at={@At(value="HEAD")}, cancellable=true)
    private void hookChangeLookDirection(double d2, double d3, CallbackInfo callbackInfo) {
        if (class_1297.class.cast(this) == J.W.field_1724) {
            B b2 = B.I((class_1297)class_1297.class.cast(this), d2, d3);
            Frog.EVENT_BUS.J(b2);
            if (b2.p()) {
                callbackInfo.cancel();
            }
        }
    }

    @Inject(at={@At(value="HEAD")}, method={"isInvisibleTo(Lnet/minecraft/entity/player/PlayerEntity;)Z"}, cancellable=true)
    private void onIsInvisibleCheck(class_1657 class_16572, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        if (N.Q.p() && N.Q.R.h()) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }

    @Inject(method={"isGlowing"}, at={@At(value="HEAD")}, cancellable=true)
    void isGlowingHook(CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        if (F.I.p()) {
            callbackInfoReturnable.setReturnValue((Object)F.I.U((class_1297)class_1297.class.cast(this)));
        }
    }

    @ModifyArgs(method={"pushAwayFrom"}, at=@At(value="INVOKE", target="Lnet/minecraft/entity/Entity;addVelocity(DDD)V"))
    private void pushAwayFromHook(Args args) {
        if (class_1297.class.cast(this) == class_310.method_1551().field_1724 && f.V.p() && f.V.F.h()) {
            args.set(0, (Object)0.0);
            args.set(1, (Object)0.0);
            args.set(2, (Object)0.0);
        }
    }

    @Inject(method={"isOnFire"}, at={@At(value="HEAD")}, cancellable=true)
    void isOnFireHook(CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        if (N.Q.p() && N.Q.X.h()) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }

    @Inject(method={"setSprinting"}, at={@At(value="HEAD")}, cancellable=true)
    public void setSprintingHook(boolean bl, CallbackInfo callbackInfo) {
        if (class_1297.class.cast(this) == class_310.method_1551().field_1724) {
            r r2 = r.w();
            Frog.EVENT_BUS.J(r2);
            if (r2.p()) {
                callbackInfo.cancel();
                bl = r2.I();
                this.method_5729(3, bl);
            }
        }
    }

    @Shadow
    protected void method_5729(int n2, boolean bl) {
    }
}

