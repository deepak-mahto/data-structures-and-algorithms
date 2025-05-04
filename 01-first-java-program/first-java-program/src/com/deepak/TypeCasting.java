package com.deepak;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        float marks = input.nextFloat();
//        System.out.println(marks);
//        float number = input.nextFloat();

        // Type Casting
//        int numberInt = (int)(number);
//        System.out.println(numberInt);

//        int a = 257;
//        byte b = (byte)(a);
//        System.out.println(b);
//        byte a = 50;
//        byte b = 40;
//        byte c = 100;
//        int d = a * b / c;
//        System.out.println(d);

        // automatic type conversion

//        int number = "A";
//        System.out.println(number); // not working

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 5000;
        float f = 5.67f;
        double d = 0.5673;
        double result = (f * b) + (i / c) - (d * s);
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);

    }
}
