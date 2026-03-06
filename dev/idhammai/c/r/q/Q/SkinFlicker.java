/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.PlayerModelPart
 */
package dev.idhammai.c.r.q.Q;

import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.c.r.O.Y.B;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.q.Q.L;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import java.util.Random;
import net.minecraft.entity.player.PlayerModelPart;

public class Y
extends y {
    private final B<L> N = this.S(new B<L>("Mode", L.Random).I("\u6a21\u5f0f").X(L.Random, "\u968f\u673a").X(L.Switch, "\u5207\u6362").X(L.Sync, "\u540c\u6b65"));
    private final W X = this.S(new W("CAPE", true).k("\u62ab\u98ce"));
    private final W b = this.S(new W("JACKET", true).k("\u5939\u514b"));
    private final W w = this.S(new W("LEFT_SLEEVE", true).k("\u5de6\u8896"));
    private final W j = this.S(new W("RIGHT_SLEEVE", true).k("\u53f3\u8896"));
    private final W e = this.S(new W("LEFT_PANTS_LEG", true).k("\u5de6\u88e4\u817f"));
    private final W B = this.S(new W("RIGHT_PANTS_LEG", true).k("\u53f3\u88e4\u817f"));
    private final W P = this.S(new W("HAT", true).k("\u5e3d\u5b50"));
    final Random n = new Random();
    boolean Q = false;

    public Y() {
        super("SkinFlicker", dev.idhammai.c.r.w.Exploit);
        this.L("\u76ae\u80a4\u95ea\u70c1");
    }

    /*
     * Enabled aggressive block sorting
     */
    @r
    public void c(QO qO) {
        this.Q = !this.Q;
        class_1664[] class_1664Array = class_1664.values();
        int n2 = class_1664Array.length;
        int n3 = 0;
        while (true) {
            block22: {
                if (n3 >= n2) {
                    return;
                }
                class_1664 class_16642 = class_1664Array[n3];
                switch (class_16642.method_35206()) {
                    case 0: {
                        if (this.X.h()) {
                            break;
                        }
                        break block22;
                    }
                    case 1: {
                        if (this.b.h()) {
                            break;
                        }
                        break block22;
                    }
                    case 2: {
                        if (this.w.h()) {
                            break;
                        }
                        break block22;
                    }
                    case 3: {
                        if (this.j.h()) {
                            break;
                        }
                        break block22;
                    }
                    case 4: {
                        if (this.e.h()) {
                            break;
                        }
                        break block22;
                    }
                    case 5: {
                        if (this.B.h()) {
                            break;
                        }
                        break block22;
                    }
                    case 6: {
                        if (!this.P.h()) break block22;
                    }
                }
                boolean bl = true;
                switch (this.N.X().ordinal()) {
                    case 0: {
                        bl = this.n.nextBoolean();
                        break;
                    }
                    case 1: {
                        bl = !Y.W.field_1690.method_32594(class_16642);
                        break;
                    }
                    case 2: {
                        bl = this.Q;
                        break;
                    }
                }
                Y.W.field_1690.method_1631(class_16642, bl);
            }
            ++n3;
        }
    }
}

