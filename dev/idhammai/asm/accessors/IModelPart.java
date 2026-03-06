/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_630
 *  net.minecraft.class_630$class_628
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package dev.idhammai.asm.accessors;

import java.util.List;
import java.util.Map;
import net.minecraft.class_630;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_630.class})
public interface IModelPart {
    @Accessor(value="cuboids")
    public List<class_630.class_628> getCuboids();

    @Accessor(value="children")
    public Map<String, class_630> getChildren();
}

