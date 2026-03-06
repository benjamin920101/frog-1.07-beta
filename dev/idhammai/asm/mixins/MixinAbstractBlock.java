/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.BlockView
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.shape.VoxelShapes
 *  net.minecraft.util.shape.VoxelShape
 *  net.minecraft.block.BlockState
 *  net.minecraft.block.ShapeContext
 *  net.minecraft.block.AbstractBlock
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package dev.idhammai.asm.mixins;

import dev.idhammai.Frog;
import dev.idhammai.P.r.c.h;
import dev.idhammai.c.r.q.i.a;
import net.minecraft.world.BlockView;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.AbstractBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_4970.class})
public abstract class MixinAbstractBlock {
    @Inject(method={"getAmbientOcclusionLightLevel"}, at={@At(value="HEAD")}, cancellable=true)
    private void onGetAmbientOcclusionLightLevel(class_2680 class_26802, class_1922 class_19222, class_2338 class_23382, CallbackInfoReturnable<Float> callbackInfoReturnable) {
        h h2 = Frog.EVENT_BUS.J(h.w());
        if (h2.Q != -1.0f) {
            callbackInfoReturnable.setReturnValue((Object)Float.valueOf(h2.Q));
        }
    }

    @Inject(method={"getCollisionShape"}, at={@At(value="HEAD")}, cancellable=true)
    private void onComputeNextCollisionBox(class_2680 class_26802, class_1922 class_19222, class_2338 class_23382, class_3726 class_37262, CallbackInfoReturnable<class_265> callbackInfoReturnable) {
        if (a.D5 != null && class_23382.equals((Object)a.q()) && a.D5.DU.h() && a.Dt) {
            callbackInfoReturnable.setReturnValue((Object)class_259.method_1073());
        }
    }
}

