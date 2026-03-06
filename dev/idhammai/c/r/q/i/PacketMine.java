/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.effect.StatusEffects
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.decoration.EndCrystalEntity
 *  net.minecraft.entity.decoration.ArmorStandEntity
 *  net.minecraft.entity.ItemEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.screen.slot.SlotActionType
 *  net.minecraft.item.AirBlockItem
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.enchantment.EnchantmentHelper
 *  net.minecraft.enchantment.Enchantments
 *  net.minecraft.world.BlockView
 *  net.minecraft.world.World
 *  net.minecraft.block.AirBlock
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.Block
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.block.BlockState
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket$Action
 *  net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.block.RespawnAnchorBlock
 *  net.minecraft.entity.attribute.EntityAttributes
 *  net.minecraft.registry.entry.RegistryEntry
 */
package dev.idhammai.c.r.q.i;

import dev.idhammai.Frog;
import dev.idhammai.P.A.A.d;
import dev.idhammai.P.A.A.h;
import dev.idhammai.P.A.L.e;
import dev.idhammai.P.A.L.g;
import dev.idhammai.P.A.S.K;
import dev.idhammai.P.A.Y.N;
import dev.idhammai.P.A.l.M;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.J;
import dev.idhammai.P.r.c.v;
import dev.idhammai.P.r.c.z;
import dev.idhammai.asm.accessors.IPlayerMoveC2SPacket;
import dev.idhammai.c.r.O.Y.A;
import dev.idhammai.c.r.O.Y.B;
import dev.idhammai.c.r.O.p.S;
import dev.idhammai.c.r.q.A.I;
import dev.idhammai.c.r.q.A.O;
import dev.idhammai.c.r.q.A.V;
import dev.idhammai.c.r.q.A.i;
import dev.idhammai.c.r.q.D.Q;
import dev.idhammai.c.r.q.D.f;
import dev.idhammai.c.r.q.N.x;
import dev.idhammai.c.r.q.Q.W;
import dev.idhammai.c.r.q.i.T;
import dev.idhammai.c.r.q.i.l;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import java.awt.Color;
import java.text.DecimalFormat;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import net.minecraft.util.Hand;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.Entity;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.entity.decoration.ArmorStandEntity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.item.AirBlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.block.AirBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.Packet;
import net.minecraft.block.BlockState;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.block.RespawnAnchorBlock;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.registry.entry.RegistryEntry;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class a
extends y {
    public static a D5;
    public static class_2338 DA;
    public static double e;
    private final d J = new d(1000L);
    private final d D8 = new d(1000L);
    private final DecimalFormat s = new DecimalFormat("0.0");
    private final B<T> N = this.S(new B<T>("Page", dev.idhammai.c.r.q.i.T.General).I("\u9875\u9762").X(dev.idhammai.c.r.q.i.T.General, "\u5e38\u89c4").X(dev.idhammai.c.r.q.i.T.Check, "\u68c0\u67e5").X(dev.idhammai.c.r.q.i.T.Place, "\u653e\u7f6e").X(dev.idhammai.c.r.q.i.T.Rotation, "\u8f6c\u5411").X(dev.idhammai.c.r.q.i.T.Render, "\u6e32\u67d3"));
    private final dev.idhammai.c.r.O.Y.l h = this.p(new dev.idhammai.c.r.O.Y.l("StopDelay", 50.0, 0.0, 500.0, 1.0, this::lambda$new$0).D("\u505c\u6b62\u5ef6\u8fdf"));
    private final dev.idhammai.c.r.O.Y.l Dj = this.p(new dev.idhammai.c.r.O.Y.l("StartDelay", 200.0, 0.0, 500.0, 1.0, this::lambda$new$1).D("\u8d77\u6316\u5ef6\u8fdf"));
    private final dev.idhammai.c.r.O.Y.l n = this.p(new dev.idhammai.c.r.O.Y.l("Damage", 0.7f, 0.0, 2.0, 0.01, this::lambda$new$2).D("\u901f\u5ea6\u500d\u7387"));
    private final dev.idhammai.c.r.O.Y.l d = this.p(new dev.idhammai.c.r.O.Y.l("MaxBreak", 3.0, 0.0, 20.0, 1.0, this::lambda$new$3).D("\u6700\u5927\u91cd\u6316\u6b21\u6570"));
    public final dev.idhammai.c.r.O.Y.W DP = this.S(new dev.idhammai.c.r.O.Y.W("1.21", false, this::lambda$new$4).k("1.21\u6a21\u5f0f"));
    public final dev.idhammai.c.r.O.Y.W DU = this.S(new dev.idhammai.c.r.O.Y.W("NoCollide", true, this::lambda$new$5).k("\u65e0\u78b0\u649e"));
    private final B<dev.idhammai.c.r.O.p.T> Dx = this.S(new B<dev.idhammai.c.r.O.p.T>("Timing", dev.idhammai.c.r.O.p.T.All, this::lambda$new$6).I("\u65f6\u673a"));
    private final dev.idhammai.c.r.O.Y.W Dd = this.S(new dev.idhammai.c.r.O.Y.W("GrimDisabler", false, this::lambda$new$7).k("Grim\u7981\u7528\u5668"));
    private final dev.idhammai.c.r.O.Y.W Dm = this.S(new dev.idhammai.c.r.O.Y.W("Instant", false, this::lambda$new$8).k("\u77ac\u6316"));
    private final dev.idhammai.c.r.O.Y.W w = this.S(new dev.idhammai.c.r.O.Y.W("Wait", true, this::lambda$new$9).k("\u7b49\u5f85\u5b8c\u6210"));
    private final dev.idhammai.c.r.O.Y.W b = this.S(new dev.idhammai.c.r.O.Y.W("MineAir", true, this::lambda$new$10).k("\u6316\u7a7a\u6c14"));
    private final dev.idhammai.c.r.O.Y.W De = this.S(new dev.idhammai.c.r.O.Y.W("HotbarSwap", false, this::lambda$new$11).k("\u5feb\u6377\u680f\u5207\u6362"));
    private final dev.idhammai.c.r.O.Y.W DH = this.S(new dev.idhammai.c.r.O.Y.W("DoubleBreak", true, this::lambda$new$12).k("\u53cc\u6316").D());
    public final dev.idhammai.c.r.O.Y.W L = this.S(new dev.idhammai.c.r.O.Y.W("AutoSwitch", true, this::lambda$new$13).k("\u81ea\u52a8\u5207\u5de5\u5177"));
    private final dev.idhammai.c.r.O.Y.l R = this.p(new dev.idhammai.c.r.O.Y.l("Start", 0.9f, 0.0, 2.0, 0.01, this::lambda$new$14).D("\u53cc\u6316\u8d77\u70b9"));
    private final dev.idhammai.c.r.O.Y.l I = this.p(new dev.idhammai.c.r.O.Y.l("TimeOut", 1.2f, 0.0, 2.0, 0.01, this::lambda$new$15).D("\u53cc\u6316\u8d85\u65f6"));
    private final dev.idhammai.c.r.O.Y.W DY = this.S(new dev.idhammai.c.r.O.Y.W("SetAir", false, this::lambda$new$16).k("\u5b8c\u6210\u540e\u7f6e\u7a7a\u6c14"));
    private final dev.idhammai.c.r.O.Y.W DZ = this.S(new dev.idhammai.c.r.O.Y.W("Swing", true, this::lambda$new$17).k("\u8d77\u6316\u6325\u624b"));
    private final dev.idhammai.c.r.O.Y.W Dp = this.S(new dev.idhammai.c.r.O.Y.W("EndSwing", false, this::lambda$new$18).k("\u7ed3\u675f\u6325\u624b"));
    public final dev.idhammai.c.r.O.Y.l D1 = this.p(new dev.idhammai.c.r.O.Y.l("Range", 6.0, 3.0, 10.0, 0.1, this::lambda$new$19).D("\u6316\u6398\u8303\u56f4"));
    private final B<S> U = this.S(new B<S>("SwingSide", dev.idhammai.c.r.O.p.S.All, this::lambda$new$20).I("\u6325\u624b\u4fa7"));
    private final dev.idhammai.c.r.O.Y.W DX = this.S(new dev.idhammai.c.r.O.Y.W("UnbreakableCancel", true, this::lambda$new$21).k("\u4e0d\u53ef\u7834\u574f\u65f6\u53d6\u6d88"));
    private final dev.idhammai.c.r.O.Y.W E = this.S(new dev.idhammai.c.r.O.Y.W("SwitchReset", false, this::lambda$new$22).k("\u5207\u6362\u91cd\u7f6e"));
    private final dev.idhammai.c.r.O.Y.W DN = this.S(new dev.idhammai.c.r.O.Y.W("PreferWeb", true, this::lambda$new$23).k("\u4f18\u5148\u8718\u86db\u7f51"));
    private final dev.idhammai.c.r.O.Y.W Df = this.S(new dev.idhammai.c.r.O.Y.W("PreferHead", true, this::lambda$new$24).k("\u4f18\u5148\u5934\u9876"));
    private final dev.idhammai.c.r.O.Y.W a = this.S(new dev.idhammai.c.r.O.Y.W("FarCancel", false, this::lambda$new$25).k("\u8d85\u8ddd\u53d6\u6d88"));
    private final dev.idhammai.c.r.O.Y.W l = this.S(new dev.idhammai.c.r.O.Y.W("OnlyGround", true, this::lambda$new$26).k("\u4ec5\u5730\u9762\u7ed3\u675f"));
    private final dev.idhammai.c.r.O.Y.W D9 = this.S(new dev.idhammai.c.r.O.Y.W("CheckWeb", true, this::lambda$new$27).k("\u86db\u7f51\u68c0\u6d4b"));
    private final dev.idhammai.c.r.O.Y.W F = this.S(new dev.idhammai.c.r.O.Y.W("CheckGround", true, this::lambda$new$28).k("\u79bb\u5730\u68c0\u6d4b"));
    private final dev.idhammai.c.r.O.Y.W k = this.S(new dev.idhammai.c.r.O.Y.W("Smart", true, this::lambda$new$29).k("\u667a\u80fd\u68c0\u6d4b"));
    private final dev.idhammai.c.r.O.Y.W DM = this.S(new dev.idhammai.c.r.O.Y.W("UsingPause", false, this::lambda$new$30).k("\u4f7f\u7528\u7269\u54c1\u6682\u505c").D());
    private final dev.idhammai.c.r.O.Y.W D = this.S(new dev.idhammai.c.r.O.Y.W("AllowOffhand", true, this::lambda$new$31).k("\u5141\u8bb8\u526f\u624b"));
    private final dev.idhammai.c.r.O.Y.W Dy = this.S(new dev.idhammai.c.r.O.Y.W("BypassGround", true, this::lambda$new$32).k("\u5730\u9762\u7ed5\u8fc7"));
    private final dev.idhammai.c.r.O.Y.l K = this.p(new dev.idhammai.c.r.O.Y.l("BypassTime", 400, 0, 2000, this::lambda$new$33).D("\u7ed5\u8fc7\u65f6\u95f4"));
    private final dev.idhammai.c.r.O.Y.O DG = this.n(new dev.idhammai.c.r.O.Y.O("Pause", -1, this::lambda$new$34).E("\u6682\u505c\u6309\u952e"));
    private final dev.idhammai.c.r.O.Y.W DB = this.S(new dev.idhammai.c.r.O.Y.W("StartRotate", true, this::lambda$new$35).k("\u8d77\u6316\u8f6c\u5411"));
    private final dev.idhammai.c.r.O.Y.W Ds = this.S(new dev.idhammai.c.r.O.Y.W("EndRotate", false, this::lambda$new$36).k("\u7ed3\u675f\u8f6c\u5411"));
    private final dev.idhammai.c.r.O.Y.l u = this.p(new dev.idhammai.c.r.O.Y.l("Sync", 300, 0, 1000, this::lambda$new$37).D("\u8f6c\u5411\u540c\u6b65"));
    private final dev.idhammai.c.r.O.Y.W DQ = this.S(new dev.idhammai.c.r.O.Y.W("YawStep", false, this::lambda$new$38).k("\u5206\u6b65\u8f6c\u5411").D());
    private final dev.idhammai.c.r.O.Y.W f = this.S(new dev.idhammai.c.r.O.Y.W("FallFlying", true, this::lambda$new$39).k("\u9798\u7fc5\u65f6\u542f\u7528"));
    private final dev.idhammai.c.r.O.Y.l Dk = this.p(new dev.idhammai.c.r.O.Y.l("Steps", 0.05, 0.0, 1.0, 0.01, this::lambda$new$40).D("\u6b65\u8fdb"));
    private final dev.idhammai.c.r.O.Y.W DV = this.S(new dev.idhammai.c.r.O.Y.W("OnlyLooking", true, this::lambda$new$41).k("\u4ec5\u89c6\u89d2\u5185"));
    private final dev.idhammai.c.r.O.Y.l c = this.p(new dev.idhammai.c.r.O.Y.l("Fov", 20.0, 0.0, 360.0, 0.1, this::lambda$new$42).D("\u89c6\u89d2\u8303\u56f4"));
    private final dev.idhammai.c.r.O.Y.l DT = this.p(new dev.idhammai.c.r.O.Y.l("Priority", 10, 0, 100, this::lambda$new$43).D("\u8f6c\u5411\u4f18\u5148\u7ea7"));
    public final dev.idhammai.c.r.O.Y.W V = this.S(new dev.idhammai.c.r.O.Y.W("Crystal", false, this::lambda$new$44).k("\u6c34\u6676\u8054\u52a8").D());
    private final dev.idhammai.c.r.O.Y.W DI = this.S(new dev.idhammai.c.r.O.Y.W("OnlyCev", true, this::lambda$new$45).k("\u4ec5Cev"));
    private final dev.idhammai.c.r.O.Y.W D6 = this.S(new dev.idhammai.c.r.O.Y.W("WaitPlace", true, this::lambda$new$46).k("\u7b49\u5f85\u653e\u7f6e"));
    private final dev.idhammai.c.r.O.Y.W Y = this.S(new dev.idhammai.c.r.O.Y.W("SpamPlace", false, this::lambda$new$47).k("\u8fde\u70b9\u653e\u7f6e"));
    private final dev.idhammai.c.r.O.Y.W p = this.S(new dev.idhammai.c.r.O.Y.W("AfterBreak", true, this::lambda$new$48).k("\u7834\u574f\u540e\u653b\u51fb"));
    private final dev.idhammai.c.r.O.Y.W A = this.S(new dev.idhammai.c.r.O.Y.W("DetectProgress", true, this::lambda$new$49).k("\u68c0\u6d4b\u8fdb\u5ea6"));
    private final dev.idhammai.c.r.O.Y.l DK = this.p(new dev.idhammai.c.r.O.Y.l("Progress", 0.9f, 0.0, 1.0, 0.01, this::lambda$new$50).D("\u89e6\u53d1\u8fdb\u5ea6"));
    public final dev.idhammai.c.r.O.Y.O Dh = this.n(new dev.idhammai.c.r.O.Y.O("Obsidian", -1, this::lambda$new$51).E("\u9ed1\u66dc\u77f3\u6309\u952e"));
    private final dev.idhammai.c.r.O.Y.O m = this.n(new dev.idhammai.c.r.O.Y.O("EnderChest", -1, this::lambda$new$52).E("\u672b\u5f71\u7bb1\u6309\u952e"));
    private final dev.idhammai.c.r.O.Y.W Dl = this.S(new dev.idhammai.c.r.O.Y.W("PlaceRotate", true, this::lambda$new$53).k("\u653e\u7f6e\u8f6c\u5411"));
    private final dev.idhammai.c.r.O.Y.W D2 = this.S(new dev.idhammai.c.r.O.Y.W("InventorySwap", true, this::lambda$new$54).k("\u80cc\u5305\u5207\u6362"));
    private final dev.idhammai.c.r.O.Y.l H = this.p(new dev.idhammai.c.r.O.Y.l("PlaceDelay", 100, 0, 1000, this::lambda$new$55).D("\u653e\u7f6e\u5ef6\u8fdf"));
    private final dev.idhammai.c.r.O.Y.W D0 = this.S(new dev.idhammai.c.r.O.Y.W("CheckDouble", false, this::lambda$new$56).k("\u53cc\u6316\u72ec\u7acb\u6e32\u67d3"));
    private final B<l> C = this.S(new B<l>("Animation", dev.idhammai.c.r.q.i.l.Up, this::lambda$new$57).I("\u52a8\u753b").X(dev.idhammai.c.r.q.i.l.Center, "\u4e2d\u5fc3").X(dev.idhammai.c.r.q.i.l.Grow, "\u6269\u5f20").X(dev.idhammai.c.r.q.i.l.Up, "\u5411\u4e0a").X(dev.idhammai.c.r.q.i.l.Down, "\u5411\u4e0b").X(dev.idhammai.c.r.q.i.l.Oscillation, "\u632f\u8361").X(dev.idhammai.c.r.q.i.l.None, "\u65e0"));
    private final B<dev.idhammai.P.A.A.S> Z = this.S(new B<dev.idhammai.P.A.A.S>("Ease", dev.idhammai.P.A.A.S.CubicInOut, this::lambda$new$58).I("\u52a8\u753b\u7f13\u52a8"));
    private final B<dev.idhammai.P.A.A.S> DR = this.S(new B<dev.idhammai.P.A.A.S>("FadeEase", dev.idhammai.P.A.A.S.CubicInOut, this::lambda$new$59).I("\u6e10\u53d8\u7f13\u52a8"));
    private final dev.idhammai.c.r.O.Y.l r = this.p(new dev.idhammai.c.r.O.Y.l("ExpandLine", 0.0, 0.0, 1.0, this::lambda$new$60).D("\u8fb9\u6846\u6269\u5c55"));
    private final A DO = this.y(new A("StartFill", new Color(255, 255, 255, 100), this::lambda$new$61).P("\u8d77\u59cb\u586b\u5145"));
    private final A DJ = this.y(new A("StartOutline", new Color(255, 255, 255, 100), this::lambda$new$62).P("\u8d77\u59cb\u8fb9\u6846"));
    private final A DD = this.y(new A("EndFill", new Color(255, 255, 255, 100), this::lambda$new$63).P("\u7ed3\u675f\u586b\u5145"));
    private final A T = this.y(new A("EndOutline", new Color(255, 255, 255, 100), this::lambda$new$64).P("\u7ed3\u675f\u8fb9\u6846"));
    private final A y = this.y(new A("DoubleFill", new Color(88, 94, 255, 100), this::lambda$new$65).P("\u53cc\u6316\u586b\u5145"));
    private final A D4 = this.y(new A("DoubleOutline", new Color(88, 94, 255, 100), this::lambda$new$66).P("\u53cc\u6316\u8fb9\u6846"));
    private final dev.idhammai.c.r.O.Y.W Dz = this.S(new dev.idhammai.c.r.O.Y.W("Text", true, this::lambda$new$67).k("\u663e\u793a\u6587\u672c"));
    private final dev.idhammai.c.r.O.Y.W Du = this.S(new dev.idhammai.c.r.O.Y.W("Box", true, this::lambda$new$68).k("\u663e\u793a\u586b\u5145"));
    private final dev.idhammai.c.r.O.Y.W Do = this.S(new dev.idhammai.c.r.O.Y.W("Outline", true, this::lambda$new$69).k("\u663e\u793a\u8fb9\u6846"));
    private final h Da = new h();
    private final h P = new h();
    private final h Dv = new h();
    private final h DL = new h();
    private final h D3 = new h();
    private final h Dc = new h();
    public static boolean Dt;
    public static boolean Db;
    int Di = -1;
    class_243 B = null;
    Runnable j;
    class_2338 Dg;
    boolean G = false;
    int g = 0;
    double X;
    double M;
    boolean Q = false;
    boolean Dq = false;
    int t = 0;

    public a() {
        super("PacketMine", dev.idhammai.c.r.w.Player);
        this.L("\u53d1\u5305\u6316\u6398");
        D5 = this;
    }

    public static class_2338 q() {
        if (D5.p()) {
            return dev.idhammai.c.r.q.i.a.D5.Dg;
        }
        return null;
    }

    @Override
    public String I() {
        if (e >= 1.0) {
            return "Done";
        }
        return this.s.format(e * 100.0) + "%";
    }

    @r
    public void W(dev.idhammai.P.r.c.W w2) {
        if (this.DB.h() && this.q() && this.B != null && !this.P.S(this.u.e())) {
            w2.m(this.B, this.Dk.Z(), this.DT.Z());
        }
    }

    @Override
    public void F() {
        this.G = false;
        Dt = false;
        Db = false;
        this.Dg = null;
        DA = null;
    }

    @Override
    public void L() {
        this.G = false;
        Dt = false;
        Db = false;
        this.Dg = null;
    }

    private void X() {
        if (this.L.h() && this.DH.h()) {
            int n2 = -1;
            if (DA != null) {
                float f2 = 1.0f;
                for (int i2 = 0; i2 < 9; ++i2) {
                    float f3;
                    float f4;
                    class_1799 class_17992 = dev.idhammai.c.r.q.i.a.W.field_1724.method_31548().method_5438(i2);
                    if (class_17992 == class_1799.field_8037 || !((f4 = (float)class_1890.method_8225((class_6880)((class_6880)dev.idhammai.c.r.q.i.a.W.field_1687.method_30349().method_30530(class_1893.field_9131.method_58273()).method_40264(class_1893.field_9131).get()), (class_1799)class_17992)) + (f3 = class_17992.method_7924(dev.idhammai.c.r.q.i.a.W.field_1687.method_8320(DA))) > f2)) continue;
                    f2 = f4 + f3;
                    n2 = i2;
                }
            }
            if (n2 == -1 || dev.idhammai.c.r.q.i.a.W.field_1690.field_1904.method_1434() || dev.idhammai.c.r.q.i.a.W.field_1690.field_1886.method_1434() || dev.idhammai.c.r.q.i.a.W.field_1724.method_6115() || !this.Dv.S(this.I(DA, n2, this.R.e()))) {
                if (this.Dq) {
                    dev.idhammai.P.A.L.g.j(this.t);
                    this.Dq = false;
                }
            } else if (n2 != dev.idhammai.c.r.q.i.a.W.field_1724.method_31548().field_7545) {
                this.t = dev.idhammai.c.r.q.i.a.W.field_1724.method_31548().field_7545;
                dev.idhammai.P.A.L.g.j(n2);
                this.Dq = true;
            }
        }
    }

    @r
    public void G(v v2) {
        int n2;
        int n3;
        int n4;
        if (dev.idhammai.c.r.q.i.a.M()) {
            return;
        }
        if (this.Dg != null && dev.idhammai.c.r.q.i.a.W.field_1687.method_22347(this.Dg)) {
            Db = true;
        }
        if (DA != null) {
            n4 = this.j(DA);
            if (n4 == -1) {
                n4 = dev.idhammai.c.r.q.i.a.W.field_1724.method_31548().field_7545;
            }
            this.M = this.I(DA, n4, 1.0);
            if (this.F(DA) || dev.idhammai.c.r.q.i.a.e(DA)) {
                DA = null;
            } else {
                double d2 = this.I(DA, dev.idhammai.c.r.q.i.a.W.field_1724.method_31548().field_7545, 1.0);
                if (this.Dv.S(d2 * this.I.e())) {
                    DA = null;
                }
            }
        }
        if (this.j != null && v2.a()) {
            this.j.run();
            this.j = null;
        }
        if (this.Dx.x(dev.idhammai.c.r.O.p.T.Pre) && v2.C() || this.Dx.x(dev.idhammai.c.r.O.p.T.Post) && v2.a()) {
            return;
        }
        if (dev.idhammai.c.r.q.i.a.W.field_1724.method_29504()) {
            DA = null;
        }
        this.X();
        if (dev.idhammai.c.r.q.i.a.W.field_1724.method_7337()) {
            this.G = false;
            Dt = false;
            Db = false;
            this.g = 0;
            this.Dg = null;
            e = 0.0;
            return;
        }
        if (this.Dg == null) {
            this.g = 0;
            this.G = false;
            Dt = false;
            Db = false;
            e = 0.0;
            return;
        }
        n4 = this.j(this.Dg);
        if (n4 == -1) {
            n4 = dev.idhammai.c.r.q.i.a.W.field_1724.method_31548().field_7545;
        }
        this.X = this.R(this.Dg, n4);
        e = (double)this.Da.k() / this.X;
        if (this.F(this.Dg)) {
            this.g = 0;
        }
        if ((double)this.g > this.d.e() - 1.0 && this.d.e() > 0.0 && !Db || !this.w.h() && this.F(this.Dg) && !this.Dm.h()) {
            if (this.Dg.equals((Object)DA)) {
                DA = null;
            }
            this.G = false;
            Dt = false;
            Db = false;
            this.g = 0;
            this.Dg = null;
            return;
        }
        if (dev.idhammai.c.r.q.i.a.e(this.Dg)) {
            if (this.DX.h()) {
                this.Dg = null;
                this.G = false;
                Dt = false;
                Db = false;
            }
            this.g = 0;
            return;
        }
        if ((double)class_3532.method_15355((float)((float)dev.idhammai.c.r.q.i.a.W.field_1724.method_33571().method_1025(this.Dg.method_46558()))) > this.D1.e()) {
            if (this.a.h()) {
                this.G = false;
                Dt = false;
                Db = false;
                this.g = 0;
                this.Dg = null;
            }
            return;
        }
        if (this.DM.h() && dev.idhammai.c.r.q.i.a.W.field_1724.method_6115() && (!this.D.h() || dev.idhammai.c.r.q.i.a.W.field_1724.method_6058() == class_1268.field_5808)) {
            return;
        }
        if (this.DG.G()) {
            return;
        }
        if (W.b.p() && W.b.m.h()) {
            return;
        }
        if (this.Dg.equals((Object)O.c.GD) && dev.idhammai.P.A.l.M.x(dev.idhammai.c.r.q.i.a.q()) instanceof class_4969) {
            return;
        }
        if (!this.De.h() && !dev.idhammai.P.A.L.e.n()) {
            return;
        }
        if (this.F(this.Dg)) {
            if (this.G()) {
                for (class_2350 class_23502 : class_2350.values()) {
                    dev.idhammai.P.A.Y.N.r(this.Dg.method_10093(class_23502), this.Dl.h(), true);
                }
            }
            if (this.D3.S(this.H.e()) && dev.idhammai.P.A.l.M.d(this.Dg) && dev.idhammai.c.r.q.i.a.W.field_1755 == null) {
                int n5;
                if (this.m.G()) {
                    n3 = this.j(class_2246.field_10443);
                    if (n3 != -1) {
                        n2 = dev.idhammai.c.r.q.i.a.W.field_1724.method_31548().field_7545;
                        this.i(n3, n3);
                        dev.idhammai.P.A.l.M.R(this.Dg, this.Dl.h(), true);
                        this.i(n2, n3);
                        this.D3.H();
                    }
                } else if (this.Dh.G() && (n5 = this.j(class_2246.field_10540)) != -1) {
                    n3 = 0;
                    if (this.G()) {
                        for (class_1297 class_12972 : dev.idhammai.P.A.l.M.c(new class_238(this.Dg.method_10084()))) {
                            if (!(class_12972 instanceof class_1511)) continue;
                            n3 = 1;
                            break;
                        }
                    }
                    if (n3 == 0 || this.Y.h()) {
                        n2 = dev.idhammai.c.r.q.i.a.W.field_1724.method_31548().field_7545;
                        this.i(n5, n5);
                        dev.idhammai.P.A.l.M.R(this.Dg, this.Dl.h(), true);
                        this.i(n2, n5);
                        this.D3.H();
                    }
                }
            }
            this.g = 0;
        } else if (this.A(this.Dg.method_10084()) && this.G() && (this.D3.S(this.H.e()) ? (this.A.h() ? (double)this.Da.k() / this.X >= this.DK.e() && !this.T() : !this.T()) : this.G)) {
            return;
        }
        if (this.D6.h()) {
            for (class_2350 class_23502 : class_2350.values()) {
                if (!this.Dg.method_10093(class_23502).equals((Object)i.X6.h)) continue;
                if (!i.X6.q(this.Dg, false, false)) break;
                return;
            }
        }
        if (!this.DL.m((long)this.h.e())) {
            return;
        }
        if (this.G) {
            if (this.F(this.Dg)) {
                return;
            }
            if (this.l.h() && !dev.idhammai.c.r.q.i.a.W.field_1724.method_24828()) {
                return;
            }
            if (this.Da.m((long)this.X)) {
                int n6;
                if (this.Ds.h() && this.q() && !this.G(this.Dg.method_46558().method_43206(dev.idhammai.P.A.l.M.e(this.Dg), 0.5))) {
                    return;
                }
                n3 = dev.idhammai.c.r.q.i.a.W.field_1724.method_31548().field_7545;
                if (this.De.h()) {
                    n6 = n4 != n3 ? 1 : 0;
                } else {
                    if (n4 < 9) {
                        n4 += 36;
                    }
                    n6 = n3 + 36 != n4 ? 1 : 0;
                    n2 = n6;
                }
                if (n6 != 0) {
                    if (this.De.h()) {
                        dev.idhammai.P.A.L.g.j(n4);
                    } else {
                        dev.idhammai.c.r.q.i.a.W.field_1761.method_2906(dev.idhammai.c.r.q.i.a.W.field_1724.field_7512.field_7763, n4, n3, class_1713.field_7791, (class_1657)dev.idhammai.c.r.q.i.a.W.field_1724);
                    }
                }
                n2 = n4;
                this.j = () -> this.lambda$onTick$71(n6 != 0, n3, n2);
                if (!this.DP.h()) {
                    this.j.run();
                    this.j = null;
                }
            }
        } else {
            if (!this.Dc.m(this.Dj.V())) {
                return;
            }
            if (!this.b.h() && this.F(this.Dg)) {
                return;
            }
            class_2350 class_23503 = dev.idhammai.P.A.l.M.e(this.Dg);
            if (this.DB.h()) {
                class_2382 class_23822 = class_23503.method_10163();
                if (!this.G(this.Dg.method_46558().method_1019(new class_243((double)class_23822.method_10263() * 0.5, (double)class_23822.method_10264() * 0.5, (double)class_23822.method_10260() * 0.5)))) {
                    return;
                }
            }
            this.Da.H();
            this.J.e();
            if (this.DZ.h()) {
                dev.idhammai.P.A.L.e.g(class_1268.field_5808, this.U.X());
            }
            if (this.DH.h()) {
                if (DA == null || this.F(DA)) {
                    double d3 = this.I(this.Dg, n4, 1.0);
                    this.D8.e();
                    this.D8.S((long)d3);
                    this.Dv.H();
                    DA = this.Dg;
                }
                this.F(class_23503);
            }
            dev.idhammai.c.r.q.i.a.n(arg_0 -> this.lambda$onTick$72(class_23503, arg_0));
            if (this.DB.h() && !this.q()) {
                Frog.ROTATION.M();
            }
            this.Dc.H();
        }
    }

    private void w(class_2338 class_23382) {
        dev.idhammai.c.r.q.i.a.W.field_1687.method_8320(class_23382).method_26204().method_9576((class_1937)dev.idhammai.c.r.q.i.a.W.field_1687, class_23382, dev.idhammai.c.r.q.i.a.W.field_1687.method_8320(class_23382), (class_1657)dev.idhammai.c.r.q.i.a.W.field_1724);
    }

    void F(class_2350 class_23502) {
        dev.idhammai.c.r.q.i.a.n(arg_0 -> this.lambda$doDoubleBreak$73(class_23502, arg_0));
        dev.idhammai.c.r.q.i.a.n(arg_0 -> this.lambda$doDoubleBreak$74(class_23502, arg_0));
    }

    boolean T() {
        int n2 = this.O();
        if (n2 != -1) {
            int n3 = dev.idhammai.c.r.q.i.a.W.field_1724.method_31548().field_7545;
            this.i(n2, n2);
            dev.idhammai.P.A.l.M.E(this.Dg.method_10084(), this.Dl.h());
            this.i(n3, n2);
            this.D3.H();
            return !this.D6.h();
        }
        return true;
    }

    @r
    public void b(z z2) {
        int n2;
        if (dev.idhammai.c.r.q.i.a.M()) {
            return;
        }
        if (dev.idhammai.c.r.q.i.a.W.field_1724.method_7337()) {
            return;
        }
        z2.L();
        class_2338 class_23382 = z2.O();
        if (class_23382.equals((Object)this.Dg)) {
            return;
        }
        if (dev.idhammai.c.r.q.i.a.e(class_23382)) {
            return;
        }
        if (this.Dg != null && this.DN.h() && dev.idhammai.P.A.l.M.x(this.Dg) == class_2246.field_10343) {
            return;
        }
        if (this.Dg != null && this.Df.h() && dev.idhammai.c.r.q.i.a.W.field_1724.method_20448() && dev.idhammai.P.A.L.e.H(true).method_10084().equals((Object)this.Dg)) {
            return;
        }
        if (dev.idhammai.P.A.l.M.S(class_23382) == null) {
            return;
        }
        if ((double)class_3532.method_15355((float)((float)dev.idhammai.c.r.q.i.a.W.field_1724.method_33571().method_1025(class_23382.method_46558()))) > this.D1.e()) {
            return;
        }
        this.Dg = class_23382;
        this.g = 0;
        this.G = false;
        Dt = false;
        Db = false;
        this.Da.H();
        this.J.e();
        if (W.b.p() && W.b.m.h()) {
            return;
        }
        class_2350 class_23502 = dev.idhammai.P.A.l.M.e(this.Dg);
        if (this.DB.h()) {
            class_2382 class_23822 = class_23502.method_10163();
            if (!this.G(this.Dg.method_46558().method_1019(new class_243((double)class_23822.method_10263() * 0.5, (double)class_23822.method_10264() * 0.5, (double)class_23822.method_10260() * 0.5)))) {
                return;
            }
        }
        if (!this.Dc.m(this.Dj.V())) {
            return;
        }
        if (this.DZ.h()) {
            dev.idhammai.P.A.L.e.g(class_1268.field_5808, this.U.X());
        }
        if (this.DH.h()) {
            if (DA == null || this.F(DA)) {
                int n3 = this.j(this.Dg);
                if (n3 == -1) {
                    n3 = dev.idhammai.c.r.q.i.a.W.field_1724.method_31548().field_7545;
                }
                this.M = this.I(this.Dg, n3, 1.0);
                this.D8.e();
                this.D8.S((long)this.M);
                this.Dv.H();
                DA = this.Dg;
            }
            this.F(class_23502);
        }
        if ((n2 = this.j(this.Dg)) == -1) {
            n2 = dev.idhammai.c.r.q.i.a.W.field_1724.method_31548().field_7545;
        }
        this.X = this.R(this.Dg, n2);
        dev.idhammai.c.r.q.i.a.n(arg_0 -> this.lambda$onAttackBlock$75(class_23502, arg_0));
        if (this.DB.h() && !this.q()) {
            Frog.ROTATION.M();
        }
        this.Dc.H();
    }

    public void d(class_2338 class_23382) {
        if (dev.idhammai.c.r.q.i.a.M()) {
            return;
        }
        if (dev.idhammai.c.r.q.i.a.W.field_1724.method_7337()) {
            dev.idhammai.c.r.q.i.a.W.field_1761.method_2910(class_23382, dev.idhammai.P.A.l.M.e(class_23382));
            return;
        }
        if (this.W()) {
            dev.idhammai.c.r.q.i.a.W.field_1761.method_2910(class_23382, dev.idhammai.P.A.l.M.e(class_23382));
            return;
        }
        if (class_23382.equals((Object)this.Dg)) {
            return;
        }
        if (dev.idhammai.c.r.q.i.a.e(class_23382)) {
            return;
        }
        if (this.Dg != null && this.DN.h() && dev.idhammai.P.A.l.M.x(this.Dg) == class_2246.field_10343) {
            return;
        }
        if (this.Dg != null && this.Df.h() && dev.idhammai.c.r.q.i.a.W.field_1724.method_20448() && dev.idhammai.P.A.L.e.H(true).method_10084().equals((Object)this.Dg)) {
            return;
        }
        if (dev.idhammai.P.A.l.M.S(class_23382) == null) {
            return;
        }
        if ((double)class_3532.method_15355((float)((float)dev.idhammai.c.r.q.i.a.W.field_1724.method_33571().method_1025(class_23382.method_46558()))) > this.D1.e()) {
            return;
        }
        this.Dg = class_23382;
        this.g = 0;
        this.G = false;
        Dt = false;
        Db = false;
        this.Da.H();
        this.J.e();
    }

    boolean G(class_243 class_2432) {
        if (!this.q()) {
            Frog.ROTATION.a(class_2432);
            return true;
        }
        this.P.H();
        this.B = class_2432;
        if (Frog.ROTATION.k(class_2432, this.c.Z())) {
            return true;
        }
        return !this.DV.h();
    }

    @Override
    public void h(class_4587 class_45872) {
        if (this.Dg != null && dev.idhammai.c.r.q.i.a.W.field_1687.method_22347(this.Dg)) {
            Db = true;
        }
        if (!dev.idhammai.c.r.q.i.a.W.field_1724.method_7337()) {
            double d2;
            if (DA != null) {
                if (this.F(DA)) {
                    DA = null;
                    return;
                }
                if (!this.D0.h() || !DA.equals((Object)this.Dg)) {
                    this.D8.S((long)this.M);
                    d2 = this.D8.M(this.Z.X());
                    if (this.Du.h()) {
                        dev.idhammai.P.A.S.K.F(class_45872, this.j(DA, d2), this.y.P());
                    }
                    if (this.Do.h()) {
                        dev.idhammai.P.A.S.K.N(class_45872, this.l(DA, d2), this.D4.P());
                    }
                }
            }
            if (this.Dg != null) {
                e = (double)this.Da.k() / this.X;
                this.J.S((long)this.X);
                d2 = this.J.M(this.Z.X());
                if (dev.idhammai.c.r.q.i.a.e(this.Dg)) {
                    if (this.Du.h()) {
                        dev.idhammai.P.A.S.K.F(class_45872, new class_238(this.Dg), this.DO.P());
                    }
                    if (this.Do.h()) {
                        dev.idhammai.P.A.S.K.N(class_45872, new class_238(this.Dg), this.DJ.P());
                    }
                    return;
                }
                if (this.Du.h()) {
                    dev.idhammai.P.A.S.K.F(class_45872, this.j(this.Dg, d2), this.z(this.J.M(this.DR.X())));
                }
                if (this.Do.h()) {
                    dev.idhammai.P.A.S.K.N(class_45872, this.l(this.Dg, d2), this.s(this.J.M(this.DR.X())));
                }
                if (this.Dz.h()) {
                    if (this.F(this.Dg)) {
                        dev.idhammai.P.A.S.K.p("Waiting", this.Dg.method_46558(), -1);
                    } else if ((double)((int)this.Da.k()) < this.X) {
                        dev.idhammai.P.A.S.K.p(this.s.format(e * 100.0) + "%", this.Dg.method_46558(), -1);
                    } else {
                        dev.idhammai.P.A.S.K.p("100.0%", this.Dg.method_46558(), -1);
                    }
                }
            } else {
                e = 0.0;
            }
        } else {
            e = 0.0;
        }
    }

    private class_238 j(class_2338 class_23382, double d2) {
        switch (this.C.X().ordinal()) {
            case 1: {
                d2 = (1.0 - d2) / 2.0;
                return new class_238(class_23382).method_1002(d2, 0.0, d2).method_1002(-d2, 0.0, -d2);
            }
            case 3: {
                return new class_238((double)class_23382.method_10263(), (double)(class_23382.method_10264() + 1) - d2, (double)class_23382.method_10260(), (double)(class_23382.method_10263() + 1), (double)(class_23382.method_10264() + 1), (double)(class_23382.method_10260() + 1));
            }
            case 2: {
                return new class_238((double)class_23382.method_10263(), (double)class_23382.method_10264(), (double)class_23382.method_10260(), (double)(class_23382.method_10263() + 1), (double)class_23382.method_10264() + d2, (double)(class_23382.method_10260() + 1));
            }
            case 0: {
                d2 = (1.0 - d2) / 2.0;
                return new class_238(class_23382).method_1002(d2, d2, d2).method_1002(-d2, -d2, -d2);
            }
            case 4: {
                return new class_238(class_23382).method_1002(d2, d2, d2).method_1002(-d2, -d2, -d2);
            }
        }
        return new class_238(class_23382);
    }

    private class_238 l(class_2338 class_23382, double d2) {
        d2 = Math.min(d2 + this.r.e(), 1.0);
        switch (this.C.X().ordinal()) {
            case 1: {
                d2 = (1.0 - d2) / 2.0;
                return new class_238(class_23382).method_1002(d2, 0.0, d2).method_1002(-d2, 0.0, -d2);
            }
            case 3: {
                return new class_238((double)class_23382.method_10263(), (double)(class_23382.method_10264() + 1) - d2, (double)class_23382.method_10260(), (double)(class_23382.method_10263() + 1), (double)(class_23382.method_10264() + 1), (double)(class_23382.method_10260() + 1));
            }
            case 2: {
                return new class_238((double)class_23382.method_10263(), (double)class_23382.method_10264(), (double)class_23382.method_10260(), (double)(class_23382.method_10263() + 1), (double)class_23382.method_10264() + d2, (double)(class_23382.method_10260() + 1));
            }
            case 0: {
                d2 = (1.0 - d2) / 2.0;
                return new class_238(class_23382).method_1002(d2, d2, d2).method_1002(-d2, -d2, -d2);
            }
            case 4: {
                return new class_238(class_23382).method_1002(d2, d2, d2).method_1002(-d2, -d2, -d2);
            }
        }
        return new class_238(class_23382);
    }

    @r(D=-200)
    public void w(J j2) {
        if (dev.idhammai.c.r.q.i.a.M() || dev.idhammai.c.r.q.i.a.W.field_1724.method_7337()) {
            return;
        }
        if (j2.L() instanceof class_2828) {
            if (this.Dy.h() && !dev.idhammai.c.r.q.i.a.W.field_1724.method_6128() && this.Dg != null && !this.F(this.Dg) && this.K.e() > 0.0 && class_3532.method_15355((float)((float)this.Dg.method_46558().method_1025(dev.idhammai.c.r.q.i.a.W.field_1724.method_33571()))) <= this.D1.Z() + 2.0f) {
                double d2 = this.X - this.K.e();
                if (d2 <= 0.0 || this.Da.m((long)d2)) {
                    this.Q = true;
                    ((IPlayerMoveC2SPacket)j2.L()).setOnGround(true);
                }
            } else {
                this.Q = false;
            }
        } else {
            class_2596<?> class_25962 = j2.L();
            if (class_25962 instanceof class_2868) {
                class_2868 class_28682 = (class_2868)class_25962;
                if (class_28682.method_12442() != this.Di) {
                    this.Di = class_28682.method_12442();
                    if (this.E.h()) {
                        this.G = false;
                        Dt = false;
                        Db = false;
                        this.Da.H();
                        this.J.e();
                    }
                }
            } else {
                class_25962 = j2.L();
                if (class_25962 instanceof class_2846) {
                    class_2846 class_28462 = (class_2846)class_25962;
                    if (class_28462.method_12363() == class_2846.class_2847.field_12968) {
                        if (this.Dg == null || !class_28462.method_12362().equals((Object)this.Dg)) {
                            return;
                        }
                        if (this.Dd.h()) {
                            W.method_1562().method_52787((class_2596)new class_2846(class_2846.class_2847.field_12973, class_28462.method_12362(), class_28462.method_12360()));
                        }
                        this.G = true;
                    } else if (class_28462.method_12363() == class_2846.class_2847.field_12973) {
                        if (this.Dg == null || !class_28462.method_12362().equals((Object)this.Dg)) {
                            return;
                        }
                        if (!this.Dm.h()) {
                            this.G = false;
                            Dt = false;
                            Db = false;
                        }
                    }
                }
            }
        }
    }

    boolean A(class_2338 class_23382) {
        class_2338 class_23383 = class_23382.method_10074();
        class_2338 class_23384 = class_23383.method_10084();
        return !(dev.idhammai.P.A.l.M.x(class_23383) != class_2246.field_9987 && dev.idhammai.P.A.l.M.x(class_23383) != class_2246.field_10540 || dev.idhammai.P.A.l.M.S(class_23383) == null || !this.p(class_23384) || !this.p(class_23384.method_10084()) || dev.idhammai.c.r.q.N.I.Q.s.h() && !dev.idhammai.c.r.q.i.a.W.field_1687.method_22347(class_23384.method_10084()));
    }

    boolean p(class_2338 class_23382) {
        for (class_1297 class_12972 : dev.idhammai.P.A.l.M.c(new class_238(class_23382))) {
            if (class_12972 instanceof class_1542 || class_12972 instanceof class_1531 && x.y.J.h()) continue;
            return false;
        }
        return true;
    }

    void i(int n2, int n3) {
        if (!this.D2.h()) {
            dev.idhammai.P.A.L.g.j(n2);
        } else {
            dev.idhammai.P.A.L.g.z(n3, dev.idhammai.c.r.q.i.a.W.field_1724.method_31548().field_7545);
        }
    }

    int O() {
        if (this.D2.h()) {
            return dev.idhammai.P.A.L.g.a(class_1802.field_8301);
        }
        return dev.idhammai.P.A.L.g.E(class_1802.field_8301);
    }

    int j(class_2248 class_22482) {
        if (this.D2.h()) {
            return dev.idhammai.P.A.L.g.H(class_22482);
        }
        return dev.idhammai.P.A.L.g.L(class_22482);
    }

    boolean G() {
        return this.V.h() && (!this.DI.h() || this.Dh.G()) || dev.idhammai.c.r.q.A.V.r.p();
    }

    public static double C(class_2338 class_23382) {
        int n2 = D5.j(class_23382);
        if (n2 == -1) {
            n2 = dev.idhammai.c.r.q.i.a.W.field_1724.method_31548().field_7545;
        }
        return D5.R(class_23382, n2);
    }

    double R(class_2338 class_23382, int n2) {
        return this.I(class_23382, n2, this.n.e());
    }

    double I(class_2338 class_23382, int n2, double d2) {
        return (double)(1.0f / this.b(class_23382, dev.idhammai.c.r.q.i.a.W.field_1724.method_31548().method_5438(n2)) / 20.0f * 1000.0f) * d2;
    }

    float b(class_2338 class_23382, class_1799 class_17992) {
        class_2680 class_26802 = dev.idhammai.c.r.q.i.a.W.field_1687.method_8320(class_23382);
        float f2 = class_26802.method_26214((class_1922)dev.idhammai.c.r.q.i.a.W.field_1687, class_23382);
        if (f2 < 0.0f) {
            return 0.0f;
        }
        float f3 = !class_26802.method_29291() || class_17992.method_7951(class_26802) ? 30.0f : 100.0f;
        return this.q(class_26802, class_17992) / f2 / f3;
    }

    float q(class_2680 class_26802, class_1799 class_17992) {
        int n2;
        float f2 = this.A(class_26802, class_17992);
        if (f2 > 1.0f && (n2 = class_1890.method_8225((class_6880)((class_6880)dev.idhammai.c.r.q.i.a.W.field_1687.method_30349().method_30530(class_1893.field_9131.method_58273()).method_40264(class_1893.field_9131).get()), (class_1799)class_17992)) > 0 && !class_17992.method_7960()) {
            f2 += (float)(StrictMath.pow(n2, 2.0) + 1.0);
        }
        if (dev.idhammai.c.r.q.i.a.W.field_1724.method_6059(class_1294.field_5917)) {
            f2 *= 1.0f + (float)(dev.idhammai.c.r.q.i.a.W.field_1724.method_6112(class_1294.field_5917).method_5578() + 1) * 0.2f;
        }
        if (dev.idhammai.c.r.q.i.a.W.field_1724.method_6059(class_1294.field_5901)) {
            f2 *= (switch (dev.idhammai.c.r.q.i.a.W.field_1724.method_6112(class_1294.field_5901).method_5578()) {
                case 0 -> 0.3f;
                case 1 -> 0.09f;
                case 2 -> 0.0027f;
                default -> 8.1E-4f;
            });
        }
        if (dev.idhammai.c.r.q.i.a.W.field_1724.method_5869()) {
            f2 *= (float)dev.idhammai.c.r.q.i.a.W.field_1724.method_5996(class_5134.field_51576).method_6194();
        }
        boolean bl = this.D9.h() && Frog.PLAYER.n((class_1657)dev.idhammai.c.r.q.i.a.W.field_1724) && dev.idhammai.c.r.q.i.a.W.field_1687.method_8320(this.Dg).method_26204() == class_2246.field_10343;
        boolean bl2 = bl;
        if ((!dev.idhammai.c.r.q.i.a.W.field_1724.method_24828() || bl) && dev.idhammai.c.r.q.i.a.D5.F.h() && (!this.k.h() || dev.idhammai.c.r.q.A.I.Z.L.x(dev.idhammai.c.r.q.A.v.Ground) && dev.idhammai.c.r.q.A.I.Z.p() || dev.idhammai.c.r.q.i.a.W.field_1724.method_6128() || bl)) {
            f2 /= 5.0f;
        }
        return f2 < 0.0f ? 0.0f : f2;
    }

    float A(class_2680 class_26802, class_1799 class_17992) {
        float f2 = 1.0f;
        if (class_17992 != null && !class_17992.method_7960()) {
            f2 *= class_17992.method_7924(class_26802);
        }
        return f2;
    }

    Color z(double d2) {
        int n2 = this.DO.P().getRed();
        int n3 = this.DO.P().getGreen();
        int n4 = this.DO.P().getBlue();
        int n5 = this.DO.P().getAlpha();
        int n6 = this.DD.P().getRed();
        int n7 = this.DD.P().getGreen();
        int n8 = this.DD.P().getBlue();
        int n9 = this.DD.P().getAlpha();
        return new Color((int)((double)n2 + (double)(n6 - n2) * d2), (int)((double)n3 + (double)(n7 - n3) * d2), (int)((double)n4 + (double)(n8 - n4) * d2), (int)((double)n5 + (double)(n9 - n5) * d2));
    }

    Color s(double d2) {
        int n2 = this.DJ.P().getRed();
        int n3 = this.DJ.P().getGreen();
        int n4 = this.DJ.P().getBlue();
        int n5 = this.DJ.P().getAlpha();
        int n6 = this.T.P().getRed();
        int n7 = this.T.P().getGreen();
        int n8 = this.T.P().getBlue();
        int n9 = this.T.P().getAlpha();
        return new Color((int)((double)n2 + (double)(n6 - n2) * d2), (int)((double)n3 + (double)(n7 - n3) * d2), (int)((double)n4 + (double)(n8 - n4) * d2), (int)((double)n5 + (double)(n9 - n5) * d2));
    }

    int j(class_2338 class_23382) {
        if (this.De.h()) {
            int n2 = -1;
            float f2 = 1.0f;
            for (int i2 = 0; i2 < 9; ++i2) {
                float f3;
                float f4;
                class_1799 class_17992 = dev.idhammai.c.r.q.i.a.W.field_1724.method_31548().method_5438(i2);
                if (class_17992 == class_1799.field_8037 || !((f4 = (float)class_1890.method_8225((class_6880)((class_6880)dev.idhammai.c.r.q.i.a.W.field_1687.method_30349().method_30530(class_1893.field_9131.method_58273()).method_40264(class_1893.field_9131).get()), (class_1799)class_17992)) + (f3 = class_17992.method_7924(dev.idhammai.c.r.q.i.a.W.field_1687.method_8320(class_23382))) > f2)) continue;
                f2 = f4 + f3;
                n2 = i2;
            }
            return n2;
        }
        AtomicInteger atomicInteger = new AtomicInteger();
        atomicInteger.set(-1);
        float f5 = 1.0f;
        for (Map.Entry<Integer, class_1799> entry : dev.idhammai.P.A.L.g.A().entrySet()) {
            float f6;
            float f7;
            if (entry.getValue().method_7909() instanceof class_1739 || !((f7 = (float)class_1890.method_8225((class_6880)((class_6880)dev.idhammai.c.r.q.i.a.W.field_1687.method_30349().method_30530(class_1893.field_9131.method_58273()).method_40264(class_1893.field_9131).get()), (class_1799)entry.getValue())) + (f6 = entry.getValue().method_7924(dev.idhammai.c.r.q.i.a.W.field_1687.method_8320(class_23382))) > f5)) continue;
            f5 = f7 + f6;
            atomicInteger.set(entry.getKey());
        }
        return atomicInteger.get();
    }

    private boolean q() {
        if (!this.f.h() && (dev.idhammai.c.r.q.i.a.W.field_1724.method_6128() || dev.idhammai.c.r.q.D.Q.F.p() && dev.idhammai.c.r.q.D.Q.F.z())) {
            return false;
        }
        return this.DQ.h() && !dev.idhammai.c.r.q.D.f.V.f();
    }

    boolean F(class_2338 class_23382) {
        return dev.idhammai.c.r.q.i.a.W.field_1687.method_22347(class_23382) || dev.idhammai.P.A.l.M.x(class_23382) == class_2246.field_10036 && dev.idhammai.P.A.l.M.p(class_23382);
    }

    public static boolean e(class_2338 class_23382) {
        class_2248 class_22482 = dev.idhammai.c.r.q.i.a.W.field_1687.method_8320(class_23382).method_26204();
        return !(class_22482 instanceof class_2189) && (class_22482.method_36555() == -1.0f || class_22482.method_36555() == 100.0f);
    }

    private class_2596 lambda$onAttackBlock$75(class_2350 class_23502, int n2) {
        return new class_2846(class_2846.class_2847.field_12968, this.Dg, class_23502, n2);
    }

    private class_2596 lambda$doDoubleBreak$74(class_2350 class_23502, int n2) {
        return new class_2846(class_2846.class_2847.field_12973, this.Dg, class_23502, n2);
    }

    private class_2596 lambda$doDoubleBreak$73(class_2350 class_23502, int n2) {
        return new class_2846(class_2846.class_2847.field_12968, this.Dg, class_23502, n2);
    }

    private class_2596 lambda$onTick$72(class_2350 class_23502, int n2) {
        return new class_2846(class_2846.class_2847.field_12968, this.Dg, class_23502, n2);
    }

    private void lambda$onTick$71(boolean bl, int n2, int n3) {
        if (this.Ds.h() && !this.G(this.Dg.method_46558().method_43206(dev.idhammai.P.A.l.M.e(this.Dg), 0.5))) {
            if (bl) {
                if (this.De.h()) {
                    dev.idhammai.P.A.L.g.j(n2);
                } else {
                    dev.idhammai.c.r.q.i.a.W.field_1761.method_2906(dev.idhammai.c.r.q.i.a.W.field_1724.field_7512.field_7763, n3, n2, class_1713.field_7791, (class_1657)dev.idhammai.c.r.q.i.a.W.field_1724);
                    dev.idhammai.P.A.L.e.t();
                }
            }
            return;
        }
        dev.idhammai.c.r.q.i.a.n(this::lambda$onTick$70);
        if (this.Dp.h()) {
            dev.idhammai.P.A.L.e.g(class_1268.field_5808, this.U.X());
        }
        if (bl) {
            if (this.De.h()) {
                dev.idhammai.P.A.L.g.j(n2);
            } else {
                dev.idhammai.c.r.q.i.a.W.field_1761.method_2906(dev.idhammai.c.r.q.i.a.W.field_1724.field_7512.field_7763, n3, n2, class_1713.field_7791, (class_1657)dev.idhammai.c.r.q.i.a.W.field_1724);
                dev.idhammai.P.A.L.e.t();
            }
        }
        ++this.g;
        this.DL.H();
        this.Dc.H();
        if (this.p.h() && this.G()) {
            for (class_2350 class_23502 : class_2350.values()) {
                dev.idhammai.P.A.Y.N.r(this.Dg.method_10093(class_23502), this.Dl.h(), true);
            }
        }
        if (this.DY.h()) {
            dev.idhammai.c.r.q.i.a.W.field_1687.method_8501(this.Dg, class_2246.field_10124.method_9564());
        }
        if (this.Ds.h() && !this.q()) {
            Frog.ROTATION.M();
        }
        Dt = true;
    }

    private class_2596 lambda$onTick$70(int n2) {
        return new class_2846(class_2846.class_2847.field_12973, this.Dg, dev.idhammai.P.A.l.M.e(this.Dg), n2);
    }

    private boolean lambda$new$69() {
        return this.N.x(dev.idhammai.c.r.q.i.T.Render);
    }

    private boolean lambda$new$68() {
        return this.N.x(dev.idhammai.c.r.q.i.T.Render);
    }

    private boolean lambda$new$67() {
        return this.N.x(dev.idhammai.c.r.q.i.T.Render);
    }

    private boolean lambda$new$66() {
        return this.DH.h() && this.N.x(dev.idhammai.c.r.q.i.T.Render);
    }

    private boolean lambda$new$65() {
        return this.DH.h() && this.N.x(dev.idhammai.c.r.q.i.T.Render);
    }

    private boolean lambda$new$64() {
        return this.N.x(dev.idhammai.c.r.q.i.T.Render);
    }

    private boolean lambda$new$63() {
        return this.N.x(dev.idhammai.c.r.q.i.T.Render);
    }

    private boolean lambda$new$62() {
        return this.N.x(dev.idhammai.c.r.q.i.T.Render);
    }

    private boolean lambda$new$61() {
        return this.N.x(dev.idhammai.c.r.q.i.T.Render);
    }

    private boolean lambda$new$60() {
        return this.N.x(dev.idhammai.c.r.q.i.T.Render);
    }

    private boolean lambda$new$59() {
        return this.N.x(dev.idhammai.c.r.q.i.T.Render);
    }

    private boolean lambda$new$58() {
        return this.N.x(dev.idhammai.c.r.q.i.T.Render);
    }

    private boolean lambda$new$57() {
        return this.N.x(dev.idhammai.c.r.q.i.T.Render);
    }

    private boolean lambda$new$56() {
        return this.N.x(dev.idhammai.c.r.q.i.T.Render);
    }

    private boolean lambda$new$55() {
        return this.N.x(dev.idhammai.c.r.q.i.T.Place);
    }

    private boolean lambda$new$54() {
        return this.N.x(dev.idhammai.c.r.q.i.T.Place);
    }

    private boolean lambda$new$53() {
        return this.N.x(dev.idhammai.c.r.q.i.T.Place);
    }

    private boolean lambda$new$52() {
        return this.N.x(dev.idhammai.c.r.q.i.T.Place);
    }

    private boolean lambda$new$51() {
        return this.N.x(dev.idhammai.c.r.q.i.T.Place);
    }

    private boolean lambda$new$50() {
        return this.N.x(dev.idhammai.c.r.q.i.T.Place) && this.V.f() && this.A.h();
    }

    private boolean lambda$new$49() {
        return this.N.x(dev.idhammai.c.r.q.i.T.Place) && this.V.f();
    }

    private boolean lambda$new$48() {
        return this.N.x(dev.idhammai.c.r.q.i.T.Place) && this.V.f();
    }

    private boolean lambda$new$47() {
        return this.N.x(dev.idhammai.c.r.q.i.T.Place) && this.V.f();
    }

    private boolean lambda$new$46() {
        return this.N.x(dev.idhammai.c.r.q.i.T.Place) && this.V.f();
    }

    private boolean lambda$new$45() {
        return this.N.x(dev.idhammai.c.r.q.i.T.Place) && this.V.f();
    }

    private boolean lambda$new$44() {
        return this.N.x(dev.idhammai.c.r.q.i.T.Place);
    }

    private boolean lambda$new$43() {
        return this.N.x(dev.idhammai.c.r.q.i.T.Rotation) && this.DQ.f();
    }

    private boolean lambda$new$42() {
        return this.N.x(dev.idhammai.c.r.q.i.T.Rotation) && this.DQ.f();
    }

    private boolean lambda$new$41() {
        return this.N.x(dev.idhammai.c.r.q.i.T.Rotation) && this.DQ.f();
    }

    private boolean lambda$new$40() {
        return this.N.x(dev.idhammai.c.r.q.i.T.Rotation) && this.DQ.f();
    }

    private boolean lambda$new$39() {
        return this.N.x(dev.idhammai.c.r.q.i.T.Rotation) && this.DQ.f();
    }

    private boolean lambda$new$38() {
        return this.N.x(dev.idhammai.c.r.q.i.T.Rotation);
    }

    private boolean lambda$new$37() {
        return this.N.x(dev.idhammai.c.r.q.i.T.Rotation);
    }

    private boolean lambda$new$36() {
        return this.N.x(dev.idhammai.c.r.q.i.T.Rotation);
    }

    private boolean lambda$new$35() {
        return this.N.x(dev.idhammai.c.r.q.i.T.Rotation);
    }

    private boolean lambda$new$34() {
        return this.N.x(dev.idhammai.c.r.q.i.T.Check);
    }

    private boolean lambda$new$33() {
        return this.Dy.h() && this.N.x(dev.idhammai.c.r.q.i.T.Check);
    }

    private boolean lambda$new$32() {
        return this.N.x(dev.idhammai.c.r.q.i.T.Check);
    }

    private boolean lambda$new$31() {
        return this.N.x(dev.idhammai.c.r.q.i.T.Check) && this.DM.f();
    }

    private boolean lambda$new$30() {
        return this.N.x(dev.idhammai.c.r.q.i.T.Check);
    }

    private boolean lambda$new$29() {
        return this.N.x(dev.idhammai.c.r.q.i.T.Check) && this.F.h();
    }

    private boolean lambda$new$28() {
        return this.N.x(dev.idhammai.c.r.q.i.T.Check);
    }

    private boolean lambda$new$27() {
        return this.N.x(dev.idhammai.c.r.q.i.T.Check);
    }

    private boolean lambda$new$26() {
        return this.N.x(dev.idhammai.c.r.q.i.T.Check);
    }

    private boolean lambda$new$25() {
        return this.N.x(dev.idhammai.c.r.q.i.T.Check);
    }

    private boolean lambda$new$24() {
        return this.N.x(dev.idhammai.c.r.q.i.T.Check);
    }

    private boolean lambda$new$23() {
        return this.N.x(dev.idhammai.c.r.q.i.T.Check);
    }

    private boolean lambda$new$22() {
        return this.N.x(dev.idhammai.c.r.q.i.T.Check);
    }

    private boolean lambda$new$21() {
        return this.N.x(dev.idhammai.c.r.q.i.T.Check);
    }

    private boolean lambda$new$20() {
        return this.N.x(dev.idhammai.c.r.q.i.T.General);
    }

    private boolean lambda$new$19() {
        return this.N.x(dev.idhammai.c.r.q.i.T.General);
    }

    private boolean lambda$new$18() {
        return this.N.x(dev.idhammai.c.r.q.i.T.General);
    }

    private boolean lambda$new$17() {
        return this.N.x(dev.idhammai.c.r.q.i.T.General);
    }

    private boolean lambda$new$16() {
        return this.N.x(dev.idhammai.c.r.q.i.T.General);
    }

    private boolean lambda$new$15() {
        return this.N.x(dev.idhammai.c.r.q.i.T.General) && this.DH.f();
    }

    private boolean lambda$new$14() {
        return this.N.x(dev.idhammai.c.r.q.i.T.General) && this.DH.f();
    }

    private boolean lambda$new$13() {
        return this.N.x(dev.idhammai.c.r.q.i.T.General) && this.DH.f();
    }

    private boolean lambda$new$12() {
        return this.N.x(dev.idhammai.c.r.q.i.T.General);
    }

    private boolean lambda$new$11() {
        return this.N.x(dev.idhammai.c.r.q.i.T.General);
    }

    private boolean lambda$new$10() {
        return this.w.h() && !this.Dm.h() && this.N.x(dev.idhammai.c.r.q.i.T.General);
    }

    private boolean lambda$new$9() {
        return !this.Dm.h() && this.N.x(dev.idhammai.c.r.q.i.T.General);
    }

    private boolean lambda$new$8() {
        return this.N.x(dev.idhammai.c.r.q.i.T.General);
    }

    private boolean lambda$new$7() {
        return this.N.x(dev.idhammai.c.r.q.i.T.General);
    }

    private boolean lambda$new$6() {
        return this.N.X() == dev.idhammai.c.r.q.i.T.General;
    }

    private boolean lambda$new$5() {
        return this.N.x(dev.idhammai.c.r.q.i.T.General);
    }

    private boolean lambda$new$4() {
        return this.N.x(dev.idhammai.c.r.q.i.T.General);
    }

    private boolean lambda$new$3() {
        return this.N.x(dev.idhammai.c.r.q.i.T.General);
    }

    private boolean lambda$new$2() {
        return this.N.x(dev.idhammai.c.r.q.i.T.General);
    }

    private boolean lambda$new$1() {
        return this.N.x(dev.idhammai.c.r.q.i.T.General);
    }

    private boolean lambda$new$0() {
        return this.N.x(dev.idhammai.c.r.q.i.T.General);
    }

    static {
        e = 0.0;
        Dt = false;
        Db = false;
    }
}

