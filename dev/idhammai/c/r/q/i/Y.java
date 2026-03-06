/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.i;

import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.B;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;

public class Y
extends y {
    public static Y R;
    private final W F = this.S(new W("YawLock", true).k("\u9501\u5b9aYaw"));
    private final W C = this.S(new W("Smart", true).k("\u667a\u80fd45\u5ea6"));
    private final l j = this.p(new l("Yaw", 0.0, -180.0, 180.0, 0.1, this::lambda$new$0).D("Yaw\u89d2\u5ea6"));
    private final W n = this.S(new W("PitchLock", true).k("\u9501\u5b9aPitch"));
    private final l b = this.p(new l("Pitch", 0.0, -90.0, 90.0, 0.1).D("Pitch\u89d2\u5ea6"));
    private final W e = this.S(new W("Lock", true).k("\u9501\u5b9a\u89c6\u89d2\u8f93\u5165"));

    public Y() {
        super("Yaw", w.Player);
        this.L("\u89c6\u89d2\u9501\u5b9a");
        R = this;
    }

    @r
    public void n(QO qO) {
        if (this.F.h()) {
            Y.W.field_1724.method_36456(this.C.h() ? (float)Math.round((Y.W.field_1724.method_36454() + 1.0f) / 45.0f) * 45.0f : this.j.Z());
        }
        if (this.n.h()) {
            Y.W.field_1724.method_36457(this.b.Z());
        }
    }

    @r
    public void L(B b2) {
        if (this.e.h()) {
            b2.L();
        }
    }

    private boolean lambda$new$0() {
        return !this.C.h();
    }
}

