package com.lukman;

import java.util.Scanner;

public class Quesion9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the principle : ");
        float p = s.nextFloat();
        System.out.println("Enter the time : ");
        float t = s.nextFloat();
        System.out.println("Enter the rate of interest : ");
        float r = s.nextFloat();
        System.out.println("Your SI is : "+(p*r*t)/100);
    }
}
