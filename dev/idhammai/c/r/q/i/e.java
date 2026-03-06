/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1802
 *  net.minecraft.class_1810
 *  net.minecraft.class_1829
 *  net.minecraft.class_2199
 *  net.minecraft.class_2248
 *  net.minecraft.class_2281
 *  net.minecraft.class_2336
 *  net.minecraft.class_2596
 *  net.minecraft.class_2885
 *  net.minecraft.class_418
 */
package dev.idhammai.c.r.q.i;

import dev.idhammai.P.A.L.g;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.J;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import net.minecraft.class_1802;
import net.minecraft.class_1810;
import net.minecraft.class_1829;
import net.minecraft.class_2199;
import net.minecraft.class_2248;
import net.minecraft.class_2281;
import net.minecraft.class_2336;
import net.minecraft.class_2596;
import net.minecraft.class_2885;
import net.minecraft.class_418;

public class e
extends y {
    public static e V;
    public final W s = this.S(new W("NoEntityTrace", true).k("\u5ffd\u7565\u5b9e\u4f53\u5c04\u7ebf").D());
    public final W d = this.S(new W("OnlyPickaxe", true, this.s::f).k("\u4ec5\u9550\u5b50"));
    public final W K = this.S(new W("MultiTask", true).k("\u591a\u4efb\u52a1"));
    public final W N = this.S(new W("Respawn", true).k("\u81ea\u52a8\u91cd\u751f"));
    public final W Y = this.S(new W("IgnoreBedrock", false).k("\u5e7d\u7075\u624b"));
    private final W b = this.S(new W("NoMineAbort", false).k("\u4e0d\u53d6\u6d88\u6316\u6398"));
    private final W a = this.S(new W("NoMineReset", false).k("\u4e0d\u91cd\u7f6e\u6316\u6398"));
    private final W m = this.S(new W("NoMineDelay", false).k("\u65e0\u6316\u6398\u5ef6\u8fdf"));
    private final W M = this.S(new W("NoInteract", false).k("\u7981\u6b62\u8bef\u4ea4\u4e92"));
    private final W A = this.S(new W("SwitchEat", false).k("\u6316\u6398\u65f6\u5207\u82f9\u679c").D());
    private final W Z = this.S(new W("Sword", true, this.A::f).k("\u5141\u8bb8\u5251"));
    private final W u = this.S(new W("Pickaxe", true, this.A::f).k("\u5141\u8bb8\u9550\u5b50"));
    private final W B = this.S(new W("Reach", false).k("\u5ef6\u957f\u8ddd\u79bb"));
    public final l j = this.p(new l("BlockRange", 5.0, 0.0, 15.0, 0.1, this.B::h).D("\u65b9\u5757\u8ddd\u79bb"));
    public final l f = this.p(new l("EntityRange", 5.0, 0.0, 15.0, 0.1, this.B::h).D("\u5b9e\u4f53\u8ddd\u79bb"));
    private final l h = this.p(new l("UseDelay", 4.0, 0.0, 4.0, 1.0).D("\u4f7f\u7528\u5ef6\u8fdf"));
    public boolean t;
    boolean P = false;
    int C = 0;

    public e() {
        super("InteractTweaks", w.Player);
        this.L("\u4ea4\u4e92\u8c03\u6574");
        V = this;
    }

    @r
    public void M(QO qO) {
        if (this.N.h() && e.W.field_1755 instanceof class_418) {
            e.W.field_1724.method_7331();
            W.method_1507(null);
        }
        if (e.W.field_1752 <= 4 - this.h.V()) {
            e.W.field_1752 = 0;
        }
        if (this.A.h()) {
            if (!(e.W.field_1724.method_6047().method_7909() instanceof class_1810 && this.u.h() || e.W.field_1724.method_6047().method_7909() instanceof class_1829 && this.Z.h() || e.W.field_1724.method_6047().method_7909() == class_1802.field_8367 || e.W.field_1724.method_6047().method_7909() == class_1802.field_8463)) {
                this.P = false;
                return;
            }
            int n2 = g.E(class_1802.field_8367);
            if (n2 == -1) {
                n2 = g.E(class_1802.field_8463);
            }
            if (n2 == -1) {
                if (this.P) {
                    g.j(this.C);
                    this.P = false;
                }
                return;
            }
            if (e.W.field_1690.field_1904.method_1434()) {
                if ((e.W.field_1724.method_6047().method_7909() instanceof class_1810 && this.u.h() || e.W.field_1724.method_6047().method_7909() instanceof class_1829 && this.Z.h()) && e.W.field_1724.method_6079().method_7909() != class_1802.field_8367 && e.W.field_1724.method_6047().method_7909() != class_1802.field_8463) {
                    this.C = e.W.field_1724.method_31548().field_7545;
                    g.j(n2);
                    this.P = true;
                }
            } else if (this.P) {
                g.j(this.C);
                this.P = false;
            }
        }
    }

    @r
    public void U(J j2) {
        class_2596<?> class_25962;
        if (e.M() || !this.M.h() || !((class_25962 = j2.L()) instanceof class_2885)) {
            return;
        }
        class_2885 class_28852 = (class_2885)class_25962;
        class_2248 class_22482 = e.W.field_1687.method_8320(class_28852.method_12543().method_17777()).method_26204();
        if (!e.W.field_1724.method_5715() && (class_22482 instanceof class_2281 || class_22482 instanceof class_2336 || class_22482 instanceof class_2199)) {
            j2.L();
        }
    }

    @Override
    public void L() {
        this.t = false;
    }

    public boolean P() {
        return this.p() && this.B.h();
    }

    public boolean w() {
        return this.p() && this.b.h() && !e.W.field_1690.field_1904.method_1434();
    }

    public boolean R() {
        return this.p() && this.a.h();
    }

    public boolean E() {
        return this.p() && this.m.h();
    }

    public boolean j() {
        return this.p() && this.K.h();
    }

    public boolean B() {
        if (this.W() || !this.s.h()) {
            return false;
        }
        if (this.d.h()) {
            return e.W.field_1724.method_6047().method_7909() instanceof class_1810 || e.W.field_1724.method_6115() && !(e.W.field_1724.method_6047().method_7909() instanceof class_1829);
        }
        return true;
    }

    public boolean Q() {
        return this.p() && this.Y.h() && !e.W.field_1690.field_1904.method_1434() && !e.W.field_1690.field_1832.method_1434();
    }
}

