/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_124
 *  net.minecraft.class_309
 *  net.minecraft.class_333
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.Redirect
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package dev.idhammai.asm.mixins;

import dev.idhammai.Frog;
import dev.idhammai.P.A.J;
import dev.idhammai.c.r.q.N.I;
import dev.idhammai.p.J.S;
import net.minecraft.class_124;
import net.minecraft.class_309;
import net.minecraft.class_333;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_309.class})
public class MixinKeyboard
implements J {
    @Inject(method={"onKey"}, at={@At(value="HEAD")})
    private void onKey(long l2, int n2, int n3, int n4, int n5, CallbackInfo callbackInfo) {
        block4: {
            try {
                if (n4 == 1) {
                    Frog.MODULE.e(n2);
                }
                if (n4 == 0) {
                    Frog.MODULE.C(n2);
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
                if (!I.Q.M.h()) break block4;
                S.z(String.valueOf(class_124.field_1079) + "[ERROR] onKey " + exception.getMessage());
            }
        }
    }

    @Redirect(method={"onKey"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/util/NarratorManager;isActive()Z"), require=0)
    public boolean hook(class_333 class_3332) {
        return false;
    }
}

