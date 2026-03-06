/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_303$class_7590
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 */
package dev.idhammai.asm.mixins;

import dev.idhammai.P.A.A.d;
import dev.idhammai.P.V.D;
import net.minecraft.class_303;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(value={class_303.class_7590.class})
public class MixinChatHudLineVisible
implements D {
    @Unique
    private int id = 0;
    @Unique
    private boolean sync = false;
    @Unique
    private d fade;

    @Override
    public int frogClient$getMessageId() {
        return this.id;
    }

    @Override
    public void frogClient$setMessageId(int n2) {
        this.id = n2;
    }

    @Override
    public boolean frogClient$getSync() {
        return this.sync;
    }

    @Override
    public void frogClient$setSync(boolean bl) {
        this.sync = bl;
    }

    @Override
    public d frogClient$getFade() {
        return this.fade;
    }

    @Override
    public void frogClient$setFade(d d2) {
        this.fade = d2;
    }
}

