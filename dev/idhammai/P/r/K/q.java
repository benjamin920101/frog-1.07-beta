/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.P.r.K;

public class q
extends RuntimeException {
    public q(Class<?> clazz) {
        super("No registered lambda listener for '" + clazz.getName() + "'.");
    }
}

