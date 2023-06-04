package com.lukman;

import java.util.Scanner;

public class StringComp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 =s.nextLine().toLowerCase().trim();
        String s2 = s.nextLine().toLowerCase().trim();
        int count = 0;
        int result = s2.length() - 1;
        for (int i = 0; i < s1.length() - s2.length()+1; i++) {
                if (s1.substring(i, i + result+1).equals(s2)) {
                    count++;
                }
        }
        if (count == 1) {
            System.out.println("yes");
        } else
            System.out.println("No");
    }

}
//shubham == bham