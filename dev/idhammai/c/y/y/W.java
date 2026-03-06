/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  it.unimi.dsi.fastutil.chars.Char2ObjectArrayMap
 *  net.minecraft.client.texture.NativeImage
 *  net.minecraft.client.texture.NativeImage$Format
 *  net.minecraft.client.texture.NativeImageBackedTexture
 *  net.minecraft.client.texture.AbstractTexture
 *  net.minecraft.util.Identifier
 *  net.minecraft.client.MinecraftClient
 */
package dev.idhammai.c.y.y;

import com.mojang.blaze3d.systems.RenderSystem;
import dev.idhammai.c.y.y.f;
import it.unimi.dsi.fastutil.chars.Char2ObjectArrayMap;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.font.FontRenderContext;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;
import java.util.ArrayList;
import java.util.Objects;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.client.texture.NativeImageBackedTexture;
import net.minecraft.client.texture.AbstractTexture;
import net.minecraft.util.Identifier;
import net.minecraft.client.MinecraftClient;

class W {
    final char a;
    final char C;
    final Font M;
    Font e;
    final class_2960 E;
    final int S;
    private final Char2ObjectArrayMap<f> h = new Char2ObjectArrayMap();
    int l;
    int b;
    boolean o = false;

    public W(char c2, char c3, Font font, class_2960 class_29602, int n2) {
        this.a = c2;
        this.C = c3;
        this.M = font;
        this.E = class_29602;
        this.S = n2;
    }

    public W(char c2, char c3, Font font, Font font2, class_2960 class_29602, int n2) {
        this(c2, c3, font, class_29602, n2);
        this.e = font2;
    }

    public static void k(class_2960 class_29602, BufferedImage bufferedImage) {
        try {
            int n2 = bufferedImage.getWidth();
            int n3 = bufferedImage.getHeight();
            class_1011 class_10112 = new class_1011(class_1011.class_1012.field_4997, n2, n3, false);
            WritableRaster writableRaster = bufferedImage.getRaster();
            ColorModel colorModel = bufferedImage.getColorModel();
            int n4 = writableRaster.getNumBands();
            int n5 = writableRaster.getDataBuffer().getDataType();
            Object[] objectArray = switch (n5) {
                case 0 -> new byte[n4];
                case 1 -> (Object[])new short[n4];
                case 3 -> (Object[])new int[n4];
                case 4 -> (Object[])new float[n4];
                case 5 -> (Object[])new double[n4];
                default -> throw new IllegalArgumentException("Unknown data buffer type: " + n5);
            };
            for (int i2 = 0; i2 < n3; ++i2) {
                for (int i3 = 0; i3 < n2; ++i3) {
                    writableRaster.getDataElements(i3, i2, objectArray);
                    int n6 = colorModel.getAlpha(objectArray);
                    int n7 = colorModel.getRed(objectArray);
                    int n8 = colorModel.getGreen(objectArray);
                    int n9 = colorModel.getBlue(objectArray);
                    int n10 = n6 << 24 | n9 << 16 | n8 << 8 | n7;
                    class_10112.method_4305(i3, i2, n10);
                }
            }
            class_1043 class_10432 = new class_1043(class_10112);
            if (RenderSystem.isOnRenderThread()) {
                class_10432.method_4524();
                class_310.method_1551().method_1531().method_4616(class_29602, (class_1044)class_10432);
            } else {
                RenderSystem.recordRenderCall(() -> W.lambda$registerBufferedImageTexture$0(class_10432, class_29602));
            }
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public f z(char c2) {
        if (!this.o) {
            this.N();
        }
        return (f)this.h.get(c2);
    }

    public void m() {
        class_310.method_1551().method_1531().method_4615(this.E);
        this.h.clear();
        this.l = -1;
        this.b = -1;
        this.o = false;
    }

    public boolean H(char c2) {
        return c2 >= this.a && c2 < this.C;
    }

    private Font q(char c2) {
        if (this.M.canDisplay(c2)) {
            return this.M;
        }
        return Objects.requireNonNullElse(this.e, this.M);
    }

    public void N() {
        Object object;
        if (this.o) {
            return;
        }
        int n2 = this.C - this.a - 1;
        int n3 = (int)(Math.ceil(Math.sqrt(n2)) * 1.5);
        this.h.clear();
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        ArrayList<f> arrayList = new ArrayList<f>();
        AffineTransform affineTransform = new AffineTransform();
        FontRenderContext fontRenderContext = new FontRenderContext(affineTransform, true, false);
        while (n4 <= n2) {
            char c2 = (char)(this.a + n4);
            object = this.q(c2);
            Rectangle2D rectangle2D = ((Font)object).getStringBounds(String.valueOf(c2), fontRenderContext);
            int n11 = (int)Math.ceil(rectangle2D.getWidth());
            int n12 = (int)Math.ceil(rectangle2D.getHeight());
            ++n4;
            n6 = Math.max(n6, n8 + n11);
            n7 = Math.max(n7, n9 + n12);
            if (n5 >= n3) {
                n8 = 0;
                n9 += n10 + this.S;
                n5 = 0;
                n10 = 0;
            }
            n10 = Math.max(n10, n12);
            arrayList.add(new f(n8, n9, n11, n12, c2, this));
            n8 += n11 + this.S;
            ++n5;
        }
        BufferedImage bufferedImage = new BufferedImage(Math.max(n6 + this.S, 1), Math.max(n7 + this.S, 1), 2);
        this.l = bufferedImage.getWidth();
        this.b = bufferedImage.getHeight();
        object = bufferedImage.createGraphics();
        ((Graphics)object).setColor(new Color(255, 255, 255, 0));
        ((Graphics)object).fillRect(0, 0, this.l, this.b);
        ((Graphics)object).setColor(Color.WHITE);
        ((Graphics2D)object).setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_OFF);
        ((Graphics2D)object).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
        ((Graphics2D)object).setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        for (f f2 : arrayList) {
            ((Graphics)object).setFont(this.q(f2.S()));
            FontMetrics fontMetrics = ((Graphics)object).getFontMetrics();
            ((Graphics2D)object).drawString(String.valueOf(f2.S()), f2.D(), f2.R() + fontMetrics.getAscent());
            this.h.put(f2.S(), (Object)f2);
        }
        W.k(this.E, bufferedImage);
        this.o = true;
    }

    private static void lambda$registerBufferedImageTexture$0(class_1043 class_10432, class_2960 class_29602) {
        class_10432.method_4524();
        class_310.method_1551().method_1531().method_4616(class_29602, (class_1044)class_10432);
    }
}

