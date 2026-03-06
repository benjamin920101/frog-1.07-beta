/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket
 *  net.minecraft.client.gui.screen.ChatScreen
 *  net.minecraft.client.gui.screen.GameMenuScreen
 *  net.minecraft.client.gui.screen.Screen
 *  net.minecraft.client.gui.screen.ingame.InventoryScreen
 */
package dev.idhammai.c.r.q.Q;

import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.J;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.c.r.y;
import dev.idhammai.c.y.u.I.t;
import net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.gui.screen.GameMenuScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;

public class w
extends y {
    class_437 Q = null;

    public w() {
        super("XCarry", dev.idhammai.c.r.w.Exploit);
        this.L("\u5408\u6210\u680f\u643a\u5e26");
    }

    @r
    public void s(QO qO) {
        if (!(w.W.field_1755 == null || w.W.field_1755 instanceof class_433 || w.W.field_1755 instanceof class_408 || w.W.field_1755 instanceof t)) {
            this.Q = w.W.field_1755;
        }
    }

    @r
    public void a(J j2) {
        if (this.Q instanceof class_490 && j2.L() instanceof class_2815) {
            j2.L();
        }
    }
}

