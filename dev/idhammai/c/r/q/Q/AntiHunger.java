/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket$Mode
 */
package dev.idhammai.c.r.q.Q;

import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.J;
import dev.idhammai.asm.accessors.IPlayerMoveC2SPacket;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.q.Q.X;
import dev.idhammai.c.r.q.Q.t;
import dev.idhammai.c.r.q.i.u;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;

public class G
extends y {
    public static G L;
    private final W E = this.S(new W("Sprint", false).k("\u51b2\u523a\u62e6\u622a"));
    private final W g = this.S(new W("Ground", true).k("\u4f2a\u79bb\u5730"));

    public G() {
        super("AntiHunger", w.Exploit);
        this.L("\u9632\u6389\u9971\u98df\u5ea6");
        L = this;
    }

    @r(D=-100)
    public void h(J j2) {
        if (X.j) {
            return;
        }
        if (u.B || t.V.p()) {
            return;
        }
        class_2596<?> class_25962 = j2.L();
        if (class_25962 instanceof class_2848) {
            class_2848 class_28482 = (class_2848)class_25962;
            if (this.E.h() && class_28482.method_12365() == class_2848.class_2849.field_12981) {
                j2.L();
            }
        }
        if (j2.L() instanceof class_2828 && this.g.h() && G.W.field_1724.field_6017 <= 0.0f && !G.W.field_1761.method_2923()) {
            ((IPlayerMoveC2SPacket)j2.L()).setOnGround(false);
        }
    }
}

