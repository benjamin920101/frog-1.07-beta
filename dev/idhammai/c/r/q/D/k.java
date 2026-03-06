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

final class k
extends L {
    final Random i = new Random();

    @Override
    public class_243 c(class_243 class_2432, int n2) {
        boolean bl = this.i.nextBoolean();
        return bl ? class_2432.method_1031(0.0, (double)(-n2), 0.0) : class_2432.method_1031(0.0, (double)n2, 0.0);
    }
}

