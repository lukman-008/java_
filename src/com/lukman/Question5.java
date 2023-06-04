package com.lukman;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the lenght : ");
        float l = s.nextFloat();
        System.out.print("enter the width : ");
        float b = s.nextFloat();
        System.out.println("Area is : " + l*b);
        System.out.println("Perimeter is : " + 2*(l+b));

    }
}
