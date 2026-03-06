/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.p.J;

import dev.idhammai.c.r.q.N.j;
import dev.idhammai.c.y.y.i;
import dev.idhammai.p.J.H;
import dev.idhammai.p.J.N;
import dev.idhammai.p.J.f;
import dev.idhammai.p.J.l;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

public class n {
    public static i w;
    public static i E;
    public static i t;
    public static i g;
    public static i r;

    public static boolean s() {
        return j.G != null && j.G.p();
    }

    public static boolean w() {
        return j.G == null || j.G.X.h();
    }

    public static void L() {
        try {
            w = n.E(8.0f, "default", 0, "msyh");
            E = n.E(6.0f, "default", 0, "msyh");
            t = n.E(16.0f, "default", 0, "msyh");
            r = n.E(10.0f, "default", 0, "msyh");
            g = n.R(8.0f, "icon", 0);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static i E(float f2, String string, int n2, String string2) throws IOException, FontFormatException {
        ClassLoader classLoader = n.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("assets/frogclient/font/" + string + ".ttf");
        InputStream inputStream2 = classLoader.getResourceAsStream("assets/minecraft/font/font.ttf");
        InputStream inputStream3 = inputStream != null ? inputStream : inputStream2;
        return new N(Font.createFont(0, Objects.requireNonNull(inputStream3)).deriveFont(n2, f2), n.N(string2, n2, (int)f2), f2);
    }

    public static i R(float f2, String string, int n2) throws IOException, FontFormatException {
        ClassLoader classLoader = n.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("assets/frog/icon/" + string + ".ttf");
        InputStream inputStream2 = classLoader.getResourceAsStream("assets/minecraft/font/font.ttf");
        InputStream inputStream3 = inputStream != null ? inputStream : inputStream2;
        return new i(Font.createFont(0, Objects.requireNonNull(inputStream3)).deriveFont(n2, f2), f2);
    }

    public static i m(float f2, String string, int n2) throws IOException, FontFormatException {
        ClassLoader classLoader = n.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("assets/frogclient/font/" + string + ".ttf");
        InputStream inputStream2 = classLoader.getResourceAsStream("assets/minecraft/font/font.ttf");
        InputStream inputStream3 = inputStream != null ? inputStream : inputStream2;
        return new H(Font.createFont(0, Objects.requireNonNull(inputStream3)).deriveFont(n2, f2), f2);
    }

    public static i E(int n2, String string, int n3, String string2) {
        return new l(n.N(string, n3, n2), n.N(string2, n3, n2), n2);
    }

    public static i o(int n2, String string, int n3) {
        return new f(n.N(string, n3, n2), n2);
    }

    private static Font N(String string, int n2, int n3) {
        File file = new File("C:\\Windows\\Fonts");
        try {
            for (File file2 : file.listFiles()) {
                if (!file2.getName().replace(".ttf", "").replace(".ttc", "").replace(".otf", "").equalsIgnoreCase(string)) continue;
                try {
                    return Font.createFont(0, file2).deriveFont(n2, n3);
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
            for (File file2 : file.listFiles()) {
                if (!file2.getName().startsWith(string)) continue;
                try {
                    return Font.createFont(0, file2).deriveFont(n2, n3);
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return new Font(null, n2, n3);
    }
}

