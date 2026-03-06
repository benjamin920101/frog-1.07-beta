/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r;

import dev.idhammai.Frog;
import dev.idhammai.P.A.A.S;
import dev.idhammai.P.A.A.k;
import dev.idhammai.c.r.D;
import dev.idhammai.c.r.O.Y.B;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class T
extends y {
    public final dev.idhammai.c.r.O.Y.T u;
    public final B<D> n;
    protected final l t;
    protected final l X;
    private final k J = new k();
    private static boolean V;
    private boolean M;
    private final k p = new k();
    private boolean g;
    private int s;
    private int C;
    private int G;
    private int h;
    private int w;
    private int U;
    private int T;
    private int I;
    private int r;
    private int e;

    public T(String string, String string2, int n2, int n3) {
        this(string, "", string2, n2, n3, D.LeftTop);
    }

    public T(String string, String string2, String string3, int n2, int n3) {
        this(string, string2, string3, n2, n3, D.LeftTop);
    }

    protected T(String string, String string2, String string3, int n2, int n3, D d2) {
        super(string, string2, dev.idhammai.c.r.w.Client);
        this.L(string3);
        this.u = this.m(new dev.idhammai.c.r.O.Y.T("Position").x());
        this.n = this.S(new B<D>("Corner", d2, this.u::h).w(this::Y));
        this.t = this.p(new l("X", n2, 0, 1500, this.u::h).i(this::Y));
        this.X = this.p(new l("Y", n3, 0, 1000, this.u::h).i(this::Y));
    }

    public final float m(boolean bl) {
        double d2 = this.p() && bl ? 1.0 : 0.0;
        double d3 = this.J.g(d2, 200L, dev.idhammai.P.A.A.S.Linear);
        if (d3 < 0.0) {
            d3 = 0.0;
        } else if (d3 > 1.0) {
            d3 = 1.0;
        }
        return (float)d3;
    }

    public final void L(int n2, int n3, int n4, int n5) {
        if (W == null || W.method_22683() == null) {
            return;
        }
        int n6 = Math.max(0, n4);
        int n7 = Math.max(0, n5);
        if (n6 <= 0 || n7 <= 0) {
            return;
        }
        int n8 = W.method_22683().method_4486();
        int n9 = W.method_22683().method_4502();
        int n10 = Math.max(0, n8 - n6);
        int n11 = Math.max(0, n9 - n7);
        int n12 = this.b();
        int n13 = this.k();
        int n14 = this.n.X().i() ? n8 - n6 - n12 : n12;
        int n15 = this.n.X().f() ? n9 - n7 - n13 : n13;
        int n16 = dev.idhammai.c.r.T.u(n14, 0, n10);
        int n17 = dev.idhammai.c.r.T.u(n15, 0, n11);
        if (n2 == n16 && n3 == n17) {
            return;
        }
        this.s = n2;
        this.C = n3;
        this.G = n16;
        this.h = n17;
        this.w = n6;
        this.U = n7;
        this.g = true;
        this.p.a = 0.0;
        this.p.h = 0.0;
    }

    public static void e(boolean bl) {
        V = bl;
    }

    public final void J() {
        if (this.M || V) {
            return;
        }
        this.q();
    }

    private void Y() {
        if (this.M || V) {
            return;
        }
        this.q();
    }

    private void q() {
        if (W == null || W.method_22683() == null) {
            return;
        }
        int n2 = this.g();
        int n3 = this.U();
        if (n2 <= 0 || n3 <= 0) {
            return;
        }
        int n4 = W.method_22683().method_4486();
        int n5 = W.method_22683().method_4502();
        int n6 = Math.max(0, n4 - n2);
        int n7 = Math.max(0, n5 - n3);
        int n8 = 0;
        int n9 = this.b();
        int n10 = this.k();
        int n11 = this.n.X().i() ? n4 - n2 - n9 : n9;
        int n12 = this.n.X().f() ? n5 - n3 - n10 : n10;
        int n13 = dev.idhammai.c.r.T.u(n11, 0, n6);
        int n14 = dev.idhammai.c.r.T.u(n12, 0, n7);
        int n15 = n13;
        int n16 = n14;
        for (int i2 = 0; i2 < 40; ++i2) {
            int n17 = n15 - n8;
            int n18 = n16 - n8;
            int n19 = n15 + n2 + n8;
            int n20 = n16 + n3 + n8;
            T t2 = null;
            int n21 = 0;
            int n22 = 0;
            int n23 = 0;
            int n24 = 0;
            for (y y2 : Frog.MODULE.h()) {
                T t3;
                if (!(y2 instanceof T) || (t3 = (T)y2) == this || !t3.p()) continue;
                int n25 = t3.g();
                int n26 = t3.U();
                if (n25 <= 0 || n26 <= 0) continue;
                int n27 = t3.b();
                int n28 = t3.k();
                int n29 = t3.n.X().i() ? n4 - n25 - n27 : n27;
                int n30 = t3.n.X().f() ? n5 - n26 - n28 : n28;
                int n31 = dev.idhammai.c.r.T.u(n29, 0, Math.max(0, n4 - n25));
                int n32 = dev.idhammai.c.r.T.u(n30, 0, Math.max(0, n5 - n26));
                int n33 = n31 - n8;
                int n34 = n32 - n8;
                int n35 = n31 + n25 + n8;
                int n36 = n32 + n26 + n8;
                if (n17 >= n35 || n19 <= n33 || n18 >= n36 || n20 <= n34) continue;
                t2 = t3;
                n21 = n33;
                n22 = n34;
                n23 = n35;
                n24 = n36;
                break;
            }
            if (t2 == null) break;
            int n37 = Math.min(n19, n23) - Math.max(n17, n21);
            int n38 = Math.min(n20, n24) - Math.max(n18, n22);
            if (n37 <= 0 || n38 <= 0) break;
            if (n37 < n38) {
                var28_30 = n37;
                n15 = n17 < n21 ? (n15 -= var28_30) : (n15 += var28_30);
            } else {
                var28_30 = n38;
                n16 = n18 < n22 ? (n16 -= var28_30) : (n16 += var28_30);
            }
            n15 = dev.idhammai.c.r.T.u(n15, 0, n6);
            n16 = dev.idhammai.c.r.T.u(n16, 0, n7);
        }
        if (n15 == n13 && n16 == n14) {
            return;
        }
        this.s = n13;
        this.C = n14;
        this.G = n15;
        this.h = n16;
        this.w = n2;
        this.U = n3;
        this.g = true;
        this.p.a = 0.0;
        this.p.h = 0.0;
        this.M = true;
        this.P(n15, n16);
        this.M = false;
    }

    public final int b() {
        return this.t.V();
    }

    public final int k() {
        return this.X.V();
    }

    public final void B(int n2) {
        double d2 = dev.idhammai.c.r.T.c(n2, this.t.B(), this.t.X());
        this.t.d(d2);
    }

    public final void E(int n2) {
        double d2 = dev.idhammai.c.r.T.c(n2, this.X.B(), this.X.X());
        this.X.d(d2);
    }

    public final void G(int n2, int n3) {
        this.B(n2);
        this.E(n3);
    }

    public final int B(int n2) {
        if (W.method_22683() == null) {
            return this.b();
        }
        int n3 = W.method_22683().method_4486();
        int n4 = Math.max(0, n2);
        int n5 = this.b();
        int n6 = this.n.X().i() ? n3 - n4 - n5 : n5;
        int n7 = Math.max(0, n3 - n4);
        int n8 = dev.idhammai.c.r.T.u(n6, 0, n7);
        if (this.M) {
            return n8;
        }
        if (this.g) {
            if (n4 != this.w) {
                this.g = false;
                return n8;
            }
            double d2 = this.p.g(1.0, 160L, dev.idhammai.P.A.A.S.CubicInOut);
            if (d2 >= 0.999) {
                this.g = false;
                return n8;
            }
            int n9 = (int)Math.round((double)this.s + ((double)this.G - (double)this.s) * d2);
            return dev.idhammai.c.r.T.u(n9, 0, n7);
        }
        return n8;
    }

    public final int I(int n2) {
        if (W.method_22683() == null) {
            return this.k();
        }
        int n3 = W.method_22683().method_4502();
        int n4 = Math.max(0, n2);
        int n5 = this.k();
        int n6 = this.n.X().f() ? n3 - n4 - n5 : n5;
        int n7 = Math.max(0, n3 - n4);
        int n8 = dev.idhammai.c.r.T.u(n6, 0, n7);
        if (this.M) {
            return n8;
        }
        if (this.g) {
            if (n4 != this.U) {
                this.g = false;
                return n8;
            }
            double d2 = this.p.g(1.0, 160L, dev.idhammai.P.A.A.S.CubicInOut);
            if (d2 >= 0.999) {
                this.g = false;
                return n8;
            }
            int n9 = (int)Math.round((double)this.C + ((double)this.h - (double)this.C) * d2);
            return dev.idhammai.c.r.T.u(n9, 0, n7);
        }
        return n8;
    }

    public final void P(int n2, int n3) {
        if (W.method_22683() == null) {
            this.G(n2, n3);
            return;
        }
        int n4 = W.method_22683().method_4486();
        int n5 = W.method_22683().method_4502();
        int n6 = Math.max(0, this.g());
        int n7 = Math.max(0, this.U());
        D d2 = this.n.X();
        int n8 = d2.i() ? n4 - n6 - n2 : n2;
        int n9 = d2.f() ? n5 - n7 - n3 : n3;
        this.G(n8, n9);
    }

    private static int u(int n2, int n3, int n4) {
        if (n2 < n3) {
            return n3;
        }
        return Math.min(n2, n4);
    }

    protected final void w(int n2, int n3, int n4, int n5) {
        this.T = n2;
        this.I = n3;
        this.r = n4;
        this.e = n5;
    }

    protected final void l() {
        this.r = 0;
        this.e = 0;
    }

    public final int Z() {
        return this.T;
    }

    public final int t() {
        return this.I;
    }

    public final int g() {
        return this.r;
    }

    public final int U() {
        return this.e;
    }

    public final boolean T(int n2, int n3) {
        if (this.r <= 0 || this.e <= 0) {
            return false;
        }
        return n2 >= this.T && n2 <= this.T + this.r && n3 >= this.I && n3 <= this.I + this.e;
    }

    public final boolean T(int n2, int n3, int n4, int n5) {
        if (this.r <= 0 || this.e <= 0) {
            return false;
        }
        int n6 = Math.min(n2, n4);
        int n7 = Math.min(n3, n5);
        int n8 = Math.max(n2, n4);
        int n9 = Math.max(n3, n5);
        int n10 = this.T;
        int n11 = this.I;
        int n12 = this.T + this.r;
        int n13 = this.I + this.e;
        return n6 < n12 && n8 > n10 && n7 < n13 && n9 > n11;
    }

    private static double c(double d2, double d3, double d4) {
        if (d2 < d3) {
            return d3;
        }
        return Math.min(d2, d4);
    }
}

