package com.lukman;

class btreee {
    static btreee b = new btreee();
    boolean checker(int[] nums)
    {
        int start=0;
        int end=nums.length-1;

        if(nums[start]<nums[end])
        {
            return true;
        }
        return false;
    }
    public int findPeakElement(int[] nums) {
        int temp=Search(nums);

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==temp)
            {
                return i;
            }
        }
        return -1;
    }
    public int Search(int[] nums)
    {
        int start=0;
        int target= nums[nums.length-1];
        int end=nums.length-1;
        while(start<=end)
        {
            int mid = start + (end - start) / 2;
            if (target == nums[mid])
            {
                return mid;
            }
            if (b.checker(nums))
            {

                if (target < nums[mid])
                {
                    end = mid - 1;
                } else if (target > nums[mid]) {
                    start = mid + 1;
                }
                else
                {
                    return mid;
                }
            }
            else
            {
                if (target > nums[mid])
                {
                    end = mid - 1;
                } else if (target < nums[mid]) {
                    start = mid + 1;
                }
                else
                {
                    return mid;
                }
            }
        }
        return -1;
    }

}