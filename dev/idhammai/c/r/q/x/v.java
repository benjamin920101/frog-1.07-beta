/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_3414
 *  net.minecraft.class_3417
 */
package dev.idhammai.c.r.q.x;

import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.t;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import java.util.ArrayList;
import net.minecraft.class_3414;
import net.minecraft.class_3417;

public class v
extends y {
    static final ArrayList<class_3414> Z = new ArrayList();
    public static v p;
    private final W B = this.S(new W("ArmorEquip", true).k("\u62a4\u7532\u7a7f\u6234"));
    private final W T = this.S(new W("Explode", true).k("\u7206\u70b8"));
    private final W s = this.S(new W("Attack", true).k("\u653b\u51fb"));
    private final W I = this.S(new W("Teleport", true).k("\u4f20\u9001"));
    private final W X = this.S(new W("Throw", true).k("\u6295\u63b7"));
    private final W w = this.S(new W("Potion", true).k("\u836f\u6c34"));
    private final W u = this.S(new W("Elytra", true).k("\u9798\u7fc5"));

    public v() {
        super("NoSound", dev.idhammai.c.r.w.Misc);
        this.L("\u53bb\u9664\u58f0\u97f3");
        p = this;
    }

    @r
    public void e(t t2) {
        if (this.B.h()) {
            for (class_3414 class_34142 : Z) {
                if (t2.L.method_4775() != class_34142.method_14833()) continue;
                t2.L();
                return;
            }
        }
        if (this.T.h() && (t2.L.method_4775() == ((class_3414)class_3417.field_15152.comp_349()).method_14833() || t2.L.method_4775() == class_3417.field_14803.method_14833())) {
            t2.L();
            return;
        }
        if (this.s.h() && (t2.L.method_4775() == class_3417.field_14625.method_14833() || t2.L.method_4775() == class_3417.field_14999.method_14833() || t2.L.method_4775() == class_3417.field_14840.method_14833())) {
            t2.L();
        }
        if (this.I.h() && t2.L.method_4775() == class_3417.field_46945.method_14833()) {
            t2.L();
        }
        if (this.w.h() && t2.L.method_4775() == class_3417.field_14839.method_14833()) {
            t2.L();
        }
        if (this.u.h() && t2.L.method_4775() == class_3417.field_14572.method_14833()) {
            t2.L();
        }
        if (this.X.h() && (t2.L.method_4775() == class_3417.field_14757.method_14833() || t2.L.method_4775() == class_3417.field_15012.method_14833() || t2.L.method_4775() == class_3417.field_14637.method_14833() || t2.L.method_4775() == class_3417.field_14873.method_14833() || t2.L.method_4775() == class_3417.field_14910.method_14833())) {
            t2.L();
        }
    }

    static {
        Z.add((class_3414)class_3417.field_21866.comp_349());
        Z.add((class_3414)class_3417.field_14684.comp_349());
        Z.add((class_3414)class_3417.field_15191.comp_349());
        Z.add((class_3414)class_3417.field_14966.comp_349());
        Z.add((class_3414)class_3417.field_15103.comp_349());
        Z.add((class_3414)class_3417.field_14761.comp_349());
        Z.add((class_3414)class_3417.field_14862.comp_349());
        Z.add((class_3414)class_3417.field_14581.comp_349());
        Z.add((class_3414)class_3417.field_14883.comp_349());
    }
}

