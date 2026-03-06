/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.effect.StatusEffects
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.Entity$RemovalReason
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.item.ItemConvertible
 *  net.minecraft.block.Blocks
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.listener.ClientPlayPacketListener
 *  net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket
 *  net.minecraft.network.packet.s2c.play.ExplosionS2CPacket
 *  net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket$InteractType
 *  net.minecraft.sound.SoundEvents
 *  net.minecraft.sound.SoundCategory
 */
package dev.idhammai.c.r.q.x;

import dev.idhammai.Frog;
import dev.idhammai.P.A.A.f;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.J;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.v;
import dev.idhammai.c.r.q.A.I;
import dev.idhammai.c.r.q.A.O;
import dev.idhammai.c.r.q.A.i;
import dev.idhammai.c.r.q.x.k;
import dev.idhammai.c.r.q.x.o;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.util.Hand;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.ItemConvertible;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket;
import net.minecraft.network.packet.s2c.play.ExplosionS2CPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;
import net.minecraft.sound.SoundEvents;
import net.minecraft.sound.SoundCategory;

public class M
extends y {
    public static M g;
    public static o m;
    final v G = this.E(new v("Name", "IDhammaI").c("\u5047\u4eba\u540d\u79f0"));
    private final W j = this.S(new W("Damage", true).k("\u6a21\u62df\u53d7\u4f24"));
    private final W H = this.S(new W("AutoTotem", true).k("\u81ea\u52a8\u56fe\u817e"));
    public final W U = this.S(new W("Record", false).k("\u8bb0\u5f55\u8f68\u8ff9"));
    public final W w = this.S(new W("Play", false).k("\u56de\u653e\u8f68\u8ff9"));
    final List<k> N = new ArrayList<k>();
    int V;
    boolean M = false;

    public M() {
        super("FakePlayer", dev.idhammai.c.r.w.Misc);
        this.L("\u5047\u4eba");
        g = this;
    }

    @Override
    public String I() {
        return this.G.q();
    }

    @Override
    public void H() {
        if (dev.idhammai.c.r.q.x.M.M()) {
            this.p();
            return;
        }
        m = new o((class_1657)dev.idhammai.c.r.q.x.M.W.field_1724, this.G.q());
        dev.idhammai.c.r.q.x.M.W.field_1687.method_53875((class_1297)m);
    }

    @r
    public void i(QO qO) {
        if (m == null || dev.idhammai.c.r.q.x.M.m.field_17892 != dev.idhammai.c.r.q.x.M.W.field_1687) {
            this.p();
            return;
        }
        if (this.H.h()) {
            if (m.method_6079().method_7909() != class_1802.field_8288) {
                m.method_6122(class_1268.field_5810, new class_1799((class_1935)class_1802.field_8288));
            }
            if (m.method_6047().method_7909() != class_1802.field_8288) {
                m.method_6122(class_1268.field_5808, new class_1799((class_1935)class_1802.field_8288));
            }
        }
        if (this.U.h() != this.M && this.U.h()) {
            this.N.clear();
        }
        this.M = this.U.h();
        if (this.U.h()) {
            this.N.add(new k(dev.idhammai.c.r.q.x.M.W.field_1724.method_23317(), dev.idhammai.c.r.q.x.M.W.field_1724.method_23318(), dev.idhammai.c.r.q.x.M.W.field_1724.method_23321(), dev.idhammai.c.r.q.x.M.W.field_1724.method_36454(), dev.idhammai.c.r.q.x.M.W.field_1724.method_36455()));
        }
        if (this.w.h() && !this.N.isEmpty()) {
            ++this.V;
            if (this.V >= this.N.size()) {
                this.V = 0;
            }
            k k2 = this.N.get(this.V);
            m.method_36456(k2.PO);
            m.method_36457(k2.pl);
            m.method_5847(k2.PO);
            m.method_43391(k2.nr, k2.nl, k2.na);
            m.method_5759(k2.nr, k2.nl, k2.na, k2.PO, k2.pl, 3);
        }
    }

    @Override
    public void L() {
        if (m == null) {
            return;
        }
        m.method_5768();
        m.method_31745(class_1297.class_5529.field_26998);
        m.method_36209();
        m = null;
    }

    @r
    public void e(J j2) {
        class_2824 class_28242;
        class_2596<?> class_25962 = j2.L();
        if (class_25962 instanceof class_2824 && I.a(class_28242 = (class_2824)class_25962) == class_2824.class_5907.field_29172 && I.K(class_28242) == m) {
            dev.idhammai.c.r.q.x.M.W.field_1687.method_43128((class_1657)dev.idhammai.c.r.q.x.M.W.field_1724, m.method_23317(), m.method_23318(), m.method_23321(), class_3417.field_15115, class_3419.field_15248, 1.0f, 1.0f);
            float f2 = f.p((class_1309)dev.idhammai.c.r.q.x.M.W.field_1724, (class_1309)m);
            if (!(!(dev.idhammai.c.r.q.x.M.W.field_1724.field_6017 > 0.0f) && (!I.Z.p() || I.Z.L.x(dev.idhammai.c.r.q.A.v.Ground) || !dev.idhammai.c.r.q.x.M.W.field_1724.method_24828() && I.Z.j.h()) || dev.idhammai.c.r.q.x.M.W.field_1724.method_24828() && (!I.Z.p() || I.Z.L.x(dev.idhammai.c.r.q.A.v.Ground)) || dev.idhammai.c.r.q.x.M.W.field_1724.method_6101() || dev.idhammai.c.r.q.x.M.W.field_1724.method_5799() || dev.idhammai.c.r.q.x.M.W.field_1724.method_6059(class_1294.field_5919) || dev.idhammai.c.r.q.x.M.W.field_1724.method_5765())) {
                dev.idhammai.c.r.q.x.M.W.field_1687.method_43128((class_1657)dev.idhammai.c.r.q.x.M.W.field_1724, m.method_23317(), m.method_23318(), m.method_23321(), class_3417.field_15016, class_3419.field_15248, 1.0f, 1.0f);
                dev.idhammai.c.r.q.x.M.W.field_1724.method_7277((class_1297)m);
            }
            if (dev.idhammai.c.r.q.x.M.m.field_6235 <= 0) {
                m.method_48922(dev.idhammai.c.r.q.x.M.W.field_1687.method_48963().method_48830());
                if (m.method_6067() >= f2) {
                    m.method_6073(m.method_6067() - f2);
                } else {
                    float f3 = f2 - m.method_6067();
                    m.method_6073(0.0f);
                    m.method_6033(m.method_6032() - f3);
                }
                if (m.method_29504()) {
                    Frog.POP.M((class_1657)m);
                    if (m.method_6095(dev.idhammai.c.r.q.x.M.W.field_1687.method_48963().method_48830())) {
                        m.method_6033(10.0f);
                        new class_2663((class_1297)m, 35).method_11471((class_2602)W.method_1562());
                    }
                }
            }
        }
    }

    @r
    public void a(dev.idhammai.P.r.c.i i2) {
        class_2596<?> class_25962;
        if (this.j.h() && m != null && dev.idhammai.c.r.q.x.M.m.field_6235 <= 0 && (class_25962 = i2.L()) instanceof class_2664) {
            class_2664 class_26642 = (class_2664)class_25962;
            class_243 class_2432 = new class_243(class_26642.method_11475(), class_26642.method_11477(), class_26642.method_11478());
            if (Math.sqrt(class_2432.method_1025(m.method_19538())) > 10.0) {
                return;
            }
            float f2 = dev.idhammai.P.A.l.M.x(new dev.idhammai.P.A.l.k(class_26642.method_11475(), class_26642.method_11477(), class_26642.method_11478())) == class_2246.field_23152 ? (float)O.c.E(new dev.idhammai.P.A.l.k(class_26642.method_11475(), class_26642.method_11477(), class_26642.method_11478()), (class_1657)m, (class_1657)m) : i.X6.R(new class_243(class_26642.method_11475(), class_26642.method_11477(), class_26642.method_11478()), (class_1657)m, (class_1657)m);
            m.method_48922(dev.idhammai.c.r.q.x.M.W.field_1687.method_48963().method_48830());
            if (m.method_6067() >= f2) {
                m.method_6073(m.method_6067() - f2);
            } else {
                float f3 = f2 - m.method_6067();
                m.method_6073(0.0f);
                m.method_6033(m.method_6032() - f3);
            }
            if (m.method_29504()) {
                Frog.POP.M((class_1657)m);
                if (m.method_6095(dev.idhammai.c.r.q.x.M.W.field_1687.method_48963().method_48830())) {
                    m.method_6033(10.0f);
                    new class_2663((class_1297)m, 35).method_11471((class_2602)W.method_1562());
                }
            }
        }
    }
}

