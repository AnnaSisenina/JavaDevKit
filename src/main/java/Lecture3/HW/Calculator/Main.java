package Lecture3.HW.Calculator;

public class Main {
    public static void main(String[] args) {
        int num = 2;
        double num2 = 2.3;
        float num3 = 457.78f;
        long num4 = 100000000000L;

        System.out.println(Calculator.sum(num, num2));
        System.out.println(Calculator.sum(num3, num4));

        System.out.println(Calculator.multiply(num, num2));
        System.out.println(Calculator.multiply(num3, num4));

        System.out.println(Calculator.divide(num, num2));
        System.out.println(Calculator.divide(num3, num4));

        System.out.println(Calculator.subtract(num, num2));
        System.out.println(Calculator.subtract(num3, num4));
    }
}

