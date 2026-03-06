/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2338
 *  net.minecraft.class_2596
 *  net.minecraft.class_2620
 *  net.minecraft.class_3532
 */
package dev.idhammai.p.J;

import dev.idhammai.Frog;
import dev.idhammai.P.A.J;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.g;
import dev.idhammai.P.r.c.i;
import dev.idhammai.P.r.c.o;
import dev.idhammai.P.r.c.v;
import dev.idhammai.c.r.q.N.x;
import dev.idhammai.c.r.q.i.a;
import dev.idhammai.c.r.q.n.S;
import dev.idhammai.c.r.y;
import dev.idhammai.p.J.U;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.class_2338;
import net.minecraft.class_2596;
import net.minecraft.class_2620;
import net.minecraft.class_3532;

public class t
implements J {
    public final ConcurrentHashMap<Integer, U> q = new ConcurrentHashMap();
    public final ConcurrentHashMap<Integer, U> Z = new ConcurrentHashMap();

    public t() {
        Frog.EVENT_BUS.S(this);
    }

    @r
    public void h(o o2) {
        this.q.clear();
        this.Z.clear();
    }

    @r
    public void H(v v2) {
        if (y.M()) {
            return;
        }
        if (x.y.e.h()) {
            Iterator<Object> iterator = ((ConcurrentHashMap.KeySetView)Frog.BREAK.Z.keySet()).iterator();
            while (iterator.hasNext()) {
                int n2 = (Integer)iterator.next();
                U u2 = Frog.BREAK.Z.get(n2);
                if (u2 != null && u2.Q() != null && !t.W.field_1687.method_22347(u2.T) && !u2.C.S(Math.max(x.y.n.e() * 1000.0, u2.H * x.y.C.e()))) continue;
                Frog.BREAK.Z.remove(n2);
            }
        }
        for (U u3 : this.q.values()) {
            u3.H = Math.max(S.t(u3.T, false), 50.0);
            if (a.e(u3.T)) {
                u3.R.S(0L);
                u3.W = false;
                u3.F = true;
                continue;
            }
            if (t.W.field_1687.method_22347(u3.T)) {
                u3.R.S(0L);
                u3.W = true;
                u3.F = false;
                continue;
            }
            if (!u3.W && u3.C.S(u3.H * x.y.u.e())) {
                u3.R.S(0L);
                u3.F = true;
                continue;
            }
            u3.R.S((long)u3.H);
        }
    }

    @r
    public void x(i i2) {
        if (y.M()) {
            return;
        }
        class_2596<?> class_25962 = i2.L();
        if (class_25962 instanceof class_2620) {
            U u2;
            class_2620 class_26202 = (class_2620)class_25962;
            if (class_26202.method_11277() == null) {
                return;
            }
            U u3 = new U(class_26202.method_11277(), class_26202.method_11280(), false);
            if (u3.Q() == null) {
                return;
            }
            if (class_3532.method_15355((float)((float)u3.Q().method_33571().method_1025(class_26202.method_11277().method_46558()))) > 8.0f) {
                return;
            }
            if (x.y.e.h() && class_26202.method_11278() != 255) {
                if (class_26202.method_11278() != 0) {
                    U u4 = this.Z.get(class_26202.method_11280());
                    if (u4 != null) {
                        u4.T = class_26202.method_11277();
                        u4.C.H();
                    } else if (!a.e(class_26202.method_11277())) {
                        this.Z.put(class_26202.method_11280(), new U(class_26202.method_11277(), class_26202.method_11280(), true));
                    }
                    return;
                }
                U u5 = this.Z.get(class_26202.method_11280());
                if (u5 != null && u5.T.equals((Object)class_26202.method_11277()) && !u5.C.r(150.0)) {
                    return;
                }
            }
            if ((u2 = this.q.get(class_26202.method_11280())) != null && !u2.F && u2.T.equals((Object)class_26202.method_11277())) {
                return;
            }
            this.q.put(class_26202.method_11280(), u3);
            Frog.EVENT_BUS.J(g.R(class_26202.method_11277(), class_26202.method_11280(), class_26202.method_11278()));
            if (x.y.e.h() && !this.Z.containsKey(class_26202.method_11280()) && !a.e(class_26202.method_11277())) {
                this.Z.put(class_26202.method_11280(), new U(class_26202.method_11277(), class_26202.method_11280(), true));
            }
        }
    }

    public boolean X(class_2338 class_23382) {
        return this.f(class_23382, true);
    }

    public boolean f(class_2338 class_23382, boolean bl) {
        if (bl && a.q() != null && a.q().equals((Object)class_23382)) {
            return true;
        }
        for (U u2 : this.q.values()) {
            if (u2.Q() == null || u2.Q().method_33571().method_1022(class_23382.method_46558()) > 7.0 || u2.F || !u2.T.equals((Object)class_23382)) continue;
            return true;
        }
        return false;
    }
}

