/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.u.T;

import dev.idhammai.c.r.q.N.I;
import dev.idhammai.c.u.k;
import java.util.List;

public class A
extends k {
    public A() {
        super("prefix", "[prefix]");
    }

    @Override
    public void h(String[] stringArray) {
        if (stringArray.length == 0) {
            this.F();
            return;
        }
        if (stringArray[0].startsWith("/")) {
            this.y("\u00a7fPlease specify keyCodec valid \u00a7bprefix.");
            return;
        }
        I.Q.I.z(stringArray[0]);
        this.y("\u00a7bPrefix \u00a7fset to \u00a7e" + stringArray[0]);
    }

    @Override
    public String[] l(int n2, List<String> list) {
        return null;
    }
}

