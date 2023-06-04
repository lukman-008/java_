package com.lukman;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Quesion8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the temperature in fehrenhite : ");
         double f = s.nextFloat();
        System.out.println("Temperatur in celceius : "+((f-32)*5)/9);

    }
}
