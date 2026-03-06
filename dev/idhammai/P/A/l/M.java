/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1297
 *  net.minecraft.class_1303
 *  net.minecraft.class_1511
 *  net.minecraft.class_1531
 *  net.minecraft.class_1542
 *  net.minecraft.class_1667
 *  net.minecraft.class_1683
 *  net.minecraft.class_1802
 *  net.minecraft.class_1922
 *  net.minecraft.class_1923
 *  net.minecraft.class_1937
 *  net.minecraft.class_1941
 *  net.minecraft.class_2199
 *  net.minecraft.class_2231
 *  net.minecraft.class_2237
 *  net.minecraft.class_2244
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2269
 *  net.minecraft.class_2304
 *  net.minecraft.class_2323
 *  net.minecraft.class_2338
 *  net.minecraft.class_2349
 *  net.minecraft.class_2350
 *  net.minecraft.class_238
 *  net.minecraft.class_2406
 *  net.minecraft.class_2428
 *  net.minecraft.class_243
 *  net.minecraft.class_2533
 *  net.minecraft.class_2586
 *  net.minecraft.class_2596
 *  net.minecraft.class_265
 *  net.minecraft.class_2680
 *  net.minecraft.class_2818
 *  net.minecraft.class_2846
 *  net.minecraft.class_2846$class_2847
 *  net.minecraft.class_2885
 *  net.minecraft.class_3711
 *  net.minecraft.class_3713
 *  net.minecraft.class_3718
 *  net.minecraft.class_3965
 *  net.minecraft.class_5329
 *  net.minecraft.class_638
 *  net.minecraft.class_746
 *  org.jetbrains.annotations.Nullable
 */
package dev.idhammai.P.A.l;

import dev.idhammai.Frog;
import dev.idhammai.P.A.A.A;
import dev.idhammai.P.A.J;
import dev.idhammai.P.A.L.e;
import dev.idhammai.P.A.l.k;
import dev.idhammai.c.r.O.p.S;
import dev.idhammai.c.r.q.A.i;
import dev.idhammai.c.r.q.N.I;
import dev.idhammai.c.r.q.N.x;
import dev.idhammai.c.r.q.i.Z;
import dev.idhammai.c.r.y;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1303;
import net.minecraft.class_1511;
import net.minecraft.class_1531;
import net.minecraft.class_1542;
import net.minecraft.class_1667;
import net.minecraft.class_1683;
import net.minecraft.class_1802;
import net.minecraft.class_1922;
import net.minecraft.class_1923;
import net.minecraft.class_1937;
import net.minecraft.class_1941;
import net.minecraft.class_2199;
import net.minecraft.class_2231;
import net.minecraft.class_2237;
import net.minecraft.class_2244;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2269;
import net.minecraft.class_2304;
import net.minecraft.class_2323;
import net.minecraft.class_2338;
import net.minecraft.class_2349;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_2406;
import net.minecraft.class_2428;
import net.minecraft.class_243;
import net.minecraft.class_2533;
import net.minecraft.class_2586;
import net.minecraft.class_2596;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_2818;
import net.minecraft.class_2846;
import net.minecraft.class_2885;
import net.minecraft.class_3711;
import net.minecraft.class_3713;
import net.minecraft.class_3718;
import net.minecraft.class_3965;
import net.minecraft.class_5329;
import net.minecraft.class_638;
import net.minecraft.class_746;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class M
implements J {
    public static final List<class_2338> V = new ArrayList<class_2338>();
    private static final double u = 0.4;
    private static final double h = 1.62;
    private static final double O = 2.0E-4;

    public static boolean d(class_2338 class_23382) {
        return M.c(class_23382, 1000.0);
    }

    public static boolean c(class_2338 class_23382, double d2) {
        if (M.H(class_23382, d2) == null) {
            return false;
        }
        if (!M.c(class_23382)) {
            return false;
        }
        return !M.r(class_23382, false);
    }

    public static boolean A(class_2338 class_23382, double d2, boolean bl) {
        if (M.H(class_23382, d2) == null) {
            return false;
        }
        if (!M.c(class_23382)) {
            return false;
        }
        return !M.r(class_23382, bl);
    }

    public static boolean U(class_2338 class_23382, boolean bl) {
        if (!M.c(class_23382)) {
            return false;
        }
        return !M.r(class_23382, bl);
    }

    public static List<class_1297> c(class_238 class_2383) {
        ArrayList<class_1297> arrayList = new ArrayList<class_1297>();
        for (class_1297 class_12972 : Frog.THREAD.z()) {
            if (class_12972 == null || class_12972 instanceof class_1531 && x.y.J.h() || !class_12972.method_5829().method_994(class_2383)) continue;
            arrayList.add(class_12972);
        }
        return arrayList;
    }

    public static List<class_1511> U(class_238 class_2383) {
        ArrayList<class_1511> arrayList = new ArrayList<class_1511>();
        for (class_1297 class_12972 : Frog.THREAD.z()) {
            class_1511 class_15112;
            if (!(class_12972 instanceof class_1511) || !(class_15112 = (class_1511)class_12972).method_5829().method_994(class_2383)) continue;
            arrayList.add(class_15112);
        }
        return arrayList;
    }

    public static boolean r(class_2338 class_23382, boolean bl) {
        return M.J(new class_238(class_23382), bl);
    }

    public static boolean J(class_238 class_2383, boolean bl) {
        for (class_1297 class_12972 : M.c(class_2383)) {
            if (!class_12972.method_5805() || class_12972 instanceof class_1542 || class_12972 instanceof class_1303 || class_12972 instanceof class_1683 || class_12972 instanceof class_1667 || bl && class_12972 instanceof class_1511 && M.W.field_1724.method_33571().method_1022(A.V(class_12972)) <= x.y.k.e()) continue;
            return true;
        }
        return false;
    }

    public static boolean p(class_2338 class_23382) {
        for (class_1297 class_12972 : M.U(new class_238(class_23382))) {
            if (!class_12972.method_5805() || !(class_12972 instanceof class_1511)) continue;
            return true;
        }
        return false;
    }

    public static boolean R(class_2338 class_23382, boolean bl) {
        return M.k(class_23382, bl, false);
    }

    public static boolean k(class_2338 class_23382, boolean bl, boolean bl2) {
        for (class_1297 class_12972 : M.c(new class_238(class_23382))) {
            if (!class_12972.method_5805() || bl2 && class_12972 instanceof class_1542 || bl && class_12972 instanceof class_1511 && M.W.field_1724.method_33571().method_1022(A.V(class_12972)) <= x.y.k.e()) continue;
            return false;
        }
        return true;
    }

    public static boolean k(class_2338 class_23382) {
        class_2338 class_23383 = class_23382.method_10074();
        class_2338 class_23384 = class_23383.method_10084();
        return !(M.x(class_23383) != class_2246.field_9987 && M.x(class_23383) != class_2246.field_10540 || M.S(class_23383) == null || !M.W.field_1687.method_22347(class_23384) || !M.R(class_23384, false) || !M.R(class_23384.method_10084(), false) || I.Q.s.h() && !M.W.field_1687.method_22347(class_23384.method_10084()));
    }

    public static void E(class_2338 class_23382, boolean bl) {
        boolean bl2 = M.W.field_1724.method_6079().method_7909() == class_1802.field_8301;
        class_2338 class_23383 = class_23382.method_10074();
        class_2350 class_23502 = M.e(class_23383);
        class_243 class_2432 = class_23383.method_46558().method_1031((double)class_23502.method_10163().method_10263() * 0.5, (double)class_23502.method_10163().method_10264() * 0.5, (double)class_23502.method_10163().method_10260() * 0.5);
        if (bl) {
            Frog.ROTATION.a(class_2432);
        }
        M.Y(class_23383, class_23502, false, bl2 ? class_1268.field_5810 : class_1268.field_5808);
    }

    public static void i(class_2338 class_23382, boolean bl) {
        M.R(class_23382, bl, x.y.Y.h());
    }

    public static void R(class_2338 class_23382, boolean bl, boolean bl2) {
        if (M.q()) {
            V.add(class_23382);
            M.r(class_23382, bl, class_1268.field_5808, bl2);
            return;
        }
        class_2350 class_23502 = M.x(class_23382);
        if (class_23502 == null) {
            return;
        }
        V.add(class_23382);
        M.K(class_23382.method_10093(class_23502), class_23502.method_10153(), bl, class_1268.field_5808, bl2);
    }

    public static void T(class_2338 class_23382, class_2350 class_23502, boolean bl) {
        M.Y(class_23382, class_23502, bl, class_1268.field_5808);
    }

    public static void Y(class_2338 class_23382, class_2350 class_23502, boolean bl, class_1268 class_12682) {
        M.K(class_23382, class_23502, bl, class_12682, x.y.Y.h());
    }

    public static void E(class_2338 class_23382, class_2350 class_23502, boolean bl, boolean bl2) {
        M.K(class_23382, class_23502, bl, class_1268.field_5808, bl2);
    }

    public static void K(class_2338 class_23382, class_2350 class_23502, boolean bl, class_1268 class_12682, boolean bl2) {
        class_243 class_2432 = new class_243((double)class_23382.method_10263() + 0.5 + (double)class_23502.method_10163().method_10263() * 0.5, (double)class_23382.method_10264() + 0.5 + (double)class_23502.method_10163().method_10264() * 0.5, (double)class_23382.method_10260() + 0.5 + (double)class_23502.method_10163().method_10260() * 0.5);
        if (bl) {
            Frog.ROTATION.a(class_2432);
        }
        e.g(class_12682, x.y.H.X());
        class_3965 class_39652 = new class_3965(class_2432, class_23502, class_23382, false);
        if (bl2) {
            y.n(arg_0 -> M.lambda$clickBlock$0(class_12682, class_39652, arg_0));
        } else {
            M.W.field_1761.method_2896(M.W.field_1724, class_12682, class_39652);
        }
        M.W.field_1752 = 4;
        if (bl) {
            Frog.ROTATION.M();
        }
    }

    public static void g(class_2338 class_23382, class_2350 class_23502, boolean bl, class_1268 class_12682, S s2) {
        class_243 class_2432 = new class_243((double)class_23382.method_10263() + 0.5 + (double)class_23502.method_10163().method_10263() * 0.5, (double)class_23382.method_10264() + 0.5 + (double)class_23502.method_10163().method_10264() * 0.5, (double)class_23382.method_10260() + 0.5 + (double)class_23502.method_10163().method_10260() * 0.5);
        if (bl) {
            Frog.ROTATION.a(class_2432);
        }
        e.g(class_12682, s2);
        class_3965 class_39652 = new class_3965(class_2432, class_23502, class_23382, false);
        y.n(arg_0 -> M.lambda$clickBlock$1(class_12682, class_39652, arg_0));
        M.W.field_1752 = 4;
        if (bl) {
            Frog.ROTATION.M();
        }
    }

    public static void V(class_2338 class_23382, boolean bl) {
        M.r(class_23382, bl, class_1268.field_5808, x.y.Y.h());
    }

    public static void r(class_2338 class_23382, boolean bl, class_1268 class_12682, boolean bl2) {
        boolean bl3 = class_12682 == class_1268.field_5808 && Z.y.U.h();
        boolean bl4 = bl3;
        if (bl3) {
            W.method_1562().method_52787((class_2596)new class_2846(class_2846.class_2847.field_12969, new class_2338(0, 0, 0), class_2350.field_11033));
            class_12682 = class_1268.field_5810;
        }
        class_2350 class_23502 = M.e(class_23382);
        class_243 class_2432 = new class_243((double)class_23382.method_10263() + 0.5 + (double)class_23502.method_10163().method_10263() * 0.5, (double)class_23382.method_10264() + 0.5 + (double)class_23502.method_10163().method_10264() * 0.5, (double)class_23382.method_10260() + 0.5 + (double)class_23502.method_10163().method_10260() * 0.5);
        if (bl) {
            Frog.ROTATION.a(class_2432);
        }
        e.g(class_12682, x.y.H.X());
        class_3965 class_39652 = new class_3965(class_2432, class_23502, class_23382, false);
        if (bl2) {
            class_1268 class_12683 = class_12682;
            y.n(arg_0 -> M.lambda$airPlace$2(class_12683, class_39652, arg_0));
        } else {
            M.W.field_1761.method_2896(M.W.field_1724, class_12682, class_39652);
        }
        M.W.field_1752 = 4;
        if (bl) {
            Frog.ROTATION.M();
        }
        if (bl3) {
            W.method_1562().method_52787((class_2596)new class_2846(class_2846.class_2847.field_12969, new class_2338(0, 0, 0), class_2350.field_11033));
        }
    }

    public static double i(double d2, double d3, double d4, double d5) {
        double d6 = d4 - d2;
        double d7 = d5 - d3;
        return Math.sqrt(d6 * d6 + d7 * d7);
    }

    public static double H(double d2, double d3) {
        return M.i(d2, d3, M.W.field_1724.method_23317(), M.W.field_1724.method_23321());
    }

    public static class_2350 x(class_2338 class_23382) {
        if (M.q()) {
            return M.e(class_23382);
        }
        double d2 = Double.MAX_VALUE;
        class_2350 class_23502 = null;
        for (class_2350 class_23503 : class_2350.values()) {
            double d3;
            if (!M.M(class_23382.method_10093(class_23503)) || M.c(class_23382.method_10093(class_23503)) || !M.t(class_23382.method_10093(class_23503), class_23503.method_10153())) continue;
            double d4 = M.W.field_1724.method_33571().method_1025(class_23382.method_46558().method_1031((double)class_23503.method_10163().method_10263() * 0.5, (double)class_23503.method_10163().method_10264() * 0.5, (double)class_23503.method_10163().method_10260() * 0.5));
            if (d3 > d2) continue;
            class_23502 = class_23503;
            d2 = d4;
        }
        return class_23502;
    }

    public static class_2350 a(class_2338 class_23382, class_2350 class_23502) {
        class_2350 class_23503 = null;
        double d2 = 0.0;
        for (class_2350 class_23504 : class_2350.values()) {
            if (class_23502 != null && class_23382.method_10093(class_23504).equals((Object)class_23382.method_10079(class_23502, -1)) || class_23504 == class_2350.field_11033 || M.x(class_23382) == null || class_23503 != null && !(M.W.field_1724.method_33571().method_1025(class_23382.method_10093(class_23504).method_46558()) < d2)) continue;
            class_23503 = class_23504;
            d2 = M.W.field_1724.method_33571().method_1025(class_23382.method_10093(class_23504).method_46558());
        }
        return class_23503;
    }

    public static class_2350 H(class_2338 class_23382, double d2) {
        if (M.q()) {
            class_2350 class_23502 = M.e(class_23382);
            double d3 = M.W.field_1724.method_33571().method_1025(class_23382.method_46558().method_1031((double)class_23502.method_10163().method_10263() * 0.5, (double)class_23502.method_10163().method_10264() * 0.5, (double)class_23502.method_10163().method_10260() * 0.5));
            if (Math.sqrt(d3) > d2) {
                return null;
            }
            return class_2350.field_11033;
        }
        double d4 = Double.MAX_VALUE;
        class_2350 class_23503 = null;
        for (class_2350 class_23504 : class_2350.values()) {
            double d5;
            if (!M.M(class_23382.method_10093(class_23504)) || M.c(class_23382.method_10093(class_23504)) || !M.t(class_23382.method_10093(class_23504), class_23504.method_10153()) || Math.sqrt(d5 = M.W.field_1724.method_33571().method_1025(class_23382.method_46558().method_1031((double)class_23504.method_10163().method_10263() * 0.5, (double)class_23504.method_10163().method_10264() * 0.5, (double)class_23504.method_10163().method_10260() * 0.5))) > d2 || d5 > d4) continue;
            class_23503 = class_23504;
            d4 = d5;
        }
        return class_23503;
    }

    public static class_2350 e(class_2338 class_23382) {
        class_2350 class_23502 = class_2350.field_11036;
        double d2 = Double.MAX_VALUE;
        for (class_2350 class_23503 : class_2350.values()) {
            double d3;
            if (!M.t(class_23382, class_23503)) continue;
            double d4 = M.W.field_1724.method_33571().method_1025(class_23382.method_10093(class_23503).method_46558());
            if (d3 > d2) continue;
            class_23502 = class_23503;
            d2 = d4;
        }
        return class_23502;
    }

    public static class_2350 S(class_2338 class_23382) {
        class_2350 class_23502 = null;
        double d2 = Double.MAX_VALUE;
        for (class_2350 class_23503 : class_2350.values()) {
            double d3;
            if (!M.t(class_23382, class_23503)) continue;
            double d4 = M.W.field_1724.method_33571().method_1025(class_23382.method_10093(class_23503).method_46558());
            if (d3 > d2) continue;
            class_23502 = class_23503;
            d2 = d4;
        }
        return class_23502;
    }

    public static boolean l(class_2338 class_23382, class_2350 class_23502, double d2) {
        double d3 = M.W.field_1724.method_33571().method_1025(class_23382.method_46558().method_1031((double)class_23502.method_10163().method_10263() * 0.5, (double)class_23502.method_10163().method_10264() * 0.5, (double)class_23502.method_10163().method_10260() * 0.5));
        if (Math.sqrt(d3) > d2) {
            return false;
        }
        return M.t(class_23382, class_23502);
    }

    public static boolean t(class_2338 class_23382, class_2350 class_23502) {
        switch (x.y.w.X()) {
            case Vanilla: {
                return true;
            }
            case Legit: {
                return e.R(class_23382, class_23502);
            }
            case Grim: {
                return M.W(class_23382, class_23502, M.W.field_1687, M.W.field_1724);
            }
            case NCP: {
                if (M.W.field_1687.method_8320(class_23382.method_10093(class_23502)).method_26234((class_1922)M.W.field_1687, class_23382.method_10093(class_23502))) {
                    return false;
                }
                class_243 class_2432 = M.W.field_1724.method_33571();
                class_243 class_2433 = class_23382.method_46558();
                ArrayList<class_2350> arrayList = new ArrayList<class_2350>();
                arrayList.addAll(M.v(class_2432.field_1352 - class_2433.field_1352, class_2350.field_11039, class_2350.field_11034, false));
                arrayList.addAll(M.v(class_2432.field_1351 - class_2433.field_1351, class_2350.field_11033, class_2350.field_11036, true));
                arrayList.addAll(M.v(class_2432.field_1350 - class_2433.field_1350, class_2350.field_11043, class_2350.field_11035, false));
                return arrayList.contains(class_23502);
            }
        }
        return true;
    }

    public static boolean W(class_2338 class_23382, class_2350 class_23502, class_638 class_6382, class_746 class_7462) {
        boolean bl;
        block15: {
            block14: {
                class_238 class_2383 = M.M(class_23382, (class_1937)class_6382);
                class_238 class_2384 = new class_238(class_7462.method_23317(), class_7462.method_23318() + 0.4, class_7462.method_23321(), class_7462.method_23317(), class_7462.method_23318() + 1.62, class_7462.method_23321()).method_1014(2.0E-4);
                if (M.N(class_2384, class_2383)) {
                    return true;
                }
                switch (class_23502) {
                    default: {
                        throw new MatchException(null, null);
                    }
                    case field_11043: {
                        if (!(class_2384.field_1321 > class_2383.field_1321)) {
                            break;
                        }
                        break block14;
                    }
                    case field_11035: {
                        if (!(class_2384.field_1324 < class_2383.field_1324)) {
                            break;
                        }
                        break block14;
                    }
                    case field_11034: {
                        if (!(class_2384.field_1320 < class_2383.field_1320)) {
                            break;
                        }
                        break block14;
                    }
                    case field_11039: {
                        if (!(class_2384.field_1323 > class_2383.field_1323)) {
                            break;
                        }
                        break block14;
                    }
                    case field_11036: {
                        if (!(class_2384.field_1325 < class_2383.field_1325)) {
                            break;
                        }
                        break block14;
                    }
                    case field_11033: {
                        if (class_2384.field_1322 > class_2383.field_1322) break block14;
                    }
                }
                bl = true;
                break block15;
            }
            bl = false;
        }
        return bl;
    }

    private static class_238 M(class_2338 class_23382, class_1937 class_19372) {
        class_265 class_2652 = class_19372.method_8320(class_23382).method_26220((class_1922)class_19372, class_23382).method_1096((double)class_23382.method_10263(), (double)class_23382.method_10264(), (double)class_23382.method_10260());
        class_238 class_2383 = new class_238(class_23382);
        for (class_238 class_2384 : class_2652.method_1090()) {
            double d2 = Math.max(class_2384.field_1323, class_2383.field_1323);
            double d3 = Math.max(class_2384.field_1322, class_2383.field_1322);
            double d4 = Math.max(class_2384.field_1321, class_2383.field_1321);
            double d5 = Math.min(class_2384.field_1320, class_2383.field_1320);
            double d6 = Math.min(class_2384.field_1325, class_2383.field_1325);
            double d7 = Math.min(class_2384.field_1324, class_2383.field_1324);
            class_2383 = new class_238(d2, d3, d4, d5, d6, d7);
        }
        return class_2383;
    }

    private static boolean N(class_238 class_2383, class_238 class_2384) {
        return class_2384.field_1320 - 1.0E-7 > class_2383.field_1323 && class_2384.field_1323 + 1.0E-7 < class_2383.field_1320 && class_2384.field_1325 - 1.0E-7 > class_2383.field_1322 && class_2384.field_1322 + 1.0E-7 < class_2383.field_1325 && class_2384.field_1324 - 1.0E-7 > class_2383.field_1321 && class_2384.field_1321 + 1.0E-7 < class_2383.field_1324;
    }

    public static ArrayList<class_2350> v(double d2, class_2350 class_23502, class_2350 class_23503, boolean bl) {
        ArrayList<class_2350> arrayList = new ArrayList<class_2350>();
        if (bl) {
            if (d2 < -0.5) {
                arrayList.add(class_23502);
            }
            if (x.y.L.h()) {
                if (d2 > 0.5) {
                    arrayList.add(class_23503);
                }
            } else if (d2 > -0.5) {
                arrayList.add(class_23503);
            }
        } else {
            if (d2 < -0.5) {
                arrayList.add(class_23502);
            }
            if (d2 > 0.5) {
                arrayList.add(class_23503);
            }
        }
        return arrayList;
    }

    public static ArrayList<class_2586> p() {
        return M.C().flatMap(M::lambda$getTileEntities$3).collect(Collectors.toCollection(ArrayList::new));
    }

    public static Stream<class_2818> C() {
        int n2 = Math.max(2, M.W.field_1690.method_38521()) + 3;
        int n3 = n2 * 2 + 1;
        class_1923 class_19232 = M.W.field_1724.method_31476();
        class_1923 class_19233 = new class_1923(class_19232.field_9181 - n2, class_19232.field_9180 - n2);
        class_1923 class_19234 = new class_1923(class_19232.field_9181 + n2, class_19232.field_9180 + n2);
        return Stream.iterate(class_19233, arg_0 -> M.lambda$getLoadedChunks$4(class_19234, class_19233, arg_0)).limit((long)n3 * (long)n3).filter(M::lambda$getLoadedChunks$5).map(M::lambda$getLoadedChunks$6).filter(Objects::nonNull);
    }

    public static ArrayList<class_2338> I(float f2) {
        return M.U(f2, M.W.field_1724.method_33571());
    }

    public static class_2338 Y(class_2248 class_22482, float f2) {
        for (class_2338 class_23382 : M.I(f2)) {
            if (M.W.field_1687.method_8320(class_23382).method_26204() != class_22482) continue;
            return class_23382;
        }
        return null;
    }

    public static class_2338 Q(Class<?> clazz, float f2) {
        for (class_2338 class_23382 : M.I(f2)) {
            if (!clazz.isInstance(M.W.field_1687.method_8320(class_23382).method_26204())) continue;
            return class_23382;
        }
        return null;
    }

    public static ArrayList<class_2338> U(float f2, class_243 class_2432) {
        ArrayList<class_2338> arrayList = new ArrayList<class_2338>();
        for (double d2 = class_2432.method_10214() + (double)f2; d2 > class_2432.method_10214() - (double)f2; d2 -= 1.0) {
            if (d2 < -64.0) continue;
            for (double d3 = class_2432.method_10216() - (double)f2; d3 < class_2432.method_10216() + (double)f2; d3 += 1.0) {
                for (double d4 = class_2432.method_10215() - (double)f2; d4 < class_2432.method_10215() + (double)f2; d4 += 1.0) {
                    k k2 = new k(d3, d2, d4);
                    if (k2.method_46558().method_1022(class_2432) > (double)f2) continue;
                    arrayList.add(k2);
                }
            }
        }
        return arrayList;
    }

    public static class_2248 x(class_2338 class_23382) {
        return M.W.field_1687.method_8320(class_23382).method_26204();
    }

    public static boolean c(class_2338 class_23382) {
        if (class_23382.method_10264() >= 320) {
            return false;
        }
        if (x.y.j.h() && V.contains(class_23382)) {
            return false;
        }
        class_2680 class_26802 = M.W.field_1687.method_8320(class_23382);
        if (class_26802.method_26204() == class_2246.field_10343 && dev.idhammai.c.r.q.A.J.s && i.X6.N.h()) {
            return true;
        }
        return class_26802.method_45474();
    }

    public static boolean M(class_2338 class_23382) {
        if (x.y.j.h() && V.contains(class_23382)) {
            return true;
        }
        class_2680 class_26802 = M.W.field_1687.method_8320(class_23382);
        class_2248 class_22482 = class_26802.method_26204();
        if (class_22482 == class_2246.field_10343 && dev.idhammai.c.r.q.A.J.s) {
            return i.X6.A2.h();
        }
        return M.W.field_1724.method_5715() || !M.x(class_22482);
    }

    public static boolean x(class_2248 class_22482) {
        return class_22482 instanceof class_2304 || class_22482 instanceof class_2199 || class_22482 instanceof class_2406 || class_22482 instanceof class_3711 || class_22482 instanceof class_3713 || class_22482 instanceof class_3718 || class_22482 instanceof class_2269 || class_22482 instanceof class_2231 || class_22482 instanceof class_2237 || class_22482 instanceof class_2244 || class_22482 instanceof class_2349 || class_22482 instanceof class_2323 || class_22482 instanceof class_2428 || class_22482 instanceof class_2533;
    }

    public static boolean U(class_238 class_2383) {
        return M.d((class_1297)M.W.field_1724, class_2383);
    }

    public static boolean d(@Nullable class_1297 class_12972, class_238 class_2383) {
        class_5329 class_53292 = new class_5329((class_1941)M.W.field_1687, class_12972, class_2383, false, M::lambda$canCollide$7);
        do {
            if (class_53292.hasNext()) continue;
            return false;
        } while (((class_265)class_53292.next()).method_1110());
        return true;
    }

    public static boolean q() {
        return Z.y.p() && Z.y.l.h();
    }

    private static Object lambda$canCollide$7(Object object, Object object2) {
        return object2;
    }

    private static class_2818 lambda$getLoadedChunks$6(class_1923 class_19232) {
        return M.W.field_1687.method_8497(class_19232.field_9181, class_19232.field_9180);
    }

    private static boolean lambda$getLoadedChunks$5(class_1923 class_19232) {
        return M.W.field_1687.method_8393(class_19232.field_9181, class_19232.field_9180);
    }

    private static class_1923 lambda$getLoadedChunks$4(class_1923 class_19232, class_1923 class_19233, class_1923 class_19234) {
        int n2 = class_19234.field_9181;
        int n3 = class_19234.field_9180;
        if (++n2 > class_19232.field_9181) {
            n2 = class_19233.field_9181;
            ++n3;
        }
        return new class_1923(n2, n3);
    }

    private static Stream lambda$getTileEntities$3(class_2818 class_28182) {
        return class_28182.method_12214().values().stream();
    }

    private static class_2596 lambda$airPlace$2(class_1268 class_12682, class_3965 class_39652, int n2) {
        return new class_2885(class_12682, class_39652, n2);
    }

    private static class_2596 lambda$clickBlock$1(class_1268 class_12682, class_3965 class_39652, int n2) {
        return new class_2885(class_12682, class_39652, n2);
    }

    private static class_2596 lambda$clickBlock$0(class_1268 class_12682, class_3965 class_39652, int n2) {
        return new class_2885(class_12682, class_39652, n2);
    }
}

