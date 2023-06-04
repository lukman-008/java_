package com.lukman;

import java.util.Scanner;

public class stack {

    static int head=0;
    static int count=-1;
    Scanner s = new Scanner(System.in);
    public static void main(String[] args) {

        int arr[] = new int[10];
        stack STK = new stack();
        int z;
        do {
            System.out.println("press 1 for push \npress 2 for pop");
            Scanner d = new Scanner(System.in);
            int m = d.nextInt();
            if (m==1) {
                STK.push(arr);
            }
            else if (m==2) {
                STK.pop(arr);
            }
            System.out.println("press 1 for continue");
            z=d.nextInt();
        }while(z==1);
        for (int i = 0; i < 5; i++) {
            STK.display(arr);
        }

    }
    void push(int arr[])
    {
        if (head== arr.length)
        {
            System.out.println("Stack overflow");
            return;
        }
        arr[head]=s.nextInt();  //8,10,12
        head++;
        count++;//1,2,3
    }
    void pop(int arr[])
    {
        if (head==0)
        {
            System.out.println("Stack underflow");
        }
        System.out.println("the poped element is "+arr[head-1]);
        arr[head-1]=0;
        head--;

    }
    void display(int arr[])
    {
        if (count>=0) {
            System.out.println(arr[count]);
            count--;
        }
    }

}
