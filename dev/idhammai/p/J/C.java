/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.Block
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.MathHelper
 */
package dev.idhammai.p.J;

import dev.idhammai.Frog;
import dev.idhammai.P.A.J;
import dev.idhammai.P.A.l.M;
import dev.idhammai.c.r.q.A.W;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;

public class C
implements J {
    public boolean D(class_2338 class_23382) {
        return this.v(class_23382, true, false, false);
    }

    public boolean v(class_2338 class_23382, boolean bl, boolean bl2, boolean bl3) {
        int n2 = 0;
        for (class_2350 class_23502 : class_2350.values()) {
            if (class_23502 == class_2350.field_11036 || class_23502 == class_2350.field_11033 || (!bl3 || C.W.field_1687.method_22347(class_23382.method_10093(class_23502))) && !Frog.HOLE.O(class_23382.method_10093(class_23502))) continue;
            ++n2;
        }
        return !(bl2 && (!C.W.field_1687.method_22347(class_23382) || !C.W.field_1687.method_22347(class_23382.method_10084()) || !C.W.field_1687.method_22347(class_23382.method_10086(1)) || !C.W.field_1687.method_22347(class_23382.method_10086(2)) || C.W.field_1724.method_31478() - 1 > class_23382.method_10264() && !C.W.field_1687.method_22347(class_23382.method_10086(3)) || C.W.field_1724.method_31478() - 2 > class_23382.method_10264() && !C.W.field_1687.method_22347(class_23382.method_10086(4))) || n2 <= 3 || bl && !M.U(new class_238(class_23382.method_10069(0, -1, 0))));
    }

    public class_2338 z(float f2, boolean bl, boolean bl2, boolean bl3) {
        class_2338 class_23382 = null;
        double d2 = f2 + 1.0f;
        for (class_2338 class_23383 : M.U(f2, C.W.field_1724.method_19538())) {
            if ((class_23383.method_10263() != C.W.field_1724.method_31477() || class_23383.method_10260() != C.W.field_1724.method_31479()) && !bl3 && (double)(class_23383.method_10264() + 1) > C.W.field_1724.method_23318() || !Frog.HOLE.v(class_23383, true, true, bl2) && (!bl || !this.N(class_23383)) || class_23383.method_10264() - C.W.field_1724.method_31478() > 1) continue;
            double d3 = class_3532.method_15355((float)((float)C.W.field_1724.method_5649((double)class_23383.method_10263() + 0.5, (double)class_23383.method_10264() + 0.5, (double)class_23383.method_10260() + 0.5)));
            if (class_23382 != null && !(d3 < d2)) continue;
            class_23382 = class_23383;
            d2 = d3;
        }
        return class_23382;
    }

    public boolean N(class_2338 class_23382) {
        class_2350 class_23502 = this.W(class_23382);
        if (class_23502 != null) {
            return (class_23502 = this.W(class_23382 = class_23382.method_10093(class_23502))) != null;
        }
        return false;
    }

    public class_2350 W(class_2338 class_23382) {
        if (!this.O(class_23382.method_10074())) {
            return null;
        }
        if (!(C.W.field_1687.method_22347(class_23382) && C.W.field_1687.method_22347(class_23382.method_10084()) && C.W.field_1687.method_22347(class_23382.method_10086(2)))) {
            return null;
        }
        int n2 = 0;
        class_2350 class_23502 = null;
        for (class_2350 class_23503 : class_2350.values()) {
            if (class_23503 == class_2350.field_11036 || class_23503 == class_2350.field_11033) continue;
            if (this.O(class_23382.method_10093(class_23503))) {
                ++n2;
                continue;
            }
            int n3 = 0;
            for (class_2350 class_23504 : class_2350.values()) {
                if (class_23504 == class_2350.field_11033 || class_23504 == class_23503.method_10153() || !this.O(class_23382.method_10093(class_23503).method_10093(class_23504))) continue;
                ++n3;
            }
            if (n3 == 4) {
                ++n2;
                continue;
            }
            class_23502 = class_23503;
        }
        if (n2 == 3) {
            return class_23502;
        }
        return null;
    }

    public boolean O(class_2338 class_23382) {
        class_2248 class_22482 = C.W.field_1687.method_8320(class_23382).method_26204();
        return this.i(class_22482);
    }

    public boolean i(class_2248 class_22482) {
        return class_22482 == class_2246.field_9987 || W.N.contains(class_22482);
    }
}

