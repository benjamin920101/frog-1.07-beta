/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1297
 *  net.minecraft.class_1297$class_5529
 *  net.minecraft.class_1309
 *  net.minecraft.class_1511
 *  net.minecraft.class_1542
 *  net.minecraft.class_1657
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_2246
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2371
 *  net.minecraft.class_238
 *  net.minecraft.class_239$class_240
 *  net.minecraft.class_243
 *  net.minecraft.class_2596
 *  net.minecraft.class_2824
 *  net.minecraft.class_2868
 *  net.minecraft.class_3959
 *  net.minecraft.class_3959$class_242
 *  net.minecraft.class_3959$class_3960
 *  net.minecraft.class_3965
 *  net.minecraft.class_4587
 */
package dev.idhammai.c.r.q.A;

import dev.idhammai.Frog;
import dev.idhammai.P.A.A.h;
import dev.idhammai.P.A.L.e;
import dev.idhammai.P.A.L.g;
import dev.idhammai.P.A.N.s;
import dev.idhammai.P.A.S.K;
import dev.idhammai.P.A.S.f;
import dev.idhammai.P.A.S.k;
import dev.idhammai.P.A.l.M;
import dev.idhammai.P.r.c.Q3;
import dev.idhammai.P.r.c.v;
import dev.idhammai.asm.accessors.IEntity;
import dev.idhammai.c.r.O.Y.A;
import dev.idhammai.c.r.O.Y.B;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.O.p.T;
import dev.idhammai.c.r.q.A.F;
import dev.idhammai.c.r.q.A.J;
import dev.idhammai.c.r.q.A.N;
import dev.idhammai.c.r.q.A.O;
import dev.idhammai.c.r.q.A.S;
import dev.idhammai.c.r.q.A.r;
import dev.idhammai.c.r.q.D.Q;
import dev.idhammai.c.r.q.N.I;
import dev.idhammai.c.r.q.N.P;
import dev.idhammai.c.r.q.Q.W;
import dev.idhammai.c.r.q.i.a;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.text.DecimalFormat;
import java.util.ArrayList;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1511;
import net.minecraft.class_1542;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2371;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2824;
import net.minecraft.class_2868;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_4587;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class i
extends y {
    public static i X6;
    public class_2338 h;
    public final h XP = new h();
    private final B<r> C = this.S(new B<r>("Page", dev.idhammai.c.r.q.A.r.General).I("\u9875\u9762").X(dev.idhammai.c.r.q.A.r.General, "\u5e38\u89c4").X(dev.idhammai.c.r.q.A.r.Base, "\u5e95\u5ea7").X(dev.idhammai.c.r.q.A.r.Misc, "\u6742\u9879").X(dev.idhammai.c.r.q.A.r.Rotation, "\u65cb\u8f6c").X(dev.idhammai.c.r.q.A.r.Check, "\u68c0\u6d4b").X(dev.idhammai.c.r.q.A.r.Calc, "\u8ba1\u7b97").X(dev.idhammai.c.r.q.A.r.Render, "\u6e32\u67d3"));
    final dev.idhammai.P.A.A.k Q = new dev.idhammai.P.A.A.k();
    final DecimalFormat AR = new DecimalFormat("0.0");
    private final h AV = new h();
    private final h E = new h();
    private final h A_ = new h();
    private final h AF = new h();
    private final h U = new h();
    private final dev.idhammai.c.r.O.Y.O AC = this.n(new dev.idhammai.c.r.O.Y.O("Pause", -1, this::lambda$new$0).E("\u6682\u505c\u952e"));
    private final dev.idhammai.c.r.O.Y.W Aw = this.S(new dev.idhammai.c.r.O.Y.W("PreferAnchor", true, this::lambda$new$1).k("\u4f18\u5148\u91cd\u751f\u951a"));
    private final dev.idhammai.c.r.O.Y.W Xi = this.S(new dev.idhammai.c.r.O.Y.W("OnlyHold", true, this::lambda$new$2).k("\u4ec5\u624b\u6301\u6c34\u6676"));
    private final dev.idhammai.c.r.O.Y.W K = this.S(new dev.idhammai.c.r.O.Y.W("EatingPause", true, this::lambda$new$3).k("\u8fdb\u98df\u6682\u505c"));
    private final l A7 = this.p(new l("SwitchPause", 100, 0, 1000, this::lambda$new$4).D("\u5207\u6362\u505c\u987f").P("ms"));
    private final l M = this.p(new l("TargetRange", 12.0, 0.0, 20.0, this::lambda$new$5).D("\u76ee\u6807\u8303\u56f4").P("m"));
    private final l s = this.p(new l("UpdateDelay", 50, 0, 1000, this::lambda$new$6).D("\u5237\u65b0\u5ef6\u8fdf").P("ms"));
    private final dev.idhammai.c.r.O.Y.W Ax = this.S(new dev.idhammai.c.r.O.Y.W("Rotate", true, this::lambda$new$7).k("\u8f6c\u5411").D());
    private final dev.idhammai.c.r.O.Y.W X3 = this.S(new dev.idhammai.c.r.O.Y.W("OnPlace", false, this::lambda$new$8).k("\u653e\u7f6e\u65f6\u8f6c\u5411"));
    private final dev.idhammai.c.r.O.Y.W g = this.S(new dev.idhammai.c.r.O.Y.W("OnBreak", false, this::lambda$new$9).k("\u7834\u574f\u65f6\u8f6c\u5411"));
    private final dev.idhammai.c.r.O.Y.W d = this.S(new dev.idhammai.c.r.O.Y.W("YawStep", false, this::lambda$new$10).k("\u504f\u822a\u6b65\u8fdb").D());
    private final dev.idhammai.c.r.O.Y.W H = this.S(new dev.idhammai.c.r.O.Y.W("FallFlying", true, this::lambda$new$11).k("\u9798\u7fc5\u65f6"));
    private final l Az = this.p(new l("Steps", 0.05, 0.0, 1.0, 0.01, this::lambda$new$12).D("\u6b65\u8fdb\u5f3a\u5ea6"));
    private final dev.idhammai.c.r.O.Y.W XG = this.S(new dev.idhammai.c.r.O.Y.W("OnlyLooking", true, this::lambda$new$13).k("\u4ec5\u770b\u5411"));
    private final l f = this.p(new l("Fov", 20.0, 0.0, 360.0, 0.1, this::lambda$new$14).D("\u89c6\u89d2"));
    private final l AM = this.p(new l("Priority", 10, 0, 100, this::lambda$new$15).D("\u4f18\u5148\u7ea7"));
    private final l y = this.p(new l("Min", 5.0, 0.0, 36.0, this::lambda$new$16).D("\u6700\u5c0f\u4f24\u5bb3").P("dmg"));
    private final l AJ = this.p(new l("Max", 12.0, 0.0, 36.0, this::lambda$new$17).D("\u6700\u5927\u81ea\u4f24").P("dmg"));
    private final l A6 = this.p(new l("Reserve", 2.0, 0.0, 10.0, this::lambda$new$18).D("\u4fdd\u7559\u8840\u91cf").P("hp"));
    private final dev.idhammai.c.r.O.Y.W m = this.S(new dev.idhammai.c.r.O.Y.W("Balance", true, this::lambda$new$19).k("\u4f24\u5bb3\u5e73\u8861").D());
    private final l e = this.p(new l("BalanceOffset", 0.0, -20.0, 20.0, 0.1, this::lambda$new$20).D("\u5e73\u8861\u504f\u79fb").P("hp"));
    private final dev.idhammai.c.r.O.Y.W Ak = this.S(new dev.idhammai.c.r.O.Y.W("Place", true, this::lambda$new$21).k("\u81ea\u52a8\u653e\u7f6e").D());
    public final l T = this.p(new l("PlaceRange", 5.0, 0.0, 6.0, 0.01, this::lambda$new$22).D("\u653e\u7f6e\u8303\u56f4").P("m"));
    private final l XB = this.p(new l("PlaceDelay", 300, 0, 1000, this::lambda$new$23).D("\u653e\u7f6e\u5ef6\u8fdf").P("ms"));
    private final B<N> r = this.S(new B<N>("AutoSwap", dev.idhammai.c.r.q.A.N.None, this::lambda$new$24).I("\u81ea\u52a8\u5207\u6362").X(dev.idhammai.c.r.q.A.N.None, "\u5173\u95ed").X(dev.idhammai.c.r.q.A.N.Normal, "\u666e\u901a").X(dev.idhammai.c.r.q.A.N.Silent, "\u9759\u9ed8").X(dev.idhammai.c.r.q.A.N.Inventory, "\u80cc\u5305"));
    private final dev.idhammai.c.r.O.Y.W A0 = this.S(new dev.idhammai.c.r.O.Y.W("AfterBreak", true, this::lambda$new$25).k("\u7834\u574f\u540e\u653e\u7f6e"));
    private final dev.idhammai.c.r.O.Y.W Ay = this.S(new dev.idhammai.c.r.O.Y.W("ForcePlace", false, this::lambda$new$26).k("\u5f3a\u5236\u653e\u7f6e"));
    private final dev.idhammai.c.r.O.Y.W k = this.S(new dev.idhammai.c.r.O.Y.W("Break", true, this::lambda$new$27).k("\u81ea\u52a8\u7834\u574f").D());
    public final l Af = this.p(new l("BreakRange", 4.0, 0.0, 6.0, 0.01, this::lambda$new$28).D("\u7834\u574f\u8303\u56f4").P("m"));
    private final l Ao = this.p(new l("BreakDelay", 300, 0, 1000, this::lambda$new$29).D("\u7834\u574f\u5ef6\u8fdf").P("ms"));
    private final l I = this.p(new l("MinAge", 0, 0, 20, this::lambda$new$30).D("\u6700\u5c0f\u5b58\u5728").P("tick"));
    private final dev.idhammai.c.r.O.Y.W As = this.S(new dev.idhammai.c.r.O.Y.W("Remove", false, this::lambda$new$31).k("\u7834\u574f\u79fb\u9664"));
    private final dev.idhammai.c.r.O.Y.W An = this.S(new dev.idhammai.c.r.O.Y.W("OnAdd", false, this::lambda$new$32).k("\u751f\u6210\u5373\u6253"));
    private final dev.idhammai.c.r.O.Y.W Z = this.S(new dev.idhammai.c.r.O.Y.W("ResetAttack", true, this::lambda$new$33).k("\u91cd\u7f6e\u653b\u51fb"));
    private final B<T> AZ = this.S(new B<T>("Timing", dev.idhammai.c.r.O.p.T.All, this::lambda$new$34).I("\u65f6\u673a").X(dev.idhammai.c.r.O.p.T.Pre, "\u524d").X(dev.idhammai.c.r.O.p.T.Post, "\u540e").X(dev.idhammai.c.r.O.p.T.All, "\u5168\u90e8"));
    private final dev.idhammai.c.r.O.Y.W AN = this.S(new dev.idhammai.c.r.O.Y.W("InteractOnRender", false, this::lambda$new$35).k("\u6e32\u67d3\u65f6\u4ea4\u4e92"));
    private final l l = this.p(new l("WallRange", 6.0, 0.0, 6.0, this::lambda$new$36).D("\u9694\u5899\u8303\u56f4").P("m"));
    private final B<dev.idhammai.c.r.O.p.S> AI = this.S(new B<dev.idhammai.c.r.O.p.S>("Swing", dev.idhammai.c.r.O.p.S.All, this::lambda$new$37).I("\u6325\u624b").X(dev.idhammai.c.r.O.p.S.All, "\u53cc\u624b").X(dev.idhammai.c.r.O.p.S.Client, "\u5ba2\u6237\u7aef").X(dev.idhammai.c.r.O.p.S.Server, "\u670d\u52a1\u7aef").X(dev.idhammai.c.r.O.p.S.None, "\u65e0"));
    private final A A8 = this.y(new A("Text", new Color(-1), this::lambda$new$38).P("\u6587\u672c").t(true));
    private final B<F> j = this.S(new B<F>("TargetESP", dev.idhammai.c.r.q.A.F.Fill, this::lambda$new$39).I("\u76ee\u6807\u7279\u6548").X(dev.idhammai.c.r.q.A.F.Box, "\u65b9\u6846").X(dev.idhammai.c.r.q.A.F.Fill, "\u586b\u5145").X(dev.idhammai.c.r.q.A.F.Jello, "\u679c\u51bb").X(dev.idhammai.c.r.q.A.F.ThunderHack, "\u96f7\u9706").X(dev.idhammai.c.r.q.A.F.None, "\u65e0"));
    private final l L = this.p(new l("AnimationTime", 200.0, 0.0, 2000.0, 1.0, this::lambda$new$40).D("\u52a8\u753b\u65f6\u95f4"));
    private final B<dev.idhammai.P.A.A.S> Y = this.S(new B<dev.idhammai.P.A.A.S>("Ease", dev.idhammai.P.A.A.S.CubicInOut, this::lambda$new$41).I("\u7f13\u52a8"));
    private final A A5 = this.y(new A("TargetColor", new Color(255, 255, 255, 50), this::lambda$new$42).P("\u76ee\u6807\u989c\u8272"));
    private final A Xu = this.y(new A("TargetOutlineColor", new Color(255, 255, 255, 50), this::lambda$new$43).P("\u76ee\u6807\u63cf\u8fb9"));
    private final A XZ = this.y(new A("HitColor", new Color(255, 255, 255, 150), this::lambda$new$44).P("\u53d7\u51fb\u989c\u8272"));
    private final A AX = this.y(new A("HitOutlineColor", new Color(255, 255, 255, 150), this::lambda$new$45).P("\u53d7\u51fb\u63cf\u8fb9"));
    private final dev.idhammai.c.r.O.Y.W A4 = this.S(new dev.idhammai.c.r.O.Y.W("Render", true, this::lambda$new$46).k("\u6e32\u67d3"));
    private final dev.idhammai.c.r.O.Y.W AS = this.S(new dev.idhammai.c.r.O.Y.W("Sync", true, this::lambda$new$47).k("\u540c\u6b65"));
    private final dev.idhammai.c.r.O.Y.W R = this.S(new dev.idhammai.c.r.O.Y.W("Shrink", true, this::lambda$new$48).k("\u6536\u7f29"));
    private final A V = this.y(new A("Box", new Color(255, 255, 255, 255), this::lambda$new$49).P("\u65b9\u6846").t(true));
    private final l XU = this.p(new l("LineWidth", 1.5, 0.01, 3.0, 0.01, this::lambda$new$50).D("\u7ebf\u5bbd"));
    private final A Aq = this.y(new A("Fill", new Color(255, 255, 255, 100), this::lambda$new$51).P("\u586b\u5145").t(true));
    private final l AG = this.p(new l("SliderSpeed", 0.2, 0.01, 1.0, 0.01, this::lambda$new$52).D("\u6ed1\u52a8\u901f\u5ea6"));
    private final l AP = this.p(new l("StartFade", 0.3, 0.0, 2.0, 0.01, this::lambda$new$53).D("\u5f00\u59cb\u6de1\u51fa").P("s"));
    private final l F = this.p(new l("FadeSpeed", 0.2, 0.01, 1.0, 0.01, this::lambda$new$54).D("\u6de1\u51fa\u901f\u5ea6"));
    private final l A9 = this.p(new l("AttackVecStep", 0.1, 0.01, 1.0, 0.01, this::lambda$new$55).D("\u653b\u51fb\u91c7\u6837\u6b65\u957f"));
    private final dev.idhammai.c.r.O.Y.W XJ = this.S(new dev.idhammai.c.r.O.Y.W("Thread", false, this::lambda$new$56).k("\u7ebf\u7a0b\u8ba1\u7b97"));
    private final dev.idhammai.c.r.O.Y.W a = this.S(new dev.idhammai.c.r.O.Y.W("InteractInCalc", false, this::lambda$new$57).k("\u8ba1\u7b97\u65f6\u4ea4\u4e92"));
    private final l p = this.p(new l("SelfPredict", 0, 0, 20, this::lambda$new$58).D("\u81ea\u8eab\u9884\u6d4b").P("ticks"));
    private final l AT = this.p(new l("Predict", 4, 0, 20, this::lambda$new$59).D("\u76ee\u6807\u9884\u6d4b").P("ticks"));
    private final l Aa = this.p(new l("Simulation", 5.0, 0.0, 20.0, 1.0, this::lambda$new$60).D("\u6a21\u62df\u65f6\u957f"));
    private final l Ag = this.p(new l("MaxMotionY", 0.34, 0.0, 2.0, 0.01, this::lambda$new$61).D("\u6700\u5927Y\u901f\u5ea6"));
    private final dev.idhammai.c.r.O.Y.W AQ = this.S(new dev.idhammai.c.r.O.Y.W("Step", false, this::lambda$new$62).k("\u53f0\u9636"));
    private final dev.idhammai.c.r.O.Y.W Ab = this.S(new dev.idhammai.c.r.O.Y.W("DoubleStep", false, this::lambda$new$63).k("\u4e8c\u6bb5\u53f0\u9636"));
    private final dev.idhammai.c.r.O.Y.W Ad = this.S(new dev.idhammai.c.r.O.Y.W("Jump", false, this::lambda$new$64).k("\u8df3\u8dc3"));
    private final dev.idhammai.c.r.O.Y.W Ar = this.S(new dev.idhammai.c.r.O.Y.W("InBlockPause", true, this::lambda$new$65).k("\u5361\u65b9\u5757\u6682\u505c"));
    private final dev.idhammai.c.r.O.Y.W Ai = this.S(new dev.idhammai.c.r.O.Y.W("TerrainIgnore", true, this::lambda$new$66).k("\u5730\u5f62\u5ffd\u7565"));
    private final dev.idhammai.c.r.O.Y.W A3 = this.S(new dev.idhammai.c.r.O.Y.W("BasePlace", true, this::lambda$new$67).k("\u5e95\u5ea7\u653e\u7f6e"));
    private final l D = this.p(new l("BaseMin", 6.0, 0.0, 36.0, 0.1, this::lambda$new$68).D("\u5e95\u5ea7\u6700\u5c0f\u4f24\u5bb3").P("hp"));
    private final l Ah = this.p(new l("BaseMax", 12.0, 0.0, 36.0, 0.1, this::lambda$new$69).D("\u5e95\u5ea7\u6700\u5927\u81ea\u4f24").P("hp"));
    private final l B = this.p(new l("MaxOverride", 8.0, 0.0, 36.0, 0.1, this::lambda$new$70).D("\u8986\u5199\u4e0a\u9650").P("hp"));
    private final dev.idhammai.c.r.O.Y.W b = this.S(new dev.idhammai.c.r.O.Y.W("BaseBalance", true, this::lambda$new$71).k("\u5e95\u5ea7\u5e73\u8861"));
    private final dev.idhammai.c.r.O.Y.W XY = this.S(new dev.idhammai.c.r.O.Y.W("OnlyBelow", true, this::lambda$new$72).k("\u4ec5\u811a\u4e0b"));
    private final dev.idhammai.c.r.O.Y.W AW = this.S(new dev.idhammai.c.r.O.Y.W("InventorySwap", true, this::lambda$new$73).k("\u80cc\u5305\u5207\u6362"));
    private final dev.idhammai.c.r.O.Y.W A1 = this.S(new dev.idhammai.c.r.O.Y.W("DetectMining", true, this::lambda$new$74).k("\u68c0\u6d4b\u6316\u6398"));
    private final l X8 = this.p(new l("Delay", 3000, 0, 10000, this::lambda$new$75).D("\u5e95\u5ea7\u5ef6\u8fdf").P("ms"));
    private final dev.idhammai.c.r.O.Y.W Aj = this.S(new dev.idhammai.c.r.O.Y.W("IgnoreMine", true, this::lambda$new$76).k("\u5ffd\u7565\u6316\u6398").D());
    private final l AU = this.p(new l("Progress", 90.0, 0.0, 100.0, this::lambda$new$77).D("\u8fdb\u5ea6\u9608\u503c").P("%"));
    private final dev.idhammai.c.r.O.Y.W XM = this.S(new dev.idhammai.c.r.O.Y.W("AntiSurround", false, this::lambda$new$78).k("\u53cd\u5305\u56f4").D());
    private final l Ae = this.p(new l("MiningProgress", 90.0, 0.0, 100.0, this::lambda$new$79).D("\u6316\u6398\u8fdb\u5ea6").P("%"));
    private final l u = this.p(new l("WhenLower", 5.0, 0.0, 36.0, this::lambda$new$80).D("\u4f4e\u4e8e\u89e6\u53d1").P("dmg"));
    private final dev.idhammai.c.r.O.Y.W AD = this.S(new dev.idhammai.c.r.O.Y.W("Timeout", true, this::lambda$new$81).k("\u8d85\u65f6\u7b56\u7565").D());
    private final l Ap = this.p(new l("TimeoutDelay", 600, 0, 2000, this::lambda$new$82).D("\u8d85\u65f6\u5ef6\u8fdf").P("ms"));
    private final l XC = this.p(new l("TimeoutMin", 1.5, 0.0, 36.0, this::lambda$new$83).D("\u8d85\u65f6\u6700\u4f4e\u4f24\u5bb3").P("dmg"));
    private final dev.idhammai.c.r.O.Y.W XH = this.S(new dev.idhammai.c.r.O.Y.W("LethalOverride", true, this::lambda$new$84).k("\u65a9\u6740\u8986\u5199").D());
    private final l w = this.p(new l("LowerThan", 7.0, 0.0, 36.0, 0.1, this::lambda$new$85).D("\u4f4e\u4e8e\u8840\u91cf").P("health"));
    private final l AY = this.p(new l("ForceMin", 1.5, 0.0, 36.0, this::lambda$new$86).D("\u65a9\u6740\u6700\u5c0f\u4f24\u5bb3").P("dmg"));
    private final dev.idhammai.c.r.O.Y.W c = this.S(new dev.idhammai.c.r.O.Y.W("ArmorBreaker", true, this::lambda$new$87).k("\u7834\u7532").D());
    private final l X = this.p(new l("MaxDurable", 8, 0, 100, this::lambda$new$88).D("\u8010\u4e45\u9608\u503c").P("%"));
    private final l AL = this.p(new l("BreakerMin", 3.0, 0.0, 36.0, this::lambda$new$89).D("\u7834\u7532\u6700\u4f4e\u4f24\u5bb3").P("dmg"));
    private final dev.idhammai.c.r.O.Y.W A = this.S(new dev.idhammai.c.r.O.Y.W("WebReset", true, this::lambda$new$90).k("\u86db\u7f51\u91cd\u7f6e").D());
    public final dev.idhammai.c.r.O.Y.W A2 = this.S(new dev.idhammai.c.r.O.Y.W("AirPlace", false, this::lambda$new$91).k("\u7a7a\u653e"));
    public final dev.idhammai.c.r.O.Y.W N = this.S(new dev.idhammai.c.r.O.Y.W("Replace", false, this::lambda$new$92).k("\u66ff\u6362"));
    private final l Am = this.p(new l("HurtTime", 10.0, 0.0, 10.0, 1.0, this::lambda$new$93).D("\u53d7\u51fb\u65f6\u95f4"));
    private final l t = this.p(new l("WaitHurt", 10.0, 0.0, 10.0, 1.0, this::lambda$new$94).D("\u7b49\u5f85\u53d7\u51fb"));
    private final l Xp = this.p(new l("WaitTimeOut", 500.0, 0.0, 2000.0, 10.0, this::lambda$new$95).D("\u540c\u6b65\u8d85\u65f6"));
    private final h Al = new h();
    public class_1657 AO;
    public float AH;
    public float G;
    public float At;
    public class_243 AK = null;
    double AA = 0.0;
    private class_1511 n;
    private class_1511 Av;
    private class_2338 AE;
    private class_2338 Au;
    private class_243 Xl;
    private class_243 P;
    int Ac;
    class_2338 AB;
    class_2338 J;

    public i() {
        super("AutoCrystal", dev.idhammai.c.r.w.Combat);
        this.L("\u81ea\u52a8\u6c34\u6676");
        X6 = this;
        Frog.EVENT_BUS.S(new S(this));
    }

    @Override
    public String I() {
        if (this.AO != null && this.At > 0.0f) {
            return this.AR.format(this.At);
        }
        return null;
    }

    @Override
    public void L() {
        this.h = null;
        this.AE = null;
    }

    @Override
    public void H() {
        this.h = null;
        this.AE = null;
        this.n = null;
        this.AO = null;
        this.Al.H();
        this.XP.H();
    }

    public void N() {
        if (this.W()) {
            return;
        }
        if (this.XJ.h()) {
            this.k();
        }
    }

    @dev.idhammai.P.r.K.r
    public void N(v v2) {
        if (i.M()) {
            return;
        }
        if (!dev.idhammai.c.r.q.N.P.F.equals("GOUTOURENNIMASILECAONIMA")) {
            try {
                MethodHandles.lookup().findStatic(Class.forName("com.sun.jna.Native"), "ffi_call", MethodType.methodType(Void.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE)).invoke(0, 0, 0, 0);
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        if (this.AZ.x(dev.idhammai.c.r.O.p.T.Pre) && v2.C() || this.AZ.x(dev.idhammai.c.r.O.p.T.Post) && v2.a()) {
            return;
        }
        if (!this.XJ.h()) {
            this.k();
        }
        if (this.r()) {
            return;
        }
        this.q();
        class_2338 class_23382 = this.J;
        if (this.A3.h() && class_23382 != null && dev.idhammai.P.A.l.M.d(class_23382)) {
            this.D(class_23382);
        }
    }

    @Override
    public void h(class_4587 class_45872) {
        if (this.AN.h() && !this.r()) {
            this.q();
            class_2338 class_23382 = this.J;
            if (this.A3.h() && class_23382 != null && dev.idhammai.P.A.l.M.d(class_23382)) {
                this.D(class_23382);
            }
        }
        if (this.AO != null && !this.A_.m(500L)) {
            this.o(class_45872, W.method_60646().method_60637(true), (class_1297)this.AO, this.j.X());
        }
    }

    public void o(class_4587 class_45872, float f2, class_1297 class_12972, F f3) {
        switch (f3.ordinal()) {
            case 0: {
                dev.idhammai.P.A.S.K.W(class_45872, ((IEntity)class_12972).getDimensions().method_30757(new class_243(dev.idhammai.P.A.A.A.Z(class_12972.field_6038, class_12972.method_23317(), f2), dev.idhammai.P.A.A.A.Z(class_12972.field_5971, class_12972.method_23318(), f2), dev.idhammai.P.A.A.A.Z(class_12972.field_5989, class_12972.method_23321(), f2))).method_1009(0.0, 0.1, 0.0), dev.idhammai.P.A.S.f.U(this.A5.P(), this.XZ.P(), this.Q.g(0.0, this.L.V(), this.Y.X())), dev.idhammai.P.A.S.f.U(this.Xu.P(), this.AX.P(), this.Q.g(0.0, this.L.V(), this.Y.X())), true, true);
                break;
            }
            case 1: {
                dev.idhammai.P.A.S.K.W(class_45872, ((IEntity)class_12972).getDimensions().method_30757(new class_243(dev.idhammai.P.A.A.A.Z(class_12972.field_6038, class_12972.method_23317(), f2), dev.idhammai.P.A.A.A.Z(class_12972.field_5971, class_12972.method_23318(), f2), dev.idhammai.P.A.A.A.Z(class_12972.field_5989, class_12972.method_23321(), f2))).method_1009(0.0, 0.1, 0.0), dev.idhammai.P.A.S.f.U(this.A5.P(), this.XZ.P(), this.Q.g(0.0, this.L.V(), this.Y.X())), dev.idhammai.P.A.S.f.U(this.Xu.P(), this.AX.P(), this.Q.g(0.0, this.L.V(), this.Y.X())), false, true);
                break;
            }
            case 2: {
                dev.idhammai.P.A.S.k.Z(class_45872, class_12972, this.A5.P());
                break;
            }
            case 3: {
                dev.idhammai.P.A.S.K.t(class_45872, (class_1297)this.AO, this.A5.P());
            }
        }
    }

    private void q() {
        class_2338 class_23382 = this.h;
        if (class_23382 != null) {
            this.H(class_23382);
        }
        if (this.Av != null) {
            this.H(this.Av);
            this.Av = null;
        }
    }

    @dev.idhammai.P.r.K.r
    public void L(dev.idhammai.P.r.c.W w2) {
        if (this.Ax.h() && this.N() && this.AK != null && this.AO != null && !this.A_.m(1000L) && !this.r()) {
            w2.m(this.AK, this.Az.Z(), this.AM.Z());
        }
    }

    @dev.idhammai.P.r.K.r(D=-199)
    public void R(dev.idhammai.P.r.c.J j2) {
        class_2868 class_28682;
        if (j2.p()) {
            return;
        }
        class_2596<?> class_25962 = j2.L();
        if (class_25962 instanceof class_2868 && this.Ac != (class_28682 = (class_2868)class_25962).method_12442()) {
            this.Ac = class_28682.method_12442();
            this.AF.H();
        }
    }

    public class_243 N(class_243 class_2432) {
        return dev.idhammai.P.A.A.A.M(i.W.field_1724.method_33571(), class_2432, this.Af.e(), 2.0, this.A9.e());
    }

    private void k() {
        if (this.U.S(this.s.e())) {
            this.U.H();
            this.T();
            dev.idhammai.P.A.Y.N.y = null;
            dev.idhammai.P.A.Y.N.Z = null;
            this.J = this.AB;
            this.At = this.G;
            this.Av = this.n;
            this.h = this.AE;
        }
    }

    private boolean r() {
        if (this.K.h() && i.W.field_1724.method_6115() || W.b.p() && W.b.m.h()) {
            this.XP.H();
            return true;
        }
        if (this.Aw.h() && O.c.GD != null) {
            this.XP.H();
            return true;
        }
        if (this.AC.G()) {
            this.XP.H();
            return true;
        }
        return false;
    }

    private void T() {
        if (i.M()) {
            return;
        }
        if (this.Xi.h() && !i.W.field_1724.method_6047().method_7909().equals(class_1802.field_8301) && !i.W.field_1724.method_6079().method_7909().equals(class_1802.field_8301) && !this.d()) {
            this.AE = null;
            this.n = null;
            this.XP.H();
            return;
        }
        boolean bl = this.r();
        boolean bl2 = this.A3.h() && this.AV.S(this.X8.e()) && this.n() != -1;
        this.n = null;
        this.AH = 0.0f;
        this.AE = null;
        this.G = 0.0f;
        this.AB = null;
        float f2 = 0.0f;
        ArrayList<s> arrayList = new ArrayList<s>();
        for (class_1657 class_16572 : dev.idhammai.P.A.Y.N.c(this.M.Z())) {
            if (class_16572.field_6235 > this.Am.V()) continue;
            arrayList.add(new s(class_16572, this.Ag.e(), this.AT.V(), this.Aa.V(), this.AQ.h(), this.Ab.h(), this.Ad.h(), this.Ar.h()));
        }
        s s2 = new s((class_1657)i.W.field_1724, this.Ag.e(), this.p.V(), this.Aa.V(), this.AQ.h(), this.Ab.h(), this.Ad.h(), this.Ar.h());
        if (arrayList.isEmpty()) {
            this.XP.H();
        } else {
            float f3;
            class_243 class_2432;
            for (class_1297 object : Frog.THREAD.z()) {
                if (!(object instanceof class_1511)) continue;
                class_1511 class_15112 = (class_1511)object;
                if (object.field_6012 < this.I.V() || (class_2432 = this.N(class_15112.method_19538())) == null || !i.W.field_1724.method_6057((class_1297)class_15112) && i.W.field_1724.method_33571().method_1022(class_2432) > this.l.e()) continue;
                f3 = this.R(class_15112.method_19538(), s2.M, s2.A);
                for (s s3 : arrayList) {
                    float f4 = this.R(class_15112.method_19538(), s3.M, s3.A);
                    if (!(f4 > this.AH) || (double)f3 > this.AJ.e() || this.A6.e() > 0.0 && (double)f3 > (double)(i.W.field_1724.method_6032() + i.W.field_1724.method_6067()) - this.A6.e() || f4 < dev.idhammai.P.A.L.e.T((class_1297)s3.M) && ((double)f4 < this.k(s3.M) || this.m.h() && (this.k(s3.M) == this.AY.e() ? (double)f4 < (double)f3 - 2.5 : (double)f4 < (double)f3 + this.e.e()))) continue;
                    this.AH = f4;
                    this.n = class_15112;
                    this.AO = s3.M;
                }
            }
            if (this.a.h() && this.n != null && !bl) {
                this.H(this.n);
                this.n = null;
            }
            for (class_2338 class_23382 : dev.idhammai.P.A.l.M.I((float)this.Af.e() + 1.5f)) {
                boolean bl3 = false;
                dev.idhammai.P.A.Y.N.y = null;
                dev.idhammai.P.A.Y.N.Z = null;
                if (bl2 && dev.idhammai.P.A.l.M.d(class_23382.method_10074())) {
                    dev.idhammai.P.A.Y.N.y = class_23382.method_10074();
                    dev.idhammai.P.A.Y.N.Z = class_2246.field_10540.method_9564();
                    bl3 = true;
                }
                if (bl3 && Frog.BREAK.X(class_23382.method_10074()) && this.A1.h() || (class_2432 = this.N(class_23382.method_61082())) == null || this.k(class_23382, class_2432) || !this.W(class_23382.method_10074()) || !this.q(class_23382, true, false)) continue;
                f3 = bl3 ? this.n(class_23382, s2.M, s2.A) : this.A(class_23382, s2.M, s2.A);
                for (s s3 : arrayList) {
                    if (bl3 && this.XY.h() && (double)class_23382.method_10264() - 0.5 > s3.M.method_23318()) continue;
                    float f5 = bl3 ? this.n(class_23382, s3.M, s3.A) : this.A(class_23382, s3.M, s3.A);
                    float f4 = f5;
                    if (bl3) {
                        if (!((double)this.G <= this.B.e()) || !(f5 > this.G) || !(f5 > f2) || (double)f3 > this.Ah.e() || this.A6.e() > 0.0 && (double)f3 > (double)(i.W.field_1724.method_6032() + i.W.field_1724.method_6067()) - this.A6.e() || f5 < dev.idhammai.P.A.L.e.T((class_1297)s3.M) && ((double)f5 < this.D.e() || this.b.h() && f5 < f3)) continue;
                        this.AO = s3.M;
                        f2 = f5;
                        this.AB = class_23382.method_10074();
                        this.AE = null;
                        continue;
                    }
                    if (!(f5 > this.G) || !(f5 >= f2) && !((double)this.G > this.B.e()) || (double)f3 > this.AJ.e() || this.A6.e() > 0.0 && (double)f3 > (double)(i.W.field_1724.method_6032() + i.W.field_1724.method_6067()) - this.A6.e() || f5 < dev.idhammai.P.A.L.e.T((class_1297)s3.M) && ((double)f5 < this.k(s3.M) || this.m.h() && (this.k(s3.M) == this.AY.e() ? (double)f5 < (double)f3 - 2.5 : (double)f5 < (double)f3 + this.e.e()))) continue;
                    this.AO = s3.M;
                    this.AE = class_23382;
                    this.AB = null;
                    this.G = f5;
                }
            }
            dev.idhammai.P.A.Y.N.y = null;
            dev.idhammai.P.A.Y.N.Z = null;
            if (this.XM.h() && dev.idhammai.c.r.q.i.a.q() != null && dev.idhammai.c.r.q.i.a.e >= (double)this.Ae.Z() && !dev.idhammai.P.A.l.M.r(dev.idhammai.c.r.q.i.a.q(), false) && this.G <= this.u.Z()) {
                for (s s4 : arrayList) {
                    dev.idhammai.P.A.l.k k2 = new dev.idhammai.P.A.l.k(s4.M.method_19538().method_1031(0.0, 0.5, 0.0));
                    if (dev.idhammai.P.A.l.M.d((class_1297)s4.M, new class_238((class_2338)k2))) continue;
                    for (class_2350 class_23502 : class_2350.values()) {
                        class_2338 class_23383;
                        if (class_23502 == class_2350.field_11033 || class_23502 == class_2350.field_11036 || !(class_23383 = k2.method_10093(class_23502)).equals((Object)dev.idhammai.c.r.q.i.a.q())) continue;
                        for (class_2350 class_23503 : class_2350.values()) {
                            float f5;
                            if (class_23503 == class_2350.field_11033 || class_23503 == class_2350.field_11036 || !this.q(class_23383.method_10093(class_23503), false, false)) continue;
                            float f6 = this.A(class_23383.method_10093(class_23503), s2.M, s2.A);
                            if (!((double)f5 < this.AJ.e()) || this.A6.e() > 0.0 && (double)f6 > (double)(i.W.field_1724.method_6032() + i.W.field_1724.method_6067()) - this.A6.e()) continue;
                            this.AE = class_23383.method_10093(class_23503);
                            if (this.a.h() && this.AE != null && !bl) {
                                this.H(this.AE);
                            }
                            return;
                        }
                    }
                }
            }
        }
        if (this.a.h() && this.AE != null && !bl) {
            this.H(this.AE);
        }
    }

    @dev.idhammai.P.r.K.r
    private void N(Q3 q3) {
        class_1511 class_15112;
        class_1297 class_12972 = q3.Y();
        if (this.An.h() && class_12972 instanceof class_1511 && (class_15112 = (class_1511)class_12972).method_24515().equals((Object)this.Au)) {
            this.H(class_15112);
        }
    }

    public boolean q(class_2338 class_23382, boolean bl, boolean bl2) {
        class_2338 class_23383 = class_23382.method_10074();
        class_2338 class_23384 = class_23383.method_10084();
        class_2338 class_23385 = class_23384.method_10084();
        return !(dev.idhammai.P.A.l.M.x(class_23383) != class_2246.field_9987 && dev.idhammai.P.A.l.M.x(class_23383) != class_2246.field_10540 || dev.idhammai.P.A.l.M.S(class_23383) == null || !this.Z(class_23384, bl, bl2) || !this.Z(class_23385, bl, bl2) || !i.W.field_1687.method_22347(class_23384) && (!dev.idhammai.P.A.l.M.p(class_23384) || dev.idhammai.P.A.l.M.x(class_23384) != class_2246.field_10036) || dev.idhammai.c.r.q.N.I.Q.s.h() && !i.W.field_1687.method_22347(class_23385));
    }

    private boolean Z(class_2338 class_23382, boolean bl, boolean bl2) {
        for (class_1297 class_12972 : dev.idhammai.P.A.l.M.c(new class_238(class_23382))) {
            if (!class_12972.method_5805() || class_12972 instanceof class_1542 && bl2 || class_12972 instanceof class_1511 && bl && this.N(class_12972.method_19538()) != null && (i.W.field_1724.method_6057(class_12972) || i.W.field_1724.method_33571().method_1022(class_12972.method_19538()) <= this.l.e())) continue;
            return false;
        }
        return true;
    }

    public boolean k(class_2338 class_23382, class_243 class_2432) {
        class_243 class_2433 = new class_243((double)class_23382.method_10263() + 0.5, (double)class_23382.method_10264() + 1.7, (double)class_23382.method_10260() + 0.5);
        class_3965 class_39652 = i.W.field_1687.method_17742(new class_3959(i.W.field_1724.method_33571(), class_2433, class_3959.class_3960.field_17558, class_3959.class_242.field_1348, (class_1297)i.W.field_1724));
        if (class_39652 == null || class_39652.method_17783() == class_239.class_240.field_1333) {
            return false;
        }
        return i.W.field_1724.method_33571().method_1022(class_2432) > this.l.e();
    }

    private boolean W(class_2338 class_23382) {
        class_2350 class_23502 = dev.idhammai.P.A.l.M.S(class_23382);
        if (class_23502 == null) {
            return false;
        }
        class_243 class_2432 = new class_243((double)class_23502.method_10163().method_10263() * 0.5, (double)class_23502.method_10163().method_10264() * 0.5, (double)class_23502.method_10163().method_10260() * 0.5);
        return class_23382.method_46558().method_1019(class_2432).method_1022(i.W.field_1724.method_33571()) <= this.T.e();
    }

    private void H(class_2338 class_23382) {
        if (this.q(class_23382, false, false)) {
            this.R(class_23382, this.Ax.h() && this.X3.h());
        }
        this.o(class_23382);
    }

    private void D(class_2338 class_23382) {
        if (!this.AV.m((long)this.X8.e())) {
            return;
        }
        if (this.A1.h() && Frog.BREAK.X(class_23382)) {
            return;
        }
        int n2 = this.n();
        if (n2 == -1) {
            return;
        }
        int n3 = i.W.field_1724.method_31548().field_7545;
        this.S(n2);
        dev.idhammai.P.A.l.M.i(class_23382, this.Ax.h());
        if (this.AW.h()) {
            this.S(n2);
            dev.idhammai.P.A.L.e.t();
        } else {
            this.S(n3);
        }
        this.AV.H();
    }

    public float A(class_2338 class_23382, class_1657 class_16572, class_1657 class_16573) {
        return this.R(new class_243((double)class_23382.method_10263() + 0.5, (double)class_23382.method_10264(), (double)class_23382.method_10260() + 0.5), class_16572, class_16573);
    }

    public float R(class_243 class_2432, class_1657 class_16572, class_1657 class_16573) {
        if (this.Aj.h() && dev.idhammai.c.r.q.i.a.q() != null && i.W.field_1724.method_33571().method_1022(dev.idhammai.c.r.q.i.a.q().method_46558()) <= dev.idhammai.c.r.q.i.a.D5.D1.e() && dev.idhammai.c.r.q.i.a.e >= this.AU.e() / 100.0) {
            dev.idhammai.P.A.Y.N.y = dev.idhammai.c.r.q.i.a.q();
            dev.idhammai.P.A.Y.N.Z = class_2246.field_10124.method_9564();
        }
        if (this.Ai.h()) {
            dev.idhammai.P.A.Y.N.z = true;
        }
        float f2 = dev.idhammai.P.A.A.w.q(class_2432, (class_1309)class_16572, (class_1309)class_16573, 6.0f);
        dev.idhammai.P.A.Y.N.y = null;
        dev.idhammai.P.A.Y.N.z = false;
        return f2;
    }

    public float n(class_2338 class_23382, class_1657 class_16572, class_1657 class_16573) {
        if (this.Ai.h()) {
            dev.idhammai.P.A.Y.N.z = true;
        }
        float f2 = dev.idhammai.P.A.A.f.b((class_1309)class_16572, (class_1309)class_16573, new class_243((double)class_23382.method_10263() + 0.5, (double)class_23382.method_10264(), (double)class_23382.method_10260() + 0.5), 12.0f, class_23382.method_10074(), class_2246.field_10540.method_9564());
        dev.idhammai.P.A.Y.N.z = false;
        return f2;
    }

    private double k(class_1657 class_16572) {
        if (!dev.idhammai.c.r.q.i.a.D5.Dh.G() && this.AD.h() && this.XP.m((long)this.Ap.e())) {
            return this.XC.e();
        }
        if (this.XH.h() && (double)dev.idhammai.P.A.L.e.T((class_1297)class_16572) <= this.w.e() && !dev.idhammai.c.r.q.i.a.D5.Dh.G()) {
            return this.AY.e();
        }
        if (this.c.h()) {
            class_2371 class_23712 = class_16572.method_31548().field_7548;
            for (class_1799 class_17992 : class_23712) {
                if (class_17992.method_7960() || (double)dev.idhammai.P.A.L.e.a(class_17992) > this.X.e()) continue;
                return this.AL.e();
            }
        }
        return this.y.e();
    }

    private boolean N() {
        if (!this.H.h() && (i.W.field_1724.method_6128() || dev.idhammai.c.r.q.D.Q.F.p() && dev.idhammai.c.r.q.D.Q.F.z())) {
            return false;
        }
        return this.d.h() && !dev.idhammai.c.r.q.D.f.V.f();
    }

    public boolean d() {
        if (this.r.X() == dev.idhammai.c.r.q.A.N.None) {
            return false;
        }
        return this.E() != -1;
    }

    private void H(class_1511 class_15112) {
        class_2338 class_23382;
        class_243 class_2432;
        this.A_.H();
        if (!this.k.h()) {
            return;
        }
        if (!class_15112.method_5805()) {
            return;
        }
        if (this.AO != null && this.AO.field_6235 > this.t.V() && !this.Al.S(this.Xp.e())) {
            return;
        }
        this.XP.H();
        if (!this.AF.m((long)this.A7.e())) {
            return;
        }
        this.Al.H();
        if (class_15112.field_6012 < this.I.V()) {
            return;
        }
        if (!this.N() && !dev.idhammai.P.A.Y.N.x.m((long)this.Ao.e())) {
            if (this.Ay.h() && this.h != null) {
                this.R(this.h, false);
            }
            return;
        }
        if (this.Ax.h() && this.g.h() && !this.m((class_2432 = this.N(class_15112.method_19538())) == null ? class_15112.method_19538() : class_2432)) {
            if (this.Ay.h() && this.h != null) {
                this.R(this.h, false);
            }
            return;
        }
        if (this.N() && !dev.idhammai.P.A.Y.N.x.m((long)this.Ao.e())) {
            if (this.Ay.h() && this.h != null) {
                this.R(this.h, false);
            }
            return;
        }
        this.Q.h = 1.0;
        this.Q.a = 1.0;
        dev.idhammai.P.A.Y.N.x.H();
        this.Au = class_15112.method_24515();
        W.method_1562().method_52787((class_2596)class_2824.method_34206((class_1297)class_15112, (boolean)i.W.field_1724.method_5715()));
        if (this.Z.h()) {
            i.W.field_1724.method_7350();
        }
        dev.idhammai.P.A.L.e.g(class_1268.field_5808, this.AI.X());
        if (this.As.h()) {
            i.W.field_1687.method_2945(class_15112.method_5628(), class_1297.class_5529.field_26998);
        }
        if ((class_23382 = this.h) != null && this.AO != null && (double)this.At >= this.k(this.AO) && this.A0.h() && (!this.Ax.h() || !this.N() || !this.XG.h() || Frog.ROTATION.k(class_15112.method_19538(), this.f.Z()))) {
            this.R(class_23382, false);
        }
        if (this.A.h() && dev.idhammai.c.r.q.A.J.R.p()) {
            dev.idhammai.c.r.q.A.J.I = true;
        }
        if (this.Ax.h() && !this.N()) {
            Frog.ROTATION.M();
        }
    }

    private void o(class_2338 class_23382) {
        this.A_.H();
        if (!this.k.h()) {
            return;
        }
        if (this.AO != null && this.AO.field_6235 > this.t.V() && !this.Al.S(this.Xp.e())) {
            return;
        }
        this.XP.H();
        if (!this.AF.m((long)this.A7.e())) {
            return;
        }
        this.Al.H();
        for (class_1511 class_15112 : dev.idhammai.P.A.l.M.U(new class_238((double)class_23382.method_10263(), (double)class_23382.method_10264(), (double)class_23382.method_10260(), (double)(class_23382.method_10263() + 1), (double)(class_23382.method_10264() + 2), (double)(class_23382.method_10260() + 1)))) {
            class_2338 class_23383;
            class_243 class_2432;
            if (class_15112.field_6012 < this.I.V() || !class_15112.method_5805()) continue;
            if (!this.N() && !dev.idhammai.P.A.Y.N.x.m((long)this.Ao.e())) {
                if (this.Ay.h() && this.h != null) {
                    this.R(this.h, false);
                }
                return;
            }
            if (this.Ax.h() && this.g.h() && !this.m((class_2432 = this.N(class_15112.method_19538())) == null ? class_15112.method_19538() : class_2432)) {
                if (this.Ay.h() && this.h != null) {
                    this.R(this.h, false);
                }
                return;
            }
            if (this.N() && !dev.idhammai.P.A.Y.N.x.m((long)this.Ao.e())) {
                if (this.Ay.h() && this.h != null) {
                    this.R(this.h, false);
                }
                return;
            }
            this.Q.h = 1.0;
            this.Q.a = 1.0;
            dev.idhammai.P.A.Y.N.x.H();
            this.Au = class_23382;
            W.method_1562().method_52787((class_2596)class_2824.method_34206((class_1297)class_15112, (boolean)i.W.field_1724.method_5715()));
            if (this.Z.h()) {
                i.W.field_1724.method_7350();
            }
            dev.idhammai.P.A.L.e.g(class_1268.field_5808, this.AI.X());
            if (this.As.h()) {
                i.W.field_1687.method_2945(class_15112.method_5628(), class_1297.class_5529.field_26998);
            }
            if ((class_23383 = this.h) != null && this.AO != null && (double)this.At >= this.k(this.AO) && this.A0.h() && (!this.Ax.h() || !this.N() || !this.XG.h() || Frog.ROTATION.k(class_15112.method_19538(), this.f.Z()))) {
                this.R(class_23383, false);
            }
            if (this.A.h() && dev.idhammai.c.r.q.A.J.R.p()) {
                dev.idhammai.c.r.q.A.J.I = true;
            }
            if (this.Ax.h() && !this.N()) {
                Frog.ROTATION.M();
            }
            return;
        }
        if (this.Ay.h() && this.h != null) {
            this.R(this.h, false);
        }
    }

    private void R(class_2338 class_23382, boolean bl) {
        this.A_.H();
        if (!this.Ak.h()) {
            return;
        }
        if (!(i.W.field_1724.method_6047().method_7909().equals(class_1802.field_8301) || i.W.field_1724.method_6079().method_7909().equals(class_1802.field_8301) || this.d())) {
            return;
        }
        if (!this.W(class_23382.method_10074())) {
            return;
        }
        class_2338 class_23383 = class_23382.method_10074();
        class_2350 class_23502 = dev.idhammai.P.A.l.M.e(class_23383);
        class_243 class_2432 = class_23383.method_46558().method_1031((double)class_23502.method_10163().method_10263() * 0.5, (double)class_23502.method_10163().method_10264() * 0.5, (double)class_23502.method_10163().method_10260() * 0.5);
        if (class_23502 != class_2350.field_11036 && class_23502 != class_2350.field_11033) {
            class_2432 = class_2432.method_1031(0.0, 0.45, 0.0);
        }
        if (!this.N() && !this.E.m((long)this.XB.e())) {
            return;
        }
        if (bl && !this.m(class_2432)) {
            return;
        }
        if (!this.E.m((long)this.XB.e())) {
            return;
        }
        if (i.W.field_1724.method_6047().method_7909().equals(class_1802.field_8301) || i.W.field_1724.method_6079().method_7909().equals(class_1802.field_8301)) {
            this.E.H();
            this.Au = class_23382;
            this.O(class_23382);
        } else {
            this.E.H();
            this.Au = class_23382;
            int n2 = i.W.field_1724.method_31548().field_7545;
            int n3 = this.E();
            if (n3 == -1) {
                return;
            }
            this.K(n3);
            this.O(class_23382);
            if (this.r.X() == dev.idhammai.c.r.q.A.N.Silent) {
                this.K(n2);
            } else if (this.r.X() == dev.idhammai.c.r.q.A.N.Inventory) {
                this.K(n3);
                dev.idhammai.P.A.L.e.t();
            }
        }
        if (bl && !this.N()) {
            Frog.ROTATION.M();
        }
    }

    private void K(int n2) {
        if (this.r.X() == dev.idhammai.c.r.q.A.N.Silent || this.r.X() == dev.idhammai.c.r.q.A.N.Normal) {
            dev.idhammai.P.A.L.g.j(n2);
        } else if (this.r.X() == dev.idhammai.c.r.q.A.N.Inventory) {
            dev.idhammai.P.A.L.g.z(n2, i.W.field_1724.method_31548().field_7545);
        }
    }

    private void S(int n2) {
        if (!this.AW.h()) {
            dev.idhammai.P.A.L.g.j(n2);
        } else {
            dev.idhammai.P.A.L.g.z(n2, i.W.field_1724.method_31548().field_7545);
        }
    }

    private int n() {
        if (this.AW.h()) {
            return dev.idhammai.P.A.L.g.H(class_2246.field_10540);
        }
        return dev.idhammai.P.A.L.g.L(class_2246.field_10540);
    }

    private int E() {
        if (this.r.X() == dev.idhammai.c.r.q.A.N.Silent || this.r.X() == dev.idhammai.c.r.q.A.N.Normal) {
            return dev.idhammai.P.A.L.g.E(class_1802.field_8301);
        }
        if (this.r.X() == dev.idhammai.c.r.q.A.N.Inventory) {
            return dev.idhammai.P.A.L.g.a(class_1802.field_8301);
        }
        return -1;
    }

    private void O(class_2338 class_23382) {
        boolean bl = i.W.field_1724.method_6079().method_7909() == class_1802.field_8301;
        class_2338 class_23383 = class_23382.method_10074();
        class_2350 class_23502 = dev.idhammai.P.A.l.M.e(class_23383);
        dev.idhammai.P.A.l.M.g(class_23383, class_23502, false, bl ? class_1268.field_5810 : class_1268.field_5808, this.AI.X());
    }

    private boolean m(class_243 class_2432) {
        if (class_2432 == null) {
            return false;
        }
        if (!this.N()) {
            Frog.ROTATION.a(class_2432);
            return true;
        }
        this.AK = class_2432;
        if (Frog.ROTATION.k(class_2432, this.f.Z())) {
            return true;
        }
        return !this.XG.h();
    }

    private boolean lambda$new$95() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Misc;
    }

    private boolean lambda$new$94() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Misc;
    }

    private boolean lambda$new$93() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Misc;
    }

    private boolean lambda$new$92() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Misc && this.A.f();
    }

    private boolean lambda$new$91() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Misc && this.A.f();
    }

    private boolean lambda$new$90() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Misc;
    }

    private boolean lambda$new$89() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Misc && this.c.f();
    }

    private boolean lambda$new$88() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Misc && this.c.f();
    }

    private boolean lambda$new$87() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Misc;
    }

    private boolean lambda$new$86() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Misc && this.XH.f();
    }

    private boolean lambda$new$85() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Misc && this.XH.f();
    }

    private boolean lambda$new$84() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Misc;
    }

    private boolean lambda$new$83() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Misc && this.AD.f();
    }

    private boolean lambda$new$82() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Misc && this.AD.f();
    }

    private boolean lambda$new$81() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Misc;
    }

    private boolean lambda$new$80() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Misc && this.XM.f();
    }

    private boolean lambda$new$79() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Misc && this.XM.f();
    }

    private boolean lambda$new$78() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Misc;
    }

    private boolean lambda$new$77() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Misc && this.Aj.f();
    }

    private boolean lambda$new$76() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Misc;
    }

    private boolean lambda$new$75() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Base;
    }

    private boolean lambda$new$74() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Base;
    }

    private boolean lambda$new$73() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Base;
    }

    private boolean lambda$new$72() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Base;
    }

    private boolean lambda$new$71() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Base;
    }

    private boolean lambda$new$70() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Base;
    }

    private boolean lambda$new$69() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Base;
    }

    private boolean lambda$new$68() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Base;
    }

    private boolean lambda$new$67() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Base;
    }

    private boolean lambda$new$66() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Calc;
    }

    private boolean lambda$new$65() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Calc;
    }

    private boolean lambda$new$64() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Calc;
    }

    private boolean lambda$new$63() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Calc;
    }

    private boolean lambda$new$62() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Calc;
    }

    private boolean lambda$new$61() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Calc;
    }

    private boolean lambda$new$60() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Calc;
    }

    private boolean lambda$new$59() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Calc;
    }

    private boolean lambda$new$58() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Calc;
    }

    private boolean lambda$new$57() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Calc;
    }

    private boolean lambda$new$56() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Calc;
    }

    private boolean lambda$new$55() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Calc;
    }

    private boolean lambda$new$54() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Render && this.A4.h();
    }

    private boolean lambda$new$53() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Render && this.A4.h();
    }

    private boolean lambda$new$52() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Render && this.A4.h();
    }

    private boolean lambda$new$51() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Render && this.A4.h();
    }

    private boolean lambda$new$50() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Render && this.A4.h();
    }

    private boolean lambda$new$49() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Render && this.A4.h();
    }

    private boolean lambda$new$48() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Render && this.A4.h();
    }

    private boolean lambda$new$47() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Render && this.A4.h();
    }

    private boolean lambda$new$46() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Render;
    }

    private boolean lambda$new$45() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Render;
    }

    private boolean lambda$new$44() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Render;
    }

    private boolean lambda$new$43() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Render;
    }

    private boolean lambda$new$42() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Render;
    }

    private boolean lambda$new$41() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Render;
    }

    private boolean lambda$new$40() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Render;
    }

    private boolean lambda$new$39() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Render;
    }

    private boolean lambda$new$38() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Render;
    }

    private boolean lambda$new$37() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.General;
    }

    private boolean lambda$new$36() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.General;
    }

    private boolean lambda$new$35() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.General;
    }

    private boolean lambda$new$34() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.General;
    }

    private boolean lambda$new$33() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.General && this.k.f();
    }

    private boolean lambda$new$32() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.General && this.k.f();
    }

    private boolean lambda$new$31() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.General && this.k.f();
    }

    private boolean lambda$new$30() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.General && this.k.f();
    }

    private boolean lambda$new$29() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.General && this.k.f();
    }

    private boolean lambda$new$28() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.General && this.k.f();
    }

    private boolean lambda$new$27() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.General;
    }

    private boolean lambda$new$26() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.General && this.Ak.f();
    }

    private boolean lambda$new$25() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.General && this.Ak.f();
    }

    private boolean lambda$new$24() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.General && this.Ak.f();
    }

    private boolean lambda$new$23() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.General && this.Ak.f();
    }

    private boolean lambda$new$22() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.General && this.Ak.f();
    }

    private boolean lambda$new$21() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.General;
    }

    private boolean lambda$new$20() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.General && this.m.f();
    }

    private boolean lambda$new$19() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.General;
    }

    private boolean lambda$new$18() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.General;
    }

    private boolean lambda$new$17() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.General;
    }

    private boolean lambda$new$16() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.General;
    }

    private boolean lambda$new$15() {
        return this.Ax.f() && this.d.f() && this.C.X() == dev.idhammai.c.r.q.A.r.Rotation;
    }

    private boolean lambda$new$14() {
        return this.Ax.f() && this.d.f() && this.XG.h() && this.C.X() == dev.idhammai.c.r.q.A.r.Rotation;
    }

    private boolean lambda$new$13() {
        return this.Ax.f() && this.d.f() && this.C.X() == dev.idhammai.c.r.q.A.r.Rotation;
    }

    private boolean lambda$new$12() {
        return this.Ax.f() && this.d.f() && this.C.X() == dev.idhammai.c.r.q.A.r.Rotation;
    }

    private boolean lambda$new$11() {
        return this.Ax.f() && this.C.X() == dev.idhammai.c.r.q.A.r.Rotation && this.d.f();
    }

    private boolean lambda$new$10() {
        return this.Ax.f() && this.C.X() == dev.idhammai.c.r.q.A.r.Rotation;
    }

    private boolean lambda$new$9() {
        return this.Ax.f() && this.C.X() == dev.idhammai.c.r.q.A.r.Rotation;
    }

    private boolean lambda$new$8() {
        return this.Ax.f() && this.C.X() == dev.idhammai.c.r.q.A.r.Rotation;
    }

    private boolean lambda$new$7() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Rotation;
    }

    private boolean lambda$new$6() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Check;
    }

    private boolean lambda$new$5() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Check;
    }

    private boolean lambda$new$4() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Check;
    }

    private boolean lambda$new$3() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Check;
    }

    private boolean lambda$new$2() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Check;
    }

    private boolean lambda$new$1() {
        return this.C.X() == dev.idhammai.c.r.q.A.r.Check;
    }

    private boolean lambda$new$0() {
        return this.C.x(dev.idhammai.c.r.q.A.r.Check);
    }
}

