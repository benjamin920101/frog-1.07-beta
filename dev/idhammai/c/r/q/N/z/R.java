/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1937
 *  net.minecraft.class_332
 */
package dev.idhammai.c.r.q.N.z;

import dev.idhammai.Frog;
import dev.idhammai.P.A.S.o;
import dev.idhammai.c.r.D;
import dev.idhammai.c.r.O.Y.A;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.T;
import dev.idhammai.c.r.q.N.P;
import dev.idhammai.c.r.q.N.z.H;
import dev.idhammai.p.J.n;
import java.awt.Color;
import java.util.Objects;
import net.minecraft.class_1937;
import net.minecraft.class_332;

public class R
extends T {
    public static R P;
    private final W j = this.S(new W("LowerCase", false).k("\u5c0f\u5199\u663e\u793a"));
    public final A d = this.y(new A("Background", new Color(0, 0, 0, 50)).P("\u80cc\u666f\u989c\u8272"));
    public final W Y = this.S(new W("Blur", false).k("\u80cc\u666f\u6a21\u7cca"));
    public final l L = this.p(new l("BlurStrength", 8.0, 1.0, 20.0, 0.5, this.Y::f).D("\u6a21\u7cca\u5f3a\u5ea6"));

    public R() {
        super("Coords", "", "\u5750\u6807", 2, 2, D.LeftBottom);
        P = this;
    }

    @Override
    public void C(class_332 class_3322, float f2) {
        int n2;
        int n3;
        if (R.W.field_1724 == null || R.W.field_1687 == null) {
            this.l();
            return;
        }
        String string = this.M();
        if (this.j.h()) {
            string = string.toLowerCase();
        }
        int n4 = n3 = H.v() ? (int)Math.ceil(dev.idhammai.p.J.n.w.b(string)) : R.W.field_1772.method_1727(string);
        if (H.v()) {
            n2 = (int)Math.ceil(dev.idhammai.p.J.n.w.V());
        } else {
            Objects.requireNonNull(R.W.field_1772);
            n2 = 9;
        }
        int n5 = 4;
        int n6 = 3;
        int n7 = Math.max(1, n3 + n5 * 2);
        int n8 = Math.max(1, n2 + n6 * 2);
        int n9 = this.B(n7);
        int n10 = this.I(n8);
        int n11 = n9 + n5;
        int n12 = n10 + n6;
        int n13 = this.C(0.0);
        if (this.Y.h()) {
            Frog.BLUR.d(this.L.Z(), n9, n10, n7, n8, 4.0f, 4.0f);
        }
        o.j(class_3322.method_51448(), n9, n10, n7, n8, 4.0f, this.d.P());
        if (H.o()) {
            boolean bl = H.v();
            dev.idhammai.P.A.S.n.h(class_3322, string, n11, n12, n13, bl, false);
            float f3 = 0.0f;
            float f4 = n3;
            float f5 = n2;
            float f6 = (float)n11 - f3;
            float f7 = (float)n12 - f3;
            float f8 = f4 + f3 * 2.0f;
            float f9 = f5 + f3 * 2.0f;
            Frog.BLUR.b(6.0f, f6, f7, f8, f9, 4.0f);
        }
        dev.idhammai.P.A.S.n.h(class_3322, string, n11, n12, n13, H.v(), H.j());
        this.w(n9, n10, n7, n8);
    }

    private int C(double d2) {
        P p2 = dev.idhammai.c.r.q.N.P.M();
        return p2 == null ? -1 : p2.b(d2).getRGB();
    }

    private String M() {
        boolean bl = R.W.field_1687.method_27983().equals(class_1937.field_25180);
        int n2 = R.W.field_1724.method_31477();
        int n3 = R.W.field_1724.method_31478();
        int n4 = R.W.field_1724.method_31479();
        float f2 = !bl ? 0.125f : 8.0f;
        int n5 = (int)(R.W.field_1724.method_23317() * (double)f2);
        int n6 = (int)(R.W.field_1724.method_23321() * (double)f2);
        return "XYZ \u00a7f" + (bl ? n2 + ", " + n3 + ", " + n4 + " \u00a77[\u00a7f" + n5 + ", " + n6 + "\u00a77]\u00a7f" : n2 + ", " + n3 + ", " + n4 + "\u00a77 [\u00a7f" + n5 + ", " + n6 + "\u00a77]");
    }
}

