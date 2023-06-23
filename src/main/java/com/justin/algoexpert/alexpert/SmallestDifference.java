package com.justin.algoexpert.alexpert;

import java.util.Arrays;

/**
 * TWO POINTER APPROACH
 * @author Justin Mathew @dev_io
 *  We use the properties of the sorted array here.
 *  Once the array is sorted and we compare and figure out the smallest at one point. Then the previous once we can ignore.
 *  It is because of the fact that the previous elemts will be obviously doesn't meet the conditions.
 *  This is the base logic of this problem..
 *
 *
 *  Sorting the arrays is important in this program because it allows us to compare elements in a systematic manner and optimize the search for the pair with the smallest difference.
 *
 * By sorting the arrays in ascending order using Arrays.sort, we can ensure that smaller elements come before larger elements. This arrangement helps us perform a more efficient comparison between the elements of the two arrays.
 *
 * The sorting step enables us to use a two-pointer approach to find the pair with the smallest difference. The two pointers, idxOne and idxTwo, start from the beginning of the sorted arrays and gradually move towards the end, comparing elements as they go.
 *
 * The benefit of sorting is that it allows us to focus on comparing elements that are closer to each other in value. If the arrays were not sorted, we would need to compare each element of one array with every element of the other array, resulting in a less efficient solution.
 *
 * With the arrays sorted, we compare the current elements at idxOne and idxTwo. If the element from arrayOne is smaller than the element from arrayTwo, we increment idxOne to consider a larger element from arrayOne. If the element from arrayTwo is smaller, we increment idxTwo to consider a larger element from arrayTwo. This approach allows us to gradually move the pointers towards potentially closer elements and find the smallest difference more effectively.
 *
 * Overall, sorting the arrays before comparing their elements improves the efficiency of the algorithm and helps identify the pair with the smallest difference in a more optimized manner.
 *
 *
 *
 */
public class SmallestDifference {

    public static void main(String[] args) {

        int[] expected = {28, 26};

        System.err.println(Arrays.equals(
                SmallestDifference.smallestDifference(
                        new int[]{-1, 5, 10, 20, 28, 3}, new int[]{26, 134, 135, 15, 17}),
                expected));
    }

    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        // Write your code here.
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        int idxOne = 0;
        int idxTwo = 0;

        int smallest = Integer.MAX_VALUE;
        int current;

        int[] smallestPair = new int[2];

        while (idxOne < arrayOne.length && idxTwo < arrayTwo.length) {

            int firstNum = arrayOne[idxOne];
            int secondNum = arrayTwo[idxTwo];

            if (firstNum < secondNum) {
                current = secondNum - firstNum;
                idxOne++;
            } else if (secondNum < firstNum) {
                current = firstNum - secondNum;
                idxTwo++;
            } else {
                return new int[]{firstNum, secondNum};
            }

            if (smallest > current) {
                smallest = current;
                smallestPair = new int[]{firstNum, secondNum};
            }

        }
        return smallestPair;

    }
}
