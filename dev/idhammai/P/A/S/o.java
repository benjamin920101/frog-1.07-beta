/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.client.render.BufferRenderer
 *  net.minecraft.client.render.BufferBuilder
 *  net.minecraft.client.render.Tessellator
 *  net.minecraft.client.render.VertexFormats
 *  net.minecraft.client.render.VertexFormat$DrawMode
 *  net.minecraft.util.Identifier
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.util.math.RotationAxis
 *  net.minecraft.client.render.BuiltBuffer
 *  org.joml.Matrix4f
 *  org.lwjgl.opengl.GL11
 */
package dev.idhammai.P.A.S;

import com.mojang.blaze3d.systems.RenderSystem;
import dev.idhammai.Frog;
import dev.idhammai.P.A.J;
import dev.idhammai.P.A.S.L.g;
import dev.idhammai.P.A.S.w;
import java.awt.Color;
import java.util.function.DoubleFunction;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat;
import net.minecraft.util.Identifier;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.client.render.BuiltBuffer;
import org.joml.Matrix4f;
import org.lwjgl.opengl.GL11;

public class o
implements J {
    private static g o;
    private static g M;
    private static g q;
    private static g K;

    public static void y(class_4587 class_45872, float f2, float f3, float f4, float f5, int n2) {
        dev.idhammai.P.A.S.o.k(class_45872, f2, f3, f4, f5, n2);
    }

    public static void Q(class_4587 class_45872, float f2, float f3, Color color) {
        dev.idhammai.P.A.S.o.q(class_45872, f2 - 1.0f, f3 - 1.0f, 2.0f, 2.0f, color, Color.BLACK);
    }

    public static void k(class_4587 class_45872, float f2, float f3, float f4, float f5, int n2) {
        float f6 = Math.abs(f4 - f2);
        float f7 = Math.abs(f5 - f3);
        float f8 = Math.min(f2, f4);
        float f9 = Math.min(f3, f5);
        dev.idhammai.P.A.S.o.I(class_45872, f8, f9, f6, f7, new Color(n2, true));
    }

    public static void G(class_4587 class_45872, float f2, float f3, float f4, float f5, Color color, Color color2) {
        float f6 = Math.abs(f4 - f2);
        float f7 = Math.abs(f5 - f3);
        float f8 = Math.min(f2, f4);
        float f9 = Math.min(f3, f5);
        dev.idhammai.P.A.S.o.W(class_45872, f8, f9, f6, f7, color, color2, color2, color);
    }

    public static void A(class_4587 class_45872, float f2, float f3, float f4, float f5, int n2, int n3) {
        dev.idhammai.P.A.S.o.G(class_45872, f2, f3, f4, f5, new Color(n2, true), new Color(n3, true));
    }

    public static void Q(class_4587 class_45872, float f2, float f3, float f4, float f5, Color color, Color color2) {
        float f6 = Math.abs(f4 - f2);
        float f7 = Math.abs(f5 - f3);
        float f8 = Math.min(f2, f4);
        float f9 = Math.min(f3, f5);
        dev.idhammai.P.A.S.o.W(class_45872, f8, f9, f6, f7, color, color, color2, color2);
    }

    public static void M(class_4587 class_45872, float f2, float f3, float f4, float f5, int n2, int n3) {
        dev.idhammai.P.A.S.o.Q(class_45872, f2, f3, f4, f5, new Color(n2, true), new Color(n3, true));
    }

    public static void i(class_4587 class_45872, float f2, float f3, float f4, float f5, int n2) {
        float f6 = f4 - f2;
        float f7 = f5 - f3;
        float f8 = (float)Math.sqrt(f6 * f6 + f7 * f7);
        float f9 = (float)Math.atan2(f7, f6);
        class_45872.method_22903();
        class_45872.method_46416(f2, f3, 0.0f);
        class_45872.method_22907(class_7833.field_40718.rotation(f9));
        dev.idhammai.P.A.S.o.F(class_45872, 0.0f, -0.5f, f8, 1.0f, n2);
        class_45872.method_22909();
    }

    public static void o(class_4587 class_45872, float f2, float f3, float f4, float f5, Color color, float f6, Color color2) {
        dev.idhammai.P.A.S.o.D(class_45872, f2, f3, f4, f5, color);
        int n2 = color2.getRGB();
        dev.idhammai.P.A.S.o.F(class_45872, f2, f3, f4, f6, n2);
        dev.idhammai.P.A.S.o.F(class_45872, f2, f3 + f5 - f6, f4, f6, n2);
        dev.idhammai.P.A.S.o.F(class_45872, f2, f3 + f6, f6, f5 - 2.0f * f6, n2);
        dev.idhammai.P.A.S.o.F(class_45872, f2 + f4 - f6, f3 + f6, f6, f5 - 2.0f * f6, n2);
    }

    public static void q(class_4587 class_45872, float f2, float f3, float f4, float f5, Color color, Color color2) {
        dev.idhammai.P.A.S.o.o(class_45872, f2, f3, f4, f5, color, 1.0f, color2);
    }

    public static void F(class_4587 class_45872, float f2, float f3, float f4, float f5, int n2) {
        dev.idhammai.P.A.S.o.I(class_45872, f2, f3, f4, f5, new Color(n2, true));
    }

    public static void D(class_4587 class_45872, float f2, float f3, float f4, float f5, Color color) {
        dev.idhammai.P.A.S.o.F(class_45872, f2, f3, f4, f5, color.getRGB());
    }

    public static void B(class_332 class_3322, float f2, float f3, float f4, float f5, Color color) {
        dev.idhammai.P.A.S.o.D(class_3322.method_51448(), f2, f3, f4, f5, color);
    }

    public static void l(int n2, int n3, int n4, int n5) {
        int n6 = class_310.method_1551().method_22683().method_4507();
        double d2 = class_310.method_1551().method_22683().method_4495();
        GL11.glEnable((int)3089);
        GL11.glScissor((int)((int)((double)n2 * d2)), (int)((int)((double)n6 - (double)(n3 + n5) * d2)), (int)((int)((double)n4 * d2)), (int)((int)((double)n5 * d2)));
    }

    public static void X() {
        GL11.glDisable((int)3089);
    }

    public static void n(class_4587 class_45872, float f2, float f3, float f4, float f5, float f6, DoubleFunction<Integer> doubleFunction) {
        if (f4 <= 0.0f || f5 <= 0.0f || f6 <= 0.0f) {
            return;
        }
        float f7 = f3;
        float f8 = f3 + f5;
        float f9 = Math.min(f7, f8);
        float f10 = Math.max(f7, f8);
        for (float f11 = f9; f11 < f10; f11 += f6) {
            float f12 = Math.min(f11 + f6, f10);
            int n2 = doubleFunction.apply(f11);
            dev.idhammai.P.A.S.o.F(class_45872, f2, f11, f4, f12 - f11, n2);
        }
    }

    public static void K(class_4587 class_45872, float f2, float f3, float f4, float f5, int n2) {
        if (f4 == 0.0f || f5 == 0.0f) {
            return;
        }
        float f6 = f2;
        float f7 = f2 + f4;
        float f8 = f3;
        float f9 = f3 + f5;
        float f10 = Math.min(f6, f7);
        float f11 = Math.max(f6, f7);
        float f12 = Math.min(f8, f9);
        float f13 = Math.max(f8, f9);
        int n3 = Math.max(0, Math.min(255, n2));
        if (n3 <= 0) {
            return;
        }
        int n4 = n3 << 24 | 0xFFFFFF;
        if (Frog.SHADER == null || Frog.SHADER.P()) {
            dev.idhammai.P.A.S.o.F(class_45872, f10, f12, f11 - f10, f13 - f12, n4);
            return;
        }
        Frog.SHADER.u(() -> o.lambda$drawShaderRect$0(class_45872, f10, f12, f11, f13, n4));
    }

    public static boolean n(double d2, double d3, double d4, double d5, double d6, double d7) {
        return d2 >= d4 && d2 - d6 <= d4 && d3 >= d5 && d3 - d7 <= d5;
    }

    public static void r(class_4587 class_45872, float f2, float f3, float f4, float f5, int n2) {
        if (q == null) {
            try {
                q = new g("frog:shaders/glow.fsh");
            }
            catch (Exception exception) {
                exception.printStackTrace();
                return;
            }
        }
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        RenderSystem.enableBlend();
        q.A();
        q.q("uSize", f4, f5);
        q.q("uSoftness", 20.0f);
        q.H("ModelViewMat", RenderSystem.getModelViewMatrix());
        q.H("ProjMat", RenderSystem.getProjectionMatrix());
        RenderSystem.setShaderTexture((int)0, (class_2960)class_2960.method_60655((String)"minecraft", (String)"textures/misc/white.png"));
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        class_2872.method_22918(matrix4f, f2, f3 + f5, 0.0f).method_22913(0.0f, 1.0f).method_39415(n2);
        class_2872.method_22918(matrix4f, f2 + f4, f3 + f5, 0.0f).method_22913(1.0f, 1.0f).method_39415(n2);
        class_2872.method_22918(matrix4f, f2 + f4, f3, 0.0f).method_22913(1.0f, 0.0f).method_39415(n2);
        class_2872.method_22918(matrix4f, f2, f3, 0.0f).method_22913(0.0f, 0.0f).method_39415(n2);
        class_286.method_43437((class_9801)class_2872.method_60800());
        q.f();
        RenderSystem.disableBlend();
    }

    public static void Q(class_4587 class_45872, float f2, float f3, float f4, Color color, int n2) {
        dev.idhammai.P.A.S.o.x(class_45872, f2 - f4, f3 - f4, f4 * 2.0f, f4 * 2.0f, f4, color);
    }

    public static void r(class_4587 class_45872, float f2, float f3, float f4, float f5, Color color) {
        float f6 = f5 / 2.0f;
        dev.idhammai.P.A.S.o.D(class_45872, f2 + f6, f3, f4 - 2.0f * f6, f5, color);
        dev.idhammai.P.A.S.o.Q(class_45872, f2 + f6, f3 + f6, f6, color, 64);
        dev.idhammai.P.A.S.o.Q(class_45872, f2 + f4 - f6, f3 + f6, f6, color, 64);
    }

    public static void R(class_4587 class_45872, float f2, float f3, float f4, float f5, float f6) {
        w.A();
        RenderSystem.colorMask((boolean)false, (boolean)false, (boolean)false, (boolean)false);
        dev.idhammai.P.A.S.o.j(class_45872, f2, f3, f4, f5, f6, Color.WHITE);
        RenderSystem.colorMask((boolean)true, (boolean)true, (boolean)true, (boolean)true);
        w.Y(1);
    }

    public static void T() {
        w.D();
    }

    public static void d(class_4587 class_45872, float f2, float f3, float f4, float f5, float f6, Color color, int n2) {
        dev.idhammai.P.A.S.o.J(class_45872, f2, f3, f4, f5, f6, 1.0f, color, color, color, color);
    }

    public static void V(class_4587 class_45872, float f2, float f3, float f4, float f5, float f6, int n2, float f7, int n3) {
        if (K == null) {
            try {
                K = new g("frog:shaders/rainbow_outline.fsh");
            }
            catch (Exception exception) {
                exception.printStackTrace();
                return;
            }
        }
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        RenderSystem.enableBlend();
        K.A();
        K.q("uSize", f4, f5);
        K.q("uRadius", f6);
        K.q("uStrokeWidth", 1.0f);
        K.q("uTime", (float)(System.currentTimeMillis() % 100000L) / 1000.0f);
        K.q("uSpeed", f7);
        K.q("uAlpha", (float)n3 / 255.0f);
        K.H("ModelViewMat", RenderSystem.getModelViewMatrix());
        K.H("ProjMat", RenderSystem.getProjectionMatrix());
        RenderSystem.setShaderTexture((int)0, (class_2960)class_2960.method_60655((String)"minecraft", (String)"textures/misc/white.png"));
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        class_2872.method_22918(matrix4f, f2, f3 + f5, 0.0f).method_22913(0.0f, 1.0f).method_1336(255, 255, 255, n3);
        class_2872.method_22918(matrix4f, f2 + f4, f3 + f5, 0.0f).method_22913(1.0f, 1.0f).method_1336(255, 255, 255, n3);
        class_2872.method_22918(matrix4f, f2 + f4, f3, 0.0f).method_22913(1.0f, 0.0f).method_1336(255, 255, 255, n3);
        class_2872.method_22918(matrix4f, f2, f3, 0.0f).method_22913(0.0f, 0.0f).method_1336(255, 255, 255, n3);
        class_286.method_43437((class_9801)class_2872.method_60800());
        K.f();
        RenderSystem.disableBlend();
    }

    public static void j(class_4587 class_45872, float f2, float f3, float f4, float f5, float f6, Color color) {
        dev.idhammai.P.A.S.o.x(class_45872, f2, f3, f4, f5, f6, color);
    }

    public static void t(class_4587 class_45872, float f2, float f3, float f4, float f5, float f6, Color color) {
        if (f4 <= 0.0f || f5 <= 0.0f) {
            return;
        }
        if (f6 <= 0.0f) {
            dev.idhammai.P.A.S.o.D(class_45872, f2, f3, f4, f5, color);
            return;
        }
        float f7 = Math.min(f6, Math.min(f4, f5) / 2.0f);
        int n2 = Math.max(0, Math.min(255, (int)Math.round((double)color.getRed() * 0.85)));
        int n3 = Math.max(0, Math.min(255, (int)Math.round((double)color.getGreen() * 0.85)));
        int n4 = Math.max(0, Math.min(255, (int)Math.round((double)color.getBlue() * 0.85)));
        dev.idhammai.P.A.S.o.Q(class_45872, f2 + f4 - f7, f3 + f5 / 2.0f, f7, new Color(n2, n3, n4, color.getAlpha()), 64);
        dev.idhammai.P.A.S.o.D(class_45872, f2, f3, f4 - f7, f5, color);
        if (f5 > 2.0f * f7) {
            dev.idhammai.P.A.S.o.D(class_45872, f2 + f4 - f7, f3 + f7, f7, f5 - 2.0f * f7, color);
        }
        dev.idhammai.P.A.S.o.Q(class_45872, f2 + f4 - f7, f3 + f7, f7, color, 64);
        dev.idhammai.P.A.S.o.Q(class_45872, f2 + f4 - f7, f3 + f5 - f7, f7, color, 64);
    }

    public static void h(class_4587 class_45872, float f2, float f3, float f4, float f5, float f6, int n2) {
        int n3 = Math.max(0, Math.min(255, n2));
        if (n3 <= 0) {
            return;
        }
        int n4 = n3 << 24 | 0xFFFFFF;
        Runnable runnable = () -> o.lambda$drawShaderOutline$1(class_45872, f2, f3, f4, f6, n4, f5);
        if (Frog.SHADER == null || Frog.SHADER.P()) {
            runnable.run();
            return;
        }
        Frog.SHADER.u(runnable);
    }

    public static void I(class_4587 class_45872, float f2, float f3, float f4, float f5, Color color) {
        dev.idhammai.P.A.S.o.W(class_45872, f2, f3, f4, f5, color, color, color, color);
    }

    public static void W(class_4587 class_45872, float f2, float f3, float f4, float f5, Color color, Color color2, Color color3, Color color4) {
        if (M == null) {
            try {
                M = new g("frog:shaders/rect.fsh");
            }
            catch (Exception exception) {
                exception.printStackTrace();
                return;
            }
        }
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        RenderSystem.enableBlend();
        M.A();
        M.H("ModelViewMat", RenderSystem.getModelViewMatrix());
        M.H("ProjMat", RenderSystem.getProjectionMatrix());
        RenderSystem.setShaderTexture((int)0, (class_2960)class_2960.method_60655((String)"minecraft", (String)"textures/misc/white.png"));
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        class_2872.method_22918(matrix4f, f2, f3 + f5, 0.0f).method_22913(0.0f, 1.0f).method_39415(color4.getRGB());
        class_2872.method_22918(matrix4f, f2 + f4, f3 + f5, 0.0f).method_22913(1.0f, 1.0f).method_39415(color3.getRGB());
        class_2872.method_22918(matrix4f, f2 + f4, f3, 0.0f).method_22913(1.0f, 0.0f).method_39415(color2.getRGB());
        class_2872.method_22918(matrix4f, f2, f3, 0.0f).method_22913(0.0f, 0.0f).method_39415(color.getRGB());
        class_286.method_43437((class_9801)class_2872.method_60800());
        M.f();
        RenderSystem.disableBlend();
    }

    public static void x(class_4587 class_45872, float f2, float f3, float f4, float f5, float f6, Color color) {
        dev.idhammai.P.A.S.o.J(class_45872, f2, f3, f4, f5, f6, 0.0f, color, color, color, color);
    }

    public static void z(class_4587 class_45872, float f2, float f3, float f4, float f5, float f6, Color color) {
        dev.idhammai.P.A.S.o.i(class_45872, f2, f3, f4, f5, f6, f6, 0.0f, 0.0f, 0.0f, color, color, color, color);
    }

    public static void z(class_4587 class_45872, float f2, float f3, float f4, float f5, float f6, Color color, Color color2, Color color3, Color color4) {
        dev.idhammai.P.A.S.o.J(class_45872, f2, f3, f4, f5, f6, 0.0f, color, color2, color3, color4);
    }

    public static void J(class_4587 class_45872, float f2, float f3, float f4, float f5, float f6, float f7, Color color, Color color2, Color color3, Color color4) {
        dev.idhammai.P.A.S.o.i(class_45872, f2, f3, f4, f5, f6, f6, f6, f6, f7, color, color2, color3, color4);
    }

    public static void i(class_4587 class_45872, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, Color color, Color color2, Color color3, Color color4) {
        if (o == null) {
            try {
                o = new g("frog:shaders/rounded_rect.fsh");
            }
            catch (Exception exception) {
                exception.printStackTrace();
                return;
            }
        }
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        RenderSystem.enableBlend();
        o.A();
        o.q("uSize", f4, f5);
        o.q("uRadii", f6, f7, f8, f9);
        o.q("uEdgeSoftness", 1.0f);
        o.q("uStrokeWidth", f10);
        o.H("ModelViewMat", RenderSystem.getModelViewMatrix());
        o.H("ProjMat", RenderSystem.getProjectionMatrix());
        RenderSystem.setShaderTexture((int)0, (class_2960)class_2960.method_60655((String)"minecraft", (String)"textures/misc/white.png"));
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        class_2872.method_22918(matrix4f, f2, f3 + f5, 0.0f).method_22913(0.0f, 1.0f).method_39415(color4.getRGB());
        class_2872.method_22918(matrix4f, f2 + f4, f3 + f5, 0.0f).method_22913(1.0f, 1.0f).method_39415(color3.getRGB());
        class_2872.method_22918(matrix4f, f2 + f4, f3, 0.0f).method_22913(1.0f, 0.0f).method_39415(color2.getRGB());
        class_2872.method_22918(matrix4f, f2, f3, 0.0f).method_22913(0.0f, 0.0f).method_39415(color.getRGB());
        class_286.method_43437((class_9801)class_2872.method_60800());
        o.f();
        RenderSystem.disableBlend();
    }

    public static void L(class_4587 class_45872, float f2, float f3, float f4, float f5, float f6) {
    }

    private static void lambda$drawShaderOutline$1(class_4587 class_45872, float f2, float f3, float f4, float f5, int n2, float f6) {
        dev.idhammai.P.A.S.o.F(class_45872, f2, f3, f4, f5, n2);
        dev.idhammai.P.A.S.o.F(class_45872, f2, f3 + f6 - f5, f4, f5, n2);
        dev.idhammai.P.A.S.o.F(class_45872, f2, f3 + f5, f5, f6 - 2.0f * f5, n2);
        dev.idhammai.P.A.S.o.F(class_45872, f2 + f4 - f5, f3 + f5, f5, f6 - 2.0f * f5, n2);
    }

    private static void lambda$drawShaderRect$0(class_4587 class_45872, float f2, float f3, float f4, float f5, int n2) {
        dev.idhammai.P.A.S.o.F(class_45872, f2, f3, f4 - f2, f5 - f3, n2);
    }
}

