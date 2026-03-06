/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.screen.ScreenHandler
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package dev.idhammai.asm.accessors;

import net.minecraft.screen.ScreenHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_1703.class})
public interface IScreenHandler {
    @Accessor(value="revision")
    public int getRevision();

    @Accessor(value="revision")
    public void setRevision(int var1);
}

