/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2547
 *  net.minecraft.class_2596
 */
package dev.idhammai.c.r.q.Q;

import dev.idhammai.P.A.A.h;
import dev.idhammai.P.A.J;
import dev.idhammai.c.r.q.Q.D;
import net.minecraft.class_2547;
import net.minecraft.class_2596;

class A {
    final class_2596 c;
    final int Q;
    private final h I;

    public A(D d2, D d3, class_2596 class_25962) {
        this.c = class_25962;
        this.I = new h();
        this.Q = d3.M.V();
    }

    public boolean V() {
        if (this.I.m(this.Q)) {
            try {
                this.b();
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            return true;
        }
        return false;
    }

    public void b() {
        if (this.c != null) {
            this.c.method_11054((class_2547)J.W.method_1562());
        }
    }
}

