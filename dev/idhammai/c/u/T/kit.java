/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.u.T;

import dev.idhammai.Frog;
import dev.idhammai.c.u.k;
import dev.idhammai.p.R;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class t
extends k {
    public t() {
        super("kit", "[list] | [create/delete] [name]");
    }

    @Override
    public void h(String[] stringArray) {
        if (stringArray.length == 0) {
            this.F();
            return;
        }
        switch (stringArray[0]) {
            case "list": {
                if (stringArray.length == 1) {
                    try {
                        for (File file : R.d().listFiles()) {
                            if (!file.getName().endsWith(".kit")) continue;
                            String string = file.getName();
                            this.y("Kit: [" + string.substring(0, string.length() - 4) + "]");
                        }
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                    }
                    return;
                }
                this.F();
                return;
            }
            case "create": {
                if (stringArray.length == 2) {
                    if (t.W.field_1724 == null) {
                        return;
                    }
                    try {
                        File file = R.C(stringArray[1] + ".kit");
                        PrintWriter printWriter = new PrintWriter(new OutputStreamWriter((OutputStream)new FileOutputStream(file), StandardCharsets.UTF_8));
                        for (int i2 = 0; i2 < 36; ++i2) {
                            printWriter.println(i2 + ":" + t.W.field_1724.method_31548().method_5438(i2).method_7909().method_7876());
                        }
                        printWriter.close();
                        this.y("\u00a7fKit [" + stringArray[1] + "] created");
                    }
                    catch (Exception exception) {
                        this.y("\u00a7fKit [" + stringArray[1] + "] create failed");
                        exception.printStackTrace();
                    }
                    return;
                }
                this.F();
                return;
            }
            case "delete": {
                if (stringArray.length == 2) {
                    try {
                        File file = R.C(stringArray[1] + ".kit");
                        if (file.exists()) {
                            file.delete();
                        }
                        this.y("\u00a7fKit [" + stringArray[1] + "] removed");
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                    }
                    return;
                }
                this.F();
                return;
            }
        }
        this.F();
    }

    @Override
    public String[] l(int n2, List<String> list) {
        if (n2 == 1) {
            String string = list.getLast().toLowerCase();
            ArrayList<String> arrayList = new ArrayList<String>();
            List<String> list2 = List.of("list", "create", "delete");
            for (String stringArray2 : list2) {
                if (!string.equalsIgnoreCase(Frog.getPrefix() + "kit") && !stringArray2.toLowerCase().startsWith(string)) continue;
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

