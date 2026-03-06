/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap
 *  net.minecraft.util.ActionResult
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.world.World
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockState
 *  net.minecraft.state.property.Property
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.block.AbstractBlock$AbstractBlockState
 *  org.spongepowered.asm.mixin.Mixin
 */
package dev.idhammai.asm.mixins;

import com.mojang.serialization.MapCodec;
import dev.idhammai.Frog;
import dev.idhammai.P.r.c.f;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import net.minecraft.util.ActionResult;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.property.Property;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.block.AbstractBlock;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value={class_2680.class})
public abstract class MixinBlockState
extends class_4970.class_4971 {
    public MixinBlockState(class_2248 class_22482, Reference2ObjectArrayMap<class_2769<?>, Comparable<?>> reference2ObjectArrayMap, MapCodec<class_2680> mapCodec) {
        super(class_22482, reference2ObjectArrayMap, mapCodec);
    }

    public class_1269 method_55781(class_1937 class_19372, class_1657 class_16572, class_3965 class_39652) {
        Frog.EVENT_BUS.J(f.Z((class_2680)class_2680.class.cast((Object)this)));
        return super.method_55781(class_19372, class_16572, class_39652);
    }
}

