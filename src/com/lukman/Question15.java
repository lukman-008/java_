package com.lukman;

import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the principle : ");
        float p = s.nextFloat();
        System.out.print("enter rate : ");
        float r = s.nextFloat();
        System.out.print("enter the time :  ");
        float t = s.nextFloat();
        double ci = p*(Math.pow(1+(r/100),t));
    }
}
