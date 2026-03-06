/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1923
 *  net.minecraft.class_1937
 *  net.minecraft.class_1972
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_238
 *  net.minecraft.class_2382
 *  net.minecraft.class_243
 *  net.minecraft.class_2487
 *  net.minecraft.class_2626
 *  net.minecraft.class_2637
 *  net.minecraft.class_2672
 *  net.minecraft.class_2680
 *  net.minecraft.class_2814
 *  net.minecraft.class_2818
 *  net.minecraft.class_2826
 *  net.minecraft.class_2837
 *  net.minecraft.class_2841
 *  net.minecraft.class_3610
 *  net.minecraft.class_419
 *  net.minecraft.class_434
 *  net.minecraft.class_6880
 *  net.minecraft.class_7522
 *  net.minecraft.class_8590
 */
package dev.idhammai.c.r.q.Q;

import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.c.QO;
import dev.idhammai.P.r.c.R;
import dev.idhammai.P.r.c.b;
import dev.idhammai.P.r.c.i;
import dev.idhammai.P.r.c.k;
import dev.idhammai.c.r.O.Y.A;
import dev.idhammai.c.r.O.Y.B;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.q.Q.z;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import java.awt.Color;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import net.minecraft.class_1923;
import net.minecraft.class_1937;
import net.minecraft.class_1972;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_2382;
import net.minecraft.class_243;
import net.minecraft.class_2487;
import net.minecraft.class_2626;
import net.minecraft.class_2637;
import net.minecraft.class_2672;
import net.minecraft.class_2680;
import net.minecraft.class_2814;
import net.minecraft.class_2818;
import net.minecraft.class_2826;
import net.minecraft.class_2837;
import net.minecraft.class_2841;
import net.minecraft.class_3610;
import net.minecraft.class_419;
import net.minecraft.class_434;
import net.minecraft.class_6880;
import net.minecraft.class_7522;
import net.minecraft.class_8590;

public class M
extends y {
    private static final ExecutorService K = Executors.newCachedThreadPool();
    private static final class_2350[] L = new class_2350[]{class_2350.field_11034, class_2350.field_11043, class_2350.field_11039, class_2350.field_11035, class_2350.field_11036};
    private static final Set<class_2248> D = new HashSet<class_2248>();
    private static final Set<class_2248> p = new HashSet<class_2248>();
    private static final Set<class_2248> A = new HashSet<class_2248>();
    public static int B = 0;
    public static int H = 0;
    public static int C = 0;
    public static int t = 0;
    public static int a = 0;
    public final B<z> X = this.S(new B<z>("DetectMode", dev.idhammai.c.r.q.Q.z.Normal).I("\u68c0\u6d4b\u6a21\u5f0f").X(dev.idhammai.c.r.q.Q.z.Normal, "\u666e\u901a").X(dev.idhammai.c.r.q.Q.z.IgnoreBlockExploit, "\u5ffd\u7565\u65b9\u5757\u6f0f\u6d1e").X(dev.idhammai.c.r.q.Q.z.BlockExploitMode, "\u65b9\u5757\u6f0f\u6d1e\u6a21\u5f0f"));
    public final l d = this.p(new l("Chunks-Distance", 128, 6, 1024).D("\u6e32\u67d3\u533a\u5757\u8ddd\u79bb"));
    public final l Z = this.p(new l("RenderHeight", 0, -112, 319).D("\u6e32\u67d3\u9ad8\u5ea6"));
    final Set<class_1923> g = Collections.synchronizedSet(new HashSet());
    final Set<class_1923> U = Collections.synchronizedSet(new HashSet());
    final Set<class_1923> R = Collections.synchronizedSet(new HashSet());
    final Set<class_1923> y = Collections.synchronizedSet(new HashSet());
    final Set<class_1923> M = Collections.synchronizedSet(new HashSet());
    private final W c = this.S(new W("PaletteExploit", true).k("\u8c03\u8272\u677f\u6f0f\u6d1e"));
    private final W s = this.S(new W("BeingUpdated", true).k("\u66f4\u65b0\u4e2d\u68c0\u6d4b"));
    private final W I = this.S(new W("OverworldOldChunks", true).k("\u4e3b\u4e16\u754c\u65e7\u533a\u5757"));
    private final W T = this.S(new W("NetherOldChunks", true).k("\u4e0b\u754c\u65e7\u533a\u5757"));
    private final W N = this.S(new W("EndOldChunks", true).k("\u672b\u5730\u65e7\u533a\u5757"));
    private final W J = this.S(new W("LiquidExploit", false).k("\u6db2\u4f53\u6f0f\u6d1e"));
    private final W b = this.S(new W("blockUpdateExploit", false).k("\u65b9\u5757\u66f4\u65b0\u6f0f\u6d1e"));
    private final W G = this.S(new W("WorldLeaveRemove", true).k("\u79bb\u5f00\u4e16\u754c\u6e05\u9664"));
    private final W w = this.S(new W("RemoveRenderDist", false).k("\u8d85\u8ddd\u79fb\u9664"));
    private final A F = this.y(new A("New", new Color(255, 0, 0, 95)).P("\u65b0\u533a\u5757\u989c\u8272"));
    private final A V = this.y(new A("BlockExploit", new Color(0, 0, 255, 75)).P("\u65b9\u5757\u6f0f\u6d1e\u989c\u8272"));
    private final A P = this.y(new A("Old", new Color(0, 255, 0, 40)).P("\u65e7\u533a\u5757\u989c\u8272"));
    private final A Y = this.y(new A("BeingUpdated", new Color(0, 255, 0, 40)).P("\u66f4\u65b0\u4e2d\u989c\u8272"));
    private final A r = this.y(new A("OldVersion", new Color(190, 255, 0, 40)).P("\u65e7\u7248\u672c\u989c\u8272"));
    public int h = 0;
    private int e = 0;

    public M() {
        super("ChunkESP", dev.idhammai.c.r.w.Exploit);
        this.L("\u533a\u5757\u663e\u793a");
    }

    private void S() {
        this.h = 0;
        B = 0;
        H = 0;
        C = 0;
        t = 0;
        a = 0;
    }

    private void r() {
        this.g.clear();
        this.U.clear();
        this.R.clear();
        this.y.clear();
        this.M.clear();
    }

    @Override
    public void L() {
        this.h = 0;
    }

    @r
    private void L(b b2) {
        if (b2.q instanceof class_419) {
            this.S();
            if (this.G.h()) {
                this.r();
            }
        }
        if (b2.q instanceof class_434) {
            this.S();
        }
    }

    @r
    private void I(k k2) {
        this.S();
        if (this.G.h()) {
            this.r();
        }
    }

    @r
    public void C(QO qO) {
        if (dev.idhammai.c.r.q.Q.M.W.field_1724.method_6032() == 0.0f) {
            this.S();
        }
        if (this.X.X() == dev.idhammai.c.r.q.Q.z.Normal && this.b.h()) {
            if (this.e < 6) {
                ++this.e;
            }
            if (this.e == 5) {
                this.y("\u00a74BlockExploitMode RECOMMENDED. Required to determine false positives from the Block Exploit from the OldChunks.");
            }
        } else {
            this.e = 0;
        }
        if (this.w.h()) {
            this.f();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @r
    private void V(R r2) {
        Set<class_1923> set;
        Set<class_1923> set2 = set = this.g;
        synchronized (set2) {
            for (class_1923 class_19232 : this.g) {
                if (class_19232 == null || !W.method_1560().method_24515().method_19771((class_2382)class_19232.method_8323(), this.d.e() * 16.0)) continue;
                r2.g(new class_238(new class_243((double)class_19232.method_8323().method_10263(), (double)class_19232.method_8323().method_10264() + this.Z.e(), (double)class_19232.method_8323().method_10260()), new class_243((double)(class_19232.method_8323().method_10263() + 16), (double)class_19232.method_8323().method_10264() + this.Z.e(), (double)(class_19232.method_8323().method_10260() + 16))), this.F.P());
            }
        }
        set2 = set = this.M;
        synchronized (set2) {
            for (class_1923 class_19232 : this.M) {
                if (class_19232 == null || !W.method_1560().method_24515().method_19771((class_2382)class_19232.method_8323(), this.d.e() * 16.0)) continue;
                if (this.X.X() == dev.idhammai.c.r.q.Q.z.BlockExploitMode && this.b.h()) {
                    r2.g(new class_238(new class_243((double)class_19232.method_8323().method_10263(), (double)class_19232.method_8323().method_10264() + this.Z.e(), (double)class_19232.method_8323().method_10260()), new class_243((double)(class_19232.method_8323().method_10263() + 16), (double)class_19232.method_8323().method_10264() + this.Z.e(), (double)(class_19232.method_8323().method_10260() + 16))), this.V.P());
                    continue;
                }
                if (this.X.X() == dev.idhammai.c.r.q.Q.z.Normal && this.b.h()) {
                    r2.g(new class_238(new class_243((double)class_19232.method_8323().method_10263(), (double)class_19232.method_8323().method_10264() + this.Z.e(), (double)class_19232.method_8323().method_10260()), new class_243((double)(class_19232.method_8323().method_10263() + 16), (double)class_19232.method_8323().method_10264() + this.Z.e(), (double)(class_19232.method_8323().method_10260() + 16))), this.F.P());
                    continue;
                }
                if (this.X.X() == dev.idhammai.c.r.q.Q.z.IgnoreBlockExploit && this.b.h()) {
                    r2.g(new class_238(new class_243((double)class_19232.method_8323().method_10263(), (double)class_19232.method_8323().method_10264() + this.Z.e(), (double)class_19232.method_8323().method_10260()), new class_243((double)(class_19232.method_8323().method_10263() + 16), (double)class_19232.method_8323().method_10264() + this.Z.e(), (double)(class_19232.method_8323().method_10260() + 16))), this.P.P());
                    continue;
                }
                if (!(this.X.X() == dev.idhammai.c.r.q.Q.z.BlockExploitMode | this.X.X() == dev.idhammai.c.r.q.Q.z.Normal | this.X.X() == dev.idhammai.c.r.q.Q.z.IgnoreBlockExploit)) continue;
                r2.g(new class_238(new class_243((double)class_19232.method_8323().method_10263(), (double)class_19232.method_8323().method_10264() + this.Z.e(), (double)class_19232.method_8323().method_10260()), new class_243((double)(class_19232.method_8323().method_10263() + 16), (double)class_19232.method_8323().method_10264() + this.Z.e(), (double)(class_19232.method_8323().method_10260() + 16))), this.P.P());
            }
        }
        set2 = set = this.U;
        synchronized (set2) {
            for (class_1923 class_19232 : this.U) {
                if (class_19232 == null || !W.method_1560().method_24515().method_19771((class_2382)class_19232.method_8323(), this.d.e() * 16.0)) continue;
                r2.g(new class_238(new class_243((double)class_19232.method_8323().method_10263(), (double)class_19232.method_8323().method_10264() + this.Z.e(), (double)class_19232.method_8323().method_10260()), new class_243((double)(class_19232.method_8323().method_10263() + 16), (double)class_19232.method_8323().method_10264() + this.Z.e(), (double)(class_19232.method_8323().method_10260() + 16))), this.P.P());
            }
        }
        set2 = set = this.R;
        synchronized (set2) {
            for (class_1923 class_19232 : this.R) {
                if (class_19232 == null || !W.method_1560().method_24515().method_19771((class_2382)class_19232.method_8323(), this.d.e() * 16.0)) continue;
                r2.g(new class_238(new class_243((double)class_19232.method_8323().method_10263(), (double)class_19232.method_8323().method_10264() + this.Z.e(), (double)class_19232.method_8323().method_10260()), new class_243((double)(class_19232.method_8323().method_10263() + 16), (double)class_19232.method_8323().method_10264() + this.Z.e(), (double)(class_19232.method_8323().method_10260() + 16))), this.Y.P());
            }
        }
        set2 = set = this.y;
        synchronized (set2) {
            for (class_1923 class_19232 : this.y) {
                if (class_19232 == null || !W.method_1560().method_24515().method_19771((class_2382)class_19232.method_8323(), this.d.e() * 16.0)) continue;
                r2.g(new class_238(new class_243((double)class_19232.method_8323().method_10263(), (double)class_19232.method_8323().method_10264() + this.Z.e(), (double)class_19232.method_8323().method_10260()), new class_243((double)(class_19232.method_8323().method_10263() + 16), (double)class_19232.method_8323().method_10264() + this.Z.e(), (double)(class_19232.method_8323().method_10260() + 16))), this.r.P());
            }
        }
    }

    @r
    private void k(i i2) {
        block86: {
            class_2637 class_26372;
            class_2672 class_26722;
            block87: {
                block85: {
                    if (i2.L() instanceof class_8590) {
                        return;
                    }
                    class_26722 = i2.L();
                    if (!(class_26722 instanceof class_2637)) break block85;
                    class_26372 = (class_2637)class_26722;
                    if (!this.J.h()) break block85;
                    class_26372.method_30621(this::lambda$onReadPacket$0);
                    break block86;
                }
                class_26722 = i2.L();
                if (!(class_26722 instanceof class_2626)) break block87;
                class_26372 = (class_2626)class_26722;
                class_1923 class_19232 = new class_1923(class_26372.method_11309());
                if (this.b.h()) {
                    try {
                        if (!(this.y.contains(class_19232) || this.R.contains(class_19232) || this.M.contains(class_19232) || this.U.contains(class_19232) || this.g.contains(class_19232))) {
                            this.M.add(class_19232);
                        }
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                    }
                }
                if (class_26372.method_11308().method_26227().method_15769() || class_26372.method_11308().method_26227().method_15771() || !this.J.h()) break block86;
                for (class_2350 class_23502 : L) {
                    try {
                        if (!dev.idhammai.c.r.q.Q.M.W.field_1687.method_8320(class_26372.method_11309().method_10093(class_23502)).method_26227().method_15771() || this.y.contains(class_19232) || this.R.contains(class_19232) || this.g.contains(class_19232) || this.U.contains(class_19232)) continue;
                        this.M.remove(class_19232);
                        this.g.add(class_19232);
                        return;
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                    }
                }
                break block86;
            }
            if (i2.L() instanceof class_2672) {
                class_26722 = (class_2672)i2.L();
                if (dev.idhammai.c.r.q.Q.M.W.field_1687 != null) {
                    class_26372 = new class_1923(class_26722.method_11523(), class_26722.method_11524());
                    if (dev.idhammai.c.r.q.Q.M.W.field_1687.method_2935().method_12246(class_26722.method_11523(), class_26722.method_11524()) == null) {
                        int n2;
                        int n3;
                        class_2826 class_28262;
                        class_7522 class_75222;
                        int n4;
                        int n5;
                        int n6;
                        class_2826 class_28263;
                        int n7;
                        class_2818 class_28182 = new class_2818((class_1937)dev.idhammai.c.r.q.Q.M.W.field_1687, (class_1923)class_26372);
                        try {
                            CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(() -> M.lambda$onReadPacket$1(class_28182, class_26722), K);
                            completableFuture.join();
                        }
                        catch (CompletionException completionException) {
                            completionException.printStackTrace();
                        }
                        int n8 = 0;
                        boolean bl = false;
                        boolean bl2 = false;
                        boolean bl3 = false;
                        boolean bl4 = false;
                        boolean bl5 = false;
                        class_2826[] class_2826Array = class_28182.method_12006();
                        if (this.I.h() && dev.idhammai.c.r.q.Q.M.W.field_1687.method_27983() == class_1937.field_25179) {
                            for (n7 = 0; n7 < 17; ++n7) {
                                class_28263 = class_2826Array[n7];
                                if (class_28263 == null || class_28263.method_38292()) continue;
                                for (n6 = 0; n6 < 16; ++n6) {
                                    block21: for (n5 = 0; n5 < 16; ++n5) {
                                        for (n4 = 0; n4 < 16; ++n4) {
                                            if (!bl3 && D.contains(class_28263.method_12254(n6, n5, n4).method_26204())) {
                                                bl3 = true;
                                            }
                                            if (bl4 || !p.contains(class_28263.method_12254(n6, n5, n4).method_26204())) continue;
                                            bl4 = true;
                                            continue block21;
                                        }
                                    }
                                }
                            }
                            if (bl3 && !bl4) {
                                bl = true;
                            }
                        }
                        if (this.T.h() && dev.idhammai.c.r.q.Q.M.W.field_1687.method_27983() == class_1937.field_25180) {
                            for (n7 = 0; n7 < 8; ++n7) {
                                class_28263 = class_2826Array[n7];
                                if (class_28263 == null || class_28263.method_38292()) continue;
                                for (n6 = 0; n6 < 16; ++n6) {
                                    block25: for (n5 = 0; n5 < 16; ++n5) {
                                        for (n4 = 0; n4 < 16; ++n4) {
                                            if (bl5 || !A.contains(class_28263.method_12254(n6, n5, n4).method_26204())) continue;
                                            bl5 = true;
                                            continue block25;
                                        }
                                    }
                                }
                            }
                            if (!bl && !bl5) {
                                bl = true;
                            }
                        }
                        if (this.N.h() && dev.idhammai.c.r.q.Q.M.W.field_1687.method_27983() == class_1937.field_25181 && (class_75222 = (class_28262 = class_28182.method_38259(0)).method_38294()) instanceof class_2841) {
                            class_2841 class_28412 = (class_2841)class_75222;
                            class_2837 class_28372 = class_28412.field_34560.comp_119();
                            for (n3 = 0; n3 < class_28372.method_12197(); ++n3) {
                                if (((class_6880)class_28372.method_12288(n3)).method_40230().get() != class_1972.field_9411) continue;
                                bl = true;
                                break;
                            }
                        }
                        if (this.c.h()) {
                            boolean bl6;
                            int n9;
                            block83: {
                                n9 = 1;
                                bl6 = false;
                                n2 = 0;
                                int n10 = 0;
                                int n11 = 0;
                                try {
                                    for (n3 = 0; n3 < 8; ++n3) {
                                        class_7522 class_75223;
                                        int n12;
                                        class_2837 class_28373;
                                        class_2841 class_28413;
                                        class_2826 class_28264 = class_2826Array[n3];
                                        if (class_28264 == null) continue;
                                        int n13 = 0;
                                        int n14 = 0;
                                        if (!class_28264.method_38292()) {
                                            class_28413 = class_28264.method_12265();
                                            class_28373 = class_28413.field_34560.comp_119();
                                            n12 = class_28373.method_12197();
                                            if (class_28373 instanceof class_2814) {
                                                int n15;
                                                HashSet<class_2680> hashSet = new HashSet<class_2680>();
                                                for (n15 = 0; n15 < 16; ++n15) {
                                                    for (int i3 = 0; i3 < 16; ++i3) {
                                                        for (int i4 = 0; i4 < 16; ++i4) {
                                                            hashSet.add((class_2680)class_28413.method_12321(n15, i3, i4));
                                                        }
                                                    }
                                                }
                                                n15 = hashSet.size();
                                                if (n15 <= 1) {
                                                    n15 = n12;
                                                }
                                                if (n15 < n12) {
                                                    n13 = 2;
                                                    ++n10;
                                                }
                                            }
                                            for (int i5 = 0; i5 < n12; ++i5) {
                                                class_2680 class_26802 = (class_2680)class_28373.method_12288(i5);
                                                if (i5 == 0 && n2 == 0 && class_26802.method_26204() == class_2246.field_10124 && dev.idhammai.c.r.q.Q.M.W.field_1687.method_27983() != class_1937.field_25181) {
                                                    bl6 = true;
                                                }
                                                if (i5 == 0 && class_26802.method_26204() == class_2246.field_10124 && dev.idhammai.c.r.q.Q.M.W.field_1687.method_27983() != class_1937.field_25180 && dev.idhammai.c.r.q.Q.M.W.field_1687.method_27983() != class_1937.field_25181) {
                                                    ++n13;
                                                }
                                                if (i5 == 1 && (class_26802.method_26204() == class_2246.field_10382 || class_26802.method_26204() == class_2246.field_10340 || class_26802.method_26204() == class_2246.field_10219 || class_26802.method_26204() == class_2246.field_10491) && dev.idhammai.c.r.q.Q.M.W.field_1687.method_27983() != class_1937.field_25180 && dev.idhammai.c.r.q.Q.M.W.field_1687.method_27983() != class_1937.field_25181) {
                                                    ++n13;
                                                }
                                                if (i5 == 2 && (class_26802.method_26204() == class_2246.field_10491 || class_26802.method_26204() == class_2246.field_10566 || class_26802.method_26204() == class_2246.field_27879) && dev.idhammai.c.r.q.Q.M.W.field_1687.method_27983() != class_1937.field_25180 && dev.idhammai.c.r.q.Q.M.W.field_1687.method_27983() != class_1937.field_25181) {
                                                    ++n13;
                                                }
                                                if (n2 == 4 && class_26802.method_26204() == class_2246.field_9987 && dev.idhammai.c.r.q.Q.M.W.field_1687.method_27983() != class_1937.field_25180 && dev.idhammai.c.r.q.Q.M.W.field_1687.method_27983() != class_1937.field_25181 && !bl2 && this.s.h()) {
                                                    bl2 = true;
                                                }
                                                if (class_26802.method_26204() != class_2246.field_10124 || dev.idhammai.c.r.q.Q.M.W.field_1687.method_27983() != class_1937.field_25180 && dev.idhammai.c.r.q.Q.M.W.field_1687.method_27983() != class_1937.field_25181) continue;
                                                ++n14;
                                            }
                                            if (n14 >= 2) {
                                                ++n11;
                                            }
                                            if (n13 >= 2) {
                                                ++n10;
                                            }
                                        }
                                        if (dev.idhammai.c.r.q.Q.M.W.field_1687.method_27983() == class_1937.field_25181 && (class_75223 = class_28264.method_38294()) instanceof class_2841) {
                                            class_28413 = (class_2841)class_75223;
                                            class_28373 = class_28413.field_34560.comp_119();
                                            for (n12 = 0; n12 < class_28373.method_12197(); ++n12) {
                                                if (n12 == 0 && ((class_6880)class_28373.method_12288(n12)).method_40230().get() == class_1972.field_9451) {
                                                    n8 = 1;
                                                }
                                                if (n8 != 0 || n12 != 0 || ((class_6880)class_28373.method_12288(n12)).method_40230().get() == class_1972.field_9411) continue;
                                                n8 = 0;
                                            }
                                        }
                                        if (class_28264.method_38292()) continue;
                                        ++n2;
                                    }
                                    if (n2 > 0) {
                                        if (this.s.h() && (dev.idhammai.c.r.q.Q.M.W.field_1687.method_27983() == class_1937.field_25180 || dev.idhammai.c.r.q.Q.M.W.field_1687.method_27983() == class_1937.field_25181)) {
                                            double d2 = (double)n11 / (double)n2 * 100.0;
                                            if (d2 >= 25.0) {
                                                bl2 = true;
                                            }
                                        } else if (dev.idhammai.c.r.q.Q.M.W.field_1687.method_27983() != class_1937.field_25180 && dev.idhammai.c.r.q.Q.M.W.field_1687.method_27983() != class_1937.field_25181) {
                                            double d3;
                                            double d4 = (double)n10 / (double)n2 * 100.0;
                                            if (d3 >= 65.0) {
                                                n8 = 1;
                                            }
                                        }
                                    }
                                }
                                catch (Exception exception) {
                                    double d5;
                                    double d6;
                                    if (this.s.h() && (dev.idhammai.c.r.q.Q.M.W.field_1687.method_27983() == class_1937.field_25180 || dev.idhammai.c.r.q.Q.M.W.field_1687.method_27983() == class_1937.field_25181) && (d6 = (double)n11 / (double)n2 * 100.0) >= 25.0) {
                                        bl2 = true;
                                    }
                                    if (dev.idhammai.c.r.q.Q.M.W.field_1687.method_27983() == class_1937.field_25180 || dev.idhammai.c.r.q.Q.M.W.field_1687.method_27983() == class_1937.field_25181 || !((d5 = (double)n10 / (double)n2 * 100.0) >= 65.0)) break block83;
                                    n8 = 1;
                                }
                            }
                            if (bl6) {
                                n8 = 1;
                            }
                            int n16 = dev.idhammai.c.r.q.Q.M.W.field_1687.method_27983() == class_1937.field_25181 ? n8 : (n2 = (n9 = !bl ? 1 : 0));
                            if (n8 != 0 && !bl2 && n9 != 0) {
                                try {
                                    if (!(this.y.contains(class_26372) || this.R.contains(class_26372) || this.M.contains(class_26372) || this.U.contains(class_26372) || this.g.contains(class_26372))) {
                                        this.g.add((class_1923)class_26372);
                                        return;
                                    }
                                }
                                catch (Exception exception) {
                                    exception.printStackTrace();
                                }
                            } else if (n8 == 0 && !bl2 && bl) {
                                try {
                                    if (!(this.y.contains(class_26372) || this.R.contains(class_26372) || this.U.contains(class_26372) || this.M.contains(class_26372) || this.g.contains(class_26372))) {
                                        this.y.add((class_1923)class_26372);
                                        return;
                                    }
                                }
                                catch (Exception exception) {
                                    exception.printStackTrace();
                                }
                            } else if (bl2) {
                                try {
                                    if (!(this.y.contains(class_26372) || this.R.contains(class_26372) || this.U.contains(class_26372) || this.M.contains(class_26372) || this.g.contains(class_26372))) {
                                        this.R.add((class_1923)class_26372);
                                        return;
                                    }
                                }
                                catch (Exception exception) {
                                    exception.printStackTrace();
                                }
                            } else if (n8 == 0) {
                                try {
                                    if (!(this.y.contains(class_26372) || this.R.contains(class_26372) || this.M.contains(class_26372) || this.U.contains(class_26372) || this.g.contains(class_26372))) {
                                        this.U.add((class_1923)class_26372);
                                        return;
                                    }
                                }
                                catch (Exception exception) {
                                    exception.printStackTrace();
                                }
                            }
                        }
                        if (this.J.h()) {
                            for (int i6 = 0; i6 < 16; ++i6) {
                                for (int i7 = dev.idhammai.c.r.q.Q.M.W.field_1687.method_31607(); i7 < dev.idhammai.c.r.q.Q.M.W.field_1687.method_31600(); ++i7) {
                                    for (n2 = 0; n2 < 16; ++n2) {
                                        class_3610 class_36102 = class_28182.method_12234(i6, i7, n2);
                                        try {
                                            if (this.y.contains(class_26372) || this.R.contains(class_26372) || this.U.contains(class_26372) || this.M.contains(class_26372) || this.g.contains(class_26372) || class_36102.method_15769() || class_36102.method_15771()) continue;
                                            this.U.add((class_1923)class_26372);
                                            return;
                                        }
                                        catch (Exception exception) {
                                            exception.printStackTrace();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private void f() {
        class_2338 class_23382 = W.method_1560().method_24515();
        double d2 = this.d.e() * 16.0;
        this.A(this.g, class_23382, d2);
        this.A(this.U, class_23382, d2);
        this.A(this.R, class_23382, d2);
        this.A(this.y, class_23382, d2);
        this.A(this.M, class_23382, d2);
    }

    private void A(Set<class_1923> set, class_2338 class_23382, double d2) {
        set.removeIf(arg_0 -> M.lambda$removeChunksOutsideRenderDistance$2(class_23382, d2, arg_0));
    }

    private static boolean lambda$removeChunksOutsideRenderDistance$2(class_2338 class_23382, double d2, class_1923 class_19232) {
        return !class_23382.method_19771((class_2382)class_19232.method_8323(), d2);
    }

    private static void lambda$onReadPacket$1(class_2818 class_28182, class_2672 class_26722) {
        class_28182.method_12224(class_26722.method_38598().method_38586(), new class_2487(), class_26722.method_38598().method_38587(class_26722.method_11523(), class_26722.method_11524()));
    }

    private void lambda$onReadPacket$0(class_2338 class_23382, class_2680 class_26802) {
        class_1923 class_19232 = new class_1923(class_23382);
        if (!class_26802.method_26227().method_15769() && !class_26802.method_26227().method_15771()) {
            for (class_2350 class_23502 : L) {
                try {
                    if (!(!dev.idhammai.c.r.q.Q.M.W.field_1687.method_8320(class_23382.method_10093(class_23502)).method_26227().method_15771() || this.y.contains(class_19232) || this.R.contains(class_19232) || this.g.contains(class_19232) || this.U.contains(class_19232))) {
                        this.M.remove(class_19232);
                        this.g.add(class_19232);
                        return;
                    }
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }
    }

    static {
        D.add(class_2246.field_10418);
        D.add(class_2246.field_29219);
        D.add(class_2246.field_27120);
        D.add(class_2246.field_29221);
        D.add(class_2246.field_10212);
        D.add(class_2246.field_29027);
        D.add(class_2246.field_10571);
        D.add(class_2246.field_29026);
        D.add(class_2246.field_10090);
        D.add(class_2246.field_29028);
        D.add(class_2246.field_10442);
        D.add(class_2246.field_29029);
        D.add(class_2246.field_10080);
        D.add(class_2246.field_29030);
        D.add(class_2246.field_10013);
        D.add(class_2246.field_29220);
        p.add(class_2246.field_28888);
        p.add(class_2246.field_27159);
        p.add(class_2246.field_27160);
        p.add(class_2246.field_28678);
        p.add(class_2246.field_28679);
        p.add(class_2246.field_28682);
        p.add(class_2246.field_28683);
        p.add(class_2246.field_28684);
        p.add(class_2246.field_28675);
        p.add(class_2246.field_28676);
        p.add(class_2246.field_28677);
        p.add(class_2246.field_27120);
        p.add(class_2246.field_29221);
        p.add(class_2246.field_29027);
        p.add(class_2246.field_29219);
        p.add(class_2246.field_29030);
        p.add(class_2246.field_29220);
        p.add(class_2246.field_29026);
        p.add(class_2246.field_29028);
        p.add(class_2246.field_29029);
        p.add(class_2246.field_28411);
        p.add(class_2246.field_33509);
        p.add(class_2246.field_33508);
        p.add(class_2246.field_28049);
        p.add(class_2246.field_28681);
        p.add(class_2246.field_28680);
        p.add(class_2246.field_28048);
        p.add(class_2246.field_29032);
        p.add(class_2246.field_27165);
        p.add(class_2246.field_27114);
        p.add(class_2246.field_28686);
        p.add(class_2246.field_28685);
        p.add(class_2246.field_28673);
        p.add(class_2246.field_28674);
        p.add(class_2246.field_27879);
        A.add(class_2246.field_22109);
        A.add(class_2246.field_22091);
        A.add(class_2246.field_23869);
        A.add(class_2246.field_23880);
        A.add(class_2246.field_23874);
        A.add(class_2246.field_22118);
        A.add(class_2246.field_22120);
        A.add(class_2246.field_23077);
        A.add(class_2246.field_22113);
        A.add(class_2246.field_22111);
        A.add(class_2246.field_23078);
        A.add(class_2246.field_22123);
        A.add(class_2246.field_10166);
        A.add(class_2246.field_23985);
        A.add(class_2246.field_10540);
        A.add(class_2246.field_22423);
        A.add(class_2246.field_22090);
        A.add(class_2246.field_22089);
    }
}

