package com.lukman;

import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the three side of triangle");
        double a = s.nextInt();
        double b = s.nextInt();
        double c = s.nextInt();
        double t = (a+b+c)/2;
        double h = t*(t-a)*(t-b)*(t-c);
        System.out.println("Area of triangle is : "+Math.sqrt(h));

    }
}
