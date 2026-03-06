/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_2885
 *  net.minecraft.class_3965
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package dev.idhammai.asm.accessors;

import net.minecraft.class_1268;
import net.minecraft.class_2885;
import net.minecraft.class_3965;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_2885.class})
public interface IPlayerInteractBlockC2SPacket {
    @Accessor(value="blockHitResult")
    public class_3965 getBlockHitResult();

    @Accessor(value="hand")
    public class_1268 getHand();
}

