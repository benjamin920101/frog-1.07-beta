/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.BaritoneAPI
 *  baritone.api.IBaritone
 *  baritone.api.pathing.calc.IPathingControlManager
 *  baritone.api.pathing.goals.Goal
 *  baritone.api.pathing.goals.GoalBlock
 *  baritone.api.pathing.goals.GoalXZ
 *  baritone.api.process.IBaritoneProcess
 *  baritone.api.process.ICustomGoalProcess
 *  net.minecraft.block.Block
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 */
package dev.idhammai.c.r.q.N;

import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.pathing.calc.IPathingControlManager;
import baritone.api.pathing.goals.Goal;
import baritone.api.pathing.goals.GoalBlock;
import baritone.api.pathing.goals.GoalXZ;
import baritone.api.process.IBaritoneProcess;
import baritone.api.process.ICustomGoalProcess;
import dev.idhammai.Frog;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class t
extends y {
    public static t k;
    private final l L = this.p(new l("Range", 4.0, 1.0, 5.0).D("\u4ea4\u4e92\u8ddd\u79bb"));
    private final W u = this.S(new W("Place", true).k("\u5141\u8bb8\u653e\u7f6e"));
    private final W l = this.S(new W("Break", true).k("\u5141\u8bb8\u7834\u574f"));
    private final W E = this.S(new W("Sprint", true).k("\u5141\u8bb8\u75be\u8dd1"));
    private final W g = this.S(new W("UseInventory", false).k("\u4f7f\u7528\u80cc\u5305"));
    private final W d = this.S(new W("Vines", true).k("\u5141\u8bb8\u85e4\u8513"));
    private final W h = this.S(new W("JumpAt256", false).k("256\u9ad8\u5ea6\u53ef\u8df3"));
    private final W r = this.S(new W("WaterBucketFall", false).k("\u6454\u843d\u7528\u6c34\u6876"));
    private final W I = this.S(new W("Parkour", true).k("\u5141\u8bb8\u8dd1\u9177"));
    private final W b = this.S(new W("ParkourPlace", false).k("\u8dd1\u9177\u653e\u7f6e"));
    private final W y = this.S(new W("ParkourAscend", true).k("\u8dd1\u9177\u4e0a\u5347"));
    private final W D = this.S(new W("DiagonalAscend", false).k("\u5141\u8bb8\u659c\u5411\u4e0a"));
    private final W F = this.S(new W("DiagonalDescend", false).k("\u5141\u8bb8\u659c\u5411\u4e0b"));
    private final W a = this.S(new W("MineDownward", true).k("\u5141\u8bb8\u5411\u4e0b\u6316"));
    private final W P = this.S(new W("LegitMine", false).k("\u5408\u6cd5\u6316\u6398"));
    private final W p = this.S(new W("LogOnArrival", false).k("\u5230\u8fbe\u540e\u65ad\u7ebf"));
    private final W Z = this.S(new W("FreeLook", true).k("\u81ea\u7531\u89c6\u89d2"));
    private final W C = this.S(new W("AntiCheat", true).k("\u53cd\u4f5c\u5f0a\u517c\u5bb9"));
    private final W K = this.S(new W("Strict-Liquid", false).k("\u4e25\u683c\u6db2\u4f53\u68c0\u6d4b"));
    private final W Q = this.S(new W("CensorCoords", false).k("\u9690\u85cf\u5750\u6807"));
    private final W A = this.S(new W("CensorCommands", false).k("\u9690\u85cf\u6307\u4ee4"));
    private final W T = this.S(new W("ChatControl", false).k("\u804a\u5929\u63a7\u5236"));
    private final W V = this.S(new W("Debug", false).k("\u8c03\u8bd5\u8f93\u51fa"));

    public t() {
        super("Baritone", w.Client);
        Frog.EVENT_BUS.S(this);
        k = this;
        this.L("\u5bfb\u8def\u8bbe\u7f6e");
    }

    public static void w() {
        ICustomGoalProcess iCustomGoalProcess;
        class_2350 class_23502 = t.W.field_1724.method_5735();
        int n2 = t.W.field_1724.method_31477() + class_23502.method_10163().method_10263() * 30000000;
        int n3 = t.W.field_1724.method_31479() + class_23502.method_10163().method_10260() * 30000000;
        t.Z();
        IBaritone iBaritone = BaritoneAPI.getProvider().getPrimaryBaritone();
        if (iBaritone != null && (iCustomGoalProcess = iBaritone.getCustomGoalProcess()) != null) {
            iCustomGoalProcess.setGoalAndPath((Goal)new GoalXZ(n2, n3));
        }
    }

    public static boolean K() {
        IBaritone iBaritone = BaritoneAPI.getProvider().getPrimaryBaritone();
        return iBaritone != null && iBaritone.getPathingBehavior() != null && iBaritone.getPathingBehavior().isPathing();
    }

    public static void y(class_2338 class_23382) {
        IBaritone iBaritone = BaritoneAPI.getProvider().getPrimaryBaritone();
        if (iBaritone != null) {
            ICustomGoalProcess iCustomGoalProcess = iBaritone.getCustomGoalProcess();
            if (iCustomGoalProcess == null) {
                return;
            }
            iCustomGoalProcess.setGoalAndPath((Goal)new GoalBlock(class_23382.method_10263(), class_23382.method_10264(), class_23382.method_10260()));
        }
    }

    public static void z(class_2248 class_22482) {
        IBaritone iBaritone = BaritoneAPI.getProvider().getPrimaryBaritone();
        if (iBaritone != null) {
            iBaritone.getMineProcess().mine(new class_2248[]{class_22482});
        }
    }

    public static void Z() {
        IBaritone iBaritone = BaritoneAPI.getProvider().getPrimaryBaritone();
        if (iBaritone != null && iBaritone.getPathingBehavior() != null) {
            iBaritone.getPathingBehavior().cancelEverything();
        }
    }

    public static boolean k() {
        IBaritone iBaritone = BaritoneAPI.getProvider().getPrimaryBaritone();
        if (iBaritone != null) {
            ICustomGoalProcess iCustomGoalProcess = iBaritone.getCustomGoalProcess();
            if (iCustomGoalProcess != null && iCustomGoalProcess.isActive()) {
                return true;
            }
            IPathingControlManager iPathingControlManager = iBaritone.getPathingControlManager();
            if (iPathingControlManager != null && iPathingControlManager.mostRecentInControl().isPresent()) {
                return ((IBaritoneProcess)iPathingControlManager.mostRecentInControl().get()).isActive();
            }
        }
        return false;
    }

    @r
    public void H(QO qO) {
        BaritoneAPI.getSettings().blockReachDistance.value = Float.valueOf(this.L.Z());
        BaritoneAPI.getSettings().allowPlace.value = this.u.h();
        BaritoneAPI.getSettings().allowBreak.value = this.l.h();
        BaritoneAPI.getSettings().allowSprint.value = this.E.h();
        BaritoneAPI.getSettings().allowInventory.value = this.g.h();
        BaritoneAPI.getSettings().allowVines.value = this.d.h();
        BaritoneAPI.getSettings().allowJumpAt256.value = this.h.h();
        BaritoneAPI.getSettings().allowWaterBucketFall.value = this.r.h();
        BaritoneAPI.getSettings().allowParkour.value = this.I.h();
        BaritoneAPI.getSettings().allowParkourAscend.value = this.y.h();
        BaritoneAPI.getSettings().allowParkourPlace.value = this.b.h();
        BaritoneAPI.getSettings().allowDiagonalAscend.value = this.D.h();
        BaritoneAPI.getSettings().allowDiagonalDescend.value = this.F.h();
        BaritoneAPI.getSettings().allowDownward.value = this.a.h();
        BaritoneAPI.getSettings().legitMine.value = this.P.h();
        BaritoneAPI.getSettings().disconnectOnArrival.value = this.p.h();
        BaritoneAPI.getSettings().freeLook.value = this.Z.h();
        BaritoneAPI.getSettings().antiCheatCompatibility.value = this.C.h();
        BaritoneAPI.getSettings().strictLiquidCheck.value = this.K.h();
        BaritoneAPI.getSettings().censorCoordinates.value = this.Q.h();
        BaritoneAPI.getSettings().censorRanCommands.value = this.A.h();
        BaritoneAPI.getSettings().chatControl.value = this.T.h();
        BaritoneAPI.getSettings().chatDebug.value = this.V.h();
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
}

