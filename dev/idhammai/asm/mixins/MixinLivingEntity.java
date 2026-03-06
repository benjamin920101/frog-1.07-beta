/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.effect.StatusEffect
 *  net.minecraft.entity.effect.StatusEffects
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.Entity$RemovalReason
 *  net.minecraft.entity.EntityType
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.attribute.EntityAttribute
 *  net.minecraft.entity.attribute.EntityAttributeModifier
 *  net.minecraft.entity.attribute.EntityAttributeInstance
 *  net.minecraft.world.World
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.entity.attribute.AttributeContainer
 *  net.minecraft.entity.attribute.EntityAttributes
 *  net.minecraft.registry.entry.RegistryEntry
 *  org.jetbrains.annotations.Nullable
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.Redirect
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package dev.idhammai.asm.mixins;

import dev.idhammai.Frog;
import dev.idhammai.P.r.c.U;
import dev.idhammai.P.r.c.r;
import dev.idhammai.c.r.q.D.Q;
import dev.idhammai.c.r.q.D.R;
import dev.idhammai.c.r.q.D.f;
import dev.idhammai.c.r.q.D.z;
import dev.idhammai.c.r.q.i.L;
import dev.idhammai.c.r.q.n.P;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributeInstance;
import net.minecraft.world.World;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.registry.entry.RegistryEntry;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_1309.class})
public abstract class MixinLivingEntity
extends class_1297 {
    @Final
    @Shadow
    private static class_1322 field_6231;
    @Unique
    private boolean previousElytra = false;
    @Unique
    private long lastLerp = 0L;

    public MixinLivingEntity(class_1299<?> class_12992, class_1937 class_19372) {
        super(class_12992, class_19372);
    }

    @Shadow
    @Nullable
    public class_1324 method_5996(class_6880<class_1320> class_68802) {
        return this.method_6127().method_45329(class_68802);
    }

    @Shadow
    public class_5131 method_6127() {
        return null;
    }

    @Shadow
    public abstract void method_5650(class_1297.class_5529 var1);

    @Inject(method={"getHandSwingDuration"}, at={@At(value="HEAD")}, cancellable=true)
    private void getArmSwingAnimationEnd(CallbackInfoReturnable<Integer> callbackInfoReturnable) {
        if (P.M.p() && P.M.F.h()) {
            callbackInfoReturnable.setReturnValue((Object)P.M.t.V());
        }
    }

    @Inject(method={"isFallFlying"}, at={@At(value="TAIL")}, cancellable=true)
    public void recastOnLand(CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        boolean bl = (Boolean)callbackInfoReturnable.getReturnValue();
        if (this.previousElytra && !bl && Q.F.p() && Q.F.QQ.x(R.Bounce)) {
            callbackInfoReturnable.setReturnValue((Object)Q.O(class_310.method_1551().field_1724));
        }
        this.previousElytra = bl;
    }

    @Redirect(method={"travel"}, at=@At(value="INVOKE", target="Lnet/minecraft/entity/LivingEntity;hasStatusEffect(Lnet/minecraft/registry/entry/RegistryEntry;)Z"), require=0)
    private boolean travelEffectHook(class_1309 class_13092, class_6880<class_1291> class_68802) {
        if (L.k.p()) {
            if (class_68802 == class_1294.field_5906 && L.k.g.h()) {
                return false;
            }
            if (class_68802 == class_1294.field_5902 && L.k.r.h()) {
                return false;
            }
        }
        return class_13092.method_6059(class_68802);
    }

    @Redirect(method={"applyMovementInput"}, at=@At(value="INVOKE", target="Lnet/minecraft/entity/LivingEntity;isClimbing()Z"), require=0)
    public boolean climbingHook(class_1309 class_13092) {
        if (f.V.p() && f.V.r.h() && class_1309.class.cast((Object)this) == class_310.method_1551().field_1724) {
            return false;
        }
        return class_13092.method_6101();
    }

    @Redirect(method={"applyClimbingSpeed"}, at=@At(value="INVOKE", target="Lnet/minecraft/entity/LivingEntity;isClimbing()Z"), require=0)
    public boolean climbingHook2(class_1309 class_13092) {
        if (z.f.T() && class_1309.class.cast((Object)this) == class_310.method_1551().field_1724) {
            return false;
        }
        return class_13092.method_6101();
    }

    @Inject(method={"updateTrackedPositionAndAngles"}, at={@At(value="HEAD")})
    private void lerpToHook(double d2, double d3, double d4, float f2, float f3, int n2, CallbackInfo callbackInfo) {
        Frog.EVENT_BUS.J(U.z((class_1309)class_1309.class.cast((Object)this), d2, d3, d4, f2, f3, this.lastLerp));
        this.lastLerp = System.currentTimeMillis();
    }

    @Inject(method={"setSprinting"}, at={@At(value="HEAD")}, cancellable=true)
    public void setSprintingHook(boolean bl, CallbackInfo callbackInfo) {
        if (class_1309.class.cast((Object)this) == class_310.method_1551().field_1724) {
            r r2 = r.w();
            Frog.EVENT_BUS.J(r2);
            if (r2.p()) {
                callbackInfo.cancel();
                bl = r2.I();
                super.method_5728(bl);
                class_1324 class_13242 = this.method_5996((class_6880<class_1320>)class_5134.field_23719);
                class_13242.method_6200(field_6231.comp_2447());
                if (bl) {
                    class_13242.method_26835(field_6231);
                }
            }
        }
    }
}

