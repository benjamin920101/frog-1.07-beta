/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1657
 *  net.minecraft.class_1739
 *  net.minecraft.class_1799
 *  net.minecraft.class_1890
 *  net.minecraft.class_1893
 *  net.minecraft.class_1922
 *  net.minecraft.class_2338
 *  net.minecraft.class_238
 *  net.minecraft.class_2561
 *  net.minecraft.class_2680
 *  net.minecraft.class_4587
 *  net.minecraft.class_6880
 */
package dev.idhammai.c.r.q.n;

import dev.idhammai.Frog;
import dev.idhammai.P.A.L.g;
import dev.idhammai.P.A.S.K;
import dev.idhammai.P.A.S.f;
import dev.idhammai.c.r.O.Y.A;
import dev.idhammai.c.r.O.Y.B;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import dev.idhammai.p.J.U;
import java.awt.Color;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import net.minecraft.class_1657;
import net.minecraft.class_1739;
import net.minecraft.class_1799;
import net.minecraft.class_1890;
import net.minecraft.class_1893;
import net.minecraft.class_1922;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_2561;
import net.minecraft.class_2680;
import net.minecraft.class_4587;
import net.minecraft.class_6880;

public class S
extends y {
    public static S F;
    private final W u = this.S(new W("Progress", true).k("\u8fdb\u5ea6"));
    private final l G = this.p(new l("Damage", 1.0, 0.0, 2.0, 0.01).D("\u8017\u65f6\u500d\u7387"));
    private final A g = this.y(new A("Box", new Color(198, 176, 12, 255)).P("\u65b9\u6846").t(true));
    private final A r = this.y(new A("Fill", new Color(198, 176, 12, 78)).P("\u586b\u5145").t(true));
    private final A y = this.y(new A("FriendBox", new Color(30, 45, 169, 255)).P("\u597d\u53cb\u65b9\u6846").t(true));
    private final A N = this.y(new A("FriendFill", new Color(30, 45, 169, 78)).P("\u597d\u53cb\u586b\u5145").t(true));
    private final B<dev.idhammai.P.A.A.S> E = this.S(new B<dev.idhammai.P.A.A.S>("Ease", dev.idhammai.P.A.A.S.CubicInOut).I("\u7f13\u52a8"));
    private final W Y = this.S(new W("Second", true).k("\u53cc\u6316"));
    private final A p = this.y(new A("SecondBox", new Color(255, 255, 255, 255)).P("\u53cc\u6316\u65b9\u6846").t(true));
    private final A l = this.y(new A("SecondFill", new Color(255, 255, 255, 100)).P("\u53cc\u6316\u586b\u5145").t(true));
    final DecimalFormat D = new DecimalFormat("0.0");
    final Color C = new Color(255, 6, 6);
    final Color V = new Color(0, 255, 12);
    final Color B = new Color(255, 179, 96);

    public S() {
        super("BreakESP", w.Render);
        this.L("\u6316\u6398\u663e\u793a");
        F = this;
    }

    private Color c(class_1657 class_16572) {
        return Frog.FRIEND.r(class_16572) ? this.N.P() : this.r.P();
    }

    private Color v(class_1657 class_16572) {
        return Frog.FRIEND.r(class_16572) ? this.y.P() : this.g.P();
    }

    @Override
    public void h(class_4587 class_45872) {
        Object object;
        for (U u2 : Frog.BREAK.q.values()) {
            if (u2 == null || u2.Q() == null) continue;
            object = (class_1657)u2.Q();
            double d2 = 0.5 * (1.0 - u2.R.M(this.E.X()));
            class_238 class_2383 = new class_238(u2.T).method_1002(d2, d2, d2).method_1002(-d2, -d2, -d2);
            if (this.r.i) {
                K.F(class_45872, class_2383, this.c((class_1657)object));
            }
            if (this.g.i) {
                K.N(class_45872, class_2383, this.v((class_1657)object));
            }
            K.p(object.method_5477().getString(), u2.T.method_46558().method_1031(0.0, this.u.h() ? 0.15 : 0.0, 0.0), -1);
            if (!this.u.h()) continue;
            K.K(class_2561.method_30163((String)(u2.F ? "\u00a74Failed" : (u2.W ? "Broke" : this.D.format(Math.min(1.0, (double)u2.C.k() / u2.H) * 100.0)))), u2.T.method_46558().method_1031(0.0, -0.15, 0.0), 0.0, 0.0, 1.0, u2.W ? (dev.idhammai.c.r.q.n.S.W.field_1687.method_22347(u2.T) ? this.V : this.C) : f.U(this.C, this.V, (double)u2.C.k() / u2.H));
        }
        if (this.Y.h()) {
            Iterator<U> iterator = ((ConcurrentHashMap.KeySetView)Frog.BREAK.Z.keySet()).iterator();
            while (iterator.hasNext()) {
                int n2 = (Integer)((Object)iterator.next());
                object = Frog.BREAK.Z.get(n2);
                if (object == null || ((U)object).Q() == null || dev.idhammai.c.r.q.n.S.W.field_1687.method_22347(((U)object).T)) {
                    Frog.BREAK.Z.remove(n2);
                    continue;
                }
                U u3 = Frog.BREAK.q.get(n2);
                if (u3 != null && u3.T.equals((Object)((U)object).T)) continue;
                double d3 = 0.5 * (1.0 - ((U)object).R.M(this.E.X()));
                class_238 class_2384 = new class_238(((U)object).T).method_1002(d3, d3, d3).method_1002(-d3, -d3, -d3);
                if (this.l.i) {
                    K.F(class_45872, class_2384, this.l.P());
                }
                if (this.p.i) {
                    K.N(class_45872, class_2384, this.p.P());
                }
                K.p(((U)object).Q().method_5477().getString(), ((U)object).T.method_46558().method_1031(0.0, 0.15, 0.0), -1);
                K.p("Double", ((U)object).T.method_46558().method_1031(0.0, -0.15, 0.0), this.B.getRGB());
            }
        }
    }

    public static double t(class_2338 class_23382, boolean bl) {
        int n2 = dev.idhammai.c.r.q.n.S.l(class_23382);
        if (n2 == -1) {
            n2 = dev.idhammai.c.r.q.n.S.W.field_1724.method_31548().field_7545;
        }
        return dev.idhammai.c.r.q.n.S.P(class_23382, n2, bl ? 1.0 : dev.idhammai.c.r.q.n.S.F.G.e());
    }

    static int l(class_2338 class_23382) {
        AtomicInteger atomicInteger = new AtomicInteger();
        atomicInteger.set(-1);
        float f2 = 1.0f;
        for (Map.Entry<Integer, class_1799> entry : dev.idhammai.P.A.L.g.A().entrySet()) {
            float f3;
            float f4;
            if (entry.getValue().method_7909() instanceof class_1739 || !((f4 = (float)class_1890.method_8225((class_6880)((class_6880)dev.idhammai.c.r.q.n.S.W.field_1687.method_30349().method_30530(class_1893.field_9131.method_58273()).method_40264(class_1893.field_9131).get()), (class_1799)entry.getValue())) + (f3 = entry.getValue().method_7924(dev.idhammai.c.r.q.n.S.W.field_1687.method_8320(class_23382))) > f2)) continue;
            f2 = f4 + f3;
            atomicInteger.set(entry.getKey());
        }
        return atomicInteger.get();
    }

    static double P(class_2338 class_23382, int n2, double d2) {
        return (double)(1.0f / dev.idhammai.c.r.q.n.S.U(class_23382, dev.idhammai.c.r.q.n.S.W.field_1724.method_31548().method_5438(n2)) / 20.0f * 1000.0f) * d2;
    }

    static float U(class_2338 class_23382, class_1799 class_17992) {
        class_2680 class_26802 = dev.idhammai.c.r.q.n.S.W.field_1687.method_8320(class_23382);
        float f2 = class_26802.method_26214((class_1922)dev.idhammai.c.r.q.n.S.W.field_1687, class_23382);
        if (f2 < 0.0f) {
            return 0.0f;
        }
        float f3 = !class_26802.method_29291() || class_17992.method_7951(class_26802) ? 30.0f : 100.0f;
        return dev.idhammai.c.r.q.n.S.x(class_26802, class_17992) / f2 / f3;
    }

    static float x(class_2680 class_26802, class_1799 class_17992) {
        int n2;
        float f2 = dev.idhammai.c.r.q.n.S.R(class_26802, class_17992);
        if (f2 > 1.0f && (n2 = class_1890.method_8225((class_6880)((class_6880)dev.idhammai.c.r.q.n.S.W.field_1687.method_30349().method_30530(class_1893.field_9131.method_58273()).method_40264(class_1893.field_9131).get()), (class_1799)class_17992)) > 0 && !class_17992.method_7960()) {
            f2 += (float)(StrictMath.pow(n2, 2.0) + 1.0);
        }
        return f2 < 0.0f ? 0.0f : f2;
    }

    static float R(class_2680 class_26802, class_1799 class_17992) {
        float f2 = 1.0f;
        if (class_17992 != null && !class_17992.method_7960()) {
            f2 *= class_17992.method_7924(class_26802);
        }
        return f2;
    }
}

