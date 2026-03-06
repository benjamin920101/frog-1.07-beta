/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.Pair
 *  net.minecraft.class_639
 *  net.minecraft.class_642
 */
package dev.idhammai.c.r.q.x;

import dev.idhammai.Frog;
import dev.idhammai.c.r.O.Y.W;
import dev.idhammai.c.r.O.Y.l;
import dev.idhammai.c.r.q.x.R;
import dev.idhammai.c.r.q.x.T;
import dev.idhammai.c.r.w;
import dev.idhammai.c.r.y;
import it.unimi.dsi.fastutil.Pair;
import net.minecraft.class_639;
import net.minecraft.class_642;

public class G
extends y {
    public static G C;
    public final W n = this.S(new W("Rejoin", true).k("\u81ea\u52a8\u91cd\u8fdb"));
    public final l I = this.p(new l("Delay", 5.0, 0.0, 20.0, 0.1).D("\u91cd\u8fde\u5ef6\u8fdf").P("s"));
    public Pair<class_639, class_642> e;

    public G() {
        super("AutoReconnect", w.Misc);
        this.L("\u81ea\u52a8\u91cd\u8fde");
        C = this;
        Frog.EVENT_BUS.S(new T(this));
    }

    public boolean h() {
        return this.p() && this.n.h() && !R.A;
    }
}

