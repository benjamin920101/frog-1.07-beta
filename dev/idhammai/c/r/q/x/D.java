/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_1747
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_2371
 *  net.minecraft.class_2480
 *  net.minecraft.class_2487
 *  net.minecraft.class_2499
 *  net.minecraft.class_308
 *  net.minecraft.class_332
 *  net.minecraft.class_437
 *  net.minecraft.class_7225$class_7874
 *  net.minecraft.class_742
 *  net.minecraft.class_9279
 *  net.minecraft.class_9323
 *  net.minecraft.class_9334
 *  org.lwjgl.opengl.GL11
 *  org.spongepowered.asm.mixin.Unique
 */
package dev.idhammai.c.r.q.x;

import com.mojang.blaze3d.systems.RenderSystem;
import dev.idhammai.Frog;
import dev.idhammai.P.A.S.o;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.asm.accessors.IContainerComponent;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.q.x.j;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import dev.idhammai.c.y.f;
import dev.idhammai.p.J.F;
import java.awt.Color;
import java.util.Arrays;
import java.util.HashMap;
import java.util.UUID;
import net.minecraft.class_1747;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2371;
import net.minecraft.class_2480;
import net.minecraft.class_2487;
import net.minecraft.class_2499;
import net.minecraft.class_308;
import net.minecraft.class_332;
import net.minecraft.class_437;
import net.minecraft.class_7225;
import net.minecraft.class_742;
import net.minecraft.class_9279;
import net.minecraft.class_9323;
import net.minecraft.class_9334;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.Unique;

public class D
extends y {
    private static final class_1799[] D = new class_1799[27];
    public static D M;
    private static int l;
    public final W c = this.S(new W("ToolTips", true).k("\u6f5c\u5f71\u76d2\u63d0\u793a"));
    public final W Y = this.S(new W("Icon", true).k("\u663e\u793a\u56fe\u6807"));
    private final HashMap<UUID, j> y = new HashMap();
    private final W a = this.S(new W("Peek", false).k("\u663e\u793a\u624b\u6301\u6f5c\u5f71\u76d2").D());
    private final l J = this.p(new l("RenderTime", 10.0, 0.0, 100.0, 0.1, this.a::f).D("\u663e\u793a\u65f6\u957f").P("s"));
    private final l A = this.p(new l("X", 0, 0, 1500, this.a::f).D("X\u504f\u79fb"));
    private final l e = this.p(new l("Y", 120, 0, 1000, this.a::f).D("Y\u504f\u79fb"));
    private final l T = this.p(new l("Space", 78.0, 0.0, 200.0, 1.0, this.a::f).D("\u95f4\u8ddd"));

    public D() {
        super("ShulkerViewer", w.Misc);
        this.L("\u6f5c\u5f71\u76d2\u67e5\u770b");
        M = this;
    }

    public static void i(class_332 class_3322, int n2, int n3, class_1799 class_17992) {
        dev.idhammai.c.r.q.x.D.P(class_17992, D);
        dev.idhammai.c.r.q.x.D.w(class_3322, n2, n3);
    }

    @Unique
    private static void w(class_332 class_3322, int n2, int n3) {
        RenderSystem.disableDepthTest();
        GL11.glClear((int)256);
        o.D(class_3322.method_51448(), n2 += 8, n3 -= 82, 176.0f, 67.0f, new Color(0, 0, 0, 120));
        class_308.method_24211();
        int n4 = 0;
        int n5 = 0;
        for (class_1799 class_17992 : D) {
            class_3322.method_51427(class_17992, n2 + 8 + n5 * 18, n3 + 7 + n4 * 18);
            class_3322.method_51431(dev.idhammai.c.r.q.x.D.W.field_1772, class_17992, n2 + 8 + n5 * 18, n3 + 7 + n4 * 18);
            if (++n5 < 9) continue;
            n5 = 0;
            ++n4;
        }
        class_308.method_24210();
        RenderSystem.enableDepthTest();
    }

    public static boolean g(class_1799 class_17992) {
        IContainerComponent iContainerComponent = (IContainerComponent)class_17992.method_57824(class_9334.field_49622);
        if (iContainerComponent != null && !iContainerComponent.getStacks().isEmpty()) {
            return true;
        }
        class_2487 class_24872 = ((class_9279)class_17992.method_57825(class_9334.field_49611, (Object)class_9279.field_49302)).method_57463();
        return class_24872 != null && class_24872.method_10573("Items", 9);
    }

    public static void P(class_1799 class_17992, class_1799[] class_1799Array) {
        block5: {
            class_9279 class_92792;
            class_9323 class_93232;
            block4: {
                if (class_17992.method_7909() == class_1802.field_8466) {
                    for (int i2 = 0; i2 < Frog.PLAYER.L.size(); ++i2) {
                        class_1799Array[i2] = (class_1799)Frog.PLAYER.L.get(i2);
                    }
                    return;
                }
                Arrays.fill(class_1799Array, class_1799.field_8037);
                class_93232 = class_17992.method_57353();
                if (!class_93232.method_57832(class_9334.field_49622)) break block4;
                IContainerComponent iContainerComponent = (IContainerComponent)class_93232.method_57829(class_9334.field_49622);
                class_2371<class_1799> class_23712 = iContainerComponent.getStacks();
                for (int i3 = 0; i3 < class_23712.size(); ++i3) {
                    if (i3 < 0 || i3 >= class_1799Array.length) continue;
                    class_1799Array[i3] = (class_1799)class_23712.get(i3);
                }
                break block5;
            }
            if (!class_93232.method_57832(class_9334.field_49611) || !(class_92792 = (class_9279)class_93232.method_57829(class_9334.field_49611)).method_57450("Items")) break block5;
            class_2499 class_24992 = (class_2499)class_92792.method_57463().method_10580("Items");
            for (int i4 = 0; i4 < class_24992.size(); ++i4) {
                byte by = class_24992.method_10602(i4).method_10571("Slot");
                if (by < 0 || by >= class_1799Array.length) continue;
                class_1799Array[by] = class_1799.method_57359((class_7225.class_7874)dev.idhammai.c.r.q.x.D.W.field_1724.method_56673(), (class_2487)class_24992.method_10602(i4));
            }
        }
    }

    public static boolean q(class_1799 class_17992, class_1799[] class_1799Array, boolean bl) {
        if (dev.idhammai.c.r.q.x.D.g(class_17992) || class_17992.method_7909() == class_1802.field_8466) {
            dev.idhammai.c.r.q.x.D.P(class_17992, class_1799Array);
            if (bl) {
                F.S = new f(class_17992, class_1799Array);
            } else {
                W.method_1507((class_437)new f(class_17992, class_1799Array));
            }
            return true;
        }
        return false;
    }

    @r
    public void K(QO qO) {
        if (this.a.h()) {
            for (class_742 class_7422 : Frog.THREAD.v()) {
                class_1747 class_17472;
                class_1799 class_17992 = class_7422.method_6047();
                class_1792 class_17922 = class_17992.method_7909();
                if (!(class_17922 instanceof class_1747) || !((class_17472 = (class_1747)class_17922).method_7711() instanceof class_2480)) {
                    class_17992 = class_7422.method_6079();
                }
                if (!((class_17922 = class_17992.method_7909()) instanceof class_1747) || !((class_17472 = (class_1747)class_17922).method_7711() instanceof class_2480)) continue;
                this.y.put(class_7422.method_7334().getId(), new j(this, class_17992, class_7422.method_7334().getName()));
            }
        }
    }

    @Override
    public void C(class_332 class_3322, float f2) {
        if (this.a.h()) {
            l = 0;
            this.y.values().removeIf(arg_0 -> D.lambda$onRender2D$0(class_3322, arg_0));
        }
    }

    private static boolean lambda$onRender2D$0(class_332 class_3322, j j2) {
        return j2.r(class_3322);
    }
}

