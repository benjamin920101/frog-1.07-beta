/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.ItemStack
 *  net.minecraft.client.gui.DrawContext
 */
package dev.idhammai.c.r.q.N.z;

import dev.idhammai.Frog;
import dev.idhammai.P.A.L.e;
import dev.idhammai.P.A.S.f;
import dev.idhammai.P.A.S.o;
import dev.idhammai.c.r.O.Y.A;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.T;
import dev.idhammai.c.r.q.N.z.H;
import dev.idhammai.p.J.n;
import java.awt.Color;
import java.util.Objects;
import net.minecraft.item.ItemStack;
import net.minecraft.client.gui.DrawContext;

public class t
extends T {
    public static t R;
    private final W k = this.S(new W("Durability", true).k("\u663e\u793a\u8010\u4e45"));
    public final W N = this.S(new W("Blur", false).k("\u80cc\u666f\u6a21\u7cca"));
    public final l a = this.p(new l("BlurStrength", 8.0, 1.0, 20.0, 0.5, this.N::f).D("\u6a21\u7cca\u5f3a\u5ea6"));
    public final A m = this.y(new A("Background", new Color(0, 0, 0, 50)).P("\u80cc\u666f\u989c\u8272"));
    private final Color j = new Color(196, 0, 0);
    private final Color Q = new Color(0, 227, 0);

    public t() {
        super("Armor", "\u62a4\u7532", 0, 70);
        R = this;
    }

    @Override
    public void C(class_332 class_3322, float f2) {
        if (dev.idhammai.c.r.q.N.z.t.W.field_1724 == null) {
            this.l();
            return;
        }
        int n2 = 0;
        for (class_1799 class_17992 : dev.idhammai.c.r.q.N.z.t.W.field_1724.method_31548().field_7548) {
            ++n2;
        }
        int n3 = Math.max(1, 20 * n2);
        int n4 = this.k.h() ? 6 : 0;
        int n5 = 16 + n4;
        int n6 = this.B(n3);
        int n7 = this.I(n5);
        int n8 = n6;
        int n9 = n7 + n4;
        if (this.N.h()) {
            Frog.BLUR.d(this.a.Z(), n6, n7, n3, n5, 4.0f, 4.0f);
        }
        o.j(class_3322.method_51448(), n6, n7, n3, n5, 4.0f, this.m.P());
        n2 = 0;
        for (class_1799 class_17993 : dev.idhammai.c.r.q.N.z.t.W.field_1724.method_31548().field_7548) {
            int n10 = n8 + n2 * 20;
            if (!class_17993.method_7960()) {
                class_3322.method_51448().method_22903();
                int n11 = e.a(class_17993);
                class_3322.method_51427(class_17993, n10, n9);
                class_3322.method_51431(dev.idhammai.c.r.q.N.z.t.W.field_1772, class_17993, n10, n9);
                if (this.k.h()) {
                    if (H.v()) {
                        dev.idhammai.p.J.n.E.H(class_3322.method_51448(), n11 + "%", n10 + 1, (float)n9 - dev.idhammai.p.J.n.E.V() / 2.0f, f.U(this.j, this.Q, (float)n11 / 100.0f).getRGB(), H.j());
                    } else {
                        String string = n11 + "%";
                        float f3 = n10 + 2;
                        float f4 = n9;
                        Objects.requireNonNull(dev.idhammai.c.r.q.N.z.t.W.field_1772);
                        dev.idhammai.P.A.S.n.k(class_3322, string, f3, f4 - 2.25f, f.U(this.j, this.Q, (float)n11 / 100.0f).getRGB(), 0.5f, H.j());
                    }
                }
                class_3322.method_51448().method_22909();
            }
            ++n2;
        }
        this.w(n6, n7, n3, n5);
    }
}

