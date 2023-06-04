package com.lukman;

import java.util.Scanner;

public class Bubble_sort {
    static void  sort (int arr[])
    {
        for (int i=1;i<8;i++)
        {
            for (int j=0;j<8;j++)
            {
                if(arr[j]>arr[i])
                {
                    int temp =arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i=0;i<8;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[]=new int[8];
        for (int i=0;i<8;i++)
        {
            arr[i]= s.nextInt();
        }
        sort(arr);
    }
}