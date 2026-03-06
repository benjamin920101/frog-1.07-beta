/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.u.T;

import dev.idhammai.c.u.k;
import dev.idhammai.p.J.z;
import java.util.List;

public class W
extends k {
    public W() {
        super("load", "[config]");
    }

    @Override
    public void h(String[] stringArray) {
        if (stringArray.length == 0) {
            this.F();
            return;
        }
        this.y("\u00a7fLoading..");
        z.O(stringArray[0]);
    }

    @Override
    public String[] l(int n2, List<String> list) {
        return null;
    }
}

