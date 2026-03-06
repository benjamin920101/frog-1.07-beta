/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.O.Y;

import dev.idhammai.P.A.A.h;
import dev.idhammai.c.r.O.v;
import dev.idhammai.c.r.q.N.W;
import dev.idhammai.c.r.q.N.p;
import java.awt.Color;
import java.util.function.BooleanSupplier;

public class A
extends v {
    public static final h j = new h();
    public static final float A = 4.0f;
    private final Color c;
    public boolean Z = false;
    public boolean b = false;
    public boolean i = false;
    private Color x;
    private boolean a = false;
    private boolean K = false;
    private boolean s = true;

    public A(String string) {
        this(string, new Color(255, 255, 255));
        this.a = true;
    }

    public A(String string, BooleanSupplier booleanSupplier) {
        super(string, booleanSupplier);
        this.c = this.x = new Color(255, 255, 255);
        this.a = true;
    }

    public A(String string, Color color) {
        super(string);
        this.x = color;
        this.c = color;
    }

    public A(String string, Color color, BooleanSupplier booleanSupplier) {
        super(string, booleanSupplier);
        this.x = color;
        this.c = color;
    }

    public A(String string, int n2) {
        this(string, new Color(n2, true));
    }

    public A(String string, int n2, BooleanSupplier booleanSupplier) {
        this(string, new Color(n2, true), booleanSupplier);
    }

    public A P(String string) {
        super.V(string);
        return this;
    }

    public Color P() {
        if (this.Z) {
            p p2 = p.E;
            if (this.s && p2 != null && p2.d.X() == W.Rainbow) {
                double d2 = Math.ceil(((double)System.currentTimeMillis() * p2.A.e() + p2.D.e()) / 20.0);
                Color color = Color.getHSBColor((float)(d2 % 360.0 / 360.0), p2.V.Z() / 255.0f, 1.0f);
                this.a(new Color(color.getRed(), color.getGreen(), color.getBlue(), this.x.getAlpha()));
            } else {
                float[] fArray = Color.RGBtoHSB(this.x.getRed(), this.x.getGreen(), this.x.getBlue(), null);
                float f2 = (float)((double)j.k() * 0.36 * 4.0 / 20.0 % 361.0 / 360.0);
                Color color = Color.getHSBColor(f2, fArray[1], fArray[2]);
                this.a(new Color(color.getRed(), color.getGreen(), color.getBlue(), this.x.getAlpha()));
            }
        }
        return this.x;
    }

    public void a(Color color) {
        this.x = color;
    }

    public void H(int n2) {
        this.x = new Color(n2, true);
    }

    public void A(boolean bl) {
        this.Z = bl;
    }

    public A k(boolean bl) {
        this.a = bl;
        this.Z = bl;
        return this;
    }

    public A t(boolean bl) {
        this.b = true;
        this.K = bl;
        this.i = bl;
        return this;
    }

    public A K(boolean bl) {
        this.s = bl;
        return this;
    }

    public Color g() {
        return this.c;
    }

    public boolean q() {
        return this.K;
    }

    public boolean d() {
        return this.a;
    }
}

