/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.client.util.Window
 *  net.minecraft.client.resource.language.I18n
 *  net.minecraft.server.integrated.IntegratedServer
 *  net.minecraft.util.Hand
 *  net.minecraft.SharedConstants
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.hit.HitResult
 *  net.minecraft.util.hit.HitResult$Type
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.gui.hud.InGameHud
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.util.thread.ReentrantThreadExecutor
 *  net.minecraft.client.gui.screen.multiplayer.ConnectScreen
 *  net.minecraft.client.gui.screen.DownloadingTerrainScreen
 *  net.minecraft.client.gui.screen.ProgressScreen
 *  net.minecraft.client.gui.screen.Screen
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.client.RunArgs
 *  net.minecraft.client.network.ClientPlayNetworkHandler
 *  net.minecraft.client.network.ClientPlayerInteractionManager
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.client.network.ServerInfo
 *  net.minecraft.client.particle.ParticleManager
 *  net.minecraft.client.network.ClientPlayerEntity
 *  org.ladysnake.satin.api.managed.ManagedShaderEffect
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Overwrite
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.At$Shift
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.Redirect
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package dev.idhammai.asm.mixins;

import com.mojang.blaze3d.systems.RenderSystem;
import dev.idhammai.Frog;
import dev.idhammai.P.A.S.o;
import dev.idhammai.P.r.O;
import dev.idhammai.P.r.c.M;
import dev.idhammai.P.r.c.b;
import dev.idhammai.P.r.c.k;
import dev.idhammai.P.r.c.v;
import dev.idhammai.c.r.q.N.I;
import dev.idhammai.c.r.q.i.e;
import dev.idhammai.c.y.j.w;
import dev.idhammai.p.J.S;
import dev.idhammai.p.J.n;
import dev.idhammai.p.J.u;
import java.awt.Color;
import net.minecraft.client.util.Window;
import net.minecraft.client.resource.language.I18n;
import net.minecraft.server.integrated.IntegratedServer;
import net.minecraft.util.Hand;
import net.minecraft.SharedConstants;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.hit.HitResult;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.thread.ReentrantThreadExecutor;
import net.minecraft.client.gui.screen.multiplayer.ConnectScreen;
import net.minecraft.client.gui.screen.DownloadingTerrainScreen;
import net.minecraft.client.gui.screen.ProgressScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.RunArgs;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.client.network.ServerInfo;
import net.minecraft.client.particle.ParticleManager;
import net.minecraft.client.network.ClientPlayerEntity;
import org.ladysnake.satin.api.managed.ManagedShaderEffect;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_310.class})
public abstract class MixinMinecraftClient
extends class_4093<Runnable> {
    @Shadow
    @Final
    public class_329 field_1705;
    @Shadow
    public int field_1771;
    @Shadow
    public class_746 field_1724;
    @Shadow
    public class_239 field_1765;
    @Shadow
    public class_636 field_1761;
    @Final
    @Shadow
    public class_702 field_1713;
    @Shadow
    public class_638 field_1687;
    @Shadow
    private class_1132 field_1766;
    @Shadow
    public class_437 field_1755;
    @Shadow
    @Final
    private class_1041 field_1704;
    @Unique
    private static long FrogStartTs = 0L;

    public MixinMinecraftClient(String string) {
        super(string);
    }

    @Inject(method={"onResolutionChanged"}, at={@At(value="TAIL")})
    private void captureResize(CallbackInfo callbackInfo) {
        Frog.EVENT_BUS.J(new dev.idhammai.P.r.c.n(this.field_1704));
    }

    @Redirect(method={"render"}, at=@At(value="INVOKE", target="Lcom/mojang/blaze3d/systems/RenderSystem;limitDisplayFPS(I)V"), require=0)
    public void fpsHook(int n2) {
        if (!I.Q.u.h()) {
            RenderSystem.limitDisplayFPS((int)n2);
        }
    }

    @Inject(method={"<init>"}, at={@At(value="TAIL")})
    void postWindowInit(class_542 class_5422, CallbackInfo callbackInfo) {
        n.L();
        FrogStartTs = System.currentTimeMillis();
    }

    @Inject(method={"setScreen"}, at={@At(value="HEAD")}, cancellable=true)
    private void onSetScreen(class_437 class_4372, CallbackInfo callbackInfo) {
        w.k(class_4372);
        if (Frog.EVENT_BUS != null) {
            b b2 = b.c(class_4372);
            Frog.EVENT_BUS.J(b2);
            if (b2.p()) {
                callbackInfo.cancel();
            }
        }
    }

    @Inject(method={"render"}, at={@At(value="TAIL")})
    private void frogMagentaOverlay(CallbackInfo callbackInfo) {
        float f2;
        float f3;
        float f4;
        float f5;
        boolean bl;
        class_437 class_4372 = this.field_1755;
        if (class_4372 == null) {
            return;
        }
        boolean bl2 = bl = class_4372 instanceof class_435 || class_4372 instanceof class_434 || class_4372 instanceof class_412;
        if (!bl) {
            return;
        }
        if (Frog.SHADER.m()) {
            return;
        }
        float f6 = this.field_1704.method_4486();
        float f7 = this.field_1704.method_4502();
        float f8 = (float)(System.currentTimeMillis() % 100000L) / 1000.0f;
        ManagedShaderEffect managedShaderEffect = Frog.SHADER.s(u.Rainbow);
        managedShaderEffect.setUniformValue("alpha2", 0.85f);
        managedShaderEffect.setUniformValue("radius", 2.0f);
        managedShaderEffect.setUniformValue("quality", 1.0f);
        managedShaderEffect.setUniformValue("divider", 150.0f);
        managedShaderEffect.setUniformValue("maxSample", 10.0f);
        managedShaderEffect.setUniformValue("resolution", f6, f7);
        managedShaderEffect.setUniformValue("time", f8);
        managedShaderEffect.render(((class_310)this).method_60646().method_60637(true));
        ManagedShaderEffect managedShaderEffect2 = Frog.SHADER.s(u.Rainbow);
        managedShaderEffect2.setUniformValue("alpha2", 0.65f);
        managedShaderEffect2.setUniformValue("radius", 2.0f);
        managedShaderEffect2.setUniformValue("quality", 1.0f);
        managedShaderEffect2.setUniformValue("divider", 150.0f);
        managedShaderEffect2.setUniformValue("maxSample", 10.0f);
        managedShaderEffect2.setUniformValue("resolution", f6, f7);
        managedShaderEffect2.setUniformValue("time", f8 * 1.2f);
        managedShaderEffect2.render(((class_310)this).method_60646().method_60637(true));
        class_4587 class_45872 = new class_4587();
        f6 = this.field_1704.method_4486();
        f7 = this.field_1704.method_4502();
        long l2 = System.currentTimeMillis();
        long l3 = l2 - FrogStartTs;
        if (l3 < 2400L) {
            float f9 = Math.max(0.0f, Math.min(1.0f, (float)l3 / 2400.0f));
            int n2 = (int)(180.0 * Math.sin((double)f9 * Math.PI));
            Color color = new Color(28, 60, 110, n2);
            Color color2 = new Color(190, 50, 160, n2);
            o.Q(class_45872, 0.0f, 0.0f, f6, f7, color, color2);
            float f10 = Math.min(f6, f7) * (0.12f + 0.18f * f9);
            o.Q(class_45872, f6 / 2.0f, f7 / 2.0f, f10, new Color(255, 255, 255, (int)(70.0f * f9)), 80);
            o.Q(class_45872, f6 / 2.0f, f7 / 2.0f, f10 * 1.2f, new Color(120, 220, 255, (int)(50.0f * f9)), 80);
            return;
        }
        float f11 = (float)(l2 % 6000L) / 6000.0f;
        float f12 = 0.523599f;
        float f13 = (float)Math.tan(f12) * f7;
        float f14 = -f7;
        float f15 = 28.0f;
        float f16 = f11 * f15 * 5.2f;
        int n3 = new Color(230, 60, 170, 64).getRGB();
        int n4 = new Color(160, 40, 130, 48).getRGB();
        int n5 = new Color(255, 255, 255, 42).getRGB();
        for (f5 = f14; f5 < f6; f5 += f15) {
            f4 = f5 + f16;
            o.i(class_45872, f4, 0.0f, f4 + f13, f7, n3);
            f3 = f4 + f13 * 0.25f;
            f2 = f7 * 0.25f;
            o.Q(class_45872, f3, f2, 2.5f, new Color(n5, true), 32);
        }
        for (f5 = f14 + f15 / 2.0f; f5 < f6; f5 += f15) {
            f4 = f5 + f16 * 0.85f;
            o.i(class_45872, f4, 0.0f, f4 + f13, f7, n4);
            f3 = f4 + f13 * 0.65f;
            f2 = f7 * 0.6f;
            o.Q(class_45872, f3, f2, 2.0f, new Color(n5, true), 28);
        }
    }

    @Inject(method={"doAttack"}, at={@At(value="INVOKE", target="Lnet/minecraft/util/hit/HitResult;getType()Lnet/minecraft/util/hit/HitResult$Type;", shift=At.Shift.BEFORE)})
    public void onAttack(CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        Frog.EVENT_BUS.J(M.E());
    }

    @Inject(method={"doAttack"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/network/ClientPlayerEntity;swingHand(Lnet/minecraft/util/Hand;)V", shift=At.Shift.AFTER)})
    public void onAttackPost(CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        if (Frog.EVENT_BUS != null) {
            Frog.EVENT_BUS.J(M.P());
        }
    }

    @Inject(method={"doAttack"}, at={@At(value="HEAD")}, cancellable=true)
    public void doAttackHook(CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        if (Frog.EVENT_BUS != null) {
            M m2 = new M();
            Frog.EVENT_BUS.J(m2);
            if (m2.p()) {
                callbackInfoReturnable.setReturnValue((Object)false);
            }
        }
    }

    @Inject(method={"disconnect(Lnet/minecraft/client/gui/screen/Screen;)V"}, at={@At(value="HEAD")})
    private void onDisconnect(class_437 class_4372, CallbackInfo callbackInfo) {
        if (Frog.EVENT_BUS != null) {
            Frog.EVENT_BUS.J(k.h);
        }
        if (Frog.MODULE != null) {
            Frog.MODULE.i();
        }
    }

    @Inject(method={"disconnect(Lnet/minecraft/client/gui/screen/Screen;)V"}, at={@At(value="HEAD")})
    private void clearTitleMixin(class_437 class_4372, CallbackInfo callbackInfo) {
        if (I.Q.h.h()) {
            this.field_1705.method_34003();
            this.field_1705.method_1742();
        }
    }

    @Inject(method={"handleBlockBreaking"}, at={@At(value="HEAD")}, cancellable=true)
    private void handleBlockBreaking(boolean bl, CallbackInfo callbackInfo) {
        if (this.field_1771 <= 0 && this.field_1724.method_6115() && e.V.j()) {
            if (bl && this.field_1765 != null && this.field_1765.method_17783() == class_239.class_240.field_1332) {
                class_2350 class_23502;
                class_3965 class_39652 = (class_3965)this.field_1765;
                class_2338 class_23382 = class_39652.method_17777();
                if (!this.field_1687.method_8320(class_23382).method_26215() && this.field_1761.method_2902(class_23382, class_23502 = class_39652.method_17780())) {
                    this.field_1713.method_3054(class_23382, class_23502);
                    this.field_1724.method_6104(class_1268.field_5808);
                }
            } else {
                this.field_1761.method_2925();
            }
            callbackInfo.cancel();
        }
    }

    @Inject(at={@At(value="HEAD")}, method={"tick()V"})
    public void tickHead(CallbackInfo callbackInfo) {
        block3: {
            try {
                if (Frog.EVENT_BUS != null) {
                    Frog.EVENT_BUS.J(v.W(O.Pre));
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
                if (!I.Q.M.h()) break block3;
                S.z("\u00a74An error has occurred (MinecraftClient.tick() [HEAD]) Message: [" + exception.getMessage() + "]");
            }
        }
    }

    @Inject(at={@At(value="TAIL")}, method={"tick()V"})
    public void tickTail(CallbackInfo callbackInfo) {
        block3: {
            try {
                if (Frog.EVENT_BUS != null) {
                    Frog.EVENT_BUS.J(v.W(O.Post));
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
                if (!I.Q.M.h()) break block3;
                S.z("\u00a74An error has occurred (MinecraftClient.tick() [TAIL]) Message: [" + exception.getMessage() + "]");
            }
        }
    }

    @Overwrite
    private String method_24287() {
        if (I.Q == null) {
            return "Frog: Loading..";
        }
        if (I.Q.w.h()) {
            return I.Q.n.q();
        }
        StringBuilder stringBuilder = new StringBuilder("Frog");
        stringBuilder.append(" ");
        stringBuilder.append(class_155.method_16673().method_48019());
        class_634 class_6342 = this.method_1562();
        if (class_6342 != null && class_6342.method_48296().method_10758()) {
            stringBuilder.append(" - ");
            class_642 class_6422 = this.method_1558();
            if (this.field_1766 != null && !this.field_1766.method_3860()) {
                stringBuilder.append(class_1074.method_4662((String)"title.singleplayer", (Object[])new Object[0]));
            } else if (class_6422 != null && class_6422.method_52811()) {
                stringBuilder.append(class_1074.method_4662((String)"title.multiplayer.realms", (Object[])new Object[0]));
            } else if (!(this.field_1766 != null || class_6422 != null && class_6422.method_2994())) {
                stringBuilder.append(class_1074.method_4662((String)"title.multiplayer.other", (Object[])new Object[0]));
            } else {
                stringBuilder.append(class_1074.method_4662((String)"title.multiplayer.lan", (Object[])new Object[0]));
            }
        }
        return stringBuilder.toString();
    }

    @Shadow
    public class_634 method_1562() {
        return null;
    }

    @Shadow
    public class_642 method_1558() {
        return null;
    }
}

