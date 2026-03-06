/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2670
 *  net.minecraft.class_4587
 *  net.minecraft.class_6373
 */
package dev.idhammai.c.r.q.Q;

import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.P.r.c.i;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.q.Q.A;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import java.util.concurrent.CopyOnWriteArrayList;
import net.minecraft.class_2670;
import net.minecraft.class_4587;
import net.minecraft.class_6373;

public class D
extends y {
    final CopyOnWriteArrayList<A> l = new CopyOnWriteArrayList();
    private final l M = this.p(new l("Spoof", 500.0, 0.0, 5000.0, 1.0).D("\u4f2a\u9020\u5ef6\u8fdf").P("ms"));

    public D() {
        super("PingSpoof", w.Exploit);
        this.L("\u5ef6\u8fdf\u6b3a\u9a97");
    }

    @Override
    public void W() {
        this.l.clear();
    }

    @r
    public void q(i i2) {
        if (D.M()) {
            return;
        }
        if (i2.L() instanceof class_6373 || i2.L() instanceof class_2670) {
            this.l.add(new A(this, this, i2.L()));
            i2.L();
        }
    }

    @r
    public void u(QO qO) {
        this.M();
    }

    @Override
    public void h(class_4587 class_45872) {
        this.M();
    }

    @Override
    public void L() {
        if (D.M()) {
            this.l.clear();
            return;
        }
        for (A a2 : this.l) {
            a2.b();
        }
    }

    private void M() {
        if (D.M()) {
            this.l.clear();
            return;
        }
        this.l.removeIf(A::V);
    }
}

