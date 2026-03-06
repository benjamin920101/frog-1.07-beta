/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.render.Camera
 *  net.minecraft.client.util.math.MatrixStack
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Vector3f
 *  org.joml.Vector4f
 *  org.lwjgl.opengl.GL11
 */
package dev.idhammai.P.A.S;

import dev.idhammai.Frog;
import dev.idhammai.P.A.J;
import dev.idhammai.P.A.S.f;
import dev.idhammai.c.r.q.N.P;
import dev.idhammai.c.r.q.N.S;
import dev.idhammai.c.y.y.i;
import java.awt.Color;
import java.util.Objects;
import net.minecraft.util.math.Vec3d;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.Camera;
import net.minecraft.client.util.math.MatrixStack;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.lwjgl.opengl.GL11;

public class n
implements J {
    public static final Matrix4f g = new Matrix4f();
    public static final Matrix4f F = new Matrix4f();
    public static final Matrix4f Y = new Matrix4f();

    public static float H(String string) {
        return n.W.field_1772.method_1727(string);
    }

    public static float Y() {
        Objects.requireNonNull(n.W.field_1772);
        return 9.0f;
    }

    public static void F(class_332 class_3322, String string, float f2, float f3, int n2, float f4) {
        if (n.i()) {
            int[] nArray = Frog.SHADER.h();
            Frog.SHADER.Q(() -> n.lambda$drawStringWithScale$0(class_3322, nArray, f4, f2, f3, string, n2));
            return;
        }
        class_4587 class_45872 = class_3322.method_51448();
        if (f4 != 1.0f) {
            class_45872.method_22903();
            class_45872.method_22905(f4, f4, 1.0f);
            if (f4 > 1.0f) {
                class_45872.method_46416(-f2 / f4, -f3 / f4, 0.0f);
            } else {
                class_45872.method_46416(f2 / f4 / 2.0f, f3 / f4 / 2.0f, 0.0f);
            }
        }
        n.M(class_3322, string, f2, f3, n2, false, true);
        class_45872.method_22909();
    }

    public static void k(class_332 class_3322, String string, float f2, float f3, int n2, float f4, boolean bl) {
        if (n.i()) {
            int[] nArray = Frog.SHADER.h();
            Frog.SHADER.Q(() -> n.lambda$drawStringScale$1(class_3322, nArray, f4, f2, f3, string, n2, bl));
            return;
        }
        class_4587 class_45872 = class_3322.method_51448();
        if (f4 != 1.0f) {
            class_45872.method_22903();
            class_45872.method_22905(f4, f4, 1.0f);
            if (f4 > 1.0f) {
                class_45872.method_46416(-f2 / f4, -f3 / f4, 0.0f);
            } else {
                class_45872.method_46416(f2 / f4 / 2.0f, f3 / f4 / 2.0f, 0.0f);
            }
        }
        class_3322.method_51433(n.W.field_1772, string, (int)f2, (int)f3, n2, bl);
        class_45872.method_22909();
    }

    public static void K(class_332 class_3322, String string, double d2, double d3, int n2) {
        n.i(class_3322, string, d2, d3, n2, false);
    }

    public static void i(class_332 class_3322, String string, double d2, double d3, int n2, boolean bl) {
        n.h(class_3322, string, d2, d3, n2, bl, true);
    }

    public static void t(class_332 class_3322, String string, double d2, double d3, int n2, boolean bl, boolean bl2) {
        if (bl) {
            dev.idhammai.p.J.n.w.z(class_3322.method_51448(), string, (int)d2, (int)d3, n2, bl2, true);
        } else {
            class_3322.method_51433(n.W.field_1772, string, (int)d2, (int)d3, n2, bl2);
        }
    }

    public static void h(class_332 class_3322, String string, double d2, double d3, int n2, boolean bl, boolean bl2) {
        if (n.i()) {
            int[] nArray = Frog.SHADER.h();
            Matrix4f matrix4f = new Matrix4f((Matrix4fc)class_3322.method_51448().method_23760().method_23761());
            Frog.SHADER.Q(() -> n.lambda$drawString$2(class_3322, matrix4f, nArray, string, d2, d3, n2, bl, bl2));
            return;
        }
        n.M(class_3322, string, d2, d3, n2, bl, bl2);
    }

    private static void M(class_332 class_3322, String string, double d2, double d3, int n2, boolean bl, boolean bl2) {
        if (bl) {
            dev.idhammai.p.J.n.w.H(class_3322.method_51448(), string, (int)d2, (int)d3, n2, bl2);
        } else {
            class_3322.method_51433(n.W.field_1772, string, (int)d2, (int)d3, n2, bl2);
        }
    }

    public static void R(class_332 class_3322, i i2, String string, double d2, double d3, int n2, boolean bl) {
        if (n.i()) {
            int[] nArray = Frog.SHADER.h();
            Matrix4f matrix4f = new Matrix4f((Matrix4fc)class_3322.method_51448().method_23760().method_23761());
            Frog.SHADER.Q(() -> n.lambda$drawString$3(class_3322, matrix4f, nArray, i2, string, d2, d3, n2, bl));
            return;
        }
        n.Y(class_3322, i2, string, d2, d3, n2, bl);
    }

    private static void Y(class_332 class_3322, i i2, String string, double d2, double d3, int n2, boolean bl) {
        if (i2 != null) {
            i2.H(class_3322.method_51448(), string, (int)d2, (int)d3, n2, bl);
        } else {
            class_3322.method_51433(n.W.field_1772, string, (int)d2, (int)d3, n2, bl);
        }
    }

    private static boolean i() {
        P p2 = P.M();
        return p2 != null && p2.pM.X() == S.Shader && Frog.SHADER != null && Frog.SHADER.s();
    }

    public static void k(class_332 class_3322, String string, double d2, double d3, Color color, Color color2, double d4, int n2, boolean bl) {
        char[] cArray = string.toCharArray();
        int n3 = 0;
        boolean bl2 = false;
        String string2 = null;
        for (char c2 : cArray) {
            if (c2 == '\u00a7') {
                bl2 = true;
                continue;
            }
            if (bl2) {
                string2 = c2 == 'r' ? null : "\u00a7" + c2;
                bl2 = false;
                continue;
            }
            ++n3;
            if (string2 != null) {
                n.i(class_3322, string2 + c2, d2, d3, color.getRGB(), bl);
            } else {
                n.i(class_3322, String.valueOf(c2), d2, d3, f.N(color, color2, n3, n2, d4).getRGB(), bl);
            }
            d2 += bl ? (double)dev.idhammai.p.J.n.w.b(String.valueOf(c2)) : (double)n.W.field_1772.method_1727(String.valueOf(c2));
        }
    }

    public static void K(class_332 class_3322, String string, double d2, double d3, Color color, Color color2, double d4, int n2, boolean bl, boolean bl2) {
        char[] cArray = string.toCharArray();
        int n3 = 0;
        boolean bl3 = false;
        String string2 = null;
        for (char c2 : cArray) {
            if (c2 == '\u00a7') {
                bl3 = true;
                continue;
            }
            if (bl3) {
                string2 = c2 == 'r' ? null : "\u00a7" + c2;
                bl3 = false;
                continue;
            }
            ++n3;
            if (string2 != null) {
                n.h(class_3322, string2 + c2, d2, d3, color.getRGB(), bl, bl2);
            } else {
                n.h(class_3322, String.valueOf(c2), d2, d3, f.N(color, color2, n3, n2, d4).getRGB(), bl, bl2);
            }
            d2 += bl ? (double)dev.idhammai.p.J.n.w.b(String.valueOf(c2)) : (double)n.W.field_1772.method_1727(String.valueOf(c2));
        }
    }

    public static class_243 i(class_243 class_2432) {
        class_4184 class_41842 = n.W.method_1561().field_4686;
        int n2 = W.method_22683().method_4507();
        int[] nArray = new int[4];
        GL11.glGetIntegerv((int)2978, (int[])nArray);
        Vector3f vector3f = new Vector3f();
        double d2 = class_2432.field_1352 - class_41842.method_19326().field_1352;
        double d3 = class_2432.field_1351 - class_41842.method_19326().field_1351;
        double d4 = class_2432.field_1350 - class_41842.method_19326().field_1350;
        Vector4f vector4f = new Vector4f((float)d2, (float)d3, (float)d4, 1.0f).mul((Matrix4fc)Y);
        Matrix4f matrix4f = new Matrix4f((Matrix4fc)g);
        Matrix4f matrix4f2 = new Matrix4f((Matrix4fc)F);
        matrix4f.mul((Matrix4fc)matrix4f2).project(vector4f.x(), vector4f.y(), vector4f.z(), nArray, vector3f);
        return new class_243((double)vector3f.x / W.method_22683().method_4495(), (double)((float)n2 - vector3f.y) / W.method_22683().method_4495(), (double)vector3f.z);
    }

    private static void lambda$drawString$3(class_332 class_3322, Matrix4f matrix4f, int[] nArray, i i2, String string, double d2, double d3, int n2, boolean bl) {
        class_3322.method_51448().method_22903();
        class_3322.method_51448().method_23760().method_23761().set((Matrix4fc)matrix4f);
        if (nArray != null) {
            class_3322.method_44379(nArray[0], nArray[1], nArray[2], nArray[3]);
        }
        n.Y(class_3322, i2, string, d2, d3, n2, bl);
        if (nArray != null) {
            class_3322.method_44380();
        }
        class_3322.method_51448().method_22909();
    }

    private static void lambda$drawString$2(class_332 class_3322, Matrix4f matrix4f, int[] nArray, String string, double d2, double d3, int n2, boolean bl, boolean bl2) {
        class_3322.method_51448().method_22903();
        class_3322.method_51448().method_23760().method_23761().set((Matrix4fc)matrix4f);
        if (nArray != null) {
            class_3322.method_44379(nArray[0], nArray[1], nArray[2], nArray[3]);
        }
        n.M(class_3322, string, d2, d3, n2, bl, bl2);
        if (nArray != null) {
            class_3322.method_44380();
        }
        class_3322.method_51448().method_22909();
    }

    private static void lambda$drawStringScale$1(class_332 class_3322, int[] nArray, float f2, float f3, float f4, String string, int n2, boolean bl) {
        class_4587 class_45872 = class_3322.method_51448();
        if (nArray != null) {
            class_3322.method_44379(nArray[0], nArray[1], nArray[2], nArray[3]);
        }
        if (f2 != 1.0f) {
            class_45872.method_22903();
            class_45872.method_22905(f2, f2, 1.0f);
            if (f2 > 1.0f) {
                class_45872.method_46416(-f3 / f2, -f4 / f2, 0.0f);
            } else {
                class_45872.method_46416(f3 / f2 / 2.0f, f4 / f2 / 2.0f, 0.0f);
            }
        }
        class_3322.method_51433(n.W.field_1772, string, (int)f3, (int)f4, n2, bl);
        class_45872.method_22909();
        if (nArray != null) {
            class_3322.method_44380();
        }
    }

    private static void lambda$drawStringWithScale$0(class_332 class_3322, int[] nArray, float f2, float f3, float f4, String string, int n2) {
        class_4587 class_45872 = class_3322.method_51448();
        if (nArray != null) {
            class_3322.method_44379(nArray[0], nArray[1], nArray[2], nArray[3]);
        }
        if (f2 != 1.0f) {
            class_45872.method_22903();
            class_45872.method_22905(f2, f2, 1.0f);
            if (f2 > 1.0f) {
                class_45872.method_46416(-f3 / f2, -f4 / f2, 0.0f);
            } else {
                class_45872.method_46416(f3 / f2 / 2.0f, f4 / f2 / 2.0f, 0.0f);
            }
        }
        n.M(class_3322, string, f3, f4, n2, false, true);
        class_45872.method_22909();
        if (nArray != null) {
            class_3322.method_44380();
        }
    }
}

