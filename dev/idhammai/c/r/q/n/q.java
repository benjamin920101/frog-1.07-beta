/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_1268
 *  net.minecraft.class_1297
 *  net.minecraft.class_1667
 *  net.minecraft.class_1683
 *  net.minecraft.class_1684
 *  net.minecraft.class_1753
 *  net.minecraft.class_1764
 *  net.minecraft.class_1771
 *  net.minecraft.class_1776
 *  net.minecraft.class_1779
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_1803
 *  net.minecraft.class_1823
 *  net.minecraft.class_1828
 *  net.minecraft.class_1835
 *  net.minecraft.class_1890
 *  net.minecraft.class_1893
 *  net.minecraft.class_2246
 *  net.minecraft.class_2338
 *  net.minecraft.class_238
 *  net.minecraft.class_239$class_240
 *  net.minecraft.class_243
 *  net.minecraft.class_3532
 *  net.minecraft.class_3959
 *  net.minecraft.class_3959$class_242
 *  net.minecraft.class_3959$class_3960
 *  net.minecraft.class_3965
 *  net.minecraft.class_4587
 *  net.minecraft.class_6880
 */
package dev.idhammai.c.r.q.n;

import com.mojang.blaze3d.systems.RenderSystem;
import dev.idhammai.Frog;
import dev.idhammai.P.A.S.K;
import dev.idhammai.P.A.S.f;
import dev.idhammai.c.r.O.Y.A;
import dev.idhammai.c.r.q.i.u;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import java.awt.Color;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1667;
import net.minecraft.class_1683;
import net.minecraft.class_1684;
import net.minecraft.class_1753;
import net.minecraft.class_1764;
import net.minecraft.class_1771;
import net.minecraft.class_1776;
import net.minecraft.class_1779;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1803;
import net.minecraft.class_1823;
import net.minecraft.class_1828;
import net.minecraft.class_1835;
import net.minecraft.class_1890;
import net.minecraft.class_1893;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_4587;
import net.minecraft.class_6880;

public class q
extends y {
    static class_4587 t;
    private final A a = this.y(new A("Hand", new Color(255, 255, 255, 255)).P("\u624b\u6301\u9884\u6d4b").t(true));
    private final A s = this.y(new A("Pearl", new Color(255, 255, 255, 255)).P("\u73cd\u73e0\u8f68\u8ff9").t(true));
    private final A N = this.y(new A("Arrow", new Color(255, 255, 255, 255)).P("\u7bad\u77e2\u8f68\u8ff9").t(true));
    private final A C = this.y(new A("XP", new Color(255, 255, 255, 255)).P("\u7ecf\u9a8c\u74f6\u8f68\u8ff9").t(true));

    public q() {
        super("Trajectories", w.Render);
        this.L("\u629b\u7269\u7ebf\u9884\u6d4b");
    }

    @Override
    public void h(class_4587 class_45872) {
        if (q.M()) {
            return;
        }
        t = class_45872;
        if (this.s.i || this.N.i || this.C.i) {
            RenderSystem.disableDepthTest();
            for (class_1297 class_12972 : Frog.THREAD.z()) {
                if (class_12972 instanceof class_1684 && this.s.i) {
                    this.b(class_12972, this.s.P());
                }
                if (class_12972 instanceof class_1667 && this.N.i) {
                    this.b(class_12972, this.N.P());
                }
                if (!(class_12972 instanceof class_1683) || !this.C.i) continue;
                this.b(class_12972, this.C.P());
            }
            RenderSystem.enableDepthTest();
        }
        if (this.a.i) {
            class_1268 class_12682;
            class_1297 class_12972;
            if (!q.W.field_1690.method_31044().method_31034()) {
                return;
            }
            class_12972 = q.W.field_1724.method_6047();
            class_1799 class_17992 = q.W.field_1724.method_6079();
            if (class_12972.method_7909() instanceof class_1753 || class_12972.method_7909() instanceof class_1764 || this.g(class_12972.method_7909()) || u.j.p()) {
                class_12682 = class_1268.field_5808;
            } else if (class_17992.method_7909() instanceof class_1753 || class_17992.method_7909() instanceof class_1764 || this.g(class_17992.method_7909())) {
                class_12682 = class_1268.field_5810;
            } else {
                return;
            }
            RenderSystem.disableDepthTest();
            boolean bl = (Boolean)q.W.field_1690.method_42448().method_41753();
            q.W.field_1690.method_42448().method_41748((Object)false);
            double d2 = dev.idhammai.P.A.A.A.Z(q.W.field_1724.field_6014, q.W.field_1724.method_23317(), W.method_60646().method_60637(true));
            double d3 = dev.idhammai.P.A.A.A.Z(q.W.field_1724.field_6036, q.W.field_1724.method_23318(), W.method_60646().method_60637(true));
            double d4 = dev.idhammai.P.A.A.A.Z(q.W.field_1724.field_5969, q.W.field_1724.method_23321(), W.method_60646().method_60637(true));
            if (class_17992.method_7909() instanceof class_1764 && class_1890.method_8225((class_6880)((class_6880)q.W.field_1687.method_30349().method_30530(class_1893.field_9108.method_58273()).method_40264(class_1893.field_9108).get()), (class_1799)class_17992) != 0 || class_12972.method_7909() instanceof class_1764 && class_1890.method_8225((class_6880)((class_6880)q.W.field_1687.method_30349().method_30530(class_1893.field_9108.method_58273()).method_40264(class_1893.field_9108).get()), (class_1799)class_12972) != 0) {
                this.N(class_12682 == class_1268.field_5810 ? class_17992.method_7909() : class_12972.method_7909(), q.W.field_1724.method_36454() - 10.0f, d2, d3, d4);
                this.N(class_12682 == class_1268.field_5810 ? class_17992.method_7909() : class_12972.method_7909(), q.W.field_1724.method_36454(), d2, d3, d4);
                this.N(class_12682 == class_1268.field_5810 ? class_17992.method_7909() : class_12972.method_7909(), q.W.field_1724.method_36454() + 10.0f, d2, d3, d4);
            } else {
                this.N(class_12682 == class_1268.field_5810 ? class_17992.method_7909() : class_12972.method_7909(), q.W.field_1724.method_36454(), d2, d3, d4);
            }
            q.W.field_1690.method_42448().method_41748((Object)bl);
            RenderSystem.enableDepthTest();
        }
    }

    private void b(class_1297 class_12972, Color color) {
        double d2 = class_12972.method_18798().field_1352;
        double d3 = class_12972.method_18798().field_1351;
        double d4 = class_12972.method_18798().field_1350;
        if (d2 == 0.0 && d3 == 0.0 && d4 == 0.0) {
            return;
        }
        double d5 = class_12972.method_23317();
        double d6 = class_12972.method_23318();
        double d7 = class_12972.method_23321();
        for (int i2 = 0; i2 < 300; ++i2) {
            class_243 class_2432 = new class_243(d5, d6, d7);
            if (q.W.field_1687.method_8320(new class_2338((int)(d5 += d2), (int)(d6 += d3), (int)(d7 += d4))).method_26204() == class_2246.field_10382) {
                d2 *= 0.8;
                d3 *= 0.8;
                d4 *= 0.8;
            } else {
                d2 *= 0.99;
                d3 *= 0.99;
                d4 *= 0.99;
            }
            d3 = class_12972 instanceof class_1667 ? (d3 = d3 - (double)0.05f) : (d3 = d3 - (double)0.03f);
            class_243 class_2433 = new class_243(d5, d6, d7);
            if (q.W.field_1687.method_17742(new class_3959(class_2432, class_2433, class_3959.class_3960.field_17559, class_3959.class_242.field_1348, (class_1297)q.W.field_1724)) != null && (q.W.field_1687.method_17742(new class_3959(class_2432, class_2433, class_3959.class_3960.field_17559, class_3959.class_242.field_1348, (class_1297)q.W.field_1724)).method_17783() == class_239.class_240.field_1331 || q.W.field_1687.method_17742(new class_3959(class_2432, class_2433, class_3959.class_3960.field_17559, class_3959.class_242.field_1348, (class_1297)q.W.field_1724)).method_17783() == class_239.class_240.field_1332) || d6 <= -65.0) break;
            int n2 = (int)dev.idhammai.P.A.A.A.p(255.0f * ((float)(i2 + 1) / 10.0f), 0.0f, 255.0f);
            K.I(class_2432, class_2433, f.y(color, n2));
        }
    }

    private void N(class_1792 class_17922, float f2, double d2, double d3, double d4) {
        d3 = d3 + (double)q.W.field_1724.method_18381(q.W.field_1724.method_18376()) - 0.1000000014901161;
        if (class_17922 == q.W.field_1724.method_6047().method_7909()) {
            d2 -= (double)(class_3532.method_15362((float)(f2 / 180.0f * (float)Math.PI)) * 0.16f);
            d4 -= (double)(class_3532.method_15374((float)(f2 / 180.0f * (float)Math.PI)) * 0.16f);
        } else {
            d2 += (double)(class_3532.method_15362((float)(f2 / 180.0f * (float)Math.PI)) * 0.16f);
            d4 += (double)(class_3532.method_15374((float)(f2 / 180.0f * (float)Math.PI)) * 0.16f);
        }
        float f3 = this.X(class_17922);
        double d5 = -class_3532.method_15374((float)(f2 / 180.0f * (float)Math.PI)) * class_3532.method_15362((float)(q.W.field_1724.method_36455() / 180.0f * (float)Math.PI)) * f3;
        double d6 = -class_3532.method_15374((float)((q.W.field_1724.method_36455() - (float)this.V(class_17922)) / 180.0f * 3.141593f)) * f3;
        double d7 = class_3532.method_15362((float)(f2 / 180.0f * (float)Math.PI)) * class_3532.method_15362((float)(q.W.field_1724.method_36455() / 180.0f * (float)Math.PI)) * f3;
        float f4 = (float)q.W.field_1724.method_6048() / 20.0f;
        f4 = (f4 * f4 + f4 * 2.0f) / 3.0f;
        if (f4 > 1.0f) {
            f4 = 1.0f;
        }
        float f5 = class_3532.method_15355((float)((float)(d5 * d5 + d6 * d6 + d7 * d7)));
        d5 /= (double)f5;
        d6 /= (double)f5;
        d7 /= (double)f5;
        float f6 = (class_17922 instanceof class_1753 ? f4 * 2.0f : (class_17922 instanceof class_1764 ? 2.2f : 1.0f)) * this.G(class_17922);
        d5 *= (double)f6;
        d6 *= (double)f6;
        d7 *= (double)f6;
        d5 += q.W.field_1724.method_18798().method_10216();
        d6 += q.W.field_1724.method_18798().method_10214();
        d7 += q.W.field_1724.method_18798().method_10215();
        for (int i2 = 0; i2 < 300; ++i2) {
            class_3965 class_39652;
            class_243 class_2432 = new class_243(d2, d3, d4);
            if (q.W.field_1687.method_8320(new class_2338((int)(d2 += d5), (int)(d3 += d6), (int)(d4 += d7))).method_26204() == class_2246.field_10382) {
                d5 *= 0.8;
                d6 *= 0.8;
                d7 *= 0.8;
            } else {
                d5 *= 0.99;
                d6 *= 0.99;
                d7 *= 0.99;
            }
            d6 = class_17922 instanceof class_1753 ? (d6 = d6 - (double)0.05f) : (q.W.field_1724.method_6047().method_7909() instanceof class_1764 ? (d6 = d6 - (double)0.05f) : (d6 = d6 - (double)0.03f));
            class_243 class_2433 = new class_243(d2, d3, d4);
            for (class_1297 class_12972 : Frog.THREAD.z()) {
                if (class_12972 instanceof class_1667 || class_12972.equals((Object)q.W.field_1724) || !class_12972.method_5829().method_994(new class_238(d2 - 0.3, d3 - 0.3, d4 - 0.3, d2 + 0.3, d3 + 0.3, d4 + 0.3))) continue;
                K.N(t, class_12972.method_5829(), this.a.P());
                break;
            }
            if ((class_39652 = q.W.field_1687.method_17742(new class_3959(class_2432, class_2433, class_3959.class_3960.field_17559, class_3959.class_242.field_1348, (class_1297)q.W.field_1724))) != null && class_39652.method_17783() == class_239.class_240.field_1332) {
                K.N(t, new class_238(class_39652.method_17777()), this.a.P());
                break;
            }
            if (d3 <= -65.0) break;
            if (d5 == 0.0 && d6 == 0.0 && d7 == 0.0) continue;
            K.I(class_2432, class_2433, this.a.P());
        }
    }

    private boolean g(class_1792 class_17922) {
        return class_17922 instanceof class_1776 || class_17922 instanceof class_1835 || class_17922 instanceof class_1779 || class_17922 instanceof class_1823 || class_17922 instanceof class_1771 || class_17922 instanceof class_1828 || class_17922 instanceof class_1803;
    }

    private float X(class_1792 class_17922) {
        return class_17922 instanceof class_1753 ? 1.0f : 0.4f;
    }

    private float G(class_1792 class_17922) {
        if (class_17922 instanceof class_1828 || class_17922 instanceof class_1803) {
            return 0.5f;
        }
        if (class_17922 instanceof class_1779) {
            return 0.59f;
        }
        if (class_17922 instanceof class_1835) {
            return 2.0f;
        }
        return 1.5f;
    }

    private int V(class_1792 class_17922) {
        if (class_17922 instanceof class_1828 || class_17922 instanceof class_1803 || class_17922 instanceof class_1779) {
            return 20;
        }
        return 0;
    }
}

