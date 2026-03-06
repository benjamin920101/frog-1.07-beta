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

public class q
extends L {
    private static final q X = new q();
    public class_1268 K;

    private q() {
    }

    public static q o(class_1268 class_12682) {
        q.X.K = class_12682;
        q.X.C = O.Pre;
        X.G(false);
        return X;
    }

    public static q L(class_1268 class_12682) {
        q.X.K = class_12682;
        q.X.C = O.Post;
        return X;
    }
}

