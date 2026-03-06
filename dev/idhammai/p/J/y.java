/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.PlayerEntity
 *  org.apache.commons.io.IOUtils
 */
package dev.idhammai.p.J;

import dev.idhammai.p.R;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.entity.player.PlayerEntity;
import org.apache.commons.io.IOUtils;

public class y
extends R {
    public final ArrayList<String> x = new ArrayList();

    public y() {
        this.H();
    }

    public boolean e(String string) {
        return string.equals("KizuatoResult") || string.equals("8AI") || this.x.contains(string);
    }

    public boolean r(class_1657 class_16572) {
        return this.e(class_16572.method_7334().getName());
    }

    public void f(String string) {
        this.x.remove(string);
    }

    public void r(String string) {
        if (!this.x.contains(string)) {
            this.x.add(string);
        }
    }

    public void P(class_1657 class_16572) {
        this.F(class_16572.method_7334().getName());
    }

    public void F(String string) {
        if (this.x.contains(string)) {
            this.x.remove(string);
        } else {
            this.x.add(string);
        }
    }

    public void H() {
        try {
            File file = y.C("friends.txt");
            if (!file.exists()) {
                return;
            }
            List list = IOUtils.readLines((InputStream)new FileInputStream(file), (Charset)StandardCharsets.UTF_8);
            for (String string : list) {
                this.r(string);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void L() {
        try {
            File file = y.C("friends.txt");
            PrintWriter printWriter = new PrintWriter(new OutputStreamWriter((OutputStream)new FileOutputStream(file), StandardCharsets.UTF_8));
            for (String string : this.x) {
                printWriter.println(string);
            }
            printWriter.close();
        }
        catch (Exception exception) {
            exception.printStackTrace();
            System.out.println("[Frog Client] Failed to save friends");
        }
    }
}

