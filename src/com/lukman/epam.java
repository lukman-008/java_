package com.lukman;

import java.util.Scanner;

public class epam {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] books = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            books[i] = sc.nextInt();
            sum += books[i];
        }
        sc.close();

        if (sum % n != 0) {
            System.out.println("It is not possible to make all orphans have the same number of books.");
        } else {
            int avg = sum / n;
            int moves = 0;
            int diff = 0;
            for (int i = 0; i < n; i++) {
                diff += books[i] - avg;
                moves = Math.max(moves, Math.abs(diff));
            }
            System.out.println(moves);
        }
    }
}
