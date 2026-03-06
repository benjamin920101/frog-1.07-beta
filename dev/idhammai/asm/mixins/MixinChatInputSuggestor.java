/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  net.minecraft.text.Text
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.gui.widget.TextFieldWidget
 *  net.minecraft.client.gui.screen.ChatInputSuggestor
 *  net.minecraft.text.OrderedText
 *  org.apache.commons.lang3.StringUtils
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package dev.idhammai.asm.mixins;

import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import dev.idhammai.Frog;
import dev.idhammai.P.A.S.o;
import dev.idhammai.c.r.q.N.I;
import dev.idhammai.c.u.k;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.text.Text;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.gui.screen.ChatInputSuggestor;
import net.minecraft.text.OrderedText;
import org.apache.commons.lang3.StringUtils;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_4717.class})
public abstract class MixinChatInputSuggestor {
    @Final
    @Shadow
    class_342 field_21599;
    @Shadow
    private CompletableFuture<Suggestions> field_21611;
    @Final
    @Shadow
    private List<class_5481> field_21607;
    @Unique
    private boolean showOutline = false;

    @Shadow
    public abstract void method_23920(boolean var1);

    @Inject(at={@At(value="HEAD")}, method={"render"})
    private void onRender(class_332 class_3322, int n2, int n3, CallbackInfo callbackInfo) {
        if (this.showOutline) {
            int n4 = this.field_21599.method_46426() - 3;
            int n5 = this.field_21599.method_46427() - 3;
            o.F(class_3322.method_51448(), n4, n5, this.field_21599.method_25368() + 1, 1.0f, I.Q.a.P().getRGB());
            o.F(class_3322.method_51448(), n4, n5 + this.field_21599.method_25364() + 1, this.field_21599.method_25368() + 1, 1.0f, I.Q.a.P().getRGB());
            o.F(class_3322.method_51448(), n4, n5, 1.0f, this.field_21599.method_25364() + 1, I.Q.a.P().getRGB());
            o.F(class_3322.method_51448(), n4 + this.field_21599.method_25368() + 1, n5, 1.0f, this.field_21599.method_25364() + 2, I.Q.a.P().getRGB());
        }
    }

    @Inject(at={@At(value="INVOKE", target="Lnet/minecraft/client/gui/widget/TextFieldWidget;getCursor()I", ordinal=0)}, method={"refresh()V"})
    private void onRefresh(CallbackInfo callbackInfo) {
        String string;
        String string2 = Frog.getPrefix();
        String string3 = this.field_21599.method_1882();
        this.showOutline = string3.startsWith(string2);
        if (string3.isEmpty() || !string2.startsWith(string = string3.substring(0, this.field_21599.method_1881())) && !string.startsWith(string2)) {
            return;
        }
        int n2 = 0;
        Matcher matcher = Pattern.compile("(\\s+)").matcher(string);
        while (matcher.find()) {
            n2 = matcher.end();
        }
        SuggestionsBuilder suggestionsBuilder = new SuggestionsBuilder(string, n2);
        if (string.length() < string2.length()) {
            if (!string2.startsWith(string)) {
                return;
            }
            suggestionsBuilder.suggest(string2);
        } else {
            if (!string.startsWith(string2)) {
                return;
            }
            int n3 = StringUtils.countMatches((CharSequence)string, (CharSequence)" ");
            List<String> list = Arrays.asList(string.split(" "));
            if (n3 == 0) {
                for (Object object : Frog.COMMAND.Q().keySet().toArray()) {
                    String string4 = (String)object;
                    suggestionsBuilder.suggest(Frog.getPrefix() + string4 + " ");
                }
            } else {
                if (list.isEmpty()) {
                    return;
                }
                k k2 = Frog.COMMAND.y(list.getFirst().substring(string2.length()));
                if (k2 == null) {
                    this.field_21607.add(class_2561.method_30163((String)(" \u00a74no commands found: \u00a7f" + list.getFirst().substring(string2.length()))).method_30937());
                    return;
                }
                String[] stringArray = k2.l(n3, list);
                if (stringArray == null || stringArray.length == 0) {
                    return;
                }
                for (String string5 : stringArray) {
                    suggestionsBuilder.suggest(string5 + " ");
                }
            }
        }
        this.field_21611 = suggestionsBuilder.buildFuture();
        this.method_23920(false);
    }
}

