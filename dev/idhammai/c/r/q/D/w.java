/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_241
 *  net.minecraft.class_243
 *  net.minecraft.class_2708
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_4587
 *  net.minecraft.class_757
 *  net.minecraft.class_9801
 *  org.joml.Matrix4f
 *  org.lwjgl.opengl.GL11
 */
package dev.idhammai.c.r.q.D;

import com.mojang.blaze3d.systems.RenderSystem;
import dev.idhammai.Frog;
import dev.idhammai.P.A.L.l;
import dev.idhammai.P.A.S.f;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.G;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.P.r.c.T;
import dev.idhammai.P.r.c.V;
import dev.idhammai.P.r.c.W;
import dev.idhammai.P.r.c.i;
import dev.idhammai.c.r.O.Y.A;
import dev.idhammai.c.r.q.N.x;
import dev.idhammai.c.r.q.i.c;
import dev.idhammai.c.r.y;
import java.awt.Color;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_241;
import net.minecraft.class_243;
import net.minecraft.class_2708;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_4587;
import net.minecraft.class_757;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import org.lwjgl.opengl.GL11;

public class w
extends y {
    public static w H;
    public final dev.idhammai.c.r.O.Y.W d = this.S(new dev.idhammai.c.r.O.Y.W("AnyHole", true).k("\u4efb\u610f\u5751"));
    public final dev.idhammai.c.r.O.Y.l a = this.p(new dev.idhammai.c.r.O.Y.l("Timer", 1.0, 0.1, 8.0, 0.1).D("\u8ba1\u65f6\u500d\u7387"));
    public final dev.idhammai.c.r.O.Y.W E = this.S(new dev.idhammai.c.r.O.Y.W("Up", true).k("\u5141\u8bb8\u5411\u4e0a"));
    public final dev.idhammai.c.r.O.Y.W b = this.S(new dev.idhammai.c.r.O.Y.W("Grim", false).k("Grim\u6a21\u5f0f"));
    public final A m = this.y(new A("Color", new Color(255, 255, 255, 100)).P("\u989c\u8272"));
    public final dev.idhammai.c.r.O.Y.l s = this.p(new dev.idhammai.c.r.O.Y.l("CircleSize", 1.0, 0.1f, 2.5).D("\u5706\u5708\u5927\u5c0f"));
    public final dev.idhammai.c.r.O.Y.W M = this.S(new dev.idhammai.c.r.O.Y.W("Fade", true).k("\u6e10\u53d8"));
    public final dev.idhammai.c.r.O.Y.l N = this.p(new dev.idhammai.c.r.O.Y.l("Segments", 180, 0, 360).D("\u5706\u5708\u5206\u6bb5"));
    private final dev.idhammai.c.r.O.Y.l g = this.p(new dev.idhammai.c.r.O.Y.l("Range", 5, 1, 50).D("\u641c\u7d22\u8303\u56f4"));
    private final dev.idhammai.c.r.O.Y.l F = this.p(new dev.idhammai.c.r.O.Y.l("TimeOut", 40, 0, 100).D("\u8d85\u65f6\u523b"));
    private final dev.idhammai.c.r.O.Y.l t = this.p(new dev.idhammai.c.r.O.Y.l("Steps", 0.8, 0.0, 1.0, 0.01, this.b::h).D("\u8f6c\u5411\u6b65\u8fdb"));
    private final dev.idhammai.c.r.O.Y.l p = this.p(new dev.idhammai.c.r.O.Y.l("Priority", 10, 0, 100, this.b::h).D("\u8f6c\u5411\u4f18\u5148\u7ea7"));
    boolean w = false;
    boolean f = false;
    class_243 k;
    private class_2338 j;
    private int J;
    private int L;

    public w() {
        super("HoleSnap", "HoleSnap", dev.idhammai.c.r.w.Movement);
        this.L("\u62c9\u5751");
        H = this;
    }

    public static class_241 P(class_243 class_2432, class_243 class_2433) {
        class_243 class_2434 = class_2433.method_1020(class_2432);
        return dev.idhammai.c.r.q.D.w.s(class_2434);
    }

    public static void T(class_4587 class_45872, Color color, double d2, class_243 class_2432, int n2) {
        class_243 class_2433 = dev.idhammai.c.r.q.D.w.W.method_31975().field_4344.method_19326();
        RenderSystem.disableDepthTest();
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        RenderSystem.setShader(class_757::method_34540);
        float f2 = (float)color.getAlpha() / 255.0f;
        float f3 = (float)color.getRed() / 255.0f;
        float f4 = (float)color.getGreen() / 255.0f;
        float f5 = (float)color.getBlue() / 255.0f;
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27381, class_290.field_1576);
        for (double d3 = 0.0; d3 < 360.0; d3 += 360.0 / (double)n2) {
            double d4 = Math.sin(Math.toRadians(d3)) * d2;
            double d5 = Math.cos(Math.toRadians(d3)) * d2;
            class_243 class_2434 = new class_243(class_2432.field_1352 + d4, class_2432.field_1351, class_2432.field_1350 + d5).method_1031(-class_2433.field_1352, -class_2433.field_1351, -class_2433.field_1350);
            class_2872.method_22918(matrix4f, (float)class_2434.field_1352, (float)class_2434.field_1351, (float)class_2434.field_1350).method_22915(f3, f4, f5, f2);
        }
        class_286.method_43433((class_9801)class_2872.method_60800());
        RenderSystem.enableDepthTest();
    }

    private static class_241 s(class_243 class_2432) {
        double d2 = class_2432.field_1352;
        double d3 = class_2432.field_1350;
        double d4 = Math.hypot(d2, d3);
        d3 = class_2432.field_1350;
        double d5 = class_2432.field_1352;
        double d6 = dev.idhammai.c.r.q.D.w.n(Math.toDegrees(Math.atan2(d3, d5)) - 90.0);
        double d7 = dev.idhammai.c.r.q.D.w.n(Math.toDegrees(-Math.atan2(class_2432.field_1351, d4)));
        return new class_241((float)d6, (float)d7);
    }

    private static double n(double d2) {
        double d3 = d2;
        if ((d3 %= 360.0) >= 180.0) {
            d3 -= 360.0;
        }
        if (d3 < -180.0) {
            d3 += 360.0;
        }
        return d3;
    }

    @r(D=-99)
    public void Y(V v2) {
        if (this.f) {
            v2.K(this.a.Z());
        }
    }

    @Override
    public void H() {
        this.f = false;
        if (dev.idhammai.c.r.q.D.w.M()) {
            this.p();
            return;
        }
        this.w = false;
        this.j = Frog.HOLE.z((float)this.g.e(), true, this.d.h(), this.E.h());
    }

    @Override
    public void L() {
        this.j = null;
        this.J = 0;
        this.L = 0;
        if (dev.idhammai.c.r.q.D.w.M()) {
            return;
        }
        if (this.w && !this.b.h()) {
            l.U(0.0);
            l.Q(0.0);
        }
    }

    @r
    public void d(i i2) {
        if (i2.L() instanceof class_2708) {
            this.p();
        }
    }

    @r(D=-999)
    public void m(G g2) {
        if (!this.b.h()) {
            return;
        }
        if (!x.y.y()) {
            this.y("\u00a74HoleSnap require MovementSync.");
            this.p();
            return;
        }
        if (dev.idhammai.c.r.q.D.w.W.field_1724.method_3144() || c.L.p()) {
            return;
        }
        dev.idhammai.c.r.q.D.w.W.field_1724.field_3913.field_3907 = 0.0f;
        dev.idhammai.c.r.q.D.w.W.field_1724.field_3913.field_3905 = 1.0f;
    }

    @r
    public void O(QO qO) {
        class_2350 class_23502;
        this.j = Frog.HOLE.z((float)this.g.e(), true, this.d.h(), this.E.h());
        if (this.j == null) {
            this.p();
            return;
        }
        ++this.L;
        if ((double)this.L > this.F.e() - 1.0) {
            this.p();
            return;
        }
        this.f = true;
        if (!this.b.h()) {
            return;
        }
        if (!dev.idhammai.c.r.q.D.w.W.field_1724.method_5805() || dev.idhammai.c.r.q.D.w.W.field_1724.method_6128()) {
            this.p();
            return;
        }
        if (this.J > 8) {
            this.p();
            return;
        }
        if (this.j == null) {
            this.p();
            return;
        }
        class_243 class_2432 = dev.idhammai.c.r.q.D.w.W.field_1724.method_19538();
        this.k = new class_243((double)this.j.method_10263() + 0.5, dev.idhammai.c.r.q.D.w.W.field_1724.method_23318(), (double)this.j.method_10260() + 0.5);
        if (Frog.HOLE.N(this.j) && (class_23502 = Frog.HOLE.W(this.j)) != null) {
            this.k = this.k.method_1019(new class_243((double)class_23502.method_10163().method_10263() * 0.5, (double)class_23502.method_10163().method_10264() * 0.5, (double)class_23502.method_10163().method_10260() * 0.5));
        }
        this.f = true;
        this.w = true;
        float f2 = dev.idhammai.c.r.q.D.w.P((class_243)class_2432, (class_243)this.k).field_1343;
        float f3 = f2 / 180.0f * (float)Math.PI;
        double d2 = class_2432.method_1022(this.k);
        double d3 = Math.min(0.2873, d2);
        double d4 = (double)(-((float)Math.sin(f3))) * d3;
        double d5 = (double)((float)Math.cos(f3)) * d3;
        if (Math.abs(d4) < 0.25 && Math.abs(d5) < 0.25 && class_2432.field_1351 <= (double)this.j.method_10264() + 0.8) {
            this.p();
            return;
        }
        this.J = dev.idhammai.c.r.q.D.w.W.field_1724.field_5976 ? (this.J = this.J + 1) : 0;
    }

    @r
    public void G(W w2) {
        if (this.b.h() && this.j != null) {
            class_2350 class_23502;
            this.k = new class_243((double)this.j.method_10263() + 0.5, dev.idhammai.c.r.q.D.w.W.field_1724.method_23318(), (double)this.j.method_10260() + 0.5);
            if (Frog.HOLE.N(this.j) && (class_23502 = Frog.HOLE.W(this.j)) != null) {
                this.k = this.k.method_1019(new class_243((double)class_23502.method_10163().method_10263() * 0.5, (double)class_23502.method_10163().method_10264() * 0.5, (double)class_23502.method_10163().method_10260() * 0.5));
            }
            w2.m(this.k, this.t.Z(), this.p.Z());
        }
    }

    @r
    public void K(T t2) {
        class_2350 class_23502;
        if (this.b.h()) {
            return;
        }
        if (!dev.idhammai.c.r.q.D.w.W.field_1724.method_5805() || dev.idhammai.c.r.q.D.w.W.field_1724.method_6128()) {
            this.p();
            return;
        }
        if (this.J > 8) {
            this.p();
            return;
        }
        if (this.j == null) {
            this.p();
            return;
        }
        class_243 class_2432 = dev.idhammai.c.r.q.D.w.W.field_1724.method_19538();
        this.k = new class_243((double)this.j.method_10263() + 0.5, dev.idhammai.c.r.q.D.w.W.field_1724.method_23318(), (double)this.j.method_10260() + 0.5);
        if (Frog.HOLE.N(this.j) && (class_23502 = Frog.HOLE.W(this.j)) != null) {
            this.k = this.k.method_1019(new class_243((double)class_23502.method_10163().method_10263() * 0.5, (double)class_23502.method_10163().method_10264() * 0.5, (double)class_23502.method_10163().method_10260() * 0.5));
        }
        this.f = true;
        this.w = true;
        float f2 = dev.idhammai.c.r.q.D.w.P((class_243)class_2432, (class_243)this.k).field_1343;
        float f3 = f2 / 180.0f * (float)Math.PI;
        double d2 = class_2432.method_1022(this.k);
        double d3 = Math.min(0.2873, d2);
        double d4 = (double)(-((float)Math.sin(f3))) * d3;
        double d5 = (double)((float)Math.cos(f3)) * d3;
        t2.C(d4);
        t2.p(d5);
        if (Math.abs(d4) < 0.1 && Math.abs(d5) < 0.1 && class_2432.field_1351 <= (double)this.j.method_10264() + 0.5) {
            this.p();
        }
        this.J = dev.idhammai.c.r.q.D.w.W.field_1724.field_5976 ? (this.J = this.J + 1) : 0;
    }

    @Override
    public void h(class_4587 class_45872) {
        if (this.k == null || this.j == null) {
            return;
        }
        GL11.glEnable((int)3042);
        Color color = this.m.P();
        class_243 class_2432 = new class_243(this.k.field_1352, (double)this.j.method_10264(), this.k.method_10215());
        if (this.M.h()) {
            double d2 = 0.01;
            for (double d3 = 0.0; d3 < this.s.e(); d3 += d2) {
                dev.idhammai.c.r.q.D.w.T(class_45872, dev.idhammai.P.A.S.f.y(color, (int)Math.min((double)(color.getAlpha() * 2) / (this.s.e() / d2), 255.0)), d3, class_2432, this.N.V());
            }
        } else {
            dev.idhammai.c.r.q.D.w.T(class_45872, color, this.s.e(), class_2432, this.N.V());
        }
        GL11.glDisable((int)3042);
    }
}

