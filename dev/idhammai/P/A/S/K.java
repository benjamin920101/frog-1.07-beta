/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_1297
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_2561
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_327$class_6415
 *  net.minecraft.class_3532
 *  net.minecraft.class_4184
 *  net.minecraft.class_4587
 *  net.minecraft.class_4587$class_4665
 *  net.minecraft.class_4588
 *  net.minecraft.class_4597
 *  net.minecraft.class_4597$class_4598
 *  net.minecraft.class_5348
 *  net.minecraft.class_757
 *  net.minecraft.class_7833
 *  net.minecraft.class_9799
 *  net.minecraft.class_9801
 *  org.jetbrains.annotations.NotNull
 *  org.joml.Matrix4f
 *  org.joml.Vector3f
 */
package dev.idhammai.P.A.S;

import com.mojang.blaze3d.systems.RenderSystem;
import dev.idhammai.Frog;
import dev.idhammai.P.A.J;
import dev.idhammai.P.A.S.f;
import java.awt.Color;
import java.util.ArrayList;
import net.minecraft.class_1297;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2561;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_327;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_5348;
import net.minecraft.class_757;
import net.minecraft.class_7833;
import net.minecraft.class_9799;
import net.minecraft.class_9801;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix4f;
import org.joml.Vector3f;

public class K
implements J {
    public static void d(class_287 class_2872) {
        class_9801 class_98012 = class_2872.method_60800();
        if (class_98012 != null) {
            class_286.method_43433((class_9801)class_98012);
        }
    }

    public static class_4587 s(double d2, double d3, double d4) {
        class_4587 class_45872 = new class_4587();
        class_4184 class_41842 = K.W.field_1773.method_19418();
        class_45872.method_22907(class_7833.field_40714.rotationDegrees(class_41842.method_19329()));
        class_45872.method_22907(class_7833.field_40716.rotationDegrees(class_41842.method_19330() + 180.0f));
        class_45872.method_22904(d2 - class_41842.method_19326().field_1352, d3 - class_41842.method_19326().field_1351, d4 - class_41842.method_19326().field_1350);
        return class_45872;
    }

    public static void x(String string, class_243 class_2432, Color color) {
        K.i(class_2561.method_30163((String)string), class_2432.field_1352, class_2432.field_1351, class_2432.field_1350, 0.0, 0.0, 1.0, color.getRGB());
    }

    public static void p(String string, class_243 class_2432, int n2) {
        K.i(class_2561.method_30163((String)string), class_2432.field_1352, class_2432.field_1351, class_2432.field_1350, 0.0, 0.0, 1.0, n2);
    }

    public static void K(class_2561 class_25612, class_243 class_2432, double d2, double d3, double d4, Color color) {
        K.i(class_25612, class_2432.field_1352, class_2432.field_1351, class_2432.field_1350, d2, d3, d4, color.getRGB());
    }

    public static void i(class_2561 class_25612, double d2, double d3, double d4, double d5, double d6, double d7, int n2) {
        RenderSystem.disableDepthTest();
        class_4587 class_45872 = K.s(d2, d3, d4);
        class_4184 class_41842 = K.W.field_1773.method_19418();
        class_45872.method_22907(class_7833.field_40716.rotationDegrees(-class_41842.method_19330()));
        class_45872.method_22907(class_7833.field_40714.rotationDegrees(class_41842.method_19329()));
        RenderSystem.enableBlend();
        class_45872.method_22904(d5, d6, 0.0);
        class_45872.method_22905(-0.025f * (float)d7, -0.025f * (float)d7, 1.0f);
        int n3 = K.W.field_1772.method_27525((class_5348)class_25612) / 2;
        class_4597.class_4598 class_45982 = class_4597.method_22991((class_9799)new class_9799(1536));
        K.W.field_1772.method_27521(class_25612.getString(), (float)(-n3), 0.0f, -1, true, class_45872.method_23760().method_23761(), (class_4597)class_45982, class_327.class_6415.field_33994, 0, 0xF000F0);
        class_45982.method_22993();
        K.W.field_1772.method_30882((class_2561)class_25612.method_27661(), (float)(-n3), 0.0f, n2, false, class_45872.method_23760().method_23761(), (class_4597)class_45982, class_327.class_6415.field_33994, 0, 0xF000F0);
        class_45982.method_22993();
        RenderSystem.disableBlend();
        RenderSystem.enableDepthTest();
    }

    public static void F(class_4587 class_45872, class_238 class_2383, Color color) {
        K.W(class_45872, class_2383, color, new Color(0, 0, 0, 0), false, true);
    }

    public static void N(class_4587 class_45872, class_238 class_2383, Color color) {
        K.W(class_45872, class_2383, new Color(0, 0, 0, 0), color, true, false);
    }

    public static void Y(class_4587 class_45872, class_238 class_2383, Color color, float f2) {
        K.z(class_45872, class_2383, new Color(0, 0, 0, 0), color, true, false, f2);
    }

    public static void n(class_4587 class_45872, class_238 class_2383, Color color, Color color2) {
        K.W(class_45872, class_2383, color, color2, true, true);
    }

    public static void W(class_4587 class_45872, class_238 class_2383, Color color, Color color2, boolean bl, boolean bl2) {
        K.z(class_45872, class_2383, color, color2, bl, bl2, 1.5f);
    }

    public static void z(class_4587 class_45872, class_238 class_2383, Color color, Color color2, boolean bl, boolean bl2, float f2) {
        class_287 class_2872;
        float f3;
        float f4;
        float f5;
        float f6;
        class_2383 = class_2383.method_997(K.W.field_1773.method_19418().method_19326().method_22882());
        RenderSystem.enableBlend();
        RenderSystem.disableDepthTest();
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        if (bl) {
            f6 = (float)color2.getAlpha() / 255.0f;
            f5 = (float)color2.getRed() / 255.0f;
            f4 = (float)color2.getGreen() / 255.0f;
            f3 = (float)color2.getBlue() / 255.0f;
            RenderSystem.setShader(class_757::method_34540);
            RenderSystem.lineWidth((float)f2);
            class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_29344, class_290.field_1576);
            class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1322, (float)class_2383.field_1321).method_22915(f5, f4, f3, f6);
            class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1322, (float)class_2383.field_1321).method_22915(f5, f4, f3, f6);
            class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1322, (float)class_2383.field_1321).method_22915(f5, f4, f3, f6);
            class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1322, (float)class_2383.field_1324).method_22915(f5, f4, f3, f6);
            class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1322, (float)class_2383.field_1324).method_22915(f5, f4, f3, f6);
            class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1322, (float)class_2383.field_1324).method_22915(f5, f4, f3, f6);
            class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1322, (float)class_2383.field_1324).method_22915(f5, f4, f3, f6);
            class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1322, (float)class_2383.field_1321).method_22915(f5, f4, f3, f6);
            class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1322, (float)class_2383.field_1321).method_22915(f5, f4, f3, f6);
            class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1325, (float)class_2383.field_1321).method_22915(f5, f4, f3, f6);
            class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1322, (float)class_2383.field_1321).method_22915(f5, f4, f3, f6);
            class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1325, (float)class_2383.field_1321).method_22915(f5, f4, f3, f6);
            class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1322, (float)class_2383.field_1324).method_22915(f5, f4, f3, f6);
            class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1325, (float)class_2383.field_1324).method_22915(f5, f4, f3, f6);
            class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1322, (float)class_2383.field_1324).method_22915(f5, f4, f3, f6);
            class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1325, (float)class_2383.field_1324).method_22915(f5, f4, f3, f6);
            class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1325, (float)class_2383.field_1321).method_22915(f5, f4, f3, f6);
            class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1325, (float)class_2383.field_1321).method_22915(f5, f4, f3, f6);
            class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1325, (float)class_2383.field_1321).method_22915(f5, f4, f3, f6);
            class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1325, (float)class_2383.field_1324).method_22915(f5, f4, f3, f6);
            class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1325, (float)class_2383.field_1324).method_22915(f5, f4, f3, f6);
            class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1325, (float)class_2383.field_1324).method_22915(f5, f4, f3, f6);
            class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1325, (float)class_2383.field_1324).method_22915(f5, f4, f3, f6);
            class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1325, (float)class_2383.field_1321).method_22915(f5, f4, f3, f6);
            class_286.method_43433((class_9801)class_2872.method_60800());
        }
        if (bl2) {
            f6 = (float)color.getAlpha() / 255.0f;
            f5 = (float)color.getRed() / 255.0f;
            f4 = (float)color.getGreen() / 255.0f;
            f3 = (float)color.getBlue() / 255.0f;
            RenderSystem.setShader(class_757::method_34540);
            class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1576);
            class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1322, (float)class_2383.field_1321).method_22915(f5, f4, f3, f6);
            class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1322, (float)class_2383.field_1321).method_22915(f5, f4, f3, f6);
            class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1322, (float)class_2383.field_1324).method_22915(f5, f4, f3, f6);
            class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1322, (float)class_2383.field_1324).method_22915(f5, f4, f3, f6);
            class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1325, (float)class_2383.field_1321).method_22915(f5, f4, f3, f6);
            class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1325, (float)class_2383.field_1324).method_22915(f5, f4, f3, f6);
            class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1325, (float)class_2383.field_1324).method_22915(f5, f4, f3, f6);
            class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1325, (float)class_2383.field_1321).method_22915(f5, f4, f3, f6);
            class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1322, (float)class_2383.field_1321).method_22915(f5, f4, f3, f6);
            class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1325, (float)class_2383.field_1321).method_22915(f5, f4, f3, f6);
            class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1325, (float)class_2383.field_1321).method_22915(f5, f4, f3, f6);
            class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1322, (float)class_2383.field_1321).method_22915(f5, f4, f3, f6);
            class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1322, (float)class_2383.field_1321).method_22915(f5, f4, f3, f6);
            class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1325, (float)class_2383.field_1321).method_22915(f5, f4, f3, f6);
            class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1325, (float)class_2383.field_1324).method_22915(f5, f4, f3, f6);
            class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1322, (float)class_2383.field_1324).method_22915(f5, f4, f3, f6);
            class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1322, (float)class_2383.field_1324).method_22915(f5, f4, f3, f6);
            class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1322, (float)class_2383.field_1324).method_22915(f5, f4, f3, f6);
            class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1325, (float)class_2383.field_1324).method_22915(f5, f4, f3, f6);
            class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1325, (float)class_2383.field_1324).method_22915(f5, f4, f3, f6);
            class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1322, (float)class_2383.field_1321).method_22915(f5, f4, f3, f6);
            class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1322, (float)class_2383.field_1324).method_22915(f5, f4, f3, f6);
            class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1325, (float)class_2383.field_1324).method_22915(f5, f4, f3, f6);
            class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1325, (float)class_2383.field_1321).method_22915(f5, f4, f3, f6);
            class_286.method_43433((class_9801)class_2872.method_60800());
        }
        RenderSystem.enableDepthTest();
        RenderSystem.disableBlend();
    }

    public static void u(class_4587 class_45872, class_238 class_2383, Color color, Color color2) {
        RenderSystem.enableBlend();
        RenderSystem.disableDepthTest();
        RenderSystem.disableCull();
        RenderSystem.setShader(class_757::method_34540);
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1576);
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        float f2 = (float)(class_2383.field_1323 - K.W.method_1561().field_4686.method_19326().method_10216());
        float f3 = (float)(class_2383.field_1322 - K.W.method_1561().field_4686.method_19326().method_10214());
        float f4 = (float)(class_2383.field_1321 - K.W.method_1561().field_4686.method_19326().method_10215());
        float f5 = (float)(class_2383.field_1320 - K.W.method_1561().field_4686.method_19326().method_10216());
        float f6 = (float)(class_2383.field_1325 - K.W.method_1561().field_4686.method_19326().method_10214());
        float f7 = (float)(class_2383.field_1324 - K.W.method_1561().field_4686.method_19326().method_10215());
        class_2872.method_22918(matrix4f, f2, f3, f4).method_39415(color.getRGB());
        class_2872.method_22918(matrix4f, f5, f3, f4).method_39415(color.getRGB());
        class_2872.method_22918(matrix4f, f5, f3, f7).method_39415(color.getRGB());
        class_2872.method_22918(matrix4f, f2, f3, f7).method_39415(color.getRGB());
        class_2872.method_22918(matrix4f, f2, f3, f4).method_39415(color.getRGB());
        class_2872.method_22918(matrix4f, f2, f6, f4).method_39415(color2.getRGB());
        class_2872.method_22918(matrix4f, f5, f6, f4).method_39415(color2.getRGB());
        class_2872.method_22918(matrix4f, f5, f3, f4).method_39415(color.getRGB());
        class_2872.method_22918(matrix4f, f5, f3, f4).method_39415(color.getRGB());
        class_2872.method_22918(matrix4f, f5, f6, f4).method_39415(color2.getRGB());
        class_2872.method_22918(matrix4f, f5, f6, f7).method_39415(color2.getRGB());
        class_2872.method_22918(matrix4f, f5, f3, f7).method_39415(color.getRGB());
        class_2872.method_22918(matrix4f, f2, f3, f7).method_39415(color.getRGB());
        class_2872.method_22918(matrix4f, f5, f3, f7).method_39415(color.getRGB());
        class_2872.method_22918(matrix4f, f5, f6, f7).method_39415(color2.getRGB());
        class_2872.method_22918(matrix4f, f2, f6, f7).method_39415(color2.getRGB());
        class_2872.method_22918(matrix4f, f2, f3, f4).method_39415(color.getRGB());
        class_2872.method_22918(matrix4f, f2, f3, f7).method_39415(color.getRGB());
        class_2872.method_22918(matrix4f, f2, f6, f7).method_39415(color2.getRGB());
        class_2872.method_22918(matrix4f, f2, f6, f4).method_39415(color2.getRGB());
        class_2872.method_22918(matrix4f, f2, f6, f4).method_39415(color2.getRGB());
        class_2872.method_22918(matrix4f, f2, f6, f7).method_39415(color2.getRGB());
        class_2872.method_22918(matrix4f, f5, f6, f7).method_39415(color2.getRGB());
        class_2872.method_22918(matrix4f, f5, f6, f4).method_39415(color2.getRGB());
        class_286.method_43433((class_9801)class_2872.method_60800());
        RenderSystem.enableDepthTest();
        RenderSystem.enableCull();
        RenderSystem.disableBlend();
    }

    public static void I(class_243 class_2432, class_243 class_2433, Color color) {
        K.G(class_2432.field_1352, class_2432.method_10214(), class_2432.field_1350, class_2433.method_10216(), class_2433.method_10214(), class_2433.method_10215(), color, 1.0f);
    }

    public static void G(double d2, double d3, double d4, double d5, double d6, double d7, Color color, float f2) {
        RenderSystem.enableBlend();
        class_4587 class_45872 = K.s(d2, d3, d4);
        RenderSystem.disableCull();
        RenderSystem.setShader(class_757::method_34535);
        RenderSystem.lineWidth((float)f2);
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27377, class_290.field_29337);
        K.v(class_45872, (class_4588)class_2872, 0.0, 0.0, 0.0, (float)(d5 - d2), (float)(d6 - d3), (float)(d7 - d4), color);
        class_286.method_43433((class_9801)class_2872.method_60800());
        RenderSystem.enableCull();
        RenderSystem.lineWidth((float)1.0f);
        RenderSystem.disableBlend();
    }

    public static void v(class_4587 class_45872, class_4588 class_45882, double d2, double d3, double d4, double d5, double d6, double d7, Color color) {
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        class_4587.class_4665 class_46652 = class_45872.method_23760();
        Vector3f vector3f = K.c((float)d2, (float)d3, (float)d4, (float)d5, (float)d6, (float)d7);
        class_45882.method_22918(matrix4f, (float)d2, (float)d3, (float)d4).method_1336(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).method_60831(class_46652, vector3f.x(), vector3f.y(), vector3f.z());
        class_45882.method_22918(matrix4f, (float)d5, (float)d6, (float)d7).method_1336(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).method_60831(class_46652, vector3f.x(), vector3f.y(), vector3f.z());
    }

    public static Vector3f c(float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = f5 - f2;
        float f9 = f6 - f3;
        float f10 = f7 - f4;
        float f11 = class_3532.method_15355((float)(f8 * f8 + f9 * f9 + f10 * f10));
        return new Vector3f(f8 / f11, f9 / f11, f10 / f11);
    }

    public static void t(class_4587 class_45872, @NotNull class_1297 class_12972, Color color) {
        float f2;
        int n2;
        ArrayList<class_243> arrayList = new ArrayList<class_243>();
        ArrayList<class_243> arrayList2 = new ArrayList<class_243>();
        ArrayList<class_243> arrayList3 = new ArrayList<class_243>();
        double d2 = class_12972.field_6014 + (class_12972.method_23317() - class_12972.field_6014) * (double)K.n() - K.W.method_1561().field_4686.method_19326().method_10216();
        double d3 = class_12972.field_6036 + (class_12972.method_23318() - class_12972.field_6036) * (double)K.n() - K.W.method_1561().field_4686.method_19326().method_10214();
        double d4 = class_12972.field_5969 + (class_12972.method_23321() - class_12972.field_5969) * (double)K.n() - K.W.method_1561().field_4686.method_19326().method_10215();
        double d5 = class_12972.method_17682();
        for (int i2 = 0; i2 <= 361; ++i2) {
            double d6 = Math.sin(Math.toRadians(i2));
            double d7 = Math.cos(Math.toRadians(i2));
            class_243 class_2432 = new class_243((double)((float)(d7 * 0.5)), d5, (double)((float)(d6 * 0.5)));
            arrayList.add(class_2432);
            double d8 = Math.sin(Math.toRadians((i2 + 120) % 360));
            double d9 = Math.cos(Math.toRadians(i2 + 120) % 360.0);
            class_243 class_2433 = new class_243((double)((float)(d9 * 0.5)), d5, (double)((float)(d8 * 0.5)));
            arrayList2.add(class_2433);
            double d10 = Math.sin(Math.toRadians((i2 + 240) % 360));
            double d11 = Math.cos(Math.toRadians((i2 + 240) % 360));
            class_243 class_2434 = new class_243((double)((float)(d11 * 0.5)), d5, (double)((float)(d10 * 0.5)));
            arrayList3.add(class_2434);
            d5 -= (double)0.004f;
        }
        class_45872.method_22903();
        class_45872.method_22904(d2, d3, d4);
        RenderSystem.enableBlend();
        RenderSystem.disableCull();
        RenderSystem.disableDepthTest();
        RenderSystem.setShader(class_757::method_34540);
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27380, class_290.field_1576);
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        for (n2 = 0; n2 < arrayList.size() - 1; ++n2) {
            f2 = 1.0f - ((float)n2 + (float)(System.currentTimeMillis() - Frog.initTime) / 5.0f) % 360.0f / 60.0f;
            class_2872.method_22918(matrix4f, (float)((class_243)arrayList.get((int)n2)).field_1352, (float)((class_243)arrayList.get((int)n2)).field_1351, (float)((class_243)arrayList.get((int)n2)).field_1350).method_39415(f.y(f.x(color, (int)((float)n2 / 20.0f), 10, 1.0), (int)(f2 * 255.0f)).getRGB());
            class_2872.method_22918(matrix4f, (float)((class_243)arrayList.get((int)(n2 + 1))).field_1352, (float)((class_243)arrayList.get((int)(n2 + 1))).field_1351 + 0.1f, (float)((class_243)arrayList.get((int)(n2 + 1))).field_1350).method_39415(f.y(f.x(color, (int)((float)n2 / 20.0f), 10, 1.0), (int)(f2 * 255.0f)).getRGB());
        }
        K.d(class_2872);
        RenderSystem.setShader(class_757::method_34540);
        class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27380, class_290.field_1576);
        for (n2 = 0; n2 < arrayList2.size() - 1; ++n2) {
            f2 = 1.0f - ((float)n2 + (float)(System.currentTimeMillis() - Frog.initTime) / 5.0f) % 360.0f / 60.0f;
            class_2872.method_22918(matrix4f, (float)((class_243)arrayList2.get((int)n2)).field_1352, (float)((class_243)arrayList2.get((int)n2)).field_1351, (float)((class_243)arrayList2.get((int)n2)).field_1350).method_39415(f.y(f.x(color, (int)((float)n2 / 20.0f), 10, 1.0), (int)(f2 * 255.0f)).getRGB());
            class_2872.method_22918(matrix4f, (float)((class_243)arrayList2.get((int)(n2 + 1))).field_1352, (float)((class_243)arrayList2.get((int)(n2 + 1))).field_1351 + 0.1f, (float)((class_243)arrayList2.get((int)(n2 + 1))).field_1350).method_39415(f.y(f.x(color, (int)((float)n2 / 20.0f), 10, 1.0), (int)(f2 * 255.0f)).getRGB());
        }
        K.d(class_2872);
        RenderSystem.setShader(class_757::method_34540);
        class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27380, class_290.field_1576);
        for (n2 = 0; n2 < arrayList3.size() - 1; ++n2) {
            f2 = 1.0f - ((float)n2 + (float)(System.currentTimeMillis() - Frog.initTime) / 5.0f) % 360.0f / 60.0f;
            class_2872.method_22918(matrix4f, (float)((class_243)arrayList3.get((int)n2)).field_1352, (float)((class_243)arrayList3.get((int)n2)).field_1351, (float)((class_243)arrayList3.get((int)n2)).field_1350).method_39415(f.y(f.x(color, (int)((float)n2 / 20.0f), 10, 1.0), (int)(f2 * 255.0f)).getRGB());
            class_2872.method_22918(matrix4f, (float)((class_243)arrayList3.get((int)(n2 + 1))).field_1352, (float)((class_243)arrayList3.get((int)(n2 + 1))).field_1351 + 0.1f, (float)((class_243)arrayList3.get((int)(n2 + 1))).field_1350).method_39415(f.y(f.x(color, (int)((float)n2 / 20.0f), 10, 1.0), (int)(f2 * 255.0f)).getRGB());
        }
        K.d(class_2872);
        RenderSystem.enableCull();
        class_45872.method_22904(-d2, -d3, -d4);
        RenderSystem.disableBlend();
        RenderSystem.enableDepthTest();
        class_45872.method_22909();
    }

    public static float n() {
        return W.method_60646().method_60637(true);
    }
}

