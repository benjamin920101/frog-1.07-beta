/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.Hand
 *  net.minecraft.item.ItemStack
 *  net.minecraft.client.util.math.MatrixStack
 */
package dev.idhammai.P.r.c;

import net.minecraft.util.Hand;
import net.minecraft.item.ItemStack;
import net.minecraft.client.util.math.MatrixStack;

public class l {
    private static final l N = new l();
    private class_1268 s;
    private class_1799 c;
    private float T;
    private class_4587 n;

    private l() {
    }

    public static l c(class_1268 class_12682, class_1799 class_17992, float f2, class_4587 class_45872) {
        l.N.s = class_12682;
        l.N.c = class_17992;
        l.N.T = f2;
        l.N.n = class_45872;
        return N;
    }

    public class_1268 z() {
        return this.s;
    }

    public class_1799 y() {
        return this.c;
    }

    public float l() {
        return this.T;
    }

    public class_4587 j() {
        return this.n;
    }
}

