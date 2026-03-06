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

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class B
extends R {
    private final ArrayList<String> L = new ArrayList();

    public B() {
        this.m();
    }

    public ArrayList<String> J() {
        return this.L;
    }

    public void v() {
        this.L.clear();
    }

    public boolean d(String string) {
        return this.L.contains(string) || this.L.contains(string.replace("block.minecraft.", "").replace("item.minecraft.", ""));
    }

    public void d(String string) {
        string = string.replace("block.minecraft.", "").replace("item.minecraft.", "");
        this.L.remove(string);
    }

    public void R(String string) {
        if (!this.L.contains(string = string.replace("block.minecraft.", "").replace("item.minecraft.", ""))) {
            this.L.add(string);
        }
    }

    public void m() {
        try {
            File file = B.C("trades.txt");
            if (!file.exists()) {
                this.R(class_1802.field_8598.method_7876());
                this.R(class_1802.field_8603.method_7876());
                return;
            }
            List list = IOUtils.readLines((InputStream)new FileInputStream(file), (Charset)StandardCharsets.UTF_8);
            for (String string : list) {
                this.R(string);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void g() {
        try {
            File file = B.C("trades.txt");
            PrintWriter printWriter = new PrintWriter(new OutputStreamWriter((OutputStream)new FileOutputStream(file), StandardCharsets.UTF_8));
            for (String string : this.L) {
                printWriter.println(string);
            }
            printWriter.close();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

