package com.lukman;

public class MaxSubArray2 {
    public static void maxSubArraySum2(int numbers[])
    {
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[numbers.length];
        prefix[0]=numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            prefix[i]=numbers[i]+prefix[i-1];
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                currSum=i==0?currSum=prefix[j]:prefix[j]-prefix[i-1];
                if(currSum>maxSum)
                {
                    maxSum=currSum;
                }

            }

        }
        System.out.println("MaxSubArray = "+maxSum);
    }
    public static void main(String[] args) {
        int number[]= {1,-2,6,-1,3};
        maxSubArraySum2(number);
    }
}
