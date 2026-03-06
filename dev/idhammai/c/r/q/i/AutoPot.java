/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.effect.StatusEffect
 *  net.minecraft.entity.effect.StatusEffectInstance
 *  net.minecraft.entity.effect.StatusEffects
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.component.type.PotionContentsComponent
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket
 *  net.minecraft.component.DataComponentTypes
 */
package dev.idhammai.c.r.q.i;

import dev.idhammai.Frog;
import dev.idhammai.P.A.L.e;
import dev.idhammai.P.A.L.g;
import dev.idhammai.P.A.l.k;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.c.r.O.Y.O;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.q.i.U;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import net.minecraft.util.Hand;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
import net.minecraft.component.DataComponentTypes;

public class h
extends y {
    public static h K;
    private final l k = this.p(new l("Delay", 5.0, 0.0, 10.0, 0.1).D("\u5ef6\u8fdf").P("s"));
    private final W V = this.S(new W("Speed", false).k("\u901f\u5ea6\u836f\u6c34"));
    private final W M = this.S(new W("Resistance", false).k("\u6297\u6027\u836f\u6c34"));
    private final W m = this.S(new W("Strength", false).k("\u529b\u91cf\u836f\u6c34"));
    private final W Q = this.S(new W("SlowFalling", false).k("\u7f13\u964d\u836f\u6c34"));
    private final W s = this.S(new W("UsingPause", true).k("\u4f7f\u7528\u6682\u505c"));
    private final W H = this.S(new W("OnlyGround", false).k("\u4ec5\u5730\u9762"));
    private final W p = this.S(new W("InventorySwap", true).k("\u80cc\u5305\u5207\u6362"));
    private final O f = this.n(new O("SpeedKey", -1).E("\u901f\u5ea6\u5feb\u6377\u952e"));
    private final O w = this.n(new O("StrengthKey", -1).E("\u529b\u91cf\u5feb\u6377\u952e"));
    private final O X = this.n(new O("ResistanceKey", -1).E("\u6297\u6027\u5feb\u6377\u952e"));
    private final dev.idhammai.P.A.A.h J = new dev.idhammai.P.A.A.h();
    private boolean D = false;
    private boolean I;
    private boolean l;
    private boolean b;

    public h() {
        super("AutoPot", dev.idhammai.c.r.w.Player);
        this.L("\u81ea\u52a8\u836f\u6c34");
        K = this;
        Frog.EVENT_BUS.S(new U(this));
    }

    public static int y(class_1291 class_12912) {
        for (int i2 = 35; i2 >= 0; --i2) {
            class_1799 class_17992 = h.W.field_1724.method_31548().method_5438(i2);
            if (class_1792.method_7880((class_1792)class_17992.method_7909()) != class_1792.method_7880((class_1792)class_1802.field_8436)) continue;
            class_1844 class_18442 = (class_1844)class_17992.method_57825(class_9334.field_49651, (Object)class_1844.field_49274);
            for (class_1293 class_12932 : class_18442.method_57397()) {
                if (class_12932.method_5579().comp_349() != class_12912) continue;
                return i2 < 9 ? i2 + 36 : i2;
            }
        }
        return -1;
    }

    public static int P(class_1291 class_12912) {
        for (int i2 = 0; i2 < 9; ++i2) {
            class_1799 class_17992 = h.W.field_1724.method_31548().method_5438(i2);
            if (class_1792.method_7880((class_1792)class_17992.method_7909()) != class_1792.method_7880((class_1792)class_1802.field_8436)) continue;
            class_1844 class_18442 = (class_1844)class_17992.method_57825(class_9334.field_49651, (Object)class_1844.field_49274);
            for (class_1293 class_12932 : class_18442.method_57397()) {
                if (class_12932.method_5579().comp_349() != class_12912) continue;
                return i2;
            }
        }
        return -1;
    }

    @Override
    public void L() {
        this.D = false;
    }

    @r
    public void p(QO qO) {
        if (this.p.h() && !e.n()) {
            return;
        }
        if (!this.J.S(this.k.e() * 1000.0)) {
            return;
        }
        if (!this.H.h() || (h.W.field_1724.method_24828() || Frog.PLAYER.n((class_1657)h.W.field_1724)) && !h.W.field_1687.method_22347((class_2338)new k(h.W.field_1724.method_19538().method_1031(0.0, -1.0, 0.0)))) {
            if (this.M.h() && (!h.W.field_1724.method_6059(class_1294.field_5907) || h.W.field_1724.method_6112(class_1294.field_5907).method_5578() < 2)) {
                this.D = this.K((class_1291)class_1294.field_5907.comp_349());
                if (this.d()) {
                    this.T((class_1291)class_1294.field_5907.comp_349());
                    return;
                }
            }
            if (this.V.h() && !h.W.field_1724.method_6059(class_1294.field_5904)) {
                this.D = this.K((class_1291)class_1294.field_5904.comp_349());
                if (this.d()) {
                    this.T((class_1291)class_1294.field_5904.comp_349());
                    return;
                }
            }
            if (this.m.h() && !h.W.field_1724.method_6059(class_1294.field_5910)) {
                this.D = this.K((class_1291)class_1294.field_5910.comp_349());
                if (this.d()) {
                    this.T((class_1291)class_1294.field_5910.comp_349());
                    return;
                }
            }
            if (this.Q.h() && !h.W.field_1724.method_6059(class_1294.field_5906)) {
                this.D = this.K((class_1291)class_1294.field_5906.comp_349());
                if (this.d()) {
                    this.T((class_1291)class_1294.field_5906.comp_349());
                }
            }
        }
    }

    public void T(class_1291 class_12912) {
        int n2;
        int n3 = h.W.field_1724.method_31548().field_7545;
        if (this.p.h() && (n2 = h.y(class_12912)) != -1) {
            Frog.ROTATION.o(Frog.ROTATION.Q, 90.0f);
            g.z(n2, h.W.field_1724.method_31548().field_7545);
            h.n(h::lambda$throwPotion$0);
            g.z(n2, h.W.field_1724.method_31548().field_7545);
            e.t();
            Frog.ROTATION.M();
            this.J.H();
        } else {
            n2 = h.P(class_12912);
            if (n2 != -1) {
                Frog.ROTATION.o(Frog.ROTATION.Q, 90.0f);
                g.j(n2);
                h.n(h::lambda$throwPotion$1);
                g.j(n3);
                Frog.ROTATION.M();
                this.J.H();
            }
        }
    }

    public boolean d() {
        return this.D;
    }

    public boolean K(class_1291 class_12912) {
        if (!e.n()) {
            return false;
        }
        if (this.s.h() && h.W.field_1724.method_6115()) {
            return false;
        }
        return h.P(class_12912) != -1 || this.p.h() && h.y(class_12912) != -1;
    }

    private static class_2596 lambda$throwPotion$1(int n2) {
        return new class_2886(class_1268.field_5808, n2, Frog.ROTATION.X(), Frog.ROTATION.F());
    }

    private static class_2596 lambda$throwPotion$0(int n2) {
        return new class_2886(class_1268.field_5808, n2, Frog.ROTATION.X(), Frog.ROTATION.F());
    }
}

