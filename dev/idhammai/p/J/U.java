/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.util.math.BlockPos
 */
package dev.idhammai.p.J;

import dev.idhammai.P.A.A.d;
import dev.idhammai.P.A.A.h;
import dev.idhammai.P.A.J;
import dev.idhammai.c.r.q.n.S;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;

public class U {
    public class_2338 T;
    private final int o;
    public final d R;
    public final h C;
    public double H;
    public boolean F = false;
    public boolean W = false;

    public U(class_2338 class_23382, int n2, boolean bl) {
        this.T = class_23382;
        this.o = n2;
        this.H = Math.max(S.t(class_23382, bl), 50.0);
        this.R = new d((long)this.H);
        this.C = new h();
    }

    public class_1297 Q() {
        if (J.W.field_1687 == null) {
            return null;
        }
        class_1297 class_12972 = J.W.field_1687.method_8469(this.o);
        if (class_12972 instanceof class_1657) {
            return class_12972;
        }
        return null;
    }
}

