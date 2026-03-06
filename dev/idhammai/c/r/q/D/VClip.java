/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket$PositionAndOnGround
 */
package dev.idhammai.c.r.q.D;

import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.c.r.O.Y.B;
import dev.idhammai.c.r.q.D.q;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;

public class J
extends y {
    private final B<q> G = this.S(new B<q>("Mode", q.Jump).I("\u6a21\u5f0f").X(q.Glitch, "\u6545\u969c").X(q.Teleport, "\u4f20\u9001").X(q.Jump, "\u8df3\u8dc3"));

    public J() {
        super("VClip", w.Movement);
        this.L("\u7eb5\u5411\u7a7f\u5899");
    }

    @r
    public void I(QO qO) {
        this.p();
        switch (this.G.X().ordinal()) {
            case 1: {
                J.W.field_1724.method_5814(J.W.field_1724.method_23317(), J.W.field_1724.method_23318() + 3.0, J.W.field_1724.method_23321());
                W.method_1562().method_52787((class_2596)new class_2828.class_2829(J.W.field_1724.method_23317(), J.W.field_1724.method_23318(), J.W.field_1724.method_23321(), true));
                break;
            }
            case 2: {
                W.method_1562().method_52787((class_2596)new class_2828.class_2829(J.W.field_1724.method_23317(), J.W.field_1724.method_23318() + 0.4199999868869781, J.W.field_1724.method_23321(), false));
                W.method_1562().method_52787((class_2596)new class_2828.class_2829(J.W.field_1724.method_23317(), J.W.field_1724.method_23318() + 0.7531999805212017, J.W.field_1724.method_23321(), false));
                J.W.field_1724.method_5814(J.W.field_1724.method_23317(), J.W.field_1724.method_23318() + 1.0, J.W.field_1724.method_23321());
                W.method_1562().method_52787((class_2596)new class_2828.class_2829(J.W.field_1724.method_23317(), J.W.field_1724.method_23318(), J.W.field_1724.method_23321(), true));
                break;
            }
            case 0: {
                double d2 = J.W.field_1724.method_23317();
                double d3 = Math.round(J.W.field_1724.method_23318());
                double d4 = J.W.field_1724.method_23321();
                boolean bl = J.W.field_1724.method_24828();
                W.method_1562().method_52787((class_2596)new class_2828.class_2829(d2, d3, d4, bl));
                double d5 = 0.005;
                J.W.field_1724.method_5814(d2, d3 -= d5, d4);
                W.method_1562().method_52787((class_2596)new class_2828.class_2829(d2, d3, d4, bl));
                J.W.field_1724.method_5814(d2, d3 -= d5 * 300.0, d4);
                W.method_1562().method_52787((class_2596)new class_2828.class_2829(d2, d3, d4, bl));
            }
        }
    }
}

