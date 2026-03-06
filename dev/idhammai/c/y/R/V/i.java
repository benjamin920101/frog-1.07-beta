/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.Formatting
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.util.InputUtil
 *  net.minecraft.client.util.SelectionManager
 */
package dev.idhammai.c.y.R.V;

import dev.idhammai.P.A.A.h;
import dev.idhammai.c.r.O.Y.v;
import dev.idhammai.c.y.R.V.O;
import net.minecraft.util.Formatting;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.InputUtil;
import net.minecraft.client.util.SelectionManager;

public class i
extends O {
    private static final h m = new h();
    private static boolean I;
    private final v L;
    public boolean S;
    private String Y = "";

    public i(v v2) {
        super(v2.e());
        this.L = v2;
    }

    public static String a(String string) {
        String string2 = "";
        if (string != null && !string.isEmpty()) {
            string2 = string.substring(0, string.length() - 1);
        }
        return string2;
    }

    public static String v() {
        if (m.m(500L)) {
            I = !I;
            m.H();
        }
        if (I) {
            return "_";
        }
        return "";
    }

    @Override
    public void B(class_332 class_3322, int n2, int n3, float f2) {
        boolean bl = this.l(n2, n3);
        double d2 = this.G();
        float f3 = (float)this.u + 7.0f;
        float f4 = (float)this.a - 0.5f;
        float f5 = this.M(this.E, (float)this.a - 0.5f);
        if (this.S) {
            this.q(this.Y + i.v(), this.p + 2.3f, f5, this.m() ? g : R);
        } else if (this.l(n2, n3) && class_3675.method_15987((long)W.method_22683().method_4490(), (int)340)) {
            this.q("Reset Default", this.p + 2.3f, f5, g);
        } else {
            this.q(this.L.Q() + ": " + String.valueOf(class_124.field_1080) + this.L.q(), this.p + 2.3f, f5, this.m() ? g : R);
        }
    }

    @Override
    public void d(int n2, int n3, int n4) {
        if (n4 == 0 && this.l(n2, n3) && class_3675.method_15987((long)W.method_22683().method_4490(), (int)340)) {
            this.S = false;
            this.Y = "";
            this.L.z(this.L.w());
            i.L();
            return;
        }
        super.d(n2, n3, n4);
    }

    @Override
    public void G(char c2, int n2) {
        if (this.S) {
            this.y(this.Y + c2);
        }
    }

    @Override
    public void l(int n2) {
        if (this.S) {
            switch (n2) {
                case 256: {
                    this.S = false;
                    break;
                }
                case 257: 
                case 335: {
                    this.W();
                    break;
                }
                case 86: {
                    if (!class_3675.method_15987((long)W.method_22683().method_4490(), (int)341)) break;
                    this.y(this.Y + class_3728.method_27556((class_310)W));
                    break;
                }
                case 259: {
                    this.y(i.a(this.Y));
                }
            }
        }
    }

    @Override
    public void E() {
        this.q(!this.L.D());
    }

    private void W() {
        if (this.Y.isEmpty()) {
            this.L.z(this.L.w());
        } else {
            this.L.z(this.Y);
        }
        this.j();
    }

    @Override
    public void T() {
        this.y(this.L.q());
        this.S = !this.S;
    }

    @Override
    public boolean m() {
        return !this.S;
    }

    public void y(String string) {
        this.Y = string;
    }
}

