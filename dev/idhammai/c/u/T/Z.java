/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_243
 */
package dev.idhammai.c.u.T;

import dev.idhammai.c.u.k;
import dev.idhammai.p.J.G;
import java.text.DecimalFormat;
import java.util.List;
import net.minecraft.class_243;

public class Z
extends k {
    public Z() {
        super("aim", "[x] [y] [z]");
    }

    @Override
    public void h(String[] stringArray) {
        double d2;
        double d3;
        double d4;
        if (stringArray.length != 3) {
            this.F();
            return;
        }
        if (this.G(stringArray[0])) {
            d4 = Double.parseDouble(stringArray[0]);
        } else {
            if (!stringArray[0].startsWith("~")) {
                this.F();
                return;
            }
            if (this.G(stringArray[0].replace("~", ""))) {
                d4 = Z.W.field_1724.method_23317() + Double.parseDouble(stringArray[0].replace("~", ""));
            } else {
                if (!stringArray[0].replace("~", "").isEmpty()) {
                    this.F();
                    return;
                }
                d4 = Z.W.field_1724.method_23317();
            }
        }
        if (this.G(stringArray[1])) {
            d3 = Double.parseDouble(stringArray[1]);
        } else {
            if (!stringArray[1].startsWith("~")) {
                this.F();
                return;
            }
            if (this.G(stringArray[1].replace("~", ""))) {
                d3 = Z.W.field_1724.method_23318() + Double.parseDouble(stringArray[1].replace("~", ""));
            } else {
                if (!stringArray[1].replace("~", "").isEmpty()) {
                    this.F();
                    return;
                }
                d3 = Z.W.field_1724.method_23318();
            }
        }
        if (this.G(stringArray[2])) {
            d2 = Double.parseDouble(stringArray[2]);
        } else {
            if (!stringArray[2].startsWith("~")) {
                this.F();
                return;
            }
            if (this.G(stringArray[2].replace("~", ""))) {
                d2 = Z.W.field_1724.method_23321() + Double.parseDouble(stringArray[2].replace("~", ""));
            } else {
                if (!stringArray[2].replace("~", "").isEmpty()) {
                    this.F();
                    return;
                }
                d2 = Z.W.field_1724.method_23321();
            }
        }
        float[] fArray = G.X(new class_243(d4, d3, d2));
        Z.W.field_1724.method_36456(fArray[0]);
        Z.W.field_1724.method_36457(fArray[1]);
        DecimalFormat decimalFormat = new DecimalFormat("0.0");
        this.y("\u00a7fAim to \u00a7eX:" + decimalFormat.format(d4) + " Y:" + decimalFormat.format(d3) + " Z:" + decimalFormat.format(d2));
    }

    private boolean G(String string) {
        return string.matches("-?\\d+(\\.\\d+)?");
    }

    @Override
    public String[] l(int n2, List<String> list) {
        return new String[]{"~ "};
    }
}

