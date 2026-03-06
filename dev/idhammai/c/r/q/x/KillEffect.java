/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityType
 *  net.minecraft.entity.LightningEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.world.World
 *  net.minecraft.sound.SoundEvents
 *  net.minecraft.sound.SoundCategory
 */
package dev.idhammai.c.r.q.x;

import dev.idhammai.P.A.A.A;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.N;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LightningEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.minecraft.sound.SoundEvents;
import net.minecraft.sound.SoundCategory;

public class g
extends y {
    private final W B = this.S(new W("Lightning", true).k("\u96f7\u7535\u6548\u679c"));
    private final W a = this.S(new W("LevelUp", true).k("\u5347\u7ea7\u97f3\u6548").D());
    private final l p = this.p(new l("LMaxPitch", 1.0, 0.0, 2.0, 0.1, this.a::f).D("\u5347\u7ea7\u6700\u9ad8\u97f3\u8c03"));
    private final l L = this.p(new l("LMinPitch", 1.0, 0.0, 2.0, 0.1, this.a::f).D("\u5347\u7ea7\u6700\u4f4e\u97f3\u8c03"));
    private final W H = this.S(new W("Trident", false).k("\u4e09\u53c9\u621f\u97f3\u6548").D());
    private final l Y = this.p(new l("TMaxPitch", 1.0, 0.0, 2.0, 0.1, this.H::f).D("\u4e09\u53c9\u621f\u6700\u9ad8\u97f3\u8c03"));
    private final l k = this.p(new l("TMinPitch", 1.0, 0.0, 2.0, 0.1, this.H::f).D("\u4e09\u53c9\u621f\u6700\u4f4e\u97f3\u8c03"));
    private final l b = this.p(new l("Factor", 1.0, 1.0, 10.0, 1.0).D("\u6548\u679c\u6b21\u6570"));

    public g() {
        super("KillEffect", w.Misc);
        this.L("\u51fb\u6740\u6548\u679c");
    }

    @r
    public void s(N n2) {
        if (g.M()) {
            return;
        }
        class_1657 class_16572 = n2.s();
        if (class_16572 == null) {
            return;
        }
        int n3 = 0;
        while ((double)n3 < this.b.e()) {
            this.s(class_16572);
            ++n3;
        }
    }

    private void s(class_1657 class_16572) {
        double d2 = class_16572.method_23317();
        double d3 = class_16572.method_23318();
        double d4 = class_16572.method_23321();
        if (this.B.h()) {
            class_1538 class_15382 = new class_1538(class_1299.field_6112, (class_1937)g.W.field_1687);
            class_15382.method_30634(d2, d3, d4);
            class_15382.method_24203(d2, d3, d4);
            g.W.field_1687.method_53875((class_1297)class_15382);
        }
        if (this.a.h()) {
            g.W.field_1687.method_43128((class_1657)g.W.field_1724, d2, d3, d4, class_3417.field_14709, class_3419.field_15248, 100.0f, A.t(this.L.Z(), this.p.Z()));
        }
        if (this.H.h()) {
            g.W.field_1687.method_60511((class_1657)g.W.field_1724, d2, d3, d4, class_3417.field_14896, class_3419.field_15250, 999.0f, A.t(this.k.Z(), this.Y.Z()));
        }
    }
}

