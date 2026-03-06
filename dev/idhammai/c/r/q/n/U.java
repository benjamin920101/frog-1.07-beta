/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1922
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2338$class_2339
 *  net.minecraft.class_2350
 *  net.minecraft.class_2382
 *  net.minecraft.class_259
 *  net.minecraft.class_2680
 *  net.minecraft.class_437
 */
package dev.idhammai.c.r.q.n;

import dev.idhammai.Frog;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.Y;
import dev.idhammai.P.r.c.a;
import dev.idhammai.P.r.c.h;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.q.N.P;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import dev.idhammai.c.y.u.I.t;
import net.minecraft.class_1922;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2382;
import net.minecraft.class_259;
import net.minecraft.class_2680;
import net.minecraft.class_437;

public class U
extends y {
    public static U l;
    public final W L = this.S(new W("Edit", false).k("\u7f16\u8f91").M(this::J));
    private static final ThreadLocal<class_2338.class_2339> d;

    public U() {
        super("Xray", w.Render);
        this.L("\u77ff\u7269\u900f\u89c6");
        l = this;
    }

    private void J() {
        this.L.J(false);
        if (!U.M()) {
            Object object = U.W.field_1755;
            if (object instanceof t) {
                t t2 = (t)((Object)object);
                t2.I(Frog.XRAY);
                return;
            }
            t t3 = t.a();
            t3.I(Frog.XRAY);
            object = P.M();
            if (object != null && !((y)object).p()) {
                ((y)object).C();
            } else {
                W.method_1507((class_437)t3);
            }
        }
    }

    @Override
    public void H() {
        if (U.M()) {
            return;
        }
        U.W.field_1769.method_3279();
    }

    @Override
    public void L() {
        U.W.field_1769.method_3279();
    }

    public boolean N(class_2248 class_22482) {
        return !Frog.XRAY.E(class_22482.method_9539());
    }

    @r
    private void a(a a2) {
        if (this.N(a2.I.method_11010().method_26204())) {
            a2.L();
        }
    }

    @r
    private void F(Y y2) {
        y2.L();
    }

    @r
    private void I(h h2) {
        h2.Q = 1.0f;
    }

    public static boolean M(class_2680 class_26802) {
        return l.p() && l.N(class_26802.method_26204());
    }

    public boolean r(class_2680 class_26802, class_1922 class_19222, class_2338 class_23382, class_2350 class_23502, boolean bl) {
        if (!bl && !this.N(class_26802.method_26204())) {
            class_2338 class_23383 = class_23382.method_10093(class_23502);
            class_2680 class_26803 = class_19222.method_8320(class_23383);
            return class_26803.method_26173(class_19222, class_23383, class_23502.method_10153()) != class_259.method_1077() || class_26803.method_26204() != class_26802.method_26204() || U.z(class_23383);
        }
        return bl;
    }

    public static boolean z(class_2338 class_23382) {
        for (class_2350 class_23502 : class_2350.values()) {
            if (U.W.field_1687.method_8320((class_2338)d.get().method_25505((class_2382)class_23382, class_23502)).method_26225()) continue;
            return true;
        }
        return false;
    }

    static {
        d = ThreadLocal.withInitial(class_2338.class_2339::new);
    }
}

