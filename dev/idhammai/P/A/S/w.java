/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.client.gl.Framebuffer
 *  net.minecraft.client.MinecraftClient
 *  org.lwjgl.opengl.GL11
 */
package dev.idhammai.P.A.S;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.MinecraftClient;
import org.lwjgl.opengl.GL11;

public class w {
    private static final class_310 g = class_310.method_1551();

    public static void W() {
        class_276 class_2762 = g.method_1522();
        if (class_2762 != null && class_2762.field_1478) {
            class_2762.method_58226(9729);
        }
    }

    public static void A() {
        g.method_1522().method_1235(false);
        w.W();
        RenderSystem.enableDepthTest();
        GL11.glEnable((int)2960);
        RenderSystem.stencilFunc((int)519, (int)1, (int)255);
        RenderSystem.stencilOp((int)7680, (int)7680, (int)7681);
        RenderSystem.stencilMask((int)255);
        RenderSystem.clear((int)1024, (boolean)false);
    }

    public static void Y(int n2) {
        RenderSystem.stencilFunc((int)514, (int)n2, (int)255);
        RenderSystem.stencilOp((int)7680, (int)7680, (int)7680);
        RenderSystem.stencilMask((int)0);
    }

    public static void D() {
        RenderSystem.disableDepthTest();
        GL11.glDisable((int)2960);
        RenderSystem.stencilMask((int)0);
    }
}

