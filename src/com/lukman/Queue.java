package com.lukman;

import java.util.Scanner;

public class Queue {
    int start=0;
    int end =0;
    Scanner s= new Scanner(System.in);
    public static void main(String[] args) {
        int m=0;
        int[] arr = new int[10];
        Scanner d = new Scanner(System.in);
        Queue queue = new Queue();
        do {
            System.out.println("enter 1 to push \nenter 2 to pop\nenter 3 to peek");
            int z =d.nextInt();
            if (z==1) {
                queue.push(arr);
            } else if (z==2) {
                queue.pop(arr);
            } else if (z==3) {
                queue.peek(arr);
            }
            System.out.println("enter 1 to continue");
            m=d.nextInt();
        }while (m==1);

    }
    void push(int[] arr)
    {
        arr[end]=s.nextInt();
        end++;
    }
    void pop(int[] arr)
    {
        System.out.println(arr[start]);
        arr[start]=0;
        start++;
    }
    void peek(int[] arr)
    {
        System.out.println(arr[start]);
    }
}
