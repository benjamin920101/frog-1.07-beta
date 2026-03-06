/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.util.math.RotationAxis
 */
package dev.idhammai.c.y.R.V;

import dev.idhammai.P.A.A.S;
import dev.idhammai.P.A.A.k;
import dev.idhammai.c.r.O.Y.T;
import dev.idhammai.c.r.q.N.P;
import dev.idhammai.c.y.R.V.O;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.util.math.RotationAxis;

public class s
extends O {
    private final T z;
    private final k b = new k();

    public s(T t2) {
        super(t2.e());
        this.z = t2;
    }

    @Override
    public void B(class_332 class_3322, int n2, int n3, float f2) {
        boolean bl = this.l(n2, n3);
        float f3 = (float)this.u + 7.0f;
        float f4 = this.M(this.E, (float)this.a - 0.5f);
        String string = ">";
        int n4 = this.n(string);
        int n5 = this.W();
        float f5 = this.p + f3 - (float)n4 - 3.0f;
        float f6 = f5 + (float)n4 / 2.0f;
        float f7 = f4 + (float)n5 / 2.0f;
        double d2 = this.b.g(this.z.h() ? 1.0 : 0.0, 160L, S.CubicInOut);
        float f8 = (float)(90.0 * d2);
        int n6 = bl ? P.M().ps.P().getRGB() : R;
        this.q(this.z.Q(), this.p + 2.3f, f4, n6);
        class_3322.method_51448().method_22903();
        class_3322.method_51448().method_46416(f6, f7, 0.0f);
        class_3322.method_51448().method_22907(class_7833.field_40718.rotationDegrees(f8));
        this.q(string, -((float)n4) / 2.0f, -((float)n5) / 2.0f, n6);
        class_3322.method_51448().method_22909();
    }

    @Override
    public void E() {
        this.q(!this.z.D());
    }

    @Override
    public void d(int n2, int n3, int n4) {
        if (this.l(n2, n3) && (n4 == 0 || n4 == 1)) {
            this.z.q(!this.z.h());
            s.L();
            return;
        }
    }

    @Override
    public boolean m() {
        return false;
    }
}

