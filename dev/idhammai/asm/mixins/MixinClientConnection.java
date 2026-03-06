/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.timeout.TimeoutException
 *  net.minecraft.network.ClientConnection
 *  net.minecraft.network.listener.PacketListener
 *  net.minecraft.network.handler.PacketEncoderException
 *  net.minecraft.network.packet.Packet
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package dev.idhammai.asm.mixins;

import dev.idhammai.Frog;
import dev.idhammai.P.r.c.J;
import dev.idhammai.P.r.c.i;
import dev.idhammai.c.r.q.N.I;
import dev.idhammai.p.J.S;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.timeout.TimeoutException;
import net.minecraft.network.ClientConnection;
import net.minecraft.network.listener.PacketListener;
import net.minecraft.network.handler.PacketEncoderException;
import net.minecraft.network.packet.Packet;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_2535.class})
public class MixinClientConnection {
    @Inject(at={@At(value="HEAD")}, method={"handlePacket"}, cancellable=true)
    private static <T extends class_2547> void onHandlePacket(class_2596<T> class_25962, class_2547 class_25472, CallbackInfo callbackInfo) {
        i i2 = new i(class_25962);
        Frog.EVENT_BUS.J(i2);
        if (i2.p()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"send(Lnet/minecraft/network/packet/Packet;)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void onSendPacketPre(class_2596<?> class_25962, CallbackInfo callbackInfo) {
        J j2 = new J(class_25962);
        Frog.EVENT_BUS.J(j2);
        if (j2.p()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"send(Lnet/minecraft/network/packet/Packet;)V"}, at={@At(value="RETURN")})
    private void onSendPacketPost(class_2596<?> class_25962, CallbackInfo callbackInfo) {
        dev.idhammai.P.r.c.S s2 = new dev.idhammai.P.r.c.S(class_25962);
        Frog.EVENT_BUS.J(s2);
    }

    @Inject(method={"exceptionCaught"}, at={@At(value="HEAD")}, cancellable=true)
    private void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable, CallbackInfo callbackInfo) {
        if (!(throwable instanceof TimeoutException) && !(throwable instanceof class_2548) && I.Q.B.h()) {
            if (I.Q.F.h()) {
                S.z("\u00a74Caught exception \u00a77" + throwable.getMessage());
            }
            callbackInfo.cancel();
        }
    }
}

