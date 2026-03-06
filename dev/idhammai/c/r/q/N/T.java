/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.N;

public final class T
extends Enum<T> {
    public static final /* enum */ T Static = new T();
    public static final /* enum */ T RainbowDelay = new T();
    public static final /* enum */ T WaterShader = new T();
    public static final /* enum */ T SnowShader = new T();
    public static final /* enum */ T SmokeShader = new T();
    public static final /* enum */ T RainbowShader = new T();
    public static final /* enum */ T Pulse = new T();
    private static final T[] L = T.f();

    public static T[] values() {
        return (T[])L.clone();
    }

    public static T valueOf(String string) {
        return Enum.valueOf(T.class, string);
    }

    private static T[] f() {
        return new T[]{Static, RainbowDelay, WaterShader, SnowShader, SmokeShader, RainbowShader, Pulse};
    }
}

