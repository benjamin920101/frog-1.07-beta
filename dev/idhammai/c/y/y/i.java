/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  it.unimi.dsi.fastutil.chars.Char2IntArrayMap
 *  it.unimi.dsi.fastutil.chars.Char2ObjectArrayMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  it.unimi.dsi.fastutil.objects.ObjectList
 *  net.minecraft.client.render.BufferBuilder
 *  net.minecraft.client.render.Tessellator
 *  net.minecraft.client.render.VertexFormats
 *  net.minecraft.client.render.VertexFormat$DrawMode
 *  net.minecraft.util.Identifier
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.client.render.GameRenderer
 *  org.jetbrains.annotations.Contract
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.lwjgl.opengl.GL11
 */
package dev.idhammai.c.y.y;

import com.mojang.blaze3d.systems.RenderSystem;
import dev.idhammai.Frog;
import dev.idhammai.P.A.J;
import dev.idhammai.P.A.S.K;
import dev.idhammai.c.r.q.N.P;
import dev.idhammai.c.r.q.N.S;
import dev.idhammai.c.r.q.N.T;
import dev.idhammai.c.r.q.N.e;
import dev.idhammai.c.y.u.I.t;
import dev.idhammai.c.y.y.U;
import dev.idhammai.c.y.y.W;
import dev.idhammai.c.y.y.f;
import dev.idhammai.c.y.y.y;
import it.unimi.dsi.fastutil.chars.Char2IntArrayMap;
import it.unimi.dsi.fastutil.chars.Char2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import java.awt.Color;
import java.awt.Font;
import java.io.Closeable;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat;
import net.minecraft.util.Identifier;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.render.GameRenderer;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.lwjgl.opengl.GL11;

public class i
implements Closeable {
    private static final Char2IntArrayMap x = new U();
    private static final ExecutorService K = Executors.newCachedThreadPool();
    private final Object2ObjectMap<class_2960, ObjectList<y>> g = new Object2ObjectOpenHashMap();
    private final float U;
    private final ObjectList<W> R = new ObjectArrayList();
    private final Char2ObjectArrayMap<f> Z = new Char2ObjectArrayMap();
    private final int u;
    private final int m;
    private final String q;
    private int f = 0;
    private Font B;
    private Font n;
    private int X = -1;
    private Future<Void> y;
    private boolean d;

    public i(Font font, float f2, int n2, int n3, @Nullable String string) {
        this.U = f2;
        this.u = n2;
        this.m = n3;
        this.q = string;
        this.O(font, f2);
    }

    public i(Font font, Font font2, float f2, int n2, int n3, @Nullable String string) {
        this(font, f2, n2, n3, string);
        this.n = font2.deriveFont(f2 * (float)this.f);
    }

    public i(Font font, float f2) {
        this(font, f2, 256, 5, null);
    }

    public i(Font font, Font font2, float f2) {
        this(font, font2, f2, 256, 5, null);
    }

    private static int O(int n2, int n3) {
        return n3 * (int)Math.floor((double)n2 / (double)n3);
    }

    public static String s(String string) {
        char[] cArray = string.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = 0; i2 < cArray.length; ++i2) {
            char c2 = cArray[i2];
            if (c2 == '\u00a7') {
                ++i2;
                continue;
            }
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }

    @Contract(value="-> new", pure=true)
    @NotNull
    public static class_2960 i() {
        return class_2960.method_60655((String)"frogclient", (String)("temp/" + i.J()));
    }

    private static String J() {
        return IntStream.range(0, 32).mapToObj(i::lambda$randomString$0).collect(Collectors.joining());
    }

    @Contract(value="_ -> new", pure=true)
    public static int @NotNull [] I(int n2) {
        int n3 = n2 >> 16 & 0xFF;
        int n4 = n2 >> 8 & 0xFF;
        int n5 = n2 & 0xFF;
        return new int[]{n3, n4, n5};
    }

    public static double c(double d2, int n2) {
        if (n2 == 0) {
            return Math.floor(d2);
        }
        double d3 = Math.pow(10.0, n2);
        return (double)Math.round(d2 * d3) / d3;
    }

    private void l() {
        int n2 = (int)J.W.method_22683().method_4495();
        if (n2 != this.X) {
            this.close();
            this.O(this.B, this.U);
            if (this.n != null) {
                this.n = this.n.deriveFont(this.U * (float)this.f);
            }
        }
    }

    private void O(Font font, float f2) {
        if (this.d) {
            throw new IllegalStateException("Double call to init()");
        }
        this.d = true;
        this.f = this.X = (int)J.W.method_22683().method_4495();
        this.B = font.deriveFont(f2 * (float)this.f);
        if (this.q != null && !this.q.isEmpty()) {
            this.y = this.L();
        }
    }

    private Future<Void> L() {
        return K.submit(this::lambda$prebake$1);
    }

    private W w(char c2, char c3) {
        W w2 = this.n != null ? new W(c2, c3, this.B, this.n, i.i(), this.m) : new W(c2, c3, this.B, i.i(), this.m);
        this.R.add((Object)w2);
        return w2;
    }

    private f W(char c2) {
        W w22;
        for (W w22 : this.R) {
            if (!w22.H(c2)) continue;
            return w22.z(c2);
        }
        int n2 = i.O(c2, this.u);
        w22 = this.w((char)n2, (char)(n2 + this.u));
        return w22.z(c2);
    }

    @Nullable
    private f c(char c2) {
        return (f)this.Z.computeIfAbsent(c2, this::W);
    }

    public void X(class_4587 class_45872, String string, double d2, double d3, int n2) {
        float f2 = (float)(n2 >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n2 >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(n2 & 0xFF) / 255.0f;
        float f5 = (float)(n2 >> 24 & 0xFF) / 255.0f;
        this.W(class_45872, string, (float)d2, (float)d3, f2, f3, f4, f5);
    }

    public void I(class_4587 class_45872, String string, double d2, double d3, Color color) {
        this.W(class_45872, string, (float)d2, (float)d3, (float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, color.getAlpha());
    }

    public void W(class_4587 class_45872, String string, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.Z(class_45872, string, f2, f3, f4, f5, f6, f7, false);
    }

    public void H(class_4587 class_45872, String string, double d2, double d3, int n2, boolean bl) {
        this.z(class_45872, string, d2, d3, n2, bl, false);
    }

    public void z(class_4587 class_45872, String string, double d2, double d3, int n2, boolean bl, boolean bl2) {
        float f2 = (float)(n2 >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n2 >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(n2 & 0xFF) / 255.0f;
        float f5 = (float)(n2 >> 24 & 0xFF) / 255.0f;
        this.f(class_45872, string, (float)d2, (float)d3, f2, f3, f4, f5, bl, bl2);
    }

    public void i(class_4587 class_45872, String string, double d2, double d3, Color color, boolean bl) {
        this.s(class_45872, string, d2, d3, color, bl, false);
    }

    public void s(class_4587 class_45872, String string, double d2, double d3, Color color, boolean bl, boolean bl2) {
        this.f(class_45872, string, (float)d2, (float)d3, (float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, color.getAlpha(), bl, bl2);
    }

    public void k(class_4587 class_45872, String string, double d2, double d3, int n2) {
        this.J(class_45872, string, d2, d3, n2, false);
    }

    public void J(class_4587 class_45872, String string, double d2, double d3, int n2, boolean bl) {
        float f2 = (float)(n2 >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n2 >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(n2 & 0xFF) / 255.0f;
        float f5 = (float)(n2 >> 24 & 0xFF) / 255.0f;
        this.A(class_45872, string, (float)d2, (float)d3, f2, f3, f4, f5, bl);
    }

    public void f(class_4587 class_45872, String string, double d2, double d3, Color color) {
        this.b(class_45872, string, d2, d3, color, false);
    }

    public void b(class_4587 class_45872, String string, double d2, double d3, Color color, boolean bl) {
        this.A(class_45872, string, (float)d2, (float)d3, (float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, color.getAlpha(), bl);
    }

    public void h(class_4587 class_45872, String string, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.A(class_45872, string, f2, f3, f4, f5, f6, f7, false);
    }

    public void A(class_4587 class_45872, String string, float f2, float f3, float f4, float f5, float f6, float f7, boolean bl) {
        this.f(class_45872, string, f2, f3, f4, f5, f6, f7, true, bl);
    }

    public void Z(class_4587 class_45872, String string, float f2, float f3, float f4, float f5, float f6, float f7, boolean bl) {
        this.f(class_45872, string, f2, f3, f4, f5, f6, f7, bl, false);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void f(class_4587 class_45872, String string, float f2, float f3, float f4, float f5, float f6, float f7, boolean bl, boolean bl2) {
        Object2ObjectMap<class_2960, ObjectList<y>> object2ObjectMap;
        Color color;
        P p2 = P.M();
        if (!bl2 && p2 != null && p2.pM.X() == S.Shader && Frog.SHADER != null && Frog.SHADER.s()) {
            Matrix4f matrix4f = new Matrix4f((Matrix4fc)class_45872.method_23760().method_23761());
            Frog.SHADER.Q(() -> this.lambda$drawString$2(class_45872, matrix4f, string, f2, f3, f4, f5, f6, f7, bl));
            return;
        }
        if (this.y != null && !this.y.isDone()) {
            try {
                this.y.get();
            }
            catch (InterruptedException | ExecutionException exception) {
                // empty catch block
            }
        }
        this.l();
        float f8 = f4;
        float f9 = f5;
        float f10 = f6;
        float f11 = f4;
        float f12 = f5;
        float f13 = f6;
        boolean bl3 = this.F();
        if (bl3) {
            color = P.M().q((double)f3 / 10.0);
            f8 = (float)color.getRed() / 255.0f;
            f9 = (float)color.getGreen() / 255.0f;
            f10 = (float)color.getBlue() / 255.0f;
            f11 = f8;
            f12 = f9;
            f13 = f10;
        }
        class_45872.method_22903();
        class_45872.method_22904(i.c(f2, 1), i.c(f3, 1), 0.0);
        class_45872.method_22905(1.0f / (float)this.f, 1.0f / (float)this.f, 1.0f);
        RenderSystem.enableBlend();
        RenderSystem.disableCull();
        RenderSystem.setShader(class_757::method_34543);
        color = class_45872.method_23760().method_23761();
        char[] cArray = string.toCharArray();
        float f14 = 0.0f;
        float f15 = 0.0f;
        boolean bl4 = false;
        int n2 = 0;
        Object2ObjectMap<class_2960, ObjectList<y>> object2ObjectMap2 = object2ObjectMap = this.g;
        synchronized (object2ObjectMap2) {
            Object object;
            for (int i2 = 0; i2 < cArray.length; ++i2) {
                char c2 = cArray[i2];
                if (bl4) {
                    bl4 = false;
                    char c3 = Character.toUpperCase(c2);
                    if (x.containsKey(c3)) {
                        int n3 = x.get(c3);
                        object = i.I(n3);
                        f11 = (float)object[0] / 255.0f;
                        f12 = (float)object[1] / 255.0f;
                        f13 = (float)object[2] / 255.0f;
                        continue;
                    }
                    if (c3 != 'R') continue;
                    f11 = f8;
                    f12 = f9;
                    f13 = f10;
                    continue;
                }
                if (c2 == '\u00a7') {
                    bl4 = true;
                    continue;
                }
                if (c2 == '\n') {
                    f15 += this.d(string.substring(n2, i2)) * (float)this.f;
                    f14 = 0.0f;
                    n2 = i2 + 1;
                    if (!bl3) continue;
                    Color color2 = P.M().q((double)(f3 + f15) / 10.0);
                    f8 = (float)color2.getRed() / 255.0f;
                    f9 = (float)color2.getGreen() / 255.0f;
                    f10 = (float)color2.getBlue() / 255.0f;
                    f11 = f8;
                    f12 = f9;
                    f13 = f10;
                    continue;
                }
                f f16 = this.c(c2);
                if (f16 == null) continue;
                if (f16.S() != ' ') {
                    class_2960 class_29602 = f16.q().E;
                    if (bl) {
                        object = new y(f14 + 1.0f, f15 + 1.0f, 0.0f, 0.0f, 0.0f, f16);
                        ((ObjectList)this.g.computeIfAbsent((Object)class_29602, i::lambda$drawString$3)).add(object);
                    }
                    object = new y(f14, f15, f11, f12, f13, f16);
                    ((ObjectList)this.g.computeIfAbsent((Object)class_29602, i::lambda$drawString$4)).add(object);
                }
                f14 += (float)f16.KL();
            }
            for (class_2960 class_29603 : this.g.keySet()) {
                RenderSystem.setShaderTexture((int)0, (class_2960)class_29603);
                GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
                GL11.glTexParameteri((int)3553, (int)10241, (int)9729);
                List list = (List)this.g.get((Object)class_29603);
                class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
                object = list.iterator();
                while (object.hasNext()) {
                    y y2 = (y)object.next();
                    float f17 = y2.z;
                    float f18 = y2.u;
                    float f19 = y2.h;
                    float f20 = y2.t;
                    float f21 = y2.c;
                    f f22 = y2.p;
                    W w2 = f22.q();
                    float f23 = f22.KL();
                    float f24 = f22.O();
                    float f25 = (float)f22.D() / (float)w2.l;
                    float f26 = (float)f22.R() / (float)w2.b;
                    float f27 = (float)(f22.D() + f22.KL()) / (float)w2.l;
                    float f28 = (float)(f22.R() + f22.O()) / (float)w2.b;
                    class_2872.method_22918((Matrix4f)color, f17 + 0.0f, f18 + f24, 0.0f).method_22913(f25, f28).method_22915(f19, f20, f21, f7);
                    class_2872.method_22918((Matrix4f)color, f17 + f23, f18 + f24, 0.0f).method_22913(f27, f28).method_22915(f19, f20, f21, f7);
                    class_2872.method_22918((Matrix4f)color, f17 + f23, f18 + 0.0f, 0.0f).method_22913(f27, f26).method_22915(f19, f20, f21, f7);
                    class_2872.method_22918((Matrix4f)color, f17 + 0.0f, f18 + 0.0f, 0.0f).method_22913(f25, f26).method_22915(f19, f20, f21, f7);
                }
                dev.idhammai.P.A.S.K.d(class_2872);
            }
            this.g.clear();
        }
        class_45872.method_22909();
    }

    public void y(class_4587 class_45872, String string, double d2, double d3, int n2) {
        this.l(class_45872, string, d2, d3, n2, false);
    }

    public void l(class_4587 class_45872, String string, double d2, double d3, int n2, boolean bl) {
        float f2 = (float)(n2 >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n2 >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(n2 & 0xFF) / 255.0f;
        float f5 = (float)(n2 >> 24 & 0xFF) / 255.0f;
        this.A(class_45872, string, (float)(d2 - (double)(this.b(string) / 2.0f)), (float)d3, f2, f3, f4, f5, bl);
    }

    public void s(class_4587 class_45872, String string, double d2, double d3, Color color) {
        this.G(class_45872, string, d2, d3, color, false);
    }

    public void G(class_4587 class_45872, String string, double d2, double d3, Color color, boolean bl) {
        this.A(class_45872, string, (float)(d2 - (double)(this.b(string) / 2.0f)), (float)d3, (float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, (float)color.getAlpha() / 255.0f, bl);
    }

    public void n(class_4587 class_45872, String string, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.u(class_45872, string, f2, f3, f4, f5, f6, f7, false);
    }

    public void u(class_4587 class_45872, String string, float f2, float f3, float f4, float f5, float f6, float f7, boolean bl) {
        this.A(class_45872, string, f2 - this.b(string) / 2.0f, f3, f4, f5, f6, f7, bl);
    }

    public float b(String string) {
        char[] cArray = i.s(string).toCharArray();
        float f2 = 0.0f;
        float f3 = 0.0f;
        for (char c2 : cArray) {
            if (c2 == '\n') {
                f3 = Math.max(f2, f3);
                f2 = 0.0f;
                continue;
            }
            f f4 = this.c(c2);
            f2 += f4 == null ? 0.0f : (float)f4.KL() / (float)this.f;
        }
        return Math.max(f2, f3);
    }

    public float d(String string) {
        char[] cArray = i.s(string).toCharArray();
        if (cArray.length == 0) {
            cArray = new char[]{' '};
        }
        float f2 = 0.0f;
        float f3 = 0.0f;
        for (char c2 : cArray) {
            if (c2 == '\n') {
                if (f2 == 0.0f) {
                    f2 = this.c(' ') == null ? 0.0f : (float)Objects.requireNonNull(this.c(' ')).O() / (float)this.f;
                }
                f3 += f2;
                f2 = 0.0f;
                continue;
            }
            f f4 = this.c(c2);
            f2 = Math.max(f4 == null ? 0.0f : (float)f4.O() / (float)this.f, f2);
        }
        return f2 + f3;
    }

    @Override
    public void close() {
        try {
            if (this.y != null && !this.y.isDone() && !this.y.isCancelled()) {
                this.y.cancel(true);
                this.y.get();
                this.y = null;
            }
            for (W w2 : this.R) {
                w2.m();
            }
            this.R.clear();
            this.Z.clear();
            this.d = false;
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public float y(String string) {
        return this.d(string);
    }

    public float V() {
        return this.d("A");
    }

    public void m(class_4587 class_45872, String string, float f2, float f3) {
        this.W(class_45872, string, f2, f3, 255.0f, 255.0f, 255.0f, 255.0f);
    }

    public void s(class_4587 class_45872, String string, float f2, float f3) {
        this.m(class_45872, string, f2 - this.b(string) / 2.0f, f3);
    }

    private boolean F() {
        if (J.W == null || J.W.field_1755 == null) {
            return false;
        }
        if (!(J.W.field_1755 instanceof t)) {
            return false;
        }
        P p2 = P.M();
        if (p2 == null) {
            return false;
        }
        return p2.pN.X() != T.RainbowDelay && p2.g.X() == e.Custom && p2.b.h() && p2.pM.X() == S.Rainbow;
    }

    private static ObjectList lambda$drawString$4(Object object) {
        return new ObjectArrayList();
    }

    private static ObjectList lambda$drawString$3(Object object) {
        return new ObjectArrayList();
    }

    private void lambda$drawString$2(class_4587 class_45872, Matrix4f matrix4f, String string, float f2, float f3, float f4, float f5, float f6, float f7, boolean bl) {
        class_45872.method_22903();
        class_45872.method_23760().method_23761().set((Matrix4fc)matrix4f);
        this.f(class_45872, string, f2, f3, f4, f5, f6, f7, bl, false);
        class_45872.method_22909();
    }

    private Void lambda$prebake$1() throws Exception {
        for (char c2 : this.q.toCharArray()) {
            if (Thread.interrupted()) break;
            this.c(c2);
        }
        return null;
    }

    private static String lambda$randomString$0(int n2) {
        return String.valueOf((char)new Random().nextInt(97, 123));
    }
}

