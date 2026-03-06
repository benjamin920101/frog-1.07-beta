/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  net.minecraft.class_1713
 *  net.minecraft.class_1735
 *  net.minecraft.class_1799
 *  net.minecraft.class_2596
 *  net.minecraft.class_2649
 *  net.minecraft.class_2653
 *  net.minecraft.class_2735
 *  net.minecraft.class_2813
 *  net.minecraft.class_2868
 */
package dev.idhammai.c.r.q.Q;

import dev.idhammai.Frog;
import dev.idhammai.P.A.A.h;
import dev.idhammai.P.A.L.e;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.E;
import dev.idhammai.P.r.c.F;
import dev.idhammai.P.r.c.J;
import dev.idhammai.P.r.c.U;
import dev.idhammai.P.r.c.Z;
import dev.idhammai.P.r.c.i;
import dev.idhammai.P.r.c.o;
import dev.idhammai.asm.accessors.IScreenHandler;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.q.i.R;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.util.List;
import net.minecraft.class_1713;
import net.minecraft.class_1735;
import net.minecraft.class_1799;
import net.minecraft.class_2596;
import net.minecraft.class_2649;
import net.minecraft.class_2653;
import net.minecraft.class_2735;
import net.minecraft.class_2813;
import net.minecraft.class_2868;

public class c
extends y {
    public static c w;
    public final W c = this.S(new W("Decode", true).k("\u89e3\u7801"));
    public final W E = this.S(new W("Lerp", false).k("\u63d2\u503c\u8986\u76d6"));
    public final W j = this.S(new W("S2CSlot", true).k("\u670d\u52a1\u7aef\u69fd\u4f4d"));
    public final W l = this.S(new W("S2CRotate", true).k("\u670d\u52a1\u7aef\u65cb\u8f6c").D());
    public final W C = this.S(new W("ApplyYaw", true, this.l::f).k("\u5e94\u7528\u504f\u822a"));
    public final W U = this.S(new W("S2CCloseScreen", true).k("\u62e6\u622a\u5173\u754c\u9762"));
    public final W s = this.S(new W("S2CInventory", false).k("\u670d\u52a1\u7aef\u80cc\u5305").D());
    public final l p = this.p(new l("Timeout", 500, 0, 1000, this.s::f).D("\u8d85\u65f6"));
    public final W k = this.S(new W("AutoSync", false, this.s::f).k("\u81ea\u52a8\u540c\u6b65").D());
    public final l b = this.p(new l("Delay", 2000, 0, 5000, this::lambda$new$0).D("\u540c\u6b65\u95f4\u9694"));
    private final h t = new h();
    private final h n = new h();
    private final h B = new h();
    class_2813 R;

    public c() {
        super("AntiPacket", dev.idhammai.c.r.w.Exploit);
        this.L("\u53cd\u6570\u636e\u5305");
        w = this;
    }

    @r
    public void K(o o2) {
        this.t.H();
    }

    @Override
    public void F() {
        this.t.H();
    }

    @r
    public void Y(Z z2) {
        if (this.U.h() && e.n()) {
            z2.L();
        }
    }

    @r
    public void k(U u2) {
        if (this.E.h()) {
            u2.R().method_23327(u2.q(), u2.K(), u2.B());
            u2.R().method_36457(u2.P());
            u2.R().method_36456(u2.y());
        }
    }

    @r
    public void E(J j2) {
        class_2813 class_28132;
        class_2596<?> class_25962 = j2.L();
        if (class_25962 instanceof class_2813 && (class_28132 = (class_2813)class_25962) != this.R) {
            this.n.H();
            this.B.H();
        }
    }

    @r
    public void R(F f2) {
        if (f2.a() && this.s.h() && !dev.idhammai.c.r.q.Q.c.W.field_1724.method_7337() && dev.idhammai.c.r.q.i.R.u.W() && this.k.h() && this.n.m(this.p.V()) && this.B.m(this.b.V())) {
            this.R = new class_2813(dev.idhammai.c.r.q.Q.c.W.field_1724.field_7498.field_7763, dev.idhammai.c.r.q.Q.c.W.field_1724.field_7498.method_37421(), -1, 0, class_1713.field_7790, dev.idhammai.c.r.q.Q.c.W.field_1724.field_7498.method_34255().method_7972(), (Int2ObjectMap)new Int2ObjectArrayMap());
            W.method_1562().method_52787((class_2596)this.R);
            this.B.H();
        }
    }

    @r
    public void C(E e2) {
        class_2649 class_26492 = e2.o;
        if (this.s.h() && dev.idhammai.c.r.q.i.R.u.W() && !dev.idhammai.c.r.q.Q.c.W.field_1724.method_7337()) {
            List list = class_26492.method_11441();
            boolean bl = this.n.m(this.p.V());
            for (int i2 = 0; i2 < list.size(); ++i2) {
                class_1799 class_17992 = (class_1799)list.get(i2);
                class_1735 class_17352 = dev.idhammai.c.r.q.Q.c.W.field_1724.field_7498.method_7611(i2);
                class_1799 class_17993 = class_17352.method_7677();
                if (!bl && class_17993.method_7909() != class_17992.method_7909() && (!class_17992.method_7960() || !class_17993.method_7946())) continue;
                class_17352.method_7673(class_17992);
            }
            if (bl) {
                dev.idhammai.c.r.q.Q.c.W.field_1724.field_7498.method_34254(class_26492.method_37437());
                ((IScreenHandler)dev.idhammai.c.r.q.Q.c.W.field_1724.field_7498).setRevision(class_26492.method_37438());
                this.n.H();
            }
            e2.L();
        }
    }

    @r
    public void o(i i2) {
        class_2596<?> class_25962;
        if (!this.t.m(1000L) || dev.idhammai.c.r.q.Q.c.M()) {
            return;
        }
        if (this.j.h() && (class_25962 = i2.L()) instanceof class_2735) {
            class_2735 class_27352 = (class_2735)class_25962;
            i2.G(true);
            Frog.SERVER.E = -1;
            W.method_1562().method_52787((class_2596)new class_2868(class_27352.method_11803()));
            Frog.SERVER.E = -1;
            W.method_1562().method_52787((class_2596)new class_2868(dev.idhammai.c.r.q.Q.c.W.field_1724.method_31548().field_7545));
        } else if (this.s.h() && i2.L() instanceof class_2653 && dev.idhammai.c.r.q.i.R.u.W() && !dev.idhammai.c.r.q.Q.c.W.field_1724.method_7337()) {
            i2.L();
        }
    }

    private boolean lambda$new$0() {
        return this.s.f() && this.k.f();
    }
}

