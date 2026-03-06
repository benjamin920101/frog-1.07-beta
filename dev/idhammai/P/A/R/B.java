/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket$PositionAndOnGround
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket$OnGroundOnly
 */
package dev.idhammai.P.A.R;

import com.google.common.collect.Lists;
import dev.idhammai.P.A.J;
import dev.idhammai.P.A.R.n;
import dev.idhammai.P.A.R.x;
import dev.idhammai.P.A.R.z;
import java.util.List;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;

public class B
implements J {
    public static void t(class_243 class_2432, z z2, Runnable runnable) {
        switch (z2.ordinal()) {
            case 0: {
                B.f(class_2432, runnable);
                break;
            }
            case 1: {
                B.b(class_2432, runnable);
            }
        }
    }

    public static void f(class_243 class_2432, Runnable runnable) {
        List<n> list = x.J(class_2432);
        list.removeFirst();
        list.forEach(B::lambda$legacyTeleportWithBack$0);
        runnable.run();
        list = Lists.reverse(list);
        list.removeFirst();
        list.forEach(B::lambda$legacyTeleportWithBack$1);
        B.W.field_1724.field_3944.method_52787((class_2596)new class_2828.class_2829(B.W.field_1724.method_23317(), B.W.field_1724.method_23318(), B.W.field_1724.method_23321(), false));
    }

    public static void b(class_243 class_2432, Runnable runnable) {
        int n2;
        int n3 = (int)Math.ceil(B.W.field_1724.method_19538().method_1022(class_2432) / 10.0) - 1;
        for (n2 = 0; n2 < n3; ++n2) {
            B.W.field_1724.field_3944.method_52787((class_2596)new class_2828.class_5911(true));
        }
        B.W.field_1724.field_3944.method_52787((class_2596)new class_2828.class_2829(class_2432.field_1352, class_2432.field_1351, class_2432.field_1350, true));
        runnable.run();
        for (n2 = 0; n2 < n3; ++n2) {
            B.W.field_1724.field_3944.method_52787((class_2596)new class_2828.class_5911(true));
        }
        B.W.field_1724.field_3944.method_52787((class_2596)new class_2828.class_2829(B.W.field_1724.method_23317(), B.W.field_1724.method_23318(), B.W.field_1724.method_23321(), false));
    }

    public static void l(class_243 class_2432) {
        int n2 = (int)Math.ceil(B.W.field_1724.method_19538().method_1022(class_2432) / 10.0) - 1;
        for (int i2 = 0; i2 < n2; ++i2) {
            B.W.field_1724.field_3944.method_52787((class_2596)new class_2828.class_5911(true));
        }
        B.W.field_1724.field_3944.method_52787((class_2596)new class_2828.class_2829(class_2432.field_1352, class_2432.field_1351, class_2432.field_1350, true));
    }

    private static void lambda$legacyTeleportWithBack$1(n n2) {
        B.W.field_1724.field_3944.method_52787((class_2596)new class_2828.class_2829(n2.w(), n2.M(), n2.j(), false));
    }

    private static void lambda$legacyTeleportWithBack$0(n n2) {
        B.W.field_1724.field_3944.method_52787((class_2596)new class_2828.class_2829(n2.w(), n2.M(), n2.j(), false));
    }
}

