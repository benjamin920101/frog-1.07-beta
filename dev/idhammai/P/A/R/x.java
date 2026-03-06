/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.Block
 *  net.minecraft.block.PlantBlock
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.block.WallSignBlock
 */
package dev.idhammai.P.A.R;

import dev.idhammai.P.A.J;
import dev.idhammai.P.A.R.G;
import dev.idhammai.P.A.R.n;
import dev.idhammai.P.A.l.k;
import java.util.ArrayList;
import net.minecraft.entity.LivingEntity;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.block.PlantBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.block.WallSignBlock;

public class x
implements J {
    public static final double q = 9.0;

    private static boolean C(class_2338 class_23382) {
        class_2248 class_22482 = x.W.field_1687.method_8320(new class_2338(class_23382.method_10263(), class_23382.method_10264(), class_23382.method_10260())).method_26204();
        return class_22482 == class_2246.field_10124 || class_22482 instanceof class_2261 || class_22482 == class_2246.field_10597 || class_22482 == class_2246.field_9983 || class_22482 == class_2246.field_10382 || class_22482 == class_2246.field_27097 || class_22482 instanceof class_2551;
    }

    public static ArrayList<n> p(class_1309 class_13092, class_1309 class_13093) {
        return x.c(new n(class_13092.method_23317(), class_13092.method_23318(), class_13092.method_23321()), new n(class_13093.method_23317(), class_13093.method_23318(), class_13093.method_23321()));
    }

    public static ArrayList<n> J(class_243 class_2432) {
        return x.c(new n(x.W.field_1724.method_23317(), x.W.field_1724.method_23318(), x.W.field_1724.method_23321()), new n(class_2432.field_1352, class_2432.field_1351, class_2432.field_1350));
    }

    public static ArrayList<n> c(n n2, n n3) {
        if (!x.C(new k(n2.S()))) {
            n2 = n2.T(0.0, 1.0, 0.0);
        }
        G g2 = new G(n2, n3);
        g2.g();
        int n4 = 0;
        n n5 = null;
        n n6 = null;
        ArrayList<n> arrayList = new ArrayList<n>();
        ArrayList<n> arrayList2 = g2.o();
        for (n n7 : arrayList2) {
            if (n4 != 0 && n4 != arrayList2.size() - 1) {
                boolean bl = true;
                if (n7.b(n6) > 9.0) {
                    bl = false;
                } else {
                    double d2 = Math.min(n6.w(), n7.w());
                    double d3 = Math.min(n6.M(), n7.M());
                    double d4 = Math.min(n6.j(), n7.j());
                    double d5 = Math.max(n6.w(), n7.w());
                    double d6 = Math.max(n6.M(), n7.M());
                    double d7 = Math.max(n6.j(), n7.j());
                    int n8 = (int)d2;
                    block1: while ((double)n8 <= d5) {
                        int n9 = (int)d3;
                        while ((double)n9 <= d6) {
                            int n10 = (int)d4;
                            while ((double)n10 <= d7) {
                                if (!G.a(n8, n9, n10, false)) {
                                    bl = false;
                                    break block1;
                                }
                                ++n10;
                            }
                            ++n9;
                        }
                        ++n8;
                    }
                }
                if (!bl) {
                    if (!arrayList.contains(n5.T(0.5, 0.0, 0.5))) {
                        arrayList.add(n5.T(0.5, 0.0, 0.5));
                    }
                    n6 = n5;
                }
            } else {
                if (n5 != null && !arrayList.contains(n5.T(0.5, 0.0, 0.5))) {
                    arrayList.add(n5.T(0.5, 0.0, 0.5));
                }
                if (!arrayList.contains(n7.T(0.5, 0.0, 0.5))) {
                    arrayList.add(n7.T(0.5, 0.0, 0.5));
                }
                n6 = n7;
            }
            n5 = n7;
            ++n4;
        }
        return arrayList;
    }
}

