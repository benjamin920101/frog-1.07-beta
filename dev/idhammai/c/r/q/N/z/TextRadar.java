/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.Formatting
 *  net.minecraft.entity.effect.StatusEffects
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.network.AbstractClientPlayerEntity
 */
package dev.idhammai.c.r.q.N.z;

import dev.idhammai.Frog;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.T;
import dev.idhammai.c.r.q.N.P;
import dev.idhammai.c.r.q.N.z.H;
import dev.idhammai.p.J.n;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import net.minecraft.util.Formatting;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.network.AbstractClientPlayerEntity;

public class y
extends T {
    public static y f;
    private final DecimalFormat L = new DecimalFormat("0.0");
    private final W P = this.S(new W("Friend", true).k("\u663e\u793a\u597d\u53cb"));
    private final W K = this.S(new W("Double", false).k("\u53cc\u7a7a\u683c\u95f4\u8ddd"));
    private final W B = this.S(new W("Health", true).k("\u663e\u793a\u8840\u91cf"));
    private final W Y = this.S(new W("Pops", true).k("\u663e\u793a\u7206\u56fe\u817e"));
    public final W Q = this.S(new W("Red", false).k("\u7206\u56fe\u817e\u56fa\u5b9a\u7ea2\u8272"));
    private final W a = this.S(new W("Distance", true).k("\u663e\u793a\u8ddd\u79bb"));
    private final W c = this.S(new W("Effects", true).k("\u663e\u793a\u836f\u6c34\u6548\u679c"));

    public y() {
        super("TextRadar", "\u6587\u5b57\u96f7\u8fbe", 0, 100);
        f = this;
    }

    @Override
    public void C(class_332 class_3322, float f2) {
        int n2;
        int n3;
        int n4;
        String string;
        int n5;
        if (y.W.field_1724 == null || y.W.field_1687 == null) {
            this.l();
            return;
        }
        int n6 = 0;
        if (H.v()) {
            n5 = (int)dev.idhammai.p.J.n.w.V();
        } else {
            Objects.requireNonNull(y.W.field_1772);
            n5 = 9;
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        ArrayList<class_742> arrayList3 = new ArrayList<class_742>(y.W.field_1687.method_18456());
        arrayList3.sort(Comparator.comparingDouble(y::lambda$onRender2D$0));
        double d2 = 20.0;
        for (class_1657 class_16572 : arrayList3) {
            if (class_16572 == y.W.field_1724) continue;
            StringBuilder stringBuilder = new StringBuilder();
            string = this.K.h() ? "  " : " ";
            String string2 = string;
            if (this.B.h()) {
                stringBuilder.append(y.k(class_16572));
                stringBuilder.append(this.L.format(class_16572.method_6032() + class_16572.method_6067()));
                stringBuilder.append(string);
            }
            stringBuilder.append(class_124.field_1070);
            stringBuilder.append(class_16572.method_5477().getString());
            if (this.a.h()) {
                stringBuilder.append(string);
                stringBuilder.append(class_124.field_1068);
                stringBuilder.append(this.L.format(y.W.field_1724.method_5739((class_1297)class_16572)));
                stringBuilder.append("m");
            }
            if (this.c.h()) {
                if (class_16572.method_6059(class_1294.field_5909)) {
                    stringBuilder.append(string);
                    stringBuilder.append(class_124.field_1080);
                    stringBuilder.append("Lv.");
                    stringBuilder.append(class_16572.method_6112(class_1294.field_5909).method_5578() + 1);
                    stringBuilder.append(string);
                    stringBuilder.append(class_16572.method_6112(class_1294.field_5909).method_5584() / 20 + 1);
                    stringBuilder.append("s");
                }
                if (class_16572.method_6059(class_1294.field_5904)) {
                    stringBuilder.append(string);
                    stringBuilder.append(class_124.field_1075);
                    stringBuilder.append("Lv.");
                    stringBuilder.append(class_16572.method_6112(class_1294.field_5904).method_5578() + 1);
                    stringBuilder.append(string);
                    stringBuilder.append(class_16572.method_6112(class_1294.field_5904).method_5584() / 20 + 1);
                    stringBuilder.append("s");
                }
                if (class_16572.method_6059(class_1294.field_5910)) {
                    stringBuilder.append(string);
                    stringBuilder.append(class_124.field_1079);
                    stringBuilder.append("Lv.");
                    stringBuilder.append(class_16572.method_6112(class_1294.field_5910).method_5578() + 1);
                    stringBuilder.append(string);
                    stringBuilder.append(class_16572.method_6112(class_1294.field_5910).method_5584() / 20 + 1);
                    stringBuilder.append("s");
                }
                if (class_16572.method_6059(class_1294.field_5907)) {
                    stringBuilder.append(string);
                    stringBuilder.append(class_124.field_1078);
                    stringBuilder.append("Lv.");
                    stringBuilder.append(class_16572.method_6112(class_1294.field_5907).method_5578() + 1);
                    stringBuilder.append(string);
                    stringBuilder.append(class_16572.method_6112(class_1294.field_5907).method_5584() / 20 + 1);
                    stringBuilder.append("s");
                }
            }
            if (this.Y.h() && (n4 = Frog.POP.x(class_16572)) > 0) {
                stringBuilder.append(string);
                stringBuilder.append(y.X(n4));
                stringBuilder.append("-");
                stringBuilder.append(n4);
            }
            boolean bl = Frog.FRIEND.r(class_16572);
            n3 = bl ? 1 : 0;
            if (bl && !this.P.h()) continue;
            n2 = n3 != 0 ? this.V(d2) : this.a(d2 += 10.0);
            String string3 = stringBuilder.toString();
            int n7 = H.v() ? (int)dev.idhammai.p.J.n.w.b(string3) : y.W.field_1772.method_1727(string3);
            n6 = Math.max(n6, n7);
            arrayList.add(string3);
            arrayList2.add(n2);
        }
        if (arrayList.isEmpty()) {
            this.l();
            return;
        }
        int n8 = Math.max(1, arrayList.size() * n5);
        int n9 = this.B(Math.max(1, n6));
        n3 = n2 = this.I(n8);
        for (n4 = 0; n4 < arrayList.size(); ++n4) {
            string = (String)arrayList.get(n4);
            int n10 = (Integer)arrayList2.get(n4);
            if (H.o()) {
                if (H.v()) {
                    dev.idhammai.p.J.n.w.H(class_3322.method_51448(), string, n9, n3, n10, H.j());
                } else {
                    class_3322.method_51433(y.W.field_1772, string, n9, n3, n10, H.j());
                }
                float f3 = 0.0f;
                int n11 = H.v() ? (int)dev.idhammai.p.J.n.w.b(string) : y.W.field_1772.method_1727(string);
                float f4 = (float)n9 - f3;
                float f5 = (float)n3 - f3;
                float f6 = (float)n11 + f3 * 2.0f;
                float f7 = (float)n5 + f3 * 2.0f;
                Frog.BLUR.b(6.0f, f4, f5, f6, f7, 4.0f);
            }
            if (H.v()) {
                dev.idhammai.p.J.n.w.H(class_3322.method_51448(), string, n9, n3, n10, H.j());
            } else {
                class_3322.method_51433(y.W.field_1772, string, n9, n3, n10, H.j());
            }
            n3 += n5;
        }
        this.w(n9, n2, Math.max(1, n6), Math.max(1, n8));
    }

    public static class_124 k(class_1657 class_16572) {
        double d2 = class_16572.method_6032() + class_16572.method_6067();
        if (d2 > 18.0) {
            return class_124.field_1060;
        }
        if (d2 > 16.0) {
            return class_124.field_1077;
        }
        if (d2 > 12.0) {
            return class_124.field_1054;
        }
        if (d2 > 8.0) {
            return class_124.field_1065;
        }
        if (d2 > 4.0) {
            return class_124.field_1061;
        }
        return class_124.field_1079;
    }

    private int a(double d2) {
        P p2 = dev.idhammai.c.r.q.N.P.M();
        return p2 == null ? -1 : p2.b(d2).getRGB();
    }

    private int V(double d2) {
        P p2 = dev.idhammai.c.r.q.N.P.M();
        return p2 == null ? -1 : p2.q(d2).getRGB();
    }

    public static class_124 X(int n2) {
        if (y.f.Q.h()) {
            return class_124.field_1061;
        }
        if (n2 > 10) {
            return class_124.field_1079;
        }
        if (n2 > 8) {
            return class_124.field_1061;
        }
        if (n2 > 6) {
            return class_124.field_1065;
        }
        if (n2 > 4) {
            return class_124.field_1054;
        }
        if (n2 > 2) {
            return class_124.field_1077;
        }
        return class_124.field_1060;
    }

    private static double lambda$onRender2D$0(class_742 class_7422) {
        return y.W.field_1724.method_5739((class_1297)class_7422);
    }
}

