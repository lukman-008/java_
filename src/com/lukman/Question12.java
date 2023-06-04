package com.lukman;
import java.util.Scanner;
public class Question12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char a = s.next().charAt(0);
        if (a=='m'||a=='M')
            System.out.println("Good morning Sir");
        else if (a=='f'||a=='F')
            System.out.println("Good morning Mam");
        else
            System.out.println("Enter valid Input");
    }
}
