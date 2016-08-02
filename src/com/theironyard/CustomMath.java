package com.theironyard;

/**
 * Created by jenniferchang on 8/2/16.
 */
public class CustomMath {


    public static double getArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double getHypotenuse(double height, double base) {
        return Math.hypot(height, base);
    }


}
