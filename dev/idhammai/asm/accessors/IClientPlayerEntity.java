/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_746
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package dev.idhammai.asm.accessors;

import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_746.class})
public interface IClientPlayerEntity {
    @Accessor(value="ticksSinceLastPositionPacketSent")
    public void setTicksSinceLastPositionPacketSent(int var1);

    @Accessor(value="lastYaw")
    public float getLastYaw();

    @Accessor(value="lastYaw")
    public void setLastYaw(float var1);

    @Accessor(value="lastPitch")
    public float getLastPitch();

    @Accessor(value="lastPitch")
    public void setLastPitch(float var1);
}

