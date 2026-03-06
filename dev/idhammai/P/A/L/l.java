/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.effect.StatusEffectInstance
 *  net.minecraft.entity.effect.StatusEffects
 */
package dev.idhammai.P.A.L;

import dev.idhammai.P.A.J;
import dev.idhammai.asm.accessors.IVec3d;
import dev.idhammai.c.r.q.D.w;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class l
implements J {
    public static boolean b() {
        return (double)l.W.field_1724.field_3913.field_3905 != 0.0 || (double)l.W.field_1724.field_3913.field_3907 != 0.0 || w.H.p();
    }

    public static boolean j() {
        return l.W.field_1724.method_18798().method_10216() == 0.0 && l.W.field_1724.method_24828() && l.W.field_1724.method_18798().method_10215() == 0.0;
    }

    public static boolean l() {
        return l.W.field_1724.field_3913.field_3904;
    }

    public static double y() {
        double d2 = l.W.field_1724.method_23317() - l.W.field_1724.field_6014;
        double d3 = l.W.field_1724.method_23321() - l.W.field_1724.field_5969;
        return Math.sqrt(d2 * d2 + d3 * d3);
    }

    public static double I() {
        double d2 = 0.0;
        if (l.W.field_1724.method_6059(class_1294.field_5913)) {
            int n2 = ((class_1293)l.W.field_1724.method_6088().get(class_1294.field_5913)).method_5578();
            d2 += (double)(n2 + 1) * 0.1;
        }
        return d2;
    }

    public static double[] h(double d2) {
        float f2 = l.W.field_1724.field_3913.field_3905;
        float f3 = l.W.field_1724.field_3913.field_3907;
        return l.F(d2, f2, f3);
    }

    private static double[] F(double d2, float f2, float f3) {
        float f4 = l.W.field_1724.field_5982 + (l.W.field_1724.method_36454() - l.W.field_1724.field_5982) * W.method_60646().method_60637(true);
        if (f2 != 0.0f) {
            if (f3 > 0.0f) {
                f4 += (float)(f2 > 0.0f ? -45 : 45);
            } else if (f3 < 0.0f) {
                f4 += (float)(f2 > 0.0f ? 45 : -45);
            }
            f3 = 0.0f;
            if (f2 > 0.0f) {
                f2 = 1.0f;
            } else if (f2 < 0.0f) {
                f2 = -1.0f;
            }
        }
        double d3 = Math.sin(Math.toRadians(f4 + 90.0f));
        double d4 = Math.cos(Math.toRadians(f4 + 90.0f));
        double d5 = (double)f2 * d2 * d4 + (double)f3 * d2 * d3;
        double d6 = (double)f2 * d2 * d3 - (double)f3 * d2 * d4;
        return new double[]{d5, d6};
    }

    public static double r() {
        return l.W.field_1724.method_18798().field_1352;
    }

    public static void U(double d2) {
        ((IVec3d)l.W.field_1724.method_18798()).setX(d2);
    }

    public static double R() {
        return l.W.field_1724.method_18798().field_1351;
    }

    public static void d(double d2) {
        ((IVec3d)l.W.field_1724.method_18798()).setY(d2);
    }

    public static double H() {
        return l.W.field_1724.method_18798().field_1350;
    }

    public static void Q(double d2) {
        ((IVec3d)l.W.field_1724.method_18798()).setZ(d2);
    }

    public static double K(boolean bl) {
        double d2 = 0.2873;
        return l.I(bl, d2);
    }

    public static double I(boolean bl, double d2) {
        int n2;
        if (l.W.field_1724.method_6059(class_1294.field_5904)) {
            n2 = ((class_1293)l.W.field_1724.method_6088().get(class_1294.field_5904)).method_5578();
            d2 *= 1.0 + 0.2 * (double)(n2 + 1);
        }
        if (bl && l.W.field_1724.method_6059(class_1294.field_5909)) {
            n2 = ((class_1293)l.W.field_1724.method_6088().get(class_1294.field_5909)).method_5578();
            d2 /= 1.0 + 0.2 * (double)(n2 + 1);
        }
        if (l.W.field_1724.method_5715()) {
            d2 /= 5.0;
        }
        return d2;
    }
}

