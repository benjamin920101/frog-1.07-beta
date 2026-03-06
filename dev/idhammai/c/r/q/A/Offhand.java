/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.decoration.EndCrystalEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.screen.slot.SlotActionType
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.item.PickaxeItem
 *  net.minecraft.item.SwordItem
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.PickFromInventoryC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket$Action
 */
package dev.idhammai.c.r.q.A;

import dev.idhammai.Frog;
import dev.idhammai.P.A.A.h;
import dev.idhammai.P.A.L.e;
import dev.idhammai.P.A.L.g;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.Q4;
import dev.idhammai.P.r.c.v;
import dev.idhammai.c.r.O.Y.B;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.O.p.T;
import dev.idhammai.c.r.q.A.H;
import dev.idhammai.c.r.q.A.c;
import dev.idhammai.c.r.q.A.i;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import net.minecraft.entity.Entity;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.SwordItem;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PickFromInventoryC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class M
extends y {
    private final B<c> y = this.S(new B<c>("Item", dev.idhammai.c.r.q.A.c.Totem).I("\u526f\u624b\u7269\u54c1").X(dev.idhammai.c.r.q.A.c.Totem, "\u56fe\u817e").X(dev.idhammai.c.r.q.A.c.Crystal, "\u6c34\u6676").X(dev.idhammai.c.r.q.A.c.Gapple, "\u91d1\u82f9\u679c"));
    private final W T = this.S(new W("Safe", true).k("\u5b89\u5168\u5224\u65ad").D());
    private final l R = this.p(new l("Health", 16.0, 0.0, 36.0, 0.1, this.T::f).D("\u5b89\u5168\u8840\u91cf"));
    private final W J = this.S(new W("LethalCrystal", true, this.T::f).k("\u81f4\u547d\u6c34\u6676\u4fdd\u62a4"));
    private final W I = this.S(new W("GapSwitch", true).k("\u91d1\u82f9\u679c\u5207\u6362").D());
    private final W l = this.S(new W("Always", false, this.I::f).k("\u59cb\u7ec8\u5207\u6362"));
    private final W D = this.S(new W("Gap-Totem", false, this.I::f).k("\u56fe\u817e\u65f6\u5207\u82f9\u679c"));
    private final W B = this.S(new W("Gap-Sword", true, this.I::f).k("\u62ff\u5251\u5207\u82f9\u679c"));
    private final W c = this.S(new W("Gap-Pickaxe", false, this.I::f).k("\u62ff\u9550\u5207\u82f9\u679c"));
    private final W g = this.S(new W("MainHandTotem", false).k("\u4e3b\u624b\u56fe\u817e").D());
    private final l n = this.p(new l("Slot", 1.0, 1.0, 9.0, 1.0, this.g::f).D("\u4e3b\u624b\u69fd\u4f4d"));
    private final W j = this.S(new W("ForceUpdate", false, this.g::f).k("\u5f3a\u5236\u66f4\u65b0"));
    private final W Q = this.S(new W("WithOffhand", false, this.g::f).k("\u8054\u52a8\u526f\u624b"));
    private final B<H> M = this.S(new B<H>("SwapMode", H.OffhandSwap).I("\u5207\u6362\u6a21\u5f0f").X(H.ClickSlot, "\u70b9\u51fb\u69fd\u4f4d").X(H.OffhandSwap, "\u526f\u624b\u4ea4\u6362").X(H.Pick, "\u5feb\u6377\u62ff\u53d6"));
    private final l h = this.p(new l("Delay", 50.0, 0.0, 500.0, 1.0).D("\u5207\u6362\u5ef6\u8fdf"));
    private final B<T> p = this.S(new B<T>("Timing", dev.idhammai.c.r.O.p.T.All).I("\u65f6\u673a").X(dev.idhammai.c.r.O.p.T.Pre, "\u524d").X(dev.idhammai.c.r.O.p.T.Post, "\u540e").X(dev.idhammai.c.r.O.p.T.All, "\u5168\u90e8"));
    private final h f = new h();

    public M() {
        super("Offhand", w.Combat);
        this.L("\u526f\u624b\u7269\u54c1");
    }

    @r
    public void r(Q4 q4) {
        if (q4.z() == dev.idhammai.c.r.q.A.M.W.field_1724) {
            if (dev.idhammai.c.r.q.A.M.W.field_1724.method_6047().method_7909() == class_1802.field_8288) {
                dev.idhammai.c.r.q.A.M.W.field_1724.method_31548().method_5441(0);
            } else if (dev.idhammai.c.r.q.A.M.W.field_1724.method_6079().method_7909() == class_1802.field_8288) {
                dev.idhammai.c.r.q.A.M.W.field_1724.method_31548().field_7544.set(0, (Object)class_1799.field_8037);
            }
        }
    }

    private boolean P() {
        if (!this.J.h()) {
            return false;
        }
        for (class_1297 class_12972 : Frog.THREAD.z()) {
            class_243 class_2432;
            if (!(class_12972 instanceof class_1511) || !(dev.idhammai.c.r.q.A.M.W.field_1724.method_5739(class_12972) <= 12.0f) || !(i.X6.R(class_2432 = new class_243(class_12972.method_23317(), class_12972.method_23318(), class_12972.method_23321()), (class_1657)dev.idhammai.c.r.q.A.M.W.field_1724, (class_1657)dev.idhammai.c.r.q.A.M.W.field_1724) >= e.T((class_1297)dev.idhammai.c.r.q.A.M.W.field_1724))) continue;
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    @r
    public void Y(v v2) {
        block22: {
            int n2;
            boolean bl;
            block23: {
                boolean bl2;
                block21: {
                    int n3;
                    if (dev.idhammai.c.r.q.A.M.M()) {
                        return;
                    }
                    if (this.p.x(dev.idhammai.c.r.O.p.T.Pre) && v2.C() || this.p.x(dev.idhammai.c.r.O.p.T.Post) && v2.a()) {
                        return;
                    }
                    if (!this.f.m(this.h.V())) {
                        return;
                    }
                    if (!e.n()) {
                        return;
                    }
                    bl = dev.idhammai.c.r.q.A.M.W.field_1724.method_6079().method_7909() != class_1802.field_8288 || this.Q.h();
                    bl2 = (double)e.T((class_1297)dev.idhammai.c.r.q.A.M.W.field_1724) < this.R.e() || this.P();
                    boolean bl3 = bl2;
                    if (this.g.h() && (n3 = dev.idhammai.P.A.L.g.a(class_1802.field_8288)) != -1 && dev.idhammai.c.r.q.A.M.W.field_1724.method_31548().method_5438(this.n.V() - 1).method_7909() != class_1802.field_8288) {
                        switch (this.M.X().ordinal()) {
                            case 0: {
                                dev.idhammai.c.r.q.A.M.W.field_1761.method_2906(dev.idhammai.c.r.q.A.M.W.field_1724.field_7512.field_7763, n3, 0, class_1713.field_7790, (class_1657)dev.idhammai.c.r.q.A.M.W.field_1724);
                                dev.idhammai.c.r.q.A.M.W.field_1761.method_2906(dev.idhammai.c.r.q.A.M.W.field_1724.field_7512.field_7763, this.n.V() - 1 + 36, 0, class_1713.field_7790, (class_1657)dev.idhammai.c.r.q.A.M.W.field_1724);
                                dev.idhammai.c.r.q.A.M.W.field_1761.method_2906(dev.idhammai.c.r.q.A.M.W.field_1724.field_7512.field_7763, n3, 0, class_1713.field_7790, (class_1657)dev.idhammai.c.r.q.A.M.W.field_1724);
                                e.t();
                                break;
                            }
                            case 1: {
                                dev.idhammai.c.r.q.A.M.W.field_1761.method_2906(dev.idhammai.c.r.q.A.M.W.field_1724.field_7512.field_7763, n3, this.n.V() - 1, class_1713.field_7791, (class_1657)dev.idhammai.c.r.q.A.M.W.field_1724);
                                e.t();
                                break;
                            }
                            case 2: {
                                int n4 = dev.idhammai.c.r.q.A.M.W.field_1724.method_31548().field_7545;
                                dev.idhammai.P.A.L.g.j(this.n.V() - 1);
                                W.method_1562().method_52787((class_2596)new class_2838(n3));
                                dev.idhammai.P.A.L.g.j(n4);
                                break;
                            }
                        }
                        if (bl && (!this.T.h() || bl2) && (this.n.V() - 1 != dev.idhammai.c.r.q.A.M.W.field_1724.method_31548().field_7545 || this.j.h())) {
                            dev.idhammai.P.A.L.g.j(this.n.V() - 1);
                        }
                        this.f.H();
                        return;
                    }
                    if (this.T.h()) break block21;
                    if (!this.g.h()) break block22;
                    break block23;
                }
                if (!bl2) break block22;
                if (this.g.h() && bl) {
                    n2 = dev.idhammai.P.A.L.g.E(class_1802.field_8288);
                    if (n2 != -1 && (n2 != dev.idhammai.c.r.q.A.M.W.field_1724.method_31548().field_7545 || this.j.h())) {
                        dev.idhammai.P.A.L.g.j(n2);
                    }
                    break block22;
                } else {
                    this.P(class_1802.field_8288);
                    this.f.H();
                    return;
                }
            }
            if (bl && (n2 = dev.idhammai.P.A.L.g.E(class_1802.field_8288)) != -1 && (n2 != dev.idhammai.c.r.q.A.M.W.field_1724.method_31548().field_7545 || this.j.h())) {
                dev.idhammai.P.A.L.g.j(n2);
            }
        }
        if ((this.B.h() && dev.idhammai.c.r.q.A.M.W.field_1724.method_6047().method_7909() instanceof class_1829 || this.l.h() && dev.idhammai.c.r.q.A.M.W.field_1724.method_6047().method_7909() != class_1802.field_8463 && dev.idhammai.c.r.q.A.M.W.field_1724.method_6047().method_7909() != class_1802.field_8367 || this.c.h() && dev.idhammai.c.r.q.A.M.W.field_1724.method_6047().method_7909() instanceof class_1810 || this.D.h() && dev.idhammai.c.r.q.A.M.W.field_1724.method_6047().method_7909() == class_1802.field_8288) && dev.idhammai.c.r.q.A.M.W.field_1690.field_1904.method_1434() && this.I.h()) {
            this.P(class_1802.field_8463);
            this.f.H();
            return;
        }
        B<c> b2 = this.y;
        c c2 = b2.X();
        if (c2 == dev.idhammai.c.r.q.A.c.Shield) {
            this.P(class_1802.field_8255);
            this.f.H();
            return;
        }
        if (c2 == dev.idhammai.c.r.q.A.c.Chorus) {
            this.P(class_1802.field_8233);
            this.f.H();
            return;
        }
        if (c2 == dev.idhammai.c.r.q.A.c.Crystal) {
            this.P(class_1802.field_8301);
            this.f.H();
            return;
        }
        if (c2 == dev.idhammai.c.r.q.A.c.Totem) {
            this.P(class_1802.field_8288);
            this.f.H();
            return;
        }
        if (c2 == dev.idhammai.c.r.q.A.c.Gapple) {
            this.P(class_1802.field_8463);
            this.f.H();
        }
    }

    private void P(class_1792 class_17922) {
        int n2 = class_17922 == class_1802.field_8463 ? this.z() : this.P(class_17922);
        int n3 = n2;
        if (n2 == -1) {
            return;
        }
        switch (this.M.X().ordinal()) {
            case 1: {
                dev.idhammai.c.r.q.A.M.W.field_1761.method_2906(dev.idhammai.c.r.q.A.M.W.field_1724.field_7512.field_7763, n2, 40, class_1713.field_7791, (class_1657)dev.idhammai.c.r.q.A.M.W.field_1724);
                e.t();
                break;
            }
            case 2: {
                W.method_1562().method_52787((class_2596)new class_2838(n2));
                W.method_1562().method_52787((class_2596)new class_2846(class_2846.class_2847.field_12969, new class_2338(0, 0, 0), class_2350.field_11033, 0));
                W.method_1562().method_52787((class_2596)new class_2838(n2));
                break;
            }
            case 0: {
                dev.idhammai.c.r.q.A.M.W.field_1761.method_2906(dev.idhammai.c.r.q.A.M.W.field_1724.field_7512.field_7763, n2, 0, class_1713.field_7790, (class_1657)dev.idhammai.c.r.q.A.M.W.field_1724);
                dev.idhammai.c.r.q.A.M.W.field_1761.method_2906(dev.idhammai.c.r.q.A.M.W.field_1724.field_7512.field_7763, 45, 0, class_1713.field_7790, (class_1657)dev.idhammai.c.r.q.A.M.W.field_1724);
                dev.idhammai.c.r.q.A.M.W.field_1761.method_2906(dev.idhammai.c.r.q.A.M.W.field_1724.field_7512.field_7763, n2, 0, class_1713.field_7790, (class_1657)dev.idhammai.c.r.q.A.M.W.field_1724);
                e.t();
            }
        }
    }

    private int z() {
        return this.P(class_1802.field_8367) != -1 ? this.P(class_1802.field_8367) : this.P(class_1802.field_8463);
    }

    @Override
    public String I() {
        return this.y.X().name();
    }

    public int P(class_1792 class_17922) {
        if (dev.idhammai.c.r.q.A.M.W.field_1724.method_6079().method_7909() == class_1802.field_8463 && class_17922 == class_1802.field_8463) {
            return -1;
        }
        if (dev.idhammai.c.r.q.A.M.W.field_1724.method_6079().method_7909() == class_1802.field_8367 && (class_17922 == class_1802.field_8463 || class_17922 == class_1802.field_8367)) {
            return -1;
        }
        if (class_17922 == dev.idhammai.c.r.q.A.M.W.field_1724.method_6079().method_7909()) {
            return -1;
        }
        switch (this.M.X().ordinal()) {
            case 2: {
                class_1799 class_17992;
                int n2;
                for (n2 = 9; n2 < dev.idhammai.c.r.q.A.M.W.field_1724.method_31548().method_5439() + 1; ++n2) {
                    class_17992 = dev.idhammai.c.r.q.A.M.W.field_1724.method_31548().method_5438(n2);
                    if (class_17992.method_7909() != class_17922) continue;
                    return n2;
                }
                for (n2 = 0; n2 < 9; ++n2) {
                    class_17992 = dev.idhammai.c.r.q.A.M.W.field_1724.method_31548().method_5438(n2);
                    if (class_17992.method_7909() != class_17922) continue;
                    return n2;
                }
                break;
            }
            case 0: 
            case 1: {
                for (int i2 = 44; i2 >= 0; --i2) {
                    class_1799 class_17993 = dev.idhammai.c.r.q.A.M.W.field_1724.method_31548().method_5438(i2);
                    if (class_17993.method_7909() != class_17922) continue;
                    return i2 < 9 ? i2 + 36 : i2;
                }
                break;
            }
        }
        return -1;
    }
}

