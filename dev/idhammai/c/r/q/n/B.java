/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1657
 *  net.minecraft.class_4587
 */
package dev.idhammai.c.r.q.n;

import dev.idhammai.P.A.A.k;
import dev.idhammai.P.A.S.Z;
import dev.idhammai.c.r.q.n.f;
import net.minecraft.class_1657;
import net.minecraft.class_4587;

class B {
    public final Z c;
    final k p;
    final f e;

    public B(f f2, class_1657 class_16572) {
        this.e = f2;
        this.c = new Z(class_16572);
        this.p = new k();
    }

    public boolean Q(class_4587 class_45872) {
        double d2 = this.p.g(1.0, this.e.s.V(), this.e.K.X());
        if (d2 >= 1.0) {
            return true;
        }
        this.c.Q(class_45872, this.e.d, this.e.g, this.e.V.h() ? 1.0 - d2 : 1.0, this.e.N.e() * d2, 1.0 + (this.e.Q.e() - 1.0) * d2, this.e.n.e() * d2, this.e.D.h(), this.e.X.h());
        return false;
    }
}

