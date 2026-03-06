/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_310
 *  net.minecraft.class_329
 *  net.minecraft.class_332
 *  net.minecraft.class_9779
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyArg
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package dev.idhammai.asm.mixins;

import dev.idhammai.Frog;
import dev.idhammai.P.r.c.j;
import dev.idhammai.c.r.q.N.I;
import dev.idhammai.c.r.q.n.N;
import dev.idhammai.c.r.q.n.R;
import java.awt.Color;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_310;
import net.minecraft.class_329;
import net.minecraft.class_332;
import net.minecraft.class_9779;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_329.class})
public abstract class MixinInGameHud {
    @Final
    @Shadow
    private class_310 field_2035;
    @Unique
    final Color minColor = new Color(196, 0, 0);
    @Unique
    final Color maxColor = new Color(0, 227, 0);

    @Inject(method={"renderPortalOverlay"}, at={@At(value="HEAD")}, cancellable=true)
    private void onRenderPortalOverlay(class_332 class_3322, float f2, CallbackInfo callbackInfo) {
        if (N.Q.p() && N.Q.m.h()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"renderStatusEffectOverlay"}, at={@At(value="HEAD")}, cancellable=true)
    private void onRenderStatusEffectOverlay(CallbackInfo callbackInfo) {
        if (N.Q.p() && N.Q.l.h()) {
            callbackInfo.cancel();
        }
    }

    @Shadow
    private int method_1733(int n2) {
        return 0;
    }

    @Shadow
    private int method_1744(class_1309 class_13092) {
        return 0;
    }

    @Shadow
    private class_1657 method_1737() {
        return null;
    }

    @Shadow
    private class_1309 method_1734() {
        return null;
    }

    @Shadow
    public abstract void method_1753(class_332 var1, class_9779 var2);

    @Inject(at={@At(value="HEAD")}, method={"render"})
    public void renderStart(class_332 class_3322, class_9779 class_97792, CallbackInfo callbackInfo) {
        Frog.EVENT_BUS.J(j.l(class_3322));
    }

    @Inject(at={@At(value="TAIL")}, method={"render"})
    public void renderHook(class_332 class_3322, class_9779 class_97792, CallbackInfo callbackInfo) {
        Frog.MODULE.z(class_3322);
    }

    @Inject(method={"clear"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/gui/hud/ChatHud;clear(Z)V")}, cancellable=true)
    private void onClear(CallbackInfo callbackInfo) {
        if (I.Q.p() && I.Q.P.h()) {
            callbackInfo.cancel();
        }
    }

    @ModifyArg(method={"renderHotbar"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/gui/DrawContext;drawGuiTexture(Lnet/minecraft/util/Identifier;IIII)V", ordinal=1), index=1)
    private int selectedSlotX(int n2) {
        if (I.Q.U()) {
            double d2 = I.K.g(n2, I.Q.b.V(), I.Q.e.X());
            return (int)d2;
        }
        return n2;
    }

    @Inject(method={"renderCrosshair"}, at={@At(value="HEAD")}, cancellable=true)
    private void onRenderCrosshairBegin(class_332 class_3322, class_9779 class_97792, CallbackInfo callbackInfo) {
        if (R.r.p()) {
            R.r.w(class_3322);
            callbackInfo.cancel();
        }
    }
}

