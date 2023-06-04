package com.lukman;

import java.util.Scanner;

public class automorphicNo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = n*n;
        int count = 0;
        int count1=0;
            while (n!=0)
            {
                if (n%10==m%10)
                {
                    count++;
                }
                    count1++;
                n=n/10;
                m=m/10;
            }
            if(count1==count)
            {
                System.out.println("automorphic number");
            }
            else
                System.out.println("not a automophic number");
    }
}

