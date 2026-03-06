/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_276
 */
package dev.idhammai.p.J;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.class_276;

public class g
extends class_276 {
    public g(int n2, int n3) {
        super(false);
        RenderSystem.assertOnRenderThreadOrInit();
        this.method_1234(n2, n3, true);
        this.method_1236(0.0f, 0.0f, 0.0f, 0.0f);
    }
}

