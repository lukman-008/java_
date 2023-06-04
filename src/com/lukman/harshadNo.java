package com.lukman;

import java.util.Scanner;

public class harshadNo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int temp=n;
        int sum=0;
        while(n!=0)
        {
           sum+=n%10;
           n/=10;
        }
        if (temp%sum==0)
        {
            System.out.println("it is harshad number");
        }
        else
            System.out.println("it is not harshad number");
    }
}
