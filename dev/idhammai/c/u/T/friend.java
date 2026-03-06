/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.u.T;

import dev.idhammai.Frog;
import dev.idhammai.c.u.k;
import java.util.ArrayList;
import java.util.List;

public class H
extends k {
    public H() {
        super("friend", "[name/reset/list] | [add/remove] [name]");
    }

    @Override
    public void h(String[] stringArray) {
        if (stringArray.length == 0) {
            this.F();
            return;
        }
        switch (stringArray[0]) {
            case "reset": {
                Frog.FRIEND.x.clear();
                this.y("\u00a7fFriends list got reset");
                return;
            }
            case "list": {
                if (Frog.FRIEND.x.isEmpty()) {
                    this.y("\u00a7fFriends list is empty");
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder();
                int n2 = 0;
                boolean bl = true;
                boolean bl2 = true;
                for (String string : Frog.FRIEND.x) {
                    if (!bl) {
                        stringBuilder.append(", ");
                    }
                    stringBuilder.append(string);
                    bl = false;
                    if (++n2 <= 3) continue;
                    this.y((bl2 ? "\u00a7eFriends \u00a7a" : "\u00a7a") + String.valueOf(stringBuilder));
                    stringBuilder = new StringBuilder();
                    bl2 = false;
                    bl = true;
                    n2 = 0;
                }
                if (bl) {
                    this.y("\u00a7a" + String.valueOf(stringBuilder));
                }
                return;
            }
            case "add": {
                if (stringArray.length == 2) {
                    Frog.FRIEND.r(stringArray[1]);
                    this.y("\u00a7f" + stringArray[1] + (Frog.FRIEND.e(stringArray[1]) ? " \u00a7ahas been friended" : " \u00a7chas been unfriended"));
                    return;
                }
                this.F();
                return;
            }
            case "remove": 
            case "del": {
                if (stringArray.length == 2) {
                    Frog.FRIEND.f(stringArray[1]);
                    this.y("\u00a7f" + stringArray[1] + (Frog.FRIEND.e(stringArray[1]) ? " \u00a7ahas been friended" : " \u00a7chas been unfriended"));
                    return;
                }
                this.F();
                return;
            }
        }
        if (stringArray.length == 1) {
            this.y("\u00a7f" + stringArray[0] + (Frog.FRIEND.e(stringArray[0]) ? " \u00a7ais friended" : " \u00a7cisn't friended"));
            return;
        }
        this.F();
    }

    @Override
    public String[] l(int n2, List<String> list) {
        if (n2 == 1) {
            String string = list.getLast().toLowerCase();
            ArrayList<String> arrayList = new ArrayList<String>();
            List<String> list2 = List.of("add", "remove", "list", "reset");
            for (String stringArray2 : list2) {
                if (!string.equalsIgnoreCase(Frog.getPrefix() + "friend") && !stringArray2.toLowerCase().startsWith(string)) continue;
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

