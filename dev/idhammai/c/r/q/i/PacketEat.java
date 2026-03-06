/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket$Action
 *  net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket
 *  net.minecraft.component.DataComponentTypes
 */
package dev.idhammai.c.r.q.i;

import dev.idhammai.Frog;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.J;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.w;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
import net.minecraft.component.DataComponentTypes;

public class y
extends dev.idhammai.c.r.y {
    public static y R;
    private final W l = this.S(new W("DeSync", false).k("\u53bb\u540c\u6b65"));
    private final W n = this.S(new W("NoRelease", true).k("\u4e0d\u53d1\u9001\u677e\u624b\u5305"));

    public y() {
        super("PacketEat", w.Player);
        this.L("\u53d1\u5305\u8fdb\u98df");
        R = this;
    }

    @r
    public void q(QO qO) {
        if (this.l.h() && y.W.field_1724.method_6115() && y.W.field_1724.method_6030().method_7909().method_57347().method_57832(class_9334.field_50075)) {
            dev.idhammai.c.r.y.n(y::lambda$onUpdate$0);
        }
    }

    @r
    public void n(J j2) {
        class_2846 class_28462;
        class_2596<?> class_25962;
        if (this.n.h() && (class_25962 = j2.L()) instanceof class_2846 && (class_28462 = (class_2846)class_25962).method_12363() == class_2846.class_2847.field_12974 && y.W.field_1724.method_6030().method_7909().method_57347().method_57832(class_9334.field_50075)) {
            j2.L();
        }
    }

    private static class_2596 lambda$onUpdate$0(int n2) {
        return new class_2886(y.W.field_1724.method_6058(), n2, Frog.ROTATION.X(), Frog.ROTATION.F());
    }
}

