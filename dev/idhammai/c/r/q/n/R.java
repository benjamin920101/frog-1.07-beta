/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_332
 *  net.minecraft.class_4587
 */
package dev.idhammai.c.r.q.n;

import dev.idhammai.P.A.S.o;
import dev.idhammai.c.r.O.Y.A;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import net.minecraft.class_332;
import net.minecraft.class_4587;

public class R
extends y {
    public static R r;
    public final l w = this.p(new l("Length", 1.4, 0.0, 20.0, 0.1).D("\u957f\u5ea6"));
    public final l n = this.p(new l("Thickness", 0.8, 0.0, 20.0, 0.1).D("\u7c97\u7ec6"));
    public final l A = this.p(new l("Interval", 1.0, 0.0, 20.0, 0.1).D("\u95f4\u9694"));
    private final A C = this.y(new A("Color").P("\u989c\u8272"));

    public R() {
        super("Crosshair", dev.idhammai.c.r.w.Render);
        this.L("\u51c6\u661f");
        r = this;
    }

    public void w(class_332 class_3322) {
        class_4587 class_45872 = class_3322.method_51448();
        float f2 = (float)W.method_22683().method_4486() / 2.0f;
        float f3 = (float)W.method_22683().method_4502() / 2.0f;
        o.D(class_45872, f2 - this.n.Z() / 2.0f, f3 - this.w.Z() - this.A.Z(), this.n.Z(), this.w.Z(), this.C.P());
        o.D(class_45872, f2 - this.n.Z() / 2.0f, f3 + this.A.Z(), this.n.Z(), this.w.Z(), this.C.P());
        o.D(class_45872, f2 + this.A.Z(), f3 - this.n.Z() / 2.0f, this.w.Z(), this.n.Z(), this.C.P());
        o.D(class_45872, f2 - this.A.Z() - this.w.Z(), f3 - this.n.Z() / 2.0f, this.w.Z(), this.n.Z(), this.C.P());
    }
}

