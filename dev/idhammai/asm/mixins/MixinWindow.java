/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.util.Window
 *  org.lwjgl.glfw.GLFW
 *  org.lwjgl.opengl.GL11
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package dev.idhammai.asm.mixins;

import net.minecraft.client.util.Window;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_1041.class})
public class MixinWindow {
    @Inject(method={"<init>"}, at={@At(value="TAIL")})
    private void onInit(CallbackInfo callbackInfo) {
        long l2 = ((class_1041)this).method_4490();
        GL11.glClearColor((float)0.27450982f, (float)0.5882353f, (float)0.27450982f, (float)1.0f);
        GL11.glClear((int)16384);
        GLFW.glfwSwapBuffers((long)l2);
    }
}

