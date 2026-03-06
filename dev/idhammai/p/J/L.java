/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  net.minecraft.class_1297
 *  net.minecraft.class_2338
 *  net.minecraft.class_742
 */
package dev.idhammai.p.J;

import com.google.common.collect.Lists;
import dev.idhammai.Frog;
import dev.idhammai.P.A.J;
import dev.idhammai.P.A.S.k;
import dev.idhammai.P.A.l.M;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.P.r.c.v;
import dev.idhammai.c.r.q.n.h;
import dev.idhammai.c.r.y;
import dev.idhammai.p.J.w;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import net.minecraft.class_1297;
import net.minecraft.class_2338;
import net.minecraft.class_742;

public class L
implements J {
    public static final ExecutorService O = Executors.newCachedThreadPool();
    public static w C;
    public volatile Iterable<class_1297> w = Collections.emptyList();
    public volatile List<class_742> r = Collections.emptyList();
    public volatile boolean J = false;

    public L() {
        this.e();
    }

    public void e() {
        Frog.EVENT_BUS.S(this);
        C = new w(this);
        C.setName("FrogClientService");
        C.setDaemon(true);
        C.start();
    }

    public Iterable<class_1297> z() {
        return this.w;
    }

    public List<class_742> v() {
        return this.r;
    }

    public void w(Runnable runnable) {
        O.execute(runnable);
    }

    @r(D=200)
    public void m(v v2) {
        Frog.POP.F();
        Frog.SERVER.a();
        if (v2.a()) {
            k.J();
            this.J = true;
            M.V.forEach(L::lambda$onEvent$0);
            M.V.clear();
            Frog.PLAYER.y();
            if (!y.M()) {
                Frog.EVENT_BUS.J(QO.H);
            }
        } else {
            this.J = false;
            if (L.W.field_1687 == null || L.W.field_1724 == null) {
                return;
            }
            this.w = Lists.newArrayList((Iterable)L.W.field_1687.method_18112());
            this.r = Lists.newArrayList((Iterable)L.W.field_1687.method_18456());
        }
        if (!C.isAlive() || C.isInterrupted()) {
            C = new w(this);
            C.setName("FrogService");
            C.setDaemon(true);
            C.start();
        }
    }

    private static void lambda$onEvent$0(class_2338 class_23382) {
        h.k.H(class_23382);
    }
}

