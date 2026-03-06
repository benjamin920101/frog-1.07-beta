/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.A;

public final class G
extends Enum<G> {
    public static final /* enum */ G Normal = new G();
    public static final /* enum */ G Silent = new G();
    public static final /* enum */ G Inventory = new G();
    private static final G[] Y = G.H();

    public static G[] values() {
        return (G[])Y.clone();
    }

    public static G valueOf(String string) {
        return Enum.valueOf(G.class, string);
    }

    private static G[] H() {
        return new G[]{Normal, Silent, Inventory};
    }
}

