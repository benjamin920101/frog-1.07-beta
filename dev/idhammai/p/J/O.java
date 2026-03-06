/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.s2c.play.WorldTimeUpdateS2CPacket
 *  net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket$InteractType
 *  net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket
 *  net.minecraft.network.packet.c2s.play.HandSwingC2SPacket
 *  net.minecraft.network.packet.s2c.play.ChatMessageS2CPacket
 *  net.minecraft.network.packet.s2c.play.GameMessageS2CPacket
 */
package dev.idhammai.p.J;

import dev.idhammai.Frog;
import dev.idhammai.P.A.A.A;
import dev.idhammai.P.A.A.h;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.J;
import dev.idhammai.P.r.c.i;
import dev.idhammai.P.r.c.k;
import dev.idhammai.c.r.q.A.I;
import dev.idhammai.c.r.q.N.j;
import dev.idhammai.c.r.q.N.x;
import dev.idhammai.c.r.q.x.R;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.WorldTimeUpdateS2CPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import net.minecraft.network.packet.c2s.play.HandSwingC2SPacket;
import net.minecraft.network.packet.s2c.play.ChatMessageS2CPacket;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;

public class O
implements dev.idhammai.P.A.J {
    public final h l = new h();
    public int E = -1;
    private final ArrayDeque<Float> M = new ArrayDeque(20);
    boolean d = true;
    private long I;
    private long C;
    private float K;
    int n;

    public O() {
        Frog.EVENT_BUS.S(this);
    }

    public static float r(double d2) {
        BigDecimal bigDecimal = new BigDecimal(d2);
        bigDecimal = bigDecimal.setScale(2, RoundingMode.HALF_UP);
        return bigDecimal.floatValue();
    }

    @r(D=-200)
    public void y(J j2) {
        if (x.y.d.h()) {
            class_2868 class_28682;
            if (j2.p()) {
                return;
            }
            class_2596<?> class_25962 = j2.L();
            if (class_25962 instanceof class_2879 || class_25962 instanceof class_2824 && dev.idhammai.c.r.q.A.I.a((class_2824)class_25962) == class_2824.class_5907.field_29172) {
                O.W.field_1724.method_7350();
            } else if (class_25962 instanceof class_2868 && this.n != (class_28682 = (class_2868)class_25962).method_12442()) {
                this.n = class_28682.method_12442();
                O.W.field_1724.method_7350();
            }
        }
    }

    @r
    public void E(k k2) {
        this.E = -1;
    }

    @r
    public void B(J j2) {
        class_2596<?> class_25962 = j2.L();
        if (class_25962 instanceof class_2868) {
            class_2868 class_28682 = (class_2868)class_25962;
            int n2 = class_28682.method_12442();
            if (x.y.X.h() && n2 == this.E) {
                j2.L();
                return;
            }
            this.E = n2;
        }
    }

    public float q() {
        return O.r(this.K);
    }

    public float w() {
        return O.r(20.0f * ((float)this.C / 1000.0f));
    }

    public float T() {
        return this.q() / 20.0f;
    }

    @r(D=999)
    public void E(i i2) {
        if (i2.L() instanceof class_2761) {
            if (this.I != 0L) {
                this.C = System.currentTimeMillis() - this.I;
                if (this.M.size() > 20) {
                    this.M.poll();
                }
                this.M.add(Float.valueOf(20.0f * (1000.0f / (float)this.C)));
                float f2 = 0.0f;
                for (Float f3 : this.M) {
                    f2 += A.p(f3.floatValue(), 0.0f, 20.0f);
                }
                this.K = f2 / (float)this.M.size();
            }
            this.I = System.currentTimeMillis();
        }
    }

    @r
    private void O(i i2) {
        if (O.W.field_1724 == null || O.W.field_1687 == null) {
            return;
        }
        String string = null;
        class_2596<?> class_25962 = i2.L();
        if (class_25962 instanceof class_7439) {
            class_7439 class_74392 = (class_7439)class_25962;
            if (class_74392.comp_763() != null) {
                string = class_74392.comp_763().getString();
            }
        } else {
            class_25962 = i2.L();
            if (class_25962 instanceof class_7438) {
                class_7438 class_74382 = (class_7438)class_25962;
                String string2 = string = class_74382.comp_1103() != null ? class_74382.comp_1103().getString() : class_74382.comp_1102().comp_1090();
            }
        }
        if (string != null) {
            // empty if block
        }
    }

    public void a() {
        if (O.W.field_1724 == null) {
            this.l.H();
        }
        if (this.d && O.W.field_1687 != null) {
            j.G.Y();
            R.A = false;
            Frog.MODULE.x();
            this.d = false;
        } else if (!this.d && O.W.field_1687 == null) {
            Frog.save();
            Frog.MODULE.i();
            this.d = true;
        }
    }
}

