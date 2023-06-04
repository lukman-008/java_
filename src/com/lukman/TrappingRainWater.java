package com.lukman;

public class TrappingRainWater {
    public static int trappedWater(int height[])
    {
        int leftmax[] = new int[height.length];
        leftmax[0]=height[0];
        for (int i = 1; i < height.length; i++) {
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }


        int rightMax[] = new int[height.length];
        rightMax[height.length-1]=height[height.length-1];
        for (int i = height.length-2; i >= 0; i--) {
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }


        int trappedwater=0;
        for (int i = 0; i < height.length; i++) {
            int waterlevel=Math.min(leftmax[i],rightMax[i] );
            trappedwater+=waterlevel-height[i];
        }
        return trappedwater;
    }

    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};

        System.out.println(trappedWater(height));

    }
}
