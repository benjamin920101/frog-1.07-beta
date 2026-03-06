/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.Formatting
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.util.InputUtil
 */
package dev.idhammai.c.y.R.V;

import dev.idhammai.P.A.A.S;
import dev.idhammai.P.A.S.f;
import dev.idhammai.c.r.O.Y.B;
import dev.idhammai.c.y.R.V.O;
import dev.idhammai.c.y.R.V.T;
import dev.idhammai.c.y.u.C.K;
import dev.idhammai.c.y.u.I.t;
import net.minecraft.util.Formatting;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.InputUtil;

public class X
extends O {
    public final B<?> k;
    private boolean U;
    private Enum B;
    private Enum J;
    private Enum N;
    private boolean K;
    private long h;
    private long c = 180L;

    public X(B<?> b2) {
        super(b2.e());
        this.k = b2;
        this.B = b2.X();
    }

    @Override
    public void B(class_332 class_3322, int n2, int n3, float f2) {
        double d2;
        int n4;
        double d3;
        this.P();
        boolean bl = this.l(n2, n3);
        double d4 = this.G();
        float f3 = (float)this.u + 7.0f;
        float f4 = (float)this.a - 0.5f;
        float f5 = this.M(this.E, (float)this.a - 0.5f);
        if (this.l(n2, n3) && class_3675.method_15987((long)W.method_22683().method_4490(), (int)340)) {
            this.q(this.k.e().equalsIgnoreCase("Page") ? "Reset Page" : "Reset Default", this.p + 2.3f, f5, g);
        } else {
            int n5;
            this.q(this.k.Q(), this.p + 2.3f, f5, this.m() ? g : R);
            int n6 = n5 = this.m() ? g : R;
            if (this.K && this.J != null && this.N != null) {
                d3 = this.K();
                float f6 = (float)this.a - 1.5f;
                String string = this.X(this.k.x(this.J));
                String string2 = this.X(this.k.x(this.N));
                int n7 = this.n(string);
                int n8 = this.n(string2);
                float f7 = f5 - f6 * (float)d3;
                float f8 = f5 + f6 * (float)(1.0 - d3);
                int n9 = f.k(n5, Math.max(0, Math.min(255, (int)Math.round(255.0 * (1.0 - d3)))));
                int n10 = f.k(n5, Math.max(0, Math.min(255, (int)Math.round(255.0 * d3))));
                int n11 = (int)this.p - 1;
                n4 = (int)this.E - 1;
                int n12 = (int)(this.p + f3) + 2;
                int n13 = (int)(this.E + f4) + 2;
                class_3322.method_44379(n11, n4, n12, n13);
                this.q(String.valueOf(class_124.field_1080) + string, this.p + f3 - (float)n7 - 3.0f, f7, n9);
                this.q(String.valueOf(class_124.field_1080) + string2, this.p + f3 - (float)n8 - 3.0f, f8, n10);
                class_3322.method_44380();
            } else {
                String string = this.X(this.k.x((Enum<?>)this.k.X()));
                String string3 = String.valueOf(class_124.field_1080) + string;
                int n14 = this.n(string);
                this.q(string3, this.p + f3 - (float)n14 - 3.0f, f5, n5);
            }
        }
        Enum[] enumArray = (Enum[])((Enum)this.k.X()).getDeclaringClass().getEnumConstants();
        d3 = 11.0 * (double)enumArray.length;
        double d5 = super.R();
        double d6 = this.o();
        double d7 = d2 = d3 <= 0.0 ? 0.0 : Math.max(0.0, Math.min(1.0, (d6 - d5) / d3));
        if (d2 > 0.01) {
            double d8 = (double)this.E + (double)this.a + 1.0;
            double d9 = 11.0 * d2;
            n4 = (int)Math.round(255.0 * d2);
            for (Enum enum_ : enumArray) {
                String string = this.k.x(enum_);
                float f9 = this.M((float)d8, 11.0f);
                int n15 = ((Enum)this.k.X()).name().equals(enum_.name()) ? g : R;
                this.q(string, (float)this.u / 2.0f - (float)this.n(string) / 2.0f + 2.0f + this.p, f9, f.k(n15, n4));
                d8 += d9;
            }
        }
    }

    @Override
    public void E() {
        this.P();
        this.q(!this.k.D());
    }

    private String X(String string) {
        if (string.equalsIgnoreCase("ABC")) {
            return "ABC";
        }
        return string;
    }

    private void P() {
        long l2;
        Object obj = this.k.X();
        if (this.B == null) {
            this.B = obj;
            return;
        }
        if (obj != this.B) {
            this.J = this.B;
            this.N = obj;
            this.K = true;
            this.h = System.currentTimeMillis();
            this.B = obj;
            return;
        }
        if (this.K && (l2 = System.currentTimeMillis() - this.h) >= this.c) {
            this.K = false;
            this.J = null;
            this.N = null;
        }
    }

    private double K() {
        double d2;
        long l2 = System.currentTimeMillis();
        long l3 = l2 - this.h;
        double d3 = d2 = this.c <= 0L ? 1.0 : (double)l3 / (double)this.c;
        if (d2 < 0.0) {
            d2 = 0.0;
        } else if (d2 > 1.0) {
            d2 = 1.0;
        }
        return S.CubicInOut.T(d2);
    }

    @Override
    public void d(int n2, int n3, int n4) {
        if (n4 == 0 && this.l(n2, n3) && class_3675.method_15987((long)W.method_22683().method_4490(), (int)340)) {
            if (this.k.e().equalsIgnoreCase("Page")) {
                boolean bl = false;
                for (K k2 : dev.idhammai.c.y.u.I.t.a().n()) {
                    for (T t2 : k2.n()) {
                        if (!t2.Z().F().contains(this.k)) continue;
                        t2.t(this.k);
                        bl = true;
                        break;
                    }
                    if (!bl) continue;
                }
                X.L();
                return;
            }
            Object obj = this.k.H();
            this.k.R(((Enum)obj).name());
            X.L();
            return;
        }
        super.d(n2, n3, n4);
        if (n4 == 1 && this.l(n2, n3)) {
            this.U = !this.U;
            X.L();
        } else if (n4 == 0 && this.U) {
            int n5 = (int)this.E;
            for (Enum enum_ : (Enum[])((Enum)this.k.X()).getDeclaringClass().getEnumConstants()) {
                if ((float)n2 > this.p && (float)n2 < this.p + (float)this.u && n3 >= n5 + this.a + 1 && n3 < n5 + this.a + 11 + 1) {
                    this.k.R(String.valueOf(enum_));
                    X.L();
                }
                n5 += 11;
            }
        }
    }

    @Override
    public int R() {
        return super.R() + (this.U ? 11 * ((Enum[])((Enum)this.k.X()).getDeclaringClass().getEnumConstants()).length : 0);
    }

    @Override
    public void T() {
        this.k.v();
    }

    @Override
    public boolean m() {
        return true;
    }
}

