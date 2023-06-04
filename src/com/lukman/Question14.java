package com.lukman;

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int no = s.nextInt();
        if (no%2==0)
            System.out.println("Number is Even");
        else
            System.out.println("Number is odd");
    }
}
