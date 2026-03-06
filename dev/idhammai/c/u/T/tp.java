/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.Vec3d
 */
package dev.idhammai.c.u.T;

import dev.idhammai.P.A.R.B;
import dev.idhammai.c.u.k;
import java.text.DecimalFormat;
import java.util.List;
import net.minecraft.util.math.Vec3d;

public class U
extends k {
    public U() {
        super("tp", "[x] [y] [z]");
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
        if (this.u(stringArray[0])) {
            d4 = Double.parseDouble(stringArray[0]);
        } else {
            if (!stringArray[0].startsWith("~")) {
                this.F();
                return;
            }
            if (this.u(stringArray[0].replace("~", ""))) {
                d4 = U.W.field_1724.method_23317() + Double.parseDouble(stringArray[0].replace("~", ""));
            } else {
                if (!stringArray[0].replace("~", "").isEmpty()) {
                    this.F();
                    return;
                }
                d4 = U.W.field_1724.method_23317();
            }
        }
        if (this.u(stringArray[1])) {
            d3 = Double.parseDouble(stringArray[1]);
        } else {
            if (!stringArray[1].startsWith("~")) {
                this.F();
                return;
            }
            if (this.u(stringArray[1].replace("~", ""))) {
                d3 = U.W.field_1724.method_23318() + Double.parseDouble(stringArray[1].replace("~", ""));
            } else {
                if (!stringArray[1].replace("~", "").isEmpty()) {
                    this.F();
                    return;
                }
                d3 = U.W.field_1724.method_23318();
            }
        }
        if (this.u(stringArray[2])) {
            d2 = Double.parseDouble(stringArray[2]);
        } else {
            if (!stringArray[2].startsWith("~")) {
                this.F();
                return;
            }
            if (this.u(stringArray[2].replace("~", ""))) {
                d2 = U.W.field_1724.method_23321() + Double.parseDouble(stringArray[2].replace("~", ""));
            } else {
                if (!stringArray[2].replace("~", "").isEmpty()) {
                    this.F();
                    return;
                }
                d2 = U.W.field_1724.method_23321();
            }
        }
        B.l(new class_243(d4, d3, d2));
        U.W.field_1724.method_5814(d4, d3, d2);
        DecimalFormat decimalFormat = new DecimalFormat("0.0");
        this.y("\u00a7fTeleported to \u00a7e" + decimalFormat.format(d4) + ", " + decimalFormat.format(d3) + ", " + decimalFormat.format(d2));
    }

    private boolean u(String string) {
        return string.matches("-?\\d+(\\.\\d+)?");
    }

    @Override
    public String[] l(int n2, List<String> list) {
        return new String[]{"~ "};
    }
}

