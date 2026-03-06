/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.screen.slot.SlotActionType
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket
 *  net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket$PositionAndOnGround
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket$Action
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket$Mode
 *  net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket
 *  net.minecraft.client.option.KeyBinding
 *  net.minecraft.client.util.InputUtil
 *  net.minecraft.client.gui.screen.ChatScreen
 *  net.minecraft.component.DataComponentTypes
 */
package dev.idhammai.c.r.q.D;

import dev.idhammai.Frog;
import dev.idhammai.P.r.c.G;
import dev.idhammai.P.r.c.J;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.P.r.c.S;
import dev.idhammai.P.r.c.q;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.q.D.B;
import dev.idhammai.c.r.q.D.Q;
import dev.idhammai.c.r.q.D.R;
import dev.idhammai.c.r.q.D.U;
import dev.idhammai.c.r.q.D.l;
import dev.idhammai.c.r.q.D.r;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import net.minecraft.util.Hand;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket;
import net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.component.DataComponentTypes;

public class z
extends y {
    public static z f;
    final Queue<class_2813> R = new LinkedList<class_2813>();
    final AtomicBoolean l = new AtomicBoolean();
    private final dev.idhammai.c.r.O.Y.B<r> r = this.S(new dev.idhammai.c.r.O.Y.B<r>("Mode", dev.idhammai.c.r.q.D.r.Vanilla).I("\u6a21\u5f0f").X(dev.idhammai.c.r.q.D.r.Vanilla, "\u539f\u7248").X(dev.idhammai.c.r.q.D.r.NCP, "NCP").X(dev.idhammai.c.r.q.D.r.Grim, "Grim").X(dev.idhammai.c.r.q.D.r.GrimPacket, "Grim\u53d1\u5305").X(dev.idhammai.c.r.q.D.r.Drop, "\u4e22\u5f03").X(dev.idhammai.c.r.q.D.r.None, "\u65e0"));
    private final W T = this.S(new W("SoulSand", true).k("\u7075\u9b42\u6c99\u65e0\u51cf\u901f"));
    private final W C = this.S(new W("Sneak", false).k("\u6f5c\u884c\u65e0\u51cf\u901f"));
    private final W J = this.S(new W("Climb", false).k("\u6500\u722c\u65e0\u51cf\u901f"));
    private final W P = this.S(new W("Gui", true).k("\u754c\u9762\u79fb\u52a8"));
    private final W V = this.S(new W("AllowSneak", false, this.P::h).k("\u754c\u9762\u5141\u8bb8\u6f5c\u884c"));
    private final dev.idhammai.c.r.O.Y.B<U> G = this.S(new dev.idhammai.c.r.O.Y.B<U>("GuiMoveBypass", U.None).I("\u754c\u9762\u79fb\u52a8\u7ed5\u8fc7").X(U.None, "\u65e0").X(U.NCP, "NCP").X(U.NCP2, "NCP2").X(U.Grim, "Grim").X(U.Delay, "\u5ef6\u8fdf"));
    boolean D = false;
    int j = 0;

    public z() {
        super("NoSlow", w.Movement);
        this.L("\u65e0\u51cf\u901f");
        f = this;
    }

    private static float H(boolean bl, boolean bl2) {
        if (bl == bl2) {
            return 0.0f;
        }
        return bl ? 1.0f : -1.0f;
    }

    @Override
    public String I() {
        return this.r.X().name();
    }

    @dev.idhammai.P.r.K.r
    public void Q(QO qO) {
        this.D = dev.idhammai.c.r.q.D.z.W.field_1724.method_6115();
        --this.j;
        if (this.D) {
            this.j = 2;
        }
        if (this.D && !dev.idhammai.c.r.q.D.z.W.field_1724.method_3144() && !dev.idhammai.c.r.q.D.z.W.field_1724.method_6128()) {
            switch (this.r.X().ordinal()) {
                case 1: {
                    W.method_1562().method_52787((class_2596)new class_2868(dev.idhammai.c.r.q.D.z.W.field_1724.method_31548().field_7545));
                    break;
                }
                case 2: {
                    if (dev.idhammai.c.r.q.D.z.W.field_1724.method_6058() == class_1268.field_5810) {
                        dev.idhammai.c.r.q.D.z.n(z::lambda$onUpdate$0);
                        break;
                    }
                    dev.idhammai.c.r.q.D.z.n(z::lambda$onUpdate$1);
                    break;
                }
                case 3: {
                    dev.idhammai.c.r.q.D.z.W.field_1761.method_2906(dev.idhammai.c.r.q.D.z.W.field_1724.field_7512.field_7763, 1, 0, class_1713.field_7790, (class_1657)dev.idhammai.c.r.q.D.z.W.field_1724);
                    if (dev.idhammai.c.r.q.D.z.W.field_1724.method_6058() == class_1268.field_5810) {
                        dev.idhammai.c.r.q.D.z.n(z::lambda$onUpdate$2);
                        break;
                    }
                    dev.idhammai.c.r.q.D.z.n(z::lambda$onUpdate$3);
                }
            }
        }
        if (this.P.h() && !(dev.idhammai.c.r.q.D.z.W.field_1755 instanceof class_408)) {
            for (class_304 class_3042 : new class_304[]{dev.idhammai.c.r.q.D.z.W.field_1690.field_1881, dev.idhammai.c.r.q.D.z.W.field_1690.field_1913, dev.idhammai.c.r.q.D.z.W.field_1690.field_1849}) {
                class_3042.method_23481(class_3675.method_15987((long)W.method_22683().method_4490(), (int)class_3675.method_15981((String)class_3042.method_1428()).method_1444()));
            }
            dev.idhammai.c.r.q.D.z.W.field_1690.field_1903.method_23481(Q.F.p() && Q.F.QQ.x(dev.idhammai.c.r.q.D.R.Bounce) && Q.F.Qn.h() || class_3675.method_15987((long)W.method_22683().method_4490(), (int)class_3675.method_15981((String)dev.idhammai.c.r.q.D.z.W.field_1690.field_1903.method_1428()).method_1444()));
            dev.idhammai.c.r.q.D.z.W.field_1690.field_1894.method_23481(B.E.u() || class_3675.method_15987((long)W.method_22683().method_4490(), (int)class_3675.method_15981((String)dev.idhammai.c.r.q.D.z.W.field_1690.field_1894.method_1428()).method_1444()));
            dev.idhammai.c.r.q.D.z.W.field_1690.field_1867.method_23481(dev.idhammai.c.r.q.D.l.c.p() && !dev.idhammai.c.r.q.D.l.c.O() || class_3675.method_15987((long)W.method_22683().method_4490(), (int)class_3675.method_15981((String)dev.idhammai.c.r.q.D.z.W.field_1690.field_1867.method_1428()).method_1444()));
            if (this.V.h()) {
                dev.idhammai.c.r.q.D.z.W.field_1690.field_1832.method_23481(class_3675.method_15987((long)W.method_22683().method_4490(), (int)class_3675.method_15981((String)dev.idhammai.c.r.q.D.z.W.field_1690.field_1832.method_1428()).method_1444()));
            }
        }
    }

    @dev.idhammai.P.r.K.r(D=100)
    public void w(G g2) {
        if (this.C.h()) {
            g2.L();
        }
        if (this.P.h() && !(dev.idhammai.c.r.q.D.z.W.field_1755 instanceof class_408)) {
            for (class_304 class_3042 : new class_304[]{dev.idhammai.c.r.q.D.z.W.field_1690.field_1881, dev.idhammai.c.r.q.D.z.W.field_1690.field_1913, dev.idhammai.c.r.q.D.z.W.field_1690.field_1849}) {
                class_3042.method_23481(class_3675.method_15987((long)W.method_22683().method_4490(), (int)class_3675.method_15981((String)class_3042.method_1428()).method_1444()));
            }
            dev.idhammai.c.r.q.D.z.W.field_1690.field_1903.method_23481(Q.F.p() && Q.F.QQ.x(dev.idhammai.c.r.q.D.R.Bounce) && Q.F.Qn.h() || class_3675.method_15987((long)W.method_22683().method_4490(), (int)class_3675.method_15981((String)dev.idhammai.c.r.q.D.z.W.field_1690.field_1903.method_1428()).method_1444()));
            dev.idhammai.c.r.q.D.z.W.field_1690.field_1894.method_23481(B.E.u() || class_3675.method_15987((long)W.method_22683().method_4490(), (int)class_3675.method_15981((String)dev.idhammai.c.r.q.D.z.W.field_1690.field_1894.method_1428()).method_1444()));
            dev.idhammai.c.r.q.D.z.W.field_1690.field_1867.method_23481(dev.idhammai.c.r.q.D.l.c.p() && !dev.idhammai.c.r.q.D.l.c.O() || class_3675.method_15987((long)W.method_22683().method_4490(), (int)class_3675.method_15981((String)dev.idhammai.c.r.q.D.z.W.field_1690.field_1867.method_1428()).method_1444()));
            if (this.V.h()) {
                dev.idhammai.c.r.q.D.z.W.field_1690.field_1832.method_23481(class_3675.method_15987((long)W.method_22683().method_4490(), (int)class_3675.method_15981((String)dev.idhammai.c.r.q.D.z.W.field_1690.field_1832.method_1428()).method_1444()));
            }
            dev.idhammai.c.r.q.D.z.W.field_1724.field_3913.field_3910 = dev.idhammai.c.r.q.D.z.W.field_1690.field_1894.method_1434();
            dev.idhammai.c.r.q.D.z.W.field_1724.field_3913.field_3909 = dev.idhammai.c.r.q.D.z.W.field_1690.field_1881.method_1434();
            dev.idhammai.c.r.q.D.z.W.field_1724.field_3913.field_3908 = dev.idhammai.c.r.q.D.z.W.field_1690.field_1913.method_1434();
            dev.idhammai.c.r.q.D.z.W.field_1724.field_3913.field_3906 = dev.idhammai.c.r.q.D.z.W.field_1690.field_1849.method_1434();
            dev.idhammai.c.r.q.D.z.W.field_1724.field_3913.field_3905 = dev.idhammai.c.r.q.D.z.H(dev.idhammai.c.r.q.D.z.W.field_1724.field_3913.field_3910, dev.idhammai.c.r.q.D.z.W.field_1724.field_3913.field_3909);
            dev.idhammai.c.r.q.D.z.W.field_1724.field_3913.field_3907 = dev.idhammai.c.r.q.D.z.H(dev.idhammai.c.r.q.D.z.W.field_1724.field_3913.field_3908, dev.idhammai.c.r.q.D.z.W.field_1724.field_3913.field_3906);
            dev.idhammai.c.r.q.D.z.W.field_1724.field_3913.field_3904 = dev.idhammai.c.r.q.D.z.W.field_1690.field_1903.method_1434();
            dev.idhammai.c.r.q.D.z.W.field_1724.field_3913.field_3903 = dev.idhammai.c.r.q.D.z.W.field_1690.field_1832.method_1434();
        }
    }

    @dev.idhammai.P.r.K.r
    public void c(q q2) {
        if (q2.a()) {
            if (this.j > 0) {
                dev.idhammai.c.r.q.D.z.W.field_1752 = 0;
                q2.L();
            } else if (this.r.x(dev.idhammai.c.r.q.D.r.GrimPacket) && dev.idhammai.c.r.q.D.z.W.field_1724 != null && dev.idhammai.c.r.q.D.z.W.field_1724.method_5998(q2.K).method_7909().method_57347().method_57832(class_9334.field_50075)) {
                dev.idhammai.c.r.q.D.z.W.field_1761.method_2906(dev.idhammai.c.r.q.D.z.W.field_1724.field_7512.field_7763, 1, 0, class_1713.field_7790, (class_1657)dev.idhammai.c.r.q.D.z.W.field_1724);
            }
        }
    }

    @dev.idhammai.P.r.K.r
    public void j(J j2) {
        class_2886 class_28862;
        class_2596<?> class_25962;
        if (dev.idhammai.c.r.q.D.z.M()) {
            return;
        }
        if (this.r.x(dev.idhammai.c.r.q.D.r.Drop) && (class_25962 = j2.L()) instanceof class_2886 && (class_28862 = (class_2886)class_25962).method_12551() == class_1268.field_5808 && dev.idhammai.c.r.q.D.z.W.field_1724.method_6047().method_7909().method_57347().method_57832(class_9334.field_50075)) {
            W.method_1562().method_52787((class_2596)new class_2846(class_2846.class_2847.field_12975, class_2338.field_10980, class_2350.field_11033));
            return;
        }
        if (!dev.idhammai.P.A.L.l.b() || this.l.get()) {
            return;
        }
        class_25962 = j2.L();
        if (class_25962 instanceof class_2813) {
            class_2813 class_28132 = (class_2813)class_25962;
            switch (this.G.X().ordinal()) {
                case 3: {
                    if (class_28132.method_12195() == class_1713.field_7790 || class_28132.method_12195() == class_1713.field_7793) break;
                    W.method_1562().method_52787((class_2596)new class_2815(0));
                    break;
                }
                case 1: {
                    if (!dev.idhammai.c.r.q.D.z.W.field_1724.method_24828() || dev.idhammai.c.r.q.D.z.W.field_1687.method_20812((class_1297)dev.idhammai.c.r.q.D.z.W.field_1724, dev.idhammai.c.r.q.D.z.W.field_1724.method_5829().method_989(0.0, 0.0656, 0.0)).iterator().hasNext()) break;
                    if (dev.idhammai.c.r.q.D.z.W.field_1724.method_5624()) {
                        W.method_1562().method_52787((class_2596)new class_2848((class_1297)dev.idhammai.c.r.q.D.z.W.field_1724, class_2848.class_2849.field_12985));
                    }
                    W.method_1562().method_52787((class_2596)new class_2828.class_2829(dev.idhammai.c.r.q.D.z.W.field_1724.method_23317(), dev.idhammai.c.r.q.D.z.W.field_1724.method_23318() + 0.0656, dev.idhammai.c.r.q.D.z.W.field_1724.method_23321(), false));
                    break;
                }
                case 2: {
                    if (!dev.idhammai.c.r.q.D.z.W.field_1724.method_24828() || dev.idhammai.c.r.q.D.z.W.field_1687.method_20812((class_1297)dev.idhammai.c.r.q.D.z.W.field_1724, dev.idhammai.c.r.q.D.z.W.field_1724.method_5829().method_989(0.0, 2.71875E-7, 0.0)).iterator().hasNext()) break;
                    if (dev.idhammai.c.r.q.D.z.W.field_1724.method_5624()) {
                        W.method_1562().method_52787((class_2596)new class_2848((class_1297)dev.idhammai.c.r.q.D.z.W.field_1724, class_2848.class_2849.field_12985));
                    }
                    W.method_1562().method_52787((class_2596)new class_2828.class_2829(dev.idhammai.c.r.q.D.z.W.field_1724.method_23317(), dev.idhammai.c.r.q.D.z.W.field_1724.method_23318() + 2.71875E-7, dev.idhammai.c.r.q.D.z.W.field_1724.method_23321(), false));
                    break;
                }
                case 4: {
                    this.R.add(class_28132);
                    j2.L();
                }
            }
        }
        if (j2.L() instanceof class_2815 && this.G.x(U.Delay)) {
            this.l.set(true);
            while (!this.R.isEmpty()) {
                W.method_1562().method_52787((class_2596)this.R.poll());
            }
            this.l.set(false);
        }
    }

    @dev.idhammai.P.r.K.r
    public void v(S s2) {
        if (s2.L() instanceof class_2813 && dev.idhammai.c.r.q.D.z.W.field_1724.method_5624() && this.G.x(U.NCP)) {
            W.method_1562().method_52787((class_2596)new class_2848((class_1297)dev.idhammai.c.r.q.D.z.W.field_1724, class_2848.class_2849.field_12981));
        }
    }

    public boolean L() {
        return this.p() && this.r.X() != dev.idhammai.c.r.q.D.r.None && (this.r.X() != dev.idhammai.c.r.q.D.r.Drop && this.r.X() != dev.idhammai.c.r.q.D.r.GrimPacket || this.D);
    }

    public boolean K() {
        return this.p() && this.T.h();
    }

    public boolean T() {
        return this.p() && this.J.h();
    }

    private static class_2596 lambda$onUpdate$3(int n2) {
        return new class_2886(class_1268.field_5810, n2, Frog.ROTATION.X(), Frog.ROTATION.F());
    }

    private static class_2596 lambda$onUpdate$2(int n2) {
        return new class_2886(class_1268.field_5808, n2, Frog.ROTATION.X(), Frog.ROTATION.F());
    }

    private static class_2596 lambda$onUpdate$1(int n2) {
        return new class_2886(class_1268.field_5810, n2, Frog.ROTATION.X(), Frog.ROTATION.F());
    }

    private static class_2596 lambda$onUpdate$0(int n2) {
        return new class_2886(class_1268.field_5808, n2, Frog.ROTATION.X(), Frog.ROTATION.F());
    }
}

