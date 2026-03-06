/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.effect.StatusEffects
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EquipmentSlot
 *  net.minecraft.entity.MovementType
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.entity.projectile.FireworkRocketEntity
 *  net.minecraft.screen.slot.SlotActionType
 *  net.minecraft.item.ElytraItem
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket$Mode
 *  net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package dev.idhammai.c.r.q.D;

import dev.idhammai.Frog;
import dev.idhammai.P.A.A.h;
import dev.idhammai.P.A.L.e;
import dev.idhammai.P.A.L.g;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.A;
import dev.idhammai.P.r.c.J;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.P.r.c.T;
import dev.idhammai.P.r.c.i;
import dev.idhammai.P.r.c.s;
import dev.idhammai.P.r.c.v;
import dev.idhammai.asm.accessors.IFireworkRocketEntity;
import dev.idhammai.asm.accessors.ILivingEntity;
import dev.idhammai.c.r.O.Y.B;
import dev.idhammai.c.r.O.Y.O;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.q.D.R;
import dev.idhammai.c.r.q.D.b;
import dev.idhammai.c.r.q.D.l;
import dev.idhammai.c.r.q.N.x;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import net.minecraft.util.Hand;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.MovementType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.FireworkRocketEntity;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.item.ElytraItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.network.ClientPlayerEntity;

public class Q
extends y {
    public static Q F;
    public final B<R> QQ = this.S(new B<R>("Mode", dev.idhammai.c.r.q.D.R.Control).I("\u6a21\u5f0f").X(dev.idhammai.c.r.q.D.R.Control, "\u63a7\u5236").X(dev.idhammai.c.r.q.D.R.Boost, "\u63a8\u8fdb").X(dev.idhammai.c.r.q.D.R.Bounce, "\u5f39\u8df3").X(dev.idhammai.c.r.q.D.R.Freeze, "\u51bb\u7ed3").X(dev.idhammai.c.r.q.D.R.None, "\u65e0").X(dev.idhammai.c.r.q.D.R.Rotation, "\u8f6c\u5411").X(dev.idhammai.c.r.q.D.R.Pitch, "\u4fef\u4ef0"));
    public final W QP = this.S(new W("InfiniteDura", false).k("\u65e0\u9650\u8010\u4e45"));
    public final W H = this.S(new W("Packet", false).k("\u53d1\u5305\u6ed1\u7fd4").D());
    private final dev.idhammai.c.r.O.Y.l A = this.p(new dev.idhammai.c.r.O.Y.l("PacketDelay", 0.0, 0.0, 20.0, 1.0, this.H::f).D("\u53d1\u5305\u5ef6\u8fdf"));
    private final W r = this.S(new W("SetFlag", false, this::lambda$new$0).k("\u8bbe\u7f6e\u98de\u884c\u6807\u8bb0"));
    private final W L = this.S(new W("Firework", false).k("\u70df\u82b1\u52a0\u901f").D());
    public final O P = this.n(new O("FireWorkBind", -1, this.L::f).E("\u70df\u82b1\u6309\u952e"));
    public final W G = this.S(new W("PacketInteract", true, this.L::f).k("\u53d1\u5305\u4ea4\u4e92"));
    public final W j = this.S(new W("InventorySwap", true, this.L::f).k("\u80cc\u5305\u5207\u6362"));
    public final W g = this.S(new W("OnlyOne", true, this.L::f).k("\u4ec5\u4e00\u679a\u70df\u82b1"));
    private final W Qd = this.S(new W("UsingPause", true, this.L::f).k("\u4f7f\u7528\u6682\u505c"));
    public final W Qn = this.S(new W("AutoJump", true, this::lambda$new$1).k("\u81ea\u52a8\u8d77\u8df3"));
    public final dev.idhammai.c.r.O.Y.l u = this.p(new dev.idhammai.c.r.O.Y.l("UpPitch", 0.0, 0.0, 90.0, this::lambda$new$2).D("\u4e0a\u4ef0\u89d2"));
    public final dev.idhammai.c.r.O.Y.l U = this.p(new dev.idhammai.c.r.O.Y.l("UpFactor", 1.0, 0.0, 10.0, this::lambda$new$3).D("\u4e0a\u5347\u7cfb\u6570"));
    public final dev.idhammai.c.r.O.Y.l t = this.p(new dev.idhammai.c.r.O.Y.l("FallSpeed", 1.0, 0.0, 10.0, this::lambda$new$4).D("\u4e0b\u843d\u901f\u5ea6"));
    public final dev.idhammai.c.r.O.Y.l b = this.p(new dev.idhammai.c.r.O.Y.l("Speed", 1.0, (double)0.1f, 10.0, this::lambda$new$5).D("\u901f\u5ea6"));
    public final W f = this.S(new W("SpeedLimit", true, this::lambda$new$6).k("\u9650\u901f"));
    public final dev.idhammai.c.r.O.Y.l w = this.p(new dev.idhammai.c.r.O.Y.l("MaxSpeed", 2.5, (double)0.1f, 10.0, this::lambda$new$7).D("\u6700\u5927\u901f\u5ea6"));
    public final W m = this.S(new W("NoDrag", false, this::lambda$new$8).k("\u65e0\u963b\u529b"));
    public final h k = new h();
    private final W n = this.S(new W("AutoStop", true).k("\u81ea\u52a8\u505c\u4e0b"));
    private final W Q = this.S(new W("Sprint", true, this::lambda$new$9).k("\u51b2\u523a"));
    private final dev.idhammai.c.r.O.Y.l l = this.p(new dev.idhammai.c.r.O.Y.l("Pitch", 88.0, -90.0, 90.0, 0.1, this::lambda$new$10).D("\u4fef\u4ef0"));
    private final W I = this.S(new W("AutoStart", true, this::lambda$new$11).k("\u81ea\u52a8\u8d77\u98de"));
    private final W Y = this.S(new W("CheckSpeed", false, this::lambda$new$12).k("\u68c0\u6d4b\u901f\u5ea6"));
    public final dev.idhammai.c.r.O.Y.l d = this.p(new dev.idhammai.c.r.O.Y.l("MinSpeed", 70.0, 0.1, 200.0, this::lambda$new$13).D("\u6700\u4f4e\u901f\u5ea6"));
    private final dev.idhammai.c.r.O.Y.l E = this.p(new dev.idhammai.c.r.O.Y.l("Delay", 1000.0, 0.0, 20000.0, 50.0, this::lambda$new$14).D("\u5ef6\u8fdf"));
    private final dev.idhammai.c.r.O.Y.l T = this.p(new dev.idhammai.c.r.O.Y.l("Timeout", 0.0, 0.1, 1.0, 0.1, this::lambda$new$15).D("\u8d85\u65f6"));
    private final dev.idhammai.c.r.O.Y.l e = this.p(new dev.idhammai.c.r.O.Y.l("DownSpeed", 1.0, 0.1, 10.0, this::lambda$new$16).D("\u4e0b\u6c89\u901f\u5ea6"));
    private final dev.idhammai.c.r.O.Y.l s = this.p(new dev.idhammai.c.r.O.Y.l("Boost", 1.0, 0.1, 4.0, this::lambda$new$17).D("\u63a8\u8fdb\u5f3a\u5ea6"));
    private final W J = this.S(new W("Freeze", false, this::lambda$new$18).k("\u51bb\u7ed3"));
    private final W C = this.S(new W("MotionStop", false, this::lambda$new$19).k("\u505c\u6b62\u8fd0\u52a8"));
    private final dev.idhammai.c.r.O.Y.l Q3 = this.p(new dev.idhammai.c.r.O.Y.l("InfiniteMaxSpeed", 150.0, 50.0, 170.0, this::lambda$new$20).D("\u65e0\u9650\u6700\u5927\u901f\u5ea6"));
    private final dev.idhammai.c.r.O.Y.l Z = this.p(new dev.idhammai.c.r.O.Y.l("InfiniteMinSpeed", 25.0, 10.0, 70.0, this::lambda$new$21).D("\u65e0\u9650\u6700\u5c0f\u901f\u5ea6"));
    private final dev.idhammai.c.r.O.Y.l B = this.p(new dev.idhammai.c.r.O.Y.l("InfiniteMaxHeight", 200, -50, 360, this::lambda$new$22).D("\u65e0\u9650\u6700\u5927\u9ad8\u5ea6"));
    public final W V = this.S(new W("ReleaseSneak", false).k("\u5173\u95ed\u65f6\u677e\u5f00\u6f5c\u884c"));
    private final h N = new h();
    boolean c;
    float y;
    private boolean K = false;
    float X = 0.0f;
    float D = 0.0f;
    boolean R = false;
    int a = 0;
    private boolean p;
    private float h;
    private float M;

    public Q() {
        super("ElytraFly", dev.idhammai.c.r.w.Movement);
        this.L("\u9798\u7fc5\u98de\u884c");
        F = this;
        Frog.EVENT_BUS.S(new b(this));
    }

    public void M() {
        int n2;
        if (this.j.h() && !dev.idhammai.P.A.L.e.n()) {
            return;
        }
        if (this.g.h()) {
            for (class_1297 class_12972 : Frog.THREAD.z()) {
                class_1671 class_16712;
                if (!(class_12972 instanceof class_1671) || ((IFireworkRocketEntity)(class_16712 = (class_1671)class_12972)).getShooter() != dev.idhammai.c.r.q.D.Q.W.field_1724) continue;
                return;
            }
        }
        dev.idhammai.c.r.q.D.Q.F.k.H();
        if (dev.idhammai.c.r.q.D.Q.W.field_1724.method_6047().method_7909() == class_1802.field_8639) {
            if (this.G.h()) {
                dev.idhammai.c.r.q.D.Q.n(Q::lambda$off$23);
            } else {
                dev.idhammai.c.r.q.D.Q.W.field_1761.method_2919((class_1657)dev.idhammai.c.r.q.D.Q.W.field_1724, class_1268.field_5808);
            }
        } else if (this.j.h() && (n2 = dev.idhammai.P.A.L.g.a(class_1802.field_8639)) != -1) {
            dev.idhammai.P.A.L.g.z(n2, dev.idhammai.c.r.q.D.Q.W.field_1724.method_31548().field_7545);
            if (this.G.h()) {
                dev.idhammai.c.r.q.D.Q.n(Q::lambda$off$24);
            } else {
                dev.idhammai.c.r.q.D.Q.W.field_1761.method_2919((class_1657)dev.idhammai.c.r.q.D.Q.W.field_1724, class_1268.field_5808);
            }
            dev.idhammai.P.A.L.g.z(n2, dev.idhammai.c.r.q.D.Q.W.field_1724.method_31548().field_7545);
            dev.idhammai.P.A.L.e.t();
        } else {
            n2 = dev.idhammai.P.A.L.g.E(class_1802.field_8639);
            if (n2 != -1) {
                int n3 = dev.idhammai.c.r.q.D.Q.W.field_1724.method_31548().field_7545;
                dev.idhammai.P.A.L.g.j(n2);
                if (this.G.h()) {
                    dev.idhammai.c.r.q.D.Q.n(Q::lambda$off$25);
                } else {
                    dev.idhammai.c.r.q.D.Q.W.field_1761.method_2919((class_1657)dev.idhammai.c.r.q.D.Q.W.field_1724, class_1268.field_5808);
                }
                dev.idhammai.P.A.L.g.j(n3);
            }
        }
    }

    public static boolean O(class_746 class_7462) {
        if (dev.idhammai.c.r.q.D.Q.R(class_7462) && dev.idhammai.c.r.q.D.Q.X(class_7462)) {
            class_7462.field_3944.method_52787((class_2596)new class_2848((class_1297)class_7462, class_2848.class_2849.field_12982));
            if (dev.idhammai.c.r.q.D.Q.F.r.h()) {
                dev.idhammai.c.r.q.D.Q.W.field_1724.method_23669();
            }
            return true;
        }
        return false;
    }

    public static boolean R(class_746 class_7462) {
        class_1799 class_17992 = class_7462.method_6118(class_1304.field_6174);
        return !class_7462.method_31549().field_7479 && !class_7462.method_5765() && !class_7462.method_6101() && class_17992.method_31574(class_1802.field_8833) && class_1770.method_7804((class_1799)class_17992);
    }

    private static boolean X(class_746 class_7462) {
        if (!class_7462.method_5799() && !class_7462.method_6059(class_1294.field_5902)) {
            class_1799 class_17992 = class_7462.method_6118(class_1304.field_6174);
            if (class_17992.method_31574(class_1802.field_8833) && class_1770.method_7804((class_1799)class_17992)) {
                class_7462.method_23669();
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public String I() {
        return this.QQ.X().name();
    }

    @Override
    public void H() {
        if (dev.idhammai.c.r.q.D.Q.M()) {
            return;
        }
        this.K = false;
        this.X = dev.idhammai.c.r.q.D.Q.W.field_1724.method_36454();
        this.D = dev.idhammai.c.r.q.D.Q.W.field_1724.method_36455();
    }

    @Override
    public void L() {
        if (dev.idhammai.c.r.q.D.Q.M()) {
            return;
        }
        if (this.V.h()) {
            W.method_1562().method_52787((class_2596)new class_2848((class_1297)dev.idhammai.c.r.q.D.Q.W.field_1724, class_2848.class_2849.field_12984));
        }
    }

    private void q() {
        if (this.K) {
            if (!this.z()) {
                return;
            }
            float f2 = (float)Math.toRadians(dev.idhammai.c.r.q.D.Q.W.field_1724.method_36454());
            if (dev.idhammai.c.r.q.D.Q.W.field_1690.field_1894.method_1434()) {
                dev.idhammai.c.r.q.D.Q.W.field_1724.method_5762((double)(-class_3532.method_15374((float)f2) * this.s.Z() / 10.0f), 0.0, (double)(class_3532.method_15362((float)f2) * this.s.Z() / 10.0f));
            }
        }
    }

    @r(D=-9999)
    public void Z(A a2) {
        if (dev.idhammai.c.r.q.D.Q.M()) {
            return;
        }
        if (this.QQ.x(dev.idhammai.c.r.q.D.R.Rotation)) {
            if (this.z()) {
                if (dev.idhammai.P.A.L.l.b()) {
                    if (dev.idhammai.c.r.q.D.Q.W.field_1690.field_1903.method_1434()) {
                        this.D = -45.0f;
                    } else if (dev.idhammai.c.r.q.D.Q.W.field_1690.field_1832.method_1434()) {
                        this.D = 45.0f;
                    } else {
                        this.D = -1.9f;
                        if (this.C.h()) {
                            this.c(0.0);
                        }
                    }
                } else if (dev.idhammai.c.r.q.D.Q.W.field_1690.field_1903.method_1434()) {
                    this.D = -89.0f;
                } else if (dev.idhammai.c.r.q.D.Q.W.field_1690.field_1832.method_1434()) {
                    this.D = 89.0f;
                } else if (this.C.h()) {
                    this.c(0.0);
                }
                if (dev.idhammai.c.r.q.D.Q.W.field_1690.field_1894.method_1434() || dev.idhammai.c.r.q.D.Q.W.field_1690.field_1881.method_1434() || dev.idhammai.c.r.q.D.Q.W.field_1690.field_1913.method_1434() || dev.idhammai.c.r.q.D.Q.W.field_1690.field_1849.method_1434()) {
                    this.X = dev.idhammai.c.r.q.D.l.U(dev.idhammai.c.r.q.D.Q.W.field_1724.method_36454());
                } else if (this.C.h()) {
                    this.W(0.0);
                    this.E(0.0);
                }
                a2.F(this.X);
                a2.p(this.D);
            }
        } else if (this.QQ.x(dev.idhammai.c.r.q.D.R.Pitch)) {
            if (this.z()) {
                a2.p(this.M);
            }
        } else if (this.QQ.x(dev.idhammai.c.r.q.D.R.Bounce) && this.z()) {
            a2.p(this.l.Z());
        }
    }

    @r
    public void a(QO qO) {
        this.X();
        this.R = false;
        if (this.H.h()) {
            this.K = dev.idhammai.P.A.L.g.a(class_1802.field_8833) != -1;
        } else {
            this.K = false;
            for (class_1799 class_17992 : dev.idhammai.c.r.q.D.Q.W.field_1724.method_5661()) {
                if (!(class_17992.method_7909() instanceof class_1770)) continue;
                this.K = true;
                break;
            }
            if (this.QP.h() && !dev.idhammai.c.r.q.D.Q.W.field_1724.method_24828() && this.K) {
                this.R = true;
                dev.idhammai.c.r.q.D.Q.W.field_1761.method_2906(dev.idhammai.c.r.q.D.Q.W.field_1724.field_7512.field_7763, 6, 0, class_1713.field_7790, (class_1657)dev.idhammai.c.r.q.D.Q.W.field_1724);
                dev.idhammai.c.r.q.D.Q.W.field_1761.method_2906(dev.idhammai.c.r.q.D.Q.W.field_1724.field_7512.field_7763, 6, 0, class_1713.field_7790, (class_1657)dev.idhammai.c.r.q.D.Q.W.field_1724);
                W.method_1562().method_52787((class_2596)new class_2848((class_1297)dev.idhammai.c.r.q.D.Q.W.field_1724, class_2848.class_2849.field_12982));
                if (this.r.h()) {
                    dev.idhammai.c.r.q.D.Q.W.field_1724.method_23669();
                }
            }
            if (this.QQ.x(dev.idhammai.c.r.q.D.R.Bounce)) {
                ((ILivingEntity)dev.idhammai.c.r.q.D.Q.W.field_1724).setLastJumpCooldown(0);
                return;
            }
        }
        double d2 = dev.idhammai.c.r.q.D.Q.W.field_1724.method_23317() - dev.idhammai.c.r.q.D.Q.W.field_1724.field_6014;
        double d3 = dev.idhammai.c.r.q.D.Q.W.field_1724.method_23318() - dev.idhammai.c.r.q.D.Q.W.field_1724.field_6036;
        double d4 = dev.idhammai.c.r.q.D.Q.W.field_1724.method_23321() - dev.idhammai.c.r.q.D.Q.W.field_1724.field_5969;
        double d5 = Math.sqrt(d2 * d2 + d4 * d4 + d3 * d3) / 1000.0;
        double d6 = 1.388888888888889E-5;
        float f2 = Frog.TIMER.N();
        double d7 = d5 / d6 * (double)f2;
        if (this.QQ.X() == dev.idhammai.c.r.q.D.R.Boost) {
            this.q();
        }
        if (this.H.h()) {
            if (dev.idhammai.c.r.q.D.Q.W.field_1724.method_24828()) {
                return;
            }
            ++this.a;
            if ((double)this.a <= this.A.e()) {
                return;
            }
            int n2 = dev.idhammai.P.A.L.g.E(class_1802.field_8833);
            if (n2 != -1) {
                dev.idhammai.c.r.q.D.Q.W.field_1761.method_2906(dev.idhammai.c.r.q.D.Q.W.field_1724.field_7512.field_7763, 6, n2, class_1713.field_7791, (class_1657)dev.idhammai.c.r.q.D.Q.W.field_1724);
                W.method_1562().method_52787((class_2596)new class_2848((class_1297)dev.idhammai.c.r.q.D.Q.W.field_1724, class_2848.class_2849.field_12982));
                dev.idhammai.c.r.q.D.Q.W.field_1724.method_23669();
                if ((!this.Y.h() || d7 <= this.d.e()) && this.L.h() && this.k.m(this.E.V()) && (dev.idhammai.P.A.L.l.b() || this.QQ.x(dev.idhammai.c.r.q.D.R.Rotation) && dev.idhammai.c.r.q.D.Q.W.field_1690.field_1903.method_1434()) && (!dev.idhammai.c.r.q.D.Q.W.field_1724.method_6115() || !this.Qd.h()) && this.z()) {
                    this.M();
                    this.k.H();
                }
                dev.idhammai.c.r.q.D.Q.W.field_1761.method_2906(dev.idhammai.c.r.q.D.Q.W.field_1724.field_7512.field_7763, 6, n2, class_1713.field_7791, (class_1657)dev.idhammai.c.r.q.D.Q.W.field_1724);
                this.a = 0;
            } else {
                n2 = dev.idhammai.P.A.L.g.a(class_1802.field_8833);
                if (n2 != -1) {
                    dev.idhammai.c.r.q.D.Q.W.field_1761.method_2906(dev.idhammai.c.r.q.D.Q.W.field_1724.field_7512.field_7763, n2, 0, class_1713.field_7790, (class_1657)dev.idhammai.c.r.q.D.Q.W.field_1724);
                    dev.idhammai.c.r.q.D.Q.W.field_1761.method_2906(dev.idhammai.c.r.q.D.Q.W.field_1724.field_7512.field_7763, 6, 0, class_1713.field_7790, (class_1657)dev.idhammai.c.r.q.D.Q.W.field_1724);
                    W.method_1562().method_52787((class_2596)new class_2848((class_1297)dev.idhammai.c.r.q.D.Q.W.field_1724, class_2848.class_2849.field_12982));
                    dev.idhammai.c.r.q.D.Q.W.field_1724.method_23669();
                    if ((!this.Y.h() || d7 <= this.d.e()) && this.L.h() && this.k.m(this.E.V()) && (dev.idhammai.P.A.L.l.b() || this.QQ.x(dev.idhammai.c.r.q.D.R.Rotation) && dev.idhammai.c.r.q.D.Q.W.field_1690.field_1903.method_1434()) && (!dev.idhammai.c.r.q.D.Q.W.field_1724.method_6115() || !this.Qd.h()) && this.z()) {
                        this.M();
                        this.k.H();
                    }
                    dev.idhammai.c.r.q.D.Q.W.field_1761.method_2906(dev.idhammai.c.r.q.D.Q.W.field_1724.field_7512.field_7763, 6, 0, class_1713.field_7790, (class_1657)dev.idhammai.c.r.q.D.Q.W.field_1724);
                    dev.idhammai.c.r.q.D.Q.W.field_1761.method_2906(dev.idhammai.c.r.q.D.Q.W.field_1724.field_7512.field_7763, n2, 0, class_1713.field_7790, (class_1657)dev.idhammai.c.r.q.D.Q.W.field_1724);
                    this.a = 0;
                }
            }
            return;
        }
        if ((!this.Y.h() || d7 <= this.d.e()) && this.L.h() && this.k.m(this.E.V()) && (dev.idhammai.P.A.L.l.b() || this.QQ.x(dev.idhammai.c.r.q.D.R.Rotation) && dev.idhammai.c.r.q.D.Q.W.field_1690.field_1903.method_1434()) && (!dev.idhammai.c.r.q.D.Q.W.field_1724.method_6115() || !this.Qd.h()) && this.z()) {
            this.M();
            this.k.H();
        }
        if (!this.z() && this.K) {
            this.k.m(99999999L);
            if (!dev.idhammai.c.r.q.D.Q.W.field_1724.method_24828() && this.I.h() && dev.idhammai.c.r.q.D.Q.W.field_1724.method_18798().method_10214() < 0.0 && !this.QP.h()) {
                if (!this.N.m((long)(1000.0 * this.T.e()))) {
                    return;
                }
                this.N.H();
                W.method_1562().method_52787((class_2596)new class_2848((class_1297)dev.idhammai.c.r.q.D.Q.W.field_1724, class_2848.class_2849.field_12982));
                if (this.r.h()) {
                    dev.idhammai.c.r.q.D.Q.W.field_1724.method_23669();
                }
            }
        }
    }

    protected final class_243 y(float f2, float f3) {
        float f4 = f2 * ((float)Math.PI / 180);
        float f5 = -f3 * ((float)Math.PI / 180);
        float f6 = class_3532.method_15362((float)f5);
        float f7 = class_3532.method_15374((float)f5);
        float f8 = class_3532.method_15362((float)f4);
        float f9 = class_3532.method_15374((float)f4);
        return new class_243((double)(f7 * f8), (double)(-f9), (double)(f6 * f8));
    }

    public class_243 F(float f2) {
        return this.y(-this.u.Z(), dev.idhammai.c.r.q.D.Q.W.field_1724.method_5705(f2));
    }

    @r
    private void W(T t2) {
        if (this.n.h() && this.z()) {
            int n2 = (int)(dev.idhammai.c.r.q.D.Q.W.field_1724.method_23317() / 16.0);
            int n3 = (int)(dev.idhammai.c.r.q.D.Q.W.field_1724.method_23321() / 16.0);
            if (!dev.idhammai.c.r.q.D.Q.W.field_1687.method_2935().method_12123(n2, n3)) {
                t2.L();
            }
        }
    }

    @r
    private void w(v v2) {
        if (dev.idhammai.c.r.q.D.Q.M()) {
            return;
        }
        if (this.QQ.x(dev.idhammai.c.r.q.D.R.Bounce) && this.K) {
            if (this.Qn.h()) {
                dev.idhammai.c.r.q.D.Q.W.field_1690.field_1903.method_23481(true);
            }
            if (v2.C()) {
                if (!this.z()) {
                    W.method_1562().method_52787((class_2596)new class_2848((class_1297)dev.idhammai.c.r.q.D.Q.W.field_1724, class_2848.class_2849.field_12982));
                }
                if (dev.idhammai.c.r.q.D.Q.R(dev.idhammai.c.r.q.D.Q.W.field_1724) && !this.Q.h()) {
                    if (this.z()) {
                        dev.idhammai.c.r.q.D.Q.W.field_1724.method_5728(dev.idhammai.c.r.q.D.Q.W.field_1724.method_24828());
                    } else {
                        dev.idhammai.c.r.q.D.Q.W.field_1724.method_5728(true);
                    }
                }
            } else if (dev.idhammai.c.r.q.D.Q.R(dev.idhammai.c.r.q.D.Q.W.field_1724) && this.Q.h()) {
                dev.idhammai.c.r.q.D.Q.W.field_1724.method_5728(true);
            }
        }
    }

    @r
    private void j(J j2) {
        if (dev.idhammai.c.r.q.D.Q.M()) {
            return;
        }
        if (this.QQ.x(dev.idhammai.c.r.q.D.R.Bounce) && this.K && j2.L() instanceof class_2848 && ((class_2848)j2.L()).method_12365().equals((Object)class_2848.class_2849.field_12982) && !this.Q.h()) {
            dev.idhammai.c.r.q.D.Q.W.field_1724.method_5728(true);
        }
    }

    @r
    private void i(i i2) {
        if (dev.idhammai.c.r.q.D.Q.M()) {
            return;
        }
        if (this.QQ.x(dev.idhammai.c.r.q.D.R.Bounce) && this.K && i2.L() instanceof class_2708) {
            dev.idhammai.c.r.q.D.Q.W.field_1724.method_23670();
        }
    }

    @r
    public void G(s s2) {
        if (dev.idhammai.c.r.q.D.Q.M()) {
            return;
        }
        if (!x.y.y()) {
            if (this.QQ.x(dev.idhammai.c.r.q.D.R.Bounce) && this.K) {
                if (s2.a()) {
                    this.c = true;
                    this.y = dev.idhammai.c.r.q.D.Q.W.field_1724.method_36455();
                    dev.idhammai.c.r.q.D.Q.W.field_1724.method_36457(this.l.Z());
                } else if (this.c) {
                    this.c = false;
                    dev.idhammai.c.r.q.D.Q.W.field_1724.method_36457(this.y);
                }
            } else if (this.QQ.x(dev.idhammai.c.r.q.D.R.Pitch) && this.z()) {
                if (s2.a()) {
                    this.c = true;
                    this.y = dev.idhammai.c.r.q.D.Q.W.field_1724.method_36455();
                    dev.idhammai.c.r.q.D.Q.W.field_1724.method_36457(this.h);
                } else if (this.c) {
                    this.c = false;
                    dev.idhammai.c.r.q.D.Q.W.field_1724.method_36457(this.y);
                }
            }
        }
    }

    @r
    public void q(s s2) {
        if (dev.idhammai.c.r.q.D.Q.M() || !this.K || !this.z() || s2.C()) {
            return;
        }
        if ((this.QQ.x(dev.idhammai.c.r.q.D.R.Freeze) || this.QQ.x(dev.idhammai.c.r.q.D.R.Rotation) && this.J.h()) && !dev.idhammai.P.A.L.l.b() && !dev.idhammai.c.r.q.D.Q.W.field_1690.field_1903.method_1434() && !dev.idhammai.c.r.q.D.Q.W.field_1690.field_1832.method_1434()) {
            s2.L();
            return;
        }
        if (this.QQ.X() == dev.idhammai.c.r.q.D.R.Control) {
            if (this.L.h()) {
                if (!dev.idhammai.c.r.q.D.Q.W.field_1690.field_1832.method_1434() || !dev.idhammai.c.r.q.D.Q.W.field_1724.field_3913.field_3904) {
                    if (dev.idhammai.c.r.q.D.Q.W.field_1690.field_1832.method_1434()) {
                        this.c(-this.e.e());
                    } else if (dev.idhammai.c.r.q.D.Q.W.field_1724.field_3913.field_3904) {
                        this.c(this.U.e());
                    } else {
                        this.c(-3.0E-11 * this.t.e());
                    }
                } else {
                    this.c(0.0);
                }
                double[] dArray = dev.idhammai.P.A.L.l.h(this.b.e());
                this.W(dArray[0]);
                this.E(dArray[1]);
            } else {
                double d2;
                class_243 class_2432 = this.F(W.method_60646().method_60637(true));
                double d3 = Math.sqrt(class_2432.field_1352 * class_2432.field_1352 + class_2432.field_1350 * class_2432.field_1350);
                double d4 = Math.sqrt(this.A() * this.A() + this.n() * this.n());
                if (dev.idhammai.c.r.q.D.Q.W.field_1724.field_3913.field_3903) {
                    this.c(-this.e.e());
                } else if (!dev.idhammai.c.r.q.D.Q.W.field_1724.field_3913.field_3904) {
                    this.c(-3.0E-11 * this.t.e());
                }
                if (dev.idhammai.c.r.q.D.Q.W.field_1724.field_3913.field_3904) {
                    if (d4 > this.U.e() / this.U.X()) {
                        d2 = d4 * 0.01325;
                        this.c(this.O() + d2 * 3.2);
                        this.W(this.A() - class_2432.field_1352 * d2 / d3);
                        this.E(this.n() - class_2432.field_1350 * d2 / d3);
                    } else {
                        double[] dArray = dev.idhammai.P.A.L.l.h(this.b.e());
                        this.W(dArray[0]);
                        this.E(dArray[1]);
                    }
                }
                if (d3 > 0.0) {
                    this.W(this.A() + (class_2432.field_1352 / d3 * d4 - this.A()) * 0.1);
                    this.E(this.n() + (class_2432.field_1350 / d3 * d4 - this.n()) * 0.1);
                }
                if (!dev.idhammai.c.r.q.D.Q.W.field_1724.field_3913.field_3904) {
                    double[] dArray = dev.idhammai.P.A.L.l.h(this.b.e());
                    this.W(dArray[0]);
                    this.E(dArray[1]);
                }
                if (!this.m.h()) {
                    this.c(this.O() * (double)0.99f);
                    this.W(this.A() * (double)0.98f);
                    this.E(this.n() * (double)0.99f);
                }
                d2 = Math.sqrt(this.A() * this.A() + this.n() * this.n());
                if (this.f.h() && d2 > this.w.e()) {
                    this.W(this.A() * this.w.e() / d2);
                    this.E(this.n() * this.w.e() / d2);
                }
                s2.L();
                dev.idhammai.c.r.q.D.Q.W.field_1724.method_5784(class_1313.field_6308, dev.idhammai.c.r.q.D.Q.W.field_1724.method_18798());
            }
        }
    }

    private double A() {
        return dev.idhammai.P.A.L.l.r();
    }

    private void W(double d2) {
        dev.idhammai.P.A.L.l.U(d2);
    }

    private double O() {
        return dev.idhammai.P.A.L.l.R();
    }

    private void c(double d2) {
        dev.idhammai.P.A.L.l.d(d2);
    }

    private double n() {
        return dev.idhammai.P.A.L.l.H();
    }

    private void E(double d2) {
        dev.idhammai.P.A.L.l.Q(d2);
    }

    private void X() {
        this.h = this.M;
        double d2 = Math.hypot(dev.idhammai.c.r.q.D.Q.W.field_1724.method_23317() - dev.idhammai.c.r.q.D.Q.W.field_1724.field_6014, dev.idhammai.c.r.q.D.Q.W.field_1724.method_23321() - dev.idhammai.c.r.q.D.Q.W.field_1724.field_5969);
        if (dev.idhammai.c.r.q.D.Q.W.field_1724.method_23318() < this.B.e()) {
            if (d2 * 72.0 < this.Z.e() && !this.p) {
                this.p = true;
            }
            if (d2 * 72.0 > this.Q3.e() && this.p) {
                this.p = false;
            }
        } else {
            this.p = true;
        }
        this.M = this.p ? (this.M = this.M + 3.0f) : (this.M = this.M - 3.0f);
        this.M = dev.idhammai.P.A.A.A.p(this.M, -40.0f, 40.0f);
    }

    public boolean z() {
        return dev.idhammai.c.r.q.D.Q.W.field_1724.method_6128() || this.H.h() && this.K && !dev.idhammai.c.r.q.D.Q.W.field_1724.method_24828() || this.R;
    }

    private static class_2596 lambda$off$25(int n2) {
        return new class_2886(class_1268.field_5808, n2, Frog.ROTATION.X(), Frog.ROTATION.F());
    }

    private static class_2596 lambda$off$24(int n2) {
        return new class_2886(class_1268.field_5808, n2, Frog.ROTATION.X(), Frog.ROTATION.F());
    }

    private static class_2596 lambda$off$23(int n2) {
        return new class_2886(class_1268.field_5808, n2, Frog.ROTATION.X(), Frog.ROTATION.F());
    }

    private boolean lambda$new$22() {
        return this.QQ.X() == dev.idhammai.c.r.q.D.R.Pitch;
    }

    private boolean lambda$new$21() {
        return this.QQ.X() == dev.idhammai.c.r.q.D.R.Pitch;
    }

    private boolean lambda$new$20() {
        return this.QQ.X() == dev.idhammai.c.r.q.D.R.Pitch;
    }

    private boolean lambda$new$19() {
        return this.QQ.x(dev.idhammai.c.r.q.D.R.Rotation);
    }

    private boolean lambda$new$18() {
        return this.QQ.x(dev.idhammai.c.r.q.D.R.Rotation);
    }

    private boolean lambda$new$17() {
        return this.QQ.X() == dev.idhammai.c.r.q.D.R.Boost;
    }

    private boolean lambda$new$16() {
        return this.QQ.X() == dev.idhammai.c.r.q.D.R.Control;
    }

    private boolean lambda$new$15() {
        return !this.QQ.x(dev.idhammai.c.r.q.D.R.Bounce);
    }

    private boolean lambda$new$14() {
        return !this.QQ.x(dev.idhammai.c.r.q.D.R.Bounce);
    }

    private boolean lambda$new$13() {
        return !this.QQ.x(dev.idhammai.c.r.q.D.R.Bounce);
    }

    private boolean lambda$new$12() {
        return !this.QQ.x(dev.idhammai.c.r.q.D.R.Bounce);
    }

    private boolean lambda$new$11() {
        return !this.QQ.x(dev.idhammai.c.r.q.D.R.Bounce);
    }

    private boolean lambda$new$10() {
        return this.QQ.x(dev.idhammai.c.r.q.D.R.Bounce);
    }

    private boolean lambda$new$9() {
        return this.QQ.x(dev.idhammai.c.r.q.D.R.Bounce);
    }

    private boolean lambda$new$8() {
        return this.QQ.X() == dev.idhammai.c.r.q.D.R.Control;
    }

    private boolean lambda$new$7() {
        return this.f.h() && this.QQ.X() == dev.idhammai.c.r.q.D.R.Control;
    }

    private boolean lambda$new$6() {
        return this.QQ.X() == dev.idhammai.c.r.q.D.R.Control;
    }

    private boolean lambda$new$5() {
        return this.QQ.X() == dev.idhammai.c.r.q.D.R.Control;
    }

    private boolean lambda$new$4() {
        return this.QQ.X() == dev.idhammai.c.r.q.D.R.Control;
    }

    private boolean lambda$new$3() {
        return this.QQ.X() == dev.idhammai.c.r.q.D.R.Control;
    }

    private boolean lambda$new$2() {
        return this.QQ.X() == dev.idhammai.c.r.q.D.R.Control;
    }

    private boolean lambda$new$1() {
        return this.QQ.x(dev.idhammai.c.r.q.D.R.Bounce);
    }

    private boolean lambda$new$0() {
        return !this.QQ.x(dev.idhammai.c.r.q.D.R.Bounce);
    }
}

