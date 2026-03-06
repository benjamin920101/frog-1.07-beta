/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.P.r.K;

import dev.idhammai.P.r.K.D;
import dev.idhammai.P.r.K.F;
import dev.idhammai.P.r.K.T;
import dev.idhammai.P.r.K.m;
import dev.idhammai.P.r.K.p;
import dev.idhammai.P.r.K.q;
import dev.idhammai.P.r.K.r;
import dev.idhammai.P.r.K.z;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;

public class g
implements D {
    public final Map<Class<?>, List<z>> W = new ConcurrentHashMap();
    private final Map<Object, List<z>> w = new ConcurrentHashMap<Object, List<z>>();
    private final Map<Class<?>, List<z>> j = new ConcurrentHashMap();
    private final List<p> G = new ArrayList<p>();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void l(T t2) {
        List<p> list;
        List<p> list2 = list = this.G;
        synchronized (list2) {
            this.G.add(new p(t2));
        }
    }

    @Override
    public <T> T J(T t2) {
        List<z> list = this.W.get(t2.getClass());
        if (list != null) {
            for (z z2 : list) {
                z2.p(t2);
            }
        }
        return t2;
    }

    @Override
    public <T extends F> T I(T t2) {
        List<z> list = this.W.get(t2.getClass());
        if (list != null) {
            t2.H(false);
            for (z z2 : list) {
                z2.p(t2);
                if (!t2.l()) continue;
            }
        }
        return t2;
    }

    @Override
    public void S(Object object) {
        this.C(this.d(object.getClass(), object), false);
    }

    @Override
    public void Q(Class<?> clazz) {
        this.C(this.d(clazz, null), true);
    }

    @Override
    public void K(z z2) {
        this.V(z2, false);
    }

    private void C(List<z> list, boolean bl) {
        for (z z2 : list) {
            this.V(z2, bl);
        }
    }

    private void V(z z2, boolean bl) {
        if (bl) {
            if (z2.v()) {
                this.v(this.W.computeIfAbsent(z2.e(), g::lambda$subscribe$0), z2);
            }
        } else {
            this.v(this.W.computeIfAbsent(z2.e(), g::lambda$subscribe$1), z2);
        }
    }

    private void v(List<z> list, z z2) {
        int n2;
        for (n2 = 0; n2 < list.size() && z2.r() <= list.get(n2).r(); ++n2) {
        }
        list.add(n2, z2);
    }

    @Override
    public void f(Object object) {
        this.T(this.d(object.getClass(), object), false);
    }

    @Override
    public void V(Class<?> clazz) {
        this.T(this.d(clazz, null), true);
    }

    @Override
    public void P(z z2) {
        this.l(z2, false);
    }

    private void T(List<z> list, boolean bl) {
        for (z z2 : list) {
            this.l(z2, bl);
        }
    }

    private void l(z z2, boolean bl) {
        List<z> list = this.W.get(z2.e());
        if (list != null) {
            if (bl) {
                if (z2.v()) {
                    list.remove(z2);
                }
            } else {
                list.remove(z2);
            }
        }
    }

    private List<z> d(Class<?> clazz, Object object) {
        Function<Object, List> function = arg_0 -> this.lambda$getListeners$2(clazz, object, arg_0);
        if (object == null) {
            return this.j.computeIfAbsent(clazz, arg_0 -> this.lambda$getListeners$3(clazz, arg_0));
        }
        for (Object object2 : this.w.keySet()) {
            if (object2 != object) continue;
            return this.w.get(object);
        }
        List list = function.apply(object);
        this.w.put(object, list);
        return list;
    }

    private void Y(List<z> list, Class<?> clazz, Object object) {
        for (Method method : clazz.getDeclaredMethods()) {
            if (!this.Y(method)) continue;
            list.add(new m(this.g(clazz), clazz, object, method));
        }
        if (clazz.getSuperclass() != null) {
            this.Y(list, clazz.getSuperclass(), object);
        }
    }

    private boolean Y(Method method) {
        if (!method.isAnnotationPresent(r.class)) {
            return false;
        }
        if (method.getReturnType() != Void.TYPE) {
            return false;
        }
        if (method.getParameterCount() != 1) {
            return false;
        }
        return !method.getParameters()[0].getType().isPrimitive();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private T g(Class<?> clazz) {
        List<p> list;
        List<p> list2 = list = this.G;
        synchronized (list2) {
            Iterator<p> iterator = this.G.iterator();
            if (iterator.hasNext()) {
                p p2 = iterator.next();
                return p2.i;
            }
        }
        throw new q(clazz);
    }

    private List lambda$getListeners$3(Class clazz, Class clazz2) {
        CopyOnWriteArrayList<z> copyOnWriteArrayList = new CopyOnWriteArrayList<z>();
        this.Y(copyOnWriteArrayList, clazz, null);
        return copyOnWriteArrayList;
    }

    private List lambda$getListeners$2(Class clazz, Object object, Object object2) {
        CopyOnWriteArrayList<z> copyOnWriteArrayList = new CopyOnWriteArrayList<z>();
        this.Y(copyOnWriteArrayList, clazz, object);
        return copyOnWriteArrayList;
    }

    private static List lambda$subscribe$1(Class clazz) {
        return new CopyOnWriteArrayList();
    }

    private static List lambda$subscribe$0(Class clazz) {
        return new CopyOnWriteArrayList();
    }
}

