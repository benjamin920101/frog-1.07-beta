/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket$PositionAndOnGround
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket$Full
 *  net.minecraft.util.math.MathHelper
 */
package dev.idhammai.c.r.q.Q;

import dev.idhammai.P.A.A.A;
import dev.idhammai.P.A.L.l;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.H;
import dev.idhammai.P.r.c.J;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.util.math.MathHelper;

public class h
extends y {
    public static h h;
    private final W J = this.S(new W("TimerBypass", true).k("\u8ba1\u65f6\u7ed5\u8fc7").D());
    private final dev.idhammai.c.r.O.Y.l g = this.p(new dev.idhammai.c.r.O.Y.l("FullPackets", 15, 1, 50, this.J::f).D("\u5b8c\u6574\u5305\u6570\u91cf"));
    private final dev.idhammai.c.r.O.Y.l I = this.p(new dev.idhammai.c.r.O.Y.l("PositionPackets", 15, 1, 50, this.J::f).D("\u4f4d\u7f6e\u5305\u6570\u91cf"));
    public final W F = this.S(new W("PositionSync", true).k("\u4f4d\u7f6e\u540c\u6b65").D());
    public final dev.idhammai.c.r.O.Y.l V = this.p(new dev.idhammai.c.r.O.Y.l("Delay", 20, 0, 40, this.F::f).D("\u540c\u6b65\u5ef6\u8fdf").P("ticks"));
    private final dev.idhammai.P.A.A.h f = new dev.idhammai.P.A.A.h();
    private final dev.idhammai.P.A.A.h K = new dev.idhammai.P.A.A.h();
    private final dev.idhammai.P.A.A.h C = new dev.idhammai.P.A.A.h();
    public boolean M = true;
    private int y;
    private int R;
    private float A;
    private float Q;

    public h() {
        super("PacketControl", w.Exploit);
        this.L("\u53d1\u5305\u63a7\u5236");
        h = this;
    }

    @r(D=-999)
    public void u(H h2) {
        if (!l.b() || !this.J.h()) {
            return;
        }
        if (this.M) {
            this.A = class_3532.method_15393((float)(h2.q() + dev.idhammai.P.A.A.A.t(-2.0f, 2.0f)));
            this.Q = dev.idhammai.P.A.A.A.p(h2.l() + dev.idhammai.P.A.A.A.t(-2.0f, 2.0f), -90.0f, 90.0f);
        }
        h2.h(this.A);
        h2.v(this.Q);
    }

    @r
    public void y(J j2) {
        class_2596<?> class_25962 = j2.L();
        if (class_25962 instanceof class_2828) {
            class_2828 class_28282 = (class_2828)class_25962;
            if (class_28282.method_36171()) {
                this.C.H();
            }
            if (class_28282.method_36172()) {
                this.K.H();
            }
            this.f.H();
            if (class_28282 instanceof class_2828.class_2829 && !this.M) {
                ++this.R;
                if ((double)this.R >= this.I.e()) {
                    this.R = 0;
                    this.M = true;
                }
            } else if (class_28282 instanceof class_2828.class_2830 && this.M) {
                ++this.y;
                if ((double)this.y >= this.g.e()) {
                    this.y = 0;
                    this.M = false;
                }
            }
        }
    }
}

