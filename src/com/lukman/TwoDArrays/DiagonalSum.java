package com.lukman.TwoDArrays;

public class DiagonalSum {
    public static void DiagSum(int matrix[][])
    {
        int Sum=0;
        for (int i = 0; i < matrix.length; i++) {
            Sum+=matrix[i][i];
        }


        for (int i = matrix.length-1; i >=0 ; i--) {
            Sum+=matrix[i][i];
        }
        if (matrix.length%2==0)
        System.out.println(Sum);
        else
        {
            int center= matrix.length%2;
            System.out.println(Sum-matrix[center][center]);
        }
    }

    public static void secondApproach(int matrix[][])
    {
        int sum=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(i==j) sum+=matrix[i][j];
                else if (i+j==matrix.length-1) sum+=matrix[i][j];
            }
        }
        System.out.println(sum);

    }
    public static void thirdApproach(int matrix[][])
    {
        int sum=0;
        for (int i = 0; i < matrix.length; i++) {
            sum+=matrix[i][i];
            // i+j=n-1
            if (i!=matrix.length-1-i)
            sum+=matrix[i][matrix.length-i-1];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},
                {5,6,7},
                {9,10,11},
                };
        DiagSum(matrix);
        secondApproach(matrix);
        thirdApproach(matrix);
    }
}
