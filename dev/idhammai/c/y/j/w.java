/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 *  net.minecraft.class_332
 *  net.minecraft.class_437
 */
package dev.idhammai.c.y.j;

import dev.idhammai.P.A.S.o;
import java.awt.Color;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_437;

public class w {
    private static boolean W = false;
    private static long F = 0L;
    private static final long o = 500L;

    public static boolean k(class_437 class_4372) {
        if (class_310.method_1551().field_1687 != null) {
            return false;
        }
        if (class_4372 == null) {
            return false;
        }
        W = true;
        F = System.currentTimeMillis();
        return false;
    }

    public static float e() {
        if (!W) {
            return 1.0f;
        }
        long l2 = System.currentTimeMillis() - F;
        float f2 = Math.min(1.0f, (float)l2 / 500.0f);
        return w.B(f2);
    }

    public static void R(class_332 class_3322) {
        if (!W) {
            return;
        }
        float f2 = w.e();
        int n2 = Math.max(0, (int)(255.0f * (1.0f - f2)));
        if (n2 > 0) {
            int n3 = class_310.method_1551().method_22683().method_4486();
            int n4 = class_310.method_1551().method_22683().method_4502();
            dev.idhammai.P.A.S.o.D(class_3322.method_51448(), 0.0f, 0.0f, n3, n4, new Color(0, 0, 0, n2));
        }
        if (f2 >= 1.0f) {
            W = false;
        }
    }

    public static boolean f() {
        return W;
    }

    private static float B(float f2) {
        float f3 = 1.0f - f2;
        return 1.0f - f3 * f3 * f3 * f3;
    }
}

