/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.N.z;

import dev.idhammai.P.A.A.k;
import dev.idhammai.c.r.q.N.z.W;
import dev.idhammai.c.r.y;

final class F {
    private final y m;
    private String t = "";
    private boolean e;
    private double c = 0.0;
    private final k T = new k();
    private final k f = new k();
    private double i;
    private double G;

    private F(y y2) {
        this.m = y2;
    }

    private void l(W w2) {
        boolean bl = this.e = this.m.p() && this.m.z.h();
        if (this.e) {
            String string = this.m.Q();
            if (string == null) {
                string = "";
            }
            this.t = w2.Q.h() ? string.toLowerCase() : string;
        }
    }

    private void a(W w2) {
        if (this.c <= 0.0 && !this.e) {
            this.i = 0.0;
            this.G = 0.0;
            return;
        }
        String string = this.t == null ? "" : this.t;
        double d2 = w2.V(string) + 1;
        this.c = this.T.g(this.e ? d2 : 0.0, this.e ? (long)w2.a.V() : (long)w2.m.V(), w2.A.X());
        this.G = this.f.g(this.e ? 1.0 : 0.0, w2.f.V(), w2.A.X());
        this.i = this.c + (double)w2.b.Z();
    }
}

