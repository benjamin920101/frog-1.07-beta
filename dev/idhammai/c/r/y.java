/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_332
 *  net.minecraft.class_3675
 *  net.minecraft.class_4587
 *  net.minecraft.class_7202
 *  net.minecraft.class_7204
 */
package dev.idhammai.c.r;

import dev.idhammai.Frog;
import dev.idhammai.c.Q;
import dev.idhammai.c.r.L;
import dev.idhammai.c.r.O.Y.A;
import dev.idhammai.c.r.O.Y.B;
import dev.idhammai.c.r.O.Y.O;
import dev.idhammai.c.r.O.Y.T;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.O.Y.v;
import dev.idhammai.c.r.q.N.I;
import dev.idhammai.c.r.q.N.P;
import dev.idhammai.c.r.q.N.p;
import dev.idhammai.c.r.q.N.t;
import dev.idhammai.c.r.q.N.x;
import dev.idhammai.c.r.q.N.z.H;
import dev.idhammai.c.r.w;
import dev.idhammai.p.J.S;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_332;
import net.minecraft.class_3675;
import net.minecraft.class_4587;
import net.minecraft.class_7202;
import net.minecraft.class_7204;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class y
extends Q {
    public final W z;
    private final List<dev.idhammai.c.r.O.v> q = new ArrayList<dev.idhammai.c.r.O.v>();
    private final String x;
    private final w v;
    private final O O;
    protected boolean S;
    private String o;

    public y(String string, w w2) {
        this(string, "", w2);
    }

    public y(String string, String string2, w w2) {
        super(string);
        this.v = w2;
        this.x = string2;
        this.O = this.n(new O("Key", this.I() ? 344 : -1));
        this.z = this.S(new W("Drawn", !this.s()));
    }

    private boolean I() {
        return this instanceof P;
    }

    private boolean s() {
        return this instanceof p || this instanceof t || this instanceof x || this instanceof I || this instanceof H || this.o().equals("Info");
    }

    public void L(String string) {
        this.o = string;
    }

    public String Q() {
        return this.F() + this.z();
    }

    public String z() {
        return this.I() == null ? "" : " \u00a77[\u00a7f" + this.I() + "\u00a77]";
    }

    public String I() {
        return null;
    }

    public String F() {
        if (I.Q.C.h() && this.o != null) {
            return this.o;
        }
        return this.o();
    }

    public String W() {
        return this.x;
    }

    public w a() {
        return this.v;
    }

    public O P() {
        return this.O;
    }

    public boolean p() {
        return this.S;
    }

    public boolean W() {
        return !this.p();
    }

    public void o() {
        if (this.p()) {
            this.p();
        } else {
            this.C();
        }
    }

    public void C() {
        if (this.S) {
            return;
        }
        if (!y.M() && this.z.h() && I.Q.G.h()) {
            int n2 = I.Q.H.h() ? -1 : this.hashCode();
            switch (L.U[I.Q.g.X().ordinal()]) {
                case 1: {
                    dev.idhammai.p.J.S.u("\u00a72[+] \u00a7f" + this.F(), n2);
                    break;
                }
                case 2: {
                    dev.idhammai.p.J.S.u(this.a().name().toLowerCase() + "." + this.F().toLowerCase() + ".\u00a7aenable", n2);
                    break;
                }
                case 3: {
                    dev.idhammai.p.J.S.u(this.F().toLowerCase() + " \u00a7aenabled", n2);
                    break;
                }
                case 4: {
                    dev.idhammai.p.J.S.u("\u00a7b" + this.F() + " \u00a7aEnabled.", n2);
                    break;
                }
                case 5: {
                    dev.idhammai.p.J.S.u("\u00a7f" + this.F() + " \u00a7aEnabled", n2);
                    break;
                }
                case 6: {
                    dev.idhammai.p.J.S.u("\u00a77" + this.F() + " toggled \u00a7aon", n2);
                    break;
                }
                case 7: {
                    dev.idhammai.p.J.S.u(this.F() + " \u00a7a\u5f00\u542f", n2);
                    break;
                }
                case 8: {
                    dev.idhammai.p.J.S.s("\u00a7f[\u00a7b" + I.Q.Y.q() + "\u00a7f] [\u00a73" + this.F() + "\u00a7f] \u00a77toggled \u00a7aon", n2);
                    break;
                }
                case 9: {
                    dev.idhammai.p.J.S.s("\u00a7l" + this.F() + " \u00a7aenabled.", n2);
                }
            }
        }
        if (Frog.MODULE != null) {
            Frog.MODULE.A(this, true);
        }
        this.S = true;
        Frog.EVENT_BUS.S(this);
        this.O();
        this.H();
    }

    public void p() {
        if (!this.S) {
            return;
        }
        if (!y.M() && this.z.h() && I.Q.G.h()) {
            int n2 = I.Q.H.h() ? -1 : this.hashCode();
            switch (L.U[I.Q.g.X().ordinal()]) {
                case 1: {
                    dev.idhammai.p.J.S.u("\u00a74[-] \u00a7f" + this.F(), n2);
                    break;
                }
                case 2: {
                    dev.idhammai.p.J.S.u(this.a().name().toLowerCase() + "." + this.F().toLowerCase() + ".\u00a7cdisable", n2);
                    break;
                }
                case 3: {
                    dev.idhammai.p.J.S.u(this.F().toLowerCase() + " \u00a7cdisabled", n2);
                    break;
                }
                case 5: {
                    dev.idhammai.p.J.S.u("\u00a7f" + this.F() + " \u00a7cDisabled", n2);
                    break;
                }
                case 4: {
                    dev.idhammai.p.J.S.u("\u00a7b" + this.F() + " \u00a7cDisabled.", n2);
                    break;
                }
                case 6: {
                    dev.idhammai.p.J.S.u("\u00a77" + this.F() + " toggled \u00a7coff", n2);
                    break;
                }
                case 9: {
                    dev.idhammai.p.J.S.s("\u00a7l" + this.F() + " \u00a7cdisabled.", n2);
                    break;
                }
                case 7: {
                    dev.idhammai.p.J.S.u(this.F() + " \u00a7c\u5173\u95ed", n2);
                    break;
                }
                case 8: {
                    dev.idhammai.p.J.S.s("\u00a7f[\u00a7b" + I.Q.Y.q() + "\u00a7f] [\u00a73" + this.F() + "\u00a7f] \u00a77toggled \u00a7coff", n2);
                }
            }
        }
        if (Frog.MODULE != null) {
            Frog.MODULE.A(this, false);
        }
        this.S = false;
        Frog.EVENT_BUS.f(this);
        this.O();
        this.L();
    }

    public void y(String string) {
        dev.idhammai.p.J.S.z(string);
    }

    public void p(boolean bl) {
        if (this.S == bl) {
            return;
        }
        if (bl) {
            this.C();
        } else {
            this.p();
        }
    }

    public boolean h(String string) {
        int n2;
        if (string.equalsIgnoreCase("none")) {
            this.O.N(-1);
            return true;
        }
        try {
            n2 = class_3675.method_15981((String)("key.keyboard." + string.toLowerCase())).method_1444();
        }
        catch (NumberFormatException numberFormatException) {
            if (!y.M()) {
                this.y("\u00a74Bad bind!");
            }
            return false;
        }
        if (string.equalsIgnoreCase("none")) {
            n2 = -1;
        }
        if (n2 == 0) {
            return false;
        }
        this.O.N(n2);
        return true;
    }

    public void L() {
    }

    public void H() {
    }

    public void O() {
    }

    public void F() {
    }

    public void W() {
    }

    public void C(class_332 class_3322, float f2) {
    }

    public void h(class_4587 class_45872) {
    }

    public void l(dev.idhammai.c.r.O.v v2) {
        this.q.add(v2);
    }

    public v E(v v2) {
        this.l(v2);
        return v2;
    }

    public A y(A a2) {
        this.l(a2);
        return a2;
    }

    public l p(l l2) {
        this.l(l2);
        return l2;
    }

    public W S(W w2) {
        this.l(w2);
        return w2;
    }

    public T m(T t2) {
        this.l(t2);
        return t2;
    }

    public <T extends Enum<T>> B<T> S(B<T> b2) {
        this.l(b2);
        return b2;
    }

    public O n(O o2) {
        this.l(o2);
        return o2;
    }

    public <S extends dev.idhammai.c.r.O.v> S V(S s2, dev.idhammai.c.r.O.v v2) {
        this.l(s2);
        s2.I(v2);
        return s2;
    }

    public List<dev.idhammai.c.r.O.v> F() {
        return this.q;
    }

    public static boolean M() {
        return y.W.field_1724 == null || y.W.field_1724.field_3913 == null || y.W.field_1687 == null;
    }

    public static void n(class_7204 class_72042) {
        if (W.method_1562() == null || y.W.field_1687 == null) {
            return;
        }
        try (class_7202 class_72022 = y.W.field_1687.method_41925().method_41937();){
            int n2 = class_72022.method_41942();
            W.method_1562().method_52787(class_72042.predict(n2));
        }
    }
}

