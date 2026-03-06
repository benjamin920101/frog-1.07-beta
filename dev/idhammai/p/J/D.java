/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
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
import java.util.HashSet;
import java.util.List;
import org.apache.commons.io.IOUtils;

public class D
extends R {
    private final ArrayList<String> k = new ArrayList();
    private final HashSet<String> D = new HashSet();
    private int d;

    public D() {
        this.j();
    }

    public ArrayList<String> p() {
        return this.k;
    }

    public int s() {
        return this.d;
    }

    public boolean M(String string) {
        return this.D.contains(string);
    }

    public void P() {
        if (!this.k.isEmpty()) {
            this.k.clear();
            this.t();
            ++this.d;
        }
    }

    public void q(String string) {
        if (this.k.remove(string = string.replace("block.minecraft.", "").replace("item.minecraft.", ""))) {
            this.t();
            ++this.d;
        }
    }

    public void F(String string) {
        if (!this.k.contains(string = string.replace("block.minecraft.", "").replace("item.minecraft.", ""))) {
            this.k.add(string);
            this.t();
            ++this.d;
        }
    }

    public void j() {
        try {
            File file = dev.idhammai.p.J.D.C("blockesp.txt");
            if (!file.exists()) {
                return;
            }
            List list = IOUtils.readLines((InputStream)new FileInputStream(file), (Charset)StandardCharsets.UTF_8);
            for (String string : list) {
                this.F(string);
            }
            this.t();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void t() {
        this.D.clear();
        for (String string : this.k) {
            this.D.add(string);
            this.D.add("block.minecraft." + string);
            this.D.add("item.minecraft." + string);
        }
    }

    public void g() {
        try {
            File file = dev.idhammai.p.J.D.C("blockesp.txt");
            PrintWriter printWriter = new PrintWriter(new OutputStreamWriter((OutputStream)new FileOutputStream(file), StandardCharsets.UTF_8));
            for (String string : this.k) {
                printWriter.println(string);
            }
            printWriter.close();
        }
        catch (Exception exception) {
            System.out.println("[Frog Client] Failed to save block esp");
        }
    }
}

