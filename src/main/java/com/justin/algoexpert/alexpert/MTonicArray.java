package com.justin.algoexpert.alexpert;

/**
 * @author Justin Mathew @dev_io
 *
 * Write a function that takes in an array of integers and returns a boolean representing whether the array is monotonic.
 * An array is said to be monotonic if its elem, from left to right are entirely non-increasing or entirely non - decreasing.
 * Non - increasing elements aren't necessarily exclusively decreasingl they simply don't increase. Similarly , non -decreasing
 * elements aren't necessarily exclusively increasingl they simpl don't decrease.
 *
 */
public class MTonicArray {

    public static void main(String[] args) {
        int array[]=new int[]{-1, -5, -10, -1100, -1100, -1101, -1102, -9001};
        System.err.println(isMonotonic(array));
    }

    public static boolean isMonotonic(int[] array) {

        int slowPointer=0;
        int fastPointer=1;

        int behaviour=-1;

        while(fastPointer<array.length)
        {
            int ith = array[slowPointer];
            int iPlusOnthe = array[fastPointer];

            if(ith>iPlusOnthe&&(behaviour==-1||behaviour==1))
            {
                behaviour=1;
            }
            else if(ith<iPlusOnthe&&(behaviour==-1||behaviour==0))
            {
                behaviour=0;
            } else if(ith==iPlusOnthe)
            {
             //do nothing
            }else{
                behaviour=2;
                break;
            }
           slowPointer++;
            fastPointer++;
        }
        return behaviour!=2;
    }


    //More nice solution is the following. Which is acually similar to mine but uses one less space, and if else..
    //since this uses only if conditions i don't have to do the do - nothing if else statement

    public static boolean isMono(int[] array){
        boolean isNonDecreasing=true;
        boolean isNonIncreasing=true;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                isNonDecreasing = false;
            }
            if (array[i] > array[i - 1])
            {
                isNonIncreasing=false;
            }

        }
        return isNonDecreasing|| isNonIncreasing;
    }

}
