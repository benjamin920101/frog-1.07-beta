/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.client.network.OtherClientPlayerEntity
 */
package dev.idhammai.c.r.q.x;

import com.mojang.authlib.GameProfile;
import dev.idhammai.P.A.J;
import dev.idhammai.asm.accessors.ILivingEntity;
import java.util.UUID;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.network.OtherClientPlayerEntity;

public class o
extends class_745 {
    private final boolean l;

    public o(class_1657 class_16572, String string) {
        super(J.W.field_1687, new GameProfile(UUID.fromString("66666666-6666-6666-6666-666666666666"), string));
        this.method_5719((class_1297)class_16572);
        this.field_6014 = class_16572.field_6014;
        this.field_5969 = class_16572.field_5969;
        this.field_6036 = class_16572.field_6036;
        this.field_6283 = class_16572.field_6283;
        this.field_6241 = class_16572.field_6241;
        this.field_6251 = class_16572.field_6251;
        this.field_6279 = class_16572.field_6279;
        this.field_42108.method_48567(class_16572.field_42108.method_48566());
        this.field_42108.field_42111 = class_16572.field_42108.method_48569();
        ((ILivingEntity)((Object)this)).setLeaningPitch(((ILivingEntity)class_16572).getLeaningPitch());
        ((ILivingEntity)((Object)this)).setLastLeaningPitch(((ILivingEntity)class_16572).getLeaningPitch());
        this.field_5957 = class_16572.method_5799();
        this.method_5660(class_16572.method_5715());
        this.method_18380(class_16572.method_18376());
        this.method_5729(7, class_16572.method_6128());
        this.l = class_16572.method_24828();
        this.method_24830(this.l);
        this.method_31548().method_7377(class_16572.method_31548());
        this.method_52544(class_16572.method_6067());
        this.method_6033(class_16572.method_6032());
        this.method_5857(class_16572.method_5829());
    }

    public boolean method_24828() {
        return this.l;
    }

    public boolean method_7325() {
        return false;
    }

    public boolean method_7337() {
        return false;
    }
}

