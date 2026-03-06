/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntListIterator
 *  net.minecraft.class_1671
 *  net.minecraft.class_2596
 *  net.minecraft.class_2708
 *  net.minecraft.class_2716
 *  net.minecraft.class_6374
 */
package dev.idhammai.c.r.q.Q;

import dev.idhammai.P.A.A.h;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.J;
import dev.idhammai.P.r.c.d;
import dev.idhammai.P.r.c.i;
import dev.idhammai.P.r.c.v;
import dev.idhammai.asm.accessors.IFireworkRocketEntity;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_1671;
import net.minecraft.class_2596;
import net.minecraft.class_2708;
import net.minecraft.class_2716;
import net.minecraft.class_6374;

public class s
extends y {
    final List<class_6374> X = new ArrayList<class_6374>();
    private final h M = new h();
    private final l a = this.p(new l("Time", 10.0, 0.0, 50.0, 0.1).D("\u5ef6\u957f\u65f6\u95f4"));
    private boolean j;
    private class_1671 N;

    public s() {
        super("RocketExtend", w.Exploit);
        this.L("\u70df\u82b1\u5ef6\u957f");
    }

    @Override
    public void L() {
        if (this.N != null) {
            ((IFireworkRocketEntity)this.N).hookExplodeAndRemove();
        }
        this.N = null;
        this.j = false;
        for (class_6374 class_63742 : this.X) {
            W.method_1562().method_52787((class_2596)class_63742);
        }
        this.X.clear();
    }

    @r
    public void j(d d2) {
        if (s.W.field_1724 == null) {
            return;
        }
        if (s.W.field_1724.method_6128() && this.N != d2.p() && ((IFireworkRocketEntity)d2.p()).hookWasShotByEntity() && ((IFireworkRocketEntity)d2.p()).getShooter() == s.W.field_1724) {
            this.j = true;
            d2.L();
            this.N = d2.p();
            this.M.H();
        }
    }

    @r
    public void g(v v2) {
        if (s.M()) {
            return;
        }
        if (!this.j) {
            return;
        }
        if (!s.W.field_1724.method_6128() || s.W.field_1724.method_24828() || this.M.r(this.a.e())) {
            this.j = false;
            if (this.N != null) {
                ((IFireworkRocketEntity)this.N).hookExplodeAndRemove();
                this.N = null;
            }
            for (class_6374 class_63742 : this.X) {
                W.method_1562().method_52787((class_2596)class_63742);
            }
            this.X.clear();
        }
    }

    @r
    public void K(J j2) {
        if (s.W.field_1724 == null || s.W.field_1687 == null) {
            return;
        }
        class_2596<?> class_25962 = j2.L();
        if (class_25962 instanceof class_6374) {
            class_6374 class_63742 = (class_6374)class_25962;
            if (this.j && s.W.field_1724.method_6128()) {
                j2.L();
                this.X.add(class_63742);
            }
        }
    }

    @r
    public void w(i i2) {
        if (s.M() || !s.W.field_1724.method_6128() || !this.j) {
            return;
        }
        class_2596<?> class_25962 = i2.L();
        if (class_25962 instanceof class_2716) {
            class_2716 class_27162 = (class_2716)class_25962;
            if (this.N != null) {
                IntListIterator intListIterator = class_27162.method_36548().iterator();
                while (intListIterator.hasNext()) {
                    int n2 = intListIterator.next();
                    if (n2 != this.N.method_5628()) continue;
                    i2.L();
                    return;
                }
            }
        }
        if (i2.L() instanceof class_2708) {
            this.j = false;
            if (this.N != null) {
                ((IFireworkRocketEntity)this.N).hookExplodeAndRemove();
                this.N = null;
            }
            for (class_6374 class_63742 : this.X) {
                W.method_1562().method_52787((class_2596)class_63742);
            }
            this.X.clear();
        }
    }
}

