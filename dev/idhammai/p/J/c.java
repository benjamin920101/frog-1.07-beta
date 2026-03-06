/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.p.J;

import java.util.ArrayList;
import java.util.List;

public class c {
    private final List<Long> S = new ArrayList<Long>();

    public void C() {
        this.S.add(System.currentTimeMillis());
    }

    public int B() {
        this.S.removeIf(c::lambda$getFps$0);
        return this.S.size();
    }

    private static boolean lambda$getFps$0(Long l2) {
        return l2 + 1000L < System.currentTimeMillis();
    }
}

