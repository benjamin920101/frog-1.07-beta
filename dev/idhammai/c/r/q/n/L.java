/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_1087
 *  net.minecraft.class_124
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_1887
 *  net.minecraft.class_1890
 *  net.minecraft.class_1937
 *  net.minecraft.class_243
 *  net.minecraft.class_327$class_6415
 *  net.minecraft.class_4184
 *  net.minecraft.class_4587
 *  net.minecraft.class_4597
 *  net.minecraft.class_4597$class_4598
 *  net.minecraft.class_4608
 *  net.minecraft.class_640
 *  net.minecraft.class_6880
 *  net.minecraft.class_7833
 *  net.minecraft.class_811
 *  net.minecraft.class_9304
 *  org.joml.Matrix4f
 *  org.lwjgl.opengl.GL11
 */
package dev.idhammai.c.r.q.n;

import com.mojang.blaze3d.systems.RenderSystem;
import dev.idhammai.Frog;
import dev.idhammai.P.A.S.f;
import dev.idhammai.P.A.S.o;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.R;
import dev.idhammai.c.r.O.Y.A;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import dev.idhammai.p.J.n;
import java.awt.Color;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import net.minecraft.class_1087;
import net.minecraft.class_124;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1887;
import net.minecraft.class_1890;
import net.minecraft.class_1937;
import net.minecraft.class_243;
import net.minecraft.class_327;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_4608;
import net.minecraft.class_640;
import net.minecraft.class_6880;
import net.minecraft.class_7833;
import net.minecraft.class_811;
import net.minecraft.class_9304;
import org.joml.Matrix4f;
import org.lwjgl.opengl.GL11;

public class L
extends y {
    public static L R;
    final A I = this.y(new A("Color", new Color(255, 255, 255)).P("\u540d\u79f0\u989c\u8272"));
    final A h = this.y(new A("Friend", new Color(155, 155, 255)).P("\u597d\u53cb\u989c\u8272").t(true));
    final A H = this.y(new A("Invisible", new Color(200, 200, 200)).P("\u9690\u8eab\u989c\u8272").t(true));
    final A a = this.y(new A("Died", new Color(180, 0, 0)).P("\u6b7b\u4ea1\u989c\u8272").t(true));
    final A s = this.y(new A("Sneaking", new Color(200, 200, 0)).P("\u6f5c\u884c\u989c\u8272").t(true));
    final A b = this.y(new A("Rectangle", new Color(0, 0, 0, 100)).P("\u80cc\u666f\u77e9\u5f62").t(true));
    final W D = this.S(new W("Armor", true).k("\u88c5\u5907\u663e\u793a").D());
    final W p = this.S(new W("DrawItem", true, this.D::f).k("\u6e32\u67d3\u7269\u54c1\u56fe\u6807"));
    final l y = this.p(new l("Offset", -20.0, -30.0, 10.0, 0.01, this.D::f).D("\u88c5\u5907\u504f\u79fb"));
    final W T = this.S(new W("Enchantments", true).k("\u9644\u9b54"));
    final W L = this.S(new W("Durability", true).k("\u8010\u4e45").D());
    final W B = this.S(new W("ForceBar", true, this.L::f).k("\u5f3a\u5236\u8010\u4e45\u6761"));
    final W J = this.S(new W("ItemName", false).k("\u4e3b\u624b\u7269\u54c1\u540d"));
    final W N = this.S(new W("EntityId", false).k("\u5b9e\u4f53ID"));
    final W n = this.S(new W("Gamemode", false).k("\u6e38\u620f\u6a21\u5f0f"));
    final W G = this.S(new W("Ping", true).k("\u5ef6\u8fdf"));
    final W d = this.S(new W("Health", true).k("\u8840\u91cf"));
    final W A = this.S(new W("Totems", false).k("\u56fe\u817e\u6b21\u6570"));
    final l w = this.p(new l("Scale", 1.0, 0.0, 3.0, 0.1).D("\u7f29\u653e"));
    final W k = this.S(new W("Factor", true).k("\u8ddd\u79bb\u7f29\u653e").D());
    final l Q = this.p(new l("Scaling", 1.0, 0.0, 3.0, 0.1, this.k::f).D("\u7f29\u653e\u7cfb\u6570"));
    final l Y = this.p(new l("Distance", 6.0, 0.0, 20.0, 0.1, this.k::f).D("\u8d77\u59cb\u8ddd\u79bb"));
    final l t = this.p(new l("Height", 0.0, -3.0, 3.0, 0.01).D("\u9ad8\u5ea6"));
    final DecimalFormat M = new DecimalFormat("0.0");

    public L() {
        super("NameTags", "Renders info on player NameTags", dev.idhammai.c.r.w.Render);
        this.L("\u540d\u5b57\u6807\u7b7e");
        R = this;
    }

    @r
    public void e(R r2) {
        if (dev.idhammai.c.r.q.n.L.W.field_1773 == null || W.method_1560() == null) {
            return;
        }
        class_4184 class_41842 = dev.idhammai.c.r.q.n.L.W.field_1773.method_19418();
        RenderSystem.enableBlend();
        GL11.glDepthFunc((int)519);
        class_4587 class_45872 = new class_4587();
        for (class_1657 class_16572 : Frog.THREAD.v()) {
            if (!this.a.i && !class_16572.method_5805() || class_16572 == dev.idhammai.c.r.q.n.L.W.field_1724 && dev.idhammai.c.r.q.n.L.W.field_1690.method_31044().method_31034() || !this.H.i && class_16572.method_5767()) continue;
            String string = this.G(class_16572);
            class_243 class_2432 = dev.idhammai.P.A.A.A.w((class_1297)class_16572, r2.h);
            double d2 = class_2432.method_10216();
            double d3 = class_2432.method_10214();
            double d4 = class_2432.method_10215();
            float f2 = this.U(string);
            float f3 = f2 / 2.0f;
            this.v(string, f3, class_16572, d2, d3, d4, class_41842, class_45872);
        }
        GL11.glDepthFunc((int)515);
        RenderSystem.disableBlend();
    }

    private void v(String string, float f2, class_1657 class_16572, double d2, double d3, double d4, class_4184 class_41842, class_4587 class_45872) {
        class_243 class_2432 = class_41842.method_19326();
        double d5 = d3 + (double)class_16572.method_17682() + (double)(class_16572.method_5715() ? 0.4f : 0.43f) + (double)this.t.Z();
        float f3 = (float)((double)(-0.025f * this.w.Z()) + (this.k.h() && class_2432.method_1028(d2, d5, d4) > (double)(this.Y.Z() * this.Y.Z()) ? (Math.sqrt(class_2432.method_1028(d2, d5, d4)) - (double)this.Y.Z()) * (double)-0.0025f * (double)this.Q.Z() : 0.0));
        class_45872.method_22903();
        class_45872.method_22907(class_7833.field_40714.rotationDegrees(class_41842.method_19329()));
        class_45872.method_22907(class_7833.field_40716.rotationDegrees(class_41842.method_19330() + 180.0f));
        class_45872.method_22904(d2 - class_2432.method_10216(), d5 - class_2432.method_10214() + (double)((f3 / -0.025f - 1.0f) / 4.0f), d4 - class_2432.method_10215());
        class_45872.method_22907(class_7833.field_40716.rotationDegrees(-class_41842.method_19330()));
        class_45872.method_22907(class_7833.field_40714.rotationDegrees(class_41842.method_19329()));
        class_45872.method_22905(f3, f3, -1.0f);
        if (this.b.i) {
            float f4 = -f2 - 2.0f;
            float f5 = this.N() + 1.0f;
            o.D(class_45872, f4, -1.0f, f2 * 2.0f + 3.0f, f5, this.b.P());
        }
        this.n(class_45872, string, -f2, 0.0f, this.W(class_16572));
        if (this.D.h()) {
            this.H(class_45872, class_16572);
        }
        class_45872.method_22909();
    }

    private float U(String string) {
        if (dev.idhammai.p.J.n.s()) {
            return dev.idhammai.p.J.n.w.b(string);
        }
        return dev.idhammai.c.r.q.n.L.W.field_1772.method_1727(string);
    }

    private float N() {
        if (dev.idhammai.p.J.n.s()) {
            return dev.idhammai.p.J.n.w.V();
        }
        Objects.requireNonNull(dev.idhammai.c.r.q.n.L.W.field_1772);
        return 9.0f;
    }

    private void n(class_4587 class_45872, String string, float f2, float f3, int n2) {
        if (dev.idhammai.p.J.n.s()) {
            dev.idhammai.p.J.n.w.H(class_45872, string, f2, f3, n2, true);
            dev.idhammai.p.J.n.w.H(class_45872, string, f2, f3, n2, false);
            return;
        }
        class_4597.class_4598 class_45982 = W.method_22940().method_23000();
        dev.idhammai.c.r.q.n.L.W.field_1772.method_27521(string, f2, f3, n2, true, class_45872.method_23760().method_23761(), (class_4597)class_45982, class_327.class_6415.field_33994, 0, 0xF000F0);
        class_45982.method_22993();
        dev.idhammai.c.r.q.n.L.W.field_1772.method_27521(string, f2, f3, n2, false, class_45872.method_23760().method_23761(), (class_4597)class_45982, class_327.class_6415.field_33994, 0, 0xF000F0);
        class_45982.method_22993();
    }

    private void H(class_4587 class_45872, class_1657 class_16572) {
        CopyOnWriteArrayList<class_1799> copyOnWriteArrayList = new CopyOnWriteArrayList<class_1799>();
        if (!class_16572.method_6079().method_7960()) {
            copyOnWriteArrayList.add(class_16572.method_6079());
        }
        class_16572.method_31548().field_7548.forEach(arg_0 -> L.lambda$renderItems$0(copyOnWriteArrayList, arg_0));
        if (!class_16572.method_6047().method_7960()) {
            copyOnWriteArrayList.add(class_16572.method_6047());
        }
        Collections.reverse(copyOnWriteArrayList);
        float f2 = 0.0f;
        int n2 = 0;
        for (class_1799 object2 : copyOnWriteArrayList) {
            f2 -= 8.0f;
            if (object2.method_58657().method_57541() <= n2) continue;
            n2 = object2.method_58657().method_57541();
        }
        float f3 = this.y.Z();
        for (class_1799 class_17992 : copyOnWriteArrayList) {
            GL11.glDepthFunc((int)519);
            if (this.p.h()) {
                this.T(class_45872, class_17992, f2, f3 + 1.0f);
            }
            this.i(class_45872, class_17992, f2, f3 + 2.5f);
            class_45872.method_22905(0.5f, 0.5f, 0.5f);
            if (this.L.h()) {
                this.J(class_45872, class_17992, f2 + 2.0f, f3 + 11.5f);
            }
            if (this.T.h()) {
                this.u(class_45872, class_17992, f2 + 2.0f, f3 + 7.0f);
            }
            class_45872.method_22905(2.0f, 2.0f, 2.0f);
            f2 += 16.0f;
            GL11.glDepthFunc((int)515);
        }
        class_1799 class_17993 = class_16572.method_6047();
        if (class_17993.method_7960()) {
            return;
        }
        class_45872.method_22905(0.5f, 0.5f, 0.5f);
        if (this.J.h()) {
            this.d(class_45872, class_17993, f3 - 4.5f + this.r(n2));
        }
        class_45872.method_22905(2.0f, 2.0f, 2.0f);
    }

    private void T(class_4587 class_45872, class_1799 class_17992, float f2, float f3) {
        class_45872.method_22903();
        class_45872.method_46416(f2, f3, 0.0f);
        class_45872.method_46416(8.0f, 8.0f, 0.0f);
        class_45872.method_22905(16.0f, 16.0f, 1.0E-8f);
        class_45872.method_34425(new Matrix4f().scaling(1.0f, -1.0f, 1.0f));
        class_1087 class_10872 = W.method_1480().method_4019(class_17992, (class_1937)dev.idhammai.c.r.q.n.L.W.field_1687, null, 0);
        class_4597.class_4598 class_45982 = W.method_22940().method_23000();
        W.method_1480().method_23179(class_17992, class_811.field_4317, false, class_45872, (class_4597)class_45982, 0xFF0000, class_4608.field_21444, class_10872);
        class_45982.method_22993();
        class_45872.method_22909();
    }

    private void i(class_4587 class_45872, class_1799 class_17992, float f2, float f3) {
        class_45872.method_22903();
        if (class_17992.method_7947() != 1) {
            String string = String.valueOf(class_17992.method_7947());
            this.n(class_45872, string, f2 + 17.0f - this.U(string), f3 + 9.0f, -1);
        }
        if (class_17992.method_31578() || class_17992.method_7963() && this.B.h()) {
            int n2 = class_17992.method_31579();
            int n3 = class_17992.method_31580();
            float f4 = f2 + 2.0f;
            float f5 = f3 + 13.0f;
            o.F(class_45872, f4, f5, 13.0f, 2.0f, -16777216);
            o.F(class_45872, f4, f5, n2, 1.0f, n3 | 0xFF000000);
        }
        class_45872.method_22909();
    }

    private void J(class_4587 class_45872, class_1799 class_17992, float f2, float f3) {
        if (!class_17992.method_7963()) {
            return;
        }
        int n2 = class_17992.method_7936();
        int n3 = class_17992.method_7919();
        int n4 = (int)((float)(n2 - n3) / (float)n2 * 100.0f);
        this.n(class_45872, n4 + "%", f2 * 2.0f, f3 * 2.0f, f.J((float)(n2 - n3) / (float)n2 * 120.0f, 100.0f, 50.0f, 1.0f).getRGB());
    }

    private void u(class_4587 class_45872, class_1799 class_17992, float f2, float f3) {
        if (class_17992.method_7909() == class_1802.field_8367) {
            this.n(class_45872, "God", f2 * 2.0f, f3 * 2.0f, -3977663);
            return;
        }
        if (!class_17992.method_7942()) {
            return;
        }
        class_9304 class_93042 = class_1890.method_57532((class_1799)class_17992);
        float f4 = 0.0f;
        for (class_6880 class_68802 : class_93042.method_57534()) {
            int n2 = class_93042.method_57536(class_68802);
            StringBuilder stringBuilder = new StringBuilder();
            String string = ((class_1887)class_68802.comp_349()).toString().replace("Enchantment ", "");
            if (string.contains("Vanish")) {
                stringBuilder.append("\u00a7cVan");
            } else if (string.contains("Bind")) {
                stringBuilder.append("\u00a7cBind");
            } else {
                int n3 = n2 > 1 ? 2 : 3;
                int n4 = n3;
                if (string.length() > n3) {
                    string = string.substring(0, n3);
                }
                stringBuilder.append(string);
                stringBuilder.append(n2);
            }
            this.n(class_45872, stringBuilder.toString(), f2 * 2.0f, (f3 + f4) * 2.0f, -1);
            f4 -= 4.5f;
        }
    }

    private float r(int n2) {
        if (!this.T.h() || n2 <= 2) {
            return 0.0f;
        }
        float f2 = -2.0f;
        return f2 -= (float)(n2 - 3) * 4.5f;
    }

    private void d(class_4587 class_45872, class_1799 class_17992, float f2) {
        String string = class_17992.method_7964().getString();
        float f3 = this.U(string) / 4.0f;
        this.n(class_45872, string, (0.0f - f3) * 2.0f, f2 * 2.0f, -1);
    }

    private String G(class_1657 class_16572) {
        int n2;
        StringBuilder stringBuilder = new StringBuilder();
        if (this.n.h()) {
            if (class_16572.method_7337()) {
                stringBuilder.append(class_124.field_1065);
                stringBuilder.append("[C] ");
            } else if (class_16572.method_7325()) {
                stringBuilder.append(class_124.field_1080);
                stringBuilder.append("[I] ");
            } else {
                stringBuilder.append(class_124.field_1067);
                stringBuilder.append("[S] ");
            }
        }
        if (this.G.h()) {
            stringBuilder.append(this.K(class_16572));
            stringBuilder.append("ms ");
            stringBuilder.append(class_124.field_1070);
        }
        stringBuilder.append(class_16572.method_5477().getString());
        stringBuilder.append(" ");
        if (this.N.h()) {
            stringBuilder.append("ID: ");
            stringBuilder.append(class_16572.method_5628());
            stringBuilder.append(" ");
        }
        if (this.d.h()) {
            double d2 = class_16572.method_6032() + class_16572.method_6067();
            class_124 class_1242 = d2 > 18.0 ? class_124.field_1060 : (d2 > 16.0 ? class_124.field_1077 : (d2 > 12.0 ? class_124.field_1054 : (d2 > 8.0 ? class_124.field_1065 : (d2 > 4.0 ? class_124.field_1061 : class_124.field_1079))));
            String string = this.M.format(d2);
            stringBuilder.append(class_1242);
            stringBuilder.append(string);
            stringBuilder.append(" ");
        }
        if (this.A.h() && (n2 = Frog.POP.x(class_16572)) > 0) {
            class_124 class_1243 = dev.idhammai.c.r.q.N.z.y.X(n2);
            stringBuilder.append(class_1243);
            stringBuilder.append(-n2);
            stringBuilder.append(" ");
        }
        return stringBuilder.toString().trim();
    }

    private String K(class_1657 class_16572) {
        if (W.method_1562() == null) {
            return "\u00a77-1";
        }
        class_640 class_6402 = W.method_1562().method_2871(class_16572.method_5667());
        if (class_6402 == null) {
            return "\u00a77-1";
        }
        int n2 = class_6402.method_2959();
        class_124 class_1242 = n2 >= 200 ? class_124.field_1061 : (n2 >= 100 ? class_124.field_1054 : class_124.field_1060);
        return class_1242.toString() + n2;
    }

    private int W(class_1657 class_16572) {
        if (this.h.i && class_16572.method_5476() != null && Frog.FRIEND.r(class_16572)) {
            return this.h.P().getRGB();
        }
        if (this.H.i && class_16572.method_5767()) {
            return this.H.P().getRGB();
        }
        if (this.s.i && class_16572.method_5715()) {
            return this.s.P().getRGB();
        }
        if (!class_16572.method_5805()) {
            return this.a.P().getRGB();
        }
        return this.I.P().getRGB();
    }

    private static void lambda$renderItems$0(CopyOnWriteArrayList copyOnWriteArrayList, class_1799 class_17992) {
        if (!class_17992.method_7960()) {
            copyOnWriteArrayList.add(class_17992);
        }
    }
}

