/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_2561
 *  net.minecraft.class_2596
 *  net.minecraft.class_2661
 *  net.minecraft.class_2868
 */
package dev.idhammai.c.r.q.x;

import dev.idhammai.P.A.L.e;
import dev.idhammai.P.A.L.g;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.Q4;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import dev.idhammai.p.J.S;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2561;
import net.minecraft.class_2596;
import net.minecraft.class_2661;
import net.minecraft.class_2868;

public class R
extends y {
    public static boolean A = false;
    private final W Y = this.S(new W("LogOnEnable", false).k("\u542f\u7528\u5373\u4e0b\u7ebf"));
    private final W b = this.S(new W("OnPop", true).k("\u7206\u56fe\u817e\u4e0b\u7ebf"));
    private final W j = this.S(new W("LowArmor", true).k("\u4f4e\u8010\u4e45\u4e0b\u7ebf"));
    private final W u = this.S(new W("TotemLess", true).k("\u56fe\u817e\u4e0d\u8db3\u4e0b\u7ebf").D());
    private final l Q = this.p(new l("Totems", 2.0, 0.0, 20.0, 1.0, this.u::f).D("\u56fe\u817e\u9608\u503c"));
    private final W a = this.S(new W("AutoDisable", true).k("\u81ea\u52a8\u5173\u95ed"));
    private final W M = this.S(new W("ShowReason", false).k("\u663e\u793a\u65ad\u5f00\u539f\u56e0"));

    public R() {
        super("AutoLog", w.Misc);
        this.L("\u81ea\u52a8\u4e0b\u7ebf");
    }

    @Override
    public void H() {
        if (this.Y.h()) {
            this.E("Enabled");
        }
    }

    @r
    public void e(QO qO) {
        if (this.u.h()) {
            int n2;
            int n3 = g.z(class_1802.field_8288);
            if ((double)n2 <= this.Q.e()) {
                this.E("You have too few totems (" + n3 + ").");
                return;
            }
        }
        if (this.j.h()) {
            for (class_1799 class_17992 : R.W.field_1724.method_31548().field_7548) {
                int n4;
                if (class_17992.method_7960() || (n4 = e.a(class_17992)) >= 5) continue;
                this.E("Your armor has keyCodec durability of less than 5%.");
                return;
            }
        }
    }

    @r
    public void L(Q4 q4) {
        if (this.b.h() && q4.z() == R.W.field_1724) {
            this.E("You poped 1 totem!");
        }
    }

    @Override
    public void W() {
        if (this.a.h()) {
            this.p();
        }
    }

    private void E(String string) {
        A = true;
        dev.idhammai.p.J.S.z("\u00a74[AutoLog] " + string);
        W.method_1562().method_52787((class_2596)new class_2868(114514));
        if (this.M.h()) {
            R.W.field_1724.field_3944.method_52781(new class_2661((class_2561)class_2561.method_43470((String)("[AutoLog]" + string))));
        }
    }
}

