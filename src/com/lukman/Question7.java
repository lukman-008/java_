package com.lukman;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the marks of Maths : ");
        int m = s.nextInt();
        System.out.print("Enter the marks of Computer : ");
        int c = s.nextInt();
        System.out.print("Enter the marks of English : ");
        int e = s.nextInt();
        int total = m+c+e;
        System.out.println("Your total is : "+total);
        System.out.println("Your percentage is "+ (total/300.0f)*100);

    }
}
