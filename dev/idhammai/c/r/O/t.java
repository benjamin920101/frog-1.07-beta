/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.O;

public class t {
    public static int X(Enum<?> enum_) {
        for (int i2 = 0; i2 < ((Enum[])enum_.getDeclaringClass().getEnumConstants()).length; ++i2) {
            Enum enum_2 = ((Enum[])enum_.getDeclaringClass().getEnumConstants())[i2];
            if (!enum_2.name().equalsIgnoreCase(enum_.name())) continue;
            return i2;
        }
        return -1;
    }

    public static Enum<?> e(Enum<?> enum_) {
        int n2 = t.X(enum_);
        for (int i2 = 0; i2 < ((Enum[])enum_.getDeclaringClass().getEnumConstants()).length; ++i2) {
            if (i2 != n2 + 1) continue;
            return ((Enum[])enum_.getDeclaringClass().getEnumConstants())[i2];
        }
        return ((Enum[])enum_.getDeclaringClass().getEnumConstants())[0];
    }

    public Enum<?> p(Enum<?> enum_, String string) {
        try {
            for (int i2 = 0; i2 < ((Enum[])enum_.getDeclaringClass().getEnumConstants()).length; ++i2) {
                Enum enum_2 = ((Enum[])enum_.getDeclaringClass().getEnumConstants())[i2];
                if (!enum_2.name().equalsIgnoreCase(string)) continue;
                return enum_2;
            }
            return null;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return null;
        }
    }
}

