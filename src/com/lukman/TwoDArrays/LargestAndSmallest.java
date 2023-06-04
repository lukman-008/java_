package com.lukman.TwoDArrays;

import java.util.Scanner;

public class LargestAndSmallest {
    public static void search(int arr[][])
    {
        int maxEle=Integer.MIN_VALUE;
        int minEle=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j]>maxEle)maxEle=arr[i][j];
                if(arr[i][j]<minEle)minEle=arr[i][j];
            }
        }
        System.out.println(minEle + " is min element");
        System.out.println(maxEle+" is max element");
    }
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int arr[][]=new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]=s.nextInt();
            }
        }
        search(arr);
    }
}
