/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2561
 *  net.minecraft.class_310
 *  net.minecraft.class_332
 *  net.minecraft.class_339
 *  net.minecraft.class_357
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package dev.idhammai.asm.mixins;

import dev.idhammai.P.A.S.o;
import dev.idhammai.c.y.y.i;
import dev.idhammai.p.J.n;
import java.awt.Color;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_339;
import net.minecraft.class_357;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_357.class})
public abstract class MixinSliderWidget
extends class_339 {
    @Shadow
    protected double field_22753;
    @Unique
    private double frog$animatedValue = -1.0;
    @Unique
    private float frog$hoverProgress = 0.0f;

    protected MixinSliderWidget(int n2, int n3, int n4, int n5, class_2561 class_25612) {
        super(n2, n3, n4, n5, class_25612);
    }

    @Inject(method={"renderWidget"}, at={@At(value="HEAD")}, cancellable=true)
    private void frogSliderStyle(class_332 class_3322, int n2, int n3, float f2, CallbackInfo callbackInfo) {
        i i2;
        int n4;
        float f3;
        if (class_310.method_1551().field_1687 != null) {
            return;
        }
        if (this.frog$animatedValue < 0.0) {
            this.frog$animatedValue = this.field_22753;
        }
        this.frog$animatedValue += (this.field_22753 - this.frog$animatedValue) * 0.15;
        if (Math.abs(this.frog$animatedValue - this.field_22753) < 0.001) {
            this.frog$animatedValue = this.field_22753;
        }
        float f4 = this.method_46426();
        float f5 = this.method_46427();
        float f6 = this.method_25368();
        float f7 = this.method_25364();
        boolean bl = this.method_49606();
        float f8 = bl ? 1.0f : 0.0f;
        this.frog$hoverProgress += (f8 - this.frog$hoverProgress) * 0.15f;
        int n5 = (int)(75.0f + this.frog$hoverProgress * 53.0f);
        o.j(class_3322.method_51448(), f4, f5, f6, f7, 4.0f, new Color(0, 0, 0, n5));
        float f9 = (float)((double)f6 * this.frog$animatedValue);
        if (f9 > 0.5f) {
            float f10 = Math.min(f9, f6);
            int n6 = (int)(35.0f + this.frog$hoverProgress * 25.0f);
            o.j(class_3322.method_51448(), f4, f5, f10, f7, 4.0f, new Color(255, 255, 255, n6));
        }
        int n7 = (int)(38.0f + this.frog$hoverProgress * 38.0f);
        o.d(class_3322.method_51448(), f4, f5, f6, f7, 4.0f, new Color(255, 255, 255, n7), 4);
        if (this.frog$animatedValue > 0.01 && this.frog$animatedValue < 0.99) {
            float f11 = f4 + f9;
            float f12 = 2.0f;
            float f13 = f7 - 4.0f;
            f3 = f5 + 2.0f;
            n4 = (int)(140.0f + this.frog$hoverProgress * 80.0f);
            o.j(class_3322.method_51448(), f11 - f12 / 2.0f, f3, f12, f13, 1.0f, new Color(255, 255, 255, Math.min(255, n4)));
        }
        String string = this.method_25369().getString();
        Color color = new Color(255, 255, 255, 255);
        i i3 = i2 = n.r != null ? n.r : n.w;
        if (i2 != null) {
            f3 = i2.b(string);
            float f14 = (int)(f4 + (f6 - f3) / 2.0f);
            float f15 = (int)(f5 + (f7 - i2.V()) / 2.0f);
            i2.H(class_3322.method_51448(), string, f14, f15, color.getRGB(), false);
        } else {
            int n8 = class_310.method_1551().field_1772.method_1727(string);
            n4 = (int)(f4 + (f6 - (float)n8) / 2.0f);
            int n9 = (int)(f5 + (f7 - 8.0f) / 2.0f);
            class_3322.method_51433(class_310.method_1551().field_1772, string, n4, n9, color.getRGB(), false);
        }
        callbackInfo.cancel();
    }
}

