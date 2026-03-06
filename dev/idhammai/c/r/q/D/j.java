/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.D;

import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.asm.accessors.ILivingEntity;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;

public class j
extends y {
    public static j A;

    public j() {
        super("NoJumpDelay", w.Movement);
        this.L("\u65e0\u8df3\u8dc3\u51b7\u5374");
        A = this;
    }

    @r
    public void T(QO qO) {
        ((ILivingEntity)j.W.field_1724).setLastJumpCooldown(0);
    }
}

