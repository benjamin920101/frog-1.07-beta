/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.Q;

public final class z
extends Enum<z> {
    public static final /* enum */ z Normal = new z();
    public static final /* enum */ z IgnoreBlockExploit = new z();
    public static final /* enum */ z BlockExploitMode = new z();
    private static final z[] G = z.B();

    public static z[] values() {
        return (z[])G.clone();
    }

    public static z valueOf(String string) {
        return Enum.valueOf(z.class, string);
    }

    private static z[] B() {
        return new z[]{Normal, IgnoreBlockExploit, BlockExploitMode};
    }
}

