/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1309
 *  net.minecraft.class_1671
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 *  org.spongepowered.asm.mixin.gen.Invoker
 */
package dev.idhammai.asm.accessors;

import net.minecraft.class_1309;
import net.minecraft.class_1671;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(value={class_1671.class})
public interface IFireworkRocketEntity {
    @Accessor(value="shooter")
    public class_1309 getShooter();

    @Invoker(value="wasShotByEntity")
    public boolean hookWasShotByEntity();

    @Invoker(value="explodeAndRemove")
    public void hookExplodeAndRemove();
}

