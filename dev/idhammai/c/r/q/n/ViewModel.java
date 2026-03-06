/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.Hand
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.util.math.RotationAxis
 */
package dev.idhammai.c.r.q.n;

import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.l;
import dev.idhammai.asm.accessors.IHeldItemRenderer;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import net.minecraft.util.Hand;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.RotationAxis;

public class P
extends y {
    public static P M;
    public final W R = this.S(new W("MainhandSwap", true).k("\u4e3b\u624b\u5207\u6362\u52a8\u753b"));
    public final W h = this.S(new W("OffhandSwap", true).k("\u526f\u624b\u5207\u6362\u52a8\u753b"));
    public final dev.idhammai.c.r.O.Y.l d = this.p(new dev.idhammai.c.r.O.Y.l("ScaleMainX", 1.0, (double)0.1f, 5.0, 0.01).D("\u4e3b\u624b\u7f29\u653eX"));
    public final dev.idhammai.c.r.O.Y.l n = this.p(new dev.idhammai.c.r.O.Y.l("ScaleMainY", 1.0, (double)0.1f, 5.0, 0.01).D("\u4e3b\u624b\u7f29\u653eY"));
    public final dev.idhammai.c.r.O.Y.l V = this.p(new dev.idhammai.c.r.O.Y.l("ScaleMainZ", 1.0, (double)0.1f, 5.0, 0.01).D("\u4e3b\u624b\u7f29\u653eZ"));
    public final dev.idhammai.c.r.O.Y.l K = this.p(new dev.idhammai.c.r.O.Y.l("PositionMainX", 0.0, -3.0, 3.0, 0.01).D("\u4e3b\u624b\u4f4d\u7f6eX"));
    public final dev.idhammai.c.r.O.Y.l C = this.p(new dev.idhammai.c.r.O.Y.l("PositionMainY", 0.0, -3.0, 3.0, 0.01).D("\u4e3b\u624b\u4f4d\u7f6eY"));
    public final dev.idhammai.c.r.O.Y.l j = this.p(new dev.idhammai.c.r.O.Y.l("PositionMainZ", 0.0, -3.0, 3.0, 0.01).D("\u4e3b\u624b\u4f4d\u7f6eZ"));
    public final dev.idhammai.c.r.O.Y.l a = this.p(new dev.idhammai.c.r.O.Y.l("RotationMainX", 0.0, -180.0, 180.0, 0.01).D("\u4e3b\u624b\u65cb\u8f6cX"));
    public final dev.idhammai.c.r.O.Y.l r = this.p(new dev.idhammai.c.r.O.Y.l("RotationMainY", 0.0, -180.0, 180.0, 0.01).D("\u4e3b\u624b\u65cb\u8f6cY"));
    public final dev.idhammai.c.r.O.Y.l m = this.p(new dev.idhammai.c.r.O.Y.l("RotationMainZ", 0.0, -180.0, 180.0, 0.01).D("\u4e3b\u624b\u65cb\u8f6cZ"));
    public final dev.idhammai.c.r.O.Y.l L = this.p(new dev.idhammai.c.r.O.Y.l("ScaleOffX", 1.0, (double)0.1f, 5.0, 0.01).D("\u526f\u624b\u7f29\u653eX"));
    public final dev.idhammai.c.r.O.Y.l l = this.p(new dev.idhammai.c.r.O.Y.l("ScaleOffY", 1.0, (double)0.1f, 5.0, 0.01).D("\u526f\u624b\u7f29\u653eY"));
    public final dev.idhammai.c.r.O.Y.l X = this.p(new dev.idhammai.c.r.O.Y.l("ScaleOffZ", 1.0, (double)0.1f, 5.0, 0.01).D("\u526f\u624b\u7f29\u653eZ"));
    public final dev.idhammai.c.r.O.Y.l B = this.p(new dev.idhammai.c.r.O.Y.l("PositionOffX", 0.0, -3.0, 3.0, 0.01).D("\u526f\u624b\u4f4d\u7f6eX"));
    public final dev.idhammai.c.r.O.Y.l s = this.p(new dev.idhammai.c.r.O.Y.l("PositionOffY", 0.0, -3.0, 3.0, 0.01).D("\u526f\u624b\u4f4d\u7f6eY"));
    public final dev.idhammai.c.r.O.Y.l E = this.p(new dev.idhammai.c.r.O.Y.l("PositionOffZ", 0.0, -3.0, 3.0, 0.01).D("\u526f\u624b\u4f4d\u7f6eZ"));
    public final dev.idhammai.c.r.O.Y.l p = this.p(new dev.idhammai.c.r.O.Y.l("RotationOffX", 0.0, -180.0, 180.0, 0.01).D("\u526f\u624b\u65cb\u8f6cX"));
    public final dev.idhammai.c.r.O.Y.l Q = this.p(new dev.idhammai.c.r.O.Y.l("RotationOffY", 0.0, -180.0, 180.0, 0.01).D("\u526f\u624b\u65cb\u8f6cY"));
    public final dev.idhammai.c.r.O.Y.l H = this.p(new dev.idhammai.c.r.O.Y.l("RotationOffZ", 0.0, -180.0, 180.0, 0.01).D("\u526f\u624b\u65cb\u8f6cZ"));
    public final W F = this.S(new W("SwingSpeed", true).k("\u6325\u52a8\u53d8\u901f"));
    public final dev.idhammai.c.r.O.Y.l t = this.p(new dev.idhammai.c.r.O.Y.l("Value", 6, 1, 50).D("\u901f\u5ea6\u503c"));

    public P() {
        super("ViewModel", w.Render);
        this.L("\u624b\u6301\u6a21\u578b");
        M = this;
    }

    @Override
    public void h(class_4587 class_45872) {
        if (!this.R.h() && ((IHeldItemRenderer)W.method_1561().method_43336()).getEquippedProgressMainHand() <= 1.0f) {
            ((IHeldItemRenderer)W.method_1561().method_43336()).setEquippedProgressMainHand(1.0f);
            ((IHeldItemRenderer)W.method_1561().method_43336()).setItemStackMainHand(P.W.field_1724.method_6047());
        }
        if (!this.h.h() && ((IHeldItemRenderer)W.method_1561().method_43336()).getEquippedProgressOffHand() <= 1.0f) {
            ((IHeldItemRenderer)W.method_1561().method_43336()).setEquippedProgressOffHand(1.0f);
            ((IHeldItemRenderer)W.method_1561().method_43336()).setItemStackOffHand(P.W.field_1724.method_6079());
        }
    }

    @r
    private void K(l l2) {
        if (l2.z() == class_1268.field_5808) {
            l2.j().method_46416(this.K.Z(), this.C.Z(), this.j.Z());
            l2.j().method_22905(this.d.Z(), this.n.Z(), this.V.Z());
            l2.j().method_22907(class_7833.field_40714.rotationDegrees(this.a.Z()));
            l2.j().method_22907(class_7833.field_40716.rotationDegrees(this.r.Z()));
            l2.j().method_22907(class_7833.field_40718.rotationDegrees(this.m.Z()));
        } else {
            l2.j().method_46416(this.B.Z(), this.s.Z(), this.E.Z());
            l2.j().method_22905(this.L.Z(), this.l.Z(), this.X.Z());
            l2.j().method_22907(class_7833.field_40714.rotationDegrees(this.p.Z()));
            l2.j().method_22907(class_7833.field_40716.rotationDegrees(this.Q.Z()));
            l2.j().method_22907(class_7833.field_40718.rotationDegrees(this.H.Z()));
        }
    }
}

