/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.N.z;

import dev.idhammai.P.A.A.k;
import dev.idhammai.c.r.q.N.z.z;
import java.util.concurrent.Callable;
import java.util.function.BooleanSupplier;

public class G {
    public final Callable<String> r;
    public String p;
    public final BooleanSupplier h;
    public double J;
    public boolean Y;
    public final k x;
    public final k q;
    private double Z;
    private double j;
    final z M;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public G(z z2, Callable callable, BooleanSupplier booleanSupplier) {
        this.M = z2;
        this.J = 0.0;
        this.x = new k();
        this.q = new k();
        this.r = callable;
        this.h = booleanSupplier;
        try {
            String string = this.r.call();
            this.p = string == null ? "" : string;
        }
        catch (Exception exception) {
            this.p = "";
        }
    }

    public void X() {
        this.Y = this.h.getAsBoolean();
        if (this.Y) {
            try {
                String string = this.r.call();
                if (string == null) {
                    string = "";
                }
                this.p = this.M.N.h() ? string.toLowerCase() : string;
            }
            catch (Exception exception) {
                exception.printStackTrace();
                this.p = "";
            }
        }
    }

    private void E(z z2) {
        if (this.J <= 0.0 && !this.Y) {
            this.Z = 0.0;
            this.j = 0.0;
            return;
        }
        String string = this.p == null ? "" : this.p;
        double d2 = z2.i(string) + 1;
        this.J = this.x.g(this.Y ? d2 : 0.0, this.Y ? (long)z2.d.V() : (long)z2.K.V(), z2.S5.X());
        this.j = this.q.g(this.Y ? 1.0 : 0.0, z2.j.V(), z2.S5.X());
        this.Z = this.J + (double)z2.F.Z();
    }
}

