package com.lukman;

import java.util.Arrays;

public class RepeatetiveNumbers {
    public static void main(String[] args) {
        int arr[] =new int[]{4,4,7,1,1,2,6,2,5,3,3}; //1 1 2 2 3 3 3 4 4 5 6 7
        Arrays.sort(arr);
        int count2=0;
        for (int i = 0; i < arr.length; i++) {
            int count =0;

            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j])
                {
                    count++;
                    count2+=count;
                }
                else
                    break;
            }
            if(count==0) System.out.println(arr[i]);
            else
            {
                i+=count;
            }
        }
        if(count2>0) System.out.println(0);
    }
}
