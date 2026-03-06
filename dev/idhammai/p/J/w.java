/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.p.J;

import dev.idhammai.c.r.q.A.O;
import dev.idhammai.c.r.q.A.i;
import dev.idhammai.c.r.q.N.I;
import dev.idhammai.c.r.q.n.Z;
import dev.idhammai.c.r.q.n.v;
import dev.idhammai.p.J.L;
import dev.idhammai.p.J.S;

public class w
extends Thread {
    final L Q;

    public w(L l2) {
        this.Q = l2;
    }

    @Override
    public void run() {
        while (true) {
            try {
                while (true) {
                    if (this.Q.J) {
                        Thread.onSpinWait();
                        continue;
                    }
                    i.X6.N();
                    Z.h.v();
                    v.F.N();
                    O.c.f();
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
                if (!I.Q.M.h()) continue;
                S.z("\u00a74An error has occurred [Thread] Message: [" + exception.getMessage() + "]");
                continue;
            }
            break;
        }
    }
}

