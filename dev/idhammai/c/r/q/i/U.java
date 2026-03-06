/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.effect.StatusEffect
 *  net.minecraft.entity.effect.StatusEffects
 */
package dev.idhammai.c.r.q.i;

import dev.idhammai.P.A.J;
import dev.idhammai.P.A.L.e;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.v;
import dev.idhammai.c.r.q.i.h;
import dev.idhammai.c.r.y;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;

public class U {
    final h m;

    public U(h h2) {
        this.m = h2;
    }

    @r
    public void G(v v2) {
        if (y.M() || v2.C()) {
            return;
        }
        if (this.m.p.h() && !e.n()) {
            return;
        }
        if (J.W.field_1755 == null) {
            if (this.m.X.G()) {
                if (!this.m.I && this.m.K((class_1291)class_1294.field_5907.comp_349())) {
                    this.m.T((class_1291)class_1294.field_5907.comp_349());
                    this.m.I = true;
                    return;
                }
            } else {
                this.m.I = false;
            }
            if (this.m.w.G()) {
                if (!this.m.b && this.m.K((class_1291)class_1294.field_5910.comp_349())) {
                    this.m.T((class_1291)class_1294.field_5910.comp_349());
                    this.m.b = true;
                    return;
                }
            } else {
                this.m.b = false;
            }
            if (this.m.f.G()) {
                if (!this.m.l && this.m.K((class_1291)class_1294.field_5904.comp_349())) {
                    this.m.T((class_1291)class_1294.field_5904.comp_349());
                    this.m.l = true;
                }
            } else {
                this.m.l = false;
            }
        } else {
            this.m.l = false;
            this.m.I = false;
            this.m.b = false;
        }
    }
}

