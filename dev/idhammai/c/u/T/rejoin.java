/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.text.Text
 *  net.minecraft.network.packet.s2c.common.DisconnectS2CPacket
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.gui.screen.multiplayer.ConnectScreen
 *  net.minecraft.client.gui.screen.Screen
 *  net.minecraft.client.gui.screen.TitleScreen
 *  net.minecraft.client.network.ServerAddress
 *  net.minecraft.client.network.ServerInfo
 *  net.minecraft.network.listener.ClientCommonPacketListener
 */
package dev.idhammai.c.u.T;

import dev.idhammai.c.u.k;
import java.util.List;
import net.minecraft.text.Text;
import net.minecraft.network.packet.s2c.common.DisconnectS2CPacket;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.multiplayer.ConnectScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.network.ServerAddress;
import net.minecraft.client.network.ServerInfo;
import net.minecraft.network.listener.ClientCommonPacketListener;

public class o
extends k {
    public o() {
        super("rejoin", "");
    }

    @Override
    public void h(String[] stringArray) {
        W.method_18859(o::lambda$runCommand$0);
    }

    @Override
    public String[] l(int n2, List<String> list) {
        return null;
    }

    private static void lambda$runCommand$0() {
        if (o.W.field_1687 != null && W.method_1558() != null) {
            class_642 class_6422 = W.method_1558();
            new class_2661(class_2561.method_30163((String)"Self kick")).method_11467((class_8705)W.method_1562());
            class_412.method_36877((class_437)new class_442(), (class_310)W, (class_639)class_639.method_2950((String)class_6422.field_3761), (class_642)class_6422, (boolean)false, null);
        }
    }
}

