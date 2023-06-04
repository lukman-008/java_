package com.lukman;

import java.util.Scanner;

class Demo {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        int max = a;
        if(b>a)
        {
            max =b;
        }
        if(c>a)
        {
           max = c;
        }
        System.out.println(max);
    }
}