/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_239
 *  net.minecraft.class_3966
 */
package dev.idhammai.c.r.q.x;

import dev.idhammai.Frog;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_239;
import net.minecraft.class_3966;

public class z
extends y {
    public static z d;

    public z() {
        super("Friend", w.Misc);
        this.L("\u597d\u53cb");
        d = this;
    }

    @Override
    public void H() {
        class_3966 class_39662;
        class_1297 class_12972;
        if (dev.idhammai.c.r.q.x.z.M()) {
            this.p();
            return;
        }
        class_239 class_2392 = dev.idhammai.c.r.q.x.z.W.field_1765;
        if (class_2392 instanceof class_3966 && (class_12972 = (class_39662 = (class_3966)class_2392).method_17782()) instanceof class_1657) {
            class_1657 class_16572 = (class_1657)class_12972;
            Frog.FRIEND.P(class_16572);
        }
        this.p();
    }
}

