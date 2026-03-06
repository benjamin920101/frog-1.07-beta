/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.longs.LongArrayList
 *  it.unimi.dsi.fastutil.longs.LongListIterator
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  net.minecraft.util.math.ChunkPos
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.BlockPos$Mutable
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.network.packet.s2c.play.BlockUpdateS2CPacket
 *  net.minecraft.network.packet.s2c.play.ChunkDeltaUpdateS2CPacket
 *  net.minecraft.network.packet.s2c.play.ChunkDataS2CPacket
 *  net.minecraft.block.BlockState
 *  net.minecraft.world.chunk.WorldChunk
 *  net.minecraft.client.render.BufferRenderer
 *  net.minecraft.client.render.BufferBuilder
 *  net.minecraft.client.render.Tessellator
 *  net.minecraft.client.render.VertexFormats
 *  net.minecraft.world.Heightmap
 *  net.minecraft.world.Heightmap$Type
 *  net.minecraft.client.render.VertexFormat$DrawMode
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.client.gui.screen.Screen
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.client.util.math.MatrixStack$Entry
 *  net.minecraft.client.render.GameRenderer
 *  net.minecraft.client.render.BuiltBuffer
 *  org.joml.Matrix4f
 */
package dev.idhammai.c.r.q.n;

import com.mojang.blaze3d.systems.RenderSystem;
import dev.idhammai.Frog;
import dev.idhammai.P.A.A.h;
import dev.idhammai.P.A.l.M;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.i;
import dev.idhammai.c.r.O.Y.A;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import dev.idhammai.c.y.u.I.t;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongListIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.s2c.play.BlockUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.ChunkDeltaUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.ChunkDataS2CPacket;
import net.minecraft.block.BlockState;
import net.minecraft.world.chunk.WorldChunk;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.world.Heightmap;
import net.minecraft.client.render.VertexFormat;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.render.BuiltBuffer;
import org.joml.Matrix4f;

public class v
extends y {
    public static v F;
    public final W L = this.S(new W("Edit", false).k("\u7f16\u8f91").M(this::T));
    private final A A = this.y(new A("Fill", new Color(0, 255, 120, 50)).P("\u586b\u5145").t(true));
    private final A h = this.y(new A("Box", new Color(0, 255, 120, 180)).P("\u65b9\u6846").t(true));
    private final A Q = this.y(new A("Tracer", new Color(0, 255, 120, 200)).P("\u8ffd\u8e2a\u7ebf").t(false));
    private final h X = new h();
    private final h J = new h();
    private final Object c = new Object();
    private final Long2ObjectOpenHashMap<LongArrayList> b = new Long2ObjectOpenHashMap();
    private final LongOpenHashSet t = new LongOpenHashSet();
    private final LongOpenHashSet u = new LongOpenHashSet();
    private final LongArrayList Y = new LongArrayList();
    private final LongOpenHashSet T = new LongOpenHashSet();
    private final Long2LongOpenHashMap p = new Long2LongOpenHashMap();
    private int l = 0;
    private volatile List<class_1923> y = Collections.emptyList();
    private int P = 0;
    private int Z = -1;
    private int g = -1;
    private int V = 0;

    public v() {
        super("BlockESP", w.Render);
        this.L("\u65b9\u5757\u900f\u89c6");
        F = this;
    }

    private void T() {
        this.L.J(false);
        if (!v.M()) {
            class_437 class_4372 = v.W.field_1755;
            if (class_4372 instanceof t) {
                t t2 = (t)class_4372;
                t2.I(Frog.BLOCK_ESP);
                return;
            }
            t t3 = new t();
            t3.I(Frog.BLOCK_ESP);
            W.method_1507((class_437)t3);
        }
    }

    @Override
    public void H() {
        if (v.M() || Frog.BLOCK_ESP == null || Frog.BLOCK_ESP.p().isEmpty()) {
            return;
        }
        int n2 = Math.max(2, v.W.field_1690.method_38521());
        class_1923 class_19232 = v.W.field_1724.method_31476();
        M.C().forEach(arg_0 -> this.lambda$onEnable$0(class_19232, n2, arg_0));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void L() {
        Object object = this.c;
        synchronized (object) {
            this.b.clear();
            this.t.clear();
            this.u.clear();
            this.Y.clear();
            this.T.clear();
            this.p.clear();
            this.l = 0;
        }
        this.P = 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void N() {
        if (v.M() || this.W() || Frog.BLOCK_ESP == null) {
            return;
        }
        int n2 = Frog.BLOCK_ESP.s();
        if (Frog.BLOCK_ESP.p().isEmpty()) {
            Object object = this.c;
            synchronized (object) {
                this.b.clear();
                this.t.clear();
                this.u.clear();
            }
            this.g = n2;
            this.P = 0;
            return;
        }
        int n3 = Math.max(2, v.W.field_1690.method_38521());
        class_1923 class_19232 = v.W.field_1724.method_31476();
        if (n2 != this.g) {
            this.Q(n3, n2, true);
        } else if (n3 != this.Z || this.y.isEmpty()) {
            this.Q(n3, n2, false);
        }
        if (this.J.S(10.0)) {
            this.J.H();
            this.T(class_19232, n3, 2);
        }
        if (!this.X.S(100.0)) {
            return;
        }
        this.X.H();
        int n4 = this.T(class_19232, n3, 4);
        if (n4 > 0) {
            this.N(class_19232, n3, n4);
        }
        this.p(class_19232, n3 + 2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void h(class_4587 class_45872) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        class_2338 class_23382;
        LongListIterator longListIterator;
        Object object;
        class_287 class_2872;
        float f8;
        float f9;
        float f10;
        float f11;
        Color color;
        boolean bl;
        if (!(this.A.i || this.h.i || this.Q.i)) {
            return;
        }
        class_4587.class_4665 class_46652 = class_45872.method_23760();
        Matrix4f matrix4f = class_46652.method_23761();
        class_243 class_2432 = v.W.field_1773.method_19418().method_19326();
        double d2 = class_2432.field_1352;
        double d3 = class_2432.field_1351;
        double d4 = class_2432.field_1350;
        RenderSystem.enableBlend();
        boolean bl2 = bl = this.A.i || this.h.i;
        if (bl) {
            RenderSystem.disableDepthTest();
        }
        if (this.h.i) {
            color = this.h.P();
            f11 = (float)color.getAlpha() / 255.0f;
            f10 = (float)color.getRed() / 255.0f;
            f9 = (float)color.getGreen() / 255.0f;
            f8 = (float)color.getBlue() / 255.0f;
            class_2872 = null;
            object = this.c;
            synchronized (object) {
                for (LongArrayList longArrayList : this.b.values()) {
                    longListIterator = longArrayList.iterator();
                    while (longListIterator.hasNext()) {
                        if (class_2872 == null) {
                            RenderSystem.setShader(class_757::method_34540);
                            RenderSystem.lineWidth((float)1.5f);
                            class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_29344, class_290.field_1576);
                        }
                        class_23382 = class_2338.method_10092((long)longListIterator.nextLong());
                        f7 = (float)((double)class_23382.method_10263() - d2);
                        f6 = (float)((double)class_23382.method_10264() - d3);
                        f5 = (float)((double)class_23382.method_10260() - d4);
                        f4 = f7 + 1.0f;
                        f3 = f6 + 1.0f;
                        f2 = f5 + 1.0f;
                        v.S(class_2872, matrix4f, f7, f6, f5, f4, f3, f2, f10, f9, f8, f11);
                    }
                }
            }
            if (class_2872 != null && (object = class_2872.method_60800()) != null) {
                class_286.method_43433((class_9801)object);
            }
        }
        if (this.A.i) {
            color = this.A.P();
            f11 = (float)color.getAlpha() / 255.0f;
            f10 = (float)color.getRed() / 255.0f;
            f9 = (float)color.getGreen() / 255.0f;
            f8 = (float)color.getBlue() / 255.0f;
            class_2872 = null;
            object = this.c;
            synchronized (object) {
                for (LongArrayList longArrayList : this.b.values()) {
                    longListIterator = longArrayList.iterator();
                    while (longListIterator.hasNext()) {
                        if (class_2872 == null) {
                            RenderSystem.setShader(class_757::method_34540);
                            class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1576);
                        }
                        class_23382 = class_2338.method_10092((long)longListIterator.nextLong());
                        f7 = (float)((double)class_23382.method_10263() - d2);
                        f6 = (float)((double)class_23382.method_10264() - d3);
                        f5 = (float)((double)class_23382.method_10260() - d4);
                        f4 = f7 + 1.0f;
                        f3 = f6 + 1.0f;
                        f2 = f5 + 1.0f;
                        v.b(class_2872, matrix4f, f7, f6, f5, f4, f3, f2, f10, f9, f8, f11);
                    }
                }
            }
            if (class_2872 != null && (object = class_2872.method_60800()) != null) {
                class_286.method_43433((class_9801)object);
            }
        }
        if (this.Q.i) {
            if (bl) {
                RenderSystem.enableDepthTest();
            }
            boolean bl3 = (Boolean)v.W.field_1690.method_42448().method_41753();
            boolean bl4 = false;
            f10 = W.method_60646().method_60637(true);
            class_243 class_2433 = class_2432.method_1019(class_243.method_1030((float)v.W.field_1724.method_5695(f10), (float)v.W.field_1724.method_5705(f10)).method_1021(0.2));
            f8 = (float)(class_2433.field_1352 - d2);
            float f12 = (float)(class_2433.field_1351 - d3);
            float f13 = (float)(class_2433.field_1350 - d4);
            Color color2 = this.Q.P();
            float f14 = (float)color2.getAlpha() / 255.0f;
            float f15 = (float)color2.getRed() / 255.0f;
            float f16 = (float)color2.getGreen() / 255.0f;
            f7 = (float)color2.getBlue() / 255.0f;
            class_287 class_2873 = null;
            Object object2 = this.c;
            synchronized (object2) {
                for (LongArrayList longArrayList : this.b.values()) {
                    LongListIterator longListIterator2 = longArrayList.iterator();
                    while (longListIterator2.hasNext()) {
                        if (class_2873 == null) {
                            v.W.field_1690.method_42448().method_41748((Object)false);
                            bl4 = true;
                            RenderSystem.disableCull();
                            RenderSystem.setShader(class_757::method_34535);
                            RenderSystem.lineWidth((float)1.0f);
                            class_2873 = class_289.method_1348().method_60827(class_293.class_5596.field_27377, class_290.field_29337);
                        }
                        class_2338 class_23383 = class_2338.method_10092((long)longListIterator2.nextLong());
                        float f17 = (float)((double)class_23383.method_10263() + 0.5 - d2);
                        float f18 = (float)((double)class_23383.method_10264() + 0.5 - d3);
                        float f19 = (float)((double)class_23383.method_10260() + 0.5 - d4);
                        v.h(class_2873, class_46652, matrix4f, f8, f12, f13, f17, f18, f19, f15, f16, f7, f14);
                    }
                }
            }
            if (class_2873 != null) {
                object2 = class_2873.method_60800();
                if (object2 != null) {
                    class_286.method_43433((class_9801)object2);
                }
                RenderSystem.enableCull();
                RenderSystem.lineWidth((float)1.0f);
            }
            if (bl4) {
                v.W.field_1690.method_42448().method_41748((Object)bl3);
            }
            if (bl) {
                RenderSystem.disableDepthTest();
            }
        }
        RenderSystem.enableDepthTest();
        RenderSystem.disableBlend();
    }

    private static void S(class_287 class_2872, Matrix4f matrix4f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11) {
        class_2872.method_22918(matrix4f, f2, f3, f4).method_22915(f8, f9, f10, f11);
        class_2872.method_22918(matrix4f, f5, f3, f4).method_22915(f8, f9, f10, f11);
        class_2872.method_22918(matrix4f, f5, f3, f4).method_22915(f8, f9, f10, f11);
        class_2872.method_22918(matrix4f, f5, f3, f7).method_22915(f8, f9, f10, f11);
        class_2872.method_22918(matrix4f, f5, f3, f7).method_22915(f8, f9, f10, f11);
        class_2872.method_22918(matrix4f, f2, f3, f7).method_22915(f8, f9, f10, f11);
        class_2872.method_22918(matrix4f, f2, f3, f7).method_22915(f8, f9, f10, f11);
        class_2872.method_22918(matrix4f, f2, f3, f4).method_22915(f8, f9, f10, f11);
        class_2872.method_22918(matrix4f, f2, f3, f4).method_22915(f8, f9, f10, f11);
        class_2872.method_22918(matrix4f, f2, f6, f4).method_22915(f8, f9, f10, f11);
        class_2872.method_22918(matrix4f, f5, f3, f4).method_22915(f8, f9, f10, f11);
        class_2872.method_22918(matrix4f, f5, f6, f4).method_22915(f8, f9, f10, f11);
        class_2872.method_22918(matrix4f, f5, f3, f7).method_22915(f8, f9, f10, f11);
        class_2872.method_22918(matrix4f, f5, f6, f7).method_22915(f8, f9, f10, f11);
        class_2872.method_22918(matrix4f, f2, f3, f7).method_22915(f8, f9, f10, f11);
        class_2872.method_22918(matrix4f, f2, f6, f7).method_22915(f8, f9, f10, f11);
        class_2872.method_22918(matrix4f, f2, f6, f4).method_22915(f8, f9, f10, f11);
        class_2872.method_22918(matrix4f, f5, f6, f4).method_22915(f8, f9, f10, f11);
        class_2872.method_22918(matrix4f, f5, f6, f4).method_22915(f8, f9, f10, f11);
        class_2872.method_22918(matrix4f, f5, f6, f7).method_22915(f8, f9, f10, f11);
        class_2872.method_22918(matrix4f, f5, f6, f7).method_22915(f8, f9, f10, f11);
        class_2872.method_22918(matrix4f, f2, f6, f7).method_22915(f8, f9, f10, f11);
        class_2872.method_22918(matrix4f, f2, f6, f7).method_22915(f8, f9, f10, f11);
        class_2872.method_22918(matrix4f, f2, f6, f4).method_22915(f8, f9, f10, f11);
    }

    private static void h(class_287 class_2872, class_4587.class_4665 class_46652, Matrix4f matrix4f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11) {
        float f12 = f5 - f2;
        float f13 = f6 - f3;
        float f14 = f7 - f4;
        float f15 = class_3532.method_15355((float)(f12 * f12 + f13 * f13 + f14 * f14));
        if (f15 <= 1.0E-4f) {
            return;
        }
        float f16 = f12 / f15;
        float f17 = f13 / f15;
        float f18 = f14 / f15;
        class_2872.method_22918(matrix4f, f2, f3, f4).method_22915(f8, f9, f10, f11).method_60831(class_46652, f16, f17, f18);
        class_2872.method_22918(matrix4f, f5, f6, f7).method_22915(f8, f9, f10, f11).method_60831(class_46652, f16, f17, f18);
    }

    private static void b(class_287 class_2872, Matrix4f matrix4f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11) {
        class_2872.method_22918(matrix4f, f2, f3, f4).method_22915(f8, f9, f10, f11);
        class_2872.method_22918(matrix4f, f5, f3, f4).method_22915(f8, f9, f10, f11);
        class_2872.method_22918(matrix4f, f5, f3, f7).method_22915(f8, f9, f10, f11);
        class_2872.method_22918(matrix4f, f2, f3, f7).method_22915(f8, f9, f10, f11);
        class_2872.method_22918(matrix4f, f2, f6, f4).method_22915(f8, f9, f10, f11);
        class_2872.method_22918(matrix4f, f2, f6, f7).method_22915(f8, f9, f10, f11);
        class_2872.method_22918(matrix4f, f5, f6, f7).method_22915(f8, f9, f10, f11);
        class_2872.method_22918(matrix4f, f5, f6, f4).method_22915(f8, f9, f10, f11);
        class_2872.method_22918(matrix4f, f2, f3, f4).method_22915(f8, f9, f10, f11);
        class_2872.method_22918(matrix4f, f2, f6, f4).method_22915(f8, f9, f10, f11);
        class_2872.method_22918(matrix4f, f5, f6, f4).method_22915(f8, f9, f10, f11);
        class_2872.method_22918(matrix4f, f5, f3, f4).method_22915(f8, f9, f10, f11);
        class_2872.method_22918(matrix4f, f5, f3, f4).method_22915(f8, f9, f10, f11);
        class_2872.method_22918(matrix4f, f5, f6, f4).method_22915(f8, f9, f10, f11);
        class_2872.method_22918(matrix4f, f5, f6, f7).method_22915(f8, f9, f10, f11);
        class_2872.method_22918(matrix4f, f5, f3, f7).method_22915(f8, f9, f10, f11);
        class_2872.method_22918(matrix4f, f2, f3, f7).method_22915(f8, f9, f10, f11);
        class_2872.method_22918(matrix4f, f5, f3, f7).method_22915(f8, f9, f10, f11);
        class_2872.method_22918(matrix4f, f5, f6, f7).method_22915(f8, f9, f10, f11);
        class_2872.method_22918(matrix4f, f2, f6, f7).method_22915(f8, f9, f10, f11);
        class_2872.method_22918(matrix4f, f2, f3, f4).method_22915(f8, f9, f10, f11);
        class_2872.method_22918(matrix4f, f2, f3, f7).method_22915(f8, f9, f10, f11);
        class_2872.method_22918(matrix4f, f2, f6, f7).method_22915(f8, f9, f10, f11);
        class_2872.method_22918(matrix4f, f2, f6, f4).method_22915(f8, f9, f10, f11);
    }

    @r
    public void C(i i2) {
        if (v.M() || this.W() || Frog.BLOCK_ESP == null || Frog.BLOCK_ESP.p().isEmpty()) {
            return;
        }
        if (i2.L() instanceof class_2672) {
            class_2672 class_26722 = (class_2672)i2.L();
            this.K(class_26722.method_11523(), class_26722.method_11524(), System.currentTimeMillis());
            return;
        }
        if (i2.L() instanceof class_2626) {
            class_2626 class_26262 = (class_2626)i2.L();
            this.J(class_26262.method_11309(), class_26262.method_11308());
            return;
        }
        if (i2.L() instanceof class_2637) {
            class_2637 class_26372 = (class_2637)i2.L();
            class_26372.method_30621(this::lambda$onPacket$1);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void J(class_2338 class_23382, class_2680 class_26802) {
        class_1923 class_19232 = new class_1923(class_23382);
        if (!v.W.field_1687.method_8393(class_19232.field_9181, class_19232.field_9180)) {
            return;
        }
        long l2 = class_1923.method_8331((int)class_19232.field_9181, (int)class_19232.field_9180);
        boolean bl = !class_26802.method_26215() && Frog.BLOCK_ESP.M(class_26802.method_26204().method_9539());
        long l3 = class_23382.method_10063();
        Object object = this.c;
        synchronized (object) {
            LongArrayList longArrayList = (LongArrayList)this.b.get(l2);
            if (!bl && longArrayList == null) {
                return;
            }
            if (bl) {
                if (longArrayList == null) {
                    longArrayList = new LongArrayList();
                    this.b.put(l2, (Object)longArrayList);
                }
                if (!longArrayList.contains(l3)) {
                    longArrayList.add(l3);
                }
            } else {
                longArrayList.rem(l3);
                if (longArrayList.isEmpty()) {
                    this.b.remove(l2);
                }
            }
            this.t.add(l2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void K(int n2, int n3, long l2) {
        long l3 = class_1923.method_8331((int)n2, (int)n3);
        Object object = this.c;
        synchronized (object) {
            this.u.remove(l3);
            if (this.T.add(l3)) {
                this.Y.add(l3);
                this.p.put(l3, l2);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private int T(class_1923 class_19232, int n2, int n3) {
        int n4 = 0;
        long l2 = System.currentTimeMillis();
        while (n3 > 0 && n4++ < 64) {
            Object object;
            long l3;
            long l4;
            Object object2 = this.c;
            synchronized (object2) {
                do {
                    if (this.l < this.Y.size()) continue;
                    this.Y.clear();
                    this.T.clear();
                    this.p.clear();
                    this.l = 0;
                    return n3;
                } while (!this.T.remove(l4 = this.Y.getLong(this.l++)));
                l3 = this.p.remove(l4);
                if (this.l > 1024 && this.l * 2 > this.Y.size()) {
                    this.Y.removeElements(0, this.l);
                    this.l = 0;
                }
            }
            int n5 = class_1923.method_8325((long)l4);
            int n6 = class_1923.method_8332((long)l4);
            if (Math.abs(n5 - class_19232.field_9181) > n2 + 2 || Math.abs(n6 - class_19232.field_9180) > n2 + 2) continue;
            if (l2 - l3 < 75L) {
                object = this.c;
                synchronized (object) {
                    if (this.T.add(l4)) {
                        this.Y.add(l4);
                        this.p.put(l4, l3);
                    }
                    continue;
                }
            }
            if (!v.W.field_1687.method_8393(n5, n6) || (object = v.W.field_1687.method_8497(n5, n6)) == null) continue;
            LongArrayList longArrayList = this.v((class_2818)object);
            Object object3 = this.c;
            synchronized (object3) {
                if (longArrayList.isEmpty()) {
                    this.b.remove(l4);
                } else {
                    this.b.put(l4, (Object)longArrayList);
                }
                this.t.add(l4);
                this.u.add(l4);
            }
            --n3;
        }
        return n3;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void Q(int n2, int n3, boolean bl) {
        this.Z = n2;
        this.g = n3;
        this.y = this.I(n2);
        this.P = 0;
        this.V = 0;
        if (bl) {
            Object object = this.c;
            synchronized (object) {
                this.b.clear();
                this.t.clear();
                this.u.clear();
            }
        }
    }

    private List<class_1923> I(int n2) {
        int n3 = n2 * 2 + 1;
        ArrayList<class_1923> arrayList = new ArrayList<class_1923>(n3 * n3);
        for (int i2 = -n2; i2 <= n2; ++i2) {
            for (int i3 = -n2; i3 <= n2; ++i3) {
                arrayList.add(new class_1923(i2, i3));
            }
        }
        arrayList.sort(v::lambda$buildScanOrder$2);
        return arrayList;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void N(class_1923 class_19232, int n2, int n3) {
        List<class_1923> list = this.y;
        if (list.isEmpty()) {
            return;
        }
        int n4 = 0;
        while (n3 > 0 && n4 < list.size()) {
            if (this.P >= list.size()) {
                this.P = 0;
            }
            class_1923 class_19233 = list.get(this.P++);
            ++n4;
            int n5 = class_19232.field_9181 + class_19233.field_9181;
            int n6 = class_19232.field_9180 + class_19233.field_9180;
            if (!v.W.field_1687.method_8393(n5, n6)) continue;
            long l2 = class_1923.method_8331((int)n5, (int)n6);
            Object object = this.c;
            synchronized (object) {
                if (this.u.contains(l2)) {
                    continue;
                }
            }
            object = v.W.field_1687.method_8497(n5, n6);
            if (object == null) continue;
            LongArrayList longArrayList = this.v((class_2818)object);
            Object object2 = this.c;
            synchronized (object2) {
                if (longArrayList.isEmpty()) {
                    this.b.remove(l2);
                } else {
                    this.b.put(l2, (Object)longArrayList);
                }
                this.t.add(l2);
                this.u.add(l2);
            }
            --n3;
        }
    }

    private LongArrayList v(class_2818 class_28182) {
        LongArrayList longArrayList = new LongArrayList();
        class_2338.class_2339 class_23392 = new class_2338.class_2339();
        int n2 = class_28182.method_12004().method_8326();
        int n3 = class_28182.method_12004().method_8328();
        int n4 = v.W.field_1687.method_31607();
        int n5 = v.W.field_1687.method_31600();
        class_2902 class_29022 = class_28182.method_12032(class_2902.class_2903.field_13202);
        for (int i2 = 0; i2 < 16; ++i2) {
            for (int i3 = 0; i3 < 16; ++i3) {
                int n6 = Math.min(n5, class_29022.method_12603(i2, i3));
                for (int i4 = n4; i4 < n6; ++i4) {
                    class_23392.method_10103(n2 + i2, i4, n3 + i3);
                    class_2680 class_26802 = class_28182.method_8320((class_2338)class_23392);
                    if (class_26802.method_26215() || !Frog.BLOCK_ESP.M(class_26802.method_26204().method_9539())) continue;
                    longArrayList.add(class_23392.method_10063());
                }
            }
        }
        return longArrayList;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void p(class_1923 class_19232, int n2) {
        Object object = this.c;
        synchronized (object) {
            if (this.b.isEmpty() && this.t.isEmpty()) {
                this.V = 0;
                return;
            }
            int n3 = 0;
            long[] lArray = this.t.toLongArray();
            if (lArray.length == 0) {
                this.V = 0;
                return;
            }
            if (this.V >= lArray.length) {
                this.V = 0;
            }
            while (n3 < 8 && this.V < lArray.length) {
                int n4;
                long l2;
                int n5;
                if (!v.W.field_1687.method_8393(n5 = class_1923.method_8325((long)(l2 = lArray[this.V++])), n4 = class_1923.method_8332((long)l2)) || Math.abs(n5 - class_19232.field_9181) > n2 || Math.abs(n4 - class_19232.field_9180) > n2) {
                    this.t.remove(l2);
                    this.u.remove(l2);
                    this.b.remove(l2);
                }
                ++n3;
            }
        }
    }

    private static int lambda$buildScanOrder$2(class_1923 class_19232, class_1923 class_19233) {
        int n2 = class_19232.field_9181 * class_19232.field_9181 + class_19232.field_9180 * class_19232.field_9180;
        int n3 = class_19233.field_9181 * class_19233.field_9181 + class_19233.field_9180 * class_19233.field_9180;
        return Integer.compare(n2, n3);
    }

    private void lambda$onPacket$1(class_2338 class_23382, class_2680 class_26802) {
        this.J(class_23382, class_26802);
    }

    private void lambda$onEnable$0(class_1923 class_19232, int n2, class_2818 class_28182) {
        class_1923 class_19233 = class_28182.method_12004();
        if (Math.abs(class_19233.field_9181 - class_19232.field_9181) <= n2 + 2 && Math.abs(class_19233.field_9180 - class_19232.field_9180) <= n2 + 2) {
            this.K(class_19233.field_9181, class_19233.field_9180, System.currentTimeMillis());
        }
    }
}

