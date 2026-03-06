/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 *  net.minecraft.class_332
 *  net.minecraft.class_3675
 *  net.minecraft.class_3728
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.lwjgl.glfw.GLFW
 */
package dev.idhammai.c.y.R.V;

import dev.idhammai.Frog;
import dev.idhammai.P.A.A.S;
import dev.idhammai.P.A.A.k;
import dev.idhammai.P.A.S.f;
import dev.idhammai.P.A.S.o;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.q.N.P;
import dev.idhammai.c.y.R.V.O;
import dev.idhammai.c.y.R.V.i;
import dev.idhammai.c.y.u.C.K;
import dev.idhammai.c.y.u.I.t;
import java.awt.Color;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_3675;
import net.minecraft.class_3728;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.lwjgl.glfw.GLFW;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class p
extends O {
    private final double B;
    private final double X;
    private final double b;
    public final l K;
    public boolean c;
    private String f = "";
    private boolean Y = false;
    private final k M = new k();

    public p(l l2) {
        super(l2.e());
        double d2;
        this.K = l2;
        this.B = l2.B();
        this.X = l2.X();
        this.b = this.X - this.B;
        this.M.a = d2 = this.E();
        this.M.h = d2;
    }

    @Override
    public void J(int n2) {
        super.J(n2 + 3);
    }

    @Override
    public void B(class_332 class_3322, int n2, int n3, float f2) {
        Color color;
        this.S(n2, n3);
        boolean bl = this.l(n2, n3);
        double d2 = this.G();
        double d3 = this.M.g(this.E(), 200L, S.CubicInOut);
        float f3 = (float)this.u + 7.0f;
        float f4 = (float)this.a - 0.5f;
        float f5 = 2.0f;
        float f6 = 2.6f;
        float f7 = this.E + f4 - 4.0f;
        float f8 = f3 - f5 * 2.0f;
        float f9 = this.p + f5;
        float f10 = 3.0f;
        float f11 = f9 + f10;
        float f12 = f9 + f8 - f10;
        float f13 = Math.max(0.0f, f12 - f11);
        float f14 = (float)((double)f8 * d3);
        float f15 = f11 + f13 * (float)d3;
        int n4 = bl ? P.M().pq.V() : P.M().pa.V();
        Color color2 = P.M().b(d2);
        Color color3 = dev.idhammai.P.A.S.f.y(color2, n4);
        Color color4 = new Color(50, 50, 50, 180);
        float f16 = f6 / 2.0f;
        o.j(class_3322.method_51448(), f9, f7, f8, f6, f16, color4);
        if (P.M().pM.X() == dev.idhammai.c.r.q.N.S.Shader) {
            float f17 = Math.max(0.0f, f14);
            Frog.SHADER.u(() -> p.lambda$drawScreen$0(class_3322, f9, f7, f17, f6, f16, color3));
        } else {
            o.j(class_3322.method_51448(), f9, f7, Math.max(0.0f, f14), f6, f16, color3);
        }
        boolean bl2 = P.M().pM.X() == dev.idhammai.c.r.q.N.S.Shader && Frog.SHADER != null && Frog.SHADER.s();
        Color color5 = color = bl2 ? dev.idhammai.P.A.S.f.y(Color.WHITE, 230) : dev.idhammai.P.A.S.f.y(color2, 255);
        if (bl2) {
            int[] nArray = Frog.SHADER.h();
            Matrix4f matrix4f = new Matrix4f((Matrix4fc)class_3322.method_51448().method_23760().method_23761());
            Frog.SHADER.Q(() -> p.lambda$drawScreen$1(class_3322, matrix4f, nArray, f15, f7, f6, f10, color));
        } else {
            o.Q(class_3322.method_51448(), f15, f7 + f6 / 2.0f, f10, color, 32);
        }
        float f18 = Math.round(this.E + 2.0f);
        float f19 = this.p + 3.0f;
        float f20 = Math.round(this.p + f3 - 3.0f);
        Object object = this.c ? this.f + i.v() : (bl && class_3675.method_15987((long)W.method_22683().method_4490(), (int)340) ? "Reset" : String.format("%.2f", Float.valueOf(this.K.Z())) + this.K.i());
        this.g(this.K.Q(), f19, f18, g);
        int n5 = this.z((String)object);
        this.g((String)object, f20 - (float)n5, f18, g);
    }

    @Override
    public void d(int n2, int n3, int n4) {
        if (n4 == 0 && this.l(n2, n3) && class_3675.method_15987((long)W.method_22683().method_4490(), (int)340)) {
            this.Y = false;
            this.c = false;
            this.f = "";
            this.K.d(this.K.o());
            dev.idhammai.c.y.R.V.p.L();
            return;
        }
        if (this.l(n2, n3)) {
            dev.idhammai.c.y.R.V.p.L();
            if (n4 == 0) {
                if (this.c) {
                    this.T();
                } else {
                    this.P(n2);
                    this.Y = true;
                }
            } else if (n4 == 1) {
                this.T();
            }
        }
    }

    @Override
    public boolean l(int n2, int n3) {
        for (K k2 : dev.idhammai.c.y.u.I.t.a().n()) {
            if (!k2.B) continue;
            return false;
        }
        return (float)n2 >= this.W() && (float)n2 <= this.W() + (float)this.S() + 8.0f && (float)n3 >= this.C() && (float)n3 <= this.C() + (float)this.a - 1.0f;
    }

    @Override
    public void E() {
        this.q(!this.K.D());
    }

    @Override
    public void G(char c2, int n2) {
        if (this.c) {
            this.Y(this.f + c2);
        }
    }

    @Override
    public void l(int n2) {
        if (this.c) {
            switch (n2) {
                case 256: {
                    this.c = false;
                    break;
                }
                case 257: 
                case 335: {
                    this.D();
                    break;
                }
                case 86: {
                    if (!class_3675.method_15987((long)W.method_22683().method_4490(), (int)341)) break;
                    this.Y(this.f + class_3728.method_27556((class_310)W));
                    break;
                }
                case 259: {
                    this.Y(i.a(this.f));
                }
            }
        }
    }

    private void D() {
        if (this.f.isEmpty() || !this.s(this.f)) {
            this.K.d(this.K.o());
        } else {
            this.K.d(Double.parseDouble(this.f));
        }
        this.j();
    }

    public void Y(String string) {
        this.f = string;
    }

    private void S(int n2, int n3) {
        if (this.Y && this.l(n2, n3) && GLFW.glfwGetMouseButton((long)W.method_22683().method_4490(), (int)0) == 1) {
            this.P(n2);
        } else {
            this.Y = false;
        }
    }

    @Override
    public void T() {
        this.Y("" + this.K.Z());
        this.c = !this.c;
    }

    @Override
    public boolean m() {
        return !this.c;
    }

    private void P(int n2) {
        float f2 = (float)this.u + 7.0f;
        float f3 = 2.0f;
        float f4 = f2 - f3 * 2.0f;
        float f5 = this.p + f3;
        float f6 = 3.0f;
        float f7 = f5 + f6;
        float f8 = f5 + f4 - f6;
        float f9 = Math.max(f7, Math.min((float)n2, f8));
        float f10 = Math.max(0.0f, f8 - f7);
        double d2 = f10 <= 0.0f ? 0.0 : (double)(f9 - f7) / (double)f10;
        double d3 = this.K.B() + this.b * d2;
        d3 = Math.max(this.B, Math.min(d3, this.X));
        this.K.d(d3);
    }

    private double m() {
        return this.K.e() - this.B;
    }

    private double E() {
        return Math.max(0.0, Math.min(this.m() / this.b, 1.0));
    }

    public void R() {
        this.M.a = 0.0;
        this.M.h = 0.0;
    }

    private boolean s(String string) {
        return string.matches("-?\\d+(\\.\\d+)?");
    }

    private static void lambda$drawScreen$1(class_332 class_3322, Matrix4f matrix4f, int[] nArray, float f2, float f3, float f4, float f5, Color color) {
        class_3322.method_51448().method_22903();
        class_3322.method_51448().method_23760().method_23761().set((Matrix4fc)matrix4f);
        if (nArray != null) {
            class_3322.method_44379(nArray[0], nArray[1], nArray[2], nArray[3]);
        }
        o.Q(class_3322.method_51448(), f2, f3 + f4 / 2.0f, f5, color, 32);
        if (nArray != null) {
            class_3322.method_44380();
        }
        class_3322.method_51448().method_22909();
    }

    private static void lambda$drawScreen$0(class_332 class_3322, float f2, float f3, float f4, float f5, float f6, Color color) {
        o.j(class_3322.method_51448(), f2, f3, f4, f5, f6, color);
    }
}

