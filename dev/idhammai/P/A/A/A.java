/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.math.MathHelper
 */
package dev.idhammai.P.A.A;

import dev.idhammai.P.A.J;
import java.math.BigDecimal;
import java.math.RoundingMode;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.MathHelper;

public class A
implements J {
    public static float p(float f2, float f3, float f4) {
        return f2 < f3 ? f3 : Math.min(f2, f4);
    }

    public static double l(double d2, double d3, double d4) {
        if (d2 < d3) {
            return d3;
        }
        return Math.min(d2, d4);
    }

    public static double V(double d2, int n2) {
        BigDecimal bigDecimal = new BigDecimal(d2);
        bigDecimal = bigDecimal.setScale(n2, RoundingMode.HALF_UP);
        return bigDecimal.doubleValue();
    }

    public static double h(double d2) {
        return d2 * d2;
    }

    public static float t(float f2, float f3) {
        return (float)(Math.random() * (double)(f3 - f2) + (double)f2);
    }

    public static double M(double d2, double d3) {
        return (float)(Math.random() * (d3 - d2) + d2);
    }

    public static float Y(float f2) {
        return (float)((double)f2 * Math.PI / 180.0);
    }

    public static double Z(double d2, double d3, double d4) {
        return d2 + (d3 - d2) * d4;
    }

    public static float S(float f2, float f3, float f4) {
        return f2 + (f3 - f2) * f4;
    }

    public static class_2350 e(float f2, float f3) {
        float f4 = f3 * ((float)Math.PI / 180);
        float f5 = -f2 * ((float)Math.PI / 180);
        float f6 = class_3532.method_15374((float)f4);
        float f7 = class_3532.method_15362((float)f4);
        float f8 = class_3532.method_15374((float)f5);
        float f9 = class_3532.method_15362((float)f5);
        boolean bl = f8 > 0.0f;
        boolean bl2 = f6 < 0.0f;
        boolean bl3 = f9 > 0.0f;
        float f10 = bl ? f8 : -f8;
        float f11 = bl2 ? -f6 : f6;
        float f12 = bl3 ? f9 : -f9;
        float f13 = f10 * f7;
        float f14 = f12 * f7;
        class_2350 class_23502 = bl ? class_2350.field_11034 : class_2350.field_11039;
        class_2350 class_23503 = bl2 ? class_2350.field_11036 : class_2350.field_11033;
        class_2350 class_23504 = bl3 ? class_2350.field_11035 : class_2350.field_11043;
        class_2350 class_23505 = class_23504;
        if (f10 > f12) {
            if (f11 > f13) {
                return class_23503;
            }
            return class_23502;
        }
        if (f11 > f14) {
            return class_23503;
        }
        return class_23504;
    }

    public static class_2350 T(class_2338 class_23382, class_1309 class_13092) {
        if (Math.abs(class_13092.method_23317() - ((double)class_23382.method_10263() + 0.5)) < 2.0 && Math.abs(class_13092.method_23321() - ((double)class_23382.method_10260() + 0.5)) < 2.0) {
            double d2 = class_13092.method_23318() + (double)class_13092.method_18381(class_13092.method_18376());
            if (d2 - (double)class_23382.method_10264() > 2.0) {
                return class_2350.field_11036;
            }
            if ((double)class_23382.method_10264() - d2 > 0.0) {
                return class_2350.field_11033;
            }
        }
        return class_13092.method_5735().method_10153();
    }

    public static class_243 b(class_1297 class_12972) {
        return A.w(class_12972, W.method_60646().method_60637(true));
    }

    public static class_243 w(class_1297 class_12972, float f2) {
        return new class_243(class_12972.field_6014 + (class_12972.method_23317() - class_12972.field_6014) * (double)f2, class_12972.field_6036 + (class_12972.method_23318() - class_12972.field_6036) * (double)f2, class_12972.field_5969 + (class_12972.method_23321() - class_12972.field_5969) * (double)f2);
    }

    public static double f(double d2, double d3, double d4, double d5, double d6, double d7) {
        double d8 = d5 - d2;
        double d9 = d6 - d3;
        double d10 = d7 - d4;
        return Math.sqrt(d8 * d8 + d9 * d9 + d10 * d10);
    }

    public static class_243 M(class_243 class_2432, class_243 class_2433, double d2, double d3, double d4) {
        class_243 class_2434 = null;
        double d5 = d3 / 2.0;
        double d6 = Double.MAX_VALUE;
        boolean bl = class_2433.field_1352 < class_2432.field_1352;
        boolean bl2 = class_2433.field_1350 < class_2432.field_1350;
        double d7 = d2 * d2;
        for (double d8 = 0.0; d8 <= d3; d8 += d4) {
            for (double d9 = 0.0; d9 <= d5; d9 += d4) {
                for (double d10 = 0.0; d10 <= d5; d10 += d4) {
                    double d11 = class_2433.field_1351 + d8;
                    if (d8 != 0.0 && d11 > class_2432.field_1351) {
                        return class_2434;
                    }
                    double d12 = class_2433.field_1352 + (bl ? d9 : -d9);
                    double d13 = class_2433.field_1350 + (bl2 ? d10 : -d10);
                    double d14 = d12 - class_2432.field_1352;
                    double d15 = d11 - class_2432.field_1351;
                    double d16 = d13 - class_2432.field_1350;
                    double d17 = d14 * d14 + d15 * d15 + d16 * d16;
                    double d18 = d9 + d8 + d10;
                    if (!(d17 <= d7) || !(d18 < d6)) continue;
                    d6 = d18;
                    class_2434 = new class_243(d12, d11, d13);
                }
            }
        }
        return class_2434;
    }

    public static class_243 g(class_243 class_2432, double d2, double d3, double d4, double d5, double d6, double d7) {
        double d8 = Math.max(d2, Math.min(class_2432.field_1352, d5));
        double d9 = Math.max(d3, Math.min(class_2432.field_1351, d6));
        double d10 = Math.max(d4, Math.min(class_2432.field_1350, d7));
        return new class_243(d8, d9, d10);
    }

    public static class_243 r(class_243 class_2432, class_238 class_2383) {
        return A.g(class_2432, class_2383.field_1323, class_2383.field_1322, class_2383.field_1321, class_2383.field_1320, class_2383.field_1325, class_2383.field_1324);
    }

    public static class_243 V(class_1297 class_12972) {
        return A.r(A.W.field_1724.method_33571(), class_12972.method_5829());
    }
}

