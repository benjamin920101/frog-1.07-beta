/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_243
 */
package dev.idhammai.c.r.q.D;

import dev.idhammai.c.r.q.D.E;
import dev.idhammai.c.r.q.D.I;
import dev.idhammai.c.r.q.D.W;
import dev.idhammai.c.r.q.D.X;
import dev.idhammai.c.r.q.D.k;
import dev.idhammai.c.r.q.D.m;
import dev.idhammai.c.r.q.D.v;
import net.minecraft.class_243;

public abstract sealed class L
extends Enum<L>
permits I, E, W, k, X, m, v {
    public static final /* enum */ L Down = new I();
    public static final /* enum */ L Up = new E();
    public static final /* enum */ L Preserve = new W();
    public static final /* enum */ L Switch = new k();
    public static final /* enum */ L X = new X();
    public static final /* enum */ L Z = new m();
    public static final /* enum */ L XZ = new v();
    private static final L[] k = L.z();

    public static L[] values() {
        return (L[])k.clone();
    }

    public static L valueOf(String string) {
        return Enum.valueOf(L.class, string);
    }

    public abstract class_243 c(class_243 var1, int var2);

    private static L[] z() {
        return new L[]{Down, Up, Preserve, Switch, X, Z, XZ};
    }
}

