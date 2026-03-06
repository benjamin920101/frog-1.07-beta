/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket$Full
 */
package dev.idhammai.c.r.q.i;

import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.J;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.asm.accessors.IPlayerMoveC2SPacket;
import dev.idhammai.c.r.O.Y.B;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.q.Q.X;
import dev.idhammai.c.r.q.i.g;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import java.util.Iterator;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;

public class G
extends y {
    private final B<g> L = this.S(new B<g>("Mode", g.Packet).I("\u6a21\u5f0f").X(g.Packet, "\u53d1\u5305").X(g.Grim, "Grim"));
    private final l J = this.p(new l("Distance", 3.0, 0.0, 8.0, 0.1).D("\u89e6\u53d1\u8ddd\u79bb"));

    public G() {
        super("NoFall", "Prevents fall damage.", w.Player);
        this.L("\u6ca1\u6709\u6454\u843d\u4f24\u5bb3");
    }

    @Override
    public String I() {
        return this.L.X().name();
    }

    @r
    public void F(QO qO) {
        if (G.M()) {
            return;
        }
        if (this.L.x(g.Grim) && this.b()) {
            W.method_1562().method_52787((class_2596)new class_2828.class_2830(G.W.field_1724.method_23317(), G.W.field_1724.method_23318() + 1.0E-9, G.W.field_1724.method_23321(), G.W.field_1724.method_36454(), G.W.field_1724.method_36455(), false));
            G.W.field_1724.method_38785();
        }
    }

    private boolean b() {
        return G.W.field_1724.field_6017 > (float)G.W.field_1724.method_5850() && !G.W.field_1724.method_24828() && !G.W.field_1724.method_6128();
    }

    @r
    public void Q(J j2) {
        if (G.M()) {
            return;
        }
        for (class_1799 class_17992 : G.W.field_1724.method_5661()) {
            if (class_17992.method_7909() != class_1802.field_8833) continue;
            return;
        }
        if (!this.L.x(g.Packet)) {
            return;
        }
        Iterator iterator = j2.L();
        if (iterator instanceof class_2828) {
            class_1799 class_17992;
            class_17992 = (class_2828)iterator;
            if (G.W.field_1724.field_6017 >= (float)this.J.e() && !X.j) {
                ((IPlayerMoveC2SPacket)class_17992).setOnGround(true);
            }
        }
    }
}

