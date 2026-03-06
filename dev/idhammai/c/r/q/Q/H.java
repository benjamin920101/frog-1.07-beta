/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2596
 *  net.minecraft.class_2720
 *  net.minecraft.class_2856
 *  net.minecraft.class_2856$class_2857
 */
package dev.idhammai.c.r.q.Q;

import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.P.r.c.i;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import net.minecraft.class_2596;
import net.minecraft.class_2720;
import net.minecraft.class_2856;

public class H
extends y {
    public static H Y;
    private boolean b;
    private boolean F;
    private int n;

    public H() {
        super("NoResourcePack", w.Exploit);
        this.L("\u53cd\u8d44\u6e90\u5305");
        Y = this;
    }

    @r
    public void p(i i2) {
        if (i2.L() instanceof class_2720) {
            this.b = true;
            this.F = false;
            this.n = 0;
            i2.L();
        }
    }

    @r
    public void p(QO qO) {
        if (this.b) {
            ++this.n;
            if (this.n > 15 && !this.F) {
                W.method_1562().method_52787((class_2596)new class_2856(H.W.field_1724.method_5667(), class_2856.class_2857.field_13016));
                this.F = true;
            }
            if (this.n > 40) {
                W.method_1562().method_52787((class_2596)new class_2856(H.W.field_1724.method_5667(), class_2856.class_2857.field_13017));
                this.b = false;
            }
        }
    }
}

