/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.SpawnGroup
 *  net.minecraft.entity.decoration.EndCrystalEntity
 *  net.minecraft.entity.ItemEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.client.util.math.MatrixStack
 */
package dev.idhammai.c.r.q.n;

import dev.idhammai.Frog;
import dev.idhammai.asm.accessors.IGameRenderer;
import dev.idhammai.c.r.O.Y.A;
import dev.idhammai.c.r.O.Y.B;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.q.n.s;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import dev.idhammai.p.J.u;
import java.awt.Color;
import java.util.Objects;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.util.math.MatrixStack;

public class F
extends y {
    public static F I;
    private final B<s> p = this.S(new B<s>("Page", s.Shader).I("\u9875\u9762"));
    public final B<u> j = this.S(new B<u>("Mode", u.Rainbow, this::lambda$new$0).I("\u6a21\u5f0f"));
    public final l e = this.p(new l("Speed", 4.0, 0.0, 20.0, 0.1, this::lambda$new$1).D("\u901f\u5ea6"));
    public final A K = this.y(new A("Color", this::lambda$new$2).P("\u989c\u8272"));
    public final l J = this.p(new l("MaxSample", 10.0, 0.0, 20.0, this::lambda$new$3).D("\u6700\u5927\u91c7\u6837"));
    public final l c = this.p(new l("Divider", 150.0, 0.0, 300.0, this::lambda$new$4).D("\u5206\u9891"));
    public final l f = this.p(new l("Radius", 2.0, 0.0, 6.0, this::lambda$new$5).D("\u534a\u5f84"));
    public final l F = this.p(new l("Smoothness", 1.0, 0.0, 1.0, 0.01, this::lambda$new$6).D("\u5e73\u6ed1\u5ea6"));
    public final l k = this.p(new l("GlowAlpha", 255, 0, 255, this::lambda$new$7).D("\u8f89\u5149\u900f\u660e\u5ea6"));
    public final l r = this.p(new l("MaxRange", 64, 16, 512, this::lambda$new$8).D("\u6700\u5927\u8303\u56f4"));
    public final l H = this.p(new l("PulseSize", 10.0, 0.0, 200.0, 0.1, this::lambda$new$9).D("\u8109\u51b2\u5c3a\u5bf8"));
    public final A M = this.y(new A("Pulse", new Color(255, 255, 255), this::lambda$new$10).P("\u8109\u51b2\u989c\u8272"));
    public final l G = this.p(new l("Step", 0.5, 0.0, 4.0, 0.01f, this::lambda$new$11).D("\u6b65\u8fdb"));
    public final l Y = this.p(new l("Octaves", 10, 5, 30, this::lambda$new$12).D("\u516b\u5ea6"));
    public final A d = this.y(new A("Color1", new Color(255, 255, 255), this::lambda$new$13).P("\u989c\u82721"));
    public final A y = this.y(new A("Color2", new Color(255, 255, 255), this::lambda$new$14).P("\u989c\u82722"));
    public final A X = this.y(new A("Color3", new Color(255, 255, 255), this::lambda$new$15).P("\u989c\u82723"));
    public final A h = this.y(new A("Color4", new Color(255, 255, 255), this::lambda$new$16).P("\u989c\u82724"));
    private final W Q = this.S(new W("Hands", true, this::lambda$new$17).k("\u624b\u90e8"));
    private final W V = this.S(new W("Self", true, this::lambda$new$18).k("\u81ea\u8eab"));
    private final W D = this.S(new W("Players", true, this::lambda$new$19).k("\u73a9\u5bb6"));
    private final W R = this.S(new W("Friends", true, this::lambda$new$20).k("\u597d\u53cb"));
    private final W l = this.S(new W("Crystals", true, this::lambda$new$21).k("\u6c34\u6676"));
    private final W C = this.S(new W("Creatures", false, this::lambda$new$22).k("\u751f\u7269"));
    private final W n = this.S(new W("Monsters", false, this::lambda$new$23).k("\u602a\u7269"));
    private final W U = this.S(new W("Ambients", false, this::lambda$new$24).k("\u73af\u5883\u751f\u7269"));
    private final W b = this.S(new W("Items", true, this::lambda$new$25).k("\u6389\u843d\u7269"));
    private final W T = this.S(new W("Others", false, this::lambda$new$26).k("\u5176\u4ed6"));

    public F() {
        super("Shader", w.Render);
        this.L("\u7740\u8272\u5668");
        this.p.X(s.Shader, "\u7740\u8272");
        this.p.X(s.Target, "\u76ee\u6807");
        this.p.X(s.Color, "\u989c\u8272");
        I = this;
    }

    @Override
    public String I() {
        return this.j.X().name();
    }

    public boolean U(class_1297 class_12972) {
        if (class_12972 == null) {
            return false;
        }
        if (dev.idhammai.c.r.q.n.F.W.field_1724 == null) {
            return false;
        }
        if ((double)class_3532.method_15355((float)((float)dev.idhammai.c.r.q.n.F.W.field_1724.method_5707(class_12972.method_19538()))) > this.r.e()) {
            return false;
        }
        class_1297 class_12973 = class_12972;
        Objects.requireNonNull(class_12973);
        class_1297 class_12974 = class_12973;
        if (class_12972 instanceof class_1657) {
            class_1657 class_16572 = (class_1657)class_12972;
            if (class_12972 == dev.idhammai.c.r.q.n.F.W.field_1724) {
                return this.V.h();
            }
            if (Frog.FRIEND.r(class_16572)) {
                return this.R.h();
            }
            return this.D.h();
        }
        if (class_12972 instanceof class_1511) {
            return this.l.h();
        }
        if (class_12972 instanceof class_1542) {
            return this.b.h();
        }
        return switch (class_12972.method_5864().method_5891()) {
            case class_1311.field_6294, class_1311.field_6300 -> this.C.h();
            case class_1311.field_6302 -> this.n.h();
            case class_1311.field_6303, class_1311.field_24460 -> this.U.h();
            default -> this.T.h();
        };
    }

    @Override
    public void h(class_4587 class_45872) {
        if (this.Q.h()) {
            Frog.SHADER.K(() -> F.lambda$onRender3D$27(class_45872), this.j.X());
        }
    }

    @Override
    public void O() {
        Frog.SHADER.j();
    }

    @Override
    public void F() {
        Frog.SHADER.j();
    }

    private static void lambda$onRender3D$27(class_4587 class_45872) {
        ((IGameRenderer)dev.idhammai.c.r.q.n.F.W.field_1773).IRenderHand(dev.idhammai.c.r.q.n.F.W.field_1773.method_19418(), W.method_60646().method_60637(true), class_45872.method_23760().method_23761());
    }

    private boolean lambda$new$26() {
        return this.p.X() == s.Target;
    }

    private boolean lambda$new$25() {
        return this.p.X() == s.Target;
    }

    private boolean lambda$new$24() {
        return this.p.X() == s.Target;
    }

    private boolean lambda$new$23() {
        return this.p.X() == s.Target;
    }

    private boolean lambda$new$22() {
        return this.p.X() == s.Target;
    }

    private boolean lambda$new$21() {
        return this.p.X() == s.Target;
    }

    private boolean lambda$new$20() {
        return this.p.X() == s.Target;
    }

    private boolean lambda$new$19() {
        return this.p.X() == s.Target;
    }

    private boolean lambda$new$18() {
        return this.p.X() == s.Target;
    }

    private boolean lambda$new$17() {
        return this.p.X() == s.Target;
    }

    private boolean lambda$new$16() {
        return this.p.X() == s.Color;
    }

    private boolean lambda$new$15() {
        return this.p.X() == s.Color;
    }

    private boolean lambda$new$14() {
        return this.p.X() == s.Color;
    }

    private boolean lambda$new$13() {
        return this.p.X() == s.Color;
    }

    private boolean lambda$new$12() {
        return this.p.X() == s.Color;
    }

    private boolean lambda$new$11() {
        return this.p.X() == s.Color;
    }

    private boolean lambda$new$10() {
        return this.p.X() == s.Color;
    }

    private boolean lambda$new$9() {
        return this.p.X() == s.Color;
    }

    private boolean lambda$new$8() {
        return this.p.X() == s.Target;
    }

    private boolean lambda$new$7() {
        return this.p.X() == s.Shader;
    }

    private boolean lambda$new$6() {
        return this.p.X() == s.Shader;
    }

    private boolean lambda$new$5() {
        return this.p.X() == s.Shader;
    }

    private boolean lambda$new$4() {
        return this.p.X() == s.Shader;
    }

    private boolean lambda$new$3() {
        return this.p.X() == s.Shader;
    }

    private boolean lambda$new$2() {
        return this.p.X() == s.Shader;
    }

    private boolean lambda$new$1() {
        return this.p.X() == s.Shader;
    }

    private boolean lambda$new$0() {
        return this.p.X() == s.Shader;
    }
}

