package com.justin.algoexpert.arrays.easy;

/**
 * @author Justin Mathew @dev_io
 */
public class EvenNumberOfDigits {

    public static void main(String[] args) {

        int nums[]=new int[]{12,345,2,6,7896};
        System.err.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
       int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(String.valueOf(nums[i]).length()%2==0)
            {
                count++;

            }

        }
        return count;
    }
}
