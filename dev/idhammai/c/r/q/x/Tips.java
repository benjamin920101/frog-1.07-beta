/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.Formatting
 *  net.minecraft.entity.effect.StatusEffect
 *  net.minecraft.entity.effect.StatusEffects
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket
 *  net.minecraft.client.font.TextRenderer
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.sound.SoundEvents
 *  net.minecraft.sound.SoundCategory
 */
package dev.idhammai.c.r.q.x;

import dev.idhammai.Frog;
import dev.idhammai.P.A.A.h;
import dev.idhammai.P.A.L.g;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.I;
import dev.idhammai.P.r.c.N;
import dev.idhammai.P.r.c.Q4;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.P.r.c.Qd;
import dev.idhammai.P.r.c.i;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.q.N.O;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import dev.idhammai.p.J.S;
import java.awt.Color;
import java.text.DecimalFormat;
import java.util.Objects;
import net.minecraft.util.Formatting;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.sound.SoundEvents;
import net.minecraft.sound.SoundCategory;

public class P
extends y {
    public static P H;
    public final W P = this.S(new W("VisualRange", false).k("\u89c6\u8ddd\u63d0\u9192").D());
    public final W p = this.S(new W("Friends", false, this.P::f).k("\u5305\u542b\u597d\u53cb"));
    public final W L = this.S(new W("PopCounter", true).k("\u56fe\u817e\u8ba1\u6570"));
    public final W h = this.S(new W("DeathCoords", true).k("\u6b7b\u4ea1\u5750\u6807"));
    public final W d = this.S(new W("ServerLag", true).k("\u670d\u52a1\u5668\u5361\u987f"));
    public final W U = this.S(new W("LagBack", true).k("\u56de\u5f39\u63d0\u793a"));
    public final W D = this.S(new W("Potion", true).k("\u836f\u6c34\u72b6\u6001").D());
    public final W Y = this.S(new W("ResistanceLevelCheck", true, this.D::f).k("\u6297\u6027\u7b49\u7ea7\u68c0\u67e5"));
    private final l J = this.p(new l("YOffset", 0, -200, 200, this.D::f).D("Y\u504f\u79fb"));
    final DecimalFormat c = new DecimalFormat("0.0");
    final int X = new Color(190, 0, 0).getRGB();
    private final h R = new h();
    private final h g = new h();
    int N = 0;

    public P() {
        super("Tips", w.Misc);
        this.L("\u63d0\u793a");
        H = this;
    }

    @r
    public void g(I i2) {
        if (!this.P.h() || !(i2.C() instanceof class_1657) || i2.C().method_5476() == null) {
            return;
        }
        String string = i2.C().method_5476().getString();
        boolean bl = Frog.FRIEND.e(string);
        if (bl && !this.p.h() || i2.C() == dev.idhammai.c.r.q.x.P.W.field_1724) {
            return;
        }
        dev.idhammai.p.J.S.u((bl ? String.valueOf(class_124.field_1075) + string : String.valueOf(class_124.field_1068) + string) + "\u00a7f entered your visual range.", i2.C().method_5628() + 777);
        dev.idhammai.c.r.q.x.P.W.field_1687.method_8396((class_1657)dev.idhammai.c.r.q.x.P.W.field_1724, dev.idhammai.c.r.q.x.P.W.field_1724.method_24515(), class_3417.field_14627, class_3419.field_15248, 100.0f, 1.9f);
    }

    @r
    public void h(Qd qd) {
        if (!this.P.h() || !(qd.y() instanceof class_1657) || qd.y().method_5476() == null) {
            return;
        }
        String string = qd.y().method_5476().getString();
        boolean bl = Frog.FRIEND.e(string);
        if (bl && !this.p.h() || qd.y() == dev.idhammai.c.r.q.x.P.W.field_1724) {
            return;
        }
        dev.idhammai.p.J.S.u((bl ? String.valueOf(class_124.field_1075) + string : String.valueOf(class_124.field_1068) + string) + "\u00a7f left your visual range.", qd.y().method_5628() + 777);
        dev.idhammai.c.r.q.x.P.W.field_1687.method_8396((class_1657)dev.idhammai.c.r.q.x.P.W.field_1724, dev.idhammai.c.r.q.x.P.W.field_1724.method_24515(), class_3417.field_14627, class_3419.field_15248, 100.0f, 1.9f);
    }

    @r
    public void x(QO qO) {
        if (this.D.h()) {
            this.N = dev.idhammai.P.A.L.g.F((class_1291)class_1294.field_5907.comp_349());
        }
    }

    @r
    public void A(i i2) {
        this.R.H();
        if (i2.L() instanceof class_2708) {
            this.g.H();
        }
    }

    @Override
    public void C(class_332 class_3322, float f2) {
        int n2;
        StringBuilder stringBuilder;
        String string;
        if (this.d.h() && this.R.r(1.4)) {
            string = "Server not responding (" + this.c.format((double)this.R.k() / 1000.0) + "s)";
            stringBuilder = dev.idhammai.c.r.q.x.P.W.field_1772;
            n2 = W.method_22683().method_4486() / 2 - dev.idhammai.c.r.q.x.P.W.field_1772.method_1727(string) / 2;
            Objects.requireNonNull(dev.idhammai.c.r.q.x.P.W.field_1772);
            class_3322.method_51433((class_327)stringBuilder, string, n2, 19, this.X, true);
        }
        if (this.U.h() && !this.g.r(1.5)) {
            string = "Lagback (" + this.c.format((double)(1500L - this.g.k()) / 1000.0) + "s)";
            stringBuilder = dev.idhammai.c.r.q.x.P.W.field_1772;
            n2 = W.method_22683().method_4486() / 2 - dev.idhammai.c.r.q.x.P.W.field_1772.method_1727(string) / 2;
            Objects.requireNonNull(dev.idhammai.c.r.q.x.P.W.field_1772);
            class_3322.method_51433((class_327)stringBuilder, string, n2, 28, this.X, true);
        }
        if (this.D.h()) {
            stringBuilder = new StringBuilder();
            if (this.N > 0) {
                stringBuilder.append("\u00a7e").append(this.N);
            }
            if (dev.idhammai.c.r.q.x.P.W.field_1724.method_6059(class_1294.field_5907) && (!this.Y.h() || dev.idhammai.c.r.q.x.P.W.field_1724.method_6112(class_1294.field_5907).method_5578() > 0)) {
                if (!stringBuilder.isEmpty()) {
                    stringBuilder.append(" ");
                }
                stringBuilder.append("\u00a79").append(dev.idhammai.c.r.q.x.P.W.field_1724.method_6112(class_1294.field_5907).method_5584() / 20 + 1);
            }
            if (dev.idhammai.c.r.q.x.P.W.field_1724.method_6059(class_1294.field_5910)) {
                if (!stringBuilder.isEmpty()) {
                    stringBuilder.append(" ");
                }
                stringBuilder.append("\u00a74").append(dev.idhammai.c.r.q.x.P.W.field_1724.method_6112(class_1294.field_5910).method_5584() / 20 + 1);
            }
            if (dev.idhammai.c.r.q.x.P.W.field_1724.method_6059(class_1294.field_5904)) {
                if (!stringBuilder.isEmpty()) {
                    stringBuilder.append(" ");
                }
                stringBuilder.append("\u00a7b").append(dev.idhammai.c.r.q.x.P.W.field_1724.method_6112(class_1294.field_5904).method_5584() / 20 + 1);
            }
            class_327 class_3272 = dev.idhammai.c.r.q.x.P.W.field_1772;
            String string2 = stringBuilder.toString();
            int n3 = W.method_22683().method_4486() / 2 - dev.idhammai.c.r.q.x.P.W.field_1772.method_1727(stringBuilder.toString()) / 2;
            int n4 = W.method_22683().method_4502() / 2;
            Objects.requireNonNull(dev.idhammai.c.r.q.x.P.W.field_1772);
            class_3322.method_51433(class_3272, string2, n3, n4 + 9 - this.J.V(), -1, true);
        }
    }

    @r
    public void P(N n2) {
        class_1657 class_16572 = n2.s();
        if (this.L.h()) {
            if (Frog.POP.R.containsKey(class_16572.method_5477().getString())) {
                int n3 = Frog.POP.R.get(class_16572.method_5477().getString());
                if (n3 == 1) {
                    if (class_16572.equals((Object)dev.idhammai.c.r.q.x.P.W.field_1724)) {
                        this.F("\u00a7fYou\u00a7r died after popping \u00a7f" + n3 + "\u00a7r totem.", class_16572.method_5628());
                    } else {
                        this.F("\u00a7f" + class_16572.method_5477().getString() + "\u00a7r died after popping \u00a7f" + n3 + "\u00a7r totem.", class_16572.method_5628());
                    }
                } else if (class_16572.equals((Object)dev.idhammai.c.r.q.x.P.W.field_1724)) {
                    this.F("\u00a7fYou\u00a7r died after popping \u00a7f" + n3 + "\u00a7r totems.", class_16572.method_5628());
                } else {
                    this.F("\u00a7f" + class_16572.method_5477().getString() + "\u00a7r died after popping \u00a7f" + n3 + "\u00a7r totems.", class_16572.method_5628());
                }
            } else if (class_16572.equals((Object)dev.idhammai.c.r.q.x.P.W.field_1724)) {
                this.F("\u00a7fYou\u00a7r died.", class_16572.method_5628());
            } else {
                this.F("\u00a7f" + class_16572.method_5477().getString() + "\u00a7r died.", class_16572.method_5628());
            }
        }
        if (this.h.h() && class_16572 == dev.idhammai.c.r.q.x.P.W.field_1724) {
            this.y("\u00a74You died at " + class_16572.method_31477() + ", " + class_16572.method_31478() + ", " + class_16572.method_31479());
        }
    }

    @r
    public void n(Q4 q4) {
        if (this.L.h()) {
            class_1657 class_16572 = q4.z();
            int n2 = 1;
            if (Frog.POP.R.containsKey(class_16572.method_5477().getString())) {
                n2 = Frog.POP.R.get(class_16572.method_5477().getString());
            }
            if (n2 == 1) {
                if (class_16572.equals((Object)dev.idhammai.c.r.q.x.P.W.field_1724)) {
                    this.F("\u00a7fYou\u00a7r popped \u00a7f" + n2 + "\u00a7r totem.", class_16572.method_5628());
                } else {
                    this.F("\u00a7f" + class_16572.method_5477().getString() + " \u00a7rpopped \u00a7f" + n2 + "\u00a7r totems.", class_16572.method_5628());
                }
            } else if (class_16572.equals((Object)dev.idhammai.c.r.q.x.P.W.field_1724)) {
                this.F("\u00a7fYou\u00a7r popped \u00a7f" + n2 + "\u00a7r totem.", class_16572.method_5628());
            } else {
                this.F("\u00a7f" + class_16572.method_5477().getString() + " \u00a7rhas popped \u00a7f" + n2 + "\u00a7r totems.", class_16572.method_5628());
            }
        }
    }

    public void F(String string, int n2) {
        if (!dev.idhammai.c.r.q.x.P.M()) {
            if (dev.idhammai.c.r.q.N.I.Q.g.X() == O.Moon) {
                dev.idhammai.p.J.S.u("\u00a7f[\u00a73" + this.o() + "\u00a7f] " + string, n2);
                return;
            }
            dev.idhammai.p.J.S.u(string, n2);
        }
    }
}

