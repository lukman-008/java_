package com.lukman;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinaiton {

    public static List<List<Integer>> combinations(int n, int x) {
        List<List<Integer>> result = new ArrayList<>();
        int max = 1 << n;
        for (int i = 0; i < max; i++) {
            List<Integer> combination = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    combination.add(j + 1);
                }
            }
            if (combination.size() == x) {
                result.add(combination);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        int x = 3;
        List<List<Integer>> result = combinations(n, x);
        for (List<Integer> combination : result) {
            System.out.println(combination.toString().replace("[","").replace("]","").replace(","," "));
        }
    }
}

