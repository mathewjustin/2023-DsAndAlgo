package com.justin.algoexpert.arrays.easy;

/**
 * @author Justin Mathew @dev_io
 * Easy.
 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
 * Input: nums = [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
 */
public class maxConsecutive {

    public static void main(String[] args) {

        int nums[]=new int[]{1,1,0,1,1,1};
        System.err.println(findMaxConsecutiveOnes(nums));
    
    }

    public static int findMaxConsecutiveOnes(int[] nums) {

        int counter = 0;
        int maxCount=0;
        for (int i=0;i<nums.length;i++)
        {

            if(nums[i]==1)
            {
                counter++;

            } else{
                counter=0;
            }
                if(counter>maxCount)
                {
                    maxCount=counter;
                }
         }
        return maxCount;
    }
}
