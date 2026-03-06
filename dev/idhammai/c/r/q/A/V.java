/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 */
package dev.idhammai.c.r.q.A;

import dev.idhammai.P.A.A.h;
import dev.idhammai.P.A.L.e;
import dev.idhammai.P.A.L.g;
import dev.idhammai.P.A.Y.N;
import dev.idhammai.P.A.l.M;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.q.N.I;
import dev.idhammai.c.r.q.i.a;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;

public class V
extends y {
    public static V r;
    private final l a = this.p(new l("TargetRange", 5.0, 0.0, 8.0, 0.1).D("\u76ee\u6807\u8303\u56f4"));
    private final l y = this.p(new l("BreakRange", 5.0, 0.0, 8.0, 0.1).D("\u7834\u574f\u8303\u56f4"));
    private final l R = this.p(new l("Delay", 100, 0, 500).D("\u5ef6\u8fdf").P("ms"));
    private final W e = this.S(new W("Rotate", true).k("\u8f6c\u5411"));
    private final W V = this.S(new W("Ground", true).k("\u4ec5\u5730\u9762"));
    private final W b = this.S(new W("InventorySwap", true).k("\u80cc\u5305\u5207\u6362"));
    private final W K = this.S(new W("Top", false).k("\u9876\u90e8"));
    private final W J = this.S(new W("Bevel", true).k("\u659c\u89d2"));
    private final h A = new h();
    private class_1657 G = null;

    public V() {
        super("CevBreaker", w.Combat);
        this.L("\u81ea\u52a8\u70b8\u5934");
        r = this;
    }

    public static boolean q(class_2338 class_23382) {
        return dev.idhammai.c.r.q.A.V.W.field_1687.method_22347(class_23382) && M.R(class_23382, false) && M.R(class_23382.method_10084(), false) && (!I.Q.s.h() || dev.idhammai.c.r.q.A.V.W.field_1687.method_22347(class_23382.method_10084()));
    }

    @r
    public void P(QO qO) {
        if (this.b.h() && !dev.idhammai.P.A.L.e.n()) {
            return;
        }
        if (this.V.h() && !dev.idhammai.c.r.q.A.V.W.field_1724.method_24828()) {
            return;
        }
        dev.idhammai.c.r.q.i.a.D5.V.x(true);
        this.G = N.h(this.a.e());
        if (this.G != null) {
            class_2338 class_23382;
            class_2338 class_23383 = dev.idhammai.P.A.L.e.Y((class_1297)this.G);
            if (dev.idhammai.c.r.q.i.a.q() != null) {
                for (class_2350 class_23502 : class_2350.values()) {
                    if (class_23502 == class_2350.field_11033 || (class_23502 == class_2350.field_11036 ? !this.K.h() : !this.J.h())) continue;
                    class_23382 = class_23383.method_10086(1).method_10093(class_23502);
                    if (class_23382.method_10084().method_46558().method_1022(dev.idhammai.c.r.q.A.V.W.field_1724.method_19538()) > this.y.e() || !dev.idhammai.c.r.q.i.a.q().equals((Object)class_23383.method_10086(1).method_10093(class_23502))) continue;
                    if (dev.idhammai.c.r.q.A.V.q(class_23383.method_10086(2).method_10093(class_23502))) {
                        if (dev.idhammai.c.r.q.A.V.W.field_1687.method_22347(class_23382)) {
                            if (!M.d(class_23382)) continue;
                            if (!this.A.S(this.R.e())) {
                                return;
                            }
                            this.u(class_23382);
                            this.A.H();
                            return;
                        }
                        if (this.z(class_23382) != class_2246.field_10540) continue;
                        dev.idhammai.c.r.q.i.a.D5.d(class_23382);
                        this.A.H();
                        return;
                    }
                    if (!M.p(class_23383.method_10086(2).method_10093(class_23502))) continue;
                    if (dev.idhammai.c.r.q.A.V.W.field_1687.method_22347(class_23382)) {
                        return;
                    }
                    if (this.z(class_23382) != class_2246.field_10540) continue;
                    dev.idhammai.c.r.q.i.a.D5.d(class_23382);
                    this.A.H();
                    return;
                }
            }
            for (class_2350 class_23502 : class_2350.values()) {
                class_2338 class_23384;
                if (class_23502 == class_2350.field_11033 || (class_23502 == class_2350.field_11036 ? !this.K.h() : !this.J.h())) continue;
                class_23382 = class_23383.method_10086(1).method_10093(class_23502);
                if (class_23384.method_10084().method_46558().method_1022(dev.idhammai.c.r.q.A.V.W.field_1724.method_19538()) > this.y.e()) continue;
                if (dev.idhammai.c.r.q.A.V.q(class_23383.method_10086(2).method_10093(class_23502))) {
                    if (dev.idhammai.c.r.q.A.V.W.field_1687.method_22347(class_23382)) {
                        if (!M.d(class_23382)) continue;
                        if (!this.A.S(this.R.e())) {
                            return;
                        }
                        this.u(class_23382);
                        this.A.H();
                        break;
                    }
                    if (this.z(class_23382) != class_2246.field_10540) continue;
                    dev.idhammai.c.r.q.i.a.D5.d(class_23382);
                    this.A.H();
                    break;
                }
                if (!M.p(class_23383.method_10086(2).method_10093(class_23502))) continue;
                if (dev.idhammai.c.r.q.A.V.W.field_1687.method_22347(class_23382)) break;
                if (this.z(class_23382) != class_2246.field_10540) continue;
                dev.idhammai.c.r.q.i.a.D5.d(class_23382);
                this.A.H();
                break;
            }
        }
    }

    private void E(int n2) {
        if (this.b.h()) {
            g.z(n2, dev.idhammai.c.r.q.A.V.W.field_1724.method_31548().field_7545);
        } else {
            g.j(n2);
        }
    }

    private int a() {
        if (this.b.h()) {
            return g.H(class_2246.field_10540);
        }
        return g.L(class_2246.field_10540);
    }

    private void u(class_2338 class_23382) {
        int n2 = this.a();
        if (n2 == -1) {
            return;
        }
        int n3 = dev.idhammai.c.r.q.A.V.W.field_1724.method_31548().field_7545;
        if (M.d(class_23382)) {
            if (M.q()) {
                this.E(n2);
                M.V.add(class_23382);
                M.V(class_23382, this.e.h());
                if (this.b.h()) {
                    this.E(n2);
                    dev.idhammai.P.A.L.e.t();
                } else {
                    this.E(n3);
                }
                return;
            }
            class_2350 class_23502 = M.x(class_23382);
            if (class_23502 == null) {
                return;
            }
            this.E(n2);
            M.V.add(class_23382);
            M.T(class_23382.method_10093(class_23502), class_23502.method_10153(), this.e.h());
            if (this.b.h()) {
                this.E(n2);
                dev.idhammai.P.A.L.e.t();
            } else {
                this.E(n3);
            }
        }
    }

    @Override
    public String I() {
        if (this.G != null) {
            return this.G.method_5477().getString();
        }
        return null;
    }

    private class_2248 z(class_2338 class_23382) {
        return dev.idhammai.c.r.q.A.V.W.field_1687.method_8320(class_23382).method_26204();
    }
}

