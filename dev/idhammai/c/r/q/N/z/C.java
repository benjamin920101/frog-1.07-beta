/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_332
 */
package dev.idhammai.c.r.q.N.z;

import dev.idhammai.Frog;
import dev.idhammai.P.A.S.o;
import dev.idhammai.c.r.O.Y.A;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.O.Y.v;
import dev.idhammai.c.r.T;
import dev.idhammai.c.r.q.N.P;
import dev.idhammai.c.r.q.N.z.H;
import dev.idhammai.p.J.n;
import java.awt.Color;
import java.util.Objects;
import net.minecraft.class_332;

public class C
extends T {
    public static C A;
    public final v E = this.E(new v("Title", "%hackname% %version%").c("\u6807\u9898\u6587\u672c"));
    public final l m = this.p(new l("Scale", 1.0, 0.5, 2.0, 0.1).D("\u7f29\u653e"));
    public final A L = this.y(new A("Background", new Color(0, 0, 0, 50)).P("\u80cc\u666f\u989c\u8272"));
    public final W Q = this.S(new W("Blur", false).k("\u80cc\u666f\u6a21\u7cca"));
    public final l d = this.p(new l("BlurStrength", 8.0, 1.0, 20.0, 0.5, this.Q::f).D("\u6a21\u7cca\u5f3a\u5ea6"));
    public final W Y = this.S(new W("Bar", true).k("\u6e10\u53d8\u4fa7\u6761"));

    public C() {
        super("WaterMark", "\u6c34\u5370", 1, 1);
        A = this;
    }

    @Override
    public void C(class_332 class_3322, float f2) {
        float f3;
        float f4;
        int n2;
        int n3;
        float f5;
        String string;
        String string2;
        String string3;
        boolean bl;
        String string4 = this.E.q();
        String string5 = "%hackname%";
        String string6 = "%version%";
        String string7 = "1.07";
        String string8 = "Frog";
        int n4 = string4.indexOf(string5);
        boolean bl2 = bl = n4 >= 0;
        if (bl) {
            string3 = string4.substring(0, n4).replaceAll(string6, string7);
            string2 = string8;
            string = string4.substring(n4 + string5.length()).replaceAll(string6, string7);
        } else {
            string3 = "";
            string2 = "";
            string = string4.replaceAll(string6, string7).replaceAll(string5, string8);
        }
        String string9 = bl ? string3 + string2 + string : string;
        boolean bl3 = H.v();
        float f6 = f5 = this.m.Z();
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        if (bl3) {
            if (bl) {
                f7 = dev.idhammai.p.J.n.t.b(string3) * f6;
                f8 = dev.idhammai.p.J.n.t.b(string2) * f6;
                f9 = dev.idhammai.p.J.n.t.b(string) * f6;
                n3 = (int)Math.ceil(f7 + f8 + f9);
            } else {
                n3 = (int)Math.ceil(dev.idhammai.p.J.n.t.b(string9) * f6);
            }
            n2 = (int)Math.ceil(dev.idhammai.p.J.n.t.V() * f6);
        } else {
            Objects.requireNonNull(C.W.field_1772);
            f4 = f5 * 2.0f;
            if (bl) {
                f7 = (float)C.W.field_1772.method_1727(string3) * f4;
                f8 = (float)C.W.field_1772.method_1727(string2) * f4;
                f9 = (float)C.W.field_1772.method_1727(string) * f4;
                n3 = (int)Math.ceil(f7 + f8 + f9);
            } else {
                n3 = (int)((float)C.W.field_1772.method_1727(string9) * f4);
            }
            n2 = (int)(9.0f * f4);
        }
        f4 = 5.0f * f5;
        float f10 = 10.0f * f5;
        float f11 = (float)n3 + f4;
        float f12 = (float)n2 + f10;
        float f13 = this.Y.h() ? 2.0f * f5 : 0.0f;
        int n5 = this.B((int)(f11 + f13));
        int n6 = this.I((int)f12);
        float f14 = (float)n5 + f13;
        float f15 = n6;
        if (this.Q.h()) {
            f3 = 4.0f * f5;
            Frog.BLUR.d(this.d.Z(), f14, f15, f11, f12, 4.0f, f3);
        }
        o.j(class_3322.method_51448(), f14, f15, f11, f12, 4.0f * f5, this.L.P());
        if (this.Y.h()) {
            Color color = P.M().b(0.0);
            Color color2 = P.M().b(1000.0);
            o.z(class_3322.method_51448(), f14 - f13, f15, f13, f12, 0.0f, color, color, color2, color2);
        }
        f3 = f14 + (f11 - (float)n3) / 2.0f;
        float f16 = f15 + (f12 - (float)n2) / 2.0f;
        int n7 = -1;
        int n8 = this.g(0.0);
        if (bl3) {
            class_3322.method_51448().method_22903();
            class_3322.method_51448().method_22905(f6, f6, 1.0f);
            float f17 = f3 / f6;
            float f18 = f16 / f6;
            if (bl) {
                dev.idhammai.P.A.S.n.R(class_3322, dev.idhammai.p.J.n.t, string3, f17, f18, n7, H.j());
                dev.idhammai.P.A.S.n.R(class_3322, dev.idhammai.p.J.n.t, string2, (f3 + f7) / f6, f18, n8, H.j());
                dev.idhammai.P.A.S.n.R(class_3322, dev.idhammai.p.J.n.t, string, (f3 + f7 + f8) / f6, f18, n7, H.j());
            } else {
                dev.idhammai.P.A.S.n.R(class_3322, dev.idhammai.p.J.n.t, string9, f17, f18, n7, H.j());
            }
            class_3322.method_51448().method_22909();
        } else {
            class_3322.method_51448().method_22903();
            float f19 = f5 * 2.0f;
            class_3322.method_51448().method_22905(f19, f19, 1.0f);
            float f20 = f3 / f19;
            float f21 = f16 / f19;
            if (bl) {
                dev.idhammai.P.A.S.n.h(class_3322, string3, f20, f21, n7, false, H.j());
                dev.idhammai.P.A.S.n.h(class_3322, string2, (f3 + f7) / f19, f21, n8, false, H.j());
                dev.idhammai.P.A.S.n.h(class_3322, string, (f3 + f7 + f8) / f19, f21, n7, false, H.j());
            } else {
                dev.idhammai.P.A.S.n.h(class_3322, string9, f20, f21, n7, false, H.j());
            }
            class_3322.method_51448().method_22909();
        }
        this.w(n5, n6, Math.max(1, (int)(f11 + f13)), Math.max(1, (int)f12));
    }

    private int g(double d2) {
        P p2 = P.M();
        return p2 == null ? -1 : p2.b(d2).getRGB();
    }
}

