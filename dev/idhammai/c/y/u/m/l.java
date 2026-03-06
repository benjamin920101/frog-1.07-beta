/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.util.StringHelper
 *  net.minecraft.client.util.InputUtil
 *  net.minecraft.client.util.SelectionManager
 */
package dev.idhammai.c.y.u.m;

import dev.idhammai.P.A.A.S;
import dev.idhammai.P.A.A.k;
import dev.idhammai.P.A.J;
import dev.idhammai.P.A.S.f;
import dev.idhammai.P.A.S.o;
import dev.idhammai.c.r.q.N.I;
import dev.idhammai.c.r.q.N.P;
import dev.idhammai.c.y.R.C;
import dev.idhammai.c.y.R.V.i;
import dev.idhammai.c.y.u.I.t;
import dev.idhammai.p.J.n;
import java.awt.Color;
import java.util.function.Consumer;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.util.StringHelper;
import net.minecraft.client.util.InputUtil;
import net.minecraft.client.util.SelectionManager;

public final class l {
    private final t D;
    private boolean h;
    private String x;
    private String t;
    private Runnable Y;
    private Runnable k;
    private String n;
    private String O;
    private final k V = new k();
    private boolean M;
    private String E;
    private String A;
    private String m;
    private boolean i;
    private Consumer<String> z;
    private Runnable j;
    private String L;
    private String S;
    private final k f = new k();

    public l(t t2) {
        this.D = t2;
    }

    public void c(class_332 class_3322, int n2, int n3) {
        float f2 = (float)this.f.g(this.M ? 1.0 : 0.0, 160L, dev.idhammai.P.A.A.S.CubicInOut);
        boolean bl = f2 > 0.01f;
        float f3 = 0.0f;
        boolean bl2 = false;
        if (!bl) {
            f3 = (float)this.V.g(this.h ? 1.0 : 0.0, 160L, dev.idhammai.P.A.A.S.CubicInOut);
            boolean bl3 = bl2 = f3 > 0.01f;
        }
        if (!(bl || this.M || this.E == null && this.A == null && this.z == null)) {
            this.E = null;
            this.A = null;
            this.z = null;
        } else if (!(bl || bl2 || this.h || this.x == null && this.t == null && this.Y == null)) {
            this.x = null;
            this.t = null;
            this.Y = null;
        }
        if (bl) {
            this.p(class_3322, n2, n3, f2);
        } else if (bl2) {
            this.d(class_3322, n2, n3, f3);
        }
    }

    public boolean q(int n2, int n3, int n4) {
        float f2 = (float)this.f.g(this.M ? 1.0 : 0.0, 160L, dev.idhammai.P.A.A.S.CubicInOut);
        if (f2 > 0.01f) {
            return this.Q(n2, n3, n4);
        }
        float f3 = (float)this.V.g(this.h ? 1.0 : 0.0, 160L, dev.idhammai.P.A.A.S.CubicInOut);
        if (f3 > 0.01f) {
            return this.g(n2, n3, n4);
        }
        return false;
    }

    public boolean w(int n2) {
        if (this.M) {
            switch (n2) {
                case 256: {
                    this.Z();
                    return true;
                }
                case 257: 
                case 335: {
                    this.y();
                    return true;
                }
                case 86: {
                    if (J.W == null || J.W.method_22683() == null || !class_3675.method_15987((long)J.W.method_22683().method_4490(), (int)341)) break;
                    String string = class_3728.method_27556((class_310)J.W);
                    this.m = (this.m == null ? "" : this.m) + string;
                    if (this.m.length() > 64) {
                        this.m = this.m.substring(0, 64);
                    }
                    return true;
                }
                case 259: {
                    this.m = dev.idhammai.c.y.R.V.i.a(this.m == null ? "" : this.m);
                    return true;
                }
                case 32: {
                    this.m = (this.m == null ? "" : this.m) + " ";
                    if (this.m.length() > 64) {
                        this.m = this.m.substring(0, 64);
                    }
                    return true;
                }
            }
            return true;
        }
        if (this.h) {
            if (n2 == 256) {
                this.x();
                return true;
            }
            if (n2 == 257 || n2 == 335) {
                this.q();
                return true;
            }
            return true;
        }
        return false;
    }

    public boolean M(char c2) {
        if (this.M) {
            if (this.i && class_3544.method_57175((char)c2)) {
                this.m = (this.m == null ? "" : this.m) + c2;
                if (this.m.length() > 64) {
                    this.m = this.m.substring(0, 64);
                }
            }
            return true;
        }
        return false;
    }

    public void W(String string, String string2, Runnable runnable) {
        this.h = true;
        this.x = string;
        this.t = string2;
        this.Y = runnable;
        this.k = null;
        this.n = null;
        this.O = null;
    }

    public void L(String string, String string2, Runnable runnable, Runnable runnable2, String string3, String string4) {
        this.h = true;
        this.x = string;
        this.t = string2;
        this.Y = runnable;
        this.k = runnable2;
        this.n = string3;
        this.O = string4;
    }

    public void b(String string, String string2, String string3, Consumer<String> consumer, Runnable runnable, String string4, String string5) {
        this.M = true;
        this.E = string;
        this.A = string2;
        this.m = string3 == null ? "" : string3;
        this.i = true;
        this.z = consumer;
        this.j = runnable;
        this.L = string4;
        this.S = string5;
    }

    private void x() {
        this.h = false;
        this.x = null;
        this.t = null;
        this.Y = null;
        this.k = null;
        this.n = null;
        this.O = null;
    }

    private void Z() {
        this.M = false;
        this.E = null;
        this.A = null;
        this.m = null;
        this.i = false;
        this.z = null;
        this.j = null;
        this.L = null;
        this.S = null;
    }

    private void q() {
        if (this.Y != null) {
            try {
                this.Y.run();
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        this.x();
    }

    private void T() {
        if (this.k != null) {
            try {
                this.k.run();
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        this.x();
    }

    private void y() {
        if (this.z != null) {
            try {
                this.z.accept(this.m == null ? "" : this.m);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        this.Z();
    }

    private void n() {
        if (this.j != null) {
            try {
                this.j.run();
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        this.Z();
    }

    private boolean Q(int n2, int n3, int n4) {
        boolean bl;
        boolean bl2;
        int n5;
        int n6;
        if (!this.M) {
            return true;
        }
        if (n4 != 0) {
            this.Z();
            return true;
        }
        P p2 = P.M();
        if (p2 == null) {
            this.Z();
            return true;
        }
        int n7 = C.A != null ? C.A.method_51421() : (n6 = J.W != null && J.W.method_22683() != null ? J.W.method_22683().method_4486() : 0);
        int n8 = C.A != null ? C.A.method_51443() : (n5 = J.W != null && J.W.method_22683() != null ? J.W.method_22683().method_4502() : 0);
        if (n6 <= 0 || n5 <= 0) {
            this.Z();
            return true;
        }
        boolean bl3 = dev.idhammai.p.J.n.s();
        float f2 = bl3 ? (float)((int)dev.idhammai.p.J.n.w.V()) : dev.idhammai.P.A.S.n.Y();
        float f3 = 10.0f;
        float f4 = Math.min(340.0f, (float)n6 - 40.0f);
        float f5 = f2 + 6.0f;
        float f6 = f2 + 6.0f;
        float f7 = f3 + f2 + 6.0f + f2 + 8.0f + f6 + 12.0f + f5 + f3;
        float f8 = ((float)n6 - f4) / 2.0f;
        float f9 = ((float)n5 - f7) / 2.0f;
        float f10 = f9 + f3 + f2 + 6.0f + f2 + 8.0f;
        float f11 = f8 + f3;
        float f12 = f4 - f3 * 2.0f;
        float f13 = f9 + f7 - f3 - f5;
        float f14 = 8.0f;
        float f15 = (f4 - f3 * 2.0f - f14) / 2.0f;
        float f16 = f8 + f3;
        float f17 = f16 + f15 + f14;
        boolean bl4 = bl2 = (float)n2 >= f11 && (float)n2 <= f11 + f12 && (float)n3 >= f10 && (float)n3 <= f10 + f6;
        if (bl2) {
            this.i = true;
            return true;
        }
        boolean bl5 = (float)n2 >= f16 && (float)n2 <= f16 + f15 && (float)n3 >= f13 && (float)n3 <= f13 + f5;
        boolean bl6 = bl = (float)n2 >= f17 && (float)n2 <= f17 + f15 && (float)n3 >= f13 && (float)n3 <= f13 + f5;
        if (bl5) {
            this.y();
            return true;
        }
        if (bl) {
            this.n();
            return true;
        }
        this.Z();
        return true;
    }

    private boolean g(int n2, int n3, int n4) {
        boolean bl;
        float f2;
        float f3;
        int n5;
        int n6;
        if (!this.h) {
            return true;
        }
        if (n4 != 0) {
            this.x();
            return true;
        }
        P p2 = P.M();
        if (p2 == null) {
            this.x();
            return true;
        }
        int n7 = C.A != null ? C.A.method_51421() : (n6 = J.W != null && J.W.method_22683() != null ? J.W.method_22683().method_4486() : 0);
        int n8 = C.A != null ? C.A.method_51443() : (n5 = J.W != null && J.W.method_22683() != null ? J.W.method_22683().method_4502() : 0);
        if (n6 <= 0 || n5 <= 0) {
            this.x();
            return true;
        }
        boolean bl2 = dev.idhammai.p.J.n.s();
        float f4 = bl2 ? (float)((int)dev.idhammai.p.J.n.w.V()) : dev.idhammai.P.A.S.n.Y();
        float f5 = 10.0f;
        float f6 = Math.min(340.0f, (float)n6 - 40.0f);
        float f7 = f4 + 6.0f;
        float f8 = f5 + f4 + 6.0f + f4 + 12.0f + f7 + f5;
        float f9 = ((float)n6 - f6) / 2.0f;
        float f10 = ((float)n5 - f8) / 2.0f;
        float f11 = f10 + f8 - f5 - f7;
        float f12 = 8.0f;
        float f13 = 0.0f;
        if (this.k == null) {
            f3 = 100.0f;
            f2 = f9 + (f6 - f3) / 2.0f;
        } else {
            f3 = (f6 - f5 * 2.0f - f12) / 2.0f;
            f2 = f9 + f5;
            f13 = f2 + f3 + f12;
        }
        boolean bl3 = (float)n2 >= f2 && (float)n2 <= f2 + f3 && (float)n3 >= f11 && (float)n3 <= f11 + f7;
        boolean bl4 = bl = this.k != null && (float)n2 >= f13 && (float)n2 <= f13 + f3 && (float)n3 >= f11 && (float)n3 <= f11 + f7;
        if (bl3) {
            this.q();
            return true;
        }
        if (bl) {
            this.T();
            return true;
        }
        this.x();
        return true;
    }

    private void p(class_332 class_3322, int n2, int n3, float f2) {
        String string;
        Object object;
        P p2 = P.M();
        if (p2 == null) {
            return;
        }
        boolean bl = I.Q != null && I.Q.C.h();
        boolean bl2 = dev.idhammai.p.J.n.s();
        boolean bl3 = dev.idhammai.p.J.n.w();
        int n4 = class_3322.method_51421();
        int n5 = class_3322.method_51443();
        int n6 = Math.max(0, Math.min(255, (int)Math.round(140.0 * (double)f2)));
        o.y(class_3322.method_51448(), 0.0f, 0.0f, n4, n5, new Color(0, 0, 0, n6).getRGB());
        float f3 = bl2 ? (float)((int)dev.idhammai.p.J.n.w.V()) : dev.idhammai.P.A.S.n.Y();
        float f4 = 10.0f;
        float f5 = Math.min(340.0f, (float)n4 - 40.0f);
        float f6 = f3 + 6.0f;
        float f7 = f3 + 6.0f;
        float f8 = f4 + f3 + 6.0f + f3 + 8.0f + f7 + 12.0f + f6 + f4;
        float f9 = ((float)n4 - f5) / 2.0f;
        float f10 = ((float)n5 - f8) / 2.0f;
        Color color = p2.G.P();
        int n7 = Math.max(0, Math.min(255, (int)Math.round(255.0 * (double)f2)));
        o.y(class_3322.method_51448(), f9, f10, f9 + f5, f10 + f8, dev.idhammai.P.A.S.f.y(color, n7).getRGB());
        String string2 = this.E == null || this.E.isEmpty() ? (bl ? "\u8f93\u5165" : "Input") : this.E;
        String string3 = this.A == null ? "" : this.A;
        float f11 = f10 + f4;
        float f12 = f11 + f3 + 6.0f;
        float f13 = f9 + (f5 - (float)this.D.F(string2)) / 2.0f;
        float f14 = f9 + (f5 - (float)this.D.F(string3)) / 2.0f;
        int n8 = Math.max(0, Math.min(255, (int)Math.round(255.0 * (double)f2)));
        int n9 = dev.idhammai.P.A.S.f.y(p2.ps.P(), n8).getRGB();
        int n10 = dev.idhammai.P.A.S.f.y(p2.w.P(), n8).getRGB();
        dev.idhammai.P.A.S.n.h(class_3322, string2, f13, f11, n9, bl2, bl3);
        dev.idhammai.P.A.S.n.h(class_3322, string3, f14, f12, n10, bl2, bl3);
        float f15 = f9 + f4;
        float f16 = f12 + f3 + 8.0f;
        float f17 = f5 - f4 * 2.0f;
        boolean bl4 = (float)n2 >= f15 && (float)n2 <= f15 + f17 && (float)n3 >= f16 && (float)n3 <= f16 + f7;
        int n11 = bl4 || this.i ? p2.pH.P().getRGB() : p2.G.P().getRGB();
        o.y(class_3322.method_51448(), f15, f16, f15 + f17, f16 + f7, n11);
        String string4 = bl ? "\u8bf7\u8f93\u5165\u914d\u7f6e\u540d\u79f0" : "Enter config name";
        Object object2 = object = this.m == null || this.m.isEmpty() ? string4 : this.m;
        if (this.i) {
            object = (String)object + dev.idhammai.c.y.R.V.i.v();
        }
        int n12 = this.m == null || this.m.isEmpty() ? p2.w.P().getRGB() : p2.ps.P().getRGB();
        float f18 = this.D.K(f16, f7);
        dev.idhammai.P.A.S.n.h(class_3322, (String)object, f15 + 6.0f, f18, n12, bl2, bl3);
        float f19 = 8.0f;
        float f20 = (f5 - f4 * 2.0f - f19) / 2.0f;
        float f21 = f10 + f8 - f4 - f6;
        float f22 = f9 + f4;
        float f23 = f22 + f20 + f19;
        boolean bl5 = (float)n2 >= f22 && (float)n2 <= f22 + f20 && (float)n3 >= f21 && (float)n3 <= f21 + f6;
        boolean bl6 = (float)n2 >= f23 && (float)n2 <= f23 + f20 && (float)n3 >= f21 && (float)n3 <= f21 + f6;
        int n13 = bl5 ? p2.pq.V() : p2.pa.V();
        int n14 = Math.max(0, Math.min(255, (int)Math.round((double)n13 * (double)f2)));
        String string5 = this.L == null || this.L.isEmpty() ? (bl ? "\u786e\u8ba4" : "OK") : (string = this.L);
        String string6 = this.S == null || this.S.isEmpty() ? (bl ? "\u53d6\u6d88" : "Cancel") : this.S;
        int n15 = Math.max(0, Math.min(255, (int)Math.round(255.0 * (double)f2)));
        int n16 = dev.idhammai.P.A.S.f.y(p2.G.P(), n14).getRGB();
        int n17 = dev.idhammai.P.A.S.f.y(p2.G.P(), bl6 ? p2.pq.V() : p2.pa.V()).getRGB();
        o.y(class_3322.method_51448(), f22, f21, f22 + f20, f21 + f6, n16);
        o.y(class_3322.method_51448(), f23, f21, f23 + f20, f21 + f6, n17);
        int n18 = dev.idhammai.P.A.S.f.y(p2.ps.P(), n15).getRGB();
        dev.idhammai.P.A.S.n.h(class_3322, string, f22 + (f20 - (float)this.D.F(string)) / 2.0f, this.D.K(f21, f6), n18, bl2, bl3);
        dev.idhammai.P.A.S.n.h(class_3322, string6, f23 + (f20 - (float)this.D.F(string6)) / 2.0f, this.D.K(f21, f6), n18, bl2, bl3);
    }

    private void d(class_332 class_3322, int n2, int n3, float f2) {
        Object object;
        float f3;
        float f4;
        P p2 = P.M();
        if (p2 == null) {
            return;
        }
        boolean bl = I.Q != null && I.Q.C.h();
        boolean bl2 = dev.idhammai.p.J.n.s();
        boolean bl3 = dev.idhammai.p.J.n.w();
        int n4 = class_3322.method_51421();
        int n5 = class_3322.method_51443();
        int n6 = Math.max(0, Math.min(255, (int)Math.round(140.0 * (double)f2)));
        o.y(class_3322.method_51448(), 0.0f, 0.0f, n4, n5, new Color(0, 0, 0, n6).getRGB());
        float f5 = bl2 ? (float)((int)dev.idhammai.p.J.n.w.V()) : dev.idhammai.P.A.S.n.Y();
        float f6 = 10.0f;
        float f7 = Math.min(340.0f, (float)n4 - 40.0f);
        float f8 = f5 + 6.0f;
        float f9 = f6 + f5 + 6.0f + f5 + 12.0f + f8 + f6;
        float f10 = ((float)n4 - f7) / 2.0f;
        float f11 = ((float)n5 - f9) / 2.0f;
        Color color = p2.G.P();
        int n7 = Math.max(0, Math.min(255, (int)Math.round(255.0 * (double)f2)));
        o.y(class_3322.method_51448(), f10, f11, f10 + f7, f11 + f9, dev.idhammai.P.A.S.f.y(color, n7).getRGB());
        String string = this.x == null || this.x.isEmpty() ? (bl ? "\u786e\u8ba4" : "Confirm") : this.x;
        String string2 = this.t == null ? "" : this.t;
        float f12 = f11 + f6;
        float f13 = f12 + f5 + 6.0f;
        float f14 = f10 + (f7 - (float)this.D.F(string)) / 2.0f;
        float f15 = f10 + (f7 - (float)this.D.F(string2)) / 2.0f;
        int n8 = Math.max(0, Math.min(255, (int)Math.round(255.0 * (double)f2)));
        int n9 = dev.idhammai.P.A.S.f.y(p2.ps.P(), n8).getRGB();
        int n10 = dev.idhammai.P.A.S.f.y(p2.w.P(), n8).getRGB();
        dev.idhammai.P.A.S.n.h(class_3322, string, f14, f12, n9, bl2, bl3);
        dev.idhammai.P.A.S.n.h(class_3322, string2, f15, f13, n10, bl2, bl3);
        float f16 = 8.0f;
        float f17 = 0.0f;
        if (this.k == null) {
            f4 = 100.0f;
            f3 = f10 + (f7 - f4) / 2.0f;
        } else {
            f4 = (f7 - f6 * 2.0f - f16) / 2.0f;
            f3 = f10 + f6;
            f17 = f3 + f4 + f16;
        }
        float f18 = f11 + f9 - f6 - f8;
        boolean bl4 = (float)n2 >= f3 && (float)n2 <= f3 + f4 && (float)n3 >= f18 && (float)n3 <= f18 + f8;
        boolean bl5 = this.k != null && (float)n2 >= f17 && (float)n2 <= f17 + f4 && (float)n3 >= f18 && (float)n3 <= f18 + f8;
        int n11 = bl4 ? p2.pq.V() : p2.pa.V();
        int n12 = Math.max(0, Math.min(255, (int)Math.round((double)n11 * (double)f2)));
        if (p2.pM.X() == dev.idhammai.c.r.q.N.S.Shader) {
            o.K(class_3322.method_51448(), f3, f18, f4, f8, n12);
        } else {
            object = p2.q((double)f18 * 0.25);
            o.y(class_3322.method_51448(), f3, f18, f3 + f4, f18 + f8, dev.idhammai.P.A.S.f.y((Color)object, n12).getRGB());
        }
        if (this.k != null) {
            object = bl5 ? p2.pH.P() : p2.G.P();
            o.y(class_3322.method_51448(), f17, f18, f17 + f4, f18 + f8, dev.idhammai.P.A.S.f.y((Color)object, Math.max(0, Math.min(255, (int)Math.round((double)((Color)object).getAlpha() * (double)f2)))).getRGB());
        }
        Object object2 = this.n != null && !this.n.isEmpty() ? this.n : (object = bl ? "\u786e\u8ba4" : "Yes");
        String string3 = this.O != null && !this.O.isEmpty() ? this.O : (bl ? "\u53d6\u6d88" : "No");
        float f19 = f3 + (f4 - (float)this.D.F((String)object)) / 2.0f;
        float f20 = f17 + (f4 - (float)this.D.F(string3)) / 2.0f;
        float f21 = this.D.K(f18, f8);
        dev.idhammai.P.A.S.n.h(class_3322, (String)object, f19, f21, n9, bl2, bl3);
        if (this.k != null) {
            dev.idhammai.P.A.S.n.h(class_3322, string3, f20, f21, n9, bl2, bl3);
        }
    }
}

