/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_4587
 */
package dev.idhammai.c.r.q.n;

import com.mojang.blaze3d.systems.RenderSystem;
import dev.idhammai.P.A.A.S;
import dev.idhammai.P.A.N.O;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.Q4;
import dev.idhammai.c.r.O.Y.A;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.q.n.B;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import java.awt.Color;
import java.util.concurrent.CopyOnWriteArrayList;
import net.minecraft.class_4587;

public class f
extends y {
    public static f Z;
    public final dev.idhammai.c.r.O.Y.B<S> K = this.S(new dev.idhammai.c.r.O.Y.B<S>("Ease", dev.idhammai.P.A.A.S.CubicInOut).I("\u7f13\u52a8"));
    private final A d = this.y(new A("Fill", new Color(255, 255, 255, 100)).P("\u586b\u5145").t(true));
    private final A g = this.y(new A("Line", new Color(255, 255, 255, 100)).P("\u7ebf\u6761").t(true));
    final CopyOnWriteArrayList<B> H = new CopyOnWriteArrayList();
    private final W V = this.S(new W("Alpha", true).k("\u900f\u660e\u6e10\u9690"));
    private final W X = this.S(new W("ForceSneak", false).k("\u5f3a\u5236\u6f5c\u884c\u59ff\u6001"));
    private final W h = this.S(new W("NoSelf", true).k("\u5ffd\u7565\u81ea\u5df1"));
    private final W D = this.S(new W("NoLimb", true).k("\u9759\u6b62\u56db\u80a2"));
    private final l s = this.p(new l("FadeTime", 300, 0, 1000).D("\u6de1\u51fa\u65f6\u95f4"));
    private final l N = this.p(new l("YOffset", 0.0, -10.0, 10.0, 0.01).D("Y\u504f\u79fb"));
    private final l Q = this.p(new l("Scale", 1.0, 0.0, 2.0, 0.01).D("\u7f29\u653e"));
    private final l n = this.p(new l("Yaw", 0.0, 0.0, 720.0, 0.01).D("\u504f\u822a"));

    public f() {
        super("PopChams", w.Render);
        this.L("\u7206\u56fe\u817e\u4e0a\u8272");
        Z = this;
    }

    @Override
    public void h(class_4587 class_45872) {
        RenderSystem.depthMask((boolean)false);
        this.H.removeIf(arg_0 -> f.lambda$onRender3D$0(class_45872, arg_0));
        RenderSystem.depthMask((boolean)true);
    }

    @r
    private void w(Q4 q4) {
        if (this.h.h() && q4.z().equals((Object)f.W.field_1724)) {
            return;
        }
        this.H.add(new B(this, new O(q4.z())));
    }

    private static boolean lambda$onRender3D$0(class_4587 class_45872, B b2) {
        return b2.Q(class_45872);
    }
}

