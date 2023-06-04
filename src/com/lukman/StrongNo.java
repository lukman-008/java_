package com.lukman;

import java.util.Scanner;

public class StrongNo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int temp=n;
        int sum =0;
        while (n != 0) {
            int fact=1;
            for (int i = 1; i <= n%10; i++)
            {
                fact*=i;
            }
            sum=sum+fact;
            n=n/10;
        }
        if (temp==sum)
        {
            System.out.println("it is armstrong number");
        }
        else
            System.out.println("it is not a armstrong number");
    }
}
