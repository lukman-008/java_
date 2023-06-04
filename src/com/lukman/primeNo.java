package com.lukman;

import java.util.Scanner;

public class primeNo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int m=0;
        for (int i=2;i<a;i++)
        {
            if (a%i==0)
            {
                m++;
            }
        }
        if (m>0)
            System.out.println("not a prime no");
        else
            System.out.println("prime no");
    }
}
