/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.Items
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
import net.minecraft.item.Items;
import org.apache.commons.io.IOUtils;

public class x
extends R {
    private final ArrayList<String> W = new ArrayList();

    public x() {
        this.D();
    }

    public ArrayList<String> L() {
        return this.W;
    }

    public boolean T(String string) {
        return this.W.contains(string) || this.W.contains(string.replace("block.minecraft.", "").replace("item.minecraft.", ""));
    }

    public void P() {
        this.W.clear();
    }

    public void Y(String string) {
        string = string.replace("block.minecraft.", "").replace("item.minecraft.", "");
        this.W.remove(string);
    }

    public void E(String string) {
        if (!this.W.contains(string = string.replace("block.minecraft.", "").replace("item.minecraft.", ""))) {
            this.W.add(string);
        }
    }

    public void D() {
        try {
            File file = x.C("cleaner.txt");
            if (!file.exists()) {
                this.E(class_1802.field_22022.method_7876());
                this.E(class_1802.field_22024.method_7876());
                this.E(class_1802.field_22027.method_7876());
                this.E(class_1802.field_22028.method_7876());
                this.E(class_1802.field_22029.method_7876());
                this.E(class_1802.field_22030.method_7876());
                this.E(class_1802.field_8281.method_7876());
                this.E(class_1802.field_8466.method_7876());
                this.E(class_1802.field_8634.method_7876());
                this.E(class_1802.field_8367.method_7876());
                this.E(class_1802.field_8287.method_7876());
                this.E(class_1802.field_8786.method_7876());
                this.E(class_1802.field_8574.method_7876());
                this.E(class_1802.field_8436.method_7876());
                this.E(class_1802.field_8288.method_7876());
                this.E(class_1802.field_8301.method_7876());
                this.E(class_1802.field_8833.method_7876());
                this.E(class_1802.field_8884.method_7876());
                this.E(class_1802.field_8249.method_7876());
                this.E(class_1802.field_8105.method_7876());
                this.E(class_1802.field_8793.method_7876());
                this.E(class_1802.field_8801.method_7876());
                this.E(class_1802.field_23141.method_7876());
                this.E(class_1802.field_8782.method_7876());
                return;
            }
            List list = IOUtils.readLines((InputStream)new FileInputStream(file), (Charset)StandardCharsets.UTF_8);
            for (String string : list) {
                this.E(string);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void Q() {
        try {
            File file = x.C("cleaner.txt");
            PrintWriter printWriter = new PrintWriter(new OutputStreamWriter((OutputStream)new FileOutputStream(file), StandardCharsets.UTF_8));
            for (String string : this.W) {
                printWriter.println(string);
            }
            printWriter.close();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

