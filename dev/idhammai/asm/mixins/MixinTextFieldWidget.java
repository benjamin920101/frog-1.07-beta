/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.text.Text
 *  net.minecraft.util.Identifier
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.gui.widget.ClickableWidget
 *  net.minecraft.client.gui.widget.TextFieldWidget
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Redirect
 */
package dev.idhammai.asm.mixins;

import dev.idhammai.P.A.S.o;
import java.awt.Color;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.widget.ClickableWidget;
import net.minecraft.client.gui.widget.TextFieldWidget;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={class_342.class})
public abstract class MixinTextFieldWidget
extends class_339 {
    @Unique
    private float frog$focusProgress = 0.0f;
    @Unique
    private float frog$hoverProgress = 0.0f;

    protected MixinTextFieldWidget(int n2, int n3, int n4, int n5, class_2561 class_25612) {
        super(n2, n3, n4, n5, class_25612);
    }

    @Redirect(method={"renderWidget"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/gui/DrawContext;drawGuiTexture(Lnet/minecraft/util/Identifier;IIII)V"))
    private void frog$replaceBackground(class_332 class_3322, class_2960 class_29602, int n2, int n3, int n4, int n5) {
        if (class_310.method_1551().field_1687 != null) {
            class_3322.method_52706(class_29602, n2, n3, n4, n5);
            return;
        }
        boolean bl = this.method_25370();
        float f2 = bl ? 1.0f : 0.0f;
        this.frog$focusProgress += (f2 - this.frog$focusProgress) * 0.15f;
        boolean bl2 = this.method_49606();
        float f3 = bl2 ? 1.0f : 0.0f;
        this.frog$hoverProgress += (f3 - this.frog$hoverProgress) * 0.15f;
        float f4 = Math.max(this.frog$hoverProgress, this.frog$focusProgress);
        int n6 = (int)(75.0f + f4 * 53.0f);
        o.j(class_3322.method_51448(), n2, n3, n4, n5, 4.0f, new Color(0, 0, 0, n6));
        int n7 = (int)(38.0f + f4 * 38.0f);
        o.d(class_3322.method_51448(), n2, n3, n4, n5, 4.0f, new Color(255, 255, 255, n7), 4);
    }
}

