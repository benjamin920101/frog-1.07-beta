/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2846
 *  net.minecraft.class_2846$class_2847
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package dev.idhammai.asm.accessors;

import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2846;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_2846.class})
public interface IPlayerActionC2SPacket {
    @Accessor(value="pos")
    public class_2338 getPos();

    @Accessor(value="direction")
    public class_2350 getDirection();

    @Accessor(value="action")
    public class_2846.class_2847 getAction();
}

