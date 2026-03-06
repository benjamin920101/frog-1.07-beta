/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1657
 *  net.minecraft.class_243
 *  net.minecraft.class_4050
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package dev.idhammai.asm.mixins;

import dev.idhammai.Frog;
import dev.idhammai.P.A.J;
import dev.idhammai.P.r.O;
import dev.idhammai.P.r.c.D;
import dev.idhammai.P.r.c.s;
import dev.idhammai.c.r.q.N.I;
import dev.idhammai.c.r.q.i.e;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_4050;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_1657.class})
public class MixinPlayerEntity
implements J {
    @Inject(method={"canChangeIntoPose"}, at={@At(value="RETURN")}, cancellable=true)
    private void poseNotCollide(class_4050 class_40502, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        if (class_1657.class.cast(this) == MixinPlayerEntity.W.field_1724 && !I.Q.p.h() && class_40502 == class_4050.field_18079) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }

    @Inject(method={"getBlockInteractionRange"}, at={@At(value="HEAD")}, cancellable=true)
    public void getBlockInteractionRangeHook(CallbackInfoReturnable<Double> callbackInfoReturnable) {
        if (e.V.P()) {
            callbackInfoReturnable.setReturnValue((Object)e.V.j.e());
        }
    }

    @Inject(method={"getEntityInteractionRange"}, at={@At(value="HEAD")}, cancellable=true)
    public void getEntityInteractionRangeHook(CallbackInfoReturnable<Double> callbackInfoReturnable) {
        if (e.V.P()) {
            callbackInfoReturnable.setReturnValue((Object)e.V.f.e());
        }
    }

    @Inject(method={"jump"}, at={@At(value="HEAD")})
    private void onJumpPre(CallbackInfo callbackInfo) {
        Frog.EVENT_BUS.J(D.s(O.Pre));
    }

    @Inject(method={"jump"}, at={@At(value="RETURN")})
    private void onJumpPost(CallbackInfo callbackInfo) {
        Frog.EVENT_BUS.J(D.s(O.Post));
    }

    @Inject(method={"travel"}, at={@At(value="HEAD")}, cancellable=true)
    private void onTravelPre(class_243 class_2432, CallbackInfo callbackInfo) {
        class_1657 class_16572 = (class_1657)class_1657.class.cast(this);
        if (class_16572 != MixinPlayerEntity.W.field_1724) {
            return;
        }
        s s2 = s.M(O.Pre, class_16572);
        Frog.EVENT_BUS.J(s2);
        if (s2.p()) {
            callbackInfo.cancel();
            s2 = s.M(O.Post, class_16572);
            Frog.EVENT_BUS.J(s2);
        }
    }

    @Inject(method={"travel"}, at={@At(value="RETURN")})
    private void onTravelPost(class_243 class_2432, CallbackInfo callbackInfo) {
        class_1657 class_16572 = (class_1657)class_1657.class.cast(this);
        if (class_16572 != MixinPlayerEntity.W.field_1724) {
            return;
        }
        s s2 = s.M(O.Post, class_16572);
        Frog.EVENT_BUS.J(s2);
    }
}

