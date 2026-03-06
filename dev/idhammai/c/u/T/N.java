/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.u.T;

import dev.idhammai.Frog;
import dev.idhammai.c.r.q.x.M;
import dev.idhammai.c.u.k;
import java.util.ArrayList;
import java.util.List;

public class N
extends k {
    public N() {
        super("fakeplayer", "[record/play]");
    }

    @Override
    public void h(String[] stringArray) {
        if (stringArray.length == 0) {
            M.g.o();
            return;
        }
        String string = stringArray[0];
        boolean bl = false;
        switch (string) {
            case "record": {
                M.g.U.x(!M.g.U.h());
                break;
            }
            case "play": {
                M.g.w.x(!M.g.w.h());
                break;
            }
            default: {
                this.F();
            }
        }
    }

    @Override
    public String[] l(int n2, List<String> list) {
        if (n2 == 1) {
            String string = list.getLast().toLowerCase();
            ArrayList<String> arrayList = new ArrayList<String>();
            List<String> list2 = List.of("record", "play");
            for (String stringArray2 : list2) {
                if (!string.equalsIgnoreCase(Frog.getPrefix() + "fakeplayer") && !stringArray2.toLowerCase().startsWith(string)) continue;
                arrayList.add(stringArray2);
            }
            int n3 = arrayList.size();
            String[] stringArray = new String[n3];
            int n4 = 0;
            for (String string2 : arrayList) {
                stringArray[n4++] = string2;
            }
            return stringArray;
        }
        return null;
    }
}

