/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.Hand
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.enchantment.EnchantmentHelper
 *  net.minecraft.enchantment.Enchantments
 *  net.minecraft.util.collection.DefaultedList
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket
 *  net.minecraft.component.type.ItemEnchantmentsComponent
 */
package dev.idhammai.c.r.q.A;

import dev.idhammai.Frog;
import dev.idhammai.P.A.A.h;
import dev.idhammai.P.A.L.e;
import dev.idhammai.P.A.L.g;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.A;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.c.r.O.Y.B;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.O.p.S;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import net.minecraft.util.Hand;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
import net.minecraft.component.type.ItemEnchantmentsComponent;

public class d
extends y {
    public static d j;
    public final W E = this.S(new W("Rotation", true).k("\u8f6c\u5411").D());
    private final W K = this.S(new W("Instant", false, this.E::f).k("\u77ac\u65f6"));
    public final W B = this.S(new W("OnlyBroken", true).k("\u4ec5\u635f\u574f"));
    private final l a = this.p(new l("Delay", 3, 0, 5).D("\u95f4\u9694"));
    private final W g = this.S(new W("InventorySwap", true).k("\u80cc\u5305\u5207\u6362"));
    public final B<S> n = this.S(new B<S>("InteractSwing", dev.idhammai.c.r.O.p.S.All).I("\u6325\u624b").X(dev.idhammai.c.r.O.p.S.All, "\u53cc\u624b").X(dev.idhammai.c.r.O.p.S.Client, "\u5ba2\u6237\u7aef").X(dev.idhammai.c.r.O.p.S.Server, "\u670d\u52a1\u7aef").X(dev.idhammai.c.r.O.p.S.None, "\u65e0"));
    private final W d = this.S(new W("UsingPause", true).k("\u4f7f\u7528\u6682\u505c"));
    private final W F = this.S(new W("OnlyGround", true).k("\u4ec5\u5730\u9762"));
    public final W k = this.S(new W("AutoDisable", true).k("\u81ea\u52a8\u5173\u95ed"));
    private final h J = new h();
    boolean I = false;
    int L = 0;
    private boolean C = false;

    public d() {
        super("AutoMend", w.Combat);
        this.L("\u81ea\u52a8\u7ecf\u9a8c\u74f6");
        j = this;
    }

    @Override
    public void L() {
        this.C = false;
    }

    @r
    public void R(QO qO) {
        this.C = this.a();
        if (this.g.h() && !e.n()) {
            return;
        }
        if (this.I && this.G() && this.J.m((long)this.a.V() * 20L) && (!this.F.h() || dev.idhammai.c.r.q.A.d.W.field_1724.method_24828())) {
            this.L = dev.idhammai.P.A.L.g.z(class_1802.field_8287) - 1;
            if (this.E.h() && this.K.h()) {
                Frog.ROTATION.o(Frog.ROTATION.Q, 88.0f);
            }
            this.r();
            if (this.E.h() && this.K.h()) {
                Frog.ROTATION.M();
            }
        }
        if (this.k.h() && !this.G()) {
            this.p();
        }
    }

    @Override
    public void H() {
        this.I = !this.E.h() || this.K.h();
        boolean bl = this.I;
        if (dev.idhammai.c.r.q.A.d.M()) {
            this.p();
            return;
        }
        this.L = dev.idhammai.P.A.L.g.z(class_1802.field_8287);
    }

    @Override
    public String I() {
        return String.valueOf(this.L);
    }

    public void r() {
        int n2;
        int n3 = dev.idhammai.c.r.q.A.d.W.field_1724.method_31548().field_7545;
        if (this.g.h() && (n2 = dev.idhammai.P.A.L.g.C(class_1802.field_8287)) != -1) {
            dev.idhammai.P.A.L.g.z(n2, dev.idhammai.c.r.q.A.d.W.field_1724.method_31548().field_7545);
            dev.idhammai.c.r.q.A.d.n(d::lambda$throwExp$0);
            e.g(class_1268.field_5808, this.n.X());
            dev.idhammai.P.A.L.g.z(n2, dev.idhammai.c.r.q.A.d.W.field_1724.method_31548().field_7545);
            e.t();
            this.J.H();
        } else {
            n2 = dev.idhammai.P.A.L.g.E(class_1802.field_8287);
            if (n2 != -1) {
                dev.idhammai.P.A.L.g.j(n2);
                dev.idhammai.c.r.q.A.d.n(d::lambda$throwExp$1);
                e.g(class_1268.field_5808, this.n.X());
                dev.idhammai.P.A.L.g.j(n3);
                this.J.H();
            }
        }
    }

    @r(D=-200)
    public void s(A a2) {
        if (!this.E.h() || this.K.h()) {
            return;
        }
        if (this.G()) {
            a2.p(88.0f);
            this.I = true;
        }
    }

    public boolean G() {
        return this.C;
    }

    public boolean a() {
        if (this.W()) {
            return false;
        }
        if (dev.idhammai.c.r.q.A.d.W.field_1755 != null) {
            return false;
        }
        if (this.d.h() && dev.idhammai.c.r.q.A.d.W.field_1724.method_6115()) {
            return false;
        }
        if (!(dev.idhammai.P.A.L.g.E(class_1802.field_8287) != -1 || this.g.h() && dev.idhammai.P.A.L.g.C(class_1802.field_8287) != -1)) {
            return false;
        }
        if (this.B.h()) {
            class_2371 class_23712 = dev.idhammai.c.r.q.A.d.W.field_1724.method_31548().field_7548;
            for (class_1799 class_17992 : class_23712) {
                if (class_17992.method_7960() || e.a(class_17992) >= 100) continue;
                class_9304 class_93042 = class_1890.method_57532((class_1799)class_17992);
                return class_93042.method_57534().contains(dev.idhammai.c.r.q.A.d.W.field_1687.method_30349().method_30530(class_1893.field_9101.method_58273()).method_40264(class_1893.field_9101).get());
            }
        } else {
            return true;
        }
        return false;
    }

    private static class_2596 lambda$throwExp$1(int n2) {
        return new class_2886(class_1268.field_5808, n2, Frog.ROTATION.X(), Frog.ROTATION.F());
    }

    private static class_2596 lambda$throwExp$0(int n2) {
        return new class_2886(class_1268.field_5808, n2, Frog.ROTATION.X(), Frog.ROTATION.F());
    }
}

