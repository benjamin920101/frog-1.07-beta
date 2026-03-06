/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.projectile.FireworkRocketEntity
 *  net.minecraft.particle.ParticleEffect
 *  net.minecraft.particle.ParticleTypes
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.sound.SoundEvents
 *  net.minecraft.sound.SoundCategory
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.At$Shift
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.Redirect
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package dev.idhammai.asm.mixins;

import dev.idhammai.Frog;
import dev.idhammai.P.A.J;
import dev.idhammai.P.r.c.d;
import dev.idhammai.P.r.c.e;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.FireworkRocketEntity;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.Vec3d;
import net.minecraft.sound.SoundEvents;
import net.minecraft.sound.SoundCategory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_1671.class})
public class MixinFireworkRocketEntity
implements J {
    @Shadow
    private int field_7613;

    @Inject(method={"tick"}, at={@At(value="INVOKE", target="Lnet/minecraft/entity/projectile/FireworkRocketEntity;updateRotation()V", shift=At.Shift.AFTER)}, cancellable=true)
    private void hookTickPre(CallbackInfo callbackInfo) {
        class_1671 class_16712 = (class_1671)class_1671.class.cast(this);
        d d2 = d.y(class_16712);
        Frog.EVENT_BUS.J(d2);
        if (d2.p()) {
            callbackInfo.cancel();
            if (this.field_7613 == 0 && !class_16712.method_5701()) {
                MixinFireworkRocketEntity.W.field_1687.method_43128(null, class_16712.method_23317(), class_16712.method_23318(), class_16712.method_23321(), class_3417.field_14702, class_3419.field_15256, 3.0f, 1.0f);
            }
            ++this.field_7613;
            if (MixinFireworkRocketEntity.W.field_1687.field_9236) {
                MixinFireworkRocketEntity.W.field_1687.method_8406((class_2394)class_2398.field_11248, class_16712.method_23317(), class_16712.method_23318(), class_16712.method_23321(), MixinFireworkRocketEntity.W.field_1687.field_9229.method_43059() * 0.05, -class_16712.method_18798().field_1351 * 0.5, MixinFireworkRocketEntity.W.field_1687.field_9229.method_43059() * 0.05);
            }
        }
    }

    @Redirect(method={"tick"}, at=@At(value="INVOKE", target="Lnet/minecraft/entity/LivingEntity;getRotationVector()Lnet/minecraft/util/math/Vec3d;"), require=0)
    public class_243 hook(class_1309 class_13092) {
        e e2 = e.k(class_13092, class_13092.method_36454(), class_13092.method_36455());
        Frog.EVENT_BUS.J(e2);
        if (e2.p()) {
            return e2.R();
        }
        return class_13092.method_5720();
    }
}

