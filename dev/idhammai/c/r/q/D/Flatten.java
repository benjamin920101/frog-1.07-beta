/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.ExperienceOrbEntity
 *  net.minecraft.entity.decoration.EndCrystalEntity
 *  net.minecraft.entity.ItemEntity
 *  net.minecraft.entity.projectile.ArrowEntity
 *  net.minecraft.entity.projectile.thrown.ExperienceBottleEntity
 *  net.minecraft.block.Blocks
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Box
 */
package dev.idhammai.c.r.q.D;

import dev.idhammai.Frog;
import dev.idhammai.P.A.A.h;
import dev.idhammai.P.A.L.e;
import dev.idhammai.P.A.L.g;
import dev.idhammai.P.A.Y.N;
import dev.idhammai.P.A.l.M;
import dev.idhammai.P.A.l.k;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.q.Q.W;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ExperienceOrbEntity;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.projectile.thrown.ExperienceBottleEntity;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Box;

public class D
extends y {
    public static D Z;
    private final dev.idhammai.c.r.O.Y.W Q = this.S(new dev.idhammai.c.r.O.Y.W("Rotate", true).k("\u8f6c\u5411"));
    private final dev.idhammai.c.r.O.Y.W r = this.S(new dev.idhammai.c.r.O.Y.W("DetectMining", true).k("\u68c0\u6d4b\u6316\u6398"));
    private final dev.idhammai.c.r.O.Y.W L = this.S(new dev.idhammai.c.r.O.Y.W("InventorySwap", true).k("\u80cc\u5305\u5207\u6362"));
    private final dev.idhammai.c.r.O.Y.W n = this.S(new dev.idhammai.c.r.O.Y.W("UsingPause", true).k("\u4f7f\u7528\u6682\u505c"));
    private final dev.idhammai.c.r.O.Y.W K = this.S(new dev.idhammai.c.r.O.Y.W("Cover", false).k("\u9700\u8981\u4e0a\u65b9\u8986\u76d6"));
    private final l M = this.p(new l("BlocksPer", 2, 1, 8).D("\u6bcf\u6b21\u653e\u7f6e"));
    private final l I = this.p(new l("Delay", 100, 0, 1000).D("\u5ef6\u8fdf"));
    private final h y = new h();
    int B = 0;

    public D() {
        super("Flatten", w.Movement);
        this.L("\u586b\u5e73\u811a\u4e0b");
        Z = this;
    }

    @r
    public void P(QO qO) {
        this.B = 0;
        if (this.L.h() && !e.n()) {
            return;
        }
        if (W.b.p() && W.b.m.h()) {
            return;
        }
        if (this.n.h() && D.W.field_1724.method_6115()) {
            return;
        }
        if (!D.W.field_1724.method_24828()) {
            return;
        }
        if (!this.y.m(this.I.V())) {
            return;
        }
        int n2 = D.W.field_1724.method_31548().field_7545;
        int n3 = this.M();
        if (n3 == -1) {
            return;
        }
        if (!e.j()) {
            return;
        }
        class_2338 class_23382 = new k(D.W.field_1724.method_23317() + 0.5, D.W.field_1724.method_23318() + 0.5, D.W.field_1724.method_23321() + 0.5).method_10074();
        class_2338 class_23383 = new k(D.W.field_1724.method_23317() - 0.5, D.W.field_1724.method_23318() + 0.5, D.W.field_1724.method_23321() + 0.5).method_10074();
        class_2338 class_23384 = new k(D.W.field_1724.method_23317() + 0.5, D.W.field_1724.method_23318() + 0.5, D.W.field_1724.method_23321() - 0.5).method_10074();
        class_2338 class_23385 = new k(D.W.field_1724.method_23317() - 0.5, D.W.field_1724.method_23318() + 0.5, D.W.field_1724.method_23321() - 0.5).method_10074();
        if (!(this.y(class_23382) || this.y(class_23383) || this.y(class_23384) || this.y(class_23385))) {
            return;
        }
        N.r(class_23382, this.Q.h(), this.n.h());
        N.r(class_23383, this.Q.h(), this.n.h());
        N.r(class_23384, this.Q.h(), this.n.h());
        N.r(class_23385, this.Q.h(), this.n.h());
        this.u(n3);
        this.H(class_23382, this.Q.h());
        this.H(class_23383, this.Q.h());
        this.H(class_23384, this.Q.h());
        this.H(class_23385, this.Q.h());
        if (this.L.h()) {
            this.u(n3);
            e.t();
        } else {
            this.u(n2);
        }
    }

    private void H(class_2338 class_23382, boolean bl) {
        if (this.y(class_23382)) {
            if (!((double)this.B < this.M.e())) {
                return;
            }
            if (dev.idhammai.P.A.l.M.q()) {
                dev.idhammai.P.A.l.M.V.add(class_23382);
                dev.idhammai.P.A.l.M.V(class_23382, bl);
                this.y.H();
                ++this.B;
                return;
            }
            class_2350 class_23502 = dev.idhammai.P.A.l.M.x(class_23382);
            if (class_23502 == null) {
                return;
            }
            ++this.B;
            dev.idhammai.P.A.l.M.V.add(class_23382);
            dev.idhammai.P.A.l.M.T(class_23382.method_10093(class_23502), class_23502.method_10153(), bl);
            this.y.H();
        }
    }

    private void u(int n2) {
        if (this.L.h()) {
            g.z(n2, D.W.field_1724.method_31548().field_7545);
        } else {
            g.j(n2);
        }
    }

    private boolean y(class_2338 class_23382) {
        if (this.r.h() && Frog.BREAK.X(class_23382)) {
            return false;
        }
        if (this.K.h() && D.W.field_1687.method_22347(class_23382.method_10084())) {
            return false;
        }
        if (dev.idhammai.P.A.l.M.x(class_23382) == null) {
            return false;
        }
        if (!dev.idhammai.P.A.l.M.c(class_23382)) {
            return false;
        }
        return !this.N(class_23382);
    }

    private boolean N(class_2338 class_23382) {
        for (class_1297 class_12972 : dev.idhammai.P.A.l.M.c(new class_238(class_23382))) {
            if (class_12972 == D.W.field_1724 || !class_12972.method_5805() || class_12972 instanceof class_1542 || class_12972 instanceof class_1303 || class_12972 instanceof class_1683 || class_12972 instanceof class_1667 || class_12972 instanceof class_1511) continue;
            return true;
        }
        return false;
    }

    private int M() {
        if (this.L.h()) {
            return g.H(class_2246.field_10540);
        }
        return g.L(class_2246.field_10540);
    }
}

