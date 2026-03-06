/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelPart$Quad
 *  net.minecraft.client.model.ModelPart$Cuboid
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package dev.idhammai.asm.accessors;

import net.minecraft.client.model.ModelPart;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_630.class_628.class})
public interface IModelPartCuboid {
    @Accessor(value="sides")
    public class_630.class_593[] getSides();
}

