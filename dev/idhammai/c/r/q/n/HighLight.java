/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.world.BlockView
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.hit.HitResult
 *  net.minecraft.util.hit.HitResult$Type
 *  net.minecraft.util.shape.VoxelShape
 *  net.minecraft.client.render.BufferRenderer
 *  net.minecraft.client.render.BufferBuilder
 *  net.minecraft.client.render.Tessellator
 *  net.minecraft.client.render.VertexFormats
 *  net.minecraft.client.render.VertexFormat$DrawMode
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.client.render.GameRenderer
 *  net.minecraft.client.render.BuiltBuffer
 *  org.joml.Matrix4f
 */
package dev.idhammai.c.r.q.n;

import com.mojang.blaze3d.systems.RenderSystem;
import dev.idhammai.c.r.O.Y.A;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import java.awt.Color;
import net.minecraft.world.BlockView;
import net.minecraft.util.math.Box;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.render.BuiltBuffer;
import org.joml.Matrix4f;

public class C
extends y {
    public static C c;
    private final W t = this.S(new W("Depth", true).k("\u6df1\u5ea6"));
    private final A U = this.y(new A("Fill", new Color(255, 0, 0, 50)).P("\u586b\u5145").t(true));
    private final A s = this.y(new A("Box", new Color(255, 0, 0, 100)).P("\u65b9\u6846").t(true));

    public C() {
        super("HighLight", w.Render);
        c = this;
        this.L("\u65b9\u5757\u9ad8\u4eae");
    }

    @Override
    public void h(class_4587 class_45872) {
        class_239 class_2392;
        if (C.W.field_1765.method_17783() == class_239.class_240.field_1332 && (class_2392 = C.W.field_1765) instanceof class_3965) {
            class_3965 class_39652 = (class_3965)class_2392;
            if (this.U.i || this.s.i) {
                class_287 class_2872;
                float f2;
                float f3;
                float f4;
                float f5;
                Color color;
                class_265 class_2652 = C.W.field_1687.method_8320(class_39652.method_17777()).method_26218((class_1922)C.W.field_1687, class_39652.method_17777());
                if (class_2652 == null) {
                    return;
                }
                if (class_2652.method_1110()) {
                    return;
                }
                class_238 class_2383 = class_2652.method_1107().method_996(class_39652.method_17777()).method_1014(0.001);
                class_2383 = class_2383.method_997(C.W.field_1773.method_19418().method_19326().method_22882());
                RenderSystem.enableBlend();
                if (!this.t.h()) {
                    RenderSystem.disableDepthTest();
                } else {
                    RenderSystem.enableDepthTest();
                }
                Matrix4f matrix4f = class_45872.method_23760().method_23761();
                if (this.U.i) {
                    color = this.U.P();
                    f5 = (float)color.getAlpha() / 255.0f;
                    f4 = (float)color.getRed() / 255.0f;
                    f3 = (float)color.getGreen() / 255.0f;
                    f2 = (float)color.getBlue() / 255.0f;
                    RenderSystem.setShader(class_757::method_34540);
                    class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1576);
                    class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1322, (float)class_2383.field_1321).method_22915(f4, f3, f2, f5);
                    class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1322, (float)class_2383.field_1321).method_22915(f4, f3, f2, f5);
                    class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1322, (float)class_2383.field_1324).method_22915(f4, f3, f2, f5);
                    class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1322, (float)class_2383.field_1324).method_22915(f4, f3, f2, f5);
                    class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1325, (float)class_2383.field_1321).method_22915(f4, f3, f2, f5);
                    class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1325, (float)class_2383.field_1324).method_22915(f4, f3, f2, f5);
                    class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1325, (float)class_2383.field_1324).method_22915(f4, f3, f2, f5);
                    class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1325, (float)class_2383.field_1321).method_22915(f4, f3, f2, f5);
                    class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1322, (float)class_2383.field_1321).method_22915(f4, f3, f2, f5);
                    class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1325, (float)class_2383.field_1321).method_22915(f4, f3, f2, f5);
                    class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1325, (float)class_2383.field_1321).method_22915(f4, f3, f2, f5);
                    class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1322, (float)class_2383.field_1321).method_22915(f4, f3, f2, f5);
                    class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1322, (float)class_2383.field_1321).method_22915(f4, f3, f2, f5);
                    class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1325, (float)class_2383.field_1321).method_22915(f4, f3, f2, f5);
                    class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1325, (float)class_2383.field_1324).method_22915(f4, f3, f2, f5);
                    class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1322, (float)class_2383.field_1324).method_22915(f4, f3, f2, f5);
                    class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1322, (float)class_2383.field_1324).method_22915(f4, f3, f2, f5);
                    class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1322, (float)class_2383.field_1324).method_22915(f4, f3, f2, f5);
                    class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1325, (float)class_2383.field_1324).method_22915(f4, f3, f2, f5);
                    class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1325, (float)class_2383.field_1324).method_22915(f4, f3, f2, f5);
                    class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1322, (float)class_2383.field_1321).method_22915(f4, f3, f2, f5);
                    class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1322, (float)class_2383.field_1324).method_22915(f4, f3, f2, f5);
                    class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1325, (float)class_2383.field_1324).method_22915(f4, f3, f2, f5);
                    class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1325, (float)class_2383.field_1321).method_22915(f4, f3, f2, f5);
                    class_286.method_43433((class_9801)class_2872.method_60800());
                }
                if (this.t.h()) {
                    RenderSystem.disableDepthTest();
                }
                if (this.s.i) {
                    color = this.s.P();
                    f5 = (float)color.getAlpha() / 255.0f;
                    f4 = (float)color.getRed() / 255.0f;
                    f3 = (float)color.getGreen() / 255.0f;
                    f2 = (float)color.getBlue() / 255.0f;
                    RenderSystem.setShader(class_757::method_34540);
                    class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_29344, class_290.field_1576);
                    class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1322, (float)class_2383.field_1321).method_22915(f4, f3, f2, f5);
                    class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1322, (float)class_2383.field_1321).method_22915(f4, f3, f2, f5);
                    class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1322, (float)class_2383.field_1321).method_22915(f4, f3, f2, f5);
                    class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1322, (float)class_2383.field_1324).method_22915(f4, f3, f2, f5);
                    class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1322, (float)class_2383.field_1324).method_22915(f4, f3, f2, f5);
                    class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1322, (float)class_2383.field_1324).method_22915(f4, f3, f2, f5);
                    class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1322, (float)class_2383.field_1324).method_22915(f4, f3, f2, f5);
                    class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1322, (float)class_2383.field_1321).method_22915(f4, f3, f2, f5);
                    class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1322, (float)class_2383.field_1321).method_22915(f4, f3, f2, f5);
                    class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1325, (float)class_2383.field_1321).method_22915(f4, f3, f2, f5);
                    class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1322, (float)class_2383.field_1321).method_22915(f4, f3, f2, f5);
                    class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1325, (float)class_2383.field_1321).method_22915(f4, f3, f2, f5);
                    class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1322, (float)class_2383.field_1324).method_22915(f4, f3, f2, f5);
                    class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1325, (float)class_2383.field_1324).method_22915(f4, f3, f2, f5);
                    class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1322, (float)class_2383.field_1324).method_22915(f4, f3, f2, f5);
                    class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1325, (float)class_2383.field_1324).method_22915(f4, f3, f2, f5);
                    class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1325, (float)class_2383.field_1321).method_22915(f4, f3, f2, f5);
                    class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1325, (float)class_2383.field_1321).method_22915(f4, f3, f2, f5);
                    class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1325, (float)class_2383.field_1321).method_22915(f4, f3, f2, f5);
                    class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1325, (float)class_2383.field_1324).method_22915(f4, f3, f2, f5);
                    class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1325, (float)class_2383.field_1324).method_22915(f4, f3, f2, f5);
                    class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1325, (float)class_2383.field_1324).method_22915(f4, f3, f2, f5);
                    class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1325, (float)class_2383.field_1324).method_22915(f4, f3, f2, f5);
                    class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1325, (float)class_2383.field_1321).method_22915(f4, f3, f2, f5);
                    class_286.method_43433((class_9801)class_2872.method_60800());
                }
                RenderSystem.enableDepthTest();
                RenderSystem.disableBlend();
            }
        }
    }
}

