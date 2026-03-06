/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 */
package dev.idhammai.c.r.q.A;

import dev.idhammai.P.A.J;
import dev.idhammai.P.A.L.e;
import dev.idhammai.P.A.l.M;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.v;
import dev.idhammai.c.r.O.p.T;
import dev.idhammai.c.r.q.A.A;
import dev.idhammai.c.r.y;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;

public class C {
    boolean B;
    final A K;

    public C(A a2) {
        this.K = a2;
        this.B = false;
    }

    @r
    public void p(v v2) {
        if (y.M()) {
            return;
        }
        if (this.K.B.x(T.Pre) && v2.C() || this.K.B.x(T.Post) && v2.a()) {
            return;
        }
        if (this.K.D.G()) {
            if (this.B) {
                return;
            }
        } else {
            this.B = false;
            return;
        }
        this.B = true;
        this.K.H = null;
        this.K.L = 0;
        class_2338 class_23382 = e.H(true);
        if (this.K.a() == -1) {
            return;
        }
        if (!this.K.s.h() && !J.W.field_1724.method_24828()) {
            return;
        }
        class_2248 class_22482 = M.x(class_23382.method_10084());
        if (class_22482 == class_2246.field_10540 || class_22482 == class_2246.field_9987) {
            this.K.s(class_23382.method_10086(2));
        } else {
            this.K.A(class_23382.method_10086(2));
        }
    }
}

