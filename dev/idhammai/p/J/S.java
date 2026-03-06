/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.text.Text
 */
package dev.idhammai.p.J;

import dev.idhammai.Frog;
import dev.idhammai.P.A.J;
import dev.idhammai.c.r.q.N.I;
import dev.idhammai.c.r.q.N.O;
import dev.idhammai.c.r.y;
import dev.idhammai.c.u.T.A;
import dev.idhammai.c.u.T.C;
import dev.idhammai.c.u.T.E;
import dev.idhammai.c.u.T.G;
import dev.idhammai.c.u.T.H;
import dev.idhammai.c.u.T.K;
import dev.idhammai.c.u.T.L;
import dev.idhammai.c.u.T.N;
import dev.idhammai.c.u.T.Q;
import dev.idhammai.c.u.T.U;
import dev.idhammai.c.u.T.W;
import dev.idhammai.c.u.T.Z;
import dev.idhammai.c.u.T.c;
import dev.idhammai.c.u.T.d;
import dev.idhammai.c.u.T.f;
import dev.idhammai.c.u.T.h;
import dev.idhammai.c.u.T.i;
import dev.idhammai.c.u.T.j;
import dev.idhammai.c.u.T.m;
import dev.idhammai.c.u.T.o;
import dev.idhammai.c.u.T.r;
import dev.idhammai.c.u.T.t;
import dev.idhammai.c.u.k;
import java.util.HashMap;
import net.minecraft.text.Text;

public class S
implements J {
    private final HashMap<String, k> x = new HashMap();

    public S() {
        this.L();
    }

    public void L() {
        this.l(new Z());
        this.l(new d());
        this.l(new r());
        this.l(new dev.idhammai.c.u.T.O());
        this.l(new L());
        this.l(new N());
        this.l(new H());
        this.l(new j());
        this.l(new c());
        this.l(new t());
        this.l(new W());
        this.l(new m());
        this.l(new A());
        this.l(new o());
        this.l(new f());
        this.l(new G());
        this.l(new U());
        this.l(new h());
        this.l(new E());
        this.l(new C());
        this.l(new i());
        this.l(new K());
        this.l(new Q());
    }

    public static void z(String string) {
        W.execute(() -> S.lambda$sendMessage$0(string));
    }

    public static void u(String string, int n2) {
        W.execute(() -> S.lambda$sendMessageId$1(string, n2));
    }

    public static void s(String string, int n2) {
        W.execute(() -> S.lambda$sendChatMessageWidthIdNoSync$2(string, n2));
    }

    private void l(k k2) {
        this.x.put(k2.W(), k2);
    }

    public k y(String string) {
        return this.x.get(string);
    }

    public HashMap<String, k> Q() {
        return this.x;
    }

    public void L(String[] stringArray) {
        k k2 = this.x.get(stringArray[0].substring(Frog.getPrefix().length()).toLowerCase());
        if (k2 == null) {
            S.z("\u00a74Invalid Command!");
        } else {
            String[] stringArray2 = new String[stringArray.length - 1];
            System.arraycopy(stringArray, 1, stringArray2, 0, stringArray.length - 1);
            if (stringArray2.length == 1 && stringArray2[0].equals("help")) {
                k2.F();
                return;
            }
            k2.h(stringArray2);
        }
    }

    private static void lambda$sendChatMessageWidthIdNoSync$2(String string, int n2) {
        if (y.M()) {
            return;
        }
        ((dev.idhammai.P.V.I)S.W.field_1705.method_1743()).frogClient$addMessageOutSync(class_2561.method_30163((String)("\u00a7f" + string)), n2);
    }

    private static void lambda$sendMessageId$1(String string, int n2) {
        if (y.M()) {
            return;
        }
        if (I.Q.g.X() == O.Earth) {
            ((dev.idhammai.P.V.I)S.W.field_1705.method_1743()).frogClient$addMessage(class_2561.method_30163((String)string), n2);
            return;
        }
        if (I.Q.g.X() == O.Moon) {
            ((dev.idhammai.P.V.I)S.W.field_1705.method_1743()).frogClient$addMessage(class_2561.method_30163((String)("\u00a7f[\u00a7b" + I.Q.Y.q() + "\u00a7f] " + string)), n2);
            return;
        }
        ((dev.idhammai.P.V.I)S.W.field_1705.method_1743()).frogClient$addMessage(class_2561.method_30163((String)(I.Q.Y.q() + "\u00a7f " + string)), n2);
    }

    private static void lambda$sendMessage$0(String string) {
        if (y.M()) {
            return;
        }
        if (I.Q.g.X() == O.Earth) {
            S.W.field_1705.method_1743().method_1812(class_2561.method_30163((String)string));
            return;
        }
        if (I.Q.g.X() == O.Moon) {
            S.W.field_1705.method_1743().method_1812(class_2561.method_30163((String)("\u00a7f[\u00a7b" + I.Q.Y.q() + "\u00a7f] " + string)));
            return;
        }
        ((dev.idhammai.P.V.I)S.W.field_1705.method_1743()).frogClient$addMessage(class_2561.method_30163((String)(I.Q.Y.q() + "\u00a7f " + string)));
    }
}

