/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMaps
 *  net.minecraft.class_1268
 *  net.minecraft.class_1657
 *  net.minecraft.class_1707
 *  net.minecraft.class_1713
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_2596
 *  net.minecraft.class_2649
 *  net.minecraft.class_2813
 *  net.minecraft.class_2868
 *  net.minecraft.class_2886
 *  net.minecraft.class_476
 *  net.minecraft.class_7439
 */
package dev.idhammai.c.r.q.x;

import dev.idhammai.Frog;
import dev.idhammai.P.A.L.g;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.P.r.c.i;
import dev.idhammai.c.r.O.Y.B;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.q.x.U;
import dev.idhammai.c.r.q.x.h;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import java.util.HashMap;
import java.util.List;
import net.minecraft.class_1268;
import net.minecraft.class_1657;
import net.minecraft.class_1707;
import net.minecraft.class_1713;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2596;
import net.minecraft.class_2649;
import net.minecraft.class_2813;
import net.minecraft.class_2868;
import net.minecraft.class_2886;
import net.minecraft.class_476;
import net.minecraft.class_7439;

public class s
extends y {
    public static s I;
    public final B<U> K = this.S(new B<U>("Mode", U.Packet).I("\u6a21\u5f0f").X(U.Vanilla, "\u539f\u7248").X(U.Packet, "\u53d1\u5305"));
    public final l t = this.p(new l("JoinQueueDelay", 3.0, 0.0, 10.0, 0.1).D("\u5165\u961f\u5ef6\u8fdf").P("s"));
    public static boolean E;
    private boolean a;
    private final dev.idhammai.P.A.A.h L = new dev.idhammai.P.A.A.h();
    private final dev.idhammai.P.A.A.h d = new dev.idhammai.P.A.A.h();
    final String[] N = new String[]{"A", "B", "C"};
    public static final HashMap<String, String> C;

    public s() {
        super("AutoQueue", w.Misc);
        this.L("\u81ea\u52a8\u6392\u961f");
        I = this;
    }

    @r
    public void q(QO qO) {
        class_1707 class_17072;
        int n2 = g.E(class_1802.field_8251);
        if (!this.a && n2 != -1 && this.L.r(this.t.e())) {
            if (this.K.x(U.Packet)) {
                int n3 = s.W.field_1724.method_31548().field_7545;
                if (n2 < 9) {
                    W.method_1562().method_52787((class_2596)new class_2868(n2));
                    s.n(s::lambda$onUpdate$0);
                    W.method_1562().method_52787((class_2596)new class_2868(n3));
                } else {
                    g.j(n2);
                    s.n(s::lambda$onUpdate$1);
                }
            } else {
                g.j(n2);
                s.n(s::lambda$onUpdate$2);
            }
            this.L.H();
        }
        if (s.M()) {
            E = false;
            this.a = false;
            return;
        }
        if (this.K.x(U.Vanilla) && !this.a && s.W.field_1755 instanceof class_476 && this.d.r(this.t.e()) && (class_17072 = (class_1707)((class_476)s.W.field_1755).method_17577()) != null && s.W.field_1724.field_7512.method_34255().method_7960()) {
            class_1799 class_17992;
            int n4;
            int n5 = class_17072.method_7629().method_5439();
            int n6 = n5 == 9 ? 4 : (n4 = n5 == 5 ? 2 : -1);
            if (n4 != -1 && (class_17992 = class_17072.method_7629().method_5438(n4)) != null && class_17992.method_7909() == class_1802.field_8251) {
                s.W.field_1761.method_2906(class_17072.field_7763, n4, 0, class_1713.field_7790, (class_1657)s.W.field_1724);
                this.d.H();
            }
        }
        E = g.E(class_1802.field_8251) != -1;
    }

    @Override
    public void F() {
        this.L.H();
        this.d.H();
    }

    @Override
    public void W() {
        E = false;
        this.a = false;
    }

    @Override
    public void L() {
        E = false;
        this.a = false;
    }

    @r
    public void d(i i2) {
        Object object;
        if (s.M()) {
            return;
        }
        class_2596<?> class_25962 = i2.L();
        String string = null;
        if (class_25962 instanceof class_7439 && (string = (object = (class_7439)class_25962).comp_763().getString()).toLowerCase().contains("position in queue")) {
            this.a = true;
        }
        if (class_25962 instanceof class_2649 && this.K.x(U.Packet) && (object = (class_2649)class_25962).method_11440() != s.W.field_1724.field_7498.field_7763) {
            List object2 = object.method_11441();
            for (int i3 = 0; i3 < object2.size(); ++i3) {
                if (((class_1799)object2.get(i3)).method_7909() != class_1802.field_8251) continue;
                W.method_1562().method_52787((class_2596)new class_2813(object.method_11440(), object.method_37438(), i3, 0, class_1713.field_7790, s.W.field_1724.field_7498.method_34255().method_7972(), Int2ObjectMaps.emptyMap()));
                return;
            }
        }
        if (!E) {
            return;
        }
        if (string != null) {
            for (String string2 : C.keySet()) {
                if (!string.contains(string2)) continue;
                for (String string3 : this.N) {
                    if (!string.contains(string3 + "." + C.get(string2))) continue;
                    W.method_1562().method_45729(string3.toLowerCase());
                    return;
                }
            }
        }
    }

    private static class_2596 lambda$onUpdate$2(int n2) {
        return new class_2886(class_1268.field_5808, n2, Frog.ROTATION.X(), Frog.ROTATION.F());
    }

    private static class_2596 lambda$onUpdate$1(int n2) {
        return new class_2886(class_1268.field_5808, n2, Frog.ROTATION.X(), Frog.ROTATION.F());
    }

    private static class_2596 lambda$onUpdate$0(int n2) {
        return new class_2886(class_1268.field_5808, n2, Frog.ROTATION.X(), Frog.ROTATION.F());
    }

    static {
        C = new h();
    }
}

