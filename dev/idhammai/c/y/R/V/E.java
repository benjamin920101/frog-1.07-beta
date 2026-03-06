/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_124
 *  net.minecraft.class_332
 *  net.minecraft.class_3675
 */
package dev.idhammai.c.y.R.V;

import dev.idhammai.Frog;
import dev.idhammai.P.A.S.f;
import dev.idhammai.P.A.S.o;
import dev.idhammai.c.r.q.N.P;
import dev.idhammai.c.r.q.N.S;
import dev.idhammai.c.y.R.V.O;
import java.awt.Color;
import net.minecraft.class_124;
import net.minecraft.class_332;
import net.minecraft.class_3675;

public class E
extends O {
    private final dev.idhammai.c.r.O.Y.O l;
    public boolean M;

    public E(dev.idhammai.c.r.O.Y.O o2) {
        super(o2.e());
        this.l = o2;
    }

    @Override
    public void B(class_332 class_3322, int n2, int n3, float f2) {
        boolean bl = this.l(n2, n3);
        double d2 = this.G();
        float f3 = (float)this.u + 7.0f;
        float f4 = (float)this.a - 0.5f;
        if (P.M().pM.X() == S.Shader) {
            int n4 = !bl ? P.M().pa.V() : P.M().pq.V();
            Frog.SHADER.u(() -> this.lambda$drawScreen$0(class_3322, f3, f4, n4));
        } else {
            Color color = P.M().b(d2);
            o.y(class_3322.method_51448(), this.p, this.E, this.p + f3, this.E + (float)this.a - 0.5f, this.m() ? (!bl ? t : T) : (!bl ? f.y(color, P.M().pa.V()).getRGB() : f.y(color, P.M().pq.V()).getRGB()));
        }
        float f5 = this.M(this.E, (float)this.a - 0.5f);
        if (this.M) {
            this.q("Press keyCodec Key...", this.p + 2.3f, f5, g);
        } else {
            String string = this.l.O();
            if (!this.M && this.l(n2, n3) && class_3675.method_15987((long)W.method_22683().method_4490(), (int)340)) {
                if (this.l.e().equals("Key")) {
                    if (this.l.B()) {
                        this.q("\u00a77Toggle/\u00a7fHold", this.p + 2.3f, f5, g);
                    } else {
                        this.q("\u00a7fToggle\u00a77/Hold", this.p + 2.3f, f5, g);
                    }
                } else {
                    this.q("Reset Default", this.p + 2.3f, f5, g);
                }
            } else {
                this.q(this.l.Q() + " " + String.valueOf(class_124.field_1080) + string, this.p + 2.3f, f5, this.m() ? g : R);
            }
        }
    }

    @Override
    public void E() {
        this.q(!this.l.D());
    }

    @Override
    public void d(int n2, int n3, int n4) {
        if (n4 == 0 && this.l(n2, n3)) {
            if (class_3675.method_15987((long)W.method_22683().method_4490(), (int)340)) {
                if (this.l.e().equals("Key")) {
                    this.l.d(!this.l.B());
                    dev.idhammai.c.y.R.V.E.L();
                } else {
                    this.l.N(this.l.B());
                    this.l.d(false);
                    this.l.s(false);
                    this.l.f = false;
                    dev.idhammai.c.y.R.V.E.L();
                }
            } else {
                this.j();
            }
        } else if (this.M) {
            this.l.N(-n4 - 2);
            this.j();
        }
    }

    @Override
    public void l(int n2) {
        if (this.M) {
            this.l.N(n2);
            if (this.l.O().equalsIgnoreCase("DELETE")) {
                this.l.N(-1);
            }
            this.j();
        }
    }

    @Override
    public void T() {
        this.M = !this.M;
    }

    @Override
    public boolean m() {
        return !this.M;
    }

    private void lambda$drawScreen$0(class_332 class_3322, float f2, float f3, int n2) {
        o.K(class_3322.method_51448(), this.p, this.E, f2, f3, n2);
    }
}

