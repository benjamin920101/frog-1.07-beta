/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.Items
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.listener.ClientPlayPacketListener
 *  net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket$PositionAndOnGround
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket$Full
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket$LookAndOnGround
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket$OnGroundOnly
 *  net.minecraft.client.util.math.MatrixStack
 */
package dev.idhammai.c.r.q.Q;

import dev.idhammai.P.A.S.K;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.J;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.P.r.c.i;
import dev.idhammai.c.r.O.Y.A;
import dev.idhammai.c.r.O.Y.O;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import java.awt.Color;
import net.minecraft.item.Items;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.client.util.math.MatrixStack;

public class T
extends y {
    final O w = this.n(new O("Confirm", -1).E("\u786e\u8ba4\u6309\u952e"));
    private final A V = this.y(new A("Color", new Color(255, 255, 255, 100)).P("\u6807\u8bb0\u989c\u8272"));
    class_243 h = null;
    class_2708 L = null;
    boolean c = false;
    int J = 0;

    public T() {
        super("ChorusControl", dev.idhammai.c.r.w.Exploit);
        this.L("\u7d2b\u9882\u679c\u63a7\u5236");
    }

    @Override
    public void L() {
        if (this.L != null) {
            this.L.method_11740((class_2602)W.method_1562());
            this.M();
        }
    }

    private void M() {
        this.L = null;
        this.h = null;
    }

    @r(D=-200)
    public void n(dev.idhammai.P.r.c.T t2) {
        if (this.L != null) {
            t2.C(0.0);
            t2.Z(0.0);
            t2.p(0.0);
        }
    }

    @Override
    public void h(class_4587 class_45872) {
        if (this.h != null) {
            K.F(class_45872, new class_238(this.h.method_10216() - 0.3, this.h.method_10214(), this.L.method_11738() - 0.3, this.h.method_10216() + 0.3, this.h.method_10214() + 1.85, this.h.method_10215() + 0.3), this.V.P());
        }
    }

    @r
    public void d(QO qO) {
        if (T.W.field_1724.method_6030() == null) {
            return;
        }
        if (T.W.field_1724.method_6030().method_7909() == class_1802.field_8233) {
            this.c = true;
        } else if (this.c) {
            ++this.J;
            if (this.J > 5) {
                this.c = false;
                this.J = 0;
            }
        }
        if (this.w.G() && this.L != null) {
            this.L.method_11740((class_2602)W.method_1562());
            this.M();
        }
    }

    @r
    public void Y(i i2) {
        class_2596<?> class_25962 = i2.L();
        if (class_25962 instanceof class_2708) {
            class_2708 class_27082 = (class_2708)class_25962;
            if (this.c || this.h != null) {
                this.L = class_27082;
                this.h = new class_243(this.L.method_11734(), this.L.method_11735(), this.L.method_11738());
                i2.L();
            }
        }
    }

    @r
    public void Y(J j2) {
        if (this.L != null && (j2.L() instanceof class_2828 || j2.L() instanceof class_2828.class_2830 || j2.L() instanceof class_2828.class_2831 || j2.L() instanceof class_2828.class_5911 || j2.L() instanceof class_2828.class_2829)) {
            j2.L();
        }
    }
}

