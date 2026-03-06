/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.Identifier
 *  org.ladysnake.satin.api.managed.ManagedShaderEffect
 *  org.ladysnake.satin.api.managed.ShaderEffectManager
 */
package dev.idhammai.p.J;

import dev.idhammai.P.A.J;
import net.minecraft.util.Identifier;
import org.ladysnake.satin.api.managed.ManagedShaderEffect;
import org.ladysnake.satin.api.managed.ShaderEffectManager;

public class d
implements J {
    public static final ManagedShaderEffect R = ShaderEffectManager.getInstance().manage(class_2960.method_60654((String)"shaders/post/blurarea.json"));

    public void y(float f2, float f3, float f4, float f5, float f6) {
        this.b(f2, f3, f4, f5, f6, 0.0f);
    }

    public void b(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.d(f2, f3, f4, f5, f6, f7, 0.0f);
    }

    public void d(float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = (float)W.method_22683().method_4495() / 2.0f;
        R.setUniformValue("Radius", f2);
        R.setUniformValue("BlurType", f7);
        R.setUniformValue("BlurXY", f3 * f9, (float)W.method_22683().method_4507() / 2.0f - (f4 + f6) * f9);
        R.setUniformValue("BlurCoord", f5 * f9, f6 * f9);
        R.setUniformValue("CornerRadius", f8 * f9);
        R.render(W.method_60646().method_60637(true));
    }
}

