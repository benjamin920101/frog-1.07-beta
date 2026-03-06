/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_1263
 *  net.minecraft.class_1277
 *  net.minecraft.class_1733
 *  net.minecraft.class_1747
 *  net.minecraft.class_1767
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_2248
 *  net.minecraft.class_2480
 *  net.minecraft.class_2960
 *  net.minecraft.class_332
 *  net.minecraft.class_3872
 *  net.minecraft.class_3872$class_3931
 *  net.minecraft.class_437
 *  net.minecraft.class_495
 *  net.minecraft.class_757
 *  net.minecraft.class_9334
 */
package dev.idhammai.c.y;

import com.mojang.blaze3d.systems.RenderSystem;
import dev.idhammai.P.A.J;
import dev.idhammai.c.r.q.x.D;
import java.awt.Color;
import net.minecraft.class_1263;
import net.minecraft.class_1277;
import net.minecraft.class_1733;
import net.minecraft.class_1747;
import net.minecraft.class_1767;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2248;
import net.minecraft.class_2480;
import net.minecraft.class_2960;
import net.minecraft.class_332;
import net.minecraft.class_3872;
import net.minecraft.class_437;
import net.minecraft.class_495;
import net.minecraft.class_757;
import net.minecraft.class_9334;

public class f
extends class_495 {
    private final class_2960 d = class_2960.method_60654((String)"textures/gui/container/shulker_box.png");
    private final class_1799[] a;
    private final class_1799 V;

    public f(class_1799 class_17992, class_1799[] class_1799Array) {
        super(new class_1733(0, J.W.field_1724.method_31548(), (class_1263)new class_1277(class_1799Array)), J.W.field_1724.method_31548(), class_17992.method_7964());
        this.a = class_1799Array;
        this.V = class_17992;
    }

    public static Color M(class_1799 class_17992) {
        class_1747 class_17472;
        class_2248 class_22482;
        class_1792 class_17922 = class_17992.method_7909();
        if (class_17922 instanceof class_1747 && (class_22482 = (class_17472 = (class_1747)class_17922).method_7711()) instanceof class_2480) {
            class_2480 class_24802 = (class_2480)class_22482;
            class_1767 class_17672 = class_24802.method_10528();
            if (class_17672 == null) {
                return Color.WHITE;
            }
            int n2 = class_17672.method_7787();
            return new Color(n2);
        }
        return Color.WHITE;
    }

    public boolean method_25402(double d2, double d3, int n2) {
        if (n2 == 2 && this.field_2787 != null && !this.field_2787.method_7677().method_7960() && J.W.field_1724.field_7512.method_34255().method_7960()) {
            class_1799 class_17992 = this.field_2787.method_7677();
            if (D.g(class_17992) || class_17992.method_7909() == class_1802.field_8466) {
                return D.q(this.field_2787.method_7677(), this.a, false);
            }
            if (class_17992.method_57824(class_9334.field_49606) != null || class_17992.method_57824(class_9334.field_49653) != null) {
                this.method_25419();
                J.W.method_1507((class_437)new class_3872(class_3872.class_3931.method_17562((class_1799)class_17992)));
                return true;
            }
        }
        return false;
    }

    public boolean method_25406(double d2, double d3, int n2) {
        return false;
    }

    public boolean method_25404(int n2, int n3, int n4) {
        if (n2 == 256 || J.W.field_1690.field_1822.method_1417(n2, n3)) {
            this.method_25419();
            return true;
        }
        return false;
    }

    public boolean method_16803(int n2, int n3, int n4) {
        if (n2 == 256) {
            this.method_25419();
            return true;
        }
        return false;
    }

    protected void method_2389(class_332 class_3322, float f2, int n2, int n3) {
        Color color = f.M(this.V);
        RenderSystem.setShader(class_757::method_34542);
        RenderSystem.setShaderColor((float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)((float)color.getAlpha() / 255.0f));
        int n4 = (this.field_22789 - this.field_2792) / 2;
        int n5 = (this.field_22790 - this.field_2779) / 2;
        class_3322.method_25302(this.d, n4, n5, 0, 0, this.field_2792, this.field_2779);
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }
}

