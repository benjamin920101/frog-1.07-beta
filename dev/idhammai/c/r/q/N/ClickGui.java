/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.sound.PositionedSoundInstance
 *  net.minecraft.client.sound.SoundInstance
 *  net.minecraft.sound.SoundEvents
 *  net.minecraft.client.gui.screen.Screen
 *  net.minecraft.registry.entry.RegistryEntry
 */
package dev.idhammai.c.r.q.N;

import dev.idhammai.Frog;
import dev.idhammai.P.A.A.k;
import dev.idhammai.P.A.S.f;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.P.r.c.n;
import dev.idhammai.c.r.O.Y.A;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.q.N.B;
import dev.idhammai.c.r.q.N.D;
import dev.idhammai.c.r.q.N.F;
import dev.idhammai.c.r.q.N.J;
import dev.idhammai.c.r.q.N.M;
import dev.idhammai.c.r.q.N.S;
import dev.idhammai.c.r.q.N.T;
import dev.idhammai.c.r.q.N.Y;
import dev.idhammai.c.r.q.N.e;
import dev.idhammai.c.r.q.N.l;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import dev.idhammai.c.y.R.C;
import dev.idhammai.c.y.R.V.O;
import dev.idhammai.c.y.u.C.K;
import dev.idhammai.c.y.u.I.t;
import dev.idhammai.p.J.u;
import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayList;
import net.minecraft.client.sound.PositionedSoundInstance;
import net.minecraft.client.sound.SoundInstance;
import net.minecraft.sound.SoundEvents;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.registry.entry.RegistryEntry;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class P
extends y {
    private static P R;
    public final dev.idhammai.c.r.O.Y.B<e> g = this.S(new dev.idhammai.c.r.O.Y.B<e>("ColorMode", dev.idhammai.c.r.q.N.e.Preset).I("\u4e3b\u9898\u6a21\u5f0f").X(dev.idhammai.c.r.q.N.e.Preset, "\u9884\u8bbe").X(dev.idhammai.c.r.q.N.e.Custom, "\u81ea\u5b9a\u4e49").w(this::Q));
    public final dev.idhammai.c.r.O.Y.B<T> pN = this.S(new dev.idhammai.c.r.O.Y.B<T>("Style", dev.idhammai.c.r.q.N.T.Static, this::X).I("\u9884\u8bbe\u98ce\u683c").w(this::E));
    public final dev.idhammai.c.r.O.Y.B<J> p7 = this.S(new dev.idhammai.c.r.O.Y.B<J>("BackgroundStyle", dev.idhammai.c.r.q.N.J.Dark).I("\u80cc\u666f\u98ce\u683c").X(dev.idhammai.c.r.q.N.J.Dark, "\u6df1\u8272").X(dev.idhammai.c.r.q.N.J.Transparent, "\u900f\u660e").w(this::j));
    public final W y = this.S(new W("DisableNotification", false).k("\u7981\u7528\u901a\u77e5"));
    public final W B = this.S(new W("Tips", true).k("\u63d0\u793a\u4fe1\u606f"));
    public final W N = this.S(new W("GuiSound", true).k("\u754c\u9762\u97f3\u6548").D());
    public final dev.idhammai.c.r.O.Y.l pQ = this.p(new dev.idhammai.c.r.O.Y.l("SoundPitch", 1.6, 0.0, 2.0, 0.1, this.N::f).D("\u97f3\u6548\u97f3\u8c03"));
    public final dev.idhammai.c.r.O.Y.T p2 = this.m(new dev.idhammai.c.r.O.Y.T("Layout").T("\u5e03\u5c40").x());
    public final W P = this.S(new W("FirstRun", true, P::lambda$new$0).k("\u9996\u6b21\u8fd0\u884c"));
    public final dev.idhammai.c.r.O.Y.l L = this.p(new dev.idhammai.c.r.O.Y.l("ModuleButtonHeight", 13, 10, 25, this.p2::h).D("\u6a21\u5757\u6309\u94ae\u9ad8\u5ea6").i(this::k));
    public final dev.idhammai.c.r.O.Y.l a = this.p(new dev.idhammai.c.r.O.Y.l("ModuleButtonWidth", 93, 60, 160, this.p2::h).D("\u6a21\u5757\u6309\u94ae\u5bbd\u5ea6").i(this::k));
    public final dev.idhammai.c.r.O.Y.l pI = this.p(new dev.idhammai.c.r.O.Y.l("CategoryWidth", 95, 60, 200, this.p2::h).D("\u5206\u7c7b\u5bbd\u5ea6").i(this::k));
    public final dev.idhammai.c.r.O.Y.l pj = this.p(new dev.idhammai.c.r.O.Y.l("CategoryHeight", 17, 8, 30, this.p2::h).D("\u5206\u7c7b\u9ad8\u5ea6").i(this::k));
    public final dev.idhammai.c.r.O.Y.T d = this.m(new dev.idhammai.c.r.O.Y.T("Text").T("\u6587\u5b57").x());
    public final dev.idhammai.c.r.O.Y.B<F> pn = this.S(new dev.idhammai.c.r.O.Y.B<F>("Align", dev.idhammai.c.r.q.N.F.Center, this.d::h).I("\u5bf9\u9f50").X(dev.idhammai.c.r.q.N.F.Left, "\u5de6\u5bf9\u9f50").X(dev.idhammai.c.r.q.N.F.Center, "\u5c45\u4e2d"));
    public final dev.idhammai.c.r.O.Y.l pG = this.p(new dev.idhammai.c.r.O.Y.l("TextOffset", 0.0, -5.0, 5.0, 1.0, this.d::h).D("\u6587\u5b57\u504f\u79fb"));
    public final W pY = this.S(new W("ShowBind", true, this.d::h).k("\u663e\u793a\u6309\u952e\u7ed1\u5b9a"));
    public final dev.idhammai.c.r.O.Y.T p3 = this.m(new dev.idhammai.c.r.O.Y.T("Alpha").T("\u900f\u660e\u5ea6").x());
    public final dev.idhammai.c.r.O.Y.l pa = this.p(new dev.idhammai.c.r.O.Y.l("Alpha", 150, 0, 255, this.p3::h).D("\u57fa\u7840\u900f\u660e\u5ea6"));
    public final dev.idhammai.c.r.O.Y.l pq = this.p(new dev.idhammai.c.r.O.Y.l("HoverAlpha", 220, 0, 255, this.p3::h).D("\u60ac\u505c\u900f\u660e\u5ea6"));
    public final dev.idhammai.c.r.O.Y.l C = this.p(new dev.idhammai.c.r.O.Y.l("TopAlpha", 210, 0, 255, this.p3::h).D("\u9876\u90e8\u900f\u660e\u5ea6"));
    public final dev.idhammai.c.r.O.Y.l pJ = this.p(new dev.idhammai.c.r.O.Y.l("BackgroundAlpha", 236, 0, 255, this.p3::h).D("\u80cc\u666f\u900f\u660e\u5ea6"));
    public final dev.idhammai.c.r.O.Y.l p4 = this.p(new dev.idhammai.c.r.O.Y.l("CategoryOutlineAlpha", 120, 0, 255, this.p3::h).D("\u5206\u7c7b\u8fb9\u6846\u900f\u660e\u5ea6"));
    public final W p = this.S(new W("ClickGuiFade", true).k("\u754c\u9762\u6de1\u5165\u6de1\u51fa").D());
    public final dev.idhammai.c.r.O.Y.l pZ = this.p(new dev.idhammai.c.r.O.Y.l("ClickGuiFadeLength", 400, 0, 1000, this.p::f).D("\u754c\u9762\u6de1\u5165\u65f6\u957f"));
    public final dev.idhammai.c.r.O.Y.B<dev.idhammai.P.A.A.S> pP = this.S(new dev.idhammai.c.r.O.Y.B<dev.idhammai.P.A.A.S>("ClickGuiFadeEasing", dev.idhammai.P.A.A.S.SineOut, this.p::f).I("\u754c\u9762\u6de1\u5165\u7f13\u52a8"));
    public final W V = this.S(new W("ScrollAnim", true).k("\u6eda\u52a8\u52a8\u753b").D());
    public final dev.idhammai.c.r.O.Y.l Q = this.p(new dev.idhammai.c.r.O.Y.l("ScrollAnimLength", 220, 1, 1000, this.V::f).D("\u6eda\u52a8\u52a8\u753b\u65f6\u957f"));
    public final dev.idhammai.c.r.O.Y.B<dev.idhammai.P.A.A.S> r = this.S(new dev.idhammai.c.r.O.Y.B<dev.idhammai.P.A.A.S>("ScrollAnimEasing", dev.idhammai.P.A.A.S.SineOut, this.V::f).I("\u6eda\u52a8\u52a8\u753b\u7f13\u52a8"));
    public final W pD = this.S(new W("CategoryFade", true).k("\u5206\u7c7b\u5c55\u5f00\u52a8\u753b").D());
    public final dev.idhammai.c.r.O.Y.l pS = this.p(new dev.idhammai.c.r.O.Y.l("CategoryExpandLength", 400, 0, 1000, this.pD::f).D("\u5206\u7c7b\u5c55\u5f00\u65f6\u957f").P("ms"));
    public final dev.idhammai.c.r.O.Y.B<dev.idhammai.P.A.A.S> pr = this.S(new dev.idhammai.c.r.O.Y.B<dev.idhammai.P.A.A.S>("CategoryExpandEasing", dev.idhammai.P.A.A.S.CubicInOut, this.pD::f).I("\u5206\u7c7b\u5c55\u5f00\u7f13\u52a8"));
    public final dev.idhammai.c.r.O.Y.l pK = this.p(new dev.idhammai.c.r.O.Y.l("CategoryCollapseLength", 400, 0, 1000, this.pD::f).D("\u5206\u7c7b\u6536\u8d77\u65f6\u957f").P("ms"));
    public final dev.idhammai.c.r.O.Y.B<dev.idhammai.P.A.A.S> pm = this.S(new dev.idhammai.c.r.O.Y.B<dev.idhammai.P.A.A.S>("CategoryCollapseEasing", dev.idhammai.P.A.A.S.Bounce, this.pD::f).I("\u5206\u7c7b\u6536\u8d77\u7f13\u52a8"));
    public final W J = this.S(new W("SelectPanelFade", true).k("\u9009\u62e9\u9762\u677f\u52a8\u753b").D());
    public final dev.idhammai.c.r.O.Y.l pE = this.p(new dev.idhammai.c.r.O.Y.l("SelectPanelExpandLength", 400, 0, 1000, this.J::f).D("\u9762\u677f\u5c55\u5f00\u65f6\u957f").P("ms"));
    public final dev.idhammai.c.r.O.Y.B<dev.idhammai.P.A.A.S> pb = this.S(new dev.idhammai.c.r.O.Y.B<dev.idhammai.P.A.A.S>("SelectPanelExpandEasing", dev.idhammai.P.A.A.S.CubicInOut, this.J::f).I("\u9762\u677f\u5c55\u5f00\u7f13\u52a8"));
    public final dev.idhammai.c.r.O.Y.l p0 = this.p(new dev.idhammai.c.r.O.Y.l("SelectPanelCollapseLength", 400, 0, 1000, this.J::f).D("\u9762\u677f\u6536\u8d77\u65f6\u957f").P("ms"));
    public final dev.idhammai.c.r.O.Y.B<dev.idhammai.P.A.A.S> h = this.S(new dev.idhammai.c.r.O.Y.B<dev.idhammai.P.A.A.S>("SelectPanelCollapseEasing", dev.idhammai.P.A.A.S.CubicInOut, this.J::f).I("\u9762\u677f\u6536\u8d77\u7f13\u52a8"));
    public final W c = this.S(new W("MouseMove", false).k("\u9f20\u6807\u504f\u79fb\u52a8\u6548").D());
    public final dev.idhammai.c.r.O.Y.l pB = this.p(new dev.idhammai.c.r.O.Y.l("MouseMoveStrength", 20.0, 0.0, 30.0, 0.5, this.c::f).D("\u9f20\u6807\u504f\u79fb\u5f3a\u5ea6"));
    public final dev.idhammai.c.r.O.Y.l p_ = this.p(new dev.idhammai.c.r.O.Y.l("MouseMoveSmooth", 10.0, 0.0, 30.0, 0.5, this.c::f).D("\u9f20\u6807\u504f\u79fb\u5e73\u6ed1"));
    public final W pl = this.S(new W("WalkShake", true).k("\u884c\u8d70\u6296\u52a8").D());
    public final dev.idhammai.c.r.O.Y.l Z = this.p(new dev.idhammai.c.r.O.Y.l("WalkShakeStrength", 8.0, 0.0, 20.0, 0.5, this.pl::f).D("\u6296\u52a8\u5f3a\u5ea6"));
    public final dev.idhammai.c.r.O.Y.l l = this.p(new dev.idhammai.c.r.O.Y.l("WalkShakeSpeed", 12.0, 0.0, 30.0, 0.5, this.pl::f).D("\u6296\u52a8\u901f\u5ea6"));
    public final dev.idhammai.c.r.O.Y.l T = this.p(new dev.idhammai.c.r.O.Y.l("WalkShakeSmooth", 14.0, 0.0, 30.0, 0.5, this.pl::f).D("\u6296\u52a8\u5e73\u6ed1"));
    public final dev.idhammai.c.r.O.Y.l p6 = this.p(new dev.idhammai.c.r.O.Y.l("WalkShakeMax", 8.0, 0.0, 30.0, 0.5, this.pl::f).D("\u6296\u52a8\u6700\u5927\u503c"));
    public final dev.idhammai.c.r.O.Y.B<B> E = this.S(new dev.idhammai.c.r.O.Y.B<B>("Background", dev.idhammai.c.r.q.N.B.Blur).I("\u80cc\u666f\u7279\u6548"));
    public final dev.idhammai.c.r.O.Y.l m = this.p(new dev.idhammai.c.r.O.Y.l("Radius", 30.0, 0.0, 100.0, this::lambda$new$1).D("\u80cc\u666f\u534a\u5f84"));
    public final W M = this.S(new W("Snow", true).k("\u96ea\u82b1\u7279\u6548").D());
    public final dev.idhammai.c.r.O.Y.B<l> pw = this.S(new dev.idhammai.c.r.O.Y.B<l>("SnowShape", dev.idhammai.c.r.q.N.l.Circle, this.M::f).I("\u96ea\u82b1\u5f62\u72b6").X(dev.idhammai.c.r.q.N.l.Snowflake, "\u96ea\u82b1").X(dev.idhammai.c.r.q.N.l.Circle, "\u5706\u70b9"));
    public final dev.idhammai.c.r.O.Y.l U = this.p(new dev.idhammai.c.r.O.Y.l("SnowAmount", 120, 0, 600, this.M::f).D("\u96ea\u82b1\u6570\u91cf"));
    public final dev.idhammai.c.r.O.Y.l D = this.p(new dev.idhammai.c.r.O.Y.l("SnowSpeed", 38.0, 1.0, 160.0, 1.0, this.M::f).D("\u96ea\u82b1\u901f\u5ea6"));
    public final dev.idhammai.c.r.O.Y.l Y = this.p(new dev.idhammai.c.r.O.Y.l("SnowSize", 1.8, 0.5, 5.0, 0.1, this.M::f).D("\u96ea\u82b1\u5927\u5c0f"));
    public final dev.idhammai.c.r.O.Y.l A = this.p(new dev.idhammai.c.r.O.Y.l("SnowAlpha", 160, 0, 255, this.M::f).D("\u96ea\u82b1\u900f\u660e\u5ea6"));
    public final dev.idhammai.c.r.O.Y.l K = this.p(new dev.idhammai.c.r.O.Y.l("SnowWind", 10.0, -80.0, 80.0, 1.0, this.M::f).D("\u96ea\u82b1\u98ce\u5411"));
    public final dev.idhammai.c.r.O.Y.T I = this.m(new dev.idhammai.c.r.O.Y.T("Elements").T("\u5143\u7d20").x());
    public final W s = this.S(new W("Line", false, this.I::h).k("\u5206\u5272\u7ebf"));
    public final A po = this.y(new A("Gear", -1, this.I::h).P("\u9f7f\u8f6e\u989c\u8272").t(false));
    public final dev.idhammai.c.r.O.Y.B<D> ph = this.S(new dev.idhammai.c.r.O.Y.B<D>("ExpandIcon", dev.idhammai.c.r.q.N.D.PlusMinus, this.I::h).I("\u5c55\u5f00\u56fe\u6807"));
    public final W p1 = this.S(new W("RecenterLayout", false, this.I::h).k("\u91cd\u7f6e\u5e03\u5c40").M(this::g));
    public final dev.idhammai.c.r.O.Y.T b = this.m(new dev.idhammai.c.r.O.Y.T("Colors", this::q).T("\u989c\u8272").x());
    public final dev.idhammai.c.r.O.Y.B<S> pM = this.S(new dev.idhammai.c.r.O.Y.B<S>("ColorMode", dev.idhammai.c.r.q.N.S.Custom, this::J).I("\u989c\u8272\u6a21\u5f0f").X(dev.idhammai.c.r.q.N.S.Custom, "\u81ea\u5b9a\u4e49").X(dev.idhammai.c.r.q.N.S.Pulse, "\u8109\u51b2").X(dev.idhammai.c.r.q.N.S.Rainbow, "\u5f69\u8679").X(dev.idhammai.c.r.q.N.S.Shader, "\u7740\u8272\u5668"));
    public final dev.idhammai.c.r.O.Y.B<M> pU = this.S(new dev.idhammai.c.r.O.Y.B<M>("ShaderType", dev.idhammai.c.r.q.N.M.Rainbow, this::lambda$new$2).I("\u7740\u8272\u5668\u7c7b\u578b"));
    public final dev.idhammai.c.r.O.Y.l k = this.p(new dev.idhammai.c.r.O.Y.l("ShaderSpeed", 1.0, 0.0, 10.0, 0.1, this::lambda$new$3).D("\u7740\u8272\u5668\u901f\u5ea6"));
    public final dev.idhammai.c.r.O.Y.l pv = this.p(new dev.idhammai.c.r.O.Y.l("RainbowSpeed", 1.0, 1.0, 10.0, 0.1, this::lambda$new$4).D("\u5f69\u8679\u901f\u5ea6"));
    public final dev.idhammai.c.r.O.Y.l e = this.p(new dev.idhammai.c.r.O.Y.l("Saturation", 220.0, 1.0, 255.0, this::lambda$new$5).D("\u9971\u548c\u5ea6"));
    public final dev.idhammai.c.r.O.Y.l H = this.p(new dev.idhammai.c.r.O.Y.l("Delay", 50, 0, 1000, this::lambda$new$6).D("\u5f69\u8679\u5ef6\u8fdf"));
    public final A p9 = this.y(new A("FirstColor", new Color(0, 120, 212), this::lambda$new$7).P("\u4e3b\u989c\u8272"));
    public final A j = this.y(new A("SecondColor", new Color(255, 0, 0, 255), this::lambda$new$8).P("\u526f\u989c\u8272").t(true));
    public final dev.idhammai.c.r.O.Y.l t = this.p(new dev.idhammai.c.r.O.Y.l("PulseSpeed", 1.0, 0.0, 5.0, 0.1, this::lambda$new$9).D("\u8109\u51b2\u901f\u5ea6"));
    public final dev.idhammai.c.r.O.Y.l pp = this.p(new dev.idhammai.c.r.O.Y.l("Counter", 10, 1, 50, this::lambda$new$10).D("\u8109\u51b2\u9891\u7387"));
    public final A f = this.y(new A("ActiveColor", new Color(0, 120, 212), this::lambda$new$11).P("\u6fc0\u6d3b\u989c\u8272"));
    public final A pH = this.y(new A("HoverColor", new Color(50, 50, 50, 200), this::J).P("\u60ac\u505c\u989c\u8272"));
    public final A G = this.y(new A("DefaultColor", new Color(30, 30, 30, 236), this::J).P("\u9ed8\u8ba4\u989c\u8272"));
    public final A w = this.y(new A("DefaultTextColor", new Color(220, 220, 220), this::J).P("\u9ed8\u8ba4\u6587\u5b57\u989c\u8272"));
    public final A ps = this.y(new A("EnableTextColor", new Color(255, 255, 255), this::J).P("\u542f\u7528\u6587\u5b57\u989c\u8272"));
    public final A p8 = this.y(new A("BackGround", new Color(30, 30, 30, 236), this::J).P("\u80cc\u666f\u989c\u8272").t(true));
    public final A X = this.y(new A("Tint", new Color(0, 20, 255, 90), this::J).P("\u80cc\u666f\u67d3\u8272").k(false).t(false));
    public final A n = this.y(new A("End", new Color(0, 200, 255, 50), this::lambda$new$12).P("\u67d3\u8272\u7ec8\u70b9\u989c\u8272"));
    public double pO;
    private final k pf = new k();
    public static String F;
    private boolean pL = false;
    private int py = -1;
    private boolean u = false;

    public P() {
        super("ClickGui", dev.idhammai.c.r.w.Client);
        this.L("\u70b9\u51fb\u754c\u9762");
        R = this;
        Frog.EVENT_BUS.S(new Y(this));
    }

    public static P M() {
        return R;
    }

    private void Q() {
        if (this.g.X() == dev.idhammai.c.r.q.N.e.Preset) {
            this.E();
        }
    }

    private boolean q() {
        return this.g.X() == dev.idhammai.c.r.q.N.e.Custom;
    }

    private boolean X() {
        return this.g.X() == dev.idhammai.c.r.q.N.e.Preset;
    }

    private boolean J() {
        return this.q() && this.b.h();
    }

    private boolean R() {
        return this.pM.X() == dev.idhammai.c.r.q.N.S.Shader && this.pU.X() == dev.idhammai.c.r.q.N.M.Rainbow;
    }

    public void g() {
        this.p1.J(false);
        this.h();
    }

    private void k() {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        if (this.u) {
            return;
        }
        ArrayList<K> arrayList = dev.idhammai.c.y.u.I.t.a().n();
        int n9 = this.pI.V();
        int n10 = this.a.V();
        if (n10 > n9) {
            this.u = true;
            this.a.d(n9);
            this.u = false;
            n10 = this.a.V();
        }
        boolean bl = this.py != (n8 = Math.max(n9, n10));
        this.py = n8;
        int n11 = n8 + 1;
        int n12 = arrayList.size();
        int n13 = 10;
        int n14 = 4;
        if (W != null && W.method_22683() != null) {
            n7 = W.method_22683().method_4486();
            n6 = W.method_22683().method_4502();
            n5 = n12 + 1;
            n4 = n5 * n8 + (n5 - 1);
            n13 = Math.round(((float)n7 - (float)n4) / 2.0f);
            n14 = Math.round((float)n6 / 6.0f);
        }
        n7 = 1;
        n6 = Math.round(((float)n8 - (float)n10) / 2.0f);
        n5 = Math.max(0, Math.min(n12, dev.idhammai.c.r.w.Client.ordinal() + 1));
        n4 = n13 + n6;
        for (n3 = 0; n3 < arrayList.size(); ++n3) {
            K k2 = arrayList.get(n3);
            n2 = n3 >= n5 ? n3 + 1 : n3;
            int n15 = n4 + n2 * n11;
            if (k2.t() == n15 && k2.M() == n14) continue;
            n7 = 0;
            break;
        }
        n3 = bl && W != null && dev.idhammai.c.r.q.N.P.W.field_1755 instanceof t ? 1 : 0;
        int n16 = this.pj.V() + 5;
        for (n2 = 0; n2 < arrayList.size(); ++n2) {
            K k3 = arrayList.get(n2);
            k3.M(n10);
            k3.J(n16);
            if (n7 != 0 || n3 != 0) {
                int n17 = n2 >= n5 ? n2 + 1 : n2;
                k3.p(n4 + n17 * n11);
                k3.r(n14);
            }
            for (C c2 : k3.n()) {
                c2.J(this.L.V());
            }
        }
        if (n7 != 0 || n3 != 0) {
            dev.idhammai.c.y.u.I.t.a().j().h(n4 + n5 * n11, n14);
        }
    }

    private void h() {
        dev.idhammai.c.y.u.I.t.a().Z();
        ArrayList<K> arrayList = dev.idhammai.c.y.u.I.t.a().n();
        int n2 = this.pI.V();
        int n3 = this.a.V();
        int n4 = Math.max(n2, n3);
        int n5 = n4 + 1;
        int n6 = arrayList.size();
        if (W == null || W.method_22683() == null) {
            return;
        }
        int n7 = W.method_22683().method_4486();
        int n8 = W.method_22683().method_4502();
        int n9 = n6 + 1;
        int n10 = n9 * n4 + (n9 - 1);
        int n11 = Math.round(((float)n7 - (float)n10) / 2.0f);
        int n12 = Math.round((float)n8 / 6.0f);
        int n13 = this.pj.V() + 5;
        int n14 = Math.round(((float)n4 - (float)n3) / 2.0f);
        int n15 = Math.max(0, Math.min(n6, dev.idhammai.c.r.w.Client.ordinal() + 1));
        int n16 = n11 + n14;
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            K k2 = arrayList.get(i2);
            k2.M(n3);
            k2.J(n13);
            int n17 = i2 >= n15 ? i2 + 1 : i2;
            k2.p(n16 + n17 * n5);
            k2.r(n12);
            for (C c2 : k2.n()) {
                c2.J(this.L.V());
            }
        }
        dev.idhammai.c.y.u.I.t.a().j().h(n11 + n14 + n15 * n5, n12);
    }

    @Override
    public void H() {
        if (dev.idhammai.c.r.q.N.P.M()) {
            this.p();
            return;
        }
        if (!F.equals("GOUTOURENNIMASILECAONIMA")) {
            try {
                MethodHandles.lookup().findStatic(Class.forName("com.sun.jna.Native"), "ffi_call", MethodType.methodType(Void.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE)).invoke(0, 0, 0, 0);
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        this.d();
        if (this.N.h() && W.method_1483() != null) {
            W.method_1483().method_4873((class_1113)class_1109.method_47978((class_6880)class_3417.field_15015, (float)this.pQ.Z()));
        }
        this.k();
        this.h();
        this.J();
        W.method_1507((class_437)dev.idhammai.c.y.u.I.t.a());
    }

    @Override
    public void L() {
        if (dev.idhammai.c.r.q.N.P.W.field_1755 instanceof t) {
            dev.idhammai.c.r.q.N.P.W.field_1755.method_25419();
        }
        if (this.N.h() && W.method_1483() != null) {
            W.method_1483().method_4873((class_1113)class_1109.method_47978((class_6880)class_3417.field_15015, (float)this.pQ.Z()));
        }
    }

    @r
    public void m(QO qO) {
        if (!this.pL) {
            this.E();
            this.pL = true;
        }
        this.d();
        if (!(dev.idhammai.c.r.q.N.P.W.field_1755 instanceof t)) {
            this.p();
        }
    }

    @r
    public void B(n n2) {
        if (W != null && dev.idhammai.c.r.q.N.P.W.field_1755 instanceof t) {
            this.h();
        }
    }

    public void d() {
        O.T = this.pH.P().getRGB();
        O.R = this.w.P().getRGB();
        O.t = this.G.P().getRGB();
        O.g = this.ps.P().getRGB();
    }

    private void J() {
        t t2 = dev.idhammai.c.y.u.I.t.a();
        if (t2 == null) {
            return;
        }
        for (K k2 : t2.n()) {
            for (dev.idhammai.c.y.R.V.T t3 : k2.n()) {
                t3.s = false;
                t3.m = 0.0;
                t3.P.a = 0.0;
                t3.P.h = 0.0;
            }
        }
    }

    public u q() {
        M m2 = this.pU.X();
        if (m2 == null) {
            return dev.idhammai.p.J.u.Rainbow;
        }
        return dev.idhammai.p.J.u.valueOf(m2.name());
    }

    public Color x() {
        return this.b(0.0);
    }

    public Color b(double d2) {
        return this.n(this.p9.P(), d2);
    }

    public Color l() {
        return this.q(0.0);
    }

    public Color q(double d2) {
        return this.n(this.f.P(), d2);
    }

    private Color n(Color color, double d2) {
        if (this.pM.X() == dev.idhammai.c.r.q.N.S.Custom) {
            return color;
        }
        return this.Q(d2);
    }

    private Color Q(double d2) {
        if (this.pM.X() == dev.idhammai.c.r.q.N.S.Pulse) {
            if (this.j.i) {
                return dev.idhammai.P.A.S.f.N(this.p9.P(), this.j.P(), d2, this.pp.V(), this.t.e());
            }
            return dev.idhammai.P.A.S.f.x(this.p9.P(), d2, this.pp.V(), this.t.e());
        }
        if (this.pM.X() == dev.idhammai.c.r.q.N.S.Rainbow || this.R()) {
            double d3 = Math.ceil(((double)System.currentTimeMillis() * this.pv.e() + d2 * this.H.e()) / 20.0);
            return Color.getHSBColor((float)(d3 % 360.0 / 360.0), this.e.Z() / 255.0f, 1.0f);
        }
        return this.p9.P();
    }

    public void j() {
        J j2 = this.p7.X();
        if (j2 == null) {
            j2 = dev.idhammai.c.r.q.N.J.Dark;
        }
        if (j2 == dev.idhammai.c.r.q.N.J.Dark) {
            this.p8.a(new Color(30, 30, 30, 236));
            this.p8.i = true;
            this.G.a(new Color(30, 30, 30, 236));
            this.pJ.d(236.0);
            return;
        }
        if (j2 == dev.idhammai.c.r.q.N.J.Transparent) {
            this.p8.i = false;
            this.G.a(new Color(30, 30, 30, 50));
            this.pJ.d(0.0);
        }
    }

    public void E() {
        if (this.g.X() == dev.idhammai.c.r.q.N.e.Custom) {
            return;
        }
        T t2 = this.pN.X();
        if (t2 == null) {
            t2 = dev.idhammai.c.r.q.N.T.Static;
        }
        this.p9.a(new Color(0, 120, 212));
        this.f.a(new Color(0, 120, 212));
        this.pH.a(new Color(50, 50, 50, 200));
        this.G.a(new Color(30, 30, 30, 236));
        this.w.a(new Color(220, 220, 220));
        this.ps.a(new Color(255, 255, 255));
        this.p8.a(new Color(30, 30, 30, 236));
        this.p8.i = true;
        this.p9.Z = false;
        this.f.Z = false;
        this.X.Z = false;
        this.n.Z = false;
        this.pa.d(150.0);
        this.pq.d(220.0);
        this.C.d(210.0);
        this.pJ.d(236.0);
        this.p4.d(120.0);
        this.pS.d(200.0);
        this.pr.h(dev.idhammai.P.A.A.S.CubicInOut);
        this.pK.d(1000.0);
        this.pm.h(dev.idhammai.P.A.A.S.Bounce);
        this.pE.d(180.0);
        this.pb.h(dev.idhammai.P.A.A.S.CubicInOut);
        this.p0.d(160.0);
        this.h.h(dev.idhammai.P.A.A.S.CubicInOut);
        if (t2 == dev.idhammai.c.r.q.N.T.Static) {
            this.b.q(false);
            this.pM.h(dev.idhammai.c.r.q.N.S.Custom);
            this.X.i = true;
            this.X.Z = false;
            this.X.a(new Color(0, 120, 212, 36));
            this.n.Z = false;
            this.n.a(new Color(0, 0, 255, 50));
            this.j.i = false;
            this.j();
            return;
        }
        this.b.q(true);
        if (t2 == dev.idhammai.c.r.q.N.T.RainbowDelay) {
            this.pM.h(dev.idhammai.c.r.q.N.S.Rainbow);
            this.pv.d(1.0);
            this.e.d(210.0);
            this.H.d(50.0);
            this.w.a(new Color(255, 255, 255));
            this.X.i = true;
            this.X.Z = true;
            this.n.Z = false;
            this.n.a(new Color(255, 255, 255, 50));
            this.j.i = false;
            this.j();
            return;
        }
        if (t2 == dev.idhammai.c.r.q.N.T.WaterShader) {
            this.pM.h(dev.idhammai.c.r.q.N.S.Shader);
            this.pU.h(dev.idhammai.c.r.q.N.M.Water);
            this.p9.a(new Color(0, 120, 212));
            this.f.a(new Color(0, 120, 212));
            this.w.a(new Color(255, 255, 255));
            this.X.i = true;
            this.X.Z = false;
            this.X.a(new Color(0, 120, 212, 36));
            this.n.Z = false;
            this.n.a(new Color(0, 200, 255, 50));
            this.j.i = false;
            this.j();
            return;
        }
        if (t2 == dev.idhammai.c.r.q.N.T.SnowShader) {
            this.pM.h(dev.idhammai.c.r.q.N.S.Shader);
            this.pU.h(dev.idhammai.c.r.q.N.M.Snow);
            this.p9.a(new Color(235, 235, 235));
            this.f.a(new Color(235, 235, 235));
            this.w.a(new Color(255, 255, 255));
            this.X.i = true;
            this.X.Z = false;
            this.X.a(new Color(255, 255, 255, 32));
            this.n.Z = false;
            this.n.a(new Color(255, 255, 255, 50));
            this.j.i = false;
            this.j();
            return;
        }
        if (t2 == dev.idhammai.c.r.q.N.T.SmokeShader) {
            this.pM.h(dev.idhammai.c.r.q.N.S.Shader);
            this.pU.h(dev.idhammai.c.r.q.N.M.Smoke);
            this.p9.a(new Color(160, 160, 160));
            this.f.a(new Color(160, 160, 160));
            this.w.a(new Color(255, 255, 255));
            this.X.i = true;
            this.X.Z = false;
            this.X.a(new Color(160, 160, 160, 32));
            this.n.Z = false;
            this.n.a(new Color(200, 200, 200, 50));
            this.j.i = false;
            this.j();
            return;
        }
        if (t2 == dev.idhammai.c.r.q.N.T.RainbowShader) {
            this.pM.h(dev.idhammai.c.r.q.N.S.Shader);
            this.pU.h(dev.idhammai.c.r.q.N.M.Rainbow);
            this.pv.d(1.0);
            this.e.d(210.0);
            this.H.d(50.0);
            this.w.a(new Color(255, 255, 255));
            this.X.i = true;
            this.X.Z = true;
            this.n.Z = false;
            this.n.a(new Color(255, 255, 255, 50));
            this.j.i = false;
            this.j();
            return;
        }
        if (t2 == dev.idhammai.c.r.q.N.T.Pulse) {
            this.pM.h(dev.idhammai.c.r.q.N.S.Pulse);
            this.t.d(1.15);
            this.pp.d(14.0);
            this.p9.a(new Color(0, 120, 212));
            this.f.a(new Color(0, 120, 212));
            this.j.a(new Color(0, 255, 255, 255));
            this.j.i = true;
            this.X.i = true;
            this.X.Z = false;
            this.X.a(new Color(0, 120, 212, 36));
            this.n.Z = false;
            this.n.a(new Color(0, 255, 255, 24));
            this.j();
        }
    }

    public Color K(int n2) {
        return this.Q(n2);
    }

    private boolean lambda$new$12() {
        return this.J() && this.X.i;
    }

    private boolean lambda$new$11() {
        return this.J() && this.pM.X() == dev.idhammai.c.r.q.N.S.Custom;
    }

    private boolean lambda$new$10() {
        return this.J() && this.pM.X() == dev.idhammai.c.r.q.N.S.Pulse;
    }

    private boolean lambda$new$9() {
        return this.J() && this.pM.X() == dev.idhammai.c.r.q.N.S.Pulse;
    }

    private boolean lambda$new$8() {
        return this.J() && this.pM.X() == dev.idhammai.c.r.q.N.S.Pulse;
    }

    private boolean lambda$new$7() {
        return this.J() && this.pM.X() == dev.idhammai.c.r.q.N.S.Custom;
    }

    private boolean lambda$new$6() {
        return this.J() && (this.pM.X() == dev.idhammai.c.r.q.N.S.Rainbow || this.R());
    }

    private boolean lambda$new$5() {
        return this.J() && (this.pM.X() == dev.idhammai.c.r.q.N.S.Rainbow || this.R());
    }

    private boolean lambda$new$4() {
        return this.J() && (this.pM.X() == dev.idhammai.c.r.q.N.S.Rainbow || this.R());
    }

    private boolean lambda$new$3() {
        return this.J() && this.pM.X() == dev.idhammai.c.r.q.N.S.Shader;
    }

    private boolean lambda$new$2() {
        return this.J() && this.pM.X() == dev.idhammai.c.r.q.N.S.Shader;
    }

    private boolean lambda$new$1() {
        return this.E.X() == dev.idhammai.c.r.q.N.B.Blur || this.E.X() == dev.idhammai.c.r.q.N.B.Shader || this.E.X() == dev.idhammai.c.r.q.N.B.Rain2;
    }

    private static boolean lambda$new$0() {
        return false;
    }

    static {
        F = "";
    }
}

