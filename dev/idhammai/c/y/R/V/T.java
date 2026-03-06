/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_332
 *  net.minecraft.class_3675
 *  net.minecraft.class_7833
 */
package dev.idhammai.c.y.R.V;

import com.mojang.blaze3d.systems.RenderSystem;
import dev.idhammai.Frog;
import dev.idhammai.P.A.A.S;
import dev.idhammai.P.A.A.k;
import dev.idhammai.P.A.S.f;
import dev.idhammai.P.A.S.o;
import dev.idhammai.c.r.O.Y.A;
import dev.idhammai.c.r.O.Y.B;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.q.N.F;
import dev.idhammai.c.r.q.N.P;
import dev.idhammai.c.r.y;
import dev.idhammai.c.y.R.C;
import dev.idhammai.c.y.R.V.E;
import dev.idhammai.c.y.R.V.O;
import dev.idhammai.c.y.R.V.X;
import dev.idhammai.c.y.R.V.e;
import dev.idhammai.c.y.R.V.i;
import dev.idhammai.c.y.R.V.j;
import dev.idhammai.c.y.R.V.p;
import dev.idhammai.c.y.R.V.s;
import dev.idhammai.c.y.R.V.v;
import dev.idhammai.c.y.u.I.t;
import dev.idhammai.p.J.n;
import java.awt.Color;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.function.BooleanSupplier;
import net.minecraft.class_332;
import net.minecraft.class_3675;
import net.minecraft.class_7833;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class T
extends O {
    private final y k;
    private List<C> V = new ArrayList<C>();
    private List<dev.idhammai.c.r.O.v> f = new ArrayList<dev.idhammai.c.r.O.v>();
    public boolean s;
    public double m;
    public final k P = new k();
    private final k N = new k();
    private final k G = new k();
    private final k r = new k();
    private final HashMap<dev.idhammai.c.r.O.v, k> z = new HashMap();
    private final dev.idhammai.c.r.O.v[] y = new dev.idhammai.c.r.O.v[32];
    private final boolean[] I = new boolean[32];
    private final List<Integer> v = new ArrayList<Integer>();
    private final HashMap<Integer, List<Integer>> U = new HashMap();
    private B<?> j;
    private Enum D;
    private Enum X;
    private Enum w;
    private boolean M;
    private long h;
    private long Q = 200L;
    private double o;
    private double O;
    private float B;
    public boolean S;

    private static float j() {
        P p2 = dev.idhammai.c.r.q.N.P.M();
        if (p2 == null) {
            return 1.0f;
        }
        float f2 = (float)p2.pO;
        float f3 = dev.idhammai.c.y.u.I.t.a() != null ? dev.idhammai.c.y.u.I.t.a().x() : 1.0f;
        return f2 * f3;
    }

    private static float w() {
        P p2 = dev.idhammai.c.r.q.N.P.M();
        if (p2 == null) {
            return 0.0f;
        }
        float f2 = (float)p2.pO;
        return (1.0f - f2) * 20.0f;
    }

    private static int o(int n2) {
        float f2 = dev.idhammai.c.y.R.V.T.j();
        if (W == null || W.method_22683() == null) {
            return Math.round((float)n2 * f2);
        }
        float f3 = (float)W.method_22683().method_4486() / 2.0f;
        return Math.round(f3 + ((float)n2 - f3) * f2);
    }

    private static int h(int n2) {
        float f2 = dev.idhammai.c.y.R.V.T.j();
        float f3 = dev.idhammai.c.y.R.V.T.w();
        if (W == null || W.method_22683() == null) {
            return Math.round((float)n2 * f2 + f3);
        }
        float f4 = (float)W.method_22683().method_4502() / 2.0f;
        return Math.round(f4 + ((float)n2 - f4) * f2 + f3);
    }

    public T(y y2) {
        super(y2.o());
        this.k = y2;
        this.G();
        this.j = this.Q();
        if (this.j != null) {
            this.D = this.j.X();
            this.o();
        }
    }

    public void G() {
        ArrayList<C> arrayList = new ArrayList<C>();
        ArrayList<dev.idhammai.c.r.O.v> arrayList2 = new ArrayList<dev.idhammai.c.r.O.v>();
        for (dev.idhammai.c.r.O.v v2 : this.k.F()) {
            if (v2 == this.k.P() || v2.e().equalsIgnoreCase("Drawn")) continue;
            O o2 = null;
            if (v2 instanceof W) {
                o2 = new v((W)v2);
            } else if (v2 instanceof dev.idhammai.c.r.O.Y.T) {
                o2 = new s((dev.idhammai.c.r.O.Y.T)v2);
            } else if (v2 instanceof dev.idhammai.c.r.O.Y.O) {
                o2 = new E((dev.idhammai.c.r.O.Y.O)v2);
            } else if (v2 instanceof dev.idhammai.c.r.O.Y.v) {
                o2 = new i((dev.idhammai.c.r.O.Y.v)v2);
            } else if (v2 instanceof l) {
                o2 = new p((l)v2);
            } else if (v2 instanceof B) {
                o2 = new X((B)v2);
            } else if (v2 instanceof A) {
                o2 = new j((A)v2);
            }
            if (o2 == null) continue;
            arrayList.add(o2);
            arrayList2.add(v2);
        }
        this.V = arrayList;
        this.f = arrayList2;
        this.K();
        this.U();
    }

    public List<C> v() {
        return this.V;
    }

    @Override
    public void E() {
        this.H();
        this.Q();
    }

    @Override
    public void B(class_332 class_3322, int n2, int n3, float f2) {
        float f3;
        float f4;
        float f5;
        int n4;
        int n5;
        int n6;
        int n7;
        Object object;
        boolean bl;
        boolean bl2 = this.l(n2, n3);
        boolean bl3 = this.m();
        double d2 = this.N.g(bl2 ? 1.0 : 0.0, 100L, dev.idhammai.P.A.A.S.CubicInOut);
        double d3 = this.G.g(bl3 ? 1.0 : 0.0, 160L, dev.idhammai.P.A.A.S.CubicInOut);
        double d4 = this.G();
        double d5 = this.o();
        double d6 = this.Q();
        double d7 = d6 <= 0.0 ? (this.q() ? 0.0 : 1.0) : Math.max(0.0, Math.min(1.0, d5 / d6));
        Color color = dev.idhammai.c.r.q.N.P.M().G.P();
        Color color2 = dev.idhammai.c.r.q.N.P.M().pH.P();
        int n8 = (int)((double)color.getAlpha() * d7);
        Color color3 = new Color(color.getRed(), color.getGreen(), color.getBlue(), n8);
        int n9 = (int)((double)dev.idhammai.c.r.q.N.P.M().pa.V() * d7);
        int n10 = (int)((double)dev.idhammai.c.r.q.N.P.M().pq.V() * d7);
        int n11 = Math.max(0, Math.min(255, (int)Math.round((double)n9 + (double)(n10 - n9) * d2)));
        Color color4 = new Color(color2.getRed(), color2.getGreen(), color2.getBlue(), n10);
        Color color5 = dev.idhammai.P.A.S.f.U(color3, color4, d2);
        float f6 = (float)this.a - 0.5f;
        float f7 = 4.0f;
        P p2 = dev.idhammai.c.r.q.N.P.M();
        boolean bl4 = bl = p2.pM.X() == dev.idhammai.c.r.q.N.S.Shader;
        if (bl) {
            if (d3 >= 0.999) {
                Frog.SHADER.u(() -> this.lambda$drawScreen$0(class_3322, f6, n11));
            } else {
                int n12;
                if (bl2) {
                    dev.idhammai.P.A.S.o.y(class_3322.method_51448(), this.p, this.E, this.p + (float)this.u, this.E + f6, color4.getRGB());
                }
                if ((n12 = (int)Math.round((double)n11 * d3)) > 0) {
                    Frog.SHADER.u(() -> this.lambda$drawScreen$1(class_3322, f6, n12));
                }
            }
        } else {
            Color color6 = dev.idhammai.c.r.q.N.P.M().b(d4);
            object = new Color(color6.getRed(), color6.getGreen(), color6.getBlue(), n11);
            if (bl3) {
                Color color7 = dev.idhammai.P.A.S.f.U(bl2 ? color4 : new Color(0, 0, 0, 0), (Color)object, d3);
                dev.idhammai.P.A.S.o.y(class_3322.method_51448(), this.p, this.E, this.p + (float)this.u, this.E + (float)this.a - 0.5f, color7.getRGB());
            } else if (bl2) {
                dev.idhammai.P.A.S.o.y(class_3322.method_51448(), this.p, this.E, this.p + (float)this.u, this.E + (float)this.a - 0.5f, color4.getRGB());
            }
        }
        float f8 = this.M(this.E, (float)this.a - 0.5f);
        if (this.S) {
            this.i("Press Key...", this.p + 2.3f, f8, -1);
        } else {
            object = "";
            boolean bl5 = true;
            n7 = class_3675.method_15987((long)W.method_22683().method_4490(), (int)341);
            n6 = class_3675.method_15987((long)W.method_22683().method_4490(), (int)342);
            boolean bl6 = class_3675.method_15987((long)W.method_22683().method_4490(), (int)340);
            if (bl6 && bl2) {
                object = " \u00a7c[Reset]";
                bl5 = false;
            } else if (n7 != 0 && bl2) {
                object = this.k.z.h() ? " \u00a7a[Drawn]" : " \u00a7c[Hidden]";
                bl5 = false;
            } else if (n6 != 0 && bl2) {
                object = this.k.P().B() ? " \u00a7b[Hold]" : " \u00a7e[Toggle]";
                bl5 = false;
            } else if (dev.idhammai.c.r.q.N.P.M().pY.h() && this.k.P().R() != -1) {
                object = " \u00a77[" + this.k.P().O() + "]";
            }
            String string = this.k.F() + (String)object;
            double d8 = this.p + 2.3f;
            if (dev.idhammai.c.r.q.N.P.M().pn.X() == F.Center) {
                float f9 = this.y(string);
                d8 = this.p + ((float)this.u - f9) / 2.0f;
            }
            int n13 = this.m() ? g : R;
            n5 = (int)((double)dev.idhammai.P.A.S.f.Z(n13) * d7);
            n4 = dev.idhammai.P.A.S.f.k(n13, n5);
            this.i(string, d8, f8, n4);
        }
        if (dev.idhammai.c.r.q.N.P.M().po.i) {
            boolean bl7 = this.s || this.m > 0.0;
            int n14 = dev.idhammai.c.r.q.N.P.M().po.P().getRGB();
            n7 = (int)((double)dev.idhammai.P.A.S.f.Z(n14) * d7);
            n6 = dev.idhammai.P.A.S.f.k(n14, n7);
            switch (e.J[dev.idhammai.c.r.q.N.P.M().ph.X().ordinal()]) {
                case 1: {
                    this.i(this.s ? "-" : "+", this.p + (float)this.u - 8.0f, f8, n6);
                    break;
                }
                case 2: {
                    this.i(this.s ? "v" : ">", this.p + (float)this.u - 8.0f, f8, n6);
                    break;
                }
                case 3: {
                    float f10 = n.g.b("d");
                    float f11 = n.g.y("d");
                    float f12 = this.p + (float)this.u - f7;
                    f5 = this.E + f6 / 2.0f;
                    float f13 = f12 - f10 / 2.0f;
                    float f14 = f5 - f11 / 2.0f;
                    n4 = this.o();
                    float f15 = f4 = n4 <= 0 ? 0.0f : (float)Math.min(1.0, Math.max(0.0, this.m / (double)n4));
                    if (f4 > 0.001f) {
                        f3 = (float)(System.currentTimeMillis() % 2000L) / 2000.0f * 360.0f * f4;
                        class_3322.method_51448().method_22903();
                        class_3322.method_51448().method_46416(f12, f5, 0.0f);
                        class_3322.method_51448().method_22907(class_7833.field_40718.rotationDegrees(f3));
                        n.g.X(class_3322.method_51448(), "d", -f10 / 2.0f, -f11 / 2.0f, n6);
                        class_3322.method_51448().method_22909();
                        break;
                    }
                    n.g.X(class_3322.method_51448(), "d", f13, f14, n6);
                }
            }
        }
        if (this.s || this.m > 0.0) {
            boolean bl8;
            int n15;
            float f16;
            int n16;
            float f17;
            double d9 = this.H();
            double d10 = Math.max(0.0, Math.min(this.m, d9));
            float f18 = f17 = d9 <= 0.0 ? 0.0f : (float)(d10 / d9);
            if (this.s && f17 < 0.9f) {
                for (C c2 : this.V) {
                    if (!(c2 instanceof p)) continue;
                    ((p)c2).R();
                }
            }
            float f19 = 0.0f;
            if (dev.idhammai.c.r.q.N.P.M().s.h() && d10 > 0.01) {
                float f20 = this.E + (float)this.a - 0.5f;
                f5 = (float)((double)(this.E + (float)this.a) + d10 - 0.5);
                float f21 = (float)((double)(this.E + (float)this.a) + d10 - (double)0.7f);
                double d11 = 0.25;
                f4 = this.p + 0.6f;
                f3 = this.p + (float)this.u - 0.6f;
                n16 = Math.min(160, dev.idhammai.c.r.q.N.P.M().C.V());
                if (dev.idhammai.c.r.q.N.P.M().pM.X() == dev.idhammai.c.r.q.N.S.Shader) {
                    var47_65 = 1.0f;
                    Frog.SHADER.u(() -> T.lambda$drawScreen$2(class_3322, f4, f20, var47_65, f5, n16, f3));
                } else {
                    var47_65 = 2.0f;
                    for (float f22 = f20; f22 < f5; f22 += var47_65) {
                        f16 = Math.min(f22 + var47_65, f5);
                        int n17 = dev.idhammai.P.A.S.f.k(dev.idhammai.c.r.q.N.P.M().b((double)f22 * d11).getRGB(), n16);
                        dev.idhammai.P.A.S.o.i(class_3322.method_51448(), f4, f16, f4, f22, n17);
                        dev.idhammai.P.A.S.o.i(class_3322.method_51448(), f3, f16, f3, f22, n17);
                    }
                }
                n15 = dev.idhammai.P.A.S.f.k(dev.idhammai.c.r.q.N.P.M().b((double)f5 * d11).getRGB(), n16);
                dev.idhammai.P.A.S.o.i(class_3322.method_51448(), f4, f5, f3, f21, n15);
            }
            float f23 = this.E + (float)this.a + 2.0f + f19;
            int n18 = (int)this.p - 1;
            int n19 = (int)f23 - 1;
            n5 = (int)(this.p + (float)this.u + 1.0f);
            n4 = (int)((double)f23 + d10) + 1;
            int n20 = dev.idhammai.c.y.R.V.T.o(n18);
            int n21 = dev.idhammai.c.y.R.V.T.h(n19);
            n16 = dev.idhammai.c.y.R.V.T.o(n5);
            n15 = dev.idhammai.c.y.R.V.T.h(n4);
            boolean bl9 = bl8 = !this.M;
            if (bl8) {
                class_3322.method_44379(n20, n21, n16, n15);
            }
            if (bl8 && Frog.SHADER != null && Frog.SHADER.s()) {
                Frog.SHADER.k(n20, n21, n16, n15);
            }
            f16 = f23;
            if (this.M && this.j != null && this.X != null && this.w != null) {
                double d12 = this.w();
                double d13 = this.o;
                double d14 = this.O;
                double d15 = (double)this.a + 2.0;
                this.B = (f16 += (float)((1.0 - d12) * d15)) - f23;
            } else {
                this.B = 0.0f;
            }
            this.I(class_3322, n2, n3, f2, f16);
            this.B = 0.0f;
            if (bl8) {
                class_3322.method_44380();
            }
            if (bl8 && Frog.SHADER != null && Frog.SHADER.s()) {
                Frog.SHADER.E();
            }
        }
    }

    @Override
    public void d(int n2, int n3, int n4) {
        if (n4 == 0 && this.l(n2, n3)) {
            if (class_3675.method_15987((long)W.method_22683().method_4490(), (int)340)) {
                this.y();
                dev.idhammai.c.y.R.V.T.L();
                return;
            }
            if (class_3675.method_15987((long)W.method_22683().method_4490(), (int)341)) {
                this.k.z.x(!this.k.z.h());
                dev.idhammai.c.y.R.V.T.L();
                return;
            }
            if (class_3675.method_15987((long)W.method_22683().method_4490(), (int)342)) {
                this.k.P().d(!this.k.P().B());
                dev.idhammai.c.y.R.V.T.L();
                return;
            }
        }
        if (n4 == 2 && this.l(n2, n3)) {
            this.S = !this.S;
            dev.idhammai.c.y.R.V.T.L();
            return;
        }
        if (this.S) {
            this.k.P().N(-n4 - 2);
            this.S = false;
            dev.idhammai.c.y.R.V.T.L();
            return;
        }
        super.d(n2, n3, n4);
        if (!this.V.isEmpty()) {
            if (n4 == 1 && this.l(n2, n3)) {
                boolean bl = this.s = !this.s;
                if (this.s) {
                    for (C c2 : this.V) {
                        if (!(c2 instanceof p)) continue;
                        ((p)c2).R();
                    }
                }
                dev.idhammai.c.y.R.V.T.L();
            }
            if (this.s) {
                for (C c2 : this.V) {
                    if (c2.q()) continue;
                    c2.d(n2, n3, n4);
                }
            }
        }
    }

    @Override
    public void G(char c2, int n2) {
        super.G(c2, n2);
        if (!this.V.isEmpty() && this.s) {
            for (C c3 : this.V) {
                if (c3.q()) continue;
                c3.G(c2, n2);
            }
        }
    }

    @Override
    public void l(int n2) {
        if (this.S) {
            this.k.P().N(n2);
            if (this.k.P().O().equalsIgnoreCase("DELETE")) {
                this.k.P().N(-1);
            }
            this.S = false;
            return;
        }
        super.l(n2);
        if (!this.V.isEmpty() && this.s) {
            for (C c2 : this.V) {
                if (c2.q()) continue;
                c2.l(n2);
            }
        }
    }

    public int Q() {
        return super.R();
    }

    @Override
    public double o() {
        double d2 = this.q() ? 0.0 : (double)this.Q();
        return this.r.g(d2, 200L, dev.idhammai.P.A.A.S.CubicInOut);
    }

    public double H() {
        if (this.M && this.j != null && this.X != null && this.w != null) {
            double d2 = this.w();
            return 3.0 + this.o * (1.0 - d2) + this.O * d2;
        }
        return 3.0 + this.e(this.v, 0, 0);
    }

    private B<?> Q() {
        for (dev.idhammai.c.r.O.v v2 : this.k.F()) {
            if (!(v2 instanceof B) || !v2.e().equalsIgnoreCase("Page")) continue;
            return (B)v2;
        }
        return null;
    }

    private void H() {
        long l2;
        if (this.j == null) {
            return;
        }
        Object obj = this.j.X();
        if (this.D == null) {
            this.D = obj;
            return;
        }
        if (obj != this.D) {
            this.X = this.D;
            this.w = obj;
            this.o = this.C(this.X);
            this.O = this.C(this.w);
            this.M = true;
            this.h = System.currentTimeMillis();
            this.D = obj;
            return;
        }
        if (this.M && (l2 = System.currentTimeMillis() - this.h) >= this.Q) {
            this.M = false;
            this.X = null;
            this.w = null;
            this.o = 0.0;
            this.O = 0.0;
        }
    }

    private double w() {
        double d2;
        long l2 = System.currentTimeMillis();
        long l3 = l2 - this.h;
        double d3 = d2 = this.Q <= 0L ? 1.0 : (double)l3 / (double)this.Q;
        if (d2 < 0.0) {
            d2 = 0.0;
        } else if (d2 > 1.0) {
            d2 = 1.0;
        }
        return dev.idhammai.P.A.A.S.CubicInOut.T(d2);
    }

    private double C(Enum enum_) {
        if (this.j == null) {
            return this.e(this.v, 0, 0);
        }
        B<?> b2 = this.j;
        Object obj = b2.X();
        b2.h(enum_);
        double d2 = this.e(this.v, 0, 0);
        b2.h(obj);
        return d2;
    }

    private void o() {
        if (this.j == null) {
            return;
        }
        Object obj = this.j.X();
        Enum[] enumArray = (Enum[])((Enum)obj).getDeclaringClass().getEnumConstants();
        if (enumArray == null) {
            return;
        }
        for (Enum enum_ : enumArray) {
            this.C(enum_);
        }
    }

    private void L(class_332 class_3322, int n2, int n3, float f2, float f3, Enum enum_, float f4, float f5) {
        Object t2;
        B<?> b2 = this.j == null ? null : this.j;
        Object t3 = t2 = b2 == null ? null : (Object)b2.X();
        if (b2 != null) {
            b2.h(enum_);
        }
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)f5);
        class_3322.method_51448().method_22903();
        class_3322.method_51448().method_46416(0.0f, f4, 0.0f);
        this.I(class_3322, n2, n3, f2, f3);
        class_3322.method_51448().method_22909();
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        if (b2 != null) {
            b2.h(t2);
        }
    }

    public int o() {
        return (int)Math.round(this.H());
    }

    private void y() {
        dev.idhammai.c.r.T t2 = this.k instanceof dev.idhammai.c.r.T ? (dev.idhammai.c.r.T)this.k : null;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        if (t2 != null) {
            n4 = t2.g();
            n5 = t2.U();
            if (n4 > 0 && n5 > 0) {
                n2 = t2.Z();
                n3 = t2.t();
            }
        }
        for (dev.idhammai.c.r.O.v v2 : this.k.F()) {
            this.q(v2);
        }
        if (t2 != null && n4 > 0 && n5 > 0) {
            t2.L(n2, n3, n4, n5);
        }
    }

    public void s(W w2) {
        for (dev.idhammai.c.r.O.v v2 : this.k.F()) {
            if (v2 == w2 || !this.l(v2, w2)) continue;
            this.q(v2);
        }
    }

    public void t(B<?> b2) {
        Object obj = b2.X();
        Enum[] enumArray = (Enum[])((Enum)obj).getDeclaringClass().getEnumConstants();
        String string = ((Enum)obj).name();
        b2.R(string);
        for (dev.idhammai.c.r.O.v v2 : this.k.F()) {
            if (v2 == b2) continue;
            b2.R(string);
            boolean bl = v2.D();
            if (!bl) continue;
            boolean bl2 = true;
            Object object = enumArray;
            int n2 = ((Enum[])object).length;
            for (int i2 = 0; i2 < n2; ++i2) {
                Enum enum_ = object[i2];
                b2.R(enum_.name());
                if (v2.D()) continue;
                bl2 = false;
                break;
            }
            b2.R(string);
            if (bl2) continue;
            if (v2 instanceof W && ((W)(object = (W)v2)).y()) {
                this.s((W)object);
            }
            this.q(v2);
        }
        b2.R(string);
    }

    private boolean s(dev.idhammai.c.r.O.v v2) {
        if (v2 instanceof W) {
            return ((W)v2).y();
        }
        if (v2 instanceof dev.idhammai.c.r.O.Y.T) {
            return ((dev.idhammai.c.r.O.Y.T)v2).F();
        }
        return false;
    }

    private boolean O(dev.idhammai.c.r.O.v v2) {
        if (v2 instanceof W) {
            return ((W)v2).f();
        }
        if (v2 instanceof dev.idhammai.c.r.O.Y.T) {
            return ((dev.idhammai.c.r.O.Y.T)v2).h();
        }
        return true;
    }

    private void X(dev.idhammai.c.r.O.v v2, boolean bl) {
        if (v2 instanceof W) {
            ((W)v2).r(bl);
            return;
        }
        if (v2 instanceof dev.idhammai.c.r.O.Y.T) {
            ((dev.idhammai.c.r.O.Y.T)v2).q(bl);
        }
    }

    private double l(dev.idhammai.c.r.O.v v2) {
        k k2 = this.z.get(v2);
        if (k2 == null) {
            k2 = new k();
            this.z.put(v2, k2);
        }
        return k2.g(this.O(v2) ? 1.0 : 0.0, 200L, dev.idhammai.P.A.A.S.CubicInOut);
    }

    private void K() {
        HashSet<dev.idhammai.c.r.O.v> hashSet = new HashSet<dev.idhammai.c.r.O.v>(this.f);
        block0: for (int i2 = 0; i2 < this.f.size(); ++i2) {
            BooleanSupplier booleanSupplier;
            dev.idhammai.c.r.O.v v2 = this.f.get(i2);
            if (v2.m() != null || (booleanSupplier = v2.t()) == null) continue;
            dev.idhammai.c.r.O.v v3 = this.o(booleanSupplier);
            if (v3 != null && hashSet.contains(v3) && this.s(v3)) {
                if (!this.I(booleanSupplier, v3)) continue;
                v2.I(v3);
                continue;
            }
            for (int i3 = i2 - 1; i3 >= 0; --i3) {
                dev.idhammai.c.r.O.v v4 = this.f.get(i3);
                if (!hashSet.contains(v4) || !this.s(v4) || !this.I(booleanSupplier, v4)) continue;
                v2.I(v4);
                continue block0;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private boolean I(BooleanSupplier booleanSupplier, dev.idhammai.c.r.O.v v2) {
        boolean bl = this.O(v2);
        boolean bl2 = false;
        try {
            this.X(v2, true);
            boolean bl3 = booleanSupplier.getAsBoolean();
            this.X(v2, false);
            boolean bl4 = booleanSupplier.getAsBoolean();
            bl2 = bl3 && !bl4;
        }
        catch (Throwable throwable) {
            bl2 = false;
        }
        finally {
            this.X(v2, bl);
        }
        return bl2;
    }

    private boolean l(dev.idhammai.c.r.O.v v2, dev.idhammai.c.r.O.v v3) {
        int n2 = 0;
        for (dev.idhammai.c.r.O.v v4 = v2.m(); v4 != null && n2++ < 64; v4 = v4.m()) {
            if (v4 != v3) continue;
            return true;
        }
        return false;
    }

    private dev.idhammai.c.r.O.v o(BooleanSupplier booleanSupplier) {
        try {
            ArrayList<dev.idhammai.c.r.O.v> arrayList = new ArrayList<dev.idhammai.c.r.O.v>();
            for (Class<?> clazz = booleanSupplier.getClass(); clazz != null && clazz != Object.class; clazz = clazz.getSuperclass()) {
                for (Field field : clazz.getDeclaredFields()) {
                    if (!W.class.isAssignableFrom(field.getType()) && !dev.idhammai.c.r.O.Y.T.class.isAssignableFrom(field.getType())) continue;
                    field.setAccessible(true);
                    Object object = field.get(booleanSupplier);
                    if (!(object instanceof dev.idhammai.c.r.O.v)) continue;
                    arrayList.add((dev.idhammai.c.r.O.v)object);
                }
            }
            if (arrayList.size() != 1) {
                return null;
            }
            return (dev.idhammai.c.r.O.v)arrayList.get(0);
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    private void U() {
        int n2;
        this.v.clear();
        this.U.clear();
        HashMap<dev.idhammai.c.r.O.v, Integer> hashMap = new HashMap<dev.idhammai.c.r.O.v, Integer>();
        int n3 = Math.min(this.V.size(), this.f.size());
        for (n2 = 0; n2 < n3; ++n2) {
            hashMap.put(this.f.get(n2), n2);
        }
        for (n2 = 0; n2 < n3; ++n2) {
            Integer n4;
            dev.idhammai.c.r.O.v v2 = this.f.get(n2);
            dev.idhammai.c.r.O.v v3 = v2.m();
            Integer n5 = n4 = v3 == null ? null : (Integer)hashMap.get(v3);
            if (n4 == null) {
                this.v.add(n2);
                continue;
            }
            List<Integer> list = this.U.get(n4);
            if (list == null) {
                list = new ArrayList<Integer>();
                this.U.put(n4, list);
            }
            list.add(n2);
        }
    }

    private void Q() {
        int n2 = Math.min(this.V.size(), this.f.size());
        for (int i2 = 0; i2 < n2; ++i2) {
            this.V.get(i2).q(true);
        }
        for (Integer n3 : this.v) {
            this.C(n3, 0, true);
        }
    }

    private void C(int n2, int n3, boolean bl) {
        if (!bl) {
            return;
        }
        if (n2 < 0 || n2 >= this.V.size() || n2 >= this.f.size()) {
            return;
        }
        dev.idhammai.c.r.O.v v2 = this.f.get(n2);
        C c2 = this.V.get(n2);
        c2.J(this.a);
        boolean bl2 = this.B(v2, n3);
        if (!bl2) {
            return;
        }
        c2.q(false);
        List<Integer> list = this.U.get(n2);
        if (list == null || list.isEmpty()) {
            return;
        }
        if (this.s(v2)) {
            dev.idhammai.c.r.O.v v3 = v2;
            double d2 = this.l(v3);
            if (d2 <= 0.001) {
                return;
            }
            int n4 = n3;
            if (n4 < this.y.length) {
                this.y[n4] = v3;
                ++n4;
            }
            for (Integer n5 : list) {
                this.C(n5, n4, true);
            }
            return;
        }
        for (Integer n6 : list) {
            this.C(n6, n3, true);
        }
    }

    private boolean B(dev.idhammai.c.r.O.v v2, int n2) {
        boolean bl;
        BooleanSupplier booleanSupplier = v2.t();
        if (booleanSupplier == null) {
            return true;
        }
        if (n2 <= 0) {
            try {
                return booleanSupplier.getAsBoolean();
            }
            catch (Throwable throwable) {
                return true;
            }
        }
        this.H(n2);
        try {
            bl = booleanSupplier.getAsBoolean();
        }
        catch (Throwable throwable) {
            bl = true;
        }
        this.c(n2);
        return bl;
    }

    private void I(class_332 class_3322, int n2, int n3, float f2, float f3) {
        float f4 = f3;
        for (Integer n4 : this.v) {
            f4 = this.a(class_3322, n2, n3, f2, n4, f4, 0, 0);
        }
    }

    private float a(class_332 class_3322, int n2, int n3, float f2, int n4, float f3, int n5, int n6) {
        boolean bl;
        boolean bl2;
        if (n4 < 0 || n4 >= this.V.size() || n4 >= this.f.size()) {
            return f3;
        }
        dev.idhammai.c.r.O.v v2 = this.f.get(n4);
        C c2 = this.V.get(n4);
        c2.J(this.a);
        if (!this.B(v2, n6)) {
            return f3;
        }
        float f4 = this.p + 1.0f + (float)n5;
        int n7 = this.u - 9 - n5 * 2;
        float f5 = f3;
        boolean bl3 = bl2 = this.B != 0.0f && this.j != null && v2 == this.j;
        if (bl2) {
            f5 -= this.B;
        }
        c2.S(f4, f5);
        c2.A(n7);
        double d2 = c2.o();
        if (d2 <= 0.01) {
            return f3;
        }
        int n8 = (int)f4 - 1;
        int n9 = (int)f5 - 1;
        int n10 = (int)(f4 + (float)n7 + 8.0f) + 1;
        int n11 = (int)Math.round((double)f5 + d2) + 1;
        int n12 = dev.idhammai.c.y.R.V.T.o(n8);
        int n13 = dev.idhammai.c.y.R.V.T.h(n9);
        int n14 = dev.idhammai.c.y.R.V.T.o(n10);
        int n15 = dev.idhammai.c.y.R.V.T.h(n11);
        boolean bl4 = bl = !this.M;
        if (bl) {
            class_3322.method_44379(n12, n13, n14, n15);
        }
        if (bl && Frog.SHADER != null && Frog.SHADER.s()) {
            Frog.SHADER.k(n12, n13, n14, n15);
        }
        c2.B(class_3322, n2, n3, f2);
        if (bl) {
            class_3322.method_44380();
        }
        if (bl && Frog.SHADER != null && Frog.SHADER.s()) {
            Frog.SHADER.E();
        }
        float f6 = f3 + (float)(d2 + 2.0);
        if (bl2) {
            float f7 = f5 + (float)d2 + 2.0f;
            f3 = Math.max(f6, f7);
        } else {
            f3 = f6;
        }
        List<Integer> list = this.U.get(n4);
        if (list == null || list.isEmpty()) {
            return f3;
        }
        if (this.s(v2)) {
            double d3;
            double d4;
            dev.idhammai.c.r.O.v v3 = v2;
            double d5 = this.l(v3);
            int n16 = n6;
            if (n16 < this.y.length) {
                this.y[n16] = v3;
                ++n16;
            }
            if ((d4 = (d3 = this.e(list, n5 + 1, n16)) * d5) > 0.01) {
                float f8 = this.p + 1.0f + (float)(n5 + 1);
                int n17 = this.u - 9 - (n5 + 1) * 2;
                int n18 = (int)f8 - 1;
                int n19 = (int)f3 - 1;
                int n20 = (int)(f8 + (float)n17 + 8.0f) + 1;
                int n21 = (int)Math.round((double)f3 + d4) + 1;
                int n22 = dev.idhammai.c.y.R.V.T.o(n18);
                int n23 = dev.idhammai.c.y.R.V.T.h(n19);
                int n24 = dev.idhammai.c.y.R.V.T.o(n20);
                int n25 = dev.idhammai.c.y.R.V.T.h(n21);
                class_3322.method_44379(n22, n23, n24, n25);
                if (Frog.SHADER != null && Frog.SHADER.s()) {
                    Frog.SHADER.k(n22, n23, n24, n25);
                }
                float f9 = f3;
                for (Integer n26 : list) {
                    f9 = this.a(class_3322, n2, n3, f2, n26, f9, n5 + 1, n16);
                }
                class_3322.method_44380();
                if (Frog.SHADER != null && Frog.SHADER.s()) {
                    Frog.SHADER.E();
                }
            }
            return f3 += (float)d4;
        }
        for (Integer n27 : list) {
            f3 = this.a(class_3322, n2, n3, f2, n27, f3, n5 + 1, n6);
        }
        return f3;
    }

    private double e(List<Integer> list, int n2, int n3) {
        double d2 = 0.0;
        for (Integer n4 : list) {
            double d3;
            if (n4 == null || n4 < 0 || n4 >= this.V.size() || n4 >= this.f.size()) continue;
            dev.idhammai.c.r.O.v v2 = this.f.get(n4);
            C c2 = this.V.get(n4);
            c2.J(this.a);
            if (!this.B(v2, n3) || (d3 = c2.o()) <= 0.01) continue;
            d2 += d3 + 2.0;
            List<Integer> list2 = this.U.get(n4);
            if (list2 == null || list2.isEmpty()) continue;
            if (this.s(v2)) {
                dev.idhammai.c.r.O.v v3 = v2;
                double d4 = this.l(v3);
                int n5 = n3;
                if (n5 < this.y.length) {
                    this.y[n5] = v3;
                    ++n5;
                }
                d2 += this.e(list2, n2 + 1, n5) * d4;
                continue;
            }
            d2 += this.e(list2, n2 + 1, n3);
        }
        return d2;
    }

    private void H(int n2) {
        for (int i2 = 0; i2 < n2; ++i2) {
            dev.idhammai.c.r.O.v v2 = this.y[i2];
            if (v2 == null) continue;
            this.I[i2] = this.O(v2);
            this.X(v2, true);
        }
    }

    private void c(int n2) {
        for (int i2 = 0; i2 < n2; ++i2) {
            dev.idhammai.c.r.O.v v2 = this.y[i2];
            if (v2 == null) continue;
            this.X(v2, this.I[i2]);
        }
    }

    private void q(dev.idhammai.c.r.O.v v2) {
        if (v2 instanceof W) {
            W w2 = (W)v2;
            w2.x(w2.z());
            if (w2.y()) {
                w2.r(false);
            }
            return;
        }
        if (v2 instanceof dev.idhammai.c.r.O.Y.T) {
            dev.idhammai.c.r.O.Y.T t2 = (dev.idhammai.c.r.O.Y.T)v2;
            if (t2.F()) {
                t2.q(false);
            }
            return;
        }
        if (v2 instanceof l) {
            l l2 = (l)v2;
            l2.d(l2.o());
            return;
        }
        if (v2 instanceof dev.idhammai.c.r.O.Y.v) {
            dev.idhammai.c.r.O.Y.v v3 = (dev.idhammai.c.r.O.Y.v)v2;
            v3.z(v3.w());
            return;
        }
        if (v2 instanceof dev.idhammai.c.r.O.Y.O) {
            dev.idhammai.c.r.O.Y.O o2 = (dev.idhammai.c.r.O.Y.O)v2;
            o2.N(o2.B());
            o2.d(false);
            o2.s(false);
            o2.f = false;
            return;
        }
        if (v2 instanceof B) {
            B b2 = (B)v2;
            Object t3 = b2.H();
            b2.R(((Enum)t3).name());
            return;
        }
        if (v2 instanceof A) {
            A a2 = (A)v2;
            a2.a(a2.g());
            a2.Z = a2.d();
            if (a2.b) {
                a2.i = a2.q();
            }
        }
    }

    @Override
    public int R() {
        if (this.s) {
            int n2 = super.R();
            for (C c2 : this.V) {
                if (c2.q()) continue;
                n2 += c2.R() + 1;
            }
            return n2 + 2;
        }
        return super.R();
    }

    public y Z() {
        return this.k;
    }

    @Override
    public void T() {
        this.k.o();
    }

    @Override
    public boolean m() {
        return this.k.p();
    }

    private static void lambda$drawScreen$2(class_332 class_3322, float f2, float f3, float f4, float f5, int n2, float f6) {
        dev.idhammai.P.A.S.o.K(class_3322.method_51448(), f2, f3, f4, f5 - f3, n2);
        dev.idhammai.P.A.S.o.K(class_3322.method_51448(), f6 - f4, f3, f4, f5 - f3, n2);
    }

    private void lambda$drawScreen$1(class_332 class_3322, float f2, int n2) {
        dev.idhammai.P.A.S.o.K(class_3322.method_51448(), this.p, this.E, this.u, f2, n2);
    }

    private void lambda$drawScreen$0(class_332 class_3322, float f2, int n2) {
        dev.idhammai.P.A.S.o.K(class_3322.method_51448(), this.p, this.E, this.u, f2, n2);
    }
}

