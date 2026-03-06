/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.u.T;

import dev.idhammai.c.u.k;
import java.text.DecimalFormat;
import java.util.List;

public class L
extends k {
    public L() {
        super("clip", "[x] [y] [z]");
    }

    @Override
    public void h(String[] stringArray) {
        if (stringArray.length != 3) {
            this.F();
            return;
        }
        if (!this.T(stringArray[0])) {
            this.F();
            return;
        }
        double d2 = L.W.field_1724.method_23317() + Double.parseDouble(stringArray[0]);
        if (!this.T(stringArray[1])) {
            this.F();
            return;
        }
        double d3 = L.W.field_1724.method_23318() + Double.parseDouble(stringArray[1]);
        if (!this.T(stringArray[2])) {
            this.F();
            return;
        }
        double d4 = L.W.field_1724.method_23321() + Double.parseDouble(stringArray[2]);
        L.W.field_1724.method_5814(d2, d3, d4);
        DecimalFormat decimalFormat = new DecimalFormat("0.0");
        this.y("\u00a7fTeleported to \u00a7e" + decimalFormat.format(d2) + ", " + decimalFormat.format(d3) + ", " + decimalFormat.format(d4));
    }

    private boolean T(String string) {
        return string.matches("-?\\d+(\\.\\d+)?");
    }

    @Override
    public String[] l(int n2, List<String> list) {
        return new String[]{"0 "};
    }
}

