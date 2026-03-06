/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1934
 */
package dev.idhammai.c.u.T;

import dev.idhammai.c.u.k;
import java.util.List;
import net.minecraft.class_1934;

public class c
extends k {
    public c() {
        super("gamemode", "[gamemode]");
    }

    @Override
    public void h(String[] stringArray) {
        if (stringArray.length == 0) {
            this.F();
            return;
        }
        String string = stringArray[0];
        if (string.equalsIgnoreCase("survival")) {
            c.W.field_1761.method_2907(class_1934.field_9215);
        } else if (string.equalsIgnoreCase("creative")) {
            c.W.field_1761.method_2907(class_1934.field_9220);
        } else if (string.equalsIgnoreCase("adventure")) {
            c.W.field_1761.method_2907(class_1934.field_9216);
        } else if (string.equalsIgnoreCase("spectator")) {
            c.W.field_1761.method_2907(class_1934.field_9219);
        }
    }

    @Override
    public String[] l(int n2, List<String> list) {
        if (n2 == 1) {
            return new String[]{"survival", "creative", "adventure", "spectator"};
        }
        return null;
    }
}

