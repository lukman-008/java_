package com.lukman;

import java.util.Arrays;

public class MaxSubArray3 {
    //Kadane's algorithmn
    public static void kadanes(int numbers[])
    {
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            currSum+=numbers[i];
            if(currSum<0)
            {
                currSum=0;
            }
            if(currSum>maxSum)
            {
                maxSum=currSum;
            }
        }
        if (maxSum<=0)
        {
            Arrays.sort(numbers);
            System.out.print(numbers[0]);
            return;
        }
       System.out.println("maxsum is "+maxSum);

    }
    public static void main(String[] args) {
        int numbers[]= {-2,-3,-4,-1,-2,-1,-5,-3};
    kadanes(numbers);
    }
}
