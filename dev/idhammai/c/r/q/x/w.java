/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_640
 */
package dev.idhammai.c.r.q.x;

import dev.idhammai.P.A.A.h;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.O.Y.v;
import dev.idhammai.c.r.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.Random;
import net.minecraft.class_640;

public class w
extends y {
    private static final String c = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    public final W V = this.S(new W("CheckSelf", false).k("\u5ffd\u7565\u81ea\u5df1"));
    final v I = this.E(new v("Message", "").c("\u6d88\u606f\u5185\u5bb9"));
    private final Random g = new Random();
    private final l F = this.p(new l("Random", 3.0, 0.0, 20.0, 1.0).D("\u968f\u673a\u540e\u7f00\u957f\u5ea6"));
    private final l d = this.p(new l("Delay", 5.0, 0.0, 60.0, 0.1).D("\u53d1\u9001\u95f4\u9694").P("s"));
    private final W l = this.S(new W("RandomWhisper", false).k("\u968f\u673a\u79c1\u804a"));
    private final W n = this.S(new W("AutoDisable", true).k("\u81ea\u52a8\u5173\u95ed"));
    private final h H = new h();

    public w() {
        super("Spammer", dev.idhammai.c.r.w.Misc);
        this.L("\u81ea\u52a8\u5237\u5c4f");
    }

    @Override
    public void W() {
        if (this.n.h()) {
            this.p();
        }
    }

    @r
    public void c(QO qO) {
        if (!this.H.r(this.d.e())) {
            return;
        }
        this.H.H();
        Object object = this.v(this.F.V());
        if (!((String)object).isEmpty()) {
            object = " " + (String)object;
        }
        if (this.l.h()) {
            Collection collection = W.method_1562().method_2880();
            ArrayList arrayList = new ArrayList(collection);
            int n2 = arrayList.size();
            if (n2 == 0) {
                return;
            }
            class_640 class_6402 = (class_640)arrayList.get(this.g.nextInt(n2));
            int n3 = 0;
            while (this.V.h() && Objects.equals(class_6402.method_2966().getName(), w.W.field_1724.method_7334().getName())) {
                if (n3 > 50) {
                    return;
                }
                ++n3;
                class_6402 = (class_640)arrayList.get(this.g.nextInt(n2));
            }
            W.method_1562().method_45730("tell " + class_6402.method_2966().getName() + " " + this.I.q() + (String)object);
        } else if (this.I.q().startsWith("/")) {
            W.method_1562().method_45731(this.I.q().replaceFirst("/", "") + (String)object);
        } else {
            W.method_1562().method_45729(this.I.q() + (String)object);
        }
    }

    private String v(int n2) {
        StringBuilder stringBuilder = new StringBuilder(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = this.g.nextInt(c.length());
            stringBuilder.append(c.charAt(n3));
        }
        return stringBuilder.toString();
    }
}

