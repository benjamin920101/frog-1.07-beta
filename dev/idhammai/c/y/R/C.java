/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1109
 *  net.minecraft.class_1113
 *  net.minecraft.class_332
 *  net.minecraft.class_3417
 *  net.minecraft.class_6880
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 */
package dev.idhammai.c.y.R;

import dev.idhammai.Frog;
import dev.idhammai.P.A.A.S;
import dev.idhammai.P.A.A.k;
import dev.idhammai.c.Q;
import dev.idhammai.c.r.q.N.P;
import dev.idhammai.p.J.n;
import java.awt.Color;
import java.util.Objects;
import net.minecraft.class_1109;
import net.minecraft.class_1113;
import net.minecraft.class_332;
import net.minecraft.class_3417;
import net.minecraft.class_6880;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class C
extends Q {
    public static class_332 A;
    protected float p;
    protected float E;
    protected int u;
    protected int a;
    private boolean F;
    private final k d = new k();

    public C(String string) {
        super(string);
    }

    public void S(float f2, float f3) {
        this.p = f2;
        this.E = f3;
    }

    public static void L() {
        if (P.M().N.h()) {
            W.method_1483().method_4873((class_1113)class_1109.method_47978((class_6880)class_3417.field_15015, (float)P.M().pQ.Z()));
        }
    }

    public void B(class_332 class_3322, int n2, int n3, float f2) {
    }

    public void d(int n2, int n3, int n4) {
    }

    public void H(int n2, int n3, int n4) {
    }

    public void E() {
    }

    public void G(char c2, int n2) {
    }

    public void l(int n2) {
    }

    public float W() {
        return this.p;
    }

    public float C() {
        return this.E;
    }

    public int S() {
        return this.u;
    }

    public void A(int n2) {
        this.u = n2;
    }

    public int R() {
        return this.a;
    }

    public void J(int n2) {
        this.a = n2;
    }

    public boolean q() {
        return this.F;
    }

    public void q(boolean bl) {
        this.F = bl;
    }

    public double o() {
        double d2 = this.F ? 0.0 : (double)this.R();
        return this.d.g(d2, 200L, S.CubicInOut);
    }

    protected double G() {
        return (double)this.E / 10.0;
    }

    protected void y(String string, double d2, double d3, Color color) {
        this.i(string, d2, d3, color.hashCode());
    }

    protected void i(String string, double d2, double d3, int n2) {
        boolean bl = n.w();
        class_332 class_3322 = A;
        if (P.M() != null && P.M().pM.X() == dev.idhammai.c.r.q.N.S.Shader && Frog.SHADER != null && Frog.SHADER.s()) {
            int[] nArray = Frog.SHADER.h();
            Matrix4f matrix4f = class_3322 != null ? new Matrix4f((Matrix4fc)class_3322.method_51448().method_23760().method_23761()) : null;
            Frog.SHADER.Q(() -> C.lambda$drawString$0(class_3322, matrix4f, nArray, string, d2, d3, n2, bl));
            return;
        }
        if (n.s()) {
            n.w.H(class_3322.method_51448(), string, (int)d2, (int)d3, n2, bl);
        } else {
            class_3322.method_51433(C.W.field_1772, string, (int)d2, (int)d3, n2, bl);
        }
    }

    protected void g(String string, double d2, double d3, int n2) {
        boolean bl = n.w();
        class_332 class_3322 = A;
        if (P.M() != null && P.M().pM.X() == dev.idhammai.c.r.q.N.S.Shader && Frog.SHADER != null && Frog.SHADER.s()) {
            int[] nArray = Frog.SHADER.h();
            Matrix4f matrix4f = class_3322 != null ? new Matrix4f((Matrix4fc)class_3322.method_51448().method_23760().method_23761()) : null;
            Frog.SHADER.Q(() -> C.lambda$drawSmallString$1(class_3322, matrix4f, nArray, string, d2, d3, n2, bl));
            return;
        }
        if (n.s()) {
            n.E.H(class_3322.method_51448(), string, (int)d2, (int)d3, n2, bl);
        } else {
            class_3322.method_51433(C.W.field_1772, string, (int)d2, (int)d3, n2, bl);
        }
    }

    protected int W() {
        if (n.s()) {
            return (int)n.w.V();
        }
        Objects.requireNonNull(C.W.field_1772);
        return 9;
    }

    protected float M(float f2, float f3) {
        return f2 + (f3 - (float)this.W()) / 2.0f + (float)P.M().pG.V();
    }

    protected int y(String string) {
        if (n.s()) {
            return (int)n.w.b(string);
        }
        return C.W.field_1772.method_1727(string);
    }

    protected int z(String string) {
        if (n.s()) {
            return (int)n.E.b(string);
        }
        return C.W.field_1772.method_1727(string);
    }

    private static void lambda$drawSmallString$1(class_332 class_3322, Matrix4f matrix4f, int[] nArray, String string, double d2, double d3, int n2, boolean bl) {
        if (class_3322 == null) {
            return;
        }
        class_3322.method_51448().method_22903();
        if (matrix4f != null) {
            class_3322.method_51448().method_23760().method_23761().set((Matrix4fc)matrix4f);
        }
        if (nArray != null) {
            class_3322.method_44379(nArray[0], nArray[1], nArray[2], nArray[3]);
        }
        if (n.s()) {
            n.E.H(class_3322.method_51448(), string, (int)d2, (int)d3, n2, bl);
        } else {
            class_3322.method_51433(C.W.field_1772, string, (int)d2, (int)d3, n2, bl);
        }
        if (nArray != null) {
            class_3322.method_44380();
        }
        class_3322.method_51448().method_22909();
    }

    private static void lambda$drawString$0(class_332 class_3322, Matrix4f matrix4f, int[] nArray, String string, double d2, double d3, int n2, boolean bl) {
        if (class_3322 == null) {
            return;
        }
        class_3322.method_51448().method_22903();
        if (matrix4f != null) {
            class_3322.method_51448().method_23760().method_23761().set((Matrix4fc)matrix4f);
        }
        if (nArray != null) {
            class_3322.method_44379(nArray[0], nArray[1], nArray[2], nArray[3]);
        }
        if (n.s()) {
            n.w.H(class_3322.method_51448(), string, (int)d2, (int)d3, n2, bl);
        } else {
            class_3322.method_51433(C.W.field_1772, string, (int)d2, (int)d3, n2, bl);
        }
        if (nArray != null) {
            class_3322.method_44380();
        }
        class_3322.method_51448().method_22909();
    }
}

