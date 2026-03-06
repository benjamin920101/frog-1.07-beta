/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.world.World
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket
 *  net.minecraft.client.network.AbstractClientPlayerEntity
 */
package dev.idhammai.p.J;

import dev.idhammai.Frog;
import dev.idhammai.P.A.J;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.N;
import dev.idhammai.P.r.c.Q4;
import dev.idhammai.P.r.c.i;
import dev.idhammai.c.r.q.N.P;
import dev.idhammai.c.r.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket;
import net.minecraft.client.network.AbstractClientPlayerEntity;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class R
implements J {
    public final HashMap<String, Integer> R = new HashMap();
    private final List<class_1657> J = new ArrayList<class_1657>();

    public R() {
        this.E();
    }

    public void E() {
        Frog.EVENT_BUS.S(this);
        P.F = "GOUTOURENNIMASILECAONIMA";
    }

    public int g(String string) {
        return this.R.getOrDefault(string, 0);
    }

    public int x(class_1657 class_16572) {
        return this.g(class_16572.method_5477().getString());
    }

    public void F() {
        if (y.M()) {
            return;
        }
        for (class_742 class_7422 : Frog.THREAD.v()) {
            if (class_7422 == null || !class_7422.method_29504()) {
                this.J.remove(class_7422);
                continue;
            }
            if (this.J.contains(class_7422)) continue;
            Frog.EVENT_BUS.J(N.h((class_1657)class_7422));
            this.x((class_1657)class_7422);
            this.J.add((class_1657)class_7422);
        }
    }

    @r
    public void A(i i2) {
        class_1297 class_12972;
        class_2663 class_26632;
        if (y.M()) {
            return;
        }
        class_2596<?> class_25962 = i2.L();
        if (class_25962 instanceof class_2663 && (class_26632 = (class_2663)class_25962).method_11470() == 35 && (class_12972 = class_26632.method_11469((class_1937)dev.idhammai.p.J.R.W.field_1687)) instanceof class_1657) {
            class_1657 class_16572 = (class_1657)class_12972;
            this.M(class_16572);
        }
    }

    public void x(class_1657 class_16572) {
        this.R.remove(class_16572.method_5477().getString());
    }

    public void M(class_1657 class_16572) {
        int n2 = 1;
        if (this.R.containsKey(class_16572.method_5477().getString())) {
            n2 = this.R.get(class_16572.method_5477().getString());
            this.R.put(class_16572.method_5477().getString(), ++n2);
        } else {
            this.R.put(class_16572.method_5477().getString(), n2);
        }
        Frog.EVENT_BUS.J(Q4.z(class_16572));
    }
}

