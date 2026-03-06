/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_279
 *  net.minecraft.class_4184
 *  net.minecraft.class_4587
 *  net.minecraft.class_4597
 *  net.minecraft.class_757
 *  net.minecraft.class_761
 *  net.minecraft.class_765
 *  net.minecraft.class_9779
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Vector3f
 *  org.lwjgl.opengl.GL11
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyArg
 *  org.spongepowered.asm.mixin.injection.Redirect
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package dev.idhammai.asm.mixins;

import dev.idhammai.Frog;
import dev.idhammai.P.A.J;
import dev.idhammai.asm.accessors.IGameRenderer;
import dev.idhammai.c.r.q.i.c;
import dev.idhammai.c.r.q.n.F;
import dev.idhammai.c.r.q.n.O;
import dev.idhammai.p.J.u;
import net.minecraft.class_1297;
import net.minecraft.class_279;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_757;
import net.minecraft.class_761;
import net.minecraft.class_765;
import net.minecraft.class_9779;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector3f;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_761.class})
public abstract class MixinWorldRenderer {
    @Unique
    private Matrix4f prevModelView = new Matrix4f();
    @Unique
    private Matrix4f prevProjection = new Matrix4f();
    @Unique
    private Vector3f prevCameraPos = new Vector3f();
    @Unique
    boolean renderingChams = false;
    @Unique
    boolean renderingEntity = false;

    @Inject(method={"renderEntity"}, at={@At(value="HEAD")})
    private void injectChamsForEntity(class_1297 class_12972, double d2, double d3, double d4, float f2, class_4587 class_45872, class_4597 class_45972, CallbackInfo callbackInfo) {
        if (O.s.p() && O.s.R.h()) {
            if (O.s.Q(class_12972)) {
                if (this.renderingEntity) {
                    J.W.method_22940().method_23000().method_22993();
                    this.renderingEntity = false;
                }
                GL11.glEnable((int)32823);
                GL11.glPolygonOffset((float)1.0f, (float)-1000000.0f);
                this.renderingChams = true;
            } else {
                this.renderingEntity = true;
            }
        }
    }

    @Inject(method={"renderEntity"}, at={@At(value="RETURN")})
    private void injectChamsForEntityPost(class_1297 class_12972, double d2, double d3, double d4, float f2, class_4587 class_45872, class_4597 class_45972, CallbackInfo callbackInfo) {
        if (O.s.p() && O.s.R.h() && this.renderingChams) {
            J.W.method_22940().method_23000().method_22993();
            GL11.glPolygonOffset((float)1.0f, (float)1000000.0f);
            GL11.glDisable((int)32823);
            this.renderingChams = false;
        }
    }

    @Redirect(method={"render"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/gl/PostEffectProcessor;render(F)V", ordinal=0), require=0)
    void replaceShaderHook(class_279 class_2792, float f2) {
        u u2 = F.I.j.X();
        if (F.I.p() && J.W.field_1687 != null) {
            Frog.SHADER.S(u2, Frog.SHADER.B(u2));
        } else {
            class_2792.method_1258(f2);
        }
    }

    @ModifyArg(method={"render"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/render/WorldRenderer;setupTerrain(Lnet/minecraft/client/render/Camera;Lnet/minecraft/client/render/Frustum;ZZ)V"), index=3)
    private boolean renderSetupTerrainModifyArg(boolean bl) {
        return c.L.p() || bl;
    }

    @Inject(method={"render"}, at={@At(value="HEAD")})
    private void setMatrices(class_9779 class_97792, boolean bl, class_4184 class_41842, class_757 class_7572, class_765 class_7652, Matrix4f matrix4f, Matrix4f matrix4f2, CallbackInfo callbackInfo) {
        float f2;
        Matrix4f matrix4f3;
        if (Frog.MOTION_BLUR != null && matrix4f != null && this.prevModelView != null && this.prevProjection != null && this.prevCameraPos != null && (matrix4f3 = class_7572.method_22973(((IGameRenderer)class_7572).invokeGetFov(class_41842, f2 = class_97792.method_60637(true), true))) != null) {
            Frog.MOTION_BLUR.W(matrix4f, this.prevModelView, matrix4f3, this.prevProjection, new Vector3f((float)(class_41842.method_19326().field_1352 % 30000.0), (float)(class_41842.method_19326().field_1351 % 30000.0), (float)(class_41842.method_19326().field_1350 % 30000.0)), this.prevCameraPos);
        }
    }

    @Inject(method={"render"}, at={@At(value="RETURN")})
    private void setOldMatrices(class_9779 class_97792, boolean bl, class_4184 class_41842, class_757 class_7572, class_765 class_7652, Matrix4f matrix4f, Matrix4f matrix4f2, CallbackInfo callbackInfo) {
        if (matrix4f == null) {
            return;
        }
        float f2 = class_97792.method_60637(true);
        this.prevModelView = new Matrix4f((Matrix4fc)matrix4f);
        Matrix4f matrix4f3 = class_7572.method_22973(((IGameRenderer)class_7572).invokeGetFov(class_41842, f2, true));
        if (matrix4f3 != null) {
            this.prevProjection = new Matrix4f((Matrix4fc)matrix4f3);
        }
        this.prevCameraPos = new Vector3f((float)(class_41842.method_19326().field_1352 % 30000.0), (float)(class_41842.method_19326().field_1351 % 30000.0), (float)(class_41842.method_19326().field_1350 % 30000.0));
    }
}

