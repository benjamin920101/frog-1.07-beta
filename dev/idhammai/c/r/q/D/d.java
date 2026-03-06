/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_2338
 *  net.minecraft.class_238
 *  net.minecraft.class_239$class_240
 *  net.minecraft.class_243
 *  net.minecraft.class_2680
 *  net.minecraft.class_2708
 *  net.minecraft.class_3959
 *  net.minecraft.class_3959$class_242
 *  net.minecraft.class_3959$class_3960
 *  net.minecraft.class_3965
 */
package dev.idhammai.c.r.q.D;

import dev.idhammai.Frog;
import dev.idhammai.P.A.A.h;
import dev.idhammai.P.A.L.l;
import dev.idhammai.P.A.l.k;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.P.r.c.T;
import dev.idhammai.P.r.c.V;
import dev.idhammai.P.r.c.i;
import dev.idhammai.c.r.O.Y.B;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.q.D.n;
import dev.idhammai.c.r.q.D.x;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import java.util.HashMap;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_2708;
import net.minecraft.class_3959;
import net.minecraft.class_3965;

public class d
extends y {
    private final B<n> k = this.S(new B<n>("Mode", n.Fast).I("\u6a21\u5f0f").X(n.Fast, "\u5feb\u901f").X(n.None, "\u65e0"));
    private final W m = this.S(new W("NoLag", true, this::lambda$new$0).k("\u9632\u5361\u987f"));
    private final W Q = this.S(new W("UseTimer", false).k("\u4f7f\u7528\u8ba1\u65f6"));
    private final dev.idhammai.c.r.O.Y.l E = this.p(new dev.idhammai.c.r.O.Y.l("Timer", 2.5, 1.0, 8.0, 0.1, this.Q::h).D("\u8ba1\u65f6\u500d\u7387"));
    private final W U = this.S(new W("Anchor", true).k("\u8fb9\u7f18\u51cf\u901f"));
    private final dev.idhammai.c.r.O.Y.l D = this.p(new dev.idhammai.c.r.O.Y.l("Height", 10.0, 1.0, 20.0, 0.5).D("\u751f\u6548\u9ad8\u5ea6"));
    private final h L = new h();
    boolean f = false;
    private boolean X;

    public d() {
        super("FastFall", "Miyagi son simulator", w.Movement);
        this.L("\u5feb\u901f\u5760\u843d");
    }

    @Override
    public void L() {
        this.X = false;
    }

    @Override
    public String I() {
        return this.k.X().name();
    }

    @r(D=-100)
    public void W(T t2) {
        if (d.M()) {
            return;
        }
        if (d.W.field_1724.method_24828() && this.U.h() && this.y() != 0 && (double)this.y() <= this.D.e() && this.i()) {
            t2.C(t2.Z() * 0.05);
            t2.p(t2.w() * 0.05);
        }
    }

    @r
    public void U(QO qO) {
        if (this.D.e() > 0.0 && (double)this.y() > this.D.e() || d.W.field_1724.method_5757() || d.W.field_1724.method_5869() || d.W.field_1724.method_5771() || d.W.field_1724.method_21754() || !this.L.m(1000L) || d.W.field_1724.method_6128() || x.N.p() || d.M()) {
            return;
        }
        if (Frog.PLAYER.n((class_1657)d.W.field_1724)) {
            return;
        }
        if (d.W.field_1724.method_24828() && this.k.X() == n.Fast) {
            l.d(l.R() - (double)(this.m.h() ? 0.62f : 1.0f));
        }
        if (this.Q.h()) {
            if (!d.W.field_1724.method_24828()) {
                if (this.f) {
                    this.X = true;
                }
                if (l.R() >= 0.0) {
                    this.X = false;
                }
                this.f = false;
            } else {
                this.X = false;
                l.d(-0.08);
                this.f = true;
            }
        } else {
            this.X = false;
        }
    }

    @r
    public void R(V v2) {
        if (d.M()) {
            return;
        }
        if (!d.W.field_1724.method_24828() && this.X) {
            v2.K(this.E.Z());
        }
    }

    @r
    public void Y(i i2) {
        if (!d.M() && i2.L() instanceof class_2708) {
            this.L.H();
        }
    }

    private int y() {
        int n2;
        int n3 = 0;
        for (int i2 = n2 = (int)Math.round(d.W.field_1724.method_23318()) - 1; i2 >= 0; --i2) {
            class_3965 class_39652 = d.W.field_1687.method_17742(new class_3959(d.W.field_1724.method_19538(), new class_243(d.W.field_1724.method_23317(), (double)i2, d.W.field_1724.method_23321()), class_3959.class_3960.field_17558, class_3959.class_242.field_1348, (class_1297)d.W.field_1724));
            if (class_39652 != null && class_39652.method_17783() == class_239.class_240.field_1332) {
                return n3;
            }
            ++n3;
        }
        return n3;
    }

    private boolean i() {
        class_238 class_2383 = d.W.field_1724.method_5829();
        class_243 class_2432 = class_2383.method_1005();
        double d2 = class_2383.field_1323;
        double d3 = class_2383.field_1321;
        double d4 = class_2383.field_1320;
        double d5 = class_2383.field_1324;
        HashMap<class_243, class_243> hashMap = new HashMap<class_243, class_243>();
        hashMap.put(class_2432, new class_243(class_2432.field_1352, class_2432.field_1351 - 1.0, class_2432.field_1350));
        hashMap.put(new class_243(d2, class_2432.field_1351, d3), new class_243(d2, class_2432.field_1351 - 1.0, d3));
        hashMap.put(new class_243(d4, class_2432.field_1351, d3), new class_243(d4, class_2432.field_1351 - 1.0, d3));
        hashMap.put(new class_243(d2, class_2432.field_1351, d5), new class_243(d2, class_2432.field_1351 - 1.0, d5));
        hashMap.put(new class_243(d4, class_2432.field_1351, d5), new class_243(d4, class_2432.field_1351 - 1.0, d5));
        for (class_243 class_2433 : hashMap.keySet()) {
            class_3959 class_39592 = new class_3959(class_2433, (class_243)hashMap.get(class_2433), class_3959.class_3960.field_17558, class_3959.class_242.field_1348, (class_1297)d.W.field_1724);
            class_3965 class_39652 = d.W.field_1687.method_17742(class_39592);
            if (class_39652 == null || class_39652.method_17783() != class_239.class_240.field_1332) continue;
            return false;
        }
        class_2680 class_26802 = d.W.field_1687.method_8320((class_2338)new k(d.W.field_1724.method_23317(), d.W.field_1724.method_23318() - 1.0, d.W.field_1724.method_23321()));
        return class_26802.method_26215();
    }

    private boolean lambda$new$0() {
        return this.k.X() == n.Fast;
    }
}

