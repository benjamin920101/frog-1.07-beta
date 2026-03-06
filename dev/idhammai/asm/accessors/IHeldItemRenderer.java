/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.ItemStack
 *  net.minecraft.client.render.item.HeldItemRenderer
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package dev.idhammai.asm.accessors;

import net.minecraft.item.ItemStack;
import net.minecraft.client.render.item.HeldItemRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_759.class})
public interface IHeldItemRenderer {
    @Accessor(value="equipProgressMainHand")
    public float getEquippedProgressMainHand();

    @Accessor(value="equipProgressMainHand")
    public void setEquippedProgressMainHand(float var1);

    @Accessor(value="equipProgressOffHand")
    public float getEquippedProgressOffHand();

    @Accessor(value="equipProgressOffHand")
    public void setEquippedProgressOffHand(float var1);

    @Accessor(value="mainHand")
    public void setItemStackMainHand(class_1799 var1);

    @Accessor(value="offHand")
    public void setItemStackOffHand(class_1799 var1);
}

