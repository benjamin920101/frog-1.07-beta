/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.chunk.ChunkNibbleArray
 *  net.minecraft.world.chunk.light.LightStorage
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Redirect
 */
package dev.idhammai.asm.mixins;

import net.minecraft.world.chunk.ChunkNibbleArray;
import net.minecraft.world.chunk.light.LightStorage;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={class_3560.class})
public class MixinLightStorage {
    @Redirect(method={"get(Lnet/minecraft/world/chunk/ChunkNibbleArray;III)I"}, at=@At(value="INVOKE", target="Lnet/minecraft/world/chunk/ChunkNibbleArray;get(III)I"), require=0)
    private static int redirectChunkNibbleGetDesc(class_2804 class_28042, int n2, int n3, int n4) {
        if (class_28042 == null) {
            return 0;
        }
        return class_28042.method_12139(n2, n3, n4);
    }

    @Redirect(method={"get"}, at=@At(value="INVOKE", target="Lnet/minecraft/world/chunk/ChunkNibbleArray;get(III)I"), require=0)
    private static int redirectChunkNibbleGet(class_2804 class_28042, int n2, int n3, int n4) {
        if (class_28042 == null) {
            return 0;
        }
        return class_28042.method_12139(n2, n3, n4);
    }
}

