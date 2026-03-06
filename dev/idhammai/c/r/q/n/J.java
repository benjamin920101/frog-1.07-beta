/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2761
 */
package dev.idhammai.c.r.q.n;

import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.P.r.c.i;
import dev.idhammai.P.r.c.j;
import dev.idhammai.c.r.O.Y.A;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import java.awt.Color;
import net.minecraft.class_2761;

public class J
extends y {
    public static J d;
    public final A C = this.y(new A("Filter", new Color(255, 255, 255, 20)).P("\u6ee4\u955c").t(false));
    public final A D = this.y(new A("WorldColor", new Color(-1, true)).P("\u4e16\u754c\u989c\u8272").t(true));
    public final W t = this.S(new W("CustomTime", false).k("\u81ea\u5b9a\u4e49\u65f6\u95f4").D());
    public final l a = this.p(new l("Time", 0, 0, 24000, this.t::f).D("\u65f6\u95f4"));
    public final A u = this.y(new A("FogColor", new Color(13401557)).P("\u96fe\u989c\u8272").t(false));
    public final A h = this.y(new A("SkyColor", new Color(0)).P("\u5929\u7a7a\u989c\u8272").t(false));
    public final A I = this.y(new A("CloudColor", new Color(0)).P("\u4e91\u989c\u8272").t(false));
    public final A s = this.y(new A("DimensionColor", new Color(0)).P("\u7ef4\u5ea6\u989c\u8272").t(false));
    public final W A = this.S(new W("FogDistance", false).k("\u96fe\u8ddd\u79bb").D());
    public final l b = this.p(new l("FogStart", 50, 0, 1000, this.A::f).D("\u96fe\u8d77\u59cb"));
    public final l E = this.p(new l("FogEnd", 100, 0, 1000, this.A::f).D("\u96fe\u7ed3\u675f"));
    public final W e = this.S(new W("FullBright", false).k("\u5168\u4eae"));
    public final W k = this.S(new W("ForceOverworld", false).k("\u5f3a\u5236\u4e3b\u4e16\u754c"));
    public final W P = this.S(new W("CustomLuminance", false).k("\u81ea\u5b9a\u4e49\u4eae\u5ea6").D().M(J::lambda$new$0));
    public final l F = this.p(new l("Luminance", 15, 0, 15, this.P::f).D("\u4eae\u5ea6").i(this::lambda$new$1));
    long j;

    public J() {
        super("Ambience", "Custom ambience", w.Render);
        this.L("\u81ea\u5b9a\u4e49\u73af\u5883");
        d = this;
    }

    @r
    public void B(j j2) {
        if (this.C.i) {
            j2.D.method_25294(0, 0, W.method_22683().method_4486(), W.method_22683().method_4502(), this.C.P().getRGB());
        }
    }

    @r
    public void u(QO qO) {
        if (this.t.h()) {
            J.W.field_1687.method_8435((long)this.a.e());
        }
    }

    @Override
    public void H() {
        if (J.M()) {
            return;
        }
        this.j = J.W.field_1687.method_8532();
        if (this.t.h()) {
            J.W.field_1687.method_8435((long)this.a.e());
        }
    }

    @Override
    public void L() {
        if (J.M()) {
            return;
        }
        J.W.field_1687.method_8435(this.j);
    }

    @r
    public void y(i i2) {
        if (i2.L() instanceof class_2761 && this.t.h()) {
            this.j = ((class_2761)i2.L()).method_11871();
            i2.L();
        }
    }

    private void lambda$new$1() {
        if (!J.M() && this.P.h()) {
            J.W.field_1769.method_3279();
        }
    }

    private static void lambda$new$0() {
        if (!J.M()) {
            J.W.field_1769.method_3279();
        }
    }
}

