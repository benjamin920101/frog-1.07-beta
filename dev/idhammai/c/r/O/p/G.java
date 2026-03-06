/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.O.p;

public final class G
extends Enum<G> {
    public static final /* enum */ G Vanilla = new G();
    public static final /* enum */ G NCP = new G();
    public static final /* enum */ G Grim = new G();
    public static final /* enum */ G Legit = new G();
    private static final /* synthetic */ G[] H;

    public static G[] values() {
        return (G[])H.clone();
    }

    public static G valueOf(String string) {
        return Enum.valueOf(G.class, string);
    }

    private static /* synthetic */ G[] v() {
        return new G[]{Vanilla, NCP, Grim, Legit};
    }

    static {
        H = G.v();
    }
}

