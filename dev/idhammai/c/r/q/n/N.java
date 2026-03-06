/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1542
 *  net.minecraft.class_1667
 *  net.minecraft.class_1681
 *  net.minecraft.class_1683
 *  net.minecraft.class_1686
 *  net.minecraft.class_3937
 *  net.minecraft.class_5904
 *  net.minecraft.class_677$class_678
 *  net.minecraft.class_677$class_681
 *  net.minecraft.class_691
 *  net.minecraft.class_700
 *  net.minecraft.class_711
 */
package dev.idhammai.c.r.q.n;

import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.L;
import dev.idhammai.P.r.c.C;
import dev.idhammai.P.r.c.i;
import dev.idhammai.P.r.c.m;
import dev.idhammai.P.r.c.p;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import net.minecraft.class_1297;
import net.minecraft.class_1542;
import net.minecraft.class_1667;
import net.minecraft.class_1681;
import net.minecraft.class_1683;
import net.minecraft.class_1686;
import net.minecraft.class_3937;
import net.minecraft.class_5904;
import net.minecraft.class_677;
import net.minecraft.class_691;
import net.minecraft.class_700;
import net.minecraft.class_711;

public class N
extends y {
    public static N Q;
    public final W A = this.S(new W("2DItem", false).k("2D\u7269\u54c1").D());
    public final W V = this.S(new W("CastShadow", true, this.A::f).k("\u6295\u5c04\u9634\u5f71"));
    public final W w = this.S(new W("RenderSidesOfItems", false, this.A::f).k("\u6e32\u67d3\u7269\u54c1\u4fa7\u9762"));
    public final W l = this.S(new W("PotionsIcon", false).k("\u836f\u6c34\u56fe\u6807"));
    public final W b = this.S(new W("Weather", true).k("\u5929\u6c14"));
    public final W R = this.S(new W("Invisible", false).k("\u9690\u5f62\u5b9e\u4f53"));
    public final W n = this.S(new W("LightsUpdate", false).k("\u5149\u7167\u66f4\u65b0"));
    public final W B = this.S(new W("Potions", true).k("\u55b7\u6e85\u836f\u6c34"));
    public final W H = this.S(new W("XP", true).k("\u7ecf\u9a8c\u74f6"));
    public final W M = this.S(new W("Arrows", false).k("\u7bad\u77e2"));
    public final W j = this.S(new W("Eggs", false).k("\u9e21\u86cb"));
    public final W K = this.S(new W("Items", false).k("\u6389\u843d\u7269"));
    public final W Z = this.S(new W("ArmorParts", false).k("\u62a4\u7532\u90e8\u4ef6"));
    public final W u = this.S(new W("ArmorTrim", false).k("\u62a4\u7532\u7eb9\u9970"));
    public final W e = this.S(new W("ArmorGlint", false).k("\u62a4\u7532\u9644\u9b54\u5149"));
    public final W E = this.S(new W("HurtCam", true).k("\u53d7\u4f24\u955c\u5934"));
    public final W s = this.S(new W("FireOverlay", true).k("\u706b\u7130\u906e\u7f69"));
    public final W C = this.S(new W("WaterOverlay", true).k("\u6c34\u4e0b\u906e\u7f69"));
    public final W h = this.S(new W("BlockOverlay", true).k("\u65b9\u5757\u906e\u7f69"));
    public final W m = this.S(new W("Portal", true).k("\u4f20\u9001\u95e8\u906e\u7f69"));
    public final W L = this.S(new W("Totem", true).k("\u56fe\u817e\u52a8\u753b"));
    public final W J = this.S(new W("Nausea", true).k("\u53cd\u80c3\u6548\u679c"));
    public final W t = this.S(new W("Blindness", true).k("\u5931\u660e\u6548\u679c"));
    public final W U = this.S(new W("Fog", false).k("\u96fe\u6548"));
    public final W d = this.S(new W("Darkness", true).k("\u9ed1\u6697\u6548\u679c"));
    public final W X = this.S(new W("EntityFire", true).k("\u5b9e\u4f53\u7740\u706b\u6548\u679c"));
    public final W y = this.S(new W("Title", false).k("\u6807\u9898\u6d88\u606f"));
    public final W g = this.S(new W("PlayerCollision", true).k("\u73a9\u5bb6\u78b0\u649e"));
    public final W N = this.S(new W("Effect", true).k("\u7c92\u5b50\u6548\u679c"));
    public final W f = this.S(new W("Guardian", false).k("\u8fdc\u53e4\u5b88\u536b\u8005\u7279\u6548"));
    public final W p = this.S(new W("Explosions", true).k("\u7206\u70b8\u7c92\u5b50"));
    public final W T = this.S(new W("CampFire", false).k("\u8425\u706b\u70df\u96fe"));
    public final W Y = this.S(new W("Fireworks", false).k("\u70df\u82b1\u7c92\u5b50"));
    public final W c = this.S(new W("GuiToast", false).k("\u53f3\u4e0a\u89d2\u63d0\u793a"));

    public N() {
        super("NoRender", "Disables all overlays and potion effects.", dev.idhammai.c.r.w.Render);
        this.L("\u7981\u7528\u6e32\u67d3");
        Q = this;
    }

    @r
    public void H(i i2) {
        if (i2.L() instanceof class_5904 && this.y.h()) {
            i2.G(true);
        }
    }

    @r
    public void p(C c2) {
        this.U(c2.W(), c2);
    }

    @r
    public void O(m m2) {
        this.U(m2.n(), m2);
    }

    private void U(class_1297 class_12972, L l2) {
        if (class_12972 instanceof class_1686 && this.B.h()) {
            l2.L();
        } else if (class_12972 instanceof class_1683 && this.H.h()) {
            l2.L();
        } else if (class_12972 instanceof class_1667 && this.M.h()) {
            l2.L();
        } else if (class_12972 instanceof class_1681 && this.j.h()) {
            l2.L();
        } else if (class_12972 instanceof class_1542 && this.K.h()) {
            l2.L();
        }
    }

    @r
    public void x(p p2) {
        if (this.f.h() && p2.t instanceof class_700) {
            p2.L();
        } else if (this.p.h() && p2.t instanceof class_691) {
            p2.L();
        } else if (this.T.h() && p2.t instanceof class_3937) {
            p2.L();
        } else if (this.Y.h() && (p2.t instanceof class_677.class_681 || p2.t instanceof class_677.class_678)) {
            p2.L();
        } else if (this.N.h() && p2.t instanceof class_711) {
            p2.L();
        }
    }
}

