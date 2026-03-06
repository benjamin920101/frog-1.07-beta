/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.resource.language.I18n
 *  net.minecraft.text.Text
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.gui.screen.option.OptionsScreen
 *  net.minecraft.client.gui.screen.Screen
 *  net.minecraft.client.gui.screen.multiplayer.MultiplayerScreen
 *  net.minecraft.client.gui.screen.world.SelectWorldScreen
 */
package dev.idhammai.c.y.j;

import dev.idhammai.Frog;
import dev.idhammai.c.y.j.R;
import dev.idhammai.p.J.n;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.resource.language.I18n;
import net.minecraft.text.Text;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.option.OptionsScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.multiplayer.MultiplayerScreen;
import net.minecraft.client.gui.screen.world.SelectWorldScreen;

public class c
extends class_437 {
    private final List<R> m = new ArrayList<R>();
    private long w = 0L;
    private static final long x = 800L;
    private static final long G = 80L;
    private static final int W = 1280;
    private static final int t = 720;
    private static final float y = 0.8f;

    public c() {
        super(class_2561.method_30163((String)"FrogMainMenu"));
    }

    public boolean method_25421() {
        return false;
    }

    public boolean method_25422() {
        return false;
    }

    protected void method_25426() {
        if (this.w == 0L) {
            this.w = System.currentTimeMillis();
        }
        this.G();
    }

    public void method_25410(class_310 class_3102, int n2, int n3) {
        super.method_25410(class_3102, n2, n3);
        this.G();
    }

    private float g() {
        float f2 = (float)this.field_22789 / 1280.0f;
        float f3 = (float)this.field_22790 / 720.0f;
        return Math.max(0.8f, Math.min(f2, f3));
    }

    private void G() {
        this.m.clear();
        class_310 class_3102 = class_310.method_1551();
        float f2 = this.g();
        int n2 = this.field_22789 / 2;
        int n3 = this.field_22790 / 2 - (int)(40.0f * f2);
        int n4 = Math.max(120, (int)(200.0f * f2));
        int n5 = Math.max(16, (int)(20.0f * f2));
        int n6 = (int)(24.0f * f2);
        int n7 = n2 - n4 / 2;
        this.m.add(new R(n7, n3, n4, n5, class_1074.method_4662((String)"menu.singleplayer", (Object[])new Object[0]), () -> this.lambda$updateLayout$0(class_3102)));
        this.m.add(new R(n7, n3 + n6, n4, n5, class_1074.method_4662((String)"menu.multiplayer", (Object[])new Object[0]), () -> this.lambda$updateLayout$1(class_3102), class_3102.method_29043()));
        this.m.add(new R(n7, n3 + n6 * 2, n4, n5, "Frog Client", c::lambda$updateLayout$2, false));
        int n8 = n3 + n6 * 3 + (int)(4.0f * f2);
        int n9 = n4 / 2;
        int n10 = (int)(4.0f * f2);
        this.m.add(new R(n7, n8, n9 - n10, n5, class_1074.method_4662((String)"menu.options", (Object[])new Object[0]), () -> this.lambda$updateLayout$3(class_3102)));
        this.m.add(new R(n7 + n9 + n10, n8, n9 - n10, n5, class_1074.method_4662((String)"menu.quit", (Object[])new Object[0]), () -> ((class_310)class_3102).method_1592()));
    }

    public void method_25394(class_332 class_3322, int n2, int n3, float f2) {
        Frog.SHADER.J();
        long l2 = System.currentTimeMillis() - this.w;
        this.R(class_3322, l2);
        this.a(class_3322, n2, n3, l2);
        this.N(class_3322, l2);
    }

    private void R(class_332 class_3322, long l2) {
        float f2 = Math.min(1.0f, (float)l2 / 800.0f);
        int n2 = Math.min(255, (int)(255.0f * (f2 = 1.0f - (1.0f - f2) * (1.0f - f2))));
        if (n2 <= 0) {
            return;
        }
        float f3 = this.g();
        float f4 = (float)this.field_22790 / 5.0f;
        String string = "Frog Client";
        if (n.t != null) {
            class_3322.method_51448().method_22903();
            float f5 = 1.25f * f3;
            class_3322.method_51448().method_22905(f5, f5, 1.0f);
            float f6 = n.t.b(string) * f5;
            float f7 = ((float)this.field_22789 - f6) / 2.0f / f5;
            float f8 = f4 / f5;
            n.t.H(class_3322.method_51448(), string, f7, f8, new Color(255, 255, 255, n2).getRGB(), false);
            class_3322.method_51448().method_22909();
        } else {
            float f9 = dev.idhammai.P.A.S.n.H(string);
            dev.idhammai.P.A.S.n.K(class_3322, string, (double)((float)this.field_22789 - f9) / 2.0, f4, new Color(255, 255, 255, n2).getRGB());
        }
    }

    private void a(class_332 class_3322, int n2, int n3, long l2) {
        float f2 = this.g();
        for (int i2 = 0; i2 < this.m.size(); ++i2) {
            float f3;
            R r2 = this.m.get(i2);
            long l3 = l2 - (long)i2 * 80L;
            if (l3 <= 0L) {
                f3 = 0.0f;
            } else if (l3 >= 800L) {
                f3 = 1.0f;
            } else {
                f3 = (float)l3 / 800.0f;
                f3 = 1.0f - (1.0f - f3) * (1.0f - f3);
            }
            if (f3 <= 0.0f) continue;
            boolean bl = n2 >= r2.K && n2 <= r2.K + r2.S && n3 >= r2.U && n3 <= r2.U + r2.d;
            r2.l(class_3322, bl, f3, f2);
        }
    }

    private void N(class_332 class_3322, long l2) {
        float f2 = Math.min(1.0f, (float)l2 / 800.0f);
        int n2 = Math.min(255, (int)(200.0f * (f2 = 1.0f - (1.0f - f2) * (1.0f - f2))));
        if (n2 <= 0) {
            return;
        }
        String string = class_310.method_1551().method_1548().method_1676();
        if (string == null || string.isEmpty()) {
            return;
        }
        int n3 = new Color(255, 255, 255, n2).getRGB();
        if (n.w != null) {
            float f3 = n.w.b(string);
            n.w.H(class_3322.method_51448(), string, (float)this.field_22789 - f3 - 5.0f, 8.0, n3, false);
        } else {
            float f4 = dev.idhammai.P.A.S.n.H(string);
            dev.idhammai.P.A.S.n.K(class_3322, string, (float)this.field_22789 - f4 - 5.0f, 8.0, n3);
        }
    }

    public boolean method_25402(double d2, double d3, int n2) {
        if (n2 == 0) {
            for (R r2 : this.m) {
                if (!r2.N || !(d2 >= (double)r2.K) || !(d2 <= (double)(r2.K + r2.S)) || !(d3 >= (double)r2.U) || !(d3 <= (double)(r2.U + r2.d))) continue;
                r2.u();
                return true;
            }
        }
        return super.method_25402(d2, d3, n2);
    }

    private void lambda$updateLayout$3(class_310 class_3102) {
        class_3102.method_1507((class_437)new class_429((class_437)this, class_3102.field_1690));
    }

    private static void lambda$updateLayout$2() {
    }

    private void lambda$updateLayout$1(class_310 class_3102) {
        class_3102.method_1507((class_437)new class_500((class_437)this));
    }

    private void lambda$updateLayout$0(class_310 class_3102) {
        class_3102.method_1507((class_437)new class_526((class_437)this));
    }
}

