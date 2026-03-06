/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.DrawContext
 */
package dev.idhammai.c.y.u.I;

import net.minecraft.client.gui.DrawContext;

final class Y
implements AutoCloseable {
    private final class_332 w;

    Y(class_332 class_3322) {
        this.w = class_3322;
        class_3322.method_51448().method_22903();
    }

    @Override
    public void close() {
        this.w.method_51448().method_22909();
    }
}

