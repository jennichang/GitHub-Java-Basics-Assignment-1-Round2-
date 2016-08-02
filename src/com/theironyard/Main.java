package com.theironyard;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Stats s = new Stats();
        s.setGender("Male");
        s.setWeight(200);
        s.setHeight(600);

        Profile p = new Profile();
        p.setName("Jennifer");
        p.setAge(900);
        p.setSingle(false);

        System.out.println("Area of circle equals " + CustomMath.getArea(5));
        System.out.println("Hypotenuse of triangle equals " + CustomMath.getHypotenuse(10, 6));


         /* if (CustomMath.getQuadDiscr(3, 4, 4) > 0) {
            System.out.println("Root1 of Quadratic formula is " + CustomMath.getQuadraticRoot1(3, 4, 4) + " and Root2" +
                    " of Quadratic formula is " + CustomMath.getQuadraticRoot2(3, 4, 4));
        } else if (CustomMath.getQuadDiscr(3, 4, 4) == 0) {
            System.out.println("Roots of Quadratic formula are " + CustomMath.getQuadraticRoot1(3, 4, 4));
        } else System.out.println("Equation has imaginary roots"); */

        if (CustomMath.getQuadDiscr(54, 64, 7) < 0) {
            System.out.println("The equation has imaginary roots");
        } else
            System.out.println("Root1 equals " + CustomMath.getQuadraticRoot1(54, 64, 7) + " and Root2 equals " +
                    CustomMath.getQuadraticRoot2(54, 64, 7));

    }

}
