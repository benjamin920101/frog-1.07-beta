/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  net.minecraft.class_1313
 *  net.minecraft.class_243
 *  net.minecraft.class_310
 *  net.minecraft.class_3532
 *  net.minecraft.class_638
 *  net.minecraft.class_742
 *  net.minecraft.class_744
 *  net.minecraft.class_746
 *  org.spongepowered.asm.mixin.Final
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

import com.mojang.authlib.GameProfile;
import dev.idhammai.Frog;
import dev.idhammai.P.r.O;
import dev.idhammai.P.r.c.F;
import dev.idhammai.P.r.c.H;
import dev.idhammai.P.r.c.Q;
import dev.idhammai.P.r.c.T;
import dev.idhammai.P.r.c.y;
import dev.idhammai.asm.accessors.IClientPlayerEntity;
import dev.idhammai.c.r.q.D.f;
import dev.idhammai.c.r.q.D.z;
import dev.idhammai.c.r.q.N.I;
import dev.idhammai.c.r.q.N.x;
import dev.idhammai.c.r.q.Q.h;
import dev.idhammai.p.J.G;
import dev.idhammai.p.J.S;
import net.minecraft.class_1313;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_638;
import net.minecraft.class_742;
import net.minecraft.class_744;
import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_746.class})
public abstract class MixinClientPlayerEntity
extends class_742 {
    @Shadow
    public class_744 field_3913;
    @Final
    @Shadow
    protected class_310 field_3937;
    @Unique
    private float preYaw;
    @Unique
    private float prePitch;
    @Unique
    private boolean rotation = false;
    @Shadow
    private double field_3926;
    @Shadow
    private double field_3940;
    @Shadow
    private double field_3924;
    @Shadow
    private int field_3923;
    @Shadow
    private float field_3941;
    @Shadow
    private float field_3925;

    public MixinClientPlayerEntity(class_638 class_6382, GameProfile gameProfile) {
        super(class_6382, gameProfile);
    }

    @Inject(method={"pushOutOfBlocks"}, at={@At(value="HEAD")}, cancellable=true)
    private void onPushOutOfBlocksHook(double d2, double d3, CallbackInfo callbackInfo) {
        if (f.V.p() && f.V.D.h()) {
            callbackInfo.cancel();
        }
    }

    @Redirect(method={"tickMovement"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/network/ClientPlayerEntity;isUsingItem()Z"), require=0)
    private boolean tickMovementHook(class_746 class_7462) {
        if (z.f.L()) {
            return false;
        }
        return class_7462.method_6115();
    }

    @Inject(at={@At(value="HEAD")}, method={"tickNausea"}, cancellable=true)
    private void updateNausea(CallbackInfo callbackInfo) {
        if (I.Q.w()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"move"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/network/AbstractClientPlayerEntity;move(Lnet/minecraft/entity/MovementType;Lnet/minecraft/util/math/Vec3d;)V")}, cancellable=true)
    public void onMoveHook(class_1313 class_13132, class_243 class_2432, CallbackInfo callbackInfo) {
        T t2 = T.N(class_2432.field_1352, class_2432.field_1351, class_2432.field_1350);
        Frog.EVENT_BUS.J(t2);
        if (t2.p()) {
            callbackInfo.cancel();
        } else if (t2.i) {
            callbackInfo.cancel();
            super.method_5784(class_13132, new class_243(t2.Z(), t2.G(), t2.w()));
            Frog.EVENT_BUS.J(y.N);
        }
    }

    @Inject(method={"move"}, at={@At(value="TAIL")})
    public void onMoveReturnHook(class_1313 class_13132, class_243 class_2432, CallbackInfo callbackInfo) {
        Frog.EVENT_BUS.J(y.N);
    }

    @Shadow
    public abstract float method_5695(float var1);

    @Shadow
    public abstract float method_5705(float var1);

    @Inject(method={"tick"}, at={@At(value="HEAD")})
    private void tickHead(CallbackInfo callbackInfo) {
        block2: {
            try {
                Frog.EVENT_BUS.J(F.O(O.Pre));
            }
            catch (Exception exception) {
                exception.printStackTrace();
                if (!I.Q.M.h()) break block2;
                S.z("\u00a74An error has occurred (ClientPlayerEntity.tick() [HEAD]) Message: [" + exception.getMessage() + "]");
            }
        }
    }

    @Inject(method={"tick"}, at={@At(value="RETURN")})
    private void tickReturn(CallbackInfo callbackInfo) {
        block2: {
            try {
                Frog.EVENT_BUS.J(F.O(O.Post));
            }
            catch (Exception exception) {
                exception.printStackTrace();
                if (!I.Q.M.h()) break block2;
                S.z("\u00a74An error has occurred (ClientPlayerEntity.tick() [RETURN]) Message: [" + exception.getMessage() + "]");
            }
        }
    }

    @Inject(method={"sendMovementPackets"}, at={@At(value="HEAD")})
    private void onSendMovementPacketsHead(CallbackInfo callbackInfo) {
        this.rotation();
        if (h.h.p() && h.h.F.h() && this.field_3923 >= h.h.V.V() - 1) {
            ((IClientPlayerEntity)((Object)this)).setTicksSinceLastPositionPacketSent(50);
        }
        if (G.r) {
            ((IClientPlayerEntity)((Object)this)).setTicksSinceLastPositionPacketSent(50);
            ((IClientPlayerEntity)((Object)this)).setLastYaw(999.0f);
            G.r = false;
            return;
        }
        if (x.y.U.h()) {
            double d2 = this.method_23317() - this.field_3926;
            double d3 = this.method_23318() - this.field_3940;
            double d4 = this.method_23321() - this.field_3924;
            double d5 = this.method_36454() - this.field_3941;
            double d6 = this.method_36455() - this.field_3925;
            boolean bl = d5 != 0.0 || d6 != 0.0;
            boolean bl2 = bl;
            if (x.y.E.h() || !(class_3532.method_41190((double)d2, (double)d3, (double)d4) > class_3532.method_33723((double)2.0E-4)) && this.field_3923 >= 19 || bl) {
                ((IClientPlayerEntity)((Object)this)).setTicksSinceLastPositionPacketSent(50);
                ((IClientPlayerEntity)((Object)this)).setLastYaw(999.0f);
            }
        }
    }

    @Inject(method={"tick"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/network/ClientPlayNetworkHandler;sendPacket(Lnet/minecraft/network/packet/Packet;)V", ordinal=0)})
    private void onTickHasVehicleBeforeSendPackets(CallbackInfo callbackInfo) {
        this.rotation();
    }

    @Unique
    private void rotation() {
        this.rotation = true;
        this.preYaw = this.method_36454();
        this.prePitch = this.method_36455();
        H h2 = H.x(this.method_36454(), this.method_36455());
        Frog.EVENT_BUS.J(h2);
        Frog.ROTATION.Q = h2.q();
        Frog.ROTATION.g = h2.l();
        this.method_36456(h2.q());
        this.method_36457(h2.l());
    }

    @Inject(method={"sendMovementPackets"}, at={@At(value="TAIL")})
    private void onSendMovementPacketsTail(CallbackInfo callbackInfo) {
        if (this.rotation) {
            this.method_36456(this.preYaw);
            this.method_36457(this.prePitch);
            this.rotation = false;
        }
    }

    @Inject(method={"tick"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/network/ClientPlayNetworkHandler;sendPacket(Lnet/minecraft/network/packet/Packet;)V", ordinal=1, shift=At.Shift.AFTER)})
    private void onTickHasVehicleAfterSendPackets(CallbackInfo callbackInfo) {
        if (this.rotation) {
            this.method_36456(this.preYaw);
            this.method_36457(this.prePitch);
            this.rotation = false;
        }
    }

    @Inject(method={"tickMovement"}, at={@At(value="HEAD")})
    private void tickMovement(CallbackInfo callbackInfo) {
        Frog.EVENT_BUS.J(Q.C);
    }
}

