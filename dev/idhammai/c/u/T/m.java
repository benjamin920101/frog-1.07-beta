/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2596
 *  net.minecraft.class_7439
 */
package dev.idhammai.c.u.T;

import dev.idhammai.Frog;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.i;
import dev.idhammai.c.u.k;
import java.util.List;
import net.minecraft.class_2596;
import net.minecraft.class_7439;

public class m
extends k {
    private long t;

    public m() {
        super("ping", "");
    }

    @Override
    public void h(String[] stringArray) {
        this.t = System.currentTimeMillis();
        W.method_1562().method_45730("chat ");
        Frog.EVENT_BUS.S(this);
    }

    @Override
    public String[] l(int n2, List<String> list) {
        return null;
    }

    @r
    public void w(i i2) {
        class_7439 class_74392;
        class_2596<?> class_25962 = i2.L();
        if (class_25962 instanceof class_7439 && ((class_74392 = (class_7439)class_25962).comp_763().getString().contains("chat.use") || class_74392.comp_763().getString().contains("\u547d\u4ee4") || class_74392.comp_763().getString().contains("Bad command") || class_74392.comp_763().getString().contains("No such command") || class_74392.comp_763().getString().contains("<--[HERE]") || class_74392.comp_763().getString().contains("Unknown") || class_74392.comp_763().getString().contains("\u5e2e\u52a9") || class_74392.comp_763().getString().contains("\u6267\u884c\u9519\u8bef"))) {
            this.y("ping: " + (System.currentTimeMillis() - this.t) + "ms");
            Frog.EVENT_BUS.f(this);
        }
    }
}

