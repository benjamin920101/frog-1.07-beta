/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2505
 *  net.minecraft.class_2540
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.ModifyArg
 */
package dev.idhammai.asm.mixins;

import dev.idhammai.c.r.q.Q.c;
import net.minecraft.class_2505;
import net.minecraft.class_2540;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(value={class_2540.class})
public abstract class MixinPacketByteBuf {
    @ModifyArg(method={"readNbt(Lio/netty/buffer/ByteBuf;)Lnet/minecraft/nbt/NbtCompound;"}, at=@At(value="INVOKE", target="Lnet/minecraft/network/PacketByteBuf;readNbt(Lio/netty/buffer/ByteBuf;Lnet/minecraft/nbt/NbtSizeTracker;)Lnet/minecraft/nbt/NbtElement;"))
    private static class_2505 xlPackets(class_2505 class_25052) {
        return c.w.p() && c.w.c.h() ? class_2505.method_53898() : class_25052;
    }
}

