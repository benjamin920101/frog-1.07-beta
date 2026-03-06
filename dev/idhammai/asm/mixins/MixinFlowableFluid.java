/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2350
 *  net.minecraft.class_3609
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Redirect
 */
package dev.idhammai.asm.mixins;

import dev.idhammai.c.r.q.D.f;
import java.util.Iterator;
import net.minecraft.class_2350;
import net.minecraft.class_3609;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={class_3609.class})
public class MixinFlowableFluid {
    @Redirect(method={"getVelocity"}, at=@At(value="INVOKE", target="Ljava/util/Iterator;hasNext()Z", ordinal=0), require=0)
    private boolean getVelocity_hasNext(Iterator<class_2350> iterator) {
        if (f.V.p() && f.V.H.h()) {
            return false;
        }
        return iterator.hasNext();
    }
}

