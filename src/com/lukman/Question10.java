package com.lukman;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Three Numbers");
        int a =s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int max =a;
        if (a<b)
        {
            max=b;
        }
        if (b<c)
        {
            max=c;
        }
        System.out.println("maximum of these three are : "+max);
    }
}
