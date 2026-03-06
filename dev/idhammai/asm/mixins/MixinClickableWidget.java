/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2561
 *  net.minecraft.class_310
 *  net.minecraft.class_332
 *  net.minecraft.class_339
 *  net.minecraft.class_4264
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
import net.minecraft.class_4264;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_339.class})
public abstract class MixinClickableWidget {
    @Shadow
    public boolean field_22763;
    @Shadow
    private boolean field_22764;
    @Unique
    private float frog$hoverProgress = 0.0f;

    @Shadow
    public abstract int method_46426();

    @Shadow
    public abstract int method_46427();

    @Shadow
    public abstract int method_25368();

    @Shadow
    public abstract int method_25364();

    @Shadow
    public abstract boolean method_49606();

    @Shadow
    public abstract class_2561 method_25369();

    @Inject(method={"render"}, at={@At(value="HEAD")}, cancellable=true)
    private void frogButtonStyle(class_332 class_3322, int n2, int n3, float f2, CallbackInfo callbackInfo) {
        i i2;
        if (!this.field_22764) {
            return;
        }
        if (class_310.method_1551().field_1687 != null) {
            return;
        }
        if (!(this instanceof class_4264)) {
            return;
        }
        boolean bl = n2 >= this.method_46426() && n3 >= this.method_46427() && n2 < this.method_46426() + this.method_25368() && n3 < this.method_46427() + this.method_25364();
        float f3 = this.method_46426();
        float f4 = this.method_46427();
        float f5 = this.method_25368();
        float f6 = this.method_25364();
        float f7 = bl && this.field_22763 ? 1.0f : 0.0f;
        this.frog$hoverProgress += (f7 - this.frog$hoverProgress) * 0.15f;
        int n4 = this.field_22763 ? (int)(75.0f + this.frog$hoverProgress * 53.0f) : 50;
        o.j(class_3322.method_51448(), f3, f4, f5, f6, 4.0f, new Color(0, 0, 0, n4));
        int n5 = this.field_22763 ? (int)(38.0f + this.frog$hoverProgress * 38.0f) : 25;
        o.d(class_3322.method_51448(), f3, f4, f5, f6, 4.0f, new Color(255, 255, 255, n5), 4);
        String string = this.method_25369().getString();
        int n6 = this.field_22763 ? 255 : 128;
        Color color = new Color(255, 255, 255, n6);
        i i3 = i2 = n.r != null ? n.r : n.w;
        if (i2 != null) {
            float f8 = i2.b(string);
            float f9 = (int)(f3 + (f5 - f8) / 2.0f);
            float f10 = (int)(f4 + (f6 - i2.V()) / 2.0f);
            i2.H(class_3322.method_51448(), string, f9, f10, color.getRGB(), false);
        } else {
            int n7 = class_310.method_1551().field_1772.method_1727(string);
            int n8 = (int)(f3 + (f5 - (float)n7) / 2.0f);
            int n9 = (int)(f4 + (f6 - 8.0f) / 2.0f);
            class_3322.method_51433(class_310.method_1551().field_1772, string, n8, n9, color.getRGB(), false);
        }
        callbackInfo.cancel();
    }
}

