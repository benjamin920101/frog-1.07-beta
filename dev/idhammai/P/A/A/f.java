/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntArrayMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  it.unimi.dsi.fastutil.objects.Object2IntMaps
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  net.minecraft.entity.DamageUtil
 *  net.minecraft.entity.damage.DamageSource
 *  net.minecraft.entity.effect.StatusEffectInstance
 *  net.minecraft.entity.effect.StatusEffects
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EquipmentSlot
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.attribute.EntityAttributeModifier
 *  net.minecraft.entity.attribute.EntityAttributeInstance
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.enchantment.Enchantment
 *  net.minecraft.enchantment.EnchantmentHelper
 *  net.minecraft.enchantment.Enchantments
 *  net.minecraft.world.BlockView
 *  net.minecraft.world.GameMode
 *  net.minecraft.block.Blocks
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Position
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.hit.HitResult$Type
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.block.BlockState
 *  net.minecraft.world.Heightmap$Type
 *  net.minecraft.registry.tag.EntityTypeTags
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.world.RaycastContext
 *  net.minecraft.world.RaycastContext$FluidHandling
 *  net.minecraft.world.RaycastContext$ShapeType
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.entity.attribute.EntityAttributes
 *  net.minecraft.registry.RegistryKey
 *  net.minecraft.client.network.PlayerListEntry
 *  net.minecraft.registry.entry.RegistryEntry
 *  net.minecraft.registry.tag.DamageTypeTags
 *  net.minecraft.component.type.AttributeModifiersComponent
 *  net.minecraft.component.type.ItemEnchantmentsComponent
 *  net.minecraft.component.DataComponentTypes
 *  net.minecraft.item.MaceItem
 *  org.apache.commons.lang3.mutable.MutableInt
 *  org.jetbrains.annotations.Nullable
 *  org.joml.Math
 */
package dev.idhammai.P.A.A;

import dev.idhammai.Frog;
import dev.idhammai.P.A.A.a;
import dev.idhammai.P.A.A.i;
import dev.idhammai.P.A.J;
import dev.idhammai.P.A.Y.N;
import dev.idhammai.c.r.q.A.I;
import dev.idhammai.c.r.q.A.v;
import dev.idhammai.p.J.k;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Set;
import java.util.function.BiFunction;
import net.minecraft.entity.DamageUtil;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributeInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.world.BlockView;
import net.minecraft.world.GameMode;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Position;
import net.minecraft.util.math.Box;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.block.BlockState;
import net.minecraft.world.Heightmap;
import net.minecraft.registry.tag.EntityTypeTags;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.RaycastContext;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.registry.RegistryKey;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.tag.DamageTypeTags;
import net.minecraft.component.type.AttributeModifiersComponent;
import net.minecraft.component.type.ItemEnchantmentsComponent;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.MaceItem;
import org.apache.commons.lang3.mutable.MutableInt;
import org.jetbrains.annotations.Nullable;

public class f {
    public static final a H = f::lambda$static$0;

    public static float t(class_2338 class_23382, class_1309 class_13092) {
        return f.o(class_13092, null, new class_243((double)class_23382.method_10263() + 0.5, (double)(class_23382.method_10264() + 1), (double)class_23382.method_10260() + 0.5), 12.0f);
    }

    public static float Y(class_243 class_2432, class_1309 class_13092) {
        return f.o(class_13092, null, class_2432, 12.0f);
    }

    public static float K(class_1309 class_13092, class_243 class_2432, class_238 class_2383, class_243 class_2433, float f2, a a2) {
        double d2 = f.v(class_2432.field_1352, class_2432.field_1351, class_2432.field_1350, class_2433.field_1352, class_2433.field_1351, class_2433.field_1350);
        if (d2 > (double)f2) {
            return 0.0f;
        }
        double d3 = f.B(class_2433, class_2383, a2);
        double d4 = (1.0 - d2 / (double)f2) * d3;
        float f3 = (int)((d4 * d4 + d4) / 2.0 * 7.0 * 12.0 + 1.0);
        return f.D(f3, class_13092, J.W.field_1687.method_48963().method_48807(null));
    }

    public static float s(class_1309 class_13092, class_1309 class_13093, class_243 class_2432) {
        return f.b(class_13092, class_13093, class_2432, 10.0f, class_2338.method_49638((class_2374)class_2432), class_2246.field_10124.method_9564());
    }

    public static float b(class_1309 class_13092, class_1309 class_13093, class_243 class_2432, float f2, class_2338 class_23382, class_2680 class_26802) {
        return f.U(class_13092, class_13093, class_2432, f2, f.U(class_23382, class_26802));
    }

    private static float U(class_1309 class_13092, class_1309 class_13093, class_243 class_2432, float f2, a a2) {
        class_1657 class_16572;
        if (class_13092 == null) {
            return 0.0f;
        }
        if (class_13092 instanceof class_1657 && f.F(class_16572 = (class_1657)class_13092) == class_1934.field_9220) {
            return 0.0f;
        }
        return f.K(class_13092, class_13093 != null ? class_13093.method_19538() : class_13092.method_19538(), class_13093 != null ? class_13093.method_5829() : class_13092.method_5829(), class_2432, f2, a2);
    }

    public static float o(class_1309 class_13092, class_1309 class_13093, class_243 class_2432, float f2) {
        class_1657 class_16572;
        if (class_13092 == null) {
            return 0.0f;
        }
        if (class_13092 instanceof class_1657 && f.F(class_16572 = (class_1657)class_13092) == class_1934.field_9220) {
            return 0.0f;
        }
        return f.K(class_13092, class_13093 != null ? class_13093.method_19538() : class_13092.method_19538(), class_13093 != null ? class_13093.method_5829() : class_13092.method_5829(), class_2432, f2, H);
    }

    public static a U(class_2338 class_23382, class_2680 class_26802) {
        return (arg_0, arg_1) -> f.lambda$getOverridingHitFactory$1(class_23382, class_26802, arg_0, arg_1);
    }

    public static float p(class_1309 class_13092, class_1309 class_13093) {
        class_1282 class_12822;
        class_1657 class_16572;
        float f2 = (float)class_13092.method_45325(class_5134.field_23721);
        if (class_13092 instanceof class_1657) {
            class_16572 = (class_1657)class_13092;
            class_12822 = J.W.field_1687.method_48963().method_48802(class_16572);
        } else {
            class_12822 = J.W.field_1687.method_48963().method_48812(class_13092);
        }
        class_16572 = class_12822;
        class_1293 class_12932 = class_13092.method_6112(class_1294.field_5910);
        if (class_12932 != null) {
            f2 += 3.0f * (float)(class_12932.method_5578() + 1);
        }
        float f3 = f.i(class_13092, class_13093, class_13092.method_59958(), (class_1282)class_16572, f2);
        return f.b(f3, class_13093, (class_1282)class_16572);
    }

    public static float g(class_1309 class_13092, class_1309 class_13093, class_1799 class_17992) {
        class_1282 class_12822;
        class_1657 class_16572;
        class_1324 class_13242 = class_13092.method_5996(class_5134.field_23721);
        class_1324 class_13243 = new class_1324(class_5134.field_23721, f::lambda$getAttackDamage$2);
        class_13243.method_6192(class_13242.method_6201());
        for (class_1322 class_13222 : class_13242.method_6195()) {
            class_13243.method_26835(class_13222);
        }
        class_13243.method_6200(class_1792.field_8006);
        class_9285 class_92852 = (class_9285)class_17992.method_57824(class_9334.field_49636);
        if (class_92852 != null) {
            class_92852.method_57482(class_1304.field_6173, (arg_0, arg_1) -> f.lambda$getAttackDamage$3(class_13243, arg_0, arg_1));
        }
        float f2 = (float)class_13243.method_6194();
        if (class_13092 instanceof class_1657) {
            class_16572 = (class_1657)class_13092;
            class_12822 = J.W.field_1687.method_48963().method_48802(class_16572);
        } else {
            class_12822 = J.W.field_1687.method_48963().method_48812(class_13092);
        }
        class_16572 = class_12822;
        float f3 = f.i(class_13092, class_13093, class_17992, (class_1282)class_16572, f2);
        return f.b(f3, class_13093, (class_1282)class_16572);
    }

    private static float i(class_1309 class_13092, class_1309 class_13093, class_1799 class_17992, class_1282 class_12822, float f2) {
        int n2;
        int n3;
        int n4;
        Object2IntOpenHashMap object2IntOpenHashMap = new Object2IntOpenHashMap();
        f.w(class_17992, (Object2IntMap<class_6880<class_1887>>)object2IntOpenHashMap);
        float f3 = 0.0f;
        int n5 = f.w((Object2IntMap<class_6880<class_1887>>)object2IntOpenHashMap, (class_5321<class_1887>)class_1893.field_9118);
        if (n5 > 0) {
            f3 += 1.0f + 0.5f * (float)(n5 - 1);
        }
        if ((n4 = f.w((Object2IntMap<class_6880<class_1887>>)object2IntOpenHashMap, (class_5321<class_1887>)class_1893.field_9112)) > 0 && class_13093.method_5864().method_20210(class_3483.field_48285)) {
            f3 += 2.5f * (float)n4;
        }
        if ((n3 = f.w((Object2IntMap<class_6880<class_1887>>)object2IntOpenHashMap, (class_5321<class_1887>)class_1893.field_9106)) > 0 && class_13093.method_5864().method_20210(class_3483.field_48284)) {
            f3 += 2.5f * (float)n3;
        }
        if ((n2 = f.w((Object2IntMap<class_6880<class_1887>>)object2IntOpenHashMap, (class_5321<class_1887>)class_1893.field_9123)) > 0 && class_13093.method_5864().method_20210(class_3483.field_49931)) {
            f3 += 2.5f * (float)n2;
        }
        if (class_13092 instanceof class_1657) {
            class_1657 class_16572 = (class_1657)class_13092;
            float f4 = class_16572.method_7261(0.5f);
            f2 *= 0.2f + f4 * f4 * 0.8f;
            f3 *= f4;
            class_1792 class_17922 = class_17992.method_7909();
            if (class_17922 instanceof class_9362) {
                float f5;
                class_9362 class_93622 = (class_9362)class_17922;
                float f6 = class_93622.method_58403((class_1297)class_13093, f2, class_12822);
                if (f5 > 0.0f) {
                    int n6 = f.M(class_17992, (class_5321<class_1887>)class_1893.field_50157);
                    if (n6 > 0) {
                        f6 += 0.5f * class_13092.field_6017;
                    }
                    f2 += f6;
                }
            }
            if (!(!(f4 > 0.9f) || !(class_13092.field_6017 > 0.0f) && (class_13092 != J.W.field_1724 || !I.Z.p() || I.Z.L.x(v.Ground) || !J.W.field_1724.method_24828() && I.Z.j.h()) || class_13092.method_24828() && (class_13092 != J.W.field_1724 || !I.Z.p() || I.Z.L.x(v.Ground)) || class_13092.method_6101() || class_13092.method_5799() || class_13092.method_6059(class_1294.field_5919) || class_13092.method_5765())) {
                f2 *= 1.5f;
            }
        }
        return f2 + f3;
    }

    public static float U(class_1309 class_13092) {
        if (class_13092 instanceof class_1657) {
            class_1657 class_16572 = (class_1657)class_13092;
            if (class_16572.method_31549().field_7479) {
                return 0.0f;
            }
        }
        if (class_13092.method_6059(class_1294.field_5906) || class_13092.method_6059(class_1294.field_5902)) {
            return 0.0f;
        }
        int n2 = J.W.field_1687.method_8500(class_13092.method_24515()).method_12032(class_2902.class_2903.field_13197).method_12603(class_13092.method_31477() & 0xF, class_13092.method_31479() & 0xF);
        if (class_13092.method_31478() >= n2) {
            return f.e(class_13092, n2);
        }
        class_3965 class_39652 = J.W.field_1687.method_17742(new class_3959(class_13092.method_19538(), new class_243(class_13092.method_23317(), (double)J.W.field_1687.method_31607(), class_13092.method_23321()), class_3959.class_3960.field_17558, class_3959.class_242.field_36338, (class_1297)class_13092));
        if (class_39652.method_17783() == class_239.class_240.field_1333) {
            return 0.0f;
        }
        return f.e(class_13092, class_39652.method_17777().method_10264());
    }

    private static float e(class_1309 class_13092, int n2) {
        int n3 = (int)(class_13092.method_23318() - (double)n2 + (double)class_13092.field_6017 - 3.0);
        @Nullable class_1293 class_12932 = class_13092.method_6112(class_1294.field_5913);
        if (class_12932 != null) {
            n3 -= class_12932.method_5578() + 1;
        }
        return f.b(n3, class_13092, J.W.field_1687.method_48963().method_48827());
    }

    public static float D(float f2, class_1309 class_13092, class_1282 class_12822) {
        if (class_12822.method_5514()) {
            switch (J.W.field_1687.method_8407()) {
                case field_5805: {
                    f2 = Math.min(f2 / 2.0f + 1.0f, f2);
                    break;
                }
                case field_5807: {
                    f2 *= 1.5f;
                }
            }
        }
        f2 = class_1280.method_5496((class_1309)class_13092, (float)f2, (class_1282)class_12822, (float)f.J(class_13092), (float)((float)f.h(class_13092)));
        f2 = f.j(class_13092, f2);
        f2 = class_1280.method_5497((float)f2, (float)f.k(class_13092.method_5661()));
        return Math.max(f2, 0.0f);
    }

    public static float b(float f2, class_1309 class_13092, class_1282 class_12822) {
        if (class_12822.method_5514()) {
            switch (J.W.field_1687.method_8407()) {
                case field_5805: {
                    f2 = Math.min(f2 / 2.0f + 1.0f, f2);
                    break;
                }
                case field_5807: {
                    f2 *= 1.5f;
                }
            }
        }
        f2 = class_1280.method_5496((class_1309)class_13092, (float)f2, (class_1282)class_12822, (float)f.J(class_13092), (float)((float)f.h(class_13092)));
        f2 = f.j(class_13092, f2);
        f2 = f.P(class_13092, f2, class_12822);
        return Math.max(f2, 0.0f);
    }

    public static double h(class_1309 class_13092) {
        class_1657 class_16572;
        k k2;
        if (class_13092 instanceof class_1657 && (k2 = Frog.PLAYER.m.get(class_16572 = (class_1657)class_13092)) != null) {
            return k2.F();
        }
        return class_13092.method_45325(class_5134.field_23725);
    }

    private static float J(class_1309 class_13092) {
        class_1657 class_16572;
        k k2;
        if (class_13092 instanceof class_1657 && (k2 = Frog.PLAYER.m.get(class_16572 = (class_1657)class_13092)) != null) {
            return k2.Y();
        }
        return (float)Math.floor(class_13092.method_45325(class_5134.field_23724));
    }

    private static float P(class_1309 class_13092, float f2, class_1282 class_12822) {
        if (class_12822.method_48789(class_8103.field_42242)) {
            return f2;
        }
        int n2 = 0;
        for (class_1799 class_17992 : class_13092.method_56674()) {
            int n3;
            int n4;
            int n5;
            int n6;
            Object2IntOpenHashMap object2IntOpenHashMap = new Object2IntOpenHashMap();
            f.w(class_17992, (Object2IntMap<class_6880<class_1887>>)object2IntOpenHashMap);
            int n7 = f.w((Object2IntMap<class_6880<class_1887>>)object2IntOpenHashMap, (class_5321<class_1887>)class_1893.field_9111);
            if (n7 > 0) {
                n2 += n7;
            }
            if ((n6 = f.w((Object2IntMap<class_6880<class_1887>>)object2IntOpenHashMap, (class_5321<class_1887>)class_1893.field_9095)) > 0 && class_12822.method_48789(class_8103.field_42246)) {
                n2 += 2 * n6;
            }
            if ((n5 = f.w((Object2IntMap<class_6880<class_1887>>)object2IntOpenHashMap, (class_5321<class_1887>)class_1893.field_9107)) > 0 && class_12822.method_48789(class_8103.field_42249)) {
                n2 += 2 * n5;
            }
            if ((n4 = f.w((Object2IntMap<class_6880<class_1887>>)object2IntOpenHashMap, (class_5321<class_1887>)class_1893.field_9096)) > 0 && class_12822.method_48789(class_8103.field_42247)) {
                n2 += 2 * n4;
            }
            if ((n3 = f.w((Object2IntMap<class_6880<class_1887>>)object2IntOpenHashMap, (class_5321<class_1887>)class_1893.field_9129)) <= 0 || !class_12822.method_48789(class_8103.field_42250)) continue;
            n2 += 3 * n3;
        }
        return class_1280.method_5497((float)f2, (float)n2);
    }

    public static int k(Iterable<class_1799> iterable) {
        MutableInt mutableInt = new MutableInt();
        iterable.forEach(arg_0 -> f.lambda$getProtectionAmount$4(mutableInt, arg_0));
        return mutableInt.intValue();
    }

    public static int r(class_1799 class_17992) {
        int n2 = class_1890.method_8225((class_6880)((class_6880)J.W.field_1687.method_30349().method_30530(class_1893.field_9107.method_58273()).method_40264(class_1893.field_9107).get()), (class_1799)class_17992);
        int n3 = class_1890.method_8225((class_6880)((class_6880)J.W.field_1687.method_30349().method_30530(class_1893.field_9111.method_58273()).method_40264(class_1893.field_9111).get()), (class_1799)class_17992);
        return n2 * 2 + n3;
    }

    private static float j(class_1309 class_13092, float f2) {
        class_1293 class_12932 = class_13092.method_6112(class_1294.field_5907);
        if (class_12932 != null) {
            int n2 = class_12932.method_5578() + 1;
            f2 *= 1.0f - (float)n2 * 0.2f;
        }
        return Math.max(f2, 0.0f);
    }

    private static float B(class_243 class_2432, class_238 class_2383, a a2) {
        if (dev.idhammai.c.r.q.N.I.Q.d.h()) {
            int n2 = 0;
            int n3 = 0;
            for (int i2 = 0; i2 <= 1; ++i2) {
                for (int i3 = 0; i3 <= 1; ++i3) {
                    for (int i4 = 0; i4 <= 1; ++i4) {
                        double d2;
                        double d3;
                        double d4 = class_3532.method_16436((double)i2, (double)class_2383.field_1323, (double)class_2383.field_1320);
                        class_243 class_2433 = new class_243(d4, d3 = class_3532.method_16436((double)i3, (double)class_2383.field_1322, (double)class_2383.field_1325), d2 = class_3532.method_16436((double)i4, (double)class_2383.field_1321, (double)class_2383.field_1324));
                        if (f.T(class_2433, class_2432, N.z) == class_239.class_240.field_1333) {
                            ++n2;
                        }
                        ++n3;
                    }
                }
            }
            return (float)n2 / (float)n3;
        }
        double d5 = class_2383.field_1320 - class_2383.field_1323;
        double d6 = class_2383.field_1325 - class_2383.field_1322;
        double d7 = class_2383.field_1324 - class_2383.field_1321;
        double d8 = 1.0 / (d5 * 2.0 + 1.0);
        double d9 = 1.0 / (d6 * 2.0 + 1.0);
        double d10 = 1.0 / (d7 * 2.0 + 1.0);
        if (d8 > 0.0 && d9 > 0.0 && d10 > 0.0) {
            int n4 = 0;
            int n5 = 0;
            double d11 = (1.0 - Math.floor(1.0 / d8) * d8) * 0.5;
            double d12 = (1.0 - Math.floor(1.0 / d10) * d10) * 0.5;
            d8 *= d5;
            d9 *= d6;
            d10 *= d7;
            double d13 = class_2383.field_1323 + d11;
            double d14 = class_2383.field_1322;
            double d15 = class_2383.field_1321 + d12;
            double d16 = class_2383.field_1320 + d11;
            double d17 = class_2383.field_1325;
            double d18 = class_2383.field_1324 + d12;
            for (double d19 = d13; d19 <= d16; d19 += d8) {
                for (double d20 = d14; d20 <= d17; d20 += d9) {
                    for (double d21 = d15; d21 <= d18; d21 += d10) {
                        class_243 class_2434 = new class_243(d19, d20, d21);
                        if (f.F(new i(class_2434, class_2432), a2) == null) {
                            ++n4;
                        }
                        ++n5;
                    }
                }
            }
            return (float)n4 / (float)n5;
        }
        return 0.0f;
    }

    public static class_239.class_240 T(class_243 class_2432, class_243 class_2433, boolean bl) {
        return (class_239.class_240)class_1922.method_17744((class_243)class_2432, (class_243)class_2433, null, (arg_0, arg_1) -> f.lambda$raycast$5(bl, class_2432, class_2433, arg_0, arg_1), f::lambda$raycast$6);
    }

    public static class_3965 F(i i2, a a2) {
        return (class_3965)class_1922.method_17744((class_243)i2.V(), (class_243)i2.A(), (Object)i2, (BiFunction)a2, f::lambda$raycast$7);
    }

    public static int M(class_1799 class_17992, class_5321<class_1887> class_53212) {
        if (class_17992.method_7960()) {
            return 0;
        }
        Object2IntArrayMap object2IntArrayMap = new Object2IntArrayMap();
        f.w(class_17992, (Object2IntMap<class_6880<class_1887>>)object2IntArrayMap);
        return f.w((Object2IntMap<class_6880<class_1887>>)object2IntArrayMap, class_53212);
    }

    public static int w(Object2IntMap<class_6880<class_1887>> object2IntMap, class_5321<class_1887> class_53212) {
        for (Object2IntMap.Entry entry : Object2IntMaps.fastIterable(object2IntMap)) {
            if (!((class_6880)entry.getKey()).method_40225(class_53212)) continue;
            return entry.getIntValue();
        }
        return 0;
    }

    public static double v(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Math.sqrt(f.R(d2, d3, d4, d5, d6, d7));
    }

    public static class_1934 F(class_1657 class_16572) {
        if (class_16572 == null) {
            return null;
        }
        class_640 class_6402 = J.W.method_1562().method_2871(class_16572.method_5667());
        if (class_6402 == null) {
            return null;
        }
        return class_6402.method_2958();
    }

    public static double O(class_1297 class_12972) {
        return f.j(class_12972.method_23317(), class_12972.method_23318(), class_12972.method_23321());
    }

    public static double y(class_2338 class_23382) {
        return f.j(class_23382.method_10263(), class_23382.method_10264(), class_23382.method_10260());
    }

    public static double j(double d2, double d3, double d4) {
        return f.R(J.W.field_1724.method_23317(), J.W.field_1724.method_23318(), J.W.field_1724.method_23321(), d2, d3, d4);
    }

    public static double R(double d2, double d3, double d4, double d5, double d6, double d7) {
        double d8 = d2 - d5;
        double d9 = d3 - d6;
        double d10 = d4 - d7;
        return org.joml.Math.fma((double)d8, (double)d8, (double)org.joml.Math.fma((double)d9, (double)d9, (double)(d10 * d10)));
    }

    public static void w(class_1799 class_17992, Object2IntMap<class_6880<class_1887>> object2IntMap) {
        object2IntMap.clear();
        if (!class_17992.method_7960()) {
            Set set = class_17992.method_7909() == class_1802.field_8598 ? ((class_9304)class_17992.method_57824(class_9334.field_49643)).method_57539() : class_17992.method_58657().method_57539();
            for (Object2IntMap.Entry entry : set) {
                object2IntMap.put((Object)((class_6880)entry.getKey()), entry.getIntValue());
            }
        }
    }

    private static Object lambda$raycast$7(Object object) {
        return null;
    }

    private static class_239.class_240 lambda$raycast$6(Object object) {
        return class_239.class_240.field_1333;
    }

    private static class_239.class_240 lambda$raycast$5(boolean bl, class_243 class_2432, class_243 class_2433, Object object, class_2338 class_23382) {
        class_2680 class_26802 = J.W.field_1687.method_8320(class_23382);
        if (class_26802.method_26204().method_9520() < 600.0f && bl) {
            return null;
        }
        class_3965 class_39652 = class_26802.method_26220((class_1922)J.W.field_1687, class_23382).method_1092(class_2432, class_2433, class_23382);
        return class_39652 == null ? null : class_39652.method_17783();
    }

    private static void lambda$getProtectionAmount$4(MutableInt mutableInt, class_1799 class_17992) {
        mutableInt.add(f.r(class_17992));
    }

    private static void lambda$getAttackDamage$3(class_1324 class_13242, class_6880 class_68802, class_1322 class_13222) {
        if (class_68802 == class_5134.field_23721) {
            class_13242.method_55696(class_13222);
        }
    }

    private static void lambda$getAttackDamage$2(class_1324 class_13242) {
    }

    private static class_3965 lambda$getOverridingHitFactory$1(class_2338 class_23382, class_2680 class_26802, i i2, class_2338 class_23383) {
        class_2680 class_26803;
        if (class_23383.equals((Object)class_23382)) {
            class_26803 = class_26802;
        } else {
            class_26803 = J.W.field_1687.method_8320(class_23383);
            if (class_26803.method_26204().method_9520() < 600.0f) {
                return null;
            }
        }
        return class_26803.method_26220((class_1922)J.W.field_1687, class_23383).method_1092(i2.V(), i2.A(), class_23383);
    }

    private static class_3965 lambda$static$0(i i2, class_2338 class_23382) {
        class_2680 class_26802 = J.W.field_1687.method_8320(class_23382);
        if (class_26802.method_26204().method_9520() < 600.0f) {
            return null;
        }
        return class_26802.method_26220((class_1922)J.W.field_1687, class_23382).method_1092(i2.V(), i2.A(), class_23382);
    }
}

