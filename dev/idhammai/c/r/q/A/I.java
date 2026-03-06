/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1511
 *  net.minecraft.class_238
 *  net.minecraft.class_2596
 *  net.minecraft.class_2824
 *  net.minecraft.class_2824$class_5907
 *  net.minecraft.class_2824$class_5908
 *  net.minecraft.class_2828
 *  net.minecraft.class_2828$class_2829
 */
package dev.idhammai.c.r.q.A;

import dev.idhammai.P.A.L.e;
import dev.idhammai.P.A.L.l;
import dev.idhammai.P.A.l.M;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.J;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.asm.accessors.IPlayerInteractEntityC2SPacket;
import dev.idhammai.asm.accessors.IPlayerMoveC2SPacket;
import dev.idhammai.c.r.O.Y.B;
import dev.idhammai.c.r.q.A.t;
import dev.idhammai.c.r.q.A.v;
import dev.idhammai.c.r.q.Q.W;
import dev.idhammai.c.r.q.Q.X;
import dev.idhammai.c.r.q.i.u;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import net.minecraft.class_1297;
import net.minecraft.class_1511;
import net.minecraft.class_238;
import net.minecraft.class_2596;
import net.minecraft.class_2824;
import net.minecraft.class_2828;

public class I
extends y {
    public static I Z;
    public final B<v> L = this.S(new B<v>("Mode", v.OldNCP).I("\u6a21\u5f0f").X(v.UpdatedNCP, "\u65b0\u7248NCP").X(v.Strict, "\u4e25\u683c").X(v.NCP, "NCP").X(v.OldNCP, "\u65e7NCP").X(v.Hypixel2K22, "Hypixel2K22").X(v.Packet, "\u53d1\u5305").X(v.Ground, "\u5730\u9762").X(v.BBTT, "BBTT"));
    public final dev.idhammai.c.r.O.Y.W j = this.S(new dev.idhammai.c.r.O.Y.W("OnlyGround", true, this::lambda$new$0).k("\u4ec5\u5730\u9762"));
    private final dev.idhammai.c.r.O.Y.W m = this.S(new dev.idhammai.c.r.O.Y.W("SetNoGround", false, this::lambda$new$1).k("\u53d1\u9001\u79bb\u5730"));
    private final dev.idhammai.c.r.O.Y.W g = this.S(new dev.idhammai.c.r.O.Y.W("BlockCheck", true, this::lambda$new$2).k("\u65b9\u5757\u68c0\u6d4b"));
    private final dev.idhammai.c.r.O.Y.W P = this.S(new dev.idhammai.c.r.O.Y.W("AutoJump", true, this::lambda$new$3).k("\u81ea\u52a8\u8df3\u8dc3").D());
    private final dev.idhammai.c.r.O.Y.W t = this.S(new dev.idhammai.c.r.O.Y.W("Mini", true, this::lambda$new$4).k("\u5fae\u8df3"));
    private final dev.idhammai.c.r.O.Y.l k = this.p(new dev.idhammai.c.r.O.Y.l("MotionY", 0.05, 0.0, 1.0, 1.0E-10, this::lambda$new$5).D("Y\u901f\u5ea6"));
    private final dev.idhammai.c.r.O.Y.W H = this.S(new dev.idhammai.c.r.O.Y.W("AutoDisable", true, this::lambda$new$6).k("\u81ea\u52a8\u5173\u95ed"));
    private final dev.idhammai.c.r.O.Y.W Q = this.S(new dev.idhammai.c.r.O.Y.W("CrawlingDisable", true, this::lambda$new$7).k("\u8db4\u4e0b\u5173\u95ed"));
    private final dev.idhammai.c.r.O.Y.W u = this.S(new dev.idhammai.c.r.O.Y.W("Flight", false, this::lambda$new$8).k("\u60ac\u505c"));
    boolean M = false;

    public I() {
        super("Criticals", w.Combat);
        this.L("\u5200\u5200\u66b4\u51fb");
        Z = this;
    }

    @Override
    public String I() {
        return this.L.X().name();
    }

    @r
    public void O(J j2) {
        class_1297 class_12972;
        class_2824 class_28242;
        if (j2.p()) {
            return;
        }
        if (W.b.p() && W.b.m.h()) {
            return;
        }
        if (this.L.x(v.Ground)) {
            if (X.j) {
                return;
            }
            if (dev.idhammai.c.r.q.i.u.B || dev.idhammai.c.r.q.Q.t.V.p()) {
                return;
            }
            if (!this.m.h()) {
                return;
            }
            if (j2.L() instanceof class_2828) {
                ((IPlayerMoveC2SPacket)j2.L()).setOnGround(false);
            }
            return;
        }
        class_2596<?> class_25962 = j2.L();
        if (!(!(class_25962 instanceof class_2824) || I.a(class_28242 = (class_2824)class_25962) != class_2824.class_5907.field_29172 || (class_12972 = I.K(class_28242)) instanceof class_1511 || this.j.h() && !I.W.field_1724.method_24828() && !I.W.field_1724.method_31549().field_7479 || I.W.field_1724.method_5771() || I.W.field_1724.method_5799() || class_12972 == null)) {
            this.t(class_12972);
        }
    }

    @Override
    public void W() {
        if (this.L.x(v.Ground) && this.H.h()) {
            this.p();
        }
    }

    @Override
    public void H() {
        if (W.b.p() && W.b.m.h()) {
            return;
        }
        this.M = true;
        if (this.L.x(v.Ground)) {
            if (I.M()) {
                if (this.H.h()) {
                    this.p();
                }
            } else if (l.b() && this.H.h()) {
                this.p();
            } else if (this.Q.h() && I.W.field_1724.method_20448()) {
                this.p();
            } else if (I.W.field_1724.method_24828() && this.P.h() && (!this.g.h() || dev.idhammai.P.A.l.M.d((class_1297)I.W.field_1724, new class_238(e.H(true).method_10086(2))))) {
                this.a();
            }
        }
    }

    public void a() {
        if (this.t.h()) {
            l.d(this.k.e());
        } else {
            I.W.field_1724.method_6043();
        }
    }

    @r
    public void B(QO qO) {
        if (W.b.p() && W.b.m.h()) {
            return;
        }
        if (this.L.x(v.Ground)) {
            if (this.Q.h() && I.W.field_1724.method_20448()) {
                this.p();
            } else if (l.b() && this.H.h()) {
                this.p();
            } else if (this.u.h() && I.W.field_1724.field_6017 > 0.0f) {
                l.d(0.0);
                l.U(0.0);
                l.Q(0.0);
                this.M = false;
            } else if (this.g.h() && !dev.idhammai.P.A.l.M.d((class_1297)I.W.field_1724, new class_238(e.H(true).method_10086(2)))) {
                this.M = true;
            } else if (I.W.field_1724.method_24828() && this.P.h() && (this.u.h() || this.M)) {
                this.a();
                this.M = false;
            }
        }
    }

    public void t(class_1297 class_12972) {
        switch (this.L.X().ordinal()) {
            case 7: {
                if (l.b() || !l.j()) {
                    return;
                }
                W.method_1562().method_52787((class_2596)new class_2828.class_2829(I.W.field_1724.method_23317(), I.W.field_1724.method_23318(), I.W.field_1724.method_23321(), true));
                W.method_1562().method_52787((class_2596)new class_2828.class_2829(I.W.field_1724.method_23317(), I.W.field_1724.method_23318() + 0.0625, I.W.field_1724.method_23321(), false));
                W.method_1562().method_52787((class_2596)new class_2828.class_2829(I.W.field_1724.method_23317(), I.W.field_1724.method_23318() + 0.045, I.W.field_1724.method_23321(), false));
                break;
            }
            case 1: {
                I.W.field_1724.method_7277(class_12972);
                W.method_1562().method_52787((class_2596)new class_2828.class_2829(I.W.field_1724.method_23317(), I.W.field_1724.method_23318() + 0.062600301692775, I.W.field_1724.method_23321(), false));
                W.method_1562().method_52787((class_2596)new class_2828.class_2829(I.W.field_1724.method_23317(), I.W.field_1724.method_23318() + 0.07260029960661, I.W.field_1724.method_23321(), false));
                W.method_1562().method_52787((class_2596)new class_2828.class_2829(I.W.field_1724.method_23317(), I.W.field_1724.method_23318(), I.W.field_1724.method_23321(), false));
                W.method_1562().method_52787((class_2596)new class_2828.class_2829(I.W.field_1724.method_23317(), I.W.field_1724.method_23318(), I.W.field_1724.method_23321(), false));
                break;
            }
            case 2: {
                I.W.field_1724.method_7277(class_12972);
                W.method_1562().method_52787((class_2596)new class_2828.class_2829(I.W.field_1724.method_23317(), I.W.field_1724.method_23318() + 0.0625, I.W.field_1724.method_23321(), false));
                W.method_1562().method_52787((class_2596)new class_2828.class_2829(I.W.field_1724.method_23317(), I.W.field_1724.method_23318(), I.W.field_1724.method_23321(), false));
                break;
            }
            case 3: {
                I.W.field_1724.method_7277(class_12972);
                W.method_1562().method_52787((class_2596)new class_2828.class_2829(I.W.field_1724.method_23317(), I.W.field_1724.method_23318() + 1.058293536E-5, I.W.field_1724.method_23321(), false));
                W.method_1562().method_52787((class_2596)new class_2828.class_2829(I.W.field_1724.method_23317(), I.W.field_1724.method_23318() + 9.16580235E-6, I.W.field_1724.method_23321(), false));
                W.method_1562().method_52787((class_2596)new class_2828.class_2829(I.W.field_1724.method_23317(), I.W.field_1724.method_23318() + 1.0371854E-7, I.W.field_1724.method_23321(), false));
                break;
            }
            case 0: {
                I.W.field_1724.method_7277(class_12972);
                W.method_1562().method_52787((class_2596)new class_2828.class_2829(I.W.field_1724.method_23317(), I.W.field_1724.method_23318() + 2.71875E-7, I.W.field_1724.method_23321(), false));
                W.method_1562().method_52787((class_2596)new class_2828.class_2829(I.W.field_1724.method_23317(), I.W.field_1724.method_23318(), I.W.field_1724.method_23321(), false));
                break;
            }
            case 4: {
                I.W.field_1724.method_7277(class_12972);
                W.method_1562().method_52787((class_2596)new class_2828.class_2829(I.W.field_1724.method_23317(), I.W.field_1724.method_23318() + 0.0045, I.W.field_1724.method_23321(), true));
                W.method_1562().method_52787((class_2596)new class_2828.class_2829(I.W.field_1724.method_23317(), I.W.field_1724.method_23318() + 1.52121E-4, I.W.field_1724.method_23321(), false));
                W.method_1562().method_52787((class_2596)new class_2828.class_2829(I.W.field_1724.method_23317(), I.W.field_1724.method_23318() + 0.3, I.W.field_1724.method_23321(), false));
                W.method_1562().method_52787((class_2596)new class_2828.class_2829(I.W.field_1724.method_23317(), I.W.field_1724.method_23318() + 0.025, I.W.field_1724.method_23321(), false));
                break;
            }
            case 5: {
                I.W.field_1724.method_7277(class_12972);
                W.method_1562().method_52787((class_2596)new class_2828.class_2829(I.W.field_1724.method_23317(), I.W.field_1724.method_23318() + 5.0E-4, I.W.field_1724.method_23321(), false));
                W.method_1562().method_52787((class_2596)new class_2828.class_2829(I.W.field_1724.method_23317(), I.W.field_1724.method_23318() + 1.0E-4, I.W.field_1724.method_23321(), false));
            }
        }
    }

    public static class_1297 K(class_2824 class_28242) {
        return I.W.field_1687 == null ? null : I.W.field_1687.method_8469(((IPlayerInteractEntityC2SPacket)class_28242).getEntityId());
    }

    public static class_2824.class_5907 a(class_2824 class_28242) {
        class_2824.class_5907[] class_5907Array = new class_2824.class_5907[1];
        class_28242.method_34209((class_2824.class_5908)new t(class_5907Array));
        return class_5907Array[0];
    }

    private boolean lambda$new$8() {
        return this.L.x(v.Ground);
    }

    private boolean lambda$new$7() {
        return this.L.x(v.Ground);
    }

    private boolean lambda$new$6() {
        return this.L.x(v.Ground);
    }

    private boolean lambda$new$5() {
        return this.L.x(v.Ground) && this.P.f();
    }

    private boolean lambda$new$4() {
        return this.L.x(v.Ground) && this.P.f();
    }

    private boolean lambda$new$3() {
        return this.L.x(v.Ground);
    }

    private boolean lambda$new$2() {
        return this.L.x(v.Ground);
    }

    private boolean lambda$new$1() {
        return this.L.x(v.Ground);
    }

    private boolean lambda$new$0() {
        return !this.L.x(v.Ground);
    }
}

