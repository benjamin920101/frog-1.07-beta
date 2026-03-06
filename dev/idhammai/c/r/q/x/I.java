/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_434
 *  net.minecraft.class_435
 */
package dev.idhammai.c.r.q.x;

import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.v;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import net.minecraft.class_434;
import net.minecraft.class_435;

public class I
extends y {
    public I() {
        super("NoTerrainScreen", w.Misc);
        this.L("\u6ca1\u6709\u52a0\u8f7d\u754c\u9762");
    }

    @r
    public void Q(v v2) {
        if (I.M()) {
            return;
        }
        if (I.W.field_1755 instanceof class_434 || I.W.field_1755 instanceof class_435) {
            I.W.field_1755 = null;
        }
    }
}

