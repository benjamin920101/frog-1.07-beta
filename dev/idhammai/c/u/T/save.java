/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.u.T;

import dev.idhammai.Frog;
import dev.idhammai.c.u.k;
import dev.idhammai.p.J.z;
import java.util.List;

public class G
extends k {
    public G() {
        super("save", "");
    }

    @Override
    public void h(String[] stringArray) {
        if (stringArray.length == 1) {
            this.y("\u00a7fSaving config named " + stringArray[0]);
            z.j(stringArray[0]);
        } else {
            this.y("\u00a7fSaving..");
        }
        Frog.save();
    }

    @Override
    public String[] l(int n2, List<String> list) {
        return null;
    }
}

