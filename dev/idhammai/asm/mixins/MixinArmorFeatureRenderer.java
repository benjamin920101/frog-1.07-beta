/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.item.ArmorMaterial
 *  net.minecraft.util.Identifier
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.client.render.VertexConsumerProvider
 *  net.minecraft.client.render.entity.model.BipedEntityModel
 *  net.minecraft.registry.entry.RegistryEntry
 *  net.minecraft.item.trim.ArmorTrim
 *  net.minecraft.client.render.entity.feature.ArmorFeatureRenderer
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package dev.idhammai.asm.mixins;

import dev.idhammai.c.r.q.n.N;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.util.Identifier;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.item.trim.ArmorTrim;
import net.minecraft.client.render.entity.feature.ArmorFeatureRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_970.class})
public class MixinArmorFeatureRenderer<T extends class_1309, A extends class_572<T>> {
    @Inject(method={"renderArmorParts"}, at={@At(value="HEAD")}, cancellable=true)
    private void onRenderArmorParts(class_4587 class_45872, class_4597 class_45972, int n2, A a2, int n3, class_2960 class_29602, CallbackInfo callbackInfo) {
        if (N.Q.p() && N.Q.Z.h()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"renderTrim"}, at={@At(value="HEAD")}, cancellable=true)
    private void onRenderArmorTrim(class_6880<class_1741> class_68802, class_4587 class_45872, class_4597 class_45972, int n2, class_8053 class_80532, A a2, boolean bl, CallbackInfo callbackInfo) {
        if (N.Q.p() && N.Q.u.h()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"renderGlint"}, at={@At(value="HEAD")}, cancellable=true)
    private void onRenderArmorGlint(class_4587 class_45872, class_4597 class_45972, int n2, A a2, CallbackInfo callbackInfo) {
        if (N.Q.p() && N.Q.e.h()) {
            callbackInfo.cancel();
        }
    }
}

