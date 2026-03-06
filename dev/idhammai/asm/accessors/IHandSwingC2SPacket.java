/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.Hand
 *  net.minecraft.network.packet.c2s.play.HandSwingC2SPacket
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package dev.idhammai.asm.accessors;

import net.minecraft.util.Hand;
import net.minecraft.network.packet.c2s.play.HandSwingC2SPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_2879.class})
public interface IHandSwingC2SPacket {
    @Accessor(value="hand")
    public class_1268 getHand();
}

