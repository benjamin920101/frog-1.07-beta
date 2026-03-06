/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.sugar.Local
 *  net.minecraft.text.Text
 *  net.minecraft.client.gui.hud.ChatHudLine
 *  net.minecraft.client.gui.hud.ChatHudLine$Visible
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.font.TextRenderer
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.gui.hud.ChatHud
 *  net.minecraft.text.OrderedText
 *  net.minecraft.network.message.MessageSignatureData
 *  net.minecraft.client.gui.hud.MessageIndicator
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.At$Shift
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyVariable
 *  org.spongepowered.asm.mixin.injection.Redirect
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package dev.idhammai.asm.mixins;

import com.llamalad7.mixinextras.sugar.Local;
import dev.idhammai.P.A.A.d;
import dev.idhammai.P.A.S.f;
import dev.idhammai.P.V.D;
import dev.idhammai.asm.accessors.IChatHud;
import dev.idhammai.c.r.q.N.I;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import net.minecraft.text.Text;
import net.minecraft.client.gui.hud.ChatHudLine;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.ChatHud;
import net.minecraft.text.OrderedText;
import net.minecraft.network.message.MessageSignatureData;
import net.minecraft.client.gui.hud.MessageIndicator;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_338.class})
public abstract class MixinChatHud
implements dev.idhammai.P.V.I {
    @Unique
    private int nextMessageId = 0;
    @Unique
    private boolean nextSync;
    @Unique
    private int chatLineIndex;
    @Final
    @Shadow
    private List<class_303.class_7590> field_2064;
    @Shadow
    @Final
    private List<class_303> field_2061;

    @Inject(method={"<init>"}, at={@At(value="TAIL")})
    public void onInit(class_310 class_3102, CallbackInfo callbackInfo) {
        ((IChatHud)((Object)this)).setMessages(new CopyOnWriteArrayList<class_303>());
        ((IChatHud)((Object)this)).setVisibleMessages(new CopyOnWriteArrayList<class_303.class_7590>());
    }

    @Override
    public void frogClient$addMessage(class_2561 class_25612, int n2) {
        this.nextMessageId = n2;
        this.nextSync = true;
        this.method_1812(class_25612);
        this.nextSync = false;
        this.nextMessageId = 0;
    }

    @Override
    public void frogClient$addMessage(class_2561 class_25612) {
        this.nextSync = true;
        this.method_1812(class_25612);
        this.nextSync = false;
    }

    @Override
    public void frogClient$addMessageOutSync(class_2561 class_25612, int n2) {
        this.nextMessageId = n2;
        this.method_1812(class_25612);
        this.nextMessageId = 0;
    }

    @Inject(method={"addVisibleMessage"}, at={@At(value="INVOKE", target="Ljava/util/List;add(ILjava/lang/Object;)V", ordinal=0, shift=At.Shift.AFTER)})
    private void onAddMessageAfterNewChatHudLineVisible(class_303 class_3032, CallbackInfo callbackInfo) {
        D d2 = (D)this.field_2064.getFirst();
        if (d2 != null) {
            d2.frogClient$setMessageId(this.nextMessageId);
            d2.frogClient$setSync(this.nextSync);
            d2.frogClient$setFade(new d(I.Q.l.V()));
        }
    }

    @Inject(method={"addMessage(Lnet/minecraft/client/gui/hud/ChatHudLine;)V"}, at={@At(value="INVOKE", target="Ljava/util/List;add(ILjava/lang/Object;)V", ordinal=0, shift=At.Shift.AFTER)})
    private void onAddMessageAfterNewChatHudLine(class_303 class_3032, CallbackInfo callbackInfo) {
        D d2 = (D)this.field_2061.getFirst();
        if (d2 != null) {
            d2.frogClient$setMessageId(this.nextMessageId);
            d2.frogClient$setSync(this.nextSync);
            d2.frogClient$setFade(new d(I.Q.l.V()));
        }
    }

    @Inject(at={@At(value="HEAD")}, method={"addMessage(Lnet/minecraft/text/Text;Lnet/minecraft/network/message/MessageSignatureData;Lnet/minecraft/client/gui/hud/MessageIndicator;)V"})
    private void onAddMessage(class_2561 class_25612, class_7469 class_74692, class_7591 class_75912, CallbackInfo callbackInfo) {
        if (this.nextMessageId != 0) {
            this.field_2064.removeIf(this::lambda$onAddMessage$0);
            this.field_2061.removeIf(this::lambda$onAddMessage$1);
        }
    }

    @Redirect(method={"addVisibleMessage"}, at=@At(value="INVOKE", target="Ljava/util/List;size()I", ordinal=2, remap=false), require=0)
    public int chatLinesSize(List<class_303.class_7590> list) {
        return I.Q.p() && I.Q.L.h() ? -2147483647 : list.size();
    }

    @Redirect(method={"render"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/gui/DrawContext;drawTextWithShadow(Lnet/minecraft/client/font/TextRenderer;Lnet/minecraft/text/OrderedText;III)I"), require=0)
    private int drawStringWithShadow(class_332 class_3322, class_327 class_3272, class_5481 class_54812, int n2, int n3, int n4) {
        D d2 = (D)this.field_2064.get(this.chatLineIndex);
        if (d2 != null) {
            d d3 = d2.frogClient$getFade();
            double d4 = d3 == null ? 0.0 : d3.M(I.Q.U.X());
            double d5 = 1.0 - d4;
            n2 += (int)(d5 * I.Q.N.e());
            double d6 = Math.max(10.0, (double)(n4 >> 24 & 0xFF) * d4);
            if (d2.frogClient$getSync()) {
                return class_3322.method_35720(class_3272, class_54812, n2, n3, f.y(I.Q.a.P(), I.Q.k.h() ? (int)d6 : n4 >> 24 & 0xFF).getRGB());
            }
            return class_3322.method_35720(class_3272, class_54812, n2, n3, f.k(n4, I.Q.k.h() ? (int)d6 : n4 >> 24 & 0xFF));
        }
        return class_3322.method_35720(class_3272, class_54812, n2, n3, n4);
    }

    @Inject(method={"render"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/gui/hud/ChatHudLine$Visible;addedTime()I")})
    public void getChatLineIndex(CallbackInfo callbackInfo, @Local(ordinal=13) int n2) {
        this.chatLineIndex = n2;
    }

    @ModifyVariable(method={"render"}, at=@At(value="STORE"))
    private class_7591 removeMessageIndicator(class_7591 class_75912) {
        if (I.Q.t.h()) {
            return null;
        }
        return class_75912;
    }

    @Shadow
    public abstract void method_1812(class_2561 var1);

    @Shadow
    public int method_1811() {
        return 0;
    }

    private boolean lambda$onAddMessage$1(class_303 class_3032) {
        return ((D)class_3032).frogClient$getMessageId() == this.nextMessageId;
    }

    private boolean lambda$onAddMessage$0(class_303.class_7590 class_75902) {
        return ((D)class_75902).frogClient$getMessageId() == this.nextMessageId;
    }
}

