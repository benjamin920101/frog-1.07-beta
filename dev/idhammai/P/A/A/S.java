/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.P.A.A;

import dev.idhammai.P.A.A.C;
import dev.idhammai.P.A.A.D;
import dev.idhammai.P.A.A.G;
import dev.idhammai.P.A.A.H;
import dev.idhammai.P.A.A.I;
import dev.idhammai.P.A.A.K;
import dev.idhammai.P.A.A.N;
import dev.idhammai.P.A.A.O;
import dev.idhammai.P.A.A.Q;
import dev.idhammai.P.A.A.R;
import dev.idhammai.P.A.A.U;
import dev.idhammai.P.A.A.V;
import dev.idhammai.P.A.A.W;
import dev.idhammai.P.A.A.X;
import dev.idhammai.P.A.A.Y;
import dev.idhammai.P.A.A.b;
import dev.idhammai.P.A.A.g;
import dev.idhammai.P.A.A.l;
import dev.idhammai.P.A.A.r;
import dev.idhammai.P.A.A.t;
import dev.idhammai.P.A.A.u;
import dev.idhammai.P.A.A.x;

public abstract sealed class S
extends Enum<S>
permits W, C, b, g, G, O, U, R, Y, l, r, D, I, V, N, u, H, X, Q, t, x, K {
    public static final /* enum */ S Linear = new W();
    public static final /* enum */ S SineOut = new C();
    public static final /* enum */ S SineInOut = new b();
    public static final /* enum */ S CubicIn = new g();
    public static final /* enum */ S CubicOut = new G();
    public static final /* enum */ S CubicInOut = new O();
    public static final /* enum */ S QuadIn = new U();
    public static final /* enum */ S QuadOut = new R();
    public static final /* enum */ S QuadInOut = new Y();
    public static final /* enum */ S QuartIn = new l();
    public static final /* enum */ S QuartOut = new r();
    public static final /* enum */ S QuartInOut = new D();
    public static final /* enum */ S QuintIn = new I();
    public static final /* enum */ S QuintOut = new V();
    public static final /* enum */ S QuintInOut = new N();
    public static final /* enum */ S CircIn = new u();
    public static final /* enum */ S CircOut = new H();
    public static final /* enum */ S CircInOut = new X();
    public static final /* enum */ S Expo = new Q();
    public static final /* enum */ S BackOut = new t();
    public static final /* enum */ S BackInOut = new x();
    public static final /* enum */ S Bounce = new K();
    private static final S[] I = S.S();

    public static S[] values() {
        return (S[])I.clone();
    }

    public static S valueOf(String string) {
        return Enum.valueOf(S.class, string);
    }

    public abstract double T(double var1);

    private static S[] S() {
        return new S[]{Linear, SineOut, SineInOut, CubicIn, CubicOut, CubicInOut, QuadIn, QuadOut, QuadInOut, QuartIn, QuartOut, QuartInOut, QuintIn, QuintOut, QuintInOut, CircIn, CircOut, CircInOut, Expo, BackOut, BackInOut, Bounce};
    }
}

