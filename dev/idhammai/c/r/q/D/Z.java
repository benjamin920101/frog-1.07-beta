/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1657
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2560
 *  net.minecraft.class_2596
 *  net.minecraft.class_2680
 *  net.minecraft.class_2846
 *  net.minecraft.class_2846$class_2847
 */
package dev.idhammai.c.r.q.D;

import dev.idhammai.Frog;
import dev.idhammai.P.A.L.l;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.P.r.c.V;
import dev.idhammai.c.r.O.Y.B;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.q.D.t;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_1657;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2560;
import net.minecraft.class_2596;
import net.minecraft.class_2680;
import net.minecraft.class_2846;

public class Z
extends y {
    public static Z F;
    public final B<t> r = this.S(new B<t>("Mode", dev.idhammai.c.r.q.D.t.Vanilla).I("\u6a21\u5f0f").X(dev.idhammai.c.r.q.D.t.Vanilla, "\u539f\u7248").X(dev.idhammai.c.r.q.D.t.Strict, "\u4e25\u683c").X(dev.idhammai.c.r.q.D.t.Custom, "\u81ea\u5b9a\u4e49").X(dev.idhammai.c.r.q.D.t.Ignore, "\u5ffd\u7565"));
    public final W w = this.S(new W("OnlySneak", true).k("\u4ec5\u6f5c\u884c\u751f\u6548"));
    public final W D = this.S(new W("Grim", false).k("Grim\u7ed5\u8fc7").D());
    public final W b = this.S(new W("AbortPacket", true, this.D::f).k("\u53d1\u9001\u4e2d\u65ad\u5305"));
    public final dev.idhammai.c.r.O.Y.l V = this.p(new dev.idhammai.c.r.O.Y.l("XZSpeed", 25.0, 0.0, 100.0, 0.1, this::lambda$new$0).D("XZ\u901f\u5ea6").P("%"));
    public final dev.idhammai.c.r.O.Y.l t = this.p(new dev.idhammai.c.r.O.Y.l("YSpeed", 100.0, 0.0, 100.0, 0.1, this::lambda$new$1).D("Y\u901f\u5ea6").P("%"));
    private final dev.idhammai.c.r.O.Y.l R = this.p(new dev.idhammai.c.r.O.Y.l("Speed", 3.0, 0.0, 8.0, this::lambda$new$2).D("\u52a0\u901f\u500d\u7387"));
    private boolean E = false;

    public Z() {
        super("FastWeb", "So you don't need to keep timer on keybind", dev.idhammai.c.r.w.Movement);
        this.L("\u8718\u86db\u7f51\u52a0\u901f");
        F = this;
    }

    @Override
    public String I() {
        return this.r.X().name();
    }

    @r
    public void k(QO qO) {
        this.E = !Z.W.field_1724.method_24828() && (Z.W.field_1690.field_1832.method_1434() || !this.w.h()) && Frog.PLAYER.n((class_1657)Z.W.field_1724);
        boolean bl = this.E;
        if (this.E && this.r.x(dev.idhammai.c.r.q.D.t.Vanilla)) {
            l.d(-this.R.e());
        }
        if (this.D.h() && (Z.W.field_1690.field_1832.method_1434() || !this.w.h())) {
            for (class_2338 class_23382 : this.N()) {
                if (this.b.h()) {
                    W.method_1562().method_52787((class_2596)new class_2846(class_2846.class_2847.field_12971, class_23382, class_2350.field_11033));
                }
                W.method_1562().method_52787((class_2596)new class_2846(class_2846.class_2847.field_12973, class_23382, class_2350.field_11033));
            }
        }
    }

    @r(D=-100)
    public void B(V v2) {
        if (this.E && this.r.X() == dev.idhammai.c.r.q.D.t.Strict) {
            v2.K(this.R.Z());
        }
    }

    public List<class_2338> N() {
        int n2 = 2;
        ArrayList<class_2338> arrayList = new ArrayList<class_2338>();
        for (int i2 = n2; i2 > -n2; --i2) {
            for (int i3 = n2; i3 > -n2; --i3) {
                for (int i4 = n2; i4 > -n2; --i4) {
                    class_2680 class_26802;
                    class_2338 class_23382 = class_2338.method_49637((double)(Z.W.field_1724.method_23317() + (double)i2), (double)(Z.W.field_1724.method_23318() + (double)i3), (double)(Z.W.field_1724.method_23321() + (double)i4));
                    if (Z.W.field_1724.method_19538().method_1022(class_23382.method_46558()) > 1.0 && Z.W.field_1724.method_33571().method_1022(class_23382.method_46558()) > 1.0 || !((class_26802 = Z.W.field_1687.method_8320(class_23382)).method_26204() instanceof class_2560)) continue;
                    arrayList.add(class_23382);
                }
            }
        }
        return arrayList;
    }

    private boolean lambda$new$2() {
        return this.r.X() == dev.idhammai.c.r.q.D.t.Vanilla || this.r.X() == dev.idhammai.c.r.q.D.t.Strict;
    }

    private boolean lambda$new$1() {
        return this.r.X() == dev.idhammai.c.r.q.D.t.Custom;
    }

    private boolean lambda$new$0() {
        return this.r.X() == dev.idhammai.c.r.q.D.t.Custom;
    }
}

