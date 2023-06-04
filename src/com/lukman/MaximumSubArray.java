package com.lukman;

public class MaximumSubArray {
    public static void maxSubArraySum(int numbers[])
    {
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                currSum=0;
                for (int k = i; k <= j; k++) {

                    currSum+=numbers[k];
                }
                if(currSum>maxSum)
                {
                    maxSum=currSum;
                }

            }

        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int number[]= {1,-2,6,-1,3};
        System.out.println(number.length);
        maxSubArraySum(number);
    }
}
