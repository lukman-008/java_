package com.lukman;

import java.util.Scanner;

public class Question22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the marks of Maths : ");
        int a = s.nextInt();
        System.out.print("Enter the marks of Chemistry : ");
        int b = s.nextInt();
        System.out.print("Enter the marks of Physics : ");
        int c = s.nextInt();
        System.out.print("Enter the marks of English : ");
        int d = s.nextInt();
        System.out.print("Enter the marks of Hindi : ");
        int e = s.nextInt();
        double per = (a+b+c+d+e)/5;
        System.out.println("Your percentage is : "+per);
        if (per>=91&&per<=100)
        {
            System.out.println("Your grade is AA");
        }
        else if (per>=81&&per<=90)
        {
            System.out.println("Your grade is AB");
        }
       else if (per>=71&&per<=80)
        {
            System.out.println("Your grade is BB");
        }
       else if (per>=61&&per<=70)
        {
            System.out.println("Your grade is BC");
        }
        else if (per>=51&&per<=60)
        {
            System.out.println("Your grade is CD");
        }
       else if (per>=41&&per<=50)
        {
            System.out.println("Your grade is DD");
        }
       else if (per<=40)
        {
            System.out.println("Your grade is F");
        }


    }
}
