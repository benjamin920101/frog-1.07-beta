/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.O.Y;

import dev.idhammai.c.r.O.t;
import dev.idhammai.c.r.O.v;
import dev.idhammai.c.r.q.N.I;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BooleanSupplier;

public class B<T extends Enum<T>>
extends v {
    private final T e;
    private T A;
    private Runnable H = null;
    private boolean i = false;
    private final Map<String, String> L = new HashMap<String, String>();

    public B(String string, T t2) {
        super(string);
        this.A = t2;
        this.e = t2;
    }

    public B(String string, T t2, BooleanSupplier booleanSupplier) {
        super(string, booleanSupplier);
        this.A = t2;
        this.e = t2;
    }

    public B<T> I(String string) {
        super.V(string);
        return this;
    }

    public void c(String string) {
        t t2 = new t();
        if (string == null) {
            this.A = this.e;
            return;
        }
        Enum<?> enum_ = t2.p((Enum<?>)this.e, string);
        this.A = enum_ != null ? enum_ : this.e;
    }

    public void v() {
        this.A = t.e(this.A);
        if (this.i) {
            this.H.run();
        }
    }

    public void W() {
        this.A = this.e;
    }

    public T X() {
        return this.A;
    }

    public void h(T t2) {
        this.A = t2;
    }

    public void R(String string) {
        for (Enum enum_ : (Enum[])((Enum)this.A).getDeclaringClass().getEnumConstants()) {
            if (!enum_.name().equalsIgnoreCase(string)) continue;
            this.A = enum_;
            if (!this.i) continue;
            this.H.run();
        }
    }

    public B<T> w(Runnable runnable) {
        this.H = runnable;
        this.i = true;
        return this;
    }

    public B<T> X(T t2, String string) {
        if (t2 != null && string != null && !string.isEmpty()) {
            this.L.put(((Enum)t2).name(), string);
        }
        return this;
    }

    public String x(Enum<?> enum_) {
        if (enum_ == null) {
            return "";
        }
        if (I.Q != null && I.Q.C.h()) {
            String string = this.L.get(enum_.name());
            if (string != null && !string.isEmpty()) {
                return string;
            }
            return v.U(enum_.name());
        }
        return enum_.name();
    }

    public boolean x(T t2) {
        return this.X() == t2;
    }

    public T H() {
        return this.e;
    }
}

