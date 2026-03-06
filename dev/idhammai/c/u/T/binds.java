/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.u.T;

import dev.idhammai.Frog;
import dev.idhammai.c.r.y;
import dev.idhammai.c.u.k;
import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class r
extends k {
    public r() {
        super("binds", "");
    }

    @Override
    public void h(String[] stringArray) {
        ArrayList<CallSite> arrayList = new ArrayList<CallSite>();
        for (y y2 : Frog.MODULE.h()) {
            if (y2.P().R() == -1) continue;
            arrayList.add((CallSite)((Object)("\u00a7f" + y2.F() + " \u00a77- \u00a7r" + y2.P().O())));
        }
        Iterator<y> iterator = arrayList.iterator();
        int n2 = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while (iterator.hasNext()) {
            if (n2 == 0) {
                stringBuilder = new StringBuilder((String)((Object)iterator.next()));
            } else {
                stringBuilder.append("\u00a77, ").append((String)((Object)iterator.next()));
            }
            if (++n2 < 3 && iterator.hasNext()) continue;
            this.y(stringBuilder.toString());
            n2 = 0;
        }
    }

    @Override
    public String[] l(int n2, List<String> list) {
        return null;
    }
}

