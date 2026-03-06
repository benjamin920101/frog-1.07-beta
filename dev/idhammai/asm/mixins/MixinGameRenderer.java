/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.entity.effect.StatusEffectInstance
 *  net.minecraft.entity.effect.StatusEffects
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.projectile.ProjectileUtil
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Position
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.hit.HitResult
 *  net.minecraft.util.hit.HitResult$Type
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.util.hit.EntityHitResult
 *  net.minecraft.client.render.Camera
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.block.enums.CameraSubmersionType
 *  net.minecraft.client.render.GameRenderer
 *  net.minecraft.util.math.RotationAxis
 *  net.minecraft.client.render.RenderTickCounter
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.At$Shift
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.Redirect
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package dev.idhammai.asm.mixins;

import com.mojang.blaze3d.systems.RenderSystem;
import dev.idhammai.Frog;
import dev.idhammai.P.A.S.n;
import dev.idhammai.P.A.l.Q;
import dev.idhammai.c.r.q.i.c;
import dev.idhammai.c.r.q.i.e;
import dev.idhammai.c.r.q.n.C;
import dev.idhammai.c.r.q.n.N;
import dev.idhammai.c.r.q.n.O;
import dev.idhammai.c.r.q.n.r;
import dev.idhammai.c.r.q.n.t;
import dev.idhammai.c.r.q.n.u;
import dev.idhammai.c.r.y;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.ProjectileUtil;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Position;
import net.minecraft.util.math.Box;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.client.render.Camera;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.block.enums.CameraSubmersionType;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.client.render.RenderTickCounter;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_757.class})
public class MixinGameRenderer {
    @Shadow
    @Final
    class_310 field_4015;
    @Shadow
    private float field_4019;
    @Shadow
    private float field_3999;
    @Shadow
    private boolean field_4001;
    @Shadow
    private float field_4005;
    @Shadow
    private float field_3988;
    @Shadow
    private float field_4004;
    @Shadow
    private float field_4025;
    @Unique
    private class_1297 cameraEntity;
    @Unique
    private float originalYaw;
    @Unique
    private float originalPitch;

    @Shadow
    private static class_239 method_56154(class_239 class_2392, class_243 class_2432, double d2) {
        class_243 class_2433 = class_2392.method_17784();
        if (!class_2433.method_24802((class_2374)class_2432, d2)) {
            class_243 class_2434 = class_2392.method_17784();
            class_2350 class_23502 = class_2350.method_10142((double)(class_2434.field_1352 - class_2432.field_1352), (double)(class_2434.field_1351 - class_2432.field_1351), (double)(class_2434.field_1350 - class_2432.field_1350));
            return class_3965.method_17778((class_243)class_2434, (class_2350)class_23502, (class_2338)class_2338.method_49638((class_2374)class_2434));
        }
        return class_2392;
    }

    @Inject(method={"showFloatingItem"}, at={@At(value="HEAD")}, cancellable=true)
    private void onShowFloatingItem(class_1799 class_17992, CallbackInfo callbackInfo) {
        if (class_17992.method_7909() == class_1802.field_8288 && N.Q.p() && N.Q.L.h()) {
            callbackInfo.cancel();
        }
    }

    @Redirect(method={"renderWorld"}, at=@At(value="INVOKE", target="Lnet/minecraft/util/math/MathHelper;lerp(FFF)F"), require=0)
    private float applyCameraTransformationsMathHelperLerpProxy(float f2, float f3, float f4) {
        if (N.Q.p() && N.Q.J.h()) {
            return 0.0f;
        }
        return class_3532.method_16439((float)f2, (float)f3, (float)f4);
    }

    @Inject(method={"tiltViewWhenHurt"}, at={@At(value="HEAD")}, cancellable=true)
    private void tiltViewWhenHurtHook(class_4587 class_45872, float f2, CallbackInfo callbackInfo) {
        if (N.Q.p() && N.Q.E.h()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"shouldRenderBlockOutline"}, at={@At(value="HEAD")}, cancellable=true)
    public void hookOutline(CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        if (C.c.p()) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }

    @Inject(at={@At(value="FIELD", target="Lnet/minecraft/client/render/GameRenderer;renderHand:Z", opcode=180, ordinal=0)}, method={"renderWorld"})
    void render3dHook(class_9779 class_97792, CallbackInfo callbackInfo) {
        if (y.M()) {
            return;
        }
        class_4184 class_41842 = class_310.method_1551().field_1773.method_19418();
        class_4587 class_45872 = new class_4587();
        class_45872.method_22907(class_7833.field_40714.rotationDegrees(class_41842.method_19329()));
        class_45872.method_22907(class_7833.field_40716.rotationDegrees(class_41842.method_19330() + 180.0f));
        n.g.set((Matrix4fc)RenderSystem.getProjectionMatrix());
        n.F.set((Matrix4fc)RenderSystem.getModelViewMatrix());
        n.Y.set((Matrix4fc)class_45872.method_23760().method_23761());
        Frog.FPS.C();
        Frog.MODULE.K(class_45872);
    }

    @Inject(at={@At(value="TAIL")}, method={"renderWorld"})
    void render3dTail(class_9779 class_97792, CallbackInfo callbackInfo) {
        if (O.s.p() && O.s.I.i) {
            RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        }
    }

    @Inject(method={"getFov(Lnet/minecraft/client/render/Camera;FZ)D"}, at={@At(value="HEAD")}, cancellable=true)
    public void getFov(class_4184 class_41842, float f2, boolean bl, CallbackInfoReturnable<Double> callbackInfoReturnable) {
        if (!this.field_4001 && (u.c.p() || bl && (t.w || dev.idhammai.c.r.q.D.e.t != null && dev.idhammai.c.r.q.D.e.X))) {
            class_5636 class_56362;
            double d2 = 70.0;
            if (bl) {
                if (u.c.p()) {
                    double d3 = u.c.N.e();
                    if (t.w) {
                        d3 -= t.d.V;
                    }
                    if (dev.idhammai.c.r.q.D.e.t != null && dev.idhammai.c.r.q.D.e.X) {
                        d3 += dev.idhammai.c.r.q.D.e.t.d;
                    }
                    callbackInfoReturnable.setReturnValue((Object)Math.min(Math.max(d3, 1.0), 177.0));
                    return;
                }
                d2 = ((Integer)this.field_4015.field_1690.method_41808().method_41753()).intValue();
                d2 *= (double)class_3532.method_16439((float)f2, (float)this.field_3999, (float)this.field_4019);
                if (t.w) {
                    d2 -= t.d.V;
                }
                if (dev.idhammai.c.r.q.D.e.t != null && dev.idhammai.c.r.q.D.e.X) {
                    d2 += dev.idhammai.c.r.q.D.e.t.d;
                }
            } else if (u.c.p()) {
                callbackInfoReturnable.setReturnValue((Object)u.c.H.e());
                return;
            }
            if (class_41842.method_19331() instanceof class_1309 && ((class_1309)class_41842.method_19331()).method_29504()) {
                float f3 = Math.min((float)((class_1309)class_41842.method_19331()).field_6213 + f2, 20.0f);
                d2 /= (double)((1.0f - 500.0f / (f3 + 500.0f)) * 2.0f + 1.0f);
            }
            if ((class_56362 = class_41842.method_19334()) == class_5636.field_27885 || class_56362 == class_5636.field_27886) {
                d2 *= class_3532.method_16436((double)((Double)this.field_4015.field_1690.method_42454().method_41753()), (double)1.0, (double)0.8571428656578064);
            }
            callbackInfoReturnable.setReturnValue((Object)Math.min(Math.max(d2, 1.0), 177.0));
        }
    }

    @Inject(method={"getNightVisionStrength"}, at={@At(value="HEAD")}, cancellable=true)
    private static void getNightVisionStrengthHook(class_1309 class_13092, float f2, CallbackInfoReturnable<Float> callbackInfoReturnable) {
        class_1293 class_12932 = class_13092.method_6112(class_1294.field_5925);
        if (class_12932 == null) {
            callbackInfoReturnable.setReturnValue((Object)Float.valueOf(1.0f));
        }
    }

    @Inject(method={"renderWorld"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/render/GameRenderer;renderHand(Lnet/minecraft/client/render/Camera;FLorg/joml/Matrix4f;)V", shift=At.Shift.AFTER)})
    public void postRender3dHook(class_9779 class_97792, CallbackInfo callbackInfo) {
        Frog.SHADER.o();
    }

    @Inject(method={"getBasicProjectionMatrix"}, at={@At(value="TAIL")}, cancellable=true)
    public void getBasicProjectionMatrixHook(double d2, CallbackInfoReturnable<Matrix4f> callbackInfoReturnable) {
        if (r.I.p()) {
            class_4587 class_45872 = new class_4587();
            class_45872.method_23760().method_23761().identity();
            if (this.field_4005 != 1.0f) {
                class_45872.method_46416(this.field_3988, -this.field_4004, 0.0f);
                class_45872.method_22905(this.field_4005, this.field_4005, 1.0f);
            }
            class_45872.method_23760().method_23761().mul((Matrix4fc)new Matrix4f().setPerspective((float)(d2 * 0.01745329238474369), r.I.n.Z(), 0.05f, this.field_4025 * 4.0f));
            callbackInfoReturnable.setReturnValue((Object)class_45872.method_23760().method_23761());
        }
    }

    @Inject(method={"findCrosshairTarget"}, at={@At(value="HEAD")}, cancellable=true)
    private void findCrosshairTarget(class_1297 class_12972, double d2, double d3, float f2, CallbackInfoReturnable<class_239> callbackInfoReturnable) {
        if (c.L.p()) {
            callbackInfoReturnable.setReturnValue((Object)Q.X(c.L.h(), c.L.k(), c.L.Y(), c.L.R(), c.L.z()));
            return;
        }
        double d4 = Math.max(d2, d3);
        double d5 = class_3532.method_33723((double)d4);
        class_243 class_2432 = class_12972.method_5836(f2);
        e.V.t = e.V.Q();
        class_239 class_2392 = class_12972.method_5745(d4, f2, false);
        e.V.t = false;
        double d6 = class_2392.method_17784().method_1025(class_2432);
        if (class_2392.method_17783() != class_239.class_240.field_1333) {
            d5 = d6;
            d4 = Math.sqrt(d6);
        }
        class_243 class_2433 = class_12972.method_5828(f2);
        class_243 class_2434 = class_2432.method_1031(class_2433.field_1352 * d4, class_2433.field_1351 * d4, class_2433.field_1350 * d4);
        class_238 class_2382 = class_12972.method_5829().method_18804(class_2433.method_1021(d4)).method_1009(1.0, 1.0, 1.0);
        if (!e.V.B()) {
            class_3966 class_39662 = class_1675.method_18075((class_1297)class_12972, (class_243)class_2432, (class_243)class_2434, (class_238)class_2382, MixinGameRenderer::lambda$findCrosshairTarget$0, (double)d5);
            callbackInfoReturnable.setReturnValue((Object)(class_39662 != null && class_39662.method_17784().method_1025(class_2432) < d6 ? MixinGameRenderer.method_56154((class_239)class_39662, class_2432, d3) : MixinGameRenderer.method_56154(class_2392, class_2432, d2)));
        } else {
            callbackInfoReturnable.setReturnValue((Object)MixinGameRenderer.method_56154(class_2392, class_2432, d2));
        }
    }

    private static boolean lambda$findCrosshairTarget$0(class_1297 class_12972) {
        return !class_12972.method_7325() && class_12972.method_5863();
    }
}

