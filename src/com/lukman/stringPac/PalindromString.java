package com.lukman.stringPac;

public class PalindromString {
    public static boolean palindrom(String str)
    {
        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i)!=str.charAt(str.length()-1-i))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "lukman";
        System.out.println( palindrom(s1));
    }
}
