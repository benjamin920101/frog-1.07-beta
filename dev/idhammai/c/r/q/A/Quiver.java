/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.BowItem
 *  net.minecraft.item.Items
 */
package dev.idhammai.c.r.q.A;

import dev.idhammai.Frog;
import dev.idhammai.P.A.L.g;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.A;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.c.r.O.Y.O;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import net.minecraft.util.Hand;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BowItem;
import net.minecraft.item.Items;

public class f
extends y {
    private final W y = this.S(new W("InstantRotate", true).k("\u77ac\u65f6\u8f6c\u5411"));
    private final l d = this.p(new l("Time", (double)0.11f, 0.0, 1.0, 0.01).D("\u84c4\u529b\u65f6\u95f4"));
    private final W m = this.S(new W("OnlyPress", false).k("\u4ec5\u6309\u952e\u65f6"));
    private final O a = this.n(new O("ActiveKey", -1).E("\u542f\u7528\u6309\u952e"));
    boolean R = false;
    boolean C = false;
    boolean F = false;
    int A;

    public f() {
        super("Quiver", w.Combat);
        this.L("\u5934\u9876\u5c04\u7bad");
    }

    @Override
    public void H() {
        this.R = false;
    }

    @r
    public void j(QO qO) {
        int n2;
        if (this.a.G()) {
            if (!this.C && !this.F && (n2 = g.E(class_1802.field_8102)) != -1) {
                this.A = f.W.field_1724.method_31548().field_7545;
                g.j(n2);
                f.W.field_1690.field_1904.method_23481(true);
                this.F = true;
                this.C = true;
            }
        } else {
            this.C = false;
        }
        if (this.F && (!f.W.field_1690.field_1904.method_1434() || f.W.field_1724.method_6115() && f.W.field_1724.method_6030().method_7909() != class_1802.field_8102)) {
            g.j(this.A);
            this.F = false;
        }
        n2 = (f.W.field_1724.method_6115() && (f.W.field_1724.method_6058() == class_1268.field_5808 ? f.W.field_1724.method_6047() : f.W.field_1724.method_6079()).method_7909() instanceof class_1753 ? true : (this.R = false)) ? 1 : 0;
        if (this.R && (!this.m.h() || this.F) && (double)class_1753.method_7722((int)f.W.field_1724.method_6048()) >= this.d.e()) {
            if (this.y.h()) {
                Frog.ROTATION.o(Frog.ROTATION.Q, -90.0f);
            }
            f.W.field_1690.field_1904.method_23481(false);
            f.W.field_1761.method_2897((class_1657)f.W.field_1724);
            if (this.y.h()) {
                Frog.ROTATION.M();
            }
        }
    }

    @r
    public void u(A a2) {
        if (this.R && !this.y.h()) {
            a2.p(-90.0f);
        }
    }
}

