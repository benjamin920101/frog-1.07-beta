/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1802
 */
package dev.idhammai.c.u.T;

import dev.idhammai.Frog;
import dev.idhammai.c.u.k;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_1802;

public class C
extends k {
    public C() {
        super("trade", "[\"\"/name/reset/clear/list] | [add/remove] [name]");
    }

    @Override
    public void h(String[] stringArray) {
        if (stringArray.length == 0) {
            this.F();
            return;
        }
        switch (stringArray[0]) {
            case "reset": {
                Frog.TRADE.v();
                Frog.TRADE.R(class_1802.field_8598.method_7876());
                Frog.TRADE.R(class_1802.field_8603.method_7876());
                this.y("\u00a7fItems list got reset");
                return;
            }
            case "clear": {
                Frog.TRADE.v();
                this.y("\u00a7fItems list got clear");
                return;
            }
            case "list": {
                if (Frog.TRADE.J().isEmpty()) {
                    this.y("\u00a7fItems list is empty");
                    return;
                }
                for (String string : Frog.TRADE.J()) {
                    this.y("\u00a7a" + string);
                }
                return;
            }
            case "add": {
                if (stringArray.length == 2) {
                    Frog.TRADE.R(stringArray[1]);
                    this.y("\u00a7f" + stringArray[1] + (Frog.TRADE.d(stringArray[1]) ? " \u00a7ahas been added" : " \u00a7chas been removed"));
                    return;
                }
                this.F();
                return;
            }
            case "remove": {
                if (stringArray.length == 2) {
                    Frog.TRADE.d(stringArray[1]);
                    this.y("\u00a7f" + stringArray[1] + (Frog.TRADE.d(stringArray[1]) ? " \u00a7ahas been added" : " \u00a7chas been removed"));
                    return;
                }
                this.F();
                return;
            }
        }
        if (stringArray.length == 1) {
            this.y("\u00a7f" + stringArray[0] + (Frog.TRADE.d(stringArray[0]) ? " \u00a7ais in whitelist" : " \u00a7cisn't in whitelist"));
            return;
        }
        this.F();
    }

    @Override
    public String[] l(int n2, List<String> list) {
        if (n2 == 1) {
            String string = list.getLast().toLowerCase();
            ArrayList<String> arrayList = new ArrayList<String>();
            List<String> list2 = List.of("add", "remove", "list", "reset", "clear");
            for (String stringArray2 : list2) {
                if (!string.equalsIgnoreCase(Frog.getPrefix() + "trade") && !stringArray2.toLowerCase().startsWith(string)) continue;
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

