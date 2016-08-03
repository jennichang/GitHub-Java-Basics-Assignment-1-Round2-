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


    // Quadratic formula
    public static double getQuadDiscr(double a, double b, double c) {
        double quadDiscr;
        quadDiscr = (Math.sqrt((b * b) - (4 * a * c)));
        return quadDiscr;
    }

    public static double getQuadraticRoot1(double a, double b, double c) {
        double root1;
        root1 = (-b + Math.sqrt(Math.pow(b,2) - 4*a*c)) / (2*a);
        return root1;
    }

    public static double getQuadraticRoot2(double a, double b, double c) {
        double root2;
        root2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        return root2;
    }


}
