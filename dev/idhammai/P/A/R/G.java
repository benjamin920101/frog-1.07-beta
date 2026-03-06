/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.CactusBlock
 *  net.minecraft.block.ChestBlock
 *  net.minecraft.block.EnderChestBlock
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.block.FenceBlock
 *  net.minecraft.block.PaneBlock
 *  net.minecraft.block.SlabBlock
 *  net.minecraft.block.SkullBlock
 *  net.minecraft.block.StainedGlassBlock
 *  net.minecraft.block.StairsBlock
 *  net.minecraft.block.TrapdoorBlock
 *  net.minecraft.block.WallBlock
 *  net.minecraft.block.PistonBlock
 *  net.minecraft.block.PistonExtensionBlock
 *  net.minecraft.block.PistonHeadBlock
 */
package dev.idhammai.P.A.R;

import dev.idhammai.P.A.J;
import dev.idhammai.P.A.R.c;
import dev.idhammai.P.A.R.g;
import dev.idhammai.P.A.R.n;
import java.util.ArrayList;
import net.minecraft.block.CactusBlock;
import net.minecraft.block.ChestBlock;
import net.minecraft.block.EnderChestBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.PaneBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SkullBlock;
import net.minecraft.block.StainedGlassBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.TrapdoorBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.block.PistonBlock;
import net.minecraft.block.PistonExtensionBlock;
import net.minecraft.block.PistonHeadBlock;

public class G
implements J {
    private static final n[] e = new n[]{new n(1.0, 0.0, 0.0), new n(-1.0, 0.0, 0.0), new n(0.0, 0.0, 1.0), new n(0.0, 0.0, -1.0)};
    private final n E;
    private final n S;
    private final ArrayList<c> R = new ArrayList();
    private final ArrayList<c> a = new ArrayList();
    private ArrayList<n> T = new ArrayList();

    public G(n n2, n n3) {
        this.E = n2.T(0.0, 0.0, 0.0).R();
        this.S = n3.T(0.0, 0.0, 0.0).R();
    }

    public static boolean t(n n2, boolean bl) {
        return G.a((int)n2.w(), (int)n2.M(), (int)n2.j(), bl);
    }

    public static boolean a(int n2, int n3, int n4, boolean bl) {
        class_2338 class_23382 = new class_2338(n2, n3, n4);
        class_2338 class_23383 = new class_2338(n2, n3 + 1, n4);
        class_2338 class_23384 = new class_2338(n2, n3 - 1, n4);
        return !G.u(class_23382) && !G.u(class_23383) && (G.u(class_23384) || !bl) && G.U(class_23384);
    }

    private static boolean u(class_2338 class_23382) {
        return G.W.field_1687.method_8320((class_2338)class_23382).field_23166 != null && G.W.field_1687.method_8320((class_2338)class_23382).field_23166.field_20337 || G.W.field_1687.method_8320(class_23382).method_26204() instanceof class_2482 || G.W.field_1687.method_8320(class_23382).method_26204() instanceof class_2510 || G.W.field_1687.method_8320(class_23382).method_26204() instanceof class_2266 || G.W.field_1687.method_8320(class_23382).method_26204() instanceof class_2281 || G.W.field_1687.method_8320(class_23382).method_26204() instanceof class_2336 || G.W.field_1687.method_8320(class_23382).method_26204() instanceof class_2484 || G.W.field_1687.method_8320(class_23382).method_26204() instanceof class_2389 || G.W.field_1687.method_8320(class_23382).method_26204() instanceof class_2354 || G.W.field_1687.method_8320(class_23382).method_26204() instanceof class_2544 || G.W.field_1687.method_8320(class_23382).method_26204() instanceof class_2506 || G.W.field_1687.method_8320(class_23382).method_26204() instanceof class_2665 || G.W.field_1687.method_8320(class_23382).method_26204() instanceof class_2667 || G.W.field_1687.method_8320(class_23382).method_26204() instanceof class_2671 || G.W.field_1687.method_8320(class_23382).method_26204() instanceof class_2506 || G.W.field_1687.method_8320(class_23382).method_26204() instanceof class_2533;
    }

    private static boolean U(class_2338 class_23382) {
        return !(G.W.field_1687.method_8320(class_23382).method_26204() instanceof class_2354) && !(G.W.field_1687.method_8320(class_23382).method_26204() instanceof class_2544);
    }

    public ArrayList<n> o() {
        return this.T;
    }

    public void g() {
        this.q(1000, 4);
    }

    public void q(int n2, int n3) {
        this.T.clear();
        this.a.clear();
        ArrayList<n> arrayList = new ArrayList<n>();
        arrayList.add(this.E);
        this.a.add(new c(this.E, null, arrayList, this.E.b(this.S), 0.0, 0.0));
        block0: for (int i2 = 0; i2 < n2; ++i2) {
            this.a.sort(new g());
            int n4 = 0;
            if (this.a.isEmpty()) break;
            for (c c2 : new ArrayList<c>(this.a)) {
                n n5;
                if (++n4 > n3) continue;
                this.a.remove(c2);
                this.R.add(c2);
                for (n n6 : e) {
                    n n7 = c2.x().N(n6).R();
                    if (G.t(n7, false) && this.e(c2, n7, 0.0)) break block0;
                }
                n object = c2.x().T(0.0, 1.0, 0.0).R();
                if (G.t(object, false) && this.e(c2, object, 0.0) || G.t(n5 = c2.x().T(0.0, -1.0, 0.0).R(), false) && this.e(c2, n5, 0.0)) break block0;
            }
        }
        this.R.sort(new g());
        this.T = this.R.getFirst().z();
    }

    public c P(n n2) {
        for (c c2 : this.R) {
            if (c2.x().w() != n2.w() || c2.x().M() != n2.M() || c2.x().j() != n2.j()) continue;
            return c2;
        }
        for (c c2 : this.a) {
            if (c2.x().w() != n2.w() || c2.x().M() != n2.M() || c2.x().j() != n2.j()) continue;
            return c2;
        }
        return null;
    }

    public boolean e(c c2, n n2, double d2) {
        c c3 = this.P(n2);
        double d3 = d2;
        if (c2 != null) {
            d3 = d2 + c2.z();
        }
        if (c3 == null) {
            double d4 = 9.0;
            if (n2.w() == this.S.w() && n2.M() == this.S.M() && n2.j() == this.S.j() || n2.b(this.S) <= d4) {
                this.T.clear();
                this.T = c2.z();
                this.T.add(n2);
                return true;
            }
            ArrayList<n> arrayList = new ArrayList<n>(c2.z());
            arrayList.add(n2);
            this.a.add(new c(n2, c2, arrayList, n2.b(this.S), d2, d3));
        } else if (c3.D() > d2) {
            ArrayList<n> arrayList = new ArrayList<n>(c2.z());
            arrayList.add(n2);
            c3.l(n2);
            c3.W(c2);
            c3.w(arrayList);
            c3.h(n2.b(this.S));
            c3.d(d2);
            c3.H(d3);
        }
        return false;
    }
}

