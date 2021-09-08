package com.company;

public class Exercise6 {

    public static void multadd(double a, double b, double c) {
        System.out.println("Test: a * b + c = " + (a * b + c));

        double angle = Math.PI / 4;
        double sin = Math.sin(angle);
        double cos = (Math.cos(angle) / 2);
        System.out.println("Result of first mathproblem: " + (sin + cos));

        System.out.println("Result of second mathproblem: " + (Math.log(10) + Math.log(20)));

        expSum(2);
    }

    public static void main(String[] args) {
        double num1 = 1.0;
        double num2 = 2.0;
        double num3 = 3.0;
        multadd(num1, num2, num3);
    }

    public static void expSum(double x) {
        double exp = Math.exp(-x);
        double root = Math.sqrt(1 - exp);
        System.out.print("Result of the third mathproblem: " + (x * exp + root));
    }
}
