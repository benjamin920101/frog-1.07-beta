/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.math.MathHelper
 */
package dev.idhammai.P.r.c;

import dev.idhammai.P.r.L;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.MathHelper;

public class e
extends L {
    private static final e U = new e();
    public class_1309 J;
    public float W;
    public float r;

    private e() {
    }

    public static e k(class_1309 class_13092, float f2, float f3) {
        e.U.J = class_13092;
        e.U.r = f2;
        e.U.W = f3;
        U.G(false);
        return U;
    }

    public final class_243 R() {
        float f2 = this.W * ((float)Math.PI / 180);
        float f3 = -this.r * ((float)Math.PI / 180);
        float f4 = class_3532.method_15362((float)f3);
        float f5 = class_3532.method_15374((float)f3);
        float f6 = class_3532.method_15362((float)f2);
        float f7 = class_3532.method_15374((float)f2);
        return new class_243((double)(f5 * f6), (double)(-f7), (double)(f4 * f6));
    }
}

