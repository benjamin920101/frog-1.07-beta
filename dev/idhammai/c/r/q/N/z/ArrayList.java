/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.DrawContext
 */
package dev.idhammai.c.r.q.N.z;

import dev.idhammai.Frog;
import dev.idhammai.P.A.A.S;
import dev.idhammai.P.A.S.f;
import dev.idhammai.P.A.S.o;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.v;
import dev.idhammai.c.r.D;
import dev.idhammai.c.r.O.Y.B;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.T;
import dev.idhammai.c.r.q.N.P;
import dev.idhammai.c.r.q.N.z.F;
import dev.idhammai.c.r.q.N.z.H;
import dev.idhammai.c.r.q.N.z.L;
import dev.idhammai.c.r.y;
import dev.idhammai.p.J.n;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import net.minecraft.client.gui.DrawContext;

public class W
extends T {
    public static W P;
    private final dev.idhammai.c.r.O.Y.W Q = this.S(new dev.idhammai.c.r.O.Y.W("LowerCase", false).k("\u5c0f\u5199\u663e\u793a"));
    private final dev.idhammai.c.r.O.Y.W K = this.S(new dev.idhammai.c.r.O.Y.W("ListSort", true).k("\u6309\u5bbd\u5ea6\u6392\u5e8f"));
    private final dev.idhammai.c.r.O.Y.W N = this.S(new dev.idhammai.c.r.O.Y.W("RightAlign", true).k("\u53f3\u5bf9\u9f50"));
    private final l b = this.p(new l("XOffset", 0.0, 0.0, 50.0, 0.1).D("X\u504f\u79fb"));
    private final l L = this.p(new l("TextOffset", 0.0, -10.0, 10.0, 0.1).D("\u6587\u5b57\u504f\u79fb"));
    private final l k = this.p(new l("Interval", 0.0, 0.0, 15.0, 0.1).D("\u884c\u95f4\u8ddd"));
    private final l a = this.p(new l("EnableLength", 200, 0, 1000).D("\u542f\u7528\u52a8\u753b\u65f6\u957f"));
    private final l m = this.p(new l("DisableLength", 200, 0, 1000).D("\u5173\u95ed\u52a8\u753b\u65f6\u957f"));
    private final l f = this.p(new l("FadeLength", 200, 0, 1000).D("\u6de1\u5165\u6de1\u51fa\u65f6\u957f"));
    private final B<S> A = this.S(new B<S>("Easing", dev.idhammai.P.A.A.S.CircInOut).I("\u7f13\u52a8\u7c7b\u578b"));
    private final dev.idhammai.c.r.O.Y.W d = this.S(new dev.idhammai.c.r.O.Y.W("BackGround", false).k("\u80cc\u666f").D());
    private final l B = this.p(new l("Width", 0.0, 0.0, 15.0, this::lambda$new$0).D("\u80cc\u666f\u5bbd\u5ea6"));
    private final dev.idhammai.c.r.O.Y.W y = this.S(new dev.idhammai.c.r.O.Y.W("Rect", false).k("\u4fa7\u8fb9\u7ebf"));
    private final dev.idhammai.c.r.O.Y.W j = this.S(new dev.idhammai.c.r.O.Y.W("Glow", false).k("\u80cc\u666f\u53d1\u5149"));
    private final ArrayList<F> c = new ArrayList();

    public W() {
        super("ArrayList", "", "\u6a21\u5757\u5217\u8868", 2, 2, D.RightTop);
        P = this;
        Frog.EVENT_BUS.S(new L(this));
    }

    @Override
    public void C(class_332 class_3322, float f2) {
        if (dev.idhammai.c.r.y.M()) {
            this.l();
            return;
        }
        int n2 = this.s();
        double d2 = 0.0;
        for (F f3 : this.c) {
            f3.a(this);
            if (f3.G <= 0.01 && f3.i <= 0.01) continue;
            d2 = Math.max(d2, f3.i);
        }
        if (d2 <= 0.5) {
            this.l();
            return;
        }
        float f4 = this.B.Z();
        float f5 = f4 / 2.0f;
        float f6 = (float)n2 + this.k.Z();
        float f7 = this.k.Z() / 2.0f;
        double d3 = 0.0;
        for (F f8 : this.c) {
            if (f8.G <= 0.04) continue;
            d3 += ((double)n2 + this.k.e()) * f8.G;
        }
        int n3 = Math.max(1, (int)Math.ceil(d2 + (double)f4 + (double)f5));
        int n4 = Math.max(1, (int)Math.ceil(Math.max(1.0, d3 + (double)n2)));
        int n5 = this.B(n3);
        int n6 = this.I(n4);
        int n7 = (int)Math.floor((double)n5 + (double)f5);
        int n8 = n6;
        double d4 = 20.0;
        double d5 = n8;
        for (F f9 : this.c) {
            if (f9.G <= 0.04) continue;
            double d6 = f9.i;
            float f10 = this.N.h() ? (float)((double)n7 + d2 - d6) : (float)n7;
            double d7 = f9.G;
            Color color = this.h(d4 += d7);
            int n9 = color.getAlpha();
            int n10 = dev.idhammai.P.A.S.f.k(color.getRGB(), (int)((double)n9 * d7));
            float f11 = f10 - f5;
            float f12 = (float)d5 - 1.0f - f7;
            float f13 = (float)(d6 + (double)f4);
            if (this.d.h()) {
                o.F(class_3322.method_51448(), f11, f12, f13, f6, dev.idhammai.P.A.S.f.k(color.getRGB(), (int)(100.0 * d7)));
            }
            if (this.j.h()) {
                o.r(class_3322.method_51448(), f11, f12, f13, f6, dev.idhammai.P.A.S.f.k(color.getRGB(), (int)((double)n9 * d7)));
            }
            double d8 = d5 + (double)this.L.Z();
            if (H.o()) {
                int n11 = Math.max(0, Math.min(255, (int)Math.round((double)n9 * d7)));
                int n12 = dev.idhammai.P.A.S.f.k(color.getRGB(), n11);
                boolean bl = H.v();
                dev.idhammai.P.A.S.n.h(class_3322, f9.t, f10, d8, n12, bl, false);
                float f14 = 0.0f;
                float f15 = this.V(f9.t);
                float f16 = n2;
                float f17 = f10 - f14;
                float f18 = (float)d8 - f14;
                float f19 = f15 + f14 * 2.0f;
                float f20 = f16 + f14 * 2.0f;
                Frog.BLUR.b(6.0f, f17, f18, f19, f20, 4.0f);
            }
            dev.idhammai.P.A.S.n.h(class_3322, f9.t, f10, d8, n10, H.v(), H.j());
            if (this.y.h()) {
                o.F(class_3322.method_51448(), f11 + f13, f12, 1.0f, f6, dev.idhammai.P.A.S.f.k(color.getRGB(), (int)((double)n9 * d7)));
            }
            d5 += ((double)n2 + this.k.e()) * d7;
        }
        this.w(n5, n6, n3, n4);
    }

    @r(D=-999)
    public void u(v v2) {
        if (dev.idhammai.c.r.y.M()) {
            return;
        }
        if (v2.C()) {
            for (F f2 : this.c) {
                f2.l(this);
            }
            if (this.K.h()) {
                this.c.sort(Comparator.comparingInt(this::lambda$onUpdate$1));
            }
        }
    }

    private int V(String string) {
        if (string == null) {
            return 0;
        }
        if (H.v()) {
            return (int)dev.idhammai.p.J.n.w.b(string);
        }
        return W.W.field_1772.method_1727(string);
    }

    private int s() {
        if (H.v()) {
            return (int)dev.idhammai.p.J.n.w.V();
        }
        Objects.requireNonNull(W.W.field_1772);
        return 9;
    }

    private Color h(double d2) {
        P p2 = dev.idhammai.c.r.q.N.P.M();
        return p2 == null ? Color.WHITE : p2.b(d2);
    }

    private int lambda$onUpdate$1(F f2) {
        return f2.t == null ? 0 : -this.V(f2.t);
    }

    private boolean lambda$new$0() {
        return this.d.f();
    }
}

