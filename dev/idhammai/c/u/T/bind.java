/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.u.T;

import dev.idhammai.Frog;
import dev.idhammai.c.r.y;
import dev.idhammai.c.u.k;
import java.util.ArrayList;
import java.util.List;

public class d
extends k {
    public d() {
        super("bind", "[module] [key]");
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
            this.y("\u00a74Unknown module!");
            return;
        }
        if (stringArray.length == 1) {
            this.y("\u00a7fPlease specify keyCodec \u00a7bkey\u00a7f.");
            return;
        }
        String string2 = stringArray[1];
        if (string2 == null) {
            this.y("\u00a74Unknown Error");
            return;
        }
        if (y2.h(string2.toUpperCase())) {
            this.y("\u00a7fBind for \u00a7r" + y2.o() + "\u00a7f set to \u00a7r" + string2.toUpperCase());
        }
    }

    @Override
    public String[] l(int n2, List<String> list) {
        if (n2 == 1) {
            String string = list.getLast().toLowerCase();
            ArrayList<String> arrayList = new ArrayList<String>();
            for (y stringArray2 : Frog.MODULE.h()) {
                if (!string.equalsIgnoreCase(Frog.getPrefix() + "bind") && !stringArray2.o().toLowerCase().startsWith(string)) continue;
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

