/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.MinecraftClient
 */
package dev.idhammai.p;

import java.io.File;
import net.minecraft.client.MinecraftClient;

public class R {
    public static final class_310 P = class_310.method_1551();

    public static File C(String string) {
        File file = R.d();
        return new File(file, string);
    }

    public static File d() {
        File file = new File(R.P.field_1697.getPath() + File.separator + "frog");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }
}

