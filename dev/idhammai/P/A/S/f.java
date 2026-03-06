/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.P.A.S;

import java.awt.Color;

public class f {
    public static Color U(Color color, Color color2, double d2) {
        d2 = Math.min(Math.max(d2, 0.0), 1.0);
        int n2 = color.getRed();
        int n3 = color.getGreen();
        int n4 = color.getBlue();
        int n5 = color.getAlpha();
        int n6 = color2.getRed();
        int n7 = color2.getGreen();
        int n8 = color2.getBlue();
        int n9 = color2.getAlpha();
        return new Color(Math.min((int)((double)n2 + (double)(n6 - n2) * d2), 255), Math.min((int)((double)n3 + (double)(n7 - n3) * d2), 255), Math.min((int)((double)n4 + (double)(n8 - n4) * d2), 255), Math.min((int)((double)n5 + (double)(n9 - n5) * d2), 255));
    }

    public static Color J(float f2, float f3, float f4, float f5) {
        if (f3 < 0.0f || f3 > 100.0f) {
            throw new IllegalArgumentException("Color parameter outside of expected range - Saturation");
        }
        if (f4 < 0.0f || f4 > 100.0f) {
            throw new IllegalArgumentException("Color parameter outside of expected range - Lightness");
        }
        if (f5 < 0.0f || f5 > 1.0f) {
            throw new IllegalArgumentException("Color parameter outside of expected range - Alpha");
        }
        f2 %= 360.0f;
        float f6 = (double)f4 < 0.5 ? f4 * (1.0f + f3) : (f4 /= 100.0f) + (f3 /= 100.0f) - f3 * f4;
        f3 = 2.0f * f4 - f6;
        f4 = Math.max(0.0f, f.i(f3, f6, (f2 /= 360.0f) + 0.33333334f));
        float f7 = Math.max(0.0f, f.i(f3, f6, f2));
        f3 = Math.max(0.0f, f.i(f3, f6, f2 - 0.33333334f));
        f4 = Math.min(f4, 1.0f);
        f7 = Math.min(f7, 1.0f);
        f3 = Math.min(f3, 1.0f);
        return new Color(f4, f7, f3, f5);
    }

    private static float i(float f2, float f3, float f4) {
        if (f4 < 0.0f) {
            f4 += 1.0f;
        }
        if (f4 > 1.0f) {
            f4 -= 1.0f;
        }
        if (6.0f * f4 < 1.0f) {
            return f2 + (f3 - f2) * 6.0f * f4;
        }
        if (2.0f * f4 < 1.0f) {
            return f3;
        }
        if (3.0f * f4 < 2.0f) {
            return f2 + (f3 - f2) * 6.0f * (0.6666667f - f4);
        }
        return f2;
    }

    public static Color y(Color color, int n2) {
        n2 = Math.max(Math.min(255, n2), 0);
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), n2);
    }

    public static int k(int n2, int n3) {
        return n2 & 0xFFFFFF | n3 << 24;
    }

    public static int Z(int n2) {
        return n2 >> 24 & 0xFF;
    }

    public static Color N(Color color, Color color2, double d2, int n2, double d3) {
        double d4 = Math.abs(((double)System.currentTimeMillis() * d3 % 2000.0 / (double)Float.intBitsToFloat(Float.floatToIntBits(0.0013786979f) ^ 0x7ECEB56D) + d2 / (double)n2 * (double)Float.intBitsToFloat(Float.floatToIntBits(0.09192204f) ^ 0x7DBC419F)) % (double)Float.intBitsToFloat(Float.floatToIntBits(0.7858098f) ^ 0x7F492AD5) - (double)Float.intBitsToFloat(Float.floatToIntBits(6.46708f) ^ 0x7F4EF252));
        double d5 = d4 % (double)Float.intBitsToFloat(Float.floatToIntBits(0.8992331f) ^ 0x7F663424);
        return f.U(color, color2, d5);
    }

    public static Color x(Color color, double d2, int n2, double d3) {
        float[] fArray = new float[3];
        Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), fArray);
        double d4 = Math.abs(((double)System.currentTimeMillis() * d3 % 2000.0 / (double)Float.intBitsToFloat(Float.floatToIntBits(0.0013786979f) ^ 0x7ECEB56D) + d2 / (double)n2 * (double)Float.intBitsToFloat(Float.floatToIntBits(0.09192204f) ^ 0x7DBC419F)) % (double)Float.intBitsToFloat(Float.floatToIntBits(0.7858098f) ^ 0x7F492AD5) - (double)Float.intBitsToFloat(Float.floatToIntBits(6.46708f) ^ 0x7F4EF252));
        d4 = (double)Float.intBitsToFloat(Float.floatToIntBits(18.996923f) ^ 0x7E97F9B3) + (double)Float.intBitsToFloat(Float.floatToIntBits(2.7958195f) ^ 0x7F32EEB5) * d4;
        fArray[2] = (float)(d4 % (double)Float.intBitsToFloat(Float.floatToIntBits(0.8992331f) ^ 0x7F663424));
        return new Color(Color.HSBtoRGB(fArray[0], fArray[1], fArray[2]));
    }
}

