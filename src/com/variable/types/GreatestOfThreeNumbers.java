package com.variable.types;


public class GreatestOfThreeNumbers {

    public static void main(String[] args) {
        int a = 200; int b = 760; int c = 20;

        if (a >= b && a >=c)
            System.out.println(a + " is the greatest number");

    else if (b >= c && b >= a)
            System.out.println(b + " is the greatest number");

    else
            System.out.println(c + " is the greatest number");
        }
    }
