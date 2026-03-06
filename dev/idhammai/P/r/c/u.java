/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 */
package dev.idhammai.P.r.c;

import dev.idhammai.P.r.L;
import dev.idhammai.P.r.O;
import net.minecraft.class_1268;

public class u
extends L {
    private static final u H = new u();
    public class_1268 h;

    private u() {
    }

    public static u D(class_1268 class_12682) {
        u.H.h = class_12682;
        u.H.C = O.Pre;
        H.G(false);
        return H;
    }

    public static u O(class_1268 class_12682) {
        u.H.h = class_12682;
        u.H.C = O.Post;
        return H;
    }
}

