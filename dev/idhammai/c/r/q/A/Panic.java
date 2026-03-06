/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.A;

import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.e;
import dev.idhammai.c.r.O.Y.v;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class a
extends y {
    private final W I;
    private final v B;
    private final List<y> c = new ArrayList<y>();

    public a() {
        super("Panic", "\u7d27\u6025\u505c\u6b62\u6240\u6709\u529f\u80fd", w.Combat);
        this.L("\u7d27\u6025\u505c\u6b62\u6240\u6709\u529f\u80fd");
        this.I = this.S(new W("RestoreOnDisable", true).k("\u6062\u590d\u542f\u7528"));
        this.B = this.E(new v("Whitelist", "").c("\u767d\u540d\u5355"));
    }

    @Override
    public void H() {
        this.c.clear();
        List<y> list = this.o();
        String[] stringArray = this.B.q().split(",");
        ArrayList<String> arrayList = new ArrayList<String>();
        for (String string : stringArray) {
            arrayList.add(string.trim().toLowerCase());
        }
        for (y y2 : list) {
            if (y2 == this || this.I(y2, arrayList) || !y2.p()) continue;
            this.c.add(y2);
            y2.p();
        }
        this.y("\u00a7c\u5df2\u7d27\u6025\u505c\u6b62 " + this.c.size() + " \u4e2a\u529f\u80fd");
    }

    @Override
    public void L() {
        if (this.I.h() && !this.c.isEmpty()) {
            int n2 = 0;
            for (y y2 : this.c) {
                if (!y2.W()) continue;
                y2.C();
                ++n2;
            }
            this.y("\u00a7a\u5df2\u6062\u590d " + n2 + " \u4e2a\u529f\u80fd");
        }
        this.c.clear();
    }

    @Override
    public String I() {
        return this.c.isEmpty() ? "" : "" + this.c.size();
    }

    private List<y> o() {
        ArrayList<y> arrayList = new ArrayList<y>();
        String[] stringArray = new String[]{"AutoKit", "Fonts", "NoTerrainScreen", "AutoCrystal", "Ambience", "AntiHunger", "AntiVoid", "AutoWalk", "VClip", "ExtraTab", "AntiWeak", "BedCrafter", "Friend", "AspectRatio", "ChunkESP", "Aura", "PistonCrystal", "AutoAnchor", "PhaseESP", "AutoArmor", "Breaker", "AutoLog", "AutoEZ", "SelfTrap", "Sorter", "AutoMend", "AutoPot", "AutoPush", "Offhand", "Nuker", "AutoTrap", "AutoWeb", "Blink", "ChorusControl", "BlockStrafe", "FastSwim", "Blocker", "Quiver", "BowBomb", "BreakESP", "Burrow", "Punctuation", "MaceSpoof", "CameraClip", "ChatAppend", "ClickGui", "InfiniteTrident", "ColorsModule", "AutoRegear", "LavaFiller", "AntiPhase", "Clip", "AntiCheat", "Fov", "Criticals", "CevBreaker", "Crosshair", "Chams", "AntiPacket", "AutoReconnect", "ESP", "HoleESP", "Tracers", "MovementSync", "ElytraFly", "PacketLogger", "TeleportLogger", "SkinFlicker", "EntityControl", "NameTags", "ShulkerViewer", "PingSpoof", "FakePlayer", "Spammer", "MotionCamera", "HighLight", "FastFall", "FastWeb", "Flatten", "Fly", "Yaw", "Freecam", "FreeLook", "TimerModule", "Tips", "ClientSetting", "TextRadar", "Info", "NoResourcePack", "RocketExtend", "HoleFiller", "HoleSnap", "LogoutSpots", "AutoTool", "Trajectories", "KillEffect", "AutoPearl", "AntiEffects", "NoFall", "NoRender", "NoSlow", "NoSound", "AirPlace", "Xray", "PacketEat", "PacketFly", "PacketMine", "PacketControl", "Phase", "PlaceRender", "InteractTweaks", "PopChams", "Replenish", "ServerLagger", "Scaffold", "ShaderModule", "AntiCrawl", "AntiRegear", "SafeWalk", "NoJumpDelay", "Speed", "Sprint", "Strafe", "Step", "Surround", "TotemParticle", "Velocity", "ViewModel", "XCarry", "Zoom"};
        for (String string : stringArray) {
            y y2 = this.X(string);
            if (y2 == null) continue;
            arrayList.add(y2);
        }
        return arrayList;
    }

    private y X(String string) {
        try {
            String[] stringArray = new String[]{"dev.luminous.mod.modules.impl.combat.", "dev.luminous.mod.modules.impl.movement.", "dev.luminous.mod.modules.impl.player.", "dev.luminous.mod.modules.impl.render.", "dev.luminous.mod.modules.impl.misc.", "dev.luminous.mod.modules.impl.client.", "dev.luminous.mod.modules.impl.exploit."};
            for (String string2 : stringArray) {
                try {
                    Class<?> clazz;
                    String string3 = string2 + string;
                    Class<?> clazz2 = clazz = Class.forName(e.a(string3));
                    Field field = clazz2.getDeclaredField(e.c(clazz2, "INSTANCE"));
                    field.setAccessible(true);
                    Object object = field.get(null);
                    if (!(object instanceof y)) continue;
                    return (y)object;
                }
                catch (ClassNotFoundException | NoSuchFieldException reflectiveOperationException) {
                    // empty catch block
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return null;
    }

    private boolean I(y y2, List<String> list) {
        if (y2 == null) {
            return false;
        }
        String string = y2.o().toLowerCase();
        for (String string2 : list) {
            if (!string.equals(string2.toLowerCase())) continue;
            return true;
        }
        return false;
    }

    public void x() {
        if (!this.p()) {
            this.C();
        }
    }

    public void n() {
        if (this.p()) {
            this.p();
        }
    }
}

