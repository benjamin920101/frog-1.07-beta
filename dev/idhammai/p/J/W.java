/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.platform.GlStateManager
 *  com.mojang.blaze3d.platform.GlStateManager$DstFactor
 *  com.mojang.blaze3d.platform.GlStateManager$SrcFactor
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.client.gl.Framebuffer
 *  net.minecraft.client.gl.PostEffectProcessor
 *  net.minecraft.util.Identifier
 *  net.minecraft.client.MinecraftClient
 *  org.jetbrains.annotations.NotNull
 *  org.ladysnake.satin.api.managed.ManagedShaderEffect
 *  org.ladysnake.satin.api.managed.ShaderEffectManager
 */
package dev.idhammai.p.J;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import dev.idhammai.P.A.A.h;
import dev.idhammai.P.A.J;
import dev.idhammai.P.V.S;
import dev.idhammai.c.r.q.N.P;
import dev.idhammai.c.r.q.n.F;
import dev.idhammai.p.J.a;
import dev.idhammai.p.J.g;
import dev.idhammai.p.J.u;
import java.awt.Color;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.gl.PostEffectProcessor;
import net.minecraft.util.Identifier;
import net.minecraft.client.MinecraftClient;
import org.jetbrains.annotations.NotNull;
import org.ladysnake.satin.api.managed.ManagedShaderEffect;
import org.ladysnake.satin.api.managed.ShaderEffectManager;

public class W
implements J {
    static final h h = new h();
    private static final List<a> V = new ArrayList<a>();
    public static ManagedShaderEffect Z;
    public static ManagedShaderEffect F;
    public static ManagedShaderEffect b;
    public static ManagedShaderEffect M;
    public static ManagedShaderEffect B;
    public static ManagedShaderEffect T;
    public static ManagedShaderEffect u;
    public static ManagedShaderEffect m;
    public static ManagedShaderEffect P;
    public static ManagedShaderEffect S;
    public static ManagedShaderEffect f;
    public static ManagedShaderEffect D;
    public static ManagedShaderEffect e;
    public static ManagedShaderEffect L;
    public float d = 0.0f;
    private g o;
    private boolean X = false;
    private boolean p = false;
    private u A = dev.idhammai.p.J.u.Rainbow;
    private final List<Runnable> j = new ArrayList<Runnable>();
    private boolean a = false;
    private final Deque<int[]> O = new ArrayDeque<int[]>();

    public boolean s() {
        return this.X;
    }

    public boolean P() {
        return this.a;
    }

    public void Q(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (this.X && !this.a) {
            this.j.add(runnable);
        } else {
            runnable.run();
        }
    }

    public void k(int n2, int n3, int n4, int n5) {
        int[] nArray = this.O.peek();
        if (nArray != null) {
            int n6 = Math.max(nArray[0], n2);
            int n7 = Math.max(nArray[1], n3);
            int n8 = Math.min(nArray[2], n4);
            int n9 = Math.min(nArray[3], n5);
            if (n8 <= n6 || n9 <= n7) {
                this.O.push(new int[]{0, 0, 0, 0});
            } else {
                this.O.push(new int[]{n6, n7, n8, n9});
            }
            return;
        }
        this.O.push(new int[]{n2, n3, n4, n5});
    }

    public void E() {
        if (!this.O.isEmpty()) {
            this.O.pop();
        }
    }

    public int[] h() {
        return this.O.peek();
    }

    public void K(Runnable runnable, u u2) {
        V.add(new a(runnable, u2));
    }

    public void o() {
        V.forEach(this::lambda$renderShaders$0);
        V.clear();
    }

    public void V(float f2) {
        if (this.m()) {
            return;
        }
        float f3 = Math.max(0.0f, Math.min(1.0f, f2));
        if (f3 <= 0.0f) {
            return;
        }
        P p2 = dev.idhammai.c.r.q.N.P.M();
        float f4 = p2 != null ? p2.k.Z() : 1.0f;
        this.d = (float)h.k() / 5.0f * f4 * 0.004f;
        f.setUniformValue("time", this.d);
        f.setUniformValue("alpha", f3);
        f.render(W.method_60646().method_60637(true));
    }

    public void T(float f2) {
        if (this.m()) {
            return;
        }
        float f3 = Math.max(0.0f, Math.min(1.0f, f2));
        if (f3 <= 0.0f) {
            return;
        }
        P p2 = dev.idhammai.c.r.q.N.P.M();
        float f4 = p2 != null ? p2.k.Z() : 1.0f;
        this.d = (float)h.k() / 5.0f * f4 * 0.004f;
        D.setUniformValue("time", this.d);
        D.setUniformValue("alpha", f3);
        D.render(W.method_60646().method_60637(true));
    }

    public void c() {
        if (this.m()) {
            return;
        }
        RenderSystem.assertOnRenderThreadOrInit();
        class_276 class_2762 = class_310.method_1551().method_1522();
        if (this.o.field_1482 != class_2762.field_1482 || this.o.field_1481 != class_2762.field_1481) {
            this.o.method_1234(class_2762.field_1482, class_2762.field_1481, false);
        }
        this.o.method_1236(0.0f, 0.0f, 0.0f, 1.0f);
        this.o.method_1230(false);
        this.o.method_1236(0.0f, 0.0f, 0.0f, 0.0f);
        GlStateManager._glBindFramebuffer((int)36009, (int)class_2762.field_1476);
        class_2762.method_1235(false);
        ManagedShaderEffect managedShaderEffect = u;
        class_279 class_2792 = managedShaderEffect.getShaderEffect();
        if (class_2792 == null) {
            return;
        }
        ((S)class_2792).frogClient$addHook("bufIn", this.o);
        class_276 class_2763 = class_2792.method_1264("bufOut");
        if (class_2763 == null) {
            return;
        }
        P p2 = dev.idhammai.c.r.q.N.P.M();
        F f2 = dev.idhammai.c.r.q.n.F.I;
        float f3 = p2 != null ? p2.k.Z() : 1.0f;
        this.d = (float)h.k() / 5.0f * f3 * 0.004f;
        Color color = p2 != null ? p2.p9.P() : Color.WHITE;
        Color color2 = p2 != null ? p2.X.P() : Color.WHITE;
        Color color3 = p2 != null ? p2.n.P() : Color.WHITE;
        int n2 = f2 != null ? (int)f2.Y.e() : 10;
        managedShaderEffect.setUniformValue("alpha1", 1.0f);
        managedShaderEffect.setUniformValue("radius", 0.0f);
        managedShaderEffect.setUniformValue("quality", 1.0f);
        managedShaderEffect.setUniformValue("divider", 150.0f);
        managedShaderEffect.setUniformValue("maxSample", 10.0f);
        managedShaderEffect.setUniformValue("first", (float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, 1.0f);
        managedShaderEffect.setUniformValue("second", (float)color2.getRed() / 255.0f, (float)color2.getGreen() / 255.0f, (float)color2.getBlue() / 255.0f);
        managedShaderEffect.setUniformValue("third", (float)color3.getRed() / 255.0f, (float)color3.getGreen() / 255.0f, (float)color3.getBlue() / 255.0f);
        managedShaderEffect.setUniformValue("oct", n2);
        managedShaderEffect.setUniformValue("resolution", (float)W.method_22683().method_4486(), (float)W.method_22683().method_4502());
        managedShaderEffect.setUniformValue("time", this.d);
        managedShaderEffect.render(W.method_60646().method_60637(true));
        this.o.method_1230(false);
        class_2762.method_1235(false);
        RenderSystem.enableBlend();
        RenderSystem.blendFuncSeparate((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE_MINUS_SRC_ALPHA, (GlStateManager.class_4535)GlStateManager.class_4535.ZERO, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
        RenderSystem.backupProjectionMatrix();
        class_2763.method_22594(class_2763.field_1482, class_2763.field_1481, false);
        RenderSystem.restoreProjectionMatrix();
        RenderSystem.disableBlend();
    }

    public void J() {
        if (this.m()) {
            return;
        }
        RenderSystem.assertOnRenderThreadOrInit();
        class_276 class_2762 = class_310.method_1551().method_1522();
        if (this.o.field_1482 != class_2762.field_1482 || this.o.field_1481 != class_2762.field_1481) {
            this.o.method_1234(class_2762.field_1482, class_2762.field_1481, false);
        }
        this.o.method_1230(false);
        GlStateManager._glBindFramebuffer((int)36009, (int)class_2762.field_1476);
        class_2762.method_1235(false);
        ManagedShaderEffect managedShaderEffect = L;
        class_279 class_2792 = managedShaderEffect.getShaderEffect();
        if (class_2792 == null) {
            return;
        }
        ((S)class_2792).frogClient$addHook("bufIn", this.o);
        class_276 class_2763 = class_2792.method_1264("bufOut");
        if (class_2763 == null) {
            return;
        }
        float f2 = (float)((double)(System.currentTimeMillis() % 1000000L) / 1000.0);
        managedShaderEffect.setUniformValue("time", f2);
        managedShaderEffect.setUniformValue("resolution", (float)W.method_22683().method_4486(), (float)W.method_22683().method_4502());
        managedShaderEffect.render(W.method_60646().method_60637(true));
        this.o.method_1230(false);
        class_2762.method_1235(false);
        RenderSystem.enableBlend();
        RenderSystem.blendFuncSeparate((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE_MINUS_SRC_ALPHA, (GlStateManager.class_4535)GlStateManager.class_4535.ZERO, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
        RenderSystem.backupProjectionMatrix();
        class_2763.method_22594(class_2763.field_1482, class_2763.field_1481, false);
        RenderSystem.restoreProjectionMatrix();
        RenderSystem.disableBlend();
    }

    public void r(float f2, float f3) {
        if (this.m()) {
            return;
        }
        float f4 = Math.max(0.0f, Math.min(1.0f, f3));
        if (f4 <= 0.0f) {
            return;
        }
        e.setUniformValue("Radius", f2);
        e.setUniformValue("Alpha", f4);
        e.render(W.method_60646().method_60637(true));
    }

    public void Y(Runnable runnable, u u2) {
        if (this.m()) {
            return;
        }
        RenderSystem.assertOnRenderThreadOrInit();
        class_276 class_2762 = class_310.method_1551().method_1522();
        if (this.o.field_1482 != class_2762.field_1482 || this.o.field_1481 != class_2762.field_1481) {
            this.o.method_1234(class_2762.field_1482, class_2762.field_1481, false);
        }
        GlStateManager._glBindFramebuffer((int)36009, (int)this.o.field_1476);
        this.o.method_1235(true);
        runnable.run();
        this.o.method_1240();
        GlStateManager._glBindFramebuffer((int)36009, (int)class_2762.field_1476);
        class_2762.method_1235(false);
        ManagedShaderEffect managedShaderEffect = this.s(u2);
        class_279 class_2792 = managedShaderEffect.getShaderEffect();
        if (class_2792 == null) {
            return;
        }
        ((S)class_2792).frogClient$addHook("bufIn", this.o);
        class_276 class_2763 = class_2792.method_1264("bufOut");
        if (class_2763 == null) {
            return;
        }
        this.S(u2, managedShaderEffect);
        this.o.method_1230(false);
        class_2762.method_1235(false);
        RenderSystem.enableBlend();
        RenderSystem.blendFuncSeparate((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE_MINUS_SRC_ALPHA, (GlStateManager.class_4535)GlStateManager.class_4535.ZERO, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
        RenderSystem.backupProjectionMatrix();
        class_2763.method_22594(class_2763.field_1482, class_2763.field_1481, false);
        RenderSystem.restoreProjectionMatrix();
        RenderSystem.disableBlend();
    }

    public void m(Runnable runnable, float f2) {
        if (this.m()) {
            return;
        }
        RenderSystem.assertOnRenderThreadOrInit();
        class_276 class_2762 = class_310.method_1551().method_1522();
        if (this.o.field_1482 != class_2762.field_1482 || this.o.field_1481 != class_2762.field_1481) {
            this.o.method_1234(class_2762.field_1482, class_2762.field_1481, false);
        }
        GlStateManager._glBindFramebuffer((int)36009, (int)this.o.field_1476);
        this.o.method_1235(true);
        runnable.run();
        this.o.method_1240();
        GlStateManager._glBindFramebuffer((int)36009, (int)class_2762.field_1476);
        class_2762.method_1235(false);
        ManagedShaderEffect managedShaderEffect = this.s(dev.idhammai.p.J.u.Rainbow);
        class_279 class_2792 = managedShaderEffect.getShaderEffect();
        if (class_2792 == null) {
            return;
        }
        ((S)class_2792).frogClient$addHook("bufIn", this.o);
        class_276 class_2763 = class_2792.method_1264("bufOut");
        if (class_2763 == null) {
            return;
        }
        F f3 = dev.idhammai.c.r.q.n.F.I;
        this.d = (float)h.k() / 5.0f * f3.e.Z() * 0.004f;
        float f4 = Math.max(0.0f, Math.min(1.0f, f2));
        managedShaderEffect.setUniformValue("alpha2", f4);
        managedShaderEffect.setUniformValue("radius", f3.f.Z());
        managedShaderEffect.setUniformValue("quality", f3.F.Z());
        managedShaderEffect.setUniformValue("divider", f3.c.Z());
        managedShaderEffect.setUniformValue("maxSample", f3.J.Z());
        managedShaderEffect.setUniformValue("resolution", (float)W.method_22683().method_4486(), (float)W.method_22683().method_4502());
        managedShaderEffect.setUniformValue("time", this.d);
        managedShaderEffect.render(W.method_60646().method_60637(true));
        this.o.method_1230(false);
        class_2762.method_1235(false);
        RenderSystem.enableBlend();
        RenderSystem.blendFuncSeparate((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE_MINUS_SRC_ALPHA, (GlStateManager.class_4535)GlStateManager.class_4535.ZERO, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
        RenderSystem.backupProjectionMatrix();
        class_2763.method_22594(class_2763.field_1482, class_2763.field_1481, false);
        RenderSystem.restoreProjectionMatrix();
        RenderSystem.disableBlend();
    }

    public void n(u u2) {
        if (this.m()) {
            return;
        }
        this.X = true;
        this.p = false;
        this.A = u2 != null ? u2 : dev.idhammai.p.J.u.Rainbow;
        this.O.clear();
        RenderSystem.assertOnRenderThreadOrInit();
        class_276 class_2762 = class_310.method_1551().method_1522();
        if (this.o.field_1482 != class_2762.field_1482 || this.o.field_1481 != class_2762.field_1481) {
            this.o.method_1234(class_2762.field_1482, class_2762.field_1481, false);
        }
        this.o.method_1230(false);
    }

    public void u(Runnable runnable) {
        if (!this.X) {
            if (this.m()) {
                return;
            }
            RenderSystem.assertOnRenderThreadOrInit();
            u u2 = dev.idhammai.p.J.u.Rainbow;
            P p2 = dev.idhammai.c.r.q.N.P.M();
            if (p2 != null) {
                u2 = p2.q();
            }
            this.X = true;
            this.p = false;
            this.A = u2 != null ? u2 : dev.idhammai.p.J.u.Rainbow;
            this.O.clear();
            class_276 class_2762 = class_310.method_1551().method_1522();
            if (this.o.field_1482 != class_2762.field_1482 || this.o.field_1481 != class_2762.field_1481) {
                this.o.method_1234(class_2762.field_1482, class_2762.field_1481, false);
            }
            this.o.method_1230(false);
            GlStateManager._glBindFramebuffer((int)36009, (int)this.o.field_1476);
            this.o.method_1235(false);
            runnable.run();
            this.o.method_1240();
            GlStateManager._glBindFramebuffer((int)36009, (int)class_2762.field_1476);
            class_2762.method_1235(false);
            this.p = true;
            this.v();
            return;
        }
        if (this.m()) {
            return;
        }
        RenderSystem.assertOnRenderThreadOrInit();
        class_276 class_2763 = class_310.method_1551().method_1522();
        if (this.o.field_1482 != class_2763.field_1482 || this.o.field_1481 != class_2763.field_1481) {
            this.o.method_1234(class_2763.field_1482, class_2763.field_1481, false);
        }
        GlStateManager._glBindFramebuffer((int)36009, (int)this.o.field_1476);
        this.o.method_1235(false);
        runnable.run();
        this.o.method_1240();
        GlStateManager._glBindFramebuffer((int)36009, (int)class_2763.field_1476);
        class_2763.method_1235(false);
        this.p = true;
    }

    public void v() {
        if (!this.X) {
            return;
        }
        this.X = false;
        if (!this.p) {
            if (!this.a) {
                this.O();
            }
            return;
        }
        RenderSystem.assertOnRenderThreadOrInit();
        class_276 class_2762 = class_310.method_1551().method_1522();
        u u2 = this.A != null ? this.A : dev.idhammai.p.J.u.Rainbow;
        ManagedShaderEffect managedShaderEffect = this.s(u2);
        class_279 class_2792 = managedShaderEffect.getShaderEffect();
        if (class_2792 == null) {
            return;
        }
        ((S)class_2792).frogClient$addHook("bufIn", this.o);
        class_276 class_2763 = class_2792.method_1264("bufOut");
        if (class_2763 == null) {
            return;
        }
        this.C(u2, managedShaderEffect);
        this.o.method_1230(false);
        class_2762.method_1235(false);
        RenderSystem.enableBlend();
        RenderSystem.blendFuncSeparate((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE_MINUS_SRC_ALPHA, (GlStateManager.class_4535)GlStateManager.class_4535.ZERO, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
        RenderSystem.backupProjectionMatrix();
        class_2763.method_22594(class_2763.field_1482, class_2763.field_1481, false);
        RenderSystem.restoreProjectionMatrix();
        RenderSystem.disableBlend();
        this.p = false;
        if (!this.a) {
            this.O();
        }
    }

    private void O() {
        if (this.j.isEmpty()) {
            return;
        }
        this.a = true;
        RenderSystem.enableBlend();
        RenderSystem.blendFuncSeparate((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE_MINUS_SRC_ALPHA, (GlStateManager.class_4535)GlStateManager.class_4535.ZERO, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
        RenderSystem.disableDepthTest();
        RenderSystem.depthMask((boolean)true);
        float f2 = 1.0f;
        P p2 = dev.idhammai.c.r.q.N.P.M();
        if (p2 != null) {
            f2 = (float)p2.pO;
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f2 > 1.0f) {
                f2 = 1.0f;
            }
        }
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)f2);
        for (Runnable runnable : this.j) {
            runnable.run();
        }
        RenderSystem.disableBlend();
        this.j.clear();
        this.a = false;
    }

    public ManagedShaderEffect s(@NotNull u u2) {
        return switch (u2.ordinal()) {
            case 0 -> u;
            case 1 -> m;
            case 2 -> P;
            case 3 -> S;
            default -> T;
        };
    }

    public ManagedShaderEffect B(@NotNull u u2) {
        return switch (u2.ordinal()) {
            case 0 -> F;
            case 1 -> b;
            case 2 -> M;
            case 3 -> B;
            default -> Z;
        };
    }

    private void C(u u2, ManagedShaderEffect managedShaderEffect) {
        P p2 = dev.idhammai.c.r.q.N.P.M();
        float f2 = p2 != null ? p2.k.Z() : 1.0f;
        this.d = (float)h.k() / 5.0f * f2 * 0.004f;
        float f3 = 0.0f;
        float f4 = 1.0f;
        float f5 = 150.0f;
        float f6 = 10.0f;
        int n2 = 10;
        if (u2 == dev.idhammai.p.J.u.Rainbow || u2 == dev.idhammai.p.J.u.Water) {
            managedShaderEffect.setUniformValue("alpha2", 1.0f);
            managedShaderEffect.setUniformValue("radius", f3);
            managedShaderEffect.setUniformValue("quality", f4);
            managedShaderEffect.setUniformValue("divider", f5);
            managedShaderEffect.setUniformValue("maxSample", f6);
            managedShaderEffect.setUniformValue("resolution", (float)W.method_22683().method_4486(), (float)W.method_22683().method_4502());
            managedShaderEffect.setUniformValue("time", this.d);
            managedShaderEffect.render(W.method_60646().method_60637(true));
        } else if (u2 == dev.idhammai.p.J.u.Smoke) {
            Color color = p2 != null ? p2.p9.P() : Color.WHITE;
            Color color2 = p2 != null ? p2.X.P() : Color.WHITE;
            Color color3 = p2 != null ? p2.n.P() : Color.WHITE;
            managedShaderEffect.setUniformValue("alpha1", 1.0f);
            managedShaderEffect.setUniformValue("radius", f3);
            managedShaderEffect.setUniformValue("quality", f4);
            managedShaderEffect.setUniformValue("divider", f5);
            managedShaderEffect.setUniformValue("maxSample", f6);
            managedShaderEffect.setUniformValue("first", (float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, 1.0f);
            managedShaderEffect.setUniformValue("second", (float)color2.getRed() / 255.0f, (float)color2.getGreen() / 255.0f, (float)color2.getBlue() / 255.0f);
            managedShaderEffect.setUniformValue("third", (float)color3.getRed() / 255.0f, (float)color3.getGreen() / 255.0f, (float)color3.getBlue() / 255.0f);
            managedShaderEffect.setUniformValue("oct", n2);
            managedShaderEffect.setUniformValue("resolution", (float)W.method_22683().method_4486(), (float)W.method_22683().method_4502());
            managedShaderEffect.setUniformValue("time", this.d);
            managedShaderEffect.render(W.method_60646().method_60637(true));
        } else if (u2 == dev.idhammai.p.J.u.Snow) {
            Color color = p2 != null ? p2.p9.P() : Color.WHITE;
            managedShaderEffect.setUniformValue("color", (float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, 1.0f);
            managedShaderEffect.setUniformValue("radius", f3);
            managedShaderEffect.setUniformValue("quality", f4);
            managedShaderEffect.setUniformValue("divider", f5);
            managedShaderEffect.setUniformValue("maxSample", f6);
            managedShaderEffect.setUniformValue("resolution", (float)W.method_22683().method_4486(), (float)W.method_22683().method_4502());
            managedShaderEffect.setUniformValue("time", this.d);
            managedShaderEffect.render(W.method_60646().method_60637(true));
        }
    }

    public void S(u u2, ManagedShaderEffect managedShaderEffect) {
        F f2 = dev.idhammai.c.r.q.n.F.I;
        Color color = f2.K.P();
        this.d = (float)h.k() / 5.0f * f2.e.Z() * 0.004f;
        if (u2 == dev.idhammai.p.J.u.Rainbow || u2 == dev.idhammai.p.J.u.Water) {
            managedShaderEffect.setUniformValue("alpha2", (float)color.getAlpha() / 255.0f);
            managedShaderEffect.setUniformValue("radius", f2.f.Z());
            managedShaderEffect.setUniformValue("quality", f2.F.Z());
            managedShaderEffect.setUniformValue("divider", f2.c.Z());
            managedShaderEffect.setUniformValue("maxSample", f2.J.Z());
            managedShaderEffect.setUniformValue("resolution", (float)W.method_22683().method_4486(), (float)W.method_22683().method_4502());
            managedShaderEffect.setUniformValue("time", this.d);
            managedShaderEffect.render(W.method_60646().method_60637(true));
        } else if (u2 == dev.idhammai.p.J.u.Smoke) {
            managedShaderEffect.setUniformValue("alpha1", (float)color.getAlpha() / 255.0f);
            managedShaderEffect.setUniformValue("radius", f2.f.Z());
            managedShaderEffect.setUniformValue("quality", f2.F.Z());
            managedShaderEffect.setUniformValue("divider", f2.c.Z());
            managedShaderEffect.setUniformValue("maxSample", f2.J.Z());
            managedShaderEffect.setUniformValue("first", (float)f2.d.P().getRed() / 255.0f, (float)f2.d.P().getGreen() / 255.0f, (float)f2.d.P().getBlue() / 255.0f, (float)f2.d.P().getAlpha() / 255.0f);
            managedShaderEffect.setUniformValue("second", (float)f2.y.P().getRed() / 255.0f, (float)f2.y.P().getGreen() / 255.0f, (float)f2.y.P().getBlue() / 255.0f);
            managedShaderEffect.setUniformValue("third", (float)f2.X.P().getRed() / 255.0f, (float)f2.X.P().getGreen() / 255.0f, (float)f2.X.P().getBlue() / 255.0f);
            managedShaderEffect.setUniformValue("oct", (int)f2.Y.e());
            managedShaderEffect.setUniformValue("resolution", (float)W.method_22683().method_4486(), (float)W.method_22683().method_4502());
            managedShaderEffect.setUniformValue("time", this.d);
            managedShaderEffect.render(W.method_60646().method_60637(true));
        } else if (u2 == dev.idhammai.p.J.u.Snow) {
            managedShaderEffect.setUniformValue("color", (float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, (float)color.getAlpha() / 255.0f);
            managedShaderEffect.setUniformValue("radius", f2.f.Z());
            managedShaderEffect.setUniformValue("quality", f2.F.Z());
            managedShaderEffect.setUniformValue("divider", f2.c.Z());
            managedShaderEffect.setUniformValue("maxSample", f2.J.Z());
            managedShaderEffect.setUniformValue("resolution", (float)W.method_22683().method_4486(), (float)W.method_22683().method_4502());
            managedShaderEffect.setUniformValue("time", this.d);
            managedShaderEffect.render(W.method_60646().method_60637(true));
        }
    }

    public void j() {
        T = ShaderEffectManager.getInstance().manage(class_2960.method_60654((String)"shaders/post/outline.json"));
        u = ShaderEffectManager.getInstance().manage(class_2960.method_60654((String)"shaders/post/smoke.json"));
        m = ShaderEffectManager.getInstance().manage(class_2960.method_60654((String)"shaders/post/snow.json"));
        P = ShaderEffectManager.getInstance().manage(class_2960.method_60654((String)"shaders/post/rainbow.json"));
        S = ShaderEffectManager.getInstance().manage(class_2960.method_60654((String)"shaders/post/water.json"));
        f = ShaderEffectManager.getInstance().manage(class_2960.method_60654((String)"shaders/post/backgroundrain.json"));
        D = ShaderEffectManager.getInstance().manage(class_2960.method_60654((String)"shaders/post/backgroundrain2.json"));
        e = ShaderEffectManager.getInstance().manage(class_2960.method_60654((String)"shaders/post/backgroundblur.json"));
        L = ShaderEffectManager.getInstance().manage(class_2960.method_60654((String)"shaders/post/frogbg.json"));
        Z = ShaderEffectManager.getInstance().manage(class_2960.method_60654((String)"shaders/post/outline.json"), W::lambda$reloadShaders$1);
        F = ShaderEffectManager.getInstance().manage(class_2960.method_60654((String)"shaders/post/smoke.json"), W::lambda$reloadShaders$2);
        b = ShaderEffectManager.getInstance().manage(class_2960.method_60654((String)"shaders/post/snow.json"), W::lambda$reloadShaders$3);
        M = ShaderEffectManager.getInstance().manage(class_2960.method_60654((String)"shaders/post/rainbow.json"), W::lambda$reloadShaders$4);
        B = ShaderEffectManager.getInstance().manage(class_2960.method_60654((String)"shaders/post/water.json"), W::lambda$reloadShaders$5);
    }

    public boolean m() {
        if (u == null || m == null || P == null || S == null || T == null || f == null || D == null || e == null || L == null || F == null || b == null || M == null || B == null || Z == null || this.o == null) {
            if (W.method_1522() == null) {
                return true;
            }
            this.o = new g(W.W.method_1522().field_1482, W.W.method_1522().field_1481);
            this.j();
            return true;
        }
        return false;
    }

    private static void lambda$reloadShaders$5(ManagedShaderEffect managedShaderEffect) {
        class_279 class_2792 = managedShaderEffect.getShaderEffect();
        if (class_2792 == null) {
            return;
        }
        ((S)class_2792).frogClient$addHook("bufIn", W.W.field_1769.method_22990());
        ((S)class_2792).frogClient$addHook("bufOut", W.W.field_1769.method_22990());
    }

    private static void lambda$reloadShaders$4(ManagedShaderEffect managedShaderEffect) {
        class_279 class_2792 = managedShaderEffect.getShaderEffect();
        if (class_2792 == null) {
            return;
        }
        ((S)class_2792).frogClient$addHook("bufIn", W.W.field_1769.method_22990());
        ((S)class_2792).frogClient$addHook("bufOut", W.W.field_1769.method_22990());
    }

    private static void lambda$reloadShaders$3(ManagedShaderEffect managedShaderEffect) {
        class_279 class_2792 = managedShaderEffect.getShaderEffect();
        if (class_2792 == null) {
            return;
        }
        ((S)class_2792).frogClient$addHook("bufIn", W.W.field_1769.method_22990());
        ((S)class_2792).frogClient$addHook("bufOut", W.W.field_1769.method_22990());
    }

    private static void lambda$reloadShaders$2(ManagedShaderEffect managedShaderEffect) {
        class_279 class_2792 = managedShaderEffect.getShaderEffect();
        if (class_2792 == null) {
            return;
        }
        ((S)class_2792).frogClient$addHook("bufIn", W.W.field_1769.method_22990());
        ((S)class_2792).frogClient$addHook("bufOut", W.W.field_1769.method_22990());
    }

    private static void lambda$reloadShaders$1(ManagedShaderEffect managedShaderEffect) {
        class_279 class_2792 = managedShaderEffect.getShaderEffect();
        if (class_2792 == null) {
            return;
        }
        ((S)class_2792).frogClient$addHook("bufIn", W.W.field_1769.method_22990());
        ((S)class_2792).frogClient$addHook("bufOut", W.W.field_1769.method_22990());
    }

    private void lambda$renderShaders$0(a a2) {
        this.Y(a2.E(), a2.g());
    }
}

