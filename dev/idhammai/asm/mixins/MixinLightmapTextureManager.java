/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.texture.NativeImage
 *  net.minecraft.client.texture.NativeImageBackedTexture
 *  net.minecraft.entity.effect.StatusEffect
 *  net.minecraft.entity.effect.StatusEffectInstance
 *  net.minecraft.entity.effect.StatusEffects
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.world.dimension.DimensionType
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.registry.entry.RegistryEntry
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.render.GameRenderer
 *  net.minecraft.client.render.LightmapTextureManager
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.Redirect
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package dev.idhammai.asm.mixins;

import dev.idhammai.c.r.q.n.J;
import dev.idhammai.c.r.q.n.N;
import java.awt.Color;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.client.texture.NativeImageBackedTexture;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.LivingEntity;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.render.LightmapTextureManager;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_765.class})
public class MixinLightmapTextureManager {
    @Final
    @Shadow
    private class_1043 field_4138;
    @Final
    @Shadow
    private class_1011 field_4133;
    @Shadow
    private boolean field_4135;
    @Shadow
    private float field_21528;
    @Final
    @Shadow
    private class_757 field_4134;
    @Final
    @Shadow
    private class_310 field_4137;

    @Shadow
    private static void method_46557(Vector3f vector3f) {
        vector3f.set(class_3532.method_15363((float)vector3f.x, (float)0.0f, (float)1.0f), class_3532.method_15363((float)vector3f.y, (float)0.0f, (float)1.0f), class_3532.method_15363((float)vector3f.z, (float)0.0f, (float)1.0f));
    }

    @Shadow
    public static float method_23284(class_2874 class_28742, int n2) {
        float f2 = (float)n2 / 15.0f;
        float f3 = f2 / (4.0f - 3.0f * f2);
        return class_3532.method_16439((float)class_28742.comp_656(), (float)f3, (float)1.0f);
    }

    @Redirect(method={"update"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/network/ClientPlayerEntity;hasStatusEffect(Lnet/minecraft/registry/entry/RegistryEntry;)Z", ordinal=0, remap=false), require=0)
    private boolean nightVisionHook(class_746 class_7462, class_6880<class_1291> class_68802) {
        if (J.d.p() && J.d.e.h()) {
            return true;
        }
        return class_7462.method_6059(class_68802);
    }

    @Inject(method={"update"}, at={@At(value="HEAD")}, cancellable=true)
    public void updateHook(float f2, CallbackInfo callbackInfo) {
        if (J.d.p() && J.d.D.i) {
            callbackInfo.cancel();
            if (this.field_4135) {
                this.field_4135 = false;
                this.field_4137.method_16011().method_15396("lightTex");
                class_638 class_6382 = this.field_4137.field_1687;
                if (class_6382 != null) {
                    float f3 = class_6382.method_23783(1.0f);
                    float f4 = class_6382.method_23789() > 0 ? 1.0f : f3 * 0.95f + 0.05f;
                    float f5 = ((Double)this.field_4137.field_1690.method_42472().method_41753()).floatValue();
                    float f6 = this.method_42597(f2) * f5;
                    float f7 = this.method_42596((class_1309)this.field_4137.field_1724, f6, f2) * f5;
                    Vector3f vector3f = new Vector3f(f3, f3, 1.0f).lerp((Vector3fc)new Vector3f(1.0f, 1.0f, 1.0f), 0.35f);
                    float f8 = this.field_21528 + 1.5f;
                    Vector3f vector3f2 = new Vector3f();
                    for (int i2 = 0; i2 < 16; ++i2) {
                        for (int i3 = 0; i3 < 16; ++i3) {
                            float f9 = MixinLightmapTextureManager.method_23284(class_6382.method_8597(), i2) * f4;
                            float f10 = MixinLightmapTextureManager.method_23284(class_6382.method_8597(), i3) * f8;
                            float f11 = f10 * ((f10 * 0.6f + 0.4f) * 0.6f + 0.4f);
                            float f12 = f10 * (f10 * f10 * 0.6f + 0.4f);
                            vector3f2.set(f10, f11, f12);
                            boolean bl = class_6382.method_28103().method_28114();
                            if (bl) {
                                vector3f2.lerp((Vector3fc)new Vector3f(0.99f, 1.12f, 1.0f), 0.25f);
                                MixinLightmapTextureManager.method_46557(vector3f2);
                            } else {
                                Vector3f vector3f3 = new Vector3f((Vector3fc)vector3f).mul(f9);
                                vector3f2.add((Vector3fc)vector3f3);
                                vector3f2.lerp((Vector3fc)new Vector3f(0.75f, 0.75f, 0.75f), 0.04f);
                                if (this.field_4134.method_3195(f2) > 0.0f) {
                                    float f13 = this.field_4134.method_3195(f2);
                                    Vector3f vector3f4 = new Vector3f((Vector3fc)vector3f2).mul(0.7f, 0.6f, 0.6f);
                                    vector3f2.lerp((Vector3fc)vector3f4, f13);
                                }
                            }
                            float f14 = Math.max(vector3f2.x(), Math.max(vector3f2.y(), vector3f2.z()));
                            if (f14 < 1.0f) {
                                this.field_4133.method_4305(i3, i2, new Color(J.d.D.P().getBlue(), J.d.D.P().getGreen(), J.d.D.P().getRed(), J.d.D.P().getAlpha()).getRGB());
                                continue;
                            }
                            if (!bl) {
                                if (f7 > 0.0f) {
                                    vector3f2.add(-f7, -f7, -f7);
                                }
                                MixinLightmapTextureManager.method_46557(vector3f2);
                            }
                            f14 = ((Double)this.field_4137.field_1690.method_42473().method_41753()).floatValue();
                            Vector3f vector3f5 = new Vector3f(this.method_23795(vector3f2.x), this.method_23795(vector3f2.y), this.method_23795(vector3f2.z));
                            vector3f2.lerp((Vector3fc)vector3f5, Math.max(0.0f, f14 - f6));
                            vector3f2.lerp((Vector3fc)new Vector3f(0.75f, 0.75f, 0.75f), 0.04f);
                            MixinLightmapTextureManager.method_46557(vector3f2);
                            vector3f2.mul(255.0f);
                            int n2 = (int)vector3f2.x();
                            int n3 = (int)vector3f2.y();
                            int n4 = (int)vector3f2.z();
                            this.field_4133.method_4305(i3, i2, 0xFF000000 | n4 << 16 | n3 << 8 | n2);
                        }
                    }
                    this.field_4138.method_4524();
                    this.field_4137.method_16011().method_15407();
                }
            }
        }
    }

    @Inject(method={"getDarknessFactor(F)F"}, at={@At(value="HEAD")}, cancellable=true)
    private void getDarknessFactor(float f2, CallbackInfoReturnable<Float> callbackInfoReturnable) {
        if (N.Q.p() && N.Q.d.h()) {
            callbackInfoReturnable.setReturnValue((Object)Float.valueOf(0.0f));
        }
    }

    @Shadow
    private float method_23795(float f2) {
        float f3 = 1.0f - f2;
        return 1.0f - f3 * f3 * f3 * f3;
    }

    @Shadow
    private float method_42597(float f2) {
        class_1293 class_12932 = this.field_4137.field_1724.method_6112(class_1294.field_38092);
        return class_12932 != null ? class_12932.method_55653((class_1309)this.field_4137.field_1724, f2) : 0.0f;
    }

    @Shadow
    private float method_42596(class_1309 class_13092, float f2, float f3) {
        float f4 = 0.45f * f2;
        return Math.max(0.0f, class_3532.method_15362((float)(((float)class_13092.field_6012 - f3) * (float)Math.PI * 0.025f)) * f4);
    }
}

