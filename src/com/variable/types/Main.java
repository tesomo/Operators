package com.variable.types;

public class Main {

    public static void main(String[] args) {
	int num1 = 100; int num2 = 2;

	num2 = num1;
        System.out.println("= output is " + num2);

        num2 += num1;
        System.out.println("= output is " + num2);

        num2 -= num1;
        System.out.println("=" + num2);

        num2 *= num1;
        System.out.println("=" + num2);

        num2 /= num1;
        System.out.println("=" + num2);




        System.out.println("num1 + num2 = " + num1+num2);
        System.out.println("num1/ num2 = " + num1/num2);
        System.out.println("num2 * num1 = " + num2 * num1);
    }
}
