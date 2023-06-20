package com.justin.algoexpert.arrays.easy;

/**
 * @author Justin Mathew @dev_io
 * Given an integer array nums sorted in non-decreasing order,
 * return an array of the squares of each number sorted in non-decreasing order.
 */
public class SquaresIfSortedArray {

    public static void main(String[] args) {

        int nums[]=new int[]{-4,-1,0,3,10};
        sortedSquares(nums);
    }

    public static int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;

        for (int i = n - 1; i >= 0; i--) {
            int square;
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                square = nums[right];
                right--;
            } else {
                square = nums[left];
                left++;
            }
            result[i] = square * square;
        }
        return result;
    }
}
