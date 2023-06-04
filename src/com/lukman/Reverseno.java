package com.lukman;

import java.util.Scanner;
public  class Reverseno {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        int sum=0;
        while(i!=0)
        {
            int j=i%10;
            sum = sum*10+j;
            i=i/10;
        }
        System.out.println(sum);
    }
}
