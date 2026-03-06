/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.util.InputUtil
 *  net.minecraft.client.util.math.MatrixStack
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
import dev.idhammai.c.r.O.Y.A;
import dev.idhammai.c.r.q.N.P;
import dev.idhammai.c.y.R.V.O;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.InputUtil;
import net.minecraft.client.util.math.MatrixStack;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.lwjgl.glfw.GLFW;

public class j
extends O {
    static class_4587 H;
    static class_332 v;
    private final A r;
    boolean P;
    boolean h;
    boolean Q;
    boolean q;
    private final k M = new k();
    private final k j = new k();
    private final k o = new k();
    private final k w = new k();
    private final k z = new k();
    private final k K = new k();
    private boolean b;
    float[] J = new float[]{1.0f, 1.0f, 1.0f, 1.0f};

    public j(A a2) {
        super(a2.e());
        double d2;
        this.r = a2;
        this.K.a = d2 = this.m() ? 1.0 : 0.0;
        this.K.h = d2;
    }

    public static boolean C(int n2, int n3, int n4, int n5, int n6, int n7) {
        return n6 >= n2 && n7 >= n3 && n6 <= n4 && n7 <= n5;
    }

    public static Color C(Color color, float f2) {
        float f3 = (float)color.getRed() / 255.0f;
        float f4 = (float)color.getGreen() / 255.0f;
        float f5 = (float)color.getBlue() / 255.0f;
        return new Color(f3, f4, f5, f2);
    }

    private static boolean D() {
        P p2 = dev.idhammai.c.r.q.N.P.M();
        return p2 != null && p2.pM.X() == dev.idhammai.c.r.q.N.S.Shader && Frog.SHADER != null && Frog.SHADER.s();
    }

    private static void b(Runnable runnable) {
        if (!dev.idhammai.c.y.R.V.j.D()) {
            runnable.run();
            return;
        }
        class_332 class_3322 = v;
        if (class_3322 == null) {
            runnable.run();
            return;
        }
        int[] nArray = Frog.SHADER.h();
        Matrix4f matrix4f = new Matrix4f((Matrix4fc)H.method_23760().method_23761());
        Frog.SHADER.Q(() -> j.lambda$runAfterShader$0(matrix4f, nArray, class_3322, runnable));
    }

    public static void n(int n2, int n3, int n4, int n5, float f2, float f3, float f4, float f5) {
        float f6 = 4.0f;
        if (dev.idhammai.c.y.R.V.j.D()) {
            dev.idhammai.c.y.R.V.j.b(() -> j.lambda$drawPickerBase$1(n2, n3, n4, n5, f6, f2, f3, f4));
        } else {
            dev.idhammai.P.A.S.o.j(H, n2, n3, n4, n5, f6, Color.WHITE);
            dev.idhammai.P.A.S.o.G(H, n2, n3, n2 + n4, n3 + n5, Color.WHITE, new Color(f2, f3, f4));
            dev.idhammai.P.A.S.o.Q(H, n2, n3, n2 + n4, n3 + n5, new Color(0, 0, 0, 0), Color.BLACK);
        }
    }

    public static void G(int n2, int n3, int n4, int n5, int n6, int n7) {
        if (dev.idhammai.c.y.R.V.j.D()) {
            dev.idhammai.c.y.R.V.j.b(() -> j.lambda$drawLeftGradientRect$2(n2, n3, n4, n5, n6, n7));
        } else {
            dev.idhammai.P.A.S.o.A(H, n2, n3, n4, n5, n6, n7);
        }
    }

    public static void g(int n2, int n3, int n4, int n5, int n6, int n7, boolean bl) {
        if (dev.idhammai.c.y.R.V.j.D()) {
            dev.idhammai.c.y.R.V.j.b(() -> j.lambda$gradient$3(n2, n3, n4, n5, n6, n7));
        } else {
            dev.idhammai.P.A.S.o.A(H, n2, n3, n4, n5, n6, n7);
        }
    }

    public static int P(int n2, int n3) {
        int n4 = ((n2 & 0xFF0000) >> 16) * (100 + n3) / 100;
        int n5 = ((n2 & 0xFF00) >> 8) * (100 + n3) / 100;
        int n6 = (n2 & 0xFF) * (100 + n3) / 100;
        return new Color(n4, n5, n6).hashCode();
    }

    public static void b(float f2, float f3, float f4, float f5, int n2, int n3, boolean bl) {
        if (bl) {
            n2 = dev.idhammai.c.y.R.V.j.P(n2, -20);
            n3 = dev.idhammai.c.y.R.V.j.P(n3, -20);
        }
        int n4 = n2;
        int n5 = n3;
        if (dev.idhammai.c.y.R.V.j.D()) {
            dev.idhammai.c.y.R.V.j.b(() -> j.lambda$drawGradientRect$4(f2, f3, f4, f5, n4, n5));
        } else {
            dev.idhammai.P.A.S.o.M(H, f2, f3, f4, f5, n4, n5);
        }
    }

    public static String n() {
        try {
            return (String)Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
        }
        catch (UnsupportedFlavorException | IOException exception) {
            return null;
        }
    }

    public static void r(double d2, double d3, double d4, double d5, Color color, float f2) {
        double d6;
        if (d2 < d4) {
            d6 = d2;
            d2 = d4;
            d4 = d6;
        }
        if (d3 < d5) {
            d6 = d3;
            d3 = d5;
            d5 = d6;
        }
        float f3 = (float)d2;
        float f4 = (float)d3;
        float f5 = (float)(d4 - d2);
        float f6 = (float)(d5 - d3);
        float f7 = (float)Math.min(d2, d4);
        float f8 = (float)Math.min(d3, d5);
        float f9 = (float)Math.abs(d4 - d2);
        float f10 = (float)Math.abs(d5 - d3);
        if (dev.idhammai.c.r.q.N.P.M().pM.X() == dev.idhammai.c.r.q.N.S.Shader) {
            Frog.SHADER.u(() -> j.lambda$drawOutlineRect$5(f7, f8, f9, f10, f2, color));
        } else {
            int n2 = color.getRGB();
            dev.idhammai.P.A.S.o.F(H, f7, f8, f9, f2, n2);
            dev.idhammai.P.A.S.o.F(H, f7, f8 + f10 - f2, f9, f2, n2);
            dev.idhammai.P.A.S.o.F(H, f7, f8 + f2, f2, f10 - 2.0f * f2, n2);
            dev.idhammai.P.A.S.o.F(H, f7 + f9 - f2, f8 + f2, f2, f10 - 2.0f * f2, n2);
        }
    }

    @Override
    public void B(class_332 class_3322, int n2, int n3, float f2) {
        int n4;
        int n5;
        float f3;
        H = class_3322.method_51448();
        v = class_3322;
        boolean bl = this.l(n2, n3);
        double d2 = this.K.g(this.m() ? 1.0 : 0.0, 160L, S.CubicInOut);
        double d3 = this.G();
        Color color = dev.idhammai.c.r.q.N.P.M().b(d3);
        int n6 = bl ? dev.idhammai.c.r.q.N.P.M().pq.V() : dev.idhammai.c.r.q.N.P.M().pa.V();
        Color color2 = new Color(bl ? T : t, true);
        float f4 = (float)this.u + 7.0f;
        float f5 = (float)this.a - 0.5f;
        float f6 = Math.max(8.0f, f5 - 6.0f);
        float f7 = f6 * 1.5f;
        float f8 = f6 / 2.0f;
        float f9 = this.p + f4 - f7 - 2.0f;
        float f10 = this.E + (f5 - f6) / 2.0f;
        if (this.r.b) {
            float f11 = f7;
            float f12 = f6;
            f3 = f8;
            float f13 = 4.0f;
            float f14 = f9 - f11 - f13;
            float f15 = f10;
            Color color3 = new Color(color.getRed(), color.getGreen(), color.getBlue(), n6);
            n5 = bl ? 200 : 160;
            Color color4 = new Color(80, 80, 80, n5);
            Color color5 = f.U(color4, color3, d2);
            if (dev.idhammai.c.r.q.N.P.M().pM.X() == dev.idhammai.c.r.q.N.S.Shader && this.m()) {
                Frog.SHADER.u(() -> j.lambda$drawScreen$6(f14, f15, f11, f12, f3, color5));
            } else {
                dev.idhammai.P.A.S.o.j(H, f14, f15, f11, f12, f3, color5);
            }
            float f16 = Math.max(1.0f, f3 - 1.5f);
            float f17 = f14 + f3 + (float)((double)(f11 - f12) * d2);
            float f18 = f15 + f3;
            Color color6 = f.y(dev.idhammai.c.r.q.N.P.M().ps.P(), 230);
            int n7 = n4 = dev.idhammai.c.r.q.N.P.M().pM.X() == dev.idhammai.c.r.q.N.S.Shader && Frog.SHADER != null && Frog.SHADER.s() ? 1 : 0;
            if (n4 != 0) {
                int[] nArray = Frog.SHADER.h();
                Matrix4f matrix4f = new Matrix4f((Matrix4fc)class_3322.method_51448().method_23760().method_23761());
                Frog.SHADER.Q(() -> j.lambda$drawScreen$7(class_3322, matrix4f, nArray, f17, f18, f16, color6));
            } else {
                dev.idhammai.P.A.S.o.Q(class_3322.method_51448(), f17, f18, f16, color6, 64);
            }
        }
        Color color7 = f.y(this.r.P(), 255);
        if (dev.idhammai.c.y.R.V.j.D()) {
            P p2 = dev.idhammai.c.r.q.N.P.M();
            float f19 = f3 = p2 != null ? (float)p2.pO : 1.0f;
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (f3 > 1.0f) {
                f3 = 1.0f;
            }
            int n8 = Math.max(0, Math.min(255, Math.round(255.0f * f3)));
            Color color8 = f.y(this.r.P(), n8);
            dev.idhammai.c.y.R.V.j.b(() -> j.lambda$drawScreen$8(f9, f10, f7, f6, f8, color8));
        } else {
            dev.idhammai.P.A.S.o.j(H, f9, f10, f7, f6, f8, color7);
        }
        float f20 = this.M(this.E, (float)this.a - 0.5f);
        if (this.l(n2, n3) && class_3675.method_15987((long)W.method_22683().method_4490(), (int)340)) {
            this.q("Reset Default", this.p + 2.3f, f20, g);
        } else {
            this.q(this.r.Q(), this.p + 2.3f, f20, g);
        }
        double d4 = this.M.g(this.q ? 1.0 : 0.0, 200L, S.CubicInOut);
        if (d4 > 0.01) {
            int n9 = (int)this.p - 1;
            int n10 = (int)this.E - 1;
            int n11 = (int)(this.p + (float)this.u + 7.0f) + 1;
            n5 = (int)Math.round((double)(this.E + (float)this.a) + 119.0 * d4) + 1;
            boolean bl2 = dev.idhammai.c.r.q.N.P.M().pM.X() == dev.idhammai.c.r.q.N.S.Shader && Frog.SHADER != null && Frog.SHADER.s();
            class_3322.method_44379(n9, n10, n11, n5);
            if (bl2) {
                Frog.SHADER.k(n9, n10, n11, n5);
            }
            int n12 = (int)this.p;
            int n13 = (int)(this.E + (float)this.a);
            int n14 = (int)((float)this.u + 7.4f);
            int n15 = 78;
            int n16 = n13 + n15;
            n4 = n16 + 8;
            int n17 = 7;
            int n18 = 7;
            n16 = n13 + n15;
            n4 = n16 + n17;
            this.Y(this.r, n12, n13, n12, n4, n12, n16, n2, n3);
            float f21 = (float)(n4 + n18) + 4.0f;
            float f22 = this.M(f21, 12.0f);
            this.q("Rainbow", this.p + 2.3f, f22, this.r.Z ? g : R);
            float f23 = 12.0f;
            float f24 = 2.0f;
            float f25 = Math.max(8.0f, f23 - 6.0f);
            float f26 = f25 * 1.5f;
            float f27 = this.p + f4 - f26 - f24;
            float f28 = f21 + (f23 - f25) / 2.0f;
            boolean bl3 = this.r.Z;
            float f29 = bl3 ? 1.0f : 0.0f;
            Color color9 = dev.idhammai.c.r.q.N.P.M().b(this.G());
            int n19 = dev.idhammai.c.r.q.N.P.M().pa.V();
            Color color10 = new Color(color9.getRed(), color9.getGreen(), color9.getBlue(), n19);
            Color color11 = new Color(80, 80, 80, 160);
            Color color12 = bl3 ? color10 : color11;
            float f30 = f25 / 2.0f;
            if (dev.idhammai.c.r.q.N.P.M().pM.X() == dev.idhammai.c.r.q.N.S.Shader && bl3) {
                Frog.SHADER.u(() -> j.lambda$drawScreen$9(f27, f28, f26, f25, f30, color12));
            } else {
                dev.idhammai.P.A.S.o.j(H, f27, f28, f26, f25, f30, color12);
            }
            float f31 = Math.max(1.0f, f30 - 1.5f);
            float f32 = f27 + f30 + (f26 - f25) * f29;
            float f33 = f28 + f30;
            Color color13 = f.y(dev.idhammai.c.r.q.N.P.M().ps.P(), 230);
            dev.idhammai.P.A.S.o.Q(H, f32, f33, f31, color13, 64);
            if (dev.idhammai.c.r.q.N.P.M().pM.X() == dev.idhammai.c.r.q.N.S.Shader) {
                Frog.SHADER.E();
            }
            class_3322.method_44380();
        }
    }

    @Override
    public void d(int n2, int n3, int n4) {
        if (n4 == 0 && this.l(n2, n3) && class_3675.method_15987((long)W.method_22683().method_4490(), (int)340)) {
            this.P = false;
            this.h = false;
            this.Q = false;
            this.r.a(this.r.g());
            this.r.Z = this.r.d();
            if (this.r.b) {
                this.r.i = this.r.q();
            }
            dev.idhammai.c.y.R.V.j.L();
            return;
        }
        if (n4 == 0) {
            float f2;
            float f3;
            int n5 = (int)this.p;
            int n6 = (int)(this.E + (float)this.a);
            int n7 = (int)((float)this.u + 7.4f);
            int n8 = 78;
            int n9 = n7 + 3;
            int n10 = 7;
            int n11 = 7;
            int n12 = n6 + n8;
            int n13 = n12 + n11;
            if (dev.idhammai.c.y.R.V.j.C(n5, n6, n5 + n7, n6 + n8, n2, n3)) {
                this.P = true;
            }
            if (dev.idhammai.c.y.R.V.j.C(n5, n13, n5 + n9, n13 + n10, n2, n3)) {
                this.h = true;
            }
            if (dev.idhammai.c.y.R.V.j.C(n5, n12, n5 + n7, n12 + n11, n2, n3)) {
                this.Q = true;
            }
            if (dev.idhammai.c.y.R.V.j.C(n5, (int)(f3 = (float)(n13 + n10) + 4.0f), n5 + n7, (int)(f3 + (f2 = 12.0f)), n2, n3)) {
                this.r.Z = !this.r.Z;
                dev.idhammai.c.y.R.V.j.L();
            }
        }
        if (this.l(n2, n3)) {
            if (n4 == 1) {
                dev.idhammai.c.y.R.V.j.L();
                this.q = !this.q;
            } else if (n4 == 0 && this.r.b) {
                dev.idhammai.c.y.R.V.j.L();
                this.r.i = !this.r.i;
            }
        }
    }

    @Override
    public boolean m() {
        return this.r.i;
    }

    @Override
    public void E() {
        this.q(!this.r.D());
    }

    @Override
    public void H(int n2, int n3, int n4) {
        this.Q = false;
        this.h = false;
        this.P = false;
    }

    public boolean Q(int n2, int n3) {
        float f2 = this.E + (float)this.a + 96.0f;
        int n4 = (int)this.M(f2, this.W());
        return dev.idhammai.c.y.R.V.j.C((int)((float)((int)this.p) + 2.3f), n4, (int)((float)((int)this.p) + 2.3f) + this.y("copy"), n4 + this.W(), n2, n3);
    }

    public boolean o(int n2, int n3) {
        float f2 = this.E + (float)this.a + 96.0f;
        float f3 = f2 + (float)this.W();
        int n4 = (int)this.M(f3, this.W());
        return dev.idhammai.c.y.R.V.j.C((int)((float)((int)this.p) + 2.3f), n4, (int)((float)((int)this.p) + 2.3f) + this.y("rainbow"), n4 + this.W(), n2, n3);
    }

    public boolean A(int n2, int n3) {
        float f2 = this.E + (float)this.a + 96.0f;
        int n4 = (int)this.M(f2, this.W());
        int n5 = (int)(this.p + (float)this.u - 2.3f - (float)this.y("paste") + 11.7f - 4.6f);
        return dev.idhammai.c.y.R.V.j.C(n5, n4, n5 + this.y("paste"), n4 + this.W(), n2, n3);
    }

    @Override
    public int R() {
        if (this.q) {
            return super.R() + 108;
        }
        return super.R();
    }

    public void Y(A a2, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        float f2;
        int n10 = (int)((float)this.u + 7.4f);
        int n11 = 78;
        int n12 = 7;
        int n13 = 7;
        if (this.P && (GLFW.glfwGetMouseButton((long)W.method_22683().method_4490(), (int)0) != 1 || !dev.idhammai.c.y.R.V.j.C(n2, n3, n2 + n10, n3 + n11, n8, n9))) {
            this.P = false;
        }
        if (!this.P) {
            this.J = Color.RGBtoHSB(a2.P().getRed(), a2.P().getGreen(), a2.P().getBlue(), null);
        }
        float[] fArray = new float[]{this.J[0], this.J[1], this.J[2], (float)a2.P().getAlpha() / 255.0f};
        if (this.h && (GLFW.glfwGetMouseButton((long)W.method_22683().method_4490(), (int)0) != 1 || !dev.idhammai.c.y.R.V.j.C(n4, n5, n4 + n10, n5 + n12, n8, n9))) {
            this.h = false;
        }
        if (this.Q && (GLFW.glfwGetMouseButton((long)W.method_22683().method_4490(), (int)0) != 1 || !dev.idhammai.c.y.R.V.j.C(n6, n7, n6 + n10, n7 + n13, n8, n9))) {
            this.Q = false;
        }
        if (this.h) {
            f2 = Math.min(Math.max(n4, n8), n4 + n10);
            fArray[0] = (f2 - (float)n4) / (float)n10;
        }
        if (this.Q) {
            f2 = Math.min(Math.max(n6, n8), n6 + n10);
            fArray[3] = 1.0f - (f2 - (float)n6) / (float)n10;
        }
        if (this.P) {
            f2 = Math.min(Math.max(n2, n8), n2 + n10);
            float f3 = Math.min(Math.max(n3, n9), n3 + n11);
            fArray[1] = (f2 - (float)n2) / (float)n10;
            fArray[2] = 1.0f - (f3 - (float)n3) / (float)n11;
        }
        int n14 = Color.HSBtoRGB(fArray[0], 1.0f, 1.0f);
        float f4 = (float)(n14 >> 16 & 0xFF) / 255.0f;
        float f5 = (float)(n14 >> 8 & 0xFF) / 255.0f;
        float f6 = (float)(n14 & 0xFF) / 255.0f;
        dev.idhammai.c.y.R.V.j.n(n2, n3, n10, n11, f4, f5, f6, fArray[3]);
        int n15 = (int)((float)n2 + fArray[1] * (float)n10);
        int n16 = (int)((float)(n3 + n11) - fArray[2] * (float)n11);
        int n17 = (int)((float)n4 + (float)n10 * fArray[0]);
        int n18 = (int)((float)(n6 + n10) - (float)n10 * fArray[3]);
        if (!this.b) {
            this.j.a = n15;
            this.j.h = n15;
            this.o.a = n16;
            this.o.h = n16;
            this.w.a = n17;
            this.w.h = n17;
            this.z.a = n18;
            this.z.h = n18;
            this.b = true;
        }
        long l2 = this.P ? 40L : 120L;
        int n19 = (int)Math.round(this.j.g(n15, l2, S.SineOut));
        int n20 = (int)Math.round(this.o.g(n16, l2, S.SineOut));
        this.A(n4, n5, n10, n12, fArray[0], this.h);
        a2.a(dev.idhammai.c.y.R.V.j.C(new Color(Color.HSBtoRGB(fArray[0], fArray[1], fArray[2])), fArray[3]));
        float f7 = 2.5f;
        dev.idhammai.c.y.R.V.j.b(() -> j.lambda$drawPicker$10(n19, n20, f7, a2));
        this.G(n6, n7, n10 - 1, n13, f4, f5, f6, fArray[3], this.Q);
    }

    public void A(int n2, int n3, int n4, int n5, float f2, boolean bl) {
        int n6 = 0;
        float f3 = 3.5f;
        boolean bl2 = dev.idhammai.c.y.R.V.j.D();
        if (n5 > n4) {
            int n7;
            int n8;
            int n9;
            if (bl2) {
                n9 = n2;
                n8 = n3;
                n7 = n4;
                dev.idhammai.c.y.R.V.j.b(() -> j.lambda$drawHueSlider$11(n9, n8, n7));
            } else {
                dev.idhammai.P.A.S.o.y(H, n2, n3, n2 + n4, n3 + 4, -65536);
            }
            n3 += 4;
            for (n9 = 0; n9 < 6; ++n9) {
                n8 = Color.HSBtoRGB((float)n6 / 6.0f, 1.0f, 1.0f);
                n7 = Color.HSBtoRGB((float)(n6 + 1) / 6.0f, 1.0f, 1.0f);
                dev.idhammai.c.y.R.V.j.b(n2, (float)n3 + (float)n6 * ((float)n5 / 6.0f), n2 + n4, (float)n3 + (float)(n6 + 1) * ((float)n5 / 6.0f), n8, n7, false);
                ++n6;
            }
            n9 = (int)((float)n3 + (float)n5 * f2) - 4;
            long l2 = bl ? 40L : 120L;
            int n10 = (int)Math.round(this.w.g(n9, l2, S.SineOut));
            if (bl2) {
                float f4 = n2 - 1;
                float f5 = n10 - 2;
                float f6 = n4 + 2;
                dev.idhammai.c.y.R.V.j.b(() -> j.lambda$drawHueSlider$12(f4, f5, f6));
            } else {
                dev.idhammai.P.A.S.o.j(H, n2 - 1, n10 - 2, n4 + 2, 4.0f, 2.0f, Color.WHITE);
            }
        } else {
            int n11;
            for (n11 = 0; n11 < 6; ++n11) {
                int n12 = Color.HSBtoRGB((float)n6 / 6.0f, 1.0f, 1.0f);
                int n13 = Color.HSBtoRGB((float)(n6 + 1) / 6.0f, 1.0f, 1.0f);
                dev.idhammai.c.y.R.V.j.g(n2 + n6 * (n4 / 6), n3, n2 + (n6 + 1) * (n4 / 6) + 3, n3 + n5, n12, n13, true);
                ++n6;
            }
            n11 = (int)((float)n2 + (float)n4 * f2);
            long l3 = bl ? 40L : 120L;
            int n14 = (int)Math.round(this.w.g(n11, l3, S.SineOut));
            float f7 = 4.0f;
            float f8 = (float)n5 + 4.0f;
            if (bl2) {
                float f9 = (float)n14 - f7 / 2.0f;
                float f10 = (float)n3 - 2.0f;
                float f11 = f7;
                float f12 = f8;
                dev.idhammai.c.y.R.V.j.b(() -> j.lambda$drawHueSlider$13(f9, f10, f11, f12));
            } else {
                dev.idhammai.P.A.S.o.j(H, (float)n14 - f7 / 2.0f, (float)n3 - 2.0f, f7, f8, 2.0f, Color.WHITE);
            }
        }
    }

    public void G(int n2, int n3, int n4, int n5, float f2, float f3, float f4, float f5, boolean bl) {
        int n6;
        int n7;
        boolean bl2 = true;
        int n8 = n5 / 2;
        boolean bl3 = dev.idhammai.c.y.R.V.j.D();
        for (n7 = -n8; n7 < n4; n7 += n8) {
            if (!bl2) {
                int n9;
                int n10;
                int n11;
                int n12;
                if (bl3) {
                    n12 = n2;
                    n11 = n3;
                    n6 = n8;
                    n10 = n7;
                    n9 = n5;
                    dev.idhammai.c.y.R.V.j.b(() -> j.lambda$drawAlphaSlider$14(n12, n10, n11, n6, n9));
                    dev.idhammai.c.y.R.V.j.b(() -> j.lambda$drawAlphaSlider$15(n12, n10, n11, n6, n9));
                } else {
                    dev.idhammai.P.A.S.o.y(H, n2 + n7, n3, n2 + n7 + n8, n3 + n5, -1);
                    dev.idhammai.P.A.S.o.y(H, n2 + n7, n3 + n8, n2 + n7 + n8, n3 + n5, -7303024);
                }
                if (n7 < n4 - n8) {
                    n12 = n2 + n7 + n8;
                    n11 = Math.min(n2 + n4, n2 + n7 + n8 * 2);
                    if (bl3) {
                        n6 = n3;
                        n10 = n8;
                        n9 = n5;
                        int n13 = n12;
                        int n14 = n11;
                        dev.idhammai.c.y.R.V.j.b(() -> j.lambda$drawAlphaSlider$16(n13, n6, n14, n9));
                        dev.idhammai.c.y.R.V.j.b(() -> j.lambda$drawAlphaSlider$17(n13, n6, n10, n14, n9));
                    } else {
                        dev.idhammai.P.A.S.o.y(H, n12, n3, n11, n3 + n5, -7303024);
                        dev.idhammai.P.A.S.o.y(H, n12, n3 + n8, n11, n3 + n5, -1);
                    }
                }
            }
            bl2 = !bl2;
        }
        dev.idhammai.c.y.R.V.j.G(n2, n3, n2 + n4, n3 + n5, new Color(f2, f3, f4, 1.0f).getRGB(), 0);
        n7 = (int)((float)(n2 + n4) - (float)n4 * f5);
        long l2 = bl ? 40L : 120L;
        n6 = (int)Math.round(this.z.g(n7, l2, S.SineOut));
        float f6 = 4.0f;
        float f7 = (float)n5 + 4.0f;
        if (bl3) {
            float f8 = (float)n6 - f6 / 2.0f;
            float f9 = (float)n3 - 2.0f;
            float f10 = f6;
            float f11 = f7;
            dev.idhammai.c.y.R.V.j.b(() -> j.lambda$drawAlphaSlider$18(f8, f9, f10, f11));
        } else {
            dev.idhammai.P.A.S.o.j(H, (float)n6 - f6 / 2.0f, (float)n3 - 2.0f, f6, f7, 2.0f, Color.WHITE);
        }
    }

    private static void lambda$drawAlphaSlider$18(float f2, float f3, float f4, float f5) {
        dev.idhammai.P.A.S.o.j(H, f2, f3, f4, f5, 2.0f, Color.WHITE);
    }

    private static void lambda$drawAlphaSlider$17(int n2, int n3, int n4, int n5, int n6) {
        dev.idhammai.P.A.S.o.y(H, n2, n3 + n4, n5, n3 + n6, -1);
    }

    private static void lambda$drawAlphaSlider$16(int n2, int n3, int n4, int n5) {
        dev.idhammai.P.A.S.o.y(H, n2, n3, n4, n3 + n5, -7303024);
    }

    private static void lambda$drawAlphaSlider$15(int n2, int n3, int n4, int n5, int n6) {
        dev.idhammai.P.A.S.o.y(H, n2 + n3, n4 + n5, n2 + n3 + n5, n4 + n6, -7303024);
    }

    private static void lambda$drawAlphaSlider$14(int n2, int n3, int n4, int n5, int n6) {
        dev.idhammai.P.A.S.o.y(H, n2 + n3, n4, n2 + n3 + n5, n4 + n6, -1);
    }

    private static void lambda$drawHueSlider$13(float f2, float f3, float f4, float f5) {
        dev.idhammai.P.A.S.o.j(H, f2, f3, f4, f5, 2.0f, Color.WHITE);
    }

    private static void lambda$drawHueSlider$12(float f2, float f3, float f4) {
        dev.idhammai.P.A.S.o.j(H, f2, f3, f4, 4.0f, 2.0f, Color.WHITE);
    }

    private static void lambda$drawHueSlider$11(int n2, int n3, int n4) {
        dev.idhammai.P.A.S.o.y(H, n2, n3, n2 + n4, n3 + 4, -65536);
    }

    private static void lambda$drawPicker$10(int n2, int n3, float f2, A a2) {
        dev.idhammai.P.A.S.o.Q(H, n2, n3, f2, Color.WHITE, 32);
        dev.idhammai.P.A.S.o.Q(H, n2, n3, f2 - 1.0f, a2.P(), 32);
    }

    private static void lambda$drawScreen$9(float f2, float f3, float f4, float f5, float f6, Color color) {
        dev.idhammai.P.A.S.o.j(H, f2, f3, f4, f5, f6, color);
    }

    private static void lambda$drawScreen$8(float f2, float f3, float f4, float f5, float f6, Color color) {
        dev.idhammai.P.A.S.o.j(H, f2, f3, f4, f5, f6, color);
    }

    private static void lambda$drawScreen$7(class_332 class_3322, Matrix4f matrix4f, int[] nArray, float f2, float f3, float f4, Color color) {
        class_3322.method_51448().method_22903();
        class_3322.method_51448().method_23760().method_23761().set((Matrix4fc)matrix4f);
        if (nArray != null) {
            class_3322.method_44379(nArray[0], nArray[1], nArray[2], nArray[3]);
        }
        dev.idhammai.P.A.S.o.Q(class_3322.method_51448(), f2, f3, f4, color, 64);
        if (nArray != null) {
            class_3322.method_44380();
        }
        class_3322.method_51448().method_22909();
    }

    private static void lambda$drawScreen$6(float f2, float f3, float f4, float f5, float f6, Color color) {
        dev.idhammai.P.A.S.o.j(H, f2, f3, f4, f5, f6, color);
    }

    private static void lambda$drawOutlineRect$5(float f2, float f3, float f4, float f5, float f6, Color color) {
        dev.idhammai.P.A.S.o.h(H, f2, f3, f4, f5, f6, color.getAlpha());
    }

    private static void lambda$drawGradientRect$4(float f2, float f3, float f4, float f5, int n2, int n3) {
        dev.idhammai.P.A.S.o.M(H, f2, f3, f4, f5, n2, n3);
    }

    private static void lambda$gradient$3(int n2, int n3, int n4, int n5, int n6, int n7) {
        dev.idhammai.P.A.S.o.A(H, n2, n3, n4, n5, n6, n7);
    }

    private static void lambda$drawLeftGradientRect$2(int n2, int n3, int n4, int n5, int n6, int n7) {
        dev.idhammai.P.A.S.o.A(H, n2, n3, n4, n5, n6, n7);
    }

    private static void lambda$drawPickerBase$1(int n2, int n3, int n4, int n5, float f2, float f3, float f4, float f5) {
        dev.idhammai.P.A.S.o.j(H, n2, n3, n4, n5, f2, Color.WHITE);
        dev.idhammai.P.A.S.o.G(H, n2, n3, n2 + n4, n3 + n5, Color.WHITE, new Color(f3, f4, f5));
        dev.idhammai.P.A.S.o.Q(H, n2, n3, n2 + n4, n3 + n5, new Color(0, 0, 0, 0), Color.BLACK);
    }

    private static void lambda$runAfterShader$0(Matrix4f matrix4f, int[] nArray, class_332 class_3322, Runnable runnable) {
        H.method_22903();
        H.method_23760().method_23761().set((Matrix4fc)matrix4f);
        if (nArray != null) {
            class_3322.method_44379(nArray[0], nArray[1], nArray[2], nArray[3]);
        }
        runnable.run();
        if (nArray != null) {
            class_3322.method_44380();
        }
        H.method_22909();
    }
}

