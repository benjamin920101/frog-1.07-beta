/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_243
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_3532
 *  net.minecraft.class_4587
 *  net.minecraft.class_5602
 *  net.minecraft.class_5617$class_5618
 *  net.minecraft.class_591
 *  net.minecraft.class_630
 *  net.minecraft.class_630$class_593
 *  net.minecraft.class_630$class_628
 *  net.minecraft.class_757
 *  net.minecraft.class_7833
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Vector3f
 *  org.joml.Vector4f
 */
package dev.idhammai.P.A.S;

import com.mojang.blaze3d.systems.RenderSystem;
import dev.idhammai.P.A.J;
import dev.idhammai.P.A.S.K;
import dev.idhammai.asm.accessors.ILivingEntity;
import dev.idhammai.asm.accessors.IModelPart;
import dev.idhammai.asm.accessors.IModelPartCuboid;
import dev.idhammai.asm.accessors.IPlayerEntityModel;
import dev.idhammai.c.r.O.Y.A;
import java.awt.Color;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_5602;
import net.minecraft.class_5617;
import net.minecraft.class_591;
import net.minecraft.class_630;
import net.minecraft.class_757;
import net.minecraft.class_7833;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector3f;
import org.joml.Vector4f;

public class Z
extends class_591<class_1657> {
    public final class_1657 P;
    private static final Vector4f z = new Vector4f();
    private static final Vector4f j = new Vector4f();
    private static final Vector4f v = new Vector4f();
    private static final Vector4f k = new Vector4f();

    public Z(class_1657 class_16572) {
        super(new class_5617.class_5618(J.W.method_1561(), J.W.method_1480(), J.W.method_1541(), J.W.method_1561().method_43336(), J.W.method_1478(), J.W.method_31974(), J.W.field_1772).method_32167(class_5602.field_27577), false);
        this.P = class_16572;
        ((IPlayerEntityModel)((Object)this)).getLeftPants().field_3665 = false;
        ((IPlayerEntityModel)((Object)this)).getRightPants().field_3665 = false;
        ((IPlayerEntityModel)((Object)this)).getLeftSleeve().field_3665 = false;
        ((IPlayerEntityModel)((Object)this)).getRightSleeve().field_3665 = false;
        ((IPlayerEntityModel)((Object)this)).getJacket().field_3665 = false;
        this.field_3394.field_3665 = false;
        this.method_2838().method_41924(new Vector3f(-0.05f, -0.05f, -0.05f));
        this.field_3400 = class_16572.method_18276();
    }

    public void f(class_4587 class_45872, A a2, A a3) {
        this.Q(class_45872, a2, a3, 1.0, 0.0, 1.0, 0.0, false, false);
    }

    public void Q(class_4587 class_45872, A a2, A a3, double d2, double d3, double d4, double d5, boolean bl, boolean bl2) {
        if (bl2) {
            this.field_3400 = true;
        }
        double d6 = this.P.method_23317() - J.W.method_1561().field_4686.method_19326().method_10216();
        double d7 = this.P.method_23318() - J.W.method_1561().field_4686.method_19326().method_10214() + d3;
        double d8 = this.P.method_23321() - J.W.method_1561().field_4686.method_19326().method_10215();
        class_45872.method_22903();
        class_45872.method_46416((float)d6, (float)d7, (float)d8);
        class_45872.method_22907(class_7833.field_40716.rotation(dev.idhammai.P.A.A.A.Y(180.0f - this.P.field_6283 + (float)d5)));
        this.field_3447 = this.P.method_6055(1.0f);
        float f2 = ((ILivingEntity)this.P).getLeaningPitch();
        if (this.P.method_6128()) {
            float f3 = this.P.method_36455();
            float f4 = (float)this.P.method_6003() + this.P.field_6283 + (float)d5;
            float f5 = class_3532.method_15363((float)(f4 * f4 / 100.0f), (float)0.0f, (float)1.0f);
            if (!this.P.method_6123()) {
                class_45872.method_22907(class_7833.field_40714.rotationDegrees(f5 * (-90.0f - f3)));
            }
            class_243 class_2432 = this.P.method_5828(1.0f);
            class_243 class_2433 = this.P.method_18798();
            double d9 = class_2433.method_37268();
            double d10 = class_2432.method_37268();
            if (d9 > 0.0 && d10 > 0.0) {
                double d11 = (class_2433.field_1352 * class_2432.field_1352 + class_2433.field_1350 * class_2432.field_1350) / Math.sqrt(d9 * d10);
                double d12 = class_2433.field_1352 * class_2432.field_1350 - class_2433.field_1350 * class_2432.field_1352;
                class_45872.method_22907(class_7833.field_40716.rotation((float)(Math.signum(d12) * Math.acos(d11))));
            }
        } else if (f2 > 0.0f) {
            float f6 = this.P.method_36455();
            float f7 = this.P.method_5799() ? -90.0f - f6 : -90.0f;
            float f8 = class_3532.method_16439((float)f2, (float)0.0f, (float)f7);
            class_45872.method_22907(class_7833.field_40714.rotationDegrees(f8));
            if (this.P.method_20232()) {
                class_45872.method_46416(0.0f, -1.0f, 0.3f);
            }
        }
        class_45872.method_22905(-1.0f, -1.0f, 1.0f);
        class_45872.method_46416(0.0f, -1.401f, 0.0f);
        class_45872.method_22905((float)d4 * 0.93f, (float)d4 * 0.93f, (float)d4 * 0.93f);
        this.method_17086((class_1309)this.P, bl ? 0.0f : this.P.field_42108.method_48569(), bl ? 0.0f : this.P.field_42108.method_48566(), J.W.method_60646().method_60637(true));
        this.method_17087((class_1309)this.P, bl ? 0.0f : this.P.field_42108.method_48569(), bl ? 0.0f : this.P.field_42108.method_48566(), this.P.field_6012, this.P.field_6241 - this.P.field_6283, this.P.method_36455());
        this.field_3449 = this.P.method_5765();
        RenderSystem.enableBlend();
        RenderSystem.disableDepthTest();
        RenderSystem.setShader(class_757::method_34540);
        this.method_22946().forEach(arg_0 -> Z.lambda$render$0(class_45872, a2, a3, d2, arg_0));
        this.method_22948().forEach(arg_0 -> Z.lambda$render$1(class_45872, a2, a3, d2, arg_0));
        class_45872.method_22909();
        RenderSystem.disableBlend();
        RenderSystem.enableDepthTest();
    }

    public static void h(class_4587 class_45872, class_630 class_6302, A a2, A a3, double d2, boolean bl) {
        if (!class_6302.field_3665 || ((IModelPart)class_6302).getCuboids().isEmpty() && ((IModelPart)class_6302).getChildren().isEmpty()) {
            return;
        }
        class_45872.method_22903();
        class_6302.method_22703(class_45872);
        for (class_630.class_628 class_6282 : ((IModelPart)class_6302).getCuboids()) {
            Z.L(class_45872, class_6282, a2, a3, d2, bl);
        }
        for (class_630 class_6303 : ((IModelPart)class_6302).getChildren().values()) {
            Z.h(class_45872, class_6303, a2, a3, d2, bl);
        }
        class_45872.method_22909();
    }

    public static void L(class_4587 class_45872, class_630.class_628 class_6282, A a2, A a3, double d2, boolean bl) {
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        for (class_630.class_593 class_5932 : ((IModelPartCuboid)class_6282).getSides()) {
            class_287 class_2872;
            float f2;
            float f3;
            float f4;
            float f5;
            Color color;
            z.set(class_5932.field_3502[0].field_3605.x / 16.0f, class_5932.field_3502[0].field_3605.y / 16.0f, class_5932.field_3502[0].field_3605.z / 16.0f, 1.0f);
            z.mul((Matrix4fc)matrix4f);
            j.set(class_5932.field_3502[1].field_3605.x / 16.0f, class_5932.field_3502[1].field_3605.y / 16.0f, class_5932.field_3502[1].field_3605.z / 16.0f, 1.0f);
            j.mul((Matrix4fc)matrix4f);
            v.set(class_5932.field_3502[2].field_3605.x / 16.0f, class_5932.field_3502[2].field_3605.y / 16.0f, class_5932.field_3502[2].field_3605.z / 16.0f, 1.0f);
            v.mul((Matrix4fc)matrix4f);
            k.set(class_5932.field_3502[3].field_3605.x / 16.0f, class_5932.field_3502[3].field_3605.y / 16.0f, class_5932.field_3502[3].field_3605.z / 16.0f, 1.0f);
            k.mul((Matrix4fc)matrix4f);
            if (a2.i) {
                color = a2.P();
                f5 = (float)((double)((float)color.getAlpha() / 255.0f) * d2);
                f4 = (float)color.getRed() / 255.0f;
                f3 = (float)color.getGreen() / 255.0f;
                f2 = (float)color.getBlue() / 255.0f;
                class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, bl ? class_290.field_1575 : class_290.field_1576);
                class_2872.method_22912(Z.z.x, Z.z.y, Z.z.z).method_22913(class_5932.field_3502[0].field_3604, class_5932.field_3502[0].field_3603).method_22915(f4, f3, f2, f5);
                class_2872.method_22912(Z.j.x, Z.j.y, Z.j.z).method_22913(class_5932.field_3502[1].field_3604, class_5932.field_3502[1].field_3603).method_22915(f4, f3, f2, f5);
                class_2872.method_22912(Z.j.x, Z.j.y, Z.j.z).method_22913(class_5932.field_3502[1].field_3604, class_5932.field_3502[1].field_3603).method_22915(f4, f3, f2, f5);
                class_2872.method_22912(Z.v.x, Z.v.y, Z.v.z).method_22913(class_5932.field_3502[2].field_3604, class_5932.field_3502[2].field_3603).method_22915(f4, f3, f2, f5);
                class_2872.method_22912(Z.v.x, Z.v.y, Z.v.z).method_22913(class_5932.field_3502[2].field_3604, class_5932.field_3502[2].field_3603).method_22915(f4, f3, f2, f5);
                class_2872.method_22912(Z.k.x, Z.k.y, Z.k.z).method_22913(class_5932.field_3502[3].field_3604, class_5932.field_3502[3].field_3603).method_22915(f4, f3, f2, f5);
                class_2872.method_22912(Z.z.x, Z.z.y, Z.z.z).method_22913(class_5932.field_3502[0].field_3604, class_5932.field_3502[0].field_3603).method_22915(f4, f3, f2, f5);
                class_2872.method_22912(Z.z.x, Z.z.y, Z.z.z).method_22913(class_5932.field_3502[0].field_3604, class_5932.field_3502[0].field_3603).method_22915(f4, f3, f2, f5);
                K.d(class_2872);
            }
            if (!a3.i) continue;
            color = a3.P();
            f5 = (float)((double)((float)color.getAlpha() / 255.0f) * d2);
            f4 = (float)color.getRed() / 255.0f;
            f3 = (float)color.getGreen() / 255.0f;
            f2 = (float)color.getBlue() / 255.0f;
            class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_29344, bl ? class_290.field_1575 : class_290.field_1576);
            class_2872.method_22912(Z.z.x, Z.z.y, Z.z.z).method_22913(class_5932.field_3502[0].field_3604, class_5932.field_3502[0].field_3603).method_22915(f4, f3, f2, f5);
            class_2872.method_22912(Z.j.x, Z.j.y, Z.j.z).method_22913(class_5932.field_3502[1].field_3604, class_5932.field_3502[1].field_3603).method_22915(f4, f3, f2, f5);
            class_2872.method_22912(Z.j.x, Z.j.y, Z.j.z).method_22913(class_5932.field_3502[1].field_3604, class_5932.field_3502[1].field_3603).method_22915(f4, f3, f2, f5);
            class_2872.method_22912(Z.v.x, Z.v.y, Z.v.z).method_22913(class_5932.field_3502[2].field_3604, class_5932.field_3502[2].field_3603).method_22915(f4, f3, f2, f5);
            class_2872.method_22912(Z.v.x, Z.v.y, Z.v.z).method_22913(class_5932.field_3502[2].field_3604, class_5932.field_3502[2].field_3603).method_22915(f4, f3, f2, f5);
            class_2872.method_22912(Z.k.x, Z.k.y, Z.k.z).method_22913(class_5932.field_3502[3].field_3604, class_5932.field_3502[3].field_3603).method_22915(f4, f3, f2, f5);
            class_2872.method_22912(Z.k.x, Z.k.y, Z.k.z).method_22913(class_5932.field_3502[3].field_3604, class_5932.field_3502[3].field_3603).method_22915(f4, f3, f2, f5);
            class_2872.method_22912(Z.z.x, Z.z.y, Z.z.z).method_22913(class_5932.field_3502[0].field_3604, class_5932.field_3502[0].field_3603).method_22915(f4, f3, f2, f5);
            K.d(class_2872);
        }
    }

    private static void lambda$render$1(class_4587 class_45872, A a2, A a3, double d2, class_630 class_6302) {
        Z.h(class_45872, class_6302, a2, a3, d2, false);
    }

    private static void lambda$render$0(class_4587 class_45872, A a2, A a3, double d2, class_630 class_6302) {
        Z.h(class_45872, class_6302, a2, a3, d2, false);
    }
}

