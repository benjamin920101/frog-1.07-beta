/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2960
 *  net.minecraft.class_310
 *  net.minecraft.class_3298
 *  org.joml.Matrix4f
 *  org.lwjgl.opengl.GL20
 *  org.lwjgl.system.MemoryStack
 */
package dev.idhammai.P.A.S.L;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.FloatBuffer;
import java.nio.charset.StandardCharsets;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_3298;
import org.joml.Matrix4f;
import org.lwjgl.opengl.GL20;
import org.lwjgl.system.MemoryStack;

public class g {
    private final int P;

    public g(String string, String string2) {
        int n2 = GL20.glCreateProgram();
        try {
            String[] stringArray = string.split(":", 2);
            class_2960 class_29602 = stringArray.length > 1 ? class_2960.method_60655((String)stringArray[0], (String)stringArray[1]) : class_2960.method_60655((String)"minecraft", (String)string);
            int n3 = this.G(((class_3298)class_310.method_1551().method_1478().method_14486(class_29602).get()).method_14482(), 35632);
            GL20.glAttachShader((int)n2, (int)n3);
            String[] stringArray2 = string2.split(":", 2);
            class_2960 class_29603 = stringArray2.length > 1 ? class_2960.method_60655((String)stringArray2[0], (String)stringArray2[1]) : class_2960.method_60655((String)"minecraft", (String)string2);
            int n4 = this.G(((class_3298)class_310.method_1551().method_1478().method_14486(class_29603).get()).method_14482(), 35633);
            GL20.glAttachShader((int)n2, (int)n4);
            GL20.glBindAttribLocation((int)n2, (int)0, (CharSequence)"Position");
            GL20.glBindAttribLocation((int)n2, (int)1, (CharSequence)"UV0");
            GL20.glBindAttribLocation((int)n2, (int)2, (CharSequence)"Color");
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        GL20.glLinkProgram((int)n2);
        int n5 = GL20.glGetProgrami((int)n2, (int)35714);
        if (n5 == 0) {
            throw new IllegalStateException("Shader failed to link!");
        }
        this.P = n2;
    }

    public g(String string) {
        this(string, "frog:shaders/simple.vsh");
    }

    public void A() {
        GL20.glUseProgram((int)this.P);
    }

    public void f() {
        GL20.glUseProgram((int)0);
    }

    public int S(String string) {
        return GL20.glGetUniformLocation((int)this.P, (CharSequence)string);
    }

    public void q(String string, float ... fArray) {
        int n2 = GL20.glGetUniformLocation((int)this.P, (CharSequence)string);
        switch (fArray.length) {
            case 1: {
                GL20.glUniform1f((int)n2, (float)fArray[0]);
                break;
            }
            case 2: {
                GL20.glUniform2f((int)n2, (float)fArray[0], (float)fArray[1]);
                break;
            }
            case 3: {
                GL20.glUniform3f((int)n2, (float)fArray[0], (float)fArray[1], (float)fArray[2]);
                break;
            }
            case 4: {
                GL20.glUniform4f((int)n2, (float)fArray[0], (float)fArray[1], (float)fArray[2], (float)fArray[3]);
            }
        }
    }

    public void H(String string, Matrix4f matrix4f) {
        int n2 = GL20.glGetUniformLocation((int)this.P, (CharSequence)string);
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            FloatBuffer floatBuffer = memoryStack.mallocFloat(16);
            matrix4f.get(floatBuffer);
            GL20.glUniformMatrix4fv((int)n2, (boolean)false, (FloatBuffer)floatBuffer);
        }
    }

    private int G(InputStream inputStream, int n2) {
        int n3 = GL20.glCreateShader((int)n2);
        GL20.glShaderSource((int)n3, (CharSequence)this.j(inputStream));
        GL20.glCompileShader((int)n3);
        int n4 = GL20.glGetShaderi((int)n3, (int)35713);
        if (n4 == 0) {
            throw new IllegalStateException("Shader failed to compile!");
        }
        return n3;
    }

    private String j(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] byArray = new byte[1024];
        try {
            int n2;
            while ((n2 = inputStream.read(byArray)) != -1) {
                byteArrayOutputStream.write(byArray, 0, n2);
            }
            return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return "";
        }
    }
}

