package com.lukman;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        for (int i = 0; i <= 10; i++) {
            list.add(s.nextInt());
        }
        System.out.println(list);
    }
}
