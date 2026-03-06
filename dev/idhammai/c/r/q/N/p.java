/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.q.N;

import dev.idhammai.c.r.O.Y.B;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.q.N.W;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import java.awt.Color;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class p
extends y {
    public static p E;
    public final B<W> d = this.S(new B<W>("ColorMode", W.Custom).I("\u989c\u8272\u6a21\u5f0f").X(W.Custom, "\u81ea\u5b9a\u4e49").X(W.Rainbow, "\u5f69\u8679"));
    public final l A = this.p(new l("RainbowSpeed", 4.0, 1.0, 10.0, 0.1, this::lambda$new$0).D("\u5f69\u8679\u901f\u5ea6"));
    public final l V = this.p(new l("Saturation", 130.0, 1.0, 255.0, this::lambda$new$1).D("\u9971\u548c\u5ea6"));
    public final l D = this.p(new l("Delay", 350, 0, 1000, this::lambda$new$2).D("\u5ef6\u8fdf"));

    public p() {
        super("Colors", w.Client);
        this.L("\u989c\u8272");
        E = this;
    }

    @Override
    public void C() {
        this.S = true;
    }

    @Override
    public void p() {
        this.S = true;
    }

    @Override
    public boolean p() {
        return true;
    }

    public Color f() {
        return this.i(0.0);
    }

    public Color i(double d2) {
        if (this.d.X() == W.Rainbow) {
            double d3 = Math.ceil(((double)System.currentTimeMillis() * this.A.e() + d2 * this.D.e()) / 20.0);
            return Color.getHSBColor((float)(d3 % 360.0 / 360.0), this.V.Z() / 255.0f, 1.0f);
        }
        return new Color(255, 0, 0);
    }

    private boolean lambda$new$2() {
        return this.d.X() == W.Rainbow;
    }

    private boolean lambda$new$1() {
        return this.d.X() == W.Rainbow;
    }

    private boolean lambda$new$0() {
        return this.d.X() == W.Rainbow;
    }
}

