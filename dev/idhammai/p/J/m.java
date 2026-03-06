/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.client.rendering.v1.WorldRenderContext
 *  net.fabricmc.fabric.api.client.rendering.v1.WorldRenderEvents
 *  net.minecraft.util.Identifier
 *  net.minecraft.client.MinecraftClient
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Vector3f
 *  org.ladysnake.satin.api.managed.ManagedShaderEffect
 *  org.ladysnake.satin.api.managed.ShaderEffectManager
 *  org.lwjgl.PointerBuffer
 *  org.lwjgl.glfw.GLFW
 *  org.lwjgl.glfw.GLFWVidMode
 */
package dev.idhammai.p.J;

import dev.idhammai.P.A.J;
import net.fabricmc.fabric.api.client.rendering.v1.WorldRenderContext;
import net.fabricmc.fabric.api.client.rendering.v1.WorldRenderEvents;
import net.minecraft.util.Identifier;
import net.minecraft.client.MinecraftClient;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector3f;
import org.ladysnake.satin.api.managed.ManagedShaderEffect;
import org.ladysnake.satin.api.managed.ShaderEffectManager;
import org.lwjgl.PointerBuffer;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWVidMode;

public class m
implements J {
    private long y;
    private float P = 0.0f;
    private float o = 0.0f;
    private int D = 100;
    private long b = 0L;
    private int r = 60;
    private long H = 0L;
    private static final long l = 1000000000L;
    public boolean a = false;
    public float K = 0.5f;
    public boolean I = false;
    public int i = 0;
    public boolean x = true;
    private final ManagedShaderEffect A = ShaderEffectManager.getInstance().manage(class_2960.method_60655((String)"frog", (String)"shaders/post/motion_blur.json"), this::lambda$new$0);

    public m() {
        WorldRenderEvents.END.register(this::p);
    }

    private void p(WorldRenderContext worldRenderContext) {
        long l2 = System.nanoTime();
        float f2 = (float)(l2 - this.y) / 1.0E9f;
        float f3 = f2 * 20.0f;
        this.y = l2;
        this.o = f2 > 0.0f && f2 < 1.0f ? 1.0f / f2 : 0.0f;
        if (this.U()) {
            this.b(f3);
        }
    }

    private boolean U() {
        if (this.K == 0.0f || !this.a) {
            return false;
        }
        class_310 class_3102 = class_310.method_1551();
        return class_3102.field_1690.method_31044().method_31034();
    }

    private void b(float f2) {
        float f3;
        class_310 class_3102 = class_310.method_1551();
        this.N();
        int n2 = this.r > 0 ? this.r : 60;
        float f4 = f3 = this.K;
        if (this.I) {
            float f5;
            float f6 = f5 = n2 > 0 ? this.o / (float)n2 : 1.0f;
            if (f5 < 1.0f) {
                f5 = 1.0f;
            }
            f4 = f3 * f5;
            if (f5 > 1.0f) {
                this.D = (int)(100.0f * f5);
            }
        } else {
            this.D = 100;
        }
        if (this.P != f4) {
            this.A.setUniformValue("BlendFactor", f4);
            this.P = f4;
        }
        this.A.setUniformValue("view_res", (float)class_3102.method_1522().field_1480, (float)class_3102.method_1522().field_1477);
        this.A.setUniformValue("view_pixel_size", 1.0f / (float)class_3102.method_1522().field_1480, 1.0f / (float)class_3102.method_1522().field_1477);
        this.A.setUniformValue("motionBlurSamples", this.D);
        this.A.setUniformValue("blurAlgorithm", this.i);
        this.A.setUniformValue("useDepth", this.x ? 1 : 0);
        this.A.render(f2);
    }

    public void W(Matrix4f matrix4f, Matrix4f matrix4f2, Matrix4f matrix4f3, Matrix4f matrix4f4, Vector3f vector3f, Vector3f vector3f2) {
        this.A.setUniformValue("modelView", new Matrix4f((Matrix4fc)matrix4f));
        this.A.setUniformValue("prevModelView", new Matrix4f((Matrix4fc)matrix4f2));
        this.A.setUniformValue("projection", new Matrix4f((Matrix4fc)matrix4f3));
        this.A.setUniformValue("prevProjection", new Matrix4f((Matrix4fc)matrix4f4));
        this.A.setUniformValue("projInverse", new Matrix4f((Matrix4fc)matrix4f3).invert());
        this.A.setUniformValue("mvInverse", new Matrix4f((Matrix4fc)matrix4f).invert());
        this.A.setUniformValue("cameraPos", vector3f.x, vector3f.y, vector3f.z);
        this.A.setUniformValue("prevCameraPos", vector3f2.x, vector3f2.y, vector3f2.z);
    }

    private void N() {
        long l2 = System.nanoTime();
        if (l2 - this.H < 1000000000L) {
            return;
        }
        this.H = l2;
        class_310 class_3102 = class_310.method_1551();
        if (class_3102 == null || class_3102.method_22683() == null) {
            return;
        }
        long l3 = class_3102.method_22683().method_4490();
        long l4 = GLFW.glfwGetWindowMonitor((long)l3);
        if (l4 == 0L) {
            l4 = this.X(l3, class_3102.method_22683().method_4480(), class_3102.method_22683().method_4507());
        }
        if (l4 != this.b) {
            this.r = this.t(l4);
            this.b = l4;
        }
    }

    private long X(long l2, int n2, int n3) {
        int[] nArray = new int[1];
        int[] nArray2 = new int[1];
        GLFW.glfwGetWindowPos((long)l2, (int[])nArray, (int[])nArray2);
        int n4 = nArray[0] + n2 / 2;
        int n5 = nArray2[0] + n3 / 2;
        long l3 = GLFW.glfwGetPrimaryMonitor();
        PointerBuffer pointerBuffer = GLFW.glfwGetMonitors();
        if (pointerBuffer != null) {
            for (int i2 = 0; i2 < pointerBuffer.limit(); ++i2) {
                long l4 = pointerBuffer.get(i2);
                int[] nArray3 = new int[1];
                int[] nArray4 = new int[1];
                GLFW.glfwGetMonitorPos((long)l4, (int[])nArray3, (int[])nArray4);
                GLFWVidMode gLFWVidMode = GLFW.glfwGetVideoMode((long)l4);
                if (gLFWVidMode == null) continue;
                int n6 = gLFWVidMode.width();
                int n7 = gLFWVidMode.height();
                if (n4 < nArray3[0] || n4 >= nArray3[0] + n6 || n5 < nArray4[0] || n5 >= nArray4[0] + n7) continue;
                l3 = l4;
                break;
            }
        }
        return l3;
    }

    private int t(long l2) {
        GLFWVidMode gLFWVidMode = GLFW.glfwGetVideoMode((long)l2);
        return gLFWVidMode != null ? gLFWVidMode.refreshRate() : 60;
    }

    private void lambda$new$0(ManagedShaderEffect managedShaderEffect) {
        managedShaderEffect.setUniformValue("BlendFactor", this.K);
    }
}

