/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.glfw.GLFW
 */
package dev.idhammai.c.r.O.Y;

import dev.idhammai.c.r.O.v;
import java.lang.reflect.Field;
import java.util.function.BooleanSupplier;
import org.lwjgl.glfw.GLFW;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class O
extends v {
    private final int J;
    public boolean f = false;
    private int O;
    private boolean h = false;
    private boolean s = false;

    public O(String string, int n2) {
        super(string);
        this.J = n2;
        this.O = n2;
    }

    public O(String string, int n2, BooleanSupplier booleanSupplier) {
        super(string, booleanSupplier);
        this.J = n2;
        this.O = n2;
    }

    public O E(String string) {
        super.V(string);
        return this;
    }

    public int R() {
        return this.O;
    }

    public void N(int n2) {
        this.O = n2;
    }

    public String O() {
        if (this.O == -1) {
            return "None";
        }
        if (this.O < -1) {
            return "Mouse" + (Math.abs(this.O) - 1);
        }
        Object object = this.O > 0 ? GLFW.glfwGetKeyName((int)this.O, (int)GLFW.glfwGetKeyScancode((int)this.O)) : "None";
        String string = object;
        if (object == null) {
            try {
                for (Field field : GLFW.class.getDeclaredFields()) {
                    int n2;
                    if (!field.getName().startsWith("GLFW_KEY_") || (n2 = ((Integer)field.get(null)).intValue()) != this.O) continue;
                    String string2 = field.getName().substring("GLFW_KEY_".length());
                    object = string2.substring(0, 1).toUpperCase() + string2.substring(1).toLowerCase();
                }
            }
            catch (Exception exception) {
                object = "None";
            }
        }
        if (object == null) {
            return "Unknown " + this.O;
        }
        return ((String)object).toUpperCase();
    }

    public boolean G() {
        return this.h;
    }

    public void s(boolean bl) {
        this.h = bl;
    }

    public boolean B() {
        return this.s;
    }

    public void d(boolean bl) {
        this.s = bl;
    }

    public int B() {
        return this.J;
    }
}

