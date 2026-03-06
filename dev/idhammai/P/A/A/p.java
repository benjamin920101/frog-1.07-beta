/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_2338
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 */
package dev.idhammai.P.A.A;

import dev.idhammai.P.A.J;
import dev.idhammai.P.A.l.M;
import dev.idhammai.P.A.l.k;
import dev.idhammai.asm.accessors.IEntity;
import dev.idhammai.c.r.q.N.X;
import dev.idhammai.c.r.q.N.x;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;

public class p
implements J {
    public static class_243 g(class_1657 class_16572, int n2) {
        if (n2 <= 0) {
            return class_16572.method_19538();
        }
        return p.t(class_16572, x.y.l.e(), x.y.P.V(), x.y.G.V(), x.y.T.h(), x.y.N.h(), x.y.B.h(), x.y.V.h());
    }

    public static class_243 t(class_1657 class_16572, double d2, int n2, int n3, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        double d3;
        double d4;
        double d5;
        if (bl4 && M.d((class_1297)class_16572, class_16572.method_5829())) {
            return class_16572.method_19538();
        }
        if (x.y.K.x(X.Position)) {
            d5 = class_16572.method_23317() - class_16572.field_6014;
            d4 = class_16572.method_23318() - class_16572.field_6036;
            d3 = class_16572.method_23321() - class_16572.field_5969;
            if (d4 > d2) {
                d4 = d2;
            }
        } else {
            d5 = class_16572.method_18798().field_1352;
            d4 = class_16572.method_18798().field_1351;
            d3 = class_16572.method_18798().field_1350;
        }
        double d6 = d5;
        double d7 = d4;
        double d8 = d3;
        double d9 = class_16572.method_23317();
        double d10 = class_16572.method_23318();
        double d11 = class_16572.method_23321();
        class_243 class_2432 = new class_243(d9, d10, d11);
        if (d6 == 0.0 && d7 == 0.0 && d8 == 0.0) {
            return class_2432;
        }
        for (int i2 = 0; i2 < n2; ++i2) {
            class_2432 = new class_243(d9, d10, d11);
            boolean bl5 = false;
            boolean bl6 = false;
            block1: for (int i3 = n3; i3 >= 0; --i3) {
                for (int i4 = n3; i4 >= 0; --i4) {
                    double d12 = (double)i4 / (double)n3;
                    double d13 = (double)i3 / (double)n3;
                    if (!p.E(class_2432.method_1031(d6 * d12, d7 * d13, d8 * d12), class_16572)) continue;
                    if (Math.abs(d6 * d12) + Math.abs(d8 * d12) + Math.abs(d7 * d13) <= 0.05) {
                        if (bl && !p.E(class_2432.method_1031(d5, 0.0, d3), class_16572) && p.E(class_2432.method_1031(d5, 1.1, d3), class_16572)) {
                            d10 += 1.05;
                            d7 = 0.03;
                            for (var37_25 = n3; var37_25 >= 0; --var37_25) {
                                for (var38_26 = n3; var38_26 >= 0; --var38_26) {
                                    var39_27 = (double)var38_26 / (double)n3;
                                    var41_28 = (double)var37_25 / (double)n3;
                                    if (!p.E(class_2432.method_1031(d6 * var39_27, d7 * var41_28, d8 * var39_27), class_16572)) continue;
                                    bl5 = true;
                                    d9 += d6 * var39_27;
                                    d11 += d8 * var39_27;
                                    if (var37_25 <= 0) break block1;
                                    d10 += d7 * var41_28;
                                    bl6 = true;
                                    break block1;
                                }
                            }
                        } else if (bl2 && !p.E(class_2432.method_1031(d5, 0.0, d3), class_16572) && p.E(class_2432.method_1031(d5, 2.1, d3), class_16572)) {
                            d10 += 2.05;
                            d7 = 0.03;
                            for (var37_25 = n3; var37_25 >= 0; --var37_25) {
                                for (var38_26 = n3; var38_26 >= 0; --var38_26) {
                                    var39_27 = (double)var38_26 / (double)n3;
                                    var41_28 = (double)var37_25 / (double)n3;
                                    if (!p.E(class_2432.method_1031(d6 * var39_27, d7 * var41_28, d8 * var39_27), class_16572)) continue;
                                    bl5 = true;
                                    d9 += d6 * var39_27;
                                    d11 += d8 * var39_27;
                                    if (var37_25 <= 0) break block1;
                                    d10 += d7 * var41_28;
                                    bl6 = true;
                                    break block1;
                                }
                            }
                        }
                        return class_2432;
                    }
                    bl5 = true;
                    d9 += d6 * d12;
                    d11 += d8 * d12;
                    if (i3 <= 0) break block1;
                    d10 += d7 * d13;
                    bl6 = true;
                    break block1;
                }
            }
            if (!bl5) {
                return class_2432;
            }
            if (!class_16572.method_6128()) {
                d6 *= 0.99;
                d8 *= 0.99;
                d7 *= 0.99;
                d7 -= (double)0.05f;
            }
            if (bl6) continue;
            if (class_16572.method_24828()) {
                d6 = d5;
                d8 = d3;
                d7 = 0.0;
                continue;
            }
            if (bl3) {
                d6 = d5;
                d8 = d3;
                d7 = 0.333;
                continue;
            }
            d7 = 0.0;
        }
        return class_2432;
    }

    public static boolean E(class_243 class_2432, class_1657 class_16572) {
        return !M.d((class_1297)class_16572, ((IEntity)class_16572).getDimensions().method_30757(class_2432)) || new class_238((class_2338)new k(class_2432)).method_994(class_16572.method_5829());
    }
}

