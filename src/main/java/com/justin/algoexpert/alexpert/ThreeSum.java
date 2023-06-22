package com.justin.algoexpert.alexpert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Justin Mathew @dev_io
 * Write a function that takes in a non empty array of distinct integers and an integer representing a target sum. Then function should find all
 * triplets in the array that sum up to the target sum and return a two-dimensional array of all these triplets. Then numbers in each triplet should be ordered in ascending order,
 * and the tripets themselves should be ordered in ascending order with respect to the numbers they hold.
 * If no three numbers sum up to the target sum, the function should return an empty array.
 *
 */
public class ThreeSum {

    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);  // Sort the array in ascending order
        List<Integer[]> triplets = new ArrayList<Integer[]>();

        for (int i = 0; i < array.length - 2; i++) {
            int left = i + 1;
            int right = array.length - 1;

            while (left < right) {
                int currentSum = array[i] + array[left] + array[right];

                if (currentSum == targetSum) {
                    Integer[] newTriplet={array[i],array[left],array[right]};
                    triplets.add(newTriplet);
                    left++;
                    right--;
                } else if (currentSum < targetSum) {
                    left++;
                } else if(currentSum>targetSum) {
                    right--;
                }
            }
        }

        return triplets;
    }

    public static void main(String[] args) {
        int[] array = {12, 3, 1, 2, -6, 5, -8, 6};
        int targetSum = 0;

        List<Integer[]> result = threeNumberSum(array, targetSum);
        System.out.println(result);  // Output: [[-8, 2, 6], [-8, 3, 5], [-6, 1, 5]]
    }

}
