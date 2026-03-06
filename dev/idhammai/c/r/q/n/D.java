/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_1542
 *  net.minecraft.class_1657
 *  net.minecraft.class_1684
 *  net.minecraft.class_1799
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_2586
 *  net.minecraft.class_2595
 *  net.minecraft.class_2611
 *  net.minecraft.class_2627
 *  net.minecraft.class_2640
 *  net.minecraft.class_332
 *  net.minecraft.class_4587
 *  net.minecraft.class_742
 */
package dev.idhammai.c.r.q.n;

import dev.idhammai.Frog;
import dev.idhammai.P.A.S.K;
import dev.idhammai.P.A.S.n;
import dev.idhammai.P.A.S.o;
import dev.idhammai.P.A.l.M;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.Q3;
import dev.idhammai.asm.accessors.IEntity;
import dev.idhammai.c.r.O.Y.A;
import dev.idhammai.c.r.O.Y.B;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.q.n.p;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1542;
import net.minecraft.class_1657;
import net.minecraft.class_1684;
import net.minecraft.class_1799;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2586;
import net.minecraft.class_2595;
import net.minecraft.class_2611;
import net.minecraft.class_2627;
import net.minecraft.class_2640;
import net.minecraft.class_332;
import net.minecraft.class_4587;
import net.minecraft.class_742;

public class D
extends y {
    public static D R;
    public final B<p> M = this.S(new B<p>("Mode", p.ThreeD).I("\u6a21\u5f0f"));
    private final W B = this.S(new W("2DOutline", true, this::lambda$new$0).k("2D\u63cf\u8fb9"));
    private final W T = this.S(new W("2DHealth", true, this::lambda$new$1).k("2D\u8840\u91cf"));
    private final A y = this.y(new A("HighHealth", new Color(0, 255, 0, 255), this::lambda$new$2).P("\u9ad8\u8840\u91cf\u989c\u8272"));
    private final A d = this.y(new A("MidHealth", new Color(255, 255, 0, 255), this::lambda$new$3).P("\u4e2d\u8840\u91cf\u989c\u8272"));
    private final A g = this.y(new A("LowHealth", new Color(255, 0, 0, 255), this::lambda$new$4).P("\u4f4e\u8840\u91cf\u989c\u8272"));
    private final W F = this.S(new W("2DArmorDura", true, this::lambda$new$5).k("2D\u62a4\u7532\u8010\u4e45"));
    private final A L = this.y(new A("ArmorDuraColor", new Color(0x2FFF00), this::lambda$new$6).P("\u62a4\u7532\u8010\u4e45\u989c\u8272"));
    private final l m = this.p(new l("DuraScale", 1.0, 0.0, 2.0, 0.1, this::lambda$new$7).D("\u8010\u4e45\u7f29\u653e"));
    public final W k = this.S(new W("Target", true).k("\u76ee\u6807").D());
    public final W N = this.S(new W("Self", false, this.k::f).k("\u81ea\u8eab"));
    private final A C = this.y(new A("EndPortalFill", new Color(255, 243, 129, 100), this::lambda$new$8).P("\u672b\u5730\u4f20\u9001\u95e8\u586b\u5145").t(false));
    private final A P = this.y(new A("EndPortalOutline", new Color(255, 243, 129, 100), this::lambda$new$9).P("\u672b\u5730\u4f20\u9001\u95e8\u63cf\u8fb9").t(false));
    private final A b = this.y(new A("ItemFill", new Color(255, 255, 255, 100), this.k::f).P("\u6389\u843d\u7269\u586b\u5145").t(true));
    private final A G = this.y(new A("ItemOutline", new Color(255, 255, 255, 100), this.k::f).P("\u6389\u843d\u7269\u63cf\u8fb9").t(true));
    private final A c = this.y(new A("PlayerFill", new Color(255, 255, 255, 100), this.k::f).P("\u73a9\u5bb6\u586b\u5145").t(true));
    private final A I = this.y(new A("PlayerOutline", new Color(255, 255, 255, 100), this.k::f).P("\u73a9\u5bb6\u63cf\u8fb9").t(true));
    private final A J = this.y(new A("ChestFill", new Color(255, 198, 123, 100), this::lambda$new$10).P("\u7bb1\u5b50\u586b\u5145").t(false));
    private final A u = this.y(new A("ChestOutline", new Color(255, 198, 123, 100), this::lambda$new$11).P("\u7bb1\u5b50\u63cf\u8fb9").t(false));
    private final A U = this.y(new A("EnderChestFill", new Color(255, 100, 255, 100), this::lambda$new$12).P("\u672b\u5f71\u7bb1\u586b\u5145").t(false));
    private final A Y = this.y(new A("EnderChestOutline", new Color(255, 100, 255, 100), this::lambda$new$13).P("\u672b\u5f71\u7bb1\u63cf\u8fb9").t(false));
    private final A a = this.y(new A("ShulkerBoxFill", new Color(15, 255, 255, 100), this::lambda$new$14).P("\u6f5c\u5f71\u76d2\u586b\u5145").t(false));
    private final A D = this.y(new A("ShulkerBoxOutline", new Color(15, 255, 255, 100), this::lambda$new$15).P("\u6f5c\u5f71\u76d2\u63cf\u8fb9").t(false));
    public final W r = this.S(new W("ItemName", false).k("\u6389\u843d\u7269\u540d\u79f0").D());
    public final W A = this.S(new W("CustomName", false, this.r::f).k("\u81ea\u5b9a\u4e49\u540d\u79f0"));
    public final W w = this.S(new W("Count", true, this.r::f).k("\u6570\u91cf"));
    private final A H = this.y(new A("Text", new Color(255, 255, 255, 255), this.r::f).P("\u6587\u672c\u989c\u8272"));
    public final W Q = this.S(new W("PearlOwner", true).k("\u73cd\u73e0\u4e3b\u4eba"));

    public D() {
        super("ESP", dev.idhammai.c.r.w.Render);
        this.L("\u900f\u89c6");
        this.M.X(p.ThreeD, "3D");
        this.M.X(p.TwoD, "2D");
        R = this;
    }

    @Override
    public void h(class_4587 class_45872) {
        Object object;
        if (this.M.X() == p.TwoD) {
            return;
        }
        if (this.r.h()) {
            for (class_1297 object22 : Frog.THREAD.z()) {
                if (!(object22 instanceof class_1542)) continue;
                object = (class_1542)object22;
                int n2 = object.method_6983().method_7947();
                String string = this.w.h() && n2 > 1 ? " x" + n2 : "";
                String string2 = (this.A.h() ? object.method_6983().method_7964() : object.method_6983().method_7909().method_7848()).getString();
                K.x(string2 + string, ((IEntity)object).getDimensions().method_30757(new class_243(dev.idhammai.P.A.A.A.Z(object.field_6038, object.method_23317(), W.method_60646().method_60637(true)), dev.idhammai.P.A.A.A.Z(object.field_5971, object.method_23318(), W.method_60646().method_60637(true)), dev.idhammai.P.A.A.A.Z(object.field_5989, object.method_23321(), W.method_60646().method_60637(true)))).method_1009(0.0, 0.1, 0.0).method_1005().method_1031(0.0, 0.5, 0.0), this.H.P());
            }
        }
        if (this.k.h()) {
            if (this.b.i || this.c.i) {
                for (class_1297 class_12972 : Frog.THREAD.z()) {
                    if (class_12972 instanceof class_1542 && (this.b.i || this.G.i)) {
                        object = this.b.P();
                        K.W(class_45872, ((IEntity)class_12972).getDimensions().method_30757(new class_243(dev.idhammai.P.A.A.A.Z(class_12972.field_6038, class_12972.method_23317(), W.method_60646().method_60637(true)), dev.idhammai.P.A.A.A.Z(class_12972.field_5971, class_12972.method_23318(), W.method_60646().method_60637(true)), dev.idhammai.P.A.A.A.Z(class_12972.field_5989, class_12972.method_23321(), W.method_60646().method_60637(true)))), (Color)object, this.G.P(), this.G.i, this.b.i);
                        continue;
                    }
                    if (class_12972 == dev.idhammai.c.r.q.n.D.W.field_1724 && (!this.N.h() || dev.idhammai.c.r.q.n.D.W.field_1690.method_31044().method_31034()) || !(class_12972 instanceof class_1657) || !this.c.i && !this.I.i) continue;
                    object = this.c.P();
                    K.W(class_45872, ((IEntity)class_12972).getDimensions().method_30757(new class_243(dev.idhammai.P.A.A.A.Z(class_12972.field_6038, class_12972.method_23317(), W.method_60646().method_60637(true)), dev.idhammai.P.A.A.A.Z(class_12972.field_5971, class_12972.method_23318(), W.method_60646().method_60637(true)), dev.idhammai.P.A.A.A.Z(class_12972.field_5989, class_12972.method_23321(), W.method_60646().method_60637(true)))).method_1009(0.0, 0.1, 0.0), (Color)object, this.I.P(), this.I.i, this.c.i);
                }
            }
            ArrayList<class_2586> arrayList = dev.idhammai.P.A.l.M.p();
            Iterator iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                class_238 class_2383;
                object = (class_2586)iterator.next();
                if (object instanceof class_2595 && (this.J.i || this.u.i)) {
                    class_2383 = new class_238(object.method_11016());
                    K.W(class_45872, class_2383, this.J.P(), this.u.P(), this.u.i, this.J.i);
                    continue;
                }
                if (object instanceof class_2611 && (this.U.i || this.Y.i)) {
                    class_2383 = new class_238(object.method_11016());
                    K.W(class_45872, class_2383, this.U.P(), this.Y.P(), this.Y.i, this.U.i);
                    continue;
                }
                if (object instanceof class_2627 && (this.a.i || this.D.i)) {
                    class_2383 = new class_238(object.method_11016());
                    K.W(class_45872, class_2383, this.a.P(), this.D.P(), this.D.i, this.a.i);
                    continue;
                }
                if (!(object instanceof class_2640) || !this.C.i && !this.P.i) continue;
                class_2383 = new class_238(object.method_11016());
                K.W(class_45872, class_2383, this.C.P(), this.P.P(), this.P.i, this.C.i);
            }
        }
    }

    @Override
    public void C(class_332 class_3322, float f2) {
        if (this.M.X() != p.TwoD) {
            return;
        }
        if (dev.idhammai.c.r.q.n.D.M()) {
            return;
        }
        if (this.k.h()) {
            for (class_1297 class_12972 : Frog.THREAD.z()) {
                boolean bl;
                boolean bl2;
                if (class_12972 instanceof class_1542) {
                    bl2 = this.G.i;
                    bl = this.b.i;
                    if (!bl2 && !bl) continue;
                    this.H(class_3322.method_51448(), class_12972, this.G.P(), this.b.P(), bl2, bl, f2, false);
                    continue;
                }
                if (class_12972 == dev.idhammai.c.r.q.n.D.W.field_1724 && (!this.N.h() || dev.idhammai.c.r.q.n.D.W.field_1690.method_31044().method_31034()) || !(class_12972 instanceof class_1657)) continue;
                bl2 = this.I.i;
                bl = this.c.i;
                if (!bl2 && !bl) continue;
                this.H(class_3322.method_51448(), class_12972, this.I.P(), this.c.P(), bl2, bl, f2, true);
            }
        }
        if (this.r.h()) {
            for (class_1297 class_12972 : Frog.THREAD.z()) {
                if (!(class_12972 instanceof class_1542)) continue;
                this.d(class_3322, (class_1542)class_12972, f2);
            }
        }
    }

    private void H(class_4587 class_45872, class_1297 class_12972, Color color, Color color2, boolean bl, boolean bl2, float f2, boolean bl3) {
        class_1309 class_13092;
        double[] dArray = this.R(class_12972, f2);
        if (dArray == null) {
            return;
        }
        float f3 = (float)dArray[0];
        float f4 = (float)dArray[1];
        float f5 = (float)dArray[2];
        float f6 = (float)dArray[3];
        if (f5 - f3 <= 0.0f || f6 - f4 <= 0.0f) {
            return;
        }
        if (bl2) {
            o.D(class_45872, f3, f4, f5 - f3, f6 - f4, color2);
        }
        if (bl) {
            this.G(class_45872, f3, f4, f5, f6, color);
        }
        if (this.T.h() && class_12972 instanceof class_1309 && (class_13092 = (class_1309)class_12972).method_6063() > 0.0f && class_13092.method_6032() > 0.0f) {
            this.c(class_45872, f3, f4, f6, class_13092);
        }
        if (bl3 && this.F.h() && class_12972 instanceof class_1657) {
            this.t(class_45872, f5, f4, f6, (class_1657)class_12972);
        }
    }

    private void G(class_4587 class_45872, float f2, float f3, float f4, float f5, Color color) {
        if (this.B.h()) {
            o.D(class_45872, f2 - 1.0f, f3, 1.5f, f5 - f3 + 0.5f, Color.BLACK);
            o.D(class_45872, f2 - 1.0f, f3 - 0.5f, f4 - f2 + 1.5f, 1.5f, Color.BLACK);
            o.D(class_45872, f4 - 1.0f, f3, 1.5f, f5 - f3 + 0.5f, Color.BLACK);
            o.D(class_45872, f2 - 1.0f, f5 - 1.0f, f4 - f2 + 1.5f, 1.5f, Color.BLACK);
        }
        o.D(class_45872, f2 - 0.5f, f3, 0.5f, f5 - f3, color);
        o.D(class_45872, f2, f5 - 0.5f, f4 - f2, 0.5f, color);
        o.D(class_45872, f2 - 0.5f, f3, f4 - f2 + 0.5f, 0.5f, color);
        o.D(class_45872, f4 - 0.5f, f3, 0.5f, f5 - f3, color);
    }

    private void c(class_4587 class_45872, float f2, float f3, float f4, class_1309 class_13092) {
        float f5 = f4 - f3;
        float f6 = class_13092.method_6032();
        float f7 = class_13092.method_6063();
        float f8 = Math.max(0.0f, Math.min(1.0f, f6 / f7));
        o.D(class_45872, f2 - 4.0f, f3, 1.0f, f5, Color.BLACK);
        o.D(class_45872, f2 - 4.0f, f4 - f5 * f8, 1.0f, f5 * f8, this.l(f6));
    }

    private Color l(float f2) {
        if (f2 >= 20.0f) {
            return this.y.P();
        }
        if (f2 > 10.0f) {
            return this.d.P();
        }
        return this.g.P();
    }

    private void t(class_4587 class_45872, float f2, float f3, float f4, class_1657 class_16572) {
        float f5 = f4 - f3;
        float f6 = f5 / 4.0f;
        ArrayList<class_1799> arrayList = new ArrayList<class_1799>();
        arrayList.add((class_1799)class_16572.method_31548().field_7548.get(3));
        arrayList.add((class_1799)class_16572.method_31548().field_7548.get(2));
        arrayList.add((class_1799)class_16572.method_31548().field_7548.get(1));
        arrayList.add((class_1799)class_16572.method_31548().field_7548.get(0));
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            class_1799 class_17992 = (class_1799)arrayList.get(i2);
            if (class_17992.method_7960() || class_17992.method_7936() <= 0) continue;
            float f7 = (float)(class_17992.method_7936() - class_17992.method_7919()) / (float)class_17992.method_7936();
            f7 = Math.max(0.0f, Math.min(1.0f, f7));
            float f8 = f3 + f6 * (float)i2;
            float f9 = f8 + f6;
            float f10 = f6 * f7 * this.m.Z();
            f10 = Math.min(f6, f10);
            o.D(class_45872, f2 + 1.5f, f9 - f10, 1.5f, f10, this.L.P());
        }
    }

    private double[] R(class_1297 class_12972, float f2) {
        double d2 = dev.idhammai.P.A.A.A.Z(class_12972.field_6038, class_12972.method_23317(), f2);
        double d3 = dev.idhammai.P.A.A.A.Z(class_12972.field_5971, class_12972.method_23318(), f2);
        double d4 = dev.idhammai.P.A.A.A.Z(class_12972.field_5989, class_12972.method_23321(), f2);
        class_238 class_2383 = class_12972.method_5829();
        class_238 class_2384 = new class_238(class_2383.field_1323 - class_12972.method_23317() + d2 - 0.05, class_2383.field_1322 - class_12972.method_23318() + d3, class_2383.field_1321 - class_12972.method_23321() + d4 - 0.05, class_2383.field_1320 - class_12972.method_23317() + d2 + 0.05, class_2383.field_1325 - class_12972.method_23318() + d3 + 0.15, class_2383.field_1324 - class_12972.method_23321() + d4 + 0.05);
        class_243[] class_243Array = new class_243[]{new class_243(class_2384.field_1323, class_2384.field_1322, class_2384.field_1321), new class_243(class_2384.field_1323, class_2384.field_1325, class_2384.field_1321), new class_243(class_2384.field_1320, class_2384.field_1322, class_2384.field_1321), new class_243(class_2384.field_1320, class_2384.field_1325, class_2384.field_1321), new class_243(class_2384.field_1323, class_2384.field_1322, class_2384.field_1324), new class_243(class_2384.field_1323, class_2384.field_1325, class_2384.field_1324), new class_243(class_2384.field_1320, class_2384.field_1322, class_2384.field_1324), new class_243(class_2384.field_1320, class_2384.field_1325, class_2384.field_1324)};
        double d5 = Double.POSITIVE_INFINITY;
        double d6 = Double.POSITIVE_INFINITY;
        double d7 = Double.NEGATIVE_INFINITY;
        double d8 = Double.NEGATIVE_INFINITY;
        boolean bl = false;
        for (class_243 class_2432 : class_243Array) {
            class_243 class_2433 = n.i(new class_243(class_2432.field_1352, class_2432.field_1351, class_2432.field_1350));
            if (!(class_2433.field_1350 > 0.0) || !(class_2433.field_1350 < 1.0)) continue;
            bl = true;
            d5 = Math.min(class_2433.field_1352, d5);
            d6 = Math.min(class_2433.field_1351, d6);
            d7 = Math.max(class_2433.field_1352, d7);
            d8 = Math.max(class_2433.field_1351, d8);
        }
        if (!bl) {
            return null;
        }
        return new double[]{d5, d6, d7, d8};
    }

    private void d(class_332 class_3322, class_1542 class_15422, float f2) {
        double[] dArray = this.R((class_1297)class_15422, f2);
        if (dArray == null) {
            return;
        }
        int n2 = class_15422.method_6983().method_7947();
        String string = this.w.h() && n2 > 1 ? " x" + n2 : "";
        String string2 = (this.A.h() ? class_15422.method_6983().method_7964() : class_15422.method_6983().method_7909().method_7848()).getString();
        String string3 = string2 + string;
        int n3 = dev.idhammai.c.r.q.n.D.W.field_1772.method_1727(string3);
        float f3 = (float)(dArray[0] + (dArray[2] - dArray[0]) / 2.0 - (double)n3 / 2.0);
        class_3322.method_51433(dev.idhammai.c.r.q.n.D.W.field_1772, string3, (int)f3, (int)(dArray[1] - 10.0), this.H.P().getRGB(), false);
    }

    @r
    public void p(Q3 q3) {
        class_1297 class_12972;
        if (dev.idhammai.c.r.q.n.D.M()) {
            return;
        }
        if (this.Q.h() && (class_12972 = q3.Y()) instanceof class_1684) {
            class_1684 class_16842 = (class_1684)class_12972;
            if (class_16842.method_24921() != null) {
                class_16842.method_5665(class_16842.method_24921().method_5477());
                class_16842.method_5880(true);
            } else {
                dev.idhammai.c.r.q.n.D.W.field_1687.method_18456().stream().min(Comparator.comparingDouble(arg_0 -> D.lambda$onReceivePacket$16(class_16842, arg_0))).ifPresent(arg_0 -> D.lambda$onReceivePacket$17(class_16842, arg_0));
            }
        }
    }

    private static void lambda$onReceivePacket$17(class_1684 class_16842, class_742 class_7422) {
        class_16842.method_5665(class_7422.method_5477());
        class_16842.method_5880(true);
    }

    private static double lambda$onReceivePacket$16(class_1684 class_16842, class_742 class_7422) {
        return class_7422.method_19538().method_1022(new class_243(class_16842.method_23317(), class_16842.method_23318(), class_16842.method_23321()));
    }

    private boolean lambda$new$15() {
        return this.M.X() != p.TwoD && this.k.f();
    }

    private boolean lambda$new$14() {
        return this.M.X() != p.TwoD && this.k.f();
    }

    private boolean lambda$new$13() {
        return this.M.X() != p.TwoD && this.k.f();
    }

    private boolean lambda$new$12() {
        return this.M.X() != p.TwoD && this.k.f();
    }

    private boolean lambda$new$11() {
        return this.M.X() != p.TwoD && this.k.f();
    }

    private boolean lambda$new$10() {
        return this.M.X() != p.TwoD && this.k.f();
    }

    private boolean lambda$new$9() {
        return this.M.X() != p.TwoD && this.k.f();
    }

    private boolean lambda$new$8() {
        return this.M.X() != p.TwoD && this.k.f();
    }

    private boolean lambda$new$7() {
        return this.M.X() == p.TwoD && this.F.h();
    }

    private boolean lambda$new$6() {
        return this.M.X() == p.TwoD && this.F.h();
    }

    private boolean lambda$new$5() {
        return this.M.X() == p.TwoD;
    }

    private boolean lambda$new$4() {
        return this.M.X() == p.TwoD;
    }

    private boolean lambda$new$3() {
        return this.M.X() == p.TwoD;
    }

    private boolean lambda$new$2() {
        return this.M.X() == p.TwoD;
    }

    private boolean lambda$new$1() {
        return this.M.X() == p.TwoD;
    }

    private boolean lambda$new$0() {
        return this.M.X() == p.TwoD;
    }
}

