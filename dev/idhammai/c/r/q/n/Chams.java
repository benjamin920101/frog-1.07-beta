/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.mob.MobEntity
 *  net.minecraft.entity.passive.AnimalEntity
 *  net.minecraft.entity.decoration.EndCrystalEntity
 *  net.minecraft.entity.mob.SlimeEntity
 *  net.minecraft.entity.passive.VillagerEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.entity.passive.WanderingTraderEntity
 */
package dev.idhammai.c.r.q.n;

import com.mojang.blaze3d.systems.RenderSystem;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.P.r.c.R;
import dev.idhammai.c.r.O.Y.A;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import java.awt.Color;
import net.minecraft.entity.Entity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.entity.mob.SlimeEntity;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.passive.WanderingTraderEntity;

public class O
extends y {
    public static O s;
    public final W U = this.S(new W("Crystal", true).k("\u6c34\u6676").D());
    public final W a = this.S(new W("Custom", false, this.U::f).k("\u81ea\u5b9a\u4e49").D());
    public final W w = this.S(new W("Depth", false, this::lambda$new$0).k("\u6df1\u5ea6"));
    public final W F = this.S(new W("ChamsTexture", true, this::lambda$new$1).k("\u67d3\u8272\u7eb9\u7406"));
    public final A l = this.y(new A("Fill", new Color(255, 255, 255, 100), this::lambda$new$2).P("\u586b\u5145").t(false));
    public final A b = this.y(new A("Line", new Color(255, 255, 255, 100), this::lambda$new$3).P("\u7ebf\u6761").t(false));
    public final A u = this.y(new A("Core", new Color(255, 255, 255, 255), this.U::f).P("\u6838\u5fc3").t(true));
    public final A t = this.y(new A("OuterFrame", new Color(255, 255, 255, 255), this.U::f).P("\u5916\u6846").t(true));
    public final A f = this.y(new A("InnerFrame", new Color(255, 255, 255, 255), this.U::f).P("\u5185\u6846").t(true));
    public final W L = this.S(new W("Glint", true, this.U::f).k("\u95ea\u5149"));
    public final W Y = this.S(new W("Texture", true, this.U::f).k("\u7eb9\u7406"));
    public final W V = this.S(new W("SpinSync", false, this.U::f).k("\u65cb\u8f6c\u540c\u6b65"));
    public final l p = this.p(new l("Scale", 1.0, 0.0, 3.0, 0.01, this.U::f).D("\u7f29\u653e"));
    public final l J = this.p(new l("SpinSpeed", 1.0, 0.0, 3.0, 0.01, this.U::f).D("\u65cb\u8f6c\u901f\u5ea6"));
    public final l c = this.p(new l("BounceHeight", 1.0, 0.0, 3.0, 0.01, this.U::f).D("\u5f39\u8df3\u9ad8\u5ea6"));
    public final l r = this.p(new l("BounceSpeed", 1.0, 0.0, 3.0, 0.01, this.U::f).D("\u5f39\u8df3\u901f\u5ea6"));
    public final l y = this.p(new l("YOffset", 0.0, -1.0, 1.0, 0.01, this.U::f).D("Y\u504f\u79fb"));
    public final W R = this.S(new W("ThroughWall", false).k("\u7a7f\u5899").D());
    private final W K = this.S(new W("Crystals", true, this.R::f).k("\u6c34\u6676\u5b9e\u4f53"));
    private final W T = this.S(new W("Players", true, this.R::f).k("\u73a9\u5bb6"));
    private final W Z = this.S(new W("Mobs", true, this.R::f).k("\u602a\u7269"));
    private final W k = this.S(new W("Animals", true, this.R::f).k("\u52a8\u7269"));
    private final W j = this.S(new W("Villagers", true, this.R::f).k("\u6751\u6c11"));
    private final W P = this.S(new W("Slimes", true, this.R::f).k("\u53f2\u83b1\u59c6"));
    public final A I = this.y(new A("Hand", -1).P("\u624b\u90e8").t(true));
    public int M;

    public O() {
        super("Chams", dev.idhammai.c.r.w.Render);
        this.L("\u6a21\u578b\u4e0a\u8272");
        s = this;
    }

    public boolean D() {
        return this.p() && this.U.h();
    }

    @r
    public void V(QO qO) {
        ++this.M;
    }

    @r(D=-2147483648)
    public void E(R r2) {
        if (this.I.i) {
            Color color = this.I.P();
            RenderSystem.setShaderColor((float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)((float)color.getAlpha() / 255.0f));
        }
    }

    public boolean Q(class_1297 class_12972) {
        if (class_12972 instanceof class_1511) {
            return this.K.h();
        }
        if (class_12972 instanceof class_1621) {
            return this.P.h();
        }
        if (class_12972 instanceof class_1657) {
            return this.T.h();
        }
        if (class_12972 instanceof class_1646 || class_12972 instanceof class_3989) {
            return this.j.h();
        }
        if (class_12972 instanceof class_1429) {
            return this.k.h();
        }
        if (class_12972 instanceof class_1308) {
            return this.Z.h();
        }
        return false;
    }

    private boolean lambda$new$3() {
        return this.U.f() && this.a.f();
    }

    private boolean lambda$new$2() {
        return this.U.f() && this.a.f();
    }

    private boolean lambda$new$1() {
        return this.U.f() && this.a.f();
    }

    private boolean lambda$new$0() {
        return this.U.f() && this.a.f();
    }
}

