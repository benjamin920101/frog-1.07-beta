/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  net.minecraft.class_1657
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_3417
 *  net.minecraft.class_4587
 *  net.minecraft.class_742
 */
package dev.idhammai.c.r.q.Q;

import com.google.common.collect.Maps;
import dev.idhammai.Frog;
import dev.idhammai.P.A.A.h;
import dev.idhammai.P.A.N.O;
import dev.idhammai.P.A.S.K;
import dev.idhammai.P.A.S.Z;
import dev.idhammai.P.A.l.M;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.N;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.P.r.c.t;
import dev.idhammai.asm.accessors.IEntity;
import dev.idhammai.c.r.O.Y.A;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.q.Q.Q;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import java.awt.Color;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import net.minecraft.class_1657;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_3417;
import net.minecraft.class_4587;
import net.minecraft.class_742;

public class j
extends y {
    public static j n;
    private final W A = this.S(new W("Message", true).k("\u804a\u5929\u63d0\u793a"));
    private final A N = this.y(new A("Box", new Color(255, 255, 255, 100)).P("\u65b9\u6846\u989c\u8272").t(true));
    private final A b = this.y(new A("Fill", new Color(255, 255, 255, 100)).P("\u586b\u5145\u989c\u8272").t(true));
    private final A l = this.y(new A("Text", new Color(255, 255, 255, 255)).P("\u6587\u5b57\u989c\u8272").t(true));
    private final A Z = this.y(new A("ChamsFill", new Color(255, 255, 255, 100)).P("\u6a21\u578b\u586b\u5145").t(true));
    private final A F = this.y(new A("ChamsLine", new Color(255, 255, 255, 100)).P("\u6a21\u578b\u7ebf\u6761").t(true));
    private final W t = this.S(new W("Chorus", false).k("\u7d2b\u9882\u679c\u68c0\u6d4b").D());
    private final l u = this.p(new l("MaxTime", 10.0, 0.0, 50.0, 1.0, this.t::f).D("\u4fdd\u7559\u65f6\u95f4").P("s"));
    private final W w = this.S(new W("Teleport", false).k("\u77ac\u79fb\u68c0\u6d4b").D());
    private final l y = this.p(new l("Delay", 1.0, 0.0, 10.0, 0.01, this.w::f).D("\u68c0\u6d4b\u95f4\u9694").P("s"));
    private final l U = this.p(new l("Distance", 20.0, 0.0, 100.0, 0.01, this.w::f).D("\u5224\u5b9a\u8ddd\u79bb").P("m"));
    private final Map<UUID, O> J = Maps.newConcurrentMap();
    private final Map<UUID, Z> E = Maps.newConcurrentMap();
    private static final CopyOnWriteArrayList<Q> D;
    private final h I = new h();

    public j() {
        super("TeleportLogger", dev.idhammai.c.r.w.Exploit);
        this.L("\u4f20\u9001\u68c0\u6d4b");
        n = this;
    }

    @Override
    public void H() {
        this.J.clear();
        this.E.clear();
    }

    @Override
    public void F() {
        this.J.clear();
        this.E.clear();
    }

    @r
    public void F(N n2) {
        if (this.w.h()) {
            this.J.remove(n2.s().method_7334().getId());
            this.E.remove(n2.s().method_7334().getId());
        }
    }

    @r
    public void y(QO qO) {
        if (this.t.h()) {
            D.removeIf(Q::M);
        }
        if (this.w.h() && this.I.r(this.y.e())) {
            this.I.H();
            for (class_742 class_7422 : Frog.THREAD.v()) {
                if (class_7422 == null || class_7422.equals((Object)j.W.field_1724)) continue;
                O o2 = this.J.get(class_7422.method_7334().getId());
                if (o2 != null && M.i(o2.method_23317(), o2.method_23321(), class_7422.method_23317(), class_7422.method_23321()) >= this.U.e()) {
                    if (this.A.h()) {
                        this.y("\u00a7f" + class_7422.method_5477().getString() + " \u00a7rTeleported to \u00a7f" + class_7422.method_31477() + ", " + class_7422.method_31478() + ", " + class_7422.method_31479() + ".");
                    }
                    this.E.put(class_7422.method_7334().getId(), new Z(o2));
                }
                this.J.put(class_7422.method_7334().getId(), new O((class_1657)class_7422));
            }
        }
    }

    @Override
    public void h(class_4587 class_45872) {
        class_238 class_2383;
        class_1657 class_16572;
        if (this.w.h()) {
            for (Z object : this.E.values()) {
                class_16572 = object.P;
                class_2383 = ((IEntity)class_16572).getDimensions().method_30757(class_16572.method_19538());
                if (this.N.i) {
                    K.N(class_45872, class_2383, this.N.P());
                }
                if (this.b.i) {
                    K.F(class_45872, class_2383, this.b.P());
                }
                if (this.Z.i || this.F.i) {
                    object.f(class_45872, this.Z, this.F);
                }
                if (!this.l.i) continue;
                K.x(class_16572.method_5477().getString() + " Teleported", new class_243(class_16572.method_23317(), ((IEntity)class_16572).getDimensions().method_30757((class_243)class_16572.method_19538()).field_1325 + 0.5, class_16572.method_23321()), this.l.P());
            }
        }
        if (this.t.h()) {
            for (Q q2 : D) {
                class_16572 = q2.ru;
                class_2383 = new class_238(class_16572.method_10216() - 0.3, class_16572.method_10214(), class_16572.method_10215() - 0.3, class_16572.method_10216() + 0.3, class_16572.method_10214() + 1.85, class_16572.method_10215() + 0.3);
                if (this.N.i) {
                    K.N(class_45872, class_2383, this.N.P());
                }
                if (this.b.i) {
                    K.F(class_45872, class_2383, this.b.P());
                }
                if (!this.l.i) continue;
                K.x("Chorus", new class_243(class_2383.method_1005().method_10216(), class_2383.field_1325 + 0.5, class_2383.method_1005().method_10215()), this.l.P());
            }
        }
    }

    @r
    public void F(t t2) {
        if (j.M() || !this.t.h()) {
            return;
        }
        if (t2.L.method_4775() == class_3417.field_14890.method_14833()) {
            D.add(new Q(new class_243(t2.L.method_4784(), t2.L.method_4779(), t2.L.method_4778()), new h()));
        }
    }

    static {
        D = new CopyOnWriteArrayList();
    }
}

