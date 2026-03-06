/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_4587
 */
package dev.idhammai.c.r.q.i;

import dev.idhammai.P.A.A.A;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.B;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import net.minecraft.class_4587;

public class O
extends y {
    public static O K;
    private float s;
    private float E;
    private float h;
    private float k;

    public O() {
        super("FreeLook", w.Player);
        this.L("\u81ea\u7531\u89c6\u89d2");
        K = this;
    }

    @Override
    public void H() {
        if (O.M()) {
            this.p();
            return;
        }
        this.E = O.W.field_1724.method_36455();
        this.s = O.W.field_1724.method_36454();
        this.k = this.E;
        this.h = this.s;
    }

    @r
    public void q(B b2) {
        this.s += (float)b2.n() * 0.15f;
        this.E += (float)b2.G() * 0.15f;
        b2.L();
    }

    @Override
    public void h(class_4587 class_45872) {
        this.h = this.s;
        this.k = this.E;
    }

    public float I() {
        return A.S(this.h, this.s, W.method_60646().method_60637(true));
    }

    public float p() {
        return A.S(this.k, this.E, W.method_60646().method_60637(true));
    }
}

