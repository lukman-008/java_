package com.lukman;

import java.util.Scanner;

public class nameplay {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String fullName = s.next();
        fullName.trim();
        System.out.println(fullName.charAt(4));
    }
}
