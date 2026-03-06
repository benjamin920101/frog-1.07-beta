/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1802
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
import net.minecraft.class_1802;
import org.apache.commons.io.IOUtils;

public class P
extends R {
    private final ArrayList<String> q = new ArrayList();

    public P() {
        this.w();
    }

    public ArrayList<String> O() {
        return this.q;
    }

    public boolean J(String string) {
        return this.q.contains(string) || this.q.contains(string.replace("block.minecraft.", "").replace("item.minecraft.", ""));
    }

    public void L() {
        this.q.clear();
    }

    public void D(String string) {
        string = string.replace("block.minecraft.", "").replace("item.minecraft.", "");
        this.q.remove(string);
    }

    public void u(String string) {
        if (!this.q.contains(string = string.replace("block.minecraft.", "").replace("item.minecraft.", ""))) {
            this.q.add(string);
        }
    }

    public void w() {
        try {
            File file = dev.idhammai.p.J.P.C("hud_items.txt");
            if (!file.exists()) {
                this.u(class_1802.field_8301.method_7876());
                this.u(class_1802.field_8287.method_7876());
                this.u(class_1802.field_8634.method_7876());
                this.u(class_1802.field_8281.method_7876());
                this.u(class_1802.field_8367.method_7876());
                this.u(class_1802.field_8463.method_7876());
                this.u(class_1802.field_8288.method_7876());
                this.u(class_1802.field_8786.method_7876());
                this.u(class_1802.field_23141.method_7876());
                this.u(class_1802.field_8801.method_7876());
                this.u(class_1802.field_8249.method_7876());
                this.u(class_1802.field_8105.method_7876());
                this.u(class_1802.field_8793.method_7876());
                this.u(class_1802.field_8466.method_7876());
                this.u(class_1802.field_8639.method_7876());
                return;
            }
            List list = IOUtils.readLines((InputStream)new FileInputStream(file), (Charset)StandardCharsets.UTF_8);
            for (String string : list) {
                this.u(string);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void m() {
        try {
            File file = dev.idhammai.p.J.P.C("hud_items.txt");
            PrintWriter printWriter = new PrintWriter(new OutputStreamWriter((OutputStream)new FileOutputStream(file), StandardCharsets.UTF_8));
            for (String string : this.q) {
                printWriter.println(string);
            }
            printWriter.close();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

