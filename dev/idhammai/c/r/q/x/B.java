/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2596
 *  net.minecraft.class_2793
 *  net.minecraft.class_2799
 *  net.minecraft.class_2813
 *  net.minecraft.class_2815
 *  net.minecraft.class_2824
 *  net.minecraft.class_2828$class_2829
 *  net.minecraft.class_2828$class_2830
 *  net.minecraft.class_2828$class_2831
 *  net.minecraft.class_2828$class_5911
 *  net.minecraft.class_2833
 *  net.minecraft.class_2838
 *  net.minecraft.class_2846
 *  net.minecraft.class_2848
 *  net.minecraft.class_2868
 *  net.minecraft.class_2879
 *  net.minecraft.class_2885
 *  net.minecraft.class_2886
 *  net.minecraft.class_3965
 *  net.minecraft.class_6374
 */
package dev.idhammai.c.r.q.x;

import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.J;
import dev.idhammai.asm.accessors.ICloseHandledScreenC2SPacket;
import dev.idhammai.asm.accessors.ICommonPongC2SPacket;
import dev.idhammai.asm.accessors.IHandSwingC2SPacket;
import dev.idhammai.asm.accessors.IPlayerActionC2SPacket;
import dev.idhammai.asm.accessors.IPlayerInteractBlockC2SPacket;
import dev.idhammai.asm.accessors.IPlayerInteractItemC2SPacket;
import dev.idhammai.asm.accessors.IUpdateSelectedSlotC2SPacket;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.q.A.I;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import dev.idhammai.p.J.S;
import net.minecraft.class_2596;
import net.minecraft.class_2793;
import net.minecraft.class_2799;
import net.minecraft.class_2813;
import net.minecraft.class_2815;
import net.minecraft.class_2824;
import net.minecraft.class_2828;
import net.minecraft.class_2833;
import net.minecraft.class_2838;
import net.minecraft.class_2846;
import net.minecraft.class_2848;
import net.minecraft.class_2868;
import net.minecraft.class_2879;
import net.minecraft.class_2885;
import net.minecraft.class_2886;
import net.minecraft.class_3965;
import net.minecraft.class_6374;

public class B
extends y {
    public static B b;
    private final W P = this.S(new W("MoveFull", true).k("\u5b8c\u6574\u79fb\u52a8\u5305"));
    private final W c = this.S(new W("MovePosition", true).k("\u4f4d\u7f6e\u79fb\u52a8\u5305"));
    private final W j = this.S(new W("MoveLook", true).k("\u89c6\u89d2\u79fb\u52a8\u5305"));
    private final W p = this.S(new W("MoveGround", true).k("\u843d\u5730\u72b6\u6001\u5305"));
    private final W V = this.S(new W("VehicleMove", true).k("\u8f7d\u5177\u79fb\u52a8\u5305"));
    private final W u = this.S(new W("PlayerAction", true).k("\u73a9\u5bb6\u52a8\u4f5c\u5305"));
    private final W w = this.S(new W("UpdateSlot", true).k("\u5207\u69fd\u5305"));
    private final W K = this.S(new W("HandSwing", true).k("\u6325\u624b\u5305"));
    private final W Q = this.S(new W("Pong", true).k("Pong\u5305"));
    private final W A = this.S(new W("InteractEntity", true).k("\u5b9e\u4f53\u4ea4\u4e92\u5305"));
    private final W g = this.S(new W("InteractBlock", true).k("\u65b9\u5757\u4ea4\u4e92\u5305"));
    private final W m = this.S(new W("InteractItem", true).k("\u7269\u54c1\u4ea4\u4e92\u5305"));
    private final W l = this.S(new W("CloseScreen", true).k("\u5173\u95ed\u754c\u9762\u5305"));
    private final W f = this.S(new W("ClientCommand", true).k("\u5ba2\u6237\u7aef\u547d\u4ee4\u5305"));
    private final W a = this.S(new W("ClientStatus", true).k("\u5ba2\u6237\u7aef\u72b6\u6001\u5305"));
    private final W L = this.S(new W("ClickSlot", true).k("\u70b9\u51fb\u69fd\u4f4d\u5305"));
    private final W N = this.S(new W("PickInventory", true).k("\u80cc\u5305\u62ff\u53d6\u5305"));
    private final W d = this.S(new W("TeleportConfirm", true).k("\u4f20\u9001\u786e\u8ba4\u5305"));
    private final W C = this.S(new W("S2cVelocity", true).k("\u670d\u52a1\u7aef\u901f\u5ea6\u5305"));

    public B() {
        super("PacketLogger", dev.idhammai.c.r.w.Misc);
        this.L("\u6570\u636e\u5305\u8bb0\u5f55");
        b = this;
    }

    private void J(String string, Object ... objectArray) {
        String string2 = String.format(string, objectArray);
        dev.idhammai.p.J.S.z(string2);
    }

    @r(D=999999)
    public void a(dev.idhammai.P.r.c.w w2) {
        if (this.C.h() && w2.W() == B.W.field_1724) {
            this.J("S2C Velocity, x: %s, y: %s, z: %s, isExplosion: %s", w2.n(), w2.t(), w2.V(), w2.J());
        }
    }

    @r(D=-999999)
    public void w(J j2) {
        Object object;
        class_2828.class_2830 class_28302;
        class_2596<?> class_25962 = j2.L();
        if (class_25962 instanceof class_2828.class_2830) {
            class_28302 = (class_2828.class_2830)class_25962;
            if (this.P.h()) {
                object = new StringBuilder();
                ((StringBuilder)object).append("PlayerMove Full - ");
                if (class_28302.method_36171()) {
                    ((StringBuilder)object).append("x: ").append(class_28302.method_12269(0.0)).append(", y: ").append(class_28302.method_12268(0.0)).append(", z: ").append(class_28302.method_12274(0.0)).append(" ");
                }
                if (class_28302.method_36172()) {
                    ((StringBuilder)object).append("yaw: ").append(class_28302.method_12271(0.0f)).append(", pitch: ").append(class_28302.method_12270(0.0f)).append(" ");
                }
                ((StringBuilder)object).append(" onground: ").append(class_28302.method_12273());
                this.J(((StringBuilder)object).toString(), new Object[0]);
            }
        }
        if (class_25962 instanceof class_2828.class_2829) {
            class_28302 = (class_2828.class_2829)class_25962;
            if (this.c.h()) {
                object = new StringBuilder();
                ((StringBuilder)object).append("PlayerMove PosGround - ");
                if (class_28302.method_36171()) {
                    ((StringBuilder)object).append("x: ").append(class_28302.method_12269(0.0)).append(", y: ").append(class_28302.method_12268(0.0)).append(", z: ").append(class_28302.method_12274(0.0)).append(" ");
                }
                ((StringBuilder)object).append(" onground: ").append(class_28302.method_12273());
                this.J(((StringBuilder)object).toString(), new Object[0]);
            }
        }
        if (class_25962 instanceof class_2828.class_2831) {
            class_28302 = (class_2828.class_2831)class_25962;
            if (this.j.h()) {
                object = new StringBuilder();
                ((StringBuilder)object).append("PlayerMove LookGround - ");
                if (class_28302.method_36172()) {
                    ((StringBuilder)object).append("yaw: ").append(class_28302.method_12271(0.0f)).append(", pitch: ").append(class_28302.method_12270(0.0f)).append(" ");
                }
                ((StringBuilder)object).append(" onground: ").append(class_28302.method_12273());
                this.J(((StringBuilder)object).toString(), new Object[0]);
            }
        }
        if (class_25962 instanceof class_2828.class_5911) {
            class_28302 = (class_2828.class_5911)class_25962;
            if (this.p.h()) {
                this.J("PlayerMove Ground - onground: " + class_28302.method_12273(), new Object[0]);
            }
        }
        if (class_25962 instanceof class_2833) {
            class_28302 = (class_2833)class_25962;
            if (this.V.h()) {
                this.J("VehicleMove - x: %s, y: %s, z: %s, yaw: %s, pitch: %s", class_28302.method_12279(), class_28302.method_12280(), class_28302.method_12276(), Float.valueOf(class_28302.method_12281()), Float.valueOf(class_28302.method_12277()));
            }
        }
        if (class_25962 instanceof class_2846) {
            class_28302 = (class_2846)class_25962;
            object = (IPlayerActionC2SPacket)class_28302;
            if (this.u.h() && object.getDirection() != null) {
                this.J("PlayerAction - action: %s, direction: %s, pos: %s", object.getAction().name(), object.getDirection().name(), object.getPos().method_23854());
            }
        }
        if (class_25962 instanceof class_2868) {
            class_28302 = (class_2868)class_25962;
            if (this.w.h()) {
                this.J("UpdateSlot - slot: %d", ((IUpdateSelectedSlotC2SPacket)class_28302).getSelectedSlot());
            }
        }
        if (class_25962 instanceof class_2879) {
            class_28302 = (class_2879)class_25962;
            if (this.K.h()) {
                this.J("HandSwing - hand: %s", ((IHandSwingC2SPacket)class_28302).getHand().name());
            }
        }
        if (class_25962 instanceof class_6374) {
            class_28302 = (class_6374)class_25962;
            if (this.Q.h()) {
                this.J("Pong - %d", ((ICommonPongC2SPacket)class_28302).getParameter());
            }
        }
        if (class_25962 instanceof class_2824) {
            class_28302 = (class_2824)class_25962;
            if (this.A.h()) {
                this.J("InteractEntity - Entity: %s, id: %s", I.K((class_2824)class_28302).method_5477().getString(), I.K((class_2824)class_28302).method_5628());
            }
        }
        if (class_25962 instanceof class_2885) {
            class_28302 = (class_2885)class_25962;
            object = (IPlayerInteractBlockC2SPacket)class_28302;
            if (this.g.h()) {
                class_3965 class_39652 = object.getBlockHitResult();
                this.J("InteractBlock - pos: %s, dir: %s, hand: %s", class_39652.method_17777().method_23854(), class_39652.method_17780().name(), object.getHand().name());
            }
        }
        if (class_25962 instanceof class_2886) {
            class_28302 = (class_2886)class_25962;
            if (this.m.h()) {
                this.J("InteractItem - hand: %s", ((IPlayerInteractItemC2SPacket)class_28302).getHand().name());
            }
        }
        if (class_25962 instanceof class_2815) {
            class_28302 = (class_2815)class_25962;
            if (this.l.h()) {
                this.J("CloseScreen - id: %s", ((ICloseHandledScreenC2SPacket)class_28302).getSyncId());
            }
        }
        if (class_25962 instanceof class_2848) {
            class_28302 = (class_2848)class_25962;
            if (this.f.h()) {
                this.J("ClientCommand - mode: %s", class_28302.method_12365().name());
            }
        }
        if (class_25962 instanceof class_2799) {
            class_28302 = (class_2799)class_25962;
            if (this.a.h()) {
                this.J("ClientStatus - mode: %s", class_28302.method_12119().name());
            }
        }
        if (class_25962 instanceof class_2813) {
            class_28302 = (class_2813)class_25962;
            if (this.L.h()) {
                this.J("ClickSlot - type: %s, slot: %s, button: %s, id: %s", class_28302.method_12195().name(), class_28302.method_12192(), class_28302.method_12193(), class_28302.method_12194());
            }
        }
        if (class_25962 instanceof class_2838) {
            class_28302 = (class_2838)class_25962;
            if (this.N.h()) {
                this.J("PickInventory - slot: %s", class_28302.method_12293());
            }
        }
        if (class_25962 instanceof class_2793) {
            class_28302 = (class_2793)class_25962;
            if (this.d.h()) {
                this.J("TeleportConfirm - id: %s", class_28302.method_12086());
            }
        }
    }
}

