package com.lukman;

public class SpecialString {
    public static void main(String[] args) {
        String s = "abc/defgh$ij";
        char c[] = s.toCharArray();
        int start=0;
        int end =c.length-1;
        System.out.println(end);
       while(start<end)
       {
           if (
                   ( Character.isDigit(c[start])
                   || Character.isLetter(c[start])
                   || Character.isWhitespace(c[start])  )
                           &&
                           ( Character.isDigit(c[end])
                   || Character.isLetter(c[end])
                   || Character.isWhitespace(c[end])  )
           ){
               char z = c[start];
               c[start]=c[end];
               c[end]=z;
               start++;
               end--;
           } else if (!Character.isDigit(c[start])
                   || !Character.isLetter(c[start])
                   || !Character.isWhitespace(c[start])) {
               start++;

           } else if (
                  ! Character.isDigit(c[end])
                           || !Character.isLetter(c[end])
                           || !Character.isWhitespace(c[end])
           ) {
               end--;

           }


       }
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }
    }
}
