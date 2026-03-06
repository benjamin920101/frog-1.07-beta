/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1799
 *  net.minecraft.class_327
 *  net.minecraft.class_332
 */
package dev.idhammai.c.r.q.x;

import dev.idhammai.P.A.A.h;
import dev.idhammai.P.A.J;
import dev.idhammai.c.r.q.x.D;
import java.util.Objects;
import net.minecraft.class_1799;
import net.minecraft.class_327;
import net.minecraft.class_332;

class j {
    final class_1799 c;
    final String S;
    private final h r;
    final D a;

    public j(D d2, class_1799 class_17992, String string) {
        this.a = d2;
        this.c = class_17992;
        this.r = new h();
        this.S = string;
    }

    public boolean r(class_332 class_3322) {
        if (this.r.r(this.a.J.e())) {
            return true;
        }
        D.i(class_3322, this.a.A.V() - 8, this.a.e.V() + D.l, this.c);
        class_327 class_3272 = J.W.field_1772;
        int n2 = this.a.A.V();
        int n3 = this.a.e.V() + D.l;
        Objects.requireNonNull(J.W.field_1772);
        class_3322.method_51433(class_3272, this.S, n2, n3 - 9 - 82, -1, true);
        D.l += this.a.T.V();
        return false;
    }
}

