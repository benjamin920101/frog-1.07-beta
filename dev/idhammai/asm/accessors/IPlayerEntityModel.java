/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_591
 *  net.minecraft.class_630
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package dev.idhammai.asm.accessors;

import net.minecraft.class_591;
import net.minecraft.class_630;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_591.class})
public interface IPlayerEntityModel {
    @Accessor(value="leftPants")
    public class_630 getLeftPants();

    @Accessor(value="rightPants")
    public class_630 getRightPants();

    @Accessor(value="leftSleeve")
    public class_630 getLeftSleeve();

    @Accessor(value="rightSleeve")
    public class_630 getRightSleeve();

    @Accessor(value="jacket")
    public class_630 getJacket();
}

