/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.client.render.VertexConsumerProvider
 *  net.minecraft.client.render.entity.model.EntityModel
 *  net.minecraft.client.render.entity.LivingEntityRenderer
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyArgs
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.invoke.arg.Args
 */
package dev.idhammai.asm.mixins;

import dev.idhammai.P.A.A.A;
import dev.idhammai.P.A.J;
import dev.idhammai.c.r.q.N.I;
import dev.idhammai.c.r.q.n.N;
import dev.idhammai.p.J.G;
import java.awt.Color;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(value={class_922.class})
public abstract class MixinLivingEntityRenderer<T extends class_1309, M extends class_583<T>> {
    @Unique
    private class_1309 lastEntity;
    @Unique
    private float originalYaw;
    @Unique
    private float originalHeadYaw;
    @Unique
    private float originalBodyYaw;
    @Unique
    private float originalPitch;
    @Unique
    private float originalPrevYaw;
    @Unique
    private float originalPrevHeadYaw;
    @Unique
    private float originalPrevBodyYaw;

    @Inject(method={"render*"}, at={@At(value="HEAD")})
    public void onRenderPre(T t2, float f2, float f3, class_4587 class_45872, class_4597 class_45972, int n2, CallbackInfo callbackInfo) {
        if (class_310.method_1551().field_1724 != null && t2 == class_310.method_1551().field_1724 && I.Q.A.h()) {
            this.originalYaw = t2.method_36454();
            this.originalHeadYaw = ((class_1309)t2).field_6241;
            this.originalBodyYaw = ((class_1309)t2).field_6283;
            this.originalPitch = t2.method_36455();
            this.originalPrevYaw = ((class_1309)t2).field_5982;
            this.originalPrevHeadYaw = ((class_1309)t2).field_6259;
            this.originalPrevBodyYaw = ((class_1309)t2).field_6220;
            t2.method_36456(G.e());
            ((class_1309)t2).field_6241 = G.r();
            ((class_1309)t2).field_6283 = G.e();
            t2.method_36457(G.L());
            ((class_1309)t2).field_5982 = G.p();
            ((class_1309)t2).field_6259 = G.t();
            ((class_1309)t2).field_6220 = G.p();
            ((class_1309)t2).field_6004 = G.c();
        }
        this.lastEntity = t2;
    }

    @Inject(method={"render*"}, at={@At(value="TAIL")})
    public void onRenderPost(T t2, float f2, float f3, class_4587 class_45872, class_4597 class_45972, int n2, CallbackInfo callbackInfo) {
        if (class_310.method_1551().field_1724 != null && t2 == class_310.method_1551().field_1724 && I.Q.A.h()) {
            t2.method_36456(this.originalYaw);
            ((class_1309)t2).field_6241 = this.originalHeadYaw;
            ((class_1309)t2).field_6283 = this.originalBodyYaw;
            t2.method_36457(this.originalPitch);
            ((class_1309)t2).field_5982 = this.originalPrevYaw;
            ((class_1309)t2).field_6259 = this.originalPrevHeadYaw;
            ((class_1309)t2).field_6220 = this.originalPrevBodyYaw;
            ((class_1309)t2).field_6004 = this.originalPitch;
        }
    }

    @ModifyArgs(method={"render*"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/render/entity/model/EntityModel;render(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumer;III)V"))
    private void renderHook(Args args) {
        class_1657 class_16572;
        class_1309 class_13092;
        float f2 = -1.0f;
        if (N.Q.p() && N.Q.g.h() && this.lastEntity != J.W.field_1724 && (class_13092 = this.lastEntity) instanceof class_1657 && !(class_16572 = (class_1657)class_13092).method_5767()) {
            f2 = A.p((float)(J.W.field_1724.method_5707(this.lastEntity.method_19538()) / 3.0) + 0.2f, 0.0f, 1.0f);
        }
        if (f2 != -1.0f) {
            args.set(4, (Object)this.applyOpacity(0x26FFFFFF, f2));
        }
    }

    @Unique
    int applyOpacity(int n2, float f2) {
        f2 = Math.min(1.0f, Math.max(0.0f, f2));
        Color color = new Color(n2);
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), (int)((float)color.getAlpha() * f2)).getRGB();
    }
}

