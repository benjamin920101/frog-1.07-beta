/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2246
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_2596
 *  net.minecraft.class_2828
 *  net.minecraft.class_2828$class_2829
 *  net.minecraft.class_2828$class_2830
 *  net.minecraft.class_3532
 */
package dev.idhammai.c.r.q.Q;

import dev.idhammai.P.A.A.h;
import dev.idhammai.P.A.L.e;
import dev.idhammai.P.A.L.l;
import dev.idhammai.P.A.l.k;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.J;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.c.r.O.Y.B;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.q.Q.o;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2828;
import net.minecraft.class_3532;

public class N
extends y {
    public static N E;
    private final B<o> a = this.S(new B<o>("Mode", o.Clip).I("\u6a21\u5f0f").X(o.HitboxDesync, "\u78b0\u649e\u7bb1\u9519\u4f4d").X(o.Clip, "\u6324\u5899").X(o.NoPacket, "\u65e0\u79fb\u52a8\u5305"));
    private final dev.idhammai.c.r.O.Y.l f = this.p(new dev.idhammai.c.r.O.Y.l("Delay", 5, 1, 10, this::lambda$new$0).D("\u5ef6\u8fdf"));
    private final dev.idhammai.c.r.O.Y.l b = this.p(new dev.idhammai.c.r.O.Y.l("RotationDelay", 100, 0, 500, this::lambda$new$1).D("\u8f6c\u5411\u5ef6\u8fdf"));
    private final W P = this.S(new W("Obsidian", false, this::lambda$new$2).k("\u9ed1\u66dc\u77f3\u5224\u5b9a"));
    private final W A = this.S(new W("Move", true, this::lambda$new$3).k("\u81ea\u52a8\u4f4d\u79fb"));
    private final W h = this.S(new W("MoveIn", true, this::lambda$new$4).k("\u5148\u63a8\u8fdb"));
    private final W B = this.S(new W("InvalidPacket", true, this::lambda$new$5).k("\u65e0\u6548\u5305"));
    private final h e = new h();
    private boolean N = true;
    private int U;
    private static final double I = 0.20000996883537;

    public N() {
        super("Clip", w.Exploit);
        this.L("\u5361\u5899");
        E = this;
    }

    @Override
    public void L() {
        this.U = 0;
    }

    @Override
    public String I() {
        if (this.a.x(o.NoPacket)) {
            return String.valueOf(this.e.k());
        }
        return String.valueOf(this.U);
    }

    @Override
    public void H() {
        if (dev.idhammai.c.r.q.Q.N.M()) {
            return;
        }
        if (this.a.x(o.NoPacket) && this.A.h()) {
            this.N = false;
            if (this.h.h()) {
                class_2350 class_23502 = dev.idhammai.c.r.q.Q.N.W.field_1724.method_5735();
                dev.idhammai.c.r.q.Q.N.W.field_1724.method_5814(dev.idhammai.c.r.q.Q.N.W.field_1724.method_23317() + (double)class_23502.method_10148() * 0.5, dev.idhammai.c.r.q.Q.N.W.field_1724.method_23318(), dev.idhammai.c.r.q.Q.N.W.field_1724.method_23321() + (double)class_23502.method_10165() * 0.5);
                W.method_1562().method_52787((class_2596)new class_2828.class_2829(dev.idhammai.c.r.q.Q.N.W.field_1724.method_23317(), dev.idhammai.c.r.q.Q.N.W.field_1724.method_23318(), dev.idhammai.c.r.q.Q.N.W.field_1724.method_23321(), true));
            } else {
                W.method_1562().method_52787((class_2596)new class_2828.class_2829(dev.idhammai.c.r.q.Q.N.W.field_1724.method_23317(), dev.idhammai.c.r.q.Q.N.W.field_1724.method_23318(), dev.idhammai.c.r.q.Q.N.W.field_1724.method_23321(), true));
                dev.idhammai.c.r.q.Q.N.W.field_1724.method_5814(this.K(dev.idhammai.c.r.q.Q.N.W.field_1724.method_23317(), Math.floor(dev.idhammai.c.r.q.Q.N.W.field_1724.method_23317()) + 0.23, Math.floor(dev.idhammai.c.r.q.Q.N.W.field_1724.method_23317()) + 0.77), dev.idhammai.c.r.q.Q.N.W.field_1724.method_23318(), this.K(dev.idhammai.c.r.q.Q.N.W.field_1724.method_23321(), Math.floor(dev.idhammai.c.r.q.Q.N.W.field_1724.method_23321()) + 0.23, Math.floor(dev.idhammai.c.r.q.Q.N.W.field_1724.method_23321()) + 0.77));
                W.method_1562().method_52787((class_2596)new class_2828.class_2829(this.K(dev.idhammai.c.r.q.Q.N.W.field_1724.method_23317(), Math.floor(dev.idhammai.c.r.q.Q.N.W.field_1724.method_23317()) + 0.23, Math.floor(dev.idhammai.c.r.q.Q.N.W.field_1724.method_23317()) + 0.77), dev.idhammai.c.r.q.Q.N.W.field_1724.method_23318(), this.K(dev.idhammai.c.r.q.Q.N.W.field_1724.method_23321(), Math.floor(dev.idhammai.c.r.q.Q.N.W.field_1724.method_23321()) + 0.23, Math.floor(dev.idhammai.c.r.q.Q.N.W.field_1724.method_23321()) + 0.77), true));
            }
            this.N = true;
        }
    }

    @r
    public void j(QO qO) {
        if (this.a.x(o.NoPacket)) {
            if (!this.c() && this.A.h()) {
                this.p();
            }
        } else if (this.a.x(o.Clip)) {
            if (l.b()) {
                this.U = 0;
                return;
            }
            if ((double)dev.idhammai.c.r.q.Q.N.W.field_1724.field_6012 % this.f.e() == 0.0) {
                dev.idhammai.c.r.q.Q.N.W.field_1724.method_5814(dev.idhammai.c.r.q.Q.N.W.field_1724.method_23317() + class_3532.method_15350((double)(this.K(dev.idhammai.c.r.q.Q.N.W.field_1724.method_23317(), Math.floor(dev.idhammai.c.r.q.Q.N.W.field_1724.method_23317()) + 0.241, Math.floor(dev.idhammai.c.r.q.Q.N.W.field_1724.method_23317()) + 0.759) - dev.idhammai.c.r.q.Q.N.W.field_1724.method_23317()), (double)-0.03, (double)0.03), dev.idhammai.c.r.q.Q.N.W.field_1724.method_23318(), dev.idhammai.c.r.q.Q.N.W.field_1724.method_23321() + class_3532.method_15350((double)(this.K(dev.idhammai.c.r.q.Q.N.W.field_1724.method_23321(), Math.floor(dev.idhammai.c.r.q.Q.N.W.field_1724.method_23321()) + 0.241, Math.floor(dev.idhammai.c.r.q.Q.N.W.field_1724.method_23321()) + 0.759) - dev.idhammai.c.r.q.Q.N.W.field_1724.method_23321()), (double)-0.03, (double)0.03));
                W.method_1562().method_52787((class_2596)new class_2828.class_2829(dev.idhammai.c.r.q.Q.N.W.field_1724.method_23317(), dev.idhammai.c.r.q.Q.N.W.field_1724.method_23318(), dev.idhammai.c.r.q.Q.N.W.field_1724.method_23321(), true));
                W.method_1562().method_52787((class_2596)new class_2828.class_2829(this.K(dev.idhammai.c.r.q.Q.N.W.field_1724.method_23317(), Math.floor(dev.idhammai.c.r.q.Q.N.W.field_1724.method_23317()) + 0.23, Math.floor(dev.idhammai.c.r.q.Q.N.W.field_1724.method_23317()) + 0.77), dev.idhammai.c.r.q.Q.N.W.field_1724.method_23318(), this.K(dev.idhammai.c.r.q.Q.N.W.field_1724.method_23321(), Math.floor(dev.idhammai.c.r.q.Q.N.W.field_1724.method_23321()) + 0.23, Math.floor(dev.idhammai.c.r.q.Q.N.W.field_1724.method_23321()) + 0.77), true));
                ++this.U;
            }
        } else if (this.a.x(o.HitboxDesync)) {
            class_2350 class_23502 = dev.idhammai.c.r.q.Q.N.W.field_1724.method_5735();
            class_238 class_2383 = dev.idhammai.c.r.q.Q.N.W.field_1724.method_5829();
            class_243 class_2432 = class_2383.method_1005();
            class_243 class_2433 = new class_243(class_23502.method_23955());
            class_243 class_2434 = this.O(new k(class_2432).method_46558().method_1031(0.0, -0.5, 0.0).method_1019(class_2433.method_1021(0.20000996883537)), class_23502);
            dev.idhammai.c.r.q.Q.N.W.field_1724.method_5814(class_2434.field_1352 == 0.0 ? dev.idhammai.c.r.q.Q.N.W.field_1724.method_23317() : class_2434.field_1352, dev.idhammai.c.r.q.Q.N.W.field_1724.method_23318(), class_2434.field_1350 == 0.0 ? dev.idhammai.c.r.q.Q.N.W.field_1724.method_23321() : class_2434.field_1350);
            this.p();
        }
    }

    private class_243 O(class_243 class_2432, class_2350 class_23502) {
        return new class_243(class_2432.field_1352 * (double)Math.abs(class_23502.method_10148()), class_2432.field_1351 * (double)Math.abs(class_23502.method_10164()), class_2432.field_1350 * (double)Math.abs(class_23502.method_10165()));
    }

    @r
    public void G(J j2) {
        class_2596<?> class_25962;
        if (dev.idhammai.c.r.q.Q.N.M() || !this.a.x(o.NoPacket)) {
            return;
        }
        if (this.N && (class_25962 = j2.L()) instanceof class_2828) {
            class_2828 class_28282 = (class_2828)class_25962;
            if (!this.c()) {
                if (this.A.h()) {
                    this.p();
                }
                return;
            }
            if (class_28282.method_36172() && this.e.S(this.b.e())) {
                float f2 = class_28282.method_12271(0.0f);
                float f3 = class_28282.method_12270(0.0f);
                this.N = false;
                if (this.B.h()) {
                    W.method_1562().method_52787((class_2596)new class_2828.class_2830(dev.idhammai.c.r.q.Q.N.W.field_1724.method_23317(), dev.idhammai.c.r.q.Q.N.W.field_1724.method_23318() + 1337.0, dev.idhammai.c.r.q.Q.N.W.field_1724.method_23321(), f2, f3, false));
                    W.method_1562().method_52787((class_2596)new class_2828.class_2830(dev.idhammai.c.r.q.Q.N.W.field_1724.method_23317(), dev.idhammai.c.r.q.Q.N.W.field_1724.method_23318() - 1337.0, dev.idhammai.c.r.q.Q.N.W.field_1724.method_23321(), f2, f3, false));
                } else {
                    W.method_1562().method_52787((class_2596)new class_2828.class_2830(dev.idhammai.c.r.q.Q.N.W.field_1724.method_23317(), dev.idhammai.c.r.q.Q.N.W.field_1724.method_23318() + 2.0, dev.idhammai.c.r.q.Q.N.W.field_1724.method_23321(), f2, f3, false));
                    W.method_1562().method_52787((class_2596)new class_2828.class_2830(dev.idhammai.c.r.q.Q.N.W.field_1724.method_23317(), dev.idhammai.c.r.q.Q.N.W.field_1724.method_23318() - 2.0, dev.idhammai.c.r.q.Q.N.W.field_1724.method_23321(), f2, f3, false));
                }
                this.N = true;
                this.e.H();
            }
            j2.L();
        }
    }

    public boolean c() {
        class_2338 class_23382 = dev.idhammai.P.A.L.e.H(true);
        for (int i2 = -1; i2 <= 1; ++i2) {
            for (int i3 = -1; i3 <= 1; ++i3) {
                for (int i4 = -1; i4 <= 1; ++i4) {
                    class_2338 class_23383 = class_23382.method_10069(i2, i3, i4);
                    if (dev.idhammai.c.r.q.Q.N.W.field_1687.method_8320(class_23383).method_26204() != class_2246.field_9987 && (dev.idhammai.c.r.q.Q.N.W.field_1687.method_8320(class_23383).method_26204() != class_2246.field_10540 || !this.P.h()) || !dev.idhammai.c.r.q.Q.N.W.field_1724.method_5829().method_994(new class_238(class_23383))) continue;
                    return true;
                }
            }
        }
        return false;
    }

    private double K(double d2, double d3, double d4) {
        double d5 = d4 - d2;
        double d6 = d2 - d3;
        if (d5 > d6) {
            return d3;
        }
        return d4;
    }

    private boolean lambda$new$5() {
        return this.a.x(o.NoPacket);
    }

    private boolean lambda$new$4() {
        return this.a.x(o.NoPacket) && this.A.f();
    }

    private boolean lambda$new$3() {
        return this.a.x(o.NoPacket);
    }

    private boolean lambda$new$2() {
        return this.a.x(o.NoPacket);
    }

    private boolean lambda$new$1() {
        return this.a.x(o.NoPacket);
    }

    private boolean lambda$new$0() {
        return this.a.x(o.Clip);
    }
}

