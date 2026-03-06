/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_1297
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_4587
 *  net.minecraft.class_757
 *  net.minecraft.class_9801
 */
package dev.idhammai.P.A.S;

import com.mojang.blaze3d.systems.RenderSystem;
import dev.idhammai.P.A.J;
import dev.idhammai.P.A.S.f;
import java.awt.Color;
import net.minecraft.class_1297;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_4587;
import net.minecraft.class_757;
import net.minecraft.class_9801;

public class k
implements J {
    private static float B;
    private static float A;

    public static void Z(class_4587 class_45872, class_1297 class_12972, Color color) {
        double d2 = B + (A - B) * W.method_60646().method_60637(true);
        double d3 = k.N(d2 - (double)0.45f);
        double d4 = k.N(d2);
        double d5 = class_12972.field_6014 + (class_12972.method_23317() - class_12972.field_6014) * (double)W.method_60646().method_60637(true) - k.W.method_1561().field_4686.method_19326().method_10216();
        double d6 = class_12972.field_6036 + (class_12972.method_23318() - class_12972.field_6036) * (double)W.method_60646().method_60637(true) - k.W.method_1561().field_4686.method_19326().method_10214() + d3 * (double)class_12972.method_17682();
        double d7 = class_12972.field_5969 + (class_12972.method_23321() - class_12972.field_5969) * (double)W.method_60646().method_60637(true) - k.W.method_1561().field_4686.method_19326().method_10215();
        double d8 = class_12972.field_6036 + (class_12972.method_23318() - class_12972.field_6036) * (double)W.method_60646().method_60637(true) - k.W.method_1561().field_4686.method_19326().method_10214() + d4 * (double)class_12972.method_17682();
        class_45872.method_22903();
        RenderSystem.enableBlend();
        RenderSystem.disableCull();
        RenderSystem.disableDepthTest();
        class_289 class_2892 = class_289.method_1348();
        class_287 class_2872 = class_2892.method_60827(class_293.class_5596.field_27380, class_290.field_1576);
        RenderSystem.setShader(class_757::method_34540);
        for (int i2 = 0; i2 <= 30; ++i2) {
            float f2 = (float)(d5 + Math.cos((double)i2 * 6.28 / 30.0) * (class_12972.method_5829().field_1320 - class_12972.method_5829().field_1323 + (class_12972.method_5829().field_1324 - class_12972.method_5829().field_1321)) * 0.5);
            float f3 = (float)(d7 + Math.sin((double)i2 * 6.28 / 30.0) * (class_12972.method_5829().field_1320 - class_12972.method_5829().field_1323 + (class_12972.method_5829().field_1324 - class_12972.method_5829().field_1321)) * 0.5);
            class_2872.method_22918(class_45872.method_23760().method_23761(), f2, (float)d8, f3).method_39415(color.getRGB());
            class_2872.method_22918(class_45872.method_23760().method_23761(), f2, (float)d6, f3).method_39415(f.y(color, 0).getRGB());
        }
        class_286.method_43433((class_9801)class_2872.method_60800());
        RenderSystem.enableCull();
        RenderSystem.disableBlend();
        RenderSystem.enableDepthTest();
        class_45872.method_22909();
    }

    public static void J() {
        B = A;
        A += 0.15f;
    }

    private static double N(double d2) {
        return Math.abs(1.0 + Math.sin(d2)) / 2.0;
    }
}

