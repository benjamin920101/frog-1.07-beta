/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2246
 */
package dev.idhammai.c.u.T;

import dev.idhammai.Frog;
import dev.idhammai.c.u.k;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_2246;

public class j
extends k {
    public j() {
        super("xray", "[\"\"/name/reset/clear/list] | [add/remove] [name]");
    }

    @Override
    public void h(String[] stringArray) {
        if (stringArray.length == 0) {
            this.F();
            return;
        }
        switch (stringArray[0]) {
            case "reset": {
                Frog.XRAY.s();
                Frog.XRAY.h(class_2246.field_10442.method_9539());
                Frog.XRAY.h(class_2246.field_29029.method_9539());
                Frog.XRAY.h(class_2246.field_10571.method_9539());
                Frog.XRAY.h(class_2246.field_23077.method_9539());
                Frog.XRAY.h(class_2246.field_10212.method_9539());
                Frog.XRAY.h(class_2246.field_29027.method_9539());
                Frog.XRAY.h(class_2246.field_10080.method_9539());
                Frog.XRAY.h(class_2246.field_10013.method_9539());
                Frog.XRAY.h(class_2246.field_29220.method_9539());
                Frog.XRAY.h(class_2246.field_29030.method_9539());
                Frog.XRAY.h(class_2246.field_10418.method_9539());
                Frog.XRAY.h(class_2246.field_29219.method_9539());
                Frog.XRAY.h(class_2246.field_22109.method_9539());
                Frog.XRAY.h(class_2246.field_10213.method_9539());
                Frog.XRAY.h(class_2246.field_10090.method_9539());
                Frog.XRAY.h(class_2246.field_29028.method_9539());
                this.y("\u00a7fBlocks list got reset");
                return;
            }
            case "clear": {
                Frog.XRAY.s();
                this.y("\u00a7fBlocks list got clear");
                return;
            }
            case "list": {
                if (Frog.XRAY.I().isEmpty()) {
                    this.y("\u00a7fBlocks list is empty");
                    return;
                }
                for (String string : Frog.XRAY.I()) {
                    this.y("\u00a7a" + string);
                }
                return;
            }
            case "add": {
                if (stringArray.length == 2) {
                    Frog.XRAY.h(stringArray[1]);
                    this.y("\u00a7f" + stringArray[1] + (Frog.XRAY.E(stringArray[1]) ? " \u00a7ahas been added" : " \u00a7chas been removed"));
                    return;
                }
                this.F();
                return;
            }
            case "remove": {
                if (stringArray.length == 2) {
                    Frog.XRAY.z(stringArray[1]);
                    this.y("\u00a7f" + stringArray[1] + (Frog.XRAY.E(stringArray[1]) ? " \u00a7ahas been added" : " \u00a7chas been removed"));
                    return;
                }
                this.F();
                return;
            }
        }
        if (stringArray.length == 1) {
            this.y("\u00a7f" + stringArray[0] + (Frog.XRAY.E(stringArray[0]) ? " \u00a7ais in whitelist" : " \u00a7cisn't in whitelist"));
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
                if (!string.equalsIgnoreCase(Frog.getPrefix() + "xray") && !stringArray2.toLowerCase().startsWith(string)) continue;
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

