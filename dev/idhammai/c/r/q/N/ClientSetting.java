/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.N;

import dev.idhammai.P.A.A.S;
import dev.idhammai.P.A.A.k;
import dev.idhammai.c.r.O.Y.B;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.O.Y.v;
import dev.idhammai.c.r.q.N.A;
import dev.idhammai.c.r.q.N.O;
import dev.idhammai.c.r.q.N.U;
import dev.idhammai.c.r.q.N.n;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import java.awt.Color;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class I
extends y {
    public static final k K = new k();
    public static I Q;
    public final B<A> X = this.S(new B<A>("Page", dev.idhammai.c.r.q.N.A.Game).I("\u9875\u9762").X(dev.idhammai.c.r.q.N.A.Game, "\u6e38\u620f").X(dev.idhammai.c.r.q.N.A.Gui, "\u754c\u9762").X(dev.idhammai.c.r.q.N.A.Misc, "\u6742\u9879").X(dev.idhammai.c.r.q.N.A.Notification, "\u901a\u77e5").X(dev.idhammai.c.r.q.N.A.ChatHud, "\u804a\u5929\u680f"));
    public final W s = this.S(new W("1.12", false, this::lambda$new$0).k("1.12\u517c\u5bb9"));
    public final W p = this.S(new W("Crawl", true, this::lambda$new$1).k("\u722c\u884c\u4fee\u590d"));
    public final W A = this.S(new W("ShowRotations", true, this::lambda$new$2).k("\u663e\u793a\u8f6c\u5411").D());
    public final W T = this.S(new W("Sync", false, this::lambda$new$3).k("\u8f6c\u5411\u540c\u6b65"));
    public final W h = this.S(new W("TitleFix", true, this::lambda$new$4).k("\u6807\u9898\u4fee\u590d"));
    public final W u = this.S(new W("FuckFPSLimit", true, this::lambda$new$5).k("\u89e3\u9664FPS\u9650\u5236"));
    private final W J = this.S(new W("BlockTickNausea", true, this::lambda$new$6).k("\u963b\u6b62\u4f20\u9001\u95e8\u7729\u6655"));
    public final W d = this.S(new W("OptimizedCalc", false, this::lambda$new$7).k("\u4f18\u5316\u8ba1\u7b97"));
    public final W D = this.S(new W("MioCompatible", false, this::lambda$new$8).k("Mio\u517c\u5bb9"));
    public final v I = this.E(new v("Prefix", ";", this::lambda$new$9).c("\u547d\u4ee4\u524d\u7f00"));
    public final W C = this.S(new W("Chinese", true, this::lambda$new$10).k("\u4e2d\u6587\u754c\u9762"));
    public final W w = this.S(new W("TitleOverride", true, this::lambda$new$11).k("\u81ea\u5b9a\u4e49\u6807\u9898").D());
    public final v n = this.E(new v("WindowTitle", "Frog", this::lambda$new$12).c("\u7a97\u53e3\u6807\u9898"));
    public final W M = this.S(new W("DebugException", true, this::lambda$new$13).k("\u8c03\u8bd5\u5f02\u5e38"));
    public final W B = this.S(new W("CaughtException", false, this::lambda$new$14).k("\u6355\u83b7\u5f02\u5e38").D());
    public final W F = this.S(new W("Log", true, this::lambda$new$15).k("\u8bb0\u5f55\u65e5\u5fd7"));
    private final W f = this.S(new W("HotbarAnim", true, this::lambda$new$16).k("\u5feb\u6377\u680f\u52a8\u753b"));
    public final l b = this.p(new l("HotbarTime", 100, 0, 1000, this::lambda$new$17).D("\u5feb\u6377\u680f\u65f6\u957f"));
    public final B<S> e = this.S(new B<S>("AnimEase", dev.idhammai.P.A.A.S.CubicInOut, this::lambda$new$18).I("\u5feb\u6377\u680f\u7f13\u52a8"));
    public final W Z = this.S(new W("Darkening", true, this::lambda$new$19).k("\u80cc\u666f\u53d8\u6697"));
    public final v Y = this.E(new v("Notification", "[Frog]", this::lambda$new$20).c("\u901a\u77e5\u524d\u7f00"));
    public final dev.idhammai.c.r.O.Y.A a = this.y(new dev.idhammai.c.r.O.Y.A("Color", new Color(255, 38, 38), this::lambda$new$21).P("\u901a\u77e5\u989c\u8272"));
    public final B<O> g = this.S(new B<O>("Style", O.Mio, this::lambda$new$22).I("\u6d88\u606f\u6837\u5f0f"));
    public final W G = this.S(new W("ModuleToggle", true, this::lambda$new$23).k("\u6a21\u5757\u5f00\u5173\u901a\u77e5").D());
    public final W H = this.S(new W("OnlyOne", false, this::lambda$new$24).k("\u4ec5\u663e\u793a\u4e00\u6761"));
    public final W j = this.S(new W("ToggleBanner", true, this::lambda$new$25).k("\u6a2a\u5e45\u901a\u77e5").D());
    public final B<n> c = this.S(new B<n>("BannerStyle", dev.idhammai.c.r.q.N.n.iOS, this::lambda$new$26).I("\u6a2a\u5e45\u6837\u5f0f").X(dev.idhammai.c.r.q.N.n.iOS, "iOS").X(dev.idhammai.c.r.q.N.n.Classic, "\u7ecf\u5178"));
    public final B<U> V = this.S(new B<U>("BannerStack", dev.idhammai.c.r.q.N.U.Down, this::lambda$new$27).I("\u6a2a\u5e45\u5806\u53e0").X(dev.idhammai.c.r.q.N.U.Down, "\u5411\u4e0b").X(dev.idhammai.c.r.q.N.U.Up, "\u5411\u4e0a"));
    public final l R = this.p(new l("BannerFade", 160, 0, 1000, this::lambda$new$28).D("\u6a2a\u5e45\u6de1\u5165"));
    public final l r = this.p(new l("BannerHold", 1000, 0, 3000, this::lambda$new$29).D("\u6a2a\u5e45\u505c\u7559"));
    public final W y = this.S(new W("BannerSound", true, this::lambda$new$30).k("\u6a2a\u5e45\u97f3\u6548").D());
    public final l m = this.p(new l("BannerPitch", 1.0, 0.5, 2.0, 0.05, this::lambda$new$31).D("\u6a2a\u5e45\u97f3\u8c03"));
    public final W P = this.S(new W("KeepHistory", true, this::lambda$new$32).k("\u4fdd\u7559\u5386\u53f2"));
    public final W L = this.S(new W("InfiniteChat", true, this::lambda$new$33).k("\u65e0\u9650\u804a\u5929\u884c"));
    public final W t = this.S(new W("HideIndicator", true, this::lambda$new$34).k("\u9690\u85cf\u672a\u8bfb\u6307\u793a"));
    public final l l = this.p(new l("AnimationTime", 300, 0, 1000, this::lambda$new$35).D("\u804a\u5929\u52a8\u753b\u65f6\u957f"));
    public final B<S> U = this.S(new B<S>("Ease", dev.idhammai.P.A.A.S.CubicInOut, this::lambda$new$36).I("\u804a\u5929\u7f13\u52a8"));
    public final l N = this.p(new l("Offset", -40, -200, 100, this::lambda$new$37).D("\u804a\u5929\u504f\u79fb"));
    public final W k = this.S(new W("Fade", true, this::lambda$new$38).k("\u804a\u5929\u6de1\u5165\u6de1\u51fa"));

    public I() {
        super("ClientSetting", dev.idhammai.c.r.w.Client);
        this.L("\u5ba2\u6237\u7aef\u8bbe\u7f6e");
        Q = this;
    }

    public boolean w() {
        return this.p() && this.J.h();
    }

    public boolean U() {
        return this.p() && this.f.h();
    }

    @Override
    public void C() {
        this.S = true;
    }

    @Override
    public void p() {
        this.S = true;
    }

    @Override
    public boolean p() {
        return true;
    }

    private boolean lambda$new$38() {
        return this.X.X() == dev.idhammai.c.r.q.N.A.ChatHud;
    }

    private boolean lambda$new$37() {
        return this.X.X() == dev.idhammai.c.r.q.N.A.ChatHud;
    }

    private boolean lambda$new$36() {
        return this.X.X() == dev.idhammai.c.r.q.N.A.ChatHud;
    }

    private boolean lambda$new$35() {
        return this.X.X() == dev.idhammai.c.r.q.N.A.ChatHud;
    }

    private boolean lambda$new$34() {
        return this.X.X() == dev.idhammai.c.r.q.N.A.ChatHud;
    }

    private boolean lambda$new$33() {
        return this.X.X() == dev.idhammai.c.r.q.N.A.ChatHud;
    }

    private boolean lambda$new$32() {
        return this.X.X() == dev.idhammai.c.r.q.N.A.ChatHud;
    }

    private boolean lambda$new$31() {
        return this.X.X() == dev.idhammai.c.r.q.N.A.Notification && this.j.f() && this.y.h();
    }

    private boolean lambda$new$30() {
        return this.X.X() == dev.idhammai.c.r.q.N.A.Notification && this.j.f();
    }

    private boolean lambda$new$29() {
        return this.X.X() == dev.idhammai.c.r.q.N.A.Notification && this.j.f();
    }

    private boolean lambda$new$28() {
        return this.X.X() == dev.idhammai.c.r.q.N.A.Notification && this.j.f();
    }

    private boolean lambda$new$27() {
        return this.X.X() == dev.idhammai.c.r.q.N.A.Notification && this.j.f();
    }

    private boolean lambda$new$26() {
        return this.X.X() == dev.idhammai.c.r.q.N.A.Notification && this.j.f();
    }

    private boolean lambda$new$25() {
        return this.X.X() == dev.idhammai.c.r.q.N.A.Notification;
    }

    private boolean lambda$new$24() {
        return this.X.X() == dev.idhammai.c.r.q.N.A.Notification && this.G.f();
    }

    private boolean lambda$new$23() {
        return this.X.X() == dev.idhammai.c.r.q.N.A.Notification;
    }

    private boolean lambda$new$22() {
        return this.X.X() == dev.idhammai.c.r.q.N.A.Notification;
    }

    private boolean lambda$new$21() {
        return this.X.X() == dev.idhammai.c.r.q.N.A.Notification;
    }

    private boolean lambda$new$20() {
        return this.X.X() == dev.idhammai.c.r.q.N.A.Notification;
    }

    private boolean lambda$new$19() {
        return this.X.x(dev.idhammai.c.r.q.N.A.Gui);
    }

    private boolean lambda$new$18() {
        return this.X.x(dev.idhammai.c.r.q.N.A.Gui);
    }

    private boolean lambda$new$17() {
        return this.X.x(dev.idhammai.c.r.q.N.A.Gui);
    }

    private boolean lambda$new$16() {
        return this.X.x(dev.idhammai.c.r.q.N.A.Gui);
    }

    private boolean lambda$new$15() {
        return this.X.x(dev.idhammai.c.r.q.N.A.Misc) && this.B.f();
    }

    private boolean lambda$new$14() {
        return this.X.x(dev.idhammai.c.r.q.N.A.Misc);
    }

    private boolean lambda$new$13() {
        return this.X.x(dev.idhammai.c.r.q.N.A.Misc);
    }

    private boolean lambda$new$12() {
        return this.X.x(dev.idhammai.c.r.q.N.A.Misc) && this.w.f();
    }

    private boolean lambda$new$11() {
        return this.X.x(dev.idhammai.c.r.q.N.A.Misc);
    }

    private boolean lambda$new$10() {
        return this.X.x(dev.idhammai.c.r.q.N.A.Misc);
    }

    private boolean lambda$new$9() {
        return this.X.x(dev.idhammai.c.r.q.N.A.Misc);
    }

    private boolean lambda$new$8() {
        return this.X.x(dev.idhammai.c.r.q.N.A.Game);
    }

    private boolean lambda$new$7() {
        return this.X.x(dev.idhammai.c.r.q.N.A.Game);
    }

    private boolean lambda$new$6() {
        return this.X.x(dev.idhammai.c.r.q.N.A.Game);
    }

    private boolean lambda$new$5() {
        return this.X.x(dev.idhammai.c.r.q.N.A.Game);
    }

    private boolean lambda$new$4() {
        return this.X.x(dev.idhammai.c.r.q.N.A.Game);
    }

    private boolean lambda$new$3() {
        return this.X.x(dev.idhammai.c.r.q.N.A.Game) && this.A.f();
    }

    private boolean lambda$new$2() {
        return this.X.x(dev.idhammai.c.r.q.N.A.Game);
    }

    private boolean lambda$new$1() {
        return this.X.x(dev.idhammai.c.r.q.N.A.Game);
    }

    private boolean lambda$new$0() {
        return this.X.x(dev.idhammai.c.r.q.N.A.Game);
    }
}

