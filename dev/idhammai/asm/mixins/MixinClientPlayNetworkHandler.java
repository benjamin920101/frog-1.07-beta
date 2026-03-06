/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.thread.ThreadExecutor
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.network.ClientConnection
 *  net.minecraft.network.listener.PacketListener
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.NetworkThreadUtils
 *  net.minecraft.network.listener.ClientPlayPacketListener
 *  net.minecraft.network.packet.s2c.play.CloseScreenS2CPacket
 *  net.minecraft.network.packet.s2c.play.InventoryS2CPacket
 *  net.minecraft.network.packet.s2c.play.GameJoinS2CPacket
 *  net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket
 *  net.minecraft.network.packet.s2c.play.PositionFlag
 *  net.minecraft.network.packet.c2s.play.TeleportConfirmC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket$Full
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.network.ClientPlayNetworkHandler
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.network.packet.s2c.play.EnterReconfigurationS2CPacket
 *  net.minecraft.client.network.ClientCommonNetworkHandler
 *  net.minecraft.client.network.ClientConnectionState
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.At$Shift
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.Redirect
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package dev.idhammai.asm.mixins;

import dev.idhammai.Frog;
import dev.idhammai.P.r.c.E;
import dev.idhammai.P.r.c.X;
import dev.idhammai.P.r.c.Z;
import dev.idhammai.P.r.c.k;
import dev.idhammai.P.r.c.w;
import dev.idhammai.P.r.c.x;
import dev.idhammai.c.r.q.Q.c;
import net.minecraft.util.thread.ThreadExecutor;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.ClientConnection;
import net.minecraft.network.listener.PacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.NetworkThreadUtils;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.s2c.play.CloseScreenS2CPacket;
import net.minecraft.network.packet.s2c.play.InventoryS2CPacket;
import net.minecraft.network.packet.s2c.play.GameJoinS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.network.packet.s2c.play.PositionFlag;
import net.minecraft.network.packet.c2s.play.TeleportConfirmC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.network.packet.s2c.play.EnterReconfigurationS2CPacket;
import net.minecraft.client.network.ClientCommonNetworkHandler;
import net.minecraft.client.network.ClientConnectionState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_634.class})
public abstract class MixinClientPlayNetworkHandler
extends class_8673 {
    @Shadow
    private class_638 field_3699;
    @Unique
    private boolean frog$worldNotNull;
    @Unique
    private boolean ignore;

    protected MixinClientPlayNetworkHandler(class_310 class_3102, class_2535 class_25352, class_8675 class_86752) {
        super(class_3102, class_25352, class_86752);
    }

    @Inject(method={"onEnterReconfiguration"}, at={@At(value="INVOKE", target="Lnet/minecraft/network/NetworkThreadUtils;forceMainThread(Lnet/minecraft/network/packet/Packet;Lnet/minecraft/network/listener/PacketListener;Lnet/minecraft/util/thread/ThreadExecutor;)V", shift=At.Shift.AFTER)})
    private void onEnterReconfiguration(class_8588 class_85882, CallbackInfo callbackInfo) {
        Frog.EVENT_BUS.J(k.h);
    }

    @Inject(method={"onGameJoin"}, at={@At(value="HEAD")})
    private void onGameJoinHead(class_2678 class_26782, CallbackInfo callbackInfo) {
        this.frog$worldNotNull = this.field_3699 != null;
    }

    @Inject(method={"onGameJoin"}, at={@At(value="TAIL")})
    private void onGameJoinTail(class_2678 class_26782, CallbackInfo callbackInfo) {
        if (this.frog$worldNotNull) {
            Frog.EVENT_BUS.J(k.h);
        }
    }

    @Shadow
    public abstract void method_45729(String var1);

    @Inject(method={"onInventory"}, at={@At(value="INVOKE", target="Lnet/minecraft/network/NetworkThreadUtils;forceMainThread(Lnet/minecraft/network/packet/Packet;Lnet/minecraft/network/listener/PacketListener;Lnet/minecraft/util/thread/ThreadExecutor;)V", shift=At.Shift.AFTER)}, cancellable=true)
    public void onInventoryS2CPacket(class_2649 class_26492, CallbackInfo callbackInfo) {
        E e2 = E.i(class_26492);
        Frog.EVENT_BUS.J(e2);
        if (e2.p()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"sendChatMessage"}, at={@At(value="HEAD")}, cancellable=true)
    private void onSendChatMessage(String string, CallbackInfo callbackInfo) {
        if (this.ignore) {
            return;
        }
        if (string.startsWith(Frog.getPrefix())) {
            Frog.COMMAND.L(string.split(" "));
            callbackInfo.cancel();
        } else {
            X x2 = X.u(string);
            Frog.EVENT_BUS.J(x2);
            if (x2.p()) {
                callbackInfo.cancel();
            } else if (!x2.p.equals(x2.M)) {
                this.ignore = true;
                this.method_45729(x2.p);
                this.ignore = false;
                callbackInfo.cancel();
            }
        }
    }

    @Inject(method={"onCloseScreen"}, at={@At(value="INVOKE", target="Lnet/minecraft/network/NetworkThreadUtils;forceMainThread(Lnet/minecraft/network/packet/Packet;Lnet/minecraft/network/listener/PacketListener;Lnet/minecraft/util/thread/ThreadExecutor;)V", shift=At.Shift.AFTER)}, cancellable=true)
    public void onCloseScreen(class_2645 class_26452, CallbackInfo callbackInfo) {
        Z z2 = Z.M();
        Frog.EVENT_BUS.J(z2);
        if (z2.p()) {
            callbackInfo.cancel();
        }
    }

    @Redirect(method={"onEntityVelocityUpdate"}, at=@At(value="INVOKE", target="Lnet/minecraft/entity/Entity;setVelocityClient(DDD)V"), require=0)
    private void velocityHook(class_1297 class_12972, double d2, double d3, double d4) {
        w w2 = w.K(class_12972, d2, d3, d4, false);
        Frog.EVENT_BUS.J(w2);
        if (!w2.p()) {
            class_12972.method_5750(w2.n(), w2.t(), w2.V());
        }
    }

    @Redirect(method={"onExplosion"}, at=@At(value="INVOKE", target="Lnet/minecraft/util/math/Vec3d;add(DDD)Lnet/minecraft/util/math/Vec3d;"), require=0)
    private class_243 velocityHook2(class_243 class_2432, double d2, double d3, double d4) {
        w w2 = w.K((class_1297)this.field_45588.field_1724, d2, d3, d4, true);
        Frog.EVENT_BUS.J(w2);
        if (!w2.p()) {
            return class_2432.method_1031(w2.n(), w2.t(), w2.V());
        }
        return class_2432;
    }

    @Inject(method={"onPlayerPositionLook"}, at={@At(value="INVOKE", target="Lnet/minecraft/network/NetworkThreadUtils;forceMainThread(Lnet/minecraft/network/packet/Packet;Lnet/minecraft/network/listener/PacketListener;Lnet/minecraft/util/thread/ThreadExecutor;)V", shift=At.Shift.AFTER)}, cancellable=true)
    public void onPlayerPositionLook(class_2708 class_27082, CallbackInfo callbackInfo) {
        boolean bl = c.w.p() && c.w.l.h() && Frog.SERVER.l.r(0.25);
        boolean bl2 = bl;
        if (bl) {
            double d2;
            double d3;
            double d4;
            double d5;
            double d6;
            double d7;
            callbackInfo.cancel();
            class_2600.method_11074((class_2596)class_27082, (class_2547)((class_2602)class_634.class.cast((Object)this)), (class_1255)this.field_45588);
            class_746 class_7462 = this.field_45588.field_1724;
            class_243 class_2432 = class_7462.method_18798();
            boolean bl3 = class_27082.method_11733().contains(class_2709.field_12400);
            boolean bl4 = class_27082.method_11733().contains(class_2709.field_12398);
            boolean bl5 = class_27082.method_11733().contains(class_2709.field_12403);
            if (bl3) {
                d7 = class_2432.method_10216();
                d6 = class_7462.method_23317() + class_27082.method_11734();
                class_7462.field_6038 += class_27082.method_11734();
                class_7462.field_6014 += class_27082.method_11734();
            } else {
                d7 = 0.0;
                class_7462.field_6038 = d6 = class_27082.method_11734();
                class_7462.field_6014 = d6;
            }
            if (bl4) {
                d5 = class_2432.method_10214();
                d4 = class_7462.method_23318() + class_27082.method_11735();
                class_7462.field_5971 += class_27082.method_11735();
                class_7462.field_6036 += class_27082.method_11735();
            } else {
                d5 = 0.0;
                class_7462.field_5971 = d4 = class_27082.method_11735();
                class_7462.field_6036 = d4;
            }
            if (bl5) {
                d3 = class_2432.method_10215();
                d2 = class_7462.method_23321() + class_27082.method_11738();
                class_7462.field_5989 += class_27082.method_11738();
                class_7462.field_5969 += class_27082.method_11738();
            } else {
                d3 = 0.0;
                class_7462.field_5989 = d2 = class_27082.method_11738();
                class_7462.field_5969 = d2;
            }
            class_7462.method_5814(d6, d4, d2);
            class_7462.method_18800(d7, d5, d3);
            if (c.w.C.h()) {
                float f2 = class_27082.method_11736();
                float f3 = class_27082.method_11739();
                if (class_27082.method_11733().contains(class_2709.field_12397)) {
                    f3 += Frog.ROTATION.F();
                }
                if (class_27082.method_11733().contains(class_2709.field_12401)) {
                    f2 += Frog.ROTATION.X();
                }
                this.field_45589.method_10743((class_2596)new class_2793(class_27082.method_11737()));
                this.field_45589.method_10743((class_2596)new class_2828.class_2830(class_7462.method_23317(), class_7462.method_23318(), class_7462.method_23321(), f2, f3, false));
            } else {
                this.field_45589.method_10743((class_2596)new class_2793(class_27082.method_11737()));
                this.field_45589.method_10743((class_2596)new class_2828.class_2830(class_7462.method_23317(), class_7462.method_23318(), class_7462.method_23321(), Frog.ROTATION.X(), Frog.ROTATION.F(), false));
            }
            Frog.EVENT_BUS.J(x.y);
        }
    }
}

