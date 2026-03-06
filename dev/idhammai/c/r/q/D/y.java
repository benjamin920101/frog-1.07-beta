/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2246
 *  net.minecraft.class_2338
 */
package dev.idhammai.c.r.q.D;

import dev.idhammai.P.A.L.l;
import dev.idhammai.P.A.l.k;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.c.r.w;
import net.minecraft.class_2246;
import net.minecraft.class_2338;

public class y
extends dev.idhammai.c.r.y {
    private final dev.idhammai.c.r.O.Y.l F = this.p(new dev.idhammai.c.r.O.Y.l("VoidHeight", -64.0, -64.0, 319.0, 1.0).D("\u865a\u7a7a\u9ad8\u5ea6"));
    private final dev.idhammai.c.r.O.Y.l L = this.p(new dev.idhammai.c.r.O.Y.l("Height", 100.0, -40.0, 256.0, 1.0).D("\u89e6\u53d1\u9ad8\u5ea6"));

    public y() {
        super("AntiVoid", "Allows you to fly over void blocks", w.Movement);
        this.L("\u53cd\u865a\u7a7a");
    }

    @r
    public void W(QO qO) {
        boolean bl = true;
        for (int i2 = (int)y.W.field_1724.method_23318(); i2 > this.F.V() - 1; --i2) {
            if (y.W.field_1687.method_8320((class_2338)new k(y.W.field_1724.method_23317(), i2, y.W.field_1724.method_23321())).method_26215() || y.W.field_1687.method_8320((class_2338)new k(y.W.field_1724.method_23317(), i2, y.W.field_1724.method_23321())).method_26204() == class_2246.field_10243) continue;
            bl = false;
            break;
        }
        if (y.W.field_1724.method_23318() < this.L.e() + this.F.e() && bl) {
            l.d(0.0);
        }
    }
}

