package com.lukman;

public class RemoveConsicutiveString {
    public static void main(String[] args) {
        String s = "aabaa";
        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i)==s.charAt(i+1))
            {
                System.out.print(s.charAt(i));
            }
        }
    }
}
