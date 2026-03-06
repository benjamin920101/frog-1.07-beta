/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.Unpooled
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.decoration.EndCrystalEntity
 *  net.minecraft.item.Items
 *  net.minecraft.network.PacketByteBuf
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket$InteractType
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket$PositionAndOnGround
 */
package dev.idhammai.c.r.q.Q;

import dev.idhammai.P.A.L.e;
import dev.idhammai.P.A.L.g;
import dev.idhammai.P.r.K.r;
import dev.idhammai.asm.accessors.IPlayerMoveC2SPacket;
import dev.idhammai.c.r.O.Y.B;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.q.A.I;
import dev.idhammai.c.r.q.Q.R;
import dev.idhammai.c.r.q.Q.d;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import io.netty.buffer.Unpooled;
import net.minecraft.entity.Entity;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.item.Items;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;

public class J
extends y {
    public static J R;
    private final B<d> m = this.S(new B<d>("Mode", d.Vanilla).I("\u6a21\u5f0f").X(d.Vanilla, "\u539f\u7248").X(d.NCP, "NCP").X(d.Swap, "\u5207\u6362"));
    private final W t = this.S(new W("NoCrystal", true, this::lambda$new$0).k("\u5ffd\u7565\u6c34\u6676"));
    private final W I = this.S(new W("InventorySwap", false, this::lambda$new$1).k("\u80cc\u5305\u5207\u6362"));
    private final W h = this.S(new W("OnlyGround", true, this::lambda$new$2).k("\u4ec5\u5730\u9762"));
    private final l c = this.p(new l("Height", 25.0, 0.0, 2000.0, 0.1, this::lambda$new$3).D("\u9ad8\u5ea6"));
    boolean s = false;
    private class_2824 H = null;

    public J() {
        super("MaceSpoof", w.Exploit);
        this.L("\u98ce\u9524\u52a0\u4f24");
        R = this;
    }

    public static class_1297 l(class_2824 class_28242) {
        class_2540 class_25402 = new class_2540(Unpooled.buffer());
        class_28242.method_55976(class_25402);
        return J.W.field_1687 == null ? null : J.W.field_1687.method_8469(class_25402.method_10816());
    }

    public static R K(class_2824 class_28242) {
        class_2540 class_25402 = new class_2540(Unpooled.buffer());
        class_28242.method_55976(class_25402);
        class_25402.method_10816();
        return (R)class_25402.method_10818(R.class);
    }

    @r(D=200)
    public void d(dev.idhammai.P.r.c.J j2) {
        if (J.M()) {
            return;
        }
        if (this.m.x(d.Vanilla)) {
            class_1297 class_12972;
            class_2824 class_28242;
            class_2596<?> class_25962;
            if (!(J.W.field_1724.method_6047().method_7909() != class_1802.field_49814 || !((class_25962 = j2.L()) instanceof class_2824) || J.K(class_28242 = (class_2824)class_25962) != dev.idhammai.c.r.q.Q.R.ATTACK || (class_12972 = J.l(class_28242)) instanceof class_1511 || this.h.h() && !J.W.field_1724.method_24828() && !J.W.field_1724.method_31549().field_7479 || J.W.field_1724.method_5771() || J.W.field_1724.method_5869() || class_12972 == null)) {
                for (int i2 = 0; i2 < 4; ++i2) {
                    this.G(0.0);
                }
                this.G(this.c.e());
                this.G(0.0);
            }
        } else if (this.m.x(d.NCP)) {
            if (j2.L() instanceof class_2828) {
                ((IPlayerMoveC2SPacket)j2.L()).setOnGround(false);
            }
        } else if (this.m.x(d.Swap)) {
            class_2824 class_28243;
            if (j2.p()) {
                return;
            }
            int n2 = this.n();
            if (n2 == -1) {
                return;
            }
            if (this.s) {
                return;
            }
            class_2596<?> class_25963 = j2.L();
            if (class_25963 instanceof class_2824 && dev.idhammai.c.r.q.A.I.a(class_28243 = (class_2824)class_25963) == class_2824.class_5907.field_29172) {
                if (this.t.h() && dev.idhammai.c.r.q.A.I.K(class_28243) instanceof class_1511) {
                    return;
                }
                this.H = class_28243;
                this.s = true;
                this.x();
                this.s = false;
                j2.L();
            }
        }
    }

    private void x() {
        if (this.H == null) {
            return;
        }
        int n2 = this.n();
        if (n2 == -1) {
            return;
        }
        int n3 = J.W.field_1724.method_31548().field_7545;
        this.W(n2);
        W.method_1562().method_52787((class_2596)this.H);
        if (this.I.h()) {
            this.W(n2);
            e.t();
        } else {
            this.W(n3);
        }
    }

    private void W(int n2) {
        if (this.I.h()) {
            g.z(n2, J.W.field_1724.method_31548().field_7545);
        } else {
            g.j(n2);
        }
    }

    private int n() {
        if (this.I.h()) {
            return g.a(class_1802.field_49814);
        }
        return g.E(class_1802.field_49814);
    }

    private void G(double d2) {
        W.method_1562().method_52787((class_2596)new class_2828.class_2829(J.W.field_1724.method_23317(), J.W.field_1724.method_23318() + d2, J.W.field_1724.method_23321(), false));
    }

    private boolean lambda$new$3() {
        return this.m.x(d.Vanilla);
    }

    private boolean lambda$new$2() {
        return this.m.x(d.Vanilla);
    }

    private boolean lambda$new$1() {
        return this.m.x(d.Swap);
    }

    private boolean lambda$new$0() {
        return this.m.x(d.Swap);
    }
}

