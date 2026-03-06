/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.sugar.Local
 *  com.llamalad7.mixinextras.sugar.ref.LocalIntRef
 *  net.minecraft.class_355
 *  net.minecraft.class_640
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.At$Shift
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package dev.idhammai.asm.mixins;

import com.llamalad7.mixinextras.sugar.Local;
import com.llamalad7.mixinextras.sugar.ref.LocalIntRef;
import dev.idhammai.P.A.J;
import dev.idhammai.c.r.q.x.S;
import java.util.Comparator;
import java.util.List;
import net.minecraft.class_355;
import net.minecraft.class_640;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_355.class})
public abstract class MixinPlayerListHud {
    @Final
    @Shadow
    private static Comparator<class_640> field_2156;

    @Shadow
    protected abstract List<class_640> method_48213();

    @Inject(method={"collectPlayerEntries"}, at={@At(value="HEAD")}, cancellable=true)
    private void collectPlayerEntriesHook(CallbackInfoReturnable<List<class_640>> callbackInfoReturnable) {
        if (S.f.p()) {
            callbackInfoReturnable.setReturnValue(J.W.field_1724.field_3944.method_45732().stream().sorted(field_2156).limit(S.f.n.V()).toList());
        }
    }

    @Inject(method={"render"}, at={@At(value="INVOKE", target="Ljava/lang/Math;min(II)I", shift=At.Shift.BEFORE)})
    private void hookRender(CallbackInfo callbackInfo, @Local(ordinal=5) LocalIntRef localIntRef, @Local(ordinal=6) LocalIntRef localIntRef2) {
        int n2 = this.method_48213().size();
        int n3 = 1;
        int n4 = (n2 + n3 - 1) / n3;
        while (n4 > S.f.K.V()) {
            n4 = (n2 + ++n3 - 1) / n3;
        }
        localIntRef.set(n4);
        localIntRef2.set(n3);
    }
}

