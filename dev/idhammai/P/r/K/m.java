/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.P.r.K;

import dev.idhammai.P.r.K.T;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.K.z;
import dev.idhammai.c.r.O.Y.e;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.function.Consumer;

public class m
implements z {
    private static Method T;
    private final Class<?> F;
    private final boolean c;
    private final int G;
    private Consumer<Object> l;

    public m(T t2, Class<?> clazz, Object object, Method method) {
        this.F = method.getParameters()[0].getType();
        this.c = Modifier.isStatic(method.getModifiers());
        this.G = method.getAnnotation(r.class).D();
        try {
            MethodType methodType;
            MethodHandle methodHandle;
            String string = method.getName();
            MethodHandles.Lookup lookup = t2.C(T, clazz);
            MethodType methodType2 = MethodType.methodType(Void.TYPE, method.getParameters()[0].getType());
            if (this.c) {
                MethodType methodType3 = methodType2;
                Class<?> clazz2 = clazz;
                methodHandle = lookup.findStatic(clazz2, e.b(string, clazz2, methodType3.parameterArray()), methodType3);
                methodType = MethodType.methodType(Consumer.class);
            } else {
                MethodType methodType4 = methodType2;
                Class<?> clazz3 = clazz;
                methodHandle = lookup.findVirtual(clazz3, e.b(string, clazz3, methodType4.parameterArray()), methodType4);
                methodType = MethodType.methodType(Consumer.class, clazz);
            }
            MethodHandle methodHandle2 = LambdaMetafactory.metafactory(lookup, "accept", methodType, MethodType.methodType(Void.TYPE, Object.class), methodHandle, methodType2).getTarget();
            this.l = (Consumer)(this.c ? methodHandle2.invoke() : methodHandle2.invoke(object));
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    @Override
    public void p(Object object) {
        this.l.accept(object);
    }

    @Override
    public Class<?> e() {
        return this.F;
    }

    @Override
    public int r() {
        return this.G;
    }

    @Override
    public boolean v() {
        return this.c;
    }

    static {
        try {
            T = MethodHandles.class.getDeclaredMethod("privateLookupIn", Class.class, MethodHandles.Lookup.class);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            noSuchMethodException.printStackTrace();
        }
    }
}

