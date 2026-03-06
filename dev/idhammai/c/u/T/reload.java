/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.u.T;

import dev.idhammai.Frog;
import dev.idhammai.c.u.k;
import dev.idhammai.p.J.z;
import java.util.List;

public class f
extends k {
    public f() {
        super("reload", "");
    }

    @Override
    public void h(String[] stringArray) {
        this.y("\u00a7fReloading..");
        Frog.CONFIG = new z();
        Frog.CONFIG.Q();
        Frog.CLEANER.D();
        Frog.XRAY.Q();
        Frog.TRADE.m();
        Frog.FRIEND.H();
    }

    @Override
    public String[] l(int n2, List<String> list) {
        return null;
    }
}

