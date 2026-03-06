/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2561
 *  net.minecraft.class_2661
 *  net.minecraft.class_310
 *  net.minecraft.class_412
 *  net.minecraft.class_437
 *  net.minecraft.class_442
 *  net.minecraft.class_639
 *  net.minecraft.class_642
 *  net.minecraft.class_8705
 */
package dev.idhammai.c.u.T;

import dev.idhammai.c.u.k;
import java.util.List;
import net.minecraft.class_2561;
import net.minecraft.class_2661;
import net.minecraft.class_310;
import net.minecraft.class_412;
import net.minecraft.class_437;
import net.minecraft.class_442;
import net.minecraft.class_639;
import net.minecraft.class_642;
import net.minecraft.class_8705;

public class o
extends k {
    public o() {
        super("rejoin", "");
    }

    @Override
    public void h(String[] stringArray) {
        W.method_18859(o::lambda$runCommand$0);
    }

    @Override
    public String[] l(int n2, List<String> list) {
        return null;
    }

    private static void lambda$runCommand$0() {
        if (o.W.field_1687 != null && W.method_1558() != null) {
            class_642 class_6422 = W.method_1558();
            new class_2661(class_2561.method_30163((String)"Self kick")).method_11467((class_8705)W.method_1562());
            class_412.method_36877((class_437)new class_442(), (class_310)W, (class_639)class_639.method_2950((String)class_6422.field_3761), (class_642)class_6422, (boolean)false, null);
        }
    }
}

