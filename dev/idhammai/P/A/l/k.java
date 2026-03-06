/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2338
 *  net.minecraft.class_243
 *  net.minecraft.class_3532
 */
package dev.idhammai.P.A.l;

import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_3532;

public class k
extends class_2338 {
    public k(double d2, double d3, double d4) {
        super(class_3532.method_15357((double)d2), class_3532.method_15357((double)d3), class_3532.method_15357((double)d4));
    }

    public k(double d2, double d3, double d4, boolean bl) {
        this(d2, d3 + (bl ? 0.3 : 0.0), d4);
    }

    public k(class_243 class_2432) {
        this(class_2432.field_1352, class_2432.field_1351, class_2432.field_1350);
    }

    public k(class_243 class_2432, boolean bl) {
        this(class_2432.field_1352, class_2432.field_1351, class_2432.field_1350, bl);
    }
}

