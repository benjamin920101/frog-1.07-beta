/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap
 *  net.minecraft.class_1269
 *  net.minecraft.class_1657
 *  net.minecraft.class_1937
 *  net.minecraft.class_2248
 *  net.minecraft.class_2680
 *  net.minecraft.class_2769
 *  net.minecraft.class_3965
 *  net.minecraft.class_4970$class_4971
 *  org.spongepowered.asm.mixin.Mixin
 */
package dev.idhammai.asm.mixins;

import com.mojang.serialization.MapCodec;
import dev.idhammai.Frog;
import dev.idhammai.P.r.c.f;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import net.minecraft.class_1269;
import net.minecraft.class_1657;
import net.minecraft.class_1937;
import net.minecraft.class_2248;
import net.minecraft.class_2680;
import net.minecraft.class_2769;
import net.minecraft.class_3965;
import net.minecraft.class_4970;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value={class_2680.class})
public abstract class MixinBlockState
extends class_4970.class_4971 {
    public MixinBlockState(class_2248 class_22482, Reference2ObjectArrayMap<class_2769<?>, Comparable<?>> reference2ObjectArrayMap, MapCodec<class_2680> mapCodec) {
        super(class_22482, reference2ObjectArrayMap, mapCodec);
    }

    public class_1269 method_55781(class_1937 class_19372, class_1657 class_16572, class_3965 class_39652) {
        Frog.EVENT_BUS.J(f.Z((class_2680)class_2680.class.cast((Object)this)));
        return super.method_55781(class_19372, class_16572, class_39652);
    }
}

