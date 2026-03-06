/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  net.minecraft.class_1058
 *  net.minecraft.class_1087
 *  net.minecraft.class_2350
 *  net.minecraft.class_2680
 *  net.minecraft.class_5819
 *  net.minecraft.class_777
 *  net.minecraft.class_806
 *  net.minecraft.class_809
 *  org.jetbrains.annotations.Nullable
 */
package dev.idhammai.P.A.S;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_1058;
import net.minecraft.class_1087;
import net.minecraft.class_2350;
import net.minecraft.class_2680;
import net.minecraft.class_5819;
import net.minecraft.class_777;
import net.minecraft.class_806;
import net.minecraft.class_809;
import org.jetbrains.annotations.Nullable;

public class X
implements class_1087 {
    private class_1087 K;
    private final List<class_777> t = new ArrayList<class_777>();

    public void t(class_1087 class_10872) {
        this.K = class_10872;
    }

    private boolean w(class_2350 class_23502) {
        return class_23502 == class_2350.field_11035;
    }

    public List<class_777> method_4707(@Nullable class_2680 class_26802, @Nullable class_2350 class_23502, class_5819 class_58192) {
        if (class_23502 != null) {
            return this.w(class_23502) ? this.K.method_4707(class_26802, class_23502, class_58192) : ImmutableList.of();
        }
        this.t.clear();
        List list = this.K.method_4707(class_26802, null, class_58192);
        for (class_777 class_7772 : list) {
            if (!this.w(class_7772.method_3358())) continue;
            this.t.add(class_7772);
        }
        return this.t;
    }

    public boolean method_4708() {
        return this.K.method_4708();
    }

    public boolean method_4712() {
        return this.K.method_4712();
    }

    public boolean method_24304() {
        return this.K.method_24304();
    }

    public boolean method_4713() {
        return this.K.method_4713();
    }

    public class_1058 method_4711() {
        return this.K.method_4711();
    }

    public class_809 method_4709() {
        return this.K.method_4709();
    }

    public class_806 method_4710() {
        return this.K.method_4710();
    }
}

