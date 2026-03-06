/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.Hand
 *  net.minecraft.item.Items
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket
 */
package dev.idhammai.c.r.q.i;

import dev.idhammai.Frog;
import dev.idhammai.P.A.L.e;
import dev.idhammai.P.A.L.g;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.F;
import dev.idhammai.c.r.O.Y.B;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.O.p.S;
import dev.idhammai.c.r.O.p.T;
import dev.idhammai.c.r.q.D.Q;
import dev.idhammai.c.r.q.D.f;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import net.minecraft.util.Hand;
import net.minecraft.item.Items;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;

public class u
extends y {
    public static u j;
    public static boolean B;
    public final W b = this.S(new W("InventorySwap", true).k("\u80cc\u5305\u5207\u6362"));
    private final B<T> g = this.S(new B<T>("Timing", T.All).I("\u89e6\u53d1\u65f6\u673a"));
    public final B<S> r = this.S(new B<S>("Swing", dev.idhammai.c.r.O.p.S.All).I("\u6325\u624b\u663e\u793a"));
    private final W I = this.S(new W("Rotation", true).k("\u8f6c\u5411"));
    private final W D = this.S(new W("YawStep", false).k("\u5206\u6b65\u8f6c\u5411").D());
    private final W d = this.S(new W("FallFlying", true, this.D::f).k("\u9798\u7fc5\u65f6\u542f\u7528"));
    private final l y = this.p(new l("Steps", 0.05, 0.0, 1.0, 0.01, this.D::f).D("\u6b65\u8fdb"));
    private final l e = this.p(new l("Fov", 20.0, 0.0, 360.0, 0.1, this.D::f).D("\u89c6\u89d2\u8303\u56f4"));
    private final l a = this.p(new l("Priority", 100, 0, 100, this.D::f).D("\u8f6c\u5411\u4f18\u5148\u7ea7"));
    private final W U = this.S(new W("Sync", true, this.D::f).k("\u540c\u6b65\u6295\u63b7"));

    public u() {
        super("AutoPearl", w.Player);
        this.L("\u6254\u73cd\u73e0");
        j = this;
    }

    @Override
    public void H() {
        if (u.M()) {
            this.p();
            return;
        }
        if (u.j.b.h()) {
            if (dev.idhammai.P.A.L.g.C(class_1802.field_8634) == -1) {
                this.p();
                return;
            }
        } else if (dev.idhammai.P.A.L.g.E(class_1802.field_8634) == -1) {
            this.p();
            return;
        }
        if (this.y()) {
            return;
        }
        if (this.b.h() && !dev.idhammai.P.A.L.e.n()) {
            return;
        }
        if (dev.idhammai.c.r.q.Q.W.b.p() && dev.idhammai.c.r.q.Q.W.b.m.h()) {
            return;
        }
        this.r(u.W.field_1724.method_36454(), u.W.field_1724.method_36455());
        this.p();
    }

    @r
    public void l(F f2) {
        if (u.M()) {
            return;
        }
        if (this.g.x(T.Pre) && f2.C() || this.g.x(T.Post) && f2.a()) {
            return;
        }
        if (dev.idhammai.c.r.q.Q.W.b.p() && dev.idhammai.c.r.q.Q.W.b.m.h()) {
            return;
        }
        if (!this.y()) {
            this.r(u.W.field_1724.method_36454(), u.W.field_1724.method_36455());
            this.p();
        } else if (Frog.ROTATION.A(u.W.field_1724.method_36454(), u.W.field_1724.method_36455(), this.e.Z())) {
            if (this.U.h()) {
                this.r(u.W.field_1724.method_36454(), u.W.field_1724.method_36455());
            } else {
                int n2;
                B = true;
                if (u.W.field_1724.method_6047().method_7909() == class_1802.field_8634) {
                    u.n(u::lambda$onUpdate$0);
                    dev.idhammai.P.A.L.e.g(class_1268.field_5808, this.r.X());
                } else if (this.b.h() && (n2 = dev.idhammai.P.A.L.g.C(class_1802.field_8634)) != -1) {
                    dev.idhammai.P.A.L.g.z(n2, u.W.field_1724.method_31548().field_7545);
                    u.n(u::lambda$onUpdate$1);
                    dev.idhammai.P.A.L.e.g(class_1268.field_5808, this.r.X());
                    dev.idhammai.P.A.L.g.z(n2, u.W.field_1724.method_31548().field_7545);
                    dev.idhammai.P.A.L.e.t();
                } else {
                    n2 = dev.idhammai.P.A.L.g.E(class_1802.field_8634);
                    if (n2 != -1) {
                        int n3 = u.W.field_1724.method_31548().field_7545;
                        dev.idhammai.P.A.L.g.j(n2);
                        u.n(u::lambda$onUpdate$2);
                        dev.idhammai.P.A.L.e.g(class_1268.field_5808, this.r.X());
                        dev.idhammai.P.A.L.g.j(n3);
                    }
                }
                B = false;
            }
            this.p();
        }
    }

    @r
    public void Y(dev.idhammai.P.r.c.W w2) {
        if (this.y()) {
            w2.D(u.W.field_1724.method_36454(), u.W.field_1724.method_36455(), this.y.Z(), this.a.Z());
        }
    }

    private boolean y() {
        if (!this.d.h() && (u.W.field_1724.method_6128() || Q.F.p() && Q.F.z())) {
            return false;
        }
        return this.D.h() && !f.V.f();
    }

    public void r(float f2, float f3) {
        int n2;
        B = true;
        if (u.W.field_1724.method_6047().method_7909() == class_1802.field_8634) {
            if (this.I.h()) {
                Frog.ROTATION.o(f2, f3);
            }
            u.n(arg_0 -> u.lambda$throwPearl$3(f2, f3, arg_0));
            dev.idhammai.P.A.L.e.g(class_1268.field_5808, this.r.X());
            if (this.I.h()) {
                Frog.ROTATION.M();
            }
        } else if (this.b.h() && (n2 = dev.idhammai.P.A.L.g.C(class_1802.field_8634)) != -1) {
            dev.idhammai.P.A.L.g.z(n2, u.W.field_1724.method_31548().field_7545);
            if (this.I.h()) {
                Frog.ROTATION.o(f2, f3);
            }
            u.n(arg_0 -> u.lambda$throwPearl$4(f2, f3, arg_0));
            dev.idhammai.P.A.L.e.g(class_1268.field_5808, this.r.X());
            dev.idhammai.P.A.L.g.z(n2, u.W.field_1724.method_31548().field_7545);
            dev.idhammai.P.A.L.e.t();
            if (this.I.h()) {
                Frog.ROTATION.M();
            }
        } else {
            n2 = dev.idhammai.P.A.L.g.E(class_1802.field_8634);
            if (n2 != -1) {
                int n3 = u.W.field_1724.method_31548().field_7545;
                dev.idhammai.P.A.L.g.j(n2);
                if (this.I.h()) {
                    Frog.ROTATION.o(f2, f3);
                }
                u.n(arg_0 -> u.lambda$throwPearl$5(f2, f3, arg_0));
                dev.idhammai.P.A.L.e.g(class_1268.field_5808, this.r.X());
                dev.idhammai.P.A.L.g.j(n3);
                if (this.I.h()) {
                    Frog.ROTATION.M();
                }
            }
        }
        B = false;
    }

    private static class_2596 lambda$throwPearl$5(float f2, float f3, int n2) {
        return new class_2886(class_1268.field_5808, n2, f2, f3);
    }

    private static class_2596 lambda$throwPearl$4(float f2, float f3, int n2) {
        return new class_2886(class_1268.field_5808, n2, f2, f3);
    }

    private static class_2596 lambda$throwPearl$3(float f2, float f3, int n2) {
        return new class_2886(class_1268.field_5808, n2, f2, f3);
    }

    private static class_2596 lambda$onUpdate$2(int n2) {
        return new class_2886(class_1268.field_5808, n2, Frog.ROTATION.X(), Frog.ROTATION.F());
    }

    private static class_2596 lambda$onUpdate$1(int n2) {
        return new class_2886(class_1268.field_5808, n2, Frog.ROTATION.X(), Frog.ROTATION.F());
    }

    private static class_2596 lambda$onUpdate$0(int n2) {
        return new class_2886(class_1268.field_5808, n2, Frog.ROTATION.X(), Frog.ROTATION.F());
    }

    static {
        B = false;
    }
}

