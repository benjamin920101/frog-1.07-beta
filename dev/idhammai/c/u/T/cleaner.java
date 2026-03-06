/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.Items
 */
package dev.idhammai.c.u.T;

import dev.idhammai.Frog;
import dev.idhammai.c.u.k;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.item.Items;

public class O
extends k {
    public O() {
        super("cleaner", "[\"\"/name/reset/clear/list] | [add/remove] [name]");
    }

    @Override
    public void h(String[] stringArray) {
        if (stringArray.length == 0) {
            this.F();
            return;
        }
        switch (stringArray[0]) {
            case "reset": {
                Frog.CLEANER.P();
                Frog.CLEANER.E(class_1802.field_22022.method_7876());
                Frog.CLEANER.E(class_1802.field_22024.method_7876());
                Frog.CLEANER.E(class_1802.field_22027.method_7876());
                Frog.CLEANER.E(class_1802.field_22028.method_7876());
                Frog.CLEANER.E(class_1802.field_22029.method_7876());
                Frog.CLEANER.E(class_1802.field_22030.method_7876());
                Frog.CLEANER.E(class_1802.field_8281.method_7876());
                Frog.CLEANER.E(class_1802.field_8466.method_7876());
                Frog.CLEANER.E(class_1802.field_8634.method_7876());
                Frog.CLEANER.E(class_1802.field_8367.method_7876());
                Frog.CLEANER.E(class_1802.field_8287.method_7876());
                Frog.CLEANER.E(class_1802.field_8786.method_7876());
                Frog.CLEANER.E(class_1802.field_8574.method_7876());
                Frog.CLEANER.E(class_1802.field_8436.method_7876());
                Frog.CLEANER.E(class_1802.field_8288.method_7876());
                Frog.CLEANER.E(class_1802.field_8301.method_7876());
                Frog.CLEANER.E(class_1802.field_8833.method_7876());
                Frog.CLEANER.E(class_1802.field_8884.method_7876());
                Frog.CLEANER.E(class_1802.field_8249.method_7876());
                Frog.CLEANER.E(class_1802.field_8105.method_7876());
                Frog.CLEANER.E(class_1802.field_8793.method_7876());
                Frog.CLEANER.E(class_1802.field_8801.method_7876());
                Frog.CLEANER.E(class_1802.field_23141.method_7876());
                Frog.CLEANER.E(class_1802.field_8782.method_7876());
                this.y("\u00a7fItems list got reset");
                return;
            }
            case "clear": {
                Frog.CLEANER.L().clear();
                this.y("\u00a7fItems list got clear");
                return;
            }
            case "list": {
                if (Frog.CLEANER.L().isEmpty()) {
                    this.y("\u00a7fItems list is empty");
                    return;
                }
                for (String string : Frog.CLEANER.L()) {
                    this.y("\u00a7a" + string);
                }
                return;
            }
            case "add": {
                if (stringArray.length == 2) {
                    Frog.CLEANER.E(stringArray[1]);
                    this.y("\u00a7f" + stringArray[1] + (Frog.CLEANER.T(stringArray[1]) ? " \u00a7ahas been added" : " \u00a7chas been removed"));
                    return;
                }
                this.F();
                return;
            }
            case "remove": {
                if (stringArray.length == 2) {
                    Frog.CLEANER.Y(stringArray[1]);
                    this.y("\u00a7f" + stringArray[1] + (Frog.CLEANER.T(stringArray[1]) ? " \u00a7ahas been added" : " \u00a7chas been removed"));
                    return;
                }
                this.F();
                return;
            }
        }
        if (stringArray.length == 1) {
            this.y("\u00a7f" + stringArray[0] + (Frog.CLEANER.T(stringArray[0]) ? " \u00a7ais in whitelist" : " \u00a7cisn't in whitelist"));
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
                if (!string.equalsIgnoreCase(Frog.getPrefix() + "cleaner") && !stringArray2.toLowerCase().startsWith(string)) continue;
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

