/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  net.minecraft.class_1657
 *  net.minecraft.class_1934
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_2596
 *  net.minecraft.class_2703
 *  net.minecraft.class_2703$class_2705
 *  net.minecraft.class_2703$class_5893
 *  net.minecraft.class_4587
 *  net.minecraft.class_742
 *  net.minecraft.class_7828
 */
package dev.idhammai.c.r.q.n;

import com.google.common.collect.Maps;
import dev.idhammai.Frog;
import dev.idhammai.P.A.S.K;
import dev.idhammai.P.A.S.Z;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.P.r.c.i;
import dev.idhammai.asm.accessors.IEntity;
import dev.idhammai.c.r.O.Y.A;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import java.awt.Color;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import net.minecraft.class_1657;
import net.minecraft.class_1934;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2703;
import net.minecraft.class_4587;
import net.minecraft.class_742;
import net.minecraft.class_7828;

public class o
extends y {
    private final A w = this.y(new A("Box", new Color(255, 255, 255, 100)).P("\u65b9\u6846").t(true));
    private final A Y = this.y(new A("Fill", new Color(255, 255, 255, 100)).P("\u586b\u5145").t(true));
    private final A J = this.y(new A("Text", new Color(255, 255, 255, 255)).P("\u6587\u672c").t(true));
    private final A Z = this.y(new A("ChamsFill", new Color(255, 255, 255, 100)).P("\u6a21\u578b\u586b\u5145").t(true));
    private final A G = this.y(new A("ChamsLine", new Color(255, 255, 255, 100)).P("\u6a21\u578b\u7ebf\u6761").t(true));
    final Map<UUID, class_1657> k = Maps.newConcurrentMap();
    final Map<UUID, Z> N = Maps.newConcurrentMap();
    private final W c = this.S(new W("Health", true).k("\u8840\u91cf"));
    private final W s = this.S(new W("Totem", true).k("\u56fe\u817e\u6b21\u6570"));
    private final W y = this.S(new W("Message", true).k("\u6d88\u606f\u63d0\u793a"));

    public o() {
        super("LogoutSpots", dev.idhammai.c.r.w.Render);
        this.L("\u9000\u51fa\u8bb0\u5f55");
    }

    @r
    public void f(i i2) {
        block11: {
            class_2596<?> class_25962;
            block10: {
                if (o.M()) {
                    return;
                }
                class_25962 = i2.L();
                if (!(class_25962 instanceof class_2703)) break block10;
                class_2703 class_27032 = (class_2703)class_25962;
                if (!class_27032.method_46327().contains(class_2703.class_5893.field_29136)) break block11;
                for (class_2703.class_2705 class_27052 : class_27032.method_46330()) {
                    if (class_27052.comp_1110() == class_1934.field_9219) continue;
                    for (UUID uUID : this.N.keySet()) {
                        if (!uUID.equals(class_27052.comp_1107().getId())) continue;
                        class_1657 class_16572 = this.N.get((Object)uUID).P;
                        if (this.y.h()) {
                            W.execute(() -> this.lambda$onPacketReceive$0(class_16572));
                        }
                        this.N.remove(uUID);
                    }
                }
                break block11;
            }
            class_25962 = i2.L();
            if (class_25962 instanceof class_7828) {
                List list;
                class_7828 class_78282 = (class_7828)class_25962;
                try {
                    List list2 = class_78282.comp_1105();
                    list = list2;
                }
                catch (Throwable throwable) {
                    throw new MatchException(throwable.toString(), throwable);
                }
                for (UUID uUID : list) {
                    for (UUID uUID2 : this.k.keySet()) {
                        if (!uUID2.equals(uUID)) continue;
                        class_1657 class_16573 = this.k.get(uUID2);
                        if (this.N.containsKey(uUID2) || class_16573 == null) continue;
                        Z z2 = new Z(class_16573);
                        if (this.y.h()) {
                            W.execute(() -> this.lambda$onPacketReceive$1(class_16573));
                        }
                        this.N.put(uUID2, z2);
                    }
                }
            }
        }
    }

    @Override
    public void L() {
        this.k.clear();
        this.N.clear();
    }

    @r
    public void i(QO qO) {
        this.k.clear();
        for (class_742 class_7422 : Frog.THREAD.v()) {
            if (class_7422 == null || class_7422.equals((Object)o.W.field_1724)) continue;
            this.k.put(class_7422.method_7334().getId(), (class_1657)class_7422);
        }
    }

    @Override
    public void h(class_4587 class_45872) {
        for (Z z2 : this.N.values()) {
            class_1657 class_16572 = z2.P;
            class_238 class_2383 = ((IEntity)class_16572).getDimensions().method_30757(class_16572.method_19538());
            if (this.w.i) {
                K.N(class_45872, class_2383, this.w.P());
            }
            if (this.Y.i) {
                K.F(class_45872, class_2383, this.Y.P());
            }
            if (this.Z.i || this.G.i) {
                z2.f(class_45872, this.Z, this.G);
            }
            if (!this.J.i) continue;
            K.x(class_16572.method_5477().getString() + (String)(this.c.h() ? String.valueOf(dev.idhammai.c.r.q.N.z.y.k(class_16572)) + " " + o.q(class_16572.method_6032() + class_16572.method_6067()) : "") + (String)(this.s.h() && Frog.POP.x(class_16572) > 0 ? String.valueOf(dev.idhammai.c.r.q.N.z.y.X(Frog.POP.x(class_16572))) + " -" + Frog.POP.x(class_16572) : ""), new class_243(class_16572.method_23317(), ((IEntity)class_16572).getDimensions().method_30757((class_243)class_16572.method_19538()).field_1325 + 0.5, class_16572.method_23321()), this.J.P());
        }
    }

    public static float q(double d2) {
        BigDecimal bigDecimal = new BigDecimal(d2);
        bigDecimal = bigDecimal.setScale(1, RoundingMode.HALF_UP);
        return bigDecimal.floatValue();
    }

    private void lambda$onPacketReceive$1(class_1657 class_16572) {
        this.y("\u00a7f" + class_16572.method_5477().getString() + " \u00a7rLogged out at \u00a7f" + class_16572.method_31477() + ", " + class_16572.method_31478() + ", " + class_16572.method_31479());
    }

    private void lambda$onPacketReceive$0(class_1657 class_16572) {
        this.y("\u00a7f" + class_16572.method_5477().getString() + " \u00a7rLogged back at \u00a7f" + class_16572.method_31477() + ", " + class_16572.method_31478() + ", " + class_16572.method_31479());
    }
}

