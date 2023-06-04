package com.lukman;
import java.lang.reflect.Array;
import java.util.Arrays;
public class reverseArray {
    public static void main(String[] args) {
        int arr[] = {45,76,34,89,23,8};
        int start = 0;
        int end = arr.length-1;
        reverse(arr, start,end);
        System.out.println(Arrays.toString(arr));
    }
    static void  reverse(int []arr,int start , int end)
    {
        while (start < end )
        {
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    static void swap(int arr[], int start , int end)
    {
        int temp = arr[start];
         arr[start]= arr[end];
         arr[end]=temp;
    }
}
