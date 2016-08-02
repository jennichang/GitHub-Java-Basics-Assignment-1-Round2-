package com.theironyard;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Stats s = new Stats();
        s.setGender("Female");
        s.setWeight(125);
        s.setHeight(170);

        Profile p = new Profile();
        p.setName("Jennifer");
        p.setAge(900);
        p.setSingle(false);

        Email e = new Email();
        e.setSubject("This is urgent");
        e.setSender("jennichang02@gmail.com");
        e.setRecipient("");
        e.setSentTime(143223);
        e.setUrgent(true);

        /*System.out.println("Stats are " + s.gender + ", " + s.weight + "lbs., " + s.height + "cm");
        System.out.println("Your profile is " + p.name + ", " + p.age + "yrs. old, " + "Single? " + p.single);*/

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
