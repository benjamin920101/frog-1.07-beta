/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Blocks
 *  org.apache.commons.io.IOUtils
 */
package dev.idhammai.p.J;

import dev.idhammai.c.r.q.n.U;
import dev.idhammai.c.r.y;
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
import net.minecraft.block.Blocks;
import org.apache.commons.io.IOUtils;

public class V
extends R {
    private final ArrayList<String> X = new ArrayList();

    public V() {
        this.Q();
    }

    public ArrayList<String> I() {
        return this.X;
    }

    public boolean E(String string) {
        return this.X.contains(string) || this.X.contains(string.replace("block.minecraft.", "").replace("item.minecraft.", ""));
    }

    public void s() {
        this.X.clear();
    }

    public void z(String string) {
        if (this.X.remove(string = string.replace("block.minecraft.", "").replace("item.minecraft.", "")) && !y.M() && U.l.p()) {
            V.P.field_1769.method_3279();
        }
    }

    public void h(String string) {
        if (!this.X.contains(string = string.replace("block.minecraft.", "").replace("item.minecraft.", ""))) {
            this.X.add(string);
            if (!y.M() && U.l.p()) {
                V.P.field_1769.method_3279();
            }
        }
    }

    public void Q() {
        try {
            File file = V.C("xrays.txt");
            if (!file.exists()) {
                this.h(class_2246.field_10442.method_9539());
                this.h(class_2246.field_29029.method_9539());
                this.h(class_2246.field_10571.method_9539());
                this.h(class_2246.field_23077.method_9539());
                this.h(class_2246.field_10212.method_9539());
                this.h(class_2246.field_29027.method_9539());
                this.h(class_2246.field_10080.method_9539());
                this.h(class_2246.field_10013.method_9539());
                this.h(class_2246.field_29220.method_9539());
                this.h(class_2246.field_29030.method_9539());
                this.h(class_2246.field_10418.method_9539());
                this.h(class_2246.field_29219.method_9539());
                this.h(class_2246.field_22109.method_9539());
                this.h(class_2246.field_10213.method_9539());
                this.h(class_2246.field_10090.method_9539());
                this.h(class_2246.field_29028.method_9539());
                return;
            }
            List list = IOUtils.readLines((InputStream)new FileInputStream(file), (Charset)StandardCharsets.UTF_8);
            for (String string : list) {
                this.h(string);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void e() {
        try {
            File file = V.C("xrays.txt");
            PrintWriter printWriter = new PrintWriter(new OutputStreamWriter((OutputStream)new FileOutputStream(file), StandardCharsets.UTF_8));
            for (String string : this.X) {
                printWriter.println(string);
            }
            printWriter.close();
        }
        catch (Exception exception) {
            System.out.println("[Frog Client] Failed to save xrays");
        }
    }
}

