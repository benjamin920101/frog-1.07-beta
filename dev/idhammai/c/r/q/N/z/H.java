/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.N.z;

import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class H
extends y {
    public static H V;
    public final W c = this.S(new W("Font", true).k("\u81ea\u5b9a\u4e49\u5b57\u4f53"));
    public final W n = this.S(new W("Shadow", true).k("\u6587\u5b57\u9634\u5f71"));
    public final W a = this.S(new W("TextGlow", false).k("\u6587\u5b57\u8f89\u5149"));

    public H() {
        super("HUDSetting", w.Client);
        this.L("HUD\u8bbe\u7f6e");
        V = this;
    }

    public static boolean v() {
        return V == null || H.V.c.h();
    }

    public static boolean j() {
        return V == null || H.V.n.h();
    }

    public static boolean o() {
        return V != null && H.V.a.h();
    }

    @Override
    public void C() {
        this.S = true;
    }

    @Override
    public void p() {
        this.S = true;
    }

    @Override
    public boolean p() {
        return true;
    }
}

