/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_1297
 *  net.minecraft.class_1511
 *  net.minecraft.class_1921
 *  net.minecraft.class_2338
 *  net.minecraft.class_2960
 *  net.minecraft.class_3532
 *  net.minecraft.class_4587
 *  net.minecraft.class_4588
 *  net.minecraft.class_4597
 *  net.minecraft.class_4608
 *  net.minecraft.class_5617$class_5618
 *  net.minecraft.class_5944
 *  net.minecraft.class_630
 *  net.minecraft.class_757
 *  net.minecraft.class_7833
 *  net.minecraft.class_892
 *  net.minecraft.class_895
 *  net.minecraft.class_897
 *  net.minecraft.class_918
 *  org.joml.Quaternionf
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Mutable
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package dev.idhammai.asm.mixins;

import com.mojang.blaze3d.systems.RenderSystem;
import dev.idhammai.P.A.S.Z;
import dev.idhammai.c.r.q.n.O;
import net.minecraft.class_1297;
import net.minecraft.class_1511;
import net.minecraft.class_1921;
import net.minecraft.class_2338;
import net.minecraft.class_2960;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_4608;
import net.minecraft.class_5617;
import net.minecraft.class_5944;
import net.minecraft.class_630;
import net.minecraft.class_757;
import net.minecraft.class_7833;
import net.minecraft.class_892;
import net.minecraft.class_895;
import net.minecraft.class_897;
import net.minecraft.class_918;
import org.joml.Quaternionf;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_892.class})
public abstract class MixinEndCrystalEntityRenderer
extends class_897<class_1511> {
    @Mutable
    @Final
    @Shadow
    private static class_1921 field_21736;
    @Shadow
    @Final
    private static class_2960 field_4663;
    @Unique
    private static final class_2960 BLANK;
    @Unique
    private static final class_1921 END_CRYSTAL_BLANK;
    @Unique
    private static final class_1921 END_CRYSTAL_CUSTOM;
    @Final
    @Shadow
    private static float field_21002;
    @Final
    @Shadow
    private class_630 field_21003;
    @Final
    @Shadow
    private class_630 field_21004;
    @Final
    @Shadow
    private class_630 field_21005;

    protected MixinEndCrystalEntityRenderer(class_5617.class_5618 class_56182) {
        super(class_56182);
    }

    @Unique
    private float yOffset(int n2, float f2, O o2) {
        float f3 = ((float)n2 + f2) * o2.r.Z();
        float f4 = class_3532.method_15374((float)(f3 * 0.2f)) / 2.0f + 0.5f;
        f4 = (f4 * f4 + f4) * 0.4f * o2.c.Z();
        return f4 - 1.4f + o2.y.Z();
    }

    @Inject(method={"render(Lnet/minecraft/entity/decoration/EndCrystalEntity;FFLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"}, at={@At(value="HEAD")}, cancellable=true)
    public void render(class_1511 class_15112, float f2, float f3, class_4587 class_45872, class_4597 class_45972, int n2, CallbackInfo callbackInfo) {
        O o2 = O.s;
        if (o2.D()) {
            class_5944 class_59442;
            callbackInfo.cancel();
            int n3 = o2.V.h() ? o2.M : class_15112.field_7034;
            float f4 = this.yOffset(n3, f3, o2);
            float f5 = ((float)n3 + f3) * 3.0f * o2.J.Z();
            class_45872.method_22903();
            if (o2.a.h()) {
                class_59442 = RenderSystem.getShader();
                if (o2.w.h()) {
                    RenderSystem.enableDepthTest();
                }
                RenderSystem.enableBlend();
                if (o2.F.h()) {
                    RenderSystem.setShaderTexture((int)0, (class_2960)field_4663);
                    RenderSystem.setShader(class_757::method_34543);
                } else {
                    RenderSystem.setShader(class_757::method_34540);
                }
                class_45872.method_22903();
                class_45872.method_22905(2.0f * o2.p.Z(), 2.0f * o2.p.Z(), 2.0f * o2.p.Z());
                class_45872.method_46416(0.0f, -0.5f, 0.0f);
                class_45872.method_22907(class_7833.field_40716.rotationDegrees(f5));
                class_45872.method_46416(0.0f, 1.5f + f4 / 2.0f, 0.0f);
                class_45872.method_22907(new Quaternionf().setAngleAxis(1.0471976f, field_21002, 0.0f, field_21002));
                if (o2.t.i) {
                    Z.h(class_45872, this.field_21004, o2.l, o2.b, 1.0, o2.F.h());
                }
                class_45872.method_22905(0.875f, 0.875f, 0.875f);
                class_45872.method_22907(new Quaternionf().setAngleAxis(1.0471976f, field_21002, 0.0f, field_21002));
                class_45872.method_22907(class_7833.field_40716.rotationDegrees(f5));
                if (o2.f.i) {
                    Z.h(class_45872, this.field_21004, o2.l, o2.b, 1.0, o2.F.h());
                }
                class_45872.method_22905(0.875f, 0.875f, 0.875f);
                class_45872.method_22907(new Quaternionf().setAngleAxis(1.0471976f, field_21002, 0.0f, field_21002));
                class_45872.method_22907(class_7833.field_40716.rotationDegrees(f5));
                if (o2.u.i) {
                    Z.h(class_45872, this.field_21003, o2.l, o2.b, 1.0, o2.F.h());
                }
                class_45872.method_22909();
                RenderSystem.setShader(() -> MixinEndCrystalEntityRenderer.lambda$render$0(class_59442));
                RenderSystem.disableBlend();
                RenderSystem.disableDepthTest();
            }
            class_59442 = class_918.method_23181((class_4597)class_45972, (class_1921)(o2.Y.h() ? END_CRYSTAL_CUSTOM : END_CRYSTAL_BLANK), (boolean)false, (boolean)o2.L.h());
            class_45872.method_22903();
            class_45872.method_22905(2.0f * o2.p.Z(), 2.0f * o2.p.Z(), 2.0f * o2.p.Z());
            class_45872.method_46416(0.0f, -0.5f, 0.0f);
            int n4 = class_4608.field_21444;
            if (class_15112.method_6836()) {
                this.field_21005.method_22698(class_45872, (class_4588)class_59442, n2, n4);
            }
            class_45872.method_22907(class_7833.field_40716.rotationDegrees(f5));
            class_45872.method_46416(0.0f, 1.5f + f4 / 2.0f, 0.0f);
            class_45872.method_22907(new Quaternionf().setAngleAxis(1.0471976f, field_21002, 0.0f, field_21002));
            if (o2.t.i) {
                this.field_21004.method_22699(class_45872, (class_4588)class_59442, n2, n4, o2.t.P().getRGB());
            }
            class_45872.method_22905(0.875f, 0.875f, 0.875f);
            class_45872.method_22907(new Quaternionf().setAngleAxis(1.0471976f, field_21002, 0.0f, field_21002));
            class_45872.method_22907(class_7833.field_40716.rotationDegrees(f5));
            if (o2.f.i) {
                this.field_21004.method_22699(class_45872, (class_4588)class_59442, n2, n4, o2.f.P().getRGB());
            }
            class_45872.method_22905(0.875f, 0.875f, 0.875f);
            class_45872.method_22907(new Quaternionf().setAngleAxis(1.0471976f, field_21002, 0.0f, field_21002));
            class_45872.method_22907(class_7833.field_40716.rotationDegrees(f5));
            if (o2.u.i) {
                this.field_21003.method_22699(class_45872, (class_4588)class_59442, n2, n4, o2.u.P().getRGB());
            }
            class_45872.method_22909();
            class_45872.method_22909();
            class_2338 class_23382 = class_15112.method_6838();
            if (class_23382 != null) {
                float f6 = (float)class_23382.method_10263() + 0.5f;
                float f7 = (float)class_23382.method_10264() + 0.5f;
                float f8 = (float)class_23382.method_10260() + 0.5f;
                float f9 = (float)((double)f6 - class_15112.method_23317());
                float f10 = (float)((double)f7 - class_15112.method_23318());
                float f11 = (float)((double)f8 - class_15112.method_23321());
                class_45872.method_46416(f9, f10, f11);
                class_895.method_3917((float)(-f9), (float)(-f10 + f4), (float)(-f11), (float)f3, (int)class_15112.field_7034, (class_4587)class_45872, (class_4597)class_45972, (int)n2);
            }
            super.method_3936((class_1297)class_15112, f2, f3, class_45872, class_45972, n2);
        }
    }

    private static class_5944 lambda$render$0(class_5944 class_59442) {
        return class_59442;
    }

    static {
        BLANK = class_2960.method_60654((String)"textures/blank.png");
        END_CRYSTAL_BLANK = class_1921.method_23580((class_2960)BLANK);
        END_CRYSTAL_CUSTOM = class_1921.method_23580((class_2960)field_4663);
    }
}

