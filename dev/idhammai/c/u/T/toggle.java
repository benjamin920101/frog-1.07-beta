/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.u.T;

import dev.idhammai.Frog;
import dev.idhammai.c.r.y;
import dev.idhammai.c.u.k;
import java.util.ArrayList;
import java.util.List;

public class E
extends k {
    public E() {
        super("toggle", "[module]");
    }

    @Override
    public void h(String[] stringArray) {
        if (stringArray.length == 0) {
            this.F();
            return;
        }
        String string = stringArray[0];
        y y2 = Frog.MODULE.X(string);
        if (y2 == null) {
            this.y("\u00a7cUnknown module");
            return;
        }
        y2.o();
    }

    @Override
    public String[] l(int n2, List<String> list) {
        if (n2 == 1) {
            String string = list.getLast().toLowerCase();
            ArrayList<String> arrayList = new ArrayList<String>();
            for (y stringArray2 : Frog.MODULE.h()) {
                if (!string.equalsIgnoreCase(Frog.getPrefix() + "toggle") && !stringArray2.o().toLowerCase().startsWith(string)) continue;
                arrayList.add(stringArray2.o());
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

