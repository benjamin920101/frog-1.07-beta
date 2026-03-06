/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_243
 */
package dev.idhammai.c.r.q.D;

import dev.idhammai.c.r.q.D.L;
import java.util.Random;
import net.minecraft.class_243;

final class W
extends L {
    final Random V = new Random();

    private int p() {
        int n2 = this.V.nextInt(29000000);
        if (this.V.nextBoolean()) {
            return n2;
        }
        return -n2;
    }

    @Override
    public class_243 c(class_243 class_2432, int n2) {
        return class_2432.method_1031((double)this.p(), 0.0, (double)this.p());
    }
}

