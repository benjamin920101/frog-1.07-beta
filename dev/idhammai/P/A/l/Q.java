/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_1675
 *  net.minecraft.class_238
 *  net.minecraft.class_239
 *  net.minecraft.class_243
 *  net.minecraft.class_3532
 *  net.minecraft.class_3959
 *  net.minecraft.class_3959$class_242
 *  net.minecraft.class_3959$class_3960
 *  net.minecraft.class_3966
 */
package dev.idhammai.P.A.l;

import dev.idhammai.P.A.J;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1675;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_3959;
import net.minecraft.class_3966;

public class Q
implements J {
    public static class_239 X(float f2, float f3, double d2, double d3, double d4) {
        class_238 class_2383;
        class_239 class_2392 = Q.w(5.0, f2, f3, d2, d3, d4);
        class_243 class_2432 = new class_243(d2, d3, d4);
        double d5 = 25.0;
        if (class_2392 != null) {
            d5 = class_2392.method_17784().method_1025(class_2432);
        }
        class_243 class_2433 = Q.L(f3, f2);
        class_243 class_2434 = class_2432.method_1031(class_2433.field_1352 * 5.0, class_2433.field_1351 * 5.0, class_2433.field_1350 * 5.0);
        class_3966 class_39662 = class_1675.method_18075((class_1297)Q.W.field_1724, (class_243)class_2432, (class_243)class_2434, (class_238)(class_2383 = new class_238(d2 - 0.3, d3, d4 - 0.3, d2 + 0.3, d3 + 1.8, d4 + 0.3).method_18804(class_2433.method_1021(5.0)).method_1009(1.0, 1.0, 1.0)), Q::lambda$getRtxTarget$0, (double)d5);
        if (class_39662 != null) {
            class_1297 class_12972 = class_39662.method_17782();
            class_243 class_2435 = class_39662.method_17784();
            double d6 = class_2432.method_1025(class_2435);
            if ((d6 < d5 || class_2392 == null) && class_12972 instanceof class_1309) {
                return class_39662;
            }
        }
        return class_2392;
    }

    public static class_239 w(double d2, float f2, float f3, double d3, double d4, double d5) {
        class_243 class_2432 = new class_243(d3, d4, d5);
        class_243 class_2433 = Q.L(f3, f2);
        class_243 class_2434 = class_2432.method_1031(class_2433.field_1352 * d2, class_2433.field_1351 * d2, class_2433.field_1350 * d2);
        return Q.W.field_1687.method_17742(new class_3959(class_2432, class_2434, class_3959.class_3960.field_17559, class_3959.class_242.field_1348, (class_1297)Q.W.field_1724));
    }

    private static class_243 L(float f2, float f3) {
        return new class_243((double)(class_3532.method_15374((float)(-f3 * ((float)Math.PI / 180))) * class_3532.method_15362((float)(f2 * ((float)Math.PI / 180)))), (double)(-class_3532.method_15374((float)(f2 * ((float)Math.PI / 180)))), (double)(class_3532.method_15362((float)(-f3 * ((float)Math.PI / 180))) * class_3532.method_15362((float)(f2 * ((float)Math.PI / 180)))));
    }

    private static boolean lambda$getRtxTarget$0(class_1297 class_12972) {
        return !class_12972.method_7325() && class_12972.method_5863();
    }
}

