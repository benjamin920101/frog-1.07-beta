/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2338
 *  net.minecraft.class_4587
 */
package dev.idhammai.c.r.q.n;

import dev.idhammai.P.A.A.S;
import dev.idhammai.c.r.O.Y.A;
import dev.idhammai.c.r.O.Y.B;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.q.n.X;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import java.awt.Color;
import java.util.HashMap;
import net.minecraft.class_2338;
import net.minecraft.class_4587;

public class h
extends y {
    public static final HashMap<class_2338, X> I = new HashMap();
    public static h k;
    public final l w = this.p(new l("FadeTime", 500, 0, 3000).D("\u6de1\u51fa\u65f6\u95f4"));
    public final l s = this.p(new l("TimeOut", 500, 0, 3000).D("\u8d85\u65f6\u65f6\u95f4"));
    private final A M = this.y(new A("Box", new Color(255, 255, 255, 255)).P("\u65b9\u6846").t(true));
    private final A h = this.y(new A("Fill", new Color(255, 255, 255, 100)).P("\u586b\u5145").t(true));
    private final A e = this.y(new A("TryPlaceBox", new Color(178, 178, 178, 255)).P("\u5c1d\u8bd5\u653e\u7f6e\u65b9\u6846").t(true));
    private final A u = this.y(new A("TryPlaceFill", new Color(255, 119, 119, 157)).P("\u5c1d\u8bd5\u653e\u7f6e\u586b\u5145").t(true));
    private final W d = this.S(new W("NoFail", false).k("\u4e0d\u5224\u5931\u8d25"));
    private final B<S> Z = this.S(new B<S>("Ease", dev.idhammai.P.A.A.S.CubicInOut).I("\u7f13\u52a8"));
    private final B<dev.idhammai.c.r.q.n.y> E = this.S(new B<dev.idhammai.c.r.q.n.y>("Mode", dev.idhammai.c.r.q.n.y.All).I("\u6a21\u5f0f"));

    public h() {
        super("PlaceRender", dev.idhammai.c.r.w.Render);
        this.L("\u653e\u7f6e\u663e\u793a");
        this.E.X(dev.idhammai.c.r.q.n.y.Fade, "\u6de1\u51fa");
        this.E.X(dev.idhammai.c.r.q.n.y.Shrink, "\u6536\u7f29");
        this.E.X(dev.idhammai.c.r.q.n.y.All, "\u5168\u90e8");
        this.C();
        k = this;
    }

    @Override
    public void h(class_4587 class_45872) {
        I.values().removeIf(arg_0 -> h.lambda$onRender3D$0(class_45872, arg_0));
    }

    public void H(class_2338 class_23382) {
        I.put(class_23382, new X(this, class_23382));
    }

    private static boolean lambda$onRender3D$0(class_4587 class_45872, X x2) {
        return x2.t(class_45872);
    }
}

