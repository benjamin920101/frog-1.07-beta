/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.DrawContext
 */
package dev.idhammai.c.y.R.V;

import dev.idhammai.Frog;
import dev.idhammai.P.A.S.f;
import dev.idhammai.P.A.S.o;
import dev.idhammai.c.r.q.N.P;
import dev.idhammai.c.r.q.N.S;
import dev.idhammai.c.y.R.C;
import dev.idhammai.c.y.u.C.K;
import dev.idhammai.c.y.u.I.t;
import java.awt.Color;
import net.minecraft.client.gui.DrawContext;

public class O
extends C {
    private boolean C;
    public static int T = -2007673515;
    public static int t = 0x11555555;
    public static int R = -5592406;
    public static int g = -1;

    public O(String string) {
        super(string);
        this.J(15);
    }

    @Override
    public void B(class_332 class_3322, int n2, int n3, float f2) {
        boolean bl = this.l(n2, n3);
        float f3 = (float)this.a - 0.5f;
        if (this.m()) {
            int n4 = bl ? P.M().pq.V() : P.M().pa.V();
            double d2 = this.G();
            if (P.M().pM.X() == S.Shader) {
                Frog.SHADER.u(() -> this.lambda$drawScreen$0(class_3322, f3, n4));
            } else {
                Color color = P.M().q(d2);
                o.y(class_3322.method_51448(), this.p, this.E, this.p + (float)this.u, this.E + (float)this.a - 0.5f, f.y(color, n4).getRGB());
            }
        } else {
            o.y(class_3322.method_51448(), this.p, this.E, this.p + (float)this.u, this.E + (float)this.a - 0.5f, !bl ? t : T);
        }
        float f4 = this.M(this.E, (float)this.a - 0.5f);
        this.i(this.o(), this.p + 2.3f, f4, this.m() ? g : R);
    }

    protected void q(String string, double d2, double d3, int n2) {
        this.g(string, d2, d3, n2);
    }

    protected int n(String string) {
        return this.z(string);
    }

    @Override
    public void d(int n2, int n3, int n4) {
        if (n4 == 0 && this.l(n2, n3)) {
            this.j();
        }
    }

    public void j() {
        this.C = !this.C;
        this.T();
        O.L();
    }

    public void T() {
    }

    public boolean m() {
        return this.C;
    }

    @Override
    public int R() {
        return this.a - 1;
    }

    public boolean l(int n2, int n3) {
        for (K k2 : dev.idhammai.c.y.u.I.t.a().n()) {
            if (!k2.B) continue;
            return false;
        }
        return (float)n2 >= this.W() && (float)n2 <= this.W() + (float)this.S() && (float)n3 >= this.C() && (float)n3 <= this.C() + (float)this.a - 1.0f;
    }

    private void lambda$drawScreen$0(class_332 class_3322, float f2, int n2) {
        o.K(class_3322.method_51448(), this.p, this.E, this.u, f2, n2);
    }
}

