/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_2246
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_238
 *  net.minecraft.class_4587
 */
package dev.idhammai.c.r.q.n;

import dev.idhammai.Frog;
import dev.idhammai.P.A.A.h;
import dev.idhammai.P.A.S.K;
import dev.idhammai.P.A.S.f;
import dev.idhammai.P.A.l.M;
import dev.idhammai.c.r.O.Y.A;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.q.n.H;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_1297;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_4587;

public class Z
extends y {
    public static Z h;
    public final l D = this.p(new l("StartFade", 5.0, 1.0, 20.0).D("\u5f00\u59cb\u6de1\u51fa"));
    public final l c = this.p(new l("Distance", 6.0, 1.0, 20.0).D("\u8ddd\u79bb"));
    public final l t = this.p(new l("AirHeight", 1.0, -3.0, 3.0, 0.01).D("\u7a7a\u5751\u9ad8\u5ea6"));
    public final W e = this.S(new W("AirYCheck", true).k("\u7a7a\u5751Y\u68c0\u67e5"));
    public final l u = this.p(new l("Height", 1.0, -3.0, 3.0, 0.1).D("\u9ad8\u5ea6"));
    public final l r = this.p(new l("WallHeight", 3.0, -3.0, 3.0, 0.1).D("\u5899\u6d1e\u9ad8\u5ea6"));
    public final W p = this.S(new W("SideCheck", true).k("\u4fa7\u5411\u68c0\u67e5"));
    private final A k = this.y(new A("AirFill", new Color(148, 0, 0, 100)).P("\u7a7a\u5751\u586b\u5145").t(true));
    private final A L = this.y(new A("AirBox", new Color(148, 0, 0, 100)).P("\u7a7a\u5751\u65b9\u6846").t(true));
    private final A P = this.y(new A("AirFade", new Color(148, 0, 0, 0)).P("\u7a7a\u5751\u6e10\u53d8").t(true));
    private final A R = this.y(new A("UnsafeFill", new Color(255, 0, 0, 50)).P("\u4e0d\u5b89\u5168\u586b\u5145").t(true));
    private final A l = this.y(new A("UnsafeBox", new Color(255, 0, 0, 100)).P("\u4e0d\u5b89\u5168\u65b9\u6846").t(true));
    private final A g = this.y(new A("UnsafeFade", new Color(255, 0, 0, 0)).P("\u4e0d\u5b89\u5168\u6e10\u53d8").t(true));
    private final A M = this.y(new A("SafeFill", new Color(8, 255, 79, 50)).P("\u5b89\u5168\u586b\u5145").t(true));
    private final A m = this.y(new A("SafeBox", new Color(8, 255, 79, 100)).P("\u5b89\u5168\u65b9\u6846").t(true));
    private final A U = this.y(new A("SafeFade", new Color(8, 255, 79, 100)).P("\u5b89\u5168\u6e10\u53d8").t(true));
    private final A K = this.y(new A("WallFill", new Color(0, 255, 255, 128)).P("\u5899\u6d1e\u586b\u5145").t(true));
    private final A d = this.y(new A("WallBox", new Color(0, 225, 255, 255)).P("\u5899\u6d1e\u65b9\u6846").t(true));
    private final A b = this.y(new A("WallFade", new Color(0, 255, 255, 64)).P("\u5899\u6d1e\u6e10\u53d8").t(true));
    private final A G = this.y(new A("WallSideFill", new Color(0, 255, 255, 128)).P("\u5899\u4fa7\u586b\u5145").t(true));
    private final A y = this.y(new A("WallSideBox", new Color(0, 225, 255, 255)).P("\u5899\u4fa7\u65b9\u6846").t(true));
    private final A J = this.y(new A("WallSideFade", new Color(0, 255, 255, 64)).P("\u5899\u4fa7\u6e10\u53d8").t(true));
    private final l I = this.p(new l("UpdateDelay", 50, 0, 1000).D("\u66f4\u65b0\u5ef6\u8fdf"));
    private final List<class_2338> X = new ArrayList<class_2338>();
    private final List<class_2338> w = new ArrayList<class_2338>();
    private final List<class_2338> f = new ArrayList<class_2338>();
    private final List<class_2338> n = new ArrayList<class_2338>();
    private final List<class_2338> B = new ArrayList<class_2338>();
    private final h s = new h();
    boolean j = false;
    private List<class_2338> T = new ArrayList<class_2338>();
    private List<class_2338> F = new ArrayList<class_2338>();
    private List<class_2338> N = new ArrayList<class_2338>();
    private List<class_2338> C = new ArrayList<class_2338>();
    private List<class_2338> Z = new ArrayList<class_2338>();

    public Z() {
        super("HoleESP", dev.idhammai.c.r.w.Render);
        this.L("\u5751\u900f\u89c6");
        h = this;
    }

    public void v() {
        if (dev.idhammai.c.r.q.n.Z.M() || this.W()) {
            return;
        }
        if (!this.j && this.s.S(this.I.e())) {
            this.T = new ArrayList<class_2338>(this.X);
            this.F = new ArrayList<class_2338>(this.w);
            this.N = new ArrayList<class_2338>(this.f);
            this.C = new ArrayList<class_2338>(this.n);
            this.Z = new ArrayList<class_2338>(this.B);
            this.s.H();
            this.w.clear();
            this.X.clear();
            this.f.clear();
            this.n.clear();
            this.B.clear();
            for (class_2338 class_23382 : dev.idhammai.P.A.l.M.U(this.c.Z(), dev.idhammai.c.r.q.n.Z.W.field_1724.method_19538())) {
                H h2;
                if (this.b(class_23382) && this.b(class_23382.method_10086(2)) && this.b(class_23382.method_10074())) {
                    class_2350 class_23502 = this.U(class_23382);
                    if (class_23502 != null || !this.p.h()) {
                        this.n.add(class_23382);
                    }
                    if (class_23502 != null) {
                        this.B.add(class_23382.method_10093(class_23502));
                    }
                }
                if ((h2 = this.z(class_23382)) == H.Bedrock) {
                    this.w.add(class_23382);
                    continue;
                }
                if (h2 == H.Normal) {
                    this.X.add(class_23382);
                    continue;
                }
                if (h2 != H.Air) continue;
                this.f.add(class_23382);
            }
        }
    }

    private class_2350 U(class_2338 class_23382) {
        double d2 = Double.MAX_VALUE;
        class_2350 class_23502 = null;
        for (class_2350 class_23503 : class_2350.values()) {
            class_2338 class_23383;
            if (class_23503 == class_2350.field_11036 || class_23503 == class_2350.field_11033 || !dev.idhammai.P.A.l.M.U(new class_238((class_23383 = class_23382.method_10093(class_23503)).method_10074())) || dev.idhammai.P.A.l.M.U(new class_238(class_23383)) || dev.idhammai.P.A.l.M.U(new class_238(class_23383.method_10084()))) continue;
            if (class_23502 == null) {
                class_23502 = class_23503;
                d2 = dev.idhammai.c.r.q.n.Z.W.field_1724.method_33571().method_1022(class_23383.method_46558());
                continue;
            }
            if (!(dev.idhammai.c.r.q.n.Z.W.field_1724.method_33571().method_1022(class_23383.method_46558()) < d2)) continue;
            class_23502 = class_23503;
            d2 = dev.idhammai.c.r.q.n.Z.W.field_1724.method_33571().method_1022(class_23383.method_46558());
        }
        return class_23502;
    }

    private boolean b(class_2338 class_23382) {
        return dev.idhammai.c.r.q.n.Z.W.field_1687.method_8320(class_23382).method_26204() == class_2246.field_9987;
    }

    H z(class_2338 class_23382) {
        if (dev.idhammai.c.r.q.n.Z.W.field_1687.method_22347(class_23382) && (!this.e.h() || class_23382.method_10264() == dev.idhammai.c.r.q.n.Z.W.field_1724.method_31478() - 1 || class_23382.method_10264() == dev.idhammai.c.r.q.n.Z.W.field_1724.method_31478()) && Frog.HOLE.O(class_23382.method_10084())) {
            return H.Air;
        }
        int n2 = 0;
        boolean bl = true;
        for (class_2350 class_23502 : class_2350.values()) {
            if (class_23502 == class_2350.field_11036 || class_23502 == class_2350.field_11033 || !Frog.HOLE.O(class_23382.method_10093(class_23502))) continue;
            if (dev.idhammai.c.r.q.n.Z.W.field_1687.method_8320(class_23382.method_10093(class_23502)).method_26204() != class_2246.field_9987) {
                bl = false;
            }
            ++n2;
        }
        if (dev.idhammai.c.r.q.n.Z.W.field_1687.method_22347(class_23382) && dev.idhammai.c.r.q.n.Z.W.field_1687.method_22347(class_23382.method_10084()) && dev.idhammai.c.r.q.n.Z.W.field_1687.method_22347(class_23382.method_10086(2)) && n2 > 3 && dev.idhammai.P.A.l.M.d((class_1297)dev.idhammai.c.r.q.n.Z.W.field_1724, new class_238(class_23382.method_10074()))) {
            if (bl) {
                return H.Bedrock;
            }
            return H.Normal;
        }
        if (Frog.HOLE.N(class_23382)) {
            return H.Normal;
        }
        return H.None;
    }

    @Override
    public void h(class_4587 class_45872) {
        this.j = true;
        this.Y(class_45872, this.F, this.M, this.U, this.m, this.u.e());
        this.Y(class_45872, this.N, this.k, this.P, this.L, this.t.e());
        this.Y(class_45872, this.T, this.R, this.g, this.l, this.u.e());
        this.Y(class_45872, this.C, this.K, this.b, this.d, this.r.e());
        this.Y(class_45872, this.Z, this.G, this.J, this.y, this.u.e());
        this.j = false;
    }

    private void Y(class_4587 class_45872, List<class_2338> list, A a2, A a3, A a4, double d2) {
        for (class_2338 class_23382 : list) {
            double d3 = dev.idhammai.c.r.q.n.Z.W.field_1724.method_19538().method_1022(class_23382.method_46558());
            double d4 = d3 > this.D.e() ? Math.max(Math.min(1.0, 1.0 - (d3 - this.D.e()) / (this.c.e() - this.D.e())), 0.0) : 1.0;
            class_238 class_2383 = new class_238((double)class_23382.method_10263(), (double)class_23382.method_10264(), (double)class_23382.method_10260(), (double)(class_23382.method_10263() + 1), (double)class_23382.method_10264() + d2, (double)(class_23382.method_10260() + 1));
            if (a2.i) {
                if (a3.i) {
                    dev.idhammai.P.A.S.K.u(class_45872, class_2383, dev.idhammai.P.A.S.f.y(a2.P(), (int)((double)a2.P().getAlpha() * d4)), dev.idhammai.P.A.S.f.y(a3.P(), (int)((double)a3.P().getAlpha() * d4)));
                } else {
                    dev.idhammai.P.A.S.K.F(class_45872, class_2383, dev.idhammai.P.A.S.f.y(a2.P(), (int)((double)a2.P().getAlpha() * d4)));
                }
            }
            if (!a4.i) continue;
            dev.idhammai.P.A.S.K.N(class_45872, class_2383, dev.idhammai.P.A.S.f.y(a4.P(), (int)((double)a4.P().getAlpha() * d4)));
        }
    }
}

