/*
 * Decompiled with CFR 0.152.
 */
package dev.idhammai.c.r.O;

import dev.idhammai.c.r.q.N.I;
import java.util.function.BooleanSupplier;

public abstract class v {
    private final BooleanSupplier U;
    private final String W;
    private String y;
    private v X;

    public v(String string) {
        this.W = string;
        this.U = null;
    }

    public v(String string, BooleanSupplier booleanSupplier) {
        this.W = string;
        this.U = booleanSupplier;
    }

    public boolean D() {
        return this.U == null || this.U.getAsBoolean();
    }

    public BooleanSupplier t() {
        return this.U;
    }

    public v m() {
        return this.X;
    }

    public void I(v v2) {
        this.X = v2;
    }

    public String e() {
        return this.W;
    }

    public <T extends v> T V(String string) {
        this.y = string;
        return (T)this;
    }

    public String Q() {
        if (I.Q != null && I.Q.C.h()) {
            if (this.y != null && !this.y.isEmpty()) {
                return this.y;
            }
            return v.U(this.W);
        }
        return this.W;
    }

    public static String U(String string) {
        if (string == null || string.isEmpty()) {
            return string;
        }
        String string2 = string.replace('-', ' ').replace('_', ' ');
        string2 = string2.replaceAll("([a-z0-9])([A-Z])", "$1 $2");
        String[] stringArray = string2.trim().split("\\s+");
        StringBuilder stringBuilder = new StringBuilder();
        for (String string3 : stringArray) {
            String string4;
            String string5 = switch (string4 = string3.toLowerCase()) {
                case "page" -> "\u9875\u9762";
                case "general" -> "\u5e38\u89c4";
                case "target" -> "\u76ee\u6807";
                case "render" -> "\u6e32\u67d3";
                case "rotate" -> "\u65cb\u8f6c";
                case "range" -> "\u8303\u56f4";
                case "delay" -> "\u5ef6\u8fdf";
                case "mode" -> "\u6a21\u5f0f";
                case "all" -> "\u5168\u90e8";
                case "none" -> "\u65e0";
                case "normal" -> "\u666e\u901a";
                case "silent" -> "\u9759\u9ed8";
                case "inventory" -> "\u80cc\u5305";
                case "offhand" -> "\u526f\u624b";
                case "fill" -> "\u586b\u5145";
                case "box" -> "\u65b9\u6846";
                case "jello" -> "\u679c\u51bb";
                case "time" -> "\u65f6\u95f4";
                case "speed" -> "\u901f\u5ea6";
                case "min" -> "\u6700\u5c0f";
                case "max" -> "\u6700\u5927";
                case "damage" -> "\u4f24\u5bb3";
                case "health" -> "\u751f\u547d";
                case "fov" -> "\u89c6\u89d2";
                case "yaw" -> "\u504f\u822a";
                case "step" -> "\u6b65\u8fdb";
                case "pre" -> "\u524d";
                case "post" -> "\u540e";
                case "left" -> "\u5de6";
                case "right" -> "\u53f3";
                default -> string3;
            };
            if (stringBuilder.length() > 0) {
                stringBuilder.append(" ");
            }
            stringBuilder.append(string5);
        }
        return stringBuilder.toString();
    }
}

