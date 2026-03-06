/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1297
 *  net.minecraft.class_1511
 *  net.minecraft.class_1657
 *  net.minecraft.class_2246
 *  net.minecraft.class_2338
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_2596
 *  net.minecraft.class_2680
 *  net.minecraft.class_2824
 *  net.minecraft.class_742
 */
package dev.idhammai.P.A.Y;

import dev.idhammai.Frog;
import dev.idhammai.P.A.A.A;
import dev.idhammai.P.A.A.h;
import dev.idhammai.P.A.J;
import dev.idhammai.P.A.L.e;
import dev.idhammai.P.A.l.M;
import dev.idhammai.c.r.q.N.x;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1511;
import net.minecraft.class_1657;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2680;
import net.minecraft.class_2824;
import net.minecraft.class_742;

public class N
implements J {
    public static final h x = new h();
    public static boolean z = false;
    public static class_2338 y;
    public static class_2680 Z;

    public static List<class_1657> c(double d2) {
        ArrayList<class_1657> arrayList = new ArrayList<class_1657>();
        for (class_742 class_7422 : Frog.THREAD.v()) {
            if (!N.y((class_1297)class_7422, d2)) continue;
            arrayList.add((class_1657)class_7422);
        }
        return arrayList;
    }

    public static void r(class_2338 class_23382, boolean bl, boolean bl2) {
        N.R(new class_238(class_23382), bl, bl2);
    }

    public static void R(class_238 class_2383, boolean bl, boolean bl2) {
        for (class_1511 class_15112 : M.U(class_2383)) {
            N.h((class_1297)class_15112, bl, bl2);
        }
    }

    public static void h(class_1297 class_12972, boolean bl, boolean bl2) {
        if (!x.m((long)(dev.idhammai.c.r.q.N.x.y.p.e() * 1000.0))) {
            return;
        }
        if (bl2 && N.W.field_1724.method_6115()) {
            return;
        }
        N.P(class_12972, bl);
    }

    public static void P(class_1297 class_12972, boolean bl) {
        if (class_12972 != null) {
            class_243 class_2432 = A.r(N.W.field_1724.method_33571(), class_12972.method_5829());
            if (N.W.field_1724.method_33571().method_1022(class_2432) > dev.idhammai.c.r.q.N.x.y.k.e()) {
                return;
            }
            x.H();
            if (bl && dev.idhammai.c.r.q.N.x.y.h.h()) {
                Frog.ROTATION.a(class_2432);
            }
            W.method_1562().method_52787((class_2596)class_2824.method_34206((class_1297)class_12972, (boolean)N.W.field_1724.method_5715()));
            N.W.field_1724.method_7350();
            e.g(class_1268.field_5808, dev.idhammai.c.r.q.N.x.y.f.X());
            if (bl && dev.idhammai.c.r.q.N.x.y.h.h()) {
                Frog.ROTATION.M();
            }
        }
    }

    public static boolean Y(class_1297 class_12972, double d2) {
        return !N.y(class_12972, d2);
    }

    public static boolean y(class_1297 class_12972, double d2) {
        class_1657 class_16572;
        boolean bl = class_12972 == null || !class_12972.method_5805() || class_12972.equals((Object)N.W.field_1724) || class_12972 instanceof class_1657 && Frog.FRIEND.r(class_16572 = (class_1657)class_12972) || N.W.field_1724.method_19538().method_1022(class_12972.method_19538()) > d2;
        return !bl;
    }

    public static boolean D(class_1297 class_12972) {
        class_1657 class_16572;
        boolean bl = class_12972 == null || !class_12972.method_5805() || class_12972.equals((Object)N.W.field_1724) || class_12972 instanceof class_1657 && Frog.FRIEND.r(class_16572 = (class_1657)class_12972);
        return !bl;
    }

    public static class_1657 h(double d2) {
        class_1657 class_16572 = null;
        for (class_1657 class_16573 : N.c(d2)) {
            if (class_16572 == null) {
                class_16572 = class_16573;
                continue;
            }
            if (!(N.W.field_1724.method_5707(class_16573.method_19538()) < N.W.field_1724.method_5858((class_1297)class_16572))) continue;
            class_16572 = class_16573;
        }
        return class_16572;
    }

    static {
        Z = class_2246.field_10124.method_9564();
    }
}

