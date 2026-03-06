/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.hit.HitResult
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.client.font.TextRenderer
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.sound.SoundEvents
 *  net.minecraft.sound.SoundCategory
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.network.packet.s2c.play.ChatMessageS2CPacket
 *  net.minecraft.network.packet.s2c.play.GameMessageS2CPacket
 */
package dev.idhammai.c.r.q.x;

import dev.idhammai.P.A.A.h;
import dev.idhammai.P.A.S.K;
import dev.idhammai.P.A.S.n;
import dev.idhammai.P.A.l.k;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.P.r.c.i;
import dev.idhammai.c.r.O.Y.A;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.O.Y.v;
import dev.idhammai.c.r.q.x.b;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import dev.idhammai.p.J.S;
import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.Packet;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.sound.SoundEvents;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.network.packet.s2c.play.ChatMessageS2CPacket;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;

public class O
extends y {
    private final W d = this.S(new W("Sound", true).k("\u63d0\u793a\u97f3"));
    private final l A = this.p(new l("ClearTime", 10.0, 0.0, 100.0, 0.1).D("\u6e05\u9664\u65f6\u95f4").P("s"));
    private final A r = this.y(new A("Color", new Color(255, 255, 255, 100)).P("\u6807\u8bb0\u989c\u8272"));
    private final dev.idhammai.c.r.O.Y.O a = this.n(new dev.idhammai.c.r.O.Y.O("EnemySpot", -1).E("\u654c\u4eba\u6807\u70b9\u952e"));
    private final v b = this.E(new v("EncryptKey", "IDKWTFTHIS").c("\u52a0\u5bc6\u5bc6\u94a5"));
    private final ConcurrentHashMap<String, b> H = new ConcurrentHashMap();
    private boolean F = false;

    public O() {
        super("Punctuation", w.Misc);
        this.L("\u6807\u70b9");
    }

    public static SecretKeySpec k(String string) {
        try {
            byte[] byArray = string.getBytes(StandardCharsets.UTF_8);
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byArray = messageDigest.digest(byArray);
            byArray = Arrays.copyOf(byArray, 16);
            return new SecretKeySpec(byArray, "AES");
        }
        catch (Exception exception) {
            return null;
        }
    }

    @Override
    public void L() {
        this.H.clear();
    }

    @r
    public void X(QO qO) {
        this.H.values().removeIf(this::lambda$onUpdate$0);
        if (this.a.G() && O.W.field_1755 == null) {
            class_239 class_2392;
            if (!this.F && (class_2392 = W.method_1560().method_5745(256.0, 0.0f, false)) instanceof class_3965) {
                class_3965 class_39652 = (class_3965)class_2392;
                class_2338 class_23382 = class_39652.method_17777();
                this.H.put("Local", new b("Local", new k(class_23382.method_10263(), class_23382.method_10264(), class_23382.method_10260()), this.r.P(), new h()));
                dev.idhammai.p.J.S.z("Marked locally at \u00a7r(" + class_23382.method_10263() + ", " + class_23382.method_10264() + ", " + class_23382.method_10260() + ")");
            }
            this.F = true;
        } else {
            this.F = false;
        }
    }

    @Override
    public void C(class_332 class_3322, float f2) {
        for (b b2 : this.H.values()) {
            class_243 class_2432 = n.i(b2.w1.method_46558().method_1031(0.0, 1.0, 0.0));
            String string = "\u00a7a" + b2.g3 + " \u00a7f(" + b2.w1.method_10263() + ", " + b2.w1.method_10264() + ", " + b2.w1.method_10260() + ")";
            if (!(class_2432.field_1350 > 0.0) || !(class_2432.field_1350 < 1.0)) continue;
            double d2 = class_2432.field_1352;
            double d3 = class_2432.field_1351;
            double d4 = Math.max(class_2432.field_1352, class_2432.field_1350);
            float f3 = (float)(d4 - d2) / 2.0f;
            float f4 = O.W.field_1772.method_1727(string);
            float f5 = (float)((d2 + (double)f3 - (double)(f4 / 4.0f)) * 1.0);
            class_3322.method_51448().method_22903();
            class_3322.method_51448().method_22905(0.5f, 0.5f, 1.0f);
            class_327 class_3272 = O.W.field_1772;
            int n2 = (int)f5 * 2;
            Objects.requireNonNull(O.W.field_1772);
            class_3322.method_51433(class_3272, string, n2, (int)(d3 - 11.0 + 10.799999999999999) * 2, -1, true);
            class_3322.method_51448().method_22909();
        }
    }

    @Override
    public void h(class_4587 class_45872) {
        for (b b2 : this.H.values()) {
            K.F(class_45872, new class_238((double)b2.w1.method_10263() + 0.25, -60.0, (double)b2.w1.method_10260() + 0.25, (double)b2.w1.method_10263() + 0.75, 320.0, (double)b2.w1.method_10260() + 0.75), b2.aT);
        }
    }

    @r
    private void m(i i2) {
        class_7439 class_74392;
        if (O.M()) {
            return;
        }
        class_2596<?> class_25962 = i2.L();
        if (class_25962 instanceof class_7439 && (class_74392 = (class_7439)class_25962).comp_763() != null) {
            W.execute(() -> this.lambda$PacketReceive$1(class_74392));
        }
        if ((class_25962 = i2.L()) instanceof class_7438) {
            class_7438 class_74382 = (class_7438)class_25962;
            if (class_74382.comp_1103() != null) {
                W.execute(() -> this.lambda$PacketReceive$2(class_74382));
            } else {
                W.execute(() -> this.lambda$PacketReceive$3(class_74382));
            }
        }
    }

    private void O(String string) {
        try {
            Pattern pattern;
            Matcher matcher;
            if (string == null) {
                return;
            }
            String string2 = this.a(string.replaceAll("\u00a7[0-9a-fk-or]", "").replaceAll("<[^>]*> ", ""));
            if (string2 == null) {
                return;
            }
            if (string2.contains("EnemyHere") && (matcher = (pattern = Pattern.compile("\\{(.*?)}")).matcher(string2)).find()) {
                String string3 = matcher.group(1);
                String[] stringArray = string3.split(",");
                if (stringArray.length == 3) {
                    if (this.d.h()) {
                        O.W.field_1687.method_8396((class_1657)O.W.field_1724, O.W.field_1724.method_24515(), class_3417.field_14627, class_3419.field_15248, 100.0f, 1.9f);
                    }
                    String string4 = stringArray[0];
                    String string5 = stringArray[1];
                    String string6 = stringArray[2];
                    pattern = Pattern.compile("<(.*?)>");
                    matcher = pattern.matcher(string);
                    if (!this.o(string4)) {
                        return;
                    }
                    double d2 = Double.parseDouble(string4);
                    if (!this.o(string5)) {
                        return;
                    }
                    double d3 = Double.parseDouble(string5);
                    if (!this.o(string6)) {
                        return;
                    }
                    double d4 = Double.parseDouble(string6);
                    if (matcher.find()) {
                        String string7 = matcher.group(1);
                        this.H.put(string7, new b(string7, new k(d2, d3, d4), this.r.P(), new h()));
                        dev.idhammai.p.J.S.z(string7 + " marked at \u00a7r(" + string4 + ", " + string5 + ", " + string6 + ")");
                    } else {
                        this.H.put("" + dev.idhammai.P.A.A.A.t(0.0f, 1.0E9f), new b("Unknown", new k(d2, d3, d4), this.r.P(), new h()));
                        dev.idhammai.p.J.S.z("Unknown marked at \u00a7r(" + string4 + ", " + string5 + ", " + string6 + ")");
                    }
                } else if (stringArray.length == 4) {
                    if (this.d.h()) {
                        O.W.field_1687.method_8396((class_1657)O.W.field_1724, O.W.field_1724.method_24515(), class_3417.field_14627, class_3419.field_15248, 100.0f, 1.9f);
                    }
                    String string8 = stringArray[0];
                    String string9 = stringArray[1];
                    String string10 = stringArray[2];
                    String string11 = stringArray[3];
                    pattern = Pattern.compile("<(.*?)>");
                    matcher = pattern.matcher(string);
                    if (!this.o(string8)) {
                        return;
                    }
                    double d5 = Double.parseDouble(string8);
                    if (!this.o(string9)) {
                        return;
                    }
                    double d6 = Double.parseDouble(string9);
                    if (!this.o(string10)) {
                        return;
                    }
                    double d7 = Double.parseDouble(string10);
                    if (!this.o(string11)) {
                        return;
                    }
                    double d8 = Double.parseDouble(string11);
                    if (matcher.find()) {
                        String string12 = matcher.group(1);
                        this.H.put(string12, new b(string12, new k(d5, d6, d7), new Color((int)d8, true), new h()));
                        dev.idhammai.p.J.S.z(string12 + " marked at \u00a7r(" + string8 + ", " + string9 + ", " + string10 + ")");
                    } else {
                        this.H.put("" + dev.idhammai.P.A.A.A.t(0.0f, 1.0E9f), new b("Unknown", new k(d5, d6, d7), new Color((int)d8, true), new h()));
                        dev.idhammai.p.J.S.z("Unknown marked at \u00a7r(" + string8 + ", " + string9 + ", " + string10 + ")");
                    }
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private boolean o(String string) {
        return string.matches("-?\\d+(\\.\\d+)?");
    }

    public String a(String string) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            SecretKeySpec secretKeySpec = O.k(this.b.q());
            byte[] byArray = new byte[16];
            IvParameterSpec ivParameterSpec = new IvParameterSpec(byArray);
            cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
            byte[] byArray2 = cipher.doFinal(Base64.getDecoder().decode(string));
            return new String(byArray2, StandardCharsets.UTF_8);
        }
        catch (Exception exception) {
            return null;
        }
    }

    public String w(String string) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            SecretKeySpec secretKeySpec = O.k(this.b.q());
            byte[] byArray = new byte[16];
            IvParameterSpec ivParameterSpec = new IvParameterSpec(byArray);
            cipher.init(1, (Key)secretKeySpec, ivParameterSpec);
            return Base64.getEncoder().encodeToString(cipher.doFinal(string.getBytes(StandardCharsets.UTF_8)));
        }
        catch (Exception exception) {
            return null;
        }
    }

    private void lambda$PacketReceive$3(class_7438 class_74382) {
        this.O(class_74382.comp_1102().comp_1090());
    }

    private void lambda$PacketReceive$2(class_7438 class_74382) {
        this.O(class_74382.comp_1103().getString());
    }

    private void lambda$PacketReceive$1(class_7439 class_74392) {
        this.O(class_74392.comp_763().getString());
    }

    private boolean lambda$onUpdate$0(b b2) {
        return b2.dG.r(this.A.e());
    }
}

