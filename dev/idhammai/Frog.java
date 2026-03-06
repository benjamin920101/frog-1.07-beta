/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.ModInitializer
 *  net.minecraft.class_310
 */
package dev.idhammai;

import dev.idhammai.P.r.K.g;
import dev.idhammai.P.r.c.O;
import dev.idhammai.c.r.q.N.I;
import dev.idhammai.p.J.B;
import dev.idhammai.p.J.C;
import dev.idhammai.p.J.D;
import dev.idhammai.p.J.F;
import dev.idhammai.p.J.G;
import dev.idhammai.p.J.L;
import dev.idhammai.p.J.M;
import dev.idhammai.p.J.P;
import dev.idhammai.p.J.R;
import dev.idhammai.p.J.S;
import dev.idhammai.p.J.V;
import dev.idhammai.p.J.W;
import dev.idhammai.p.J.b;
import dev.idhammai.p.J.c;
import dev.idhammai.p.J.d;
import dev.idhammai.p.J.m;
import dev.idhammai.p.J.t;
import dev.idhammai.p.J.x;
import dev.idhammai.p.J.y;
import dev.idhammai.p.J.z;
import java.io.File;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import net.fabricmc.api.ModInitializer;
import net.minecraft.class_310;

public class Frog
implements ModInitializer {
    public static final String NAME = "Frog";
    public static final String VERSION = "1.07";
    public static final String CONFIG_DIR = "frog";
    public static final g EVENT_BUS = new g();
    public static C HOLE;
    public static F PLAYER;
    public static B TRADE;
    public static x CLEANER;
    public static P HUD_ITEM;
    public static V XRAY;
    public static D BLOCK_ESP;
    public static M MODULE;
    public static S COMMAND;
    public static z CONFIG;
    public static G ROTATION;
    public static t BREAK;
    public static R POP;
    public static y FRIEND;
    public static b TIMER;
    public static W SHADER;
    public static m MOTION_BLUR;
    public static d BLUR;
    public static c FPS;
    public static dev.idhammai.p.J.O SERVER;
    public static L THREAD;
    public static boolean loaded;
    public static long initTime;
    public static String userId;

    public static String getPrefix() {
        return I.Q.I.q();
    }

    public static void save() {
        CONFIG.x();
        CLEANER.Q();
        FRIEND.L();
        XRAY.e();
        BLOCK_ESP.g();
        TRADE.g();
        HUD_ITEM.m();
        System.out.println("[Frog Client] Saved");
    }

    private void register() {
        EVENT_BUS.l(Frog::lambda$register$0);
        Runtime.getRuntime().addShutdownHook(new Thread(Frog::lambda$register$1));
    }

    public void onInitialize() {
        this.register();
        MODULE = new M();
        CONFIG = new z();
        HOLE = new C();
        COMMAND = new S();
        FRIEND = new y();
        XRAY = new V();
        BLOCK_ESP = new D();
        CLEANER = new x();
        TRADE = new B();
        HUD_ITEM = new P();
        ROTATION = new G();
        BREAK = new t();
        PLAYER = new F();
        POP = new R();
        TIMER = new b();
        SHADER = new W();
        MOTION_BLUR = new m();
        BLUR = new d();
        FPS = new c();
        SERVER = new dev.idhammai.p.J.O();
        CONFIG.Q();
        THREAD = new L();
        initTime = System.currentTimeMillis();
        loaded = true;
        EVENT_BUS.J(new O());
        File file = new File(class_310.method_1551().field_1697.getPath() + File.separator + CONFIG_DIR + File.separator + "cfg");
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    private static void lambda$register$1() {
        if (loaded) {
            Frog.save();
        }
    }

    private static MethodHandles.Lookup lambda$register$0(Method method, Class clazz) throws InvocationTargetException, IllegalAccessException {
        return (MethodHandles.Lookup)method.invoke(null, clazz, MethodHandles.lookup());
    }

    static {
        loaded = false;
    }
}

