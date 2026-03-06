/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1297$class_5529
 *  net.minecraft.class_1937
 *  net.minecraft.class_243
 *  net.minecraft.class_2874
 *  net.minecraft.class_3695
 *  net.minecraft.class_5269
 *  net.minecraft.class_5294
 *  net.minecraft.class_5294$class_5297
 *  net.minecraft.class_5321
 *  net.minecraft.class_5455
 *  net.minecraft.class_638
 *  net.minecraft.class_6880
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package dev.idhammai.asm.mixins;

import dev.idhammai.Frog;
import dev.idhammai.P.r.c.C;
import dev.idhammai.P.r.c.I;
import dev.idhammai.P.r.c.Q3;
import dev.idhammai.P.r.c.Qd;
import dev.idhammai.c.r.q.n.J;
import dev.idhammai.c.r.q.n.N;
import java.awt.Color;
import java.util.function.Supplier;
import net.minecraft.class_1297;
import net.minecraft.class_1937;
import net.minecraft.class_243;
import net.minecraft.class_2874;
import net.minecraft.class_3695;
import net.minecraft.class_5269;
import net.minecraft.class_5294;
import net.minecraft.class_5321;
import net.minecraft.class_5455;
import net.minecraft.class_638;
import net.minecraft.class_6880;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_638.class})
public abstract class MixinClientWorld
extends class_1937 {
    @Unique
    private final class_5294 overworld = new class_5294.class_5297();

    protected MixinClientWorld(class_5269 class_52692, class_5321<class_1937> class_53212, class_5455 class_54552, class_6880<class_2874> class_68802, Supplier<class_3695> supplier, boolean bl, boolean bl2, long l2, int n2) {
        super(class_52692, class_53212, class_54552, class_68802, supplier, bl, bl2, l2, n2);
    }

    @Inject(method={"tickEntity"}, at={@At(value="HEAD")}, cancellable=true)
    public void onTickEntity(class_1297 class_12972, CallbackInfo callbackInfo) {
        C c2 = C.d(class_12972);
        Frog.EVENT_BUS.J(c2);
        if (c2.p()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"addEntity"}, at={@At(value="HEAD")}, cancellable=true)
    public void onAddEntity(class_1297 class_12972, CallbackInfo callbackInfo) {
        I i2 = I.F(class_12972);
        Frog.EVENT_BUS.J(i2);
        if (i2.p()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"removeEntity"}, at={@At(value="HEAD")})
    private void hookRemoveEntity(int n2, class_1297.class_5529 class_55292, CallbackInfo callbackInfo) {
        class_1297 class_12972 = this.method_8469(n2);
        if (class_12972 == null) {
            return;
        }
        Qd qd = Qd.Q(class_12972, class_55292);
        Frog.EVENT_BUS.J(qd);
    }

    @Inject(method={"addEntity"}, at={@At(value="TAIL")})
    public void onAddEntityTail(class_1297 class_12972, CallbackInfo callbackInfo) {
        Q3 q3 = Q3.V(class_12972);
        Frog.EVENT_BUS.J(q3);
    }

    @Inject(method={"getSkyColor"}, at={@At(value="HEAD")}, cancellable=true)
    private void onGetSkyColor(class_243 class_2432, float f2, CallbackInfoReturnable<class_243> callbackInfoReturnable) {
        if (J.d.p() && J.d.h.i) {
            Color color = J.d.h.P();
            callbackInfoReturnable.setReturnValue((Object)new class_243((double)color.getRed() / 255.0, (double)color.getGreen() / 255.0, (double)color.getBlue() / 255.0));
        }
    }

    @Inject(method={"getCloudsColor"}, at={@At(value="HEAD")}, cancellable=true)
    private void hookGetCloudsColor(float f2, CallbackInfoReturnable<class_243> callbackInfoReturnable) {
        if (J.d.p() && J.d.I.i) {
            Color color = J.d.I.P();
            callbackInfoReturnable.setReturnValue((Object)new class_243((double)color.getRed() / 255.0, (double)color.getGreen() / 255.0, (double)color.getBlue() / 255.0));
        }
    }

    @Inject(method={"getDimensionEffects"}, at={@At(value="HEAD")}, cancellable=true)
    private void onGetSkyProperties(CallbackInfoReturnable<class_5294> callbackInfoReturnable) {
        if (J.d.p() && J.d.k.h()) {
            callbackInfoReturnable.setReturnValue((Object)this.overworld);
        }
    }

    public float method_8430(float f2) {
        return N.Q.p() && N.Q.b.h() ? 0.0f : super.method_8430(f2);
    }

    public float method_8478(float f2) {
        return N.Q.p() && N.Q.b.h() ? 0.0f : super.method_8478(f2);
    }
}

