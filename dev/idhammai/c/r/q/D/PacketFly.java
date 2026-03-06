/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.util.internal.ConcurrentSet
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket
 *  net.minecraft.network.packet.c2s.play.TeleportConfirmC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket$PositionAndOnGround
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket$LookAndOnGround
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket$Mode
 *  net.minecraft.client.gui.screen.DownloadingTerrainScreen
 */
package dev.idhammai.c.r.q.D;

import dev.idhammai.P.A.L.l;
import dev.idhammai.P.A.l.M;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.F;
import dev.idhammai.P.r.c.J;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.P.r.c.T;
import dev.idhammai.P.r.c.i;
import dev.idhammai.c.r.O.Y.B;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.q.D.A;
import dev.idhammai.c.r.q.D.L;
import dev.idhammai.c.r.q.D.N;
import dev.idhammai.c.r.q.D.g;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import io.netty.util.internal.ConcurrentSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.network.packet.c2s.play.TeleportConfirmC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.client.gui.screen.DownloadingTerrainScreen;

public class K
extends y {
    public static K U;
    public final B<g> a = this.S(new B<g>("Mode", dev.idhammai.c.r.q.D.g.Factor).I("\u6a21\u5f0f").X(dev.idhammai.c.r.q.D.g.Setback, "\u56de\u62c9").X(dev.idhammai.c.r.q.D.g.Fast, "\u5feb\u901f").X(dev.idhammai.c.r.q.D.g.Factor, "\u500d\u7387").X(dev.idhammai.c.r.q.D.g.Slow, "\u6162\u901f").X(dev.idhammai.c.r.q.D.g.Increment, "\u9012\u589e").X(dev.idhammai.c.r.q.D.g.Compatibility, "\u517c\u5bb9"));
    public final dev.idhammai.c.r.O.Y.l c = this.p(new dev.idhammai.c.r.O.Y.l("Factor", 1.0, 0.0, 10.0).D("\u500d\u7387"));
    public final B<N> s = this.S(new B<N>("Phase", dev.idhammai.c.r.q.D.N.Full).I("\u7a7f\u5899").X(dev.idhammai.c.r.q.D.N.Off, "\u5173\u95ed").X(dev.idhammai.c.r.q.D.N.Semi, "\u534a\u7a7f").X(dev.idhammai.c.r.q.D.N.Full, "\u5168\u7a7f"));
    public final B<L> f = this.S(new B<L>("Type", L.Up).I("\u8d8a\u754c\u7c7b\u578b").X(L.Down, "\u5411\u4e0b").X(L.Up, "\u5411\u4e0a").X(L.Preserve, "\u4fdd\u7559").X(L.Switch, "\u5207\u6362").X(L.X, "X").X(L.Z, "Z").X(L.XZ, "XZ"));
    public final W X = this.S(new W("AntiKick", true).k("\u9632\u8e22"));
    public final W K = this.S(new W("NoRotation", false).k("\u65e0\u65cb\u8f6c\u5305"));
    public final W H = this.S(new W("NoMovePacket", false).k("\u62e6\u622a\u79fb\u52a8\u5305"));
    public final W Y = this.S(new W("BB-Offset", false).k("\u78b0\u649e\u7bb1\u504f\u79fb"));
    public final dev.idhammai.c.r.O.Y.l C = this.p(new dev.idhammai.c.r.O.Y.l("Invalid-Offset", 1337, 0, 1337).D("\u8d8a\u754c\u504f\u79fb"));
    public final dev.idhammai.c.r.O.Y.l g = this.p(new dev.idhammai.c.r.O.Y.l("Invalids", 1, 0, 10).D("\u8d8a\u754c\u6b21\u6570"));
    public final dev.idhammai.c.r.O.Y.l h = this.p(new dev.idhammai.c.r.O.Y.l("Teleport", 1, 0, 10).D("\u786e\u8ba4\u4f20\u9001\u6b21\u6570"));
    public final dev.idhammai.c.r.O.Y.l F = this.p(new dev.idhammai.c.r.O.Y.l("C-Y", 0.0, -256.0, 256.0).D("\u9690\u85cfY\u9608\u503c"));
    public final dev.idhammai.c.r.O.Y.l N = this.p(new dev.idhammai.c.r.O.Y.l("C-Multiplier", 1.0, 0.0, 2.0).D("\u9690\u85cf\u500d\u7387"));
    public final dev.idhammai.c.r.O.Y.l d = this.p(new dev.idhammai.c.r.O.Y.l("Y-Multiplier", 1.0, 0.0, 2.0).D("Y\u500d\u7387"));
    public final dev.idhammai.c.r.O.Y.l A = this.p(new dev.idhammai.c.r.O.Y.l("X/Z-Multiplier", 1.0, 0.0, 2.0).D("XZ\u500d\u7387"));
    public final W b = this.S(new W("Elytra", false).k("\u4f2a\u9798\u7fc5"));
    public final W e = this.S(new W("Jitter-XZ", false).k("XZ\u6296\u52a8"));
    public final W r = this.S(new W("Jitter-Y", false).k("Y\u6296\u52a8"));
    public final W G = this.S(new W("Zero-Speed", false).k("\u5f52\u96f6\u901f\u5ea6"));
    public final W u = this.S(new W("Zero-Y", false).k("\u5f52\u96f6Y"));
    public final W T = this.S(new W("Zero-Teleport", true).k("\u96f6ID\u4e5f\u786e\u8ba4"));
    public final dev.idhammai.c.r.O.Y.l P = this.p(new dev.idhammai.c.r.O.Y.l("Zoomies", 3, 0, 10).D("\u6296\u52a8\u5468\u671f"));
    public final Map<Integer, A> B = new ConcurrentHashMap<Integer, A>();
    public final Set<class_2596<?>> t = new ConcurrentSet();
    public final AtomicInteger Z = new AtomicInteger();
    public class_243 M;
    public int k;
    public boolean m;
    public float Q;
    public int l = 0;

    public K() {
        super("PacketFly", w.Movement);
        this.L("\u53d1\u5305\u98de\u884c");
        U = this;
    }

    @Override
    public void F() {
        this.p();
        this.g();
    }

    @r
    public void h(QO qO) {
        this.B.entrySet().removeIf(K::lambda$onUpdate$0);
    }

    @r
    public void T(F f2) {
        if (f2.a() && this.a.X() != dev.idhammai.c.r.q.D.g.Compatibility) {
            double d2;
            double d3 = 0.0;
            dev.idhammai.P.A.L.l.U(0.0);
            dev.idhammai.P.A.L.l.d(0.0);
            dev.idhammai.P.A.L.l.Q(0.0);
            if (this.a.X() != dev.idhammai.c.r.q.D.g.Setback && this.Z.get() == 0) {
                if (this.d(6)) {
                    this.G(0.0, 0.0, 0.0, true);
                }
                return;
            }
            boolean bl = this.Z();
            if (dev.idhammai.c.r.q.D.K.W.field_1724.field_3913.field_3904 && (bl || !dev.idhammai.P.A.L.l.b())) {
                d3 = this.X.h() && !bl ? (this.d(this.a.X() == dev.idhammai.c.r.q.D.g.Setback ? 10 : 20) ? -0.032 : 0.062) : (this.r.h() && this.m ? 0.061 : 0.062);
            } else if (dev.idhammai.c.r.q.D.K.W.field_1724.field_3913.field_3903) {
                d3 = this.r.h() && this.m ? -0.061 : -0.062;
            } else {
                double d4 = !bl ? (this.d(4) ? (this.X.h() ? -0.04 : 0.0) : 0.0) : (d2 = (d3 = 0.0));
            }
            if (this.s.X() == dev.idhammai.c.r.q.D.N.Full && bl && dev.idhammai.P.A.L.l.b() && d3 != 0.0) {
                d3 /= 2.5;
            }
            d2 = this.e.h() && this.m ? 0.25 : 0.26;
            double d5 = this.e.h() && this.m ? 0.03 : 0.031;
            double[] dArray = dev.idhammai.P.A.L.l.h(this.s.X() == dev.idhammai.c.r.q.D.N.Full && bl ? d5 : d2);
            if (this.a.X() == dev.idhammai.c.r.q.D.g.Increment) {
                if ((double)this.Q >= this.c.e()) {
                    this.Q = 1.0f;
                } else {
                    this.Q += 1.0f;
                    if ((double)this.Q > this.c.e()) {
                        this.Q = this.c.Z();
                    }
                }
            } else {
                this.Q = this.c.Z();
            }
            int n2 = 1;
            while (true) {
                float f3;
                float f4 = n2;
                float f5 = f3 = this.a.X() == dev.idhammai.c.r.q.D.g.Factor || this.a.X() == dev.idhammai.c.r.q.D.g.Slow || this.a.X() == dev.idhammai.c.r.q.D.g.Increment ? this.Q : 1.0f;
                if (!(f4 <= f3)) break;
                double d6 = dev.idhammai.c.r.q.D.K.W.field_1724.method_23318() < this.F.e() && dev.idhammai.P.A.L.l.b() ? this.N.e() : 1.0;
                dev.idhammai.P.A.L.l.U(dArray[0] * (double)n2 * d6 * this.A.e());
                dev.idhammai.P.A.L.l.d(d3 * (double)n2 * this.d.e());
                dev.idhammai.P.A.L.l.Q(dArray[1] * (double)n2 * d6 * this.A.e());
                this.G(dev.idhammai.P.A.L.l.r(), dev.idhammai.P.A.L.l.R(), dev.idhammai.P.A.L.l.H(), this.a.X() != dev.idhammai.c.r.q.D.g.Setback);
                ++n2;
            }
            ++this.l;
            if ((double)this.l > this.P.e()) {
                this.m = !this.m;
                this.l = 0;
            }
        }
    }

    @r
    public void G(i i2) {
        if (dev.idhammai.c.r.q.D.K.M()) {
            return;
        }
        if (this.a.X() == dev.idhammai.c.r.q.D.g.Compatibility) {
            return;
        }
        class_2596<?> class_25962 = i2.L();
        if (class_25962 instanceof class_2708) {
            A a2;
            class_2708 class_27082 = (class_2708)class_25962;
            if (dev.idhammai.c.r.q.D.K.W.field_1724.method_5805() && this.a.X() != dev.idhammai.c.r.q.D.g.Setback && this.a.X() != dev.idhammai.c.r.q.D.g.Slow && !(dev.idhammai.c.r.q.D.K.W.field_1755 instanceof class_434) && (a2 = this.B.remove(class_27082.method_11737())) != null && a2.field_1352 == class_27082.method_11734() && a2.field_1351 == class_27082.method_11735() && a2.field_1350 == class_27082.method_11738()) {
                i2.G(true);
                return;
            }
            this.Z.set(class_27082.method_11737());
        }
    }

    @r
    public void R(T t2) {
        if (this.s.X() == dev.idhammai.c.r.q.D.N.Semi || this.Z()) {
            dev.idhammai.c.r.q.D.K.W.field_1724.field_5960 = true;
        }
        if (this.a.X() != dev.idhammai.c.r.q.D.g.Compatibility && (this.a.X() == dev.idhammai.c.r.q.D.g.Setback || this.Z.get() != 0)) {
            if (this.G.h()) {
                t2.C(0.0);
                t2.Z(0.0);
                t2.p(0.0);
            } else {
                t2.C(dev.idhammai.P.A.L.l.r());
                t2.Z(dev.idhammai.P.A.L.l.R());
                t2.p(dev.idhammai.P.A.L.l.H());
            }
            if (this.u.h()) {
                t2.Z(0.0);
            }
        }
    }

    @r
    public void O(J j2) {
        class_2596<?> class_25962 = j2.L();
        if (class_25962 instanceof class_2828) {
            class_2828 class_28282 = (class_2828)class_25962;
            if (this.a.X() != dev.idhammai.c.r.q.D.g.Compatibility && !this.t.remove(j2.L())) {
                if (class_28282 instanceof class_2828.class_2831 && !this.K.h()) {
                    return;
                }
                if (!this.H.h()) {
                    return;
                }
                j2.G(true);
            }
        }
    }

    @Override
    public void H() {
        this.g();
        if (dev.idhammai.c.r.q.D.K.W.field_1724 == null) {
            this.p();
        }
    }

    @Override
    public String I() {
        return this.a.X().toString();
    }

    public void g() {
        this.Q = 1.0f;
        this.k = 0;
        this.Z.set(0);
        this.t.clear();
        this.B.clear();
        this.M = null;
    }

    public boolean Z() {
        double d2 = this.Y.h() ? -0.0625 : 0.0;
        return dev.idhammai.P.A.l.M.d((class_1297)dev.idhammai.c.r.q.D.K.W.field_1724, dev.idhammai.c.r.q.D.K.W.field_1724.method_5829().method_1009(d2, d2, d2));
    }

    public boolean d(int n2) {
        if (++this.k >= n2) {
            this.k = 0;
            return true;
        }
        return false;
    }

    public void G(double d2, double d3, double d4, boolean bl) {
        int n2;
        class_243 class_2432;
        class_243 class_2433 = new class_243(d2, d3, d4);
        this.M = class_2432 = dev.idhammai.c.r.q.D.K.W.field_1724.method_19538().method_1019(class_2433);
        class_243 class_2434 = this.f.X().c(class_2432, this.C.V());
        this.J((class_2596<?>)new class_2828.class_2829(class_2432.field_1352, class_2432.field_1351, class_2432.field_1350, dev.idhammai.c.r.q.D.K.W.field_1724.method_24828()));
        if (!W.method_1542()) {
            n2 = 0;
            while ((double)n2 < this.g.e()) {
                this.J((class_2596<?>)new class_2828.class_2829(class_2434.field_1352, class_2434.field_1351, class_2434.field_1350, dev.idhammai.c.r.q.D.K.W.field_1724.method_24828()));
                class_2434 = this.f.X().c(class_2434, this.C.V());
                ++n2;
            }
        }
        if (bl && (this.T.h() || this.Z.get() != 0)) {
            n2 = 0;
            while ((double)n2 < this.h.e()) {
                this.z(class_2432);
                ++n2;
            }
        }
        if (this.b.h()) {
            W.method_1562().method_52787((class_2596)new class_2848((class_1297)dev.idhammai.c.r.q.D.K.W.field_1724, class_2848.class_2849.field_12982));
        }
    }

    public void z(class_243 class_2432) {
        int n2 = this.Z.incrementAndGet();
        W.method_1562().method_52787((class_2596)new class_2793(n2));
        this.B.put(n2, new A(class_2432));
    }

    public void J(class_2596<?> class_25962) {
        this.t.add(class_25962);
        W.method_1562().method_52787(class_25962);
    }

    private static boolean lambda$onUpdate$0(Map.Entry entry) {
        return System.currentTimeMillis() - ((A)((Object)entry.getValue())).X() > TimeUnit.SECONDS.toMillis(30L);
    }
}

