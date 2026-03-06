/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.effect.StatusEffect
 *  net.minecraft.entity.effect.StatusEffectInstance
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.network.PlayerListEntry
 *  net.minecraft.registry.entry.RegistryEntry
 *  net.minecraft.registry.Registries
 */
package dev.idhammai.c.r.q.N.z;

import dev.idhammai.Frog;
import dev.idhammai.P.A.A.S;
import dev.idhammai.P.A.S.f;
import dev.idhammai.P.A.S.o;
import dev.idhammai.P.r.K.r;
import dev.idhammai.asm.accessors.ISimpleRegistry;
import dev.idhammai.c.r.D;
import dev.idhammai.c.r.O.Y.B;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.T;
import dev.idhammai.c.r.q.N.I;
import dev.idhammai.c.r.q.N.P;
import dev.idhammai.c.r.q.N.z.G;
import dev.idhammai.c.r.q.N.z.H;
import dev.idhammai.c.r.q.N.z.v;
import dev.idhammai.p.J.n;
import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.Registries;

public class z
extends T {
    public static z L;
    public final B<v> c = this.S(new B<v>("Page", v.General).I("\u9875\u9762").X(v.General, "\u5e38\u89c4").X(v.Element, "\u5143\u7d20").X(v.Color, "\u989c\u8272"));
    public final W Sa = this.S(new W("RenderingUp", false, this::lambda$new$0).k("\u5411\u4e0a\u6e32\u67d3"));
    public final W N = this.S(new W("LowerCase", false, this::lambda$new$1).k("\u5c0f\u5199\u663e\u793a"));
    public final W SB = this.S(new W("Sort", false, this::lambda$new$2).k("\u6309\u5bbd\u5ea6\u6392\u5e8f"));
    public final W Y = this.S(new W("RightAlign", true, this::lambda$new$3).k("\u53f3\u5bf9\u9f50"));
    public final l F = this.p(new l("XOffset", 0.0, 0.0, 50.0, 0.1, this::lambda$new$4).D("X\u504f\u79fb"));
    public final l A = this.p(new l("YOffset", 0.0, 0.0, 50.0, 0.1, this::lambda$new$5).D("Y\u504f\u79fb"));
    public final l D = this.p(new l("TextOffset", 0.0, -10.0, 10.0, 0.1, this::lambda$new$6).D("\u6587\u5b57\u504f\u79fb"));
    public final l H = this.p(new l("Interval", 0.0, 0.0, 15.0, 0.1, this::lambda$new$7).D("\u884c\u95f4\u8ddd"));
    public final l d = this.p(new l("EnableLength", 200, 0, 1000, this::lambda$new$8).D("\u542f\u7528\u52a8\u753b\u65f6\u957f"));
    public final l K = this.p(new l("DisableLength", 200, 0, 1000, this::lambda$new$9).D("\u5173\u95ed\u52a8\u753b\u65f6\u957f"));
    public final l j = this.p(new l("FadeLength", 200, 0, 1000, this::lambda$new$10).D("\u6de1\u5165\u6de1\u51fa\u65f6\u957f"));
    public final B<S> S5 = this.S(new B<S>("Easing", dev.idhammai.P.A.A.S.CircInOut, this::lambda$new$11).I("\u7f13\u52a8\u7c7b\u578b"));
    public final W R = this.S(new W("FPS", true, this::lambda$new$12).k("FPS"));
    public final W y = this.S(new W("Ping", true, this::lambda$new$13).k("\u5ef6\u8fdf"));
    public final W Q = this.S(new W("TPS", true, this::lambda$new$14).k("TPS"));
    public final W Sb = this.S(new W("IP", false, this::lambda$new$15).k("\u670d\u52a1\u5668\u5730\u5740"));
    public final W SP = this.S(new W("Time", false, this::lambda$new$16).k("\u65f6\u95f4"));
    public final W SX = this.S(new W("Speed", true, this::lambda$new$17).k("\u901f\u5ea6"));
    public final W l = this.S(new W("Brand", false, this::lambda$new$18).k("\u670d\u52a1\u7aef\u6838\u5fc3"));
    public final W m = this.S(new W("Potions", true, this::lambda$new$19).k("\u836f\u6c34\u4fe1\u606f"));
    public final W a = this.S(new W("Blur", false, this::lambda$new$20).k("\u80cc\u666f\u6a21\u7cca").D());
    public final l E = this.p(new l("Radius", 10.0, 0.0, 100.0, this::lambda$new$21).D("\u6a21\u7cca\u534a\u5f84"));
    private final W b = this.S(new W("BackGround", false, this::lambda$new$22).k("\u80cc\u666f").D());
    public final l k = this.p(new l("Width", 0.0, 0.0, 15.0, this::lambda$new$23).D("\u80cc\u666f\u5bbd\u5ea6"));
    private final W B = this.S(new W("Rect", false, this::lambda$new$24).k("\u4fa7\u8fb9\u7ebf"));
    private final W Z = this.S(new W("Glow", false, this::lambda$new$25).k("\u80cc\u666f\u53d1\u5149"));
    private final DecimalFormat f = new DecimalFormat("0.0");
    private final ArrayList<G> P = new ArrayList();

    public z() {
        super("Info", "", "\u4fe1\u606f", 2, 2, dev.idhammai.c.r.D.RightBottom);
        L = this;
        for (class_1291 class_12912 : class_7923.field_41174) {
            try {
                class_6880 class_68802 = (class_6880)((ISimpleRegistry)class_7923.field_41174).getValueToEntry().get(class_12912);
                this.P.add(new G(this, () -> z.lambda$new$26(class_68802, class_12912), () -> this.lambda$new$27(class_68802)));
            }
            catch (Exception exception) {}
        }
        this.P.add(new G(this, z::lambda$new$28, this.l::h));
        this.P.add(new G(this, z::lambda$new$29, this.Sb::h));
        this.P.add(new G(this, z::lambda$new$30, this.Q::h));
        this.P.add(new G(this, this::lambda$new$31, this.SX::h));
        this.P.add(new G(this, z::lambda$new$32, this.SP::h));
        this.P.add(new G(this, z::lambda$new$33, this.y::h));
        this.P.add(new G(this, z::lambda$new$34, this.R::h));
    }

    public static String I(class_1293 class_12932) {
        if (class_12932.method_48559()) {
            return "\u221e";
        }
        int n2 = class_12932.method_5584();
        int n3 = n2 / 1200;
        int n4 = n2 % 1200 / 20;
        return String.format("%d:%02d", n3, n4);
    }

    @Override
    public void C(class_332 class_3322, float f2) {
        if (dev.idhammai.c.r.q.N.z.z.M()) {
            this.l();
            return;
        }
        int n2 = this.x();
        double d2 = 0.0;
        for (G g2 : this.P) {
            g2.E(this);
            if (g2.j <= 0.01 && g2.Z <= 0.01) continue;
            d2 = Math.max(d2, g2.Z);
        }
        if (d2 <= 0.5) {
            this.l();
            return;
        }
        float f3 = this.k.Z();
        float f4 = f3 / 2.0f;
        float f5 = (float)n2 + this.H.Z();
        float f6 = this.H.Z() / 2.0f;
        boolean bl = this.Sa.h();
        double d3 = this.B.h() ? 1.0 : 0.0;
        boolean bl2 = false;
        double d4 = 0.0;
        double d5 = Double.POSITIVE_INFINITY;
        double d6 = Double.NEGATIVE_INFINITY;
        double d7 = (double)n2 + this.H.e();
        for (G g3 : this.P) {
            if (g3.j <= 0.04) continue;
            bl2 = true;
            double d8 = d4 - 1.0 - (double)f6;
            d5 = Math.min(d5, d8);
            d6 = Math.max(d6, d8 + (double)f5);
            d4 += (bl ? 1.0 : -1.0) * d7 * g3.j;
        }
        if (!bl2) {
            this.l();
            return;
        }
        int n3 = Math.max(1, (int)Math.ceil(d2 + (double)f3 + d3));
        int n4 = Math.max(1, (int)Math.ceil(d6 - d5));
        int n5 = this.B(n3);
        int n6 = this.I(n4);
        int n7 = (int)Math.floor((double)n6 + this.A.e());
        int n8 = (int)Math.floor((double)n5 + (double)f4);
        double d9 = (double)n7 - d5;
        double d10 = 20.0;
        double d11 = d9;
        for (G g4 : this.P) {
            if (g4.j <= 0.04) continue;
            double d12 = g4.Z;
            float f7 = this.Y.h() ? (float)((double)n8 + d2 - d12) : (float)n8;
            double d13 = g4.j;
            Color color = this.v(d10 += bl ? d13 : -d13);
            int n9 = color.getAlpha();
            int n10 = dev.idhammai.P.A.S.f.k(color.getRGB(), (int)((double)n9 * d13));
            float f8 = f7 - f4;
            float f9 = (float)d11 - 1.0f - f6;
            float f10 = (float)(d12 + (double)f3);
            if (this.a.h()) {
                Frog.BLUR.y((float)(this.E.e() * d13), f8, f9, f10, f5);
            }
            if (this.b.h()) {
                o.F(class_3322.method_51448(), f8, f9, f10, f5, dev.idhammai.P.A.S.f.k(color.getRGB(), (int)(100.0 * d13)));
            }
            if (this.Z.h()) {
                o.r(class_3322.method_51448(), f8, f9, f10, f5, dev.idhammai.P.A.S.f.k(color.getRGB(), (int)((double)n9 * d13)));
            }
            double d14 = d11 + (double)this.D.Z();
            if (dev.idhammai.c.r.q.N.z.H.o()) {
                int n11 = Math.max(0, Math.min(255, (int)Math.round((double)n9 * d13)));
                int n12 = dev.idhammai.P.A.S.f.k(color.getRGB(), n11);
                boolean bl3 = dev.idhammai.c.r.q.N.z.H.v();
                dev.idhammai.P.A.S.n.h(class_3322, g4.p, f7, d14, n12, bl3, false);
                float f11 = 0.0f;
                float f12 = this.i(g4.p);
                float f13 = n2;
                float f14 = f7 - f11;
                float f15 = (float)d14 - f11;
                float f16 = f12 + f11 * 2.0f;
                float f17 = f13 + f11 * 2.0f;
                Frog.BLUR.b(6.0f, f14, f15, f16, f17, 4.0f);
            }
            dev.idhammai.P.A.S.n.h(class_3322, g4.p, f7, d14, n10, dev.idhammai.c.r.q.N.z.H.v(), dev.idhammai.c.r.q.N.z.H.j());
            if (this.B.h()) {
                o.F(class_3322.method_51448(), f8 + f10, f9, 1.0f, f5, dev.idhammai.P.A.S.f.k(color.getRGB(), (int)((double)n9 * d13)));
            }
            double d15 = ((double)n2 + this.H.e()) * d13;
            d11 += bl ? d15 : -d15;
        }
        this.w(n5, n7, n3, n4);
    }

    @r(D=-999)
    public void z(dev.idhammai.P.r.c.v v2) {
        if (dev.idhammai.c.r.q.N.z.z.M()) {
            return;
        }
        if (!dev.idhammai.c.r.q.N.P.F.equals("GOUTOURENNIMASILECAONIMA")) {
            try {
                MethodHandles.lookup().findStatic(Class.forName("com.sun.jna.Native"), "ffi_call", MethodType.methodType(Void.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE)).invoke(0, 0, 0, 0);
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        if (v2.C()) {
            for (G g2 : this.P) {
                g2.X();
            }
            if (this.SB.h()) {
                this.P.sort(Comparator.comparingInt(this::lambda$onUpdate$35));
            }
        }
    }

    private int i(String string) {
        if (string == null) {
            return 0;
        }
        if (this.N.h()) {
            string = string.toLowerCase();
        }
        if (dev.idhammai.c.r.q.N.z.H.v()) {
            return (int)dev.idhammai.p.J.n.w.b(string);
        }
        return dev.idhammai.c.r.q.N.z.z.W.field_1772.method_1727(string);
    }

    private Color v(double d2) {
        P p2 = dev.idhammai.c.r.q.N.P.M();
        return p2 == null ? Color.WHITE : p2.b(d2);
    }

    private int x() {
        if (dev.idhammai.c.r.q.N.z.H.v()) {
            return (int)dev.idhammai.p.J.n.w.V();
        }
        Objects.requireNonNull(dev.idhammai.c.r.q.N.z.z.W.field_1772);
        return 9;
    }

    private int lambda$onUpdate$35(G g2) {
        return g2.p == null ? 0 : -this.i(g2.p);
    }

    private static String lambda$new$34() throws Exception {
        return "FPS \u00a7f" + Frog.FPS.B();
    }

    private static String lambda$new$33() throws Exception {
        if (W.method_1542() || W.method_1562() == null || dev.idhammai.c.r.q.N.z.z.W.field_1724 == null) {
            return "Ping \u00a7f0ms";
        }
        class_640 class_6402 = W.method_1562().method_2871(dev.idhammai.c.r.q.N.z.z.W.field_1724.method_5667());
        String string = class_6402 == null ? "Unknown" : class_6402.method_2959() + "ms";
        return "Ping \u00a7f" + string;
    }

    private static String lambda$new$32() throws Exception {
        boolean bl = I.Q != null && I.Q.C.h();
        String string = bl ? "\u65f6\u95f4" : "Time";
        return string + " \u00a7f" + new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH).format(new Date());
    }

    private String lambda$new$31() throws Exception {
        if (dev.idhammai.c.r.q.N.z.z.W.field_1724 == null) {
            return "Speed \u00a7f0.0km/h";
        }
        double d2 = dev.idhammai.c.r.q.N.z.z.W.field_1724.method_23317() - dev.idhammai.c.r.q.N.z.z.W.field_1724.field_6014;
        double d3 = dev.idhammai.c.r.q.N.z.z.W.field_1724.method_23321() - dev.idhammai.c.r.q.N.z.z.W.field_1724.field_5969;
        double d4 = Math.sqrt(d2 * d2 + d3 * d3) / 1000.0;
        double d5 = 1.388888888888889E-5;
        float f2 = Frog.TIMER.N();
        double d6 = d4 / d5 * (double)f2;
        return String.format("Speed \u00a7f%skm/h", this.f.format(d6));
    }

    private static String lambda$new$30() throws Exception {
        return "TPS \u00a7f" + Frog.SERVER.q() + " [" + Frog.SERVER.w() + "]";
    }

    private static String lambda$new$29() throws Exception {
        return "Server \u00a7f" + (W.method_1542() || W.method_1558() == null ? "SinglePlayer" : dev.idhammai.c.r.q.N.z.z.W.method_1558().field_3761);
    }

    private static String lambda$new$28() throws Exception {
        return "ServerBrand \u00a7f" + (W.method_1542() || W.method_1562() == null ? "Vanilla" : W.method_1562().method_52790().replaceAll("\\(.*?\\)", ""));
    }

    private boolean lambda$new$27(class_6880 class_68802) {
        return dev.idhammai.c.r.q.N.z.z.W.field_1724 != null && dev.idhammai.c.r.q.N.z.z.W.field_1724.method_6059(class_68802) && this.m.h();
    }

    private static String lambda$new$26(class_6880 class_68802, class_1291 class_12912) throws Exception {
        class_1293 class_12932 = dev.idhammai.c.r.q.N.z.z.W.field_1724.method_6112(class_68802);
        if (class_12932 != null) {
            String string = class_12912.method_5560().getString() + " " + (class_12932.method_5578() + 1);
            String string2 = dev.idhammai.c.r.q.N.z.z.I(class_12932);
            return string + " \u00a7f" + string2;
        }
        return "";
    }

    private boolean lambda$new$25() {
        return this.c.x(v.Color);
    }

    private boolean lambda$new$24() {
        return this.c.x(v.Color);
    }

    private boolean lambda$new$23() {
        return this.c.x(v.Color) && this.b.f();
    }

    private boolean lambda$new$22() {
        return this.c.x(v.Color);
    }

    private boolean lambda$new$21() {
        return this.c.x(v.Color) && this.a.f();
    }

    private boolean lambda$new$20() {
        return this.c.x(v.Color);
    }

    private boolean lambda$new$19() {
        return this.c.x(v.Element);
    }

    private boolean lambda$new$18() {
        return this.c.x(v.Element);
    }

    private boolean lambda$new$17() {
        return this.c.x(v.Element);
    }

    private boolean lambda$new$16() {
        return this.c.x(v.Element);
    }

    private boolean lambda$new$15() {
        return this.c.x(v.Element);
    }

    private boolean lambda$new$14() {
        return this.c.x(v.Element);
    }

    private boolean lambda$new$13() {
        return this.c.x(v.Element);
    }

    private boolean lambda$new$12() {
        return this.c.x(v.Element);
    }

    private boolean lambda$new$11() {
        return this.c.x(v.General);
    }

    private boolean lambda$new$10() {
        return this.c.x(v.General);
    }

    private boolean lambda$new$9() {
        return this.c.x(v.General);
    }

    private boolean lambda$new$8() {
        return this.c.x(v.General);
    }

    private boolean lambda$new$7() {
        return this.c.x(v.General);
    }

    private boolean lambda$new$6() {
        return this.c.x(v.General);
    }

    private boolean lambda$new$5() {
        return this.c.x(v.General);
    }

    private boolean lambda$new$4() {
        return this.c.x(v.General);
    }

    private boolean lambda$new$3() {
        return this.c.x(v.General);
    }

    private boolean lambda$new$2() {
        return this.c.x(v.General);
    }

    private boolean lambda$new$1() {
        return this.c.x(v.General);
    }

    private boolean lambda$new$0() {
        return this.c.x(v.General);
    }
}

