/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.u.T;

import dev.idhammai.c.r.q.N.z.C;
import dev.idhammai.c.u.k;
import java.util.Arrays;
import java.util.List;

public class i
extends k {
    public i() {
        super("watermark", "[text]");
    }

    @Override
    public void h(String[] stringArray) {
        if (stringArray.length == 0) {
            this.F();
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        boolean bl = true;
        for (String string : Arrays.stream(stringArray).toList()) {
            if (bl) {
                stringBuilder.append(string);
                bl = false;
                continue;
            }
            stringBuilder.append(" ").append(string);
        }
        C.A.E.z(stringBuilder.toString());
    }

    @Override
    public String[] l(int n2, List<String> list) {
        return null;
    }
}

