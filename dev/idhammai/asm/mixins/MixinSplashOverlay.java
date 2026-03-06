/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_156
 *  net.minecraft.class_2561
 *  net.minecraft.class_310
 *  net.minecraft.class_332
 *  net.minecraft.class_3532
 *  net.minecraft.class_425
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyArg
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package dev.idhammai.asm.mixins;

import dev.idhammai.c.y.y.i;
import dev.idhammai.p.J.n;
import java.awt.Color;
import net.minecraft.class_156;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_3532;
import net.minecraft.class_425;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_425.class})
public class MixinSplashOverlay {
    @Shadow
    private long field_17771;
    @Unique
    private long frog$initTime = -1L;
    @Unique
    private static i frog$splashLargeFont;

    @Unique
    private static i frog$getSplashFont() {
        if (frog$splashLargeFont != null) {
            return frog$splashLargeFont;
        }
        try {
            frog$splashLargeFont = n.E(34.0f, "default", 0, "msyh");
        }
        catch (Exception exception) {
            frog$splashLargeFont = n.t != null ? n.t : n.w;
        }
        return frog$splashLargeFont;
    }

    @ModifyArg(method={"render"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/gui/DrawContext;fill(Lnet/minecraft/client/render/RenderLayer;IIIII)V", ordinal=0), index=5)
    private int frog$hideBgFade(int n2) {
        return 0;
    }

    @ModifyArg(method={"render"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/gui/DrawContext;fill(Lnet/minecraft/client/render/RenderLayer;IIIII)V", ordinal=1), index=5)
    private int frog$hideBgLoading(int n2) {
        return 0;
    }

    @ModifyArg(method={"render"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/gui/DrawContext;setShaderColor(FFFF)V", ordinal=0), index=3)
    private float frog$hideLogoAlpha(float f2) {
        return 0.0f;
    }

    @Inject(method={"render"}, at={@At(value="TAIL")})
    private void frog$replaceMojangSplash(class_332 class_3322, int n2, int n3, float f2, CallbackInfo callbackInfo) {
        float f3;
        class_310 class_3102 = class_310.method_1551();
        if (class_3102 == null || class_3102.field_1772 == null) {
            return;
        }
        class_3322.method_51422(1.0f, 1.0f, 1.0f, 1.0f);
        if (this.field_17771 == -1L) {
            f3 = 1.0f;
        } else {
            float f4 = (float)(class_156.method_658() - this.field_17771) / 1000.0f;
            f3 = 1.0f - class_3532.method_15363((float)(f4 - 1.0f), (float)0.0f, (float)1.0f);
        }
        int n4 = (int)(f3 * 255.0f);
        if (n4 <= 0) {
            return;
        }
        int n5 = class_3102.method_22683().method_4486();
        int n6 = class_3102.method_22683().method_4502();
        String string = "Frog Client";
        class_3322.method_25294(0, 0, n5, n6, new Color(70, 150, 70, n4).getRGB());
        int n7 = n4 << 24 | 0xFFFFFF;
        i i2 = MixinSplashOverlay.frog$getSplashFont();
        if (i2 != null) {
            long l2 = class_156.method_658();
            if (this.frog$initTime == -1L) {
                this.frog$initTime = l2 + 500L;
            }
            float f5 = 0.0f;
            if (l2 > this.frog$initTime && (f5 = (float)(l2 - this.frog$initTime) / 1000.0f) > 1.0f) {
                f5 = 1.0f;
            }
            float f6 = i2.b(string);
            float f7 = ((float)n5 - f6) / 2.0f;
            float f8 = ((float)n6 - i2.V()) / 2.0f;
            if (f5 < 1.0f) {
                int n8 = (int)f7;
                int n9 = (int)f8;
                int n10 = (int)(f7 + f6 * f5);
                if (n10 < n8) {
                    n10 = n8;
                }
                int n11 = (int)(f8 + i2.V() + 1.0f);
                class_3322.method_44379(n8, n9, n10, n11);
            }
            i2.H(class_3322.method_51448(), string, f7, f8, n7, false);
            if (f5 < 1.0f) {
                class_3322.method_44380();
            }
            return;
        }
        class_3322.method_27534(class_3102.field_1772, class_2561.method_30163((String)string), n5 / 2, n6 / 2 - 4, n7);
    }
}

