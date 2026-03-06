/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_4587
 */
package dev.idhammai.p.J;

import dev.idhammai.c.r.q.N.j;
import dev.idhammai.c.y.y.i;
import dev.idhammai.p.J.n;
import java.awt.Font;
import net.minecraft.class_4587;

class l
extends i {
    l(Font font, Font font2, float f2) {
        super(font, font2, f2);
    }

    @Override
    public void Z(class_4587 class_45872, String string, float f2, float f3, float f4, float f5, float f6, float f7, boolean bl) {
        float f8 = 0.0f;
        float f9 = 0.0f;
        if (n.s()) {
            f8 = j.G.V.V();
            f9 = j.G.U.V();
        }
        super.f(class_45872, string, f2 + f8, f3 + f9, f4, f5, f6, f7, bl, false);
    }

    @Override
    public void f(class_4587 class_45872, String string, float f2, float f3, float f4, float f5, float f6, float f7, boolean bl, boolean bl2) {
        float f8 = 0.0f;
        float f9 = 0.0f;
        if (n.s()) {
            f8 = j.G.V.V();
            f9 = j.G.U.V();
        }
        super.f(class_45872, string, f2 + f8, f3 + f9, f4, f5, f6, f7, bl, bl2);
    }
}

