/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.Entity$RemovalReason
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.s2c.play.ExplosionS2CPacket
 *  net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket
 *  net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket
 *  net.minecraft.network.packet.c2s.play.TeleportConfirmC2SPacket
 *  net.minecraft.network.packet.c2s.play.ChatMessageC2SPacket
 *  net.minecraft.network.packet.c2s.play.ClientStatusC2SPacket
 *  net.minecraft.network.packet.c2s.play.RequestCommandCompletionsC2SPacket
 *  net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket
 *  net.minecraft.network.packet.c2s.common.KeepAliveC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket
 *  net.minecraft.network.packet.c2s.play.AdvancementTabC2SPacket
 *  net.minecraft.network.packet.c2s.play.HandSwingC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket
 *  net.minecraft.client.font.TextRenderer
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.network.OtherClientPlayerEntity
 *  net.minecraft.network.packet.c2s.play.CommandExecutionC2SPacket
 */
package dev.idhammai.c.r.q.Q;

import com.mojang.authlib.GameProfile;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.J;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.P.r.c.i;
import dev.idhammai.asm.accessors.IExplosionS2CPacket;
import dev.idhammai.c.r.O.Y.A;
import dev.idhammai.c.r.O.Y.O;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import java.awt.Color;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.ExplosionS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket;
import net.minecraft.network.packet.c2s.play.TeleportConfirmC2SPacket;
import net.minecraft.network.packet.c2s.play.ChatMessageC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientStatusC2SPacket;
import net.minecraft.network.packet.c2s.play.RequestCommandCompletionsC2SPacket;
import net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;
import net.minecraft.network.packet.c2s.common.KeepAliveC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.network.packet.c2s.play.AdvancementTabC2SPacket;
import net.minecraft.network.packet.c2s.play.HandSwingC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.network.OtherClientPlayerEntity;
import net.minecraft.network.packet.c2s.play.CommandExecutionC2SPacket;

public class W
extends y {
    public static W b;
    public static class_745 h;
    final CopyOnWriteArrayList<class_2596<?>> t = new CopyOnWriteArrayList();
    public final dev.idhammai.c.r.O.Y.W u = this.S(new dev.idhammai.c.r.O.Y.W("Render", true).k("\u6e32\u67d3\u5047\u4eba"));
    public final dev.idhammai.c.r.O.Y.W m = this.S(new dev.idhammai.c.r.O.Y.W("PauseModule", true).k("\u6682\u505c\u6a21\u5757"));
    public final dev.idhammai.c.r.O.Y.W E = this.S(new dev.idhammai.c.r.O.Y.W("LagbackCheck", true).k("\u56de\u5f39\u68c0\u6d4b"));
    private final dev.idhammai.c.r.O.Y.W M = this.S(new dev.idhammai.c.r.O.Y.W("OnlyMove", true).k("\u4ec5\u79fb\u52a8\u5305"));
    private final dev.idhammai.c.r.O.Y.W c = this.S(new dev.idhammai.c.r.O.Y.W("Velocity", false).k("\u62e6\u622a\u51fb\u9000"));
    private final dev.idhammai.c.r.O.Y.W X = this.S(new dev.idhammai.c.r.O.Y.W("LimitPackets", false).k("\u9650\u5236\u5305\u6570"));
    private final l A = this.p(new l("MaxPackets", 60.0, 0.0, 200.0, this.X::h).D("\u6700\u5927\u5305\u6570"));
    private final dev.idhammai.c.r.O.Y.W f = this.S(new dev.idhammai.c.r.O.Y.W("Pulse", false).k("\u8109\u51b2\u53d1\u9001"));
    private final l C = this.p(new l("Factor", 1.0, 0.0, 10.0, this.f::h).D("\u8109\u51b2\u7cfb\u6570"));
    public final dev.idhammai.c.r.O.Y.W k = this.S(new dev.idhammai.c.r.O.Y.W("Indicator", true).k("\u5c4f\u5e55\u6307\u793a\u5668").D());
    private final A Y = this.y(new A("Color", new Color(255, 255, 255, 255), this.k::f).P("\u6307\u793a\u5668\u989c\u8272"));
    private final l H = this.p(new l("YOffset", 0, -200, 200, this.k::f).D("Y\u504f\u79fb"));
    final O w = this.n(new O("Cancel", -1).E("\u53d6\u6d88\u6309\u952e"));
    private boolean V;
    private class_243 e;
    private float K;
    private float L;

    public W() {
        super("Blink", dev.idhammai.c.r.w.Exploit);
        this.L("\u77ac\u79fb");
        b = this;
    }

    @Override
    public void C(class_332 class_3322, float f2) {
        if (this.k.h()) {
            String string = "Blinking.. (" + this.t.size() + ")";
            class_327 class_3272 = W.W.field_1772;
            int n2 = W.method_22683().method_4486() / 2 - W.W.field_1772.method_1727(string) / 2;
            int n3 = W.method_22683().method_4502() / 2;
            Objects.requireNonNull(W.W.field_1772);
            class_3322.method_51433(class_3272, string, n2, n3 + 9 - this.H.V(), this.Y.P().getRGB(), true);
        }
    }

    @r
    public void Z(i i2) {
        class_2743 class_27432;
        if (W.M() || !this.c.h()) {
            return;
        }
        class_2596<?> class_25962 = i2.L();
        if (class_25962 instanceof class_2664) {
            class_2664 class_26642 = (class_2664)class_25962;
            IExplosionS2CPacket iExplosionS2CPacket = (IExplosionS2CPacket)class_26642;
            iExplosionS2CPacket.setVelocityX(0.0f);
            iExplosionS2CPacket.setVelocityY(0.0f);
            iExplosionS2CPacket.setVelocityZ(0.0f);
            return;
        }
        class_25962 = i2.L();
        if (class_25962 instanceof class_2743 && (class_27432 = (class_2743)class_25962).method_11818() == W.W.field_1724.method_5628()) {
            i2.L();
        }
    }

    @Override
    public void H() {
        this.t.clear();
        if (W.M()) {
            this.p();
            return;
        }
        this.e = W.W.field_1724.method_19538();
        this.K = W.W.field_1724.method_36454();
        this.L = W.W.field_1724.method_36455();
        if (!this.u.h()) {
            return;
        }
        h = new class_745(W.W.field_1687, new GameProfile(UUID.fromString("11451466-6666-6666-6666-666666666601"), W.W.field_1724.method_5477().getString()));
        h.method_5719((class_1297)W.W.field_1724);
        W.h.field_6283 = W.W.field_1724.field_6283;
        W.h.field_6241 = W.W.field_1724.field_6241;
        h.method_31548().method_7377(W.W.field_1724.method_31548());
        W.W.field_1687.method_53875((class_1297)h);
    }

    @r
    public void e(QO qO) {
        if (W.W.field_1724.method_29504()) {
            this.t.clear();
            this.p();
            return;
        }
        if (this.w.G()) {
            this.g();
            return;
        }
        if (this.X.h() && (double)this.t.size() > this.A.e()) {
            this.g();
            return;
        }
        if (this.f.h() && (double)this.t.size() > this.C.e() * 10.0) {
            this.V = true;
            for (class_2596<?> class_25962 : this.t) {
                W.method_1562().method_52787(class_25962);
            }
            this.t.clear();
            if (h != null) {
                h.method_5719((class_1297)W.W.field_1724);
                h.method_5847(W.W.field_1724.field_6241);
                h.method_5636(W.W.field_1724.field_6283);
            }
            this.V = false;
        }
    }

    @Override
    public void F() {
        if (this.p()) {
            this.t.clear();
            this.p();
        }
    }

    @r
    public void F(J j2) {
        if (this.V) {
            return;
        }
        class_2596<?> class_25962 = j2.L();
        if (class_25962 instanceof class_2797) {
            return;
        }
        if (class_25962 instanceof class_2805) {
            return;
        }
        if (class_25962 instanceof class_7472) {
            return;
        }
        if (class_25962 instanceof class_2793) {
            return;
        }
        if (class_25962 instanceof class_2827) {
            return;
        }
        if (class_25962 instanceof class_2859) {
            return;
        }
        if (class_25962 instanceof class_2799) {
            return;
        }
        if (class_25962 instanceof class_2813) {
            return;
        }
        if (!this.M.h() && (j2.L() instanceof class_2846 || j2.L() instanceof class_2848 || j2.L() instanceof class_2879 || j2.L() instanceof class_2824 || j2.L() instanceof class_2885 || j2.L() instanceof class_2886) || j2.L() instanceof class_2828) {
            j2.L();
            this.t.add(j2.L());
        }
    }

    @r
    public void f(i i2) {
        if (this.E.h() && i2.L() instanceof class_2708) {
            this.g();
        }
    }

    private void g() {
        W.W.field_1724.method_33574(this.e);
        W.W.field_1724.method_36456(this.K);
        W.W.field_1724.method_36457(this.L);
        this.t.clear();
        this.p();
    }

    @Override
    public void L() {
        if (W.M()) {
            this.t.clear();
            this.p();
            return;
        }
        if (h != null) {
            h.method_5768();
            h.method_31745(class_1297.class_5529.field_26998);
            h.method_36209();
            h = null;
        }
        for (class_2596<?> class_25962 : this.t) {
            W.method_1562().method_52787(class_25962);
        }
    }

    @Override
    public String I() {
        return String.valueOf(this.t.size());
    }
}

